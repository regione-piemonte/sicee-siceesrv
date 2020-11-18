/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDMotivoSostDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDMotivoSost;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDMotivoSostPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDMotivoSostDaoException;
import java.util.List;

public interface SiceeDMotivoSostDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDMotivoSostPk
	 */
	public SiceeDMotivoSostPk insert(SiceeDMotivoSost dto);

	/** 
	 * Updates a single row in the SICEE_D_MOTIVO_SOST table.
	 */
	public void update(SiceeDMotivoSostPk pk, SiceeDMotivoSost dto) throws SiceeDMotivoSostDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_MOTIVO_SOST table.
	 */
	public void delete(SiceeDMotivoSostPk pk) throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria 'ID_MOTIVO_SOST = :idMotivoSost'.
	 */
	public SiceeDMotivoSost findByPrimaryKey(Integer idMotivoSost) throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria ''.
	 */
	public List<SiceeDMotivoSost> findAll() throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria 'ID_MOTIVO_SOST = :idMotivoSost'.
	 */
	public List<SiceeDMotivoSost> findWhereIdMotivoSostEquals(Integer idMotivoSost) throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDMotivoSost> findWhereDescrEquals(String descr) throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria 'MIN = :min'.
	 */
	public List<SiceeDMotivoSost> findWhereMinEquals(Integer min) throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria 'MAX = :max'.
	 */
	public List<SiceeDMotivoSost> findWhereMaxEquals(Integer max) throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns all rows from the SICEE_D_MOTIVO_SOST table that match the criteria 'FLG_VISIBILE_COMBO = 'S''.
	 */
	public List<SiceeDMotivoSost> findWhereFlagComboEqualsS() throws SiceeDMotivoSostDaoException;

	/** 
	 * Returns the rows from the SICEE_D_MOTIVO_SOST table that matches the specified primary-key value.
	 */
	public SiceeDMotivoSost findByPrimaryKey(SiceeDMotivoSostPk pk) throws SiceeDMotivoSostDaoException;

}
