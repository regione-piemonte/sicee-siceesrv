/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_D_DEST_USO table.
 */
public class SiceeDDestUsoPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6954080013599951126L;
	protected Integer idDestUso;

	/** 
	 * Sets the value of idDestUso
	 */
	public void setIdDestUso(Integer idDestUso)
	{
		this.idDestUso = idDestUso;
	}

	/** 
	 * Gets the value of idDestUso
	 */
	public Integer getIdDestUso()
	{
		return idDestUso;
	}

	/**
	 * Method 'SiceeDDestUsoPk'
	 * 
	 */
	public SiceeDDestUsoPk()
	{
	}

	/**
	 * Method 'SiceeDDestUsoPk'
	 * 
	 * @param idDestUso
	 */
	public SiceeDDestUsoPk(final Integer idDestUso)
	{
		this.idDestUso = idDestUso;
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
		
		if (!(_other instanceof SiceeDDestUsoPk)) {
			return false;
		}
		
		final SiceeDDestUsoPk _cast = (SiceeDDestUsoPk) _other;
		if (idDestUso == null ? _cast.idDestUso != idDestUso : !idDestUso.equals( _cast.idDestUso )) {
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
		if (idDestUso != null) {
			_hashCode = 29 * _hashCode + idDestUso.hashCode();
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDDestUsoPk: " );
		ret.append( "idDestUso=" + idDestUso );
		return ret.toString();
	}

}
