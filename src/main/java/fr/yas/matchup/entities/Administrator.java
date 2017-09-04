/**
 * 
 */
package fr.yas.matchup.entities;

/**
 * @author Audrey
 *
 */
public class Administrator extends RegisteredUser {
	private String firstname;
	private String lastname;
	private String role;
	
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
	 */
	public Administrator(String login, String name, Double phone, String email,
			String presentation, String avatar, String created_at, String updated_at, String firstname,
			String lastname) {
		super(login, name, phone, email, presentation, avatar, created_at, updated_at);
		this.firstname = firstname;
		this.lastname = lastname;
		super.setName(firstname + " " + lastname);
	}

	/**
	 * 
	 */
	public Administrator() {
		super();
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
