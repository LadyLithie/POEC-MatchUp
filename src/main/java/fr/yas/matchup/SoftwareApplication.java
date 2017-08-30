/**
 * 
 */
package fr.yas.matchup;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.SkillDAO;

/**
 * @author Audrey
 *
 */
public class SoftwareApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SkillDAO dao = new SkillDAO();
		ResultSet resultSet = dao.executeRequest("SHOW TABLES");

		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
