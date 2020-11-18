/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDCarattEdificioDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDCarattEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDCarattEdificioPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDCarattEdificioDaoException;
import java.util.List;

public interface SiceeDCarattEdificioDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDCarattEdificioPk
	 */
	public SiceeDCarattEdificioPk insert(SiceeDCarattEdificio dto);

	/** 
	 * Updates a single row in the SICEE_D_CARATT_EDIFICIO table.
	 */
	public void update(SiceeDCarattEdificioPk pk, SiceeDCarattEdificio dto) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_CARATT_EDIFICIO table.
	 */
	public void delete(SiceeDCarattEdificioPk pk) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_CARATT_EDIFICIO table that match the criteria 'ID_CARATT_EDIFICIO = :idCarattEdificio'.
	 */
	public SiceeDCarattEdificio findByPrimaryKey(Integer idCarattEdificio) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_CARATT_EDIFICIO table that match the criteria ''.
	 */
	public List<SiceeDCarattEdificio> findAll() throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_CARATT_EDIFICIO table that match the criteria 'FK_TIPO_EDIFICIO = :fkTipoEdificio'.
	 */
	public List<SiceeDCarattEdificio> findBySiceeDTipoEdificio(Integer fkTipoEdificio) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_CARATT_EDIFICIO table that match the criteria 'ID_CARATT_EDIFICIO = :idCarattEdificio'.
	 */
	public List<SiceeDCarattEdificio> findWhereIdCarattEdificioEquals(Integer idCarattEdificio) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_CARATT_EDIFICIO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDCarattEdificio> findWhereDescrEquals(String descr) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_CARATT_EDIFICIO table that match the criteria 'FK_TIPO_EDIFICIO = :fkTipoEdificio'.
	 */
	public List<SiceeDCarattEdificio> findWhereFkTipoEdificioEquals(Integer fkTipoEdificio) throws SiceeDCarattEdificioDaoException;

	/** 
	 * Returns the rows from the SICEE_D_CARATT_EDIFICIO table that matches the specified primary-key value.
	 */
	public SiceeDCarattEdificio findByPrimaryKey(SiceeDCarattEdificioPk pk) throws SiceeDCarattEdificioDaoException;

}
