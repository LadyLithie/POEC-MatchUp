package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.yas.matchup.entities.Administrator;
import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.base.BaseEntity;

public class AdministratorDAO extends BaseDAO{
	
	public static final String TABLE ="administrator";
	public static final String ID ="id_admin";
	public static final String LASTNAME = "lastname_admin";
	public static final String FIRSTNAME = "firstname_admin";
	public static final String MAIL = "mail_admin";
	public static final String PHONE = "phone_admin";
	public static final String ROLE = "role_admin";
	public static final String LOGIN = "login_admin";
	public static final String PASSWORD = "password_admin";

	
	
	public AdministratorDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
		Administrator admin = new Administrator();
		
		try {
			admin.setId(resultSet.getDouble(ID));
			admin.setLastname(resultSet.getString(LASTNAME));
			admin.setFirstname(resultSet.getString(FIRSTNAME));
			admin.setEmail(resultSet.getString(MAIL));
			admin.setPhone(resultSet.getDouble(PHONE));
			admin.setRole(resultSet.getString(ROLE));
			admin.setLogin(resultSet.getString(LOGIN));
			admin.setPassword(resultSet.getString(PASSWORD));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			admin = null;
		}
		
		return admin;
	}

	@Override
	public String parseToString(BaseEntity item) {
		String res = "null,";
		Administrator admin = (Administrator) item;
		
		res += "'"+admin.getLastname()+"',";
		res += "'"+admin.getFirstname()+"',";
		res += "'"+admin.getEmail()+"',";
		res += "'"+admin.getPhone()+"',";
		res += "'"+admin.getRole()+"',";
		res += "'"+admin.getLogin()+"',";
		res += "'"+admin.getPassword()+"'";

		return res;
	}

	@Override
	public String parseUpdateToString(BaseEntity item) {
		String res = "";
		Administrator admin = (Administrator) item;
		
		res += FIRSTNAME + " = '"+admin.getFirstname()+"',";
		res += LASTNAME + " = '"+admin.getLastname()+"',";
		res += MAIL + " = '"+admin.getEmail()+"',";
		res += PHONE + " = '"+admin.getPhone()+"',";
		res += ROLE + " = '"+admin.getRole()+"',";
		res += LOGIN + " = '"+admin.getLogin()+"',";
		res += PASSWORD + " = '"+admin.getPassword()+"'";

		return res;
	}
	
	
}
