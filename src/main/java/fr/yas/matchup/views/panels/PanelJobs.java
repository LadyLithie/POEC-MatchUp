package fr.yas.matchup.views.panels;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.Scrollable;

public class PanelJobs extends JPanel implements Scrollable {

	/**
	 * Create the panel.
	 */
	public PanelJobs() {
		GridBagConstraints gbc_panelJobs = new GridBagConstraints();
		gbc_panelJobs.fill = GridBagConstraints.VERTICAL;
//		gbc_panelJobs.anchor = GridBagConstraints.WEST;
		setLayout(new FlowLayout(FlowLayout.LEADING, 2, 2));
		
		//Dynamically added jobs
		for (int i = 0; i < 3; i++) {
			PanelResumeJob job = new PanelResumeJob("titre", "Courte présentation\n"
					+ "blablablzablg"
					+ "fgtrtreh", "Ville");
			GridBagConstraints gbc_job = new GridBagConstraints();
			gbc_job.anchor = GridBagConstraints.BASELINE_LEADING;
			add(job, gbc_job);
		}

	}

	@Override
	public Dimension getPreferredScrollableViewportSize() {
		// TODO Auto-generated method stub
		return getPreferredSize();
	}

	@Override
	public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getScrollableTracksViewportWidth() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean getScrollableTracksViewportHeight() {
		// TODO Auto-generated method stub
		return false;
	}

}
