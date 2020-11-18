/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeDQualitaInvolucro;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDQualitaInvolucroPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDQualitaInvolucroDaoException;

import java.util.List;

public interface SiceeDQualitaInvolucroDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDQualitaInvolucroPk
	 */
	public SiceeDQualitaInvolucroPk insert(SiceeDQualitaInvolucro dto);

	/** 
	 * Updates a single row in the SICEE_D_QUALITA_INVOLUCRO table.
	 */
	public void update(SiceeDQualitaInvolucroPk pk, SiceeDQualitaInvolucro dto) throws SiceeDQualitaInvolucroDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_QUALITA_INVOLUCRO table.
	 */
	public void delete(SiceeDQualitaInvolucroPk pk) throws SiceeDQualitaInvolucroDaoException;

	/** 
	 * Returns all rows from the SICEE_D_QUALITA_INVOLUCRO table that match the criteria 'ID_QUALITA = :idQualita'.
	 */
	public SiceeDQualitaInvolucro findByPrimaryKey(Integer idQualita) throws SiceeDQualitaInvolucroDaoException;

	/** 
	 * Returns all rows from the SICEE_D_QUALITA_INVOLUCRO table that match the criteria ''.
	 */
	public List<SiceeDQualitaInvolucro> findAll() throws SiceeDQualitaInvolucroDaoException;

	/** 
	 * Returns all rows from the SICEE_D_QUALITA_INVOLUCRO table that match the criteria 'ID_QUALITA = :idQualita'.
	 */
	public List<SiceeDQualitaInvolucro> findWhereIdQualitaEquals(Integer idQualita) throws SiceeDQualitaInvolucroDaoException;

	/** 
	 * Returns all rows from the SICEE_D_QUALITA_INVOLUCRO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDQualitaInvolucro> findWhereDescrEquals(String descr) throws SiceeDQualitaInvolucroDaoException;

	/** 
	 * Returns the rows from the SICEE_D_QUALITA_INVOLUCRO table that matches the specified primary-key value.
	 */
	public SiceeDQualitaInvolucro findByPrimaryKey(SiceeDQualitaInvolucroPk pk) throws SiceeDQualitaInvolucroDaoException;

}
