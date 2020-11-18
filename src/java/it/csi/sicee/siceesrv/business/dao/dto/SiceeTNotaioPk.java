/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_NOTAIO table.
 */
public class SiceeTNotaioPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2739005043020533813L;
	protected Long idNotaio;

	/** 
	 * Sets the value of idNotaio
	 */
	public void setIdNotaio(Long idNotaio)
	{
		this.idNotaio = idNotaio;
	}

	/** 
	 * Gets the value of idNotaio
	 */
	public Long getIdNotaio()
	{
		return idNotaio;
	}

	/**
	 * Method 'SiceeTNotaioPk'
	 * 
	 */
	public SiceeTNotaioPk()
	{
	}

	/**
	 * Method 'SiceeTNotaioPk'
	 * 
	 * @param idNotaio
	 */
	public SiceeTNotaioPk(final Long idNotaio)
	{
		this.idNotaio = idNotaio;
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
		
		if (!(_other instanceof SiceeTNotaioPk)) {
			return false;
		}
		
		final SiceeTNotaioPk _cast = (SiceeTNotaioPk) _other;
		if (idNotaio == null ? _cast.idNotaio != idNotaio : !idNotaio.equals( _cast.idNotaio )) {
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
		if (idNotaio != null) {
			_hashCode = 29 * _hashCode + idNotaio.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaioPk: " );
		ret.append( "idNotaio=" + idNotaio );
		return ret.toString();
	}

}
