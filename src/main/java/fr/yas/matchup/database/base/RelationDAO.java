/**
 * 
 */
package fr.yas.matchup.database.base;

import java.util.List;

import fr.yas.matchup.database.IDAOBase;

/**
 * @author Audrey
 *
 */
public abstract class RelationDAO implements IDAOBase {
	private String table;
	private List<String> ids;

	/**
	 * @return the table
	 */
	public String getTable() {
		return table;
	}

	/**
	 * @return the ids
	 */
	public List<String> getIds() {
		return ids;
	}

	/**
	 * 
	 */
	public RelationDAO(String table, List<String> id) {
		this.table = table;
		this.ids = id;
	}

}
