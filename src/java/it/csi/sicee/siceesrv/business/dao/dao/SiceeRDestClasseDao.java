/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeRDestClasse;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRDestClassePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeRDestClasseDaoException;

import java.util.List;

public interface SiceeRDestClasseDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeRDestClassePk
	 */
	public SiceeRDestClassePk insert(SiceeRDestClasse dto);

	/** 
	 * Updates a single row in the SICEE_R_DEST_CLASSE table.
	 */
	public void update(SiceeRDestClassePk pk, SiceeRDestClasse dto) throws SiceeRDestClasseDaoException;

	/** 
	 * Deletes a single row in the SICEE_R_DEST_CLASSE table.
	 */
	public void delete(SiceeRDestClassePk pk) throws SiceeRDestClasseDaoException;

	/** 
	 * Returns all rows from the SICEE_R_DEST_CLASSE table that match the criteria 'ID_CLASSE = :idClasse AND ID_DEST_USO = :idDestUso'.
	 */
	public SiceeRDestClasse findByPrimaryKey(Integer idClasse, Integer idDestUso) throws SiceeRDestClasseDaoException;

	/** 
	 * Returns all rows from the SICEE_R_DEST_CLASSE table that match the criteria ''.
	 */
	public List<SiceeRDestClasse> findAll() throws SiceeRDestClasseDaoException;

	/** 
	 * Returns all rows from the SICEE_R_DEST_CLASSE table that match the criteria 'ID_CLASSE = :idClasse'.
	 */
	public List<SiceeRDestClasse> findWhereIdClasseEquals(Integer idClasse) throws SiceeRDestClasseDaoException;

	/** 
	 * Returns all rows from the SICEE_R_DEST_CLASSE table that match the criteria 'ID_DEST_USO = :idDestUso'.
	 */
	public List<SiceeRDestClasse> findWhereIdDestUsoEquals(Integer idDestUso) throws SiceeRDestClasseDaoException;

	/** 
	 * Returns all rows from the SICEE_R_DEST_CLASSE table that match the criteria 'MIN = :min'.
	 */
	public List<SiceeRDestClasse> findWhereMinEquals(Integer min) throws SiceeRDestClasseDaoException;

	/** 
	 * Returns all rows from the SICEE_R_DEST_CLASSE table that match the criteria 'MAX = :max'.
	 */
	public List<SiceeRDestClasse> findWhereMaxEquals(Integer max) throws SiceeRDestClasseDaoException;

	/** 
	 * Returns the rows from the SICEE_R_DEST_CLASSE table that matches the specified primary-key value.
	 */
	public SiceeRDestClasse findByPrimaryKey(SiceeRDestClassePk pk) throws SiceeRDestClasseDaoException;

}
