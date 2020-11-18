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
 * The Class DtAltreInfo.
 */
public class DtAltreInfo implements java.io.Serializable {

	/// Field [flgEdificioPerformante]
	/** The _flg edificio performante. */
	private java.lang.Boolean _flgEdificioPerformante = null;

	/**
	 * Sets the flg edificio performante.
	 *
	 * @param val the new flg edificio performante
	 */
	public void setFlgEdificioPerformante(java.lang.Boolean val) {
		_flgEdificioPerformante = val;
	}

	/**
	 * Gets the flg edificio performante.
	 *
	 * @return the flg edificio performante
	 */
	public java.lang.Boolean getFlgEdificioPerformante() {
		return _flgEdificioPerformante;
	}

	/// Field [raccomandazioni]
	/** The _raccomandazioni. */
	private java.util.ArrayList<it.csi.sicee.siceesrv.business.print.dto.Raccomandazione> _raccomandazioni = new java.util.ArrayList<it.csi.sicee.siceesrv.business.print.dto.Raccomandazione>();

	/**
	 * Sets the raccomandazioni.
	 *
	 * @param val the new raccomandazioni
	 */
	public void setRaccomandazioni(
			java.util.ArrayList<it.csi.sicee.siceesrv.business.print.dto.Raccomandazione> val) {
		_raccomandazioni = val;
	}

	/**
	 * Gets the raccomandazioni.
	 *
	 * @return the raccomandazioni
	 */
	public java.util.ArrayList<it.csi.sicee.siceesrv.business.print.dto.Raccomandazione> getRaccomandazioni() {
		return _raccomandazioni;
	}

	/// Field [energetiche]
	/** The _energetiche. */
	private it.csi.sicee.siceesrv.business.print.dto.DtAIEnergetiche _energetiche = null;

	/**
	 * Sets the energetiche.
	 *
	 * @param val the new energetiche
	 */
	public void setEnergetiche(
			it.csi.sicee.siceesrv.business.print.dto.DtAIEnergetiche val) {
		_energetiche = val;
	}

	/**
	 * Gets the energetiche.
	 *
	 * @return the energetiche
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtAIEnergetiche getEnergetiche() {
		return _energetiche;
	}

	/// Field [generali]
	/** The _generali. */
	private it.csi.sicee.siceesrv.business.print.dto.DtAIGenerali _generali = null;

	/**
	 * Sets the generali.
	 *
	 * @param val the new generali
	 */
	public void setGenerali(it.csi.sicee.siceesrv.business.print.dto.DtAIGenerali val) {
		_generali = val;
	}

	/**
	 * Gets the generali.
	 *
	 * @return the generali
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtAIGenerali getGenerali() {
		return _generali;
	}

	/// Field [sopralluoghi]
	/** The _sopralluoghi. */
	private it.csi.sicee.siceesrv.business.print.dto.DtAISopralluoghi _sopralluoghi = null;

	/**
	 * Sets the sopralluoghi.
	 *
	 * @param val the new sopralluoghi
	 */
	public void setSopralluoghi(
			it.csi.sicee.siceesrv.business.print.dto.DtAISopralluoghi val) {
		_sopralluoghi = val;
	}

	/**
	 * Gets the sopralluoghi.
	 *
	 * @return the sopralluoghi
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtAISopralluoghi getSopralluoghi() {
		return _sopralluoghi;
	}

	/// Field [flgSigmater]
	/** The _flg sigmater. */
	private java.lang.Boolean _flgSigmater = null;

	/**
	 * Sets the flg sigmater.
	 *
	 * @param val the new flg sigmater
	 */
	public void setFlgSigmater(java.lang.Boolean val) {
		_flgSigmater = val;
	}

	/**
	 * Gets the flg sigmater.
	 *
	 * @return the flg sigmater
	 */
	public java.lang.Boolean getFlgSigmater() {
		return _flgSigmater;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtAltreInfo() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R324507778) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
