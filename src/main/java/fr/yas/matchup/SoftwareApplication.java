/**
 * 
 */
package fr.yas.matchup;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.SkillDAO;
import fr.yas.matchup.entities.Skill;

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
		Skill skill = new Skill(0, "testing", "savoir-faire");
		
		dao.insert(skill);
		ResultSet resultSet = dao.executeRequest("SELECT * FROM SKILL");
		System.out.println(skill.toString());

		try {
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(SkillDAO.ID)+","+resultSet.getString(SkillDAO.NAME));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
