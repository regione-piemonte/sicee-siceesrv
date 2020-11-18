/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTRaccomandazioni implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3584643058564603734L;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column PRIORITA in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String priorita;

	/** 
	 * This attribute maps to the column SISTEMA in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String sistema;

	/** 
	 * This attribute maps to the column INTERVENTO in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String intervento;

	/** 
	 * This attribute maps to the column TEMPO_RITORNO in the SICEE_T_RACCOMANDAZIONI table.
	 */
	protected String tempoRitorno;

	/**
	 * Method 'SiceeTRaccomandazioni'
	 * 
	 */
	public SiceeTRaccomandazioni()
	{
	}

	/**
	 * Method 'getIdCertificatore'
	 * 
	 * @return String
	 */
	public String getIdCertificatore()
	{
		return idCertificatore;
	}

	/**
	 * Method 'setIdCertificatore'
	 * 
	 * @param idCertificatore
	 */
	public void setIdCertificatore(String idCertificatore)
	{
		this.idCertificatore = idCertificatore;
	}

	/**
	 * Method 'getProgrCertificato'
	 * 
	 * @return String
	 */
	public String getProgrCertificato()
	{
		return progrCertificato;
	}

	/**
	 * Method 'setProgrCertificato'
	 * 
	 * @param progrCertificato
	 */
	public void setProgrCertificato(String progrCertificato)
	{
		this.progrCertificato = progrCertificato;
	}

	/**
	 * Method 'getAnno'
	 * 
	 * @return String
	 */
	public String getAnno()
	{
		return anno;
	}

	/**
	 * Method 'setAnno'
	 * 
	 * @param anno
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
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
	 * Method 'getSistema'
	 * 
	 * @return String
	 */
	public String getSistema()
	{
		return sistema;
	}

	/**
	 * Method 'setSistema'
	 * 
	 * @param sistema
	 */
	public void setSistema(String sistema)
	{
		this.sistema = sistema;
	}

	/**
	 * Method 'getIntervento'
	 * 
	 * @return String
	 */
	public String getIntervento()
	{
		return intervento;
	}

	/**
	 * Method 'setIntervento'
	 * 
	 * @param intervento
	 */
	public void setIntervento(String intervento)
	{
		this.intervento = intervento;
	}

	/**
	 * Method 'getTempoRitorno'
	 * 
	 * @return String
	 */
	public String getTempoRitorno()
	{
		return tempoRitorno;
	}

	/**
	 * Method 'setTempoRitorno'
	 * 
	 * @param tempoRitorno
	 */
	public void setTempoRitorno(String tempoRitorno)
	{
		this.tempoRitorno = tempoRitorno;
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
		
		if (!(_other instanceof SiceeTRaccomandazioni)) {
			return false;
		}
		
		final SiceeTRaccomandazioni _cast = (SiceeTRaccomandazioni) _other;
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
		
		if (tempoRitorno == null ? _cast.tempoRitorno != tempoRitorno : !tempoRitorno.equals( _cast.tempoRitorno )) {
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
		
		if (tempoRitorno != null) {
			_hashCode = 29 * _hashCode + tempoRitorno.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTRaccomandazioniPk
	 */
	public SiceeTRaccomandazioniPk createPk()
	{
		return new SiceeTRaccomandazioniPk(idCertificatore, progrCertificato, anno, priorita, sistema, intervento);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTRaccomandazioni: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", priorita=" + priorita );
		ret.append( ", sistema=" + sistema );
		ret.append( ", intervento=" + intervento );
		ret.append( ", tempoRitorno=" + tempoRitorno );
		return ret.toString();
	}

}
