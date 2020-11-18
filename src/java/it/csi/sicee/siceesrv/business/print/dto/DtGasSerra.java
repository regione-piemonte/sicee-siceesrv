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
 * The Class DtGasSerra.
 */
public class DtGasSerra implements java.io.Serializable {

	/// Field [emissioniGasSerra]
	/** The _emissioni gas serra. */
	private Double _emissioniGasSerra = null;

	/**
	 * Sets the emissioni gas serra.
	 *
	 * @param val the new emissioni gas serra
	 */
	public void setEmissioniGasSerra(
			Double val) {
		_emissioniGasSerra = val;
	}

	/**
	 * Gets the emissioni gas serra.
	 *
	 * @return the emissioni gas serra
	 */
	public Double getEmissioniGasSerra() {
		return _emissioniGasSerra;
	}

	/// Field [supBoscoEquiv]
	/** The _sup bosco equiv. */
	private Double _supBoscoEquiv = null;

	/**
	 * Sets the sup bosco equiv.
	 *
	 * @param val the new sup bosco equiv
	 */
	public void setSupBoscoEquiv(
			Double val) {
		_supBoscoEquiv = val;
	}

	/**
	 * Gets the sup bosco equiv.
	 *
	 * @return the sup bosco equiv
	 */
	public Double getSupBoscoEquiv() {
		return _supBoscoEquiv;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtGasSerra() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R507037302) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
