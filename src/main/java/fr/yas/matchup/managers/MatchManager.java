/**
 * 
 */
package fr.yas.matchup.managers;

import java.util.ArrayList;
import java.util.List;

import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Proposal;

/**
 * @author Audrey
 *
 */
public class MatchManager {
	private List<Candidate> cList;
	private List<Proposal> jList;

	protected MatchManager() {
		cList = new ArrayList<>();
		jList = new ArrayList<>();
	}
	
	public MatchManager(List<Candidate> cList, Proposal job) {
		this();
		this.cList = cList;
		jList.add(job);
	}
	
	public MatchManager(Candidate candidate, List<Proposal> jList) {
		this();
		this.jList = jList;
		cList.add(candidate);
	}
	
}
