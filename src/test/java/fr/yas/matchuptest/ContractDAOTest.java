package fr.yas.matchuptest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.ContractDAO;
import fr.yas.matchup.database.ProposalDAO;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.utils.processexecution.ProcessManager;

public class ContractDAOTest {
	private static ProcessManager process;
	private static ContractDAO testDao;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
		testDao = new ContractDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
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
		fail("Not yet implemented");
	}

	@Test
	public void testParseToString() {
		ContractType test = new ContractType();
		
		System.out.println(testDao.parseToString(test));
		String sqlString = "";
		
		assertEquals(sqlString, testDao.parseToString(test));
	}

	@Test
	public void testParseUpdateToString() {
		ContractType test = new ContractType();
		
		System.out.println(testDao.parseToString(test));
		String sqlString = "";
		
		assertEquals(sqlString, testDao.parseUpdateToString(test));
	}

}
