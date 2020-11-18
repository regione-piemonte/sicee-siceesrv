/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_SOSTITUZIONE table.
 */
public class SiceeTSostituzionePk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9123691784867452146L;

	protected Long idSostituzione;

	protected Long progrSostituzione;

	/** 
	 * Sets the value of idSostituzione
	 */
	public void setIdSostituzione(Long idSostituzione)
	{
		this.idSostituzione = idSostituzione;
	}

	/** 
	 * Gets the value of idSostituzione
	 */
	public Long getIdSostituzione()
	{
		return idSostituzione;
	}

	/** 
	 * Sets the value of progrSostituzione
	 */
	public void setProgrSostituzione(Long progrSostituzione)
	{
		this.progrSostituzione = progrSostituzione;
	}

	/** 
	 * Gets the value of progrSostituzione
	 */
	public Long getProgrSostituzione()
	{
		return progrSostituzione;
	}

	/**
	 * Method 'SiceeTSostituzionePk'
	 * 
	 */
	public SiceeTSostituzionePk()
	{
	}

	/**
	 * Method 'SiceeTSostituzionePk'
	 * 
	 * @param idSostituzione
	 * @param progrSostituzione
	 */
	public SiceeTSostituzionePk(final Long idSostituzione, final Long progrSostituzione)
	{
		this.idSostituzione = idSostituzione;
		this.progrSostituzione = progrSostituzione;
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
		
		if (!(_other instanceof SiceeTSostituzionePk)) {
			return false;
		}
		
		final SiceeTSostituzionePk _cast = (SiceeTSostituzionePk) _other;
		if (idSostituzione == null ? _cast.idSostituzione != idSostituzione : !idSostituzione.equals( _cast.idSostituzione )) {
			return false;
		}
		
		if (progrSostituzione == null ? _cast.progrSostituzione != progrSostituzione : !progrSostituzione.equals( _cast.progrSostituzione )) {
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
		if (idSostituzione != null) {
			_hashCode = 29 * _hashCode + idSostituzione.hashCode();
		}
		
		if (progrSostituzione != null) {
			_hashCode = 29 * _hashCode + progrSostituzione.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzionePk: " );
		ret.append( "idSostituzione=" + idSostituzione );
		ret.append( ", progrSostituzione=" + progrSostituzione );
		return ret.toString();
	}

}
