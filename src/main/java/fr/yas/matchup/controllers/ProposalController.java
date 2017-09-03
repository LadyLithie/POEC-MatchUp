/**
 * 
 */
package fr.yas.matchup.controllers;

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

import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.utils.views.ComboBoxRenderer;
import fr.yas.matchup.views.ProposalFrame;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

/**
 * @author Audrey
 *
 */
public class ProposalController extends BaseController {

	private RegisteredUser user;
	private ArrayList<Skill> skills;
	private Proposal job;

	/**
	 * Creation constructor
	 * 
	 * @param frame
	 */
	public ProposalController(JFrame frame) {
		super();
		skills = (ArrayList<Skill>) generateSkills();

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
		super.view = new ProposalFrame(this.frame, skills);
		user = (RegisteredUser) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		// DAO : skills = all registered skills
		this.job = job;
		skills = (ArrayList<Skill>) generateSkills();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		ProposalFrame vFrame = ((ProposalFrame) getView());
		if (job == null) { //mode creation
			vFrame.setMode(true);
			for (ContractType type : generateContracts()) {
				vFrame.getComboBox_contract().addItem(type);
			}
		} else { //Job modification or display
			// init view with the job infos
			vFrame.getComboBox_contract().addItem(job.getContractType());
			vFrame.getComboBox_contract().setSelectedIndex(0);
			vFrame.getComboBox_location().addItem(job.getLocalization());
			vFrame.getComboBox_contract().setSelectedIndex(0);
			vFrame.getTextArea().setText(job.getPresentation());
			vFrame.getTextField_JobTitle().setText(job.getName());
			ArrayList<JCheckBox> ls = vFrame.getListSkills();
			for (Skill skill : job.getSkills()) {
				int i=0;
				while (ls.get(i).getText() != skill.getName()) {
					i++;					
				}
				ls.get(i).setSelected(true);
			}
			
			//case specific to user 
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

				
			}else {//Show both the headhunter and the company
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		ProposalFrame v = (ProposalFrame) super.view;
		// must test if job and user are linked
		// if YES then
		// v.setMode(true);
		// if NO then
		// v.setMode(false);

		/*
		 * Mode Edit
		 */
		// Cancel modification/creation
		v.getBtnCancel().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Go previous page
				if (user instanceof Enterprise) {
					ViewsManager.getInstance().next(new ProfileController(frame));
				
				} else {
					ViewsManager.getInstance().next(new ProfileController(frame));

				}
			}
		});
		// Register a new job
		v.getBtnProposalCreation().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (job == null) {
					job = new Proposal(v.getTextField_JobTitle().getText(),
							(ContractType) v.getComboBox_contract().getSelectedItem());
					job.setSkills(new ArrayList<Skill>());
					for (JCheckBox skill : v.getListSkills()) {
						if (skill.isSelected()) {
							int i = 0;
							while (skills.get(i).getName() != skill.getText()) {
								i++;
							}
							job.getSkills().add(skills.get(i));
						}
					}
					job.setPresentation(v.getTextArea().getText());
				}else {
					
				}
				System.out.println(job.toString());
				//DAO Job
				if (user instanceof Enterprise) {
					((Enterprise)user).getJobs().add(job);
					ViewsManager.getInstance().next(new ProfileController(frame));
				
				} else {
					ViewsManager.getInstance().next(new ProfileController(frame));

				}

			}
		});

	}

	private List<ContractType> generateContracts() {
		List<ContractType> result = new ArrayList<>();

		result.add(new ContractType("CDD"));
		result.add(new ContractType("CDI"));
		result.add(new ContractType("Contrat d'apprentissage"));
		result.add(new ContractType("Contrat de professionnalisation"));
		result.add(new ContractType("Interim"));

		return result;
	}

	private List<Skill> generateSkills() {
		List<Skill> result = new ArrayList<>();
		Skill s1 = new Skill();
		s1.setId(1);
		s1.setSkillType(Skill.TECHNIQUE);
		s1.setName("JAVA");

		Skill s2 = new Skill();
		s2.setId(2);
		s2.setSkillType(Skill.TECHNIQUE);
		s2.setName("C");

		Skill s3 = new Skill();
		s3.setId(3);
		s3.setSkillType(Skill.TECHNIQUE);
		s3.setName("C++");

		Skill s4 = new Skill();
		s4.setId(4);
		s4.setSkillType(Skill.TECHNIQUE);
		s4.setName("HTML");

		Skill s5 = new Skill();
		s5.setId(5);
		s5.setSkillType(Skill.TECHNIQUE);
		s5.setName("CSS");

		result.add(s1);
		result.add(s2);
		result.add(s3);
		result.add(s4);
		result.add(s5);

		return result;
	}

}
