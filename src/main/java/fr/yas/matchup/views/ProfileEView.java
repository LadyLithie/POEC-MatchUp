/**
 * 
 */
package fr.yas.matchup.views;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.yas.matchup.views.panels.PanelHeadhunters;
import fr.yas.matchup.views.panels.PanelListJobs;
import fr.yas.matchup.views.panels.PanelPresentation;



/**
 * @author Audrey
 *
 */
public class ProfileEView extends BaseView {
	private JPanel panel_left;
	private JPanel panel_TopRight;
	private JPanel panel_bottomRight;

	/**
	 * Panel listing all the jobs proposed by the Enterprise
	 * @return the panel_left
	 */
	public JPanel getPanel_left() {
		return panel_left;
	}

	/**
	 * Panel regrouping the Enterprise informations
	 * @return the panel_TopRight
	 */
	public JPanel getPanel_TopRight() {
		return panel_TopRight;
	}

	/**
	 * Panel listing all collaborating head-hunters
	 * @return the panel_bottomRight
	 */
	public JPanel getPanel_bottomRight() {
		return panel_bottomRight;
	}

	/**
	 * @param panel_bottomRight the panel_bottomRight to set
	 */
	public void setPanel_bottomRight(JPanel panel_bottomRight) {
		this.panel_bottomRight = panel_bottomRight;
	}

	/**
	 * Create the frame.
	 */
	public ProfileEView(JFrame frame) {
		super.pageName = "Profile";
		JPanel panel = new JPanel();
		super.contentPane = panel;
		
		//Define the general layout for the whole frame
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{5, 0, 5, 0, 5, 0};
		gbl_panel.rowHeights = new int[]{5, 0, 5, 0, 5, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		//Add a big unique panel on the left side 
		panel_left = new PanelListJobs();
		GridBagConstraints gbc_panel_left = new GridBagConstraints();
		gbc_panel_left.gridheight = 3;
		gbc_panel_left.insets = new Insets(0, 0, 5, 5);
		gbc_panel_left.fill = GridBagConstraints.BOTH;
		gbc_panel_left.gridx = 1;
		gbc_panel_left.gridy = 1;
		panel_left.setMinimumSize(new Dimension(250, 200));
		panel.add(panel_left, gbc_panel_left);
		
		//Add a panel on the top right
		panel_TopRight = new PanelPresentation();
		GridBagConstraints gbc_panel_TopRight = new GridBagConstraints();
		gbc_panel_TopRight.insets = new Insets(0, 0, 5, 5);
		gbc_panel_TopRight.fill = GridBagConstraints.BOTH;
		gbc_panel_TopRight.gridx = 3;
		gbc_panel_TopRight.gridy = 1;
		panel_TopRight.setMinimumSize(new Dimension(300, 100));
		panel.add(panel_TopRight, gbc_panel_TopRight);
		
		//Add a panel on the bottom right
		panel_bottomRight = new PanelHeadhunters(new ArrayList<>());
		GridBagConstraints gbc_panel_bottomRight = new GridBagConstraints();
		gbc_panel_bottomRight.insets = new Insets(0, 0, 5, 5);
		gbc_panel_bottomRight.fill = GridBagConstraints.BOTH;
		gbc_panel_bottomRight.gridx = 3;
		gbc_panel_bottomRight.gridy = 3;
		panel_bottomRight.setMinimumSize(new Dimension(300, 50));
		panel.add(panel_bottomRight, gbc_panel_bottomRight);

	}

}
