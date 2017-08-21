/**
 * 
 */
package fr.yas.matchup.views.panels;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;

/**
 * @author Audrey
 *
 */
public class Panel2FieldButton extends JPanel {
	private JLabel label;
	private JButton button;

	/**
	 * Create the panel with a label follow by 2 textfield and, optionally, a button
	 * 
	 * @param label
	 *            = header label
	 * @param button
	 *            with its label. Can be an empty string if we don't want one
	 */
	public Panel2FieldButton(String label, String button) {
		if(!label.isEmpty()) {
			// layout of 1 line with surrounding padding
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[] { 10, 0, 5, 0, 0, 5, 0, 10, 0 };
			gridBagLayout.rowHeights = new int[] { 5, 0, 5, 0 };
			gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
			gridBagLayout.rowWeights = new double[] { 1, 0.0, 1, Double.MIN_VALUE };
			setLayout(gridBagLayout);

			this.label = new JLabel(label);
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.anchor = GridBagConstraints.WEST;
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 1;
			gbc_label.gridy = 1;
			add(this.label, gbc_label);

			JTextField textField1 = new JTextField();
			textField1.setToolTipText("Pr\u00E9nom");
			textField1.setColumns(10);
			GridBagConstraints gbc_textField1 = new GridBagConstraints();
			gbc_textField1.gridy = 1;
			gbc_textField1.insets = new Insets(0, 0, 5, 5);
			gbc_textField1.gridx = 3;
			add(textField1, gbc_textField1);

			JTextField textField2 = new JTextField();
			textField2.setText("Nom");
			textField2.setColumns(10);
			GridBagConstraints gbc_textField2 = new GridBagConstraints();
			gbc_textField2.insets = new Insets(0, 0, 5, 5);
			gbc_textField2.gridx = 4;
			gbc_textField2.gridy = 1;
			add(textField2, gbc_textField2);

			if (!button.isEmpty()) {
				this.button = new JButton(button);
				GridBagConstraints gbc_btnButton = new GridBagConstraints();
				gbc_btnButton.anchor = GridBagConstraints.EAST;
				gbc_btnButton.insets = new Insets(0, 0, 5, 5);
				gbc_btnButton.gridx = 6;
				gbc_btnButton.gridy = 1;
				add(this.button, gbc_btnButton);
			}			
		}

	}

}
