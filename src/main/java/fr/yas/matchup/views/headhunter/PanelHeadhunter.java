package fr.yas.matchup.views.headhunter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class PanelHeadhunter extends JPanel {

	private JButton btnEditJob;
	private JButton btnEditPresentation;
	private JButton btnValider;
	private JButton btnAnnuler;
	private JButton btnAddJob;
	


	/**
	 * @return the btnEditJob
	 */
	public JButton getBtnEditJob() {
		return btnEditJob;
	}



	/**
	 * @return the btnEditPresentation
	 */
	public JButton getBtnEditPresentation() {
		return btnEditPresentation;
	}



	/**
	 * @return the btnValider
	 */
	public JButton getBtnValider() {
		return btnValider;
	}



	/**
	 * @return the btnAnnuler
	 */
	public JButton getBtnAnnuler() {
		return btnAnnuler;
	}



	/**
	 * @return the btnAddJob
	 */
	public JButton getBtnAddJob() {
		return btnAddJob;
	}



	/**
	 * Create the frame.
	 */
	public PanelHeadhunter() {
		
		setBounds(100, 100, 750, 480);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{255, 255};
		gbl_panel.rowHeights = new int[] {500};
		gbl_panel.columnWeights = new double[]{1.0, 1.0};
		gbl_panel.rowWeights = new double[]{1.0};
		panel.setLayout(gbl_panel);
		
		JPanel panel_JobList = new JPanel();
		panel_JobList.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_JobList = new GridBagConstraints();
		gbc_panel_JobList.fill = GridBagConstraints.BOTH;
		gbc_panel_JobList.insets = new Insets(0, 0, 0, 5);
		gbc_panel_JobList.gridx = 0;
		gbc_panel_JobList.gridy = 0;
		panel.add(panel_JobList, gbc_panel_JobList);
		GridBagLayout gbl_panel_JobList = new GridBagLayout();
		gbl_panel_JobList.columnWidths = new int[] {80, 80, 80, 30};
		gbl_panel_JobList.rowHeights = new int[] {15, 250, 250, 150};
		gbl_panel_JobList.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0};
		gbl_panel_JobList.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0};
		panel_JobList.setLayout(gbl_panel_JobList);
		
		JButton btnAddJob = new JButton("Ajouter un poste");
		btnAddJob.setEnabled(true);
		GridBagConstraints gbc_btnAddJob = new GridBagConstraints();
		gbc_btnAddJob.anchor = GridBagConstraints.WEST;
		gbc_btnAddJob.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddJob.gridx = 0;
		gbc_btnAddJob.gridy = 0;
		panel_JobList.add(btnAddJob, gbc_btnAddJob);
		
		JPanel panel_Job1 = new JPanel();
		panel_Job1.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_Job1 = new GridBagConstraints();
		gbc_panel_Job1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_Job1.fill = GridBagConstraints.BOTH;
		gbc_panel_Job1.gridx = 0;
		gbc_panel_Job1.gridy = 1;
		panel_JobList.add(panel_Job1, gbc_panel_Job1);
		GridBagLayout gbl_panel_Job1 = new GridBagLayout();
		gbl_panel_Job1.columnWidths = new int[]{0, 0};
		gbl_panel_Job1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_Job1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_Job1.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Job1.setLayout(gbl_panel_Job1);
		
		JLabel lblJobTitle1 = new JLabel("Titre du poste");
		GridBagConstraints gbc_lblJobTitle1 = new GridBagConstraints();
		gbc_lblJobTitle1.insets = new Insets(0, 0, 5, 0);
		gbc_lblJobTitle1.gridx = 0;
		gbc_lblJobTitle1.gridy = 0;
		panel_Job1.add(lblJobTitle1, gbc_lblJobTitle1);
		
		JTextArea textArea_JobTitle = new JTextArea();
		textArea_JobTitle.setEditable(false);
		GridBagConstraints gbc_textArea_JobTitle = new GridBagConstraints();
		gbc_textArea_JobTitle.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_JobTitle.fill = GridBagConstraints.BOTH;
		gbc_textArea_JobTitle.gridx = 0;
		gbc_textArea_JobTitle.gridy = 1;
		panel_Job1.add(textArea_JobTitle, gbc_textArea_JobTitle);
		
		JLabel lblNewLabel_2 = new JLabel("Enterprise");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_Job1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JTextField textField_EnterpriseName = new JTextField();
		textField_EnterpriseName.setEditable(false);
		textField_EnterpriseName.setBackground(Color.white);
		GridBagConstraints gbc_textField_EnterpriseName = new GridBagConstraints();
		gbc_textField_EnterpriseName.insets = new Insets(0, 0, 5, 0);
		gbc_textField_EnterpriseName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_EnterpriseName.gridx = 0;
		gbc_textField_EnterpriseName.gridy = 3;
		panel_Job1.add(textField_EnterpriseName, gbc_textField_EnterpriseName);
		textField_EnterpriseName.setColumns(10);
		
		JButton btnEditJob = new JButton("Editer");
		btnEditJob.setEnabled(true);
		GridBagConstraints gbc_btnEditJob = new GridBagConstraints();
		gbc_btnEditJob.gridx = 0;
		gbc_btnEditJob.gridy = 4;
		panel_Job1.add(btnEditJob, gbc_btnEditJob);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 1;
		panel_JobList.add(panel_5, gbc_panel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 1;
		panel_JobList.add(panel_4, gbc_panel_4);
		
		JScrollBar scrollBar = new JScrollBar();
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.insets = new Insets(0, 0, 5, 5);
		gbc_scrollBar.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar.gridheight = 3;
		gbc_scrollBar.gridx = 3;
		gbc_scrollBar.gridy = 1;
		panel_JobList.add(scrollBar, gbc_scrollBar);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 2;
		panel_JobList.add(panel_6, gbc_panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 1;
		gbc_panel_7.gridy = 2;
		panel_JobList.add(panel_7, gbc_panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 2;
		gbc_panel_8.gridy = 2;
		panel_JobList.add(panel_8, gbc_panel_8);
		
		JPanel panel_HeadhunterPresentation = new JPanel();
		panel_HeadhunterPresentation.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panel_HeadhunterPresentation = new GridBagConstraints();
		gbc_panel_HeadhunterPresentation.fill = GridBagConstraints.BOTH;
		gbc_panel_HeadhunterPresentation.insets = new Insets(0, 0, 0, 5);
		gbc_panel_HeadhunterPresentation.gridx = 1;
		gbc_panel_HeadhunterPresentation.gridy = 0;
		panel.add(panel_HeadhunterPresentation, gbc_panel_HeadhunterPresentation);
		GridBagLayout gbl_panel_HeadhunterPresentation = new GridBagLayout();
		gbl_panel_HeadhunterPresentation.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_panel_HeadhunterPresentation.columnWidths = new int[] {30, 30, 30, 30, 30, 30, 30, 30};
		gbl_panel_HeadhunterPresentation.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0};
		gbl_panel_HeadhunterPresentation.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		panel_HeadhunterPresentation.setLayout(gbl_panel_HeadhunterPresentation);
		
		JLabel lblNewLabel = new JLabel("Fullname");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_HeadhunterPresentation.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextField textField_fullname = new JTextField();
		textField_fullname.setEditable(false);
		textField_fullname.setBackground(Color.white);
		GridBagConstraints gbc_textField_fullname = new GridBagConstraints();
		gbc_textField_fullname.gridwidth = 2;
		gbc_textField_fullname.fill = GridBagConstraints.BOTH;
		gbc_textField_fullname.insets = new Insets(0, 0, 5, 5);
		gbc_textField_fullname.gridx = 1;
		gbc_textField_fullname.gridy = 0;
		panel_HeadhunterPresentation.add(textField_fullname, gbc_textField_fullname);
		textField_fullname.setColumns(10);
		
		JLabel lblLinkedin = new JLabel("Linkedin");
		GridBagConstraints gbc_lblLinkedin = new GridBagConstraints();
		gbc_lblLinkedin.fill = GridBagConstraints.VERTICAL;
		gbc_lblLinkedin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLinkedin.gridx = 3;
		gbc_lblLinkedin.gridy = 0;
		panel_HeadhunterPresentation.add(lblLinkedin, gbc_lblLinkedin);
		
		JTextField textField_Linkedin = new JTextField();
		textField_Linkedin.setEditable(false);
		GridBagConstraints gbc_textField_Linkedin = new GridBagConstraints();
		gbc_textField_Linkedin.gridwidth = 2;
		gbc_textField_Linkedin.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Linkedin.fill = GridBagConstraints.BOTH;
		gbc_textField_Linkedin.gridx = 4;
		gbc_textField_Linkedin.gridy = 0;
		panel_HeadhunterPresentation.add(textField_Linkedin, gbc_textField_Linkedin);
		textField_Linkedin.setColumns(10);
		
		JLabel lblPhoto = new JLabel("");
		lblPhoto.setIcon(new ImageIcon(PanelHeadhunter.class.getResource("/javax/swing/plaf/basic/icons/image-delayed.png")));
		lblPhoto.setBackground(Color.white);
		GridBagConstraints gbc_lblPhoto = new GridBagConstraints();
		gbc_lblPhoto.gridheight = 2;
		gbc_lblPhoto.gridwidth = 2;
		gbc_lblPhoto.fill = GridBagConstraints.VERTICAL;
		gbc_lblPhoto.insets = new Insets(0, 0, 5, 0);
		gbc_lblPhoto.gridx = 6;
		gbc_lblPhoto.gridy = 0;
		panel_HeadhunterPresentation.add(lblPhoto, gbc_lblPhoto);
		
		JLabel lblPhone = new JLabel("Telephone");
		GridBagConstraints gbc_lblPhone = new GridBagConstraints();
		gbc_lblPhone.fill = GridBagConstraints.VERTICAL;
		gbc_lblPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblPhone.gridx = 0;
		gbc_lblPhone.gridy = 1;
		panel_HeadhunterPresentation.add(lblPhone, gbc_lblPhone);
		
		JTextField textField_Phone = new JTextField();
		textField_Phone.setEditable(false);
		textField_Phone.setBackground(Color.white);
		GridBagConstraints gbc_textField_Phone = new GridBagConstraints();
		gbc_textField_Phone.gridwidth = 2;
		gbc_textField_Phone.fill = GridBagConstraints.BOTH;
		gbc_textField_Phone.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Phone.gridx = 1;
		gbc_textField_Phone.gridy = 1;
		panel_HeadhunterPresentation.add(textField_Phone, gbc_textField_Phone);
		textField_Phone.setColumns(10);
		
		JLabel lblTwitter = new JLabel("Twitter");
		GridBagConstraints gbc_lblTwitter = new GridBagConstraints();
		gbc_lblTwitter.insets = new Insets(0, 0, 5, 5);
		gbc_lblTwitter.gridx = 3;
		gbc_lblTwitter.gridy = 1;
		panel_HeadhunterPresentation.add(lblTwitter, gbc_lblTwitter);
		
		JTextField textField_Twitter = new JTextField();
		textField_Twitter.setEditable(false);
		GridBagConstraints gbc_textField_Twitter = new GridBagConstraints();
		gbc_textField_Twitter.gridwidth = 2;
		gbc_textField_Twitter.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Twitter.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Twitter.gridx = 4;
		gbc_textField_Twitter.gridy = 1;
		panel_HeadhunterPresentation.add(textField_Twitter, gbc_textField_Twitter);
		textField_Twitter.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		panel_HeadhunterPresentation.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JTextField textField_Email = new JTextField();
		textField_Email.setEditable(false);
		textField_Email.setBackground(Color.white);
		GridBagConstraints gbc_textField_Email = new GridBagConstraints();
		gbc_textField_Email.gridwidth = 2;
		gbc_textField_Email.insets = new Insets(0, 0, 5, 5);
		gbc_textField_Email.fill = GridBagConstraints.BOTH;
		gbc_textField_Email.gridx = 1;
		gbc_textField_Email.gridy = 2;
		panel_HeadhunterPresentation.add(textField_Email, gbc_textField_Email);
		textField_Email.setColumns(10);
		
		JLabel lblPresentation = new JLabel("Presentation");
		GridBagConstraints gbc_lblPresentation = new GridBagConstraints();
		gbc_lblPresentation.gridwidth = 8;
		gbc_lblPresentation.insets = new Insets(0, 0, 5, 0);
		gbc_lblPresentation.gridx = 0;
		gbc_lblPresentation.gridy = 4;
		panel_HeadhunterPresentation.add(lblPresentation, gbc_lblPresentation);
		
		JTextArea textArea_Presentation = new JTextArea();
		textArea_Presentation.setEditable(false);
		textArea_Presentation.setRows(4);
		GridBagConstraints gbc_textArea_Presentation = new GridBagConstraints();
		gbc_textArea_Presentation.gridheight = 2;
		gbc_textArea_Presentation.gridwidth = 8;
		gbc_textArea_Presentation.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_Presentation.fill = GridBagConstraints.BOTH;
		gbc_textArea_Presentation.gridx = 0;
		gbc_textArea_Presentation.gridy = 5;
		panel_HeadhunterPresentation.add(textArea_Presentation, gbc_textArea_Presentation);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setVisible(false);
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnnuler.gridx = 2;
		gbc_btnAnnuler.gridy = 11;
		panel_HeadhunterPresentation.add(btnAnnuler, gbc_btnAnnuler);
		
		JButton btnEditPresentation = new JButton("Editer");
		btnEditPresentation.setVisible(true);
		btnEditPresentation.setEnabled(true);
		GridBagConstraints gbc_btnEditPresentation = new GridBagConstraints();
		gbc_btnEditPresentation.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditPresentation.gridx = 3;
		gbc_btnEditPresentation.gridy = 11;
		panel_HeadhunterPresentation.add(btnEditPresentation, gbc_btnEditPresentation);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setVisible(false);
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(0, 0, 5, 5);
		gbc_btnValider.gridx = 4;
		gbc_btnValider.gridy = 11;
		panel_HeadhunterPresentation.add(btnValider, gbc_btnValider);
	}

}
