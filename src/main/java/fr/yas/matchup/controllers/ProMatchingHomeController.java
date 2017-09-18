/**
 * 
 */
package fr.yas.matchup.controllers;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.html.HTML;

import fr.yas.matchup.database.CandidateDAO;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;
import fr.yas.matchup.managers.MatchManager;
import fr.yas.matchup.managers.Matching;
import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.utils.views.ViewsUtils;
import fr.yas.matchup.views.ProMatchingHomeView;
import fr.yas.matchup.views.panels.MatchedCandidate;
import fr.yas.matchup.views.panels.PanelJobToMatch;
import fr.yas.matchup.views.panels.PanelMatchResume;

/**
 * @author Audrey
 *
 */
public class ProMatchingHomeController extends BaseController {
	private RegisteredUser user;
	private List<PanelJobToMatch> panelJobToMatchs;
	private List<BaseEntity> candidates;
	private MatchedCandidate detail;
	private boolean enMatching = false;

	/**
	 * 
	 */
	public ProMatchingHomeController(JFrame jFrame) {
		super();
		super.frame = jFrame;
		super.view = new ProMatchingHomeView(jFrame);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.controllers.BaseController#initView()
	 */
	@Override
	public void initView() {
		ProMatchingHomeView view = (ProMatchingHomeView) getView();
		user = (RegisteredUser) getViewDatas().get(ViewsDatasTerms.CURRENT_USER);
		setButtonsVisible(enMatching);

		view.getMenuBar().getLblUserName().setText(user.getName());

		if (((user instanceof Enterprise) && !((Enterprise) user).getJobs().isEmpty())
				|| ((user instanceof Headhunter) && !((Headhunter) user).getJobs().isEmpty())) {
			// local list to avoid complication/doubleness
			List<Proposal> list;
			if (user instanceof Enterprise) {
				list = ((Enterprise) user).getJobs();
			} else {
				list = ((Headhunter) user).getJobs();
			}
			// Create the jobs panel and add them to both the view and the listing for use
			// in initevent()
			panelJobToMatchs = new ArrayList<>();
			for (Proposal job : list) {
				PanelJobToMatch pJob = new PanelJobToMatch(job);
				GridBagConstraints gbc_pJob = new GridBagConstraints();
				gbc_pJob.anchor = GridBagConstraints.NORTHWEST;
				gbc_pJob.fill = GridBagConstraints.HORIZONTAL;
				gbc_pJob.gridx = 0;
				// gbc_pJob.gridy = GridBagConstraints.RELATIVE; //below the last one
				view.getPanelListJobs().add(pJob, gbc_pJob);
				panelJobToMatchs.add(pJob);

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
		ProMatchingHomeView view = (ProMatchingHomeView) getView();

		/*
		 * MenuBar
		 */
		view.getMenuBar().getNavigationBar().getBtnGoToProfil().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (user instanceof Enterprise) {
					ViewsManager.getInstance().next(new CompanyController(frame));
				} else {
					ViewsManager.getInstance().next(new HeadhunterController(frame));
				}
			}
		});

		/*
		 * List of jobs
		 */
		CandidateDAO cDao = new CandidateDAO();
		candidates = new ArrayList<>();
		for (BaseEntity cUser : cDao.get()) {
			if (!((Candidate) cUser).getSkills().isEmpty()) {
				candidates.add(cUser);
			}
		}

		if (!panelJobToMatchs.isEmpty()) {
			for (PanelJobToMatch panelJobToMatch : panelJobToMatchs) {
				panelJobToMatch.getBtnSeeMore().addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (!enMatching) {
							enMatching = true;
							setButtonsVisible(enMatching);
						}
						/*
						 * Ceci est juste pour visuel de test sera remplacé par un panel de resultat
						 */
						view.getLblResult()
								.setText("<html><h1>Matching en cours</h1>job : " + panelJobToMatch.getJob().getId()
										+ " - " + panelJobToMatch.getJob().getName() + "</html>");
						view.getPanelResult().removeAll();
						/*
						 * Start matching
						 */
						MatchManager jobMatcher = new MatchManager(candidates, panelJobToMatch.getJob());
						for (Matching match : jobMatcher.basic()) {
							PanelMatchResume mResume = new PanelMatchResume(match.getCandidate());
							mResume.getMatchResult().setText(String.valueOf(match.getPercentage()) + "%");
							mResume.getLblName().setText("<html>" + match.getCandidate().getFirstname() + "<br />"
									+ match.getCandidate().getLastname() + "</html>");
							view.getPanelResult().add(mResume);

							mResume.getBtnSeeNewMatch().addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									Candidate matched = (Candidate) mResume.getMatched();
									if (detail == null) {
										MatchedCandidate content = new MatchedCandidate();
										view.getPanelPreview().add(content);
										detail = content;
									}
									setPanelVisible(false);

									detail.getTextFieldEmail().setText(matched.getEmail());
									detail.getTextFieldMatching().setText(match.getPercentage() + "%");
									detail.getTextFieldNom().setText(matched.getLastname());
									detail.getTextFieldPrenom().setText(matched.getFirstname());
									detail.getTextFieldPhone().setText(matched.getPhone());
									for (Skill skill : matched.getSkills()) {
										detail.getListModel().addElement(skill);
									}

									// set the button activity
									view.getBtnListe().setEnabled(true);
									view.getBtnMore().setEnabled(false);
								}
							});
						}
					}
				});

				ActionListener[] aEs = view.getBtnMore().getActionListeners();
				if (aEs.length == 0) {
					// affiche le detail du dernier candidat visité si présent
					view.getBtnMore().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							view.getBtnListe().setEnabled(true);
							view.getBtnMore().setEnabled(false);
							setPanelVisible(false);
							view.getPanelPreview().revalidate();
						}
					});
				}
				aEs = view.getBtnListe().getActionListeners();
				if (aEs.length == 0) {
					view.getBtnListe().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// set the button activity
							view.getBtnListe().setEnabled(false);
							view.getBtnMore().setEnabled(true);
							setPanelVisible(true);
							view.getPanelPreview().revalidate();
						}
					});
				}
			}
		}
	}

	private void setButtonsVisible(boolean b) {
		((ProMatchingHomeView) view).getBtnListe().setVisible(b);
		((ProMatchingHomeView) view).getBtnMore().setVisible(b);
	}
	
	private void setPanelVisible(boolean b) {
		((ProMatchingHomeView) view).getPanelResult().setVisible(b);
		detail.setVisible(!b);

	}
}
