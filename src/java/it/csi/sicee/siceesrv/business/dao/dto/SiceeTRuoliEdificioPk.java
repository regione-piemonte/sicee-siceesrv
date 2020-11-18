/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_RUOLI_EDIFICIO table.
 */
public class SiceeTRuoliEdificioPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3959524168887163361L;

	protected String idCertificatore;

	protected String progrCertificato;

	protected String anno;

	protected Integer fkTipoRuolo;

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
	 * Sets the value of fkTipoRuolo
	 */
	public void setFkTipoRuolo(Integer fkTipoRuolo)
	{
		this.fkTipoRuolo = fkTipoRuolo;
	}

	/** 
	 * Gets the value of fkTipoRuolo
	 */
	public Integer getFkTipoRuolo()
	{
		return fkTipoRuolo;
	}

	/**
	 * Method 'SiceeTRuoliEdificioPk'
	 * 
	 */
	public SiceeTRuoliEdificioPk()
	{
	}

	/**
	 * Method 'SiceeTRuoliEdificioPk'
	 * 
	 * @param idCertificatore
	 * @param progrCertificato
	 * @param anno
	 * @param fkTipoRuolo
	 */
	public SiceeTRuoliEdificioPk(final String idCertificatore, final String progrCertificato, final String anno, final Integer fkTipoRuolo)
	{
		this.idCertificatore = idCertificatore;
		this.progrCertificato = progrCertificato;
		this.anno = anno;
		this.fkTipoRuolo = fkTipoRuolo;
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
		
		if (!(_other instanceof SiceeTRuoliEdificioPk)) {
			return false;
		}
		
		final SiceeTRuoliEdificioPk _cast = (SiceeTRuoliEdificioPk) _other;
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (fkTipoRuolo == null ? _cast.fkTipoRuolo != fkTipoRuolo : !fkTipoRuolo.equals( _cast.fkTipoRuolo )) {
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
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (progrCertificato != null) {
			_hashCode = 29 * _hashCode + progrCertificato.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
		if (fkTipoRuolo != null) {
			_hashCode = 29 * _hashCode + fkTipoRuolo.hashCode();
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTRuoliEdificioPk: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", fkTipoRuolo=" + fkTipoRuolo );
		return ret.toString();
	}

}
