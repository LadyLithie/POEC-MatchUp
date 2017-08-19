package fr.yas.matchup.views.panels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelHeadhunters extends JPanel {
	private JTextField textFieldFirstName;
	private JTextField textFieldNewFirstName_1;
	private JTextField textFieldLastName;
	private JButton btnDel;
	private GridBagConstraints gbc_btnDel;

	/**
	 * Create the panel.
	 */
	public PanelHeadhunters() {
		this.setName("Headhunters");
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0,0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//Title panel
		JPanel panelTitle = new JPanel();
		GridBagConstraints gbc_panelTitle = new GridBagConstraints();
		gbc_panelTitle.fill = GridBagConstraints.BOTH;
		gbc_panelTitle.insets = new Insets(0, 0, 5, 0);
		gbc_panelTitle.gridx = 0;
		gbc_panelTitle.gridy = 0;
		add(panelTitle, gbc_panelTitle);
		GridBagLayout gbl_panelTitle = new GridBagLayout();
		gbl_panelTitle.columnWidths = new int[]{0, 0, 0};
		gbl_panelTitle.rowHeights = new int[]{0, 0};
		gbl_panelTitle.columnWeights = new double[]{1.0, 0.0};
		gbl_panelTitle.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTitle.setLayout(gbl_panelTitle);
		
		JLabel lblHeadhunters = new JLabel("Headhunters");
		GridBagConstraints gbc_lblHeadhunters = new GridBagConstraints();
		gbc_lblHeadhunters.anchor = GridBagConstraints.WEST;
		gbc_lblHeadhunters.fill = GridBagConstraints.VERTICAL;
		gbc_lblHeadhunters.insets = new Insets(0, 0, 0, 5);
		gbc_lblHeadhunters.gridx = 0;
		gbc_lblHeadhunters.gridy = 0;
		panelTitle.add(lblHeadhunters, gbc_lblHeadhunters);
		
		JButton btnAnnuler = new JButton("Annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnnuler.gridx = 7;
		gbc_btnAnnuler.gridy = 0;
		panelTitle.add(btnAnnuler, gbc_btnAnnuler);
		
		JButton btnEdit = new JButton("Valider");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.anchor = GridBagConstraints.EAST;
		gbc_btnEdit.fill = GridBagConstraints.VERTICAL;
		gbc_btnEdit.gridx = 8;
		gbc_btnEdit.gridy = 0;
		panelTitle.add(btnEdit, gbc_btnEdit);
		
		//List - Main panel
		JPanel panelContent = new JPanel();
		GridBagConstraints gbc_panelContent = new GridBagConstraints();
		gbc_panelContent.fill = GridBagConstraints.BOTH;
		gbc_panelContent.gridx = 0;
		gbc_panelContent.gridy = 1;
		add(panelContent, gbc_panelContent);
		GridBagLayout gbl_panelContent = new GridBagLayout();
		gbl_panelContent.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panelContent.rowHeights = new int[]{0, 0, 0};
		gbl_panelContent.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelContent.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelContent.setLayout(gbl_panelContent);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panelContent.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		//List the present headhunters and offer possibility to delete
		JLabel lblHeadhunter = new JLabel("Headhunter 1");
		GridBagConstraints gbc_lblHeadhunter = new GridBagConstraints();
		gbc_lblHeadhunter.anchor = GridBagConstraints.EAST;
		gbc_lblHeadhunter.insets = new Insets(0, 0, 0, 5);
		gbc_lblHeadhunter.gridx = 0;
		gbc_lblHeadhunter.gridy = 0;
		panel.add(lblHeadhunter, gbc_lblHeadhunter);
		
		textFieldFirstName = new JTextField();
		GridBagConstraints gbc_textFieldNewFirstName = new GridBagConstraints();
		gbc_textFieldNewFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNewFirstName.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNewFirstName.gridx = 2;
		gbc_textFieldNewFirstName.gridy = 0;
		panel.add(textFieldFirstName, gbc_textFieldNewFirstName);
		textFieldFirstName.setColumns(2);
		
		textFieldLastName = new JTextField();
		GridBagConstraints gbc_textFieldNewLastName = new GridBagConstraints();
		gbc_textFieldNewLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNewLastName.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNewLastName.gridx = 4;
		gbc_textFieldNewLastName.gridy = 0;
		panel.add(textFieldLastName, gbc_textFieldNewLastName);
		textFieldLastName.setColumns(2);
		btnDel = new JButton("Supprime");
		GridBagConstraints gbc_btnDel_1 = new GridBagConstraints();
		gbc_btnDel_1.gridx = 7;
		gbc_btnDel_1.gridy = 0;
		panel.add(btnDel, gbc_btnDel_1);
		
		
		//Add new one
		JLabel lblNewHeadhunter = new JLabel("New headhunter");
		GridBagConstraints gbc_lblNewHeadhunter = new GridBagConstraints();
		gbc_lblNewHeadhunter.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewHeadhunter.anchor = GridBagConstraints.EAST;
		gbc_lblNewHeadhunter.gridx = 0;
		gbc_lblNewHeadhunter.gridy = 1;
		panelContent.add(lblNewHeadhunter, gbc_lblNewHeadhunter);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setColumns(2);
		GridBagConstraints gbc_textFieldNewFN = new GridBagConstraints();
		gbc_textFieldNewFN.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNewFN.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNewFN.gridx = 1;
		gbc_textFieldNewFN.gridy = 1;
		panelContent.add(textFieldFirstName, gbc_textFieldNewFN);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(2);
		GridBagConstraints gbc_textFieldNewLN = new GridBagConstraints();
		gbc_textFieldNewLN.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNewLN.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNewLN.gridx = 2;
		gbc_textFieldNewLN.gridy = 1;
		panelContent.add(textFieldLastName, gbc_textFieldNewLN);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAdd.gridx = 3;
		gbc_btnAdd.gridy = 1;
		panelContent.add(btnAdd, gbc_btnAdd);
		


	}

}
