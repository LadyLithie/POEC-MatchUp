/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Audrey
 *
 */
public abstract class BaseDAO implements IDAOBase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.yas.matchup.database.IDAOBase#executeRequest(java.lang.String)
	 */
	@Override
	public ResultSet executeRequest(String request) {
		ResultSet result = null;
		
		try {
			Statement stmt = DBManager.getInstance().getCon().createStatement();
			result = stmt.executeQuery(request);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
