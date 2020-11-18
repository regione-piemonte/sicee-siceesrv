/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_R_DEST_CLASSE table.
 */
public class SiceeRDestClassePk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8540696082617274354L;

	protected Integer idClasse;

	protected Integer idDestUso;

	/** 
	 * Sets the value of idClasse
	 */
	public void setIdClasse(Integer idClasse)
	{
		this.idClasse = idClasse;
	}

	/** 
	 * Gets the value of idClasse
	 */
	public Integer getIdClasse()
	{
		return idClasse;
	}

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
	 * Method 'SiceeRDestClassePk'
	 * 
	 */
	public SiceeRDestClassePk()
	{
	}

	/**
	 * Method 'SiceeRDestClassePk'
	 * 
	 * @param idClasse
	 * @param idDestUso
	 */
	public SiceeRDestClassePk(final Integer idClasse, final Integer idDestUso)
	{
		this.idClasse = idClasse;
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
		
		if (!(_other instanceof SiceeRDestClassePk)) {
			return false;
		}
		
		final SiceeRDestClassePk _cast = (SiceeRDestClassePk) _other;
		if (idClasse == null ? _cast.idClasse != idClasse : !idClasse.equals( _cast.idClasse )) {
			return false;
		}
		
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
		if (idClasse != null) {
			_hashCode = 29 * _hashCode + idClasse.hashCode();
		}
		
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeRDestClassePk: " );
		ret.append( "idClasse=" + idClasse );
		ret.append( ", idDestUso=" + idDestUso );
		return ret.toString();
	}

}
