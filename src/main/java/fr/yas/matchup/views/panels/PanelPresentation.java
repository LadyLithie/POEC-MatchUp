package fr.yas.matchup.views.panels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import fr.yas.matchup.views.IVisibility;

import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

public class PanelPresentation extends JPanel implements IVisibility{
	GridBagLayout gridBagLayout;
	
	private PanelField namePanel;
	private PanelField siretPanel;
	private PanelField emailPanel;
	private PanelField websitePanel;
	
	private JLabel lblLogo;
	JButton btnModifier;
	
	private JLabel lblIcon;
	JButton btnAjout;
	private JTextField textFieldNetwork;
	
	private JButton btnAnnuler;
	private JButton btnEditer;
	private JButton btnValider;

	/**
	 * @return the btnEditer
	 */
	public JButton getBtnEditer() {
		return btnEditer;
	}

	private JTextArea textAreaPresentation;
	
	/**
	 * @return the textAreaPresentation
	 */
	public JTextArea getTextAreaPresentation() {
		return textAreaPresentation;
	}

	/**
	 * @return the namePanel
	 */
	public PanelField getNamePanel() {
		return namePanel;
	}

	/**
	 * @return the siretPanel
	 */
	public PanelField getSiretPanel() {
		return siretPanel;
	}

	/**
	 * @return the emailPanel
	 */
	public PanelField getEmailPanel() {
		return emailPanel;
	}

	/**
	 * @return the websitePanel
	 */
	public PanelField getWebsitePanel() {
		return websitePanel;
	}

	/**
	 * @return the lblLogo
	 */
	public JLabel getLblLogo() {
		return lblLogo;
	}

	/**
	 * @return the btnModifier
	 */
	public JButton getBtnModifier() {
		return btnModifier;
	}

	/**
	 * @return the lblIcon
	 */
	public JLabel getLblIcon() {
		return lblIcon;
	}

	/**
	 * @return the btnAjout
	 */
	public JButton getBtnAjout() {
		return btnAjout;
	}

	/**
	 * @return the textFieldNetwork
	 */
	public JTextField getTextFieldNetwork() {
		return textFieldNetwork;
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
	 * Create the panel.
	 */
	public PanelPresentation() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 5, 0, 0, 10, 5, 0 };
		gridBagLayout.rowHeights = new int[] { 5, 0, 0, 0, 0, 0, 2, 0, 2, 0, 5, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0, 0.0, 0.1, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		// A field Panel with label and its associate textField
		namePanel = new PanelField("Nom");
		namePanel.getInput().setBorder(new LineBorder(null, 0));
		GridBagLayout gridBagLayout_1 = (GridBagLayout) namePanel.getLayout();
		gridBagLayout_1.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0};
		namePanel.getInput().setEditable(false);
		GridBagConstraints gbc_namePanel = new GridBagConstraints();
		gbc_namePanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_namePanel.insets = new Insets(0, 0, 1, 1);
		gbc_namePanel.gridx = 1;
		gbc_namePanel.gridy = 1;
		add(namePanel, gbc_namePanel);
		
		// A field Panel with label and its associate textField
		siretPanel = new PanelField("SIRET");
		siretPanel.getInput().setToolTipText("Chiffres uniquement");
		siretPanel.getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagLayout gridBagLayout_2 = (GridBagLayout) siretPanel.getLayout();
		gridBagLayout_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0};
		siretPanel.getInput().setEditable(false);
		GridBagConstraints gbc_siretPanel = new GridBagConstraints();
		gbc_siretPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_siretPanel.insets = new Insets(0, 0, 1, 1);
		gbc_siretPanel.gridx = 1;
		gbc_siretPanel.gridy = 2;
		add(siretPanel, gbc_siretPanel);

		// A field Panel with label and its associate textField
		emailPanel = new PanelField("Email");
		emailPanel.getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagLayout gridBagLayout_3 = (GridBagLayout) emailPanel.getLayout();
		gridBagLayout_3.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0};
		emailPanel.getInput().setEditable(false);
		GridBagConstraints gbc_emailPanel = new GridBagConstraints();
		gbc_emailPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_emailPanel.insets = new Insets(0, 0, 1, 1);
		gbc_emailPanel.gridx = 1;
		gbc_emailPanel.gridy = 3;
		add(emailPanel, gbc_emailPanel);

		// A field Panel with label and its associate textField
		websitePanel = new PanelField("Website");
		websitePanel.getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
		GridBagLayout gridBagLayout_4 = (GridBagLayout) websitePanel.getLayout();
		gridBagLayout_4.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0};
		websitePanel.getInput().setEditable(false);
		GridBagConstraints gbc_websitePanel = new GridBagConstraints();
		gbc_websitePanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_websitePanel.insets = new Insets(0, 0, 1, 1);
		gbc_websitePanel.gridx = 1;
		gbc_websitePanel.gridy = 4;
		add(websitePanel, gbc_websitePanel);
		
		//Zone logo
		JPanel panelLogo = new JPanel();
		GridBagConstraints gbc_panelLogo = new GridBagConstraints();
		gbc_panelLogo.anchor = GridBagConstraints.EAST;
		gbc_panelLogo.gridheight = 2;
		gbc_panelLogo.insets = new Insets(0, 0, 1, 1);
		gbc_panelLogo.gridx = 3;
		gbc_panelLogo.gridy = 1;
		add(panelLogo, gbc_panelLogo);
		GridBagLayout gbl_panelLogo = new GridBagLayout();
		gbl_panelLogo.columnWidths = new int[] { 2, 0, 0, 2, 0 };
		gbl_panelLogo.rowHeights = new int[] { 2, 23, 0, 2, 0 };
		gbl_panelLogo.columnWeights = new double[] { 1, 0.0, 0, 0, Double.MIN_VALUE };
		gbl_panelLogo.rowWeights = new double[] { 0, 0, 0, 0, Double.MIN_VALUE };
		panelLogo.setLayout(gbl_panelLogo);

		lblLogo = new JLabel("Logo");
		lblLogo.setSize(100, 100);
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.insets = new Insets(0, 0, 1, 1);
		gbc_lblLogo.gridx = 2;
		gbc_lblLogo.gridy = 1;
		panelLogo.add(lblLogo, gbc_lblLogo);

		btnModifier = new JButton("Modifier");
		btnModifier.setVisible(false);
		GridBagConstraints gbc_btnModifier = new GridBagConstraints();
		gbc_btnModifier.insets = new Insets(0, 0, 1, 1);
		gbc_btnModifier.gridx = 2;
		gbc_btnModifier.gridy = 2;
		panelLogo.add(btnModifier, gbc_btnModifier);

		// Panel SocialNetwork
		JPanel panelSocialNetwork = new JPanel();
		GridBagConstraints gbc_panelSocialNetwork = new GridBagConstraints();
		gbc_panelSocialNetwork.anchor = GridBagConstraints.EAST;
		gbc_panelSocialNetwork.gridheight = 3;
		gbc_panelSocialNetwork.insets = new Insets(1, 1, 1, 1);
		gbc_panelSocialNetwork.fill = GridBagConstraints.VERTICAL;
		gbc_panelSocialNetwork.gridx = 3;
		gbc_panelSocialNetwork.gridy = 3;
		add(panelSocialNetwork, gbc_panelSocialNetwork);
		GridBagLayout gbl_panelSocialNetwork = new GridBagLayout();
		gbl_panelSocialNetwork.columnWidths = new int[] { 2, 0, 5, 0, 2, 0 };
		gbl_panelSocialNetwork.rowHeights = new int[] { 2, 0, 1, 0, 2, 0 };
		gbl_panelSocialNetwork.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelSocialNetwork.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelSocialNetwork.setLayout(gbl_panelSocialNetwork);
		// Icone of the network (with link?)
		lblIcon = new JLabel("icon1");
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.anchor = GridBagConstraints.EAST;
		gbc_lblI.fill = GridBagConstraints.VERTICAL;
		gbc_lblI.insets = new Insets(0, 0, 1, 1);
		gbc_lblI.gridx = 1;
		gbc_lblI.gridy = 1;
		panelSocialNetwork.add(lblIcon, gbc_lblI);
		btnAjout = new JButton("Ajout");
		btnAjout.setVisible(false);
		GridBagConstraints gbc_btnAjout = new GridBagConstraints();
		gbc_btnAjout.fill = GridBagConstraints.BOTH;
		gbc_btnAjout.insets = new Insets(0, 0, 1, 1);
		gbc_btnAjout.gridx = 3;
		gbc_btnAjout.gridy = 1;
		panelSocialNetwork.add(btnAjout, gbc_btnAjout);
		textFieldNetwork = new JTextField();
		textFieldNetwork.setBorder(null);
		textFieldNetwork.setColumns(10);
		textFieldNetwork.setEditable(false);
		GridBagConstraints gbc_textFieldNetwork = new GridBagConstraints();
		gbc_textFieldNetwork.anchor = GridBagConstraints.EAST;
		gbc_textFieldNetwork.insets = new Insets(0, 0, 1, 1);
		gbc_textFieldNetwork.gridwidth = 3;
		gbc_textFieldNetwork.gridx = 1;
		gbc_textFieldNetwork.gridy = 3;
		panelSocialNetwork.add(textFieldNetwork, gbc_textFieldNetwork);


		// Panel for the user presentation
		JLabel lblPrsentation = new JLabel("Pr\u00E9sentation :");
		GridBagConstraints gbc_lblPrsentation = new GridBagConstraints();
		gbc_lblPrsentation.anchor = GridBagConstraints.WEST;
		gbc_lblPrsentation.insets = new Insets(1, 1, 1, 1);
		gbc_lblPrsentation.gridx = 1;
		gbc_lblPrsentation.gridy = 6;
		add(lblPrsentation, gbc_lblPrsentation);
		textAreaPresentation = new JTextArea();
		textAreaPresentation.setWrapStyleWord(true);
		textAreaPresentation.setLineWrap(true);
		textAreaPresentation.setBackground(UIManager.getColor("Panel.background"));
		textAreaPresentation.setEditable(false);
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 3;
		gbc_textArea.insets = new Insets(1, 1, 1, 1);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 7;
		add(textAreaPresentation, gbc_textArea);

		// Validation or Cancellation sections
		JPanel panelDecision = new JPanel();
		GridBagConstraints gbc_panelDecision = new GridBagConstraints();
		gbc_panelDecision.gridwidth = 3;
		gbc_panelDecision.insets = new Insets(0, 0, 1, 1);
		gbc_panelDecision.gridx = 1;
		gbc_panelDecision.gridy = 9;
		add(panelDecision, gbc_panelDecision);
		panelDecision.setLayout(new GridLayout(1, 0, 0, 0));
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setVisible(false);
		panelDecision.add(btnAnnuler);
		btnEditer = new JButton("Editer");
		panelDecision.add(btnEditer);
		btnValider = new JButton("Valider");
		btnValider.setVisible(false);
		panelDecision.add(btnValider);

	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.views.IVisibility#setMode(boolean)
	 */
	@Override
	public void setMode(boolean b) {
		this.getBtnEditer().setVisible(!b);
		this.getBtnAjout().setVisible(b);
		this.getBtnAnnuler().setVisible(b);
		this.getBtnModifier().setVisible(b);
		this.getBtnValider().setVisible(b);
		
		this.getNamePanel().setMode(b);
		this.getSiretPanel().setMode(b);
		this.getEmailPanel().setMode(b);
		this.getWebsitePanel().setMode(b);
		this.getTextAreaPresentation().setEditable(b);
		
		if(b) {
			this.getTextAreaPresentation().setBackground(UIManager.getColor("TextArea.background"));
			this.getTextAreaPresentation().setBorder(new TextFieldBorder());
		} else {
			this.getTextAreaPresentation().setBackground(UIManager.getColor("Panel.background"));
			this.getTextAreaPresentation().setBorder(new EmptyBorder(0, 0, 0, 0));
		}
	}

}
