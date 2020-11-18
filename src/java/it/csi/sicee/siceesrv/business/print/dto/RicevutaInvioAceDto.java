/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.print.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class RicevutaInvioAceDto.
 */
public class RicevutaInvioAceDto extends GenericDto  implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	
	/** The numero certificato. */
	private String numeroCertificato;
	
	/** The nome certificatore. */
	private String nomeCertificatore;
	
	/** The descr dest uso. */
	private String descrDestUso;
	
	/** The nome cocertificatore. */
	private String nomeCocertificatore;
	
	/** The nome cocertificatore. */
	private String numeroProtocollo;
	
	/** The data invio. */
	private String dataInvio;
	
	/** The motivo rilascio. */
	private String descrMotivoRilascio;
	
	
	/** The tipologia edificio. */
	private String tipologiaEdificio;
	
	/** The motivo sostituzione. */
	private String motivoSostituzione;
	
	/** The firma. */
	private String firma;
	
	/** The dati catastali. */
	private DatiCatastaliDto datiCatastali;
	
	/** The dati catastali altri. */
	private DatiCatastaliDto[] datiCatastaliAltri;
	
	/** The ace sostituiti. */
	private String[] aceSostituiti;

	/** The logo. */
	private byte[] logo;
	
	/** The data odierna. */
	private String dataOdierna;
	
	private String[] sede;
	
	private String nota;
	
	private String dataSopralluogo;
	
	public String[] getSede() {
		return sede;
	}

	public void setSede(String[] sede) {
		this.sede = sede;
	}
	
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}

	/**
	 * Gets the data odierna.
	 *
	 * @return the data odierna
	 */
	public String getDataOdierna() {
		return dataOdierna;
	}

	/**
	 * Sets the data odierna.
	 *
	 * @param dataOdierna the new data odierna
	 */
	public void setDataOdierna(String dataOdierna) {
		this.dataOdierna = dataOdierna;
	}

	/**
	 * Gets the logo.
	 *
	 * @return the logo
	 */
	public byte[] getLogo() {
		return logo;
	}

	/**
	 * Sets the logo.
	 *
	 * @param logo the new logo
	 */
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
	/**
	 * Gets the tipologia edificio.
	 *
	 * @return the tipologia edificio
	 */
	public String getTipologiaEdificio() {
		return tipologiaEdificio;
	}

	/**
	 * Sets the tipologia edificio.
	 *
	 * @param tipologiaEdificio the new tipologia edificio
	 */
	public void setTipologiaEdificio(String tipologiaEdificio) {
		this.tipologiaEdificio = tipologiaEdificio;
	}

	/**
	 * Gets the motivo sostituzione.
	 *
	 * @return the motivo sostituzione
	 */
	public String getMotivoSostituzione() {
		return motivoSostituzione;
	}

	/**
	 * Sets the motivo sostituzione.
	 *
	 * @param motivoSostituzione the new motivo sostituzione
	 */
	public void setMotivoSostituzione(String motivoSostituzione) {
		this.motivoSostituzione = motivoSostituzione;
	}

	
	/**
	 * Sets the ace sostituiti.
	 *
	 * @param aceSostituiti the new ace sostituiti
	 */
	public void setAceSostituiti(String[] aceSostituiti) {
		this.aceSostituiti = aceSostituiti;
	}

	/**
	 * Gets the dati catastali.
	 *
	 * @return the dati catastali
	 */
	public DatiCatastaliDto getDatiCatastali() {
		return datiCatastali;
	}
	
	/**
	 * Sets the dati catastali.
	 *
	 * @param datiCatastali the new dati catastali
	 */
	public void setDatiCatastali(DatiCatastaliDto datiCatastali) {
		this.datiCatastali = datiCatastali;
	}
	
	/**
	 * Gets the dati catastali altri.
	 *
	 * @return the dati catastali altri
	 */
	public DatiCatastaliDto[] getDatiCatastaliAltri() {
		return datiCatastaliAltri;
	}
	
	/**
	 * Sets the dati catastali altri.
	 *
	 * @param datiCatastaliAltri the new dati catastali altri
	 */
	public void setDatiCatastaliAltri(DatiCatastaliDto[] datiCatastaliAltri) {
		this.datiCatastaliAltri = datiCatastaliAltri;
	}
	
	/**
	 * Gets the numero certificato.
	 *
	 * @return the numero certificato
	 */
	public String getNumeroCertificato() {
		return numeroCertificato;
	}
	
	/**
	 * Sets the numero certificato.
	 *
	 * @param numeroCertificato the new numero certificato
	 */
	public void setNumeroCertificato(String numeroCertificato) {
		this.numeroCertificato = numeroCertificato;
	}
	
	/**
	 * Gets the nome certificatore.
	 *
	 * @return the nome certificatore
	 */
	public String getNomeCertificatore() {
		return nomeCertificatore;
	}
	
	/**
	 * Sets the nome certificatore.
	 *
	 * @param nome the new nome certificatore
	 */
	public void setNomeCertificatore(String nome) {
		nomeCertificatore = nome;
	}
	
	/**
	 * Gets the nome cocertificatore.
	 *
	 * @return the nome cocertificatore
	 */
	public String getNomeCocertificatore() {
		return nomeCocertificatore;
	}

	/**
	 * Sets the nome cocertificatore.
	 *
	 * @param nomeCocertificatore the new nome cocertificatore
	 */
	public void setNomeCocertificatore(String nomeCocertificatore) {
		this.nomeCocertificatore = nomeCocertificatore;
	}

	

	/**
	 * @return the numeroProtocollo
	 */
	public String getNumeroProtocollo() {
		return numeroProtocollo;
	}

	/**
	 * @param numeroProtocollo the numeroProtocollo to set
	 */
	public void setNumeroProtocollo(String numeroProtocollo) {
		this.numeroProtocollo = numeroProtocollo;
	}

	/**
	 * Gets the data invio.
	 *
	 * @return the data invio
	 */
	public String getDataInvio() {
		return dataInvio;
	}
	
	/**
	 * Sets the data invio.
	 *
	 * @param dataInvio the new data invio
	 */
	public void setDataInvio(String dataInvio) {
		this.dataInvio = dataInvio;
	}
	
	/**
	 * Sets the firma.
	 *
	 * @param firma the new firma
	 */
	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	/**
	 * Gets the firma.
	 *
	 * @return the firma
	 */
	public String getFirma() {
		return firma;
	}

	/**
	 * Gets the ace sostituiti.
	 *
	 * @return the ace sostituiti
	 */
	public String[] getAceSostituiti() {
		return aceSostituiti;
	}

	/**
	 * Gets the descr dest uso.
	 *
	 * @return the descr dest uso
	 */
	public String getDescrDestUso() {
		return descrDestUso;
	}

	/**
	 * Sets the descr dest uso.
	 *
	 * @param descrDestUso the new descr dest uso
	 */
	public void setDescrDestUso(String descrDestUso) {
		this.descrDestUso = descrDestUso;
	}

	/**
	 * Gets the descr motivo rilascio.
	 *
	 * @return the descr motivo rilascio
	 */
	public String getDescrMotivoRilascio() {
		return descrMotivoRilascio;
	}
	
	/**
	 * Sets the descr motivo rilascio.
	 *
	 * @param descrMotivoRilascio the new descr motivo rilascio
	 */
	public void setDescrMotivoRilascio(String descrMotivoRilascio) {
		this.descrMotivoRilascio = descrMotivoRilascio;
	}

	/**
	 * @return the dataSopralluogo
	 */
	public String getDataSopralluogo() {
		return dataSopralluogo;
	}

	/**
	 * @param dataSopralluogo the dataSopralluogo to set
	 */
	public void setDataSopralluogo(String dataSopralluogo) {
		this.dataSopralluogo = dataSopralluogo;
	}

	
}
