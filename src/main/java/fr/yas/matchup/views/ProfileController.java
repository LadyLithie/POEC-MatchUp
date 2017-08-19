/**
 * 
 */
package fr.yas.matchup.views;

import javax.swing.JFrame;

import fr.yas.matchup.controllers.BaseController;
import fr.yas.matchup.views.ProfileView;

/**
 * @author Audrey
 *
 */
public class ProfileController extends BaseController {
	
	public ProfileController(JFrame frame) {
		super.frame = frame;
		super.view = new ProfileView(this.frame);
	}
}
