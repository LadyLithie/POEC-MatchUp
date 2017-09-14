package fr.yas.matchup.views.panels;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import fr.yas.matchup.entities.Proposal;
import java.awt.FlowLayout;

public class PanelJobToMatch extends JPanel {
	private Proposal job;
	private JButton btnSeeMore;

	/**
	 * @return the job
	 */
	public Proposal getJob() {
		return job;
	}

	/**
	 * @return the btnSeeMore
	 */
	public JButton getBtnSeeMore() {
		return btnSeeMore;
	}

	/**
	 * Create the panel.
	 */
	public PanelJobToMatch(Proposal job) {
		this.job = job;
		JPanel panelMatch = new JPanel();
		panelMatch.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_panelMatch = new GridBagConstraints();
		gbc_panelMatch.insets = new Insets(5, 5, 5, 5);
		gbc_panelMatch.fill = GridBagConstraints.BOTH;
		gbc_panelMatch.gridx = 0;
		gbc_panelMatch.gridy = 0;
		add(panelMatch, gbc_panelMatch);
		
		JLabel lblJobProposal = new JLabel(job.getName());
		String shortResume;
		if (job.getPresentation().length() < 50) {
			shortResume = job.getPresentation();
		} else {
			shortResume = job.getPresentation().substring(0,50) + " ...";
		}
		panelMatch.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		lblJobProposal.setToolTipText(shortResume);
		panelMatch.add(lblJobProposal);
		
		btnSeeMore = new JButton("See more");
		panelMatch.add(btnSeeMore);
	}

}