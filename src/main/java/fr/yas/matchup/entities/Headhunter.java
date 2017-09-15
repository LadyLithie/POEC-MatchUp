package fr.yas.matchup.entities;

import java.sql.Blob;
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
	
	private ArrayList<Proposal> jobs;
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
	 * @return the jobs
	 */
	public List<Proposal> getJobs() {
		return jobs;
	}

	/**
	 * @param list the jobs to set
	 */
	public void setJobs(List<Proposal> list) {
		this.jobs = (ArrayList<Proposal>) list;
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
		
		associates = new ArrayList<>();
		jobs = new ArrayList<>();	
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
	public Headhunter(String login, String name, String phone, String email, String presentation,
			Blob picture, String created_at, String updated_at, String firstname, String lastname) {
		
		super(login, name, phone, email, presentation, picture, created_at, updated_at);
		
		
		this.firstname = firstname;
		this.lastname = lastname;
		super.setName(firstname + " " + lastname);

		associates = new ArrayList<>();
		jobs = new ArrayList<>();
	}



	
}
