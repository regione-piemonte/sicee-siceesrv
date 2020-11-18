/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

/** 
 * This class represents the primary key of the SICEE_T_RACCOMANDAZIONI table.
 */
public class SiceeTRaccomandazioniPk implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8944184115895009936L;

	protected String idCertificatore;

	protected String progrCertificato;

	protected String anno;

	protected String priorita;

	protected String sistema;

	protected String intervento;

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
	 * Sets the value of priorita
	 */
	public void setPriorita(String priorita)
	{
		this.priorita = priorita;
	}

	/** 
	 * Gets the value of priorita
	 */
	public String getPriorita()
	{
		return priorita;
	}

	/** 
	 * Sets the value of sistema
	 */
	public void setSistema(String sistema)
	{
		this.sistema = sistema;
	}

	/** 
	 * Gets the value of sistema
	 */
	public String getSistema()
	{
		return sistema;
	}

	/** 
	 * Sets the value of intervento
	 */
	public void setIntervento(String intervento)
	{
		this.intervento = intervento;
	}

	/** 
	 * Gets the value of intervento
	 */
	public String getIntervento()
	{
		return intervento;
	}

	/**
	 * Method 'SiceeTRaccomandazioniPk'
	 * 
	 */
	public SiceeTRaccomandazioniPk()
	{
	}

	/**
	 * Method 'SiceeTRaccomandazioniPk'
	 * 
	 * @param idCertificatore
	 * @param progrCertificato
	 * @param anno
	 * @param priorita
	 * @param sistema
	 * @param intervento
	 */
	public SiceeTRaccomandazioniPk(final String idCertificatore, final String progrCertificato, final String anno, final String priorita, final String sistema, final String intervento)
	{
		this.idCertificatore = idCertificatore;
		this.progrCertificato = progrCertificato;
		this.anno = anno;
		this.priorita = priorita;
		this.sistema = sistema;
		this.intervento = intervento;
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
		
		if (!(_other instanceof SiceeTRaccomandazioniPk)) {
			return false;
		}
		
		final SiceeTRaccomandazioniPk _cast = (SiceeTRaccomandazioniPk) _other;
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (priorita == null ? _cast.priorita != priorita : !priorita.equals( _cast.priorita )) {
			return false;
		}
		
		if (sistema == null ? _cast.sistema != sistema : !sistema.equals( _cast.sistema )) {
			return false;
		}
		
		if (intervento == null ? _cast.intervento != intervento : !intervento.equals( _cast.intervento )) {
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
		
		if (priorita != null) {
			_hashCode = 29 * _hashCode + priorita.hashCode();
		}
		
		if (sistema != null) {
			_hashCode = 29 * _hashCode + sistema.hashCode();
		}
		
		if (intervento != null) {
			_hashCode = 29 * _hashCode + intervento.hashCode();
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTRaccomandazioniPk: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", priorita=" + priorita );
		ret.append( ", sistema=" + sistema );
		ret.append( ", intervento=" + intervento );
		return ret.toString();
	}

}
