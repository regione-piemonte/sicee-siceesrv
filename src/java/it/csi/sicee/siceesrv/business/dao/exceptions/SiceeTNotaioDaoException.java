/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.exceptions;

public class SiceeTNotaioDaoException extends DaoException
{
	/**
	 * Method 'SiceeTNotaioDaoException'
	 * 
	 * @param message
	 */
	public SiceeTNotaioDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SiceeTNotaioDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SiceeTNotaioDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
