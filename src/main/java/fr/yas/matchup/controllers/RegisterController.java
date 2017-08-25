/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;

import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.managers.ViewsManager;
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


	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {

		RegisterView view = (RegisterView) super.view;
		view.getBtnValider().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!getValidRegister(view)) {
					user = null;
				}else {
					System.out.println("Utilisateur enregistr�");
					ViewsManager.getInstance().next(new LoginController(frame,user));
				}
			}
		});
		
		view.getBtnAnnuler().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ViewsManager.getInstance().next(new LoginController(frame));
			}
		});
	}
	
	@Override
	public void setupDatas() {
		this.viewDatas.put("newUser", user);
		}

	/**
	 * Test that each field 
	 * @param view
	 * @return
	 */
	private boolean getValidRegister(RegisterView view) {
		// test validity of the password
		boolean valid = true;
		String pwd = new String(view.getPwdField().getPassword());
		if (pwd.equals(new String(view.getPwdVerifField().getPassword()))) {

			// Same password, we create the user depending on the type selected
			if (view.getRdbtnCandidat().isSelected()) {
				System.out.println("Candidat");
				user = new Candidate();
				user.setLogin(view.getLogin().getInput().getText());
				user.setEmail(view.getEmail().getInput().getText());
				user.setPassword(pwd);
			} else if (view.getRdbtnEntreprise().isSelected()) {
				System.out.println("Entreprise");
				user = new Enterprise();
				user.setLogin(view.getLogin().getInput().getText());
				user.setEmail(view.getEmail().getInput().getText());
				user.setPassword(pwd);
			} else if (view.getRdbtnRecruteur().isSelected()) {
				System.out.println("Recruteur");
				user = new Headhunter();
				user.setLogin(view.getLogin().getInput().getText());
				user.setEmail(view.getEmail().getInput().getText());
				user.setPassword(pwd);
			} else {
				System.out.println("choisissez un type d'utilisateur");
			}
			System.out.println(user.toString());

			// Login test
			if (user.getLogin().isEmpty()) {
				view.getLogin().getInput().setBackground(Color.PINK);
				valid = false;
			} else {
				view.getLogin().getInput().setBackground(Color.WHITE);
			}
			// Email test
			Pattern pattern = Pattern.compile(
					"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
			Matcher matcher = pattern.matcher(user.getEmail());
			System.out.println(matcher.matches());
			if (user.getEmail().isEmpty() && !matcher.matches()) {
				view.getEmail().getInput().setBackground(Color.PINK);
				valid = false;
			} else {
				view.getLogin().getInput().setBackground(Color.WHITE);
			}
		} else {
			System.out.println("error password");
			valid = false;

		}
		return valid;

	}
}
