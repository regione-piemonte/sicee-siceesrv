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
 * The Class DtAISopralluoghi.
 */
public class DtAISopralluoghi implements java.io.Serializable {

	/// Field [data]
	/** The _data. */
	private Date _data = null;

	/**
	 * Sets the data.
	 *
	 * @param val the new data
	 */
	public void setData(Date val) {
		_data = val;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Date getData() {
		return _data;
	}

	/// Field [note]
	/** The _note. */
	private java.lang.String _note = null;

	/**
	 * Sets the note.
	 *
	 * @param val the new note
	 */
	public void setNote(java.lang.String val) {
		_note = val;
	}

	/**
	 * Gets the note.
	 *
	 * @return the note
	 */
	public java.lang.String getNote() {
		return _note;
	}

	/// Field [tipoRedazione]
	/** The _tipo redazione. */
	private java.lang.String _tipoRedazione = null;

	/**
	 * Sets the tipo redazione.
	 *
	 * @param val the new tipo redazione
	 */
	public void setTipoRedazione(java.lang.String val) {
		_tipoRedazione = val;
	}

	/**
	 * Gets the tipo redazione.
	 *
	 * @return the tipo redazione
	 */
	public java.lang.String getTipoRedazione() {
		return _tipoRedazione;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtAISopralluoghi() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-2132391789) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
