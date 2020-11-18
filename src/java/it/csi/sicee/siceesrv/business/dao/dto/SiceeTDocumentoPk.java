/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_DOCUMENTO table.
 */
public class SiceeTDocumentoPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3557543691479829438L;
	protected Integer idDocumento;

	/** 
	 * Sets the value of idDocumento
	 */
	public void setIdDocumento(Integer idDocumento)
	{
		this.idDocumento = idDocumento;
	}

	/** 
	 * Gets the value of idDocumento
	 */
	public Integer getIdDocumento()
	{
		return idDocumento;
	}

	/**
	 * Method 'SiceeTDocumentoPk'
	 * 
	 */
	public SiceeTDocumentoPk()
	{
	}

	/**
	 * Method 'SiceeTDocumentoPk'
	 * 
	 * @param idDocumento
	 */
	public SiceeTDocumentoPk(final Integer idDocumento)
	{
		this.idDocumento = idDocumento;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	@Override
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SiceeTDocumentoPk)) {
			return false;
		}
		
		final SiceeTDocumentoPk _cast = (SiceeTDocumentoPk) _other;
		if (idDocumento == null ? _cast.idDocumento != idDocumento : !idDocumento.equals( _cast.idDocumento )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	@Override
	public int hashCode()
	{
		int _hashCode = 0;
		if (idDocumento != null) {
			_hashCode = 29 * _hashCode + idDocumento.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumentoPk: " );
		ret.append( "idDocumento=" + idDocumento );
		return ret.toString();
	}

}
