/**
 * 
 */
package fr.yas.matchup.controllers;

import javax.swing.JFrame;

import fr.yas.matchup.views.ProfileEView;

/**
 * @author Audrey
 *
 */
public class ProfileController extends BaseController {
	
	public ProfileController(JFrame frame) {
		super.frame = frame;
		super.view = new ProfileEView(this.frame);
	}
}
