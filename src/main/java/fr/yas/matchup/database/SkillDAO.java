/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public class SkillDAO extends BaseDAO {
	public static final String TABLE = "Skill";
	public static final String ID = "id";
	public static final String NAME = "name_skill";
	public static final String TYPE = "type_skill";
	
	public SkillDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Study the result of the SQL query result of the get(id) from BaseDAO
	 */
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseResultSetToObject(ResultSet resultSet) {
		Skill skill = new Skill();
		
		try {
			skill.setId(resultSet.getDouble(ID));
			skill.setName(resultSet.getString(NAME));
			skill.setSkillType(resultSet.getString(TYPE));
		} catch (SQLException e) {
			skill = null;
			e.printStackTrace();
		}
		
		return skill;
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#insert(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public void insert(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#update(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public void update(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String parseObjectToString(BaseEntity item) {
		String request;
		
		Skill skill = ((Skill)item);
		request = String.valueOf(skill.getId());
		request += ","+skill.getName();
		request += ","+skill.getSkillType();
		
		return request;
	}


}
