/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametri;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriDaoException;
import java.util.List;

public interface SiceeTParametriDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 */
	public void insert(SiceeTParametri dto);

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI table that match the criteria ''.
	 */
	public List<SiceeTParametri> findAll() throws SiceeTParametriDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI table that match the criteria 'CODICE = :codice'.
	 */
	public SiceeTParametri findWhereCodiceEquals(String codice) throws SiceeTParametriDaoException;

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI table that match the criteria 'VALORE = :valore'.
	 */
	public List<SiceeTParametri> findWhereValoreEquals(String valore) throws SiceeTParametriDaoException;

}
