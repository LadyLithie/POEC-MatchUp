/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.views.ProfileEView;
import fr.yas.matchup.views.panels.Panel2FieldButton;
import fr.yas.matchup.views.panels.PanelHeadhunters;
import fr.yas.matchup.views.panels.PanelListJobs;
import fr.yas.matchup.views.panels.PanelPresentation;

/**
 * @author Audrey
 *
 */
public class ProfileController extends BaseController {
	private Enterprise user;
	private ArrayList<Headhunter> headhunters = new ArrayList<>();
	private ArrayList<Panel2FieldButton> pHeadhunters = new ArrayList<>();


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
		//Panel presentation
		PanelPresentation vP = ((PanelPresentation) v.getPanel_TopRight());

		vP.getNamePanel().getInput().setText(user.getName());
		vP.getEmailPanel().getInput().setText(user.getEmail());
		vP.getWebsitePanel().getInput().setText(user.getWebsite());
		vP.getSiretPanel().getInput().setText(user.getSiretNumber());
		vP.getTextAreaPresentation().setText(user.getPresentation());
		
		//Panel headhunters
		PanelHeadhunters vH = (PanelHeadhunters) v.getPanel_bottomRight();
		ArrayList<Panel2FieldButton> associates = vH.getAssociates();
		for (int i = 0; i < associates.size(); i++) {
//			associates[i].get
		}

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
				if(vHeadhunters.getBtnEdit().getText() == "Editer") {
					vHeadhunters.setMode(true);
				}
				else {
					if(user.getAssociates() == null) {
						user.setAssociates(headhunters);
					}else {
						user.getAssociates().addAll(headhunters);
					}
					headhunters = new ArrayList<>();
					vHeadhunters.setMode(false);
				}
			}
		});
		vHeadhunters.getBtnAnnuler().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vHeadhunters.setMode(false);
				//need to add re-initialization of panel
			}
		});
		vHeadhunters.getNewHeadHunter().getButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Headhunter newHH = new Headhunter();
				boolean valid = true;
				System.err.println(vHeadhunters.getNewHeadHunter().getTextField1().getText().isEmpty());
				if (!vHeadhunters.getNewHeadHunter().getTextField1().getText().isEmpty()) {
					vHeadhunters.getNewHeadHunter().getTextField1().setBackground(Color.WHITE);
				} else {
					vHeadhunters.getNewHeadHunter().getTextField1().setBackground(Color.PINK);
					valid  = false;
				}
				//lastname
				System.err.println(vHeadhunters.getNewHeadHunter().getTextField2().getText().isEmpty());
				if (!vHeadhunters.getNewHeadHunter().getTextField2().getText().isEmpty()) {
					vHeadhunters.getNewHeadHunter().getTextField2().setBackground(Color.WHITE);
				} else {
					vHeadhunters.getNewHeadHunter().getTextField2().setBackground(Color.PINK);
					valid = false;
				}
				
				//If valid, we add the headhunter to the view list and reinitialize the new headhunter
				if(valid) {
					newHH.setFirstname(vHeadhunters.getNewHeadHunter().getTextField1().getText());
					newHH.setLastname(vHeadhunters.getNewHeadHunter().getTextField2().getText());
					headhunters.add(newHH);
					
					Panel2FieldButton test = new Panel2FieldButton("Headhunter", "Supprimer");
					test.getTextField1().setText(newHH.getFirstname());
					test.getTextField2().setText(newHH.getLastname());
					GridBagConstraints gbc_test = new GridBagConstraints();
					gbc_test.fill = GridBagConstraints.HORIZONTAL;
					gbc_test.anchor = GridBagConstraints.CENTER;
					gbc_test.gridx = 1;
					gbc_test.gridy = 2+vHeadhunters.getAssociates().size()*2;
					System.out.println(vHeadhunters.getComponentCount());
					vHeadhunters.getPanelContent().add(test, gbc_test);
					pHeadhunters.add(test);
					
					vHeadhunters.getNewHeadHunter().getTextField1().setText("");
					vHeadhunters.getNewHeadHunter().getTextField2().setText("");
					vHeadhunters.revalidate();
				}
			}
		});

		/* Panel Head-hunters
		 * Define the action on the buttons
		 */
		PanelListJobs vListJobs = (PanelListJobs) v.getPanel_left();
		vListJobs.addComponentListener(new ComponentAdapter() {

			/* (non-Javadoc)
			 * @see java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent)
			 */
			@Override
			public void componentResized(ComponentEvent e) {
				int width = vListJobs.getWidth();
//				System.out.println(vListJobs.getPanelJobs().getSize());
//				System.out.println("the listJobs width = "+width);
				vListJobs.getPanelJobs().setPreferredSize(new Dimension(width-5, vListJobs.getPanelJobs().getSize().height));
				vListJobs.validate();
				vListJobs.getPanelJobs().validate();
			}

		});

	}

}
