/**
 * 
 * @author Yannick, Audrey
 *
 */
package fr.yas.matchup.entities;

import java.util.ArrayList;

public class Enterprise extends RegisteredUser {
	private String address;
	//declare image as int ? chemin du fichier en String
	private String siretNumber;
	private String website;
	private ArrayList<Headhunter> associates;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
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
	 * @param siretNumber the siretNumber to set. 14 numbers must be present to be validate
	 * @return 
	 */
	public boolean setSiretNumber(String siretNumber) {
		if(siretNumber.length() == 14) {
			this.siretNumber = siretNumber;
			return true;
		}else {
			return false;
		}
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
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
	 * @param associates the associates to set
	 */
	public void setAssociates(ArrayList<Headhunter> associates) {
		this.associates = associates;
	}

	/**
	 * 
	 */
	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Full constructor
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
	public Enterprise(String login, String name, String phone, String email, String presentation,
			String avatar, String created_at, String updated_at, String address, String siretNumber) {
		super(login, name, phone, email, presentation, avatar, created_at, updated_at);
		this.address = address;
		this.siretNumber = siretNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enterprise [address=" + address + ", siretNumber=" + siretNumber + ", website=" + website + "]";
	}	

}
