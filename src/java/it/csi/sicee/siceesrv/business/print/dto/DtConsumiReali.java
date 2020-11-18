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
 * The Class DtConsumiReali.
 */
public class DtConsumiReali implements java.io.Serializable {

	/// Field [annoTermicoFossile]
	/** The _anno termico fossile. */
	private Double _annoTermicoFossile = null;

	/**
	 * Sets the anno termico fossile.
	 *
	 * @param val the new anno termico fossile
	 */
	public void setAnnoTermicoFossile(
			Double val) {
		_annoTermicoFossile = val;
	}

	/**
	 * Gets the anno termico fossile.
	 *
	 * @return the anno termico fossile
	 */
	public Double getAnnoTermicoFossile() {
		return _annoTermicoFossile;
	}

	/// Field [annoElettricoFossile]
	/** The _anno elettrico fossile. */
	private Double _annoElettricoFossile = null;

	/**
	 * Sets the anno elettrico fossile.
	 *
	 * @param val the new anno elettrico fossile
	 */
	public void setAnnoElettricoFossile(
			Double val) {
		_annoElettricoFossile = val;
	}

	/**
	 * Gets the anno elettrico fossile.
	 *
	 * @return the anno elettrico fossile
	 */
	public Double getAnnoElettricoFossile() {
		return _annoElettricoFossile;
	}

	/// Field [annoTermicoRinnov]
	/** The _anno termico rinnov. */
	private Double _annoTermicoRinnov = null;

	/**
	 * Sets the anno termico rinnov.
	 *
	 * @param val the new anno termico rinnov
	 */
	public void setAnnoTermicoRinnov(
			Double val) {
		_annoTermicoRinnov = val;
	}

	/**
	 * Gets the anno termico rinnov.
	 *
	 * @return the anno termico rinnov
	 */
	public Double getAnnoTermicoRinnov() {
		return _annoTermicoRinnov;
	}

	/// Field [annoElettricoRinnov]
	/** The _anno elettrico rinnov. */
	private Double _annoElettricoRinnov = null;

	/**
	 * Sets the anno elettrico rinnov.
	 *
	 * @param val the new anno elettrico rinnov
	 */
	public void setAnnoElettricoRinnov(
			Double val) {
		_annoElettricoRinnov = val;
	}

	/**
	 * Gets the anno elettrico rinnov.
	 *
	 * @return the anno elettrico rinnov
	 */
	public Double getAnnoElettricoRinnov() {
		return _annoElettricoRinnov;
	}

	/// Field [medioTermico]
	/** The _medio termico. */
	private Double _medioTermico = null;

	/**
	 * Sets the medio termico.
	 *
	 * @param val the new medio termico
	 */
	public void setMedioTermico(
			Double val) {
		_medioTermico = val;
	}

	/**
	 * Gets the medio termico.
	 *
	 * @return the medio termico
	 */
	public Double getMedioTermico() {
		return _medioTermico;
	}

	/// Field [medioElettrico]
	/** The _medio elettrico. */
	private Double _medioElettrico = null;

	/**
	 * Sets the medio elettrico.
	 *
	 * @param val the new medio elettrico
	 */
	public void setMedioElettrico(
			Double val) {
		_medioElettrico = val;
	}

	/**
	 * Gets the medio elettrico.
	 *
	 * @return the medio elettrico
	 */
	public Double getMedioElettrico() {
		return _medioElettrico;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtConsumiReali() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R1069453995) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
