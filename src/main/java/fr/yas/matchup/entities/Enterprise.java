/**
 * 
 * @author Yannick, Audrey
 *
 */
package fr.yas.matchup.entities;

import java.util.ArrayList;

public class Enterprise extends RegisteredUser {
	private String address;
	// declare image as int ? chemin du fichier en String
	private String siretNumber;
	private String website;
	private ArrayList<Headhunter> associates;

	private ArrayList<Proposal> jobs;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the siretNumber
	 */
	public String getSiretNumber() {
		return siretNumber;
	}

	/**
	 * @param siretNumber
	 *            the siretNumber to set. 14 numbers must be present to be validate
	 * @return
	 */
	public boolean setSiretNumber(String siretNumber) {
		boolean result;
		if (siretNumber.length() == 14) {
			this.siretNumber = siretNumber;
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website
	 *            the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the associates
	 */
	public ArrayList<Headhunter> getAssociates() {
		return associates;
	}

	/**
	 * @param associates
	 *            the associates to set
	 */
	public void setAssociates(ArrayList<Headhunter> associates) {
		this.associates = associates;
	}

	/**
	 * @return the jobs
	 */
	public ArrayList<Proposal> getJobs() {
		return jobs;
	}

	/**
	 * @param jobs
	 *            the jobs to set
	 */
	public void setJobs(ArrayList<Proposal> jobs) {
		this.jobs = jobs;
	}

	/**
	 * 
	 */
	public Enterprise() {
		super();
		associates = new ArrayList<>();
		jobs = new ArrayList<>();
	}

	/**
	 * Full constructor
	 * 
	 * @param login
	 * @param name
	 * @param phone
	 * @param email
	 * @param presentation
	 * @param avatar
	 * @param created_at
	 * @param updated_at
	 * @param address
	 * @param siretNumber
	 */
	public Enterprise(String login, String name, String phone, String email, String presentation, String avatar,
			String created_at, String updated_at, String address, String siretNumber) {
		super(login, name, phone, email, presentation, avatar, created_at, updated_at);
		this.address = address;
		this.siretNumber = siretNumber;
		associates = new ArrayList<>();
		jobs = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enterprise [address=" + address + ", siretNumber=" + siretNumber + ", website=" + website + "]";
	}

}
