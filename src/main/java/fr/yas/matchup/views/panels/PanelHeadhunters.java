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
	/**
	 * Create the panel.
	 */
	public PanelHeadhunters() {
		this.setName("Headhunters");
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 10, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0,1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//Title panel
		JPanel panelTitle = new JPanel();
		GridBagConstraints gbc_panelTitle = new GridBagConstraints();
		gbc_panelTitle.fill = GridBagConstraints.BOTH;
		gbc_panelTitle.insets = new Insets(0, 0, 5, 5);
		gbc_panelTitle.gridx = 1;
		gbc_panelTitle.gridy = 1;
		add(panelTitle, gbc_panelTitle);
		GridBagLayout gbl_panelTitle = new GridBagLayout();
		gbl_panelTitle.columnWidths = new int[]{5, 0, 10, 0, 5, 0};
		gbl_panelTitle.rowHeights = new int[]{0, 0};
		gbl_panelTitle.columnWeights = new double[]{0.0, 0.0, 1, 0.0, 0.0, 0.0};
		gbl_panelTitle.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTitle.setLayout(gbl_panelTitle);
		
		JLabel lblHeadhunters = new JLabel("Headhunters");
		GridBagConstraints gbc_lblHeadhunters = new GridBagConstraints();
		gbc_lblHeadhunters.anchor = GridBagConstraints.WEST;
		gbc_lblHeadhunters.fill = GridBagConstraints.VERTICAL;
		gbc_lblHeadhunters.insets = new Insets(0, 0, 0, 5);
		gbc_lblHeadhunters.gridx = 1;
		gbc_lblHeadhunters.gridy = 0;
		panelTitle.add(lblHeadhunters, gbc_lblHeadhunters);
		
		JButton btnAnnuler = new JButton("Annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.anchor = GridBagConstraints.EAST;
		gbc_btnAnnuler.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnnuler.gridx = 3;
		gbc_btnAnnuler.gridy = 0;
		panelTitle.add(btnAnnuler, gbc_btnAnnuler);
		
		JButton btnEdit = new JButton("Valider");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.insets = new Insets(0, 0, 0, 5);
		gbc_btnEdit.anchor = GridBagConstraints.EAST;
		gbc_btnEdit.gridx = 4;
		gbc_btnEdit.gridy = 0;
		panelTitle.add(btnEdit, gbc_btnEdit);
		
		//List - Main panel
		JPanel panelContent = new JPanel();
		GridBagConstraints gbc_panelContent = new GridBagConstraints();
		gbc_panelContent.insets = new Insets(0, 0, 5, 5);
		gbc_panelContent.fill = GridBagConstraints.NORTH;
		gbc_panelContent.gridx = 1;
		gbc_panelContent.gridy = 2;
		add(panelContent, gbc_panelContent);
		GridBagLayout gbl_panelContent = new GridBagLayout();
		gbl_panelContent.columnWidths = new int[]{10, 0, 10, 0};
		gbl_panelContent.rowHeights = new int[]{10, 0, 0, 0, 0};
		gbl_panelContent.columnWeights = new double[]{1, 0.0, 1, Double.MIN_VALUE};
		gbl_panelContent.rowWeights = new double[]{0, 0.0, 0, Double.MIN_VALUE};
		panelContent.setLayout(gbl_panelContent);
		//List the present headhunters and offer possibility to delete
		int posX = 1;
		for (int i = 0; i < 2; i++) {
			Panel2FieldButton test = new Panel2FieldButton("Headhunter", "Supprimer");
			GridBagConstraints gbc_test = new GridBagConstraints();
			gbc_test.fill = GridBagConstraints.HORIZONTAL;
			gbc_test.anchor = GridBagConstraints.CENTER;
			gbc_test.gridx = 1;
			gbc_test.gridy = posX;
			panelContent.add(test, gbc_test);
			posX = posX + 2;
		}
		
		//Add new one
		Panel2FieldButton newHeadHunter = new Panel2FieldButton("Nouveau recruteur", "Ajouter");
		GridBagConstraints gbc_newHeadHunter = new GridBagConstraints();
		gbc_newHeadHunter.insets = new Insets(0, 0, 5, 5);
		gbc_newHeadHunter.fill = GridBagConstraints.HORIZONTAL;
		gbc_newHeadHunter.anchor = GridBagConstraints.WEST;
		gbc_newHeadHunter.gridx = 1;
		gbc_newHeadHunter.gridy = posX;
		panelContent.add(newHeadHunter, gbc_newHeadHunter);
		


	}

}
