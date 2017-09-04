package fr.yas.matchup.views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import fr.yas.matchup.views.usercontrols.MenuBar;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class CandidateView extends BaseView {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblListeDeSkills;
	private JList list;
	private JButton btnEdit;
	private JTextArea textArea;
	private JButton btnSelectSkill;
	private DefaultListModel<JCheckBox> listModel;
	private JTable table;
	private JButton btnAnnulerButton;
	private DefaultTableModel model ;
	private JLabel linkTwitter;
	private JLabel linkLinkedin;
	private JLabel linkViadeo;
	private String nameLinkLinkedin;
	private String nameLinkTwitter;
	private String nameLinkViadeo;
	private JButton btnEditLink;
	private MenuBar menuBar;
	

	public CandidateView(JFrame frame){
		super.pageName= "Candidate";
		JPanel contentPane = new JPanel();
		super.panel = contentPane;
		
		nameLinkLinkedin = "https://www.linkedin.com";
		nameLinkTwitter ="https://twitter.com/?lang=fr";
		nameLinkViadeo ="http://www.viadeo.com";
		
//		ViewsUtils.configureJFrame(frame,contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0, 0,0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0,0,0,0,0,0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		gbc_menuBar.gridwidth = 10;
		contentPane.add(menuBar.getContentPane(), gbc_menuBar);
		
		lblListeDeSkills = new JLabel("Liste de Skills");
		GridBagConstraints gbc_lblListeDeSkills = new GridBagConstraints();
		gbc_lblListeDeSkills.gridwidth = 2;
		gbc_lblListeDeSkills.anchor = GridBagConstraints.NORTH;
		gbc_lblListeDeSkills.insets = new Insets(0, 0, 5, 5);
		gbc_lblListeDeSkills.gridx = 1;
		gbc_lblListeDeSkills.gridy = 1;
		contentPane.add(lblListeDeSkills, gbc_lblListeDeSkills);
		
		
	
		model = new DefaultTableModel(null, new String [] {"CheckMe", "Compétences"}) {
            public Class getColumnClass(int c) {
              switch (c) {
                case 0: return Boolean.class;
                default: return String.class;
              }   
            } };	
		
		table = new JTable(model);
		
		for (int i = 0; i < 10; i++) {	
			model.addRow(new Object [] {false,"Java"});
			model.addRow(new Object [] {false,"PHP"});
			model.addRow(new Object [] {false,"SQL"});
			model.addRow(new Object [] {false,"CSS"});
			model.addRow(new Object [] {false,"HTML"});
			model.addRow(new Object [] {false,"C++"});
			model.addRow(new Object [] {false,"C"});
			model.addRow(new Object [] {false,"C#"});
		}
		
		table.setEnabled(false);
		
		JScrollPane scroll = new JScrollPane(table);
		Dimension preferredSize = new Dimension(10, 100);
		scroll.setPreferredSize(preferredSize );
		
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 2;
		gbc_table.gridheight = 14;
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 2;
		contentPane.add(scroll, gbc_table);
		
		JLabel lblNewLabel = new JLabel("Pr\u00E9nom");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField("Sacha");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.weightx = 1.0;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 2;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		textField.setEnabled(false);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField("Markides");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.weightx = 1.0;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		textField_1.setEnabled(false);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField("Lejavacesttropdelaballe@orange.fr");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.weightx = 1.0;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 5;
		gbc_textField_2.gridy = 4;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		textField_2.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("T\u00E9l\u00E9phone\r\n");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 5;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField("01-02-03-04-05");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.weightx = 1.0;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 5;
		gbc_textField_3.gridy = 5;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		textField_3.setEnabled(false);
		
		btnEditLink = new JButton("Edit");
		GridBagConstraints gbc_btnEditLink = new GridBagConstraints();
		gbc_btnEditLink.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditLink.gridx = 12;
		gbc_btnEditLink.gridy = 5;
		contentPane.add(btnEditLink, gbc_btnEditLink);
		
		textArea = new JTextArea("Présentation du profil");
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 9;
		gbc_textArea.gridheight = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 4;
		gbc_textArea.gridy = 7;
		contentPane.add(textArea, gbc_textArea);
		textArea.setEnabled(false);
		
		btnEdit = new JButton("Edit");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.fill = GridBagConstraints.BOTH;
		gbc_btnEdit.insets = new Insets(0, 0, 5, 5);
		gbc_btnEdit.gridx = 6;
		gbc_btnEdit.gridy = 10;
		contentPane.add(btnEdit, gbc_btnEdit);
		
//		JLabel lblTitle = new JLabel("Title");
//		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
//		gbc_lblTitle.gridwidth = 7;
//		gbc_lblTitle.fill = GridBagConstraints.VERTICAL;
//		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
//		gbc_lblTitle.gridx = 4;
//		gbc_lblTitle.gridy = 12;
//		contentPane.add(lblTitle, gbc_lblTitle);
//		
//		JButton btnButton = new JButton("button");
//		GridBagConstraints gbc_btnButton = new GridBagConstraints();
//		gbc_btnButton.gridwidth = 2;
//		gbc_btnButton.fill = GridBagConstraints.BOTH;
//		gbc_btnButton.insets = new Insets(0, 0, 5, 5);
//		gbc_btnButton.gridx = 9;
//		gbc_btnButton.gridy = 13;
//		contentPane.add(btnButton, gbc_btnButton);
//		
//		JLabel lblOption_1 = new JLabel("Option 1");
//		GridBagConstraints gbc_lblOption_1 = new GridBagConstraints();
//		gbc_lblOption_1.insets = new Insets(0, 0, 5, 5);
//		gbc_lblOption_1.gridx = 4;
//		gbc_lblOption_1.gridy = 14;
//		contentPane.add(lblOption_1, gbc_lblOption_1);
//		
//		JList list_1 = new JList();
//		GridBagConstraints gbc_list_1 = new GridBagConstraints();
//		gbc_list_1.gridwidth = 2;
//		gbc_list_1.gridheight = 3;
//		gbc_list_1.insets = new Insets(0, 0, 0, 5);
//		gbc_list_1.fill = GridBagConstraints.BOTH;
//		gbc_list_1.gridx = 5;
//		gbc_list_1.gridy = 14;
//		contentPane.add(list_1, gbc_list_1);
//		
//		JList list_2 = new JList();
//		GridBagConstraints gbc_list_2 = new GridBagConstraints();
//		gbc_list_2.insets = new Insets(0, 0, 0, 5);
//		gbc_list_2.gridheight = 3;
//		gbc_list_2.gridwidth = 4;
//		gbc_list_2.fill = GridBagConstraints.BOTH;
//		gbc_list_2.gridx = 7;
//		gbc_list_2.gridy = 14;
//		contentPane.add(list_2, gbc_list_2);
//		
//		JLabel lblOption_2 = new JLabel("Option 2");
//		GridBagConstraints gbc_lblOption_2 = new GridBagConstraints();
//		gbc_lblOption_2.anchor = GridBagConstraints.NORTH;
//		gbc_lblOption_2.insets = new Insets(0, 0, 5, 5);
//		gbc_lblOption_2.gridx = 4;
//		gbc_lblOption_2.gridy = 15;
//		contentPane.add(lblOption_2, gbc_lblOption_2);
		
		btnSelectSkill = new JButton("Sélectionner Skill");
		Dimension preferredSize1 = new Dimension(180, 25);
		btnSelectSkill.setPreferredSize(preferredSize1);
		GridBagConstraints gbc_btnSelectSkill = new GridBagConstraints();
		gbc_btnSelectSkill.insets = new Insets(0, 0, 0, 5);
		gbc_btnSelectSkill.gridx = 1;
		gbc_btnSelectSkill.gridy = 16;
		contentPane.add(btnSelectSkill, gbc_btnSelectSkill);
		
		btnAnnulerButton = new JButton("Annuler");
		btnAnnulerButton.setEnabled(false);
		GridBagConstraints gbc_btnAnnulerButton = new GridBagConstraints();
		gbc_btnAnnulerButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnnulerButton.gridx = 2;
		gbc_btnAnnulerButton.gridy = 16;
		contentPane.add(btnAnnulerButton, gbc_btnAnnulerButton);
		
		ImageIcon image = new ImageIcon("image/linkedin-icon2.png");
		linkLinkedin = new JLabel();
		linkLinkedin.setIcon(image);
		GridBagConstraints gbc_linkLinkedin = new GridBagConstraints();
		gbc_linkLinkedin.insets = new Insets(0, 0, 5, 5);
		gbc_linkLinkedin.gridx = 9;
		gbc_linkLinkedin.gridy = 5;
		contentPane.add(linkLinkedin,gbc_linkLinkedin);
		
		ImageIcon image2 = new ImageIcon("image/Twitterbird2.png");
		linkTwitter = new JLabel();
		linkTwitter.setIcon(image2);
		GridBagConstraints gbc_linkTwitter = new GridBagConstraints();
		gbc_linkTwitter.insets = new Insets(0, 0, 5, 5);
		gbc_linkTwitter.gridx = 10;
		gbc_linkTwitter.gridy = 5;
		contentPane.add(linkTwitter,gbc_linkTwitter);
		
		ImageIcon image3 = new ImageIcon("image/viadeo.png");
		linkViadeo = new JLabel();
		linkViadeo.setIcon(image3);
		GridBagConstraints gbc_linkViadeo = new GridBagConstraints();
		gbc_linkViadeo.insets = new Insets(0, 0, 5, 5);
		gbc_linkViadeo.gridx = 11;
		gbc_linkViadeo.gridy = 5;
		contentPane.add(linkViadeo,gbc_linkViadeo);
		
		
	}
	
	public JLabel getLinkViadeo() {
		return linkViadeo;
	}

	public void setLinkViadeo(JLabel linkViadeo) {
		this.linkViadeo = linkViadeo;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JLabel getLblListeDeSkills() {
		return lblListeDeSkills;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public void setLblListeDeSkills(JLabel lblListeDeSkills) {
		this.lblListeDeSkills = lblListeDeSkills;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getBtnSelectSkill() {
		return btnSelectSkill;
	}

	public void setBtnSelectSkill(JButton btnAddSkill) {
		this.btnSelectSkill = btnAddSkill;
	} 
	
	public DefaultListModel<JCheckBox> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<JCheckBox> listModel) {
		this.listModel = listModel;
	}
	
	public JButton getBtnAnnulerButton() {
		return btnAnnulerButton;
	}

	public void setBtnAnnulerButton(JButton btnAnnulerButton) {
		this.btnAnnulerButton = btnAnnulerButton;
	}
	
	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}


	public JLabel getLinkTwitter() {
		return linkTwitter;
	}

	public void setLinkTwitter(JLabel linkTwitter) {
		this.linkTwitter = linkTwitter;
	}

	public JLabel getLinkLinkedin() {
		return linkLinkedin;
	}

	public void setLinkLinkedin(JLabel linkLinkedin) {
		this.linkLinkedin = linkLinkedin;
	}
	
	public String getNameLinkLinkedin() {
		return nameLinkLinkedin;
	}

	public void setNameLinkLinkedin(String nameLinkLinkedin) {
		this.nameLinkLinkedin = nameLinkLinkedin;
	}

	public String getNameLinkTwitter() {
		return nameLinkTwitter;
	}

	public void setNameLinkTwitter(String nameLinkTwitter) {
		this.nameLinkTwitter = nameLinkTwitter;
	}

	public String getNameLinkViadeo() {
		return nameLinkViadeo;
	}

	public void setNameLinkViadeo(String nameLinkViadeo) {
		this.nameLinkViadeo = nameLinkViadeo;
	}	

	public JButton getBtnEditLink() {
		return btnEditLink;
	}

	public void setBtnEditLink(JButton btnEditLink) {
		this.btnEditLink = btnEditLink;
	}

	/**
	 * @return the menuBar
	 */
	public MenuBar getMenuBar() {
		return menuBar;
	}

}
