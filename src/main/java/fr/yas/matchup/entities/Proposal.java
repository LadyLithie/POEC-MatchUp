/**
 * 
 * @author Yannick
 *
 */

/*********
 * a completer;
 *********/
package fr.yas.matchup.entities;

import java.util.List;

import fr.yas.matchup.entities.base.BaseEntity;

public class Proposal extends BaseEntity {
	private String name;
	private String presentation;
	//private String handicap;
	private String createdAt;
	private String updatedAt;
	// SQL Datetime = JAVA String ? or Date converted with SimpleDateFormat?
	private ContractType contractType; // Why not with an Enum? 
	private City localization;
	private Enterprise company;
	private Headhunter headhunter;
	private List<Skill> skills;
	
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
	 * @return the presentation
	 */
	public String getPresentation() {
		return presentation;
	}
	/**
	 * @param presentation the presentation to set
	 */
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	/**
	 * @return the handicap
	 */
//	public String getHandicap() {
//		return handicap;
//	}
	/**
	 * @param handicap the handicap to set
	 */
//	public void setHandicap(String handicap) {
//		this.handicap = handicap;
//	}
	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * @return the updatedAt
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	/**
	 * @return the contractType
	 */
	public ContractType getContractType() {
		return contractType;
	}
	/**
	 * @param contractType the contractType to set
	 */
	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}
		
	/**
	 * @return the localization
	 */
	public City getLocalization() {
		return localization;
	}
	/**
	 * @param localization the localization to set
	 */
	public void setLocalization(City localization) {
		this.localization = localization;
	}
	/**
	 * @return the company
	 */
	public Enterprise getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Enterprise company) {
		this.company = company;
	}
	/**
	 * @return the headhunter
	 */
	public Headhunter getHeadhunter() {
		return headhunter;
	}
	/**
	 * @param headhunter the headhunter to set
	 */
	public void setHeadhunter(Headhunter headhunter) {
		this.headhunter = headhunter;
	}
	/**
	 * @return the skills
	 */
	public List<Skill> getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	/**
	 * Constructor
	 * @param name
	 * @param contractType
	 */
	public Proposal (String name, ContractType contractType) {
		super();
		this.name = name;
		this.contractType = contractType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proposal [name=" + name + ", presentation=" + presentation + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", contractType=" + contractType + ", localization=" + localization + ", company="
				+ company + ", headhunter=" + headhunter + ", skills=" + skills + "]";
	}

}
