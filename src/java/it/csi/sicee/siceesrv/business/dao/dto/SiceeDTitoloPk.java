/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_D_TITOLO table.
 */
public class SiceeDTitoloPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3320094454382857710L;
	protected String idTitolo;

	/** 
	 * Sets the value of idTitolo
	 */
	public void setIdTitolo(String idTitolo)
	{
		this.idTitolo = idTitolo;
	}

	/** 
	 * Gets the value of idTitolo
	 */
	public String getIdTitolo()
	{
		return idTitolo;
	}

	/**
	 * Method 'SiceeDTitoloPk'
	 * 
	 */
	public SiceeDTitoloPk()
	{
	}

	/**
	 * Method 'SiceeDTitoloPk'
	 * 
	 * @param idTitolo
	 */
	public SiceeDTitoloPk(final String idTitolo)
	{
		this.idTitolo = idTitolo;
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
		
		if (!(_other instanceof SiceeDTitoloPk)) {
			return false;
		}
		
		final SiceeDTitoloPk _cast = (SiceeDTitoloPk) _other;
		if (idTitolo == null ? _cast.idTitolo != idTitolo : !idTitolo.equals( _cast.idTitolo )) {
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
		if (idTitolo != null) {
			_hashCode = 29 * _hashCode + idTitolo.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeDTitoloPk: " );
		ret.append( "idTitolo=" + idTitolo );
		return ret.toString();
	}

}
