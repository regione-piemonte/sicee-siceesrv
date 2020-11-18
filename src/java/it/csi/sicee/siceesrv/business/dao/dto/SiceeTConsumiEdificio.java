/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTConsumiEdificio implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2395375814329937183L;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column DESC_TIPO_EROG in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String descTipoErog;

	/** 
	 * This attribute maps to the column FK_TIPO_IMPIANTO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Integer fkTipoImpianto;

	/** 
	 * This attribute maps to the column DESC_TIPO_DISTRIB in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String descTipoDistrib;

	/** 
	 * This attribute maps to the column DESC_TIPO_REG in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String descTipoReg;

	/** 
	 * This attribute maps to the column ANN_TERMI_FOSSILE in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Double annTermiFossile;

	/** 
	 * This attribute maps to the column ANN_ELETT_FOSSILE in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Double annElettFossile;

	/** 
	 * This attribute maps to the column ANN_TERMI_RINNO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Double annTermiRinno;

	/** 
	 * This attribute maps to the column ANN_ELETT_RINNO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Double annElettRinno;

	/** 
	 * This attribute maps to the column COMPLESS_TERMICO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Double complessTermico;

	/** 
	 * This attribute maps to the column COMPLESS_ELETTRICO in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected Double complessElettrico;

	/** 
	 * This attribute maps to the column UI_SERVITE in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String uiServite;

	/** 
	 * This attribute maps to the column FLG_CONT_RIP in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	protected String flgContRip;

	/**
	 * Method 'SiceeTConsumiEdificio'
	 * 
	 */
	public SiceeTConsumiEdificio()
	{
	}

	/**
	 * Method 'getIdCertificatore'
	 * 
	 * @return String
	 */
	public String getIdCertificatore()
	{
		return idCertificatore;
	}

	/**
	 * Method 'setIdCertificatore'
	 * 
	 * @param idCertificatore
	 */
	public void setIdCertificatore(String idCertificatore)
	{
		this.idCertificatore = idCertificatore;
	}

	/**
	 * Method 'getProgrCertificato'
	 * 
	 * @return String
	 */
	public String getProgrCertificato()
	{
		return progrCertificato;
	}

	/**
	 * Method 'setProgrCertificato'
	 * 
	 * @param progrCertificato
	 */
	public void setProgrCertificato(String progrCertificato)
	{
		this.progrCertificato = progrCertificato;
	}

	/**
	 * Method 'getAnno'
	 * 
	 * @return String
	 */
	public String getAnno()
	{
		return anno;
	}

	/**
	 * Method 'setAnno'
	 * 
	 * @param anno
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
	}

	/**
	 * Method 'getDescTipoErog'
	 * 
	 * @return String
	 */
	public String getDescTipoErog()
	{
		return descTipoErog;
	}

	/**
	 * Method 'setDescTipoErog'
	 * 
	 * @param descTipoErog
	 */
	public void setDescTipoErog(String descTipoErog)
	{
		this.descTipoErog = descTipoErog;
	}

	/**
	 * Method 'getFkTipoImpianto'
	 * 
	 * @return Integer
	 */
	public Integer getFkTipoImpianto()
	{
		return fkTipoImpianto;
	}

	/**
	 * Method 'setFkTipoImpianto'
	 * 
	 * @param fkTipoImpianto
	 */
	public void setFkTipoImpianto(Integer fkTipoImpianto)
	{
		this.fkTipoImpianto = fkTipoImpianto;
	}

	/**
	 * Method 'getDescTipoDistrib'
	 * 
	 * @return String
	 */
	public String getDescTipoDistrib()
	{
		return descTipoDistrib;
	}

	/**
	 * Method 'setDescTipoDistrib'
	 * 
	 * @param descTipoDistrib
	 */
	public void setDescTipoDistrib(String descTipoDistrib)
	{
		this.descTipoDistrib = descTipoDistrib;
	}

	/**
	 * Method 'getDescTipoReg'
	 * 
	 * @return String
	 */
	public String getDescTipoReg()
	{
		return descTipoReg;
	}

	/**
	 * Method 'setDescTipoReg'
	 * 
	 * @param descTipoReg
	 */
	public void setDescTipoReg(String descTipoReg)
	{
		this.descTipoReg = descTipoReg;
	}

	/**
	 * Method 'getAnnTermiFossile'
	 * 
	 * @return Double
	 */
	public Double getAnnTermiFossile()
	{
		return annTermiFossile;
	}

	/**
	 * Method 'setAnnTermiFossile'
	 * 
	 * @param annTermiFossile
	 */
	public void setAnnTermiFossile(Double annTermiFossile)
	{
		this.annTermiFossile = annTermiFossile;
	}

	/**
	 * Method 'getAnnElettFossile'
	 * 
	 * @return Double
	 */
	public Double getAnnElettFossile()
	{
		return annElettFossile;
	}

	/**
	 * Method 'setAnnElettFossile'
	 * 
	 * @param annElettFossile
	 */
	public void setAnnElettFossile(Double annElettFossile)
	{
		this.annElettFossile = annElettFossile;
	}

	/**
	 * Method 'getAnnTermiRinno'
	 * 
	 * @return Double
	 */
	public Double getAnnTermiRinno()
	{
		return annTermiRinno;
	}

	/**
	 * Method 'setAnnTermiRinno'
	 * 
	 * @param annTermiRinno
	 */
	public void setAnnTermiRinno(Double annTermiRinno)
	{
		this.annTermiRinno = annTermiRinno;
	}

	/**
	 * Method 'getAnnElettRinno'
	 * 
	 * @return Double
	 */
	public Double getAnnElettRinno()
	{
		return annElettRinno;
	}

	/**
	 * Method 'setAnnElettRinno'
	 * 
	 * @param annElettRinno
	 */
	public void setAnnElettRinno(Double annElettRinno)
	{
		this.annElettRinno = annElettRinno;
	}

	/**
	 * Method 'getComplessTermico'
	 * 
	 * @return Double
	 */
	public Double getComplessTermico()
	{
		return complessTermico;
	}

	/**
	 * Method 'setComplessTermico'
	 * 
	 * @param complessTermico
	 */
	public void setComplessTermico(Double complessTermico)
	{
		this.complessTermico = complessTermico;
	}

	/**
	 * Method 'getComplessElettrico'
	 * 
	 * @return Double
	 */
	public Double getComplessElettrico()
	{
		return complessElettrico;
	}

	/**
	 * Method 'setComplessElettrico'
	 * 
	 * @param complessElettrico
	 */
	public void setComplessElettrico(Double complessElettrico)
	{
		this.complessElettrico = complessElettrico;
	}

	/**
	 * Method 'getUiServite'
	 * 
	 * @return String
	 */
	public String getUiServite()
	{
		return uiServite;
	}

	/**
	 * Method 'setUiServite'
	 * 
	 * @param uiServite
	 */
	public void setUiServite(String uiServite)
	{
		this.uiServite = uiServite;
	}

	/**
	 * Method 'getFlgContRip'
	 * 
	 * @return String
	 */
	public String getFlgContRip()
	{
		return flgContRip;
	}

	/**
	 * Method 'setFlgContRip'
	 * 
	 * @param flgContRip
	 */
	public void setFlgContRip(String flgContRip)
	{
		this.flgContRip = flgContRip;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	@Override
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SiceeTConsumiEdificio)) {
			return false;
		}
		
		final SiceeTConsumiEdificio _cast = (SiceeTConsumiEdificio) _other;
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (descTipoErog == null ? _cast.descTipoErog != descTipoErog : !descTipoErog.equals( _cast.descTipoErog )) {
			return false;
		}
		
		if (fkTipoImpianto == null ? _cast.fkTipoImpianto != fkTipoImpianto : !fkTipoImpianto.equals( _cast.fkTipoImpianto )) {
			return false;
		}
		
		if (descTipoDistrib == null ? _cast.descTipoDistrib != descTipoDistrib : !descTipoDistrib.equals( _cast.descTipoDistrib )) {
			return false;
		}
		
		if (descTipoReg == null ? _cast.descTipoReg != descTipoReg : !descTipoReg.equals( _cast.descTipoReg )) {
			return false;
		}
		
		if (annTermiFossile == null ? _cast.annTermiFossile != annTermiFossile : !annTermiFossile.equals( _cast.annTermiFossile )) {
			return false;
		}
		
		if (annElettFossile == null ? _cast.annElettFossile != annElettFossile : !annElettFossile.equals( _cast.annElettFossile )) {
			return false;
		}
		
		if (annTermiRinno == null ? _cast.annTermiRinno != annTermiRinno : !annTermiRinno.equals( _cast.annTermiRinno )) {
			return false;
		}
		
		if (annElettRinno == null ? _cast.annElettRinno != annElettRinno : !annElettRinno.equals( _cast.annElettRinno )) {
			return false;
		}
		
		if (complessTermico == null ? _cast.complessTermico != complessTermico : !complessTermico.equals( _cast.complessTermico )) {
			return false;
		}
		
		if (complessElettrico == null ? _cast.complessElettrico != complessElettrico : !complessElettrico.equals( _cast.complessElettrico )) {
			return false;
		}
		
		if (uiServite == null ? _cast.uiServite != uiServite : !uiServite.equals( _cast.uiServite )) {
			return false;
		}
		
		if (flgContRip == null ? _cast.flgContRip != flgContRip : !flgContRip.equals( _cast.flgContRip )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	@Override
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (progrCertificato != null) {
			_hashCode = 29 * _hashCode + progrCertificato.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
		if (descTipoErog != null) {
			_hashCode = 29 * _hashCode + descTipoErog.hashCode();
		}
		
		if (fkTipoImpianto != null) {
			_hashCode = 29 * _hashCode + fkTipoImpianto.hashCode();
		}
		
		if (descTipoDistrib != null) {
			_hashCode = 29 * _hashCode + descTipoDistrib.hashCode();
		}
		
		if (descTipoReg != null) {
			_hashCode = 29 * _hashCode + descTipoReg.hashCode();
		}
		
		if (annTermiFossile != null) {
			_hashCode = 29 * _hashCode + annTermiFossile.hashCode();
		}
		
		if (annElettFossile != null) {
			_hashCode = 29 * _hashCode + annElettFossile.hashCode();
		}
		
		if (annTermiRinno != null) {
			_hashCode = 29 * _hashCode + annTermiRinno.hashCode();
		}
		
		if (annElettRinno != null) {
			_hashCode = 29 * _hashCode + annElettRinno.hashCode();
		}
		
		if (complessTermico != null) {
			_hashCode = 29 * _hashCode + complessTermico.hashCode();
		}
		
		if (complessElettrico != null) {
			_hashCode = 29 * _hashCode + complessElettrico.hashCode();
		}
		
		if (uiServite != null) {
			_hashCode = 29 * _hashCode + uiServite.hashCode();
		}
		
		if (flgContRip != null) {
			_hashCode = 29 * _hashCode + flgContRip.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTConsumiEdificioPk
	 */
	public SiceeTConsumiEdificioPk createPk()
	{
		return new SiceeTConsumiEdificioPk(idCertificatore, progrCertificato, anno);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTConsumiEdificio: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", descTipoErog=" + descTipoErog );
		ret.append( ", fkTipoImpianto=" + fkTipoImpianto );
		ret.append( ", descTipoDistrib=" + descTipoDistrib );
		ret.append( ", descTipoReg=" + descTipoReg );
		ret.append( ", annTermiFossile=" + annTermiFossile );
		ret.append( ", annElettFossile=" + annElettFossile );
		ret.append( ", annTermiRinno=" + annTermiRinno );
		ret.append( ", annElettRinno=" + annElettRinno );
		ret.append( ", complessTermico=" + complessTermico );
		ret.append( ", complessElettrico=" + complessElettrico );
		ret.append( ", uiServite=" + uiServite );
		ret.append( ", flgContRip=" + flgContRip );
		return ret.toString();
	}

}
