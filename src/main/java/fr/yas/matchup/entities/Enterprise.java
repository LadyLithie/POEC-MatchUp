/**
 * 
 * @author Yannick, Audrey
 *
 */
package fr.yas.matchup.entities;

public class Enterprise extends RegisteredUser {
	private String address;
	//declare image as int ? chemin du fichier en String
	private int siretNumber;

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
	public int getSiretNumber() {
		return siretNumber;
	}
	/**
	 * @param siretNumber the siretNumber to set
	 */
	public void setSiretNumber(int siretNumber) {
		this.siretNumber = siretNumber;
	}

	/**
	 * 
	 */
	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @param address
	 * @param siretNumber
	 */
	public Enterprise(String login, boolean isConnected, String name, String phone, String email, String presentation,
			String avatar, String created_at, String updated_at, String address, int siretNumber) {
		super(login, isConnected, name, phone, email, presentation, avatar, created_at, updated_at);
		this.address = address;
		this.siretNumber = siretNumber;
	}	
	
}
