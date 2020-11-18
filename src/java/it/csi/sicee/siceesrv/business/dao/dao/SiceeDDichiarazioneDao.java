/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDichiarazioneDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDichiarazione;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDichiarazionePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDDichiarazioneDaoException;
import java.util.List;

public interface SiceeDDichiarazioneDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDDichiarazionePk
	 */
	public SiceeDDichiarazionePk insert(SiceeDDichiarazione dto);

	/** 
	 * Updates a single row in the SICEE_D_DICHIARAZIONE table.
	 */
	public void update(SiceeDDichiarazionePk pk, SiceeDDichiarazione dto) throws SiceeDDichiarazioneDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_DICHIARAZIONE table.
	 */
	public void delete(SiceeDDichiarazionePk pk) throws SiceeDDichiarazioneDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DICHIARAZIONE table that match the criteria 'ID_DICHIARAZIONE = :idDichiarazione'.
	 */
	public SiceeDDichiarazione findByPrimaryKey(Integer idDichiarazione) throws SiceeDDichiarazioneDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DICHIARAZIONE table that match the criteria ''.
	 */
	public List<SiceeDDichiarazione> findAll() throws SiceeDDichiarazioneDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DICHIARAZIONE table that match the criteria 'ID_DICHIARAZIONE = :idDichiarazione'.
	 */
	public List<SiceeDDichiarazione> findWhereIdDichiarazioneEquals(Integer idDichiarazione) throws SiceeDDichiarazioneDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DICHIARAZIONE table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDDichiarazione> findWhereDescrEquals(String descr) throws SiceeDDichiarazioneDaoException;

	/** 
	 * Returns the rows from the SICEE_D_DICHIARAZIONE table that matches the specified primary-key value.
	 */
	public SiceeDDichiarazione findByPrimaryKey(SiceeDDichiarazionePk pk) throws SiceeDDichiarazioneDaoException;

}
