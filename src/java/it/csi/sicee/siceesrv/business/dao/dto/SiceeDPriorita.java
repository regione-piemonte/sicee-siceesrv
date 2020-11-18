/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDPriorita implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7928194902565367364L;

	/** 
	 * This attribute maps to the column PRIORITA in the SICEE_D_PRIORITA table.
	 */
	protected String priorita;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_PRIORITA table.
	 */
	protected String descr;

	/**
	 * Method 'SiceeDPriorita'
	 * 
	 */
	public SiceeDPriorita()
	{
	}

	/**
	 * Method 'getPriorita'
	 * 
	 * @return String
	 */
	public String getPriorita()
	{
		return priorita;
	}

	/**
	 * Method 'setPriorita'
	 * 
	 * @param priorita
	 */
	public void setPriorita(String priorita)
	{
		this.priorita = priorita;
	}

	/**
	 * Method 'getDescr'
	 * 
	 * @return String
	 */
	public String getDescr()
	{
		return descr;
	}

	/**
	 * Method 'setDescr'
	 * 
	 * @param descr
	 */
	public void setDescr(String descr)
	{
		this.descr = descr;
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
		
		if (!(_other instanceof SiceeDPriorita)) {
			return false;
		}
		
		final SiceeDPriorita _cast = (SiceeDPriorita) _other;
		if (priorita == null ? _cast.priorita != priorita : !priorita.equals( _cast.priorita )) {
			return false;
		}
		
		if (descr == null ? _cast.descr != descr : !descr.equals( _cast.descr )) {
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
		if (priorita != null) {
			_hashCode = 29 * _hashCode + priorita.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDPrioritaPk
	 */
	public SiceeDPrioritaPk createPk()
	{
		return new SiceeDPrioritaPk(priorita);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDPriorita: " );
		ret.append( "priorita=" + priorita );
		ret.append( ", descr=" + descr );
		return ret.toString();
	}

}
