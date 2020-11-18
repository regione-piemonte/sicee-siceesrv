/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.print.dto;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class DtDichiarazFinale.
 */
public class DtDichiarazFinale implements java.io.Serializable {

	/// Field [codDichiaraz]
	/** The _cod dichiaraz. */
	private java.lang.Integer _codDichiaraz = null;

	/**
	 * Sets the cod dichiaraz.
	 *
	 * @param val the new cod dichiaraz
	 */
	public void setCodDichiaraz(java.lang.Integer val) {
		_codDichiaraz = val;
	}

	/**
	 * Gets the cod dichiaraz.
	 *
	 * @return the cod dichiaraz
	 */
	public java.lang.Integer getCodDichiaraz() {
		return _codDichiaraz;
	}

	/// Field [dataDichiarazione]
	/** The _data dichiarazione. */
	private Date _dataDichiarazione = null;

	/**
	 * Sets the data dichiarazione.
	 *
	 * @param val the new data dichiarazione
	 */
	public void setDataDichiarazione(
			Date val) {
		_dataDichiarazione = val;
	}

	/**
	 * Gets the data dichiarazione.
	 *
	 * @return the data dichiarazione
	 */
	public Date getDataDichiarazione() {
		return _dataDichiarazione;
	}

	/// Field [luogoDichiarazione]
	/** The _luogo dichiarazione. */
	private java.lang.String _luogoDichiarazione = null;

	/**
	 * Sets the luogo dichiarazione.
	 *
	 * @param val the new luogo dichiarazione
	 */
	public void setLuogoDichiarazione(java.lang.String val) {
		_luogoDichiarazione = val;
	}

	/**
	 * Gets the luogo dichiarazione.
	 *
	 * @return the luogo dichiarazione
	 */
	public java.lang.String getLuogoDichiarazione() {
		return _luogoDichiarazione;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtDichiarazFinale() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-2146785584) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
