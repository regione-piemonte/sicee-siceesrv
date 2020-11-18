/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDQualitaInvolucro implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1239601114853667439L;

	/** 
	 * This attribute maps to the column ID_QUALITA in the SICEE_D_QUALITA_INVOLUCRO table.
	 */
	protected Integer idQualita;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_QUALITA_INVOLUCRO table.
	 */
	protected String descr;

	/**
	 * Method 'SiceeDQualitaInvolucro'
	 * 
	 */
	public SiceeDQualitaInvolucro()
	{
	}

	/**
	 * Method 'getIdQualita'
	 * 
	 * @return Integer
	 */
	public Integer getIdQualita()
	{
		return idQualita;
	}

	/**
	 * Method 'setIdQualita'
	 * 
	 * @param idQualita
	 */
	public void setIdQualita(Integer idQualita)
	{
		this.idQualita = idQualita;
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
		
		if (!(_other instanceof SiceeDQualitaInvolucro)) {
			return false;
		}
		
		final SiceeDQualitaInvolucro _cast = (SiceeDQualitaInvolucro) _other;
		if (idQualita == null ? _cast.idQualita != idQualita : !idQualita.equals( _cast.idQualita )) {
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
		if (idQualita != null) {
			_hashCode = 29 * _hashCode + idQualita.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDQualitaInvolucroPk
	 */
	public SiceeDQualitaInvolucroPk createPk()
	{
		return new SiceeDQualitaInvolucroPk(idQualita);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDQualitaInvolucro: " );
		ret.append( "idQualita=" + idQualita );
		ret.append( ", descr=" + descr );
		return ret.toString();
	}

}
