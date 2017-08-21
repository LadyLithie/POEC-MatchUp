/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JFrame;

import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.views.RegisterView;


/**
 * @author Audrey
 *
 */
public class RegisterController extends BaseController {
	private RegisteredUser user;
	
	public RegisterController(JFrame frame) {
		super.frame = frame;
		super.view = new RegisterView(this.frame);
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#setViewDatas(java.util.Map)
	 */
	@Override
	public void setViewDatas(Map<String, Object> viewDatas) {
		// TODO Auto-generated method stub
		super.setViewDatas(viewDatas);
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		// TODO Auto-generated method stub

		RegisterView view = (RegisterView) super.view;
		view.getBtnValider().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}


	}
	
	
//	btnValider.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//		}
//	});
}
