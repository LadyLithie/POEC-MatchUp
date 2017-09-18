/**
 * 
 */
package fr.yas.matchuptest.database;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

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
	public void testGetInstanceValid() {
		DBManager test1 = DBManager.getInstance();
		
		assertEquals(DBManager.getInstance(), test1);
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getCon()}.
	 */
	@Test
	public void testGetCon() {
		assertNotNull(DBManager.getInstance().getCon());
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
			creaCon = DriverManager.getConnection(conCrea.getMetaData().getURL(), "root", "");

		assertEquals(conCrea.getMetaData().getURL(), creaCon.getMetaData().getURL());
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
			creaCon = DriverManager.getConnection(conCrea.getMetaData().getURL(), "jean-luison", "patator");

		fail("Exception not correctly returned");
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
			ResultSet rs = (stmt1.executeQuery("SHOW DATABASES;"));
			while(rs.next()){
				if (rs.getString(1).equals(dbName)){
					assertTrue(true);
					break;
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				stmt = DBManager.getInstance().getCreaCon().createStatement();
				stmt.execute("DROP DATABASE IF EXISTS "+dbName+ " ;");		
			}catch(SQLException e){
				e.printStackTrace();
				fail("Database not found");
			}
		}
		
		
	}
	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#getDbName()}.
	 */
	@Test
	public void testGetDbName() {
		assertTrue(!DBManager.getInstance().getDbName().equals(""));
	}

	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#deleteDB()}.
	 */
	@Test
	public void testDeleteDB() {
		String dbName = "test";
		Statement stmt;
		try {
			stmt = DBManager.getInstance().getCon().createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS "+dbName+ " ;");		
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		DBManager.getInstance().deleteDB();
		
		Statement stmt1;
		try {
			stmt1 = DBManager.getInstance().getCon().createStatement();
			ResultSet rs = (stmt1.executeQuery("SHOW DATABASES;"));
			while(rs.next()){
				if (rs.getString(1).equals(dbName)){
					assertTrue(true);
					break;
				}
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				stmt1 = DBManager.getInstance().getCon().createStatement();
				stmt1.execute("DROP DATABASE IF EXISTS "+dbName+ " ;");		
			}catch(SQLException e){
				e.printStackTrace();
				fail("Database not found");
			}
		}	
		
	}
	
	public void closeConectionAfterDeleteDB(){
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
	 * @throws ClassNotFoundException 
	 */
	@Test(expected = ClassNotFoundException.class)
	public void testConnectCreaStringStringStringStringDriver() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Drive");
		
		fail("Exception not correctly return");
	}
	
	/**
	 * Test method for {@link fr.yas.matchup.database.DBManager#connectCrea(java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
	 * @throws SQLException 
	 */
	@Test(expected = SQLException.class)
	public void testConnectCreaStringStringStringString() throws SQLException {
		String login = "test";
		String pwd = "";
		String port = "33";
		String serverAddress = "localhost";
		
		DriverManager.getConnection("jdbc:mysql://" + serverAddress + ":" + port + "/", login, pwd);
	}

}
