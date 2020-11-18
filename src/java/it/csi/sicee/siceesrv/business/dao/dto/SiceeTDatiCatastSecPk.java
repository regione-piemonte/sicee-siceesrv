/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_DatiCatast_SEC table.
 */
public class SiceeTDatiCatastSecPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6772159351137843242L;
	protected Integer idDatiCatastSec;

	/** 
	 * Sets the value of idDatiCatastSec
	 */
	public void setIdDatiCatastSec(Integer idDatiCatastSec)
	{
		this.idDatiCatastSec = idDatiCatastSec;
	}

	/** 
	 * Gets the value of idDatiCatastSec
	 */
	public Integer getIdDatiCatastSec()
	{
		return idDatiCatastSec;
	}

	/**
	 * Method 'SiceeTDatiCatastSecPk'
	 * 
	 */
	public SiceeTDatiCatastSecPk()
	{
	}

	/**
	 * Method 'SiceeTDatiCatastSecPk'
	 * 
	 * @param idDatiCatastSec
	 */
	public SiceeTDatiCatastSecPk(final Integer idDatiCatastSec)
	{
		this.idDatiCatastSec = idDatiCatastSec;
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
		
		if (!(_other instanceof SiceeTDatiCatastSecPk)) {
			return false;
		}
		
		final SiceeTDatiCatastSecPk _cast = (SiceeTDatiCatastSecPk) _other;
		if (idDatiCatastSec == null ? _cast.idDatiCatastSec != idDatiCatastSec : !idDatiCatastSec.equals( _cast.idDatiCatastSec )) {
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
		if (idDatiCatastSec != null) {
			_hashCode = 29 * _hashCode + idDatiCatastSec.hashCode();
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTDatiCatastSecPk: " );
		ret.append( "idDatiCatastSec=" + idDatiCatastSec );
		return ret.toString();
	}

}
