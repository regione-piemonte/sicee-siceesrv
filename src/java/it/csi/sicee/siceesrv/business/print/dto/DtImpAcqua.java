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
 * The Class DtImpAcqua.
 */
public class DtImpAcqua implements java.io.Serializable {

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
	public DtImpAcqua() {
		super();

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-446037713) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
