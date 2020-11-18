/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDestUsoDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDestUso;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDestUsoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDDestUsoDaoException;
import java.util.List;

public interface SiceeDDestUsoDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDDestUsoPk
	 */
	public SiceeDDestUsoPk insert(SiceeDDestUso dto);

	/** 
	 * Updates a single row in the SICEE_D_DEST_USO table.
	 */
	public void update(SiceeDDestUsoPk pk, SiceeDDestUso dto) throws SiceeDDestUsoDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_DEST_USO table.
	 */
	public void delete(SiceeDDestUsoPk pk) throws SiceeDDestUsoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DEST_USO table that match the criteria 'ID_DEST_USO = :idDestUso'.
	 */
	public SiceeDDestUso findByPrimaryKey(Integer idDestUso) throws SiceeDDestUsoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DEST_USO table that match the criteria 'FLG_VISIBILE_COMBO = 'S''.
	 */
	public List<SiceeDDestUso> findAll() throws SiceeDDestUsoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DEST_USO table that match the criteria 'ID_DEST_USO = :idDestUso'.
	 */
	public List<SiceeDDestUso> findWhereIdDestUsoEquals(Integer idDestUso) throws SiceeDDestUsoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DEST_USO table that match the criteria 'SIGLA = :sigla'.
	 */
	public List<SiceeDDestUso> findWhereSiglaEquals(String sigla) throws SiceeDDestUsoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DEST_USO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDDestUso> findWhereDescrEquals(String descr) throws SiceeDDestUsoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_DEST_USO table that match the criteria 'FLG_EDIFICIO = :flgEdificio'.
	 */
	public List<SiceeDDestUso> findWhereFlgEdificioEquals(String flgEdificio) throws SiceeDDestUsoDaoException;

	/** 
	 * Returns the rows from the SICEE_D_DEST_USO table that matches the specified primary-key value.
	 */
	public SiceeDDestUso findByPrimaryKey(SiceeDDestUsoPk pk) throws SiceeDDestUsoDaoException;

}
