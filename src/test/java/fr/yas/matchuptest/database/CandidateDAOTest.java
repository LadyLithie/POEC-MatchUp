package fr.yas.matchuptest.database;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.CandidateDAO;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.utils.processexecution.ProcessManager;


public class CandidateDAOTest {
	
	private static ProcessManager process;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
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
		CandidateDAO candidateDAO = new CandidateDAO();
		ResultSet rs = null;
		
		Candidate c1 = new Candidate() ;
		
		Candidate c2 = null;
				
		try {
			c2.setId(rs.getDouble(CandidateDAO.ID));
			c2.setLastname(rs.getString(CandidateDAO.LASTNAME));
			c2.setFirstname(rs.getString(CandidateDAO.FIRSTNAME));
			c2.setPhone(rs.getString(CandidateDAO.PHONE));
			c2.setBirstdate(rs.getString(CandidateDAO.BIRTHDAY));
			c2.setAddress(rs.getString(CandidateDAO.ADDRESS));
			c2.setEmail(rs.getString(CandidateDAO.MAIL));
			c2.setAvatar(rs.getBlob(CandidateDAO.PICTURE));
			c2.setPresentation(rs.getString(CandidateDAO.PRESENTATION));
			c2.setLogin(rs.getString(CandidateDAO.LOGIN));
			c2.setPassword(rs.getString(CandidateDAO.PASSWORD));
			c2.setName(c2.getFirstname() + " " + c2.getLastname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		c1 = (Candidate) candidateDAO.parseToObject(rs);
		
		assertEquals(c1,c2);
	}

	@Test
	public void testParseToString() {		
		CandidateDAO candidateDAO = new CandidateDAO();
		String rs = "null,";
		
		Candidate c1 = new Candidate() ;
		
		Candidate c2 = null;
		
		rs += "'" + c1.getLastname() + "',";
		rs += "'" + c1.getFirstname() + "',";
		rs += "'" + c1.getPhone() + "',";
		rs += "'" + c1.getBirstdate() + "',";
		rs += "'" + c1.getAddress() + "',";
		rs += "'" + c1.getEmail() + "',";
		rs += "'" + c1.getAvatar() + "',";
		rs += "'" + c1.getPresentation() +"',";
		rs += "'" + c1.getLogin() + "',";
		rs += "'" + c1.getPassword() + "',";
		rs += "'" + c1.getRole() + "'";
		
		candidateDAO.parseToString(c2);
		
		assertEquals(c1,c2);
		
	}

	@Test
	public void testParseUpdateToString() {		
		CandidateDAO candidateDAO = new CandidateDAO();
		String rs = "";
		
		Candidate c1 = new Candidate() ;
		
		Candidate c2 = null;
		
		rs += CandidateDAO.LASTNAME + " = '" + c2.getLastname() + "',";
		rs += CandidateDAO.FIRSTNAME + " = '" + c2.getFirstname() + "',";
		rs += CandidateDAO.PHONE + " = '" + c2.getPhone() + "',";
		rs += CandidateDAO.BIRTHDAY + " = '" + c2.getBirstdate() + "',";
		rs += CandidateDAO.ADDRESS + " = '" + c2.getAddress() + "',";
		rs += CandidateDAO.MAIL + " = '" + c2.getEmail() + "',";
		rs += CandidateDAO.PICTURE + " = '" + c2.getAvatar() + "',";
		rs += CandidateDAO.PRESENTATION + " = '" + c2.getPresentation() +"',";
		rs += CandidateDAO.LOGIN + " = '" + c2.getLogin() + "',";
		rs += CandidateDAO.PASSWORD + " = '" + c2.getPassword() + "',";
		rs += CandidateDAO.ROLE + " = '" + c2.getRole() + "'";
		
		candidateDAO.parseUpdateToString(c1);
		
		assertEquals(c1,c2);
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
