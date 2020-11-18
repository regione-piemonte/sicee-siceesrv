/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeDNormativa;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDNormativaPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDNormativaDaoException;

import java.util.Date;
import java.util.List;

public interface SiceeDNormativaDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDNormativaPk
	 */
	public SiceeDNormativaPk insert(SiceeDNormativa dto);

	/** 
	 * Updates a single row in the SICEE_D_NORMATIVA table.
	 */
	public void update(SiceeDNormativaPk pk, SiceeDNormativa dto) throws SiceeDNormativaDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_NORMATIVA table.
	 */
	public void delete(SiceeDNormativaPk pk) throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria 'ID_NORMA = :idNorma'.
	 */
	public SiceeDNormativa findByPrimaryKey(Integer idNorma) throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria ':date BETWEEN DT_INIZIO AND DT_FINE'.
	 */
	public SiceeDNormativa findWhereDtInizioBetweenDtFine(Date date) throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria ''.
	 */
	public List<SiceeDNormativa> findAll() throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria 'ID_NORMA = :idNorma'.
	 */
	public List<SiceeDNormativa> findWhereIdNormaEquals(Integer idNorma) throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDNormativa> findWhereDescrEquals(String descr) throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria 'DT_INIZIO = :dtInizio'.
	 */
	public List<SiceeDNormativa> findWhereDtInizioEquals(Date dtInizio) throws SiceeDNormativaDaoException;

	/** 
	 * Returns all rows from the SICEE_D_NORMATIVA table that match the criteria 'DT_FINE = :dtFine'.
	 */
	public List<SiceeDNormativa> findWhereDtFineEquals(Date dtFine) throws SiceeDNormativaDaoException;

	/** 
	 * Returns the rows from the SICEE_D_NORMATIVA table that matches the specified primary-key value.
	 */
	public SiceeDNormativa findByPrimaryKey(SiceeDNormativaPk pk) throws SiceeDNormativaDaoException;

}
