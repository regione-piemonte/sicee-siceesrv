/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class SiceeRNotaioAce implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8002789861060198207L;

	/** 
	 * This attribute maps to the column ID_NOTAIO_ACE in the SICEE_R_NOTAIO_ACE table.
	 */
	protected Long idNotaioAce;

	/** 
	 * This attribute maps to the column ID_NOTAIO in the SICEE_R_NOTAIO_ACE table.
	 */
	protected Long idNotaio;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_R_NOTAIO_ACE table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_R_NOTAIO_ACE table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_R_NOTAIO_ACE table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column DT_INVIO in the SICEE_R_NOTAIO_ACE table.
	 */
	protected Timestamp dtInvio;

	/**
	 * Method 'SiceeRNotaioAce'
	 * 
	 */
	public SiceeRNotaioAce()
	{
	}

	/**
	 * Method 'getIdNotaioAce'
	 * 
	 * @return Long
	 */
	public Long getIdNotaioAce()
	{
		return idNotaioAce;
	}

	/**
	 * Method 'setIdNotaioAce'
	 * 
	 * @param idNotaioAce
	 */
	public void setIdNotaioAce(Long idNotaioAce)
	{
		this.idNotaioAce = idNotaioAce;
	}

	/**
	 * Method 'getIdNotaio'
	 * 
	 * @return Long
	 */
	public Long getIdNotaio()
	{
		return idNotaio;
	}

	/**
	 * Method 'setIdNotaio'
	 * 
	 * @param idNotaio
	 */
	public void setIdNotaio(Long idNotaio)
	{
		this.idNotaio = idNotaio;
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
	 * Method 'getDtInvio'
	 * 
	 * @return Date
	 */
	public Date getDtInvio()
	{
		return dtInvio;
	}

	/**
	 * Method 'setDtInvio'
	 * 
	 * @param dtInvio
	 */
	public void setDtInvio(Timestamp dtInvio)
	{
		this.dtInvio = dtInvio;
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
		
		if (!(_other instanceof SiceeRNotaioAce)) {
			return false;
		}
		
		final SiceeRNotaioAce _cast = (SiceeRNotaioAce) _other;
		if (idNotaioAce == null ? _cast.idNotaioAce != idNotaioAce : !idNotaioAce.equals( _cast.idNotaioAce )) {
			return false;
		}
		
		if (idNotaio == null ? _cast.idNotaio != idNotaio : !idNotaio.equals( _cast.idNotaio )) {
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
		
		if (dtInvio == null ? _cast.dtInvio != dtInvio : !dtInvio.equals( _cast.dtInvio )) {
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
		if (idNotaioAce != null) {
			_hashCode = 29 * _hashCode + idNotaioAce.hashCode();
		}
		
		if (idNotaio != null) {
			_hashCode = 29 * _hashCode + idNotaio.hashCode();
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
		
		if (dtInvio != null) {
			_hashCode = 29 * _hashCode + dtInvio.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeRNotaioAcePk
	 */
	public SiceeRNotaioAcePk createPk()
	{
		return new SiceeRNotaioAcePk(idNotaioAce);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAce: " );
		ret.append( "idNotaioAce=" + idNotaioAce );
		ret.append( ", idNotaio=" + idNotaio );
		ret.append( ", idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", dtInvio=" + dtInvio );
		return ret.toString();
	}

}
