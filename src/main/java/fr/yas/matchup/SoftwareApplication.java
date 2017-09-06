/**
 * 
 */
package fr.yas.matchup;


import java.util.List;

import fr.yas.matchup.database.CandidateDAO;
import fr.yas.matchup.database.HeadhunterDAO;
import fr.yas.matchup.database.ProposalDAO;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.base.BaseEntity;
import fr.yas.matchup.managers.ViewsManager;


/**
 * @author Audrey
 *
 */
public class SoftwareApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ViewsManager.getInstance().start();	

//		Proposal job = new Proposal("webdev", null);
//		job.setLocalization(":,35,Rennes");
//		ProposalDAO pDao = new ProposalDAO();
//		pDao.insert(job);
	}

	
}
