/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTClasseEnergetica implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6888533718599555626L;

	/** 
	 * This attribute maps to the column IND_RISC_EPI in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indRiscEpi;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column IND_COND_EST in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indCondEst;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column IND_ILLUM in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indIllum;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column IND_GLOB_EPLORDO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indGlobEplordo;

	/** 
	 * This attribute maps to the column FK_CLASSE in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Integer fkClasse;

	/** 
	 * This attribute maps to the column REND_GENER in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double rendGener;

	/** 
	 * This attribute maps to the column REND_REGOL in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double rendRegol;

	/** 
	 * This attribute maps to the column SERVIZI_ENERGETICI in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected String serviziEnergetici;

	/** 
	 * This attribute maps to the column REND_EMISS in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double rendEmiss;

	/** 
	 * This attribute maps to the column REND_DISTRIB in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double rendDistrib;

	/** 
	 * This attribute maps to the column REND_IMP_ETAG in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double rendImpEtag;

	/** 
	 * This attribute maps to the column DOM_RISC_QHTO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double domRiscQhto;

	/** 
	 * This attribute maps to the column LIMITE_REG_QHTO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double limiteRegQhto;

	/** 
	 * This attribute maps to the column IND_RISC_EPITO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indRiscEpito;

	/** 
	 * This attribute maps to the column DOM_ACS_QHWTO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double domAcsQhwto;

	/** 
	 * This attribute maps to the column EN_ACS_RINNO_TO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double enAcsRinnoTo;

	/** 
	 * This attribute maps to the column REND_ACS_ETAG_ACSTO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double rendAcsEtagAcsto;

	/** 
	 * This attribute maps to the column FABB_ACS_TO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double fabbAcsTo;

	/** 
	 * This attribute maps to the column IND_GLOB_EPLORDO_TO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indGlobEplordoTo;

	/** 
	 * This attribute maps to the column ETAG_CONV in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double etagConv;

	/** 
	 * This attribute maps to the column IND_GLOB_LIMITE_TO in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	protected Double indGlobLimiteTo;

	/**
	 * Method 'SiceeTClasseEnergetica'
	 * 
	 */
	public SiceeTClasseEnergetica()
	{
	}

	/**
	 * Method 'getIndRiscEpi'
	 * 
	 * @return Double
	 */
	public Double getIndRiscEpi()
	{
		return indRiscEpi;
	}

	/**
	 * Method 'setIndRiscEpi'
	 * 
	 * @param indRiscEpi
	 */
	public void setIndRiscEpi(Double indRiscEpi)
	{
		this.indRiscEpi = indRiscEpi;
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
	 * Method 'getIndCondEst'
	 * 
	 * @return Double
	 */
	public Double getIndCondEst()
	{
		return indCondEst;
	}

	/**
	 * Method 'setIndCondEst'
	 * 
	 * @param indCondEst
	 */
	public void setIndCondEst(Double indCondEst)
	{
		this.indCondEst = indCondEst;
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
	 * Method 'getIndIllum'
	 * 
	 * @return Double
	 */
	public Double getIndIllum()
	{
		return indIllum;
	}

	/**
	 * Method 'setIndIllum'
	 * 
	 * @param indIllum
	 */
	public void setIndIllum(Double indIllum)
	{
		this.indIllum = indIllum;
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
	 * Method 'getIndGlobEplordo'
	 * 
	 * @return Double
	 */
	public Double getIndGlobEplordo()
	{
		return indGlobEplordo;
	}

	/**
	 * Method 'setIndGlobEplordo'
	 * 
	 * @param indGlobEplordo
	 */
	public void setIndGlobEplordo(Double indGlobEplordo)
	{
		this.indGlobEplordo = indGlobEplordo;
	}

	/**
	 * Method 'getFkClasse'
	 * 
	 * @return Integer
	 */
	public Integer getFkClasse()
	{
		return fkClasse;
	}

	/**
	 * Method 'setFkClasse'
	 * 
	 * @param fkClasse
	 */
	public void setFkClasse(Integer fkClasse)
	{
		this.fkClasse = fkClasse;
	}

	/**
	 * Method 'getRendGener'
	 * 
	 * @return Double
	 */
	public Double getRendGener()
	{
		return rendGener;
	}

	/**
	 * Method 'setRendGener'
	 * 
	 * @param rendGener
	 */
	public void setRendGener(Double rendGener)
	{
		this.rendGener = rendGener;
	}

	/**
	 * Method 'getRendRegol'
	 * 
	 * @return Double
	 */
	public Double getRendRegol()
	{
		return rendRegol;
	}

	/**
	 * Method 'setRendRegol'
	 * 
	 * @param rendRegol
	 */
	public void setRendRegol(Double rendRegol)
	{
		this.rendRegol = rendRegol;
	}

	/**
	 * Method 'getServiziEnergetici'
	 * 
	 * @return String
	 */
	public String getServiziEnergetici()
	{
		return serviziEnergetici;
	}

	/**
	 * Method 'setServiziEnergetici'
	 * 
	 * @param serviziEnergetici
	 */
	public void setServiziEnergetici(String serviziEnergetici)
	{
		this.serviziEnergetici = serviziEnergetici;
	}

	/**
	 * Method 'getRendEmiss'
	 * 
	 * @return Double
	 */
	public Double getRendEmiss()
	{
		return rendEmiss;
	}

	/**
	 * Method 'setRendEmiss'
	 * 
	 * @param rendEmiss
	 */
	public void setRendEmiss(Double rendEmiss)
	{
		this.rendEmiss = rendEmiss;
	}

	/**
	 * Method 'getRendDistrib'
	 * 
	 * @return Double
	 */
	public Double getRendDistrib()
	{
		return rendDistrib;
	}

	/**
	 * Method 'setRendDistrib'
	 * 
	 * @param rendDistrib
	 */
	public void setRendDistrib(Double rendDistrib)
	{
		this.rendDistrib = rendDistrib;
	}

	/**
	 * Method 'getRendImpEtag'
	 * 
	 * @return Double
	 */
	public Double getRendImpEtag()
	{
		return rendImpEtag;
	}

	/**
	 * Method 'setRendImpEtag'
	 * 
	 * @param rendImpEtag
	 */
	public void setRendImpEtag(Double rendImpEtag)
	{
		this.rendImpEtag = rendImpEtag;
	}

	/**
	 * Method 'getDomRiscQhto'
	 * 
	 * @return Double
	 */
	public Double getDomRiscQhto()
	{
		return domRiscQhto;
	}

	/**
	 * Method 'setDomRiscQhto'
	 * 
	 * @param domRiscQhto
	 */
	public void setDomRiscQhto(Double domRiscQhto)
	{
		this.domRiscQhto = domRiscQhto;
	}

	/**
	 * Method 'getLimiteRegQhto'
	 * 
	 * @return Double
	 */
	public Double getLimiteRegQhto()
	{
		return limiteRegQhto;
	}

	/**
	 * Method 'setLimiteRegQhto'
	 * 
	 * @param limiteRegQhto
	 */
	public void setLimiteRegQhto(Double limiteRegQhto)
	{
		this.limiteRegQhto = limiteRegQhto;
	}

	/**
	 * Method 'getIndRiscEpito'
	 * 
	 * @return Double
	 */
	public Double getIndRiscEpito()
	{
		return indRiscEpito;
	}

	/**
	 * Method 'setIndRiscEpito'
	 * 
	 * @param indRiscEpito
	 */
	public void setIndRiscEpito(Double indRiscEpito)
	{
		this.indRiscEpito = indRiscEpito;
	}

	/**
	 * Method 'getDomAcsQhwto'
	 * 
	 * @return Double
	 */
	public Double getDomAcsQhwto()
	{
		return domAcsQhwto;
	}

	/**
	 * Method 'setDomAcsQhwto'
	 * 
	 * @param domAcsQhwto
	 */
	public void setDomAcsQhwto(Double domAcsQhwto)
	{
		this.domAcsQhwto = domAcsQhwto;
	}

	/**
	 * Method 'getEnAcsRinnoTo'
	 * 
	 * @return Double
	 */
	public Double getEnAcsRinnoTo()
	{
		return enAcsRinnoTo;
	}

	/**
	 * Method 'setEnAcsRinnoTo'
	 * 
	 * @param enAcsRinnoTo
	 */
	public void setEnAcsRinnoTo(Double enAcsRinnoTo)
	{
		this.enAcsRinnoTo = enAcsRinnoTo;
	}

	/**
	 * Method 'getRendAcsEtagAcsto'
	 * 
	 * @return Double
	 */
	public Double getRendAcsEtagAcsto()
	{
		return rendAcsEtagAcsto;
	}

	/**
	 * Method 'setRendAcsEtagAcsto'
	 * 
	 * @param rendAcsEtagAcsto
	 */
	public void setRendAcsEtagAcsto(Double rendAcsEtagAcsto)
	{
		this.rendAcsEtagAcsto = rendAcsEtagAcsto;
	}

	/**
	 * Method 'getFabbAcsTo'
	 * 
	 * @return Double
	 */
	public Double getFabbAcsTo()
	{
		return fabbAcsTo;
	}

	/**
	 * Method 'setFabbAcsTo'
	 * 
	 * @param fabbAcsTo
	 */
	public void setFabbAcsTo(Double fabbAcsTo)
	{
		this.fabbAcsTo = fabbAcsTo;
	}

	/**
	 * Method 'getIndGlobEplordoTo'
	 * 
	 * @return Double
	 */
	public Double getIndGlobEplordoTo()
	{
		return indGlobEplordoTo;
	}

	/**
	 * Method 'setIndGlobEplordoTo'
	 * 
	 * @param indGlobEplordoTo
	 */
	public void setIndGlobEplordoTo(Double indGlobEplordoTo)
	{
		this.indGlobEplordoTo = indGlobEplordoTo;
	}

	/**
	 * Method 'getEtagConv'
	 * 
	 * @return Double
	 */
	public Double getEtagConv()
	{
		return etagConv;
	}

	/**
	 * Method 'setEtagConv'
	 * 
	 * @param etagConv
	 */
	public void setEtagConv(Double etagConv)
	{
		this.etagConv = etagConv;
	}

	/**
	 * Method 'getIndGlobLimiteTo'
	 * 
	 * @return Double
	 */
	public Double getIndGlobLimiteTo()
	{
		return indGlobLimiteTo;
	}

	/**
	 * Method 'setIndGlobLimiteTo'
	 * 
	 * @param indGlobLimiteTo
	 */
	public void setIndGlobLimiteTo(Double indGlobLimiteTo)
	{
		this.indGlobLimiteTo = indGlobLimiteTo;
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
		
		if (!(_other instanceof SiceeTClasseEnergetica)) {
			return false;
		}
		
		final SiceeTClasseEnergetica _cast = (SiceeTClasseEnergetica) _other;
		if (indRiscEpi == null ? _cast.indRiscEpi != indRiscEpi : !indRiscEpi.equals( _cast.indRiscEpi )) {
			return false;
		}
		
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (indCondEst == null ? _cast.indCondEst != indCondEst : !indCondEst.equals( _cast.indCondEst )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (indIllum == null ? _cast.indIllum != indIllum : !indIllum.equals( _cast.indIllum )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (indGlobEplordo == null ? _cast.indGlobEplordo != indGlobEplordo : !indGlobEplordo.equals( _cast.indGlobEplordo )) {
			return false;
		}
		
		if (fkClasse == null ? _cast.fkClasse != fkClasse : !fkClasse.equals( _cast.fkClasse )) {
			return false;
		}
		
		if (rendGener == null ? _cast.rendGener != rendGener : !rendGener.equals( _cast.rendGener )) {
			return false;
		}
		
		if (rendRegol == null ? _cast.rendRegol != rendRegol : !rendRegol.equals( _cast.rendRegol )) {
			return false;
		}
		
		if (serviziEnergetici == null ? _cast.serviziEnergetici != serviziEnergetici : !serviziEnergetici.equals( _cast.serviziEnergetici )) {
			return false;
		}
		
		if (rendEmiss == null ? _cast.rendEmiss != rendEmiss : !rendEmiss.equals( _cast.rendEmiss )) {
			return false;
		}
		
		if (rendDistrib == null ? _cast.rendDistrib != rendDistrib : !rendDistrib.equals( _cast.rendDistrib )) {
			return false;
		}
		
		if (rendImpEtag == null ? _cast.rendImpEtag != rendImpEtag : !rendImpEtag.equals( _cast.rendImpEtag )) {
			return false;
		}
		
		if (domRiscQhto == null ? _cast.domRiscQhto != domRiscQhto : !domRiscQhto.equals( _cast.domRiscQhto )) {
			return false;
		}
		
		if (limiteRegQhto == null ? _cast.limiteRegQhto != limiteRegQhto : !limiteRegQhto.equals( _cast.limiteRegQhto )) {
			return false;
		}
		
		if (indRiscEpito == null ? _cast.indRiscEpito != indRiscEpito : !indRiscEpito.equals( _cast.indRiscEpito )) {
			return false;
		}
		
		if (domAcsQhwto == null ? _cast.domAcsQhwto != domAcsQhwto : !domAcsQhwto.equals( _cast.domAcsQhwto )) {
			return false;
		}
		
		if (enAcsRinnoTo == null ? _cast.enAcsRinnoTo != enAcsRinnoTo : !enAcsRinnoTo.equals( _cast.enAcsRinnoTo )) {
			return false;
		}
		
		if (rendAcsEtagAcsto == null ? _cast.rendAcsEtagAcsto != rendAcsEtagAcsto : !rendAcsEtagAcsto.equals( _cast.rendAcsEtagAcsto )) {
			return false;
		}
		
		if (fabbAcsTo == null ? _cast.fabbAcsTo != fabbAcsTo : !fabbAcsTo.equals( _cast.fabbAcsTo )) {
			return false;
		}
		
		if (indGlobEplordoTo == null ? _cast.indGlobEplordoTo != indGlobEplordoTo : !indGlobEplordoTo.equals( _cast.indGlobEplordoTo )) {
			return false;
		}
		
		if (etagConv == null ? _cast.etagConv != etagConv : !etagConv.equals( _cast.etagConv )) {
			return false;
		}
		
		if (indGlobLimiteTo == null ? _cast.indGlobLimiteTo != indGlobLimiteTo : !indGlobLimiteTo.equals( _cast.indGlobLimiteTo )) {
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
		if (indRiscEpi != null) {
			_hashCode = 29 * _hashCode + indRiscEpi.hashCode();
		}
		
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (indCondEst != null) {
			_hashCode = 29 * _hashCode + indCondEst.hashCode();
		}
		
		if (progrCertificato != null) {
			_hashCode = 29 * _hashCode + progrCertificato.hashCode();
		}
		
		if (indIllum != null) {
			_hashCode = 29 * _hashCode + indIllum.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
		if (indGlobEplordo != null) {
			_hashCode = 29 * _hashCode + indGlobEplordo.hashCode();
		}
		
		if (fkClasse != null) {
			_hashCode = 29 * _hashCode + fkClasse.hashCode();
		}
		
		if (rendGener != null) {
			_hashCode = 29 * _hashCode + rendGener.hashCode();
		}
		
		if (rendRegol != null) {
			_hashCode = 29 * _hashCode + rendRegol.hashCode();
		}
		
		if (serviziEnergetici != null) {
			_hashCode = 29 * _hashCode + serviziEnergetici.hashCode();
		}
		
		if (rendEmiss != null) {
			_hashCode = 29 * _hashCode + rendEmiss.hashCode();
		}
		
		if (rendDistrib != null) {
			_hashCode = 29 * _hashCode + rendDistrib.hashCode();
		}
		
		if (rendImpEtag != null) {
			_hashCode = 29 * _hashCode + rendImpEtag.hashCode();
		}
		
		if (domRiscQhto != null) {
			_hashCode = 29 * _hashCode + domRiscQhto.hashCode();
		}
		
		if (limiteRegQhto != null) {
			_hashCode = 29 * _hashCode + limiteRegQhto.hashCode();
		}
		
		if (indRiscEpito != null) {
			_hashCode = 29 * _hashCode + indRiscEpito.hashCode();
		}
		
		if (domAcsQhwto != null) {
			_hashCode = 29 * _hashCode + domAcsQhwto.hashCode();
		}
		
		if (enAcsRinnoTo != null) {
			_hashCode = 29 * _hashCode + enAcsRinnoTo.hashCode();
		}
		
		if (rendAcsEtagAcsto != null) {
			_hashCode = 29 * _hashCode + rendAcsEtagAcsto.hashCode();
		}
		
		if (fabbAcsTo != null) {
			_hashCode = 29 * _hashCode + fabbAcsTo.hashCode();
		}
		
		if (indGlobEplordoTo != null) {
			_hashCode = 29 * _hashCode + indGlobEplordoTo.hashCode();
		}
		
		if (etagConv != null) {
			_hashCode = 29 * _hashCode + etagConv.hashCode();
		}
		
		if (indGlobLimiteTo != null) {
			_hashCode = 29 * _hashCode + indGlobLimiteTo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTClasseEnergeticaPk
	 */
	public SiceeTClasseEnergeticaPk createPk()
	{
		return new SiceeTClasseEnergeticaPk(idCertificatore, progrCertificato, anno);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTClasseEnergetica: " );
		ret.append( "indRiscEpi=" + indRiscEpi );
		ret.append( ", idCertificatore=" + idCertificatore );
		ret.append( ", indCondEst=" + indCondEst );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", indIllum=" + indIllum );
		ret.append( ", anno=" + anno );
		ret.append( ", indGlobEplordo=" + indGlobEplordo );
		ret.append( ", fkClasse=" + fkClasse );
		ret.append( ", rendGener=" + rendGener );
		ret.append( ", rendRegol=" + rendRegol );
		ret.append( ", serviziEnergetici=" + serviziEnergetici );
		ret.append( ", rendEmiss=" + rendEmiss );
		ret.append( ", rendDistrib=" + rendDistrib );
		ret.append( ", rendImpEtag=" + rendImpEtag );
		ret.append( ", domRiscQhto=" + domRiscQhto );
		ret.append( ", limiteRegQhto=" + limiteRegQhto );
		ret.append( ", indRiscEpito=" + indRiscEpito );
		ret.append( ", domAcsQhwto=" + domAcsQhwto );
		ret.append( ", enAcsRinnoTo=" + enAcsRinnoTo );
		ret.append( ", rendAcsEtagAcsto=" + rendAcsEtagAcsto );
		ret.append( ", fabbAcsTo=" + fabbAcsTo );
		ret.append( ", indGlobEplordoTo=" + indGlobEplordoTo );
		ret.append( ", etagConv=" + etagConv );
		ret.append( ", indGlobLimiteTo=" + indGlobLimiteTo );
		return ret.toString();
	}

}
