/**
 * 
 */
package fr.yas.matchuptest.database;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.yas.matchup.database.DBManager;
import fr.yas.matchup.utils.processexecution.ProcessManager;

/**
 * @author Audrey
 *
 */
public class DBManagerTest {

	private static ProcessManager process = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		process = new ProcessManager(ProcessManager.WAMP);
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
	 * Test method for {@link fr.yas.matchup.database.DBManager#getInstance()}.
	 */
	//test of singleton
	@Test
	public void testGetInstance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getCon()}.
	 */
	@Test
	public void testGetCon() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getCreaCon()}.
	 */
	@Test
	public void testGetCreaConNotNull() {
		assertNotNull(DBManager.getInstance().getCreaCon());
	}
	
	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getCreaCon()}.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@Test
	public void testGetCreaConValid() throws SQLException, ClassNotFoundException {
		Connection conCrea = DBManager.getInstance().getCreaCon();
		Connection creaCon = null;

			// Charge the class Driver from added libs
			Class.forName("com.mysql.jdbc.Driver");
			// DriverMangaer = Manager the drivers in java
			// Localize our database and how to access it
			creaCon = DriverManager.getConnection("jdbc:mysql://" + conCrea.getMetaData().getURL(), "root", "");

		assertEquals(conCrea, creaCon);
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getCreaCon()}.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@Test(expected = SQLException.class)
	public void testGetCreaConNotValid() throws SQLException, ClassNotFoundException {
		Connection conCrea = DBManager.getInstance().getCreaCon();
		Connection creaCon = null;

			// Charge the class Driver from added libs
			Class.forName("com.mysql.jdbc.Driver");
			// DriverMangaer = Manager the drivers in java
			// Localize our database and how to access it
			creaCon = DriverManager.getConnection("jdbc:mysql://" + conCrea.getMetaData().getURL(), "jean-luison", "patator");

		assertNotEquals(conCrea, creaCon);
	}
	
	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getCreaCon()}.
	 */
	@Test
	public void testGetCreaConRequest() {
		Statement stmt;
		String dbName = "dbTest";
		
		try {
			stmt = DBManager.getInstance().getCreaCon().createStatement();

			stmt.execute("CREATE DATABASE IF NOT EXISTS "+dbName +";");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		Statement stmt1;
		try {
			stmt1 = DBManager.getInstance().getCreaCon().createStatement();
			assertTrue(stmt1.execute("USE "+dbName +";"));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getDbName()}.
	 */
	@Test
	public void testGetDbName() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#deleteDB()}.
	 */
	@Test
	public void testDeleteDB() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connect()}.
	 */
	@Test
	public void testConnect() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connect(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testConnectStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connect(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testConnectStringStringStringStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connectCrea()}.
	 */
	@Test
	public void testConnectCrea() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connectCrea(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testConnectCreaStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connectCrea(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testConnectCreaStringStringStringString() {
		fail("Not yet implemented");
	}

}
