/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.entities.Enterprise;
import fr.yas.matchup.entities.Proposal;
import fr.yas.matchup.entities.base.BaseEntity;

/**
 * @author Audrey
 *
 */
public class DAOProposal extends BaseDAO {
		public static final String TABLE = "job";
		public static final String ID = "id_job";
		public static final String NAME = "title_job";
		public static final String PRESENTATION = "presentation_job";
		
		public static final String contract_id = "logo_enterprise";
		public static final String enterprise_id = "phone_enterprise";
		public static final String headhunter_id = "address_enterprise";

		
		public DAOProposal() {
			super(TABLE, ID);
		}

		/* (non-Javadoc)
		 * @see fr.yas.matchup.database.IDAOBase#parseToObject(java.sql.ResultSet)
		 */
		@Override
		public BaseEntity parseToObject(ResultSet resultSet) {
			Proposal job = new Proposal();
			
			try {
				job.setId(resultSet.getDouble(ID));
				job.setName(resultSet.getString(NAME));
				job.setPresentation(resultSet.getString(PRESENTATION));
				DAOEnterprise enterprise = new DAOEnterprise();
				job.setCompany((Enterprise) enterprise.get(resultSet.getDouble(enterprise_id)));
				//missing DAOcontract and DAOheadhunter
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return job;
		}

		/* (non-Javadoc)
		 * @see fr.yas.matchup.database.IDAOBase#parseToString(fr.yas.matchup.entities.base.BaseEntity)
		 */
		@Override
		public String parseToString(BaseEntity item) {
			String request;
			
			Proposal job = ((Proposal)item);
			request = String.valueOf(job.getId());
			request += ",'"+job.getName()+"'";
			request += ",'"+job.getPresentation()+"'";
			request += ",'"+job.getContractType().getId()+"'";
			request += ",'"+job.getCompany().getId()+"'";
			request += ",'"+job.getHeadhunter().getId()+"'";
			
			return request;

		}

		/* (non-Javadoc)
		 * @see fr.yas.matchup.database.IDAOBase#parseUpdateToString(fr.yas.matchup.entities.base.BaseEntity)
		 */
		@Override
		public String parseUpdateToString(BaseEntity item) {
			String request;
			
			Proposal job = ((Proposal)item);
			request = NAME +" = '"+job.getName()+"'";
			request += PRESENTATION +" = '"+job.getPresentation()+"'";
			request += contract_id +" = '"+job.getContractType().getId()+"'";
			request += enterprise_id +" = '"+job.getCompany().getId()+"'";
			request += headhunter_id +" = '"+job.getHeadhunter().getId()+"'";
			
			return request;
		}

}
