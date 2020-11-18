/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.facade;

import it.csi.sicee.siceesrv.business.dao.dao.OptimizedSiceeTCerticatoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDCarattEdificioDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDClasseEfficienzaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDClasseEnergeticaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDCombustibileDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDatiIngressoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDestUso2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDestUsoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDichiarazioneDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDIstruzioneDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDMotivoRilascioDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDNormativaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDOggettoApe2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDPrioritaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDQualitaInvolucroDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDRiqEner2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDStatoCertDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDProprietaEdif2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDServEner2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoImpianto2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoRistrutt2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipolEdilizia2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipolCostrutt2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoEdificioDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoImpiantoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDUnitaMisura2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeRCertifServener2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeRCombDener2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTActaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTAltreInfoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTAziendaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTCertificatoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTCertificatoreDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTClasseEnergeticaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTConsumiEdificioDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDatiCatastSecDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDatiEner2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDatiGeneraliDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDetImp2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTEnergiaSoprIngrDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTFabbisognoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTFoto2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTImpRiscaldamentoAcsDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTQtaConsumi2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTRaccomand2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTRaccomandazioniDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTRifIndex2015Dao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTRispettoNormativeDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTRuoliEdificioDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTSostituzioneDao;
import it.csi.sicee.siceesrv.business.dao.dto.OptimizedSiceeTCerticato;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDCarattEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDClasseEfficienza;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDCombustibile;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDatiIngresso;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDestUso;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDestUso2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDichiarazione;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDIstruzione;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDMotivoRilascio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDOggettoApe2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDPriorita;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDQualitaInvolucro;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDRiqEner2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDStatoCert;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoImpianto;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoImpianto2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDUnitaMisura2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRCertifServener2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRCombDener2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTActa;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAltreInfo;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAzienda;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAltreInfoPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertXml2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificato;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificatoPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificatore;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTClasseEnergeticaPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTConsumiEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTConsumiEdificioPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSec;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiEner2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiGenerali;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiGeneraliPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDetImp2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTEnergiaSoprIngr;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTEnergiaSoprIngrPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTFabbisogno;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTFabbisognoPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTFoto2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTImpRiscaldamentoAcs;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTImpRiscaldamentoAcsPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametri;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTQtaConsumi2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRaccomand2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRaccomandazioni;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRifIndex2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRispettoNormative;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRispettoNormativePk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRuoliEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRuoliEdificioPk;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzione;
import it.csi.sicee.siceesrv.business.dao.exceptions.DaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.OptimizedSiceeTCerticatoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDCarattEdificioDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDDestUso2015DaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDDestUsoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDMotivoRilascioDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDPrioritaDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDStatoCertDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTipoEdificioDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTActaDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTCertificatoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTCertificatoreDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTRifIndex2015DaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTSostituzioneDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTAltreInfoDaoException;
import it.csi.sicee.siceesrv.business.print.dto.AceDto;
import it.csi.sicee.siceesrv.business.print.dto.DatiAttestato;
import it.csi.sicee.siceesrv.business.print.dto.DatiCatastaliDto;
import it.csi.sicee.siceesrv.business.print.dto.DtAIEnergetiche;
import it.csi.sicee.siceesrv.business.print.dto.DtAIGenerali;
import it.csi.sicee.siceesrv.business.print.dto.DtAISopralluoghi;
import it.csi.sicee.siceesrv.business.print.dto.DtAltreInfo;
import it.csi.sicee.siceesrv.business.print.dto.DtAnagImmobile;
import it.csi.sicee.siceesrv.business.print.dto.DtCatastali;
import it.csi.sicee.siceesrv.business.print.dto.DtCatastaliSecondari;
import it.csi.sicee.siceesrv.business.print.dto.DtClasseEnerg;
import it.csi.sicee.siceesrv.business.print.dto.DtCoCertificatore;
import it.csi.sicee.siceesrv.business.print.dto.DtConsumiReali;
import it.csi.sicee.siceesrv.business.print.dto.DtDichiarazFinale;
import it.csi.sicee.siceesrv.business.print.dto.DtEnergiaFontiRinnov;
import it.csi.sicee.siceesrv.business.print.dto.DtGasSerra;
import it.csi.sicee.siceesrv.business.print.dto.DtImpAcqua;
import it.csi.sicee.siceesrv.business.print.dto.DtImpRiscald;
import it.csi.sicee.siceesrv.business.print.dto.DtImpianti;
import it.csi.sicee.siceesrv.business.print.dto.DtIndiciFabbisogno;
import it.csi.sicee.siceesrv.business.print.dto.DtLocReale;
import it.csi.sicee.siceesrv.business.print.dto.DtLocTeorica;
import it.csi.sicee.siceesrv.business.print.dto.DtResponsabili;
import it.csi.sicee.siceesrv.business.print.dto.DtRispettoNorme;
import it.csi.sicee.siceesrv.business.print.dto.DtTecniciGen;
import it.csi.sicee.siceesrv.business.print.dto.MotivoAnnullamento;
import it.csi.sicee.siceesrv.business.print.dto.Raccomandazione;
import it.csi.sicee.siceesrv.business.print.dto.RicevutaInvioAceDto;
import it.csi.sicee.siceesrv.business.print.dto.SoggResponsabile;
import it.csi.sicee.siceesrv.business.siceesrv.SiceesrvImpl;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.sicee.siceesrv.business.util.Converter;
import it.csi.sicee.siceesrv.business.util.GenericUtil;
import it.csi.sicee.siceesrv.business.util.RaccomandazioneComparator;
import it.csi.sicee.siceesrv.business.util.XmlBeanUtils;
import it.csi.sicee.siceesrv.dto.siceesrv.Ace;
import it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce;
import it.csi.sicee.siceesrv.dto.siceesrv.LabelValue;
import it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione;
import it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;
import it.csi.sicee.siceesrv.util.GenericPrint;
import it.csi.sicee.siceesrv.business.print.dto.ApeDto;
import it.csi.sicee.siceesrv.business.print.dto.ApeReadOnlyData;
import it.csi.sicee.siceesrv.business.print.dto.ApeTarghettaReadOnlyData;
import it.csi.sicee.siceesrv.business.util.MapDto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;
//import java.util.StringTokenizer;

































import javax.servlet.ServletContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.impl.util.Base64;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// TODO: Auto-generated Javadoc
/**
 * The Class CertificatoMgr.
 */
public class CertificatoMgr extends BaseMgr {
	
	/** The sicee t certificato dao. */
	private SiceeTCertificatoDao siceeTCertificatoDao;

	/** The sicee t certificato dao. */
	private OptimizedSiceeTCerticatoDao optimizedSiceeTCerticatoDao;

	/** The sicee t certificatore dao. */
	private SiceeTCertificatoreDao siceeTCertificatoreDao;

	/** The sicee t parametri dao. */
	private SiceeTParametriDao siceeTParametriDao;

	/** The sicee d stato cert dao. */
	private SiceeDStatoCertDao siceeDStatoCertDao;

	/** The sicee d dati ingresso dao. */
	private SiceeDDatiIngressoDao siceeDDatiIngressoDao;

	/** The sicee d classe efficienza dao. */
	private SiceeDClasseEfficienzaDao siceeDClasseEfficienzaDao;

	/** The sicee d combistibile dao. */
	private SiceeDCombustibileDao siceeDCombustibileDao;

	/** The sicee d qualita involucro dao. */
	private SiceeDQualitaInvolucroDao siceeDQualitaInvolucroDao;

	/** The sicee d tipo motivo rilascio dao. */
	private SiceeDMotivoRilascioDao siceeDMotivoRilascioDao;

	/** The sicee d dest uso dao. */
	private SiceeDDestUsoDao siceeDDestUsoDao;

	/** The sicee d tipo impianto dao. */
	private SiceeDTipoImpiantoDao siceeDTipoImpiantoDao;

	/** The sicee d caratt edificio dao. */
	private SiceeDCarattEdificioDao siceeDCarattEdificioDao;

	/** The sicee d tipo edificio dao. */
	private SiceeDTipoEdificioDao siceeDTipoEdificioDao;

	/** The sicee t sostituzione dao. */
	private SiceeTSostituzioneDao siceeTSostituzioneDao;
	
	/** The sicee t classe energetica dao. */
	private SiceeTClasseEnergeticaDao siceeTClasseEnergeticaDao;
	
	/** The sicee t consumi edificio dao. */
	private SiceeTConsumiEdificioDao siceeTConsumiEdificioDao;
	
	/** The sicee t dati generali dao. */
	private SiceeTDatiGeneraliDao siceeTDatiGeneraliDao;
	
	/** The sicee t energia sopr ingr dao. */
	private SiceeTEnergiaSoprIngrDao siceeTEnergiaSoprIngrDao;

	/** The sicee t fabbisogno dao. */
	private SiceeTFabbisognoDao siceeTFabbisognoDao;
	
	/** The sicee t imp riscaldamento acs dao. */
	private SiceeTImpRiscaldamentoAcsDao siceeTImpRiscaldamentoAcsDao;
	
	/** The sicee t rispetto normative dao. */
	private SiceeTRispettoNormativeDao siceeTRispettoNormativeDao;
	
	/** The sicee t altre info dao. */
	private SiceeTAltreInfoDao siceeTAltreInfoDao;

	/** The sicee t dati catast sec dao. */
	private SiceeTDatiCatastSecDao siceeTDatiCatastSecDao;
	
	/** The sicee t ruoli edificio dao. */
	private SiceeTRuoliEdificioDao siceeTRuoliEdificioDao;
	
	/** The sicee d priorita dao. */
	private SiceeDPrioritaDao siceeDPrioritaDao;
	
	/** The sicee t raccomandazioni dao. */
	private SiceeTRaccomandazioniDao siceeTRaccomandazioniDao;
	
	/** The sicee d classe energetica dao. */
	private SiceeDClasseEnergeticaDao siceeDClasseEnergeticaDao;

	/** The sicee d normativa dao. */
	private SiceeDNormativaDao siceeDNormativaDao;

	
	/** The sicee t dati ener 2015 dao. */
	private SiceeTDatiEner2015Dao siceeTDatiEner2015Dao;

	/** The sicee t qta consumi 2015 dao. */
	private SiceeTQtaConsumi2015Dao siceeTQtaConsumi2015Dao;

	/** The sicee t raccomand 2015 dao. */
	private SiceeTRaccomand2015Dao siceeTRaccomand2015Dao;

	/** The sicee d oggetto ape 2015 dao. */
	private SiceeDOggettoApe2015Dao siceeDOggettoApe2015Dao;
	
	/** The sicee d riq ener 2015 dao. */
	private SiceeDRiqEner2015Dao siceeDRiqEner2015Dao;
	
	/** The sicee d unita misura 2015 dao. */
	private SiceeDUnitaMisura2015Dao siceeDUnitaMisura2015Dao;
	
	/** The sicee r comb dener 2015 dao. */
	private SiceeRCombDener2015Dao siceeRCombDener2015Dao;
	
	/** The sicee t rif index 2015 dao. */
	private SiceeTRifIndex2015Dao siceeTRifIndex2015Dao;
	
	/** The sicee t foto 2015 dao. */
	private SiceeTFoto2015Dao siceeTFoto2015Dao;
	
	/** The sicee d dest uso 2015 dao. */
	private SiceeDDestUso2015Dao siceeDDestUso2015Dao;
	
	/** The sicee d tipo impianto dao. */
	private SiceeDTipoImpianto2015Dao siceeDTipoImpianto2015Dao;
	
	/** The sicee d dichiarazione dao. */
	private SiceeDDichiarazioneDao siceeDDichiarazioneDao;
	
	/** The sicee t acta dao. */
	private SiceeTActaDao siceeTActaDao;
	
	/** The certificatore mgr. */
	//private CertificatoreMgr certificatoreMgr;
	

	/** The util mgr. */
	private UtilMgr utilMgr;

	/**
	 * Gets the util mgr.
	 *
	 * @return the util mgr
	 */
	public UtilMgr getUtilMgr() {
		
		return this.utilMgr;
	}

	/**
	 * Sets the util mgr.
	 *
	 * @param utilMgr the new util mgr
	 */
	public void setUtilMgr(UtilMgr utilMgr) {
		this.utilMgr = utilMgr;
	}

	/**
	 * Gets the sicee t certificato dao.
	 *
	 * @return the sicee t certificato dao
	 */
	public SiceeTCertificatoDao getSiceeTCertificatoDao() {
		return this.siceeTCertificatoDao;
	}

	/**
	 * Sets the sicee t certificato dao.
	 *
	 * @param siceeTCertificatoDao the new sicee t certificato dao
	 */
	public void setSiceeTCertificatoDao(
			SiceeTCertificatoDao siceeTCertificatoDao) {
		this.siceeTCertificatoDao = siceeTCertificatoDao;
	}
	
	/**
	 * Gets the sicee t certificato dao.
	 *
	 * @return the sicee t certificato dao
	 */
	public OptimizedSiceeTCerticatoDao getOptimizedSiceeTCerticatoDao() {
		return this.optimizedSiceeTCerticatoDao;
	}

	/**
	 * Sets the sicee t certificato dao.
	 *
	 * @param siceeTCertificatoDao the new sicee t certificato dao
	 */
	public void setOptimizedSiceeTCerticatoDao(
			OptimizedSiceeTCerticatoDao optimizedSiceeTCerticatoDao) {
		this.optimizedSiceeTCerticatoDao = optimizedSiceeTCerticatoDao;
	}
	
	/**
	 * Gets the sicee d stato cert dao.
	 *
	 * @return the sicee d stato cert dao
	 */
	public SiceeDStatoCertDao getSiceeDStatoCertDao() {
		return this.siceeDStatoCertDao;
	}

	/**
	 * Sets the sicee d stato cert dao.
	 *
	 * @param siceeDStatoCertDao the new sicee d stato cert dao
	 */
	public void setSiceeDStatoCertDao(
			SiceeDStatoCertDao siceeDStatoCertDao) {
		this.siceeDStatoCertDao = siceeDStatoCertDao;
	}
	
	
	/**
	 * Gets the sicee d dati ingresso dao.
	 *
	 * @return the sicee d dati ingresso dao
	 */
	public SiceeDDatiIngressoDao getSiceeDDatiIngressoDao() {
		return this.siceeDDatiIngressoDao;
	}

	/**
	 * Sets the sicee d stato cert dao.
	 *
	 * @param siceeDDatiIngressoDao the new sicee d dati ingresso dao
	 */
	public void setSiceeDDatiIngressoDao(
			SiceeDDatiIngressoDao siceeDDatiIngressoDao) {
		this.siceeDDatiIngressoDao = siceeDDatiIngressoDao;
	}

	/**
	 * Gets the sicee d classe efficienza dao.
	 *
	 * @return the sicee d classe efficienza dao
	 */
	public SiceeDClasseEfficienzaDao getSiceeDClasseEfficienzaDao() {
		return this.siceeDClasseEfficienzaDao;
	}

	/**
	 * Sets the sicee d classe efficienza dao.
	 *
	 * @param siceeDClasseEfficienzaDao the new sicee d classe efficienza dao
	 */
	public void setSiceeDClasseEfficienzaDao(
			SiceeDClasseEfficienzaDao siceeDClasseEfficienzaDao) {
		this.siceeDClasseEfficienzaDao = siceeDClasseEfficienzaDao;
	}
	
	
	/**
	 * Gets the sicee d combistibile dao.
	 *
	 * @return the sicee d combistibile dao
	 */
	public SiceeDCombustibileDao getSiceeDCombustibileDao() {
		return this.siceeDCombustibileDao;
	}

	/**
	 * Sets the sicee d combistibile dao.
	 *
	 * @param siceeDCombustibileDao the new sicee d classe combistibile dao
	 */
	public void setSiceeDCombustibileDao(
			SiceeDCombustibileDao siceeDCombustibileDao) {
		this.siceeDCombustibileDao = siceeDCombustibileDao;
	}
	
	/**
	 * Gets the sicee t certificatore dao.
	 *
	 * @return the sicee t certificatore dao
	 */
	public SiceeTCertificatoreDao getSiceeTCertificatoreDao() {
		return this.siceeTCertificatoreDao;
	}

	/**
	 * Sets the sicee t certificatore dao.
	 *
	 * @param siceeTCertificatoreDao the new sicee t certificatore dao
	 */
	public void setSiceeTCertificatoreDao(
			SiceeTCertificatoreDao siceeTCertificatoreDao) {
		this.siceeTCertificatoreDao = siceeTCertificatoreDao;
	}

	/**
	 * Gets the sicee d qualita involucro  dao.
	 *
	 * @return the sicee d qualita involucro  dao
	 */
	public SiceeDQualitaInvolucroDao getSiceeDQualitaInvolucroDao() {
		return this.siceeDQualitaInvolucroDao;
	}

	/**
	 * Sets the sicee d qualita involucro  dao.
	 *
	 * @param siceeDQualitaInvolucroDao the new sicee d qualita involucro  dao
	 */
	public void setSiceeDQualitaInvolucroDao(
			SiceeDQualitaInvolucroDao siceeDQualitaInvolucroDao) {
		this.siceeDQualitaInvolucroDao = siceeDQualitaInvolucroDao;
	}
	
		/**
	 * Gets the sicee t parametri dao.
	 *
	 * @return the sicee t parametri dao
	 */
	public SiceeTParametriDao getSiceeTParametriDao() {
		return this.siceeTParametriDao;
	}

	/**
	 * Sets the sicee t parametri dao.
	 *
	 * @param siceeTParametriDao the new sicee t parametri dao
	 */
	public void setSiceeTParametriDao(SiceeTParametriDao siceeTParametriDao) {
		this.siceeTParametriDao = siceeTParametriDao;
	}

	
	/**
	 * Gets the sicee d dest uso dao.
	 *
	 * @return the sicee d dest uso dao
	 */
	public SiceeDDestUsoDao getSiceeDDestUsoDao() {
		return this.siceeDDestUsoDao;
	}

	/**
	 * Sets the sicee d dest uso dao.
	 *
	 * @param siceeDDestUsoDao the new sicee d dest uso dao
	 */
	public void setSiceeDDestUsoDao(SiceeDDestUsoDao siceeDDestUsoDao) {
		this.siceeDDestUsoDao = siceeDDestUsoDao;
	}
	
	/**
	 * Gets the sicee d tipo edificio dao.
	 *
	 * @return the sicee d tipo edificio dao
	 */
	public SiceeDTipoEdificioDao getSiceeDTipoEdificioDao() {
		return this.siceeDTipoEdificioDao;
	}

	/**
	 * Sets the sicee d tipo edificio dao.
	 *
	 * @param siceeDTipoEdificioDao the new sicee d tipo edificio dao
	 */
	public void setSiceeDTipoEdificioDao(SiceeDTipoEdificioDao siceeDTipoEdificioDao) {
		this.siceeDTipoEdificioDao = siceeDTipoEdificioDao;
	}

	/**
	 * Gets the sicee d tipo motivo rilascio dao.
	 *
	 * @return the sicee d tipo motivo rilascio dao
	 */
	public SiceeDMotivoRilascioDao getSiceeDMotivoRilascioDao() {
		return this.siceeDMotivoRilascioDao;
	}

	/**
	 * Sets the sicee d tipo motivo rilascio dao.
	 *
	 * @param siceeDMotivoRilascioDao the new sicee d tipo motivo rilascio dao
	 */
	public void setSiceeDMotivoRilascioDao(SiceeDMotivoRilascioDao siceeDMotivoRilascioDao) {
		this.siceeDMotivoRilascioDao = siceeDMotivoRilascioDao;
	}

	
	/**
	 * Gets the sicee d tipo impianto dao.
	 *
	 * @return the sicee d tipo impianto dao
	 */
	public SiceeDTipoImpiantoDao getSiceeDTipoImpiantoDao() {
		return this.siceeDTipoImpiantoDao;
	}

	/**
	 * Sets the sicee d tipo impianto dao.
	 *
	 * @param siceeDTipoImpiantoDao the new sicee d tipo impianto dao
	 */
	public void setSiceeDTipoImpiantoDao(SiceeDTipoImpiantoDao siceeDTipoImpiantoDao) {
		this.siceeDTipoImpiantoDao = siceeDTipoImpiantoDao;
	}

	/**
	 * Gets the sicee d caratt edificio dao.
	 *
	 * @return the sicee d caratt edificio dao
	 */
	public SiceeDCarattEdificioDao getSiceeDCarattEdificioDao() {
		return this.siceeDCarattEdificioDao;
	}

	/**
	 * Sets the sicee d caratt edificio dao.
	 *
	 * @param siceeDCarattEdificioDao the new sicee d caratt edificio dao
	 */
	public void setSiceeDCarattEdificioDao(SiceeDCarattEdificioDao siceeDCarattEdificioDao) {
		this.siceeDCarattEdificioDao = siceeDCarattEdificioDao;
	}


	/**
	 * Gets the sicee t sostituzione dao.
	 *
	 * @return the sicee t sostituzione dao
	 */
	public SiceeTSostituzioneDao getSiceeTSostituzioneDao() {
		return this.siceeTSostituzioneDao;
	}

	/**
	 * Sets the sicee t sostituzione dao.
	 *
	 * @param siceeTSostituzioneDao the new sicee t sostituzione dao
	 */
	public void setSiceeTSostituzioneDao(SiceeTSostituzioneDao siceeTSostituzioneDao) {
		this.siceeTSostituzioneDao = siceeTSostituzioneDao;
	}


	/**
	 * Gets the certificatore mgr.
	 *
	 * @return the certificatore mgr
	 */
//	public CertificatoreMgr getCertificatoreMgr() {
//		return this.certificatoreMgr;
//	}

	/**
	 * Sets the certificatore mgr.
	 *
	 * @param certificatoreMgr the new certificatore mgr
	 */
//	public void setCertificatoreMgr(CertificatoreMgr certificatoreMgr) {
//		this.certificatoreMgr = certificatoreMgr;
//	}


	/**
	 * Gets the sicee t classe energetica dao.
	 *
	 * @return the sicee t classe energetica dao
	 */
	public SiceeTClasseEnergeticaDao getSiceeTClasseEnergeticaDao() {
		return this.siceeTClasseEnergeticaDao;
	}

	/**
	 * Sets the sicee t classe energetica dao.
	 *
	 * @param siceeTClasseEnergeticaDao the new sicee t classe energetica dao
	 */
	public void setSiceeTClasseEnergeticaDao(
			SiceeTClasseEnergeticaDao siceeTClasseEnergeticaDao) {
		this.siceeTClasseEnergeticaDao = siceeTClasseEnergeticaDao;
	}
	
	/**
	 * Gets the sicee t consumi edificio dao.
	 *
	 * @return the sicee t consumi edificio dao
	 */
	public SiceeTConsumiEdificioDao getSiceeTConsumiEdificioDao() {
		return this.siceeTConsumiEdificioDao;
	}

	/**
	 * Sets the sicee t consumi edificio dao.
	 *
	 * @param siceeTConsumiEdificioDao the new sicee t consumi edificio dao
	 */
	public void setSiceeTConsumiEdificioDao(
			SiceeTConsumiEdificioDao siceeTConsumiEdificioDao) {
		this.siceeTConsumiEdificioDao = siceeTConsumiEdificioDao;
	}

	/**
	 * Gets the sicee t dati generali dao.
	 *
	 * @return the sicee t dati generali dao
	 */
	public SiceeTDatiGeneraliDao getSiceeTDatiGeneraliDao() {
		return this.siceeTDatiGeneraliDao;
	}

	/**
	 * Sets the sicee t dati generali dao.
	 *
	 * @param siceeTDatiGeneraliDao the new sicee t dati generali dao
	 */
	public void setSiceeTDatiGeneraliDao(SiceeTDatiGeneraliDao siceeTDatiGeneraliDao) {
		this.siceeTDatiGeneraliDao = siceeTDatiGeneraliDao;
	}

	/**
	 * Gets the sicee t energia sopr ingr dao.
	 *
	 * @return the sicee t energia sopr ingr dao
	 */
	public SiceeTEnergiaSoprIngrDao getSiceeTEnergiaSoprIngrDao() {
		return this.siceeTEnergiaSoprIngrDao;
	}

	/**
	 * Sets the sicee t energia sopr ingr dao.
	 *
	 * @param siceeTEnergiaSoprIngrDao the new sicee t energia sopr ingr dao
	 */
	public void setSiceeTEnergiaSoprIngrDao(
			SiceeTEnergiaSoprIngrDao siceeTEnergiaSoprIngrDao) {
		this.siceeTEnergiaSoprIngrDao = siceeTEnergiaSoprIngrDao;
	}

	/**
	 * Gets the sicee t fabbisogno dao.
	 *
	 * @return the sicee t fabbisogno dao
	 */
	public SiceeTFabbisognoDao getSiceeTFabbisognoDao() {
		return this.siceeTFabbisognoDao;
	}

	/**
	 * Sets the sicee t fabbisogno dao.
	 *
	 * @param siceeTFabbisognoDao the new sicee t fabbisogno dao
	 */
	public void setSiceeTFabbisognoDao(SiceeTFabbisognoDao siceeTFabbisognoDao) {
		this.siceeTFabbisognoDao = siceeTFabbisognoDao;
	}

	/**
	 * Gets the sicee t imp riscaldamento acs dao.
	 *
	 * @return the sicee t imp riscaldamento acs dao
	 */
	public SiceeTImpRiscaldamentoAcsDao getSiceeTImpRiscaldamentoAcsDao() {
		return this.siceeTImpRiscaldamentoAcsDao;
	}

	/**
	 * Sets the sicee t imp riscaldamento acs dao.
	 *
	 * @param siceeTImpRiscaldamentoAcsDao the new sicee t imp riscaldamento acs dao
	 */
	public void setSiceeTImpRiscaldamentoAcsDao(
			SiceeTImpRiscaldamentoAcsDao siceeTImpRiscaldamentoAcsDao) {
		this.siceeTImpRiscaldamentoAcsDao = siceeTImpRiscaldamentoAcsDao;
	}

	/**
	 * Gets the sicee t rispetto normative dao.
	 *
	 * @return the sicee t rispetto normative dao
	 */
	public SiceeTRispettoNormativeDao getSiceeTRispettoNormativeDao() {
		return this.siceeTRispettoNormativeDao;
	}

	/**
	 * Sets the sicee t rispetto normative dao.
	 *
	 * @param siceeTRispettoNormativeDao the new sicee t rispetto normative dao
	 */
	public void setSiceeTRispettoNormativeDao(
			SiceeTRispettoNormativeDao siceeTRispettoNormativeDao) {
		this.siceeTRispettoNormativeDao = siceeTRispettoNormativeDao;
	}

	/**
	 * Gets the sicee t altre info dao.
	 *
	 * @return the sicee t altre info dao
	 */
	public SiceeTAltreInfoDao getSiceeTAltreInfoDao() {
		return this.siceeTAltreInfoDao;
	}

	/**
	 * Sets the sicee t altre info dao.
	 *
	 * @param siceeTAltreInfoDao the new sicee t altre info dao
	 */
	public void setSiceeTAltreInfoDao(SiceeTAltreInfoDao siceeTAltreInfoDao) {
		this.siceeTAltreInfoDao = siceeTAltreInfoDao;
	}

	/**
	 * Gets the sicee t dati catast sec dao.
	 *
	 * @return the sicee t dati catast sec dao
	 */
	public SiceeTDatiCatastSecDao getSiceeTDatiCatastSecDao() {
		return this.siceeTDatiCatastSecDao;
	}

	/**
	 * Sets the sicee t dati catast sec dao.
	 *
	 * @param siceeTDatiCatastSecDao the new sicee t dati catast sec dao
	 */
	public void setSiceeTDatiCatastSecDao(SiceeTDatiCatastSecDao siceeTDatiCatastSecDao) {
		this.siceeTDatiCatastSecDao = siceeTDatiCatastSecDao;
	}

	/**
	 * Gets the sicee t ruoli edificio dao.
	 *
	 * @return the sicee t ruoli edificio dao
	 */
	public SiceeTRuoliEdificioDao getSiceeTRuoliEdificioDao() {
		return this.siceeTRuoliEdificioDao;
	}

	/**
	 * Sets the sicee t ruoli edificio dao.
	 *
	 * @param siceeTRuoliEdificioDao the new sicee t ruoli edificio dao
	 */
	public void setSiceeTRuoliEdificioDao(
			SiceeTRuoliEdificioDao siceeTRuoliEdificioDao) {
		this.siceeTRuoliEdificioDao = siceeTRuoliEdificioDao;
	}
	
	/**
	 * Gets the sicee d priorita dao.
	 *
	 * @return the sicee d priorita dao
	 */
	public SiceeDPrioritaDao getSiceeDPrioritaDao() {
		return this.siceeDPrioritaDao;
	}

	/**
	 * Sets the sicee d priorita dao.
	 *
	 * @param siceeDPrioritaDao the new sicee d priorita dao
	 */
	public void setSiceeDPrioritaDao(SiceeDPrioritaDao siceeDPrioritaDao) {
		this.siceeDPrioritaDao = siceeDPrioritaDao;
	}

	/**
	 * Gets the sicee t raccomandazioni dao.
	 *
	 * @return the sicee t raccomandazioni dao
	 */
	public SiceeTRaccomandazioniDao getSiceeTRaccomandazioniDao() {
		return this.siceeTRaccomandazioniDao;
	}

	/**
	 * Sets the sicee t raccomandazioni dao.
	 *
	 * @param siceeTRaccomandazioniDao the new sicee t raccomandazioni dao
	 */
	public void setSiceeTRaccomandazioniDao(
			SiceeTRaccomandazioniDao siceeTRaccomandazioniDao) {
		this.siceeTRaccomandazioniDao = siceeTRaccomandazioniDao;
	}

	/**
	 * Gets the sicee d classe energetica dao.
	 *
	 * @return the sicee d classe energetica dao
	 */
	public SiceeDClasseEnergeticaDao getSiceeDClasseEnergeticaDao() {
		return this.siceeDClasseEnergeticaDao;
	}

	/**
	 * Sets the sicee d classe energetica dao.
	 *
	 * @param siceeDClasseEnergeticaDao the new sicee d classe energetica dao
	 */
	public void setSiceeDClasseEnergeticaDao(
			SiceeDClasseEnergeticaDao siceeDClasseEnergeticaDao) {
		this.siceeDClasseEnergeticaDao = siceeDClasseEnergeticaDao;
	}

	/**
	 * Gets the sicee d normativa dao.
	 *
	 * @return the sicee d normativa dao
	 */
	public SiceeDNormativaDao getSiceeDNormativaDao() {
		return this.siceeDNormativaDao;
	}

	/**
	 * Sets the sicee d normativa dao.
	 *
	 * @param siceeDNormativaDao the new sicee d normativa dao
	 */
	public void setSiceeDNormativaDao(SiceeDNormativaDao siceeDNormativaDao) {
		this.siceeDNormativaDao = siceeDNormativaDao;
	}

	
	/**
	 * Gets the sicee t dati ener 2015 dao.
	 *
	 * @return the sicee t dati ener 2015 dao
	 */
	public SiceeTDatiEner2015Dao getSiceeTDatiEner2015Dao() {
		return this.siceeTDatiEner2015Dao;
	}

	/**
	 * Sets the sicee t dati ener 2015 dao.
	 *
	 * @param siceeTDatiEner2015Dao the new sicee t dati ener 2015 dao
	 */
	public void setSiceeTDatiEner2015Dao(SiceeTDatiEner2015Dao siceeTDatiEner2015Dao) {
		this.siceeTDatiEner2015Dao = siceeTDatiEner2015Dao;
	}

	
	/**
	 * Gets the sicee t qta consumi 2015 dao.
	 *
	 * @return the sicee t qta consumi 2015 dao
	 */
	public SiceeTQtaConsumi2015Dao getSiceeTQtaConsumi2015Dao() {
		return this.siceeTQtaConsumi2015Dao;
	}

	/**
	 * Sets the sicee t qta consumi 2015 dao.
	 *
	 * @param siceeTQtaConsumi2015Dao the new sicee t qta consumi 2015 dao
	 */
	public void setSiceeTQtaConsumi2015Dao(SiceeTQtaConsumi2015Dao siceeTQtaConsumi2015Dao) {
		this.siceeTQtaConsumi2015Dao = siceeTQtaConsumi2015Dao;
	}
	
	
	/**
	 * Gets the sicee t raccomand 2015 dao.
	 *
	 * @return the sicee t raccomand 2015 dao
	 */
	public SiceeTRaccomand2015Dao getSiceeTRaccomand2015Dao() {
		return this.siceeTRaccomand2015Dao;
	}

	/**
	 * Sets the sicee t raccomand 2015 dao.
	 *
	 * @param siceeTRaccomand2015Dao the new sicee t raccomand 2015 dao
	 */
	public void setSiceeTRaccomand2015Dao(SiceeTRaccomand2015Dao siceeTRaccomand2015Dao) {
		this.siceeTRaccomand2015Dao = siceeTRaccomand2015Dao;
	}
	

	/**
	 * Gets the sicee d oggetto ape 2015 dao.
	 *
	 * @return the sicee d oggetto ape 2015 dao
	 */
	public SiceeDOggettoApe2015Dao getSiceeDOggettoApe2015Dao() {
		return this.siceeDOggettoApe2015Dao;
	}

	/**
	 * Sets the sicee d oggetto ape 2015 dao.
	 *
	 * @param siceeDOggettoApe2015Dato the new sicee d oggetto ape 2015 dao
	 */
	public void setSiceeDOggettoApe2015Dao(SiceeDOggettoApe2015Dao siceeDOggettoApe2015Dao) {
		this.siceeDOggettoApe2015Dao = siceeDOggettoApe2015Dao;
	}
	
	
	/**
	 * Gets the sicee d riq ener 2015 dao.
	 *
	 * @return the sicee d riq ener 2015 dao
	 */
	public SiceeDRiqEner2015Dao getSiceeDRiqEner2015Dao() {
		return this.siceeDRiqEner2015Dao;
	}

	/**
	 * Sets the sicee d riq ener 2015 dao.
	 *
	 * @param siceeDRiqEner2015Dao the new sicee d riq ener 2015 dao
	 */
	public void setSiceeDRiqEner2015Dao(SiceeDRiqEner2015Dao siceeDRiqEner2015Dao) {
		this.siceeDRiqEner2015Dao = siceeDRiqEner2015Dao;
	}
	
	/**
	 * Gets the sicee d unita misura 2015 dao.
	 *
	 * @return the sicee d unita misura 2015 dao
	 */
	public SiceeDUnitaMisura2015Dao getSiceeDUnitaMisura2015Dao() {
		return this.siceeDUnitaMisura2015Dao;
	}

	/**
	 * Sets the sicee d unita misura 2015 dao.
	 *
	 * @param siceeDUnitaMisura2015Dao the new sicee d unita misura 2015 dao
	 */
	public void setSiceeDUnitaMisura2015Dao(SiceeDUnitaMisura2015Dao siceeDUnitaMisura2015Dao) {
		this.siceeDUnitaMisura2015Dao = siceeDUnitaMisura2015Dao;
	}
	
	/**
	 * Gets the sicee r comb dener 2015 dao.
	 *
	 * @return the sicee r comb dener 2015 dao
	 */
	public SiceeRCombDener2015Dao getSiceeRCombDener2015Dao() {
		return this.siceeRCombDener2015Dao;
	}

	/**
	 * Sets the sicee r comb dener 2015 dao.
	 *
	 * @param siceeRCombDener2015Dao the new sicee r comb dener 2015 dao
	 */
	public void setSiceeRCombDener2015Dao(SiceeRCombDener2015Dao siceeRCombDener2015Dao) {
		this.siceeRCombDener2015Dao = siceeRCombDener2015Dao;
	}
	
	/**
	 * Gets the sicee t rif index 2015 dao.
	 *
	 * @return the sicee t rif index 2015 dao
	 */
	public SiceeTRifIndex2015Dao getSiceeTRifIndex2015Dao() {
		return this.siceeTRifIndex2015Dao;
	}

	/**
	 * Sets the sicee t rif index 2015 dao.
	 *
	 * @param siceeTRifIndex2015Dao the new sicee t rif index 2015 dao
	 */
	public void setSiceeTRifIndex2015Dao(SiceeTRifIndex2015Dao siceeTRifIndex2015Dao) {
		this.siceeTRifIndex2015Dao = siceeTRifIndex2015Dao;
	}
	
	/**
	 * Gets the sicee t foto 2015 dao.
	 *
	 * @return the sicee t foto 2015 dao
	 */
	public SiceeTFoto2015Dao getSiceeTFoto2015Dao() {
		return this.siceeTFoto2015Dao;
	}

	/**
	 * Sets the sicee t foto 2015 dao.
	 *
	 * @param siceeTFoto2015Dao the new sicee t foto 2015 dao
	 */
	public void setSiceeTFoto2015Dao(SiceeTFoto2015Dao siceeTFoto2015Dao) {
		this.siceeTFoto2015Dao = siceeTFoto2015Dao;
	}
	
	/**
	 * Gets the sicee d dest uso 2015 dao.
	 *
	 * @return the sicee d dest uso 2015 dao
	 */
	public SiceeDDestUso2015Dao getSiceeDDestUso2015Dao() {
		return this.siceeDDestUso2015Dao;
	}

	/**
	 * Sets the sicee d dest uso 2015 dao.
	 *
	 * @param siceeTFoto2015Dao the new sicee d dest uso 2015 dao
	 */
	public void setSiceeDDestUso2015Dao(SiceeDDestUso2015Dao siceeDDestUso2015Dao) {
		this.siceeDDestUso2015Dao = siceeDDestUso2015Dao;
	}
	
	private SiceeDProprietaEdif2015Dao siceeDProprietaEdif2015Dao;
	
	public SiceeDProprietaEdif2015Dao getSiceeDProprietaEdif2015Dao() {
		return this.siceeDProprietaEdif2015Dao;
	}
	public void setSiceeDProprietaEdif2015Dao(SiceeDProprietaEdif2015Dao siceeDProprietaEdif2015Dao) {
		this.siceeDProprietaEdif2015Dao = siceeDProprietaEdif2015Dao;
	}

	private SiceeDTipoRistrutt2015Dao siceeDTipoRistrutt2015Dao;
	
	public SiceeDTipoRistrutt2015Dao getSiceeDTipoRistrutt2015Dao() {
		return this.siceeDTipoRistrutt2015Dao;
	}
	public void setSiceeDTipoRistrutt2015Dao(SiceeDTipoRistrutt2015Dao siceeDTipoRistrutt2015Dao) {
		this.siceeDTipoRistrutt2015Dao = siceeDTipoRistrutt2015Dao;
	}

	private SiceeDTipolEdilizia2015Dao siceeDTipolEdilizia2015Dao;
	
	public SiceeDTipolEdilizia2015Dao getSiceeDTipolEdilizia2015Dao() {
		return this.siceeDTipolEdilizia2015Dao;
	}
	public void setSiceeDTipolEdilizia2015Dao(SiceeDTipolEdilizia2015Dao siceeDTipolEdilizia2015Dao) {
		this.siceeDTipolEdilizia2015Dao = siceeDTipolEdilizia2015Dao;
	}

	private SiceeDTipolCostrutt2015Dao siceeDTipolCostrutt2015Dao;
	
	public SiceeDTipolCostrutt2015Dao getSiceeDTipolCostrutt2015Dao() {
		return this.siceeDTipolCostrutt2015Dao;
	}
	public void setSiceeDTipolCostrutt2015Dao(SiceeDTipolCostrutt2015Dao siceeDTipolCostrutt2015Dao) {
		this.siceeDTipolCostrutt2015Dao = siceeDTipolCostrutt2015Dao;
	}

	private SiceeRCertifServener2015Dao siceeRCertifServener2015Dao;

	public SiceeRCertifServener2015Dao getSiceeRCertifServener2015Dao() {
		return this.siceeRCertifServener2015Dao;
	}
	public void setSiceeRCertifServener2015Dao(SiceeRCertifServener2015Dao siceeRCertifServener2015Dao) {
		this.siceeRCertifServener2015Dao = siceeRCertifServener2015Dao;
	}

	private SiceeDServEner2015Dao siceeDServEner2015Dao;

	public SiceeDServEner2015Dao getSiceeDServEner2015Dao() {
		return this.siceeDServEner2015Dao;
	}
	public void setSiceeDServEner2015Dao(SiceeDServEner2015Dao siceeDServEner2015Dao) {
		this.siceeDServEner2015Dao = siceeDServEner2015Dao;
	}

	private SiceeTDetImp2015Dao siceeTDetImp2015Dao;

	public SiceeTDetImp2015Dao getSiceeTDetImp2015Dao() {
		return this.siceeTDetImp2015Dao;
	}
	public void setSiceeTDetImp2015Dao(SiceeTDetImp2015Dao siceeTDetImp2015Dao) {
		this.siceeTDetImp2015Dao = siceeTDetImp2015Dao;
	}

	private SiceeTAziendaDao siceeTAziendaDao;

	public SiceeTAziendaDao getSiceeTAziendaDao() {
		return this.siceeTAziendaDao;
	}
	public void setSiceeTAziendaDao(SiceeTAziendaDao siceeTAziendaDao) {
		this.siceeTAziendaDao = siceeTAziendaDao;
	}

	private SiceeDIstruzioneDao siceeDIstruzioneDao;

	public SiceeDIstruzioneDao getSiceeDIstruzioneDao() {
		return this.siceeDIstruzioneDao;
	}
	public void setSiceeDIstruzioneDao(SiceeDIstruzioneDao siceeDIstruzioneDao) {
		this.siceeDIstruzioneDao = siceeDIstruzioneDao;
	}

	
	/**
	 * Gets the sicee d tipo impianto 2015 dao.
	 *
	 * @return the sicee d tipo impianto 2015 dao
	 */
	public SiceeDTipoImpianto2015Dao getSiceeDTipoImpianto2015Dao() {
		return this.siceeDTipoImpianto2015Dao;
	}

	/**
	 * Sets the sicee d tipo impianto 2015 dao.
	 *
	 * @param siceeDTipoImpianto2015Dao the new sicee d tipo impianto 2015 dao
	 */
	public void setSiceeDTipoImpianto2015Dao(
			SiceeDTipoImpianto2015Dao siceeDTipoImpianto2015Dao) {
		this.siceeDTipoImpianto2015Dao = siceeDTipoImpianto2015Dao;
	}
	
	/**
	 * Gets the sicee d dichiarazione dao.
	 *
	 * @return the sicee d dichiarazione dao
	 */
	public SiceeDDichiarazioneDao getSiceeDDichiarazioneDao() {
		return this.siceeDDichiarazioneDao;
	}

	/**
	 * Sets the sicee d dichiarazione dao.
	 *
	 * @param siceeDDichiarazioneDao the new sicee d dichiarazione dao
	 */
	public void setSiceeDDichiarazioneDao(
			SiceeDDichiarazioneDao siceeDDichiarazioneDao) {
		this.siceeDDichiarazioneDao = siceeDDichiarazioneDao;
	}
	
	/**
	 * Gets the sicee t acta dao.
	 *
	 * @return the sicee t acta dao
	 */
	public SiceeTActaDao getSiceeTActaDao() {
		return this.siceeTActaDao;
	}

	/**
	 * Sets the sicee t acta dao.
	 *
	 * @param siceeTActaDao the new sicee t acta dao
	 */
	public void setSiceeTActaDao(
			SiceeTActaDao siceeTActaDao) {
		this.siceeTActaDao = siceeTActaDao;
	}
	
	/**
	 * Find ace.
	 *
	 * @param filtro the filtro
	 * @return the ace
	 * @throws SiceesrvException the siceesrv exception
	 */
	/*
	public Ace findAce(FiltroRicercaAce filtro) throws SiceesrvException {
		log.debug("[CertificatoMgr::findAce] - START");
		Ace ace = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					if (cert != null ) {
						
						//SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(idStato);
						
						
						ace = convertToAce(getSiceeTCertificatoDao().findByPrimaryKeyAndFkStato(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno()), cert);

						if (ace != null)
						{
							SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(ace.getIdStato());
							ace.setDescStato(stato.getDescr());
						}
					}
				}
			}
		} catch (SiceeTCertificatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} 
		catch (SiceeDStatoCertDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findAce] - END");
		}
		
		return ace;
	}
	*/
	
	/**
	 * Find ace.
	 *
	 * @param filtro the filtro
	 * @return the ace
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Ace findAceFlgPregresso(FiltroRicercaAce filtro, boolean flgPregresso) throws SiceesrvException {
		log.debug("[CertificatoMgr::findAceFlgPregresso] - START");
		Ace ace = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					if (cert != null ) {
						
						String dataPregresso = null;
						if (flgPregresso) {
							SiceeTParametri paramDatapregresso = this
									.getSiceeTParametriDao().findWhereCodiceEquals(
											DATA_INIZIO_SOSTITUZIONE);
							if (verifyParam(paramDatapregresso,
									DATA_INIZIO_SOSTITUZIONE)) {
								dataPregresso = paramDatapregresso.getValore();

							}
						}
						
						List<OptimizedSiceeTCerticato> elencoAce = getOptimizedSiceeTCerticatoDao().executeByCodice(cert.getIdCertificatore(), filtro, new Long(param.getValore()), dataPregresso);
						
						if (elencoAce != null && elencoAce.size() > 0)
						{
							ace = convertToAce(elencoAce.get(0)); // Sicuramente avrà trovato un solo elemento
						}
						
					}
				}
			}
		} catch (OptimizedSiceeTCerticatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} 
		catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findAceFlgPregresso] - END");
		}
		
		return ace;
	}
	/**
	 * Find ace.
	 *
	 * @param filtro the filtro
	 * @return the ace
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Ace[] findAceFiltro(FiltroRicercaAce filtro, String idCertificatore, boolean flgPregresso, boolean flgSostituzione, boolean flgIgnoraMinIdCert) throws SiceesrvException {
		log.debug("[CertificatoMgr::findAceFiltro] - START");
		Ace[] ace = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				//if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					//SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					//if (cert != null ) {
						
						//SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(idStato);
						
				
						String dataPregresso = null;
						if (flgPregresso) {
							SiceeTParametri paramDatapregresso = this
									.getSiceeTParametriDao().findWhereCodiceEquals(
											DATA_INIZIO_SOSTITUZIONE);
							if (verifyParam(paramDatapregresso,
									DATA_INIZIO_SOSTITUZIONE)) {
								dataPregresso = paramDatapregresso.getValore();
		
							}
						}
				
				
						List<OptimizedSiceeTCerticato> elencoAce = getOptimizedSiceeTCerticatoDao().executeByParametri(idCertificatore, filtro, flgIgnoraMinIdCert?null:new Long(param.getValore()), dataPregresso, flgSostituzione);
						
						ArrayList<Ace> arrayList = new ArrayList<Ace>();
						Ace aceNew = null;
						for (OptimizedSiceeTCerticato optimizedSiceeTCerticato : elencoAce) 
						{
							aceNew = convertToAce(optimizedSiceeTCerticato);
							arrayList.add(aceNew);
						}
						//ace = convertToAce(getSiceeTCertificatoDao().findByPrimaryKeyAndFkStato(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno()), cert);

						 /*
						if (ace != null)
						{
							SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(ace.getIdStato());
							ace.setDescStato(stato.getDescr());
						}
						*/
						 
						ace = new Ace[arrayList.size()];
						arrayList.toArray(ace);
					//}
				//}
			}
		} catch (OptimizedSiceeTCerticatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findAceFiltro] - END");
		}
		
		return ace;
	}

	/**
	 * Find ace.
	 *
	 * @param filtro the filtro
	 * @return the ace
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Integer findAceFiltroCount(FiltroRicercaAce filtro, String idCertificatore, boolean flgPregresso, boolean flgSostituzione) throws SiceesrvException {
		log.debug("[CertificatoMgr::findAceFiltroCount] - START");
		Integer countAce = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				
				String dataPregresso = null;
				if (flgPregresso) {
					SiceeTParametri paramDatapregresso = this
							.getSiceeTParametriDao().findWhereCodiceEquals(
									DATA_INIZIO_SOSTITUZIONE);
					if (verifyParam(paramDatapregresso,
							DATA_INIZIO_SOSTITUZIONE)) {
						dataPregresso = paramDatapregresso.getValore();

					}
				}
				
				//if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					//SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					//if (cert != null ) {
						
						//SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(idStato);
						
						countAce = getOptimizedSiceeTCerticatoDao().executeByParametriCount(idCertificatore, filtro, new Long(param.getValore()), dataPregresso);
						
						
					//}
				//}
			}
		} catch (OptimizedSiceeTCerticatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findAceFiltroCount] - END");
		}
		
		return countAce;
	}
	
	/**
	 * Find ace sostitutivi.
	 *
	 * @param filtro the filtro
	 * @return the ace[]
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Ace[] findAceSostitutivi(FiltroRicercaAce filtro) throws SiceesrvException {
		log.debug("[CertificatoMgr::findAceSostitutivi] - START");
		Ace[] ace = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					if (cert != null ) {
						
						List<SiceeTSostituzione> sostituzioniAce = getSiceeTSostituzioneDao().findWhereAceOldEquals(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno());
						
						ArrayList<Ace> arrayList = new ArrayList<Ace>();
						
						for (int i = 0; i < sostituzioniAce.size(); i++) {
							
							SiceeTSostituzione sost = sostituzioniAce.get(i);
							
							Ace aceNew = new Ace();
							aceNew.setAnno(sost.getAnnoNew());
							aceNew.setNumero(sost.getProgrCertificatoNew());
							
							cert = getSiceeTCertificatoreDao().findByPrimaryKey(sost.getIdCertificatoreNew());
							aceNew.setCertificatore(cert.getNumCertificatore());

							SiceeTCertificato aceSostitutivoNew = getSiceeTCertificatoDao().findByPrimaryKey(sost.getIdCertificatoreNew(), sost.getProgrCertificatoNew(), sost.getAnnoNew());
							
							SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(aceSostitutivoNew.getFkStato());
							
							aceNew.setDescStato(stato.getDescr());
							
							arrayList.add(aceNew);
						}
						

						ace = new Ace[arrayList.size()];
						arrayList.toArray(ace);
						
						//SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(idStato);
						//ace = convertToAce(getSiceeTCertificatoDao().findByPrimaryKeyAndFkStato(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno()), cert);
					}
				}
			}
		} 
		catch (SiceeTSostituzioneDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeDStatoCertDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findAceSostitutivi] - END");
		}
		
		return ace;
	}

	/**
	 * Find ace sostituiti.
	 *
	 * @param filtro the filtro
	 * @return the ace[]
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Ace[] findAceSostituiti(FiltroRicercaAce filtro) throws SiceesrvException {
		log.debug("[CertificatoMgr::findAceSostituiti] - START");
		Ace[] ace = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					if (cert != null ) {
						
						List<SiceeTSostituzione> sostituzioniAce = getSiceeTSostituzioneDao().findWhereAceNewEquals(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno());
						
						ArrayList<Ace> arrayList = new ArrayList<Ace>();
						
						for (int i = 0; i < sostituzioniAce.size(); i++) {
							
							SiceeTSostituzione sost = sostituzioniAce.get(i);
							
							Ace aceOld = new Ace();
							aceOld.setAnno(sost.getAnnoOld());
							aceOld.setNumero(sost.getProgrCertificatoOld());
							
							cert = getSiceeTCertificatoreDao().findByPrimaryKey(sost.getIdCertificatoreOld());
							aceOld.setCertificatore(cert.getNumCertificatore());

							SiceeTCertificato aceSostitutivoOld = getSiceeTCertificatoDao().findByPrimaryKey(sost.getIdCertificatoreOld(), sost.getProgrCertificatoOld(), sost.getAnnoOld());
							
							if (aceSostitutivoOld.getFkMotivoSost() != null)
							{
								aceOld.setIdMotivoSost(aceSostitutivoOld.getFkMotivoSost());
							}
							
							SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(aceSostitutivoOld.getFkStato());
							
							aceOld.setDescStato(stato.getDescr());
							
							arrayList.add(aceOld);
						}
						

						ace = new Ace[arrayList.size()];
						arrayList.toArray(ace);
						
						//SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(idStato);
						//ace = convertToAce(getSiceeTCertificatoDao().findByPrimaryKeyAndFkStato(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno()), cert);
					}
				}
			}
		} 
		catch (SiceeTSostituzioneDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeDStatoCertDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findAceSostituiti] - END");
		}
		
		return ace;
	}
	
	/**
	 * Find uid foto ace.
	 *
	 * @param filtro the filtro
	 * @return the string
	 * @throws SiceesrvException the siceesrv exception
	 */
	public String findUidFotoAce(FiltroRicercaAce filtro) throws SiceesrvException {
		log.debug("[CertificatoMgr::findUidFotoAce] - START");
		String uidFoto = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				//if (new Long(filtro.getCertificatore().substring(1)) > new Long(param.getValore())) {
					SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(filtro.getCertificatore());
					if (cert != null ) {
						
						//SiceeDStatoCert stato = getSiceeDStatoCertDao().findByPrimaryKey(idStato);
						
						
						SiceeTCertificato certificato = getSiceeTCertificatoDao().findByPrimaryKey(cert.getIdCertificatore(), filtro.getNumero(), filtro.getAnno());
						
						if (certificato != null)
						{
							uidFoto = certificato.getIdentificFoto();
						}
					}
				//}
			}
		} catch (SiceeTCertificatoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::findUidFotoAce] - END");
		}
		
		return uidFoto;
	}
	
	/**
	 * Compila certificato per stampa.
	 *
	 * @param numCertificatore the num certificatore
	 * @param progrCertificato the progr certificato
	 * @param annoCertificato the anno certificato
	 * @return the ace dto
	 * @throws SiceesrvException the siceesrv exception
	 */
	public AceDto compilaCertificatoPerStampa(String numCertificatore, String progrCertificato, String annoCertificato) throws SiceesrvException {
		log.debug("[CertificatoMgr::compilaCertificatoPerStampa] - START");
		AceDto dto = new AceDto();
		try {
	//String[] split = numeroCertificato.split(" ");

		SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(numCertificatore);

		DatiAttestato att = recuperaAttestato(cert.getIdCertificatore(), progrCertificato, annoCertificato);
		//att.setNumeroAttestato(att.getNumeroAttestato());

		ArrayList<Raccomandazione> arrayList = (ArrayList<Raccomandazione>) recuperaRaccomandazioni(cert.getIdCertificatore(), progrCertificato, annoCertificato);

		DtAnagImmobile anagImmobile = att.getDatiAnagraficiImm();
		DtCatastali cat = att.getDatiAnagraficiImm().getDtCatastali();
		DtResponsabili rp = att.getDatiAnagraficiImm().getDtResponsabili();
		DtTecniciGen tg = att.getDatiTecnici();
		DtImpRiscald impRisc = att.getImpianti().getRiscaldamento();
		DtImpAcqua impAcqua = att.getImpianti().getAcqua();
		DtIndiciFabbisogno fab = att.getIndFabbisogno();
		DtLocTeorica teo = att.getClasseEnerg().getLocTeorica();
		DtLocReale rea = att.getClasseEnerg().getLocReale();
		DtEnergiaFontiRinnov efr = att.getEnergRinnov();
		DtGasSerra gs = att.getGasSerra();
		DtAIEnergetiche aien = att.getAltreInfo().getEnergetiche();
		DtAIGenerali aieg = att.getAltreInfo().getGenerali();
		DtRispettoNorme rn = att.getRispNorme();
		DtDichiarazFinale df = att.getDichiarazioni();
		DtImpianti impianti = att.getImpianti();
		DtAltreInfo ai = att.getAltreInfo();

		String unitaDiMisura = "";

		if (getUtilMgr().isEdificio(tg.getDestUso())) {
			unitaDiMisura = " kWh/m2";
		} else {
			unitaDiMisura = " kWh/m3";
		}


		dto.setComune(cat.getDescrComune());
		if (!isNullOrEmpty(cat.getNumCiv())) {
			dto.setIndirizzo(cat.getDescrIndirizzo() + ", " + cat.getNumCiv());
		} else {
			dto.setIndirizzo(cat.getDescrIndirizzo());
		}
		if (!isNullOrEmpty(cat.getSezione())){
			dto.setDatiCatSez(cat.getSezione());
		}
		dto.setDatiCatF(cat.getFoglio());                      
		dto.setDatiCatN(cat.getParticella());  
		if (!isNullOrEmpty(cat.getSubalterno())){
			dto.setDatiCatSub(cat.getSubalterno());
		}
		dto.setPianoN(convertToString(cat.getPiano()));
		dto.setPianoDi(convertToString(cat.getPianiTot()));



		if (!isNullOrEmpty(rp.getDtProgettista().getNome()))
			dto.setProgettista(rp.getDtProgettista().getNome() + " " + rp.getDtProgettista().getCognome());
		if (!isNullOrEmpty(rp.getDtDirLavori().getNome()))
			dto.setDirettoreLavori(rp.getDtDirLavori().getNome() + " " + rp.getDtDirLavori().getCognome());
		if (!isNullOrEmpty(rp.getDtCostruttore().getNome()))
			dto.setCostruttore(rp.getDtCostruttore().getNome() + " " + rp.getDtCostruttore().getCognome());                   
		dto.setDestinazioneUso(getUtilMgr().getSiglaDestinazioneDuso(tg.getDestUso()));
		if (isNullOrEmpty(tg.getAnnoUltimaRistrutt())) {
			dto.setAnnoCostruzione(tg.getAnnoCostr());
		} else {
			dto.setAnnoCostruzione(tg.getAnnoCostr() + " / " + tg.getAnnoUltimaRistrutt());
		}
		dto.setDescrizioneEdificio(tg.getDescrizioneEdificio());             
		dto.setVolumeLordoRiscaldato(parseNumberForPrint(tg.getVolLordoRiscald()));         
		dto.setSuperfDispTotale(parseNumberForPrint(tg.getSupDispTot()));              
		dto.setFattoreForma(parseNumberForPrint(tg.getFattoreForma()));                  
		dto.setTrasmMedSupOp(parseNumberForPrint(tg.getTrasmittanzaOpache()));                 
		dto.setTrasmMedSupTrasp(parseNumberForPrint(tg.getTrasmittanzaTrasp()));              
		dto.setTipolImpRisc(getUtilMgr().getDescrizioneTipoImpianto(impianti.getTipoImpianto()));
		if (!isNullOrEmpty(impRisc.getCombustibileFossile()))
			dto.setCombustibileRisc(getUtilMgr().getDescrizioneComustibileFossile(impRisc.getCombustibileFossile()));
		if (!isNullOrEmpty(impAcqua.getCombustibileFossile()))
			dto.setCombustibileAcquaCaldaSan(getUtilMgr().getDescrizioneComustibileFossile(impAcqua.getCombustibileFossile())); 

		dto.setQh(parseNumberForPrint(fab.getDomEnergRiscald())+ unitaDiMisura);                            
		dto.setLimiteLegge(proporzioneQh(fab.getLimNormRegione().floatValue()));
		dto.setLimiteDiLegge(parseNumberForPrint(fab.getLimNormRegione()) + unitaDiMisura);

		dto.setQhW(parseNumberForPrint(fab.getIndPrestEnergAcqua()) + unitaDiMisura);
		dto.setQuozienteQhw(proporzioneFabbisognoEnergeticoAcs(fab.getIndPrestEnergAcqua().floatValue()) ); //corrisponde a Indice prestazione energetica acs
		dto.setQuozienteQh(proporzioneQh(fab.getDomEnergRiscald().floatValue()));

		//dto.setIndicePrestEnGlob(parseNumberForPrint(teo.getIndPrestEnergGlob()) + unitaDiMisura);
		dto.setIndicePrestazioneEnergeticaGlobale(parseNumberForPrint(rea.getIndPrestEnergGlob()) + unitaDiMisura);
		
		// Format a 2 decimali!!!!!!
		dto.setQuotaEnCopFRin(parseNumberForPrint(efr.getPercEnergiaFontiRinnov()));                
		dto.setClasseEnergetica(getUtilMgr().getDescrizioneClasseEnergetica(teo.getClasseEnerg()));
		dto.setClasseEnergeticaLinea(getUtilMgr().getClasseEnergeticaPerValore(teo.getIndGlobLimiteTo(), convertToInteger(tg.getDestUso())));

		// Format a 5 decimali!!!!!!
		dto.setEttariBosco(parseNumberForPrint(gs.getSupBoscoEquiv()));                   
		dto.setEmissioniGasSerra(parseNumberForPrint(gs.getEmissioniGasSerra()));
		dto.setQuozienteEmissioneGasSerra(proporzioneGasSerra(gs.getEmissioniGasSerra().floatValue()));


		int edi = 0;
		int imp = 0;
		//Arrays.sort(arrayList, )

		Raccomandazione[] racc = new Raccomandazione[arrayList.size()];
		arrayList.toArray(racc);
		Arrays.sort(racc, new RaccomandazioneComparator());

		for (int i = 0; i < racc.length; i++) {

			if (racc[i].getCodSistema().equals("EDIFICIO")) {
				edi++;
			} else {
				imp++;
			}
			
			Raccomandazione r = racc[i];
			
			if (r.getCodSistema().equals("EDIFICIO")) {
				switch (edi) {
				case 1:
					dto.setEdificioIntervento1(r.getIntervento());
					dto.setEdificioPriorita1(r.getDescrPriorita());
					dto.setEdificioTempoRit1(r.getTempoRitorno());					
					break;
				case 2:
					dto.setEdificioIntervento2(r.getIntervento());
					dto.setEdificioPriorita2(r.getDescrPriorita());
					dto.setEdificioTempoRit2(r.getTempoRitorno());
					break;
				case 3:
					dto.setEdificioIntervento3(r.getIntervento());
					dto.setEdificioPriorita3(r.getDescrPriorita());
					dto.setEdificioTempoRit3(r.getTempoRitorno());
					break;
				case 4:
					dto.setEdificioIntervento4(r.getIntervento());
					dto.setEdificioPriorita4(r.getDescrPriorita());
					dto.setEdificioTempoRit4(r.getTempoRitorno());
					break;
				}
			} else {
				switch (imp) {
				case 1:
					dto.setImpiantoIntervento1(r.getIntervento());
					dto.setImpiantoPriorita1(r.getDescrPriorita());
					dto.setImpiantoTempoRit1(r.getTempoRitorno());					
					break;
				case 2:
					dto.setImpiantoIntervento2(r.getIntervento());
					dto.setImpiantoPriorita2(r.getDescrPriorita());
					dto.setImpiantoTempoRit2(r.getTempoRitorno());
					break;
				case 3:
					dto.setImpiantoIntervento3(r.getIntervento());
					dto.setImpiantoPriorita3(r.getDescrPriorita());
					dto.setImpiantoTempoRit3(r.getTempoRitorno());
					break;
				case 4:
					dto.setImpiantoIntervento4(r.getIntervento());
					dto.setImpiantoPriorita4(r.getDescrPriorita());
					dto.setImpiantoTempoRit4(r.getTempoRitorno());
					break;						
				}
			}
		}

		String numeroCertificato = annoCertificato + " " + numCertificatore + " " + progrCertificato;
		dto.setNCertificato(numeroCertificato);
		dto.setDataScadenza(att.getDataScadenza());

		dto.setNCertificatoA(numeroCertificato);		
		dto.setClasseEnGlobNazEdif(getUtilMgr().getDescrizioneClasseEnergetica(aien.getClasseEnergEdificio()));		
		dto.setPrestEnerRagg(parseNumberForPrint(aien.getPrestEnergRaggiungibile()) +unitaDiMisura);
		if (!isNullOrEmpty(parseNumberForPrint(aien.getIndPrestEnergRiscald()))) {
			dto.setPrestRisc(parseNumberForPrint(aien.getIndPrestEnergRiscald()) + unitaDiMisura);
		}
		dto.setLimiteNormNazRisc(parseNumberForPrint(aien.getLimNormaNazRiscald()) + unitaDiMisura);
		if (!isNullOrEmpty(aien.getQualitaInvolucroRaffresc())) {
			dto.setQualitaInvRaffresc(getUtilMgr().getDescrizioneQualitaInvolucro(aien.getQualitaInvolucroRaffresc()));
		}
		dto.setRendimentoMedGlobStagImp(parseNumberForPrint(rea.getRendGlobTermico()));
		dto.setLimiteNormRendMedGlob(parseNumberForPrint(impRisc.getLimNormRegImpTerm()));
		if (!isNullOrEmpty(aien.getPrestazPompaCalore())) 
			dto.setValorePrestEnPomCal(parseNumberForPrint(aien.getPrestazPompaCalore()));
		if (!isNullOrEmpty(aien.getLimNormaPrestPompa()))
			dto.setLimiteNormPrestEnPomCal(parseNumberForPrint(aien.getLimNormaPrestPompa()));

		//-------->Altre informazioni - sopralluoghi e dati di ingresso

		dto.setMotivoRilAttest(getUtilMgr().getDescrizioneMotivoRilascio(aieg.getMotivoRilascio()));
		if (rn.getDataTitolo() != null) {
			dto.setDataTitAbitCostr(GenericUtil.convertToString(rn.getDataTitolo()));
		}
		if (!isNullOrEmpty(rn.getDescrNorma())) {
			dto.setNDecretoLgs(rn.getDescrNorma());
		}
		if (!isNullOrEmpty(rn.getAutorizzato())) {
			if (rn.getAutorizzato().equals("S")) {
				dto.setComboDecretoLgs(AceDto.DECRETO_LGS_S_N_OPTION_SI);
			} else {
				dto.setComboDecretoLgs(AceDto.DECRETO_LGS_S_N_OPTION_NO);
			}
		}else {
			dto.setComboDecretoLgs("");
		}
		dto.setNomeCertificatore(cert.getNome() + " " + cert.getCognome());
		if (!isNullOrEmpty(cert.getDescComuneNascita())) {
			dto.setLuogoNascitaCertificatore(cert.getDescComuneNascita() + " ("+cert.getDescProvNascita()+")");
		} else if (!isNullOrEmpty(cert.getStatoEstero())) {
			dto.setLuogoNascitaCertificatore(cert.getStatoEstero());
		}
		if (cert.getDtNascita() != null) {
			dto.setDataNascitaCertificatore(GenericUtil.convertToString(cert.getDtNascita()));
		}
		dto.setLuogoResidenzaCertificatore(cert.getDescComuneResidenza() + " ("+cert.getDescProvResidenza()+")");
		dto.setCfCertificatore(cert.getCodiceFiscale());
		dto.setLuogoCompilazione(df.getLuogoDichiarazione());
		dto.setDataCompilazione(convertToString(df.getDataDichiarazione()));
		dto.setFirmaCertificatore(cert.getNome() + " " + cert.getCognome() + " N. " + cert.getNumCertificatore());

		switch(df.getCodDichiaraz()) {
		case 1:
			dto.setRadioCertificazione(AceDto.RADIO_CERTIFICAZIONE_VALORE_1);
			break;
		case 2:
			dto.setRadioCertificazione(AceDto.RADIO_CERTIFICAZIONE_VALORE_2);
			break;
		case 3:
			dto.setRadioCertificazione(AceDto.RADIO_CERTIFICAZIONE_VALORE_3);
			break;
		}

		dto.setSupUtileSumCubi(parseNumberForPrint(tg.getSuperficieUtile()));
		dto.setZonaClimGradiGiorno(anagImmobile.getDtCatastali().getZonaClimatica() + " / " + anagImmobile.getDtCatastali().getGradiGiorno());
		if (ai.getFlgEdificioPerformante() != null) {
			if (ai.getFlgEdificioPerformante()) {
				dto.setEdificioPerformante("L'edificio non necessita di interventi migliorativi");
			}
		}

		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::compilaCertificatoPerStampa] - END");
		}
		return dto;
	}
	
	/**
	 * Compila ricevuta certificato per stampa.
	 *
	 * @param numCertificatore the num certificatore
	 * @param progrCertificato the progr certificato
	 * @param annoCertificato the anno certificato
	 * @return the ricevuta invio ace dto
	 * @throws SiceesrvException the siceesrv exception
	 */
	public RicevutaInvioAceDto compilaRicevutaCertificatoPerStampa(String numCertificatore, String progrCertificato, String annoCertificato) throws SiceesrvException {
		log.debug("[CertificatoMgr::compilaRicevutaCertificatoPerStampa] - START");
		//AceDto dto = new AceDto();
		RicevutaInvioAceDto dto = new RicevutaInvioAceDto();
		try {
	//String[] split = numeroCertificato.split(" ");

		SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(numCertificatore);

		SiceeTAltreInfo tAltreInfo = getSiceeTAltreInfoDao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);
		
		if (tAltreInfo != null) {
			
			dto.setDataSopralluogo(Converter.convertToStringWeb(tAltreInfo.getDataSopralluogo()));
			
			if (!isNullOrEmpty(tAltreInfo.getFkMotivo())) {
					
				String desc = null;
				
				SiceeDMotivoRilascio motivoRilascio = getSiceeDMotivoRilascioDao().findByPrimaryKey(tAltreInfo.getFkMotivo());
				
				desc = motivoRilascio.getDescr();
				
				if (tAltreInfo.getFkMotivo() == Constants.ID_MOTIVO_ALTRO)
				{
					if (!isNullOrEmpty(tAltreInfo.getAltroServiziEnergia()))
					{
						motivoRilascio = getSiceeDMotivoRilascioDao().findByPrimaryKey(tAltreInfo.getAltroServiziEnergia());
	
						desc += " - " + motivoRilascio.getDescr();
						
						if (Constants.SI.equalsIgnoreCase(motivoRilascio.getFlagNonValidoDlgs1922005())) {
							// Richiesta variazione da Regione del 10/10/2017
							//dto.setNota("ATTENZIONE: Il seguente attestato e' utilizzabile solo ai fini della stipula di un contratto di servizio energia ai sensi del D.Lgs 115/2008");
							dto.setNota("ATTENZIONE: attestato non utilizzabili ai fini della vendita o locazione di singole unita' immobiliari (D.lgs 192/2005 art. 6)");
						}
						
					}
					else if (!isNullOrEmpty(tAltreInfo.getMotivoAltro()))
					{
						desc += " - " + tAltreInfo.getMotivoAltro();
					}
					
					
					
				}
				
				dto.setDescrMotivoRilascio(desc);
			}
		}
		
		

		
		
		DatiAttestato att = recuperaAttestato(cert.getIdCertificatore(), progrCertificato, annoCertificato);
		//att.setNumeroAttestato(att.getNumeroAttestato());

		dto.setNomeCertificatore(cert.getCognome() + " "
				+ cert.getNome());
		
		String nomeCognomeCo = "";
		if (!isNullOrEmpty(att.getDatiAnagraficiImm())) {
			DtCoCertificatore coCertificatore = att.getDatiAnagraficiImm().getDtCoCertificatore(); 
			if (!isNullOrEmpty(coCertificatore)) 
			{
				if (coCertificatore.getCognome() != null)
				{
					nomeCognomeCo = coCertificatore.getCognome(); 
				}
				if (coCertificatore.getNome() != null)
				{
					nomeCognomeCo += " " + coCertificatore.getNome();
				}
				if (coCertificatore.getCodFisc() != null)
				{
					nomeCognomeCo += " - CF: " + coCertificatore.getCodFisc();
				}
			}	
		}

		log.debug("Stampo att.getDatiTecnici().getDestUso(): "+att.getDatiTecnici().getDestUso());

		String descr = "";
		if (att.getFlgOldApe())
		{
			SiceeDDestUso paramDestUso = getSiceeDDestUsoDao().findByPrimaryKey(Integer.parseInt(att.getDatiTecnici().getDestUso()));
			descr = paramDestUso.getDescr();
			
		}
		else
		{
			SiceeDDestUso2015 paramDestUso2015 = getSiceeDDestUso2015Dao().findByPrimaryKey(Integer.parseInt(att.getDatiTecnici().getDestUso()));
			descr = paramDestUso2015.getDescr();

		}
		
		
		// Verifico se l'ape è protocollato
		SiceeTActa acta = getSiceeTActaDao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);
		
		// E' un test che si può cancellare
		if (acta != null)
		{
			log.debug("######################");
			log.debug("Stampo acta: "+acta);
			log.debug("Stampo acta.getIdCertificatore: "+acta.getIdCertificatore());
			log.debug("Stampo acta.getProgrCertificato: "+acta.getProgrCertificato());
			log.debug("Stampo acta.getAnno: "+acta.getAnno());
			log.debug("Stampo acta.getIdDocActa: "+acta.getIdDocActa());
			log.debug("Stampo acta.getIdClassificazioneActa: "+acta.getIdClassificazioneActa());
			log.debug("Stampo acta.getIdProtocolloActa: "+acta.getIdProtocolloActa());
			log.debug("Stampo acta.getTimestampProtocollo: "+acta.getTimestampProtocollo());
			log.debug("Stampo acta.getNumeroProtocollo: "+acta.getNumeroProtocollo());
			log.debug("######################");

		}
		
		if (acta != null && acta.getNumeroProtocollo() != null)
		{
			// L'APE è protocollato
			dto.setNumeroProtocollo(acta.getNumeroProtocollo());
		}
		
		log.debug("Stampo paramDestUso.getDescr(): "+descr);
		
		dto.setDescrDestUso(descr);
		
		dto.setNomeCocertificatore(nomeCognomeCo);
		
		dto.setDataOdierna(GenericUtil.getDataOdierna());
		
		dto.setNumeroCertificato(annoCertificato + " " + numCertificatore + " " + progrCertificato);

		dto.setDataInvio(att.getDataUpload());
		
		SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(FIRMA_PDF);
		dto.setFirma(param.getValore());
		param = getSiceeTParametriDao().findWhereCodiceEquals(SEDE_REGIONE_PIEMONTE);
		
		dto.setSede(param.getValore().split(Constants.CARRIAGE_RETURN));
		

		
		
		
		DatiCatastaliDto dc = new DatiCatastaliDto();
		DtCatastali attDc = att.getDatiAnagraficiImm().getDtCatastali();
		dc.setProvincia(attDc.getDescrProv());
		dc.setComune(attDc.getDescrComune());
		dc.setFoglio(attDc.getFoglio());
		if (!isNullOrEmpty(attDc.getNumCiv())) {
			dc.setCivico(attDc.getNumCiv());
		} else {
			dc.setCivico("");
		}
		
		// Beppe 10/01/2012
		//dc.setFlgCondominio(attDc.getFlgCondominio());
		
		dc.setIndirizzo(attDc.getDescrIndirizzo());
		dc.setParticella(attDc.getParticella());
		dc.setSezione(attDc.getSezione());
		dc.setSubalterno(attDc.getSubalterno());
		dc.setCodiceComuneCatastale(attDc.getCodComunaleCatastale());
		
		
		//tecniciGen.setIdCarattEdificio(obj2.getFkCarattEdificio());

		if (att.getDatiTecnici().getIdCarattEdificio() != null)
		{
			SiceeDCarattEdificio paramCarattEdificio = getSiceeDCarattEdificioDao().findByPrimaryKey(att.getDatiTecnici().getIdCarattEdificio());
		
			SiceeDTipoEdificio paramEdificio = getSiceeDTipoEdificioDao().findByPrimaryKey(paramCarattEdificio.getFkTipoEdificio());
		
			dto.setTipologiaEdificio(paramEdificio.getDescr());
		}
		
		dto.setDatiCatastali(dc);
		
		ArrayList<DtCatastaliSecondari> list = attDc.getDtCatastaliSecondari();
		if (!list.isEmpty()) {
			DatiCatastaliDto[] array = new DatiCatastaliDto[list.size()];
			for (int i = 0; i < list.size(); i++) {
				array[i] = new DatiCatastaliDto();
				DtCatastaliSecondari o = list.get(i);
				array[i].setComune(o.getDescrComune());
				array[i].setFoglio(o.getFoglio());
				array[i].setParticella(o.getParticella());
				array[i].setProvincia(o.getDescrProv());
				array[i].setSezione(o.getSezione());
				array[i].setSubalterno(o.getSubalterno());
				array[i].setCodiceComuneCatastale(o.getCodiceComuneCatastale());
			}
			dto.setDatiCatastaliAltri(array);
		}
		//TODO

		FiltroRicercaAce filtro = new FiltroRicercaAce();
		filtro.setCertificatore(numCertificatore);
		filtro.setNumero(progrCertificato);
		filtro.setAnno(annoCertificato);
		
		
		// Da modificare
		Ace[] aceSostituiti = findAceSostituiti(filtro);
		
		int idMotSostituzione = 0;
		
		if (aceSostituiti != null && aceSostituiti.length > 0 )
		{
			String[] oldArray = new String[aceSostituiti.length];
			
			for (int i = 0; i < aceSostituiti.length; i++) {
				Ace aceSost = aceSostituiti[i];
				String numeroAceOld = aceSost.getAnno() + " " + aceSost.getCertificatore() + " "
				+ aceSost.getNumero();
				
				oldArray[i] = numeroAceOld;				
			
				log.debug("MOTIVO SOSTITUZIONE - aceSost.getIdMotivoSost(): "+aceSost.getIdMotivoSost());
				idMotSostituzione = aceSost.getIdMotivoSost();
			}
			
			dto.setAceSostituiti(oldArray);
			
			
			log.debug("MOTIVO SOSTITUZIONE - idMotSostituzione: "+idMotSostituzione);
			
			MotivoAnnullamento motivoAnnullamento = getUtilMgr()
			.getMotivoAnnullamentoById(idMotSostituzione);
			log.debug("MOTIVO SOSTITUZIONE - motivoAnnullamento: "+motivoAnnullamento);

			if (motivoAnnullamento != null)
			{
				log.debug("MOTIVO SOSTITUZIONE - motivoAnnullamento.getDescr(): "+motivoAnnullamento.getDescr());
				log.debug("MOTIVO SOSTITUZIONE - motivoAnnullamento.getCod(): "+motivoAnnullamento.getCod());
				dto.setMotivoSostituzione(motivoAnnullamento.getDescr());
			}
		}
		
		} catch (SiceeTAltreInfoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);

		} catch (SiceeTActaDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} 
		catch (SiceeDCarattEdificioDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeDTipoEdificioDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);

		} catch (SiceeDDestUsoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeDDestUso2015DaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeDMotivoRilascioDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::compilaRicevutaCertificatoPerStampa] - END");
		}
		return dto;
	}
	
	/**
	 * Recupera attestato.
	 *
	 * @param id the id
	 * @param prog the prog
	 * @param anno the anno
	 * @return the dati attestato
	 * @throws SiceesrvException the siceesrv exception
	 */
	@Transactional
	public DatiAttestato recuperaAttestato(String id, String prog, String anno) throws SiceesrvException {

		//		String[] split = BaseMgr.recuperaChiaveAttestato(cert.getIdCertificatore(), numeroCertificato);

//		String id = split[Constants.PK_ID_CERTIFICATORE];
//		String prog = split[Constants.PK_PROGR];
//		String anno = split[Constants.PK_ANNO];

		log.debug("idCertificatore: " + id);
		log.debug("progressivoCertificato: " + prog);
		log.debug("anno: " + anno);

		boolean isOld = false;

		DatiAttestato ret = null;
		try {
			
			SiceeTCertificatoPk pk9 = new SiceeTCertificatoPk(id, prog, anno);
			SiceeTCertificato obj9 = getSiceeTCertificatoDao().findByPrimaryKey(pk9);
			if (obj9 == null) {
				obj9 = new SiceeTCertificato();
				obj9.setIdCertificatore(id);
				obj9.setProgrCertificato(prog);
				obj9.setAnno(anno);
				obj9.setFlgOld(Constants.NO);
				getSiceeTCertificatoDao().insert(obj9);
			}

			if (obj9.getFlgOld() != null)
			{
				isOld = BaseMgr.convertToBoolean(obj9
						.getFlgOld());
			}
			
			
			SiceeTDatiGeneraliPk pk2 = new SiceeTDatiGeneraliPk(id, prog, anno);
			SiceeTDatiGenerali obj2 = getSiceeTDatiGeneraliDao().findByPrimaryKey(pk2);
			if (obj2 == null) {
				obj2 = new SiceeTDatiGenerali();
				obj2.setIdCertificatore(id);
				obj2.setProgrCertificato(prog);
				obj2.setAnno(anno);
				getSiceeTDatiGeneraliDao().insert(obj2);
			}
			
			if (isOld)
				{
					
				
				SiceeTClasseEnergeticaPk pk0 = new SiceeTClasseEnergeticaPk(id, prog, anno);
				SiceeTClasseEnergetica obj0 = getSiceeTClasseEnergeticaDao().findByPrimaryKey(pk0);
				if (obj0 == null) {
					obj0 = new SiceeTClasseEnergetica();
					obj0.setIdCertificatore(id);
					obj0.setProgrCertificato(prog);
					obj0.setAnno(anno);
					obj0.setServiziEnergetici(Constants.SERVIZI_ENERGETICI_INCLUSI);
					getSiceeTClasseEnergeticaDao().insert(obj0);
				}
	
				SiceeTConsumiEdificioPk pk1 = new SiceeTConsumiEdificioPk(id, prog, anno);
				SiceeTConsumiEdificio obj1 = getSiceeTConsumiEdificioDao().findByPrimaryKey(pk1);
				if (obj1 == null) {
					obj1 = new SiceeTConsumiEdificio();
					obj1.setIdCertificatore(id);
					obj1.setProgrCertificato(prog);
					obj1.setAnno(anno);
					getSiceeTConsumiEdificioDao().insert(obj1);
				}
	
				
	
	
				SiceeTEnergiaSoprIngrPk pk3 = new SiceeTEnergiaSoprIngrPk(id, prog, anno);
				SiceeTEnergiaSoprIngr obj3 = getSiceeTEnergiaSoprIngrDao().findByPrimaryKey(pk3);
				if (obj3 == null) {
					obj3 = new SiceeTEnergiaSoprIngr();
					obj3.setIdCertificatore(id);
					obj3.setProgrCertificato(prog);
					obj3.setAnno(anno);
					getSiceeTEnergiaSoprIngrDao().insert(obj3);
				}
	
				SiceeTFabbisognoPk pk4 = new SiceeTFabbisognoPk(id, prog, anno);
				SiceeTFabbisogno obj4 = getSiceeTFabbisognoDao().findByPrimaryKey(pk4);
				if (obj4 == null) {
					obj4 = new SiceeTFabbisogno();
					obj4.setIdCertificatore(id);
					obj4.setProgrCertificato(prog);
					obj4.setAnno(anno);
					getSiceeTFabbisognoDao().insert(obj4);
				}		
	
				SiceeTImpRiscaldamentoAcsPk pk5 = new SiceeTImpRiscaldamentoAcsPk(id, prog, anno);
				SiceeTImpRiscaldamentoAcs obj5 = getSiceeTImpRiscaldamentoAcsDao().findByPrimaryKey(pk5);
				if (obj5 == null) {
					obj5 = new SiceeTImpRiscaldamentoAcs();
					obj5.setIdCertificatore(id);
					obj5.setProgrCertificato(prog);
					obj5.setAnno(anno);
					getSiceeTImpRiscaldamentoAcsDao().insert(obj5);
				}
	
	
	
	
				SiceeTRispettoNormativePk pk7 = new SiceeTRispettoNormativePk(id, prog, anno);
				SiceeTRispettoNormative obj7 = getSiceeTRispettoNormativeDao().findByPrimaryKey(pk7);
				if (obj7 == null) {
					obj7 = new SiceeTRispettoNormative();
					obj7.setIdCertificatore(id);
					obj7.setProgrCertificato(prog);
					obj7.setAnno(anno);
					getSiceeTRispettoNormativeDao().insert(obj7);
				}
	
				SiceeTAltreInfoPk pk8 = new SiceeTAltreInfoPk(id, prog, anno);
				SiceeTAltreInfo obj8 = getSiceeTAltreInfoDao().findByPrimaryKey(pk8);
				if (obj8 == null) {
					obj8 = new SiceeTAltreInfo();
					obj8.setIdCertificatore(id);
					obj8.setProgrCertificato(prog);
					obj8.setAnno(anno);
					getSiceeTAltreInfoDao().insert(obj8);
				}
	
				
				// NEW BEPPE
				List<SiceeTDatiCatastSec> obj10 = getSiceeTDatiCatastSecDao().findBySiceeTCertificato(id, prog, anno);
				
				
				SiceeTRuoliEdificioPk pkProg = new SiceeTRuoliEdificioPk(id, prog, anno, Constants.PROGETTISTA);
				SiceeTRuoliEdificio objProg = getSiceeTRuoliEdificioDao().findByPrimaryKey(pkProg);
				if (objProg == null) {
					objProg = new SiceeTRuoliEdificio();
					objProg.setIdCertificatore(id);
					objProg.setProgrCertificato(prog);
					objProg.setAnno(anno);
					objProg.setFkTipoRuolo(Constants.PROGETTISTA);
					getSiceeTRuoliEdificioDao().insert(objProg);
				}
	
				SiceeTRuoliEdificioPk pkDirLav = new SiceeTRuoliEdificioPk(id, prog, anno, Constants.DIRETTORE_LAVORI);
				SiceeTRuoliEdificio objDirLav = getSiceeTRuoliEdificioDao().findByPrimaryKey(pkDirLav);
				if (objDirLav == null) {
					objDirLav = new SiceeTRuoliEdificio();
					objDirLav.setIdCertificatore(id);
					objDirLav.setProgrCertificato(prog);
					objDirLav.setAnno(anno);
					objDirLav.setFkTipoRuolo(Constants.DIRETTORE_LAVORI);
					getSiceeTRuoliEdificioDao().insert(objDirLav);
				}
	
	
				SiceeTRuoliEdificioPk pkCostr = new SiceeTRuoliEdificioPk(id, prog, anno, Constants.COSTRUTTORE);
				SiceeTRuoliEdificio objCostr = getSiceeTRuoliEdificioDao().findByPrimaryKey(pkCostr);
				if (objCostr == null) {
					objCostr = new SiceeTRuoliEdificio();
					objCostr.setIdCertificatore(id);
					objCostr.setProgrCertificato(prog);
					objCostr.setAnno(anno);
					objCostr.setFkTipoRuolo(Constants.COSTRUTTORE);
					getSiceeTRuoliEdificioDao().insert(objCostr);
				}
	
	
				ret = mapToModelFromDB(obj0, obj1,obj2,obj3,obj4,obj5,obj7, obj8, obj9, obj10, objProg, objDirLav, objCostr);

			}
			else
			{
//				List<SiceeTFoto2015> objFotoList = this.getSiceeTFoto2015Dao()
//						.findBySiceeTCertificato(id, prog,
//						anno);
				List<SiceeTDatiCatastSec> obj10 = getSiceeTDatiCatastSecDao().findBySiceeTCertificato(id, prog, anno);
				SiceeTAltreInfoPk pk8 = new SiceeTAltreInfoPk(id, prog, anno);
				SiceeTAltreInfo obj8 = getSiceeTAltreInfoDao().findByPrimaryKey(pk8);
				
				ret = this.mapToModelFromDB(obj2, obj9, obj10, null, obj8);
			}
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			log.error("Erroe", e);
			throw new SiceesrvException(e.getMessage(), e);
		}

		return ret;
	}
	
	/**
	 * Recupera raccomandazioni.
	 *
	 * @param id the id
	 * @param prog the prog
	 * @param anno the anno
	 * @return the array list
	 * @throws SiceesrvException the siceesrv exception
	 */
	@Transactional
	public List<Raccomandazione> recuperaRaccomandazioni(String id, String prog, String anno) throws SiceesrvException {
		ArrayList<Raccomandazione> racc = new ArrayList<Raccomandazione>();
		ArrayList<Raccomandazione> raccAlta = new ArrayList<Raccomandazione>();
		ArrayList<Raccomandazione> raccMedia = new ArrayList<Raccomandazione>();
		ArrayList<Raccomandazione> raccBassa = new ArrayList<Raccomandazione>();

		/*
		String[] split = BaseMgr.recuperaChiaveAttestato(cert.getIdCertificatore(), numeroCertificato);

		String id = split[Constants.PK_ID_CERTIFICATORE];
		String prog = split[Constants.PK_PROGR];
		String anno = split[Constants.PK_ANNO];
		*/
		
		log.debug("idCertificatore: " + id);
		log.debug("progressivoCertificato: " + prog);
		log.debug("anno: " + anno);

		try {
			List<SiceeDPriorita> prioritaList = this.recuperaPriorita();

			List<SiceeTRaccomandazioni> l = getSiceeTRaccomandazioniDao().findBySiceeTCertificato(id, prog, anno);
			if (l != null) {
				for (int i = 0 ; i< l.size(); i++ ) {
					Raccomandazione r = new Raccomandazione();

					SiceeTRaccomandazioni obj = l.get(i);

					r.setId(obj.getSistema()+"-"+obj.getIntervento() +"-"+ obj.getPriorita());
					r.setCodSistema(obj.getSistema());
					r.setIntervento(obj.getIntervento());
					r.setPriorita(obj.getPriorita());
					r.setTempoRitorno(obj.getTempoRitorno());
					if (prioritaList!=null){
						for (int j = 0 ; j< prioritaList.size(); j++ ) {
							SiceeDPriorita priorita = prioritaList.get(j);
							if (obj.getPriorita().equals(priorita.getPriorita())){
								r.setDescrPriorita(priorita.getDescr());
								break;
							}
						}

					}

					if (obj.getPriorita()!= null && obj.getPriorita().startsWith("1")){
						raccAlta.add(r);
					}
					else if (obj.getPriorita()!= null && obj.getPriorita().startsWith("2")){
						raccMedia.add(r);
					}
					else {
						raccBassa.add(r);
					}
				}
				racc.addAll(raccAlta);
				racc.addAll(raccMedia);
				racc.addAll(raccBassa);
			}

		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			log.error("Erroe", e);
			throw new SiceesrvException(e.getMessage(), e);
		}	
		return racc;
	}
	
	
	/**
	 * Ritornja l'uid del doc ricercato
	 *
	 * @param numCertificatore the num certificatore
	 * @param progrCertificato the progr certificato
	 * @param annoCertificato the anno certificato
	 * @param idTipoDoc the id tipo doc
	 * @return the uid
	 * @throws SiceesrvException the siceesrv exception
	 */
	public String findUidRifIndex(String numCertificatore, String prog, String anno, Integer idTipoDoc) throws SiceesrvException {
		log.debug("[CertificatoMgr::getUidRifIndex] - START");
		String ret = null;
		try {

			SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(numCertificatore);
			
			SiceeTRifIndex2015 obj = getSiceeTRifIndex2015Dao().findBySiceeTCertificatoidTipoDoc(cert.getIdCertificatore(), prog, anno, idTipoDoc);
			
			if (obj != null) {
				ret = obj.getUidIndex();
			}
		} 
		catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		catch (SiceeTRifIndex2015DaoException e) {
				log.error(e);
				throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[CertificatoMgr::getUidRifIndex] - END");
		}
		return ret;
	}
	
	/**
	 * Ritorna la protocollazione
	 *
	 * @param numCertificatore the num certificatore
	 * @param progrCertificato the progr certificato
	 * @param annoCertificato the anno certificato
	 * @return the protocollazione
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Protocollazione findProtocollazione(String numCertificatore, String progrCertificato, String annoCertificato) throws SiceesrvException {
		log.debug("[CertificatoMgr::findProtocollazione] - START");
		Protocollazione prot = null;
		try {

			SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(numCertificatore);
			
			SiceeTActa obj = getSiceeTActaDao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			
			if (obj != null) {
				prot = new Protocollazione();

				log.debug("Stampo obj.getNumeroProtocollo: "+obj.getNumeroProtocollo());
				log.debug("Stampo obj.getTimestampProtocollo: "+obj.getTimestampProtocollo());
				log.debug("Stampo obj.getVolume: "+obj.getVolume());
				log.debug("Stampo obj.getTipoDocumentoActa: "+obj.getTipoDocumentoActa());
				log.debug("Stampo obj.getMailInviata: "+obj.getMailInviata());

				prot.setNumero(obj.getNumeroProtocollo());
				prot.setData(obj.getTimestampProtocollo());
				prot.setVolume(obj.getVolume());
				prot.setTipoDoc(obj.getTipoDocumentoActa());
				prot.setMail(obj.getMailInviata());
				
				log.debug("Stampo prot.getNumeroProtocollo: "+prot.getNumero());
				log.debug("Stampo prot.getTimestampProtocollo: "+prot.getData());
				log.debug("Stampo prot.getVolume: "+prot.getVolume());
				log.debug("Stampo prot.getTipoDocumentoActa: "+prot.getTipoDoc());
				log.debug("Stampo prot.getMailInviata: "+prot.getMail());

				
				
			}
		} 
		catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		catch (SiceeTActaDaoException e) {
				log.error(e);
				throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[CertificatoMgr::findProtocollazione] - END");
		}
		return prot;
	}
	
	
	/**
	 * Crea dettaglio ACE
	 *
	 * @param numCertificatore the num certificatore
	 * @param progrCertificato the progr certificato
	 * @param annoCertificato the anno certificato
	 * @return the list LabelValue
	 * @throws SiceesrvException the siceesrv exception
	 */
	public ArrayList<LabelValue> creaDettaglioAce(String numCertificatore, String progrCertificato, String annoCertificato) throws SiceesrvException {
		log.debug("[CertificatoMgr::creaDettaglioAce] - START");
		ArrayList<LabelValue> labelValueList = new ArrayList<LabelValue>();
		try {
	//String[] split = numeroCertificato.split(" ");

			
		SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(numCertificatore);

		boolean isOld = false;
		
		SiceeTCertificatoPk certDtoPk = new SiceeTCertificatoPk(cert.getIdCertificatore(), progrCertificato, annoCertificato);
		SiceeTCertificato certDto = this.getSiceeTCertificatoDao().findByPrimaryKey(certDtoPk);
				
		if (certDto.getFlgOld() != null)
		{
			isOld = BaseMgr.convertToBoolean(certDto
					.getFlgOld());
		}
		
		if (isOld)
		{
			DatiAttestato attestato = recuperaAttestato(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			//att.setNumeroAttestato(att.getNumeroAttestato());
	
			ArrayList<Raccomandazione> listRacc = (ArrayList<Raccomandazione>) recuperaRaccomandazioni(cert.getIdCertificatore(), progrCertificato, annoCertificato);
	
			attestato
			.getAltreInfo()
			.setRaccomandazioni(listRacc);
			
			
			attestato.setNumeroAttestato(annoCertificato + " " + numCertificatore + " " + progrCertificato);

			SiceeTAzienda tAzienda = getSiceeTAziendaDao().findByPrimaryKey(cert.getFkAzienda());
			
			ApeDto apeDto = new ApeDto();
			String dTitolo = null;
			SiceeDIstruzione istruzione = getSiceeDIstruzioneDao().findByPrimaryKey(cert.getFkIstruzione());
			if (istruzione != null) {
				dTitolo = istruzione.getDenominazione();
			}
			apeDto = mapFromCertificatoreToApe(cert, tAzienda, dTitolo, apeDto);
	
			labelValueList = (ArrayList<LabelValue>) getLabelValueListFromAttestatoOld(attestato, apeDto);
		}
		else
		{
			SiceeTCertificato tCert = getSiceeTCertificatoDao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			SiceeTDatiGenerali tDatiGen = getSiceeTDatiGeneraliDao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);

			List<SiceeTDatiCatastSec> tDatiCatastSec = getSiceeTDatiCatastSecDao().findBySiceeTCertificato(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			
			SiceeTAltreInfo tAltreInfo = getSiceeTAltreInfoDao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			List<SiceeTQtaConsumi2015> tQtaCons = getSiceeTQtaConsumi2015Dao().findWhereIdCertProgrAnno(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			SiceeTDatiEner2015 tDatiEner = getSiceeTDatiEner2015Dao().findByPrimaryKey(cert.getIdCertificatore(), progrCertificato, annoCertificato);

			List<SiceeTRaccomand2015> tRacc = getSiceeTRaccomand2015Dao().findWhereIdCertProgrAnno(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			
			List<SiceeRCombDener2015> rCombDener = getSiceeRCombDener2015Dao().findBySiceeTDatiEner2015(cert.getIdCertificatore(), progrCertificato, annoCertificato);

			List<SiceeRCertifServener2015> rCertifServener = getSiceeRCertifServener2015Dao().findBySiceeTCertificato(cert.getIdCertificatore(), progrCertificato, annoCertificato);
			
			String numAttestato = annoCertificato + " " + numCertificatore + " " + progrCertificato;

			SiceeTAzienda tAzienda = getSiceeTAziendaDao().findByPrimaryKey(cert.getFkAzienda());
			
			ApeDto apeDto = new ApeDto();
			String dTitolo = null;
			SiceeDIstruzione istruzione = getSiceeDIstruzioneDao().findByPrimaryKey(cert.getFkIstruzione());
			if (istruzione != null) {
				dTitolo = istruzione.getDenominazione();
			}
			apeDto = mapFromCertificatoreToApe(cert, tAzienda, dTitolo, apeDto);
			
			labelValueList = (ArrayList<LabelValue>) getLabelValueListFromAttestato(numAttestato, tCert, tDatiGen, tDatiCatastSec, tAltreInfo, tDatiEner, tQtaCons, tRacc, rCombDener, rCertifServener, apeDto);
			
		}
		
		

		} catch (DaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[CertificatoMgr::creaDettaglioAce] - END");
		}
		return labelValueList;
	}
	
	/**
	 * Recupera priorita.
	 *
	 * @return the list
	 * @throws SiceeDPrioritaDaoException the sicee d priorita dao exception
	 */
	public List<SiceeDPriorita> recuperaPriorita() throws SiceeDPrioritaDaoException {
		return getSiceeDPrioritaDao().findAll();
	}

	/**
	 * Map to model from db.
	 *
	 * @param obj0 the obj0
	 * @param obj1 the obj1
	 * @param obj2 the obj2
	 * @param obj3 the obj3
	 * @param obj4 the obj4
	 * @param obj5 the obj5
	 * @param obj7 the obj7
	 * @param obj8 the obj8
	 * @param obj9 the obj9
	 * @param obj10 the obj10
	 * @param objProg the obj prog
	 * @param objDirLav the obj dir lav
	 * @param objCostr the obj costr
	 * @return the dati attestato
	 * @throws SiceesrvException the siceesrv exception
	 */
	private DatiAttestato mapToModelFromDB(SiceeTClasseEnergetica obj0,
			SiceeTConsumiEdificio obj1, SiceeTDatiGenerali obj2,
			SiceeTEnergiaSoprIngr obj3, SiceeTFabbisogno obj4,
			SiceeTImpRiscaldamentoAcs obj5, 
			SiceeTRispettoNormative obj7, SiceeTAltreInfo obj8, 
			SiceeTCertificato obj9, List<SiceeTDatiCatastSec> obj10, 
			SiceeTRuoliEdificio objProg, SiceeTRuoliEdificio objDirLav, SiceeTRuoliEdificio objCostr) throws SiceesrvException {

		DatiAttestato ret = new DatiAttestato();
		try{
			DtAltreInfo altreInfo = new DtAltreInfo();
			//SiceeTAltreInfo
			altreInfo.setFlgEdificioPerformante(convertToBoolean(obj9.getFlgEdificioPerformante()));
			altreInfo.setFlgSigmater(convertToBoolean(obj9.getFlgSigmater()));
			DtAIEnergetiche ener = new DtAIEnergetiche();
			ener.setClasseEnergEdificio(convertToString(obj8.getFkClasse19205()));
			ener.setPrestEnergRaggiungibile(obj8.getPrestazioneEne());
			ener.setLimNormaNazRiscald(obj8.getLimiteNormaRisc());		
			ener.setQualitaInvolucroRaffresc(convertToString(obj8.getFkQualitaInvo()));
			//ener.setLimNormaNazImpTermico(convertTo(obj8.getLimiteNormaImp()));spostato
			ener.setPrestazPompaCalore(obj8.getValorePrestPdc());
			ener.setLimNormaPrestPompa(obj8.getLimiteNormaPdc());
			ener.setAltreInfo(obj8.getUltInfo());
			ener.setIndPrestEnergRiscald(obj8.getIndRiscEpiNaz());

			DtAIGenerali gen = new DtAIGenerali();

			gen.setMotivoRilascio(convertToString(obj8.getFkMotivo()));
			gen.setMetodoCalcolo(obj8.getMetodologiaCalcolo());		
			gen.setDenomProduttore(obj8.getNomeProduttore());
			gen.setSoftware(obj8.getSwUtilizzato());
			gen.setRispondenzaUNITS11300(obj8.getUniTs11300());


			//SiceeTEnergiaSoprIngr

			DtAISopralluoghi sopr = new DtAISopralluoghi();
			sopr.setData(obj3.getDtSopralluogo());
			sopr.setNote(obj3.getNoteSoprall());
			sopr.setTipoRedazione(convertToString(obj3.getFkDati()));

			altreInfo.setEnergetiche(ener);
			altreInfo.setGenerali(gen);
			altreInfo.setSopralluoghi(sopr);

			ret.setAltreInfo(altreInfo);

			DtClasseEnerg classeEnerg = new DtClasseEnerg();
			//SiceeTClasseEnergetica

			DtLocReale reale = new DtLocReale();
			DtLocTeorica teor = new DtLocTeorica();

			teor.setDomEnergAcqua(obj0.getDomAcsQhwto());
			teor.setDomEnergRiscald(obj0.getDomRiscQhto());		
			teor.setEnergTermAcquaRinnov(obj0.getEnAcsRinnoTo());

			teor.setIndPrestEnergAcqua(obj0.getFabbAcsTo());
			teor.setClasseEnerg(convertToString(obj0.getFkClasse()));

			if (teor.getClasseEnerg() != null) {
				teor.setDescClasseEnerg(getSiceeDClasseEnergeticaDao().findByPrimaryKey(obj0.getFkClasse()).getDescr());
			}

			reale.setIndPrestEnergCondiz(obj0.getIndCondEst());
			reale.setIndPrestEnergGlob(obj0.getIndGlobEplordo());

			teor.setIndPrestEnergGlob(obj0.getIndGlobEplordoTo());
			teor.setIndGlobLimiteTo(obj0.getIndGlobLimiteTo());

			reale.setIndPrestEnergIlluminaz(obj0.getIndIllum());
			reale.setIndPrestEnergRiscald(obj0.getIndRiscEpi());

			teor.setIndPrestEnergRiscald(obj0.getIndRiscEpito());
			teor.setLimNormaRegione(obj0.getLimiteRegQhto());		

			// CONVERT 5
			teor.setRendGlobStagioneAcqua(obj0.getRendAcsEtagAcsto());		

			reale.setRendDistrib(obj0.getRendDistrib());
			reale.setRendEmissione(obj0.getRendEmiss());
			reale.setRendGeneraz(obj0.getRendGener());
			reale.setRendGlobTermico(obj0.getRendImpEtag());
			reale.setRendRegolaz(obj0.getRendRegol());

			teor.setServEnergInclusi(obj0.getServiziEnergetici());

			classeEnerg.setLocReale(reale);
			classeEnerg.setLocTeorica(teor);

			ret.setClasseEnerg(classeEnerg);

			DtConsumiReali consumiReali = new DtConsumiReali();

			//SiceeTConsumiEdificio

			consumiReali.setAnnoElettricoFossile(obj1.getAnnElettFossile());
			consumiReali.setAnnoElettricoRinnov(obj1.getAnnElettRinno());
			consumiReali.setAnnoTermicoFossile(obj1.getAnnTermiFossile());
			consumiReali.setAnnoTermicoRinnov(obj1.getAnnTermiRinno());
			consumiReali.setMedioElettrico(obj1.getComplessElettrico());
			consumiReali.setMedioTermico(obj1.getComplessTermico());

			ret.setConsumiReali(consumiReali);

			DtImpianti impianti = new DtImpianti();

			impianti.setTipoDistrib(obj1.getDescTipoDistrib());
			impianti.setTipoTermErogaz(obj1.getDescTipoErog());
			impianti.setTipoImpianto(convertToString(obj1.getFkTipoImpianto()));
			impianti.setTipoRegolaz(obj1.getDescTipoReg());
			impianti.setFlgRipartizione(obj1.getFlgContRip());
			impianti.setUiServite(obj1.getUiServite());

			ret.setImpianti(impianti);


			DtTecniciGen tecniciGen =  new DtTecniciGen();		
			//SiceeTDatiGenerali

			
			tecniciGen.setFlagUsoPubblico(obj2.getFlagUsoPubblico());
			tecniciGen.setAnnoCostr(convertToString(obj2.getAnnoCostruzione()));
			tecniciGen.setAnnoUltimaRistrutt(convertToString(obj2.getAnnoUltRist()));
			tecniciGen.setDestUso(convertToString(obj2.getFkDestUso()));
			tecniciGen.setIdCarattEdificio(obj2.getFkCarattEdificio());
			tecniciGen.setDescrizioneEdificio(obj2.getDescTipoEdificio());
			tecniciGen.setSuperficieUtile(obj2.getSu());
			tecniciGen.setSupDispTot(obj2.getSupDisperdenteTot());
			tecniciGen.setTrasmittanzaOpache(obj2.getTrasmOpache());
			tecniciGen.setTrasmittanzaTrasp(obj2.getTrasmTrasp());
			tecniciGen.setVolLordoRiscald(obj2.getVolLordoRiscaldato());
			tecniciGen.setFattoreForma(obj2.getFattoreForma());

			ret.setDatiTecnici(tecniciGen);

			DtAnagImmobile anagImmobile = new DtAnagImmobile();



			//		SiceeTCertificato

			DtCatastali cat = new DtCatastali();
			DtCoCertificatore coCert = new DtCoCertificatore();

			cat.setCodProv(obj9.getIdProv());
			cat.setDescrProv(obj9.getDescProv());
			cat.setCodComune(obj9.getIdComune());
			cat.setDescrComune(obj9.getDescComune());
			cat.setCodIndirizzo(obj9.getIdIndirizzo());
			cat.setDescrIndirizzo(obj9.getDescIndirizzo());
			cat.setNumCiv(obj9.getNumCivico());
			
			// Beppe 10/01/2012
			//cat.setFlgCondominio(obj9.getFlgCondominio());
			
			cat.setCap(obj9.getCap());
			cat.setSezione(obj9.getSezione());
			cat.setFoglio(obj9.getFoglio());
			cat.setParticella(obj9.getParticella());
			cat.setSubalterno(obj9.getSubalterno());
			cat.setPiano(obj9.getPiano());
			cat.setPianiTot(obj9.getNumPianiComplessivi());
			cat.setNumUnita(obj9.getNumAppartamenti());
			cat.setScala(obj9.getScala());
			cat.setInterno(obj9.getInterno());
			cat.setNote(obj9.getNote());
			cat.setNomeFoto(obj9.getNomeFoto());
			cat.setUidFoto(obj9.getIdentificFoto());
			cat.setUidDoc(obj9.getIdentificPdf());
			cat.setNomeDoc(obj9.getNomePdf());

			cat.setGradiGiorno(obj2.getGradiGiorno());
			cat.setZonaClimatica(obj2.getZonaClimatica());

			ret.setStatus(obj9.getFkStato());
			ret.setDataScadenza(convertToString(obj9.getDtScadenza()));
			ret.setDataUpload(convertToString(obj9.getDtUpload()));


			coCert.setNome(obj9.getNomeCocertificatore());
			coCert.setCognome(obj9.getCognomeCocertificatore());
			coCert.setNumMatricola(obj9.getNumCocertificatore());

			// SEQ_SICEE_T_DATICATAST_SEC
			ArrayList<DtCatastaliSecondari> listDtCatastaliSecondari = new ArrayList<DtCatastaliSecondari>();
			for (int i = 0; i < obj10.size(); i++) 
			{
				SiceeTDatiCatastSec tDaticatastSec = obj10.get(i);
				
				DtCatastaliSecondari datCatSec = new DtCatastaliSecondari();
				datCatSec.setId(""+i);
				datCatSec.setCodProv(tDaticatastSec.getIdProv());

				datCatSec.setDescrProv(tDaticatastSec.getDescProv());
				datCatSec.setCodComune(tDaticatastSec.getIdComune());
				datCatSec.setDescrComune(tDaticatastSec.getDescComune());
				datCatSec.setSezione(tDaticatastSec.getSezione());
				datCatSec.setFoglio(tDaticatastSec.getFoglio());
				datCatSec.setParticella(tDaticatastSec.getParticella());
				datCatSec.setSubalterno(tDaticatastSec.getSubalterno());
				listDtCatastaliSecondari.add(datCatSec);
				
			}
			
			cat.setDtCatastaliSecondari(listDtCatastaliSecondari);
			
			
			
			
			anagImmobile.setDtCatastali(cat);
			anagImmobile.setDtCoCertificatore(coCert);

			DtResponsabili resp = new DtResponsabili();

			SoggResponsabile prog = new SoggResponsabile();

			prog.setNome(objProg.getNome());
			prog.setCognome(objProg.getCognome());
			prog.setCodIndirizzo(objProg.getIdIndirizzo());
			prog.setDescrIndirizzo(objProg.getDescIndirizzo());
			prog.setCap(objProg.getCap());
			prog.setCodComune(objProg.getIdComune());
			prog.setDescrComune(objProg.getDescComune());
			prog.setCodProv(objProg.getIdProvincia());
			prog.setDescrProv(objProg.getDescProvincia());
			prog.setCodReg(objProg.getIdRegione());
			prog.setDescrReg(objProg.getDescRegione());
			prog.setTel(objProg.getTelefono());
			prog.setCell(objProg.getCell());
			prog.setFax(objProg.getFax());
			prog.setEmail(objProg.getEmail());
			prog.setNumCiv(objProg.getNumCivico());

			SoggResponsabile dirLav = new SoggResponsabile();

			dirLav.setNome(objDirLav.getNome());
			dirLav.setCognome(objDirLav.getCognome());
			dirLav.setCodIndirizzo(objDirLav.getIdIndirizzo());
			dirLav.setDescrIndirizzo(objDirLav.getDescIndirizzo());
			dirLav.setCap(objDirLav.getCap());
			dirLav.setCodComune(objDirLav.getIdComune());
			dirLav.setDescrComune(objDirLav.getDescComune());
			dirLav.setCodProv(objDirLav.getIdProvincia());
			dirLav.setDescrProv(objDirLav.getDescProvincia());
			dirLav.setCodReg(objDirLav.getIdRegione());
			dirLav.setDescrReg(objDirLav.getDescRegione());
			dirLav.setTel(objDirLav.getTelefono());
			dirLav.setCell(objDirLav.getCell());
			dirLav.setFax(objDirLav.getFax());
			dirLav.setEmail(objDirLav.getEmail());
			dirLav.setNumCiv(objDirLav.getNumCivico());


			SoggResponsabile costr = new SoggResponsabile();

			costr.setNome(objCostr.getNome());
			costr.setCognome(objCostr.getCognome());
			costr.setCodIndirizzo(objCostr.getIdIndirizzo());
			costr.setDescrIndirizzo(objCostr.getDescIndirizzo());
			costr.setCap(objCostr.getCap());
			costr.setCodComune(objCostr.getIdComune());
			costr.setDescrComune(objCostr.getDescComune());
			costr.setCodProv(objCostr.getIdProvincia());
			costr.setDescrProv(objCostr.getDescProvincia());
			costr.setCodReg(objCostr.getIdRegione());
			costr.setDescrReg(objCostr.getDescRegione());
			costr.setTel(objCostr.getTelefono());
			costr.setCell(objCostr.getCell());
			costr.setFax(objCostr.getFax());
			costr.setEmail(objCostr.getEmail());
			costr.setNumCiv(objCostr.getNumCivico());



			resp.setDtCostruttore(costr);
			resp.setDtDirLavori(dirLav);
			resp.setDtProgettista(prog);
			anagImmobile.setDtResponsabili(resp);

			ret.setDatiAnagraficiImm(anagImmobile);

			DtDichiarazFinale dichiarazioneFinale = new DtDichiarazFinale();

			//		SiceeTCertificato

			dichiarazioneFinale.setCodDichiaraz(obj9.getFkDichiarazione());
			dichiarazioneFinale.setDataDichiarazione(obj9.getDtInizio());
			dichiarazioneFinale.setLuogoDichiarazione(obj9.getLuogoDichiarazione());

			ret.setDichiarazioni(dichiarazioneFinale);

			DtEnergiaFontiRinnov energiaFontiRinnov = new DtEnergiaFontiRinnov();

			//		SiceeTEnergiaSoprIngr

			energiaFontiRinnov.setAutoconsumoElettrico(obj3.getAutoconsElett());
			energiaFontiRinnov.setAutoconsumoTermico(obj3.getAutoconsTermico());
			energiaFontiRinnov.setEnergElettricaProdotta(obj3.getEnElettProd());
			energiaFontiRinnov.setEnergTermicaProdotta(obj3.getEnTermicaProd());
			energiaFontiRinnov.setTechFontiRinnov(obj3.getTecnoRinno());
			energiaFontiRinnov.setAnnoInstall(convertToString(obj3.getAnnoInstall()));
			
			// CONVERT 2
			energiaFontiRinnov.setPercEnergiaFontiRinnov(obj3.getPercFontiRinnov());


			ret.setEnergRinnov(energiaFontiRinnov);

			DtGasSerra gasSerra = new DtGasSerra();

			//		SiceeTDatiGenerali

			gasSerra.setEmissioniGasSerra(obj2.getEmissioniSerra());

			// CONVERT 5
			gasSerra.setSupBoscoEquiv(obj2.getEttariBosco());

			ret.setGasSerra(gasSerra);

			//DtImpianti impianti = new DtImpianti();
			//		SiceeTImpRiscaldamentoAcs

			DtImpRiscald risc = new DtImpRiscald();
			DtImpAcqua acqua = new DtImpAcqua();

			risc.setCodImpianto(obj5.getCodiceImpianto());
			acqua.setClasseEfficienzaEnerg(convertToString(obj5.getFkClasseEffAcs()));		
			risc.setClasseEfficienzaEnerg(convertToString(obj5.getFkClasseEffRisc()));
			acqua.setCombustibileFossile(convertToString(obj5.getFkCombustibileAcs()));
			risc.setCombustibileFossile(convertToString(obj5.getFkCombustibileRisc()));
			risc.setFlgBollino(obj5.getFlgBollino());
			acqua.setAnnoInstallGeneratore(convertToString(obj5.getGenAnnoAcs()));
			risc.setAnnoInstallGeneratore(convertToString(obj5.getGenAnnoRisc()));
			risc.setNumBollino(obj5.getNumeroBollino());
			acqua.setPotNomCompl(obj5.getPotAcs());
			risc.setPotNomCompl(obj5.getPotRiscaldamento());
			risc.setLimNormRegImpTerm(obj8.getLimiteNormaImp());

			impianti.setAcqua(acqua);
			impianti.setRiscaldamento(risc);

			ret.setImpianti(impianti);

			DtIndiciFabbisogno indiciFabbisogno = new DtIndiciFabbisogno();

			//		SiceeTFabbisogno 

			indiciFabbisogno.setDomEnergAcqua(obj4.getDomAcsQhw());
			indiciFabbisogno.setDomEnergRiscald(obj4.getDomRiscQh());
			indiciFabbisogno.setEnergTermAcquaRinnov(obj4.getEnAcsRinno());
			indiciFabbisogno.setIndPrestEnergAcqua(obj4.getFabbAcs());
			indiciFabbisogno.setFabbCondizionamento(obj4.getFabbCondiz());
			indiciFabbisogno.setIndPrestEnergIlluminaz(obj4.getFabbIllum());
			indiciFabbisogno.setLimNormRegione(obj4.getLimiteRegQhLim());
			
			// CONVERT 5
			indiciFabbisogno.setRendGlobStagioneAcqua(obj4.getRendAcsEtagacs());

			ret.setIndFabbisogno(indiciFabbisogno);

			DtRispettoNorme rispettoNorme = new DtRispettoNorme();

			//		SiceeTRispettoNormative 

			rispettoNorme.setDataTitolo(obj7.getDtTitolo());
			rispettoNorme.setCodNorma(convertToString(obj7.getFkNorma()));
			if (obj7.getFkNorma() != null) {
				rispettoNorme.setDescrNorma(getSiceeDNormativaDao().findByPrimaryKey(obj7.getFkNorma()).getDescr());
			}
			rispettoNorme.setAutorizzato(obj7.getFlgNorma());
			rispettoNorme.setMotivoNonConformita(obj7.getMotivoNonConformita());
			rispettoNorme.setNote(obj7.getNote());

			ret.setRispNorme(rispettoNorme);

			ret.setFlgOldApe(this.convertToBoolean(obj9.getFlgOld()));

			ret.setStatus(obj9.getFkStato());
		} catch (Exception e) {			
			throw new SiceesrvException(e.getMessage(), e);
		}
		return ret;
	}

	private DatiAttestato mapToModelFromDB(SiceeTDatiGenerali obj2, SiceeTCertificato obj9, List<SiceeTDatiCatastSec> obj10, List<SiceeTFoto2015> objFotoList, SiceeTAltreInfo obj8)
			throws SiceesrvException {

		DatiAttestato ret = new DatiAttestato();
		try {
			DtAltreInfo altreInfo = new DtAltreInfo();
			// SiceeTAltreInfo
			altreInfo.setFlgEdificioPerformante(BaseMgr.convertToBoolean(obj9
					.getFlgEdificioPerformante()));
			altreInfo.setFlgSigmater(BaseMgr.convertToBoolean(obj9
					.getFlgSigmater()));


			DtTecniciGen tecniciGen = new DtTecniciGen();
			// SiceeTDatiGenerali

			tecniciGen.setFlagUsoPubblico(obj2.getFlagUsoPubblico());
			tecniciGen.setAnnoCostr(this.convertToString(obj2
					.getAnnoCostruzione()));
			tecniciGen.setAnnoUltimaRistrutt(this.convertToString(obj2
					.getAnnoUltRist()));
			tecniciGen.setDestUso(this.convertToString(obj2.getFkDestUso2015()));

			/*
			tecniciGen.setCarattEdificio(obj2.getFkCarattEdificio());

			if (tecniciGen.getCarattEdificio() != null) {
				tecniciGen.setTipoEdificio(this.convertToString(this
						.getSiceeDCarattEdificioDao()
						.findByPrimaryKey(obj2.getFkCarattEdificio())
						.getFkTipoEdificio()));
				// tecniciGen.setTipoImpianto(convertToString(getSiceeDTipoEdificioDao().findByPrimaryKey(convertToInteger(tecniciGen.getTipoEdificio())).getFkTipoImpianto()));
			}
				*/
			
			tecniciGen.setDescrizioneEdificio(obj2.getDescTipoEdificio());
			tecniciGen.setSuperficieUtile(obj2.getSu());
			tecniciGen
					.setSupDispTot(obj2.getSupDisperdenteTot());
			tecniciGen.setTrasmittanzaOpache(obj2
					.getTrasmOpache());
			tecniciGen
					.setTrasmittanzaTrasp(obj2.getTrasmTrasp());
			tecniciGen.setVolLordoRiscald(obj2
					.getVolLordoRiscaldato());
			tecniciGen.setFattoreForma(obj2.getFattoreForma());

			ret.setDatiTecnici(tecniciGen);

			DtDichiarazFinale dichiarazioneFinale = new DtDichiarazFinale();

			dichiarazioneFinale.setCodDichiaraz(obj9.getFkDichiarazione());
			dichiarazioneFinale.setDataDichiarazione(obj9.getDtInizio());
			dichiarazioneFinale.setLuogoDichiarazione(obj9
					.getLuogoDichiarazione());

			ret.setDichiarazioni(dichiarazioneFinale);
			
			DtAnagImmobile anagImmobile = new DtAnagImmobile();

			// SiceeTCertificato

			DtCatastali cat = new DtCatastali();
			DtCoCertificatore coCert = new DtCoCertificatore();

			cat.setCodProv(obj9.getIdProv());
			cat.setDescrProv(obj9.getDescProv());
			cat.setCodComune(obj9.getIdComune());
			cat.setDescrComune(obj9.getDescComune());
			cat.setCodIndirizzo(obj9.getIdIndirizzo());
			cat.setDescrIndirizzo(obj9.getDescIndirizzo());
			cat.setNumCiv(obj9.getNumCivico());
			
			/*
			if (obj9.getFkStato() != null && obj9.getFkStato().intValue() != Constants.NUOVO)
			{
				log.debug("****************COORDINATA NORD LETTA DA DB=" + obj9.getCoordN());
				log.debug("****************COORDINATA NORD TRASFORMATA DA DB=" + Double.toString(obj9.getCoordN()));
				
				cat.setCoordN(Double.toString(obj9.getCoordN()));
				
				log.debug("****************COORDINATA EST LETTA DA DB=" + obj9.getCoordE());
				log.debug("****************COORDINATA EST TRASFORMATA DA DB=" + Double.toString(obj9.getCoordE()));
				
				cat.setCoordE(Double.toString(obj9.getCoordE()));
			}
			*/
			// Beppe 10/01/2012
			// cat.setFlgCondominio(obj9.getFlgCondominio());

			cat.setCap(obj9.getCap());
			cat.setSezione(obj9.getSezione());
			cat.setFoglio(obj9.getFoglio());
			cat.setParticella(obj9.getParticella());
			cat.setSubalterno(obj9.getSubalterno());
			cat.setPiano(obj9.getPiano());
			cat.setPianiTot(obj9.getNumPianiComplessivi());
			cat.setNumUnita(obj9.getNumAppartamenti());
			cat.setScala(obj9.getScala());
			cat.setInterno(obj9.getInterno());
			cat.setNote(obj9.getNote());
			cat.setUidDoc(obj9.getIdentificPdf());
			cat.setNomeDoc(obj9.getNomePdf());
			
			cat.setCodComunaleCatastale(obj9.getCodiceComuneCatastale());

			/*
			if (!isNullOrEmpty(obj9.getRifCatasto()))
			{
				cat.setSistCatast(obj9.getRifCatasto());
			}
			else
			{
				cat.setSistCatast("NCEU");
			}
			
			cat.setCodComuneCatasto(obj9.getCodiceComuneCatastale());
			
			if (objFotoList != null && objFotoList.size() > 0)
			{
				SiceeTFoto2015 objFoto = objFotoList.get(0); // Per adesso ne gestiamo solo una
				cat.setIdFoto(objFoto.getIdFoto());
				cat.setNomeFoto(objFoto.getNomeFoto());
				cat.setUidFoto(objFoto.getIdentificFoto());
				cat.setDataUpFoto(convertToStringDataCompleta(objFoto
						.getDtFoto()));
			}
			*/
			//cat.setGradiGiorno(this.convertTo(obj2.getGradiGiorno()));
			cat.setZonaClimatica(obj2.getZonaClimatica());

			ret.setStatus(obj9.getFkStato());
			ret.setDataScadenza(convertToString(obj9.getDtScadenza()));
			ret.setDataUpload(convertToString(obj9.getDtUpload()));
			
			coCert.setNome(obj9.getNomeCocertificatore());
			coCert.setCognome(obj9.getCognomeCocertificatore());
			coCert.setNumMatricola(obj9.getNumCocertificatore());
			coCert.setCodFisc(obj9.getCodFiscCocertificatore());
			
			//log.debug("\n\n\n>>>>>>> COCERTIFICATORE NOME: " + coCert.getNome());
			//log.debug("\n>>>>>>> COCERTIFICATORE COGNOME: " + coCert.getCognome());
			//log.debug("\n>>>>>>> COCERTIFICATORE NUM MATRICOLA: " + coCert.getNumMatricola());			

			ArrayList<DtCatastaliSecondari> listDtCatastaliSecondari = new ArrayList<DtCatastaliSecondari>();
			for (int i = 0; i < obj10.size(); i++) 
			{
				SiceeTDatiCatastSec tDaticatastSec = obj10.get(i);
				//log.debug("\n\n\n>>>>>>> CODICE CATASTALE COMUNE: " + tDaticatastSec.getCodiceComuneCatastale());
				DtCatastaliSecondari datCatSec = new DtCatastaliSecondari();
				datCatSec.setId(""+i);
				datCatSec.setCodProv(tDaticatastSec.getIdProv());

				datCatSec.setDescrProv(tDaticatastSec.getDescProv());
				datCatSec.setCodComune(tDaticatastSec.getIdComune());
				datCatSec.setDescrComune(tDaticatastSec.getDescComune());
				datCatSec.setSezione(tDaticatastSec.getSezione());
				datCatSec.setFoglio(tDaticatastSec.getFoglio());
				datCatSec.setParticella(tDaticatastSec.getParticella());
				datCatSec.setSubalterno(tDaticatastSec.getSubalterno());
				datCatSec.setCodiceComuneCatastale(tDaticatastSec.getCodiceComuneCatastale());
				listDtCatastaliSecondari.add(datCatSec);
				
			}
			cat.setDtCatastaliSecondari(listDtCatastaliSecondari);
			

			
			anagImmobile.setDtCatastali(cat);
			anagImmobile.setDtCoCertificatore(coCert);

			ret.setDatiAnagraficiImm(anagImmobile);
			
			ret.setFlgOldApe(this.convertToBoolean(obj9.getFlgOld()));

			//ret.setFlgOldApe(convertToBoolean(obj9.getFlgOld()));
			ret.setStatus(obj9.getFkStato());
		} catch (Exception e) {
			throw new SiceesrvException(e.getMessage(), e);
		}
		return ret;
	}
	
	/**
	 * Proporzione qh.
	 *
	 * @param value the value
	 * @return the float
	 */
	public float proporzioneQh(float value) {
		if (value > 400)
			return 100;
		if (value < 0)
			return 0;

		return value/4; //(v*100/400)
	}

	/**
	 * Proporzione fabbisogno energetico acs.
	 *
	 * @param value the value
	 * @return the float
	 */
	public float proporzioneFabbisognoEnergeticoAcs(float value) {
		if (value > 100)
			return 100;
		if (value < 0)
			return 0;

		return value; //(v*100/100)
	}

	/**
	 * Proporzione gas serra.
	 *
	 * @param value the value
	 * @return the float
	 */
	public float proporzioneGasSerra(float value) {
		if (value > 100)
			return 100;
		if (value < 0)
			return 0;

		return value; //(v*100/100)
	}
	
	/**
	 * Convert to ace.
	 *
	 * @param cert the cert
	 * @param tore the tore
	 * @return the ace
	 */
	private Ace convertToAce(SiceeTCertificato cert, SiceeTCertificatore tore) {
		if (cert ==  null)
			return null;
		
		Ace a = new Ace();
		a.setComune(cert.getDescComune());
		a.setDataInvio(cert.getDtInizio());
		a.setDataUpload(cert.getDtUpload());
		a.setDataScadenza(cert.getDtScadenza());
		a.setIndirizzo(cert.getDescIndirizzo());
		a.setProvincia(cert.getDescProv());
		a.setAnno(cert.getAnno());
		a.setNumero(cert.getProgrCertificato());
		a.setCertificatore(tore.getNumCertificatore());
		a.setCivico(cert.getNumCivico());
		a.setUid(cert.getIdentificPdf());
		a.setCognome(tore.getCognome());
		a.setNome(tore.getNome());
		a.setIdStato(cert.getFkStato());
		a.setUidFoto(cert.getIdentificFoto());
		
		return a;
		
	}
	
	/**
	 * Convert to ace.
	 *
	 * @param cert the cert
	 * @param tore the tore
	 * @return the ace
	 */
	private Ace convertToAce(OptimizedSiceeTCerticato cert) {
		if (cert ==  null)
			return null;


		Ace a = new Ace();
		a.setComune(cert.getDescComune());
		a.setDataInvio(cert.getDtInizio());
		a.setDataUpload(cert.getDtUpload());
		a.setDataScadenza(cert.getDtScadenza());
		a.setIndirizzo(cert.getDescIndirizzo());
		a.setProvincia(cert.getDescProv());
		a.setAnno(cert.getAnno());
		a.setNumero(cert.getProgrCertificato());
		a.setCertificatore(cert.getNumCertificatore());
		a.setCivico(cert.getNumCivico());
		//a.setUid(cert.getIdentificPdf());

		//a.setCognome(cert.getCognome());
		//a.setNome(cert.getNome());
		
		String datiCat = "Sez. " + trimToEmpty(cert.getSezione())
				+ " F. " + trimToEmpty(cert.getFoglio()) + " N. "
				+ trimToEmpty(cert.getParticella()) + " Sub. "
				+ trimToEmpty(cert.getSubalterno());

		a.setDescDatiCat(datiCat);
		
		
		a.setIdStato(cert.getFkStato());
		a.setDescStato(cert.getDescStato());

//		public static final int NUOVO = 0;
//		public static final int BOZZA = 1;
//		
//		public static final int CONSOLIDATO = 2; visualizza_cons
//		public static final int INVIATO = 3; viasualizza_inviato; ricevuta; targhetta
//		public static final int ANNULLATO = 4; visualizza_cons (rigenerare con stato annullato e con scritta ANNULLATO)
//		public static final int DA_INVIARE (X_SOSTITUZIONE) = 5; visualizza_cons
//		
//		public static final int SOSPESO = 6;
//		public static final int CANCELLATO = 7;
//		public static final int INVALIDATO = 8;
		
		
		
		
		
		//public static final int INVIATO_ANNULLATO = 99;
		
		

		if (a.getIdStato() == Constants.CONSOLIDATO ||
				a.getIdStato() == Constants.INVIATO ||
				a.getIdStato() == Constants.ANNULLATO ||
				a.getIdStato() == Constants.ANNULLATO_BO ||
				a.getIdStato() == Constants.DA_INVIARE)
		{
			a.setUid("ok");
		}
		
		if (cert.getFlgOld().equalsIgnoreCase(Constants.NO))
		{
			if (a.getIdStato() == Constants.INVIATO)
			{
				a.setUidIndicatore("ok");
			}
		}
		
		/*
		a.setUidFoto(cert.getNomiFile());
		//a.setUid(cert.getIdentificPdf());
		
		if (!isNullOrEmpty(cert.getNomiFile()))
		{
		
			//String prova = "2;uidddddddd;provaPDF APE firmato|3;uidddddddd;provaPDF APE firmato";
			
			StringTokenizer st = new StringTokenizer(cert.getNomiFile(), "|");
			
			while (st.hasMoreElements()) {
				String doc = (String) st.nextElement();
				
				//System.out.println("doc: "+doc);
				
				StringTokenizer stDoc = new StringTokenizer(doc, ";");
	
				String id = (String) stDoc.nextElement();
				String uid = (String) stDoc.nextElement();
				
				if (id.equals(Constants.ID_TIPO_DOC_APE_FIRMATO))
				{
					a.setUid(uid);
				}
				else if (id.equals(Constants.ID_TIPO_DOC_APE_INDICATORE))
				{
					a.setUidIndicatore(uid);
				}
			}
		}
		*/
		return a;
		
	}
	
	private List<LabelValue> getLabelValueListFromAttestato(
			String numAttestato, SiceeTCertificato tCert, SiceeTDatiGenerali tDatiGen, List<SiceeTDatiCatastSec> tDatiCatastSecList,
			SiceeTAltreInfo tAltreInfo, SiceeTDatiEner2015 tDatiEner, List<SiceeTQtaConsumi2015> tQtaConsList, 
			List<SiceeTRaccomand2015> tRaccList, List<SiceeRCombDener2015> rCombDenerList, 
			List<SiceeRCertifServener2015> rCertifServener, ApeDto apeDto) throws DaoException {

		ArrayList<LabelValue> labelValueList = new ArrayList<LabelValue>();

		LabelValue labelValue = new LabelValue();
		
		
		labelValue.setLabel("<u><b>DATI ANAGRAFICI IMMOBILE</b></u>");
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Codice A.P.E.");
		labelValue.setValue(numAttestato);
		labelValueList.add(labelValue);

		// SICEE-507, Mariuccia ha detto di mettere la data solo nel risultato della ricerca
		// e non sul report, visto che qui manca anche data invio APE e stato dell'APE, quindi non ha senso mettere solo la scadenza
//		labelValue = new LabelValue();
//		labelValue.setLabel("Data scadenza");
//		labelValue.setValue(GenericUtil.convertToString(tCert.getDtScadenza()));
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Provincia");
		labelValue.setValue(convertToStringForReport(
				tCert.getDescProv()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Comune");
		labelValue.setValue(tCert.getDescComune());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Codice comune catastale");
		labelValue.setValue(tCert.getCodiceComuneCatastale());
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Zona climatica");
		labelValue.setValue(tDatiGen.getZonaClimatica());
		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Gradi giorno");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getDatiAnagraficiImm().getDtCatastali()
//						.getGradiGiorno()));
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indirizzo");
		String value = tCert.getDescIndirizzo();
		if (tCert.getNumCivico() != null)
			value = value
					+ ","
					+ tCert.getNumCivico();
		labelValue.setValue(value);
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("CAP");
		labelValue.setValue(tCert.getCap());
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue.setLabel("Piano");
		labelValue.setValue(convertToStringForReport(
				tCert.getPiano()));
		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Piani totali");
//		labelValue.setValue(convertToStringForReport(
//						attestato.getDatiAnagraficiImm().getDtCatastali()
//								.getPianiTot()));
//		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("N.appart./Unita'");
//		labelValue.setValue(convertToStringForReport(
//						attestato.getDatiAnagraficiImm().getDtCatastali()
//								.getNumUnita()));
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Interno");
		labelValue.setValue(tCert.getInterno());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Scala");
		labelValue.setValue(tCert.getScala());
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("n. piani complessivi");
		labelValue.setValue(convertToStringForReport(
				tCert.getNumPianiComplessivi()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("n. piani fuori terra risc.");
		labelValue.setValue(convertToStringForReport(
				tCert.getNumPianiFTRisc()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Sistema catastale");
		
		value = "";
		if (tCert.getRifCatasto() != null)
		{
			if (tCert.getRifCatasto().equalsIgnoreCase(Constants.COD_NCEU))
			{
				value = "CF Catasto Fabbricati";
			}
			else if (tCert.getRifCatasto().equalsIgnoreCase(Constants.COD_NCT))
			{
				value = "CT Catasto Terreni";
			}

			labelValue.setValue(value); 
			labelValueList.add(labelValue);
		}
		
		labelValue = new LabelValue();
		labelValue.setLabel("Sezione");
		labelValue
				.setValue(getStringNotNull(
						tCert.getSezione()));
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Foglio");
		labelValue.setValue(tCert.getFoglio());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Particella");
		labelValue.setValue(tCert.getParticella());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Subalterno");
		labelValue.setValue(getStringNotNull(
				tCert.getSubalterno()));
		labelValueList.add(labelValue);

		// Dati catastali secondari
		//ArrayList<DtCatastaliSecondari> datiCatastaliSecondariList = tDatiCatastSec;
		// DA CONTROLLARE ***
		if (tDatiCatastSecList != null
				&& tDatiCatastSecList.size() > 0) {
			for (int i = 0; i < tDatiCatastSecList.size(); i++) {
				labelValue = new LabelValue();
				value = "";
				labelValue.setLabel("Riferimenti catastali secondari " + (i + 1) + "");
				SiceeTDatiCatastSec datiCatastaliSecondari = tDatiCatastSecList
						.get(i);
				
				//value = value + "Prov:" + datiCatastaliSecondari.getDescProv() + "; ";
				//value = value + "Comune:" + datiCatastaliSecondari.getDescComune() + "; ";
				value = value + "Cod. Catastale Comune:" + datiCatastaliSecondari.getCodiceComuneCatastale() + "; ";
				if (datiCatastaliSecondari.getSezione() != null)
					value = value
							+ "Sez:"
							+ convertToStringForReport(
									datiCatastaliSecondari.getSezione()) + "; ";
				value = value
						+ "F:"
						+ convertToStringForReport(
								datiCatastaliSecondari.getFoglio()) + "; ";
				value = value
						+ "N:"
						+ convertToStringForReport(
								datiCatastaliSecondari.getParticella());
				if (datiCatastaliSecondari.getSubalterno() != null)
					value = value
							+ "; Sub:"
							+ convertToStringForReport(
									datiCatastaliSecondari.getSubalterno());
				labelValue.setValue(value);
				labelValueList.add(labelValue);

			}
		} else {
			labelValue = new LabelValue();
			labelValue.setLabel("Riferimenti catastali secondari");
			labelValue.setValue("-");
			labelValueList.add(labelValue);
		}

		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Coordinate GIS");
		labelValue.setValue(tCert.getCoordN() + "; " + tCert.getCoordE());
		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Progettista");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getDatiAnagraficiImm().getDtResponsabili()
//						.getDtProgettista().getNome())
//				+ " "
//				+ getStringNotNull(
//						attestato.getDatiAnagraficiImm().getDtResponsabili()
//								.getDtProgettista().getCognome()));
//		labelValueList.add(labelValue);
//
//		labelValue = new LabelValue();
//		labelValue.setLabel("Direttore lavori");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getDatiAnagraficiImm().getDtResponsabili()
//						.getDtDirLavori().getNome())
//				+ " "
//				+ convertToStringForReport(
//						attestato.getDatiAnagraficiImm().getDtResponsabili()
//								.getDtDirLavori().getCognome()));
//		labelValueList.add(labelValue);
//
//		labelValue = new LabelValue();
//		labelValue.setLabel("Costruttore");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getDatiAnagraficiImm().getDtResponsabili()
//						.getDtCostruttore().getNome())
//				+ " "
//				+ convertToStringForReport(
//						attestato.getDatiAnagraficiImm().getDtResponsabili()
//								.getDtCostruttore().getCognome()));
//		labelValueList.add(labelValue);
//
//		labelValue = new LabelValue();
//		labelValue.setLabel("Co-certificatore");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getDatiAnagraficiImm().getDtCoCertificatore()
//						.getNome())
//				+ " "
//				+ convertToStringForReport(
//						attestato.getDatiAnagraficiImm().getDtCoCertificatore()
//								.getCognome())
//				+ " "
//				+ convertToStringForReport(
//						attestato.getDatiAnagraficiImm().getDtCoCertificatore()
//								.getNumMatricola()));
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI TECNICI GENERALI</b></u>");
		labelValueList.add(labelValue);
				
		labelValue = new LabelValue();
		labelValue.setLabel("Destinazione d'uso");

		value = "";
		if (!isNullOrEmpty(tDatiGen.getFkDestUso2015()))
		{
			SiceeDDestUso2015 uso =  getSiceeDDestUso2015Dao().findByPrimaryKey(tDatiGen.getFkDestUso2015());

			if (uso != null)
			{
				value = uso.getSigla();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Oggetto attestato");
		
		if (!isNullOrEmpty(tDatiGen.getFkOggettoApe()))
		{
			SiceeDOggettoApe2015 oggetto =  getSiceeDOggettoApe2015Dao().findByPrimaryKey(tDatiGen.getFkOggettoApe());

			if (oggetto != null)
			{
				value = oggetto.getDescr();
				
				if (!isNullOrEmpty(tDatiGen.getNrUm()))
				{
					value += " " + tDatiGen.getNrUm();
				}
			}
		}		
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Motivo");
		value = "";
		SiceeDMotivoRilascio motivo = getSiceeDMotivoRilascioDao().findByPrimaryKey(tAltreInfo.getFkMotivo());
			
		value += motivo.getDescr();
		
		/*
		if (!isNullOrEmpty(tAltreInfo.getMotivoAltro()))
		{
			value += " " + tAltreInfo.getMotivoAltro();
		}
		*/
		if ((!isNullOrEmpty(tAltreInfo.getAltroServiziEnergia())) &&
				(tAltreInfo.getAltroServiziEnergia() != 0))
		{
			motivo = getSiceeDMotivoRilascioDao().findByPrimaryKey(tAltreInfo.getAltroServiziEnergia());
			value += " - ";
			value += motivo.getDescr();
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
				
		labelValue = new LabelValue();
		labelValue.setLabel("Anno Costruzione");
		labelValue.setValue(convertToStringForReport(tDatiGen.getAnnoCostruzione()));
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Anno Ultima ristrutturazione");
		labelValue.setValue(convertToStringForReport(tDatiGen.getAnnoUltRist()));
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Tipologia ristrutturazione");
		if (getSiceeDTipoRistrutt2015Dao().findByPrimaryKey(tDatiGen.getFkTipoRistrutturaz()) != null)
			labelValue.setValue(getSiceeDTipoRistrutt2015Dao().findByPrimaryKey(tDatiGen.getFkTipoRistrutturaz()).getDescr());
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipologia edilizia");
		if (getSiceeDTipolEdilizia2015Dao().findByPrimaryKey(tDatiGen.getFkTipolEdilizia()) != null)
			labelValue.setValue(getSiceeDTipolEdilizia2015Dao().findByPrimaryKey(tDatiGen.getFkTipolEdilizia()).getDescr());
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipologia costruttiva");
		if (getSiceeDTipolCostrutt2015Dao().findByPrimaryKey(tDatiGen.getFkTipolCostruttiva()) != null)
			labelValue.setValue(getSiceeDTipolCostrutt2015Dao().findByPrimaryKey(tDatiGen.getFkTipolCostruttiva()).getDescr());
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Proprieta' edificio");
		if (getSiceeDProprietaEdif2015Dao().findByPrimaryKey(tDatiGen.getFkProprietaEdi()) != null)
			labelValue.setValue(getSiceeDProprietaEdif2015Dao().findByPrimaryKey(tDatiGen.getFkProprietaEdi()).getDescr());
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		
		//DA SCOMMENTARE X ADESSO DA ECCEZIONE PERCHE' NON C'E' NIENTE
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>PRESTAZIONE ENERGETICA GLOBALE</b></u>");
		labelValueList.add(labelValue);

				labelValue = new LabelValue();
		labelValue.setLabel("Edificio ad energia quasi zero");
		if (tDatiEner.getFlgEdifE0() != null
				&& tDatiEner.getFlgEdifE0()
				.equalsIgnoreCase(Constants.SI))
			labelValue.setValue(Constants.LABEL_SI);
		else if (tDatiEner.getFlgEdifE0() != null
				&& tDatiEner.getFlgEdifE0()
				.equalsIgnoreCase(Constants.NO))
			labelValue.setValue(Constants.LABEL_NO);
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		
		
//		labelValue = new LabelValue();
//		labelValue.setLabel("Classe energetica");
//		labelValue.setValue(tDatiEner.getFkClasseEnergetica());
//		labelValueList.add(labelValue);

		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Classe energetica");
		
		value = "";
		if (!isNullOrEmpty(tDatiEner.getFkClasseEnergetica()))
		{
			SiceeDClasseEnergetica classe =  getSiceeDClasseEnergeticaDao().findByPrimaryKey(tDatiEner.getFkClasseEnergetica());

			if (classe != null)
			{
				value = classe.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("EPgl,nren [kWh/m2 anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEpglNrenGlobale()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("EPgl,ren [kWh/m2 anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEpglRenGlobale()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Emissioni di CO2 [kg/m2 anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEmissioniCo2()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia esportata [kWh/anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEnergiaEsportata()));
		labelValueList.add(labelValue);

		
		
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Vettore energetico");
		
		
		value = null;
		for (SiceeRCombDener2015 rCombDener : rCombDenerList) {
			
			SiceeDCombustibile combu =  getSiceeDCombustibileDao().findByPrimaryKey(rCombDener.getIdCombustibile());
			
			if (value != null)
			{
				value += ", ";
			}
			else
			{
				value = "";
			}
					
			
			value += combu.getDescr();
			
			if (!isNullOrEmpty(rCombDener.getDescrAltro()))
			{
				value += " " + rCombDener.getDescrAltro();
			}
			
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI FABBRICATO</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Superficie utile riscaldata [m2]");
		labelValue.setValue(convertToStringForReport(tDatiGen.getSupRiscaldata()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Superficie utile raffrescata [m2]");
		labelValue.setValue(convertToStringForReport(tDatiGen.getSupRaffrescata()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("V - Volume lordo riscaldato [m3]");
		labelValue.setValue(convertToStringForReport(tDatiGen.getVolLordoRiscaldato()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Volume lordo raffrescato [m3]");
		labelValue.setValue(convertToStringForReport(tDatiGen.getVolLordoRaffrescato()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("S - Superficie disperdente [m2]");
		labelValue.setValue(convertToStringForReport(tDatiGen.getSupDisperdenteTot()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rapporto S/V");
		//labelValue.setValue(tDatiGen.get); // DA FARE
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("EPh,nd [kWh/m2 anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEph()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("EPh,nd limite [kWh/m2 anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEphLimite()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("EPgl,nren riferimento [kWh/m2 anno]");
		labelValue.setValue(convertToStringForReport(tDatiEner.getEpglNrenRif()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Asol,est/Asup utile");
		labelValue.setValue(convertToStringForReport(tDatiEner.getAsolAsup()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Yie");
		labelValue.setValue(convertToStringForReport(tDatiEner.getYie()));
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CONSUMI ENERGIA</b></u>");
		labelValueList.add(labelValue);
		
		SiceeDCombustibile dCombu = null;
		SiceeDUnitaMisura2015 dUnita = null;

		String label = "";
		for (SiceeTQtaConsumi2015 tQta : tQtaConsList) {
			dCombu =  getSiceeDCombustibileDao().findByPrimaryKey(tQta.getFkCombustibile());
			
			label = "";
			
			labelValue = new LabelValue();
			
			label += dCombu.getDescr();
			
			if (!isNullOrEmpty(tQta.getAltroDescrComb()))
			{
				label += " " + tQta.getAltroDescrComb();
			}
			
			labelValue.setLabel(label);
			dUnita = getSiceeDUnitaMisura2015Dao().findByPrimaryKey(tQta.getFkUnitaMisura());
			value = tQta.getQuantita() + " " + dUnita.getDescr();
			labelValue.setValue(value); 
			labelValueList.add(labelValue);
			
		}
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>RACCOMANDAZIONI</b></u>");
		labelValueList.add(labelValue);
		
		SiceeDRiqEner2015 dRiqEner = null;
		SiceeDClasseEnergetica dClasse = null;
		for (SiceeTRaccomand2015 tRacc : tRaccList) {
			dRiqEner =  getSiceeDRiqEner2015Dao().findByPrimaryKey(tRacc.getCodiceRen());
			label = dRiqEner.getDescr() + " - " + tRacc.getTipoIntervento();
			labelValue = new LabelValue();
			labelValue.setLabel(label);
			dClasse = getSiceeDClasseEnergeticaDao().findByPrimaryKey(tRacc.getFkClasseEnergetica());
			value = tRacc.getEpglNrenSingoloInt() + " - " + dClasse.getDescr();
			labelValue.setValue(value); 
			labelValueList.add(labelValue);
			
		}
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI DETTAGLIO IMPIANTI</b></u>");
		labelValueList.add(labelValue);

		for (SiceeRCertifServener2015 rCert : rCertifServener) {
			labelValue = new LabelValue();
			label = getSiceeDServEner2015Dao().findByPrimaryKey(rCert.getIdServEner()).getDescr();
			value = "";
			// tolgo le bracket della decodifica che è del tipo <sezioneClimaInver>
			label = label.trim();
			label = label.substring(1);
			label = label.substring(0, label.length()-1);
			labelValue.setLabel(label);
			if (!BaseMgr.isNullOrEmpty(rCert.getEfficienza()))
				value = value + "efficienza = " + rCert.getEfficienza() + " --- ";
			if (!BaseMgr.isNullOrEmpty(rCert.getEpren()))
				value = value + "epren = " + rCert.getEpren() + " --- ";
			if (!BaseMgr.isNullOrEmpty(rCert.getEpnren()))
				value = value + "epnren = " + rCert.getEpnren();
			labelValue.setValue(value);
			labelValueList.add(labelValue);
			
			List<SiceeTDetImp2015> tDetImp = getSiceeTDetImp2015Dao().findByServizioEnergetico(rCert.getIdCertificatore(), rCert.getProgrCertificato(), rCert.getAnno(), rCert.getIdServEner());
			for (SiceeTDetImp2015 t : tDetImp) {
				labelValue = new LabelValue();
				label = "";
				value = "";
				if (!BaseMgr.isNullOrEmpty(t.getProgressivoDett()))
					value = value + "IMPIANTO  " + t.getProgressivoDett() + " --- ";
				if (t.getFkCombustibile() != null) {
					SiceeDCombustibile siceeDCombustibile = getSiceeDCombustibileDao().findByPrimaryKey(t.getFkCombustibile());
					value = value + "combustibile = " + siceeDCombustibile.getDescr() + " --- ";
				}
				if (!BaseMgr.isNullOrEmpty(t.getTipoImpianto()))
					value = value + "tipo impianto = " + t.getTipoImpianto() + " --- ";
				if (!BaseMgr.isNullOrEmpty(t.getAnnoInstall()))
					value = value + "anno install. = " + t.getAnnoInstall() + " --- ";
				if (!BaseMgr.isNullOrEmpty(t.getPotenzaNominKw()))
					value = value + "potenza nom. kw = " + t.getPotenzaNominKw() + " --- ";
				value = value + "codice cit = " + t.getCodiceImpiantoCit();
				labelValue.setValue(value);
				labelValueList.add(labelValue);
			}
		}		
		
		String indirizzo = "";
		String civico = "";
		String comune = "";
		String prov = "";
		
		if (apeDto.getDescIndirizzoCertificatore() != null)
			indirizzo = apeDto.getDescIndirizzoCertificatore();
		if (apeDto.getNumCivicoResidenza() != null)
			civico = apeDto.getNumCivicoResidenza();
		if (apeDto.getDescComuneResidenza() != null)
			comune = apeDto.getDescComuneResidenza();
		if (apeDto.getDescProvResidenza() != null)
			prov = apeDto.getDescProvResidenza();
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI CERTIFICATORE</b></u>");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Nome e Cognome/Denominazione");
		labelValue.setValue(apeDto.getNome() + " " + apeDto.getCognomeRagSociale());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indirizzo");
		labelValue.setValue(indirizzo + " " + civico + " " + comune + " (" + prov  + ")");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("E-mail");
		if (!BaseMgr.isNullOrEmpty(apeDto.getEmail()))
			labelValue.setValue(apeDto.getEmail());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Telefono");
		if (!BaseMgr.isNullOrEmpty(apeDto.getTelefono()))
			labelValue.setValue(apeDto.getTelefono());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Titolo");
		if (!BaseMgr.isNullOrEmpty(apeDto.getDTitolo()))
			labelValue.setValue(apeDto.getDTitolo());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ordine/iscrizione");
		if (!BaseMgr.isNullOrEmpty(apeDto.getIscrittoOrdine()))
			labelValue.setValue(apeDto.getIscrittoOrdine());
		labelValueList.add(labelValue);
	
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI CO-CERTIFICATORE</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Codice fiscale");
		if (!BaseMgr.isNullOrEmpty(tCert.getCodFiscCocertificatore()))
			labelValue.setValue(tCert.getCodFiscCocertificatore());
		labelValueList.add(labelValue);
		
		value = "";
		labelValue = new LabelValue();
		labelValue.setLabel("Nominativo");
		if (!BaseMgr.isNullOrEmpty(tCert.getCognomeCocertificatore()))
			value = value + tCert.getCognomeCocertificatore();
		if (!BaseMgr.isNullOrEmpty(tCert.getNomeCocertificatore()))
			value = value + tCert.getNomeCocertificatore();
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Num. iscrizione");
		if (!BaseMgr.isNullOrEmpty(tCert.getNumCocertificatore()))
			labelValue.setValue(tCert.getNumCocertificatore());
		labelValueList.add(labelValue);
		
		/*
		labelValue = new LabelValue();
		labelValue.setLabel("Tipo impianto");

		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getTipoImpianto()))
		{
			SiceeDTipoImpianto imp =  getSiceeDTipoImpiantoDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getTipoImpianto()));

			if (imp != null)
			{
				value = imp.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Tipologia dell'edificio");

		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
		{
			Integer idTipoEdificio = getSiceeDCarattEdificioDao()
			.findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio()).getFkTipoEdificio();
			
			SiceeDTipoEdificio tipoEd =  getSiceeDTipoEdificioDao().findByPrimaryKey(idTipoEdificio);

			if (tipoEd != null)
			{
				value = tipoEd.getDescr();
			}
		}
		
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Caratteristiche dell'edificio ");
		
		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
		{
			SiceeDCarattEdificio carEd =  getSiceeDCarattEdificioDao().findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio());

			if (carEd != null)
			{
				value = carEd.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Edificio pubblico o ad uso pubblico");
		if (attestato.getDatiTecnici().getFlagUsoPubblico() != null
				&& attestato.getDatiTecnici().getFlagUsoPubblico()
						.equalsIgnoreCase(Constants.SI))
			labelValue.setValue(Constants.LABEL_SI);
		else if (attestato.getDatiTecnici().getFlagUsoPubblico() != null
				&& attestato.getDatiTecnici().getFlagUsoPubblico()
						.equalsIgnoreCase(Constants.NO))
			labelValue.setValue(Constants.LABEL_NO);
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno costruzione");
		labelValue.setValue(attestato.getDatiTecnici().getAnnoCostr());
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Anno ultima ristrutturazione");
		labelValue.setValue(attestato.getDatiTecnici().getAnnoUltimaRistrutt());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Descrizione edificio");
		labelValue
				.setValue(attestato.getDatiTecnici().getDescrizioneEdificio());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue//.setLabel("Superficie utile climatizzata (SU) [m<sup>2</sup>]");
				.setLabel("Superficie utile climatizzata (SU) [m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getSuperficieUtile()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Volume lordo riscaldato (V) [m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getVolLordoRiscald()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Superficie disperdente totale (S) [m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getSupDispTot()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Fattore Forma (S/V) [m-1]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getFattoreForma()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue
				.setLabel("Trasmittanza media superfici opache verticali [W/m2*K]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getTrasmittanzaOpache()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue
				.setLabel("Trasmittanza media superfici trasparenti [W/m2*K]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getTrasmittanzaTrasp()));
		labelValueList.add(labelValue);

		// ------------> Fabbisogno

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>INDICI DI FABBISOGNO</b></u>");
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile ideale (QH,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getDomEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Limite normativo regionale [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getLimNormRegione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getDomEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria soddisfatto da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getEnergTermAcquaRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica per acqua calda sanitaria (EPacs) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getIndPrestEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia utile per la climatizzazione estiva (QC,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getFabbCondizionamento()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia elettrica per illuminazione [kWh/m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getIndPrestEnergIlluminaz()));
		labelValueList.add(labelValue);

		//-------------> Classe energetica loc. reale
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CLASSE ENERGETICA</b></u>");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di generazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendGeneraz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di regolazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendRegolaz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di emissione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendEmissione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di distribuzione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendDistrib()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento medio globale impianto termico (ETAg)");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendGlobTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica riscaldamento invernale (EPi,r) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica per la climatizzazione estiva");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergCondiz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indice prestazione energetica per illuminazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergIlluminaz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica globale (EPL lordo) [kWh/m2 o kWh/m3] ");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocReale()
								.getIndPrestEnergGlob()));
		labelValueList.add(labelValue);

		//-------------> Classe energetica loc. teorica (Torino)

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile ideale (QH,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getDomEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Limite di normativa regionale [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getLimNormaRegione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica per il riscaldamento invernale (EPiTo) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica().getDomEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria soddisfatto da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getEnergTermAcquaRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica acqua calda sanitaria (EPacs To) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica globale (EPL lordo) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergGlob()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Classe Energetica");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getDescClasseEnerg()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Servizi energetici inclusi nella classificazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getServEnergInclusi()));
		labelValueList.add(labelValue);

		//-------->Energia da fonti rinnovabili 
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>ENERGIA DA FONTI RINNOVABILI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Tecnologie uso fonti rinnovabili");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getTechFontiRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAnnoInstall()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia termica prodotta [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getEnergTermicaProdotta()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia elettrica prodotta [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getEnergElettricaProdotta()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Autoconsumo termico");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAutoconsumoTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Autoconsumo elettrico");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAutoconsumoElettrico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Quota di energia coperta da fonti rinnovabili [%]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getPercEnergiaFontiRinnov()));
		labelValueList.add(labelValue);

		//-------->Altre informazioni - Generali 
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>ALTRE INFORMAZIONI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Motivazione rilascio");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getGenerali().getMotivoRilascio()))
		{
			SiceeDMotivoRilascio motRil =  getSiceeDMotivoRilascioDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getGenerali().getMotivoRilascio()));

			if (motRil != null)
			{
				value = motRil.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Metodologia di calcolo adottata");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getMetodoCalcolo());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Software utilizzato");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getSoftware());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Denominazione produttore");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getDenomProduttore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rispondenza a UNI TS 11300");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getRispondenzaUNITS11300());
		labelValueList.add(labelValue);

		//-------->Altre informazioni -Raccomandazioni
		ArrayList<Raccomandazione> raccomandazioniList = attestato
				.getAltreInfo().getRaccomandazioni();
		if (raccomandazioniList != null && raccomandazioniList.size() > 0) {
			List<SiceeDPriorita> prioritaList = recuperaPriorita();
			for (int i = 0; i < raccomandazioniList.size(); i++) {
				labelValue = new LabelValue();
				value = "";
				labelValue.setLabel("Raccomandazione " + (i + 1) + "");
				Raccomandazione raccomandazione = raccomandazioniList.get(i);
				value = raccomandazione.getIntervento() + "; ";
				if (prioritaList != null) {
					for (int j = 0; j < prioritaList.size(); j++) {
						SiceeDPriorita priorita = prioritaList.get(j);
						if (raccomandazione.getPriorita().equals(
								priorita.getPriorita())) {
							value = value + "PRIO:" + priorita.getDescr()
									+ "; ";
							break;
						}
					}

				}

				value = value + "TdR:" + raccomandazione.getTempoRitorno();
				labelValue.setValue(value);
				labelValueList.add(labelValue);

			}
		} else {
			labelValue = new LabelValue();
			labelValue.setLabel("Raccomandazione");
			labelValue.setValue("-");
			labelValueList.add(labelValue);
		}
		//-------->Altre informazioni - Energetiche

		labelValue = new LabelValue();
		labelValue.setLabel("Classe energetica globale nazionale edificio");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getEnergetiche().getClasseEnergEdificio()))
		{
			SiceeDClasseEnergetica clsEner =  getSiceeDClasseEnergeticaDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getEnergetiche().getClasseEnergEdificio()));

			if (clsEner != null)
			{
				value = clsEner.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica raggiungibile [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getPrestEnergRaggiungibile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica riscaldamento invernale nazionale (EPi naz) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo nazionale per il riscaldamento [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getLimNormaNazRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Qualita' termica estiva edificio (punto 6.1 del D.M. 26 giugno 2009)");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getEnergetiche().getQualitaInvolucroRaffresc()))
		{
			SiceeDQualitaInvolucro qlInv =  getSiceeDQualitaInvolucroDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getEnergetiche().getQualitaInvolucroRaffresc()));

			if (qlInv != null)
			{
				value = qlInv.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Coefficiente di prestazione della pompa calore (se installata)");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getPrestazPompaCalore()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo per prestazione energetica della pompa calore (se installata)");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getLimNormaPrestPompa()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ulteriori informazioni");
		labelValue.setValue(attestato.getAltreInfo().getEnergetiche()
				.getAltreInfo());
		labelValueList.add(labelValue);

		//-------->Altre informazioni - sopralluoghi e dati di ingresso 
		labelValue = new LabelValue();
		labelValue.setLabel("Data effettuazione sopralluoghi");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getSopralluoghi().getData()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Note sopralluoghi");
		labelValue.setValue(attestato.getAltreInfo().getSopralluoghi()
				.getNote());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Dati redazione");

		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getSopralluoghi().getTipoRedazione()))
		{
			SiceeDDatiIngresso datiIng =  getSiceeDDatiIngressoDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getSopralluoghi().getTipoRedazione()));

			if (datiIng != null)
			{
				value = datiIng.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>NORMATIVE ENERGETICHE</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Data delle richiesta del titolo abilitativo a costruire/ristrutturare");
		labelValue.setValue(convertToStringForReport(
				attestato.getRispNorme().getDataTitolo()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Normativa");
		labelValue.setValue(attestato.getRispNorme().getDescrNorma());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Rispetto degli obblighi normativi in campo energetico?");
		if (attestato.getRispNorme().getAutorizzato() != null
				&& attestato.getRispNorme().getAutorizzato()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getRispNorme().getAutorizzato() != null
				&& attestato.getRispNorme().getAutorizzato()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Se no, perche'");
		labelValue.setValue(attestato.getRispNorme().getMotivoNonConformita());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ulteriori note");
		labelValue.setValue(attestato.getRispNorme().getNote());
		labelValueList.add(labelValue);

		//-------->Impianti - riscaldamento
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>IMPIANTI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Impianto col bollino");
		if (attestato.getImpianti().getRiscaldamento().getFlgBollino() != null
				&& attestato.getImpianti().getRiscaldamento().getFlgBollino()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getImpianti().getRiscaldamento().getFlgBollino() != null
				&& attestato.getImpianti().getRiscaldamento().getFlgBollino()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");

		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Numero bollino");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getNumBollino());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Codice impianto");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getCodImpianto());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione generatore");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getAnnoInstallGeneratore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Potenza utile nominale complessiva [kW]");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getRiscaldamento().getPotNomCompl()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo regionale impianto termico (D.G.R. 46-11968)");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getRiscaldamento()
						.getLimNormRegImpTerm()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Classe efficienza energetica per il riscaldamento");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getRiscaldamento().getClasseEfficienzaEnerg()))
		{
			SiceeDClasseEfficienza clsEff =  getSiceeDClasseEfficienzaDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getRiscaldamento().getClasseEfficienzaEnerg()));

			if (clsEff != null)
			{
				value = clsEff.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Fonte energetica utilizzata per il riscaldamento");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getRiscaldamento().getCombustibileFossile()))
		{
			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getRiscaldamento().getCombustibileFossile()));

			if (comb != null)
			{
				value = comb.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Unita' immobiliari servite");
		labelValue.setValue(attestato.getImpianti().getUiServite());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Contabilizzazione/ripartizione");
		if (attestato.getImpianti().getFlgRipartizione() != null
				&& attestato.getImpianti().getFlgRipartizione()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getImpianti().getFlgRipartizione() != null
				&& attestato.getImpianti().getFlgRipartizione()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");

		labelValueList.add(labelValue);


		labelValue = new LabelValue();
		labelValue.setLabel("Tipo terminali erogazione");
		labelValue.setValue(attestato.getImpianti().getTipoTermErogaz());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo di distribuzione");
		labelValue.setValue(attestato.getImpianti().getTipoDistrib());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo di regolazione");
		labelValue.setValue(attestato.getImpianti().getTipoRegolaz());
		labelValueList.add(labelValue);

		//-------->Impianti - acqua calda snitaria
		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione sistema acqua calda sanitaria");
		labelValue.setValue(attestato.getImpianti().getAcqua()
				.getAnnoInstallGeneratore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Potenza utile nominale complessiva acs [kW]");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getAcqua().getPotNomCompl()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Classe efficienza energetica acs");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getAcqua().getClasseEfficienzaEnerg()))
		{
			SiceeDClasseEfficienza clsEff =  getSiceeDClasseEfficienzaDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getAcqua().getClasseEfficienzaEnerg()));

			if (clsEff != null)
			{
				value = clsEff.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Fonte energetica utilizzata acs");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getAcqua().getCombustibileFossile()))
		{
			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getAcqua().getCombustibileFossile()));

			if (comb != null)
			{
				value = comb.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>EMISSIONI GAS SERRA</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Emissioni gas serra [kg/m3 anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getGasSerra().getEmissioniGasSerra()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Superficie ettari bosco equivalente [ha]");
		labelValue.setValue(convertToStringForReport(
				attestato.getGasSerra().getSupBoscoEquiv()));
		labelValueList.add(labelValue);

		

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CONSUMI REALI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Annuale termico da fossile [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoTermicoFossile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Annuale elettrico da fossile [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoElettricoFossile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Annuale termico da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoTermicoRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Annuale elettrico da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoElettricoRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Medio complessivo termico (su 3 anni) [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getMedioTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Medio complessivo elettrico (su 3 anni) [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getMedioElettrico()));
		labelValueList.add(labelValue);

		return labelValueList;
	}
	
	private List<LabelValue> getLabelValueListFromAttestatoOld(
			DatiAttestato attestato) throws DaoException {

		ArrayList<LabelValue> labelValueList = new ArrayList<LabelValue>();

		LabelValue labelValue = new LabelValue();
		
		
		labelValue.setLabel("<u><b>DATI ANAGRAFICI IMMOBILE</b></u>");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getNumeroAttestato()));
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Codice A.P.E.");
		labelValue.setValue(convertToStringForReport(
				attestato.getNumeroAttestato()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Provincia");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCatastali()
						.getDescrProv()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Comune");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getDescrComune());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Zona climatica");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getZonaClimatica());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Gradi giorno");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCatastali()
						.getGradiGiorno()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indirizzo");
		String value = attestato.getDatiAnagraficiImm().getDtCatastali()
				.getDescrIndirizzo();
		if (attestato.getDatiAnagraficiImm().getDtCatastali().getNumCiv() != null)
			value = value
					+ ","
					+ attestato.getDatiAnagraficiImm().getDtCatastali()
							.getNumCiv();
		labelValue.setValue(value);
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("CAP");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getCap());
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue.setLabel("Sezione");
		labelValue
				.setValue(getStringNotNull(
						attestato.getDatiAnagraficiImm().getDtCatastali()
								.getSezione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Foglio");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getFoglio());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Particella");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getParticella());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Subalterno");
		labelValue.setValue(getStringNotNull(
				attestato.getDatiAnagraficiImm().getDtCatastali()
						.getSubalterno()));
		labelValueList.add(labelValue);

		// Dati catastali secondari
		ArrayList<DtCatastaliSecondari> datiCatastaliSecondariList = attestato
				.getDatiAnagraficiImm().getDtCatastali()
				.getDtCatastaliSecondari();

		if (datiCatastaliSecondariList != null
				&& datiCatastaliSecondariList.size() > 0) {
			for (int i = 0; i < datiCatastaliSecondariList.size(); i++) {
				labelValue = new LabelValue();
				value = "";
				labelValue.setLabel("NCEU secondari " + (i + 1) + "");
				DtCatastaliSecondari datiCatastaliSecondari = datiCatastaliSecondariList
						.get(i);
				value = value + "Prov:" + datiCatastaliSecondari.getDescrProv()
						+ "; ";
				value = value + "Comune:"
						+ datiCatastaliSecondari.getDescrComune() + "; ";
				if (datiCatastaliSecondari.getSezione() != null)
					value = value
							+ "Sez:"
							+ convertToStringForReport(
									datiCatastaliSecondari.getSezione()) + "; ";
				value = value
						+ "F:"
						+ convertToStringForReport(
								datiCatastaliSecondari.getFoglio()) + "; ";
				value = value
						+ "N:"
						+ convertToStringForReport(
								datiCatastaliSecondari.getParticella());
				if (datiCatastaliSecondari.getSubalterno() != null)
					value = value
							+ "; Sub:"
							+ convertToStringForReport(
									datiCatastaliSecondari.getSubalterno());
				labelValue.setValue(value);
				labelValueList.add(labelValue);

			}
		} else {
			labelValue = new LabelValue();
			labelValue.setLabel("NCEU secondari");
			labelValue.setValue("-");
			labelValueList.add(labelValue);
		}

		labelValue = new LabelValue();
		labelValue.setLabel("Piano");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCatastali().getPiano()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Piani totali");
		labelValue.setValue(convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCatastali()
								.getPianiTot()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("N.appart./Unita'");
		labelValue.setValue(convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCatastali()
								.getNumUnita()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Scala");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getScala());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Interno");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getInterno());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Note");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getNote());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Progettista");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtResponsabili()
						.getDtProgettista().getNome())
				+ " "
				+ getStringNotNull(
						attestato.getDatiAnagraficiImm().getDtResponsabili()
								.getDtProgettista().getCognome()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Direttore lavori");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtResponsabili()
						.getDtDirLavori().getNome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtResponsabili()
								.getDtDirLavori().getCognome()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Costruttore");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtResponsabili()
						.getDtCostruttore().getNome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtResponsabili()
								.getDtCostruttore().getCognome()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Co-certificatore");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCoCertificatore()
						.getNome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCoCertificatore()
								.getCognome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCoCertificatore()
								.getNumMatricola()));
		labelValueList.add(labelValue);

		

		//labelValueList.add(new LabelValue());
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI TECNICI GENERALI</b></u>");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getNumeroAttestato()));
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Destinazione d'uso");

		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getDestUso()))
		{
			SiceeDDestUso uso =  getSiceeDDestUsoDao().findByPrimaryKey(convertToInteger(attestato.getDatiTecnici().getDestUso()));

			if (uso != null)
			{
				value = uso.getSigla();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<DestUso> destUsoList = (ArrayList<DestUso>) getMiscMgr()
//				.getDestinazioneDuso();
//		Iterator<DestUso> it = destUsoList.iterator();
//		while (it.hasNext()) {
//			DestUso destUso = (DestUso) it.next();
//			if (destUso.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getDestUso()))
//				value = destUso.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo impianto");

		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getTipoImpianto()))
		{
			SiceeDTipoImpianto imp =  getSiceeDTipoImpiantoDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getTipoImpianto()));

			if (imp != null)
			{
				value = imp.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		
//		ArrayList<TipoImpianto> tipiImpiantoList = (ArrayList<TipoImpianto>) getMiscMgr()
//				.getTipiImpianto();
//		value = "";
//		Iterator<TipoImpianto> iteratorTipImp = tipiImpiantoList.iterator();
//		while (iteratorTipImp.hasNext()) {
//			TipoImpianto tipoImpianto = (TipoImpianto) iteratorTipImp.next();
//			if (tipoImpianto.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoImpianto()))
//				value = tipoImpianto.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipologia dell'edificio");

		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
		{
			Integer idTipoEdificio = getSiceeDCarattEdificioDao()
			.findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio()).getFkTipoEdificio();
			
			SiceeDTipoEdificio tipoEd =  getSiceeDTipoEdificioDao().findByPrimaryKey(idTipoEdificio);

			if (tipoEd != null)
			{
				value = tipoEd.getDescr();
			}
		}
		
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		ArrayList<TipoEdificio> TipoEdificioList = (ArrayList<TipoEdificio>) getMiscMgr()
//				.getTipoEdificio();
//		value = "";
//		Iterator<TipoEdificio> itTipEd = TipoEdificioList.iterator();
//		while (itTipEd.hasNext()) {
//			TipoEdificio tipoEdificio = (TipoEdificio) itTipEd.next();
//			if (tipoEdificio.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoEdificio()))
//				value = tipoEdificio.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Caratteristiche dell'edificio ");
		
		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
		{
			SiceeDCarattEdificio carEd =  getSiceeDCarattEdificioDao().findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio());

			if (carEd != null)
			{
				value = carEd.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		ArrayList<CarattEdificio> carattEdificioList = (ArrayList<CarattEdificio>) getMiscMgr()
//				.getCaratteristicheEdificio();
//
//
//		value = "";
//
//		Iterator<CarattEdificio> itCarattEdificio = carattEdificioList
//				.iterator();
//		while (itCarattEdificio.hasNext()) {
//			CarattEdificio carattEdificio = (CarattEdificio) itCarattEdificio
//					.next();
//
//			log.debug("BEPPE: getCod: " + carattEdificio.getCod());
//			if (carattEdificio.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getCarattEdificio())) {
//				value = carattEdificio.getDescr();
//
//			}
//
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Edificio pubblico o ad uso pubblico");
		if (attestato.getDatiTecnici().getFlagUsoPubblico() != null
				&& attestato.getDatiTecnici().getFlagUsoPubblico()
						.equalsIgnoreCase(Constants.SI))
			labelValue.setValue(Constants.LABEL_SI);
		else if (attestato.getDatiTecnici().getFlagUsoPubblico() != null
				&& attestato.getDatiTecnici().getFlagUsoPubblico()
						.equalsIgnoreCase(Constants.NO))
			labelValue.setValue(Constants.LABEL_NO);
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno costruzione");
		labelValue.setValue(attestato.getDatiTecnici().getAnnoCostr());
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Anno ultima ristrutturazione");
		labelValue.setValue(attestato.getDatiTecnici().getAnnoUltimaRistrutt());
		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Tipologia edificio");
//		labelValue.setValue("ANCORA!!!!!");
//		labelValueList.add(labelValue);
		
//		value = "";
//		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
//		{
//			Integer idTipoEdificio = getSiceeDCarattEdificioDao()
//			.findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio()).getFkTipoEdificio();
//			
//			SiceeDTipoEdificio tipoEd =  getSiceeDTipoEdificioDao().findByPrimaryKey(idTipoEdificio);
//
//			if (tipoEd != null)
//			{
//				value = tipoEd.getDescr();
//			}
//		}
		
		
//		ArrayList<TipoEdificio> tipiEdificio = (ArrayList<TipoEdificio>) getMiscMgr()
//				.getTipoEdificio();
//		value = "";
//		Iterator<TipoEdificio> iteratorTE = tipiEdificio.iterator();
//		while (iteratorTE.hasNext()) {
//			TipoEdificio tipoEdificio = (TipoEdificio) iteratorTE.next();
//			if (tipoEdificio.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoEdificio()))
//				value = tipoEdificio.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Descrizione edificio");
		labelValue
				.setValue(attestato.getDatiTecnici().getDescrizioneEdificio());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue//.setLabel("Superficie utile climatizzata (SU) [m<sup>2</sup>]");
				.setLabel("Superficie utile climatizzata (SU) [m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getSuperficieUtile()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Volume lordo riscaldato (V) [m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getVolLordoRiscald()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Superficie disperdente totale (S) [m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getSupDispTot()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Fattore Forma (S/V) [m-1]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getFattoreForma()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue
				.setLabel("Trasmittanza media superfici opache verticali [W/m2*K]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getTrasmittanzaOpache()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue
				.setLabel("Trasmittanza media superfici trasparenti [W/m2*K]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getTrasmittanzaTrasp()));
		labelValueList.add(labelValue);

		// ------------> Fabbisogno

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>INDICI DI FABBISOGNO</b></u>");
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile ideale (QH,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getDomEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Limite normativo regionale [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getLimNormRegione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getDomEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria soddisfatto da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getEnergTermAcquaRinnov()));
		labelValueList.add(labelValue);

		//		labelValue = new LabelValue();
		//		labelValue
		//				.setLabel("Rendimento medio globale stagionale per acqua calda sanitaria (ETAg acs) [kWh/m2 o kWh/m3]");
		//		labelValue.setValue(convertToStringForReport(
		//				attestato.getIndFabbisogno().getRendGlobStagioneAcqua()));
		//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica per acqua calda sanitaria (EPacs) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getIndPrestEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia utile per la climatizzazione estiva (QC,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getFabbCondizionamento()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia elettrica per illuminazione [kWh/m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getIndPrestEnergIlluminaz()));
		labelValueList.add(labelValue);

		//-------------> Classe energetica loc. reale
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CLASSE ENERGETICA</b></u>");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di generazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendGeneraz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di regolazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendRegolaz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di emissione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendEmissione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di distribuzione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendDistrib()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento medio globale impianto termico (ETAg)");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendGlobTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica riscaldamento invernale (EPi,r) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica per la climatizzazione estiva");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergCondiz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indice prestazione energetica per illuminazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergIlluminaz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica globale (EPL lordo) [kWh/m2 o kWh/m3] ");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocReale()
								.getIndPrestEnergGlob()));
		labelValueList.add(labelValue);

		//-------------> Classe energetica loc. teorica (Torino)

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile ideale (QH,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getDomEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Limite di normativa regionale [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getLimNormaRegione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica per il riscaldamento invernale (EPiTo) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica().getDomEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria soddisfatto da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getEnergTermAcquaRinnov()));
		labelValueList.add(labelValue);

		//		labelValue = new LabelValue();
		//		labelValue
		//				.setLabel("Rendimento medio globale stagionale per acqua calda sanitaria (ETAg acs To)");
		//		labelValue.setValue(convertToStringForReport(
		//				attestato.getClasseEnerg().getLocTeorica()
		//						.getRendGlobStagioneAcqua()));
		//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica acqua calda sanitaria (EPacs To) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica globale (EPL lordo) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergGlob()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Classe Energetica");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getDescClasseEnerg()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Servizi energetici inclusi nella classificazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getServEnergInclusi()));
		labelValueList.add(labelValue);

		//-------->Energia da fonti rinnovabili 
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>ENERGIA DA FONTI RINNOVABILI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Tecnologie uso fonti rinnovabili");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getTechFontiRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAnnoInstall()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia termica prodotta [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getEnergTermicaProdotta()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia elettrica prodotta [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getEnergElettricaProdotta()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Autoconsumo termico");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAutoconsumoTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Autoconsumo elettrico");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAutoconsumoElettrico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Quota di energia coperta da fonti rinnovabili [%]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getPercEnergiaFontiRinnov()));
		labelValueList.add(labelValue);

		//-------->Altre informazioni - Generali 
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>ALTRE INFORMAZIONI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Motivazione rilascio");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getGenerali().getMotivoRilascio()))
		{
			SiceeDMotivoRilascio motRil =  getSiceeDMotivoRilascioDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getGenerali().getMotivoRilascio()));

			if (motRil != null)
			{
				value = motRil.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<MotivoRilascio> motiviRilascio = (ArrayList<MotivoRilascio>) getMiscMgr()
//				.getMotiviRilascio();
//		value = "";
//		Iterator<MotivoRilascio> iterator = motiviRilascio.iterator();
//		while (iterator.hasNext()) {
//			MotivoRilascio motivoRilascio = (MotivoRilascio) iterator.next();
//			if (motivoRilascio.getCod().equalsIgnoreCase(
//					attestato.getAltreInfo().getGenerali().getMotivoRilascio()))
//				value = motivoRilascio.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Metodologia di calcolo adottata");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getMetodoCalcolo());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Software utilizzato");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getSoftware());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Denominazione produttore");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getDenomProduttore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rispondenza a UNI TS 11300");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getRispondenzaUNITS11300());
		labelValueList.add(labelValue);

		//-------->Altre informazioni -Raccomandazioni
		ArrayList<Raccomandazione> raccomandazioniList = attestato
				.getAltreInfo().getRaccomandazioni();
		if (raccomandazioniList != null && raccomandazioniList.size() > 0) {
			List<SiceeDPriorita> prioritaList = recuperaPriorita();
			for (int i = 0; i < raccomandazioniList.size(); i++) {
				labelValue = new LabelValue();
				value = "";
				labelValue.setLabel("Raccomandazione " + (i + 1) + "");
				Raccomandazione raccomandazione = raccomandazioniList.get(i);
				value = raccomandazione.getIntervento() + "; ";
				if (prioritaList != null) {
					for (int j = 0; j < prioritaList.size(); j++) {
						SiceeDPriorita priorita = prioritaList.get(j);
						if (raccomandazione.getPriorita().equals(
								priorita.getPriorita())) {
							value = value + "PRIO:" + priorita.getDescr()
									+ "; ";
							break;
						}
					}

				}

				value = value + "TdR:" + raccomandazione.getTempoRitorno();
				labelValue.setValue(value);
				labelValueList.add(labelValue);

			}
		} else {
			labelValue = new LabelValue();
			labelValue.setLabel("Raccomandazione");
			labelValue.setValue("-");
			labelValueList.add(labelValue);
		}
		//-------->Altre informazioni - Energetiche

		labelValue = new LabelValue();
		labelValue.setLabel("Classe energetica globale nazionale edificio");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getEnergetiche().getClasseEnergEdificio()))
		{
			SiceeDClasseEnergetica clsEner =  getSiceeDClasseEnergeticaDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getEnergetiche().getClasseEnergEdificio()));

			if (clsEner != null)
			{
				value = clsEner.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<ClasseEnerg> classeEnergList = (ArrayList<ClasseEnerg>) getMiscMgr()
//				.getClasseEnergetica();
//		value = "";
//		Iterator<ClasseEnerg> iter = classeEnergList.iterator();
//		while (iter.hasNext()) {
//			ClasseEnerg classeEnerg = (ClasseEnerg) iter.next();
//			if (classeEnerg.getCod().equalsIgnoreCase(
//					attestato.getAltreInfo().getEnergetiche()
//							.getClasseEnergEdificio()))
//				value = classeEnerg.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica raggiungibile [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getPrestEnergRaggiungibile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica riscaldamento invernale nazionale (EPi naz) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo nazionale per il riscaldamento [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getLimNormaNazRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Qualita' termica estiva edificio (punto 6.1 del D.M. 26 giugno 2009)");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getEnergetiche().getQualitaInvolucroRaffresc()))
		{
			SiceeDQualitaInvolucro qlInv =  getSiceeDQualitaInvolucroDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getEnergetiche().getQualitaInvolucroRaffresc()));

			if (qlInv != null)
			{
				value = qlInv.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		
		
//		ArrayList<QualitaInvolucro> qualitaInvolucroList = (ArrayList<QualitaInvolucro>) getMiscMgr()
//				.getQualitaInvolucro();
//		value = "";
//		Iterator<QualitaInvolucro> iterator2 = qualitaInvolucroList.iterator();
//		while (iterator2.hasNext()) {
//			QualitaInvolucro qualitaInvolucro = (QualitaInvolucro) iterator2
//					.next();
//			if (qualitaInvolucro.getCod().equalsIgnoreCase(
//					convertToStringForReport(
//							attestato.getAltreInfo().getEnergetiche()
//									.getQualitaInvolucroRaffresc())))
//				value = qualitaInvolucro.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Coefficiente di prestazione della pompa calore (se installata)");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getPrestazPompaCalore()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo per prestazione energetica della pompa calore (se installata)");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getLimNormaPrestPompa()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ulteriori informazioni");
		labelValue.setValue(attestato.getAltreInfo().getEnergetiche()
				.getAltreInfo());
		labelValueList.add(labelValue);

		//-------->Altre informazioni - sopralluoghi e dati di ingresso 
		labelValue = new LabelValue();
		labelValue.setLabel("Data effettuazione sopralluoghi");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getSopralluoghi().getData()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Note sopralluoghi");
		labelValue.setValue(attestato.getAltreInfo().getSopralluoghi()
				.getNote());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Dati redazione");

		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getSopralluoghi().getTipoRedazione()))
		{
			SiceeDDatiIngresso datiIng =  getSiceeDDatiIngressoDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getSopralluoghi().getTipoRedazione()));

			if (datiIng != null)
			{
				value = datiIng.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		
//		ArrayList<TipoRedazione> tipiRedazione = (ArrayList<TipoRedazione>) getMiscMgr()
//				.getTipiRedazione();
//		value = "";
//		Iterator<TipoRedazione> iterator3 = tipiRedazione.iterator();
//		while (iterator3.hasNext()) {
//			TipoRedazione tipoRedazione = (TipoRedazione) iterator3.next();
//			if (tipoRedazione.getCod().equalsIgnoreCase(
//					attestato.getAltreInfo().getSopralluoghi()
//							.getTipoRedazione()))
//				value = tipoRedazione.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);
		
		//-------->Normative energetiche

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>NORMATIVE ENERGETICHE</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Data delle richiesta del titolo abilitativo a costruire/ristrutturare");
		labelValue.setValue(convertToStringForReport(
				attestato.getRispNorme().getDataTitolo()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Normativa");
		labelValue.setValue(attestato.getRispNorme().getDescrNorma());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Rispetto degli obblighi normativi in campo energetico?");
		if (attestato.getRispNorme().getAutorizzato() != null
				&& attestato.getRispNorme().getAutorizzato()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getRispNorme().getAutorizzato() != null
				&& attestato.getRispNorme().getAutorizzato()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Se no, perche'");
		labelValue.setValue(attestato.getRispNorme().getMotivoNonConformita());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ulteriori note");
		labelValue.setValue(attestato.getRispNorme().getNote());
		labelValueList.add(labelValue);

		//-------->Impianti - riscaldamento
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>IMPIANTI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Impianto col bollino");
		if (attestato.getImpianti().getRiscaldamento().getFlgBollino() != null
				&& attestato.getImpianti().getRiscaldamento().getFlgBollino()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getImpianti().getRiscaldamento().getFlgBollino() != null
				&& attestato.getImpianti().getRiscaldamento().getFlgBollino()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");

		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Numero bollino");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getNumBollino());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Codice impianto");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getCodImpianto());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione generatore");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getAnnoInstallGeneratore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Potenza utile nominale complessiva [kW]");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getRiscaldamento().getPotNomCompl()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo regionale impianto termico (D.G.R. 46-11968)");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getRiscaldamento()
						.getLimNormRegImpTerm()));
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Classe efficienza energetica per il riscaldamento");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getRiscaldamento().getClasseEfficienzaEnerg()))
		{
			SiceeDClasseEfficienza clsEff =  getSiceeDClasseEfficienzaDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getRiscaldamento().getClasseEfficienzaEnerg()));

			if (clsEff != null)
			{
				value = clsEff.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<ClasseEfficienzaEnerg> classeEfficienzaEnergList = (ArrayList<ClasseEfficienzaEnerg>) getMiscMgr()
//				.getClasseEfficienzaEnergetica();
//		value = "";
//		Iterator<ClasseEfficienzaEnerg> iterator4 = classeEfficienzaEnergList
//				.iterator();
//		while (iterator4.hasNext()) {
//			ClasseEfficienzaEnerg classeEfficienzaEnerg = (ClasseEfficienzaEnerg) iterator4
//					.next();
//			if (classeEfficienzaEnerg.getCod().equalsIgnoreCase(
//					attestato.getImpianti().getRiscaldamento()
//							.getClasseEfficienzaEnerg()))
//				value = classeEfficienzaEnerg.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Fonte energetica utilizzata per il riscaldamento");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getRiscaldamento().getCombustibileFossile()))
		{
			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getRiscaldamento().getCombustibileFossile()));

			if (comb != null)
			{
				value = comb.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<TipoCombustibile> tipiCombustibileRiscaldamentoList = (ArrayList<TipoCombustibile>) getMiscMgr()
//				.getTipiCombustibileRiscaldamento();
//		value = "";
//		Iterator<TipoCombustibile> iterator5 = tipiCombustibileRiscaldamentoList
//				.iterator();
//		while (iterator5.hasNext()) {
//			TipoCombustibile tipoCombustibile = (TipoCombustibile) iterator5
//					.next();
//			if (tipoCombustibile.getCod().equalsIgnoreCase(
//					attestato.getImpianti().getRiscaldamento()
//							.getCombustibileFossile()))
//				value = tipoCombustibile.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Unita' immobiliari servite");
		labelValue.setValue(attestato.getImpianti().getUiServite());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Contabilizzazione/ripartizione");
		if (attestato.getImpianti().getFlgRipartizione() != null
				&& attestato.getImpianti().getFlgRipartizione()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getImpianti().getFlgRipartizione() != null
				&& attestato.getImpianti().getFlgRipartizione()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");

		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Tipo impianto");
//		labelValue.setValue("ANCORA!!!!!");
//		labelValueList.add(labelValue);

//		value = "";
//		if (!isNullOrEmpty(attestato.getDatiTecnici().getTipoImpianto().getCombustibileFossile()))
//		{
//			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getDatiTecnici().getRiscaldamento().getCombustibileFossile()));
//
//			if (comb != null)
//			{
//				value = comb.getDescr();
//			}
//		}
		
		
		
//		Iterator<TipoImpianto> iterator8 = tipiImpiantoList.iterator();
//		while (iterator8.hasNext()) {
//			TipoImpianto tipoImpianto = (TipoImpianto) iterator8.next();
//			if (tipoImpianto.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoImpianto()))
//				value = tipoImpianto.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo terminali erogazione");
		labelValue.setValue(attestato.getImpianti().getTipoTermErogaz());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo di distribuzione");
		labelValue.setValue(attestato.getImpianti().getTipoDistrib());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo di regolazione");
		labelValue.setValue(attestato.getImpianti().getTipoRegolaz());
		labelValueList.add(labelValue);

		//-------->Impianti - acqua calda snitaria
		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione sistema acqua calda sanitaria");
		labelValue.setValue(attestato.getImpianti().getAcqua()
				.getAnnoInstallGeneratore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Potenza utile nominale complessiva acs [kW]");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getAcqua().getPotNomCompl()));
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue.setLabel("Classe efficienza energetica acs");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getAcqua().getClasseEfficienzaEnerg()))
		{
			SiceeDClasseEfficienza clsEff =  getSiceeDClasseEfficienzaDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getAcqua().getClasseEfficienzaEnerg()));

			if (clsEff != null)
			{
				value = clsEff.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		classeEfficienzaEnergList = (ArrayList<ClasseEfficienzaEnerg>) getMiscMgr()
//				.getClasseEfficienzaEnergetica();
//		value = "";
//		Iterator<ClasseEfficienzaEnerg> iterator6 = classeEfficienzaEnergList
//				.iterator();
//		while (iterator6.hasNext()) {
//			ClasseEfficienzaEnerg classeEfficienzaEnerg = (ClasseEfficienzaEnerg) iterator6
//					.next();
//			if (classeEfficienzaEnerg.getCod().equalsIgnoreCase(
//					attestato.getImpianti().getAcqua()
//							.getClasseEfficienzaEnerg()))
//				value = classeEfficienzaEnerg.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Fonte energetica utilizzata acs");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getAcqua().getCombustibileFossile()))
		{
			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getAcqua().getCombustibileFossile()));

			if (comb != null)
			{
				value = comb.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<TipoCombustibile> tipiCombustibileAcquaCaldaList = (ArrayList<TipoCombustibile>) getMiscMgr()
//				.getTipiCombustibileAcquaCalda();
//		value = "";
//		Iterator<TipoCombustibile> iterator7 = tipiCombustibileAcquaCaldaList
//				.iterator();
//		while (iterator7.hasNext()) {
//			TipoCombustibile tipoCombustibile = (TipoCombustibile) iterator7
//					.next();
//			if (tipoCombustibile.getCod()
//					.equalsIgnoreCase(
//							attestato.getImpianti().getAcqua()
//									.getCombustibileFossile()))
//				value = tipoCombustibile.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		//--------->Emissioni gas serra
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>EMISSIONI GAS SERRA</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Emissioni gas serra [kg/m3 anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getGasSerra().getEmissioniGasSerra()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Superficie ettari bosco equivalente [ha]");
		labelValue.setValue(convertToStringForReport(
				attestato.getGasSerra().getSupBoscoEquiv()));
		labelValueList.add(labelValue);

		
		//--------->Consumi reali

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CONSUMI REALI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Annuale termico da fossile [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoTermicoFossile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Annuale elettrico da fossile [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoElettricoFossile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Annuale termico da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoTermicoRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Annuale elettrico da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoElettricoRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Medio complessivo termico (su 3 anni) [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getMedioTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Medio complessivo elettrico (su 3 anni) [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getMedioElettrico()));
		labelValueList.add(labelValue);
	
		*/
		return labelValueList;
	}
	
	private List<LabelValue> getLabelValueListFromAttestatoOld(
			DatiAttestato attestato, ApeDto apeDto) throws DaoException {

		ArrayList<LabelValue> labelValueList = new ArrayList<LabelValue>();

		LabelValue labelValue = new LabelValue();
		
		
		labelValue.setLabel("<u><b>DATI ANAGRAFICI IMMOBILE</b></u>");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getNumeroAttestato()));
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Codice A.P.E.");
		labelValue.setValue(convertToStringForReport(
				attestato.getNumeroAttestato()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Provincia");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCatastali()
						.getDescrProv()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Comune");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getDescrComune());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Zona climatica");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getZonaClimatica());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Gradi giorno");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCatastali()
						.getGradiGiorno()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indirizzo");
		String value = attestato.getDatiAnagraficiImm().getDtCatastali()
				.getDescrIndirizzo();
		if (attestato.getDatiAnagraficiImm().getDtCatastali().getNumCiv() != null)
			value = value
					+ ","
					+ attestato.getDatiAnagraficiImm().getDtCatastali()
							.getNumCiv();
		labelValue.setValue(value);
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("CAP");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getCap());
		labelValueList.add(labelValue);

		// Beppe 10/01/2012
		/*
		labelValue = new LabelValue();
		labelValue.setLabel("Intero condominio ");
		
		if (attestato.getDatiAnagraficiImm().getDtCatastali()
				.getFlgCondominio() != null) {
			if (attestato.getDatiAnagraficiImm().getDtCatastali()
					.getFlgCondominio().equalsIgnoreCase(Constants.SI))
				labelValue.setValue(Constants.LABEL_SI);
			else if (attestato.getDatiAnagraficiImm().getDtCatastali()
					.getFlgCondominio().equalsIgnoreCase(Constants.NO))
				labelValue.setValue(Constants.LABEL_NO);
		} else {
			labelValue.setValue("");
		}

		labelValueList.add(labelValue);
		 */

		labelValue = new LabelValue();
		labelValue.setLabel("Sezione");
		labelValue
				.setValue(getStringNotNull(
						attestato.getDatiAnagraficiImm().getDtCatastali()
								.getSezione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Foglio");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getFoglio());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Particella");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getParticella());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Subalterno");
		labelValue.setValue(getStringNotNull(
				attestato.getDatiAnagraficiImm().getDtCatastali()
						.getSubalterno()));
		labelValueList.add(labelValue);

		// Dati catastali secondari
		ArrayList<DtCatastaliSecondari> datiCatastaliSecondariList = attestato
				.getDatiAnagraficiImm().getDtCatastali()
				.getDtCatastaliSecondari();

		if (datiCatastaliSecondariList != null
				&& datiCatastaliSecondariList.size() > 0) {
			for (int i = 0; i < datiCatastaliSecondariList.size(); i++) {
				labelValue = new LabelValue();
				value = "";
				labelValue.setLabel("NCEU secondari " + (i + 1) + "");
				DtCatastaliSecondari datiCatastaliSecondari = datiCatastaliSecondariList
						.get(i);
				value = value + "Prov:" + datiCatastaliSecondari.getDescrProv()
						+ "; ";
				value = value + "Comune:"
						+ datiCatastaliSecondari.getDescrComune() + "; ";
				if (datiCatastaliSecondari.getSezione() != null)
					value = value
							+ "Sez:"
							+ convertToStringForReport(
									datiCatastaliSecondari.getSezione()) + "; ";
				value = value
						+ "F:"
						+ convertToStringForReport(
								datiCatastaliSecondari.getFoglio()) + "; ";
				value = value
						+ "N:"
						+ convertToStringForReport(
								datiCatastaliSecondari.getParticella());
				if (datiCatastaliSecondari.getSubalterno() != null)
					value = value
							+ "; Sub:"
							+ convertToStringForReport(
									datiCatastaliSecondari.getSubalterno());
				labelValue.setValue(value);
				labelValueList.add(labelValue);

			}
		} else {
			labelValue = new LabelValue();
			labelValue.setLabel("NCEU secondari");
			labelValue.setValue("-");
			labelValueList.add(labelValue);
		}

		labelValue = new LabelValue();
		labelValue.setLabel("Piano");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCatastali().getPiano()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Piani totali");
		labelValue.setValue(convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCatastali()
								.getPianiTot()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("N.appart./Unita'");
		labelValue.setValue(convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCatastali()
								.getNumUnita()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Scala");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getScala());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Interno");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getInterno());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Note");
		labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCatastali()
				.getNote());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Progettista");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtResponsabili()
						.getDtProgettista().getNome())
				+ " "
				+ getStringNotNull(
						attestato.getDatiAnagraficiImm().getDtResponsabili()
								.getDtProgettista().getCognome()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Direttore lavori");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtResponsabili()
						.getDtDirLavori().getNome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtResponsabili()
								.getDtDirLavori().getCognome()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Costruttore");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtResponsabili()
						.getDtCostruttore().getNome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtResponsabili()
								.getDtCostruttore().getCognome()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Co-certificatore");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiAnagraficiImm().getDtCoCertificatore()
						.getNome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCoCertificatore()
								.getCognome())
				+ " "
				+ convertToStringForReport(
						attestato.getDatiAnagraficiImm().getDtCoCertificatore()
								.getNumMatricola()));
		labelValueList.add(labelValue);

		/*		labelValue = new LabelValue();
		 labelValue.setLabel("Num. matricola");
		 labelValue.setValue(attestato.getDatiAnagraficiImm().getDtCoCertificatore().getNumMatricola());
		 labelValueList.add(labelValue);*/

		//labelValueList.add(new LabelValue());
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI TECNICI GENERALI</b></u>");
//		labelValue.setValue(convertToStringForReport(
//				attestato.getNumeroAttestato()));
		labelValueList.add(labelValue);
		
		
		labelValue = new LabelValue();
		labelValue.setLabel("Destinazione d'uso");

		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getDestUso()))
		{
			SiceeDDestUso uso =  getSiceeDDestUsoDao().findByPrimaryKey(convertToInteger(attestato.getDatiTecnici().getDestUso()));

			if (uso != null)
			{
				value = uso.getSigla();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<DestUso> destUsoList = (ArrayList<DestUso>) getMiscMgr()
//				.getDestinazioneDuso();
//		Iterator<DestUso> it = destUsoList.iterator();
//		while (it.hasNext()) {
//			DestUso destUso = (DestUso) it.next();
//			if (destUso.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getDestUso()))
//				value = destUso.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo impianto");

		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getTipoImpianto()))
		{
			SiceeDTipoImpianto imp =  getSiceeDTipoImpiantoDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getTipoImpianto()));

			if (imp != null)
			{
				value = imp.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		
//		ArrayList<TipoImpianto> tipiImpiantoList = (ArrayList<TipoImpianto>) getMiscMgr()
//				.getTipiImpianto();
//		value = "";
//		Iterator<TipoImpianto> iteratorTipImp = tipiImpiantoList.iterator();
//		while (iteratorTipImp.hasNext()) {
//			TipoImpianto tipoImpianto = (TipoImpianto) iteratorTipImp.next();
//			if (tipoImpianto.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoImpianto()))
//				value = tipoImpianto.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipologia dell'edificio");

		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
		{
			Integer idTipoEdificio = getSiceeDCarattEdificioDao()
			.findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio()).getFkTipoEdificio();
			
			SiceeDTipoEdificio tipoEd =  getSiceeDTipoEdificioDao().findByPrimaryKey(idTipoEdificio);

			if (tipoEd != null)
			{
				value = tipoEd.getDescr();
			}
		}
		
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		ArrayList<TipoEdificio> TipoEdificioList = (ArrayList<TipoEdificio>) getMiscMgr()
//				.getTipoEdificio();
//		value = "";
//		Iterator<TipoEdificio> itTipEd = TipoEdificioList.iterator();
//		while (itTipEd.hasNext()) {
//			TipoEdificio tipoEdificio = (TipoEdificio) itTipEd.next();
//			if (tipoEdificio.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoEdificio()))
//				value = tipoEdificio.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Caratteristiche dell'edificio ");
		
		value = "";
		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
		{
			SiceeDCarattEdificio carEd =  getSiceeDCarattEdificioDao().findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio());

			if (carEd != null)
			{
				value = carEd.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		ArrayList<CarattEdificio> carattEdificioList = (ArrayList<CarattEdificio>) getMiscMgr()
//				.getCaratteristicheEdificio();
//
//
//		value = "";
//
//		Iterator<CarattEdificio> itCarattEdificio = carattEdificioList
//				.iterator();
//		while (itCarattEdificio.hasNext()) {
//			CarattEdificio carattEdificio = (CarattEdificio) itCarattEdificio
//					.next();
//
//			log.debug("BEPPE: getCod: " + carattEdificio.getCod());
//			if (carattEdificio.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getCarattEdificio())) {
//				value = carattEdificio.getDescr();
//
//			}
//
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Edificio pubblico o ad uso pubblico");
		if (attestato.getDatiTecnici().getFlagUsoPubblico() != null
				&& attestato.getDatiTecnici().getFlagUsoPubblico()
						.equalsIgnoreCase(Constants.SI))
			labelValue.setValue(Constants.LABEL_SI);
		else if (attestato.getDatiTecnici().getFlagUsoPubblico() != null
				&& attestato.getDatiTecnici().getFlagUsoPubblico()
						.equalsIgnoreCase(Constants.NO))
			labelValue.setValue(Constants.LABEL_NO);
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno costruzione");
		labelValue.setValue(attestato.getDatiTecnici().getAnnoCostr());
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Anno ultima ristrutturazione");
		labelValue.setValue(attestato.getDatiTecnici().getAnnoUltimaRistrutt());
		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Tipologia edificio");
//		labelValue.setValue("ANCORA!!!!!");
//		labelValueList.add(labelValue);
		
//		value = "";
//		if (!isNullOrEmpty(attestato.getDatiTecnici().getIdCarattEdificio()))
//		{
//			Integer idTipoEdificio = getSiceeDCarattEdificioDao()
//			.findByPrimaryKey(attestato.getDatiTecnici().getIdCarattEdificio()).getFkTipoEdificio();
//			
//			SiceeDTipoEdificio tipoEd =  getSiceeDTipoEdificioDao().findByPrimaryKey(idTipoEdificio);
//
//			if (tipoEd != null)
//			{
//				value = tipoEd.getDescr();
//			}
//		}
		
		
//		ArrayList<TipoEdificio> tipiEdificio = (ArrayList<TipoEdificio>) getMiscMgr()
//				.getTipoEdificio();
//		value = "";
//		Iterator<TipoEdificio> iteratorTE = tipiEdificio.iterator();
//		while (iteratorTE.hasNext()) {
//			TipoEdificio tipoEdificio = (TipoEdificio) iteratorTE.next();
//			if (tipoEdificio.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoEdificio()))
//				value = tipoEdificio.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Descrizione edificio");
		labelValue
				.setValue(attestato.getDatiTecnici().getDescrizioneEdificio());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue//.setLabel("Superficie utile climatizzata (SU) [m<sup>2</sup>]");
				.setLabel("Superficie utile climatizzata (SU) [m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getSuperficieUtile()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Volume lordo riscaldato (V) [m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getVolLordoRiscald()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Superficie disperdente totale (S) [m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getSupDispTot()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue.setLabel("Fattore Forma (S/V) [m-1]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getFattoreForma()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue
				.setLabel("Trasmittanza media superfici opache verticali [W/m2*K]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getTrasmittanzaOpache()));
		labelValueList.add(labelValue);
		labelValue = new LabelValue();
		labelValue
				.setLabel("Trasmittanza media superfici trasparenti [W/m2*K]");
		labelValue.setValue(convertToStringForReport(
				attestato.getDatiTecnici().getTrasmittanzaTrasp()));
		labelValueList.add(labelValue);

		// ------------> Fabbisogno

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>INDICI DI FABBISOGNO</b></u>");
		labelValueList.add(labelValue);

		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile ideale (QH,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getDomEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Limite normativo regionale [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getLimNormRegione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getDomEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria soddisfatto da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getEnergTermAcquaRinnov()));
		labelValueList.add(labelValue);

		//		labelValue = new LabelValue();
		//		labelValue
		//				.setLabel("Rendimento medio globale stagionale per acqua calda sanitaria (ETAg acs) [kWh/m2 o kWh/m3]");
		//		labelValue.setValue(convertToStringForReport(
		//				attestato.getIndFabbisogno().getRendGlobStagioneAcqua()));
		//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica per acqua calda sanitaria (EPacs) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getIndPrestEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia utile per la climatizzazione estiva (QC,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getFabbCondizionamento()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia elettrica per illuminazione [kWh/m2]");
		labelValue.setValue(convertToStringForReport(
				attestato.getIndFabbisogno().getIndPrestEnergIlluminaz()));
		labelValueList.add(labelValue);

		//-------------> Classe energetica loc. reale
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CLASSE ENERGETICA</b></u>");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di generazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendGeneraz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di regolazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendRegolaz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di emissione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendEmissione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento di distribuzione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendDistrib()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rendimento medio globale impianto termico (ETAg)");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale().getRendGlobTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica riscaldamento invernale (EPi,r) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica per la climatizzazione estiva");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergCondiz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indice prestazione energetica per illuminazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocReale()
						.getIndPrestEnergIlluminaz()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica globale (EPL lordo) [kWh/m2 o kWh/m3] ");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocReale()
								.getIndPrestEnergGlob()));
		labelValueList.add(labelValue);

		//-------------> Classe energetica loc. teorica (Torino)

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile ideale (QH,nd) per unita' di sup/vol [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getDomEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Limite di normativa regionale [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getLimNormaRegione()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica per il riscaldamento invernale (EPiTo) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica().getDomEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Fabbisogno di energia termica utile per acqua calda sanitaria soddisfatto da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getEnergTermAcquaRinnov()));
		labelValueList.add(labelValue);

		//		labelValue = new LabelValue();
		//		labelValue
		//				.setLabel("Rendimento medio globale stagionale per acqua calda sanitaria (ETAg acs To)");
		//		labelValue.setValue(convertToStringForReport(
		//				attestato.getClasseEnerg().getLocTeorica()
		//						.getRendGlobStagioneAcqua()));
		//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica acqua calda sanitaria (EPacs To) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergAcqua()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica globale (EPL lordo) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getIndPrestEnergGlob()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Classe Energetica");
		labelValue.setValue(convertToStringForReport(
						attestato.getClasseEnerg().getLocTeorica()
								.getDescClasseEnerg()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Servizi energetici inclusi nella classificazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getClasseEnerg().getLocTeorica()
						.getServEnergInclusi()));
		labelValueList.add(labelValue);

		//-------->Energia da fonti rinnovabili 
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>ENERGIA DA FONTI RINNOVABILI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Tecnologie uso fonti rinnovabili");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getTechFontiRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAnnoInstall()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia termica prodotta [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getEnergTermicaProdotta()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Energia elettrica prodotta [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getEnergElettricaProdotta()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Autoconsumo termico");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAutoconsumoTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Autoconsumo elettrico");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getAutoconsumoElettrico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Quota di energia coperta da fonti rinnovabili [%]");
		labelValue.setValue(convertToStringForReport(
				attestato.getEnergRinnov().getPercEnergiaFontiRinnov()));
		labelValueList.add(labelValue);

		//-------->Altre informazioni - Generali 
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>ALTRE INFORMAZIONI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Motivazione rilascio");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getGenerali().getMotivoRilascio()))
		{
			SiceeDMotivoRilascio motRil =  getSiceeDMotivoRilascioDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getGenerali().getMotivoRilascio()));

			if (motRil != null)
			{
				value = motRil.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<MotivoRilascio> motiviRilascio = (ArrayList<MotivoRilascio>) getMiscMgr()
//				.getMotiviRilascio();
//		value = "";
//		Iterator<MotivoRilascio> iterator = motiviRilascio.iterator();
//		while (iterator.hasNext()) {
//			MotivoRilascio motivoRilascio = (MotivoRilascio) iterator.next();
//			if (motivoRilascio.getCod().equalsIgnoreCase(
//					attestato.getAltreInfo().getGenerali().getMotivoRilascio()))
//				value = motivoRilascio.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Metodologia di calcolo adottata");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getMetodoCalcolo());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Software utilizzato");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getSoftware());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Denominazione produttore");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getDenomProduttore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Rispondenza a UNI TS 11300");
		labelValue.setValue(attestato.getAltreInfo().getGenerali()
				.getRispondenzaUNITS11300());
		labelValueList.add(labelValue);

		//-------->Altre informazioni -Raccomandazioni
		ArrayList<Raccomandazione> raccomandazioniList = attestato
				.getAltreInfo().getRaccomandazioni();
		if (raccomandazioniList != null && raccomandazioniList.size() > 0) {
			List<SiceeDPriorita> prioritaList = recuperaPriorita();
			for (int i = 0; i < raccomandazioniList.size(); i++) {
				labelValue = new LabelValue();
				value = "";
				labelValue.setLabel("Raccomandazione " + (i + 1) + "");
				Raccomandazione raccomandazione = raccomandazioniList.get(i);
				value = raccomandazione.getIntervento() + "; ";
				if (prioritaList != null) {
					for (int j = 0; j < prioritaList.size(); j++) {
						SiceeDPriorita priorita = prioritaList.get(j);
						if (raccomandazione.getPriorita().equals(
								priorita.getPriorita())) {
							value = value + "PRIO:" + priorita.getDescr()
									+ "; ";
							break;
						}
					}

				}

				value = value + "TdR:" + raccomandazione.getTempoRitorno();
				labelValue.setValue(value);
				labelValueList.add(labelValue);

			}
		} else {
			labelValue = new LabelValue();
			labelValue.setLabel("Raccomandazione");
			labelValue.setValue("-");
			labelValueList.add(labelValue);
		}
		//-------->Altre informazioni - Energetiche

		labelValue = new LabelValue();
		labelValue.setLabel("Classe energetica globale nazionale edificio");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getEnergetiche().getClasseEnergEdificio()))
		{
			SiceeDClasseEnergetica clsEner =  getSiceeDClasseEnergeticaDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getEnergetiche().getClasseEnergEdificio()));

			if (clsEner != null)
			{
				value = clsEner.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<ClasseEnerg> classeEnergList = (ArrayList<ClasseEnerg>) getMiscMgr()
//				.getClasseEnergetica();
//		value = "";
//		Iterator<ClasseEnerg> iter = classeEnergList.iterator();
//		while (iter.hasNext()) {
//			ClasseEnerg classeEnerg = (ClasseEnerg) iter.next();
//			if (classeEnerg.getCod().equalsIgnoreCase(
//					attestato.getAltreInfo().getEnergetiche()
//							.getClasseEnergEdificio()))
//				value = classeEnerg.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice di prestazione energetica raggiungibile [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getPrestEnergRaggiungibile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Indice prestazione energetica riscaldamento invernale nazionale (EPi naz) [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getIndPrestEnergRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo nazionale per il riscaldamento [kWh/m2 o kWh/m3]");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getLimNormaNazRiscald()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Qualita' termica estiva edificio (punto 6.1 del D.M. 26 giugno 2009)");
		
		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getEnergetiche().getQualitaInvolucroRaffresc()))
		{
			SiceeDQualitaInvolucro qlInv =  getSiceeDQualitaInvolucroDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getEnergetiche().getQualitaInvolucroRaffresc()));

			if (qlInv != null)
			{
				value = qlInv.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
		
		
//		ArrayList<QualitaInvolucro> qualitaInvolucroList = (ArrayList<QualitaInvolucro>) getMiscMgr()
//				.getQualitaInvolucro();
//		value = "";
//		Iterator<QualitaInvolucro> iterator2 = qualitaInvolucroList.iterator();
//		while (iterator2.hasNext()) {
//			QualitaInvolucro qualitaInvolucro = (QualitaInvolucro) iterator2
//					.next();
//			if (qualitaInvolucro.getCod().equalsIgnoreCase(
//					convertToStringForReport(
//							attestato.getAltreInfo().getEnergetiche()
//									.getQualitaInvolucroRaffresc())))
//				value = qualitaInvolucro.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		/*		labelValue = new LabelValue();
		 labelValue
		 .setLabel("Rendimento medio globale dell' impianto di riscaldamento (ETAg)");
		 labelValue.setValue(convertToStringForReport(attestato.getClasseEnerg()
		 .getLocReale().getRendGlobTermico()));
		 labelValueList.add(labelValue);*/

		labelValue = new LabelValue();
		labelValue
				.setLabel("Coefficiente di prestazione della pompa calore (se installata)");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getPrestazPompaCalore()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo per prestazione energetica della pompa calore (se installata)");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getEnergetiche()
						.getLimNormaPrestPompa()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ulteriori informazioni");
		labelValue.setValue(attestato.getAltreInfo().getEnergetiche()
				.getAltreInfo());
		labelValueList.add(labelValue);

		//-------->Altre informazioni - sopralluoghi e dati di ingresso 
		labelValue = new LabelValue();
		labelValue.setLabel("Data effettuazione sopralluoghi");
		labelValue.setValue(convertToStringForReport(
				attestato.getAltreInfo().getSopralluoghi().getData()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Note sopralluoghi");
		labelValue.setValue(attestato.getAltreInfo().getSopralluoghi()
				.getNote());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Dati redazione");

		value = "";
		if (!isNullOrEmpty(attestato.getAltreInfo().getSopralluoghi().getTipoRedazione()))
		{
			SiceeDDatiIngresso datiIng =  getSiceeDDatiIngressoDao().findByPrimaryKey(convertToInteger(attestato.getAltreInfo().getSopralluoghi().getTipoRedazione()));

			if (datiIng != null)
			{
				value = datiIng.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
//		
//		ArrayList<TipoRedazione> tipiRedazione = (ArrayList<TipoRedazione>) getMiscMgr()
//				.getTipiRedazione();
//		value = "";
//		Iterator<TipoRedazione> iterator3 = tipiRedazione.iterator();
//		while (iterator3.hasNext()) {
//			TipoRedazione tipoRedazione = (TipoRedazione) iterator3.next();
//			if (tipoRedazione.getCod().equalsIgnoreCase(
//					attestato.getAltreInfo().getSopralluoghi()
//							.getTipoRedazione()))
//				value = tipoRedazione.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);
		
		//-------->Normative energetiche

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>NORMATIVE ENERGETICHE</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue
				.setLabel("Data delle richiesta del titolo abilitativo a costruire/ristrutturare");
		labelValue.setValue(convertToStringForReport(
				attestato.getRispNorme().getDataTitolo()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Normativa");
		labelValue.setValue(attestato.getRispNorme().getDescrNorma());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Rispetto degli obblighi normativi in campo energetico?");
		if (attestato.getRispNorme().getAutorizzato() != null
				&& attestato.getRispNorme().getAutorizzato()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getRispNorme().getAutorizzato() != null
				&& attestato.getRispNorme().getAutorizzato()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Se no, perche'");
		labelValue.setValue(attestato.getRispNorme().getMotivoNonConformita());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ulteriori note");
		labelValue.setValue(attestato.getRispNorme().getNote());
		labelValueList.add(labelValue);

		//-------->Impianti - riscaldamento
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>IMPIANTI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Impianto col bollino");
		if (attestato.getImpianti().getRiscaldamento().getFlgBollino() != null
				&& attestato.getImpianti().getRiscaldamento().getFlgBollino()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getImpianti().getRiscaldamento().getFlgBollino() != null
				&& attestato.getImpianti().getRiscaldamento().getFlgBollino()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");

		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Numero bollino");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getNumBollino());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Codice impianto");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getCodImpianto());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione generatore");
		labelValue.setValue(attestato.getImpianti().getRiscaldamento()
				.getAnnoInstallGeneratore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Potenza utile nominale complessiva [kW]");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getRiscaldamento().getPotNomCompl()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Limite normativo regionale impianto termico (D.G.R. 46-11968)");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getRiscaldamento()
						.getLimNormRegImpTerm()));
		labelValueList.add(labelValue);

		/*		labelValue = new LabelValue();
		 labelValue.setLabel("Rendimento di generazione");
		 labelValue.setValue(convertToStringForReport(attestato.getClasseEnerg()
		 .getLocReale().getRendGeneraz()));
		 labelValueList.add(labelValue);*/

		labelValue = new LabelValue();
		labelValue
				.setLabel("Classe efficienza energetica per il riscaldamento");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getRiscaldamento().getClasseEfficienzaEnerg()))
		{
			SiceeDClasseEfficienza clsEff =  getSiceeDClasseEfficienzaDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getRiscaldamento().getClasseEfficienzaEnerg()));

			if (clsEff != null)
			{
				value = clsEff.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<ClasseEfficienzaEnerg> classeEfficienzaEnergList = (ArrayList<ClasseEfficienzaEnerg>) getMiscMgr()
//				.getClasseEfficienzaEnergetica();
//		value = "";
//		Iterator<ClasseEfficienzaEnerg> iterator4 = classeEfficienzaEnergList
//				.iterator();
//		while (iterator4.hasNext()) {
//			ClasseEfficienzaEnerg classeEfficienzaEnerg = (ClasseEfficienzaEnerg) iterator4
//					.next();
//			if (classeEfficienzaEnerg.getCod().equalsIgnoreCase(
//					attestato.getImpianti().getRiscaldamento()
//							.getClasseEfficienzaEnerg()))
//				value = classeEfficienzaEnerg.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Fonte energetica utilizzata per il riscaldamento");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getRiscaldamento().getCombustibileFossile()))
		{
			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getRiscaldamento().getCombustibileFossile()));

			if (comb != null)
			{
				value = comb.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<TipoCombustibile> tipiCombustibileRiscaldamentoList = (ArrayList<TipoCombustibile>) getMiscMgr()
//				.getTipiCombustibileRiscaldamento();
//		value = "";
//		Iterator<TipoCombustibile> iterator5 = tipiCombustibileRiscaldamentoList
//				.iterator();
//		while (iterator5.hasNext()) {
//			TipoCombustibile tipoCombustibile = (TipoCombustibile) iterator5
//					.next();
//			if (tipoCombustibile.getCod().equalsIgnoreCase(
//					attestato.getImpianti().getRiscaldamento()
//							.getCombustibileFossile()))
//				value = tipoCombustibile.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Unita' immobiliari servite");
		labelValue.setValue(attestato.getImpianti().getUiServite());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Contabilizzazione/ripartizione");
		if (attestato.getImpianti().getFlgRipartizione() != null
				&& attestato.getImpianti().getFlgRipartizione()
						.equalsIgnoreCase("S"))
			labelValue.setValue("SI");
		else if (attestato.getImpianti().getFlgRipartizione() != null
				&& attestato.getImpianti().getFlgRipartizione()
						.equalsIgnoreCase("N"))
			labelValue.setValue("NO");
		else
			labelValue.setValue("");

		labelValueList.add(labelValue);

//		labelValue = new LabelValue();
//		labelValue.setLabel("Tipo impianto");
//		labelValue.setValue("ANCORA!!!!!");
//		labelValueList.add(labelValue);

//		value = "";
//		if (!isNullOrEmpty(attestato.getDatiTecnici().getTipoImpianto().getCombustibileFossile()))
//		{
//			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getDatiTecnici().getRiscaldamento().getCombustibileFossile()));
//
//			if (comb != null)
//			{
//				value = comb.getDescr();
//			}
//		}
		
		
		
//		Iterator<TipoImpianto> iterator8 = tipiImpiantoList.iterator();
//		while (iterator8.hasNext()) {
//			TipoImpianto tipoImpianto = (TipoImpianto) iterator8.next();
//			if (tipoImpianto.getCod().equalsIgnoreCase(
//					attestato.getDatiTecnici().getTipoImpianto()))
//				value = tipoImpianto.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo terminali erogazione");
		labelValue.setValue(attestato.getImpianti().getTipoTermErogaz());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo di distribuzione");
		labelValue.setValue(attestato.getImpianti().getTipoDistrib());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Tipo di regolazione");
		labelValue.setValue(attestato.getImpianti().getTipoRegolaz());
		labelValueList.add(labelValue);

		//-------->Impianti - acqua calda snitaria
		labelValue = new LabelValue();
		labelValue.setLabel("Anno installazione sistema acqua calda sanitaria");
		labelValue.setValue(attestato.getImpianti().getAcqua()
				.getAnnoInstallGeneratore());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Potenza utile nominale complessiva acs [kW]");
		labelValue.setValue(convertToStringForReport(
				attestato.getImpianti().getAcqua().getPotNomCompl()));
		labelValueList.add(labelValue);

		/*		labelValue = new LabelValue();
		 labelValue
		 .setLabel("Rendimento medio globale stagionale (ETAgacs) [kWh/m2 o kWh/m3]");
		 labelValue.setValue(convertToStringForReport(attestato.getClasseEnerg()
		 .getLocTeorica().getRendGlobStagioneAcqua()));
		 labelValueList.add(labelValue);*/

		labelValue = new LabelValue();
		labelValue.setLabel("Classe efficienza energetica acs");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getAcqua().getClasseEfficienzaEnerg()))
		{
			SiceeDClasseEfficienza clsEff =  getSiceeDClasseEfficienzaDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getAcqua().getClasseEfficienzaEnerg()));

			if (clsEff != null)
			{
				value = clsEff.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		classeEfficienzaEnergList = (ArrayList<ClasseEfficienzaEnerg>) getMiscMgr()
//				.getClasseEfficienzaEnergetica();
//		value = "";
//		Iterator<ClasseEfficienzaEnerg> iterator6 = classeEfficienzaEnergList
//				.iterator();
//		while (iterator6.hasNext()) {
//			ClasseEfficienzaEnerg classeEfficienzaEnerg = (ClasseEfficienzaEnerg) iterator6
//					.next();
//			if (classeEfficienzaEnerg.getCod().equalsIgnoreCase(
//					attestato.getImpianti().getAcqua()
//							.getClasseEfficienzaEnerg()))
//				value = classeEfficienzaEnerg.getDescr();
//		}
//
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Fonte energetica utilizzata acs");
		
		value = "";
		if (!isNullOrEmpty(attestato.getImpianti().getAcqua().getCombustibileFossile()))
		{
			SiceeDCombustibile comb =  getSiceeDCombustibileDao().findByPrimaryKey(convertToInteger(attestato.getImpianti().getAcqua().getCombustibileFossile()));

			if (comb != null)
			{
				value = comb.getDescr();
			}
		}
		labelValue.setValue(value);
		labelValueList.add(labelValue);
		
		
//		ArrayList<TipoCombustibile> tipiCombustibileAcquaCaldaList = (ArrayList<TipoCombustibile>) getMiscMgr()
//				.getTipiCombustibileAcquaCalda();
//		value = "";
//		Iterator<TipoCombustibile> iterator7 = tipiCombustibileAcquaCaldaList
//				.iterator();
//		while (iterator7.hasNext()) {
//			TipoCombustibile tipoCombustibile = (TipoCombustibile) iterator7
//					.next();
//			if (tipoCombustibile.getCod()
//					.equalsIgnoreCase(
//							attestato.getImpianti().getAcqua()
//									.getCombustibileFossile()))
//				value = tipoCombustibile.getDescr();
//		}
//		labelValue.setValue(value);
//		labelValueList.add(labelValue);

		//--------->Emissioni gas serra
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>EMISSIONI GAS SERRA</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Emissioni gas serra [kg/m3 anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getGasSerra().getEmissioniGasSerra()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Superficie ettari bosco equivalente [ha]");
		labelValue.setValue(convertToStringForReport(
				attestato.getGasSerra().getSupBoscoEquiv()));
		labelValueList.add(labelValue);

		/*labelValue = new LabelValue();
		labelValue.setLabel("Quoziente emissione gas serra");
		labelValue.setValue(convertToStringForReport(attestato
		.getQuozienteEmissioneGasSerra()));
		labelValueList.add(labelValue);*/

		//--------->Consumi reali

		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>CONSUMI REALI</b></u>");
		labelValueList.add(labelValue);
		
		labelValue = new LabelValue();
		labelValue.setLabel("Annuale termico da fossile [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoTermicoFossile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Annuale elettrico da fossile [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoElettricoFossile()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Annuale termico da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoTermicoRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Annuale elettrico da fonti rinnovabili [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getAnnoElettricoRinnov()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Medio complessivo termico (su 3 anni) [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getMedioTermico()));
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue
				.setLabel("Medio complessivo elettrico (su 3 anni) [kWh/anno]");
		labelValue.setValue(convertToStringForReport(
				attestato.getConsumiReali().getMedioElettrico()));
		labelValueList.add(labelValue);

		//--------->Dati Certificatore

		String indirizzo = "";
		String civico = "";
		String comune = "";
		String prov = "";
		
		if (apeDto.getDescIndirizzoCertificatore() != null)
			indirizzo = apeDto.getDescIndirizzoCertificatore();
		if (apeDto.getNumCivicoResidenza() != null)
			civico = apeDto.getNumCivicoResidenza();
		if (apeDto.getDescComuneResidenza() != null)
			comune = apeDto.getDescComuneResidenza();
		if (apeDto.getDescProvResidenza() != null)
			prov = apeDto.getDescProvResidenza();
		
		labelValue = new LabelValue();
		labelValue.setLabel("<u><b>DATI CERTIFICATORE</b></u>");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Nome e Cognome/Denominazione");
		labelValue.setValue(apeDto.getNome() + " " + apeDto.getCognomeRagSociale());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Indirizzo");
		labelValue.setValue(indirizzo + " " + civico + " " + comune + " (" + prov  + ")");
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("E-mail");
		if (!BaseMgr.isNullOrEmpty(apeDto.getEmail()))
			labelValue.setValue(apeDto.getEmail());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Telefono");
		if (!BaseMgr.isNullOrEmpty(apeDto.getTelefono()))
			labelValue.setValue(apeDto.getTelefono());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Titolo");
		if (!BaseMgr.isNullOrEmpty(apeDto.getDTitolo()))
			labelValue.setValue(apeDto.getDTitolo());
		labelValueList.add(labelValue);

		labelValue = new LabelValue();
		labelValue.setLabel("Ordine/iscrizione");
		if (!BaseMgr.isNullOrEmpty(apeDto.getIscrittoOrdine()))
			labelValue.setValue(apeDto.getIscrittoOrdine());
		labelValueList.add(labelValue);
		
		return labelValueList;
	}

	private ApeDto mapFromCertificatoreToApe(SiceeTCertificatore certificatore, SiceeTAzienda azienda, String dTitolo, ApeDto apeDto){
		log.debug("[mapFromCertificatoreToApe] start");
		
		String cognomeRagSociale = certificatore.getCognome();
		apeDto.setNumCertificatore(certificatore.getNumCertificatore());
		apeDto.setDTitolo(dTitolo);
		
		String tmpStr = "";
		if (certificatore.getIscrittoOrdine() != null && certificatore.getIscrittoOrdine().equalsIgnoreCase(Constants.SI))
		{
			if (certificatore.getOrdine() != null)
				tmpStr = certificatore.getOrdine() + " / ";
			if (certificatore.getNumIscrAlbo() != null)
				tmpStr = tmpStr + certificatore.getNumIscrAlbo();			
		}
		apeDto.setIscrittoOrdine(tmpStr);
		
		log.debug("azienda: "+azienda);
		
		if (azienda != null && azienda.getDescIndirizzo() != null) {
			
			log.debug("azienda.getDescIndirizzo(): "+azienda.getDescIndirizzo());
			
			// Nel caso ci sia l'azienda concateno la denominazione
			cognomeRagSociale += " / " + azienda.getDenominazione();
			
			apeDto.setDescIndirizzoCertificatore(azienda.getDescIndirizzo());
			apeDto.setNumCivicoResidenza(azienda.getNumCivico());
			apeDto.setDescComuneResidenza(azienda.getDescComune());
			apeDto.setDescProvResidenza(azienda.getDescProv());
		} else {
			if ("S".equalsIgnoreCase(certificatore.getFlgResidenzaItalia())) {
				apeDto.setDescIndirizzoCertificatore(certificatore.getDescIndirizzo());
				apeDto.setNumCivicoResidenza(certificatore.getNumCivicoResidenza());
				apeDto.setDescComuneResidenza(certificatore.getDescComuneResidenza());
				apeDto.setDescProvResidenza(certificatore.getDescProvResidenza());
			} else {
				apeDto.setDescIndirizzoCertificatore(certificatore.getViaEstera());
				apeDto.setNumCivicoResidenza(certificatore.getCivicoEstero());
				apeDto.setDescComuneResidenza(certificatore.getCittaEstera());
				apeDto.setDescProvResidenza(certificatore.getStatoResEstero());
			}
		}

		apeDto.setNome(certificatore.getNome());
		apeDto.setCognomeRagSociale(cognomeRagSociale);
		apeDto.setCognome(certificatore.getCognome());

		apeDto.setEmail(certificatore.getEmail());
		apeDto.setTelefono(certificatore.getTelefono());
	
		log.debug("[mapFromCertificatoreToApe] end");
		return apeDto;
	}

	public byte[] getXmlApeReadOnly(String idCertificatore, String progrCertificato, String anno, byte[] foto, Integer idStatoAttestato){
		log.debug("[CertificatoMgr::getXmlApeReadOnly] START");

		//recupero il modello xml dal documento
		//XmlModel model;
		try {
			//model = new XmlModel();

			// INIEZIONE FOTO - START
			byte[] xmlByteArray = XmlBeanUtils.extractByteArray(getApeReadOnly(idCertificatore, progrCertificato, anno, idStatoAttestato));
			//String indexImage = recuperaFoto(idCertificatore, progrCertificato, anno);
			
			SiceeTDatiEner2015 datiEner2015 = recuperaDatiEner2015(idCertificatore, progrCertificato, anno);
			List<SiceeDClasseEnergetica> classiEnergetiche = recuperaElencoClasseEnergetica();
			String classeEnerg = MapDto.decodClasseEnergeticaId(datiEner2015.getFkClasseEnergetica(), classiEnergetiche);

			String nomeImg = "classe" + classeEnerg + ".png";
			
			// Questa parte è da capire - devo recuperare le immagini
			
			String classeImage = recuperaImmagine(nomeImg);
			String smileInvernoImage = recuperaImmagine(recuperaNomeImmagineSmile(datiEner2015.getFlgSmileInverno()));
			String smileEstateImage = recuperaImmagine(recuperaNomeImmagineSmile(datiEner2015.getFlgSmileEstate()));

			log.debug("################");
			log.debug("classeImage: "+classeImage);
			log.debug("smileInvernoImage: "+smileInvernoImage);
			log.debug("smileEstateImage: "+smileEstateImage);
			log.debug("################");
			
			
            
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			InputStream myInputStream = new ByteArrayInputStream(xmlByteArray);
			Document doc = docBuilder.parse(myInputStream);

			Node datiPrecompilati = null;
			NodeList list = null;
			
			// Verifico se la foto è presente
			if (!GenericUtil.isNullOrEmpty(foto))
			{
	            byte[] immagineEncodata = Base64.encode(foto);
	            String indexImage = new String(immagineEncodata);
				
	            log.debug("Stampo indexImage: "+indexImage);
				
				
				datiPrecompilati = doc.getElementsByTagName("data:datiPrecompilati").item(0);
				list = datiPrecompilati.getChildNodes();
				for (int i = 0; i < list.getLength(); i++) {
					Node node = list.item(i);
					
					log.debug("node - datiPrecompilati: "+node.getNodeName());
					
					if ("data:foto".equals(node.getNodeName())) {
						node.setTextContent(indexImage);
					} 
					
				}
			}
			
			// Questa parte è da capire - devo recuperare le immagini
			
			datiPrecompilati = doc.getElementsByTagName(
					"data:prestEnergFabb").item(0);
			list = datiPrecompilati.getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);

				log.debug("Node - prestEnergFabb: " + node.getNodeName());

				if ("data:frecciaClasse".equals(node.getNodeName())) {
					node.setTextContent(classeImage);
				} else if (smileInvernoImage != null
						&& "data:smileInverno".equals(node.getNodeName())) {
					node.setTextContent(smileInvernoImage);
				} else if (smileEstateImage != null
						&& "data:smileEstate".equals(node.getNodeName())) {
					node.setTextContent(smileEstateImage);
				}
			}
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			StreamResult result = new StreamResult(bos);
			transformer.transform(source, result);
			//model.setXmlContent(bos.toByteArray());
			// INIEZIONE FOTO - END

			String theXmlString = XmlBeanUtils.readByteArray(bos.toByteArray());
			log.debug("STAMPO L'XML: "+theXmlString);
			
			// SALVATAGGIO XML PER BO - START
			
			// DA CAPIRE COME GESTIRLO
			
			/*
			SiceeTCertXml2015 certXML = new SiceeTCertXml2015();
			certXML.setIdCertificatore(idCertificatore);
			certXML.setProgrCertificato(progrCertificato);
			certXML.setAnno(anno);
			//certXML.setFlgControlloBozza("S");

			String theXmlString = XmlBeanUtils.readByteArray(bos.toByteArray());
			certXML.setXmlAllegato(theXmlString);
			getCertificatoMgr().salvaModuloApeXml(certXML);
			*/
			// SALVATAGGIO XML PER BO - END
			
			
			// devo ritornare
			return bos.toByteArray();
			
		}catch(Exception e){
			log.error("Errore", e);
			return null;
		} finally{
			log.debug("[CertificatoMgr::getXmlApeReadOnly] END");
		}
		
		
	}

	public byte[] getXmlTarghettaApeReadOnly(String idCertificatore, String progrCertificato, String anno){
		log.debug("[CertificatoMgr::getXmlTarghettaApeReadOnly] START");

		//recupero il modello xml dal documento
		//XmlModel model;
		try {

			// Questo è da spostare sull'SRV
			// recupero il dato dal db
			SiceeTDatiEner2015 certXML = recuperaDatiEner2015(idCertificatore, progrCertificato, anno);

			SiceeDClasseEnergetica classeEner = recuperaClasseEnergetica(certXML.getFkClasseEnergetica());

			it.csi.sicee.siceeweb.xml.appendiceC.data.MODDocument modDoc = it.csi.sicee.siceeweb.xml.appendiceC.data.MODDocument.Factory.newInstance();
			modDoc.addNewMOD();
			modDoc.getMOD().addNewPrestEnergFabb();

			modDoc.getMOD().setAnno("0000");

			it.csi.sicee.siceeweb.xml.appendiceC.data.PrestEnergFabbDocument.PrestEnergFabb energ = modDoc.getMOD().getPrestEnergFabb();
			energ.setFlagEdifEnergZero(certXML.getFlgEdifE0());
			//						energ.setClasseEnergetica(classeEner.getDescr());
			//						energ.setEpglnrenEdNuovi(Converter.convertToBigDecimal(certXML.getEpglNrenNuovi()));
			//						energ.setEpglnrenEdEsistenti(Converter.convertToBigDecimal(certXML.getEpglNrenEsistenti()));
			energ.setEpglnren(Converter.convertToBigDecimal(certXML.getEpglNrenGlobale()));
			energ.setEpglnrenStandard(Converter.convertToBigDecimal(certXML.getEpglNrenRif()));
			energ.setEPHnd(Converter.convertToBigDecimal(certXML.getEph()));
			energ.setEPHndLimite(Converter.convertToBigDecimal(certXML.getEphLimite()));
			energ.setRapportoAsolAsup(Converter.convertToBigDecimal(certXML.getAsolAsup()));
			energ.setEpglren(Converter.convertToBigDecimal(certXML.getEpglRenGlobale()));

			energ.setYie(Converter.convertToBigDecimal(certXML.getYie()));

			modDoc.getMOD().setPrestEnergFabb(energ);

			// Queste due righe di codice servono solo per farmi stampare l'xml
			//String theXmlString = XmlBeanUtils.readByteArray(XmlBeanUtils.extractByteArray(modDoc));
			//log.debug("STAMPO L'XML targhetta: "+theXmlString);
			// fine stampa
			
			// devo ritornare
			return XmlBeanUtils.extractByteArray(modDoc);

		}catch(Exception e){
			log.error("Errore", e);
			return null;
		} finally{
			log.debug("[CertificatoMgr::getXmlTarghettaApeReadOnly] END");
		}

		
	}
	
	public ApeTarghettaReadOnlyData getTarghettaApeReadOnlyData(String idCertificatore, String progrCertificato, String anno) {
		log.debug("[CertificatoMgr::getTarghettaApeReadOnlyData] START");
		
		ApeTarghettaReadOnlyData apeTarghettaReadOnlyData = new ApeTarghettaReadOnlyData();
		try {
			SiceeTDatiEner2015 datiEner = recuperaDatiEner2015(idCertificatore, progrCertificato, anno);

			SiceeDClasseEnergetica classeEner = recuperaClasseEnergetica(datiEner.getFkClasseEnergetica());
			
			apeTarghettaReadOnlyData.setDatiEner(datiEner);

			apeTarghettaReadOnlyData.setClasseEner(classeEner);
			
			return apeTarghettaReadOnlyData;
			
		}catch(Exception e){
			log.error("Errore", e);
			return null;
		} finally{
			log.debug("[CertificatoMgr::getTarghettaApeReadOnlyData] END");
		}		
	}
	
	public SiceeDClasseEnergetica recuperaClasseEnergetica(Integer idClasse) throws SiceesrvException {

		SiceeDClasseEnergetica dto = null;
		try {
			dto = this.getSiceeDClasseEnergeticaDao().findByPrimaryKey(idClasse);
		} catch (Exception e) {
			log.error("Errore in recuperaClasseEnergetica", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return dto;
	}

	
	public String getUidFotoPrincipale(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {
		log.debug("[CertificatoMgr::getUidFotoPrincipale] BEGIN");
		
		String uidFoto = null;
		try {

			List<SiceeTFoto2015> fotoList = getSiceeTFoto2015Dao().findBySiceeTCertificatoFlgPrincipale(idCertificatore, progrCertificato, anno, "S");
			if ((fotoList != null) && (fotoList.size() > 0)) {
				
				log.debug("\n>>>>>>>FOTO PRESENTE");
				SiceeTFoto2015 vo = fotoList.get(0);
				
				uidFoto = vo.getIdentificFoto();
				log.debug("Stampo l'uid della foto trovata: "+vo.getIdentificFoto());
				
			}
		} catch (Exception e) {
			log.error("Errore getUidFotoPrincipale",e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally{
			log.debug("[CertificatoMgr::getUidFotoPrincipale] END");
		}
		
		return uidFoto;


	}
	
	public it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument getApeReadOnly(String idCertificatore, String progrCertificato, String anno, Integer idStatoAttestato) throws SiceesrvException {
		log.debug("[CertificatoMgr::getApeReadOnly] BEGIN");
		try {

			SiceeTCertificato certificato = recuperaCertificato(idCertificatore, progrCertificato, anno);

			SiceeTDatiGenerali datiGenerali = recuperaDatiGenerali(idCertificatore, progrCertificato, anno);

			SiceeDDestUso2015 destinazioneUso2015 = null;
			if (datiGenerali.getFkDestUso2015() != null)
			{
				destinazioneUso2015 = recuperaDDestUso2015(
								datiGenerali.getFkDestUso2015());
			}

			SiceeTAltreInfo altreInfo = recuperaAltreInfo(idCertificatore, progrCertificato, anno);
			String dMotivo = null;
			String flagNonValidoDlgs1922005 = null;
			String flagServizioEnergia = "N";
			if (!BaseMgr.isNullOrEmpty(altreInfo.getAltroServiziEnergia())) {
				dMotivo = recuperaDMotivoRilascioDecodifica(altreInfo.getAltroServiziEnergia()).getDescr();
				flagNonValidoDlgs1922005 = recuperaDMotivoRilascioDecodifica(altreInfo.getAltroServiziEnergia()).getFlagNonValidoDlgs1922005();

//				if ((Constants.ID_MOTIVO_ANTE_OPERAM == altreInfo.getAltroServiziEnergia()) 
//						||(Constants.ID_MOTIVO_POST_OPERAM == altreInfo.getAltroServiziEnergia())) {
				if (Constants.SI.equalsIgnoreCase(flagNonValidoDlgs1922005))
				{
					flagServizioEnergia = "S";
					// decodifico solo se il motivo è ANTE_OPERAM o POST_OPERAM (getDescr() non produce un null pointer) 
				}
			}
			SiceeTCertificatore certificatore = recuperaCertificatore(idCertificatore);
			SiceeTAzienda azienda = recuperaAzienda(certificatore.getFkAzienda());
			SiceeTDatiEner2015 datiEner2015 = recuperaDatiEner2015(idCertificatore, progrCertificato, anno);

			String dTitolo = recuperaDTitolo(certificatore.getFkIstruzione());
			String descDichIndipendenza = null;

			// devo settare la descrizione della dichiarazione di indipendenza
			SiceeDDichiarazione dichiarazione = recuperaDichiarazioneIndipendenza(certificato.getFkDichiarazione());
			if (dichiarazione != null)
			{
				// deve essere sicuramente valorizzato
				descDichIndipendenza = dichiarazione.getDescr();
			}

			List<SiceeTDatiCatastSec> datiCatastSec = recuperaDatiCatastaliSec(idCertificatore, progrCertificato, anno);
			// recupero i consumi
			List<SiceeTQtaConsumi2015> quantitaConsumi2015 = recuperaQuantitaConsumi2015(idCertificatore, progrCertificato, anno);
			List<SiceeDUnitaMisura2015> unitaMisura2015 = recuperaElencoUnitaMisura();
			// popolamento elenco combustibili per consumo
			List<SiceeDCombustibile> elencoConsumiCombustibile = recuperaElencoConsumiCombustibile();

			List<SiceeTRaccomand2015> raccomand2015 = recuperaRaccomand2015(idCertificatore, progrCertificato, anno);
			List<SiceeDClasseEnergetica> elencoClasseEnergetica = recuperaElencoClasseEnergetica();

			SiceeRCombDener2015 combDener2015 = recuperaCombDener2015(idCertificatore, progrCertificato, anno);

			List<SiceeRCertifServener2015> certifServener2015List = recuperaCertifServener2015(idCertificatore, progrCertificato, anno);
			List<SiceeTDetImp2015> detImp2015List = recuperaDetImp2015(idCertificatore, progrCertificato, anno);

			List<SiceeDCombustibile> elencoCombustibiliDettImpianti = recuperaElencoCombustibiliDettImpianti();

			List<SiceeDTipoImpianto2015> elencoTipiImpianto = recuperaElencoTipoImpianto2015();

			List<SiceeDClasseEnergetica> classiEnergetiche = recuperaElencoClasseEnergetica();


			it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc = null;
			log.debug("CERTIFICATO NON TROVATO");
			modDoc = it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument.Factory.newInstance();

			modDoc.addNewMOD();
			modDoc.getMOD().addNewSystem();
			modDoc.getMOD().addNewAttestato();
			modDoc.getMOD().getAttestato().addNewDatiPrecompilati();
			modDoc.getMOD().getAttestato().addNewDatiGenerali();
			modDoc.getMOD().getAttestato().getDatiPrecompilati()
			.addNewSezDatiCatastali();
			modDoc.getMOD().getAttestato().getDatiPrecompilati()
			.addNewCertificatore();
			modDoc.getMOD().getAttestato().getDatiPrecompilati().addNewFoto();
			modDoc.getMOD().getAttestato().addNewPrestEnergImpianti();
			modDoc.getMOD().getAttestato().addNewPrestEnergFabb();
			modDoc.getMOD().getAttestato().getPrestEnergFabb()
			.addNewFrecciaClasse();
			modDoc.getMOD().getAttestato().getPrestEnergFabb()
			.addNewSmileInverno();
			modDoc.getMOD().getAttestato().getPrestEnergFabb()
			.addNewSmileEstate();

			modDoc.getMOD().getAttestato().addNewRaccomandazioni();
			modDoc.getMOD().getAttestato().getRaccomandazioni()
			.addNewSezioneRen();
			modDoc.getMOD().getAttestato().addNewAltriDatiEnergetici();
			modDoc.getMOD().getAttestato().getAltriDatiEnergetici()
			.addNewVettori();
			modDoc.getMOD().getAttestato().addNewAltriDatiFabbricato();
			modDoc.getMOD().getAttestato().addNewDettaglioImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneClimaInver();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneClimaInver().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneClimaEst();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneClimaEst().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneAcquaCalda();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneAcquaCalda().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneImpiantiCombinati();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneImpiantiCombinati().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneProdFontiRinn();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneProdFontiRinn().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneVentMecc();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneVentMecc().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneIlluminazione();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneIlluminazione().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.addNewSezioneTrasporto();
			modDoc.getMOD().getAttestato().getDettaglioImpianti()
			.getSezioneTrasporto().addNewElencoImpianti();
			modDoc.getMOD().getAttestato().addNewInformazioni();
			modDoc.getMOD().getAttestato().addNewSoggettoCertificatore();
			modDoc.getMOD().getAttestato().addNewSopralluoghi();
			modDoc.getMOD().getAttestato().addNewSoftware();

			modDoc = MapDto.mapToDatiGenericiReadOnly(modDoc, certificato, datiGenerali, certificatore, dTitolo, destinazioneUso2015, azienda, altreInfo, dMotivo, flagServizioEnergia, descDichIndipendenza, idStatoAttestato);				

			modDoc = MapDto.mapToDatiCatastaliReadOnly(modDoc, certificato, datiCatastSec);	

			modDoc = MapDto.mapToDatiEnerReadOnly(modDoc, datiEner2015);				

			modDoc = MapDto.mapToDatiConsumiReadOnly(modDoc, elencoConsumiCombustibile, quantitaConsumi2015, unitaMisura2015);

			modDoc = MapDto.mapToDatiRaccomandazioniReadOnly(modDoc, datiGenerali, raccomand2015, elencoClasseEnergetica, datiEner2015, combDener2015);

			modDoc = MapDto.mapToDatiImpiantiReadOnly(certifServener2015List, detImp2015List, modDoc, elencoCombustibiliDettImpianti, elencoTipiImpianto, datiEner2015, classiEnergetiche);
			modDoc = MapDto.mapToDatiFinaliReadOnly(modDoc, altreInfo, datiEner2015);

			return modDoc;
		} catch (Exception e) {
			log.error("Errore getApeReadOnly",e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally{
			log.debug("[CertificatoMgr::getApe] END");
		}

	}
	
	public ApeReadOnlyData getApeReadOnlyData(String idCertificatore, String progrCertificato, String anno, Integer idStatoAttestato) throws SiceesrvException {
		
		log.debug("[CertificatoMgr::getApeReadOnlyData] START");
		
		ApeReadOnlyData apeReadOnlyData = new ApeReadOnlyData();
		
		try {
			SiceeTCertificato certificato = recuperaCertificato(idCertificatore, progrCertificato, anno);

			apeReadOnlyData.setCertificato(certificato);
			
			SiceeTDatiGenerali datiGenerali = recuperaDatiGenerali(idCertificatore, progrCertificato, anno);

			apeReadOnlyData.setDatiGenerali(datiGenerali);
			
			SiceeDDestUso2015 destinazioneUso2015 = null;
			if (datiGenerali.getFkDestUso2015() != null)
			{
				destinazioneUso2015 = recuperaDDestUso2015(
								datiGenerali.getFkDestUso2015());
			}

			apeReadOnlyData.setDestinazioneUso2015(destinazioneUso2015);
			
			SiceeTAltreInfo altreInfo = recuperaAltreInfo(idCertificatore, progrCertificato, anno);
			
			apeReadOnlyData.setAltreInfo(altreInfo);
			
			String dMotivo = null;
			String flagNonValidoDlgs1922005 = null;
			String flagServizioEnergia = "N";
			if (!BaseMgr.isNullOrEmpty(altreInfo.getAltroServiziEnergia())) {
				dMotivo = recuperaDMotivoRilascioDecodifica(altreInfo.getAltroServiziEnergia()).getDescr();
				flagNonValidoDlgs1922005 = recuperaDMotivoRilascioDecodifica(altreInfo.getAltroServiziEnergia()).getFlagNonValidoDlgs1922005();

				if (Constants.SI.equalsIgnoreCase(flagNonValidoDlgs1922005))
				{
					flagServizioEnergia = "S";
					// decodifico solo se il motivo è ANTE_OPERAM o POST_OPERAM (getDescr() non produce un null pointer) 
				}
			}
			
			apeReadOnlyData.setDMotivo(dMotivo);
			apeReadOnlyData.setFlagNonValidoDlgs1922005(flagNonValidoDlgs1922005);
			apeReadOnlyData.setFlagServizioEnergia(flagServizioEnergia);
			
			SiceeTCertificatore certificatore = recuperaCertificatore(idCertificatore);
			SiceeTAzienda azienda = recuperaAzienda(certificatore.getFkAzienda());
			SiceeTDatiEner2015 datiEner2015 = recuperaDatiEner2015(idCertificatore, progrCertificato, anno);

			apeReadOnlyData.setCertificatore(certificatore);
			apeReadOnlyData.setAzienda(azienda);
			apeReadOnlyData.setDatiEner2015(datiEner2015);
			
			String dTitolo = recuperaDTitolo(certificatore.getFkIstruzione());
			String descDichIndipendenza = null;

			// devo settare la descrizione della dichiarazione di indipendenza
			SiceeDDichiarazione dichiarazione = recuperaDichiarazioneIndipendenza(certificato.getFkDichiarazione());
			if (dichiarazione != null)
			{
				descDichIndipendenza = dichiarazione.getDescr();
			}

			apeReadOnlyData.setDTitolo(dTitolo);
			apeReadOnlyData.setDescDichIndipendenza(descDichIndipendenza);
			
			List<SiceeTDatiCatastSec> datiCatastSec = recuperaDatiCatastaliSec(idCertificatore, progrCertificato, anno);
			List<SiceeTQtaConsumi2015> quantitaConsumi2015 = recuperaQuantitaConsumi2015(idCertificatore, progrCertificato, anno);
			List<SiceeDUnitaMisura2015> unitaMisura2015 = recuperaElencoUnitaMisura();
			List<SiceeDCombustibile> elencoConsumiCombustibile = recuperaElencoConsumiCombustibile();

			apeReadOnlyData.setDatiCatastSec(datiCatastSec);
			apeReadOnlyData.setQuantitaConsumi2015(quantitaConsumi2015);
			apeReadOnlyData.setUnitaMisura2015(unitaMisura2015);
			apeReadOnlyData.setElencoConsumiCombustibile(elencoConsumiCombustibile);
			
			List<SiceeTRaccomand2015> raccomand2015 = recuperaRaccomand2015(idCertificatore, progrCertificato, anno);
			List<SiceeDClasseEnergetica> elencoClasseEnergetica = recuperaElencoClasseEnergetica();

			apeReadOnlyData.setRaccomand2015(raccomand2015);
			apeReadOnlyData.setElencoClasseEnergetica(elencoClasseEnergetica);
			
			SiceeRCombDener2015 combDener2015 = recuperaCombDener2015(idCertificatore, progrCertificato, anno);

			apeReadOnlyData.setCombDener2015(combDener2015);
			
			List<SiceeRCertifServener2015> certifServener2015List = recuperaCertifServener2015(idCertificatore, progrCertificato, anno);
			List<SiceeTDetImp2015> detImp2015List = recuperaDetImp2015(idCertificatore, progrCertificato, anno);

			apeReadOnlyData.setCertifServener2015List(certifServener2015List);
			apeReadOnlyData.setDetImp2015List(detImp2015List);
			
			List<SiceeDCombustibile> elencoCombustibiliDettImpianti = recuperaElencoCombustibiliDettImpianti();

			List<SiceeDTipoImpianto2015> elencoTipiImpianto = recuperaElencoTipoImpianto2015();

			List<SiceeDClasseEnergetica> classiEnergetiche = recuperaElencoClasseEnergetica();
			
			apeReadOnlyData.setElencoCombustibiliDettImpianti(elencoCombustibiliDettImpianti);
			apeReadOnlyData.setElencoTipiImpianto(elencoTipiImpianto);
			apeReadOnlyData.setClassiEnergetiche(classiEnergetiche);
			
		} catch (SiceesrvException e) {
			log.error("Errore getApeReadOnly",e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally{
			log.debug("[CertificatoMgr::getApeReadOnlyData] END");
		}

		
		return apeReadOnlyData;
	}
	
	public SiceeTCertificato recuperaCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		SiceeTCertificato vo = null;
		try {
			vo = this.getSiceeTCertificatoDao().findByPrimaryKey(idCertificatore, progrCertificato, anno);
		} catch (Exception e) {
			log.error("Errore in recuperaCertificato", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public SiceeTDatiGenerali recuperaDatiGenerali(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		SiceeTDatiGenerali vo = null;
		try {
			vo = this.getSiceeTDatiGeneraliDao().findByPrimaryKey(idCertificatore, progrCertificato, anno);
		} catch (Exception e) {
			log.error("Errore in recuperaDatiGenerali", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public SiceeTAltreInfo recuperaAltreInfo(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		SiceeTAltreInfo vo = null;
		try {
			vo = this.getSiceeTAltreInfoDao().findByPrimaryKey(idCertificatore, progrCertificato, anno);
		} catch (Exception e) {
			log.error("Errore in recuperaAltreInfo", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}

	public SiceeTDatiEner2015 recuperaDatiEner2015(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		SiceeTDatiEner2015 vo = null;
		try {
			vo = this.getSiceeTDatiEner2015Dao().findByPrimaryKey(idCertificatore, progrCertificato, anno);
		} catch (Exception e) {
			log.error("Errore in recuperaDatiEner2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public List<SiceeTDatiCatastSec> recuperaDatiCatastaliSec(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		List<SiceeTDatiCatastSec> vo = null;
		try {
			vo = this.getSiceeTDatiCatastSecDao().findBySiceeTCertificato(idCertificatore, progrCertificato, anno);

		} catch (Exception e) {
			log.error("Errore in recuperaDatiCatastaliSec", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public List<SiceeTQtaConsumi2015> recuperaQuantitaConsumi2015(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		List<SiceeTQtaConsumi2015> vo = null;
		try {
			vo = this.getSiceeTQtaConsumi2015Dao().findWhereIdCertProgrAnno(idCertificatore, progrCertificato, anno);

		} catch (Exception e) {
			log.error("Errore in recuperaQuantitaConsumi2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public List<SiceeTRaccomand2015> recuperaRaccomand2015(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		List<SiceeTRaccomand2015> vo = null;
		try {
			vo = this.getSiceeTRaccomand2015Dao().findWhereIdCertProgrAnno(idCertificatore, progrCertificato, anno);

		} catch (Exception e) {
			log.error("Errore in recuperaRaccomand2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public SiceeRCombDener2015 recuperaCombDener2015(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		SiceeRCombDener2015 vo = null;
		try {
			List<SiceeRCombDener2015> voList = this.getSiceeRCombDener2015Dao().findBySiceeTDatiEner2015(idCertificatore, progrCertificato, anno);
			
			if (voList != null && voList.size() > 0)
			{
				// Prendo il primo elemento
				vo = voList.get(0);
			}

		} catch (Exception e) {
			log.error("Errore in recuperaCombDener2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public List<SiceeRCertifServener2015> recuperaCertifServener2015(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		List<SiceeRCertifServener2015> voList = null;
		try {
			voList = this.getSiceeRCertifServener2015Dao().findBySiceeTCertificato(idCertificatore, progrCertificato, anno);
			
		} catch (Exception e) {
			log.error("Errore in recuperaCombDener2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return voList;
	}
	
	public List<SiceeTDetImp2015> recuperaDetImp2015(String idCertificatore, String progrCertificato, String anno) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);
		log.debug("progressivoCertificato: " + progrCertificato);
		log.debug("anno: " + anno);

		List<SiceeTDetImp2015> voList = null;
		try {
			voList = this.getSiceeTDetImp2015Dao().findBySiceeTCertificato(idCertificatore, progrCertificato, anno);
			
		} catch (Exception e) {
			log.error("Errore in recuperaCombDener2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return voList;
	}
	
	public SiceeDDestUso2015 recuperaDDestUso2015(Integer idDestUso2015) throws SiceesrvException {

		SiceeDDestUso2015 vo = new SiceeDDestUso2015();
		try {
				vo = this.getSiceeDDestUso2015Dao().findByPrimaryKey(idDestUso2015);
		} catch (Exception e) {
			log.error("Errore in recuperaDDestUso2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public SiceeTCertificatore recuperaCertificatore(String idCertificatore) throws SiceesrvException {

		log.debug("idCertificatore: " + idCertificatore);

		SiceeTCertificatore vo = null;
		try {
			vo = this.getSiceeTCertificatoreDao().findByPrimaryKey(idCertificatore);
		} catch (Exception e) {
			log.error("Errore in recuperaCertificatore", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public SiceeTAzienda recuperaAzienda(long idAzienda) throws SiceesrvException {

		log.debug("idAzienda: " + idAzienda);

		SiceeTAzienda vo = null;
		try {
			vo = this.getSiceeTAziendaDao().findByPrimaryKey(idAzienda);
		} catch (Exception e) {
			log.error("Errore in recuperaAzienda", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}
	
	public String recuperaDTitolo(Integer fkIstruzione) throws SiceesrvException {

		log.debug("fkIstruzione: " + fkIstruzione);

		String dTitolo = null;
		try {
			// fkTitolo può essere null ?
			if (fkIstruzione != null)
				dTitolo = this.getSiceeDIstruzioneDao().findByPrimaryKey(fkIstruzione).getDenominazione();
		} catch (Exception e) {
			log.error("Errore in recuperaDTitolo", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return dTitolo;
	}
	
	public SiceeDDichiarazione recuperaDichiarazioneIndipendenza(Integer idDichiarazione) throws SiceesrvException {

		SiceeDDichiarazione dto = null;
		try {
			dto = this.getSiceeDDichiarazioneDao().findByPrimaryKey(idDichiarazione);
		} catch (Exception e) {
			log.error("Errore in recuperaDichiarazioneIndipendenza", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return dto;
	}
	
	public List<SiceeDUnitaMisura2015> recuperaElencoUnitaMisura() throws SiceesrvException {

		List<SiceeDUnitaMisura2015> list = new ArrayList<SiceeDUnitaMisura2015>();
		try {
				list = this.getSiceeDUnitaMisura2015Dao().findAll();
		} catch (Exception e) {
			log.error("Errore in recuperaElencoUnitaMisura", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return list;
	}
	
	public List<SiceeDCombustibile> recuperaElencoConsumiCombustibile() throws SiceesrvException {

		List<SiceeDCombustibile> list = new ArrayList<SiceeDCombustibile>();
		List<SiceeDCombustibile> listReturn = new ArrayList<SiceeDCombustibile>();
		try {
				list = this.getSiceeDCombustibileDao().findWhereFlgConsumiEquals("S");
				for (SiceeDCombustibile c : list) {
					if (c.getIdCombustibile().intValue() != Constants.ID_COMBUSTIBILE_ALTRO)
						listReturn.add(c);
				}
		} catch (Exception e) {
			log.error("Errore in recuperaElencoConsumiCombustibile", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return listReturn;
	}
	
	public List<SiceeDClasseEnergetica> recuperaElencoClasseEnergetica() throws SiceesrvException {

		List<SiceeDClasseEnergetica> list = new ArrayList<SiceeDClasseEnergetica>();
		try {
				list = this.getSiceeDClasseEnergeticaDao().findWhereFlgAttivoEquals("1");
		} catch (Exception e) {
			log.error("Errore in recuperaElencoClasseEnergetica", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return list;
	}
	
	public List<SiceeDCombustibile> recuperaElencoCombustibiliDettImpianti() throws SiceesrvException {

		List<SiceeDCombustibile> list = new ArrayList<SiceeDCombustibile>();
		try {
				list = this.getSiceeDCombustibileDao().findWhereFlgVettoreDetImpEquals("S");
		} catch (Exception e) {
			log.error("Errore in recuperaElencoCombustibiliEnEsportata", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return list;
	}
	
	public List<SiceeDTipoImpianto2015> recuperaElencoTipoImpianto2015() throws SiceesrvException {

		List<SiceeDTipoImpianto2015> dtoList = null;
		try {
			dtoList = this.getSiceeDTipoImpianto2015Dao().findAll();
		} catch (Exception e) {
			log.error("Errore in recuperaElencoTipoImpianto2015", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return dtoList;
	}
	
	public SiceeDMotivoRilascio recuperaDMotivoRilascioDecodifica(Integer idMotivo) throws SiceesrvException {

		SiceeDMotivoRilascio vo = null;
		try {
			vo = this.getSiceeDMotivoRilascioDao().findByPrimaryKey(idMotivo);
		} catch (Exception e) {
			log.error("Errore in recuperaDMotivoRilascioDecodifica", e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		return vo;
	}

	private String recuperaImmagine(String nome) {
		String result = null;

		if (nome != null) {
			
//			java.io.InputStream myPath = SiceesrvImpl.class
//					.getResourceAsStream("/it/csi/sicee/siceesrv/business/facade/template/attestato2015template_ace.pdf");

			java.io.InputStream is = SiceesrvImpl.class
					.getResourceAsStream("/it/csi/sicee/siceesrv/business/facade/template/attestato2015/"
							+ nome);

			/*
			ServletContext sc = ServletActionContext.getServletContext();

			log.debug("### sc: " + sc);
			log.debug("### nome: " + nome);

			InputStream is = sc.getResourceAsStream("/img/attestato2015/"
					+ nome);
			*/
			
			log.debug("### is: " + is);

			byte[] input;
			try {
				input = IOUtils.toByteArray(is);

				byte[] immagineEncodata = Base64.encode(input);
				result = new String(immagineEncodata);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error(e);
			}
		}
		return result;

	}
	
	public String recuperaNomeImmagineSmile(
			Integer idSmile) {

		String smile = null;

		if (idSmile != null) {

			if (idSmile.intValue() == Constants.ID_SMILE_FELICE) {
				smile = "smile_felice.png";
			} else if (idSmile.intValue() == Constants.ID_SMILE_SERIO) {
				smile = "smile_serio.png";
			} else if (idSmile.intValue() == Constants.ID_SMILE_TRISTE) {
				smile = "smile_triste.png";
			}

		}

		return smile;

	}
}
