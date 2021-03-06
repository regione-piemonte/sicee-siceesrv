/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.exceptions;

public class SiceeDNormativaDaoException extends DaoException
{
	/**
	 * Method 'SiceeDNormativaDaoException'
	 * 
	 * @param message
	 */
	public SiceeDNormativaDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SiceeDNormativaDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SiceeDNormativaDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
