/**
 * 
 */
package fr.yas.matchup.entities;

/**
 * @author Audrey
 *
 */
public class Location {
	public static final String INTERNATIONAL = "Internationnal";
	public static final String FRANCE = "France";
	public static final String EUROPE = "Union Européenne";

	private String address;
	private String city;
	private int postal_code;
	private String pays;

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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String name) {
		this.city = name;
	}

	/**
	 * @return the postal_code
	 */
	public int getPostal_code() {
		return postal_code;
	}

	/**
	 * @param postal_code
	 *            the postal_code to set
	 */
	public void setPostal_code(int departement) {
		this.postal_code = departement;
	}

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays
	 *            the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * 
	 */
	public Location() {
		super();
		pays = Location.FRANCE;
		address = "";
		city = "";
	}

	/**
	 * @param address
	 * @param city
	 * @param postal_code
	 * @param pays
	 */
	public Location(String address, String city, int departement, String pays) {
		super();
		this.address = address;
		this.city = city;
		this.postal_code = departement;
		if (pays.isEmpty() || pays == null) {
			pays = Location.FRANCE;
		} else {
			this.pays = pays;

		}
	}

	/**
	 * 
	 */
	public Location(String fulladress) {
		super();
		String[] ad = fulladress.split(":");
		this.setPays(ad[0]);
		if (ad[1].length() != 3) {
			ad = ad[1].split(",");
			this.setAddress(ad[0]);
			this.setPostal_code(Integer.valueOf(ad[1]));
			this.setCity(ad[2]);
		} else {
			ad = ad[1].split(",");
			this.setAddress(ad[0]);
			this.setPostal_code(Integer.valueOf(ad[1]));
			this.setCity("");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return pays + ":" + address + "," + postal_code + "," + city;
	}

}
