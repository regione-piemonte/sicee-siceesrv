/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class SiceeTTransazioneAce implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7044914147364284158L;

	/** 
	 * This attribute maps to the column ID_TRANSAZIONE_ACE in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected long idTransazioneAce;

	/** 
	 * This attribute maps to the column FK_TIPO_PAGAMENTO in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected Integer fkTipoPagamento;

	/** 
	 * This attribute maps to the column NUM_TRANSAZIONE in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected String numTransazione;

	/** 
	 * This attribute maps to the column DATA_TRANSAZIONE in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected Date dataTransazione;

	/** 
	 * This attribute maps to the column FLG_VERIFICATO in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected String flgVerificato;

	/** 
	 * This attribute maps to the column ESEGUITO_NOME in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected String eseguitoNome;

	/** 
	 * This attribute maps to the column ESEGUITO_COGNOME in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected String eseguitoCognome;

	/** 
	 * This attribute maps to the column FK_CERTIFICATORE in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected String fkCertificatore;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column QUANTITA in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	protected Integer quantita;

	/**
	 * Method 'SiceeTTransazioneAce'
	 * 
	 */
	public SiceeTTransazioneAce()
	{
	}

	/**
	 * Method 'getIdTransazioneAce'
	 * 
	 * @return long
	 */
	public long getIdTransazioneAce()
	{
		return idTransazioneAce;
	}

	/**
	 * Method 'setIdTransazioneAce'
	 * 
	 * @param idTransazioneAce
	 */
	public void setIdTransazioneAce(long idTransazioneAce)
	{
		this.idTransazioneAce = idTransazioneAce;
	}

	/**
	 * Method 'getFkTipoPagamento'
	 * 
	 * @return Integer
	 */
	public Integer getFkTipoPagamento()
	{
		return fkTipoPagamento;
	}

	/**
	 * Method 'setFkTipoPagamento'
	 * 
	 * @param fkTipoPagamento
	 */
	public void setFkTipoPagamento(Integer fkTipoPagamento)
	{
		this.fkTipoPagamento = fkTipoPagamento;
	}

	/**
	 * Method 'getNumTransazione'
	 * 
	 * @return String
	 */
	public String getNumTransazione()
	{
		return numTransazione;
	}

	/**
	 * Method 'setNumTransazione'
	 * 
	 * @param numTransazione
	 */
	public void setNumTransazione(String numTransazione)
	{
		this.numTransazione = numTransazione;
	}

	/**
	 * Method 'getDataTransazione'
	 * 
	 * @return Date
	 */
	public Date getDataTransazione()
	{
		return dataTransazione;
	}

	/**
	 * Method 'setDataTransazione'
	 * 
	 * @param dataTransazione
	 */
	public void setDataTransazione(Date dataTransazione)
	{
		this.dataTransazione = dataTransazione;
	}

	/**
	 * Method 'getFlgVerificato'
	 * 
	 * @return String
	 */
	public String getFlgVerificato()
	{
		return flgVerificato;
	}

	/**
	 * Method 'setFlgVerificato'
	 * 
	 * @param flgVerificato
	 */
	public void setFlgVerificato(String flgVerificato)
	{
		this.flgVerificato = flgVerificato;
	}

	/**
	 * Method 'getEseguitoNome'
	 * 
	 * @return String
	 */
	public String getEseguitoNome()
	{
		return eseguitoNome;
	}

	/**
	 * Method 'setEseguitoNome'
	 * 
	 * @param eseguitoNome
	 */
	public void setEseguitoNome(String eseguitoNome)
	{
		this.eseguitoNome = eseguitoNome;
	}

	/**
	 * Method 'getEseguitoCognome'
	 * 
	 * @return String
	 */
	public String getEseguitoCognome()
	{
		return eseguitoCognome;
	}

	/**
	 * Method 'setEseguitoCognome'
	 * 
	 * @param eseguitoCognome
	 */
	public void setEseguitoCognome(String eseguitoCognome)
	{
		this.eseguitoCognome = eseguitoCognome;
	}

	/**
	 * Method 'getFkCertificatore'
	 * 
	 * @return String
	 */
	public String getFkCertificatore()
	{
		return fkCertificatore;
	}

	/**
	 * Method 'setFkCertificatore'
	 * 
	 * @param fkCertificatore
	 */
	public void setFkCertificatore(String fkCertificatore)
	{
		this.fkCertificatore = fkCertificatore;
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
	 * Method 'getQuantita'
	 * 
	 * @return Integer
	 */
	public Integer getQuantita()
	{
		return quantita;
	}

	/**
	 * Method 'setQuantita'
	 * 
	 * @param quantita
	 */
	public void setQuantita(Integer quantita)
	{
		this.quantita = quantita;
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
		
		if (!(_other instanceof SiceeTTransazioneAce)) {
			return false;
		}
		
		final SiceeTTransazioneAce _cast = (SiceeTTransazioneAce) _other;
		if (idTransazioneAce != _cast.idTransazioneAce) {
			return false;
		}
		
		if (fkTipoPagamento == null ? _cast.fkTipoPagamento != fkTipoPagamento : !fkTipoPagamento.equals( _cast.fkTipoPagamento )) {
			return false;
		}
		
		if (numTransazione == null ? _cast.numTransazione != numTransazione : !numTransazione.equals( _cast.numTransazione )) {
			return false;
		}
		
		if (dataTransazione == null ? _cast.dataTransazione != dataTransazione : !dataTransazione.equals( _cast.dataTransazione )) {
			return false;
		}
		
		if (flgVerificato == null ? _cast.flgVerificato != flgVerificato : !flgVerificato.equals( _cast.flgVerificato )) {
			return false;
		}
		
		if (eseguitoNome == null ? _cast.eseguitoNome != eseguitoNome : !eseguitoNome.equals( _cast.eseguitoNome )) {
			return false;
		}
		
		if (eseguitoCognome == null ? _cast.eseguitoCognome != eseguitoCognome : !eseguitoCognome.equals( _cast.eseguitoCognome )) {
			return false;
		}
		
		if (fkCertificatore == null ? _cast.fkCertificatore != fkCertificatore : !fkCertificatore.equals( _cast.fkCertificatore )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (quantita == null ? _cast.quantita != quantita : !quantita.equals( _cast.quantita )) {
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
		_hashCode = 29 * _hashCode + (int) (idTransazioneAce ^ (idTransazioneAce >>> 32));
		if (fkTipoPagamento != null) {
			_hashCode = 29 * _hashCode + fkTipoPagamento.hashCode();
		}
		
		if (numTransazione != null) {
			_hashCode = 29 * _hashCode + numTransazione.hashCode();
		}
		
		if (dataTransazione != null) {
			_hashCode = 29 * _hashCode + dataTransazione.hashCode();
		}
		
		if (flgVerificato != null) {
			_hashCode = 29 * _hashCode + flgVerificato.hashCode();
		}
		
		if (eseguitoNome != null) {
			_hashCode = 29 * _hashCode + eseguitoNome.hashCode();
		}
		
		if (eseguitoCognome != null) {
			_hashCode = 29 * _hashCode + eseguitoCognome.hashCode();
		}
		
		if (fkCertificatore != null) {
			_hashCode = 29 * _hashCode + fkCertificatore.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
		if (quantita != null) {
			_hashCode = 29 * _hashCode + quantita.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTTransazioneAcePk
	 */
	public SiceeTTransazioneAcePk createPk()
	{
		return new SiceeTTransazioneAcePk(idTransazioneAce);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTTransazioneAce: " );
		ret.append( "idTransazioneAce=" + idTransazioneAce );
		ret.append( ", fkTipoPagamento=" + fkTipoPagamento );
		ret.append( ", numTransazione=" + numTransazione );
		ret.append( ", dataTransazione=" + dataTransazione );
		ret.append( ", flgVerificato=" + flgVerificato );
		ret.append( ", eseguitoNome=" + eseguitoNome );
		ret.append( ", eseguitoCognome=" + eseguitoCognome );
		ret.append( ", fkCertificatore=" + fkCertificatore );
		ret.append( ", anno=" + anno );
		ret.append( ", quantita=" + quantita );
		return ret.toString();
	}

}
