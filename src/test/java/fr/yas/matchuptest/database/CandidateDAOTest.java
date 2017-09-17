package fr.yas.matchuptest.database;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.CandidateDAO;
import fr.yas.matchup.database.DBManager;
import fr.yas.matchup.database.SkillDAO;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Diploma;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.utils.processexecution.ProcessManager;

public class CandidateDAOTest {
	
	private static ProcessManager process;
	private static Candidate candidate;
	private static CandidateDAO candidateDAO;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
	//	DBManager.getInstance();
		candidateDAO = new CandidateDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		process.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParseToObject() {
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", null, " ", " ", "toto", "tata", "1999-12-12", "address", 
			new ArrayList<Diploma>(), new ArrayList<String>(), new ArrayList<>());
		candidateDAO.insert(candidate);
		
		ResultSet rs = null ;
		
		try {
			Statement stmt= DBManager.getInstance().getCon().createStatement();
			rs = stmt.executeQuery("SELECT * FROM "+CandidateDAO.TABLE+" ;");
			while(rs.next()){
				if(rs.getString(CandidateDAO.ID).equals(candidate.getId())){
					assertTrue(true);
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Candidate not create");
		}finally{
			try {
				Statement stmt1 = DBManager.getInstance().getCon().createStatement();
				stmt1.execute("DELETE FROM "+CandidateDAO.TABLE+" WHERE "+CandidateDAO.ID+" ="+candidate.getId()+" ;");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}

	@Test
	public void testParseToString() {		
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", null, " ", " ", "toto", "tata", "1999-12-12", "address", 
				new ArrayList<Diploma>(), new ArrayList<String>(), new ArrayList<>());
		candidateDAO.insert(candidate);		
		assertNotNull(candidate);
		
		try {
			Statement stmt1 = DBManager.getInstance().getCon().createStatement();
			stmt1.execute("DELETE FROM "+CandidateDAO.TABLE+" WHERE "+CandidateDAO.ID+" ="+candidate.getId()+" ;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testParseUpdateToString() {
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", null, " ", " ", "toto", "tata", "1999-12-12", "address", 
				new ArrayList<Diploma>(), new ArrayList<String>(), new ArrayList<>());
		Candidate candidatebis = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", null, " ", " ", "toto", "tata", "1999-12-12", "address", 
				new ArrayList<Diploma>(), new ArrayList<String>(), new ArrayList<>());

		
		candidate.setLogin("sacha");
		
		candidateDAO.update(candidate);
		
		ResultSet rs;
		
		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			rs = stmt.executeQuery("SELECT * FROM "+CandidateDAO.TABLE+" ;" );
			while (rs.next()){
				if(!rs.getString(CandidateDAO.LOGIN).equals(candidatebis.getLogin())){
					assertTrue(true);
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Fail Update");
		}finally{
			try {
				Statement stmt1 = DBManager.getInstance().getCon().createStatement();
				stmt1.execute("DELETE FROM "+CandidateDAO.TABLE+" WHERE "+CandidateDAO.FIRSTNAME+"='"+ candidate.getFirstname() +"' ;");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	@Test
	public void testCandidateDAO() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSkills() {
		SkillDAO skilldao = new SkillDAO();
		Skill skill = new Skill("testName","testSkillType");
		skilldao.insert(skill);
		skilldao.get();
		
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", null, " ", " ", "toto", "tata", "1999-12-12", "address", 
				new ArrayList<Diploma>(), new ArrayList<String>(), new ArrayList<>());
		candidateDAO.insert(candidate);
		
		ResultSet rs;
		
		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			stmt.execute("INSERT INTO "+CandidateDAO.CANDIDATE_SKILL+" VALUES("+ candidate.getId() +","+skill.getId()+") ;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Statement stmt1 = DBManager.getInstance().getCon().createStatement();
			rs = stmt1.executeQuery("SELECT * FROM "+CandidateDAO.CANDIDATE_SKILL+" "
					+ " WHERE "+CandidateDAO.ID_CANDIDATE+" = "+candidate.getId()+" AND "
					+ CandidateDAO.ID_SKILL+" = "+skill.getId()+" ;");
			if(rs.next()){
				assertTrue(true);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Update fail");
		}finally{
			try {
				Statement stmt2 = DBManager.getInstance().getCon().createStatement();
				stmt2.execute("DELETE FROM "+CandidateDAO.CANDIDATE_SKILL+" WHERE "+CandidateDAO.ID_CANDIDATE+" = "+candidate.getId()+" AND "
					+ CandidateDAO.ID_SKILL+" = "+skill.getId()+" ;");
				Statement stmt3 = DBManager.getInstance().getCon().createStatement();
				stmt3.execute("DELETE FROM "+CandidateDAO.TABLE+" WHERE "+CandidateDAO.FIRSTNAME+"='"+ candidate.getFirstname() +"' ;");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Test
	public void testInsertSkills() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteSkills() {
		fail("Not yet implemented");
	}

}
