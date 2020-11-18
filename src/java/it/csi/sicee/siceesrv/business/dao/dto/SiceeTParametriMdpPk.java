/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SICEE_T_PARAMETRI_MDP table.
 */
public class SiceeTParametriMdpPk implements Serializable
{
	protected long idParametriMdp;

	/** 
	 * This attribute represents whether the primitive attribute idParametriMdp is null.
	 */
	protected boolean idParametriMdpNull;

	/** 
	 * Sets the value of idParametriMdp
	 */
	public void setIdParametriMdp(long idParametriMdp)
	{
		this.idParametriMdp = idParametriMdp;
	}

	/** 
	 * Gets the value of idParametriMdp
	 */
	public long getIdParametriMdp()
	{
		return idParametriMdp;
	}

	/**
	 * Method 'SiceeTParametriMdpPk'
	 * 
	 */
	public SiceeTParametriMdpPk()
	{
	}

	/**
	 * Method 'SiceeTParametriMdpPk'
	 * 
	 * @param idParametriMdp
	 */
	public SiceeTParametriMdpPk(final long idParametriMdp)
	{
		this.idParametriMdp = idParametriMdp;
	}

	/** 
	 * Sets the value of idParametriMdpNull
	 */
	public void setIdParametriMdpNull(boolean idParametriMdpNull)
	{
		this.idParametriMdpNull = idParametriMdpNull;
	}

	/** 
	 * Gets the value of idParametriMdpNull
	 */
	public boolean isIdParametriMdpNull()
	{
		return idParametriMdpNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SiceeTParametriMdpPk)) {
			return false;
		}
		
		final SiceeTParametriMdpPk _cast = (SiceeTParametriMdpPk) _other;
		if (idParametriMdp != _cast.idParametriMdp) {
			return false;
		}
		
		if (idParametriMdpNull != _cast.idParametriMdpNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (idParametriMdp ^ (idParametriMdp >>> 32));
		_hashCode = 29 * _hashCode + (idParametriMdpNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTParametriMdpPk: " );
		ret.append( "idParametriMdp=" + idParametriMdp );
		return ret.toString();
	}

}
