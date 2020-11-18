/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.print.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class DtIndiciFabbisogno.
 */
public class DtIndiciFabbisogno implements java.io.Serializable {

	/// Field [domEnergRiscald]
	/** The _dom energ riscald. */
	private Double _domEnergRiscald = null;

	/**
	 * Sets the dom energ riscald.
	 *
	 * @param val the new dom energ riscald
	 */
	public void setDomEnergRiscald(
			Double val) {
		_domEnergRiscald = val;
	}

	/**
	 * Gets the dom energ riscald.
	 *
	 * @return the dom energ riscald
	 */
	public Double getDomEnergRiscald() {
		return _domEnergRiscald;
	}

	/// Field [limNormRegione]
	/** The _lim norm regione. */
	private Double _limNormRegione = null;

	/**
	 * Sets the lim norm regione.
	 *
	 * @param val the new lim norm regione
	 */
	public void setLimNormRegione(
			Double val) {
		_limNormRegione = val;
	}

	/**
	 * Gets the lim norm regione.
	 *
	 * @return the lim norm regione
	 */
	public Double getLimNormRegione() {
		return _limNormRegione;
	}

	/// Field [fabbCondizionamento]
	/** The _fabb condizionamento. */
	private Double _fabbCondizionamento = null;

	/**
	 * Sets the fabb condizionamento.
	 *
	 * @param val the new fabb condizionamento
	 */
	public void setFabbCondizionamento(
			Double val) {
		_fabbCondizionamento = val;
	}

	/**
	 * Gets the fabb condizionamento.
	 *
	 * @return the fabb condizionamento
	 */
	public Double getFabbCondizionamento() {
		return _fabbCondizionamento;
	}

	/// Field [domEnergAcqua]
	/** The _dom energ acqua. */
	private Double _domEnergAcqua = null;

	/**
	 * Sets the dom energ acqua.
	 *
	 * @param val the new dom energ acqua
	 */
	public void setDomEnergAcqua(
			Double val) {
		_domEnergAcqua = val;
	}

	/**
	 * Gets the dom energ acqua.
	 *
	 * @return the dom energ acqua
	 */
	public Double getDomEnergAcqua() {
		return _domEnergAcqua;
	}

	/// Field [energTermAcquaRinnov]
	/** The _energ term acqua rinnov. */
	private Double _energTermAcquaRinnov = null;

	/**
	 * Sets the energ term acqua rinnov.
	 *
	 * @param val the new energ term acqua rinnov
	 */
	public void setEnergTermAcquaRinnov(
			Double val) {
		_energTermAcquaRinnov = val;
	}

	/**
	 * Gets the energ term acqua rinnov.
	 *
	 * @return the energ term acqua rinnov
	 */
	public Double getEnergTermAcquaRinnov() {
		return _energTermAcquaRinnov;
	}

	/// Field [rendGlobStagioneAcqua]
	/** The _rend glob stagione acqua. */
	private Double _rendGlobStagioneAcqua = null;

	/**
	 * Sets the rend glob stagione acqua.
	 *
	 * @param val the new rend glob stagione acqua
	 */
	public void setRendGlobStagioneAcqua(
			Double val) {
		_rendGlobStagioneAcqua = val;
	}

	/**
	 * Gets the rend glob stagione acqua.
	 *
	 * @return the rend glob stagione acqua
	 */
	public Double getRendGlobStagioneAcqua() {
		return _rendGlobStagioneAcqua;
	}

	/// Field [indPrestEnergAcqua]
	/** The _ind prest energ acqua. */
	private Double _indPrestEnergAcqua = null;

	/**
	 * Sets the ind prest energ acqua.
	 *
	 * @param val the new ind prest energ acqua
	 */
	public void setIndPrestEnergAcqua(
			Double val) {
		_indPrestEnergAcqua = val;
	}

	/**
	 * Gets the ind prest energ acqua.
	 *
	 * @return the ind prest energ acqua
	 */
	public Double getIndPrestEnergAcqua() {
		return _indPrestEnergAcqua;
	}

	/// Field [indPrestEnergIlluminaz]
	/** The _ind prest energ illuminaz. */
	private Double _indPrestEnergIlluminaz = null;

	/**
	 * Sets the ind prest energ illuminaz.
	 *
	 * @param val the new ind prest energ illuminaz
	 */
	public void setIndPrestEnergIlluminaz(
			Double val) {
		_indPrestEnergIlluminaz = val;
	}

	/**
	 * Gets the ind prest energ illuminaz.
	 *
	 * @return the ind prest energ illuminaz
	 */
	public Double getIndPrestEnergIlluminaz() {
		return _indPrestEnergIlluminaz;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtIndiciFabbisogno() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-844969618) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
