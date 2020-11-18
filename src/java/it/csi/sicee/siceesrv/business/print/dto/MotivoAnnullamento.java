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
 * The Class MotivoAnnullamento.
 */
public class MotivoAnnullamento implements java.io.Serializable {

	/// Field [cod]
	/** The _cod. */
	private java.lang.String _cod = null;

	/**
	 * Sets the cod.
	 *
	 * @param val the new cod
	 */
	public void setCod(java.lang.String val) {
		_cod = val;
	}

	/**
	 * Gets the cod.
	 *
	 * @return the cod
	 */
	public java.lang.String getCod() {
		return _cod;
	}

	/// Field [descr]
	/** The _descr. */
	private java.lang.String _descr = null;

	/**
	 * Sets the descr.
	 *
	 * @param val the new descr
	 */
	public void setDescr(java.lang.String val) {
		_descr = val;
	}

	/**
	 * Gets the descr.
	 *
	 * @return the descr
	 */
	public java.lang.String getDescr() {
		return _descr;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public MotivoAnnullamento() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R120940146) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
