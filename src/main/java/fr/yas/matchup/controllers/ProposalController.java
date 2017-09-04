package fr.yas.matchup.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.views.headhunter.ProposalView;
import fr.yas.matchup.views.professionalMatching.MatchingProView;

public class ProposalController extends BaseController {

	private Enterprise enterprise;
	private Headhunter headhunter;
	private ArrayList<Skill> JobSkill = new ArrayList<>();
	
	public ProposalController (JFrame frame) {
		
		super.frame = frame;
		super.view = new MatchingProView(this.frame);
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		
		ProposalView view = (ProposalView) super.view;
		
		view.getBtnCancel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ViewsManager.getInstance().next(new HeadhunterController(frame));
				
			}
		});
		
		view.getBtnProposalCreation().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
	}
	
	
}
