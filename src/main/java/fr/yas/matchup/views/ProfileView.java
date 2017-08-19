/**
 * 
 */
package fr.yas.matchup.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.yas.matchup.views.panels.PanelHeadhunters;
import fr.yas.matchup.views.panels.PanelPresentation;



/**
 * @author Audrey
 *
 */
public class ProfileView extends BaseView {

	/**
	 * Create the frame.
	 */
	public ProfileView(JFrame frame) {
		super.pageName = "Profile";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		//Define the general layout for the whole frame
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{10, 0, 10, 0, 10, 0};
		gbl_panel.rowHeights = new int[]{10, 0, 10, 0, 10, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		//Add a big unique panel on the left side
		JPanel panel_left = new JPanel();
		GridBagConstraints gbc_panel_left = new GridBagConstraints();
		gbc_panel_left.gridheight = 3;
		gbc_panel_left.insets = new Insets(0, 0, 5, 5);
		gbc_panel_left.fill = GridBagConstraints.BOTH;
		gbc_panel_left.gridx = 1;
		gbc_panel_left.gridy = 1;
		panel.add(panel_left, gbc_panel_left);
		
		//Add a panel on the top right
		JPanel panel_TopRight = new PanelPresentation();
		GridBagConstraints gbc_panel_TopRight = new GridBagConstraints();
		gbc_panel_TopRight.insets = new Insets(0, 0, 5, 5);
		gbc_panel_TopRight.fill = GridBagConstraints.BOTH;
		gbc_panel_TopRight.gridx = 3;
		gbc_panel_TopRight.gridy = 1;
		panel.add(panel_TopRight, gbc_panel_TopRight);
		
		//Add a panel on the bottom right
		JPanel panel_bottomRight = new PanelHeadhunters();
		GridBagConstraints gbc_panel_bottomRight = new GridBagConstraints();
		gbc_panel_bottomRight.insets = new Insets(0, 0, 5, 5);
		gbc_panel_bottomRight.fill = GridBagConstraints.BOTH;
		gbc_panel_bottomRight.gridx = 3;
		gbc_panel_bottomRight.gridy = 3;
		panel.add(panel_bottomRight, gbc_panel_bottomRight);

	}

}
