package fr.yas.matchup.views.panels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.GridLayout;

public class PanelPresentation extends JPanel {

	private JTextField textFieldName;
	private JTextField textFieldSIRET;
	private JTextField textFieldWebSite;
	private JTextField textFieldEmail;
	private JTextField textFieldNetwork;
	GridBagLayout gridBagLayout;
	JPanel panelField;
	JLabel lblNom;
	JLabel lblLogo;
	JPanel panelField_1;
	JLabel lblSiret;
	JButton btnModifier;
	JPanel panelField_2;
	JLabel lblEmail;
	JPanel panelSocialNetwork;
	JLabel lblI;
	JButton btnAjout;
	JPanel panelField_3;
	JLabel lblSiteWeb;
	JLabel lblPrsentation;
	private JButton btnAnnuler;
	private JButton btnValider;

	/**
	 * Create the panel.
	 */
	public PanelPresentation() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 0, 0, 0, 0, 100, 0, 10};
		gridBagLayout.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0, 0.0,.0, 0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//A field Panel with label and its associate textField
		panelField = new JPanel();
		GridBagConstraints gbc_panelField = new GridBagConstraints();
		gbc_panelField.gridwidth = 3;
		gbc_panelField.insets = new Insets(5, 5, 5, 5);
		gbc_panelField.fill = GridBagConstraints.BOTH;
		gbc_panelField.gridx = 1;
		gbc_panelField.gridy = 1;
		add(panelField, gbc_panelField);
		panelField.setLayout(new GridLayout(1, 0, 0, 0));
		lblNom = new JLabel("Nom :");
		panelField.add(lblNom);
		textFieldName = new JTextField();
		panelField.add(textFieldName);
		textFieldName.setColumns(2);
		
		lblLogo = new JLabel("Logo");
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.anchor = GridBagConstraints.EAST;
		gbc_lblLogo.insets = new Insets(5, 5, 5, 5);
		gbc_lblLogo.gridx = 6;
		gbc_lblLogo.gridy = 1;
		add(lblLogo, gbc_lblLogo);
		
		//A field Panel with label and its associate textField
		panelField_1 = new JPanel();
		GridBagConstraints gbc_panelField_1 = new GridBagConstraints();
		gbc_panelField_1.gridwidth = 3;
		gbc_panelField_1.insets = new Insets(5, 5, 5, 5);
		gbc_panelField_1.fill = GridBagConstraints.BOTH;
		gbc_panelField_1.gridx = 1;
		gbc_panelField_1.gridy = 2;
		add(panelField_1, gbc_panelField_1);
		panelField_1.setLayout(new GridLayout(1, 0, 0, 0));
		lblSiret = new JLabel("SIRET :");
		panelField_1.add(lblSiret);
		textFieldSIRET = new JTextField();
		panelField_1.add(textFieldSIRET);
		textFieldSIRET.setColumns(2);
		
		btnModifier = new JButton("Modifier");
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.anchor = GridBagConstraints.EAST;
		gbc_btnModifier.insets = new Insets(5, 5, 5, 5);
		gbc_btnModifier.gridx = 6;
		gbc_btnModifier.gridy = 2;
		add(btnModifier, gbc_btnModifier);
		
		//A field Panel with label and its associate textField
		panelField_2 = new JPanel();
		GridBagConstraints gbc_panelField_2 = new GridBagConstraints();
		gbc_panelField_2.gridwidth = 3;
		gbc_panelField_2.insets = new Insets(5, 5, 5, 5);
		gbc_panelField_2.fill = GridBagConstraints.BOTH;
		gbc_panelField_2.gridx = 1;
		gbc_panelField_2.gridy = 3;
		add(panelField_2, gbc_panelField_2);
		panelField_2.setLayout(new GridLayout(1, 0, 0, 0));
		lblEmail = new JLabel("Email :");
		panelField_2.add(lblEmail);
		textFieldEmail = new JTextField();
		panelField_2.add(textFieldEmail);
		textFieldEmail.setColumns(10);

		//Panel SocialNetwork
		panelSocialNetwork = new JPanel();
		GridBagConstraints gbc_panelSocialNetwork = new GridBagConstraints();
		gbc_panelSocialNetwork.anchor = GridBagConstraints.EAST;
		gbc_panelSocialNetwork.gridheight = 2;
		gbc_panelSocialNetwork.insets = new Insets(5, 5, 5, 5);
		gbc_panelSocialNetwork.fill = GridBagConstraints.VERTICAL;
		gbc_panelSocialNetwork.gridx = 6;
		gbc_panelSocialNetwork.gridy = 3;
		add(panelSocialNetwork, gbc_panelSocialNetwork);
		GridBagLayout gbl_panelSocialNetwork = new GridBagLayout();
		gbl_panelSocialNetwork.columnWidths = new int[]{59, 59, 0};
		gbl_panelSocialNetwork.rowHeights = new int[]{35, 35, 0};
		gbl_panelSocialNetwork.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelSocialNetwork.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelSocialNetwork.setLayout(gbl_panelSocialNetwork);
		//Icone of the network (with link?)
		lblI = new JLabel("i1");
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.fill = GridBagConstraints.BOTH;
		gbc_lblI.insets = new Insets(0, 0, 5, 5);
		gbc_lblI.gridx = 0;
		gbc_lblI.gridy = 0;
		panelSocialNetwork.add(lblI, gbc_lblI);
		btnAjout = new JButton("Ajout");
		GridBagConstraints gbc_btnAjout = new GridBagConstraints();
		gbc_btnAjout.fill = GridBagConstraints.BOTH;
		gbc_btnAjout.insets = new Insets(0, 0, 5, 0);
		gbc_btnAjout.gridx = 1;
		gbc_btnAjout.gridy = 0;
		panelSocialNetwork.add(btnAjout, gbc_btnAjout);
		textFieldNetwork = new JTextField();
		GridBagConstraints gbc_textFieldNetwork = new GridBagConstraints();
		gbc_textFieldNetwork.gridwidth = 2;
		gbc_textFieldNetwork.fill = GridBagConstraints.BOTH;
		gbc_textFieldNetwork.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldNetwork.gridx = 0;
		gbc_textFieldNetwork.gridy = 1;
		panelSocialNetwork.add(textFieldNetwork, gbc_textFieldNetwork);
		textFieldNetwork.setColumns(10);
		
		//A field Panel with label and its associate textField
		panelField_3 = new JPanel();
		GridBagConstraints gbc_panelField_3 = new GridBagConstraints();
		gbc_panelField_3.gridwidth = 3;
		gbc_panelField_3.insets = new Insets(5, 5, 5, 5);
		gbc_panelField_3.fill = GridBagConstraints.BOTH;
		gbc_panelField_3.gridx = 1;
		gbc_panelField_3.gridy = 4;
		add(panelField_3, gbc_panelField_3);
		panelField_3.setLayout(new GridLayout(2, 0, 0, 0));
		lblSiteWeb = new JLabel("Site Web :");
		panelField_3.add(lblSiteWeb);
		textFieldWebSite = new JTextField();
		panelField_3.add(textFieldWebSite);
		textFieldWebSite.setColumns(2);
		
		//Panel for the user presentation
		lblPrsentation = new JLabel("Pr\u00E9sentation :");
		GridBagConstraints gbc_lblPrsentation = new GridBagConstraints();
		gbc_lblPrsentation.anchor = GridBagConstraints.WEST;
		gbc_lblPrsentation.insets = new Insets(5, 5, 5, 5);
		gbc_lblPrsentation.gridx = 1;
		gbc_lblPrsentation.gridy = 6;
		add(lblPrsentation, gbc_lblPrsentation);
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 6;
		gbc_textArea.insets = new Insets(5, 5, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 7;
		add(textArea, gbc_textArea);
		
		
		//Validation or Cancellation sections
		btnAnnuler = new JButton("Annuler");
		GridBagConstraints gbc_btnAnnuler = new GridBagConstraints();
		gbc_btnAnnuler.insets = new Insets(5, 5, 0, 5);
		gbc_btnAnnuler.gridx = 3;
		gbc_btnAnnuler.gridy = 8;
		add(btnAnnuler, gbc_btnAnnuler);
		
		btnValider = new JButton("Valider");
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.insets = new Insets(5, 5, 0, 5);
		gbc_btnValider.gridx = 5;
		gbc_btnValider.gridy = 8;
		add(btnValider, gbc_btnValider);

	}

}
