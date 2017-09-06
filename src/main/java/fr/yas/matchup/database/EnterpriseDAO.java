/**
 * 
 */

package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.base.BaseEntity;

import java.util.ArrayList;
import java.util.List;

import fr.yas.matchup.entities.Headhunter;

public class EnterpriseDAO extends RegisteredUserDAO {
	
	public static final String TABLE ="enterprise";
	public static final String ID ="id_enterprise";
	public static final String NAME ="name_enterprise";
	public static final String PHONE ="phone_enterprise";
	public static final String ADDRESS ="address_enterprise";
	public static final String CITY ="city_enterprise";
	public static final String WEBSITE = "website_enterprise";
	public static final String MAIL = "mail_enterprise";
	public static final String PRESENTATION ="presentation_enterprise";
	public static final String LOGO ="logo_enterprise";
	public static final String TWITTER ="twitter_enterprise";
	public static final String LINKEDIN ="linkedin_enterprise";
	public static final String ACTIVITY ="activityfield_enterprise";
	public static final String ROLE ="role_enterprise";
	public static final String LOGIN ="login_enterprise";
	public static final String PASSWORD="password_enterprise";
	
	public static final String ENTERPRISE_HEADHUNTER ="headhunter_enterprise";
	public static final String ID_ENTERPRISE ="enterprise_id";
	public static final String ID_HEADHUNTER ="headhunter_id";
	
	public EnterpriseDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
		Enterprise e = new Enterprise();
		
		try {
			e.setId(resultSet.getDouble(ID));
			e.setName(resultSet.getString(NAME));
			e.setPhone(resultSet.getString(PHONE));
			e.setAddress(resultSet.getString(ADDRESS));
			e.setCity(resultSet.getString(CITY));
			e.setWebsite(resultSet.getString(WEBSITE));
			e.setEmail(resultSet.getString(MAIL));
			e.setPresentation(resultSet.getString(PRESENTATION));
			e.setAvatar(resultSet.getString(LOGO));
			e.setTwitter(resultSet.getString(TWITTER));
			e.setLinkedin(resultSet.getString(LINKEDIN));
			e.setActivity(resultSet.getString(ACTIVITY));
			e.setRole(resultSet.getString(ROLE));
			e.setLogin(resultSet.getString(LOGIN));
			e.setPassword(resultSet.getString(PASSWORD));			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			e = null;
		}
		
		return e;
	}

	@Override
	public String parseToString(BaseEntity item) {
		String res = "null,";
		Enterprise enterprise = (Enterprise) item;
		
		res += "'"+enterprise.getName()+"',";
		res += "'"+enterprise.getPhone()+"',";
		res += "'"+enterprise.getAddress()+"',";
		res += "'"+enterprise.getCity()+"',";
		res += "'"+enterprise.getWebsite()+"',";
		res += "'"+enterprise.getEmail()+"',";
		res += "'"+enterprise.getPresentation()+"',";
		res += "'"+enterprise.getAvatar()+"',";
		res += "'"+enterprise.getTwitter()+"',";
		res += "'"+enterprise.getLinkedin()+"',";
		res += "'"+enterprise.getActivity()+"',";
		res += "'"+enterprise.getRole()+"',";
		res += "'"+enterprise.getLogin()+"',";
		res += "'"+enterprise.getPassword()+"'";
		
		return res;
	}

	@Override
	public String parseUpdateToString(BaseEntity item) {
		String res = "";
		Enterprise enterprise = (Enterprise) item;
		
		res += NAME + " = "+enterprise.getName()+"',";
		res += PHONE + " = "+enterprise.getPhone()+"',";
		res += ADDRESS + " = "+enterprise.getAddress()+"',";
		res += CITY + " = "+enterprise.getCity()+"',";
		res += WEBSITE + " = "+enterprise.getWebsite()+"',";
		res += MAIL + " = "+enterprise.getEmail()+"',";
		res += PRESENTATION + " = "+enterprise.getPresentation()+"',";
		res += LOGO + " = "+enterprise.getAvatar()+"',";
		res += TWITTER + " = "+enterprise.getTwitter()+"',";
		res += LINKEDIN + " = "+enterprise.getLinkedin()+"',";
		res += ACTIVITY + " = "+enterprise.getActivity()+"',";
		res += ROLE + " = "+enterprise.getRole()+"',";
		res += LOGIN + " = "+enterprise.getLogin()+"',";
		res += PASSWORD + " = "+enterprise.getPassword()+"'";
		
		return res;
	}

	public Enterprise getHeadhunters(Enterprise enterprise) {
		ResultSet rs = executeRequest("SELECT * FROM " + ENTERPRISE_HEADHUNTER
				+ " WHERE " + ID_ENTERPRISE + " = " + enterprise.getId());
		List<Double> headhuntersId = new ArrayList<Double>();
		try {
			while (rs.next()) {
				headhuntersId.add(rs.getDouble(ID_ENTERPRISE));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		EnterpriseDAO enterpriseDAO = new EnterpriseDAO();

		for (Double id : headhuntersId) {
			enterprise.getAssociates().add( (Headhunter) enterpriseDAO.get(id));
		}

		return enterprise;
	}

	public int insertHeadhunter(Enterprise enterprise) {
		int result = 0;
		deleteHeadhunter(enterprise);
		for (Headhunter headhunter : enterprise.getAssociates()) {
			result += executeRequestUpdate("INSERT INTO " + ENTERPRISE_HEADHUNTER
					+ " VALUES(" + enterprise.getId() + "," + headhunter.getId()
					+ ")");
		}
		return result;
	}

	public int deleteHeadhunter(Enterprise enterprise) {
		return executeRequestUpdate("DELETE FROM " + ENTERPRISE_HEADHUNTER + " WHERE "
				+ ID_ENTERPRISE + " = " + enterprise.getId());
	}

}
