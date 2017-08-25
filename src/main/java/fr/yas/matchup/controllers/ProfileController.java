/**
 * 
 */
package fr.yas.matchup.controllers;

import javax.swing.JFrame;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.views.ProfileEView;
import fr.yas.matchup.views.panels.PanelPresentation;

/**
 * @author Audrey
 *
 */
public class ProfileController extends BaseController {
	Enterprise user;
	
	/**
	 * 
	 * @param frame
	 */
	public ProfileController(JFrame frame) {
		super.frame = frame;
		super.view = new ProfileEView(this.frame);
		user = (Enterprise) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		user = (Enterprise) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		ProfileEView v = (ProfileEView) getView();
		PanelPresentation vP = ((PanelPresentation) v.getPanel_TopRight());
		
		vP.getNamePanel().getInput().setText(user.getName());
		vP.getEmailPanel().getInput().setText(user.getEmail());
		vP.getWebsitePanel().getInput().setText(user.getWebsite());
		if(user.getSiretNumber() != 0)
			vP.getSiretPanel().getInput().setText(String.valueOf(user.getSiretNumber()));
		vP.getTextAreaPresentation().setText(user.getPresentation());

	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		// TODO Auto-generated method stub
		super.initEvent();
	}
	
	
}
