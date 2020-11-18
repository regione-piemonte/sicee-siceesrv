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
 * The Class Raccomandazione.
 */
public class Raccomandazione implements java.io.Serializable {

	/// Field [id]
	/** The _id. */
	private java.lang.String _id = null;

	/**
	 * Sets the id.
	 *
	 * @param val the new id
	 */
	public void setId(java.lang.String val) {
		_id = val;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public java.lang.String getId() {
		return _id;
	}

	/// Field [codSistema]
	/** The _cod sistema. */
	private java.lang.String _codSistema = null;

	/**
	 * Sets the cod sistema.
	 *
	 * @param val the new cod sistema
	 */
	public void setCodSistema(java.lang.String val) {
		_codSistema = val;
	}

	/**
	 * Gets the cod sistema.
	 *
	 * @return the cod sistema
	 */
	public java.lang.String getCodSistema() {
		return _codSistema;
	}

	/// Field [intervento]
	/** The _intervento. */
	private java.lang.String _intervento = null;

	/**
	 * Sets the intervento.
	 *
	 * @param val the new intervento
	 */
	public void setIntervento(java.lang.String val) {
		_intervento = val;
	}

	/**
	 * Gets the intervento.
	 *
	 * @return the intervento
	 */
	public java.lang.String getIntervento() {
		return _intervento;
	}

	/// Field [priorita]
	/** The _priorita. */
	private java.lang.String _priorita = null;

	/**
	 * Sets the priorita.
	 *
	 * @param val the new priorita
	 */
	public void setPriorita(java.lang.String val) {
		_priorita = val;
	}

	/**
	 * Gets the priorita.
	 *
	 * @return the priorita
	 */
	public java.lang.String getPriorita() {
		return _priorita;
	}

	/// Field [tempoRitorno]
	/** The _tempo ritorno. */
	private java.lang.String _tempoRitorno = null;

	/**
	 * Sets the tempo ritorno.
	 *
	 * @param val the new tempo ritorno
	 */
	public void setTempoRitorno(java.lang.String val) {
		_tempoRitorno = val;
	}

	/**
	 * Gets the tempo ritorno.
	 *
	 * @return the tempo ritorno
	 */
	public java.lang.String getTempoRitorno() {
		return _tempoRitorno;
	}

	/// Field [descrPriorita]
	/** The _descr priorita. */
	private java.lang.String _descrPriorita = null;

	/**
	 * Sets the descr priorita.
	 *
	 * @param val the new descr priorita
	 */
	public void setDescrPriorita(java.lang.String val) {
		_descrPriorita = val;
	}

	/**
	 * Gets the descr priorita.
	 *
	 * @return the descr priorita
	 */
	public java.lang.String getDescrPriorita() {
		return _descrPriorita;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public Raccomandazione() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R267999625) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
