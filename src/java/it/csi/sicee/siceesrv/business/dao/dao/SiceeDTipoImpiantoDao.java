/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoImpianto;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoImpiantoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTipoImpiantoDaoException;

import java.util.List;

public interface SiceeDTipoImpiantoDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDTipoImpiantoPk
	 */
	public SiceeDTipoImpiantoPk insert(SiceeDTipoImpianto dto);

	/** 
	 * Updates a single row in the SICEE_D_TIPO_IMPIANTO table.
	 */
	public void update(SiceeDTipoImpiantoPk pk, SiceeDTipoImpianto dto) throws SiceeDTipoImpiantoDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_TIPO_IMPIANTO table.
	 */
	public void delete(SiceeDTipoImpiantoPk pk) throws SiceeDTipoImpiantoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_IMPIANTO table that match the criteria 'ID_TIPO_IMPIANTO = :idTipoImpianto'.
	 */
	public SiceeDTipoImpianto findByPrimaryKey(Integer idTipoImpianto) throws SiceeDTipoImpiantoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_IMPIANTO table that match the criteria ''.
	 */
	public List<SiceeDTipoImpianto> findAll() throws SiceeDTipoImpiantoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_IMPIANTO table that match the criteria 'ID_TIPO_IMPIANTO = :idTipoImpianto'.
	 */
	public List<SiceeDTipoImpianto> findWhereIdTipoImpiantoEquals(Integer idTipoImpianto) throws SiceeDTipoImpiantoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_IMPIANTO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDTipoImpianto> findWhereDescrEquals(String descr) throws SiceeDTipoImpiantoDaoException;

	/** 
	 * Returns the rows from the SICEE_D_TIPO_IMPIANTO table that matches the specified primary-key value.
	 */
	public SiceeDTipoImpianto findByPrimaryKey(SiceeDTipoImpiantoPk pk) throws SiceeDTipoImpiantoDaoException;

}
