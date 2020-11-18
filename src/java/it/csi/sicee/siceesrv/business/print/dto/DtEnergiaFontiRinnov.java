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
 * The Class DtEnergiaFontiRinnov.
 */
public class DtEnergiaFontiRinnov implements java.io.Serializable {

	/// Field [techFontiRinnov]
	/** The _tech fonti rinnov. */
	private java.lang.String _techFontiRinnov = null;

	/**
	 * Sets the tech fonti rinnov.
	 *
	 * @param val the new tech fonti rinnov
	 */
	public void setTechFontiRinnov(java.lang.String val) {
		_techFontiRinnov = val;
	}

	/**
	 * Gets the tech fonti rinnov.
	 *
	 * @return the tech fonti rinnov
	 */
	public java.lang.String getTechFontiRinnov() {
		return _techFontiRinnov;
	}

	/// Field [annoInstall]
	/** The _anno install. */
	private java.lang.String _annoInstall = null;

	/**
	 * Sets the anno install.
	 *
	 * @param val the new anno install
	 */
	public void setAnnoInstall(java.lang.String val) {
		_annoInstall = val;
	}

	/**
	 * Gets the anno install.
	 *
	 * @return the anno install
	 */
	public java.lang.String getAnnoInstall() {
		return _annoInstall;
	}

	/// Field [energTermicaProdotta]
	/** The _energ termica prodotta. */
	private Double _energTermicaProdotta = null;

	/**
	 * Sets the energ termica prodotta.
	 *
	 * @param val the new energ termica prodotta
	 */
	public void setEnergTermicaProdotta(
			Double val) {
		_energTermicaProdotta = val;
	}

	/**
	 * Gets the energ termica prodotta.
	 *
	 * @return the energ termica prodotta
	 */
	public Double getEnergTermicaProdotta() {
		return _energTermicaProdotta;
	}

	/// Field [energElettricaProdotta]
	/** The _energ elettrica prodotta. */
	private Double _energElettricaProdotta = null;

	/**
	 * Sets the energ elettrica prodotta.
	 *
	 * @param val the new energ elettrica prodotta
	 */
	public void setEnergElettricaProdotta(
			Double val) {
		_energElettricaProdotta = val;
	}

	/**
	 * Gets the energ elettrica prodotta.
	 *
	 * @return the energ elettrica prodotta
	 */
	public Double getEnergElettricaProdotta() {
		return _energElettricaProdotta;
	}

	/// Field [autoconsumoTermico]
	/** The _autoconsumo termico. */
	private Double _autoconsumoTermico = null;

	/**
	 * Sets the autoconsumo termico.
	 *
	 * @param val the new autoconsumo termico
	 */
	public void setAutoconsumoTermico(
			Double val) {
		_autoconsumoTermico = val;
	}

	/**
	 * Gets the autoconsumo termico.
	 *
	 * @return the autoconsumo termico
	 */
	public Double getAutoconsumoTermico() {
		return _autoconsumoTermico;
	}

	/// Field [autoconsumoElettrico]
	/** The _autoconsumo elettrico. */
	private Double _autoconsumoElettrico = null;

	/**
	 * Sets the autoconsumo elettrico.
	 *
	 * @param val the new autoconsumo elettrico
	 */
	public void setAutoconsumoElettrico(
			Double val) {
		_autoconsumoElettrico = val;
	}

	/**
	 * Gets the autoconsumo elettrico.
	 *
	 * @return the autoconsumo elettrico
	 */
	public Double getAutoconsumoElettrico() {
		return _autoconsumoElettrico;
	}

	/// Field [percEnergiaFontiRinnov]
	/** The _perc energia fonti rinnov. */
	private Double _percEnergiaFontiRinnov = null;

	/**
	 * Sets the perc energia fonti rinnov.
	 *
	 * @param val the new perc energia fonti rinnov
	 */
	public void setPercEnergiaFontiRinnov(
			Double val) {
		_percEnergiaFontiRinnov = val;
	}

	/**
	 * Gets the perc energia fonti rinnov.
	 *
	 * @return the perc energia fonti rinnov
	 */
	public Double getPercEnergiaFontiRinnov() {
		return _percEnergiaFontiRinnov;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtEnergiaFontiRinnov() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R1801579919) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
