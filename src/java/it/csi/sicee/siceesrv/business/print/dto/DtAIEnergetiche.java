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
 * The Class DtAIEnergetiche.
 */
public class DtAIEnergetiche implements java.io.Serializable {

	/// Field [classeEnergEdificio]
	/** The _classe energ edificio. */
	private java.lang.String _classeEnergEdificio = null;

	/**
	 * Sets the classe energ edificio.
	 *
	 * @param val the new classe energ edificio
	 */
	public void setClasseEnergEdificio(java.lang.String val) {
		_classeEnergEdificio = val;
	}

	/**
	 * Gets the classe energ edificio.
	 *
	 * @return the classe energ edificio
	 */
	public java.lang.String getClasseEnergEdificio() {
		return _classeEnergEdificio;
	}

	/// Field [prestEnergRaggiungibile]
	/** The _prest energ raggiungibile. */
	private Double _prestEnergRaggiungibile = null;

	/**
	 * Sets the prest energ raggiungibile.
	 *
	 * @param val the new prest energ raggiungibile
	 */
	public void setPrestEnergRaggiungibile(
			Double val) {
		_prestEnergRaggiungibile = val;
	}

	/**
	 * Gets the prest energ raggiungibile.
	 *
	 * @return the prest energ raggiungibile
	 */
	public Double getPrestEnergRaggiungibile() {
		return _prestEnergRaggiungibile;
	}

	/// Field [limNormaNazRiscald]
	/** The _lim norma naz riscald. */
	private Double _limNormaNazRiscald = null;

	/**
	 * Sets the lim norma naz riscald.
	 *
	 * @param val the new lim norma naz riscald
	 */
	public void setLimNormaNazRiscald(
			Double val) {
		_limNormaNazRiscald = val;
	}

	/**
	 * Gets the lim norma naz riscald.
	 *
	 * @return the lim norma naz riscald
	 */
	public Double getLimNormaNazRiscald() {
		return _limNormaNazRiscald;
	}

	/// Field [qualitaInvolucroRaffresc]
	/** The _qualita involucro raffresc. */
	private java.lang.String _qualitaInvolucroRaffresc = null;

	/**
	 * Sets the qualita involucro raffresc.
	 *
	 * @param val the new qualita involucro raffresc
	 */
	public void setQualitaInvolucroRaffresc(java.lang.String val) {
		_qualitaInvolucroRaffresc = val;
	}

	/**
	 * Gets the qualita involucro raffresc.
	 *
	 * @return the qualita involucro raffresc
	 */
	public java.lang.String getQualitaInvolucroRaffresc() {
		return _qualitaInvolucroRaffresc;
	}

	/// Field [prestazPompaCalore]
	/** The _prestaz pompa calore. */
	private Double _prestazPompaCalore = null;

	/**
	 * Sets the prestaz pompa calore.
	 *
	 * @param val the new prestaz pompa calore
	 */
	public void setPrestazPompaCalore(
			Double val) {
		_prestazPompaCalore = val;
	}

	/**
	 * Gets the prestaz pompa calore.
	 *
	 * @return the prestaz pompa calore
	 */
	public Double getPrestazPompaCalore() {
		return _prestazPompaCalore;
	}

	/// Field [limNormaPrestPompa]
	/** The _lim norma prest pompa. */
	private Double _limNormaPrestPompa = null;

	/**
	 * Sets the lim norma prest pompa.
	 *
	 * @param val the new lim norma prest pompa
	 */
	public void setLimNormaPrestPompa(
			Double val) {
		_limNormaPrestPompa = val;
	}

	/**
	 * Gets the lim norma prest pompa.
	 *
	 * @return the lim norma prest pompa
	 */
	public Double getLimNormaPrestPompa() {
		return _limNormaPrestPompa;
	}

	/// Field [altreInfo]
	/** The _altre info. */
	private java.lang.String _altreInfo = null;

	/**
	 * Sets the altre info.
	 *
	 * @param val the new altre info
	 */
	public void setAltreInfo(java.lang.String val) {
		_altreInfo = val;
	}

	/**
	 * Gets the altre info.
	 *
	 * @return the altre info
	 */
	public java.lang.String getAltreInfo() {
		return _altreInfo;
	}

	/// Field [indPrestEnergRiscald]
	/** The _ind prest energ riscald. */
	private Double _indPrestEnergRiscald = null;

	/**
	 * Sets the ind prest energ riscald.
	 *
	 * @param val the new ind prest energ riscald
	 */
	public void setIndPrestEnergRiscald(
			Double val) {
		_indPrestEnergRiscald = val;
	}

	/**
	 * Gets the ind prest energ riscald.
	 *
	 * @return the ind prest energ riscald
	 */
	public Double getIndPrestEnergRiscald() {
		return _indPrestEnergRiscald;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtAIEnergetiche() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-771981305) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
