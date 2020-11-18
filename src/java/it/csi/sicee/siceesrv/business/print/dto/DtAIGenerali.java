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
 * The Class DtAIGenerali.
 */
public class DtAIGenerali implements java.io.Serializable {

	/// Field [motivoRilascio]
	/** The _motivo rilascio. */
	private java.lang.String _motivoRilascio = null;

	/**
	 * Sets the motivo rilascio.
	 *
	 * @param val the new motivo rilascio
	 */
	public void setMotivoRilascio(java.lang.String val) {
		_motivoRilascio = val;
	}

	/**
	 * Gets the motivo rilascio.
	 *
	 * @return the motivo rilascio
	 */
	public java.lang.String getMotivoRilascio() {
		return _motivoRilascio;
	}

	/// Field [metodoCalcolo]
	/** The _metodo calcolo. */
	private java.lang.String _metodoCalcolo = null;

	/**
	 * Sets the metodo calcolo.
	 *
	 * @param val the new metodo calcolo
	 */
	public void setMetodoCalcolo(java.lang.String val) {
		_metodoCalcolo = val;
	}

	/**
	 * Gets the metodo calcolo.
	 *
	 * @return the metodo calcolo
	 */
	public java.lang.String getMetodoCalcolo() {
		return _metodoCalcolo;
	}

	/// Field [software]
	/** The _software. */
	private java.lang.String _software = null;

	/**
	 * Sets the software.
	 *
	 * @param val the new software
	 */
	public void setSoftware(java.lang.String val) {
		_software = val;
	}

	/**
	 * Gets the software.
	 *
	 * @return the software
	 */
	public java.lang.String getSoftware() {
		return _software;
	}

	/// Field [denomProduttore]
	/** The _denom produttore. */
	private java.lang.String _denomProduttore = null;

	/**
	 * Sets the denom produttore.
	 *
	 * @param val the new denom produttore
	 */
	public void setDenomProduttore(java.lang.String val) {
		_denomProduttore = val;
	}

	/**
	 * Gets the denom produttore.
	 *
	 * @return the denom produttore
	 */
	public java.lang.String getDenomProduttore() {
		return _denomProduttore;
	}

	/// Field [rispondenzaUNITS11300]
	/** The _rispondenza unit s11300. */
	private java.lang.String _rispondenzaUNITS11300 = null;

	/**
	 * Sets the rispondenza unit s11300.
	 *
	 * @param val the new rispondenza unit s11300
	 */
	public void setRispondenzaUNITS11300(java.lang.String val) {
		_rispondenzaUNITS11300 = val;
	}

	/**
	 * Gets the rispondenza unit s11300.
	 *
	 * @return the rispondenza unit s11300
	 */
	public java.lang.String getRispondenzaUNITS11300() {
		return _rispondenzaUNITS11300;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtAIGenerali() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-1281284119) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
