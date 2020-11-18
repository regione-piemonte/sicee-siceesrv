/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDStatoCertDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDStatoCert;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDStatoCertPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDStatoCertDaoException;
import java.util.List;

public interface SiceeDStatoCertDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDStatoCertPk
	 */
	public SiceeDStatoCertPk insert(SiceeDStatoCert dto);

	/** 
	 * Updates a single row in the SICEE_D_STATO_CERT table.
	 */
	public void update(SiceeDStatoCertPk pk, SiceeDStatoCert dto) throws SiceeDStatoCertDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_STATO_CERT table.
	 */
	public void delete(SiceeDStatoCertPk pk) throws SiceeDStatoCertDaoException;

	/** 
	 * Returns all rows from the SICEE_D_STATO_CERT table that match the criteria 'ID_STATO = :idStato'.
	 */
	public SiceeDStatoCert findByPrimaryKey(Integer idStato) throws SiceeDStatoCertDaoException;

	/** 
	 * Returns all rows from the SICEE_D_STATO_CERT table that match the criteria ''.
	 */
	public List<SiceeDStatoCert> findAll() throws SiceeDStatoCertDaoException;

	/** 
	 * Returns all rows from the SICEE_D_STATO_CERT table that match the criteria 'ID_STATO = :idStato'.
	 */
	public List<SiceeDStatoCert> findWhereIdStatoEquals(Integer idStato) throws SiceeDStatoCertDaoException;

	/** 
	 * Returns all rows from the SICEE_D_STATO_CERT table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDStatoCert> findWhereDescrEquals(String descr) throws SiceeDStatoCertDaoException;

	/** 
	 * Returns the rows from the SICEE_D_STATO_CERT table that matches the specified primary-key value.
	 */
	public SiceeDStatoCert findByPrimaryKey(SiceeDStatoCertPk pk) throws SiceeDStatoCertDaoException;

}
