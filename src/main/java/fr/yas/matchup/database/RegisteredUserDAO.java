package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.entities.base.BaseEntity;

public class RegisteredUserDAO extends BaseDAO {

	public RegisteredUserDAO() {
		super("NA", "NA");
	}

	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parseToString(BaseEntity item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parseUpdateToString(BaseEntity item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public RegisteredUser connection(String login, String password) {
		RegisteredUser user = null;
		
		ResultSet rs = executeRequest("SELECT * FROM " + EnterpriseDAO.TABLE + " WHERE login = " + login + " AND password = " + password);
		try {
			if (rs.next()) {
				user = new Enterprise();
				user.setId(rs.getDouble(EnterpriseDAO.ID));
				EnterpriseDAO enterpriseDAO = new EnterpriseDAO();
				user = (Enterprise) enterpriseDAO.get(user.getId());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rs = executeRequest("SELECT * FROM " + EnterpriseDAO.TABLE + " WHERE login = " + login + " AND password = " + password);
		try {
			if (rs.next()) {
				user = new Enterprise();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rs = executeRequest("SELECT * FROM " + EnterpriseDAO.TABLE + " WHERE login = " + login + " AND password = " + password);
		try {
			if (rs.next()) {
				user = new Enterprise();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}
