package fr.yas.matchup.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

import fr.yas.matchup.views.panels.PanelAdminSkill;
import fr.yas.matchup.views.panels.PanelAdminUser;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class PanelAdministrator extends BaseView {
	private JButton btnValidateUser1;
	private JButton btnDeleteUser1;
	private JButton btnResetPasswordUser1;
	private JButton btnAdd;
	// panel user presentation
	private JTextField textField_AdminPhone;
	private JTextField textField_AdminEmail;
	private JLabel lblPhoto;
	private JTextField textField_AdminLastName;
	private JButton btnAnnuler;
	private JButton btnEditer;
	private JTextField textField_adminFirstName;
	// panel skills
	private ArrayList<PanelAdminSkill> skills;

	// begin getter for panel user presentation
	/**
	 * @return the textField_AdminPhone
	 */
	public JTextField getTextField_AdminPhone() {
		return textField_AdminPhone;
	}

	/**
	 * @return the textField_AdminEmail
	 */
	public JTextField getTextField_AdminEmail() {
		return textField_AdminEmail;
	}

	/**
	 * @return the textField_AdminLastName
	 */
	public JTextField getTextField_AdminLastName() {
		return textField_AdminLastName;
	}

	/**
	 * @return the textField_adminFirstName
	 */
	public JTextField getTextField_adminFirstName() {
		return textField_adminFirstName;
	}

	/**
	 * @return the lblPhoto
	 */
	public JLabel getLblPhoto() {
		return lblPhoto;
	}

	/**
	 * @return the btnEdider
	 */
	public JButton getBtnEditer() {
		return btnEditer;
	}

	/**
	 * @return the btnAnnuler
	 */
	public JButton getBtnAnnuler() {
		return btnAnnuler;
	}
	// end getter for panel user presentation

	/**
	 * @return the btnValidateUser1
	 */
	public JButton getBtnValidateUser1() {
		return btnValidateUser1;
	}

	/**
	 * @return the btnDeleteUser1
	 */
	public JButton getBtnDeleteUser1() {
		return btnDeleteUser1;
	}

	/**
	 * @return the btnResetPasswordUser1
	 */
	public JButton getBtnResetPasswordUser1() {
		return btnResetPasswordUser1;
	}

	/**
	 * @return the btnAdd
	 */
	public JButton getBtnAdd() {
		return btnAdd;
	}

	/**
	 * Create the panel.
	 */
	public PanelAdministrator(JFrame frame) {
		super.pageName = "Administrator";
		JPanel panel = new JPanel();
		super.contentPane = panel;

		//panel.setBounds(100, 100, 900, 480);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 600, 295 };
		gbl_contentPane.rowHeights = new int[] { 165, 300 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0 };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0 };
		panel.setLayout(gbl_contentPane);

		JPanel panelUser = new JPanel();
		panelUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelUser = new GridBagConstraints();
		gbc_panelUser.anchor = GridBagConstraints.NORTH;
		gbc_panelUser.gridheight = 2;
		gbc_panelUser.insets = new Insets(0, 0, 5, 5);
		gbc_panelUser.fill = GridBagConstraints.BOTH;
		gbc_panelUser.gridx = 0;
		gbc_panelUser.gridy = 0;
		panel.add(panelUser, gbc_panelUser);
		GridBagLayout gbl_panelUser = new GridBagLayout();
		gbl_panelUser.columnWidths = new int[] { 40, 40, 40, 40, 25, 25, 25, 10 };
		gbl_panelUser.rowHeights = new int[] { 0, 30, 30, 30, 30 };
		gbl_panelUser.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0 };
		gbl_panelUser.rowWeights = new double[] { 0.0, 0.0, 0.0 };
		panelUser.setLayout(gbl_panelUser);

		JLabel lblUser = new JLabel("User");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.NORTH;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 3;
		gbc_lblUser.gridy = 0;
		panelUser.add(lblUser, gbc_lblUser);

		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 2;
		panelUser.add(lblName, gbc_lblName);

		JLabel lblEmail = new JLabel("E-mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 2;
		panelUser.add(lblEmail, gbc_lblEmail);

		JLabel lblType = new JLabel("Type");
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 2;
		gbc_lblType.gridy = 2;
		panelUser.add(lblType, gbc_lblType);

		JLabel lblCreationDate = new JLabel("Creation Date");
		GridBagConstraints gbc_lblCreationDate = new GridBagConstraints();
		gbc_lblCreationDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreationDate.gridx = 3;
		gbc_lblCreationDate.gridy = 2;
		panelUser.add(lblCreationDate, gbc_lblCreationDate);
		
		//Listing all users
		JPanel panelListUsers = new JPanel();
		GridBagConstraints gbc_panelListUsers = new GridBagConstraints();
		gbc_panelListUsers.insets = new Insets(0, 0, 5, 5);
		gbc_panelListUsers.fill = GridBagConstraints.BOTH;
		gbc_panelListUsers.gridx = 0;
		gbc_panelListUsers.gridy = 3;
		gbc_panelListUsers.gridwidth = GridBagConstraints.RELATIVE;
		panelListUsers.setLayout(new GridLayout(0, 1));
		panelUser.add(panelListUsers, gbc_panelListUsers);
		
		for (int i = 0; i <10; i++) {
			PanelAdminUser user = new PanelAdminUser();
			GridBagConstraints gbc_user = new GridBagConstraints();
			gbc_user.fill = GridBagConstraints.HORIZONTAL;
			gbc_user.anchor = GridBagConstraints.BASELINE_LEADING;
			gbc_user.gridwidth = 3;
			gbc_user.insets = new Insets(0, 0, 0, 5);
			panelListUsers.add(user, gbc_user);

		}

	
		/*
		 * Panel topRight : User presentation
		 */
		JPanel panelAdminPresentation = new JPanel();
		panelAdminPresentation.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAdminPresentation = new GridBagConstraints();
		gbc_panelAdminPresentation.insets = new Insets(0, 0, 5, 0);
		gbc_panelAdminPresentation.fill = GridBagConstraints.BOTH;
		gbc_panelAdminPresentation.gridx = 1;
		gbc_panelAdminPresentation.gridy = 0;
		panel.add(panelAdminPresentation, gbc_panelAdminPresentation);
		GridBagLayout gbl_panelAdminPresentation = new GridBagLayout();
		gbl_panelAdminPresentation.columnWidths = new int[] { 45, 45, 100, 100 };
		gbl_panelAdminPresentation.rowHeights = new int[] { 30, 30, 30, 30, 30 };
		gbl_panelAdminPresentation.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0 };
		gbl_panelAdminPresentation.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0 };
		panelAdminPresentation.setLayout(gbl_panelAdminPresentation);

		lblPhoto = new JLabel("");
		lblPhoto.setIcon(
				new ImageIcon(PanelAdministrator.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		GridBagConstraints gbc_lblPhoto = new GridBagConstraints();
		gbc_lblPhoto.gridwidth = 2;
		gbc_lblPhoto.gridheight = 3;
		gbc_lblPhoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoto.gridx = 0;
		gbc_lblPhoto.gridy = 0;
		panelAdminPresentation.add(lblPhoto, gbc_lblPhoto);

		JLabel lblNameAdmin = new JLabel("Name");
		GridBagConstraints gbc_lblNameAdmin = new GridBagConstraints();
		gbc_lblNameAdmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblNameAdmin.gridx = 2;
		gbc_lblNameAdmin.gridy = 0;
		panelAdminPresentation.add(lblNameAdmin, gbc_lblNameAdmin);

		JPanel panel_name = new JPanel();
		GridBagConstraints gbc_panel_name = new GridBagConstraints();
		gbc_panel_name.insets = new Insets(0, 0, 5, 0);
		gbc_panel_name.fill = GridBagConstraints.BOTH;
		gbc_panel_name.gridx = 3;
		gbc_panel_name.gridy = 0;
		panelAdminPresentation.add(panel_name, gbc_panel_name);
		panel_name.setLayout(new BorderLayout(0, 0));

		textField_adminFirstName = new JTextField();
		panel_name.add(textField_adminFirstName, BorderLayout.WEST);
		textField_adminFirstName.setEditable(false);
		textField_adminFirstName.setColumns(10);

		textField_AdminLastName = new JTextField();
		panel_name.add(textField_AdminLastName, BorderLayout.EAST);
		textField_AdminLastName.setEditable(false);
		textField_AdminLastName.setColumns(10);

		JLabel lblEmailAdmin = new JLabel("E-mail");
		GridBagConstraints gbc_lblEmailAdmin = new GridBagConstraints();
		gbc_lblEmailAdmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailAdmin.gridx = 2;
		gbc_lblEmailAdmin.gridy = 1;
		panelAdminPresentation.add(lblEmailAdmin, gbc_lblEmailAdmin);

		textField_AdminEmail = new JTextField();
		textField_AdminEmail.setEditable(false);
		GridBagConstraints gbc_textField_AdminEmail = new GridBagConstraints();
		gbc_textField_AdminEmail.insets = new Insets(0, 0, 5, 0);
		gbc_textField_AdminEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_AdminEmail.gridx = 3;
		gbc_textField_AdminEmail.gridy = 1;
		panelAdminPresentation.add(textField_AdminEmail, gbc_textField_AdminEmail);
		textField_AdminEmail.setColumns(10);

		JLabel lblPhoneAdmin = new JLabel("Phone");
		GridBagConstraints gbc_lblPhoneAdmin = new GridBagConstraints();
		gbc_lblPhoneAdmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhoneAdmin.gridx = 2;
		gbc_lblPhoneAdmin.gridy = 2;
		panelAdminPresentation.add(lblPhoneAdmin, gbc_lblPhoneAdmin);

		textField_AdminPhone = new JTextField();
		textField_AdminPhone.setEditable(false);
		GridBagConstraints gbc_textField_AdminPhone = new GridBagConstraints();
		gbc_textField_AdminPhone.insets = new Insets(0, 0, 5, 0);
		gbc_textField_AdminPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_AdminPhone.gridx = 3;
		gbc_textField_AdminPhone.gridy = 2;
		panelAdminPresentation.add(textField_AdminPhone, gbc_textField_AdminPhone);
		textField_AdminPhone.setColumns(10);

		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setVisible(false);
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 4;
		panelAdminPresentation.add(btnAnnuler, gbc_btnAnnuler);

		btnEditer = new JButton("Editer");
		btnEditer.setVisible(true);
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 0, 5);
		gbc_btnValider.gridx = 2;
		gbc_btnValider.gridy = 4;
		panelAdminPresentation.add(btnEditer, gbc_btnValider);

		/*
		 * panel bottomRight : skills management
		 */
		JPanel panelSkill = new JPanel();
		panelSkill.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelSkill = new GridBagConstraints();
		gbc_panelSkill.fill = GridBagConstraints.BOTH;
		gbc_panelSkill.gridx = 1;
		gbc_panelSkill.gridy = 1;
		panel.add(panelSkill, gbc_panelSkill);
		GridBagLayout gbl_panelSkill = new GridBagLayout();
		gbl_panelSkill.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelSkill.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panelSkill.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelSkill.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panelSkill.setLayout(gbl_panelSkill);
		// Title
		JLabel lblSkills = new JLabel("Skills");
		GridBagConstraints gbc_lblSkills = new GridBagConstraints();
		gbc_lblSkills.gridwidth = 3;
		gbc_lblSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkills.gridx = 0;
		gbc_lblSkills.gridy = 0;
		panelSkill.add(lblSkills, gbc_lblSkills);

		// Scrollpane column header
		JPanel titleList = new JPanel();
		titleList.setLayout(new GridLayout(0, 3, 0, 0));
		JLabel lblSkillName = new JLabel("Name");
		GridBagConstraints gbc_lblSkillName = new GridBagConstraints();
		gbc_lblSkillName.insets = new Insets(0, 0, 5, 5);
		titleList.add(lblSkillName);
		JLabel lblSkillType = new JLabel("Type");
		GridBagConstraints gbc_lblSkillType = new GridBagConstraints();
		gbc_lblSkillType.insets = new Insets(0, 0, 5, 0);
		titleList.add(lblSkillType);
		btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		titleList.add(btnAdd);

		// Listing of available skills
		skills = new ArrayList<PanelAdminSkill>();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = GridBagConstraints.REMAINDER;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		panelSkill.add(scrollPane, gbc_scrollPane);
		scrollPane.setColumnHeaderView(titleList);

		JPanel listSkills = new JPanel();
		scrollPane.setViewportView(listSkills);
		listSkills.setLayout(new GridLayout(0, 1, 0, 0));
		// individual skill
		for (int i = 0; i < 10; i++) {
			PanelAdminSkill skill = new PanelAdminSkill();
			GridBagConstraints gbc_skill = new GridBagConstraints();
			gbc_skill.fill = GridBagConstraints.HORIZONTAL;
			gbc_skill.anchor = GridBagConstraints.BASELINE_LEADING;
			gbc_skill.gridwidth = 3;
			gbc_skill.insets = new Insets(0, 0, 0, 5);
			listSkills.add(skill, gbc_skill);
			skills.add(skill);
		}

	}

}
