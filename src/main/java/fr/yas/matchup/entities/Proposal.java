/**
 * 
 * @author Yannick
 *
 */

/*********
 * a completer;
 *********/
package fr.yas.matchup.entities;

import java.util.ArrayList;

public class Proposal {
	private int id;
	private String name;
	private String presentation;
	
	private String createdAt;
	private String updatedAt;
	// SQL Datetime = JAVA String ? or Date converted with SimpleDateFormat?
	private ContractType contractType;
	// Why not with an Enum?
	private ArrayList<Skill> proposalSkills = new ArrayList<>();
	
	
	/**
	 * @return the proposalSkills
	 */
	public ArrayList<Skill> getProposalSkills() {
		return proposalSkills;
	}
	/**
	 * @param proposalSkills the proposalSkills to set
	 */
	public void setProposalSkills(ArrayList<Skill> proposalSkills) {
		this.proposalSkills = proposalSkills;
	}
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
	
	
	public Proposal (String name, ContractType contractType, String createdAt) {
		this.name = name;
		this.contractType = contractType;
		this.createdAt = createdAt;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proposal [id=" + id + ", name=" + name + ", presentation=" + presentation + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", contractType=" + contractType + ", jobSkills=" + proposalSkills + "]";
	}
	
	
	
	
}
