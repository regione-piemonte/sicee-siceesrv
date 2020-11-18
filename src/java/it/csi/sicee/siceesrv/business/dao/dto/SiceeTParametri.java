/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTParametri implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -618396516915600372L;

	/** 
	 * This attribute maps to the column CODICE in the SICEE_T_PARAMETRI table.
	 */
	protected String codice;

	/** 
	 * This attribute maps to the column VALORE in the SICEE_T_PARAMETRI table.
	 */
	protected String valore;

	/**
	 * Method 'SiceeTParametri'
	 * 
	 */
	public SiceeTParametri()
	{
	}

	/**
	 * Method 'getCodice'
	 * 
	 * @return String
	 */
	public String getCodice()
	{
		return codice;
	}

	/**
	 * Method 'setCodice'
	 * 
	 * @param codice
	 */
	public void setCodice(String codice)
	{
		this.codice = codice;
	}

	/**
	 * Method 'getValore'
	 * 
	 * @return String
	 */
	public String getValore()
	{
		return valore;
	}

	/**
	 * Method 'setValore'
	 * 
	 * @param valore
	 */
	public void setValore(String valore)
	{
		this.valore = valore;
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
		
		if (!(_other instanceof SiceeTParametri)) {
			return false;
		}
		
		final SiceeTParametri _cast = (SiceeTParametri) _other;
		if (codice == null ? _cast.codice != codice : !codice.equals( _cast.codice )) {
			return false;
		}
		
		if (valore == null ? _cast.valore != valore : !valore.equals( _cast.valore )) {
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
		if (codice != null) {
			_hashCode = 29 * _hashCode + codice.hashCode();
		}
		
		if (valore != null) {
			_hashCode = 29 * _hashCode + valore.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametri: " );
		ret.append( "codice=" + codice );
		ret.append( ", valore=" + valore );
		return ret.toString();
	}

}
