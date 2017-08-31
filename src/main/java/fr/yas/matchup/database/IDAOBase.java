/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.util.List;

import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public interface IDAOBase {
	public ResultSet executeRequest(String request);
	public BaseEntity parseResultSetToObject(ResultSet resultSet) ;
	public String parseObjectToString(BaseEntity item);
	public void insert(BaseEntity item) ;
	public void update(BaseEntity item) ;
	public void delete(BaseEntity item) ;
	public void delete();
	public BaseEntity get(double id) ;
	public List<BaseEntity> get();
	
}
