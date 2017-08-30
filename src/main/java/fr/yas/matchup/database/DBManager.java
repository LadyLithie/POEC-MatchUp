/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import fr.yas.matchup.utils.file.FileManager;

/**
 * @author Audrey
 *
 */
public class DBManager {
	/**
	 * Singleton
	 */
	private static DBManager instance = null;
	protected DBManager() {
		// Exists only to defeat instantiation.
	}

	public static DBManager getInstance() {
		if (instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	/* Fin singleton */

	/**
	 * Attributes
	 */
	private static final String PASSWORD = "password";
	private static final String LOGIN = "login";
	private static final String DB_NAME = "dbName";
	private static final String PORT = "port";
	private static final String SERVER_ADDRESS = "serverAddress";
	private static final String DBCONFIG = "dbconfig";
	private static final String CONFIG = "config";
	
	private Connection con;
	private String DBNAME = "mydb";
	
	/**
	 * @return the con
	 */
	public Connection getCon() {
		return con;
	}

	/**
	 * @return the dBNAME
	 */
	public String getDBNAME() {
		return DBNAME;
	}

	/**
	 * Function to connect to a database
	 */
	public void connect() {
		connect(CONFIG, DBCONFIG);
	}
	
	/**
	 * Function to connect to a database with path.file
	 */
	public void connect(String path, String file) {
		FileManager fileManager = new FileManager(path, file);
		Map<String, Object> datas = fileManager.extractFromPattern();

		connect(datas.get(SERVER_ADDRESS).toString(),datas.get(PORT).toString(),datas.get(DB_NAME).toString(),
				datas.get(LOGIN).toString(),datas.get(PASSWORD).toString());
	}
	
	/**
	 * Function to connect to a database with separate string
	 */
	public void connect(String serverAddress, String port, String dbName, String login, String password) {
	DBNAME = dbName;
		try {
			//Charge the class Driver from added libs 
			Class.forName("com.mysql.jdbc.Driver");
			//DriverMangaer = Manager the drivers in java
			//Localize our database and how to access it
			con = DriverManager.getConnection("jdbc:mysql://"+serverAddress+":"+port+"/"+dbName, login, password);
			// here sonoo is database name, root is username and password
			
//			//Statement = define query
//			Statement stmt = con.createStatement();
//			//ResultSet = sql result
//			ResultSet rs = stmt.executeQuery("select * from emp");
//			//Treat the data
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			//Close connection
			//con.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
