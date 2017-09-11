package fr.yas.matchup.database;

import java.sql.ResultSet;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.base.BaseEntity;

public class AssociatesDAO extends BaseDAO{

	private static final String TABLE = "headhunter_enterprise";
	private static final String ID_HEADHUNTER = "headhunter_id";
	private static final String ID_ENTERPRISE = "enterprise_id";
	//quid d'une clef primaire double ?
	
	public AssociatesDAO() {
		super(TABLE,ID_ENTERPRISE);
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseToObject(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseToString(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public String parseToString(BaseEntity item) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public String parseUpdateToString(BaseEntity item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
