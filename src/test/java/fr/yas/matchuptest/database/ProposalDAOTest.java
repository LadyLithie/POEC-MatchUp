/**
 * 
 */
package fr.yas.matchuptest.database;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.ProposalDAO;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.utils.processexecution.ProcessManager;

/**
 * @author Audrey
 *
 */
public class ProposalDAOTest {
	private static ProcessManager process;
	private static ProposalDAO testDao;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		testDao = new ProposalDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		process.close();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#ProposalDAO()}.
	 */
	@Test
	public void testProposalDAO() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseToObject(java.sql.ResultSet)}.
	 * @throws SQLException 
	 */
	@Test
	public void testParseToObject() throws SQLException {
		ResultSet result = testDao.executeRequest("SELECT * FROM "+ProposalDAO.TABLE+" WHERE "+ProposalDAO.ID+" = 1");
		result.next();
		assertNotNull(testDao.parseToObject(result));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseToString() {
		Proposal test = new Proposal();
		test.setName("Testeur");
		
		String sqlString = "0.0,'Testeur',null,null,null,null,null";
		
		assertEquals(sqlString, testDao.parseToString(test));
	}
	
	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseToStringFull() {
		ContractType cType = new ContractType("CDD");
		cType.setId(1);
		Proposal test = new Proposal("Testeur", cType);
		test.setCompany(new Enterprise());
		test.getCompany().setId(3);
		test.setHeadhunter(new Headhunter());
		test.getHeadhunter().setId(1);
		test.setLocalization(": ,22,test");
		test.setPresentation("blabla");
		
		String sqlString = "0.0,'Testeur',': ,22,test','blabla','1.0','3.0','1.0'";
		
		assertEquals(sqlString, testDao.parseToString(test));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseUpdateToStringEmpty() {
		Proposal test = new Proposal();
		test.setName("Testeur");
		
		String sqlString = "title_job = 'Testeur',address = null,presentation_job = null,contract_id = null,enterprise_id = null,headhunter_id = null";
		
		assertEquals(sqlString, testDao.parseUpdateToString(test));
	}
	
	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseUpdateToStringFull() {
		ContractType cType = new ContractType("CDD");
		cType.setId(1);
		Proposal test = new Proposal("Testeur", cType);
		test.setCompany(new Enterprise());
		test.getCompany().setId(3);
		test.setHeadhunter(new Headhunter());
		test.getHeadhunter().setId(1);
		test.setLocalization(": ,22,test");
		test.setPresentation("blabla");

		String sqlString = "title_job = 'Testeur',address = ': ,22,test',presentation_job = 'blabla',contract_id = '1.0',enterprise_id = '3.0',headhunter_id = '1.0'";
		
		assertEquals(sqlString, testDao.parseUpdateToString(test));
	}
}
