/**
 * 
 * @author Yannick
 *
 */
package fr.yas.matchup.entities;

public class Skill {
	public static final String SOCIAL = "Savoir-être";
	public static final String TECHNIQUE = "Savoir-faire";
	
	private int id;
	private String name;
	private String skillType;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	 * @return the skillType
	 */
	public String getSkillType() {
		return skillType;
	}
	/**
	 * @param skillType the skillType to set
	 */
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	
	
	public Skill (int id, String name, String skillType) {
		super();
		this.id = id;
		this.name = name;
		this.skillType = skillType;
	}
	
	
	public Skill() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", skillType=" + skillType + "]";
	}
	
	
}
