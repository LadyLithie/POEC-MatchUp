/**
 * 
 */
package fr.yas.matchuptest.database;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.SkillDAO;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.utils.processexecution.ProcessManager;

/**
 * @author Audrey
 *
 */
public class SkillDAOTest {
	private static ProcessManager process;
	private static SkillDAO testDao;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
		testDao = new SkillDAO();
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
	 * Test method for {@link fr.yas.matchup.database.SkillDAO#SkillDAO()}.
	 */
	@Test
	public void testSkillDAO() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.SkillDAO#parseToObject(java.sql.ResultSet)}.
	 */
	@Test
	public void testParseToObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.SkillDAO#parseToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseToString() {
		Skill test = new Skill("test","test");
		
		System.out.println(testDao.parseToString(test));
		String sqlString = "";
		
		assertEquals(sqlString, testDao.parseToString(test));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.SkillDAO#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseUpdateToString() {
		Skill test = new Skill("test","test");
		
		System.out.println(testDao.parseToString(test));
		String sqlString = "";
		
		assertEquals(sqlString, testDao.parseUpdateToString(test));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.base.BaseDAO#delete(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testDeleteBaseEntity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.base.BaseDAO#update(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
