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
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();

		vPresentation.getBtnEditer().addActionListener(new EditListener());
		vPresentation.getBtnValider().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisiblePresentation(false);
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
				setVisiblePresentation(false);
				vPresentation.getNamePanel().getInput().setText(user.getName());
				vPresentation.getSiretPanel().getInput().setText(String.valueOf(user.getSiretNumber()));
				vPresentation.getWebsitePanel().getInput().setText(user.getWebsite());
				vPresentation.getTextAreaPresentation().setText(user.getPresentation());
			}
		});
	}

	/**
	 * Intern class listening to BtnEditer of the PanelPresentation
	 * 
	 * @author Audrey
	 *
	 */
	class EditListener implements ActionListener {
		ProfileEView v = (ProfileEView) view;
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisiblePresentation(true);

		}
	}

	
	private void setVisiblePresentation(boolean b) {
		ProfileEView v = (ProfileEView) view;
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();

		vPresentation.getBtnEditer().setVisible(!b);
		vPresentation.getBtnAjout().setVisible(b);
		vPresentation.getBtnAnnuler().setVisible(b);
		vPresentation.getBtnModifier().setVisible(b);
		vPresentation.getBtnValider().setVisible(b);	
		vPresentation.getNamePanel().getInput().setEditable(b);
		vPresentation.getSiretPanel().getInput().setEditable(b);
		vPresentation.getEmailPanel().getInput().setEditable(b);
		vPresentation.getWebsitePanel().getInput().setEditable(b);
		vPresentation.getTextAreaPresentation().setEditable(b);
		
		if(b) {
			vPresentation.getNamePanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getSiretPanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getEmailPanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getWebsitePanel().getInput().setBorder(new TextFieldBorder());
			vPresentation.getTextAreaPresentation().setBackground(UIManager.getColor("TextArea.background"));
			vPresentation.getTextAreaPresentation().setBorder(new TextFieldBorder());
		} else {
			vPresentation.getNamePanel().getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
			vPresentation.getSiretPanel().getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
			vPresentation.getEmailPanel().getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
			vPresentation.getWebsitePanel().getInput().setBorder(new EmptyBorder(0, 0, 0, 0));
			vPresentation.getTextAreaPresentation().setBackground(UIManager.getColor("Panel.background"));
			vPresentation.getTextAreaPresentation().setBorder(new EmptyBorder(0, 0, 0, 0));
			
		}
	}
}
