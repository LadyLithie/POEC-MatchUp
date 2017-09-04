package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.Candidate;
import fr.yas.matchup.entities.Skill;
import fr.yas.matchup.entities.base.BaseEntity;


public class CandidateDAO extends RegisteredUserDAO {
	
	public static final String TABLE = "candidate";
	public static final String ID = "id_candidate";
	public static final String LASTNAME = "lastname_candidate";
	public static final String FIRSTNAME = "firstname_candidate";
	public static final String PHONE = "phone_candidate";
	public static final String BIRTHDAY = "birthday_candidate";
	public static final String ADDRESS = "address_candidate";
	public static final String MAIL = "mail_candidate";
	public static final String PICTURE = "picture_candidate";
	public static final String PRESENTATION = "presentation_candidate";
	public static final String LOGIN = "login_candidate";
	public static final String PASSWORD = "password_candidate";
	public static final String ROLE = "role_candidate";

	public static final String CANDIDATE_SKILL = "candidate_skill";
	public static final String ID_CANDIDATE = "candidate_id";
	public static final String ID_SKILL = "skill_id";

	public CandidateDAO() {
		super(TABLE, ID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BaseEntity parseToObject(ResultSet rs) {
		Candidate candidate = new Candidate();

		try {
			candidate.setId(rs.getDouble(ID));
			candidate.setLastname(rs.getString(LASTNAME));
			candidate.setFirstname(rs.getString(FIRSTNAME));
			candidate.setPhone(rs.getString(PHONE));
			candidate.setBirstdate(rs.getString(BIRTHDAY));
			candidate.setAddress(rs.getString(ADDRESS));
			candidate.setEmail(rs.getString(MAIL));
			candidate.setAvatar(rs.getString(PICTURE));
			candidate.setPresentation(rs.getString(PRESENTATION));
			candidate.setLogin(rs.getString(LOGIN));
			candidate.setPassword(rs.getString(PASSWORD));
			candidate.setRole(rs.getString(ROLE));
		} catch (SQLException e) {
			e.printStackTrace();
			candidate = null;
		}

		return candidate;
	}

	@Override
	public String parseToString(BaseEntity item) {
		String result = "null,";
		Candidate candidate = (Candidate) item;

		result += "'" + candidate.getLastname() + "',";
		result += "'" + candidate.getFirstname() + "',";
		result += "'" + candidate.getPhone() + "',";
		result += "'" + candidate.getBirstdate() + "',";
		result += "'" + candidate.getAddress() + "',";
		result += "'" + candidate.getEmail() + "',";
		result += "'" + candidate.getAvatar() + "',";
		result += "'" + candidate.getPresentation() +"',";
		result += "'" + candidate.getLogin() + "',";
		result += "'" + candidate.getPassword() + "',";
		result += "'" + candidate.getRole() + "'";

		return result;
	}

	@Override
	public String parseUpdateToString(BaseEntity item) {
		String result = "";
		Candidate candidate = (Candidate) item;

		result += LASTNAME + " = '" + candidate.getLastname() + "',";
		result += FIRSTNAME + " = '" + candidate.getFirstname() + "',";
		result += PHONE + " = '" + candidate.getPhone() + "',";
		result += BIRTHDAY + " = '" + candidate.getBirstdate() + "',";
		result += ADDRESS + " = '" + candidate.getAddress() + "',";
		result += MAIL + " = '" + candidate.getEmail() + "',";
		result += PICTURE + " = '" + candidate.getAvatar() + "',";
		result += PRESENTATION + " = '" + candidate.getPresentation() +"',";
		result += LOGIN + " = '" + candidate.getLogin() + "',";
		result += PASSWORD + " = '" + candidate.getPassword() + "',";
		result += ROLE + " = '" + candidate.getRole() + "'";

		return result;
	}
	
	public Candidate getSkills(Candidate candidate) {
		ResultSet rs = executeRequest("SELECT * FROM " + CANDIDATE_SKILL
				+ " WHERE " + ID_CANDIDATE + " = " + candidate.getId());
		List<Double> skillsId = new ArrayList<Double>();
		try {
			while (rs.next()) {
				skillsId.add(rs.getDouble(ID_SKILL));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		BaseDAO skillDAO = new SkillDAO();

		for (Double id : skillsId) {
			candidate.getSkills().add( (Skill) skillDAO.get(id));
		}

		return candidate;
	}

	public int insertSkills(Candidate candidate) {
		int result = 0;
		deleteSkills(candidate);
		for (Skill skill : candidate.getSkills()) {
			result += executeRequestUpdate("INSERT INTO " + CANDIDATE_SKILL
					+ " VALUES(" + candidate.getId() + "," + skill.getId()
					+ ")");
		}
		return result;
	}

	public int deleteSkills(Candidate candidate) {
		return executeRequestUpdate("DELETE FROM " + CANDIDATE_SKILL + " WHERE "
				+ ID_CANDIDATE + " = " + candidate.getId());
	}
	
}
