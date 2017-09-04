package fr.yas.matchup;

import java.util.ArrayList;

import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.Skill;

public class MatchingCode {

	private double percentage;
	private Proposal job;
	private Candidate candidate;
	private ArrayList<Skill> jobSkills = new ArrayList<>();
	private ArrayList<Skill> candidateSkills = new ArrayList<>();
	private ArrayList<Skill> matchedSkills = new ArrayList<>();
	
	
	public double matching() {
		
		
		
		for (int i = 0 ; i < job.getSkills().size() ; i++) {
			jobSkills.add(i, job.getSkills().get(i));
		}
		for (int i = 0 ; i < candidate.getSkills().size() ; i++) {
			candidateSkills.add(i, candidate.getSkills().get(i));
		}
		
		
		for (int i = 0; i < jobSkills.size(); i++) {
			for (int j = 0; j < candidate.getSkills().size(); j++) {
				
				if ( candidate.getSkills().get(j).getName() == job.getSkills().get(i).getName() ) {
					
					matchedSkills.add(i, job.getSkills().get(i));
					
				}
			}
		}
		
		
		percentage = ( (matchedSkills.size() / jobSkills.size()) * 100 );
		
		return percentage;
	}
}
