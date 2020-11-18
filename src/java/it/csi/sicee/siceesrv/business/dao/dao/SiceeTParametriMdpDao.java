/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriMdpDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametriMdp;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametriMdpPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriMdpDaoException;
import java.util.List;

public interface SiceeTParametriMdpDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTParametriMdpPk
	 */
	public SiceeTParametriMdpPk insert(SiceeTParametriMdp dto);

	/** 
	 * Updates a single row in the SICEE_T_PARAMETRI_MDP table.
	 */
	public void update(SiceeTParametriMdpPk pk, SiceeTParametriMdp dto) throws SiceeTParametriMdpDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_PARAMETRI_MDP table.
	 */
	public void delete(SiceeTParametriMdpPk pk) throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'ID_PARAMETRI_MDP = :idParametriMdp'.
	 */
	public SiceeTParametriMdp findByPrimaryKey(long idParametriMdp) throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria ''.
	 */
	public List<SiceeTParametriMdp> findAll() throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'ID_PARAMETRI_MDP = :idParametriMdp'.
	 */
	public List<SiceeTParametriMdp> findWhereIdParametriMdpEquals(long idParametriMdp) throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'CODICE = :codice'.
	 */
	public SiceeTParametriMdp findWhereCodiceEquals(String codice) throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria for PAGAMENTO.
	 */
	public List<SiceeTParametriMdp> findCodiciPagamentoEquals() throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'VALORE = :valore'.
	 */
	public List<SiceeTParametriMdp> findWhereValoreEquals(String valore) throws SiceeTParametriMdpDaoException;

	/** 
	 * Returns the rows from the SICEE_T_PARAMETRI_MDP table that matches the specified primary-key value.
	 */
	public SiceeTParametriMdp findByPrimaryKey(SiceeTParametriMdpPk pk) throws SiceeTParametriMdpDaoException;

}
