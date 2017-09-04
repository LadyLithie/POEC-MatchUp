package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.Administrator;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.RegisteredUser;
import fr.yas.matchup.entities.base.BaseEntity;

public class RegisteredUserDAO extends BaseDAO {

	public RegisteredUserDAO() {
		super("NA", "NA");
	}

	public RegisteredUserDAO(String table, String id) {
		super(table, id);
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
		//Test dans la table Entreprise
		ResultSet rs = executeRequest("SELECT * FROM " + EnterpriseDAO.TABLE + " WHERE " + EnterpriseDAO.LOGIN +" = " + login + " AND " + EnterpriseDAO.PASSWORD + " = " + password);
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
		
		//Test dans la table Headhunter
		rs = executeRequest("SELECT * FROM " + HeadhunterDAO.TABLE + " WHERE " + HeadhunterDAO.LOGIN +" = " + login + " AND " + HeadhunterDAO.PASSWORD + " = " + password);
		try {
			if (rs.next()) {
				user = new Headhunter();
				user.setId(rs.getDouble(HeadhunterDAO.ID));
				HeadhunterDAO headhunterDAO = new HeadhunterDAO();
				user = (Headhunter) headhunterDAO.get(user.getId());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Test dans la table Candidate
		rs = executeRequest("SELECT * FROM " + CandidateDAO.TABLE + " WHERE " + CandidateDAO.LOGIN +" = " + login + " AND " + CandidateDAO.PASSWORD + " = " + password);
		try {
			if (rs.next()) {
				user = new Candidate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Test dans la table Administrator
		rs = executeRequest("SELECT * FROM " + AdministratorDAO.TABLE + " WHERE " + AdministratorDAO.LOGIN +" = " + login + " AND " + AdministratorDAO.PASSWORD + " = " + password);
		try {
			if (rs.next()) {
				user = new Administrator();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
}
