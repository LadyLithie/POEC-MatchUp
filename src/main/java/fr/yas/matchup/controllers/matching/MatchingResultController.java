package fr.yas.matchup.controllers.matching;

import java.util.ArrayList;

import fr.yas.matchup.controllers.BaseController;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.RegisteredUser;

public class MatchingResultController extends BaseController {

	private RegisteredUser user;
	private Enterprise enterprise;
	private Headhunter headhunter;
	private ArrayList<Proposal> proposals = new ArrayList<>();
	
}
