/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class SiceeLAccessoPk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4114158566399266037L;
	
	protected Timestamp dtAccesso;
	
	public SiceeLAccessoPk(Timestamp dtAccesso) {
		this.dtAccesso = dtAccesso;
	}

	public Timestamp getDtAccesso() {
		return dtAccesso;
	}

	public void setDtAccesso(Timestamp dtAccesso) {
		this.dtAccesso = dtAccesso;
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
		
		if (!(_other instanceof SiceeLAccesso)) {
			return false;
		}
		
		final SiceeLAccessoPk _cast = (SiceeLAccessoPk) _other;
		if (dtAccesso == null ? _cast.dtAccesso != dtAccesso : !dtAccesso.equals( _cast.dtAccesso )) {
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
		if (dtAccesso != null) {
			_hashCode = 29 * _hashCode + dtAccesso.hashCode();
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeLAccessoPk: " );
		ret.append( "dtAccesso=" + dtAccesso );
		return ret.toString();
	}
}
