/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_TRANSAZIONE_ACE table.
 */
public class SiceeTTransazioneAcePk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2256243111628663467L;

	protected long idTransazioneAce;

	/** 
	 * This attribute represents whether the primitive attribute idTransazioneAce is null.
	 */
	protected boolean idTransazioneAceNull;

	/** 
	 * Sets the value of idTransazioneAce
	 */
	public void setIdTransazioneAce(long idTransazioneAce)
	{
		this.idTransazioneAce = idTransazioneAce;
	}

	/** 
	 * Gets the value of idTransazioneAce
	 */
	public long getIdTransazioneAce()
	{
		return idTransazioneAce;
	}

	/**
	 * Method 'SiceeTTransazioneAcePk'
	 * 
	 */
	public SiceeTTransazioneAcePk()
	{
	}

	/**
	 * Method 'SiceeTTransazioneAcePk'
	 * 
	 * @param idTransazioneAce
	 */
	public SiceeTTransazioneAcePk(final long idTransazioneAce)
	{
		this.idTransazioneAce = idTransazioneAce;
	}

	/** 
	 * Sets the value of idTransazioneAceNull
	 */
	public void setIdTransazioneAceNull(boolean idTransazioneAceNull)
	{
		this.idTransazioneAceNull = idTransazioneAceNull;
	}

	/** 
	 * Gets the value of idTransazioneAceNull
	 */
	public boolean isIdTransazioneAceNull()
	{
		return idTransazioneAceNull;
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
		
		if (!(_other instanceof SiceeTTransazioneAcePk)) {
			return false;
		}
		
		final SiceeTTransazioneAcePk _cast = (SiceeTTransazioneAcePk) _other;
		if (idTransazioneAce != _cast.idTransazioneAce) {
			return false;
		}
		
		if (idTransazioneAceNull != _cast.idTransazioneAceNull) {
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
		_hashCode = 29 * _hashCode + (int) (idTransazioneAce ^ (idTransazioneAce >>> 32));
		_hashCode = 29 * _hashCode + (idTransazioneAceNull ? 1 : 0);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTTransazioneAcePk: " );
		ret.append( "idTransazioneAce=" + idTransazioneAce );
		return ret.toString();
	}

}
