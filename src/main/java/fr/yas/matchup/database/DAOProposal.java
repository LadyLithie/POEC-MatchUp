/**
 * 
 */
package fr.yas.matchup.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.yas.matchup.database.base.BaseDAO;
import fr.yas.matchup.entities.ContractType;
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
		public static final String ADDRESS = "address";
		
		public static final String CONTRACT = "contract_id";
		public static final String ENTERPRISE = "enterprise_id";
		public static final String HEADHUNTER = "headhunter_id";

		
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
				job.setLocalization(resultSet.getString(ADDRESS));
				EnterpriseDAO enterprise = new EnterpriseDAO();
				job.setCompany((Enterprise) enterprise.get(resultSet.getDouble(ENTERPRISE)));
				DAOProposal proposal = new DAOProposal();
				job.setContractType((ContractType) proposal.get(resultSet.getDouble(CONTRACT)));
				//missing DAOheadhunter
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
			request += ",'"+job.getStringLocalization()+"'";
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
			request += ADDRESS +" = '"+job.getStringLocalization()+"'";
			request += PRESENTATION +" = '"+job.getPresentation()+"'";
			request += CONTRACT +" = '"+job.getContractType().getId()+"'";
			request += ENTERPRISE +" = '"+job.getCompany().getId()+"'";
			request += HEADHUNTER +" = '"+job.getHeadhunter().getId()+"'";
			
			return request;
		}

}
