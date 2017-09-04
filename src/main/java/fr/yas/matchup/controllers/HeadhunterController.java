package fr.yas.matchup.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.jmx.snmp.UserAcl;

import fr.yas.matchup.database.HeadhunterDAO;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.views.LoginView;
import fr.yas.matchup.views.RegisterView;
import fr.yas.matchup.views.headhunter.HeadhunterView;



public class HeadhunterController extends BaseController {

	private Headhunter user;
	private ArrayList<Proposal> jobs = new ArrayList<>();
	private ArrayList<Enterprise> enterprises = new ArrayList<>();
	private ArrayList<String> phones = new ArrayList<>();
	private ArrayList<String> emails = new ArrayList<>();
	
	
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
		
		
		user = (Headhunter) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		HeadhunterView view = ((HeadhunterView) getView());
		
		view.getTextField_Firstname().setText(user.getFirstname());
		view.getTextField_Lastname().setText(user.getLastname());
		view.getTextField_Email().setText(user.getEmail());
		view.getTextField_Phone().setText(user.getPhone());
		view.getTextField_Linkedin().setText(user.getLinkedin());
		view.getTextField_Twitter().setText(user.getTwitter());
		view.getTextArea_Presentation().setText(user.getPresentation());
		
//		view.getTextArea_JobTitle().setText(user.getJobs().get(0).getName());
//		view.getTextArea_Presentation().setText(user.getJobs().get(0).getPresentation());
	
	
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
				view.getTextField_Lastname().setEditable(true);
				view.getTextField_Email().setEditable(true);
				view.getTextField_Phone().setEditable(true);
				view.getTextField_Linkedin().setEditable(true);
				view.getTextField_Twitter().setEditable(true);
				view.getTextArea_Presentation().setEditable(true);
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
				view.getTextArea_Presentation().setEditable(false);
				
			}
		});
		
		view.getBtnValider().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				user.setFirstname(view.getTextField_Firstname().getText());
				user.setLastname(view.getTextField_Lastname().getText());
				user.setEmail(view.getTextField_Email().getText());
				user.setPhone(view.getTextField_Phone().getText());
				user.setLinkedin(view.getTextField_Linkedin().getText());
				user.setTwitter(view.getTextField_Twitter().getText());
				
//				HeadhunterDAO hd = new HeadhunterDAO();
//				executeUpdate ("UPDATE headhunter SET " + hd.parseUpdateToString(user) + " WHERE " + hd.ID + " = " + (int)user.getId() + ";");
				
				view.getBtnAnnuler().setVisible(false);
				view.getBtnValider().setVisible(false);
				view.getBtnEditPresentation().setVisible(true);
				view.getTextField_Firstname().setEditable(false);
				view.getTextField_Lastname().setEditable(false);
				view.getTextField_Email().setEditable(false);
				view.getTextField_Phone().setEditable(false);
				view.getTextField_Linkedin().setEditable(false);
				view.getTextField_Twitter().setEditable(false);
				view.getTextArea_Presentation().setEditable(false);
				
				initView();
				
			}
		});
		
		view.getBtnEditJob().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ViewsManager.getInstance().next(new ProposalController(frame, jobs.get(0)));

				
			}
		});
		
		view.getBtnAddJob().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ViewsManager.getInstance().next(new ProposalController(frame));
			}
		});
	}
	
	
}
