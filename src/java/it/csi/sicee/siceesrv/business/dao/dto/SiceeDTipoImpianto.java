/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDTipoImpianto implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4363083362153840772L;

	/** 
	 * This attribute maps to the column ID_TIPO_IMPIANTO in the SICEE_D_TIPO_IMPIANTO table.
	 */
	protected Integer idTipoImpianto;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_TIPO_IMPIANTO table.
	 */
	protected String descr;

	/**
	 * Method 'SiceeDTipoImpianto'
	 * 
	 */
	public SiceeDTipoImpianto()
	{
	}

	/**
	 * Method 'getIdTipoImpianto'
	 * 
	 * @return Integer
	 */
	public Integer getIdTipoImpianto()
	{
		return idTipoImpianto;
	}

	/**
	 * Method 'setIdTipoImpianto'
	 * 
	 * @param idTipoImpianto
	 */
	public void setIdTipoImpianto(Integer idTipoImpianto)
	{
		this.idTipoImpianto = idTipoImpianto;
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
		
		if (!(_other instanceof SiceeDTipoImpianto)) {
			return false;
		}
		
		final SiceeDTipoImpianto _cast = (SiceeDTipoImpianto) _other;
		if (idTipoImpianto == null ? _cast.idTipoImpianto != idTipoImpianto : !idTipoImpianto.equals( _cast.idTipoImpianto )) {
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
		if (idTipoImpianto != null) {
			_hashCode = 29 * _hashCode + idTipoImpianto.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDTipoImpiantoPk
	 */
	public SiceeDTipoImpiantoPk createPk()
	{
		return new SiceeDTipoImpiantoPk(idTipoImpianto);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDTipoImpianto: " );
		ret.append( "idTipoImpianto=" + idTipoImpianto );
		ret.append( ", descr=" + descr );
		return ret.toString();
	}

}
