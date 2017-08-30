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
	private Connection con;
	
	public void connect() {
		connect("config", "dbconfig");
	}
	
	public void connect(String path, String file) {
		FileManager fileManager = new FileManager(path, file);
		Map<String, Object> datas = fileManager.extractFromPattern();
		connect(datas.get("serverAddress").toString(),datas.get("port").toString(),datas.get("dbName").toString(),
				datas.get("login").toString(),datas.get("password").toString());
	}
	
	/**
	 * Function to connect to a database
	 */
	public void connect(String serverAddress, String port, String dbName, String login, String password) {
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
