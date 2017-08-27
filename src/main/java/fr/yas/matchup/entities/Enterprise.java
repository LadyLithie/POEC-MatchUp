/**
 * 
 * @author Yannick, Audrey
 *
 */
package fr.yas.matchup.entities;

public class Enterprise extends RegisteredUser {
	private String address;
	//declare image as int ? chemin du fichier en String
	private String siretNumber;
	private String website;

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
	 * @param siretNumber the siretNumber to set
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
	 * 
	 */
	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @param address
	 * @param siretNumber
	 */
	public Enterprise(String login, boolean isConnected, String name, String phone, String email, String presentation,
			String avatar, String created_at, String updated_at, String address, String siretNumber) {
		super(login, isConnected, name, phone, email, presentation, avatar, created_at, updated_at);
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
