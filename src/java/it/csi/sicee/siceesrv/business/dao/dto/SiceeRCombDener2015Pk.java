/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SICEE_R_COMB_DENER_2015 table.
 */
public class SiceeRCombDener2015Pk implements Serializable
{
	protected Integer idCombustibile;

	protected String idCertificatore;

	protected String progrCertificato;

	protected String anno;

	/** 
	 * Sets the value of idCombustibile
	 */
	public void setIdCombustibile(Integer idCombustibile)
	{
		this.idCombustibile = idCombustibile;
	}

	/** 
	 * Gets the value of idCombustibile
	 */
	public Integer getIdCombustibile()
	{
		return idCombustibile;
	}

	/** 
	 * Sets the value of idCertificatore
	 */
	public void setIdCertificatore(String idCertificatore)
	{
		this.idCertificatore = idCertificatore;
	}

	/** 
	 * Gets the value of idCertificatore
	 */
	public String getIdCertificatore()
	{
		return idCertificatore;
	}

	/** 
	 * Sets the value of progrCertificato
	 */
	public void setProgrCertificato(String progrCertificato)
	{
		this.progrCertificato = progrCertificato;
	}

	/** 
	 * Gets the value of progrCertificato
	 */
	public String getProgrCertificato()
	{
		return progrCertificato;
	}

	/** 
	 * Sets the value of anno
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
	}

	/** 
	 * Gets the value of anno
	 */
	public String getAnno()
	{
		return anno;
	}

	/**
	 * Method 'SiceeRCombDener2015Pk'
	 * 
	 */
	public SiceeRCombDener2015Pk()
	{
	}

	/**
	 * Method 'SiceeRCombDener2015Pk'
	 * 
	 * @param idCombustibile
	 * @param idCertificatore
	 * @param progrCertificato
	 * @param anno
	 */
	public SiceeRCombDener2015Pk(final Integer idCombustibile, final String idCertificatore, final String progrCertificato, final String anno)
	{
		this.idCombustibile = idCombustibile;
		this.idCertificatore = idCertificatore;
		this.progrCertificato = progrCertificato;
		this.anno = anno;
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
		
		if (!(_other instanceof SiceeRCombDener2015Pk)) {
			return false;
		}
		
		final SiceeRCombDener2015Pk _cast = (SiceeRCombDener2015Pk) _other;
		if (idCombustibile == null ? _cast.idCombustibile != idCombustibile : !idCombustibile.equals( _cast.idCombustibile )) {
			return false;
		}
		
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
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
		if (idCombustibile != null) {
			_hashCode = 29 * _hashCode + idCombustibile.hashCode();
		}
		
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (progrCertificato != null) {
			_hashCode = 29 * _hashCode + progrCertificato.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeRCombDener2015Pk: " );
		ret.append( "idCombustibile=" + idCombustibile );
		ret.append( ", idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		return ret.toString();
	}

}
