/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_D_DICHIARAZIONE table.
 */
public class SiceeDDichiarazionePk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4847365212608945348L;
	protected Integer idDichiarazione;

	/** 
	 * Sets the value of idDichiarazione
	 */
	public void setIdDichiarazione(Integer idDichiarazione)
	{
		this.idDichiarazione = idDichiarazione;
	}

	/** 
	 * Gets the value of idDichiarazione
	 */
	public Integer getIdDichiarazione()
	{
		return idDichiarazione;
	}

	/**
	 * Method 'SiceeDDichiarazionePk'
	 * 
	 */
	public SiceeDDichiarazionePk()
	{
	}

	/**
	 * Method 'SiceeDDichiarazionePk'
	 * 
	 * @param idDichiarazione
	 */
	public SiceeDDichiarazionePk(final Integer idDichiarazione)
	{
		this.idDichiarazione = idDichiarazione;
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
		
		if (!(_other instanceof SiceeDDichiarazionePk)) {
			return false;
		}
		
		final SiceeDDichiarazionePk _cast = (SiceeDDichiarazionePk) _other;
		if (idDichiarazione == null ? _cast.idDichiarazione != idDichiarazione : !idDichiarazione.equals( _cast.idDichiarazione )) {
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
		if (idDichiarazione != null) {
			_hashCode = 29 * _hashCode + idDichiarazione.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeDDichiarazionePk: " );
		ret.append( "idDichiarazione=" + idDichiarazione );
		return ret.toString();
	}

}
