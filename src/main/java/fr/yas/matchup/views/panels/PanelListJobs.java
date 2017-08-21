/**
 * 
 */
package fr.yas.matchup.views.panels;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;

/**
 * @author Audrey
 *
 */
public class PanelListJobs extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelListJobs() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{43, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		setBorder(new LineBorder(new Color(0, 0, 0)));
		
		//Title part
		JPanel panelTitle = new JPanel();
		GridBagConstraints gbc_panelTitle = new GridBagConstraints();
		gbc_panelTitle.insets = new Insets(0, 0, 5, 0);
		gbc_panelTitle.fill = GridBagConstraints.BOTH;
		gbc_panelTitle.gridx = 0;
		gbc_panelTitle.gridy = 0;
		add(panelTitle, gbc_panelTitle);
		GridBagLayout gbl_panelTitle = new GridBagLayout();
		gbl_panelTitle.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelTitle.rowHeights = new int[]{0, 0};
		gbl_panelTitle.columnWeights = new double[]{0.0, 1, 0.0, Double.MIN_VALUE};
		gbl_panelTitle.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelTitle.setLayout(gbl_panelTitle);
		
		JLabel lbllTitle = new JLabel("Liste des postes proposés");
		GridBagConstraints gbc_lbllTitle = new GridBagConstraints();
		gbc_lbllTitle.insets = new Insets(5, 5, 5, 5);
		gbc_lbllTitle.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbllTitle.gridx = 0;
		gbc_lbllTitle.gridy = 0;
		panelTitle.add(lbllTitle, gbc_lbllTitle);
		
		JButton btnAdd = new JButton("Ajouter");
		btnAdd.setToolTipText("Cr\u00E9er un nouveau poste \u00E0 proposer");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.anchor = GridBagConstraints.EAST;
		gbc_btnAdd.gridx = 2;
		gbc_btnAdd.gridy = 0;
		panelTitle.add(btnAdd, gbc_btnAdd);
		
		//main part
		JPanel panelJobs = new JPanel();
		GridBagConstraints gbc_panelJobs = new GridBagConstraints();
		gbc_panelJobs.fill = GridBagConstraints.VERTICAL;
		gbc_panelJobs.anchor = GridBagConstraints.WEST;
		gbc_panelJobs.gridx = 0;
		gbc_panelJobs.gridy = 1;
		add(panelJobs, gbc_panelJobs);
		panelJobs.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		
		//Dynamically added jobs
		for (int i = 0; i < 3; i++) {
			PanelResumeJob job = new PanelResumeJob("titre", "Courte présentation", "Ville");
			GridBagConstraints gbc_job = new GridBagConstraints();
			gbc_job.anchor = GridBagConstraints.BASELINE_LEADING;
			panelJobs.add(job, gbc_job);
		}


	}

}
