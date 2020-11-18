/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.util;



import it.csi.sicee.siceesrv.business.dao.dto.SiceeDClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDCombustibile;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDestUso2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDUnitaMisura2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRCertifServener2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRCombDener2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAltreInfo;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAzienda;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificato;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificatore;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiEner2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiGenerali;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSec;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDetImp2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTQtaConsumi2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRaccomand2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoImpianto2015;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;














//import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


/**
 * Mappa DTO con gli oggetti GUI e viceversa
 * 
 */
public class MapDto {

	private static Logger log = Logger.getLogger(Constants.APPLICATION_CODE + ".util");

	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiGenericiReadOnly(it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			SiceeTCertificato certificato, SiceeTDatiGenerali datiGenerali, SiceeTCertificatore certificatore, String dTitolo, SiceeDDestUso2015 dDestUso, SiceeTAzienda azienda, 
			SiceeTAltreInfo altreInfo, String dMotivo, String flagServizioEnergia, String descDichIndipendenza, Integer idStatoAttestato){
		log.debug("[MapDto::mapToDatiGenerici] start");
		
//		modDoc.getMOD().getSystem().setModuloEditabile(Constants.TRUE);
//		modDoc.getMOD().getSystem().setBtSalvaInBozza(Constants.TRUE);
//		modDoc.getMOD().getSystem().setBtSalvaEcontrolla(Constants.TRUE);
		//modDoc.getMOD().getSystem().setBtInvia(Constants.FALSE);
		
		// stato modulo
		
		log.debug("Stampo lo stato attestato passato: "+idStatoAttestato);
		
		// Se viene passato lo stato attestato vuol dire che si sta cambiando lo stato, ma siccome il metodo nel WEB o BO è transazionale (quindi non si è fatta ancora la commit)
		// l'srv non vede ancora la modifica e quindi gliela passo
		if (GenericUtil.isNullOrEmpty(idStatoAttestato))
		{
			// Se non viene passato lo stato attestato lo prendo dal DB
			idStatoAttestato = certificato.getFkStato();
		}
		log.debug("Stampo lo FK stato APE: "+certificato.getFkStato().intValue());
		
		String statoModulo = "";
		if (idStatoAttestato == Constants.BOZZA)
			statoModulo = "BOZZA_DA_XML";
		else if (idStatoAttestato == Constants.CONSOLIDATO)
			statoModulo = "CONSOLIDATO";
		else if (idStatoAttestato == Constants.ANNULLATO || idStatoAttestato == Constants.ANNULLATO_BO)
			statoModulo = "ANNULLATO";
		else if (idStatoAttestato == Constants.DA_INVIARE)
			statoModulo = "CONSOLIDATO";
		
		
		log.debug("Stampo lo stato APE: "+statoModulo);
		
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setStatoModulo(statoModulo);
		
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setAnno(Converter.convertToBigInteger(certificato.getAnno()));
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setIdCertificatore(certificatore.getNumCertificatore());
		
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setProgressivoCertificato(certificato.getProgrCertificato());
		
		
		if (dDestUso != null)
		{
			modDoc.getMOD().getAttestato().getDatiGenerali().setClassificazione(dDestUso.getSigla() + " " + dDestUso.getDescr());

			// Verifico se è residenziale
			if (Converter.convertTo(dDestUso.getFlgResidenziale()))
			{
				modDoc.getMOD().getAttestato().getDatiGenerali().setFlagResidenziale(Constants.SI);
				modDoc.getMOD().getAttestato().getDatiGenerali().setFlagNonResidenziale(Constants.NO);
			} else {
				modDoc.getMOD().getAttestato().getDatiGenerali().setFlagResidenziale(Constants.NO);
				modDoc.getMOD().getAttestato().getDatiGenerali().setFlagNonResidenziale(Constants.SI);
			}	
			
		}
		
		
		
		// data validità
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataStr = sdf.format(certificato.getDtScadenza());
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setDataValidita(dataStr);
		
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setRegione(certificato.getDescRegione());
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setComune(certificato.getDescComune());
		String civico = "";
		if (certificato.getNumCivico() != null)
			civico = certificato.getNumCivico();
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setIndirizzo(certificato.getDescIndirizzo() + " " + civico);
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setPiano(Converter.convertToString(certificato.getPiano()));
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setInterno(certificato.getInterno());

		// coordinate geografiche
		java.math.BigDecimal coordN = Converter.convertToBigDecimal(certificato.getCoordN());
		java.math.BigDecimal coordE = Converter.convertToBigDecimal(certificato.getCoordE());
		/*
		*/
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setCoordinateGIS(coordN.toString() + " " + coordE.toString());

		modDoc.getMOD().getAttestato().getDatiPrecompilati().setAnnoCostruzione(Converter.convertToString(datiGenerali.getAnnoCostruzione()));
		modDoc.getMOD().getAttestato().getDatiGenerali().setZonaClimatica(datiGenerali.getZonaClimatica());

		modDoc.getMOD().getAttestato().getDatiGenerali().setSupUtileRisc(Converter.convertToBigDecimal(datiGenerali.getSupRiscaldata()));
		modDoc.getMOD().getAttestato().getDatiGenerali().setSupUtileRaffr(Converter.convertToBigDecimal(datiGenerali.getSupRaffrescata()));
		modDoc.getMOD().getAttestato().getDatiGenerali().setVolLordoRisc(Converter.convertToBigDecimal(datiGenerali.getVolLordoRiscaldato()));
		modDoc.getMOD().getAttestato().getDatiGenerali().setVolLordoRaffr(Converter.convertToBigDecimal(datiGenerali.getVolLordoRaffrescato()));
		
		// certificatore
		String cognomeRagSociale = certificatore.getCognome();

		String iscrittoOrdine = "";
		if (certificatore.getIscrittoOrdine() != null && certificatore.getIscrittoOrdine().equalsIgnoreCase(Constants.SI))
		{
			if (certificatore.getOrdine() != null)
				iscrittoOrdine = certificatore.getOrdine() + " / ";
			if (certificatore.getNumIscrAlbo() != null)
				iscrittoOrdine = iscrittoOrdine + certificatore.getNumIscrAlbo();			
		}
		
		civico = "";
		String indirizzo = "";
		String comune = "";
		String prov = "";
		
		if (azienda != null && azienda.getDescIndirizzo() != null) {

			cognomeRagSociale += " / " + azienda.getDenominazione();

			indirizzo = StringUtils.trimToEmpty(azienda.getDescIndirizzo());
			civico = StringUtils.trimToEmpty(azienda.getNumCivico());
			comune = StringUtils.trimToEmpty(azienda.getDescComune());
			prov = StringUtils.trimToEmpty(azienda.getDescProv());
			
		} else {
			if ("S".equalsIgnoreCase(certificatore.getFlgResidenzaItalia())) {
				indirizzo = StringUtils.trimToEmpty(certificatore.getDescIndirizzo());
				civico = StringUtils.trimToEmpty(certificatore.getNumCivicoResidenza());
				comune = StringUtils.trimToEmpty(certificatore.getDescComuneResidenza());
				prov = StringUtils.trimToEmpty(certificatore.getDescProvResidenza());
				
			} else {
				
				indirizzo = StringUtils.trimToEmpty(certificatore.getViaEstera());
				civico = StringUtils.trimToEmpty(certificatore.getCivicoEstero());
				comune = StringUtils.trimToEmpty(certificatore.getCittaEstera());
				prov = StringUtils.trimToEmpty(certificatore.getStatoResEstero());
				
			}
		}

		modDoc.getMOD().getAttestato().getDatiPrecompilati().getCertificatore().setDenominazione(certificatore.getNome() + " " + cognomeRagSociale);
		modDoc.getMOD().getAttestato().getDatiPrecompilati().getCertificatore().setIndirizzo(indirizzo
				+ " " + civico
				+ " " + comune
				+ " (" + prov  + ")");
		modDoc.getMOD().getAttestato().getDatiPrecompilati().getCertificatore().setEmail(certificatore.getEmail());
		modDoc.getMOD().getAttestato().getDatiPrecompilati().getCertificatore().setTelefono(certificatore.getTelefono());
		modDoc.getMOD().getAttestato().getDatiPrecompilati().getCertificatore().setTitolo(dTitolo);
		modDoc.getMOD().getAttestato().getDatiPrecompilati().getCertificatore().setOrdine(iscrittoOrdine);

		// data emissione
		dataStr = sdf.format(certificato.getDtInizio());
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setDataEmissione(dataStr);
		
		modDoc.getMOD().getAttestato().getDatiPrecompilati().setFirma(certificatore.getCognome() 
				+ " " + certificatore.getNome()
				+ " " + "N."
				+ " " + certificatore.getNumCertificatore());

		modDoc.getMOD().getAttestato().getDatiGenerali().setOggetto(Converter.convertToBigInteger(datiGenerali.getFkOggettoApe()));
		modDoc.getMOD().getAttestato().getDatiGenerali().setMotivazione(Converter.convertToBigInteger(altreInfo.getFkMotivo()));
		if (!GenericUtil.isNullOrEmpty(dMotivo)) {
			modDoc.getMOD().getAttestato().getDatiGenerali().setMotivazioneAltro(dMotivo);

		} else {

			modDoc.getMOD().getAttestato().getDatiGenerali().setMotivazioneAltro(altreInfo.getMotivoAltro());
			
		}
		

		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServizioEnergia(flagServizioEnergia);

		modDoc.getMOD().getAttestato().getDatiGenerali().setNumeroUI(Converter.convertToBigInteger(datiGenerali.getNrUm()));
		
		// Dichiarazione indipendenza
		modDoc.getMOD().getAttestato().getSoggettoCertificatore().setDichiarIndip(descDichIndipendenza);
		
		log.debug("[MapDto::mapToDatiGenerici] end");
		return modDoc;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiCatastaliReadOnly(it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			SiceeTCertificato certificato, List<SiceeTDatiCatastSec> datiCatastSecList){
		log.debug("[MapDto::mapToDatiCatastaliReadOnly] start");
		// sezione dati catastali

		List<it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali> rowDatiCatastaliList = modDoc.getMOD().getAttestato().getDatiPrecompilati().getSezDatiCatastali().getRowDatiCatastaliList();

		
		// Devo aggiungere il principale (che recupero da certificato)
		it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali rdc = it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali.Factory.newInstance();
		rdc.setFlagPrincipale(true);
		rdc.setComuneCatastale(certificato.getCodiceComuneCatastale());
		rdc.setSezione(certificato.getSezione());
		rdc.setFoglio(certificato.getFoglio());
		rdc.setParticella(certificato.getParticella());
		
		try{rdc.setDa1(Converter.convertToBigInteger(certificato.getSubalterno()));}catch (Exception e) {rdc.setDa1(null);}
		try{rdc.setA1(Converter.convertToBigInteger(certificato.getSubalterno()));}catch (Exception e) {rdc.setA1(null);}
		
		// questa la uso come chiave di rottura
		String chiaveCatastoOld = certificato.getCodiceComuneCatastale()+certificato.getSezione()+certificato.getFoglio()+certificato.getParticella();
		int maxPerRiga = 16;
		int elemPerRiga = 0;
		if (datiCatastSecList != null && datiCatastSecList.size() > 0)
		{
			String chiaveCatastoNew = null;

			it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali.SubalterniSingoli ss = it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali.SubalterniSingoli.Factory.newInstance();
			//			it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[] rssArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[numeroRighesubAltri];
			List<it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli> rowSubalterniSingoliList = new ArrayList<it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli>();
			it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli rowSubalterniSingolo = it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli.Factory.newInstance();

			for (SiceeTDatiCatastSec datiCatastali : datiCatastSecList) {

				// mi creo la chiave da confrontare
				chiaveCatastoNew = datiCatastali.getCodiceComuneCatastale()+datiCatastali.getSezione()+datiCatastali.getFoglio()+datiCatastali.getParticella();

				if (!chiaveCatastoOld.equalsIgnoreCase(chiaveCatastoNew))
				{

					rowSubalterniSingoliList.add(rowSubalterniSingolo);
					rowSubalterniSingolo = it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli.Factory.newInstance();

					// NEW
					it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[] rowSubalterniSingoliArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[rowSubalterniSingoliList.size()];
					rowSubalterniSingoliArray = rowSubalterniSingoliList.toArray(rowSubalterniSingoliArray);
					ss.setRowSubalterniSingoliArray(rowSubalterniSingoliArray);
					rdc.setSubalterniSingoli(ss);
					
					// Ripulisco la lista 
					rowSubalterniSingoliList.clear();
					
					///////////
					rowDatiCatastaliList.add(rdc);

					rdc = it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali.Factory.newInstance();
					rdc.setFlagPrincipale(false);
					rdc.setComuneCatastale(datiCatastali.getCodiceComuneCatastale());
					rdc.setSezione(datiCatastali.getSezione());
					rdc.setFoglio(datiCatastali.getFoglio());
					rdc.setParticella(datiCatastali.getParticella());

					// mi creo la nuova chiava di rottura
					chiaveCatastoOld = datiCatastali.getCodiceComuneCatastale()+datiCatastali.getSezione()+datiCatastali.getFoglio()+datiCatastali.getParticella();

					// Devo ripartire dal primo elemento
					elemPerRiga = 0;

				}

				// Aggiungo un nuovo subalterno singolo
				rowSubalterniSingolo.addSubalterno(datiCatastali.getSubalterno());
				elemPerRiga++;
				
				if (elemPerRiga == maxPerRiga)
				{
					// Ho già riempito tutta la riga del pdf, devo aggiungere una riga

					rowSubalterniSingoliList.add(rowSubalterniSingolo);
					rowSubalterniSingolo = it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli.Factory.newInstance();

					//it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[] rowSubalterniSingoliArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[rowSubalterniSingoliList.size()];
					//rowSubalterniSingoliArray = rowSubalterniSingoliList.toArray(rowSubalterniSingoliArray);
					//ss.setRowSubalterniSingoliArray(rowSubalterniSingoliArray);
					//rdc.setSubalterniSingoli(ss);

					elemPerRiga = 0;
					
					// Ripulisco la lista 
					//rowSubalterniSingoliList.clear();
				}

			}

			/// NEW
			rowSubalterniSingoliList.add(rowSubalterniSingolo);
			rowSubalterniSingolo = it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli.Factory.newInstance();

			// NEW
			it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[] rowSubalterniSingoliArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowSubalterniSingoliDocument.RowSubalterniSingoli[rowSubalterniSingoliList.size()];
			rowSubalterniSingoliArray = rowSubalterniSingoliList.toArray(rowSubalterniSingoliArray);
			ss.setRowSubalterniSingoliArray(rowSubalterniSingoliArray);
			rdc.setSubalterniSingoli(ss);
			///
			

		}
		rowDatiCatastaliList.add(rdc);

		it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali[] rowDatiCatastaliArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali[rowDatiCatastaliList.size()];
		rowDatiCatastaliArray = rowDatiCatastaliList.toArray(rowDatiCatastaliArray);
		modDoc.getMOD().getAttestato().getDatiPrecompilati().getSezDatiCatastali().setRowDatiCatastaliArray(rowDatiCatastaliArray);


		/*
		
		
		
		
		if (rowDatiCatastaliList.size() == 0) {
			//log.debug("\n>>>>>>> rowDatiCatastaliList.size() == 0 ; prima volta che entro");
			it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali rdc = it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali.Factory.newInstance();
			rdc.setFlagPrincipale(true);
			rdc.setComuneCatastale(apeDto.getCodiceComuneCatastale());
			rdc.setSezione(apeDto.getSezione());
			rdc.setFoglio(apeDto.getFoglio());
			rdc.setParticella(apeDto.getParticella());
			try{rdc.setDa1(Converter.convertToBigInteger(apeDto.getSubalterno()));}catch (Exception e) {rdc.setDa1(null);}
			try{rdc.setA1(Converter.convertToBigInteger(apeDto.getSubalterno()));}catch (Exception e) {rdc.setA1(null);}
			rowDatiCatastaliList.add(rdc);	

			it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali[] rowDatiCatastaliArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali[rowDatiCatastaliList.size()];
			rowDatiCatastaliArray = rowDatiCatastaliList.toArray(rowDatiCatastaliArray);
			modDoc.getMOD().getAttestato().getDatiPrecompilati().getSezDatiCatastali().setRowDatiCatastaliArray(rowDatiCatastaliArray);
		} 
		else {
			//log.debug("\n>>>>>>> rowDatiCatastaliList.size() > 0 ; ciclo sulle righe");
			for(it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali rdc : rowDatiCatastaliList) {
				if (rdc.getFlagPrincipale() == true) {
					rdc.setComuneCatastale(apeDto.getCodiceComuneCatastale());
					rdc.setSezione(apeDto.getSezione());
					rdc.setFoglio(apeDto.getFoglio());
					rdc.setParticella(apeDto.getParticella());
					try{rdc.setDa1(Converter.convertToBigInteger(apeDto.getSubalterno()));}catch (Exception e) {rdc.setDa1(null);}
					try{rdc.setA1(Converter.convertToBigInteger(apeDto.getSubalterno()));}catch (Exception e) {rdc.setA1(null);}
				
				}
				//rowDatiCatastaliBuildList.add(rdc);	
			}
			it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali[] rowDatiCatastaliArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowDatiCatastaliDocument.RowDatiCatastali[rowDatiCatastaliList.size()];
			rowDatiCatastaliArray = rowDatiCatastaliList.toArray(rowDatiCatastaliArray);
			modDoc.getMOD().getAttestato().getDatiPrecompilati().getSezDatiCatastali().setRowDatiCatastaliArray(rowDatiCatastaliArray);
		}	

		*/

		log.debug("[MapDto::mapToDatiCatastaliReadOnly] end");
		return modDoc;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiEnerReadOnly(it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			SiceeTDatiEner2015 datiEner2015){
		log.debug("[MapDto::mapToDatiEnerReadOnly] start");


		modDoc.getMOD().getAttestato().getPrestEnergImpianti().setEmissioniCO2(Converter.convertToBigDecimal(datiEner2015.getEmissioniCo2()));
		
		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServiziClimaInv(datiEner2015.getFlgClimatInvernale());
		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServiziClimaEst(datiEner2015.getFlgClimatEstiva());
		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServiziVent(datiEner2015.getFlgVentilMeccanica());
		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServiziAcquaCalda(datiEner2015.getFlgProdH2oSanitaria());
		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServiziLuce(datiEner2015.getFlgIlluminazione());
		modDoc.getMOD().getAttestato().getDatiGenerali().setFlagServiziTrasporto(datiEner2015.getFlgTrasportoPersCose());

		
		log.debug("[MapDto::mapToDatiEnerReadOnly] end");
		return modDoc;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiConsumiReadOnly(it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			List<SiceeDCombustibile> elencoConsumiCombustibile, List<SiceeTQtaConsumi2015> quantitaConsumi2015, List<SiceeDUnitaMisura2015> unitaMisura2015){
		log.debug("[MapDto::mapToDatiConsumiReadOnly] start");
		// sezione dati consumi
	
		
		///////////////////////////////////////////////
		
		it.csi.sicee.siceeweb.xml.attestato2015.data.PrestEnergImpiantiDocument.PrestEnergImpianti.ElencoFontiEnergetiche efe = it.csi.sicee.siceeweb.xml.attestato2015.data.PrestEnergImpiantiDocument.PrestEnergImpianti.ElencoFontiEnergetiche.Factory.newInstance();
		it.csi.sicee.siceeweb.xml.attestato2015.data.RowConsumiCombustibileDocument.RowConsumiCombustibile consumiCombustibile = null;
		List<it.csi.sicee.siceeweb.xml.attestato2015.data.RowConsumiCombustibileDocument.RowConsumiCombustibile> consumiCombustibileList = efe.getRowConsumiCombustibileList();
		it.csi.sicee.siceeweb.xml.attestato2015.data.RowConsumiCombustibileDocument.RowConsumiCombustibile consumiAltroCombustibile = it.csi.sicee.siceeweb.xml.attestato2015.data.RowConsumiCombustibileDocument.RowConsumiCombustibile.Factory.newInstance();
		it.csi.sicee.siceeweb.xml.attestato2015.data.PrestEnergImpiantiDocument.PrestEnergImpianti.AltreFontiEnergetiche afe = it.csi.sicee.siceeweb.xml.attestato2015.data.PrestEnergImpiantiDocument.PrestEnergImpianti.AltreFontiEnergetiche.Factory.newInstance();

		int idCombustibile = 0;
		SiceeTQtaConsumi2015 qtaConsumi = null;
		BigDecimal quantita = null;
		String unitaMisura = null;
		for (SiceeDCombustibile c : elencoConsumiCombustibile) {
			
			// Devo aggiungere tutti combustibili
			consumiCombustibile = it.csi.sicee.siceeweb.xml.attestato2015.data.RowConsumiCombustibileDocument.RowConsumiCombustibile.Factory.newInstance();
			idCombustibile = c.getIdCombustibile();
			consumiCombustibile.setIdCombustibile(Converter.convertToBigInteger(idCombustibile));
			consumiCombustibile.setDescrCombustibile(c.getDescr());
			
			// devo compilare le quantità con l'unità di misura di quelli compilati
			if (idCombustibile != Constants.ID_COMBUSTIBILE_GASOLIO)
			{
				qtaConsumi = decodeQtaConsumi(idCombustibile, quantitaConsumi2015);
				if (qtaConsumi != null)
				{

					quantita = Converter.convertToBigDecimal(qtaConsumi.getQuantita());
					unitaMisura = decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);

					consumiCombustibile.setFlagPresente("S");
					consumiCombustibile.setQuantita(quantita);
					consumiCombustibile.setUi(unitaMisura);

				}
				
			}
			else
			{
				quantita = new BigDecimal(0);
				
				// Cerco il Gasolio
				qtaConsumi = decodeQtaConsumi(Constants.ID_COMBUSTIBILE_GASOL, quantitaConsumi2015);
				if (qtaConsumi != null)
				{
					
					quantita = quantita.add(Converter.convertToBigDecimal(qtaConsumi.getQuantita()));
					unitaMisura = decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);
				}
				
				// Cerco l'Olio combustibile
				qtaConsumi = decodeQtaConsumi(Constants.ID_COMBUSTIBILE_OLIO_COMBUSTIBILE, quantitaConsumi2015);
				if (qtaConsumi != null)
				{
					
					quantita = quantita.add(Converter.convertToBigDecimal(qtaConsumi.getQuantita()));
					unitaMisura = decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);
				}
				
				if (quantita.doubleValue() > 0)
				{
					consumiCombustibile.setFlagPresente("S");
					consumiCombustibile.setQuantita(quantita);
					consumiCombustibile.setUi(unitaMisura);
				}
			}
				
			
			
			consumiCombustibileList.add(consumiCombustibile);
	    }		
		
		modDoc.getMOD().getAttestato().getPrestEnergImpianti().setElencoFontiEnergetiche(efe);
		
		///////////////////////////////////////////////
		
		
		qtaConsumi = decodeQtaConsumi(Constants.ID_COMBUSTIBILE_ALTRO, quantitaConsumi2015);

		if (qtaConsumi != null) {

			consumiAltroCombustibile.setFlagPresente("S");
			consumiAltroCombustibile.setQuantita(Converter.convertToBigDecimal(qtaConsumi.getQuantita()));
			consumiAltroCombustibile.setUi(decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015));
			consumiAltroCombustibile.setDescrCombustibile(qtaConsumi.getAltroDescrComb());
			
			afe.setRowConsumiCombustibile(consumiAltroCombustibile);

			modDoc.getMOD().getAttestato().getPrestEnergImpianti().setAltreFontiEnergetiche(afe);
		}
		
		log.debug("[MapDto::mapToDatiConsumiReadOnly] end");
		return modDoc;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiRaccomandazioniReadOnly(it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			SiceeTDatiGenerali datiGenerali,
			List<SiceeTRaccomand2015> raccomand2015, List<SiceeDClasseEnergetica> elencoClasseEnergetica, SiceeTDatiEner2015 datiEner2015, SiceeRCombDener2015 combEner2015){
		log.debug("[MapDto::mapToDatiRaccomandazioniReadOnly] start");
		// sezione dati consumi
		
		List<it.csi.sicee.siceeweb.xml.attestato2015.data.RowRenDocument.RowRen> rrList = new ArrayList<it.csi.sicee.siceeweb.xml.attestato2015.data.RowRenDocument.RowRen>();
		String codice = null;
		String tipoIntervento = null;
		boolean ristrutturazioneImportante;
		BigDecimal tempoRitorno = null;
		String classe = null;
		BigDecimal epglnren = null;
		for (SiceeTRaccomand2015 siceeTRaccomand2015 : raccomand2015) {
			it.csi.sicee.siceeweb.xml.attestato2015.data.RowRenDocument.RowRen rr = it.csi.sicee.siceeweb.xml.attestato2015.data.RowRenDocument.RowRen.Factory.newInstance();

			
			codice = siceeTRaccomand2015.getCodiceRen();
			tipoIntervento = siceeTRaccomand2015.getTipoIntervento();
			ristrutturazioneImportante = Converter.convertTo(siceeTRaccomand2015.getFlgRistrutturazione());
			tempoRitorno = Converter.convertToBigDecimal(siceeTRaccomand2015.getNrAnniRitInvest());
			classe = decodClasseEnergeticaId(siceeTRaccomand2015.getFkClasseEnergetica(),elencoClasseEnergetica);
			epglnren = Converter.convertToBigDecimal(siceeTRaccomand2015.getEpglNrenSingoloInt());
			
			rr.setCodRen(codice);
			rr.setTipoIntervento(tipoIntervento);
			rr.setRistrutturazioneImportante(decodBooleanSINO(ristrutturazioneImportante));
			rr.setAnniRitornoInv(tempoRitorno);
			rr.setClasse(classe);
			rr.setEPglnren(epglnren);
			rrList.add(rr);
		}
		
//		Short codice = null;
//		String tipoIntervento = null;
//		boolean ristrutturazioneImportante;
//		BigDecimal tempoRitorno = null;
//		String classe = null;
//		BigDecimal epglnren = null;
//		List<TypeInterventoRaccomandato> interventiRaccomandatiList = docXmlApeCompleto2015.getDocumento().getApe2015().getRaccomandazioni().getInterventoRaccomandatoList();
//		
		
		it.csi.sicee.siceeweb.xml.attestato2015.data.RowRenDocument.RowRen[] rrArray = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowRenDocument.RowRen[rrList.size()];
		rrArray = rrList.toArray(rrArray);
		modDoc.getMOD().getAttestato().getRaccomandazioni().getSezioneRen().setRowRenArray(rrArray);
		
		String classeRaggiungibile = decodClasseEnergeticaId(datiEner2015.getFkCeRaccTotale(),elencoClasseEnergetica);;
		BigDecimal epglnrenRaggiungibile = Converter.convertToBigDecimal(datiEner2015.getEpglNrenRaccTotale());
		modDoc.getMOD().getAttestato().getRaccomandazioni().setClasse(classeRaggiungibile);
		modDoc.getMOD().getAttestato().getRaccomandazioni().setEPglnrenTotale(epglnrenRaggiungibile);
		
		
		// dati energetici
		BigDecimal energiaEsportata = Converter.convertToBigDecimal(datiEner2015.getEnergiaEsportata());
		//try{vettore = docXmlApeCompleto2015.getDocumento().getApe2015().getDatiEnergetici().getVettoreEnergetico();}catch (Exception e) {vettore = null;}
		
		//CodiceDescrizione cd = decodVettoreEnergetico(vettore, datiGenericiDto.getCombustibiliEsportazione());
		
		if (combEner2015 != null)
		{
			it.csi.sicee.siceeweb.xml.attestato2015.data.RowVettoreDocument.RowVettore[] rv = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowVettoreDocument.RowVettore[1];
			rv[0] = it.csi.sicee.siceeweb.xml.attestato2015.data.RowVettoreDocument.RowVettore.Factory.newInstance();
			rv[0].setCodVettore(Converter.convertToBigInteger(combEner2015.getIdCombustibile()));
			rv[0].setDescrVettore(combEner2015.getDescrAltro());
			modDoc.getMOD().getAttestato().getAltriDatiEnergetici().getVettori().setRowVettoreArray(rv);
		}
		
		modDoc.getMOD().getAttestato().getAltriDatiEnergetici().setEnergiaEsportata(energiaEsportata);
		
		
		// dati fabbricato
		BigDecimal superficieDisperdente = Converter.convertToBigDecimal(datiGenerali.getSupDisperdente());
		BigDecimal rapportoSv = Converter.convertToBigDecimal(datiEner2015.getRapportoSv());
		BigDecimal ephnd =  Converter.convertToBigDecimal(datiEner2015.getEph());
		BigDecimal rapportoAsolAsupUtile = Converter.convertToBigDecimal(datiEner2015.getAsolAsup());
		BigDecimal yie = Converter.convertToBigDecimal(datiEner2015.getYie());

		modDoc.getMOD().getAttestato().getAltriDatiFabbricato().setSupDisperdente(superficieDisperdente);
		modDoc.getMOD().getAttestato().getAltriDatiFabbricato().setRapportoSV(rapportoSv);
		modDoc.getMOD().getAttestato().getAltriDatiFabbricato().setEPHnd(ephnd);
		modDoc.getMOD().getAttestato().getAltriDatiFabbricato().setRapportoAsolAsup(rapportoAsolAsupUtile);
		modDoc.getMOD().getAttestato().getAltriDatiFabbricato().setYie(yie);

		
		return modDoc;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiImpiantiReadOnly(
			List<SiceeRCertifServener2015> certifServener2015List, List<SiceeTDetImp2015> detImp2015List, it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			List<SiceeDCombustibile> elencoCombustibiliDettImpianti, List<SiceeDTipoImpianto2015> elencoTipiImpianto, SiceeTDatiEner2015 datiEner2015, List<SiceeDClasseEnergetica> classiEnergetiche)
			{

		
		log.debug("\n\n\n >>>>>>> mappaImportDatiImpiantiReadOnly");
		
		it.csi.sicee.siceeweb.xml.attestato2015.data.RowImpiantoDocument.RowImpianto[] ri = null;
		SiceeRCertifServener2015 certifServener2015 = null;
		List<SiceeTDetImp2015> detImp2015Parz = null;
		
		log.debug("##### mappaImportDatiImpianti - INIZIO");
		
		
		// climatizzazione invernale
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_CLIMAINVER);
		if (certifServener2015 != null) {

			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaInver().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaInver().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaInver().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaInver().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_CLIMAINVER");
			}
			
			
			
		}
		// climatizzazione estiva
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_CLIMAEST);
		if (certifServener2015 != null) {

			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaEst().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaEst().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaEst().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneClimaEst().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_CLIMAEST");
			}
			
		}
		// produzione acqua calda sanitaria
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_ACQUACALDA);
		if (certifServener2015 != null) {

			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneAcquaCalda().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneAcquaCalda().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneAcquaCalda().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneAcquaCalda().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_ACQUACALDA");
			}
		}
		
		// impianti combinati
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_IMPIANTICOMBINATI);
		if (certifServener2015 != null) {

			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneImpiantiCombinati().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneImpiantiCombinati().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneImpiantiCombinati().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneImpiantiCombinati().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_IMPIANTICOMBINATI");
			}
		}
		// produzione energia da fonti rinnovabili
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_PRODFONTIRINN);
		if (certifServener2015 != null) {

			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneProdFontiRinn().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneProdFontiRinn().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneProdFontiRinn().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneProdFontiRinn().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_PRODFONTIRINN");
			}
		
		}

		// ventilazione meccanica
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_VENTMECC);
		if (certifServener2015 != null) {
			
			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneVentMecc().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneVentMecc().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneVentMecc().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneVentMecc().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_VENTMECC");
			}
		}

		// sezione illuminazione
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_ILLUMINAZIONE);
		if (certifServener2015 != null) {
			
			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneIlluminazione().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneIlluminazione().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneIlluminazione().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneIlluminazione().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_ILLUMINAZIONE");
			}
		}

		// sezione trasporto
		certifServener2015 = recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_TRASPORTO);
		if (certifServener2015 != null) {
			
			detImp2015Parz = recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneTrasporto().setEfficienza(Converter.convertToBigDecimal(certifServener2015.getEfficienza()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneTrasporto().setEpren(Converter.convertToBigDecimal(certifServener2015.getEpren()));
			modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneTrasporto().setEPnren(Converter.convertToBigDecimal(certifServener2015.getEpnren()));
			ri = mapToDatiImpiantoDettReadOnly(detImp2015Parz, elencoCombustibiliDettImpianti, elencoTipiImpianto);
			if (ri != null)
			{
				modDoc.getMOD().getAttestato().getDettaglioImpianti().getSezioneTrasporto().getElencoImpianti().setRowImpiantoArray(ri);
			}
			else
			{
				log.debug("NON SETTATO IL SERVIZIO: SEZIONE_TRASPORTO");
			}
		}

		
		// BEPPE - CALCOLO EPglren totale - inizio

		modDoc.getMOD().getAttestato().getPrestEnergImpianti().setEpglrenTotale(Converter.convertToBigDecimal(datiEner2015.getEpglRenGlobale()));
		modDoc.getMOD().getAttestato().getPrestEnergImpianti().setEpglnrenTotale(Converter.convertToBigDecimal(datiEner2015.getEpglNrenGlobale()));
		modDoc.getMOD().getAttestato().getPrestEnergFabb().setEpglnren(Converter.convertToBigDecimal(datiEner2015.getEpglNrenGlobale()));

		if (datiEner2015.getFkClasseEnergetica() != null)
		{
			modDoc.getMOD().getAttestato().getPrestEnergFabb().setClasseEnergetica(decodClasseEnergeticaId(datiEner2015.getFkClasseEnergetica(), classiEnergetiche));
			//datiGenericiDto.getDatiEner2015().setFkClasseEnergetica(fkClasseEnerg);
			
			log.debug("########## IMMAGINE - fine ##########");

			
		}

		if (datiEner2015.getEpglNrenNuovi() != null)
		{
			modDoc.getMOD().getAttestato().getPrestEnergFabb().setClasseEdNuovi(decodClasseEnergeticaId(datiEner2015.getFkClasseEnerNuovi(), classiEnergetiche));
			modDoc.getMOD().getAttestato().getPrestEnergFabb().setEpglnrenEdNuovi(Converter.convertToBigDecimal(datiEner2015.getEpglNrenNuovi()));
		}

		if (datiEner2015.getEpglNrenEsistenti() != null)
		{
			modDoc.getMOD().getAttestato().getPrestEnergFabb().setClasseEdEsistenti(decodClasseEnergeticaId(datiEner2015.getFkClasseEnerEsistenti(), classiEnergetiche));
			modDoc.getMOD().getAttestato().getPrestEnergFabb().setEpglnrenEdEsistenti(Converter.convertToBigDecimal(datiEner2015.getEpglNrenEsistenti()));
		}
		modDoc.getMOD().getAttestato().getPrestEnergFabb().setFlagEdifEnergZero(datiEner2015.getFlgEdifE0());

		
		// Devo settare la classe

		// BEPPE - CALCOLO CLASSE - fine


		return modDoc;
	}
	
	public static List<SiceeTDetImp2015> recuperaDettImp2015ByServEner(List<SiceeTDetImp2015> dettImp2015Tot, int idServEner)
	{
		List<SiceeTDetImp2015> detImp2015Parz = new ArrayList<SiceeTDetImp2015>();
		
		for (SiceeTDetImp2015 siceeTDetImp2015 : dettImp2015Tot) 
		{
			if (siceeTDetImp2015.getFkServEner() == idServEner)
			{
				// Devo aggiungere l'elemento
				detImp2015Parz.add(siceeTDetImp2015);
			}
		}
		
		return detImp2015Parz;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument mapToDatiFinaliReadOnly(it.csi.sicee.siceeweb.xml.attestato2015.data.MODDocument modDoc, 
			SiceeTAltreInfo altreInfo, SiceeTDatiEner2015 datiEner2015){
		log.debug("[MapDto::mapToDatiFinaliReadOnly] start");
		
		
		
		modDoc.getMOD().getAttestato().getInformazioni().setNote(altreInfo.getInfoMiglPrestEnerg());

		
		modDoc.getMOD().getAttestato().getSoggettoCertificatore().setTipoSoggetto(Converter.convertToBigInteger(altreInfo.getFkRuoloCert()));
		modDoc.getMOD().getAttestato().getSoggettoCertificatore().setInfoAgg(altreInfo.getUltInfo());

		modDoc.getMOD().getAttestato().getSopralluoghi().setFlagEseguitoRilievo(altreInfo.getFlgSopralluogo().equals(Constants.SI)?Constants.LABEL_SI.toUpperCase():Constants.LABEL_NO.toUpperCase());
		modDoc.getMOD().getAttestato().getSoftware().setDomanda1(altreInfo.getFlgSw1().equals(Constants.SI)?Constants.LABEL_SI.toUpperCase():Constants.LABEL_NO.toUpperCase());
		modDoc.getMOD().getAttestato().getSoftware().setDomanda2(altreInfo.getFlgSw2().equals(Constants.SI)?Constants.LABEL_SI.toUpperCase():Constants.LABEL_NO.toUpperCase());

		
		modDoc.getMOD().getAttestato().getAltriDatiFabbricato().setEPHndLimite(Converter.convertToBigDecimal(datiEner2015.getEphLimite()));
		modDoc.getMOD().getAttestato().getPrestEnergFabb().setEpglnrenStandard(Converter.convertToBigDecimal(datiEner2015.getEpglNrenRif()));

		log.debug("[MapDto::mapToDatiFinaliReadOnly] end");

		return modDoc;
	}
	
	public static it.csi.sicee.siceeweb.xml.attestato2015.data.RowImpiantoDocument.RowImpianto[] mapToDatiImpiantoDettReadOnly(List<SiceeTDetImp2015> impiantiList, List<SiceeDCombustibile> elencoCombustibiliDettImpianti, List<SiceeDTipoImpianto2015> elencoTipiImpianto) {

		it.csi.sicee.siceeweb.xml.attestato2015.data.RowImpiantoDocument.RowImpianto[] ri = null;
		if ((impiantiList != null) && (impiantiList.size() > 0)) {
			log.debug("\n\n\n >>>>>>> impiantiList.size(): " + impiantiList.size());
			int i = 0;
			Integer tipoImpianto = null;
			String descrizioneImpianto = null;
			Integer annoInstallazione = null;
			Integer codiceCatastoRegionaleImpiantiTermici = null;
			//String codiceCatastoRegionaleImpiantiTermici = null;
			Integer vettoriEnergeticiUtilizzati = null;
			BigDecimal potenzaNominale = null;
			ri = new it.csi.sicee.siceeweb.xml.attestato2015.data.RowImpiantoDocument.RowImpianto[impiantiList.size()];
			for (SiceeTDetImp2015 impianto : impiantiList) {
				ri[i] = it.csi.sicee.siceeweb.xml.attestato2015.data.RowImpiantoDocument.RowImpianto.Factory.newInstance();
				tipoImpianto = impianto.getFkTipoImpianto();
				descrizioneImpianto = impianto.getTipoImpianto();
				annoInstallazione = impianto.getAnnoInstall();
				
				codiceCatastoRegionaleImpiantiTermici = impianto.getCodiceImpiantoCit();
				//Se è presente la lista dei vettoriEnergeticiUtilizzati prendo il primo elemento e scarto gli altri
				vettoriEnergeticiUtilizzati = impianto.getFkCombustibile(); 
				potenzaNominale = Converter.convertToBigDecimal(impianto.getPotenzaNominKw());
				
				String descrizioneCompletaImpianto = decodTipoImpiantoDesc(tipoImpianto, elencoTipiImpianto) + " " + StringUtils.trimToEmpty(descrizioneImpianto);
				
				log.debug("Stampo la descrizioneCompletaImpianto: "+descrizioneCompletaImpianto);
				
				ri[i].setTipoImpianto(descrizioneCompletaImpianto);
				ri[i].setAnnoInst(Converter.convertToBigInteger(annoInstallazione));
				
				log.debug("Stampo la codiceCatastoRegionaleImpiantiTermici: "+codiceCatastoRegionaleImpiantiTermici);
				
				//if (!GenericUtil.isNullOrEmpty(codiceCatastoRegionaleImpiantiTermici))
				if (!impianto.isCodiceImpiantoCitNull())
					ri[i].setCodCatReg(codiceCatastoRegionaleImpiantiTermici.toString());
				else
					ri[i].setCodCatReg(null);
				
				ri[i].setCombustibile(decodVettoreEnergeticoDettImpiantoDesc(vettoriEnergeticiUtilizzati, elencoCombustibiliDettImpianti));
				
				if (potenzaNominale != null)
				{
					ri[i].setPotenza(potenzaNominale);
				}
				
				i++;
			}
		} 

		return ri;
	}
	
	public static SiceeRCertifServener2015 recuperaCertifServener2015ByServEner(List<SiceeRCertifServener2015> certifServener2015Tot, int idServEner)
	{
		SiceeRCertifServener2015 certifServener2015 = null;
		
		for (SiceeRCertifServener2015 siceeRCertifServener2015 : certifServener2015Tot) 
		{
			if (siceeRCertifServener2015.getIdServEner() == idServEner)
			{
				// Devo settare l'elemento trovato
				certifServener2015 = siceeRCertifServener2015;;
			}
				
		}
		
		return certifServener2015;
	}
	
	public static String decodTipoImpiantoDesc (Short tipoImpianto, List<SiceeDTipoImpianto2015> tipiImpianto) {
		String retval = new String();
		if (tipoImpianto != null) {
			
			retval = decodTipoImpiantoDesc(tipoImpianto.intValue(), tipiImpianto);
			
		}
		return retval;
	}
	
	public static String decodTipoImpiantoDesc (Integer tipoImpianto, List<SiceeDTipoImpianto2015> tipiImpianto) {
		String retval = new String();
		
		if (!GenericUtil.isNullOrEmpty(tipoImpianto)) {
			for (SiceeDTipoImpianto2015 ce : tipiImpianto) {
				if (ce.getIdTipoImpianto().intValue() == tipoImpianto.intValue()) 
				{
					retval = ce.getDescr();
				}
			}
		}
		return retval;
	}
	
	public static String decodClasseEnergeticaId (Integer idClasse, List<SiceeDClasseEnergetica> classiEnergetiche) {
		String retval = null;
		if (idClasse != null) {
			for (SiceeDClasseEnergetica ce : classiEnergetiche) {
				if (ce.getIdClasse().intValue() == idClasse.intValue()) 
				{
					retval = ce.getDescr();
				}
			}
		}
		return retval;
	}
	
	public static String decodVettoreEnergeticoDettImpiantoDesc (Integer vettore, List<SiceeDCombustibile> combustibiliEsportazione) {
		String retval = new String();
		if (vettore != null) {
			for (SiceeDCombustibile ce : combustibiliEsportazione) {
				if (ce.getIdCombustibile().intValue() == vettore.intValue()) 
				{
					retval = ce.getDescr();
				}
			}
		}
		return retval;
	}
	
	public static String decodBooleanSINO (boolean codice) {
		String retval = null;
		//false=0 true=1
		if (codice == false) {
			retval = Constants.LABEL_NO.toUpperCase();
		} else {
			retval = Constants.LABEL_SI.toUpperCase();
		}
		return retval;
	}
	
	public static String decodeUnitaMisura(Integer idUnitaMisura, List<SiceeDUnitaMisura2015> unitaMisure2015)
	{
		String unita = null;
		
		for (SiceeDUnitaMisura2015 unitaMis : unitaMisure2015) {
			if (idUnitaMisura.intValue() == unitaMis.getIdUnitaMisura().intValue())
			{
				unita = unitaMis.getDescr();
			}
		}
		
		return unita;
	}
	
	public static SiceeTQtaConsumi2015 decodeQtaConsumi(int idCombustibile, List<SiceeTQtaConsumi2015> quantitaConsumi2015)
	{
		SiceeTQtaConsumi2015 qtaConsumi = null;
		
		for (SiceeTQtaConsumi2015 siceeTQtaConsumi2015 : quantitaConsumi2015) {
			if (idCombustibile == siceeTQtaConsumi2015.getFkCombustibile().intValue())
			{
				qtaConsumi = siceeTQtaConsumi2015;
			}
		}
		
		return qtaConsumi;
	}
}
