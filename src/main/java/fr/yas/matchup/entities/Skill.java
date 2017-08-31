/**
 * 
 * @author Yannick
 *
 */
package fr.yas.matchup.entities;

import fr.yas.matchup.entities.base.BaseEntity;

public class Skill extends BaseEntity {
	private String name;
	private String skillType;

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
		this.name = name;
		this.skillType = skillType;
	}

	public Skill() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Skill "+super.toString()+"[name=" + name + ", skillType=" + skillType + ", getId()=" + getId() + "]";
	}

}
