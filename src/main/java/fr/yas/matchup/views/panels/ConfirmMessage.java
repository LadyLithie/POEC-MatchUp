package fr.yas.matchup.views.panels;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

public class ConfirmMessage extends JPanel {

	private JButton okButton;
	private JButton cancelButton;
	private JPanel panel;
	private JLabel lblNom;
	private JTextField tF_Name;
	private JLabel lblType;
	private JTextField tF_Type;

	/**
	 * @return the okButton
	 */
	public JButton getOkButton() {
		return okButton;
	}

	/**
	 * @return the cancelButton
	 */
	public JButton getCancelButton() {
		return cancelButton;
	}

	/**
	 * Create the panel.
	 */
	public ConfirmMessage() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(buttonPane, BorderLayout.SOUTH);
		// getRootPane().setDefaultButton(okButton);

		cancelButton = new JButton("Annuler");
		cancelButton.setActionCommand("Non");
		buttonPane.add(cancelButton);
		
				okButton = new JButton("Valider");
				okButton.setActionCommand("Valider");
				buttonPane.add(okButton);
		
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNom = new JLabel("Nom :");
		GridBagConstraints gbc_lblNom = new GridBagConstraints();
		gbc_lblNom.insets = new Insets(0, 0, 5, 5);
		gbc_lblNom.gridx = 1;
		gbc_lblNom.gridy = 1;
		panel.add(lblNom, gbc_lblNom);
		
		tF_Name = new JTextField();
		GridBagConstraints gbc_tF_Name = new GridBagConstraints();
		gbc_tF_Name.insets = new Insets(0, 0, 5, 0);
		gbc_tF_Name.fill = GridBagConstraints.BOTH;
		gbc_tF_Name.gridx = 3;
		gbc_tF_Name.gridy = 1;
		panel.add(tF_Name, gbc_tF_Name);
		tF_Name.setColumns(10);
		
		lblType = new JLabel("Type :");
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 1;
		gbc_lblType.gridy = 3;
		panel.add(lblType, gbc_lblType);
		
		tF_Type = new JTextField();
		GridBagConstraints gbc_tF_Type = new GridBagConstraints();
		gbc_tF_Type.insets = new Insets(0, 0, 5, 0);
		gbc_tF_Type.fill = GridBagConstraints.HORIZONTAL;
		gbc_tF_Type.gridx = 3;
		gbc_tF_Type.gridy = 3;
		panel.add(tF_Type, gbc_tF_Type);
		tF_Type.setColumns(10);

	}
}
