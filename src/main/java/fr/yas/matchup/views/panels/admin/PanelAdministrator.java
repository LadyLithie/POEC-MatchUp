package fr.yas.matchup.views.panels.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PanelAdministrator extends JPanel {

	
	
	private JPanel panelUser;
	private JPanel panelAdminPresentation;
	private JPanel panelSkill;
	private JButton btnValidateUser1;
	private JButton btnDeleteUser1;
	private JButton btnResetPasswordUser1;
	private JButton btnEditer;
	private JButton btnAnnuler;
	private JButton btnValider;
	private JButton btnAdd;
	private JButton btnModifySkill;
	
	/**
	 * @return the btnEditer
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

	/**
	 * @return the btnValider
	 */
	public JButton getBtnValider() {
		return btnValider;
	}

	/**
	 * @return the panelUser
	 */
	public JPanel getPanelUser() {
		return panelUser;
	}

	/**
	 * @return the panelAdminPresentation
	 */
	public JPanel getPanelAdminPresentation() {
		return panelAdminPresentation;
	}

	/**
	 * @return the panelSkill
	 */
	public JPanel getPanelSkill() {
		return panelSkill;
	}

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
	 * @return the btnModifySkill
	 */
	public JButton getBtnModifySkill() {
		return btnModifySkill;
	}

	
	/**
	 * Create the panel.
	 */
	public PanelAdministrator() {
		this.setName("Administrator");
		setBounds(100, 100, 900, 480);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {600, 295};
		gbl_contentPane.rowHeights = new int[] {165, 300};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0};
		setLayout(gbl_contentPane);
		
		JPanel panelUser = new JPanel();
		panelUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelUser = new GridBagConstraints();
		gbc_panelUser.gridheight = 2;
		gbc_panelUser.insets = new Insets(0, 0, 5, 5);
		gbc_panelUser.fill = GridBagConstraints.BOTH;
		gbc_panelUser.gridx = 0;
		gbc_panelUser.gridy = 0;
		add(panelUser, gbc_panelUser);
		GridBagLayout gbl_panelUser = new GridBagLayout();
		gbl_panelUser.columnWidths = new int[] {40, 40, 40, 40, 25, 25, 25, 10};
		gbl_panelUser.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_panelUser.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0};
		gbl_panelUser.rowWeights = new double[]{0.0, 0.0, 0.0};
		panelUser.setLayout(gbl_panelUser);
		
		JLabel lblUser = new JLabel("User");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.NORTH;
		gbc_lblUser.gridwidth = 7;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 0;
		gbc_lblUser.gridy = 0;
		panelUser.add(lblUser, gbc_lblUser);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setForeground(Color.GRAY);
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar.gridheight = 2;
		gbc_scrollBar.gridx = 7;
		gbc_scrollBar.gridy = 2;
		panelUser.add(scrollBar, gbc_scrollBar);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 1;
		panelUser.add(lblName, gbc_lblName);
		
		JLabel lblEmail = new JLabel("E-mail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 1;
		panelUser.add(lblEmail, gbc_lblEmail);
		
		JLabel lblType = new JLabel("Type");
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 2;
		gbc_lblType.gridy = 1;
		panelUser.add(lblType, gbc_lblType);
		
		JLabel lblCreationDate = new JLabel("Creation Date");
		GridBagConstraints gbc_lblCreationDate = new GridBagConstraints();
		gbc_lblCreationDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblCreationDate.gridx = 3;
		gbc_lblCreationDate.gridy = 1;
		panelUser.add(lblCreationDate, gbc_lblCreationDate);
		
		JTextField textFieldNameUser1 = new JTextField();
		textFieldNameUser1.setEditable(false);
		GridBagConstraints gbc_textFieldNameUser1 = new GridBagConstraints();
		gbc_textFieldNameUser1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNameUser1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNameUser1.gridx = 0;
		gbc_textFieldNameUser1.gridy = 2;
		panelUser.add(textFieldNameUser1, gbc_textFieldNameUser1);
		textFieldNameUser1.setColumns(10);
		
		JTextField textFieldMailUser1 = new JTextField();
		textFieldMailUser1.setEditable(false);
		GridBagConstraints gbc_textFieldMailUser1 = new GridBagConstraints();
		gbc_textFieldMailUser1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMailUser1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMailUser1.gridx = 1;
		gbc_textFieldMailUser1.gridy = 2;
		panelUser.add(textFieldMailUser1, gbc_textFieldMailUser1);
		textFieldMailUser1.setColumns(10);
		
		JTextField textFieldTypeUser1 = new JTextField();
		textFieldTypeUser1.setEditable(false);
		GridBagConstraints gbc_textFieldTypeUser1 = new GridBagConstraints();
		gbc_textFieldTypeUser1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTypeUser1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTypeUser1.gridx = 2;
		gbc_textFieldTypeUser1.gridy = 2;
		panelUser.add(textFieldTypeUser1, gbc_textFieldTypeUser1);
		textFieldTypeUser1.setColumns(10);
		
		JTextField textFieldCreationUser1 = new JTextField();
		textFieldCreationUser1.setEditable(false);
		GridBagConstraints gbc_textFieldCreationUser1 = new GridBagConstraints();
		gbc_textFieldCreationUser1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCreationUser1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCreationUser1.gridx = 3;
		gbc_textFieldCreationUser1.gridy = 2;
		panelUser.add(textFieldCreationUser1, gbc_textFieldCreationUser1);
		textFieldCreationUser1.setColumns(10);
		
		JButton btnValidateUser1 = new JButton("Validate");
		GridBagConstraints gbc_btnValidateUser1 = new GridBagConstraints();
		gbc_btnValidateUser1.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidateUser1.gridx = 4;
		gbc_btnValidateUser1.gridy = 2;
		panelUser.add(btnValidateUser1, gbc_btnValidateUser1);
		
		JButton btnDeleteUser1 = new JButton("Delete");
		GridBagConstraints gbc_btnDeleteUser1 = new GridBagConstraints();
		gbc_btnDeleteUser1.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteUser1.gridx = 5;
		gbc_btnDeleteUser1.gridy = 2;
		panelUser.add(btnDeleteUser1, gbc_btnDeleteUser1);
		
		JButton btnResetPasswordUser1 = new JButton("Reset password");
		GridBagConstraints gbc_btnResetPasswordUser1 = new GridBagConstraints();
		gbc_btnResetPasswordUser1.insets = new Insets(0, 0, 5, 5);
		gbc_btnResetPasswordUser1.gridx = 6;
		gbc_btnResetPasswordUser1.gridy = 2;
		panelUser.add(btnResetPasswordUser1, gbc_btnResetPasswordUser1);
		
		JTextField textFieldNameUser2 = new JTextField();
		textFieldNameUser2.setEditable(false);
		GridBagConstraints gbc_textFieldNameUser2 = new GridBagConstraints();
		gbc_textFieldNameUser2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNameUser2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNameUser2.gridx = 0;
		gbc_textFieldNameUser2.gridy = 3;
		panelUser.add(textFieldNameUser2, gbc_textFieldNameUser2);
		textFieldNameUser2.setColumns(10);
		
		JTextField textFieldMailUser2 = new JTextField();
		textFieldMailUser2.setEditable(false);
		GridBagConstraints gbc_textFieldMailUser2 = new GridBagConstraints();
		gbc_textFieldMailUser2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldMailUser2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMailUser2.gridx = 1;
		gbc_textFieldMailUser2.gridy = 3;
		panelUser.add(textFieldMailUser2, gbc_textFieldMailUser2);
		textFieldMailUser2.setColumns(10);
		
		JTextField textFieldTypeUser2 = new JTextField();
		textFieldTypeUser2.setEditable(false);
		GridBagConstraints gbc_textFieldTypeUser2 = new GridBagConstraints();
		gbc_textFieldTypeUser2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldTypeUser2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldTypeUser2.gridx = 2;
		gbc_textFieldTypeUser2.gridy = 3;
		panelUser.add(textFieldTypeUser2, gbc_textFieldTypeUser2);
		textFieldTypeUser2.setColumns(10);
		
		JTextField textFieldCreationUser2 = new JTextField();
		textFieldCreationUser2.setEditable(false);
		GridBagConstraints gbc_textFieldCreationUser2 = new GridBagConstraints();
		gbc_textFieldCreationUser2.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldCreationUser2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCreationUser2.gridx = 3;
		gbc_textFieldCreationUser2.gridy = 3;
		panelUser.add(textFieldCreationUser2, gbc_textFieldCreationUser2);
		textFieldCreationUser2.setColumns(10);
		
		JButton btnValidateUser2 = new JButton("Validate");
		GridBagConstraints gbc_btnValidateUser2 = new GridBagConstraints();
		gbc_btnValidateUser2.insets = new Insets(0, 0, 0, 5);
		gbc_btnValidateUser2.gridx = 4;
		gbc_btnValidateUser2.gridy = 3;
		panelUser.add(btnValidateUser2, gbc_btnValidateUser2);
		
		JButton btnDeleteUser2 = new JButton("Delete");
		GridBagConstraints gbc_btnDeleteUser2 = new GridBagConstraints();
		gbc_btnDeleteUser2.insets = new Insets(0, 0, 0, 5);
		gbc_btnDeleteUser2.gridx = 5;
		gbc_btnDeleteUser2.gridy = 3;
		panelUser.add(btnDeleteUser2, gbc_btnDeleteUser2);
		
		JButton btnResetPasswordUser2 = new JButton("Reset password");
		GridBagConstraints gbc_btnResetPasswordUser2 = new GridBagConstraints();
		gbc_btnResetPasswordUser2.insets = new Insets(0, 0, 0, 5);
		gbc_btnResetPasswordUser2.gridx = 6;
		gbc_btnResetPasswordUser2.gridy = 3;
		panelUser.add(btnResetPasswordUser2, gbc_btnResetPasswordUser2);
		
		JPanel panelAdminPresentation = new JPanel();
		panelAdminPresentation.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelAdminPresentation = new GridBagConstraints();
		gbc_panelAdminPresentation.insets = new Insets(0, 0, 5, 0);
		gbc_panelAdminPresentation.fill = GridBagConstraints.BOTH;
		gbc_panelAdminPresentation.gridx = 1;
		gbc_panelAdminPresentation.gridy = 0;
		add(panelAdminPresentation, gbc_panelAdminPresentation);
		GridBagLayout gbl_panelAdminPresentation = new GridBagLayout();
		gbl_panelAdminPresentation.columnWidths = new int[] {45, 45, 100, 100};
		gbl_panelAdminPresentation.rowHeights = new int[] {30, 30, 30, 30, 30};
		gbl_panelAdminPresentation.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0};
		gbl_panelAdminPresentation.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0};
		panelAdminPresentation.setLayout(gbl_panelAdminPresentation);
		
		JLabel lblPhoto = new JLabel("");
		lblPhoto.setIcon(new ImageIcon(PanelAdministrator.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
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
		
		JTextField textField_AdminName = new JTextField();
		textField_AdminName.setEditable(false);
		GridBagConstraints gbc_textField_AdminName = new GridBagConstraints();
		gbc_textField_AdminName.insets = new Insets(0, 0, 5, 0);
		gbc_textField_AdminName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_AdminName.gridx = 3;
		gbc_textField_AdminName.gridy = 0;
		panelAdminPresentation.add(textField_AdminName, gbc_textField_AdminName);
		textField_AdminName.setColumns(10);
		
		JLabel lblEmailAdmin = new JLabel("E-mail");
		GridBagConstraints gbc_lblEmailAdmin = new GridBagConstraints();
		gbc_lblEmailAdmin.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailAdmin.gridx = 2;
		gbc_lblEmailAdmin.gridy = 1;
		panelAdminPresentation.add(lblEmailAdmin, gbc_lblEmailAdmin);
		
		JTextField textField_AdminEmail = new JTextField();
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
		
		JTextField textField_AdminPhone = new JTextField();
		textField_AdminPhone.setEditable(false);
		GridBagConstraints gbc_textField_AdminPhone = new GridBagConstraints();
		gbc_textField_AdminPhone.insets = new Insets(0, 0, 5, 0);
		gbc_textField_AdminPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_AdminPhone.gridx = 3;
		gbc_textField_AdminPhone.gridy = 2;
		panelAdminPresentation.add(textField_AdminPhone, gbc_textField_AdminPhone);
		textField_AdminPhone.setColumns(10);
		
		JButton btnEditer = new JButton("Editer");
		btnEditer.setVisible(true);
		GridBagConstraints gbc_btnEditer = new GridBagConstraints();
		gbc_btnEditer.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditer.gridx = 2;
		gbc_btnEditer.gridy = 3;
		panelAdminPresentation.add(btnEditer, gbc_btnEditer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setVisible(false);
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnnuler.gridx = 1;
		gbc_btnAnnuler.gridy = 4;
		panelAdminPresentation.add(btnAnnuler, gbc_btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setVisible(false);
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 0, 5);
		gbc_btnValider.gridx = 2;
		gbc_btnValider.gridy = 4;
		panelAdminPresentation.add(btnValider, gbc_btnValider);
		
		JPanel panelSkill = new JPanel();
		panelSkill.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelSkill = new GridBagConstraints();
		gbc_panelSkill.fill = GridBagConstraints.BOTH;
		gbc_panelSkill.gridx = 1;
		gbc_panelSkill.gridy = 1;
		add(panelSkill, gbc_panelSkill);
		GridBagLayout gbl_panelSkill = new GridBagLayout();
		gbl_panelSkill.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelSkill.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelSkill.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelSkill.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelSkill.setLayout(gbl_panelSkill);
		
		JLabel lblSkills = new JLabel("Skills");
		GridBagConstraints gbc_lblSkills = new GridBagConstraints();
		gbc_lblSkills.gridwidth = 4;
		gbc_lblSkills.insets = new Insets(0, 0, 5, 0);
		gbc_lblSkills.gridx = 0;
		gbc_lblSkills.gridy = 0;
		panelSkill.add(lblSkills, gbc_lblSkills);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnAdd.gridwidth = 4;
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 1;
		panelSkill.add(btnAdd, gbc_btnAdd);
		
		JLabel lblSkillName = new JLabel("Name");
		GridBagConstraints gbc_lblSkillName = new GridBagConstraints();
		gbc_lblSkillName.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkillName.gridx = 0;
		gbc_lblSkillName.gridy = 2;
		panelSkill.add(lblSkillName, gbc_lblSkillName);
		
		JLabel lblSkillType = new JLabel("Type");
		GridBagConstraints gbc_lblSkillType = new GridBagConstraints();
		gbc_lblSkillType.insets = new Insets(0, 0, 5, 5);
		gbc_lblSkillType.gridx = 1;
		gbc_lblSkillType.gridy = 2;
		panelSkill.add(lblSkillType, gbc_lblSkillType);
		
		JTextField textField_SkillName = new JTextField();
		textField_SkillName.setEditable(false);
		GridBagConstraints gbc_textField_SkillName = new GridBagConstraints();
		gbc_textField_SkillName.insets = new Insets(0, 0, 5, 5);
		gbc_textField_SkillName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_SkillName.gridx = 0;
		gbc_textField_SkillName.gridy = 3;
		panelSkill.add(textField_SkillName, gbc_textField_SkillName);
		textField_SkillName.setColumns(10);
		
		JTextField textField_SkillType = new JTextField();
		textField_SkillType.setEditable(false);
		GridBagConstraints gbc_textField_SkillType = new GridBagConstraints();
		gbc_textField_SkillType.insets = new Insets(0, 0, 5, 5);
		gbc_textField_SkillType.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_SkillType.gridx = 1;
		gbc_textField_SkillType.gridy = 3;
		panelSkill.add(textField_SkillType, gbc_textField_SkillType);
		textField_SkillType.setColumns(10);
		
		JButton btnModifySkill = new JButton("Modify");
		GridBagConstraints gbc_btnModifySkill = new GridBagConstraints();
		gbc_btnModifySkill.insets = new Insets(0, 0, 5, 5);
		gbc_btnModifySkill.gridx = 2;
		gbc_btnModifySkill.gridy = 3;
		panelSkill.add(btnModifySkill, gbc_btnModifySkill);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		GridBagConstraints gbc_scrollBar_1 = new GridBagConstraints();
		gbc_scrollBar_1.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar_1.gridheight = 3;
		gbc_scrollBar_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollBar_1.gridx = 3;
		gbc_scrollBar_1.gridy = 3;
		panelSkill.add(scrollBar_1, gbc_scrollBar_1);
		
		JTextField textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setVisible(false);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 0;
		gbc_textField_5.gridy = 4;
		panelSkill.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JTextField textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setVisible(false);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 4;
		panelSkill.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnModifySkill_1 = new JButton("Modify");
		btnModifySkill_1.setVisible(false);
		GridBagConstraints gbc_btnModifySkill_1 = new GridBagConstraints();
		gbc_btnModifySkill_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnModifySkill_1.gridx = 2;
		gbc_btnModifySkill_1.gridy = 4;
		panelSkill.add(btnModifySkill_1, gbc_btnModifySkill_1);
		
		JTextField textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setVisible(false);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 0, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 0;
		gbc_textField_7.gridy = 5;
		panelSkill.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JTextField textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setVisible(false);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 5;
		panelSkill.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JButton btnModifySkill_2 = new JButton("Modify");
		btnModifySkill_2.setVisible(false);
		GridBagConstraints gbc_btnModifySkill_2 = new GridBagConstraints();
		gbc_btnModifySkill_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnModifySkill_2.gridx = 2;
		gbc_btnModifySkill_2.gridy = 5;
		panelSkill.add(btnModifySkill_2, gbc_btnModifySkill_2);
	}

}
