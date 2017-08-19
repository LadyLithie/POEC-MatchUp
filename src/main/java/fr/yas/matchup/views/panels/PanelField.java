/**
 * 
 */
package fr.yas.matchup.views.panels;

import java.awt.TextField;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

/**
 * @author Audrey
 *
 */
public class PanelField extends JPanel {
	private JLabel label;
	private JTextField input;

	/**
	 * Create the panel.
	 */
	public PanelField(String label) {
		if (!label.isEmpty()) {
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[] { 5, 0, 0, 0, 5, 0 };
			gridBagLayout.rowHeights = new int[] { 5, 0, 5, 0 };
			gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
			setLayout(gridBagLayout);

			this.label = new JLabel(label);
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			add(this.label, gbc_lblNewLabel);

			input = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.anchor = GridBagConstraints.WEST;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.gridx = 3;
			gbc_textField.gridy = 1;
			add(input, gbc_textField);
			input.setColumns(10);
		}

	}

}