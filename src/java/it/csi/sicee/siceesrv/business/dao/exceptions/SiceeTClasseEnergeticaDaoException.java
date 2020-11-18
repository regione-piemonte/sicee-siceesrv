/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.exceptions;

public class SiceeTClasseEnergeticaDaoException extends DaoException
{
	/**
	 * Method 'SiceeTClasseEnergeticaDaoException'
	 * 
	 * @param message
	 */
	public SiceeTClasseEnergeticaDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SiceeTClasseEnergeticaDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SiceeTClasseEnergeticaDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
