
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

import fr.yas.matchup.database.ContractDAO;
import fr.yas.matchup.database.SkillDAO;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.utils.views.ComboBoxRenderer;
import fr.yas.matchup.views.ProposalFrame;

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
		super.view = new ProposalFrame(this.frame, skills);
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
		super.view = new ProposalFrame(this.frame, skills);
		user = (RegisteredUser) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		// DAO : skills = all registered skills
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
		ProposalFrame vFrame = ((ProposalFrame) getView());
		if (job == null) { // mode creation
			vFrame.setMode(true);
			// Contracts
			ContractDAO contractDAO = new ContractDAO();
			List<BaseEntity> contracts = contractDAO.get();
			for (BaseEntity type : contracts) {
				vFrame.getComboBox_contract().addItem((ContractType) type);
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
			vFrame.getComboBox_location().addItem(job.getLocalization());
			vFrame.getComboBox_contract().setSelectedIndex(0);
			vFrame.getTextArea().setText(job.getPresentation());
			vFrame.getTextField_JobTitle().setText(job.getName());
			ArrayList<JCheckBox> ls = vFrame.getListSkills();
			for (Skill skill : job.getSkills()) {
				int i = 0;
				while (ls.get(i).getText() != skill.getName()) {
					i++;
				}
				ls.get(i).setSelected(true);
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
		ProposalFrame v = (ProposalFrame) super.view;
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
						ViewsManager.getInstance().next(new ProfileEController(frame));
					} else {
						ViewsManager.getInstance().next(new HeadhunterController(frame));
					}
				}
			});
			// Register a new job
			v.getBtnProposalCreation().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (v.getTextField_JobTitle().getText().isEmpty()) {
						v.getTextField_JobTitle().setBackground(Color.PINK);
					} else {
						if (job == null) {
							job = new Proposal(v.getTextField_JobTitle().getText(),
									(ContractType) v.getComboBox_contract().getSelectedItem());
							job.setSkills(new ArrayList<Skill>());
							for (JCheckBox skill : v.getListSkills()) {
								if (skill.isSelected()) {
									int i = 0;
									while (((Skill) skills.get(i)).getName() != skill.getText()) {
										i++;
									}
									job.getSkills().add((Skill) skills.get(i));
								}
							}
							job.setPresentation(v.getTextArea().getText());
						} else {
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
						}
						System.out.println(job.toString());
						// DAO Job
						if (user instanceof Enterprise) {
							((Enterprise) user).getJobs().add(job);
							ViewsManager.getInstance().next(new ProfileEController(frame));

						} else {
							((Headhunter) user).getJobs().add(job);
							ViewsManager.getInstance().next(new HeadhunterController(frame));
							// System.out.println("return profile headhunter");
						}
					}
				}
			});
		}
	}
}