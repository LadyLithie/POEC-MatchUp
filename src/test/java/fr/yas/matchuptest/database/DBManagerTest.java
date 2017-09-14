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
 * @author Sacha
 *
 */
public class DBManagerTest {
	
	private static ProcessManager process;
	private static Connection conCrea;

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

	@Test
	public void testGetCreaConNotNull() {
		assertNotNull (DBManager.getInstance().getCreaCon());
	}
	
	@Test
	public void testGetCreaConValid() throws ClassNotFoundException, SQLException {
		conCrea = DBManager.getInstance().getCreaCon();
		Connection creaCon =null;
							
		Class.forName("com.mysql.jdbc.Driver");	
		creaCon = DriverManager.getConnection(conCrea.getMetaData().getURL(), "root", "");
		
		assertEquals(conCrea.getMetaData().getURL(), creaCon.getMetaData().getURL());
		
	}
	
	@Test(expected = SQLException.class)
	public void testGetCreaConNotValid() throws ClassNotFoundException, SQLException {
		conCrea = DBManager.getInstance().getCreaCon();
		Connection creaCon =null;
							
		Class.forName("com.mysql.jdbc.Driver");	
		creaCon = DriverManager.getConnection(conCrea.getMetaData().getURL(), "toto", "eltata");
		assertNotEquals(conCrea, creaCon);
		
	}
	
	public void testGetCreaConRequest(){
		String dbName = "dbtestpoec2017";
		Statement stmt;
		try {
			stmt = DBManager.getInstance().getCreaCon().createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS "+dbName+ " ;");		
		}catch(SQLException e){
			e.printStackTrace();
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
			stmt = DBManager.getInstance().getCreaCon().createStatement();
			stmt.execute("CREATE DATABASE IF NOT EXISTS "+dbName+ " ;");		
		}catch(SQLException e){
			e.printStackTrace();
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
				stmt1 = DBManager.getInstance().getCreaCon().createStatement();
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
	 */
	@Test
	public void testConnectCreaStringStringStringString() {
		fail("Not yet implemented");
	}

}
