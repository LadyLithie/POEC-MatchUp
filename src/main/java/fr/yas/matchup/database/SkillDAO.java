/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public class SkillDAO extends BaseDAO {
	public static final String TABLE = "Skill";
	public static final String ID = "id_skill";
	public static final String NAME = "name_skill";
	public static final String TYPE = "type_skill";
	
	public SkillDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parse(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
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
	 * @see fr.yas.matchup.database.IDAOBase#parseToString(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public String parseToString(BaseEntity item) {
		String request;
		
		Skill skill = ((Skill)item);
		request = String.valueOf(skill.getId());
		request += ",'"+skill.getName().replaceAll("'", " ")+"'";
		request += ",'"+skill.getSkillType()+"'";
		
		return request;
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public String parseUpdateToString(BaseEntity item) {
		String request;
		
		Skill skill = ((Skill)item);
		request = NAME +" = '"+skill.getName()+"'";
		request += TYPE +" = '"+skill.getSkillType()+"'";
		
		return request;
	}

}
