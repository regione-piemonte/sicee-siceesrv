/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class SiceeTRispettoNormative implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1606607856596578430L;

	/** 
	 * This attribute maps to the column DT_TITOLO in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected Date dtTitolo;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column FK_NORMA in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected Integer fkNorma;

	/** 
	 * This attribute maps to the column FLG_NORMA in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected String flgNorma;

	/** 
	 * This attribute maps to the column MOTIVO_NON_CONFORMITA in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected String motivoNonConformita;

	/** 
	 * This attribute maps to the column NOTE in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	protected String note;

	/**
	 * Method 'SiceeTRispettoNormative'
	 * 
	 */
	public SiceeTRispettoNormative()
	{
	}

	/**
	 * Method 'getDtTitolo'
	 * 
	 * @return Date
	 */
	public Date getDtTitolo()
	{
		return dtTitolo;
	}

	/**
	 * Method 'setDtTitolo'
	 * 
	 * @param dtTitolo
	 */
	public void setDtTitolo(Date dtTitolo)
	{
		this.dtTitolo = dtTitolo;
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
	 * Method 'getFkNorma'
	 * 
	 * @return Integer
	 */
	public Integer getFkNorma()
	{
		return fkNorma;
	}

	/**
	 * Method 'setFkNorma'
	 * 
	 * @param fkNorma
	 */
	public void setFkNorma(Integer fkNorma)
	{
		this.fkNorma = fkNorma;
	}

	/**
	 * Method 'getFlgNorma'
	 * 
	 * @return String
	 */
	public String getFlgNorma()
	{
		return flgNorma;
	}

	/**
	 * Method 'setFlgNorma'
	 * 
	 * @param flgNorma
	 */
	public void setFlgNorma(String flgNorma)
	{
		this.flgNorma = flgNorma;
	}

	/**
	 * Method 'getMotivoNonConformita'
	 * 
	 * @return String
	 */
	public String getMotivoNonConformita()
	{
		return motivoNonConformita;
	}

	/**
	 * Method 'setMotivoNonConformita'
	 * 
	 * @param motivoNonConformita
	 */
	public void setMotivoNonConformita(String motivoNonConformita)
	{
		this.motivoNonConformita = motivoNonConformita;
	}

	/**
	 * Method 'getNote'
	 * 
	 * @return String
	 */
	public String getNote()
	{
		return note;
	}

	/**
	 * Method 'setNote'
	 * 
	 * @param note
	 */
	public void setNote(String note)
	{
		this.note = note;
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
		
		if (!(_other instanceof SiceeTRispettoNormative)) {
			return false;
		}
		
		final SiceeTRispettoNormative _cast = (SiceeTRispettoNormative) _other;
		if (dtTitolo == null ? _cast.dtTitolo != dtTitolo : !dtTitolo.equals( _cast.dtTitolo )) {
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
		
		if (fkNorma == null ? _cast.fkNorma != fkNorma : !fkNorma.equals( _cast.fkNorma )) {
			return false;
		}
		
		if (flgNorma == null ? _cast.flgNorma != flgNorma : !flgNorma.equals( _cast.flgNorma )) {
			return false;
		}
		
		if (motivoNonConformita == null ? _cast.motivoNonConformita != motivoNonConformita : !motivoNonConformita.equals( _cast.motivoNonConformita )) {
			return false;
		}
		
		if (note == null ? _cast.note != note : !note.equals( _cast.note )) {
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
		if (dtTitolo != null) {
			_hashCode = 29 * _hashCode + dtTitolo.hashCode();
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
		
		if (fkNorma != null) {
			_hashCode = 29 * _hashCode + fkNorma.hashCode();
		}
		
		if (flgNorma != null) {
			_hashCode = 29 * _hashCode + flgNorma.hashCode();
		}
		
		if (motivoNonConformita != null) {
			_hashCode = 29 * _hashCode + motivoNonConformita.hashCode();
		}
		
		if (note != null) {
			_hashCode = 29 * _hashCode + note.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTRispettoNormativePk
	 */
	public SiceeTRispettoNormativePk createPk()
	{
		return new SiceeTRispettoNormativePk(idCertificatore, progrCertificato, anno);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTRispettoNormative: " );
		ret.append( "dtTitolo=" + dtTitolo );
		ret.append( ", idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", fkNorma=" + fkNorma );
		ret.append( ", flgNorma=" + flgNorma );
		ret.append( ", motivoNonConformita=" + motivoNonConformita );
		ret.append( ", note=" + note );
		return ret.toString();
	}

}
