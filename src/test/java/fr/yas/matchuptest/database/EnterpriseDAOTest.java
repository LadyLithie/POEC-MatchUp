/**
 * 
 */
package fr.yas.matchuptest.database;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.DBManager;
import fr.yas.matchup.database.EnterpriseDAO;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.base.BaseEntity;
import fr.yas.matchup.utils.processexecution.ProcessManager;

/**
 * @author Audrey
 *
 */
public class EnterpriseDAOTest {
	private static ProcessManager process = null;
	private static EnterpriseDAO testDao;
	private Enterprise idTest;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
		testDao = new EnterpriseDAO();
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
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#parseToObject(java.sql.ResultSet)}.
	 */
	@Test
	public void testParseToObject() {
		idTest = new Enterprise("userOne", "The Company", "00000000", "no email", null, null, null, null, "lololo",
				"pwdlolo");
		testDao.insert(idTest);

		ResultSet result = testDao
				.executeRequest("SELECT * FROM enterprise WHERE " + EnterpriseDAO.ID + " = " + idTest.getId());
		Enterprise entityResult = new Enterprise();
		try {
			if (result.next()) {
				entityResult = (Enterprise) testDao.parseToObject(result);
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

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#parseToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseToString() {
		idTest = new Enterprise("userOne", "The Company", "00000000", "no email", null, null, null, null, "lolo",
				"pwdlolo");
		
		String sqlString ="null,'The Company','00000000','lolo','null','null','no email','null','null','null','null','null','null','userOne','null'";
		
		assertEquals(sqlString,testDao.parseToString(idTest));
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testParseUpdateToString() {
		idTest = new Enterprise("userOne", "The Company", "00000000", "no email", null, null, null, null, "lolo",
				"pwdlolo");

		String sqlString = "name_enterprise = 'The Company',phone_enterprise = '00000000',address_enterprise = 'lolo',city_enterprise = 'null',website_enterprise = 'null',mail_enterprise = 'no email',presentation_enterprise = 'null',logo_enterprise = 'null',twitter_enterprise = 'null',linkedin_enterprise = 'null',activityfield_enterprise = 'null',role_enterprise = 'null',login_enterprise = 'userOne',password_enterprise = 'null'";

		assertEquals(sqlString, testDao.parseUpdateToString(idTest));
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#EnterpriseDAO()}.
	 */
	@Test
	public void testEnterpriseDAO() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#getHeadhunters(fr.yas.matchup.entities.Enterprise)}.
	 */
	@Test
	public void testGetHeadhunters() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#insertHeadhunter(fr.yas.matchup.entities.Enterprise)}.
	 */
	// Add a link between existing Company and Headhunter
	@Test
	public void testInsertHeadhunterValid() {
		Headhunter h1 = new Headhunter();
		h1.setId(2);
		idTest = new Enterprise();
		idTest.setId(5);
		idTest.getAssociates().add(h1);

		assertEquals(idTest.getAssociates().size(), testDao.insertHeadhunter(idTest));
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#insertHeadhunter(fr.yas.matchup.entities.Enterprise)}.
	 */
	// insert a new one (headhunter not present)
	@Test
	public void testInsertHeadhunterNotPresent() {
		Headhunter h1 = new Headhunter();
		h1.setId(10);
		idTest = new Enterprise();
		idTest.setId(5);
		idTest.getAssociates().add(h1);

		assertEquals(-1452, testDao.insertHeadhunter(idTest));

	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.EnterpriseDAO#deleteHeadhunter(fr.yas.matchup.entities.Enterprise)}.
	 */
	// test when enterprise not present in table
	@Test
	public void testDeleteHeadhunter() {
		idTest = new Enterprise();
		idTest.setId(3);

		int testResult = testDao.deleteHeadhunter(idTest);
		assertEquals(0, testResult);
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.base.BaseDAO#delete(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testDeleteBaseEntity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.base.BaseDAO#get(double)}.
	 */
	@Test
	public void testGetDouble() {
		Statement stmt;
		idTest = null;
		try {
			stmt = DBManager.getInstance().getCon().createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT * FROM " + EnterpriseDAO.TABLE);
			if (rSet.next())
				idTest = (Enterprise) testDao.get(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(idTest);
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.base.BaseDAO#get()}.
	 */
	@Test
	public void testGet() {
		List<BaseEntity> getAll = testDao.get();

		Statement stmt;
		try {
			stmt = DBManager.getInstance().getCon().createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT COUNT(*) as nb FROM " + EnterpriseDAO.TABLE);
			if (rSet.next()) {
				assertEquals(rSet.getLong("nb"), getAll.size());
				return;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail();
	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.base.BaseDAO#insert(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testInsert() {
		idTest = new Enterprise("userOne", "The Company", "00000000", "no email", null, null, null, null, null, null);
		testDao.insert(idTest);

		BaseEntity entity = null;
		Statement stmt;
		try {
			stmt = DBManager.getInstance().getCon().createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT * FROM " + EnterpriseDAO.TABLE + " WHERE " + EnterpriseDAO.ID
					+ " = '" + idTest.getId() + "'");
			if(rSet.next()){
				entity = testDao.parseToObject(rSet);
			}else{
				entity = null;
			}
		} catch (SQLException e) {
			System.out.println("insert error");
			// e.printStackTrace();
		}
		assertNull(entity);

	}

	/**
	 * Test method for
	 * {@link fr.yas.matchup.database.base.BaseDAO#update(fr.yas.matchup.entities.base.BaseEntity)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
