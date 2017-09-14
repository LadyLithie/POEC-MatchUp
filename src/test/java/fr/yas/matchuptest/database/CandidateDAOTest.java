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
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", " ", " ", " ", "toto", "tata", "1999-12-12", 
			new ArrayList<Diploma>(), new ArrayList<String>(), "address", "role");
		candidateDAO.get();
		
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
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", " ", " ", " ", "toto", "tata", "1999-12-12", 
			new ArrayList<Diploma>(), new ArrayList<String>(), "address", "role");			
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
		candidate = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", " ", " ", " ", "toto", "tata", "1999-12-12", 
				new ArrayList<Diploma>(), new ArrayList<String>(), "address", "role");
		Candidate candidatebis = new Candidate("log", "user", "0102030405", "log@orange.com", "Bonjour", " ", " ", " ", "toto", "tata", "1999-12-12", 
				new ArrayList<Diploma>(), new ArrayList<String>(), "address", "role");
		
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
		fail("Not yet implemented");
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
