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
 * The Class DtAnagImmobile.
 */
public class DtAnagImmobile implements java.io.Serializable {

	/// Field [dtCatastali]
	/** The _dt catastali. */
	private it.csi.sicee.siceesrv.business.print.dto.DtCatastali _dtCatastali = null;

	/**
	 * Sets the dt catastali.
	 *
	 * @param val the new dt catastali
	 */
	public void setDtCatastali(
			it.csi.sicee.siceesrv.business.print.dto.DtCatastali val) {
		_dtCatastali = val;
	}

	/**
	 * Gets the dt catastali.
	 *
	 * @return the dt catastali
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtCatastali getDtCatastali() {
		return _dtCatastali;
	}

	/// Field [dtResponsabili]
	/** The _dt responsabili. */
	private it.csi.sicee.siceesrv.business.print.dto.DtResponsabili _dtResponsabili = null;

	/**
	 * Sets the dt responsabili.
	 *
	 * @param val the new dt responsabili
	 */
	public void setDtResponsabili(
			it.csi.sicee.siceesrv.business.print.dto.DtResponsabili val) {
		_dtResponsabili = val;
	}

	/**
	 * Gets the dt responsabili.
	 *
	 * @return the dt responsabili
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtResponsabili getDtResponsabili() {
		return _dtResponsabili;
	}

	/// Field [dtCoCertificatore]
	/** The _dt co certificatore. */
	private it.csi.sicee.siceesrv.business.print.dto.DtCoCertificatore _dtCoCertificatore = null;

	/**
	 * Sets the dt co certificatore.
	 *
	 * @param val the new dt co certificatore
	 */
	public void setDtCoCertificatore(
			it.csi.sicee.siceesrv.business.print.dto.DtCoCertificatore val) {
		_dtCoCertificatore = val;
	}

	/**
	 * Gets the dt co certificatore.
	 *
	 * @return the dt co certificatore
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtCoCertificatore getDtCoCertificatore() {
		return _dtCoCertificatore;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtAnagImmobile() {
		super();

		this.setDtCatastali(new it.csi.sicee.siceesrv.business.print.dto.DtCatastali());

		this.setDtResponsabili(new it.csi.sicee.siceesrv.business.print.dto.DtResponsabili());

		this.setDtCoCertificatore(new it.csi.sicee.siceesrv.business.print.dto.DtCoCertificatore());

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-441627847) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
