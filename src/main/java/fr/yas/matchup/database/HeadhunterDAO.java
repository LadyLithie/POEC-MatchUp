package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.entities.Headhunter;
import fr.yas.matchup.entities.base.BaseEntity;

public class HeadhunterDAO extends RegisteredUserDAO {
	
	public static final String TABLE = "headhunter";
	public static final String ID = "id_headhunter";
	public static final String LASTNAME = "lastname_headhunter";
	public static final String FIRSTNAME = "firstname_headhunter";
	public static final String PHONE = "phone_headhunter";
	public static final String MAIL = "mail_headhunter";
	public static final String PICTURE = "picture_headhunter";
	public static final String TWITTER = "twitter_headhunter";
	public static final String LINKEDIN = "linkedin_headhunter";
	public static final String PRESENTATION ="presentation_headhunter";
	public static final String ROLE ="role_headhunter";
	public static final String LOGIN ="login_headhunter";
	public static final String PASSWORD="password_headhunter";
	
	public HeadhunterDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BaseEntity parseToObject(ResultSet rs) {
		Headhunter headhunter = new Headhunter();

		try {
			headhunter.setId(rs.getDouble(ID));
			headhunter.setLastname(rs.getString(LASTNAME));
			headhunter.setFirstname(rs.getString(FIRSTNAME));
			headhunter.setPhone(rs.getString(PHONE));
			headhunter.setEmail(rs.getString(MAIL));
			headhunter.setAvatar(rs.getString(PICTURE));
			headhunter.setTwitter(rs.getString(TWITTER));
			headhunter.setLinkedin(rs.getString(LINKEDIN));
			headhunter.setPresentation(rs.getString(PRESENTATION));
			headhunter.setRole(rs.getString(ROLE));
			headhunter.setLogin(rs.getString(LOGIN));
			headhunter.setPassword(rs.getString(PASSWORD));
			headhunter.setName(headhunter.getFirstname() + " " + headhunter.getLastname());
		} catch (SQLException e) {
			e.printStackTrace();
			headhunter = null;
		}

		return headhunter;
	}

	@Override
	public String parseToString(BaseEntity item) {
		String result = "null,";
		Headhunter headhunter = (Headhunter) item;

		result += "'" + headhunter.getLastname() + "',";
		result += "'" + headhunter.getFirstname() + "',";
		result += "'" + headhunter.getPhone() + "',";
		result += "'" + headhunter.getEmail() + "',";
		result += "'" + headhunter.getAvatar() + "',";
		result += "'" + headhunter.getTwitter() + "',";
		result += "'" + headhunter.getLinkedin() + "',";
		result += "'" + headhunter.getPresentation() +"',";
		result += "'" + headhunter.getLogin() + "',";
		result += "'" + headhunter.getPassword() + "',";
		result += "'" + headhunter.getRole() + "'";

		return result;
	}

	@Override
	public String parseUpdateToString(BaseEntity item) {
		String res = "";
		Headhunter headhunter = (Headhunter) item;
		
		res += LASTNAME + " = '" + headhunter.getLastname() + "',";
		res += FIRSTNAME + " = '" + headhunter.getFirstname() + "',";
		res += PHONE + " = "+ headhunter.getPhone()+"',";
		res += MAIL + " = "+ headhunter.getEmail()+"',";
		res += PICTURE + " = "+ headhunter.getAvatar()+"',";
		res += TWITTER + " = "+ headhunter.getTwitter()+"',";
		res += LINKEDIN + " = "+ headhunter.getLinkedin()+"',";
		res += PRESENTATION + " = "+ headhunter.getPresentation()+"',";
		res += LOGIN + " = "+ headhunter.getLogin()+"',";
		res += PASSWORD + " = "+ headhunter.getPassword()+"'";
		res += ROLE + " = "+ headhunter.getRole()+"'";
		
		return res;
	}
	
	

}
