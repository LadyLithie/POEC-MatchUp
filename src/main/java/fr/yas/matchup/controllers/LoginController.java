/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.views.LoginView;
import fr.yas.matchup.controllers.ViewsDatasTerms;

/**
 * @author Audrey
 *
 */
public class LoginController extends BaseController {
	private RegisteredUser user;

	/**
	 * Basic constructor
	 * @param frame
	 */
	public LoginController(JFrame frame) {
		super.frame = frame;
		super.view = new LoginView(this.frame);
	}

	/**
	 * Constructor with data transfer
	 * @param frame
	 * @param newUser
	 */
	public LoginController(JFrame frame, RegisteredUser newUser) {
		this.user = newUser;
		super.frame = frame;
		super.view = new LoginView(this.frame);
	}
	
	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
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
		LoginView view = (LoginView) super.view;
		
		// Connect and go to Profile
		view.getBtnLogin().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (view.getTextFieldLogin().getText().isEmpty() || view.getTextFieldPwd().getText().isEmpty()) {
					if (view.getTextFieldPwd().getText().isEmpty()) {
						view.getTextFieldPwd().setBackground(Color.PINK);
					}else {
						view.getTextFieldPwd().setBackground(Color.WHITE);
					}
					if (view.getTextFieldLogin().getText().isEmpty()) {
						view.getTextFieldLogin().setBackground(Color.PINK);
					} else {
						view.getTextFieldLogin().setBackground(Color.WHITE);
					}
				}else
					//version with hard value for user
					//normal version must consult the database for a user with those datas
					if(view.getTextFieldLogin().getText().equals(user.getLogin()) && user.getPassword().equals(view.getTextFieldPwd().getText())) {
						switch (user.getClass().getSimpleName()) {
						case "Enterprise":
							ViewsManager.getInstance().next(new ProfileController(frame));
							break;
						case "Candidate":
							
							break;
						case "Headhunter":
							
							break;						
						default:
							break;
						}
					}
				
			}
		});
		
		// Go to Register
		view.getBtnRegister().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().next(new RegisterController(frame));
			}
		});

	}

	@Override
	public void setupDatas() {
		this.viewDatas.put(ViewsDatasTerms.CURRENT_USER, user);
	}	
}
