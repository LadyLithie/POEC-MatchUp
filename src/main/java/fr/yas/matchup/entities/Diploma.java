/**
 * 
 */
package fr.yas.matchup.entities;

/**
 * @author Audrey
 *	todo new table
 */
public class Diploma {
	private String label;
	private Level level;

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the level
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * 
	 */
	public Diploma() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param label
	 * @param level
	 */
	public Diploma(String label, Level level) {
		this.label = label;
		this.level = level;
	}
}
