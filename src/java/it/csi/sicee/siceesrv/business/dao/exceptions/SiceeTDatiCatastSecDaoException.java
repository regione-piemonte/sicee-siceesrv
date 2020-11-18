/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.exceptions;

public class SiceeTDatiCatastSecDaoException extends DaoException
{
	/**
	 * Method 'SiceeTDatiCatastSecDaoException'
	 * 
	 * @param message
	 */
	public SiceeTDatiCatastSecDaoException(String message)
	{
		super(message);
	}

	/**
	 * Method 'SiceeTDatiCatastSecDaoException'
	 * 
	 * @param message
	 * @param cause
	 */
	public SiceeTDatiCatastSecDaoException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
