/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.ContractType;
import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public class ContractDAO extends BaseDAO {
	public static final String TABLE = "contract_type";
	public static final String ID = "id_contract";
	public static final String NAME = "name_contract";

	/**
	 * 
	 */
	public ContractDAO() {
		super(TABLE, ID);
	}
	
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseToObject(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
		ContractType contract=new ContractType();
		try {
			contract.setName(resultSet.getString(NAME));
			contract.setId(resultSet.getDouble(ID));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contract;
		
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
