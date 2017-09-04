package fr.yas.matchup.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.views.LoginView;
import fr.yas.matchup.views.RegisterView;
import fr.yas.matchup.views.headhunter.HeadhunterView;
import fr.yas.matchup.views.panels.PanelHeadhunters;
import fr.yas.matchup.views.panels.PanelPresentation;


public class HeadhunterController extends BaseController {

	private Headhunter user;
	private ArrayList<Enterprise> enterprises = new ArrayList<>(); 
	
	public HeadhunterController (JFrame frame) {
		super.frame = frame;
		super.view = new HeadhunterView(this.frame);
		user = (Headhunter) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
	}
	
	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	
	@Override
	public void initView() {
		//super.initView();
		
		user = (Headhunter) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		HeadhunterView view = ((HeadhunterView) getView());
		/*
		view.getTextField_Firstname().setText(user.getFirstname());
		view.getTextField_Lastname().setText(user.getLastname());
		//view.getTextField_Email().setText(user.getEmails());
		view.getTextField_Phone().setText(user.getPhone());
		view.getTextField_Linkedin().setText(user.getLinkedin());
		view.getTextField_Twitter().setText(user.getTwitter());
		view.getTextArea_Presentation().setText(user.getPresentation());
		*/
	
	
	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	}
		
	@Override
	public void initEvent() {
		
		HeadhunterView view = (HeadhunterView) super.view;
		
		
		view.getBtnEditPresentation().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				view.getBtnAnnuler().setVisible(true);
				view.getBtnValider().setVisible(true);
				view.getBtnEditPresentation().setVisible(false);
				view.getTextField_Firstname().setEditable(true);
				view.getTextField_Lastname().setEditable(false);
				view.getTextField_Email().setEditable(true);
				view.getTextField_Phone().setEditable(true);
				view.getTextField_Linkedin().setEditable(true);
				view.getTextField_Twitter().setEditable(true);
			}
		});
		
		view.getBtnAnnuler().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				initView();
				
				view.getBtnAnnuler().setVisible(false);
				view.getBtnValider().setVisible(false);
				view.getBtnEditPresentation().setVisible(true);
				view.getTextField_Firstname().setEditable(false);
				view.getTextField_Lastname().setEditable(false);
				view.getTextField_Email().setEditable(false);
				view.getTextField_Phone().setEditable(false);
				view.getTextField_Linkedin().setEditable(false);
				view.getTextField_Twitter().setEditable(false);
				
			}
		});
		
		view.getBtnValider().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				user.setFirstname(view.getTextField_Firstname().toString());
				user.setLastname(view.getTextField_Lastname().toString());
				//user.setEmails(emails);
				//user.setPhones(phones);
				user.setLinkedin(view.getTextField_Linkedin().toString());
				user.setTwitter(view.getTextField_Twitter().toString());
				
				view.getBtnAnnuler().setVisible(false);
				view.getBtnValider().setVisible(false);
				view.getBtnEditPresentation().setVisible(true);
				view.getTextField_Firstname().setEditable(false);
				view.getTextField_Lastname().setEditable(false);
				view.getTextField_Email().setEditable(false);
				view.getTextField_Phone().setEditable(false);
				view.getTextField_Linkedin().setEditable(false);
				view.getTextField_Twitter().setEditable(false);
				
			}
		});
		
		view.getBtnEditJob().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ViewsManager.getInstance().next(new ProposalController(frame));

				
			}
		});
	}
	
	
}
