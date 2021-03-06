/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_D_TIPO_IMPIANTO table.
 */
public class SiceeDTipoImpiantoPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7504390691897048175L;
	protected Integer idTipoImpianto;

	/** 
	 * Sets the value of idTipoImpianto
	 */
	public void setIdTipoImpianto(Integer idTipoImpianto)
	{
		this.idTipoImpianto = idTipoImpianto;
	}

	/** 
	 * Gets the value of idTipoImpianto
	 */
	public Integer getIdTipoImpianto()
	{
		return idTipoImpianto;
	}

	/**
	 * Method 'SiceeDTipoImpiantoPk'
	 * 
	 */
	public SiceeDTipoImpiantoPk()
	{
	}

	/**
	 * Method 'SiceeDTipoImpiantoPk'
	 * 
	 * @param idTipoImpianto
	 */
	public SiceeDTipoImpiantoPk(final Integer idTipoImpianto)
	{
		this.idTipoImpianto = idTipoImpianto;
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
		
		if (!(_other instanceof SiceeDTipoImpiantoPk)) {
			return false;
		}
		
		final SiceeDTipoImpiantoPk _cast = (SiceeDTipoImpiantoPk) _other;
		if (idTipoImpianto == null ? _cast.idTipoImpianto != idTipoImpianto : !idTipoImpianto.equals( _cast.idTipoImpianto )) {
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
		if (idTipoImpianto != null) {
			_hashCode = 29 * _hashCode + idTipoImpianto.hashCode();
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDTipoImpiantoPk: " );
		ret.append( "idTipoImpianto=" + idTipoImpianto );
		return ret.toString();
	}

}
