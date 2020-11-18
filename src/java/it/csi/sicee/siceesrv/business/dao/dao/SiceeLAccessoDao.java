/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeLAccesso;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeLAccessoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeLAccessoDaoException;

public interface SiceeLAccessoDao {
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeLAccessoPk
	 * @throws SiceeLAccessoDaoException 
	 */
	public SiceeLAccessoPk insert(SiceeLAccesso dto) throws SiceeLAccessoDaoException;
}
