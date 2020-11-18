/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoEdificioDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoEdificioPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTipoEdificioDaoException;
import java.util.List;

public interface SiceeDTipoEdificioDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDTipoEdificioPk
	 */
	public SiceeDTipoEdificioPk insert(SiceeDTipoEdificio dto);

	/** 
	 * Updates a single row in the SICEE_D_TIPO_EDIFICIO table.
	 */
	public void update(SiceeDTipoEdificioPk pk, SiceeDTipoEdificio dto) throws SiceeDTipoEdificioDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_TIPO_EDIFICIO table.
	 */
	public void delete(SiceeDTipoEdificioPk pk) throws SiceeDTipoEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_EDIFICIO table that match the criteria 'ID_TIPO_EDIFICIO = :idTipoEdificio'.
	 */
	public SiceeDTipoEdificio findByPrimaryKey(Integer idTipoEdificio) throws SiceeDTipoEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_EDIFICIO table that match the criteria ''.
	 */
	public List<SiceeDTipoEdificio> findAll() throws SiceeDTipoEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_EDIFICIO table that match the criteria 'ID_TIPO_EDIFICIO = :idTipoEdificio'.
	 */
	public List<SiceeDTipoEdificio> findWhereIdTipoEdificioEquals(Integer idTipoEdificio) throws SiceeDTipoEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_EDIFICIO table that match the criteria 'FK_TIPO_IMPIANTO = :fkTipoImpianto'.
	 */
	public List<SiceeDTipoEdificio> findWhereFkTipoImpiantoEquals(Integer fkTipoImpianto) throws SiceeDTipoEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_EDIFICIO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDTipoEdificio> findWhereDescrEquals(String descr) throws SiceeDTipoEdificioDaoException;

	/** 
	 * Returns the rows from the SICEE_D_TIPO_EDIFICIO table that matches the specified primary-key value.
	 */
	public SiceeDTipoEdificio findByPrimaryKey(SiceeDTipoEdificioPk pk) throws SiceeDTipoEdificioDaoException;

}
