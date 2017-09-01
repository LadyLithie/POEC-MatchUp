package fr.yas.matchup.views.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Scrollable;
import java.awt.GridLayout;

public class PanelJobs extends JPanel {
	private List<PanelResumeJob> resumeJobs;

	/**
	 * @return the resumeJobs
	 */
	public List<PanelResumeJob> getResumeJobs() {
		return resumeJobs;
	}

	/**
	 * Create the panel.
	 */
	public PanelJobs() {
		setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		GridBagConstraints gbc_panelJobs = new GridBagConstraints();
		gbc_panelJobs.fill = GridBagConstraints.ABOVE_BASELINE_LEADING;
//		gbc_panelJobs.anchor = GridBagConstraints.WEST;
//		setLayout(new FlowLayout(FlowLayout., 2, 2));
		
		//Dynamically added jobs
		resumeJobs = new ArrayList<PanelResumeJob>();
		for (int i = 0; i < 3; i++) {
			PanelResumeJob job = new PanelResumeJob("titre", "Courte présentation\n"
					+ "blablablzablg"
					+ "fgtrtreh", "Ville");
			job.setPreferredSize(new Dimension(150, 200));
			GridBagConstraints gbc_job = new GridBagConstraints();
			gbc_job.anchor = GridBagConstraints.NORTHEAST;
			add(job, gbc_job);
//			add(job);
			this.getResumeJobs().add(job);
		}
	}
}
