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
 * The Class DtRispettoNorme.
 */
public class DtRispettoNorme implements java.io.Serializable {

	/// Field [dataTitolo]
	/** The _data titolo. */
	private Date _dataTitolo = null;

	/**
	 * Sets the data titolo.
	 *
	 * @param val the new data titolo
	 */
	public void setDataTitolo(Date val) {
		_dataTitolo = val;
	}

	/**
	 * Gets the data titolo.
	 *
	 * @return the data titolo
	 */
	public Date getDataTitolo() {
		return _dataTitolo;
	}

	/// Field [descrNorma]
	/** The _descr norma. */
	private java.lang.String _descrNorma = null;

	/**
	 * Sets the descr norma.
	 *
	 * @param val the new descr norma
	 */
	public void setDescrNorma(java.lang.String val) {
		_descrNorma = val;
	}

	/**
	 * Gets the descr norma.
	 *
	 * @return the descr norma
	 */
	public java.lang.String getDescrNorma() {
		return _descrNorma;
	}

	/// Field [codNorma]
	/** The _cod norma. */
	private java.lang.String _codNorma = null;

	/**
	 * Sets the cod norma.
	 *
	 * @param val the new cod norma
	 */
	public void setCodNorma(java.lang.String val) {
		_codNorma = val;
	}

	/**
	 * Gets the cod norma.
	 *
	 * @return the cod norma
	 */
	public java.lang.String getCodNorma() {
		return _codNorma;
	}

	/// Field [autorizzato]
	/** The _autorizzato. */
	private java.lang.String _autorizzato = null;

	/**
	 * Sets the autorizzato.
	 *
	 * @param val the new autorizzato
	 */
	public void setAutorizzato(java.lang.String val) {
		_autorizzato = val;
	}

	/**
	 * Gets the autorizzato.
	 *
	 * @return the autorizzato
	 */
	public java.lang.String getAutorizzato() {
		return _autorizzato;
	}

	/// Field [motivoNonConformita]
	/** The _motivo non conformita. */
	private java.lang.String _motivoNonConformita = null;

	/**
	 * Sets the motivo non conformita.
	 *
	 * @param val the new motivo non conformita
	 */
	public void setMotivoNonConformita(java.lang.String val) {
		_motivoNonConformita = val;
	}

	/**
	 * Gets the motivo non conformita.
	 *
	 * @return the motivo non conformita
	 */
	public java.lang.String getMotivoNonConformita() {
		return _motivoNonConformita;
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

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtRispettoNorme() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-2053142621) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
