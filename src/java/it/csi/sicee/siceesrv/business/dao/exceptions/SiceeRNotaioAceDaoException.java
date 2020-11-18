/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.exceptions;

public class SiceeRNotaioAceDaoException extends DaoException
{
	/**
	 * Method 'SiceeRNotaioAceDaoException'
	 * 
	 * @param message
	 */
	public SiceeRNotaioAceDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SiceeRNotaioAceDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SiceeRNotaioAceDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
