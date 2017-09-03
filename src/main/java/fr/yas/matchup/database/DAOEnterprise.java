/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public class DAOEnterprise extends BaseDAO {
	public static final String TABLE = "enterprise";
	public static final String ID = "id_enterprise";
	public static final String NAME = "name_enterprise";
	public static final String EMAIL = "mail_enterprise";
	public static final String LOGIN = "login";
	public static final String PASSWORD = "password";
	public static final String PRESENTATION = "presentation_enterprise";
	public static final String LOGO = "logo_enterprise";
	public static final String PHONE = "phone_enterprise";
	public static final String ADDRESS = "address_enterprise";
	public static final String WEBSITE = "website_enterprise";
	public static final String TWITTER = "twitter_enterprise";
	public static final String LINKEDIN = "linkedin_enterprise";
	public static final String SIRET = "siret";

	/**
	 * 
	 */
	public DAOEnterprise() {
		super(TABLE, ID);
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseToObject(java.sql.ResultSet)
	 */
	@Override
	public BaseEntity parseToObject(ResultSet resultSet) {
		Enterprise user = new Enterprise();
		
		try {
			user.setId(resultSet.getDouble(ID));
			user.setAddress(resultSet.getString(ADDRESS));
			user.setLogin(resultSet.getString(LOGIN));
			user.setName(resultSet.getString(NAME));
			user.setPassword(resultSet.getString(PASSWORD));
			user.setAvatar(resultSet.getString(LOGO));
			user.setEmail(resultSet.getString(EMAIL));
			user.setPhone(resultSet.getString(PHONE));
			user.setPresentation(resultSet.getString(PRESENTATION));
			user.setSiretNumber(resultSet.getString(SIRET));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseToString(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public String parseToString(BaseEntity item) {
		String request;
		
		Enterprise enterprise = ((Enterprise)item);
		request = String.valueOf(enterprise.getId());
		request += ",'"+enterprise.getLogin()+"'";
		request += ",'"+enterprise.getPassword()+"'";
		request += ",'"+enterprise.getName()+"'";
		request += ",'"+enterprise.getAddress()+"'";
		request += ",'"+enterprise.getWebsite()+"'";
		request += ",'"+enterprise.getEmail()+"'";
		request += ",'"+enterprise.getPresentation()+"'";
		request += ",'"+enterprise.getAvatar()+"'";
		request += ",'"+enterprise.getSiretNumber()+"'";

		return request;

	}

	/* (non-Javadoc)
	 * @see fr.yas.matchup.database.IDAOBase#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)
	 */
	@Override
	public String parseUpdateToString(BaseEntity item) {
		String request;
		
		Enterprise enterprise = ((Enterprise)item);
		request = NAME +" = '"+enterprise.getName()+"'";
		request += ADDRESS +" = '"+enterprise.getAddress()+"'";
		request += WEBSITE +" = '"+enterprise.getWebsite()+"'";
		request += PHONE +" = '"+enterprise.getPhone()+"'";
		request += EMAIL +" = '"+enterprise.getEmail()+"'";
		request += PRESENTATION +" = '"+enterprise.getPresentation()+"'";
		request += LOGO +" = '"+enterprise.getAvatar()+"'";
		request += SIRET +" = '"+enterprise.getSiretNumber()+"'";
//		request += ADDRESS +" = '"+enterprise.getAddress()+"'";
//		request += ADDRESS +" = '"+enterprise.getAddress()+"'";
		
		return request;
	}

}
