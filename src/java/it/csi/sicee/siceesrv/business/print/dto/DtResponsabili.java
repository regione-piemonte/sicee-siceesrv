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
 * The Class DtResponsabili.
 */
public class DtResponsabili implements java.io.Serializable {

	/// Field [dtProgettista]
	/** The _dt progettista. */
	private it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile _dtProgettista = null;

	/**
	 * Sets the dt progettista.
	 *
	 * @param val the new dt progettista
	 */
	public void setDtProgettista(
			it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile val) {
		_dtProgettista = val;
	}

	/**
	 * Gets the dt progettista.
	 *
	 * @return the dt progettista
	 */
	public it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile getDtProgettista() {
		return _dtProgettista;
	}

	/// Field [dtDirLavori]
	/** The _dt dir lavori. */
	private it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile _dtDirLavori = null;

	/**
	 * Sets the dt dir lavori.
	 *
	 * @param val the new dt dir lavori
	 */
	public void setDtDirLavori(
			it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile val) {
		_dtDirLavori = val;
	}

	/**
	 * Gets the dt dir lavori.
	 *
	 * @return the dt dir lavori
	 */
	public it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile getDtDirLavori() {
		return _dtDirLavori;
	}

	/// Field [dtCostruttore]
	/** The _dt costruttore. */
	private it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile _dtCostruttore = null;

	/**
	 * Sets the dt costruttore.
	 *
	 * @param val the new dt costruttore
	 */
	public void setDtCostruttore(
			it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile val) {
		_dtCostruttore = val;
	}

	/**
	 * Gets the dt costruttore.
	 *
	 * @return the dt costruttore
	 */
	public it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile getDtCostruttore() {
		return _dtCostruttore;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtResponsabili() {
		super();

		this.setDtProgettista(new it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile());

		this.setDtDirLavori(new it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile());

		this.setDtCostruttore(new it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile());

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R457588737) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
