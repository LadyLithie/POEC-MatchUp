/**
 * 
 */
package fr.yas.matchup.controllers;

import javax.swing.JFrame;

import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.views.LoginView;
import fr.yas.matchup.views.RegisterView;

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
	
}
