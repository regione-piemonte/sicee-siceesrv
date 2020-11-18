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
 * The Class DtImpianti.
 */
public class DtImpianti implements java.io.Serializable {

	/// Field [riscaldamento]
	/** The _riscaldamento. */
	private it.csi.sicee.siceesrv.business.print.dto.DtImpRiscald _riscaldamento = null;

	/**
	 * Sets the riscaldamento.
	 *
	 * @param val the new riscaldamento
	 */
	public void setRiscaldamento(
			it.csi.sicee.siceesrv.business.print.dto.DtImpRiscald val) {
		_riscaldamento = val;
	}

	/**
	 * Gets the riscaldamento.
	 *
	 * @return the riscaldamento
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtImpRiscald getRiscaldamento() {
		return _riscaldamento;
	}

	/// Field [acqua]
	/** The _acqua. */
	private it.csi.sicee.siceesrv.business.print.dto.DtImpAcqua _acqua = null;

	/**
	 * Sets the acqua.
	 *
	 * @param val the new acqua
	 */
	public void setAcqua(it.csi.sicee.siceesrv.business.print.dto.DtImpAcqua val) {
		_acqua = val;
	}

	/**
	 * Gets the acqua.
	 *
	 * @return the acqua
	 */
	public it.csi.sicee.siceesrv.business.print.dto.DtImpAcqua getAcqua() {
		return _acqua;
	}

	/// Field [uiServite]
	/** The _ui servite. */
	private java.lang.String _uiServite = null;

	/**
	 * Sets the ui servite.
	 *
	 * @param val the new ui servite
	 */
	public void setUiServite(java.lang.String val) {
		_uiServite = val;
	}

	/**
	 * Gets the ui servite.
	 *
	 * @return the ui servite
	 */
	public java.lang.String getUiServite() {
		return _uiServite;
	}

	/// Field [flgRipartizione]
	/** The _flg ripartizione. */
	private java.lang.String _flgRipartizione = null;

	/**
	 * Sets the flg ripartizione.
	 *
	 * @param val the new flg ripartizione
	 */
	public void setFlgRipartizione(java.lang.String val) {
		_flgRipartizione = val;
	}

	/**
	 * Gets the flg ripartizione.
	 *
	 * @return the flg ripartizione
	 */
	public java.lang.String getFlgRipartizione() {
		return _flgRipartizione;
	}

	/// Field [tipoImpianto]
	/** The _tipo impianto. */
	private java.lang.String _tipoImpianto = null;

	/**
	 * Sets the tipo impianto.
	 *
	 * @param val the new tipo impianto
	 */
	public void setTipoImpianto(java.lang.String val) {
		_tipoImpianto = val;
	}

	/**
	 * Gets the tipo impianto.
	 *
	 * @return the tipo impianto
	 */
	public java.lang.String getTipoImpianto() {
		return _tipoImpianto;
	}

	/// Field [tipoTermErogaz]
	/** The _tipo term erogaz. */
	private java.lang.String _tipoTermErogaz = null;

	/**
	 * Sets the tipo term erogaz.
	 *
	 * @param val the new tipo term erogaz
	 */
	public void setTipoTermErogaz(java.lang.String val) {
		_tipoTermErogaz = val;
	}

	/**
	 * Gets the tipo term erogaz.
	 *
	 * @return the tipo term erogaz
	 */
	public java.lang.String getTipoTermErogaz() {
		return _tipoTermErogaz;
	}

	/// Field [tipoDistrib]
	/** The _tipo distrib. */
	private java.lang.String _tipoDistrib = null;

	/**
	 * Sets the tipo distrib.
	 *
	 * @param val the new tipo distrib
	 */
	public void setTipoDistrib(java.lang.String val) {
		_tipoDistrib = val;
	}

	/**
	 * Gets the tipo distrib.
	 *
	 * @return the tipo distrib
	 */
	public java.lang.String getTipoDistrib() {
		return _tipoDistrib;
	}

	/// Field [tipoRegolaz]
	/** The _tipo regolaz. */
	private java.lang.String _tipoRegolaz = null;

	/**
	 * Sets the tipo regolaz.
	 *
	 * @param val the new tipo regolaz
	 */
	public void setTipoRegolaz(java.lang.String val) {
		_tipoRegolaz = val;
	}

	/**
	 * Gets the tipo regolaz.
	 *
	 * @return the tipo regolaz
	 */
	public java.lang.String getTipoRegolaz() {
		return _tipoRegolaz;
	}

	// il serial version uid e' fisso in quanto la classe in oggetto e' serializzabile
	// solo per la clusterizzazione della sessione web e non viene scambiata con altre
	// componenti.
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Costruttore vuoto del DTO.
	 */
	public DtImpianti() {
		super();

		this.setRiscaldamento(new it.csi.sicee.siceesrv.business.print.dto.DtImpRiscald());

		this.setAcqua(new it.csi.sicee.siceesrv.business.print.dto.DtImpAcqua());

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		/*PROTECTED REGION ID(R162244927) ENABLED START*/
		/// inserire qui la logica desiderata per la rappresenatazione a stringa
		return super.toString();
		/*PROTECTED REGION END*/
	}
}
