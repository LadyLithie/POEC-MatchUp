/**
 * 
 */
package fr.yas.matchup.controllers;

import javax.swing.JFrame;

import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.views.LoginView;

/**
 * @author Audrey
 *
 */
public class LoginController extends BaseController {
	private RegisteredUser user;

	public LoginController(JFrame frame) {
		super.frame = frame;
		super.view = new LoginView(this.frame);

	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
//		((HomeView) getView())
//		.getMenuBar().
//		getLblUserfirstname().
//		setText(
//				((User) this.viewDatas.get("currentUser")) //create a class of constants
//						.getFirstname()
//				);
		if (getViewDatas().get("newUser") != null) {
			this.user = (RegisteredUser) getViewDatas().get("newUser");
		}else if (getViewDatas().get("currentUser") != null) {
			this.user = (RegisteredUser) getViewDatas().get("currentUser");
		}
		
		if(user != null) {
			((LoginView) getView()).getTextFieldLogin().setText(this.user.getLogin());
			((LoginView) getView()).getTextFieldPwd().setText(this.user.getPassword());			
		}

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
