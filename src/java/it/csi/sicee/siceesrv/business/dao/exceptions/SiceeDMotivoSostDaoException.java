/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.exceptions;

public class SiceeDMotivoSostDaoException extends DaoException
{
	/**
	 * Method 'SiceeDMotivoSostDaoException'
	 * 
	 * @param message
	 */
	public SiceeDMotivoSostDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SiceeDMotivoSostDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SiceeDMotivoSostDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
