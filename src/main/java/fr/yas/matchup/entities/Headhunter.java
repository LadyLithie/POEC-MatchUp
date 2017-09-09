package fr.yas.matchup.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Audrey
 *
 */
public class Headhunter extends RegisteredUser {
	private String firstname;
	private String lastname;
	private String twitter;
	private String linkedin;
	private String picture;
	private ArrayList<String> phones;
	private ArrayList<String> emails;

	private List<Proposal> jobs;
	private ArrayList<Enterprise> associates;
	
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
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
	public ArrayList<String> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(ArrayList<String> phones) {
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
	 * @return the jobs
	 */
	public List<Proposal> getJobs() {
		return jobs;
	}

	/**
	 * @param list the jobs to set
	 */
	public void setJobs(List<Proposal> list) {
		this.jobs = list;
	}

	/**
	 * @return the associates
	 */
	public ArrayList<Enterprise> getAssociates() {
		return associates;
	}

	/**
	 * @param associates the associates to set
	 */
	public void setAssociates(ArrayList<Enterprise> associates) {
		this.associates = associates;
	}

	/**
	 * Void constructor
	 */
	public Headhunter() {

		super();
		this.phones = new ArrayList<String>();
		this.getPhones().add(super.getPhone());
		
		this.emails = new ArrayList<String>();
		this.getEmails().add(super.getEmail());
		
		associates = new ArrayList<>();
		jobs = new ArrayList<>();	}

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
	public Headhunter(String login, String name, String phone, String email, String presentation,
			String picture, String created_at, String updated_at, String firstname, String lastname,
			ArrayList<String> phones, ArrayList<String> emails) {
		super(login, name, phone, email, presentation, picture, created_at, updated_at);
		
		this.phones = new ArrayList<String>();
		// This is optional, depend how we want to treat multiple
		phones.add(super.getPhone());
		this.setPhones(phones);
	
		this.emails = new ArrayList<String>();
		// This is optional, depend how we want to treat multiple
		emails.add(super.getEmail());
		this.setEmails(emails);
		
		this.firstname = firstname;
		this.lastname = lastname;
		super.setName(firstname + " " + lastname);

		associates = new ArrayList<>();
		jobs = new ArrayList<>();
	}

}
