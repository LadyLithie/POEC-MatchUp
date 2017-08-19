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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPresentation extends JPanel {

	private JTextField textFieldName;
	private JTextField textFieldSIRET;
	private JTextField textFieldWebSite;
	private JTextField textFieldEmail;
	private JTextField textFieldNetwork;
	GridBagLayout gridBagLayout;
	JPanel panelField;
	JLabel lblNom;
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
	private JPanel panelDecision;
	private JPanel panelLogo;
	private JLabel lblLogo;

	/**
	 * Create the panel.
	 */
	public PanelPresentation() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 0, 0, 0, 0, 10, 10, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0, 0.0, .0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		// A field Panel with label and its associate textField
		PanelField namePanel = new PanelField("Nom");
		GridBagConstraints gbc_namePanel = new GridBagConstraints();
		gbc_namePanel.anchor = GridBagConstraints.WEST;
		gbc_namePanel.insets = new Insets(0, 0, 5, 5);
		gbc_namePanel.gridx = 1;
		gbc_namePanel.gridy = 1;
		add(namePanel, gbc_namePanel);
		panelField_1 = new JPanel();
		
		// A field Panel with label and its associate textField
		PanelField siretPanel = new PanelField("SIRET");
		GridBagConstraints gbc_siretPanel = new GridBagConstraints();
		gbc_siretPanel.anchor = GridBagConstraints.WEST;
		gbc_siretPanel.insets = new Insets(0, 0, 5, 5);
		gbc_siretPanel.gridx = 1;
		gbc_siretPanel.gridy = 2;
		add(siretPanel, gbc_siretPanel);

		// A field Panel with label and its associate textField
		PanelField emailPanel = new PanelField("Email");
		GridBagConstraints gbc_emailPanel = new GridBagConstraints();
		gbc_emailPanel.anchor = GridBagConstraints.WEST;
		gbc_emailPanel.insets = new Insets(0, 0, 5, 5);
		gbc_emailPanel.gridx = 1;
		gbc_emailPanel.gridy = 3;
		add(emailPanel, gbc_emailPanel);

		// A field Panel with label and its associate textField
		PanelField websitePanel = new PanelField("Website");
		GridBagConstraints gbc_websitePanel = new GridBagConstraints();
		gbc_websitePanel.anchor = GridBagConstraints.WEST;
		gbc_websitePanel.insets = new Insets(0, 0, 5, 5);
		gbc_websitePanel.gridx = 1;
		gbc_websitePanel.gridy = 4;
		add(websitePanel, gbc_websitePanel);
		
		//Zone logo
		panelLogo = new JPanel();
		GridBagConstraints gbc_panelLogo = new GridBagConstraints();
		gbc_panelLogo.gridheight = 2;
		gbc_panelLogo.insets = new Insets(0, 0, 5, 5);
		gbc_panelLogo.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelLogo.gridx = 5;
		gbc_panelLogo.gridy = 1;
		add(panelLogo, gbc_panelLogo);
		GridBagLayout gbl_panelLogo = new GridBagLayout();
		gbl_panelLogo.columnWidths = new int[] { 2, 0, 2, 0 };
		gbl_panelLogo.rowHeights = new int[] { 2, 23, 0, 2, 0 };
		gbl_panelLogo.columnWeights = new double[] { 1, 0, 0, Double.MIN_VALUE };
		gbl_panelLogo.rowWeights = new double[] { 0, 0, 0, 0, Double.MIN_VALUE };
		panelLogo.setLayout(gbl_panelLogo);

		lblLogo = new JLabel("Logo");
		lblLogo.setSize(100, 100);
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridx = 1;
		gbc_lblLogo.gridy = 1;
		panelLogo.add(lblLogo, gbc_lblLogo);

		btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.insets = new Insets(0, 0, 5, 5);
		gbc_btnModifier.gridx = 1;
		gbc_btnModifier.gridy = 2;
		panelLogo.add(btnModifier, gbc_btnModifier);

		// Panel SocialNetwork
		panelSocialNetwork = new JPanel();
		GridBagConstraints gbc_panelSocialNetwork = new GridBagConstraints();
		gbc_panelSocialNetwork.anchor = GridBagConstraints.EAST;
		gbc_panelSocialNetwork.gridheight = 3;
		gbc_panelSocialNetwork.insets = new Insets(5, 5, 5, 5);
		gbc_panelSocialNetwork.fill = GridBagConstraints.VERTICAL;
		gbc_panelSocialNetwork.gridx = 5;
		gbc_panelSocialNetwork.gridy = 3;
		add(panelSocialNetwork, gbc_panelSocialNetwork);
		GridBagLayout gbl_panelSocialNetwork = new GridBagLayout();
		gbl_panelSocialNetwork.columnWidths = new int[] { 2, 59, 5, 59, 2, 0 };
		gbl_panelSocialNetwork.rowHeights = new int[] { 2, 35, 1, 35, 2, 0 };
		gbl_panelSocialNetwork.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelSocialNetwork.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelSocialNetwork.setLayout(gbl_panelSocialNetwork);
		// Icone of the network (with link?)
		lblI = new JLabel("i1");
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.fill = GridBagConstraints.BOTH;
		gbc_lblI.insets = new Insets(0, 0, 5, 5);
		gbc_lblI.gridx = 1;
		gbc_lblI.gridy = 1;
		panelSocialNetwork.add(lblI, gbc_lblI);
		btnAjout = new JButton("Ajout");
		GridBagConstraints gbc_btnAjout = new GridBagConstraints();
		gbc_btnAjout.fill = GridBagConstraints.BOTH;
		gbc_btnAjout.insets = new Insets(0, 0, 5, 5);
		gbc_btnAjout.gridx = 3;
		gbc_btnAjout.gridy = 1;
		panelSocialNetwork.add(btnAjout, gbc_btnAjout);
		textFieldNetwork = new JTextField();
		GridBagConstraints gbc_textFieldNetwork = new GridBagConstraints();
		gbc_textFieldNetwork.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNetwork.gridwidth = 3;
		gbc_textFieldNetwork.fill = GridBagConstraints.BOTH;
		gbc_textFieldNetwork.gridx = 1;
		gbc_textFieldNetwork.gridy = 3;
		panelSocialNetwork.add(textFieldNetwork, gbc_textFieldNetwork);
		textFieldNetwork.setColumns(10);

		// Panel for the user presentation
		lblPrsentation = new JLabel("Pr\u00E9sentation :");
		GridBagConstraints gbc_lblPrsentation = new GridBagConstraints();
		gbc_lblPrsentation.anchor = GridBagConstraints.WEST;
		gbc_lblPrsentation.insets = new Insets(5, 5, 5, 5);
		gbc_lblPrsentation.gridx = 1;
		gbc_lblPrsentation.gridy = 6;
		add(lblPrsentation, gbc_lblPrsentation);
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 5;
		gbc_textArea.insets = new Insets(5, 5, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 7;
		add(textArea, gbc_textArea);

		// Validation or Cancellation sections
		panelDecision = new JPanel();
		GridBagConstraints gbc_panelDecision = new GridBagConstraints();
		gbc_panelDecision.gridwidth = 5;
		gbc_panelDecision.insets = new Insets(0, 0, 5, 5);
		gbc_panelDecision.gridx = 1;
		gbc_panelDecision.gridy = 9;
		add(panelDecision, gbc_panelDecision);
		panelDecision.setLayout(new GridLayout(1, 0, 0, 0));
		btnAnnuler = new JButton("Annuler");
		panelDecision.add(btnAnnuler);
		btnValider = new JButton("Valider");
		panelDecision.add(btnValider);

	}

}
