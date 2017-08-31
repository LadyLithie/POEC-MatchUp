/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public abstract class BaseDAO implements IDAOBase {
	private String table;
	private String id;

	/**
	 * @return the table
	 */
	public String getTable() {
		return table;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	public BaseDAO(String table, String id) {
		this.table = table;
		this.id = id;
	}

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

	/**
	 * Delete an item from the corresponding table
	 */
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#delete(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public void delete(BaseEntity item) {
		executeRequest("DELETE FROM "+ table + "WHERE "+id+" = "+item.getId());
	}

	/**
	 * Delete all items from the table
	 */
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#delete()
	 */
	@Override
	public void delete() {
		executeRequest("DELETE FROM "+ table);
	}

	/**
	 * @return an entity based on its id
	 */
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#get(double)
	 */
	@Override
	public BaseEntity get(double id) {
		BaseEntity entity = null;
		ResultSet rSet = executeRequest("SELECT * FROM "+ table +"WHERE "+ this.id +" = "+ id);
		try {
			rSet.next();
			entity = parseResultSetToObject(rSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return entity;
	}

	/**
	 * @return = all a list of all the entities of a table
	 */
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#get()
	 */
	@Override
	public List<BaseEntity> get() {
		List<BaseEntity> entities = new ArrayList<BaseEntity>();
		ResultSet rSet = executeRequest("SELECT * FROM "+ table);
		
		try {
			while (rSet.next()) {
				entities.add(parseResultSetToObject(rSet));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return entities;
	}

	/**
	 * Insert an entity in a table
	 */
	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#insert(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public void insert(BaseEntity item) {
		executeRequest("INSERT INTO "+ table + "VALUES ("+parseObjectToString(item)+")");
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#update(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public void update(BaseEntity item) {
		// TODO Auto-generated method stub
		
	}

}
