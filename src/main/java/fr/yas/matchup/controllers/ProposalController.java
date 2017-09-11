
/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import fr.yas.matchup.database.CityDAO;
import fr.yas.matchup.database.ContractDAO;
import fr.yas.matchup.database.ProposalDAO;
import fr.yas.matchup.database.SkillDAO;
import fr.yas.matchup.entities.City;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Location;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.utils.views.ComboBoxRenderer;
import fr.yas.matchup.views.ProposalView;

/**
 * @author Audrey
 *
 */
public class ProposalController extends BaseController {

	private RegisteredUser user;
	private List<BaseEntity> skills;
	private Proposal job;

	/**
	 * Creation constructor
	 * 
	 * @param frame
	 */
	public ProposalController(JFrame frame) {
		super();
		SkillDAO sDao = new SkillDAO();
		skills = sDao.get();
		super.frame = frame;
		super.view = new ProposalView(this.frame, skills);
		user = (RegisteredUser) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		// DAO : skills = all registered skills

	}

	/**
	 * Actual job page constructor
	 * 
	 * @param frame
	 * @param job
	 */
	public ProposalController(JFrame frame, Proposal job) {
		super();
		super.frame = frame;
		SkillDAO sDao = new SkillDAO();
		skills = sDao.get();
		super.view = new ProposalView(this.frame, skills);
		user = (RegisteredUser) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		this.job = job;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		user = (RegisteredUser) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		ProposalView vFrame = ((ProposalView) getView());
		if (job == null) { // mode creation
			vFrame.setMode(true);
			// Contracts
			ContractDAO contractDAO = new ContractDAO();
			List<BaseEntity> contracts = contractDAO.get();
			for (BaseEntity type : contracts) {
				vFrame.getComboBox_contract().addItem((ContractType) type);
			}
			//City
			CityDAO cityDAO = new CityDAO();
			List<BaseEntity> cities = cityDAO.get();
			for (BaseEntity town : cities) {
				vFrame.getComboBox_location().addItem((City) town);
			}
			// Link
			if (user instanceof Enterprise) {
				for (Headhunter hh : ((Enterprise) user).getAssociates()) {
					vFrame.getComboBox_linkedUser().addItem(hh);
				}
			} else if (user instanceof Headhunter) {
				for (Enterprise hh : ((Headhunter) user).getAssociates()) {
					vFrame.getComboBox_linkedUser().addItem(hh);
				}
				vFrame.getLblLink().setText("Compagny");
			}
		} else { // Job modification or display
			// init view with the job infos
			vFrame.getComboBox_contract().addItem(job.getContractType());
			vFrame.getComboBox_contract().setSelectedIndex(0);
			//vFrame.getComboBox_location().addItem(job.getLocalization());
			vFrame.getComboBox_contract().setSelectedIndex(0);
			vFrame.getTextArea().setText(job.getPresentation());
			vFrame.getTextField_JobTitle().setText(job.getName());
			ArrayList<JCheckBox> ls = vFrame.getListSkills();
			System.out.println(ls.size());
			for (Skill skill : job.getSkills()) {
				int i = 0;
				while (!ls.get(i).getText().equals(skill.getName()) && i<ls.size()) {
					i++;
				}
				if(i<ls.size()) {
					ls.get(i).setSelected(true);					
				}

			}

			// case specific to user
			if (user instanceof Enterprise) {
				for (Headhunter hh : ((Enterprise) user).getAssociates()) {
					vFrame.getComboBox_linkedUser().addItem(hh);
				}
				vFrame.getComboBox_linkedUser().setSelectedItem(job.getHeadhunter());
			} else if (user instanceof Headhunter) {
				for (Enterprise hh : ((Headhunter) user).getAssociates()) {
					vFrame.getComboBox_linkedUser().addItem(hh);
				}
				vFrame.getLblLink().setText("Compagny");
				vFrame.getComboBox_linkedUser().setSelectedItem(job.getCompany());

			} else {// Show both the headhunter and the company
				vFrame.getComboBox_linkedUser().addItem(job.getHeadhunter());
				vFrame.getComboBox_linkedUser().setSelectedItem(job.getHeadhunter());

				JLabel lblCompany = new JLabel("Entreprise");
				GridBagConstraints gbc_lblCompany = new GridBagConstraints();
				gbc_lblCompany.insets = new Insets(0, 0, 0, 5);
				gbc_lblCompany.gridx = 0;
				gbc_lblCompany.gridy = 3;
				vFrame.getPanelCheckBox().add(lblCompany, gbc_lblCompany);
				JComboBox<RegisteredUser> comboBox_company = new JComboBox<RegisteredUser>();
				comboBox_company.addItem(job.getCompany());
				comboBox_company.setSelectedItem(job.getCompany());
				comboBox_company.setEnabled(false);
				GridBagConstraints gbc_comboBox_company = new GridBagConstraints();
				gbc_comboBox_company.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox_company.gridx = 2;
				gbc_comboBox_company.gridy = 3;
				vFrame.getPanelCheckBox().add(comboBox_company, gbc_comboBox_company);

				vFrame.setMode(false);
			}
		}
		vFrame.getComboBox_contract().setRenderer(new ComboBoxRenderer());
		vFrame.getComboBox_linkedUser().setRenderer(new ComboBoxRenderer());
		vFrame.getComboBox_location().setRenderer(new ComboBoxRenderer());

	}

	@Override
	public void initEvent() {
		ProposalView v = (ProposalView) super.view;
		// must test if job and user are linked
		if (user instanceof Enterprise || user instanceof Headhunter) {
			/*
			 * Mode Edit
			 */
			// Cancel modification/creation
			v.getBtnCancel().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Go previous page
					if (user instanceof Enterprise) {
						ViewsManager.getInstance().next(new EnterpriseController(frame));
					} else {
						ViewsManager.getInstance().next(new HeadhunterController(frame));
					}
				}
			});
			// Register a new job
			v.getBtnProposalCreation().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//Absolutely need a title
					if (v.getTextField_JobTitle().getText().isEmpty()) {
						v.getTextField_JobTitle().setBackground(Color.PINK);
					} else {
						boolean exist = false;
						//It's a creation
						if (job == null) {
							//Constructor with title and type of contract (by default CDD)
							job = new Proposal(v.getTextField_JobTitle().getText(),
									(ContractType) v.getComboBox_contract().getSelectedItem());
							//Add the skills list
							job.setSkills(new ArrayList<Skill>());
							for (JCheckBox skill : v.getListSkills()) {
								if (skill.isSelected()) {
									int i = 0;
									while (!((Skill) skills.get(i)).getName().equals(skill.getText())) {
										i++;
									}
									job.getSkills().add((Skill) skills.get(i));
								}
							}
							//Set the presentation
							job.setPresentation(v.getTextArea().getText());
						} else { //It's a modification
							exist = true;
							//Update title and presentation
							job.setName(v.getTextField_JobTitle().getText());
							job.setPresentation(v.getTextArea().getText());
							//Review the skills list for update
							for (JCheckBox skill : v.getListSkills()) {
								if (skill.isSelected()) {
									int i = 0;
									while (((Skill) skills.get(i)).getName() != skill.getText()) {
										i++;
									}
									// if the skill is not yet present in the job's skill list, it's added
									if (!job.getSkills().contains(skills.get(i))) {
										job.getSkills().add((Skill) skills.get(i));
									}
								}
							}
							System.out.println(job.toString());
							//Update the contract and the location
							job.setContractType((ContractType) v.getComboBox_contract().getSelectedItem());
						}
						ProposalDAO pDao = new ProposalDAO();
						//Add the job to the user list, 
						//the user to the job for foreign key
						//the linked user to the job for foreign key
						//Return to user profile
						if (user instanceof Enterprise) { //the current user is a company
							//Add the job to the user list
							((Enterprise) user).getJobs().add(job);
							job.setCompany((Enterprise) user);
							job.setHeadhunter((Headhunter) v.getComboBox_linkedUser().getSelectedItem());
							
							if (exist) {
								pDao.update(job);
							} else {
								pDao.insert(job);
							}

							System.out.println(job.toString());
							ViewsManager.getInstance().next(new EnterpriseController(frame));

						} else {//the current user is a headhunter
							((Headhunter) user).getJobs().add(job);
							job.setHeadhunter((Headhunter) user);
							job.setCompany((Enterprise) v.getComboBox_linkedUser().getSelectedItem());
							
							if (exist) {
								pDao.update(job);
							} else {
								pDao.insert(job);
							}

							System.out.println(job.toString());
							ViewsManager.getInstance().next(new HeadhunterController(frame));
						}
					}
				}
			});
		}
	}
}