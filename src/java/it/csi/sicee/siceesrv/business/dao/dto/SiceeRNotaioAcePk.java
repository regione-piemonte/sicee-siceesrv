/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_R_NOTAIO_ACE table.
 */
public class SiceeRNotaioAcePk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1868573914935817087L;
	protected Long idNotaioAce;

	/** 
	 * Sets the value of idNotaioAce
	 */
	public void setIdNotaioAce(Long idNotaioAce)
	{
		this.idNotaioAce = idNotaioAce;
	}

	/** 
	 * Gets the value of idNotaioAce
	 */
	public Long getIdNotaioAce()
	{
		return idNotaioAce;
	}

	/**
	 * Method 'SiceeRNotaioAcePk'
	 * 
	 */
	public SiceeRNotaioAcePk()
	{
	}

	/**
	 * Method 'SiceeRNotaioAcePk'
	 * 
	 * @param idNotaioAce
	 */
	public SiceeRNotaioAcePk(final Long idNotaioAce)
	{
		this.idNotaioAce = idNotaioAce;
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
		
		if (!(_other instanceof SiceeRNotaioAcePk)) {
			return false;
		}
		
		final SiceeRNotaioAcePk _cast = (SiceeRNotaioAcePk) _other;
		if (idNotaioAce == null ? _cast.idNotaioAce != idNotaioAce : !idNotaioAce.equals( _cast.idNotaioAce )) {
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
		if (idNotaioAce != null) {
			_hashCode = 29 * _hashCode + idNotaioAce.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAcePk: " );
		ret.append( "idNotaioAce=" + idNotaioAce );
		return ret.toString();
	}

}
