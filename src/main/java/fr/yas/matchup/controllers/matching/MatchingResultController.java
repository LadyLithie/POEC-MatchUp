package fr.yas.matchup.controllers.matching;

import java.util.ArrayList;

import javax.swing.JFrame;

import fr.yas.matchup.controllers.BaseController;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;

public class MatchingResultController extends BaseController {

	public MatchingResultController(JFrame frame, Enterprise enterprise2) {
		super();
	}
	public MatchingResultController(JFrame frame, Headhunter headhunter2) {
		super();
	}
	private RegisteredUser user;
	private Enterprise enterprise;
	private Headhunter headhunter;
	private ArrayList<Proposal> proposals = new ArrayList<>();
	
}
