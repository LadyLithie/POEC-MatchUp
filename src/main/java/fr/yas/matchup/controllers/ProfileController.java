/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.views.ProfileEView;
import fr.yas.matchup.views.panels.PanelHeadhunters;
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

	/*
	 * (non-Javadoc)
	 * 
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
		vP.getSiretPanel().getInput().setText(user.getSiretNumber());
		vP.getTextAreaPresentation().setText(user.getPresentation());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		ProfileEView v = (ProfileEView) super.view;
		
		/* Panel Presentation
		 * Define the action on the buttons
		 */
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();
		//mode view
		vPresentation.getBtnEditer().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vPresentation.setMode(true);
			}
		});
		//Mode modification
		vPresentation.getBtnValider().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vPresentation.setMode(false);
				user.setName(vPresentation.getNamePanel().getInput().getText());
				if(!user.setSiretNumber(vPresentation.getSiretPanel().getInput().getText()))
					vPresentation.getSiretPanel().getInput().setText(user.getSiretNumber());;
				user.setWebsite(vPresentation.getWebsitePanel().getInput().getText());
				user.setPresentation(vPresentation.getTextAreaPresentation().getText());
			}
		});
		vPresentation.getBtnAnnuler().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vPresentation.setMode(false);
				vPresentation.getNamePanel().getInput().setText(user.getName());
				vPresentation.getSiretPanel().getInput().setText(user.getSiretNumber());
				vPresentation.getWebsitePanel().getInput().setText(user.getWebsite());
				vPresentation.getTextAreaPresentation().setText(user.getPresentation());
			}
		});
		
		/* Panel Head-hunters
		 * Define the action on the buttons
		 */
		PanelHeadhunters vHeadhunters = (PanelHeadhunters) v.getPanel_bottomRight();
		vHeadhunters.getBtnEdit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(vHeadhunters.getBtnEdit().getText() == "Editer") 
					vHeadhunters.setMode(true);
				else //missing register change
					vHeadhunters.setMode(false);
				
			}
		});
		vHeadhunters.getBtnAnnuler().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vHeadhunters.setMode(false);
				//need to add re-initialization of panel
			}
		});
	}
}
