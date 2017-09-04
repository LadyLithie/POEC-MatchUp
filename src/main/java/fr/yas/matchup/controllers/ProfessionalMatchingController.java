package fr.yas.matchup.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.views.CandidateView;
import fr.yas.matchup.views.ProfessionalMatchingView;

public class ProfessionalMatchingController extends BaseController{

	public ProfessionalMatchingController(){
		
		super.frame = frame;
		super.view = new ProfessionalMatchingView(frame);
		
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		// TODO Auto-generated method stub
		super.initView();
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		ProfessionalMatchingView view = (ProfessionalMatchingView) super.view;
		// TODO Auto-generated method stub
		view.getMenuBar().getNavigationBar().getBtnGoToProfil().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ViewsManager.getInstance().next(new CandidateController(frame));
			}
		});
		
	}
	
	
}
