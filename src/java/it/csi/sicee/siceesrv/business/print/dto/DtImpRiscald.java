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
 * The Class DtImpRiscald.
 */
public class DtImpRiscald implements java.io.Serializable {

	/// Field [flgBollino]
	/** The _flg bollino. */
	private java.lang.String _flgBollino = null;

	/**
	 * Sets the flg bollino.
	 *
	 * @param val the new flg bollino
	 */
	public void setFlgBollino(java.lang.String val) {
		_flgBollino = val;
	}

	/**
	 * Gets the flg bollino.
	 *
	 * @return the flg bollino
	 */
	public java.lang.String getFlgBollino() {
		return _flgBollino;
	}

	/// Field [numBollino]
	/** The _num bollino. */
	private java.lang.String _numBollino = null;

	/**
	 * Sets the num bollino.
	 *
	 * @param val the new num bollino
	 */
	public void setNumBollino(java.lang.String val) {
		_numBollino = val;
	}

	/**
	 * Gets the num bollino.
	 *
	 * @return the num bollino
	 */
	public java.lang.String getNumBollino() {
		return _numBollino;
	}

	/// Field [codImpianto]
	/** The _cod impianto. */
	private java.lang.String _codImpianto = null;

	/**
	 * Sets the cod impianto.
	 *
	 * @param val the new cod impianto
	 */
	public void setCodImpianto(java.lang.String val) {
		_codImpianto = val;
	}

	/**
	 * Gets the cod impianto.
	 *
	 * @return the cod impianto
	 */
	public java.lang.String getCodImpianto() {
		return _codImpianto;
	}

	/// Field [annoInstallGeneratore]
	/** The _anno install generatore. */
	private java.lang.String _annoInstallGeneratore = null;

	/**
	 * Sets the anno install generatore.
	 *
	 * @param val the new anno install generatore
	 */
	public void setAnnoInstallGeneratore(java.lang.String val) {
		_annoInstallGeneratore = val;
	}

	/**
	 * Gets the anno install generatore.
	 *
	 * @return the anno install generatore
	 */
	public java.lang.String getAnnoInstallGeneratore() {
		return _annoInstallGeneratore;
	}

	/// Field [potNomCompl]
	/** The _pot nom compl. */
	private Double _potNomCompl = null;

	/**
	 * Sets the pot nom compl.
	 *
	 * @param val the new pot nom compl
	 */
	public void setPotNomCompl(
			Double val) {
		_potNomCompl = val;
	}

	/**
	 * Gets the pot nom compl.
	 *
	 * @return the pot nom compl
	 */
	public Double getPotNomCompl() {
		return _potNomCompl;
	}

	/// Field [limNormRegImpTerm]
	/** The _lim norm reg imp term. */
	private Double _limNormRegImpTerm = null;

	/**
	 * Sets the lim norm reg imp term.
	 *
	 * @param val the new lim norm reg imp term
	 */
	public void setLimNormRegImpTerm(
			Double val) {
		_limNormRegImpTerm = val;
	}

	/**
	 * Gets the lim norm reg imp term.
	 *
	 * @return the lim norm reg imp term
	 */
	public Double getLimNormRegImpTerm() {
		return _limNormRegImpTerm;
	}

	/// Field [classeEfficienzaEnerg]
	/** The _classe efficienza energ. */
	private java.lang.String _classeEfficienzaEnerg = null;

	/**
	 * Sets the classe efficienza energ.
	 *
	 * @param val the new classe efficienza energ
	 */
	public void setClasseEfficienzaEnerg(java.lang.String val) {
		_classeEfficienzaEnerg = val;
	}

	/**
	 * Gets the classe efficienza energ.
	 *
	 * @return the classe efficienza energ
	 */
	public java.lang.String getClasseEfficienzaEnerg() {
		return _classeEfficienzaEnerg;
	}

	/// Field [combustibileFossile]
	/** The _combustibile fossile. */
	private java.lang.String _combustibileFossile = null;

	/**
	 * Sets the combustibile fossile.
	 *
	 * @param val the new combustibile fossile
	 */
	public void setCombustibileFossile(java.lang.String val) {
		_combustibileFossile = val;
	}

	/**
	 * Gets the combustibile fossile.
	 *
	 * @return the combustibile fossile
	 */
	public java.lang.String getCombustibileFossile() {
		return _combustibileFossile;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtImpRiscald() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-297949626) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
