/**
 * 
 */
package fr.yas.matchup.entities;

import java.util.ArrayList;

/**
 * @author Audrey
 *
 */
public class Candidate extends RegisteredUser {
	private String firstname;
	private String lastname;
	private String birstdate;
	private ArrayList<Diploma> qualifications;
	private ArrayList<String> mobility;

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the birstdate
	 */
	public String getBirstdate() {
		return birstdate;
	}

	/**
	 * @param birstdate the birstdate to set
	 */
	public void setBirstdate(String birstdate) {
		this.birstdate = birstdate;
	}

	/**
	 * @return the qualifications
	 */
	public ArrayList<Diploma> getQualifications() {
		return qualifications;
	}

	/**
	 * @param qualifications the qualifications to set
	 */
	public void setQualifications(ArrayList<Diploma> qualifications) {
		this.qualifications = qualifications;
	}

	/**
	 * @return the mobility
	 */
	public ArrayList<String> getMobility() {
		return mobility;
	}

	/**
	 * @param mobility the mobility to set
	 */
	public void setMobility(ArrayList<String> mobility) {
		this.mobility = mobility;
	}

	/**
	 * 
	 */
	public Candidate() {
		super();
	}

	/**
	 * @param login
	 * @param isConnected
	 * @param name
	 * @param phone
	 * @param email
	 * @param presentation
	 * @param avatar
	 * @param created_at
	 * @param updated_at
	 * @param firstname
	 * @param lastname
	 * @param birstdate
	 * @param qualifications
	 * @param mobility
	 */
	public Candidate(String login, String name, String phone, String email, String presentation,
			String avatar, String created_at, String updated_at, String firstname, String lastname, String birstdate,
			ArrayList<Diploma> qualifications, ArrayList<String> mobility) {
		super(login, name, phone, email, presentation, avatar, created_at, updated_at);
		this.firstname = firstname;
		this.lastname = lastname;
		this.birstdate = birstdate;
		this.qualifications = qualifications;
		this.mobility = mobility;
	}
	
	
}
