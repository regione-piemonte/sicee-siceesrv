/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDPrioritaDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDPriorita;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDPrioritaPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDPrioritaDaoException;
import java.util.List;

public interface SiceeDPrioritaDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDPrioritaPk
	 */
	public SiceeDPrioritaPk insert(SiceeDPriorita dto);

	/** 
	 * Updates a single row in the SICEE_D_PRIORITA table.
	 */
	public void update(SiceeDPrioritaPk pk, SiceeDPriorita dto) throws SiceeDPrioritaDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_PRIORITA table.
	 */
	public void delete(SiceeDPrioritaPk pk) throws SiceeDPrioritaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_PRIORITA table that match the criteria 'PRIORITA = :priorita'.
	 */
	public SiceeDPriorita findByPrimaryKey(String priorita) throws SiceeDPrioritaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_PRIORITA table that match the criteria ''.
	 */
	public List<SiceeDPriorita> findAll() throws SiceeDPrioritaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_PRIORITA table that match the criteria 'PRIORITA = :priorita'.
	 */
	public List<SiceeDPriorita> findWherePrioritaEquals(String priorita) throws SiceeDPrioritaDaoException;

	/** 
	 * Returns the rows from the SICEE_D_PRIORITA table that matches the specified primary-key value.
	 */
	public SiceeDPriorita findByPrimaryKey(SiceeDPrioritaPk pk) throws SiceeDPrioritaDaoException;

}
