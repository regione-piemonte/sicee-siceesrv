/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class SiceeTEnergiaSoprIngr implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1227475829349357977L;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column FK_DATI in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Integer fkDati;

	/** 
	 * This attribute maps to the column TECNO_RINNO in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected String tecnoRinno;

	/** 
	 * This attribute maps to the column ANNO_INSTALL in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Integer annoInstall;

	/** 
	 * This attribute maps to the column EN_TERMICA_PROD in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Double enTermicaProd;

	/** 
	 * This attribute maps to the column EN_ELETT_PROD in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Double enElettProd;

	/** 
	 * This attribute maps to the column AUTOCONS_TERMICO in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Double autoconsTermico;

	/** 
	 * This attribute maps to the column AUTOCONS_ELETT in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Double autoconsElett;

	/** 
	 * This attribute maps to the column DT_SOPRALLUOGO in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Date dtSopralluogo;

	/** 
	 * This attribute maps to the column NOTE_SOPRALL in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected String noteSoprall;

	/** 
	 * This attribute maps to the column PERC_FONTI_RINNOV in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	protected Double percFontiRinnov;

	/**
	 * Method 'SiceeTEnergiaSoprIngr'
	 * 
	 */
	public SiceeTEnergiaSoprIngr()
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
	 * Method 'getFkDati'
	 * 
	 * @return Integer
	 */
	public Integer getFkDati()
	{
		return fkDati;
	}

	/**
	 * Method 'setFkDati'
	 * 
	 * @param fkDati
	 */
	public void setFkDati(Integer fkDati)
	{
		this.fkDati = fkDati;
	}

	/**
	 * Method 'getTecnoRinno'
	 * 
	 * @return String
	 */
	public String getTecnoRinno()
	{
		return tecnoRinno;
	}

	/**
	 * Method 'setTecnoRinno'
	 * 
	 * @param tecnoRinno
	 */
	public void setTecnoRinno(String tecnoRinno)
	{
		this.tecnoRinno = tecnoRinno;
	}

	/**
	 * Method 'getAnnoInstall'
	 * 
	 * @return Integer
	 */
	public Integer getAnnoInstall()
	{
		return annoInstall;
	}

	/**
	 * Method 'setAnnoInstall'
	 * 
	 * @param annoInstall
	 */
	public void setAnnoInstall(Integer annoInstall)
	{
		this.annoInstall = annoInstall;
	}

	/**
	 * Method 'getEnTermicaProd'
	 * 
	 * @return Double
	 */
	public Double getEnTermicaProd()
	{
		return enTermicaProd;
	}

	/**
	 * Method 'setEnTermicaProd'
	 * 
	 * @param enTermicaProd
	 */
	public void setEnTermicaProd(Double enTermicaProd)
	{
		this.enTermicaProd = enTermicaProd;
	}

	/**
	 * Method 'getEnElettProd'
	 * 
	 * @return Double
	 */
	public Double getEnElettProd()
	{
		return enElettProd;
	}

	/**
	 * Method 'setEnElettProd'
	 * 
	 * @param enElettProd
	 */
	public void setEnElettProd(Double enElettProd)
	{
		this.enElettProd = enElettProd;
	}

	/**
	 * Method 'getAutoconsTermico'
	 * 
	 * @return Double
	 */
	public Double getAutoconsTermico()
	{
		return autoconsTermico;
	}

	/**
	 * Method 'setAutoconsTermico'
	 * 
	 * @param autoconsTermico
	 */
	public void setAutoconsTermico(Double autoconsTermico)
	{
		this.autoconsTermico = autoconsTermico;
	}

	/**
	 * Method 'getAutoconsElett'
	 * 
	 * @return Double
	 */
	public Double getAutoconsElett()
	{
		return autoconsElett;
	}

	/**
	 * Method 'setAutoconsElett'
	 * 
	 * @param autoconsElett
	 */
	public void setAutoconsElett(Double autoconsElett)
	{
		this.autoconsElett = autoconsElett;
	}

	/**
	 * Method 'getDtSopralluogo'
	 * 
	 * @return Date
	 */
	public Date getDtSopralluogo()
	{
		return dtSopralluogo;
	}

	/**
	 * Method 'setDtSopralluogo'
	 * 
	 * @param dtSopralluogo
	 */
	public void setDtSopralluogo(Date dtSopralluogo)
	{
		this.dtSopralluogo = dtSopralluogo;
	}

	/**
	 * Method 'getNoteSoprall'
	 * 
	 * @return String
	 */
	public String getNoteSoprall()
	{
		return noteSoprall;
	}

	/**
	 * Method 'setNoteSoprall'
	 * 
	 * @param noteSoprall
	 */
	public void setNoteSoprall(String noteSoprall)
	{
		this.noteSoprall = noteSoprall;
	}

	/**
	 * Method 'getPercFontiRinnov'
	 * 
	 * @return Double
	 */
	public Double getPercFontiRinnov()
	{
		return percFontiRinnov;
	}

	/**
	 * Method 'setPercFontiRinnov'
	 * 
	 * @param percFontiRinnov
	 */
	public void setPercFontiRinnov(Double percFontiRinnov)
	{
		this.percFontiRinnov = percFontiRinnov;
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
		
		if (!(_other instanceof SiceeTEnergiaSoprIngr)) {
			return false;
		}
		
		final SiceeTEnergiaSoprIngr _cast = (SiceeTEnergiaSoprIngr) _other;
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (fkDati == null ? _cast.fkDati != fkDati : !fkDati.equals( _cast.fkDati )) {
			return false;
		}
		
		if (tecnoRinno == null ? _cast.tecnoRinno != tecnoRinno : !tecnoRinno.equals( _cast.tecnoRinno )) {
			return false;
		}
		
		if (annoInstall == null ? _cast.annoInstall != annoInstall : !annoInstall.equals( _cast.annoInstall )) {
			return false;
		}
		
		if (enTermicaProd == null ? _cast.enTermicaProd != enTermicaProd : !enTermicaProd.equals( _cast.enTermicaProd )) {
			return false;
		}
		
		if (enElettProd == null ? _cast.enElettProd != enElettProd : !enElettProd.equals( _cast.enElettProd )) {
			return false;
		}
		
		if (autoconsTermico == null ? _cast.autoconsTermico != autoconsTermico : !autoconsTermico.equals( _cast.autoconsTermico )) {
			return false;
		}
		
		if (autoconsElett == null ? _cast.autoconsElett != autoconsElett : !autoconsElett.equals( _cast.autoconsElett )) {
			return false;
		}
		
		if (dtSopralluogo == null ? _cast.dtSopralluogo != dtSopralluogo : !dtSopralluogo.equals( _cast.dtSopralluogo )) {
			return false;
		}
		
		if (noteSoprall == null ? _cast.noteSoprall != noteSoprall : !noteSoprall.equals( _cast.noteSoprall )) {
			return false;
		}
		
		if (percFontiRinnov == null ? _cast.percFontiRinnov != percFontiRinnov : !percFontiRinnov.equals( _cast.percFontiRinnov )) {
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
		
		if (fkDati != null) {
			_hashCode = 29 * _hashCode + fkDati.hashCode();
		}
		
		if (tecnoRinno != null) {
			_hashCode = 29 * _hashCode + tecnoRinno.hashCode();
		}
		
		if (annoInstall != null) {
			_hashCode = 29 * _hashCode + annoInstall.hashCode();
		}
		
		if (enTermicaProd != null) {
			_hashCode = 29 * _hashCode + enTermicaProd.hashCode();
		}
		
		if (enElettProd != null) {
			_hashCode = 29 * _hashCode + enElettProd.hashCode();
		}
		
		if (autoconsTermico != null) {
			_hashCode = 29 * _hashCode + autoconsTermico.hashCode();
		}
		
		if (autoconsElett != null) {
			_hashCode = 29 * _hashCode + autoconsElett.hashCode();
		}
		
		if (dtSopralluogo != null) {
			_hashCode = 29 * _hashCode + dtSopralluogo.hashCode();
		}
		
		if (noteSoprall != null) {
			_hashCode = 29 * _hashCode + noteSoprall.hashCode();
		}
		
		if (percFontiRinnov != null) {
			_hashCode = 29 * _hashCode + percFontiRinnov.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTEnergiaSoprIngrPk
	 */
	public SiceeTEnergiaSoprIngrPk createPk()
	{
		return new SiceeTEnergiaSoprIngrPk(idCertificatore, progrCertificato, anno);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTEnergiaSoprIngr: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", fkDati=" + fkDati );
		ret.append( ", tecnoRinno=" + tecnoRinno );
		ret.append( ", annoInstall=" + annoInstall );
		ret.append( ", enTermicaProd=" + enTermicaProd );
		ret.append( ", enElettProd=" + enElettProd );
		ret.append( ", autoconsTermico=" + autoconsTermico );
		ret.append( ", autoconsElett=" + autoconsElett );
		ret.append( ", dtSopralluogo=" + dtSopralluogo );
		ret.append( ", noteSoprall=" + noteSoprall );
		ret.append( ", percFontiRinnov=" + percFontiRinnov );
		return ret.toString();
	}

}
