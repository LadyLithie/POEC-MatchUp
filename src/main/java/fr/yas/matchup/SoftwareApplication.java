/**
 * 
 */
package fr.yas.matchup;


import fr.yas.matchup.managers.ViewsManager;
import fr.yas.matchup.utils.date.DateConverter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import fr.yas.matchup.database.CandidateDAO;
import fr.yas.matchup.database.EnterpriseDAO;
import fr.yas.matchup.database.HeadhunterDAO;
import fr.yas.matchup.database.SkillDAO;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public class SoftwareApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//ViewsManager.getInstance().start();
		

//		SkillDAO skillDAO = new SkillDAO();
//		Skill skill = new Skill(0, "testing", "savoir-faire");
//		
//		skillDAO.insert(skill);
//		ResultSet resultSet = skillDAO.executeRequest("SELECT * FROM SKILL");
//		System.out.println(skill.toString());
//
//		try {
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt(SkillDAO.ID)+","+resultSet.getString(SkillDAO.NAME));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
//		CandidateDAO candidateDAO = new CandidateDAO();	
//		Candidate c1 = new Candidate();
//		
//		c1.setFirstname("Sacha");
//		c1.setLastname("Markides");
//		c1.setBirstdate(DateConverter.getMySqlDate(new Date()));
//		c1.setAddress(null);
//		c1.setEmail(null);
//		c1.setAvatar(null);
//		c1.setPresentation(null);
//		c1.setLogin("root");
//		c1.setPassword("pwd");
//		c1.setRole(null);
//
//		
//		Candidate c2 = new Candidate();
//	
//		
//		c2.setFirstname("Theo");
//		c2.setLastname("Larue");
//		c2.setBirstdate(DateConverter.getMySqlDate(new Date()));
//		c2.setAddress(null);
//		c2.setEmail(null);
//		c2.setAvatar(null);
//		c2.setPresentation(null);
//		c2.setLogin("toto");
//		c2.setPassword("eltoto");
//		c2.setRole(null);
//		
//		candidateDAO.insert(c2);
		
//		ResultSet resultSet = candidateDAO.executeRequest("SELECT * FROM CANDIDATE");
//		
//		try {
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt(CandidateDAO.ID)+","+resultSet.getString(CandidateDAO.FIRSTNAME));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//			
//		List<BaseEntity> candidates = candidateDAO.get();
//		
//		Candidate updateS =  (Candidate) candidates.get(((int) c2.getId()+1));
//		updateS.setFirstname("Theo");
//				
//		candidateDAO.update(updateS);
		
//		resultSet = candidateDAO.executeRequest("SELECT * FROM CANDIDATE");
//		
//		try {
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt(CandidateDAO.ID)+","+resultSet.getString(CandidateDAO.FIRSTNAME));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		EnterpriseDAO enterpriseDAO = new EnterpriseDAO();
//		Enterprise e = new Enterprise();
//		
//		e.setName("Mon Entreprise");
//		e.setPhone(Double.valueOf("0687896554"));
//		e.setAddress("1 rue winamax poker");
//		e.setCity("Paris");
//		e.setWebsite("erherhhre");
//		e.setEmail("reherher");
//		e.setPresentation("erhherh");
//		e.setAvatar(null);
//		e.setLinkedin("erher");
//		e.setTwitter("erhreh");
//		e.setActivity("rehher");
//		e.setRole("erhher");
//		e.setLogin("erherh");
//		e.setPassword("erhher");
//		
//		enterpriseDAO.insert(e);
		
		HeadhunterDAO headhunterDAO = new HeadhunterDAO();
		Headhunter h = new Headhunter();
		
		h.setFirstname("sacha");
		h.setLastname(null);
		h.setPhone(Double.valueOf("0250250"));
		h.setEmail(null);
		h.setAvatar(null);
		h.setTwitter(null);
		h.setLinkedin(null);
		h.setPresentation(null);
		h.setLogin(null);
		h.setPassword(null);
		h.setRole(null);
		
		headhunterDAO.insert(h);
		
		ResultSet resultSet = headhunterDAO.executeRequest("SELECT * FROM HEADHUNTER");
		
		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(headhunterDAO.ID)+","+resultSet.getString(headhunterDAO.FIRSTNAME));
			}
		} catch (SQLException a) {
			// TODO Auto-generated catch block
			a.printStackTrace();
		}
		
	}

}
