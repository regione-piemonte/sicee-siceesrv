/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTFabbisogno implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8295433562462470621L;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_FABBISOGNO table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_FABBISOGNO table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_FABBISOGNO table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column DOM_RISC_QH in the SICEE_T_FABBISOGNO table.
	 */
	protected Double domRiscQh;

	/** 
	 * This attribute maps to the column LIMITE_REG_QH_LIM in the SICEE_T_FABBISOGNO table.
	 */
	protected Double limiteRegQhLim;

	/** 
	 * This attribute maps to the column FABB_CONDIZ in the SICEE_T_FABBISOGNO table.
	 */
	protected Double fabbCondiz;

	/** 
	 * This attribute maps to the column DOM_ACS_QHW in the SICEE_T_FABBISOGNO table.
	 */
	protected Double domAcsQhw;

	/** 
	 * This attribute maps to the column EN_ACS_RINNO in the SICEE_T_FABBISOGNO table.
	 */
	protected Double enAcsRinno;

	/** 
	 * This attribute maps to the column REND_ACS_ETAGACS in the SICEE_T_FABBISOGNO table.
	 */
	protected Double rendAcsEtagacs;

	/** 
	 * This attribute maps to the column FABB_ACS in the SICEE_T_FABBISOGNO table.
	 */
	protected Double fabbAcs;

	/** 
	 * This attribute maps to the column FABB_ILLUM in the SICEE_T_FABBISOGNO table.
	 */
	protected Double fabbIllum;

	/**
	 * Method 'SiceeTFabbisogno'
	 * 
	 */
	public SiceeTFabbisogno()
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
	 * Method 'getDomRiscQh'
	 * 
	 * @return Double
	 */
	public Double getDomRiscQh()
	{
		return domRiscQh;
	}

	/**
	 * Method 'setDomRiscQh'
	 * 
	 * @param domRiscQh
	 */
	public void setDomRiscQh(Double domRiscQh)
	{
		this.domRiscQh = domRiscQh;
	}

	/**
	 * Method 'getLimiteRegQhLim'
	 * 
	 * @return Double
	 */
	public Double getLimiteRegQhLim()
	{
		return limiteRegQhLim;
	}

	/**
	 * Method 'setLimiteRegQhLim'
	 * 
	 * @param limiteRegQhLim
	 */
	public void setLimiteRegQhLim(Double limiteRegQhLim)
	{
		this.limiteRegQhLim = limiteRegQhLim;
	}

	/**
	 * Method 'getFabbCondiz'
	 * 
	 * @return Double
	 */
	public Double getFabbCondiz()
	{
		return fabbCondiz;
	}

	/**
	 * Method 'setFabbCondiz'
	 * 
	 * @param fabbCondiz
	 */
	public void setFabbCondiz(Double fabbCondiz)
	{
		this.fabbCondiz = fabbCondiz;
	}

	/**
	 * Method 'getDomAcsQhw'
	 * 
	 * @return Double
	 */
	public Double getDomAcsQhw()
	{
		return domAcsQhw;
	}

	/**
	 * Method 'setDomAcsQhw'
	 * 
	 * @param domAcsQhw
	 */
	public void setDomAcsQhw(Double domAcsQhw)
	{
		this.domAcsQhw = domAcsQhw;
	}

	/**
	 * Method 'getEnAcsRinno'
	 * 
	 * @return Double
	 */
	public Double getEnAcsRinno()
	{
		return enAcsRinno;
	}

	/**
	 * Method 'setEnAcsRinno'
	 * 
	 * @param enAcsRinno
	 */
	public void setEnAcsRinno(Double enAcsRinno)
	{
		this.enAcsRinno = enAcsRinno;
	}

	/**
	 * Method 'getRendAcsEtagacs'
	 * 
	 * @return Double
	 */
	public Double getRendAcsEtagacs()
	{
		return rendAcsEtagacs;
	}

	/**
	 * Method 'setRendAcsEtagacs'
	 * 
	 * @param rendAcsEtagacs
	 */
	public void setRendAcsEtagacs(Double rendAcsEtagacs)
	{
		this.rendAcsEtagacs = rendAcsEtagacs;
	}

	/**
	 * Method 'getFabbAcs'
	 * 
	 * @return Double
	 */
	public Double getFabbAcs()
	{
		return fabbAcs;
	}

	/**
	 * Method 'setFabbAcs'
	 * 
	 * @param fabbAcs
	 */
	public void setFabbAcs(Double fabbAcs)
	{
		this.fabbAcs = fabbAcs;
	}

	/**
	 * Method 'getFabbIllum'
	 * 
	 * @return Double
	 */
	public Double getFabbIllum()
	{
		return fabbIllum;
	}

	/**
	 * Method 'setFabbIllum'
	 * 
	 * @param fabbIllum
	 */
	public void setFabbIllum(Double fabbIllum)
	{
		this.fabbIllum = fabbIllum;
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
		
		if (!(_other instanceof SiceeTFabbisogno)) {
			return false;
		}
		
		final SiceeTFabbisogno _cast = (SiceeTFabbisogno) _other;
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (domRiscQh == null ? _cast.domRiscQh != domRiscQh : !domRiscQh.equals( _cast.domRiscQh )) {
			return false;
		}
		
		if (limiteRegQhLim == null ? _cast.limiteRegQhLim != limiteRegQhLim : !limiteRegQhLim.equals( _cast.limiteRegQhLim )) {
			return false;
		}
		
		if (fabbCondiz == null ? _cast.fabbCondiz != fabbCondiz : !fabbCondiz.equals( _cast.fabbCondiz )) {
			return false;
		}
		
		if (domAcsQhw == null ? _cast.domAcsQhw != domAcsQhw : !domAcsQhw.equals( _cast.domAcsQhw )) {
			return false;
		}
		
		if (enAcsRinno == null ? _cast.enAcsRinno != enAcsRinno : !enAcsRinno.equals( _cast.enAcsRinno )) {
			return false;
		}
		
		if (rendAcsEtagacs == null ? _cast.rendAcsEtagacs != rendAcsEtagacs : !rendAcsEtagacs.equals( _cast.rendAcsEtagacs )) {
			return false;
		}
		
		if (fabbAcs == null ? _cast.fabbAcs != fabbAcs : !fabbAcs.equals( _cast.fabbAcs )) {
			return false;
		}
		
		if (fabbIllum == null ? _cast.fabbIllum != fabbIllum : !fabbIllum.equals( _cast.fabbIllum )) {
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
		
		if (domRiscQh != null) {
			_hashCode = 29 * _hashCode + domRiscQh.hashCode();
		}
		
		if (limiteRegQhLim != null) {
			_hashCode = 29 * _hashCode + limiteRegQhLim.hashCode();
		}
		
		if (fabbCondiz != null) {
			_hashCode = 29 * _hashCode + fabbCondiz.hashCode();
		}
		
		if (domAcsQhw != null) {
			_hashCode = 29 * _hashCode + domAcsQhw.hashCode();
		}
		
		if (enAcsRinno != null) {
			_hashCode = 29 * _hashCode + enAcsRinno.hashCode();
		}
		
		if (rendAcsEtagacs != null) {
			_hashCode = 29 * _hashCode + rendAcsEtagacs.hashCode();
		}
		
		if (fabbAcs != null) {
			_hashCode = 29 * _hashCode + fabbAcs.hashCode();
		}
		
		if (fabbIllum != null) {
			_hashCode = 29 * _hashCode + fabbIllum.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTFabbisognoPk
	 */
	public SiceeTFabbisognoPk createPk()
	{
		return new SiceeTFabbisognoPk(idCertificatore, progrCertificato, anno);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTFabbisogno: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", domRiscQh=" + domRiscQh );
		ret.append( ", limiteRegQhLim=" + limiteRegQhLim );
		ret.append( ", fabbCondiz=" + fabbCondiz );
		ret.append( ", domAcsQhw=" + domAcsQhw );
		ret.append( ", enAcsRinno=" + enAcsRinno );
		ret.append( ", rendAcsEtagacs=" + rendAcsEtagacs );
		ret.append( ", fabbAcs=" + fabbAcs );
		ret.append( ", fabbIllum=" + fabbIllum );
		return ret.toString();
	}

}
