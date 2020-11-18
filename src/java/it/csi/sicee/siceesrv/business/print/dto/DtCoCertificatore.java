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
 * The Class DtCoCertificatore.
 */
public class DtCoCertificatore implements java.io.Serializable {

	/// Field [nome]
	/** The _nome. */
	private java.lang.String _nome = null;

	/**
	 * Sets the nome.
	 *
	 * @param val the new nome
	 */
	public void setNome(java.lang.String val) {
		_nome = val;
	}

	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public java.lang.String getNome() {
		return _nome;
	}

	/// Field [cognome]
	/** The _cognome. */
	private java.lang.String _cognome = null;

	/**
	 * Sets the cognome.
	 *
	 * @param val the new cognome
	 */
	public void setCognome(java.lang.String val) {
		_cognome = val;
	}

	/**
	 * Gets the cognome.
	 *
	 * @return the cognome
	 */
	public java.lang.String getCognome() {
		return _cognome;
	}

	/// Field [numMatricola]
	/** The _num matricola. */
	private java.lang.String _numMatricola = null;

	/**
	 * Sets the num matricola.
	 *
	 * @param val the new num matricola
	 */
	public void setNumMatricola(java.lang.String val) {
		_numMatricola = val;
	}

	/**
	 * Gets the num matricola.
	 *
	 * @return the num matricola
	 */
	public java.lang.String getNumMatricola() {
		return _numMatricola;
	}

	/// Field [codFisc]
	/** The _cod fisc. */
	private java.lang.String _codFisc = null;

	/**
	 * Sets the cod fisc.
	 *
	 * @param val the new cod fisc
	 */
	public void setCodFisc(java.lang.String val) {
		_codFisc = val;
	}

	/**
	 * Gets the cod fisc.
	 *
	 * @return the cod fisc
	 */
	public java.lang.String getCodFisc() {
		return _codFisc;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtCoCertificatore() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-1383933024) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
