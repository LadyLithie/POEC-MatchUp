/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.Color;
import java.awt.Component;
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
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.views.ProfileEView;
import fr.yas.matchup.views.panels.Panel2FieldButton;
import fr.yas.matchup.views.panels.PanelHeadhunters;
import fr.yas.matchup.views.panels.PanelListJobs;
import fr.yas.matchup.views.panels.PanelPresentation;
import fr.yas.matchup.views.panels.PanelResumeJob;

/**
 * @author Audrey
 *
 */
public class ProfileEController extends BaseController {
	private Enterprise user;
	private ArrayList<Headhunter> headhunters = new ArrayList<>();
	private ArrayList<Panel2FieldButton> pHeadhunters = new ArrayList<>();
	private ArrayList<PanelResumeJob> pJobs = new ArrayList<>();

	/**
	 * Nested class for shared ActionListener
	 * @author Audrey
	 *
	 */
	class deleteHHListener implements ActionListener {
		private PanelHeadhunters view;
		private Component headhunter;

		public deleteHHListener(PanelHeadhunters view, Component headhunter) {
			this.view = view;
			this.headhunter = headhunter;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// identify the headhunter and remove it from the user list

			// remove it graphically
			view.getPanelContent().remove(headhunter);
			view.getPanelContent().revalidate();
		};
	}

	/**
	 * 
	 * @param frame
	 */
	public ProfileEController(JFrame frame) {
		super();
		super.frame = frame;
		user = (Enterprise) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		super.view = new ProfileEView(this.frame);
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
		// Panel presentation
		PanelPresentation vP = ((PanelPresentation) v.getPanel_TopRight());

		vP.getNamePanel().getInput().setText(user.getName());
		vP.getEmailPanel().getInput().setText(user.getEmail());
		vP.getWebsitePanel().getInput().setText(user.getWebsite());
		vP.getSiretPanel().getInput().setText(user.getSiretNumber());
		vP.getTextAreaPresentation().setText(user.getPresentation());

		// Panel headhunters
		PanelHeadhunters vH = (PanelHeadhunters) v.getPanel_bottomRight();
		ArrayList<Panel2FieldButton> associates;
		if (vH.getAssociates() != null) {
			associates = vH.getAssociates();	
		} else {
			associates = new ArrayList<>();
		}
		if (user.getAssociates() != null) {
			for (Headhunter headhunter : user.getAssociates()) {
				//posX = posX + 2;
				Panel2FieldButton test = new Panel2FieldButton("Headhunter: ", "Supprimer");
				test.getTextField1().setText(headhunter.getFirstname());
				test.getTextField2().setText(headhunter.getLastname());
				GridBagConstraints gbc_test = new GridBagConstraints();
				gbc_test.fill = GridBagConstraints.NONE;
				gbc_test.anchor = GridBagConstraints.CENTER;
				gbc_test.gridx = 1;
				gbc_test.gridy =GridBagConstraints.RELATIVE;
				vH.getPanelContent().add(test, gbc_test);
				vH.getAssociates().add(test);
				associates.add(test);
			}			
		}
		vH.setMode(false);

		
		// Panel jobs
		PanelListJobs vListJobs = (PanelListJobs) v.getPanel_left();
		if (user.getJobs() != null) {
			pJobs = new ArrayList<>();
			for (Proposal Ujob : user.getJobs()) {
				PanelResumeJob job = new PanelResumeJob(Ujob);
				job.setPreferredSize(new Dimension(130, 170));
				job.getLblLink().setText("Contact");
				GridBagConstraints gbc_job = new GridBagConstraints();
				gbc_job.anchor = GridBagConstraints.NORTHEAST;
				vListJobs.getPanelJobs().add(job, gbc_job);
				vListJobs.getPanelJobs().getResumeJobs().add(job);
				pJobs.add(job);
			}
			
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

		/*
		 * Panel Presentation Define the action on the buttons
		 */
		PanelPresentation vPresentation = (PanelPresentation) v.getPanel_TopRight();
		// mode view
		vPresentation.getBtnEditer().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vPresentation.setMode(true);
			}
		});
		// Mode modification
		vPresentation.getBtnValider().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vPresentation.setMode(false);
				user.setName(vPresentation.getNamePanel().getInput().getText());
				if (!user.setSiretNumber(vPresentation.getSiretPanel().getInput().getText())) {
					vPresentation.getSiretPanel().getInput().setText(user.getSiretNumber());
				}
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

		/*
		 * Panel Head-hunters Define the action on the buttons
		 */
		PanelHeadhunters vHeadhunters = (PanelHeadhunters) v.getPanel_bottomRight();
		// Switch between display and modification view
		vHeadhunters.getBtnEdit().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vHeadhunters.getBtnEdit().getText().equalsIgnoreCase("Editer")) {
					vHeadhunters.setMode(true);
				} else {
					// assign to the entity the new associates
					if (user.getAssociates() == null) {
						user.setAssociates(headhunters);
					} else {
						user.getAssociates().addAll(headhunters);
					}
					headhunters = new ArrayList<>();
					// assign on the profileEview the new associates panels
					if (vHeadhunters.getAssociates() == null) {
						vHeadhunters.setAssociates(pHeadhunters);
					} else {
						vHeadhunters.getAssociates().addAll(pHeadhunters);
					}
					for (Panel2FieldButton headhunter : pHeadhunters) {
						headhunter.setMode(false);
					}
					System.out.println(vHeadhunters.getAssociates().size());
					// //v.getContentPane().remove(vHeadhunters);
					// v.setPanel_bottomRight(vHeadhunters);
					vHeadhunters.setMode(false);
				}
			}
		});
		// Switch back to display without registering change
		vHeadhunters.getBtnAnnuler().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				vHeadhunters.setMode(false);
				// need to add re-initialization of panel
				for (Panel2FieldButton hh : pHeadhunters) {
					vHeadhunters.getPanelContent().remove(hh);
				}
				pHeadhunters = vHeadhunters.getAssociates();
				for (Panel2FieldButton headhunter : pHeadhunters) {
					vHeadhunters.getPanelContent().add(headhunter);
				}
				headhunters = new ArrayList<>();
			}
		});
		// Add new one
		vHeadhunters.getNewHeadHunter().getButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Headhunter newHH = new Headhunter();
				boolean valid = true;
				// System.err.println(vHeadhunters.getNewHeadHunter().getTextField1().getText().isEmpty());
				// test submited textfield for blank which provoke PINK background and invalid
				// object
				// firstname
				if (!vHeadhunters.getNewHeadHunter().getTextField1().getText().isEmpty()) {
					vHeadhunters.getNewHeadHunter().getTextField1().setBackground(Color.WHITE);
				} else {
					vHeadhunters.getNewHeadHunter().getTextField1().setBackground(Color.PINK);
					valid = false;
				}
				// lastname
				// System.err.println(vHeadhunters.getNewHeadHunter().getTextField2().getText().isEmpty());
				if (!vHeadhunters.getNewHeadHunter().getTextField2().getText().isEmpty()) {
					vHeadhunters.getNewHeadHunter().getTextField2().setBackground(Color.WHITE);
				} else {
					vHeadhunters.getNewHeadHunter().getTextField2().setBackground(Color.PINK);
					valid = false;
				}

				// If valid, we add the headhunter to the view list and reinitialize the new
				// headhunter
				if (valid) {
					newHH.setFirstname(vHeadhunters.getNewHeadHunter().getTextField1().getText());
					newHH.setLastname(vHeadhunters.getNewHeadHunter().getTextField2().getText());
					headhunters.add(newHH);

					Panel2FieldButton test = new Panel2FieldButton("Headhunter", "Supprimer");
					test.getTextField1().setText(newHH.getFirstname());
					test.getTextField2().setText(newHH.getLastname());
					test.getButton().addActionListener(new deleteHHListener(vHeadhunters, test));
					GridBagConstraints gbc_test = new GridBagConstraints();
					gbc_test.fill = GridBagConstraints.HORIZONTAL;
					gbc_test.anchor = GridBagConstraints.CENTER;
					gbc_test.gridx = 1;
					gbc_test.gridy = GridBagConstraints.RELATIVE;
					// System.out.println(vHeadhunters.getComponentCount());
					vHeadhunters.getPanelContent().add(test, gbc_test);
					pHeadhunters.add(test);

					vHeadhunters.getNewHeadHunter().getTextField1().setText("");
					vHeadhunters.getNewHeadHunter().getTextField2().setText("");
					vHeadhunters.revalidate();
				}
			}
		});
		// Delete a listed one
		for (Panel2FieldButton headhunter : pHeadhunters) {
			headhunter.getButton().addActionListener(new deleteHHListener(vHeadhunters, headhunter));
		}
		
		/*
		 * Panel Jobs Define the action on the buttons
		 */
		PanelListJobs vListJobs = (PanelListJobs) v.getPanel_left();
		vListJobs.addComponentListener(new ComponentAdapter() {

			/*
			 * (non-Javadoc)
			 * 
			 * @see java.awt.event.ComponentAdapter#componentResized(java.awt.event.
			 * ComponentEvent)
			 */
			@Override
			public void componentResized(ComponentEvent e) {
				int width = vListJobs.getWidth();
				// System.out.println(vListJobs.getPanelJobs().getSize());
				// System.out.println("the listJobs width = "+width);
				vListJobs.getPanelJobs()
						.setPreferredSize(new Dimension(width - 5, vListJobs.getPanelJobs().getSize().height));
				vListJobs.validate();
				vListJobs.getPanelJobs().validate();
			}

		});
		vListJobs.getBtnAdd().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewsManager.getInstance().next(new ProposalController(frame));
			}
		});
		for (PanelResumeJob resumeJob : vListJobs.getPanelJobs().getResumeJobs()) {
			resumeJob.getBtnEditer().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ViewsManager.getInstance().next(new ProposalController(frame, resumeJob.getJob()));
					
				}
			});
		}
	}

}
