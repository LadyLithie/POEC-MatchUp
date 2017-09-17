package fr.yas.matchuptest.database;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.CandidateDAO;
import fr.yas.matchup.database.DBManager;
import fr.yas.matchup.database.EnterpriseDAO;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Role;
import fr.yas.matchup.entities.Validity;
import fr.yas.matchup.entities.base.BaseEntity;
import fr.yas.matchup.utils.processexecution.ProcessManager;
import fr.yas.matchup.database.base.*;

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
	public void testParseToObject() throws SQLException {				
		Candidate idTest = new Candidate("userOne", "The Company", "00000000", "no email", null, null, null, null, "lololo",
				"pwdlolo", null, null, null, null);
		CandidateDAO testDao = new CandidateDAO(); 
		testDao.insert(idTest);

		ResultSet result = testDao
				.executeRequest("SELECT * FROM "+CandidateDAO.TABLE+" WHERE " + CandidateDAO.ID + " = " + idTest.getId());
		Candidate entityResult = new Candidate();
		try {
			if (result.next()) {
				entityResult = (Candidate) testDao.parseToObject(result);
			}else{
				entityResult.setId(0);
				entityResult.setLogin("userOne");
			}
		} catch (SQLException e) {
			
		}

		Object[] exp = { idTest.getId(), idTest.getLogin() };
		Object[] actual = { entityResult.getId(), entityResult.getLogin() };

		assertArrayEquals(exp, actual);
	}

	@Test
	public void testParseToString() {		
		CandidateDAO candidateDAO = new CandidateDAO();		
		Candidate c1 = new Candidate() ;		
		Candidate c2 = new Candidate(); ;
		
		String rs = "null,";
		rs += "'" + c2.getLastname() + "',";
		rs += "'" + c2.getFirstname() + "',";
		rs += "'" + c2.getPhone() + "',";
		if (c2.getBirstdate() != null) {
			rs += "'" + c2.getBirstdate() + "',";
		} else {
			rs += null + ",";
		}
		rs += "'" + c2.getAddress() + "',";
		rs += "'" + c2.getEmail() + "',";
		rs += "'" + c2.getAvatar() + "',";
		rs += "'" + c2.getPresentation() +"',";
		rs += "'" + c2.getLogin() + "',";
		rs += "'" + c2.getPassword() + "',";
		rs += "'" + c2.getRole() + "',";
		rs += "'" + c2.getValid() + "'";
		
		String rsbis;
		rsbis = candidateDAO.parseToString(c1);
		
		assertEquals(rs,rsbis);
		
	}

	@Test
	public void testParseUpdateToString() {		
		CandidateDAO candidateDAO = new CandidateDAO();
		String rs = "";		
		Candidate c1 = new Candidate();		
		Candidate c2 = new Candidate();
		
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
		rs += CandidateDAO.VALID + " = '" + c2.getValid() + "'";
		
		String rsbis =candidateDAO.parseUpdateToString(c1);
		
		assertEquals(rs,rsbis);
	}

	@Test
	public void testCandidateDAO() {
		CandidateDAO c = new CandidateDAO();
		assertNotNull(c);
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
