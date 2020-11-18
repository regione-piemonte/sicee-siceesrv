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
 * The Class DtClasseEnerg.
 */
public class DtClasseEnerg implements java.io.Serializable {

	/// Field [locReale]
	/** The _loc reale. */
	private it.csi.sicee.siceesrv.business.print.dto.DtLocReale _locReale = null;

	/**
	 * Sets the loc reale.
	 *
	 * @param val the new loc reale
	 */
	public void setLocReale(it.csi.sicee.siceesrv.business.print.dto.DtLocReale val) {
		_locReale = val;
	}

	/**
	 * Gets the loc reale.
	 *
	 * @return the loc reale
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtLocReale getLocReale() {
		return _locReale;
	}

	/// Field [locTeorica]
	/** The _loc teorica. */
	private it.csi.sicee.siceesrv.business.print.dto.DtLocTeorica _locTeorica = null;

	/**
	 * Sets the loc teorica.
	 *
	 * @param val the new loc teorica
	 */
	public void setLocTeorica(
			it.csi.sicee.siceesrv.business.print.dto.DtLocTeorica val) {
		_locTeorica = val;
	}

	/**
	 * Gets the loc teorica.
	 *
	 * @return the loc teorica
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtLocTeorica getLocTeorica() {
		return _locTeorica;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtClasseEnerg() {
		super();

		this.setLocReale(new it.csi.sicee.siceesrv.business.print.dto.DtLocReale());

		this.setLocTeorica(new it.csi.sicee.siceesrv.business.print.dto.DtLocTeorica());

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R-1869963972) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
