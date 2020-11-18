/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_D_QUALITA_INVOLUCRO table.
 */
public class SiceeDQualitaInvolucroPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1222791714074272741L;
	protected Integer idQualita;

	/** 
	 * Sets the value of idQualita
	 */
	public void setIdQualita(Integer idQualita)
	{
		this.idQualita = idQualita;
	}

	/** 
	 * Gets the value of idQualita
	 */
	public Integer getIdQualita()
	{
		return idQualita;
	}

	/**
	 * Method 'SiceeDQualitaInvolucroPk'
	 * 
	 */
	public SiceeDQualitaInvolucroPk()
	{
	}

	/**
	 * Method 'SiceeDQualitaInvolucroPk'
	 * 
	 * @param idQualita
	 */
	public SiceeDQualitaInvolucroPk(final Integer idQualita)
	{
		this.idQualita = idQualita;
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
		
		if (!(_other instanceof SiceeDQualitaInvolucroPk)) {
			return false;
		}
		
		final SiceeDQualitaInvolucroPk _cast = (SiceeDQualitaInvolucroPk) _other;
		if (idQualita == null ? _cast.idQualita != idQualita : !idQualita.equals( _cast.idQualita )) {
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
		if (idQualita != null) {
			_hashCode = 29 * _hashCode + idQualita.hashCode();
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDQualitaInvolucroPk: " );
		ret.append( "idQualita=" + idQualita );
		return ret.toString();
	}

}
