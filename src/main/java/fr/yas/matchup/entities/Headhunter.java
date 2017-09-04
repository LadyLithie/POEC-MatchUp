package fr.yas.matchup.entities;

import java.util.ArrayList;

/**
 * @author Audrey
 *
 */
public class Headhunter extends RegisteredUser {
	private String firstname;
	private String lastname;
	private String twitter;
	private String linkedin;
	private String role;
	private ArrayList<Double> phones;
	private ArrayList<String> emails;
	
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
	 * @return the phones
	 */
	public ArrayList<Double> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(ArrayList<Double> phones) {
		this.phones = phones;
	}

	/**
	 * @return the emails
	 */
	public ArrayList<String> getEmails() {
		return emails;
	}

	/**
	 * @param emails the emails to set
	 */
	public void setEmails(ArrayList<String> emails) {
		this.emails = emails;
	}

	/**
	 * Void constructor
	 */
	public Headhunter() {
		this.phones = new ArrayList<Double>();
		this.getPhones().add(super.getPhone());
		
		this.emails = new ArrayList<String>();
		this.getEmails().add(super.getEmail());
	}

	/**
	 * Full constructor
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
	 * @param phones
	 * @param emails
	 * *********************
	 * To review the lists
	 */
	public Headhunter(String login, String name, Double phone, String email, String presentation,
			String avatar, String created_at, String updated_at, String firstname, String lastname,
			ArrayList<Double> phones, ArrayList<String> emails) {
		super(login, name, phone, email, presentation, avatar, created_at, updated_at);
		
		this.phones = new ArrayList<Double>();
		// This is optional, depend how we want to treat multiple
		phones.add(super.getPhone());
		this.setPhones(phones);
	
		this.emails = new ArrayList<String>();
		// This is optional, depend how we want to treat multiple
		emails.add(super.getEmail());
		this.setEmails(emails);
		
		this.firstname = firstname;
		this.lastname = lastname;

	}

	/**
	 * @return the twitter
	 */
	public String getTwitter() {
		return twitter;
	}

	/**
	 * @param twitter the twitter to set
	 */
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	/**
	 * @return the linkedin
	 */
	public String getLinkedin() {
		return linkedin;
	}

	/**
	 * @param linkedin the linkedin to set
	 */
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
}
