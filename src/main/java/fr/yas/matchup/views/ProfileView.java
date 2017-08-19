/**
 * 
 */
package fr.yas.matchup.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gbl_panel);
		
		//Add a big unique panel on the left side
		JPanel panel_left = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		getContentPane().add(panel_left, gbc_panel_1);
		//test of preview
		JLabel lblTest = new JLabel("test");
		panel_left.add(lblTest);

		//Add a panel on the top right
		JPanel panel_topRight = new PanelPresentation();
		GridBagConstraints gbc_panel_tr = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		getContentPane().add(panel_topRight, gbc_panel_tr);		
		//test of preview
		JLabel lblTestTR = new JLabel("test");
		panel_topRight.add(lblTestTR);
		
		//Add a panel on the bottom right
		JPanel panel_bottomRight = new PanelHeadhunters();
		GridBagConstraints gbc_panel_br = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		getContentPane().add(panel_bottomRight, gbc_panel_br);				
		//test of preview
//		JLabel lblTestBR = new JLabel("test");
//		panel_bottomRight.add(lblTestBR);

	}

}
