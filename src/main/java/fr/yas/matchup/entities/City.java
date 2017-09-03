/**
 * 
 */
package fr.yas.matchup.entities;

/**
 * @author Audrey
 *
 */
public class City {
	public static final String INTERNATIONAL = "Internationnal";
	public static final String FRANCE = "France";
	public static final String EUROPE = "Union Européenne";

	private String name;
	private int departement;
	private String pays;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the departement
	 */
	public int getDepartement() {
		return departement;
	}

	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(int departement) {
		this.departement = departement;
	}

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * 
	 */
	public City() {
		super();
	}

	/**
	 * @param name
	 * @param departement
	 * @param pays
	 */
	public City(String name, int departement, String pays) {
		super();
		this.name = name;
		this.departement = departement;
		this.pays = pays;
	}

}
