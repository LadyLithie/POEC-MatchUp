package fr.yas.matchup.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.RegisteredUser;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class ProposalFrame extends BaseView {
	private JButton btnCancel;
	private JButton btnProposalCreation;
	//Zone options
	private JComboBox<RegisteredUser> comboBox_linkedUser;
	private JComboBox<ContractType> comboBox_contract;
	private JComboBox<String> comboBox_location;
	//Zone skills
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	//Zone description
	private JTextArea textArea;
	private JTextField textField_JobTitle;

	/**
	 * @return the btnCancel
	 */
	public JButton getBtnCancel() {
		return btnCancel;
	}

	/**
	 * @return the btnProposalCreation
	 */
	public JButton getBtnProposalCreation() {
		return btnProposalCreation;
	}

	//Begin zone options
	/**
	 * @return the comboBox_linkedUser
	 */
	public JComboBox<RegisteredUser> getComboBox_linkedUser() {
		return comboBox_linkedUser;
	}

	/**
	 * @return the comboBox_contract
	 */
	public JComboBox<ContractType> getComboBox_contract() {
		return comboBox_contract;
	}

	/**
	 * @return the comboBox_location
	 */
	public JComboBox<String> getComboBox_location() {
		return comboBox_location;
	}
	//Zone options end

	/**
	 * @return the checkBox
	 */
	public JCheckBox getCheckBox() {
		return checkBox;
	}

	/**
	 * @return the checkBox_1
	 */
	public JCheckBox getCheckBox_1() {
		return checkBox_1;
	}

	//Zone description start
	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @return the textField_JobTitle
	 */
	public JTextField getTextField_JobTitle() {
		return textField_JobTitle;
	}
	//Zone description end

	/**
	 * Create the frame.
	 */
	public ProposalFrame() {
		super.pageName = "Profile";
		JPanel panel = new JPanel();
		super.panel = panel;
//		setBounds(100, 100, 750, 450);
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {370, 370};
		gbl_contentPane.rowHeights = new int[] {250, 150, 20};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0};
		panel.setLayout(gbl_contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane);
		
		/*
		 * Zone skills
		 */
		JPanel panelCheckBox = new JPanel();
		scrollPane.setViewportView(panelCheckBox);
		panelCheckBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gbl_panelCheckBox = new GridBagLayout();
		gbl_panelCheckBox.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCheckBox.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCheckBox.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCheckBox.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCheckBox.setLayout(gbl_panelCheckBox);
		
		JLabel lblDevelopementSkills = new JLabel("Competences developpement");
		GridBagConstraints gbc_lblDevelopementSkills = new GridBagConstraints();
		gbc_lblDevelopementSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblDevelopementSkills.gridx = 0;
		gbc_lblDevelopementSkills.gridy = 0;
		panelCheckBox.add(lblDevelopementSkills, gbc_lblDevelopementSkills);
		
		JLabel lblSocialSkills = new JLabel("Competences sociales");
		GridBagConstraints gbc_lblSocialSkills = new GridBagConstraints();
		gbc_lblSocialSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblSocialSkills.gridx = 2;
		gbc_lblSocialSkills.gridy = 0;
		panelCheckBox.add(lblSocialSkills, gbc_lblSocialSkills);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_8 = new GridBagConstraints();
		gbc_checkBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_8.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_8.gridx = 0;
		gbc_checkBox_8.gridy = 1;
		panelCheckBox.add(checkBox_8, gbc_checkBox_8);
		
		JCheckBox checkBox_1_1 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_1_1 = new GridBagConstraints();
		gbc_checkBox_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_1_1.gridx = 2;
		gbc_checkBox_1_1.gridy = 1;
		panelCheckBox.add(checkBox_1_1, gbc_checkBox_1_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_2 = new GridBagConstraints();
		gbc_checkBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_2.gridx = 0;
		gbc_checkBox_2.gridy = 2;
		panelCheckBox.add(checkBox_2, gbc_checkBox_2);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_5 = new GridBagConstraints();
		gbc_checkBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_5.gridx = 2;
		gbc_checkBox_5.gridy = 2;
		panelCheckBox.add(checkBox_5, gbc_checkBox_5);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_3 = new GridBagConstraints();
		gbc_checkBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_3.gridx = 0;
		gbc_checkBox_3.gridy = 3;
		panelCheckBox.add(checkBox_3, gbc_checkBox_3);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_6 = new GridBagConstraints();
		gbc_checkBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_6.gridx = 2;
		gbc_checkBox_6.gridy = 3;
		panelCheckBox.add(checkBox_6, gbc_checkBox_6);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_4 = new GridBagConstraints();
		gbc_checkBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_4.insets = new Insets(0, 0, 0, 5);
		gbc_checkBox_4.gridx = 0;
		gbc_checkBox_4.gridy = 4;
		panelCheckBox.add(checkBox_4, gbc_checkBox_4);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_7 = new GridBagConstraints();
		gbc_checkBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkBox_7.insets = new Insets(0, 0, 0, 5);
		gbc_checkBox_7.gridx = 2;
		gbc_checkBox_7.gridy = 4;
		panelCheckBox.add(checkBox_7, gbc_checkBox_7);
		
		/*
		 * Zone description
		 */
		JPanel panelText = new JPanel();
		panelText.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelText = new GridBagConstraints();
		gbc_panelText.gridheight = 2;
		gbc_panelText.insets = new Insets(0, 0, 5, 0);
		gbc_panelText.fill = GridBagConstraints.BOTH;
		gbc_panelText.gridx = 1;
		gbc_panelText.gridy = 0;
		panel.add(panelText, gbc_panelText);
		GridBagLayout gbl_panelText = new GridBagLayout();
		gbl_panelText.columnWidths = new int[]{0, 0};
		gbl_panelText.rowHeights = new int[] {30, 0, 50, 0, 0, 0};
		gbl_panelText.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelText.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelText.setLayout(gbl_panelText);
		
		JLabel lblJobTitle = new JLabel("Titre du poste");
		GridBagConstraints gbc_lblJobTitle = new GridBagConstraints();
		gbc_lblJobTitle.insets = new Insets(0, 0, 5, 0);
		gbc_lblJobTitle.gridx = 0;
		gbc_lblJobTitle.gridy = 0;
		panelText.add(lblJobTitle, gbc_lblJobTitle);
		
		textField_JobTitle = new JTextField();
		GridBagConstraints gbc_textField_JobTitle = new GridBagConstraints();
		gbc_textField_JobTitle.insets = new Insets(0, 0, 5, 0);
		gbc_textField_JobTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_JobTitle.gridx = 0;
		gbc_textField_JobTitle.gridy = 1;
		panelText.add(textField_JobTitle, gbc_textField_JobTitle);
		textField_JobTitle.setColumns(10);
		
		JLabel lblProposalDescription = new JLabel("Description du poste");
		GridBagConstraints gbc_lblProposalDescription = new GridBagConstraints();
		gbc_lblProposalDescription.insets = new Insets(0, 0, 5, 0);
		gbc_lblProposalDescription.gridx = 0;
		gbc_lblProposalDescription.gridy = 3;
		panelText.add(lblProposalDescription, gbc_lblProposalDescription);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 4;
		panelText.add(textArea, gbc_textArea);
		
		/*
		 * Zone options
		 */
		JPanel panelComboBox = new JPanel();
		panelComboBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelComboBox = new GridBagConstraints();
		gbc_panelComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_panelComboBox.fill = GridBagConstraints.BOTH;
		gbc_panelComboBox.gridx = 0;
		gbc_panelComboBox.gridy = 1;
		panel.add(panelComboBox, gbc_panelComboBox);
		GridBagLayout gbl_panelComboBox = new GridBagLayout();
		gbl_panelComboBox.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelComboBox.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelComboBox.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelComboBox.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panelComboBox.setLayout(gbl_panelComboBox);
		
		JLabel lblGeographicLocation = new JLabel("Ville");
		GridBagConstraints gbc_lblGeographicLocation = new GridBagConstraints();
		gbc_lblGeographicLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblGeographicLocation.gridx = 0;
		gbc_lblGeographicLocation.gridy = 0;
		panelComboBox.add(lblGeographicLocation, gbc_lblGeographicLocation);
		
		comboBox_location = new JComboBox<String>();
		GridBagConstraints gbc_comboBox_location = new GridBagConstraints();
		gbc_comboBox_location.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_location.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_location.gridx = 2;
		gbc_comboBox_location.gridy = 0;
		panelComboBox.add(comboBox_location, gbc_comboBox_location);
		
		JLabel lblContractType = new JLabel("Type de contrat");
		GridBagConstraints gbc_lblContractType = new GridBagConstraints();
		gbc_lblContractType.insets = new Insets(0, 0, 5, 5);
		gbc_lblContractType.gridx = 0;
		gbc_lblContractType.gridy = 1;
		panelComboBox.add(lblContractType, gbc_lblContractType);
		
		comboBox_contract = new JComboBox<ContractType>();
		GridBagConstraints gbc_comboBox_contract = new GridBagConstraints();
		gbc_comboBox_contract.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_contract.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_contract.gridx = 2;
		gbc_comboBox_contract.gridy = 1;
		panelComboBox.add(comboBox_contract, gbc_comboBox_contract);
		
		JLabel lblLink = new JLabel("Link");
		GridBagConstraints gbc_lblLink = new GridBagConstraints();
		gbc_lblLink.insets = new Insets(0, 0, 0, 5);
		gbc_lblLink.gridx = 0;
		gbc_lblLink.gridy = 2;
		panelComboBox.add(lblLink, gbc_lblLink);
		
		comboBox_linkedUser = new JComboBox<RegisteredUser>();
		GridBagConstraints gbc_comboBox_linkedUser = new GridBagConstraints();
		gbc_comboBox_linkedUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_linkedUser.gridx = 2;
		gbc_comboBox_linkedUser.gridy = 2;
		panelComboBox.add(comboBox_linkedUser, gbc_comboBox_linkedUser);
		
		/*
		 * Zone finalization
		 */
		btnCancel = new JButton("Annuler");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.EAST;
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 0;
		gbc_btnCancel.gridy = 2;
		panel.add(btnCancel, gbc_btnCancel);
		
		btnProposalCreation = new JButton("Ajouter");
		GridBagConstraints gbc_btnProposalCreation = new GridBagConstraints();
		gbc_btnProposalCreation.anchor = GridBagConstraints.WEST;
		gbc_btnProposalCreation.gridx = 1;
		gbc_btnProposalCreation.gridy = 2;
		panel.add(btnProposalCreation, gbc_btnProposalCreation);
	}

}
