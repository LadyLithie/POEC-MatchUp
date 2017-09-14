/**
 * 
 */
package fr.yas.matchuptest.database;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.database.ProposalDAO;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.Skill;
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
	 */
	@Test
	public void testParseToObject() {
		ResultSet result = testDao.executeRequest("SELECT * FROM "+ProposalDAO.TABLE+" WHERE "+ProposalDAO.ID+" = 1");
		
		assertNotNull(testDao.parseToObject(result));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseToString() {
		Proposal test = new Proposal("Testeur", new ContractType("CDD"));
		
		String sqlString = "0.0,'Testeur',null,null,'0.0',null,null";
		
		assertEquals(sqlString, testDao.parseToString(test));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.ProposalDAO#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseUpdateToString() {
		Proposal test = new Proposal("Testeur", new ContractType("CDD"));
		
		String sqlString = "title_job = 'Testeur',address = null,presentation_job = null,contract_id = '0.0'enterprise_id = null,headhunter_id = null,";
		
		assertEquals(sqlString, testDao.parseUpdateToString(test));
	}

}
