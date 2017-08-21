/**
 * 
 */
package fr.yas.matchup.views.panels;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import javafx.scene.layout.Border;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

/**
 * @author Audrey
 *
 */
public class PanelResumeJob extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelResumeJob(String title, String shortResume, String location) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 50, 10, 0};
		gridBagLayout.rowHeights = new int[]{0, 10, 50, 10, 0, 0, 10, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblTitreDuPoste = new JLabel(title);
		GridBagConstraints gbc_lblTitreDuPoste = new GridBagConstraints();
		gbc_lblTitreDuPoste.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitreDuPoste.gridx = 1;
		gbc_lblTitreDuPoste.gridy = 0;
		add(lblTitreDuPoste, gbc_lblTitreDuPoste);
		
		JTextPane txtpnPresentation = new JTextPane();
		txtpnPresentation.setText(shortResume);
		txtpnPresentation.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_txtpnPresentation = new GridBagConstraints();
		gbc_txtpnPresentation.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnPresentation.fill = GridBagConstraints.BOTH;
		gbc_txtpnPresentation.gridx = 1;
		gbc_txtpnPresentation.gridy = 2;
		add(txtpnPresentation, gbc_txtpnPresentation);
		
		JLabel lblLocalisation = new JLabel("Localisation");
		GridBagConstraints gbc_lblLocalisation = new GridBagConstraints();
		gbc_lblLocalisation.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalisation.gridx = 1;
		gbc_lblLocalisation.gridy = 4;
		add(lblLocalisation, gbc_lblLocalisation);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setText(location);
		textField.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 5;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnEditer = new JButton("Editer");
		GridBagConstraints gbc_btnEditer = new GridBagConstraints();
		gbc_btnEditer.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditer.gridx = 1;
		gbc_btnEditer.gridy = 7;
		add(btnEditer, gbc_btnEditer);

	}

}
