/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.views.ProfileEView;
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
		//user = (Enterprise) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
	}

	/* (non-Javadoc)
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
		if(user.getSiretNumber() != 0)
			vP.getSiretPanel().getInput().setText(String.valueOf(user.getSiretNumber()));
		vP.getTextAreaPresentation().setText(user.getPresentation());

	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.controllers.BaseController#initEvent()
	 */
	@Override
	public void initEvent() {
		ProfileEView v = (ProfileEView) super.view;
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();
		
		vPresentation.getBtnEditer().addActionListener(new EditListener());
	}
	
	/**
	 * Intern class listening to BtnEditer of the PanelPresentation
	 * @author Audrey
	 *
	 */
	class EditListener implements ActionListener {
		ProfileEView v = (ProfileEView) view;
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			vPresentation.getBtnEditer().setVisible(false);
			vPresentation.getBtnAjout().setVisible(true);
			vPresentation.getBtnAnnuler().setVisible(true);
			vPresentation.getBtnModifier().setVisible(true);
			vPresentation.getBtnValider().setVisible(true);
			
			vPresentation.getNamePanel().getInput().setEditable(true);
			vPresentation.getNamePanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getSiretPanel().getInput().setEditable(true);
			vPresentation.getSiretPanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getEmailPanel().getInput().setEditable(true);
			vPresentation.getEmailPanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getWebsitePanel().getInput().setEditable(true);
			vPresentation.getWebsitePanel().getInput().setBorder(new TextFieldBorder());

			vPresentation.getTextAreaPresentation().setEditable(true);
			vPresentation.getTextAreaPresentation().setBackground(UIManager.getColor("TextArea.background"));
			vPresentation.getTextAreaPresentation().setBorder(new TextFieldBorder());
		}
	}
}
