/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeDClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDCombustibile;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDDestUso2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoImpianto2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDUnitaMisura2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRCertifServener2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRCombDener2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAltreInfo;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAzienda;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificato;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificatore;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSec;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiEner2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiGenerali;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDetImp2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTQtaConsumi2015;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRaccomand2015;
import it.csi.sicee.siceesrv.business.print.dto.ApeReadOnlyData;
import it.csi.sicee.siceesrv.business.print.dto.ApeTarghettaReadOnlyData;
import it.csi.sicee.siceesrv.business.print.dto.RigaDatiCatastali;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.sicee.siceesrv.business.util.Converter;
import it.csi.sicee.siceesrv.business.util.GenericUtil;
import it.csi.sicee.siceesrv.business.util.MapDto;


public class PrintApe extends PrintBase {
		
	private boolean isSimul;
	private final float BORDER_APE_TABLE_WIDTH = 1.2f;
	private final float MIN_HEIGHT_CELL = 20f;
	
	public PrintApe() {
		this.setIsSimul(false);
	}
	
	public PrintApe(boolean isSimul) {
		this.setIsSimul(isSimul);
	}
	
	public boolean getIsSimul() {
		return isSimul;
	}

	public void setIsSimul(boolean isSimul) {
		this.isSimul = isSimul;
	}

	public static void main(String[] args) {		
		try {
			PrintApe printApe = new PrintApe(true);
						
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
			String dataAttuale = sdf.format(new Date());

			byte[] foto = null;
			
			try {
				foto = IOUtils.toByteArray(new FileInputStream(""));
			} catch (Exception e) {
				System.out.println("Foto non trovata");
			}
			
			byte[] ape = printApe.stampaPdfApe(null, foto, Constants.CONSOLIDATO);			
			FileOutputStream fileStream =  new FileOutputStream("C:/Repo/CSI/sicee/sicee_siceesrv/test/java/test/siceesrv/"+ dataAttuale +"_test_ape.pdf");

//			byte[] ape = printApe.stampaPdfTarghettaApe(null);
//			FileOutputStream fileStream =  new FileOutputStream("C:/Repo/CSI/sicee_siceesrv/test/java/test/siceesrv/"+ dataAttuale +"_test_targhetta_ape.pdf");
			
			fileStream.write(ape);   
			fileStream.flush(); 
			fileStream.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public byte[] stampaPdfApe(ApeReadOnlyData apeReadOnlyData, byte[] foto, Integer idStatoAttestato)
	{	
		byte[] pdfApe = {};

		try {
			if (this.isSimul) {
				apeReadOnlyData = new ApeReadOnlyData();
				SiceeTAltreInfo altreInfo = new SiceeTAltreInfo();
				altreInfo.setAltroServiziEnergia(Constants.MOTIVO_RILASCIO_CONTRATTO_SERVIZIO_ENERGIA_ANTE_OPERAM);
				apeReadOnlyData.setAltreInfo(altreInfo);
				apeReadOnlyData.setDatiGenerali(new SiceeTDatiGenerali());
				apeReadOnlyData.setDestinazioneUso2015(new SiceeDDestUso2015());
				SiceeTCertificato certificato = new SiceeTCertificato();
				certificato.setSubalterno("2");
				apeReadOnlyData.setCertificato(certificato);
				apeReadOnlyData.setDatiEner2015(new SiceeTDatiEner2015());
				apeReadOnlyData.setCertificatore(new SiceeTCertificatore());
				List<SiceeDCombustibile> elencoConsumiCombustibile = new ArrayList<SiceeDCombustibile>();
				SiceeDCombustibile combustibile = new SiceeDCombustibile();
				combustibile.setDescr("Energia elettrica");
				combustibile.setIdCombustibile(Constants.ID_COMBUSTIBILE_GASOLIO);
				elencoConsumiCombustibile.add(combustibile);
				apeReadOnlyData.setElencoConsumiCombustibile(elencoConsumiCombustibile);
				List<SiceeTQtaConsumi2015> quantitaConsumi2015 = new ArrayList<SiceeTQtaConsumi2015>();
				SiceeTQtaConsumi2015 quantitaConsumo = new SiceeTQtaConsumi2015();
				quantitaConsumo.setFkCombustibile(1);
				quantitaConsumi2015.add(quantitaConsumo);
				apeReadOnlyData.setQuantitaConsumi2015(quantitaConsumi2015);
				List<SiceeDUnitaMisura2015> unitaMisura2015 = new ArrayList<SiceeDUnitaMisura2015>();
				SiceeDUnitaMisura2015 unitaMisura = new SiceeDUnitaMisura2015();
				unitaMisura.setIdUnitaMisura(1);
				unitaMisura2015.add(unitaMisura);
				apeReadOnlyData.setUnitaMisura2015(unitaMisura2015);
				List<SiceeTRaccomand2015> raccomand2015 = new ArrayList<SiceeTRaccomand2015>();
				SiceeTRaccomand2015 raccomand = new SiceeTRaccomand2015();
				raccomand.setCodiceRen("Codice 1");
				raccomand2015.add(raccomand);
				apeReadOnlyData.setRaccomand2015(raccomand2015);
				List<SiceeDClasseEnergetica> elencoClasseEnergetica = new ArrayList<SiceeDClasseEnergetica>();
				SiceeDClasseEnergetica classeEnergetica = new SiceeDClasseEnergetica();
				classeEnergetica.setDescr("C");
				elencoClasseEnergetica.add(classeEnergetica);
				apeReadOnlyData.setElencoClasseEnergetica(elencoClasseEnergetica);
				List<SiceeRCertifServener2015> certifServener2015List = new ArrayList<SiceeRCertifServener2015>();
				SiceeRCertifServener2015 certifServener2015 = new SiceeRCertifServener2015();
				certifServener2015.setIdServEner(Constants.SEZIONE_CLIMAINVER);
				certifServener2015.setEfficienza(Double.valueOf(24));
				certifServener2015.setEpren(Double.valueOf(20));
				certifServener2015.setEpnren(Double.valueOf(22));
				certifServener2015List.add(certifServener2015);
				apeReadOnlyData.setCertifServener2015List(certifServener2015List);
				List<SiceeTDetImp2015> detImp2015List = new ArrayList<SiceeTDetImp2015>();
				SiceeTDetImp2015 detImp2015 = new SiceeTDetImp2015();
				detImp2015.setFkServEner(Constants.SEZIONE_CLIMAINVER);
				detImp2015.setAnnoInstall(2018);
				detImp2015.setFkTipoImpianto(1);
				detImp2015.setTipoImpianto("Tipo 1");
				detImp2015.setCodiceImpiantoCit(2);
				detImp2015List.add(detImp2015);
				
				detImp2015 = new SiceeTDetImp2015();
				detImp2015.setFkServEner(Constants.SEZIONE_CLIMAINVER);
				detImp2015.setAnnoInstall(2018);
				detImp2015.setFkTipoImpianto(2);
				detImp2015.setTipoImpianto("Tipo 2");
				detImp2015.setCodiceImpiantoCit(4);
				detImp2015List.add(detImp2015);
				apeReadOnlyData.setDetImp2015List(detImp2015List);
				List<SiceeDCombustibile> elencoCombustibiliDettImpianti = new ArrayList<SiceeDCombustibile>();
				elencoCombustibiliDettImpianti.add(new SiceeDCombustibile());
				apeReadOnlyData.setElencoCombustibiliDettImpianti(elencoCombustibiliDettImpianti);
				List<SiceeDTipoImpianto2015> elencoTipiImpianto = new ArrayList<SiceeDTipoImpianto2015>();
				SiceeDTipoImpianto2015 tipoImpianto = new SiceeDTipoImpianto2015();
				tipoImpianto.setIdTipoImpianto(2);
				tipoImpianto.setDescr("Impianto 1");
				elencoTipiImpianto.add(tipoImpianto);
				apeReadOnlyData.setElencoTipiImpianto(elencoTipiImpianto);
				
				List<SiceeTDatiCatastSec> datiCatastSecList = new ArrayList<SiceeTDatiCatastSec>();
				SiceeTDatiCatastSec datiCatastSec = new SiceeTDatiCatastSec();
				datiCatastSec.setSubalterno("3");
				datiCatastSecList.add(datiCatastSec);
				datiCatastSec = new SiceeTDatiCatastSec();
				datiCatastSec.setSubalterno("4");
				datiCatastSecList.add(datiCatastSec);
				datiCatastSec = new SiceeTDatiCatastSec();
				datiCatastSec.setSubalterno("5");
				datiCatastSecList.add(datiCatastSec);
				datiCatastSec = new SiceeTDatiCatastSec();
				datiCatastSec.setSubalterno("6");
				datiCatastSecList.add(datiCatastSec);
				datiCatastSec = new SiceeTDatiCatastSec();
				datiCatastSec.setCodiceComuneCatastale("Codice comune");
				datiCatastSec.setSubalterno("8");
				datiCatastSecList.add(datiCatastSec);
				apeReadOnlyData.setDatiCatastSec(datiCatastSecList);
			}
			
			Document document = creaDocumentoApe();
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			PdfWriter writer = PdfWriter.getInstance(document, outputStream);
			
			SiceeTCertificatore certificatore = apeReadOnlyData.getCertificatore();
			SiceeTCertificato certificato = apeReadOnlyData.getCertificato();

			SiceeTAltreInfo altreInfo = apeReadOnlyData.getAltreInfo();
						
			if (GenericUtil.isNullOrEmpty(idStatoAttestato))
			{
				// Se non viene passato lo stato attestato lo prendo dal DB
				idStatoAttestato = certificato.getFkStato();
			}
						
			PDFApeEventListener event = new PDFApeEventListener(certificatore, certificato, idStatoAttestato, altreInfo.getAltroServiziEnergia());
			
			writer.setPageEvent(event);
			
			document.open();

			aggiungiSchedaDatiGenerali(document, apeReadOnlyData, foto, idStatoAttestato);
									
			aggiungiSchedaPrestazioneEnergeticaGlobale(document, apeReadOnlyData, idStatoAttestato);
			
			document.newPage();
			
			aggiungiSchedaImpiantiRaccomandazioni(document, apeReadOnlyData);
			
			document.newPage();
			
			aggiungiSchedaAltriDati(document, apeReadOnlyData, idStatoAttestato);
			
			document.newPage();
			
			aggiungiSchedaCertificatoreSopralluoghiSoftware(document, apeReadOnlyData);
			
			document.newPage();
			
			aggiungiSchedaLegenda(document);
			
			document.close();
			
			outputStream.flush();
			document.close();
			outputStream.close();
			
			pdfApe = outputStream.toByteArray();
			
		}catch (Exception e) {
			gestError(this.isSimul, e.getMessage(), e);
		}
		
		return pdfApe;
	}
	
	public byte[] stampaPdfTarghettaApe(ApeTarghettaReadOnlyData apeTarghettaReadOnlyData) 
	{
		byte[] pdfTarghettaApe = {};
		
		try {
			if (this.isSimul) {
				apeTarghettaReadOnlyData = new ApeTarghettaReadOnlyData();
				SiceeDClasseEnergetica classeEner = new SiceeDClasseEnergetica();
				classeEner.setDescr("B");
				apeTarghettaReadOnlyData.setClasseEner(classeEner);
				apeTarghettaReadOnlyData.setDatiEner(new SiceeTDatiEner2015());
			}
			
			SiceeDClasseEnergetica classeEner = apeTarghettaReadOnlyData.getClasseEner();
			SiceeTDatiEner2015 datiEner = apeTarghettaReadOnlyData.getDatiEner();
			
			Document document = creaDocumentoTarghettaApe();
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			PdfWriter.getInstance(document, outputStream);
			 
			document.open();
			
			Paragraph titolo = new Paragraph("Appendice C - Format di indicatore per gli annunci commerciali", FONT_HELVETICA_12_B);
			titolo.setAlignment(Element.ALIGN_CENTER);

			document.add(titolo);
			
			PdfPTable tabellaTarghetta = inizializzaTabellaApe(new float[] {100});
			tabellaTarghetta.setSpacingBefore(25);
			tabellaTarghetta.setSpacingAfter(25);
			tabellaTarghetta.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabellaTarghetta.setTotalWidth(300);
			tabellaTarghetta.setLockedWidth(true);
			tabellaTarghetta.getDefaultCell().setBorderWidth(2);
			tabellaTarghetta.getDefaultCell().setPadding(0);
			
			PdfPTable tabellaContenutoTarghetta = inizializzaTabellaApe(new float[] {100});
			tabellaContenutoTarghetta.getDefaultCell().setBorder(Rectangle.BOTTOM);
			tabellaContenutoTarghetta.getDefaultCell().setPadding(0);
			
			aggiungiTitoloTarghetta(tabellaContenutoTarghetta);
						
			aggiungiClasseEnergeticaTarghetta(tabellaContenutoTarghetta, datiEner, classeEner);
						
			aggiungiIndicePrestazioneEnergeticaTarghetta(tabellaContenutoTarghetta, datiEner);
			
			aggiungiPrestazioneFabbricato(tabellaContenutoTarghetta, datiEner);
			
			tabellaTarghetta.addCell(tabellaContenutoTarghetta);

			document.add(tabellaTarghetta);

			Paragraph titoloInfo = new Paragraph("Obbligo di affissione della Targa di efficienza energetica." , FONT_HELVETICA_8_B);
			document.add(titoloInfo);
			
			Paragraph paragraphInfo = new Paragraph("L'articolo 6 del decreto legislativo 192/2005 prevede che, "
					+ "dopo la data del 31 gennaio 2015, tutti gli edifici pubblici con superficie utile "
					+ "superiore a 250 m\u00B2 siano dotati di APE e che l'attestato sia esposto in modo visibile.\n" + 
					"La DGR 24-2360 del 2/11/2015 estende l'obbligo di affissione a tutti gli edifici di nuova costruzione e a quelli soggetti a" + 
					"ristrutturazione e precisa che l'obbligo di affissione dell'APE \u00E9 sostituito dall'apposizione di una Targa di Efficienza Energetica.\n" + 
					"Lo schema sopra riportato deve essere utilizzato per ottenere la Targa di Efficienza Energetica.\n" + 
					"La Targa deve essere realizzata in materiale durevole (alluminio o altro supporto) e deve avere un'altezza di 160 mm e una" + 
					"larghezza di 100 mm con fondo bianco e deve essere fissata al fabbricato in modo da essere visibile dall'esterno o in un luogo" + 
					"dell'edificio frequentato dal pubblico.", FONT_HELVETICA_8);
			
			document.add(paragraphInfo);
			
			document.close();
			
			outputStream.flush();
			document.close();
			outputStream.close();
			
			pdfTarghettaApe = outputStream.toByteArray();
			
		} catch (Exception e) {
			gestDebug(isSimul, e.getMessage());
			gestError(this.isSimul, e.getMessage(), e);
		}
		
		return pdfTarghettaApe;
	}
	
	//METODI PER GENERAZIONE PDF APE - START
	private void aggiungiSchedaDatiGenerali(Document document, ApeReadOnlyData apeReadOnlyData, byte[] foto, Integer idStatoAttestato) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSchedaDatiGenerali - START");
		
		SiceeTCertificato certificato = apeReadOnlyData.getCertificato();
		SiceeTDatiGenerali datiGenerali = apeReadOnlyData.getDatiGenerali();
		SiceeDDestUso2015 dDestUso = apeReadOnlyData.getDestinazioneUso2015();
		SiceeTAltreInfo altreInfo = apeReadOnlyData.getAltreInfo();
		String dMotivo = apeReadOnlyData.getDMotivo();
		List<SiceeTDatiCatastSec> datiCatastSecList = apeReadOnlyData.getDatiCatastSec();
		SiceeTDatiEner2015 datiEner2015 = apeReadOnlyData.getDatiEner2015();
		
		aggiungiTitolo(document, "DATI GENERALI", 100);
		
		aggiungiSezioneDestinazioneUso(document, datiGenerali, dDestUso, altreInfo, dMotivo);
				
		aggiungiSezioneDatiIdentificativi(document, certificato, datiGenerali, datiCatastSecList, foto);
		
		aggiungiSezioneServiziEnergeticiPresenti(document, datiEner2015);
		
		gestDebug(this.isSimul, "aggiungiSchedaDatiGenerali - END");
	}

	private void aggiungiSezioneDestinazioneUso(Document document, SiceeTDatiGenerali datiGenerali,	SiceeDDestUso2015 dDestUso, SiceeTAltreInfo altreInfo, String dMotivo) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneDestinazioneUso - START");
		
		PdfPTable tabellaDestinazioneUso = inizializzaTabellaApe(new float[] {35, 55});
		tabellaDestinazioneUso.getDefaultCell().setPadding(0);
		
		PdfPTable tabella = inizializzaTabellaDefault(new float[] {100});
		
		tabella.addCell(aggiungiSezioneTabellaCellaTitolo("Destinazione d'uso", 1));
		
		String classificazioneDestUso = "";
		boolean flgResidenziale = false;
		boolean flgNonResidenziale = false;
		
		if (dDestUso != null)
		{
			classificazioneDestUso = StringUtils.trimToEmpty(dDestUso.getSigla()) + " " + StringUtils.trimToEmpty(dDestUso.getDescr());

			flgResidenziale = Converter.convertTo(dDestUso.getFlgResidenziale());
			flgNonResidenziale = !Converter.convertTo(dDestUso.getFlgResidenziale());
		}
		
		
		Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Residenziale", flgResidenziale, 20);
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Non residenziale", flgNonResidenziale, 20);
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("Classificazione D.P.R. 412/93:", FONT_HELVETICA_8_B);
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph(classificazioneDestUso, FONT_HELVETICA_8);
		tabella.addCell(paragraph);
		
		tabellaDestinazioneUso.addCell(tabella);
		
		tabella = inizializzaTabellaDefault(new float[] {50,50});
		tabella.getDefaultCell().setPaddingBottom(5);
		
		//START ROW
		PdfPCell cell = aggiungiSezioneTabellaCellaTitolo("Oggetto dell'attestato", 1);
		cell.setBorder(Rectangle.RIGHT);
		cell.setBorderColor(Color.BLACK);
		cell.setBorderWidth(0.5f);
		tabella.addCell(cell);
		
		Integer fkOggettoApe = datiGenerali.getFkOggettoApe();

		Integer fkMotivo = altreInfo.getFkMotivo();
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Nuova costruzione", fkMotivo != null && fkMotivo == Constants.MOTIVO_RILASCIO_NUOVA_COSTRUZIONE, 20);
		tabella.addCell(paragraph);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Intero edificio", fkOggettoApe != null && fkOggettoApe == Constants.OGGETTO_APE_INTERO_EDIFICIO, 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setPaddingLeft(PADDING_LEFT);
		cell.setPaddingBottom(5);
		tabella.addCell(cell);

		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Passaggio di propriet\u00E1 ", fkMotivo != null && fkMotivo == Constants.MOTIVO_RILASCIO_PASSAGGIO_PROPRIETA, 20);
		tabella.addCell(paragraph);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Unit\u00E1  immobiliare", fkOggettoApe != null && fkOggettoApe == Constants.OGGETTO_APE_UNITA_IMMOBILIARE, 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setPaddingLeft(PADDING_LEFT);	
		cell.setPaddingBottom(5);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Locazione", fkMotivo != null && fkMotivo == Constants.MOTIVO_RILASCIO_LOCAZIONE, 20);
		tabella.addCell(paragraph);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Gruppo di unit\u00E1  immobiliari", fkOggettoApe != null && fkOggettoApe == Constants.OGGETTO_APE_GRUPPO_UNITA_IMMOBILIARI, 20);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setPaddingLeft(PADDING_LEFT);
		cell.setPaddingBottom(5);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Ristrutturazione importante", fkMotivo != null && fkMotivo == Constants.MOTIVO_RILASCIO_RISTRUTTURAZIONE_IMPORTANTE, 20);
		tabella.addCell(paragraph);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph("numero di unit\u00E1  immobiliari di cui \u00E9 composto l'edificio:", FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setPaddingLeft(20);
		cell.setPaddingRight(20);
		cell.setPaddingBottom(5);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Riqualificazione energetica", fkMotivo != null && fkMotivo == Constants.MOTIVO_RILACIO_RIQUALIFICAZIONE_ENEGETICA, 20);
		tabella.addCell(paragraph);
		//END ROW
		
		//START ROW
		paragraph = new Paragraph(Converter.convertToString(datiGenerali.getNrUm()), FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setPaddingLeft(20);
		cell.setPaddingRight(20);
		cell.setPaddingBottom(5);
		tabella.addCell(cell);
		
		String motivazioneAltro = "";
		if (!GenericUtil.isNullOrEmpty(dMotivo)) {
			motivazioneAltro = dMotivo;
		} else {
			motivazioneAltro = altreInfo.getMotivoAltro();
		}
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckPrima(paragraph, "Altro: " + StringUtils.trimToEmpty(motivazioneAltro), !StringUtils.isEmpty(motivazioneAltro), 0);
		tabella.addCell(paragraph);
		//END ROW
		
		tabellaDestinazioneUso.addCell(tabella);
		document.add(tabellaDestinazioneUso);
		
		gestDebug(this.isSimul, "aggiungiSezioneDestinazioneUso - END");
	}
	
	private void aggiungiSezioneDatiIdentificativi(Document document, SiceeTCertificato certificato, SiceeTDatiGenerali datiGenerali, List<SiceeTDatiCatastSec> datiCatastSecList, byte[] foto) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneDatiIdentificativi - START");
		
		PdfPTable tabellaSezioneDatiIdentificativi = inizializzaTabellaApe(new float[] {100});
		tabellaSezioneDatiIdentificativi.getDefaultCell().setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP);
		tabellaSezioneDatiIdentificativi.getDefaultCell().setPadding(0);
		
		PdfPTable tabellaInterna = inizializzaTabellaDefault(new float[] {33, 66});
		tabellaInterna.getDefaultCell().setPadding(0);
		
		tabellaInterna.addCell(aggiungiSezioneTabellaCellaTitolo("Dati identificativi", 2));
		
		Image image = null;
		
		try {
			image = Image.getInstance(foto);
		} catch (Exception e) {
			gestDebug(this.isSimul, "Immagine immobile non presente");
		}
		
		PdfPCell cellFoto = new PdfPCell(image, true);
		cellFoto.setBorder(Rectangle.NO_BORDER);
		cellFoto.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cellFoto.setFixedHeight(100);
		cellFoto.setPaddingTop(5);
		cellFoto.setPaddingBottom(5);
		tabellaInterna.addCell(cellFoto);
		
		PdfPTable tabellaDatiIdentificati = inizializzaTabellaDefault(2);
		tabellaDatiIdentificati.getDefaultCell().setPadding(5);
		
		aggiungiRigaTabellaDatiIdentificativi(tabellaDatiIdentificati, "Regione:", StringUtils.trimToEmpty(certificato.getDescRegione()),
				"Zona climatica:", StringUtils.trimToEmpty(datiGenerali.getZonaClimatica()));
		
		aggiungiRigaTabellaDatiIdentificativi(tabellaDatiIdentificati, "Comune:", StringUtils.trimToEmpty(certificato.getDescComune()),
				"Anno di costruzione:", Converter.convertToStringOrEmpty(datiGenerali.getAnnoCostruzione()));
		
		String indirizzo = StringUtils.trimToEmpty(certificato.getDescIndirizzo()) + " " + StringUtils.trimToEmpty(certificato.getNumCivico());

		aggiungiRigaTabellaDatiIdentificativi(tabellaDatiIdentificati, "Indirizzo:", indirizzo,
				"Superficie utile riscaldata (m\u00B2):", Converter.convertToStringOrEmpty(datiGenerali.getSupRiscaldata()));
		
		aggiungiRigaTabellaDatiIdentificativi(tabellaDatiIdentificati, "Piano:", Converter.convertToStringOrEmpty(certificato.getPiano()),
				"Superficie utile raffrescata (m\u00B2):", Converter.convertToStringOrEmpty(datiGenerali.getSupRaffrescata()));
		
		aggiungiRigaTabellaDatiIdentificativi(tabellaDatiIdentificati, "Interno:", StringUtils.trimToEmpty(certificato.getInterno()),
				"Volume lordo riscaldato (m\u00B3):", Converter.convertToStringOrEmpty(datiGenerali.getVolLordoRiscaldato()));
		
		String coord = Converter.convertToStringOrEmpty(certificato.getCoordN()) + " " + Converter.convertToStringOrEmpty(certificato.getCoordE());

		aggiungiRigaTabellaDatiIdentificativi(tabellaDatiIdentificati, "Coordinate GIS:", coord,
				"Volume lordo raffrescato (m\u00B3):", Converter.convertToStringOrEmpty(datiGenerali.getVolLordoRaffrescato()));
		
		tabellaInterna.addCell(tabellaDatiIdentificati);
		
		tabellaSezioneDatiIdentificativi.addCell(tabellaInterna);
		
		aggiungiDatiCatastali(tabellaSezioneDatiIdentificativi, certificato, datiCatastSecList);
		
		PdfPCell cell = new PdfPCell();
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cell.setBorderColor(DARK_GREEN);
		cell.setBorder(Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
		tabellaSezioneDatiIdentificativi.addCell(cell);
		
		document.add(tabellaSezioneDatiIdentificativi);
		
		gestDebug(this.isSimul, "aggiungiSezioneDatiIdentificativi - END");
	}

	private void aggiungiDatiCatastali(PdfPTable tabellaSezioneDatiIdentificativi, SiceeTCertificato certificato, List<SiceeTDatiCatastSec> datiCatastSecList) {
		gestDebug(this.isSimul, "aggiungiDatiCatastali - START");
		
		List<RigaDatiCatastali> rigaDatiCatastaliList = new ArrayList<RigaDatiCatastali>();
		RigaDatiCatastali rigaDatiCatastali = new RigaDatiCatastali();
		
		rigaDatiCatastali.setCodiceComuneCatastale(StringUtils.trimToEmpty(certificato.getCodiceComuneCatastale()));
		rigaDatiCatastali.setSezione(StringUtils.trimToEmpty(certificato.getSezione()));
		rigaDatiCatastali.setFoglio(StringUtils.trimToEmpty(certificato.getFoglio()));
		rigaDatiCatastali.setParticella(StringUtils.trimToEmpty(certificato.getParticella()));
		rigaDatiCatastali.setDa1(StringUtils.trimToEmpty(certificato.getSubalterno()));
		rigaDatiCatastali.setA1(StringUtils.trimToEmpty(certificato.getSubalterno()));
		
		// questa la uso come chiave di rottura
		String chiaveCatastoOld = certificato.getCodiceComuneCatastale()+certificato.getSezione()+certificato.getFoglio()+certificato.getParticella();
		int maxPerRiga = 16;
		int elemPerRiga = 0;
		
		List<List<String>> subalterniSingoliList = new ArrayList<List<String>>();
		List<String> subalterniSingoli = new ArrayList<String>();
		
		if (datiCatastSecList != null && datiCatastSecList.size() > 0)
		{
			String chiaveCatastoNew = null;

			for (SiceeTDatiCatastSec datiCatastali : datiCatastSecList) {
				
				chiaveCatastoNew = datiCatastali.getCodiceComuneCatastale()+datiCatastali.getSezione()+datiCatastali.getFoglio()+datiCatastali.getParticella();
				
				if (!chiaveCatastoOld.equalsIgnoreCase(chiaveCatastoNew))
				{
					subalterniSingoliList.add(subalterniSingoli);
					rigaDatiCatastali.setSubalterniSingoli(subalterniSingoliList);

					rigaDatiCatastaliList.add(rigaDatiCatastali);
					
					subalterniSingoli = new ArrayList<String>();
					subalterniSingoliList = new ArrayList<List<String>>();
					
					rigaDatiCatastali = new RigaDatiCatastali();
					rigaDatiCatastali.setCodiceComuneCatastale(StringUtils.trimToEmpty(datiCatastali.getCodiceComuneCatastale()));
					rigaDatiCatastali.setSezione(StringUtils.trimToEmpty(datiCatastali.getSezione()));
					rigaDatiCatastali.setFoglio(StringUtils.trimToEmpty(datiCatastali.getFoglio()));
					rigaDatiCatastali.setParticella(StringUtils.trimToEmpty(datiCatastali.getParticella()));

					// mi creo la nuova chiava di rottura
					chiaveCatastoOld = datiCatastali.getCodiceComuneCatastale()+datiCatastali.getSezione()+datiCatastali.getFoglio()+datiCatastali.getParticella();

					// Devo ripartire dal primo elemento
					elemPerRiga = 0;
				}

				// Aggiungo un nuovo subalterno singolo
				subalterniSingoli.add(StringUtils.trimToEmpty(datiCatastali.getSubalterno()));
				elemPerRiga++;
				
				if (elemPerRiga == maxPerRiga)
				{
					// Ho già riempito tutta la riga del pdf, devo aggiungere una riga

					subalterniSingoliList.add(subalterniSingoli);
					subalterniSingoli = new ArrayList<String>();
					
					elemPerRiga = 0;
				}
			}
		}
		
		/// NEW
		subalterniSingoliList.add(subalterniSingoli);
		
		rigaDatiCatastali.setSubalterniSingoli(subalterniSingoliList);
		
		rigaDatiCatastaliList.add(rigaDatiCatastali);
		
		for (RigaDatiCatastali rigaDatiCatastaliToPrint : rigaDatiCatastaliList) {
			
			PdfPTable tabella = inizializzaTabellaDefault(19);
			tabella.setSpacingBefore(0);
			
			//ROW START
			Paragraph paragraph = new Paragraph("Comune catastale:", FONT_HELVETICA_8);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			cell.setColspan(3);
			tabella.addCell(cell);
			
			paragraph = new Paragraph(StringUtils.trimToEmpty(rigaDatiCatastaliToPrint.getCodiceComuneCatastale()), FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			cell.setColspan(7);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Sezione:", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph, StringUtils.trimToEmpty(rigaDatiCatastaliToPrint.getSezione()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			cell.setColspan(3);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Foglio:", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph,  StringUtils.trimToEmpty(rigaDatiCatastaliToPrint.getFoglio()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			cell.setColspan(3);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Particella:", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph,  StringUtils.trimToEmpty(rigaDatiCatastaliToPrint.getParticella()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.TOP);
			cell.setColspan(3);
			tabella.addCell(cell);
			//ROW END
			
			//ROW START
			paragraph = new Paragraph("Subalterni:", FONT_HELVETICA_8);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setColspan(3);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("Da:", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph,  StringUtils.trimToEmpty(rigaDatiCatastaliToPrint.getDa1()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setColspan(2);
			tabella.addCell(cell);
			
			paragraph = new Paragraph("A:", FONT_HELVETICA_8);
			aggiungiSpazioETesto(paragraph,  StringUtils.trimToEmpty(rigaDatiCatastaliToPrint.getA1()), 10);
			cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.NO_BORDER);
			cell.setColspan(2);
			tabella.addCell(cell);
			
			for(int i = 0; i < 3; i++) {
				paragraph = new Paragraph("Da:", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setColspan(2);
				tabella.addCell(cell);
				
				paragraph = new Paragraph("A:", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setColspan(2);
				tabella.addCell(cell);
			}
			//ROW END
			
			for (List<String> subalterniSingoliToPrint : rigaDatiCatastaliToPrint.getSubalterniSingoli()) {
								
				paragraph = new Paragraph("Altri subalterni:", FONT_HELVETICA_8);
				cell = new PdfPCell(paragraph);
				cell.setBorder(Rectangle.NO_BORDER);
				cell.setColspan(3);
				tabella.addCell(cell);
				
				for(int i = 0; i < maxPerRiga; i++) {
					String subalterno = subalterniSingoliToPrint.size() > i ? subalterniSingoliToPrint.get(i) : ""; 
					
					paragraph = new Paragraph( StringUtils.trimToEmpty(subalterno), FONT_HELVETICA_8);
					cell = new PdfPCell(paragraph);
					cell.setBorder(Rectangle.NO_BORDER);
					tabella.addCell(cell);
				}
			}
			
			cell = new PdfPCell(tabella);
			cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
			cell.setBorderColor(DARK_GREEN);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			tabellaSezioneDatiIdentificativi.addCell(cell);
		}
		
		gestDebug(this.isSimul, "aggiungiDatiCatastali - END");
	}
	
	private void aggiungiSezioneServiziEnergeticiPresenti(Document document, SiceeTDatiEner2015 datiEner2015) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneServizEnergeticiPresenti - START");
		PdfPTable tabellaSezioneServiziEnergeticiPresenti = inizializzaTabellaApe(new float[] {100});
		
		PdfPTable tabella = inizializzaTabellaDefault(3);
		tabella.addCell(aggiungiSezioneTabellaCellaTitolo("Servizi energetici presenti", 3));
		
		Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckboxPrimaConImmagine(paragraph,"Climatizzazione invernale", getLogoServiziEnergetici("climaInvernale.png"), Converter.convertTo(datiEner2015.getFlgClimatInvernale()));
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckboxPrimaConImmagine(paragraph,"Ventilazione meccanica", getLogoServiziEnergetici("ServiziVentola.png"), Converter.convertTo(datiEner2015.getFlgVentilMeccanica()));
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckboxPrimaConImmagine(paragraph,"Illuminazione", getLogoServiziEnergetici("ServiziIlluminazione.jpg"), Converter.convertTo(datiEner2015.getFlgIlluminazione()));
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckboxPrimaConImmagine(paragraph,"Climatizzazione estiva", getLogoServiziEnergetici("climaestivo.png"), Converter.convertTo(datiEner2015.getFlgClimatEstiva()));
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckboxPrimaConImmagine(paragraph,"Prod. acqua calda sanitaria", getLogoServiziEnergetici("ServiziAcquaCalda.jpg"), Converter.convertTo(datiEner2015.getFlgProdH2oSanitaria()));
		tabella.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheckboxPrimaConImmagine(paragraph,"Trasporto di persone o cose", getLogoServiziEnergetici("ServiziTrasporto.jpg"), Converter.convertTo(datiEner2015.getFlgTrasportoPersCose()));
		tabella.addCell(paragraph);
		
		tabellaSezioneServiziEnergeticiPresenti.addCell(tabella);
		
		document.add(tabellaSezioneServiziEnergeticiPresenti);
		
		gestDebug(this.isSimul, "aggiungiSezioneServizEnergeticiPresenti - END");
	}
	
	private void aggiungiSchedaPrestazioneEnergeticaGlobale(Document document, ApeReadOnlyData apeReadOnlyData, Integer idStatoAttestato) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSchedaPrestazioneEnergeticaGlobale - START");
		
		SiceeTDatiEner2015 datiEner2015 = apeReadOnlyData.getDatiEner2015();
		List<SiceeDClasseEnergetica> classiEnergetiche = apeReadOnlyData.getClassiEnergetiche();
		
		aggiungiTitolo(document, "PRESTAZIONE ENERGETICA GLOBALE E DEL FABBRICATO", 300);
		
		Paragraph sottoTitolo = new Paragraph("La sezione riporta l'indice di prestazione energetica globale non rinnovabile in funzione del fabbricato e dei servizi energetici presenti, nonch\u00e9 la prestazione energetica del fabbricato, al netto del rendimento degli impianti presenti.",
				FONT_HELVETICA_8);
		document.add(sottoTitolo);
		
		//START SEZIONE Prestazione energetica del fabbricato
		PdfPTable tabellaPrestazioneEnergeticaGlobale = inizializzaTabellaApe(new float[] {31, 49, 20});
		
		PdfPTable tabella = initializeTable(new float[] {50,50});
		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		tabella.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		tabella.getDefaultCell().setBorder(Rectangle.BOX);
		tabella.getDefaultCell().setPadding((float) 0.5);
		tabella.addCell(aggiungiSezioneTabellaCellaTitolo("Prestazione energetica del fabbricato", 2));
		
		addEmptyCell(tabella, 2, Rectangle.NO_BORDER);
		
		Paragraph paragraph = new Paragraph("INVERNO", FONT_HELVETICA_10_B);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setPadding(5);
		tabella.addCell(cell);
		
		paragraph = new Paragraph("ESTATE", FONT_HELVETICA_10_B);
		cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(LIGHT_GRAY);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setPadding(5);
		tabella.addCell(cell);
		
		tabella.addCell(getImmagine("attestato2015/inverno_lungo.png"));
		
		tabella.addCell(getImmagine("attestato2015/estate_lungo.png"));
		
		String smileInvernoImageName = "";
		String smileEstateImageName = "";
		
		if (this.isSimul) {
			smileInvernoImageName = "smile_triste.png";
			smileEstateImageName = "smile_felice.png";
			datiEner2015.setFlgSmileInverno(1);
		}
		else {
			smileInvernoImageName = getCertificatoMgr().recuperaNomeImmagineSmile(datiEner2015.getFlgSmileInverno());
			smileEstateImageName = getCertificatoMgr().recuperaNomeImmagineSmile(datiEner2015.getFlgSmileEstate());
		}
		
		Image smileInvernoImage = getImmagine("attestato2015/"+ smileInvernoImageName);
		smileInvernoImage.scalePercent(40);
		Image smileEstateImage = getImmagine("attestato2015/"+ smileEstateImageName);
		smileEstateImage.scalePercent(40);
		
		paragraph = new Paragraph(new Chunk(smileInvernoImage, 0, 0, true));
		tabella.addCell(paragraph);
		paragraph = new Paragraph(new Chunk(smileEstateImage, 0, 0, true));
		tabella.addCell(paragraph);
		
		tabellaPrestazioneEnergeticaGlobale.addCell(tabella);
		//END SEZIONE Prestazione energetica del fabbricato

		//START SEZIONE Prestazione energetica globale
		String classeEnerg = MapDto.decodClasseEnergeticaId(datiEner2015.getFkClasseEnergetica(), classiEnergetiche);
		
		if (this.isSimul) {
			classeEnerg = "B";
		}
		
		PdfPTable tabellaInterna = inizializzaTabellaDefault(new float[] {10, 90});
		tabellaInterna.getDefaultCell().setPadding(0);
		tabellaInterna.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		
		addEmptyCell(tabellaInterna, 2, Rectangle.NO_BORDER);
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		
		tabellaInterna.addCell(aggiungiClasseEnergeticaServiziEnergetici(classeEnerg));
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);

		addEmptyCell(tabellaInterna, 2, Rectangle.NO_BORDER);
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		tabellaInterna.addCell(aggiungiColonnaValoreCentrato("EPgl,nren (kWh/m\u00B2anno):", Converter.convertToStringOrEmpty(datiEner2015.getEpglNrenGlobale())));
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		addEmptyCell(tabellaInterna, 2, Rectangle.NO_BORDER);
		
		if (idStatoAttestato == Constants.BOZZA) {
			addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
			tabellaInterna.addCell(aggiungiColonnaValoreCentrato("EPgl,nren Standard (kWh/m\u00B2anno):", Converter.convertToStringOrEmpty(datiEner2015.getEpglNrenRif())));
		}
		
		tabellaPrestazioneEnergeticaGlobale.addCell(aggiungiSchemaClasseEnergetica("Prestazione energetica globale", datiEner2015, tabellaInterna, classeEnerg));		
		//END SEZIONE Prestazione energetica globale

		//START SEZIONE Riferimenti
		tabella = inizializzaTabellaDefault(1);
		tabella.getDefaultCell().setPadding(0);
		
		cell = aggiungiSezioneTabellaCellaTitolo("Riferimenti", 1);
		cell.setPadding(0);
		tabella.addCell(cell);
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		cell = aggiungiSezioneTabellaCellaTitolo("Gli immobili simili avrebbero in media la seguente classificazione:", 1);
		cell.setPadding(0);
		tabella.addCell(cell);
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		paragraph = new Paragraph("Se nuovi:", FONT_HELVETICA_8);
		tabella.addCell(paragraph);
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		String classeRiferimentiNuovi = "";
		
		if (datiEner2015.getFkClasseEnerNuovi() != null) {
			classeRiferimentiNuovi = MapDto.decodClasseEnergeticaId(datiEner2015.getFkClasseEnerNuovi(), classiEnergetiche);
		}
		
		PdfPTable tabellaClasseRiferimentiNuovi = inizializzaTabellaDefault(1);
		tabellaClasseRiferimentiNuovi.getDefaultCell().setPadding(0);
		
		tabellaClasseRiferimentiNuovi.addCell(aggiungiClasseEnergetica(classeRiferimentiNuovi));
		tabellaClasseRiferimentiNuovi.addCell(aggiungiColonnaValoreCentrato("EPgl,nren (kWh/m\u00B2anno):", Converter.convertToStringOrEmpty(datiEner2015.getEpglNrenNuovi())));

		tabella.addCell(aggiungiCellaBloccoRiferimento(tabellaClasseRiferimentiNuovi, "attestato2015/blocco_verde.png"));
		
		paragraph = new Paragraph("Se esistenti:", FONT_HELVETICA_8);
		tabella.addCell(paragraph);
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		String classeRiferimentiEsistenti = "";
		
		if (datiEner2015.getFkClasseEnerEsistenti() != null) {
			classeRiferimentiEsistenti = MapDto.decodClasseEnergeticaId(datiEner2015.getFkClasseEnerEsistenti(), classiEnergetiche);
		}
		
		PdfPTable tabellaClasseRiferimentiEsistenti = inizializzaTabellaDefault(1);
		tabellaClasseRiferimentiEsistenti.getDefaultCell().setPadding(0);
		
		tabellaClasseRiferimentiEsistenti.addCell(aggiungiClasseEnergetica(classeRiferimentiEsistenti));
		tabellaClasseRiferimentiEsistenti.addCell(aggiungiColonnaValoreCentrato("EPgl,nren (kWh/m\u00B2anno):", Converter.convertToStringOrEmpty(datiEner2015.getEpglNrenEsistenti())));

		tabella.addCell(aggiungiCellaBloccoRiferimento(tabellaClasseRiferimentiEsistenti, "attestato2015/blocco_giallo.png"));
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		tabellaPrestazioneEnergeticaGlobale.addCell(tabella);
		//END SEZIONE Riferimenti
		
		document.add(tabellaPrestazioneEnergeticaGlobale);
		
		gestDebug(this.isSimul, "aggiungiSchedaPrestazioneEnergeticaGlobale - END");
	}

	private void aggiungiSchedaImpiantiRaccomandazioni(Document document, ApeReadOnlyData apeReadOnlyData) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSchedaImpiantiRaccomandazioni - START");
		
		List<SiceeDCombustibile> elencoConsumiCombustibile = apeReadOnlyData.getElencoConsumiCombustibile();
		List<SiceeTQtaConsumi2015> quantitaConsumi2015 = apeReadOnlyData.getQuantitaConsumi2015();
		List<SiceeDUnitaMisura2015> unitaMisura2015 = apeReadOnlyData.getUnitaMisura2015();
		SiceeTDatiEner2015 datiEner2015 = apeReadOnlyData.getDatiEner2015();
		List<SiceeTRaccomand2015> raccomand2015 = apeReadOnlyData.getRaccomand2015();
		List<SiceeDClasseEnergetica> elencoClasseEnergetica = apeReadOnlyData.getElencoClasseEnergetica();
		
		aggiungiSezioneImpianti(document, elencoConsumiCombustibile, quantitaConsumi2015, unitaMisura2015, datiEner2015);
		
		aggiungiSezioneRaccomandazioni(document, raccomand2015, elencoClasseEnergetica, datiEner2015);
		
		gestDebug(this.isSimul, "aggiungiSchedaImpiantiRaccomandazioni - END");
	}

	private void aggiungiSezioneImpianti(Document document, List<SiceeDCombustibile> elencoConsumiCombustibile, List<SiceeTQtaConsumi2015> quantitaConsumi2015, List<SiceeDUnitaMisura2015> unitaMisura2015, SiceeTDatiEner2015 datiEner2015) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneImpianti - START");
		
		aggiungiTitolo(document, "PRESTAZIONE ENERGETICA DEGLI IMPIANTI E CONSUMI STIMATI", 300);
		
		Paragraph sottotitolo = new Paragraph("La sezione riporta l'indice di prestazione energetica rinnovabile e non rinnovabile, nonch\u00e9 una stima dell'energia consumata annual-mente dall'immobile secondo un uso standard.", FONT_HELVETICA_8);
		document.add(sottotitolo);
		
		PdfPTable tabellaImpianti = inizializzaTabellaApe(new float[] {70, 30});
		PdfPCell cellaTitoloSezione = aggiungiSezioneTabellaCellaTitolo("Prestazioni energetiche degli impianti e stima dei consumi di energia", 2);
		cellaTitoloSezione.setBorder(Rectangle.TOP | Rectangle.LEFT | Rectangle.RIGHT);
		cellaTitoloSezione.setBorderColor(DARK_GREEN);
		cellaTitoloSezione.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cellaTitoloSezione.setPaddingTop(5);
		cellaTitoloSezione.setPaddingBottom(5);
		tabellaImpianti.addCell(cellaTitoloSezione);
		
		//TABELLA CONBUSTIBILI
		PdfPTable tabellaCombustibili = inizializzaTabellaApe(new float[] {6,48,38,10});
		tabellaCombustibili.addCell("");
		
		tabellaCombustibili.addCell(aggiungiCellaHeader("FONTI ENERGETICHE UTILIZZATE"));
		PdfPCell headerCell = aggiungiCellaHeader("Quantit\u00E1  annua consumata in uso standard (specificare unit\u00E1  di misura)");
		headerCell.setColspan(2);
		tabellaCombustibili.addCell(headerCell);
		
		for (SiceeDCombustibile combustibile : elencoConsumiCombustibile) {
			int idCombustibile = 0;
			
			SiceeTQtaConsumi2015 qtaConsumi = null;
			BigDecimal quantita = null;
			String unitaMisura = null;
			boolean isPresente = false;
			
			// Devo aggiungere tutti combustibili
			idCombustibile = combustibile.getIdCombustibile();
			String descrCombustibile = combustibile.getDescr();
			
			// devo compilare le quantità con l'unità di misura di quelli compilati
			if (idCombustibile != Constants.ID_COMBUSTIBILE_GASOLIO)
			{
				qtaConsumi = MapDto.decodeQtaConsumi(idCombustibile, quantitaConsumi2015);
				if (qtaConsumi != null)
				{
					quantita = Converter.convertToBigDecimal(qtaConsumi.getQuantita());
					unitaMisura = MapDto.decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);

					isPresente = true;
				}
			}
			else
			{
				quantita = new BigDecimal(0);
				
				// Cerco il Gasolio
				qtaConsumi = MapDto.decodeQtaConsumi(Constants.ID_COMBUSTIBILE_GASOL, quantitaConsumi2015);
				if (qtaConsumi != null)
				{
					
					quantita = quantita.add(Converter.convertToBigDecimal(qtaConsumi.getQuantita()));
					unitaMisura = MapDto.decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);
				}
				
				// Cerco l'Olio combustibile
				qtaConsumi = MapDto.decodeQtaConsumi(Constants.ID_COMBUSTIBILE_OLIO_COMBUSTIBILE, quantitaConsumi2015);
				if (qtaConsumi != null)
				{
					
					quantita = quantita.add(Converter.convertToBigDecimal(qtaConsumi.getQuantita()));
					unitaMisura = MapDto.decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);
				}
				
				if (quantita.doubleValue() > 0)
				{
					isPresente = true;
				}
				else {
					quantita = null;
				}
			}
			
			Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8);
			aggiungiCheck(paragraph, isPresente);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
			cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
			cell.setBorder(Rectangle.BOX);
			cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
			cell.setBorderColor(DARK_GREEN);
			tabellaCombustibili.addCell(cell);
			
			paragraph = new Paragraph(StringUtils.trimToEmpty(descrCombustibile), FONT_HELVETICA_8);
			tabellaCombustibili.addCell(paragraph);

			paragraph = new Paragraph(Converter.convertToStringOrEmpty(quantita), FONT_HELVETICA_8);
			tabellaCombustibili.addCell(paragraph);

			paragraph = new Paragraph(StringUtils.trimToEmpty(unitaMisura), FONT_HELVETICA_8);
			tabellaCombustibili.addCell(paragraph);
							
	    }				
		
		SiceeTQtaConsumi2015 qtaConsumi = MapDto.decodeQtaConsumi(Constants.ID_COMBUSTIBILE_ALTRO, quantitaConsumi2015);

		boolean isAltroPresente = false;
		BigDecimal quantitaAltro = null;
		String unitaMisuraAltro = "";
		String descrCombustibileAltro = "";
		
		if (qtaConsumi != null) {

			isAltroPresente = true;
			quantitaAltro = Converter.convertToBigDecimal(qtaConsumi.getQuantita());
			unitaMisuraAltro = MapDto.decodeUnitaMisura(qtaConsumi.getFkUnitaMisura(), unitaMisura2015);
			descrCombustibileAltro = qtaConsumi.getAltroDescrComb();
		}
		
		Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8);
		aggiungiCheck(paragraph, isAltroPresente);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setBorder(Rectangle.BOX);
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cell.setBorderColor(DARK_GREEN);
		tabellaCombustibili.addCell(cell);
		
		paragraph = new Paragraph("Altro (specificare) :\n", FONT_HELVETICA_8);
		paragraph.add(StringUtils.trimToEmpty(descrCombustibileAltro));
		tabellaCombustibili.addCell(paragraph);

		paragraph = new Paragraph(Converter.convertToStringOrEmpty(quantitaAltro), FONT_HELVETICA_8);
		tabellaCombustibili.addCell(paragraph);

		paragraph = new Paragraph(StringUtils.trimToEmpty(unitaMisuraAltro), FONT_HELVETICA_8);
		tabellaCombustibili.addCell(paragraph);
		
		cell = aggiungiCellaApe(4, Rectangle.BOX);
		cell.setFixedHeight(0.01f);
		
		tabellaCombustibili.addCell(cell);
		
		
		cell = new PdfPCell(tabellaCombustibili);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaImpianti.addCell(cell);
		
		PdfPTable tabellaIndiciPrestazioni = inizializzaTabellaApe(new float[] {100});
		
		tabellaIndiciPrestazioni.addCell(aggiungiCellaHeader("Indici di prestazione energetica globali ed emissioni"));
		
		tabellaIndiciPrestazioni.addCell(aggiungiColonnaValoreCentrato("Indice della prestazione energetica non rinnovabile EPgl,nren (kWh/m\u00B2 anno)", Converter.convertToStringOrEmpty(datiEner2015.getEpglNrenGlobale())));
		
		tabellaIndiciPrestazioni.addCell(aggiungiColonnaValoreCentrato("Indice della prestazione energetica rinnovabile EPgl,ren (kWh/m\u00B2 anno)", Converter.convertToStringOrEmpty(datiEner2015.getEpglRenGlobale())));
		
		tabellaIndiciPrestazioni.addCell(aggiungiColonnaValoreCentrato("Emissioni di CO2 (kg/m\u00B2 anno)", Converter.convertToStringOrEmpty(datiEner2015.getEmissioniCo2())));
		
		cell = new PdfPCell(tabellaIndiciPrestazioni);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaImpianti.addCell(cell);
		
		document.add(tabellaImpianti);
		
		gestDebug(this.isSimul, "aggiungiSezioneImpianti - END");
	}
	
	private void aggiungiSezioneRaccomandazioni(Document document, List<SiceeTRaccomand2015> raccomand2015, List<SiceeDClasseEnergetica> elencoClasseEnergetica, SiceeTDatiEner2015 datiEner2015) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneRaccomandazioni - START");
		aggiungiTitolo(document, "RACCOMANDAZIONI", 100);
		Paragraph sottotitolo = new Paragraph("La sezione riporta gli interventi raccomandati e la stima dei risultati conseguibili, con il singolo intervento o con la realizzazione dell'insieme di essi, esprimendo una valutazione di massima del potenziale di miglioramento dell'edificio o immobile oggetto dell'attestato di prestazione energetica.", FONT_HELVETICA_8);
		document.add(sottotitolo);
		
		PdfPTable tabellaRaccomandazioni = inizializzaTabellaApe(new float[] {80, 20});
		
		Paragraph paragraph = new Paragraph("RIQUALIFICAZIONE ENERGETICA E RISTRUTTURAZIONE IMPORTANTE\n", FONT_HELVETICA_8_B_WHITE);
		paragraph.add(new Chunk("INTERVENTI RACCOMANDATI E RISULTATI CONSEGUIBILI", FONT_HELVETICA_7_B_WHITE));
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBackgroundColor(DARK_GREEN);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cell.setBorderColor(DARK_GREEN);
		cell.setColspan(2);
		cell.setPaddingTop(5);
		cell.setPaddingBottom(5);
		tabellaRaccomandazioni.addCell(cell);
		
		//TABELLA TIPO INTERVENTO
		PdfPTable tabellaTipoIntervento = inizializzaTabellaApe(new float[] {15, 35, 16, 18, 26, 5});
		
		tabellaTipoIntervento.addCell(aggiungiCellaHeaderLight("Codice"));
		tabellaTipoIntervento.addCell(aggiungiCellaHeaderLight("TIPO DI INTERVENTO RACCOMANDATO"));
		tabellaTipoIntervento.addCell(aggiungiCellaHeaderLight("Comporta una ristrutturazione importante"));
		tabellaTipoIntervento.addCell(aggiungiCellaHeaderLight("Tempo di ritorno dell' investimento in anni"));
		PdfPCell cellHeader = aggiungiCellaHeaderLight("CLASSE ENERGETICA raggiungibile con l'intervento (EPgl,nren kWh/m\u00B2 anno)");
		cellHeader.setColspan(2);
		tabellaTipoIntervento.addCell(cellHeader);
	
		for (SiceeTRaccomand2015 siceeTRaccomand2015 : raccomand2015) {
			
			paragraph = new Paragraph( StringUtils.trimToEmpty(siceeTRaccomand2015.getCodiceRen()), FONT_HELVETICA_8);
			tabellaTipoIntervento.addCell(paragraph);
			
			paragraph = new Paragraph( StringUtils.trimToEmpty(siceeTRaccomand2015.getTipoIntervento()), FONT_HELVETICA_8);
			tabellaTipoIntervento.addCell(paragraph);
			
			String ristrutturazioneImportante = "NO";
			if (Converter.convertTo(siceeTRaccomand2015.getFlgRistrutturazione())) {
				ristrutturazioneImportante = "SI";
			}
			
			paragraph = new Paragraph(ristrutturazioneImportante, FONT_HELVETICA_8);
			tabellaTipoIntervento.addCell(paragraph);
			
			paragraph = new Paragraph( Converter.convertToStringOrEmpty(siceeTRaccomand2015.getNrAnniRitInvest()), FONT_HELVETICA_8);
			tabellaTipoIntervento.addCell(paragraph);
			
			paragraph = new Paragraph( Converter.convertToStringOrEmpty(siceeTRaccomand2015.getEpglNrenSingoloInt()), FONT_HELVETICA_8);
			tabellaTipoIntervento.addCell(paragraph);
			
			paragraph = new Paragraph( StringUtils.trimToEmpty(MapDto.decodClasseEnergeticaId(siceeTRaccomand2015.getFkClasseEnergetica(), elencoClasseEnergetica)), FONT_HELVETICA_8);
			tabellaTipoIntervento.addCell(paragraph);
		}
		
		cell = aggiungiCellaApe(6, Rectangle.BOX);
		cell.setFixedHeight(0.01f);
		tabellaTipoIntervento.addCell(cell);
		
		cell = new PdfPCell(tabellaTipoIntervento);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaRaccomandazioni.addCell(cell);
		
		//TABELLA CLASSE
		String classeRaggiungibile = MapDto.decodClasseEnergeticaId(datiEner2015.getFkCeRaccTotale(),elencoClasseEnergetica);
		String epglnrenRaggiungibile = Converter.convertToStringOrEmpty(datiEner2015.getEpglNrenRaccTotale());
		
		PdfPTable classeEnergetica = inizializzaTabellaApe(new float[] {100});
		classeEnergetica.addCell(aggiungiCellaHeaderLight("CLASSE ENERGETICA raggiungibile se si realizzano tutti gli interventi raccomandati"));
		PdfPTable tabella = inizializzaTabellaDefault(1);
		tabella.addCell(aggiungiClasseEnergetica(classeRaggiungibile));
		tabella.addCell(aggiungiColonnaValoreCentrato("EPgl,nren (kWh/m\u00B2anno):", epglnrenRaggiungibile));
		classeEnergetica.addCell(tabella);
		
		cell = new PdfPCell(classeEnergetica);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaRaccomandazioni.addCell(cell);
		
		document.add(tabellaRaccomandazioni);
		gestDebug(this.isSimul, "aggiungiSezioneRaccomandazioni - END");
	}
	
	private void aggiungiSchedaAltriDati(Document document, ApeReadOnlyData apeReadOnlyData, Integer idStatoAttestato) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSchedaAltriDati - START");
		
		SiceeTDatiEner2015 datiEner2015 = apeReadOnlyData.getDatiEner2015(); 
		SiceeRCombDener2015 combEner2015 = apeReadOnlyData.getCombDener2015();
		SiceeTDatiGenerali datiGenerali = apeReadOnlyData.getDatiGenerali();
		List<SiceeRCertifServener2015> certifServener2015List = apeReadOnlyData.getCertifServener2015List();
		List<SiceeTDetImp2015> detImp2015List = apeReadOnlyData.getDetImp2015List();
		List<SiceeDCombustibile> elencoCombustibiliDettImpianti = apeReadOnlyData.getElencoCombustibiliDettImpianti();
		List<SiceeDTipoImpianto2015> elencoTipiImpianto = apeReadOnlyData.getElencoTipiImpianto();
		
		aggiungiSezioneAltriDatiEnergeticiGenerali(document, datiEner2015, combEner2015);
		
		aggiungiSezioneAltriDatiFabbricato(document, datiGenerali, datiEner2015, idStatoAttestato);
		
		aggiungiSezioneDettaglioImpianti(document, certifServener2015List, detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto);
		
		gestDebug(this.isSimul, "aggiungiSchedaAltriDati - END");
	}
	
	private void aggiungiSezioneAltriDatiEnergeticiGenerali(Document document, SiceeTDatiEner2015 datiEner2015, SiceeRCombDener2015 combEner2015) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneAltriDatiEnergeticiGenerali - START");
		
		aggiungiTitolo(document, "ALTRI DATI ENERGETICI GENERALI", 170);
		
		String energiaEsportata = Converter.convertToStringOrEmpty(datiEner2015.getEnergiaEsportata());
		String codCombustibile = "";
		String descCombustibile = "";
		String descrVettore = "";
		
		if (combEner2015 != null)
		{
			codCombustibile = Converter.convertToStringOrEmpty(combEner2015.getIdCombustibile());
			descrVettore = StringUtils.trimToEmpty(combEner2015.getDescrAltro());
		}
		
		if (!this.isSimul) {
			descCombustibile = getUtilMgr().getDescrizioneComustibileFossile(codCombustibile);
		}
		
		PdfPTable tabellaAltriDAtiEnergeticiGenerali = inizializzaTabellaApe(new float[] {20, 25, 10, 20, 25});
		
		tabellaAltriDAtiEnergeticiGenerali.addCell(aggiungiCellaHeaderSfondoVerde("Energia esportata"));
		
		Paragraph paragraph = new Paragraph(energiaEsportata,FONT_HELVETICA_8);
		tabellaAltriDAtiEnergeticiGenerali.addCell(paragraph);
		
		tabellaAltriDAtiEnergeticiGenerali.addCell(aggiungiCellaHeaderSfondoVerde("kWh/anno"));

		tabellaAltriDAtiEnergeticiGenerali.addCell(aggiungiCellaHeaderSfondoVerde("Vettore energetico"));

		paragraph = new Paragraph(StringUtils.trimToEmpty(descCombustibile),FONT_HELVETICA_8);
		tabellaAltriDAtiEnergeticiGenerali.addCell(paragraph);
		
		PdfPCell cell = aggiungiCellaApe(3, Rectangle.BOX);
		cell.addElement(new Paragraph(""));
		tabellaAltriDAtiEnergeticiGenerali.addCell(cell);
		
		cell = aggiungiCellaApe(2, Rectangle.BOX);
		cell.addElement(new Paragraph(descrVettore, FONT_HELVETICA_8));
		tabellaAltriDAtiEnergeticiGenerali.addCell(cell);
		
		document.add(tabellaAltriDAtiEnergeticiGenerali);
		
		gestDebug(this.isSimul, "aggiungiSezioneAltriDatiEnergeticiGenerali - END");
	}

	private void aggiungiSezioneAltriDatiFabbricato(Document document, SiceeTDatiGenerali datiGenerali, SiceeTDatiEner2015 datiEner2015, Integer idStatoAttestato) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneAltriDatiFabbricato - START");
		
		aggiungiTitolo(document, "ALTRI DATI DI DETTAGLIO DEL FABBRICATO", 200);
		
		PdfPTable tabellaAltriDatiFabbricato = inizializzaTabellaApe(new float[] {25, 60, 15});
		
		PdfPCell cell = aggiungiCellaHeaderSfondoVerde("V - Volume riscaldato");
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaAltriDatiFabbricato.addCell(cell);
		tabellaAltriDatiFabbricato.addCell(new Paragraph(Converter.convertToStringOrEmpty(datiGenerali.getVolLordoRiscaldato()), FONT_HELVETICA_8));
		tabellaAltriDatiFabbricato.addCell(aggiungiCellaHeaderSfondoVerde("m\u00B3"));

		cell = aggiungiCellaHeaderSfondoVerde("S - Superficie disperdente");
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaAltriDatiFabbricato.addCell(cell);
		tabellaAltriDatiFabbricato.addCell(new Paragraph(Converter.convertToStringOrEmpty(datiGenerali.getSupDisperdente()), FONT_HELVETICA_8));
		tabellaAltriDatiFabbricato.addCell(aggiungiCellaHeaderSfondoVerde("m\u00B2"));
		
		cell = aggiungiCellaHeaderSfondoVerde("Rapporto S/V");
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaAltriDatiFabbricato.addCell(cell);
		cell = aggiungiCellaApe(2, Rectangle.BOX);
		cell.setPadding(5);
		cell.addElement(new Paragraph(Converter.convertToStringOrEmpty(datiEner2015.getRapportoSv()), FONT_HELVETICA_8));
		tabellaAltriDatiFabbricato.addCell(cell);
		
		Paragraph paragraph = new Paragraph("EP", FONT_HELVETICA_9_B);
		paragraph.add(new Chunk("H,nd", FONT_HELVETICA_6_B));
		cell = aggiungiCellaHeaderSfondoVerde(paragraph);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaAltriDatiFabbricato.addCell(cell);
		tabellaAltriDatiFabbricato.addCell(new Paragraph(Converter.convertToStringOrEmpty(datiEner2015.getEph()), FONT_HELVETICA_8));
		tabellaAltriDatiFabbricato.addCell(aggiungiCellaHeaderSfondoVerde("kWh/m\u00B2 anno"));
		
		if (idStatoAttestato == Constants.BOZZA) {			
			paragraph = new Paragraph("EP", FONT_HELVETICA_9_B);
			paragraph.add(new Chunk("H,nd", FONT_HELVETICA_6_B));
			paragraph.add(new Chunk("Limite", FONT_HELVETICA_9_B));
			cell = aggiungiCellaHeaderSfondoVerde(paragraph);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			tabellaAltriDatiFabbricato.addCell(cell);
			tabellaAltriDatiFabbricato.addCell(new Paragraph(Converter.convertToStringOrEmpty(datiEner2015.getEphLimite()), FONT_HELVETICA_8));
			tabellaAltriDatiFabbricato.addCell(aggiungiCellaHeaderSfondoVerde("kWh/m\u00B2 anno"));
		}
		
		paragraph = new Paragraph("A", FONT_HELVETICA_9_B);
		paragraph.add(new Chunk("sol,est", FONT_HELVETICA_6_B));
		paragraph.add(new Chunk("/A", FONT_HELVETICA_9_B));
		paragraph.add(new Chunk("sup utile", FONT_HELVETICA_6_B));
		cell = aggiungiCellaHeaderSfondoVerde(paragraph);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaAltriDatiFabbricato.addCell(cell);
		tabellaAltriDatiFabbricato.addCell(new Paragraph(Converter.convertToStringOrEmpty(datiEner2015.getAsolAsup()), FONT_HELVETICA_8));
		tabellaAltriDatiFabbricato.addCell(aggiungiCellaHeaderSfondoVerde("-"));
		
		paragraph = new Paragraph("Y", FONT_HELVETICA_9_B);
		paragraph.add(new Chunk("IE", FONT_HELVETICA_6_B));
		cell = aggiungiCellaHeaderSfondoVerde(paragraph);
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaAltriDatiFabbricato.addCell(cell);
		tabellaAltriDatiFabbricato.addCell(new Paragraph(Converter.convertToStringOrEmpty(datiEner2015.getYie()), FONT_HELVETICA_8));
		tabellaAltriDatiFabbricato.addCell(aggiungiCellaHeaderSfondoVerde("W/m\u00B2K"));
		
		document.add(tabellaAltriDatiFabbricato);
		
		gestDebug(this.isSimul, "aggiungiSezioneAltriDatiFabbricato - END");
	}
	
	private void aggiungiSezioneDettaglioImpianti(Document document, List<SiceeRCertifServener2015> certifServener2015List, 
			List<SiceeTDetImp2015> detImp2015List, List<SiceeDCombustibile> elencoCombustibiliDettImpianti, List<SiceeDTipoImpianto2015> elencoTipiImpianto) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneDettaglioImpianti - START");
		
		aggiungiTitolo(document, "DATI DI DETTAGLIO DEGLI IMPIANTI", 200);
		
		final float[] TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE = new float[] {30, 20, 17, 19, 15};
		final float[] TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE = new float[] {25, 15, 25, 35};
		
		PdfPTable tabellaDettaglioImpianti = inizializzaTabellaApe(new float[] {13, 60, 27});
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeaderSfondoVerde("Servizio energetico"));
		
		PdfPTable tabellaValoriImpiantiHeader = inizializzaTabellaApe(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE);
		tabellaValoriImpiantiHeader.addCell(aggiungiCellaHeaderSfondoVerde("Tipo di impianto"));
		tabellaValoriImpiantiHeader.addCell(aggiungiCellaHeaderSfondoVerde("Anno di installazione"));
		tabellaValoriImpiantiHeader.addCell(aggiungiCellaHeaderSfondoVerde("Codice catasto regionale impianti termici"));
		tabellaValoriImpiantiHeader.addCell(aggiungiCellaHeaderSfondoVerde("Vettore energetico utilizzato"));
		tabellaValoriImpiantiHeader.addCell(aggiungiCellaHeaderSfondoVerde("Potenza Nominale (kW)"));
		
		PdfPTable tabellaValoriEfficienzaHeader = inizializzaTabellaApe(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE);
		PdfPCell cell = aggiungiCellaHeaderSfondoVerde("Efficienza media stagionale");
		cell.setColspan(2);
		tabellaValoriEfficienzaHeader.addCell(cell);
		tabellaValoriEfficienzaHeader.addCell(aggiungiCellaHeaderSfondoVerde("EPren"));
		tabellaValoriEfficienzaHeader.addCell(aggiungiCellaHeaderSfondoVerde("EPnren"));
		
		cell = new PdfPCell(tabellaValoriImpiantiHeader);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = new PdfPCell(tabellaValoriEfficienzaHeader);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Climatizzazione invernale"));
		
		int borderCellaValoriImpianti = Rectangle.LEFT | Rectangle.TOP | Rectangle.BOTTOM;
		int borderCellaValoriEfficienza = Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM;
		
		SiceeRCertifServener2015 certifServener2015Invern = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_CLIMAINVER);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015Invern, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_CLIMAINVER, certifServener2015Invern));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Climatizzazione estiva"));
		
		SiceeRCertifServener2015 certifServener2015Est = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_CLIMAEST);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015Est, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_CLIMAEST, certifServener2015Est));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Prod. acqua calda sanitaria"));
		
		SiceeRCertifServener2015 certifServener2015AcquaCalda = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_ACQUACALDA);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015AcquaCalda, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_ACQUACALDA, certifServener2015AcquaCalda));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Impianti combinati"));
		
		SiceeRCertifServener2015 certifServener2015ImpiantiCombinati = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_IMPIANTICOMBINATI);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015ImpiantiCombinati, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_IMPIANTICOMBINATI, certifServener2015ImpiantiCombinati));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Prod. da fonti rinnovabili"));
		
		SiceeRCertifServener2015 certifServener2015ProdFontiRinn = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_PRODFONTIRINN);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015ProdFontiRinn, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_PRODFONTIRINN, certifServener2015ProdFontiRinn));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Ventilazione meccanica"));
		
		SiceeRCertifServener2015 certifServener2015VentMecc = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_VENTMECC);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015VentMecc, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_VENTMECC, certifServener2015VentMecc));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Illuminazione"));
		
		SiceeRCertifServener2015 certifServener2015Illumin = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_ILLUMINAZIONE);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015Illumin, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_ILLUMINAZIONE, certifServener2015Illumin));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		tabellaDettaglioImpianti.addCell(aggiungiCellaHeader("Trasporto di cose o persone"));
		
		SiceeRCertifServener2015 certifServener2015Trasporto = MapDto.recuperaCertifServener2015ByServEner(certifServener2015List, Constants.SEZIONE_TRASPORTO);
		
		cell = aggiungiCellaApe(1, borderCellaValoriImpianti);
		cell.addElement(aggiungiTabellaListatoImpianti(TABELLA_VALORE_IMPIANTI_LARGHEZZA_COLONNE, certifServener2015Trasporto, 
				detImp2015List, elencoCombustibiliDettImpianti, elencoTipiImpianto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		cell = aggiungiCellaApe(1, borderCellaValoriEfficienza);
		cell.addElement(aggiungiTabellaEfficienzaImpianti(TABELLA_VALORI_EFFICIENZA_LARGHEZZA_COLONNE, Constants.SEZIONE_TRASPORTO, certifServener2015Trasporto));
		cell.setPadding(0);
		tabellaDettaglioImpianti.addCell(cell);
		
		document.add(tabellaDettaglioImpianti);
		
		gestDebug(this.isSimul, "aggiungiSezioneDettaglioImpianti - END");
	}
	
	private void aggiungiSchedaCertificatoreSopralluoghiSoftware(Document document, ApeReadOnlyData apeReadOnlyData) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSchedaCertificatoreSopralluoghiSoftware - START");
		
		SiceeTAltreInfo altreInfo = apeReadOnlyData.getAltreInfo();
		
		SiceeTCertificatore certificatore = apeReadOnlyData.getCertificatore();
		
		String dTitolo = apeReadOnlyData.getDTitolo();
		
		SiceeTAzienda azienda = apeReadOnlyData.getAzienda();
		
		String descDichIndipendenza = apeReadOnlyData.getDescDichIndipendenza();
		
		SiceeTCertificato certificato = apeReadOnlyData.getCertificato();
		
		aggiungiSezioneInformazioniSulMiglioramento(document, altreInfo);
		
		aggiungiSezioneCertificatore(document, altreInfo, certificatore, dTitolo, azienda, descDichIndipendenza);
		
		aggiungiSezioneSopralluoghi(document, altreInfo);
		
		aggiungiSezioneSoftware(document, altreInfo, certificato, certificatore);
		
		gestDebug(this.isSimul, "aggiungiSchedaCertificatoreSopralluoghiSoftware - END");
	}
	
	private void aggiungiSezioneInformazioniSulMiglioramento(Document document, SiceeTAltreInfo altreInfo) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneInformazioniSulMiglioramento - START");
		
		aggiungiTitolo(document, "INFORMAZIONI SUL MIGLIORAMENTO DELLA PRESTAZIONE ENERGETICA", 350);
		
		Paragraph sottoTitolo = new Paragraph("La sezione riporta informazioni sulle opportunit\u00E1 , anche in termini di strumenti di sostegno nazionali o locali, legate all'esecuzione di diagnosi energetiche e interventi di riqualificazione energetica, comprese le ristrutturazioni importanti.", FONT_HELVETICA_8);
		
		document.add(sottoTitolo);
		
		Paragraph note = new Paragraph("", FONT_HELVETICA_8);
		
		if (!StringUtils.isEmpty(altreInfo.getInfoMiglPrestEnerg())) {
			note.add(altreInfo.getInfoMiglPrestEnerg());
		}
		else {
			note.add("\n\n");
		}
		
		document.add(note);
		
		gestDebug(this.isSimul, "aggiungiSezioneInformazioniSulMiglioramento - END");
	}
	
	private void aggiungiSezioneCertificatore(Document document, SiceeTAltreInfo altreInfo, SiceeTCertificatore certificatore,
			String dTitolo, SiceeTAzienda azienda, String descDichIndipendenza) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneInformazioniSulMiglioramento - START");
		
		aggiungiTitolo(document, "SOGGETTO CERTIFICATORE", 150);
		
		PdfPTable tabellaTipoSoggetto = inizializzaTabellaApe(new float[] {100});
		tabellaTipoSoggetto.getDefaultCell().setPadding(0);
		
		PdfPTable tabellaContenutoTipoSoggetto = initializeTable(new float[] {33, 33, 33});
		tabellaContenutoTipoSoggetto.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		tabellaContenutoTipoSoggetto.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		tabellaContenutoTipoSoggetto.getDefaultCell().setBorder(Rectangle.BOX);
		tabellaContenutoTipoSoggetto.getDefaultCell().setPadding(10);
		
		Integer idRuoloCert = altreInfo.getFkRuoloCert();
		
		Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Ente / Organismo pubblico", idRuoloCert != null && idRuoloCert == Constants.RUOLO_CERTIFICATORE_ENTE_PUBBLICO);
		tabellaContenutoTipoSoggetto.addCell(paragraph);

		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Tecnico abilitato", idRuoloCert != null && idRuoloCert == Constants.RUOLO_CERTIFICATORE_TECNICO_ABILITATO);
		tabellaContenutoTipoSoggetto.addCell(paragraph);

		paragraph = new Paragraph("", FONT_HELVETICA_8_B);
		aggiungiCheckPrima(paragraph, "Organismo / Societ\u00E1 ", idRuoloCert != null && idRuoloCert == Constants.RUOLO_CERTIFICATORE_ORGANISMO_SOCIETA);
		tabellaContenutoTipoSoggetto.addCell(paragraph);
		
		tabellaTipoSoggetto.addCell(tabellaContenutoTipoSoggetto);
		
		document.add(tabellaTipoSoggetto);
		
		PdfPTable tabellaCertificatore = inizializzaTabellaApe(new float[] {30, 70});
		tabellaCertificatore.getDefaultCell().setPadding(7);
		
		String cognomeRagSociale = StringUtils.trimToEmpty(certificatore.getCognome());

		String iscrittoOrdine = "";
		if (certificatore.getIscrittoOrdine() != null && certificatore.getIscrittoOrdine().equalsIgnoreCase(Constants.SI))
		{
			if (certificatore.getOrdine() != null)
				iscrittoOrdine = certificatore.getOrdine() + " / ";
			if (certificatore.getNumIscrAlbo() != null)
				iscrittoOrdine = iscrittoOrdine + certificatore.getNumIscrAlbo();			
		}
		
		String civico = "";
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
		
		String indirizzoCompleto = indirizzo + " " + civico	+ " " + comune + " (" + prov  + ")";
		
		tabellaCertificatore.addCell(new Paragraph("Nome e Cognome / Denominazione", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(certificatore.getNome()) + " " + cognomeRagSociale, FONT_HELVETICA_8));
		
		tabellaCertificatore.addCell(new Paragraph("Indirizzo", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(indirizzoCompleto, FONT_HELVETICA_8));
		
		tabellaCertificatore.addCell(new Paragraph("E-mail", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(certificatore.getEmail()), FONT_HELVETICA_8));
		
		tabellaCertificatore.addCell(new Paragraph("Telefono", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(certificatore.getTelefono()), FONT_HELVETICA_8));
		
		tabellaCertificatore.addCell(new Paragraph("Titolo", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(dTitolo), FONT_HELVETICA_8));
		
		tabellaCertificatore.addCell(new Paragraph("Ordine / iscrizione", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(iscrittoOrdine), FONT_HELVETICA_8));

		tabellaCertificatore.addCell(new Paragraph("Dichiarazione di indipendenza", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(descDichIndipendenza), FONT_HELVETICA_8));

		tabellaCertificatore.addCell(new Paragraph("Informazioni aggiuntive", FONT_HELVETICA_8_B));
		tabellaCertificatore.addCell(new Paragraph(StringUtils.trimToEmpty(altreInfo.getUltInfo()), FONT_HELVETICA_8));
		
		document.add(tabellaCertificatore);
		
		gestDebug(this.isSimul, "aggiungiSezioneInformazioniSulMiglioramento - END");
	}
	
	private void aggiungiSezioneSopralluoghi(Document document, SiceeTAltreInfo altreInfo) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneSopralluoghi - START");
		
		aggiungiTitolo(document, "SOPRALLUOGHI E DATI DI INGRESSO", 200);
		
		PdfPTable tabellaSopralluoghi = inizializzaTabellaApe(new float[] {94, 6});
		tabellaSopralluoghi.getDefaultCell().setPadding(10);
		
		tabellaSopralluoghi.addCell(new Paragraph("E' stato eseguito almeno un sopralluogo/rilievo sull'edificio obbligatorio per la redazione del presente APE?", FONT_HELVETICA_8_B));
		
		Paragraph paragraph = new Paragraph(getSiNoLabel(altreInfo.getFlgSopralluogo()), FONT_HELVETICA_8);
		PdfPCell cell = aggiungiCellaApe(paragraph, 1, Rectangle.BOX);
		cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		tabellaSopralluoghi.addCell(cell);
				
		document.add(tabellaSopralluoghi);
		
		gestDebug(this.isSimul, "aggiungiSezioneSopralluoghi - END");
	};

	private void aggiungiSezioneSoftware(Document document, SiceeTAltreInfo altreInfo, SiceeTCertificato certificato, SiceeTCertificatore certificatore) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneSoftware - START");
		
		aggiungiTitolo(document, "SOFTWARE UTILIZZATO", 150);
		
		PdfPTable tabellaSoftware = inizializzaTabellaApe(new float[] {94, 6});
		tabellaSoftware.getDefaultCell().setPadding(10);
		
		tabellaSoftware.addCell(new Paragraph("Il software utilizzato risponde ai requisiti di rispondenza e garanzia di scostamento massimo dei risultati conseguiti rispetto ai valori ottenuti per mezzo dello strumento di riferimento nazionale?", FONT_HELVETICA_8_B));
		Paragraph paragraph = new Paragraph(getSiNoLabel(altreInfo.getFlgSw1()), FONT_HELVETICA_8);
		PdfPCell cell = aggiungiCellaApe(paragraph, 1, Rectangle.BOX);
		cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		tabellaSoftware.addCell(cell);
		
		tabellaSoftware.addCell(new Paragraph("Ai fini della redazione del presente attestato \u00E9 stato utilizzato un software che impieghi un metodo di calcolo semplificato?", FONT_HELVETICA_8_B));
		paragraph = new Paragraph(getSiNoLabel(altreInfo.getFlgSw2()), FONT_HELVETICA_8);
		cell = aggiungiCellaApe(paragraph, 1, Rectangle.BOX);
		cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		tabellaSoftware.addCell(cell);
		
		addEmptyCell(tabellaSoftware, 2, Rectangle.NO_BORDER);

		addEmptyCell(tabellaSoftware, 2, Rectangle.NO_BORDER);
		
		addEmptyCell(tabellaSoftware, 2, Rectangle.NO_BORDER);
		
		paragraph = new Paragraph("Il presente attestato \u00E9 reso, dal sottoscritto, in forma di dichiarazione sostitutiva di atto notorio ai sensi dell'articolo 47 del D.P.R. 445/2000 e dell'articolo 15, comma 1 del D.Lgs 192/2005 cos\u00EC come modificato dall'articolo 12 del D.L 63/2013.", FONT_HELVETICA_8_B);
		PdfPCell cellaNota = aggiungiCellaApe(paragraph, 2, Rectangle.BOX);
		cellaNota.setPadding(10);
		tabellaSoftware.addCell(cellaNota);
		
		document.add(tabellaSoftware);
		
		PdfPTable tabellaFirma = inizializzaTabellaDefault(new float[] {20, 15 , 40, 45});
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataStr = "";
		
		Date dataEmissione = certificato.getDtInizio();
		if (dataEmissione != null) {
			dataStr = sdf.format(dataEmissione);
		}
		
		String firma = StringUtils.trimToEmpty(certificatore.getCognome()) + " " +  StringUtils.trimToEmpty(certificatore.getNome()) + " " + "N." + " " +  StringUtils.trimToEmpty(certificatore.getNumCertificatore());

		
		tabellaFirma.addCell(new Paragraph("Data di emissione", FONT_HELVETICA_8_B));
		tabellaFirma.addCell(new Paragraph(dataStr, FONT_HELVETICA_8));
		tabellaFirma.addCell(new Paragraph("Firma o firma del tecnico o firma digitale", FONT_HELVETICA_8_B));
		tabellaFirma.addCell(new Paragraph(firma, FONT_HELVETICA_8));
		
		document.add(tabellaFirma);
		
		gestDebug(this.isSimul, "aggiungiSezioneSoftware - END");
	}
	
	private void aggiungiSchedaLegenda(Document document) throws DocumentException {
		gestDebug(this.isSimul, "aggiungiSezioneLegenda - START");
		
		aggiungiTitolo(document, "LEGENDA E NOTE PER LA COMPILAZIONE", 200);
		
		PdfPTable tabellaLegenda = inizializzaTabellaApe(new float[] {100});
		tabellaLegenda.getDefaultCell().setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		tabellaLegenda.getDefaultCell().setPadding(5);
		
		Paragraph paragraph = new Paragraph("Il presente documento attesta la ", FONT_HELVETICA_8);
		paragraph.add(new Chunk("prestazione ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("e la ", FONT_HELVETICA_8));
		paragraph.add(new Chunk("classe energetica ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("dell'edificio o dell'unit\u00E1  immobiliare, ovvero la quantit\u00E1  di energia necessaria ad assicurare "
				+ "il comfort attraverso i diversi servizi erogati dai sistemi tecnici presenti, "
				+ "in condizioni convenzionali d'uso.", FONT_HELVETICA_8));
		paragraph.add(new Chunk(" Al fine di individuare le potenzialit\u00E1  di miglioramento della prestazione energetica, "
				+ "l'attestato riporta informazioni specifiche sulle prestazioni energetiche del fabbricato e degli impianti.", FONT_HELVETICA_8));
		paragraph.add(new Chunk(" Viene altres\u00EC indicata la classe energetica pi\u00FA elevata "
				+ "raggiungibile in caso di realizzazione delle misure migliorative consigliate, "
				+ "cos\u00EC come descritte nella sezione", FONT_HELVETICA_8));
		paragraph.add(new Chunk(" \"raccomandazioni\"", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk(" (pag.2).", FONT_HELVETICA_8));
		
		PdfPCell cell = aggiungiCellaApe(paragraph, 1, Rectangle.TOP | Rectangle.RIGHT | Rectangle.LEFT);
		cell.setPadding(5);

		tabellaLegenda.addCell(cell);
		
		PdfPCell cellTitolo = aggiungiSezioneTabellaCellaTitolo("PRIMA PAGINA", 1);
		cellTitolo.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cellTitolo.setPadding(5);
		
		tabellaLegenda.addCell(cellTitolo);

		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Informazioni generali: ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("tra le informazioni generali \u00E9 riportata la motivazione "
				+ "alla base della redazione dell'APE. Nell'ambito del periodo di validit\u00E1 , "
				+ "ci\u00F2 non preclude l'uso dell'APE stesso per i fini di legge, "
				+ "anche se differenti da quelli ivi indicati.", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Prestazione energetica globale (EPgl,nren): ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("fabbisogno annuale di energia primaria non rinnovabile relativa "
				+ "a tutti i servizi erogati dai sistemi tecnici presenti, "
				+ "in base al quale \u00E9 identificata la classe di prestazione dell'edificio "
				+ "in una scala da A4 (edificio pi\u00FA efficiente) a G (edificio meno efficiente).", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Prestazione energetica del fabbricato: ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("indice qualitativo del fabbisogno di energia necessario per il soddisfacimento del confort interno, "
				+ "indipendente dalla tipologia e dal rendimento degli impianti presenti. Tale indice da un'indicazione di come l'edificio, "
				+ "d'estate e d'inverno, isola termicamente gli ambienti interni rispetto all'ambiente esterno. "
				+ "La scala di valutazione qualitativa utilizzata osserva il seguente criterio:", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
				
		PdfPTable tabellaQualita = initializeTable(5);
		tabellaQualita.getDefaultCell().setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		tabellaQualita.getDefaultCell().setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		tabellaQualita.getDefaultCell().setBorder(Rectangle.BOX);
		tabellaQualita.getDefaultCell().setMinimumHeight(20);
		
		addEmptyCell(tabellaQualita, 1, Rectangle.NO_BORDER);

		tabellaQualita.addCell(aggiungiLegendaQualita("smile_felice.png", "QUALITA' ALTA"));

		tabellaQualita.addCell(aggiungiLegendaQualita("smile_serio.png", "QUALITA' MEDIA"));
		
		tabellaQualita.addCell(aggiungiLegendaQualita("smile_triste.png", "QUALITA' BASSA"));
		
		addEmptyCell(tabellaQualita, 1, Rectangle.NO_BORDER);
		
		tabellaLegenda.addCell(tabellaQualita);
		
		paragraph = new Paragraph("I valori di soglia per la definizione del livello di qualit\u00E1 , "
				+ "suddivisi per tipo di indicatore, sono riportati nelle Linee guida per "
				+ "l'attestazione energetica degli edifici di cui al decreto previsto dall'articolo 6, "
				+ "comma 12 del d.lgs. 192/2005.", FONT_HELVETICA_8);
		
		tabellaLegenda.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Edificio a energia quasi zero: ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("edificio ad altissima prestazione energetica, "
				+ "calcolata conformemente alle disposizioni del decreto legislativo 19 agosto 2005, "
				+ "n. 192 e del decreto ministeriale sui requisiti minimi previsto dall'articolo 4, comma 1 del d.lgs. 192/2005. "
				+ "Il fabbisogno energetico molto basso o quasi nullo \u00E9 coperto in misura significativa da energia da fonti rinnovabili, "
				+ "pro-dotta all'interno del confine del sistema (in situ). "
				+ "Una spunta sull'apposito spazio adiacente alla scala di classificazione indica "
				+ "l'appartenenza dell'edificio oggetto dell'APE a questa categoria.", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Riferimenti: ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("raffronto con l'indice di prestazione globale non rinnovabile "
				+ "di un edificio simile ma dotato dei requisiti minimi degli edifici nuovi, "
				+ "nonch\u00e9 con la media degli indici di prestazione degli edifici esistenti simili, "
				+ "ovvero contraddistinti da stessa tipologia d'uso, tipologia costruttiva, "
				+ "zona climatica, dimensioni ed esposizione di quello oggetto dell'attestato.", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
		
		cellTitolo = aggiungiSezioneTabellaCellaTitolo("SECONDA PAGINA", 1);
		cellTitolo.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cellTitolo.setPadding(5);
		
		tabellaLegenda.addCell(cellTitolo);

		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Prestazioni energetiche degli impianti e consumi stimati: ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("la sezione riporta l'indice di prestazione energetica rinnovabile "
				+ "e non rinnovabile dell'immobile oggetto di attestazione. "
				+ "Tali indici informano sulla percentuale di energia rinnovabile utilizzata dall'immobile rispetto al totale. "
				+ "La sezione riporta infine una stima del quantitativo di energia consumata annualmente "
				+ "dall'immobile secondo un uso standard, suddivisi per tipologia di fonte energetica utilizzata.", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);
		paragraph.add(new Chunk("Raccomandazioni: ", FONT_HELVETICA_8_B));
		paragraph.add(new Chunk("di seguito si riporta la tabella che classifica le tipologie di intervento raccomandate "
				+ "per la riqualificazione energetica e la ristrutturazione importante.", FONT_HELVETICA_8));
		tabellaLegenda.addCell(paragraph);
		
		paragraph = new Paragraph("RIQUALIFICAZIONE ENERGETICA E RISTRUTTURAZIONE IMPORTANTE EDIFICIO/UNITA' IMMOBILIARE - Tabella dei Codici", FONT_HELVETICA_8_B);
		
		cell = aggiungiCellaApe(paragraph, 1, Rectangle.LEFT | Rectangle.RIGHT);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setPadding(5);

		tabellaLegenda.addCell(cell);
		
		PdfPTable tabellaTipoIntervento = new PdfPTable(new float[] {15, 20, 50, 15});
		tabellaTipoIntervento.getDefaultCell().setBorder(Rectangle.BOX);
		tabellaTipoIntervento.getDefaultCell().setBorderColor(GREEN);
		tabellaTipoIntervento.getDefaultCell().setBorderWidth(BORDER_APE_TABLE_WIDTH);
		tabellaTipoIntervento.getDefaultCell().setPadding(5);
		
		addEmptyCell(tabellaTipoIntervento, 1, Rectangle.NO_BORDER);
		tabellaTipoIntervento.addCell(aggiungiCellaHeaderTabellaLegendaTipoIntervento("Codice"));
		tabellaTipoIntervento.addCell(aggiungiCellaHeaderTabellaLegendaTipoIntervento("TIPO DI INTERVENTO"));
		addEmptyCell(tabellaTipoIntervento, 1, Rectangle.NO_BORDER);
		
		aggiungiRigaTabellaLegendaTipoIntervento(tabellaTipoIntervento, "Ren1", "FABBRICATO - INVOLUCRO OPACO");
		aggiungiRigaTabellaLegendaTipoIntervento(tabellaTipoIntervento, "Ren2", "FABBRICATO - INVOLUCRO TRASPARENTE");
		aggiungiRigaTabellaLegendaTipoIntervento(tabellaTipoIntervento, "Ren3", "IMPIANTO CLIMATIZZAZIONE - INVERNO");
		aggiungiRigaTabellaLegendaTipoIntervento(tabellaTipoIntervento, "Ren4", "IMPIANTO CLIMATIZZAZIONE - ESTATE");
		aggiungiRigaTabellaLegendaTipoIntervento(tabellaTipoIntervento, "Ren5", "ALTRI IMPIANTI");
		aggiungiRigaTabellaLegendaTipoIntervento(tabellaTipoIntervento, "Ren6", "FONTI RINNOVABILI");
		
		tabellaLegenda.addCell(tabellaTipoIntervento);
		
		cellTitolo = aggiungiSezioneTabellaCellaTitolo("TERZA PAGINA", 1);
		cellTitolo.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		cellTitolo.setPadding(5);

		tabellaLegenda.addCell(cellTitolo);

		paragraph = new Paragraph("La terza pagina riporta la quantit\u00E1  di energia prodotta in situ ed esportata annualmente, "
				+ "nonch\u00e9 la sua tipologia.\nRiporta infine, suddivise in due sezioni relative "
				+ "rispettivamente al fabbricato e agli impianti, i dati di maggior dettaglio alla base del calcolo.", FONT_HELVETICA_8);
		
		cell = aggiungiCellaApe(paragraph, 1, Rectangle.BOTTOM | Rectangle.LEFT | Rectangle.RIGHT);
		cell.setPadding(5);
		
		tabellaLegenda.addCell(cell);
		
		document.add(tabellaLegenda);
		
		gestDebug(this.isSimul, "aggiungiSezioneLegenda - END");
	}
	//METODI PER GENERAZIONE PDF APE - END
	
	//METODI PER GENERAZIONE PDF TARGHETTA APE - START
	private void aggiungiTitoloTarghetta(PdfPTable tabellaContenutoTarghetta) {
		gestDebug(this.isSimul, "aggiungiTitoloTarghetta - START");
		
		PdfPTable tabellaHeader = inizializzaTabellaDefault(new float[] {80, 20});
		tabellaHeader.getDefaultCell().setPadding(0);
		
		PdfPTable tabellaTitoli = initializeTable(1);
		
		Paragraph paragraph = new Paragraph("PRESTAZIONE ENERGETICA", FONT_HELVETICA_10_B_WHITE);
		PdfPCell cell = aggiungiCellaApe(paragraph, 1, Rectangle.BOTTOM | Rectangle.RIGHT);
		cell.setBackgroundColor(DARK_GREEN);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaTitoli.addCell(cell);
		
		paragraph = new Paragraph("Prestazione energetica", FONT_HELVETICA_8_B_GREEN);
		cell = aggiungiCellaApe(paragraph, 1, Rectangle.BOTTOM | Rectangle.RIGHT);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		
		tabellaTitoli.addCell(cell);
		
		tabellaHeader.addCell(tabellaTitoli);
		
		cell = aggiungiCellaApe(1, Rectangle.BOX);
		cell.addElement(getImmagine("attestato2015/logoAPE2015.png"));
		
		tabellaHeader.addCell(cell);
		
		tabellaContenutoTarghetta.addCell(tabellaHeader);
		
		gestDebug(this.isSimul, "aggiungiTitoloTarghetta - END");
	}
	
	private void aggiungiClasseEnergeticaTarghetta(PdfPTable tabellaContenutoTarghetta, SiceeTDatiEner2015 datiEner, SiceeDClasseEnergetica classeEner) {
		gestDebug(this.isSimul, "aggiungiClasseEnergeticaTarghetta - START");
		
		String classeEnerDescr = StringUtils.trimToEmpty(classeEner.getDescr());
		
		PdfPTable tabellaInterna = inizializzaTabellaDefault(new float[] {10, 90});
		tabellaInterna.setHorizontalAlignment(Element.ALIGN_CENTER);
		tabellaInterna.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
				
		addEmptyCell(tabellaInterna, 2, Rectangle.NO_BORDER);
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		
		tabellaInterna.addCell(new Paragraph("CLASSE", FONT_HELVETICA_15_B));
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		
		tabellaInterna.addCell(new Paragraph("Energetica", FONT_HELVETICA_13_B));
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
		
		tabellaInterna.addCell(new Paragraph(classeEnerDescr, FONT_HELVETICA_15_B));
		
		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);

		addEmptyCell(tabellaInterna, 2, Rectangle.NO_BORDER);

		addEmptyCell(tabellaInterna, 1, Rectangle.NO_BORDER);
				
		PdfPTable tabellaEpgl = new PdfPTable(1);
		tabellaEpgl.setHorizontalAlignment(Element.ALIGN_CENTER);
		tabellaEpgl.setTotalWidth(80);
		tabellaEpgl.setLockedWidth(true);
		tabellaEpgl.getDefaultCell().setBorder(Rectangle.LEFT | Rectangle.RIGHT);
		tabellaEpgl.getDefaultCell().setBackgroundColor(Color.WHITE);
		tabellaEpgl.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		tabellaEpgl.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		tabellaEpgl.getDefaultCell().setMinimumHeight(MIN_HEIGHT_CELL);
		tabellaEpgl.getDefaultCell().setPadding(10);
		
		addEmptyCell(tabellaEpgl, 1, Rectangle.BOTTOM);
		
		Paragraph paragraph = new Paragraph("EPgl,nren", FONT_HELVETICA_8_B_GREEN);	
		tabellaEpgl.addCell(paragraph);
		
		paragraph = new Paragraph(Converter.convertToStringOrEmpty(datiEner.getEpglNrenGlobale()), FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT | Rectangle.BOTTOM);
		cell.setBackgroundColor(Color.WHITE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setMinimumHeight(MIN_HEIGHT_CELL);
		tabellaEpgl.addCell(cell);
		
		paragraph = new Paragraph("kWh/m\u00B2anno", FONT_HELVETICA_8_B_GREEN);	
		tabellaEpgl.addCell(paragraph);
		
		addEmptyCell(tabellaEpgl, 1, Rectangle.TOP);
		
		tabellaInterna.addCell(tabellaEpgl);
		
		PdfPCell cellaContenutoClasseEnergetica = aggiungiCellaApe(aggiungiSchemaClasseEnergetica("", datiEner, tabellaInterna, classeEnerDescr), 1, Rectangle.NO_BORDER);
		cellaContenutoClasseEnergetica.setPadding(2);
		
		tabellaContenutoTarghetta.addCell(cellaContenutoClasseEnergetica);		
		
		tabellaContenutoTarghetta.addCell(aggiungiCellaApe(1, Rectangle.BOTTOM));
		
		gestDebug(this.isSimul, "aggiungiClasseEnergeticaTarghetta - END");
	}
	
	private void aggiungiIndicePrestazioneEnergeticaTarghetta(PdfPTable tabellaContenutoTarghetta, SiceeTDatiEner2015 datiEner) {
		gestDebug(this.isSimul, "aggiungiIndicePrestazioneEnergeticaTarghetta - START");
				
		PdfPTable tabella = inizializzaTabellaDefault(1);
		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		
		PdfPCell cell = aggiungiSezioneTabellaCellaTitolo("Indice della prestazione energetica rinnovabile", 1);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPadding(10);
		
		tabella.addCell(cell);
		
		Paragraph paragraph = new Paragraph("EPgl,ren : ", FONT_HELVETICA_8);
		
		paragraph.add(Converter.convertToStringOrEmpty(datiEner.getEpglRenGlobale()));
		
		paragraph.add(" kWh/m\u00B2anno");
		
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setPadding(10);
		cell.setPaddingTop(0);

		tabella.addCell(cell);
		
		tabellaContenutoTarghetta.addCell(tabella);
		
		gestDebug(this.isSimul, "aggiungiIndicePrestazioneEnergeticaTarghetta - END");
	}

	private void aggiungiPrestazioneFabbricato(PdfPTable tabellaContenutoTarghetta, SiceeTDatiEner2015 datiEner) {
		gestDebug(this.isSimul, "aggiungiPrestazioneFabbricato - START");
		
		PdfPTable tabella = inizializzaTabellaApe(new float[] {40, 30, 30});
		tabella.getDefaultCell().setBorder(Rectangle.RIGHT);
		tabella.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
		
		tabella.addCell(new Paragraph("Prestazione energetica del fabbricato", FONT_HELVETICA_8_B_GREEN));

		String smileInvernoImageName = "";
		String smileEstateImageName = "";
		
		if (this.isSimul) {
			smileInvernoImageName = "smile_triste.png";
			smileEstateImageName = "smile_felice.png";
		}
		else {
			smileInvernoImageName = getCertificatoMgr().recuperaNomeImmagineSmile(datiEner.getFlgSmileInverno());
			smileEstateImageName = getCertificatoMgr().recuperaNomeImmagineSmile(datiEner.getFlgSmileEstate());
		}
		
		Image smileInvernoImage = getImmagine("attestato2015/"+ smileInvernoImageName);
		smileInvernoImage.scalePercent(30);
		Image smileEstateImage = getImmagine("attestato2015/"+ smileEstateImageName);
		smileEstateImage.scalePercent(30);
		
		PdfPTable tabellaSmile = inizializzaTabellaDefault(1);
		tabellaSmile.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaSmile.addCell(new Paragraph("Inverno", FONT_HELVETICA_8_B_GREEN));
		Paragraph paragraph = new Paragraph(new Chunk(smileInvernoImage, 0, 0, true));
		tabellaSmile.addCell(paragraph);
		
		tabella.addCell(tabellaSmile);
		
		tabellaSmile = inizializzaTabellaDefault(1);
		tabellaSmile.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaSmile.addCell(new Paragraph("Estate", FONT_HELVETICA_8_B_GREEN));
		paragraph = new Paragraph(new Chunk(smileEstateImage, 0, 0, true));
		tabellaSmile.addCell(paragraph);
		
		tabella.addCell(tabellaSmile);

		tabellaContenutoTarghetta.addCell(tabella);
		
		gestDebug(this.isSimul, "aggiungiPrestazioneFabbricato - END");
	}
	//METODI PER GENERAZIONE PDF TARGHETTA APE - END
	
	private void aggiungiTitolo(Document document, String titolo, float larghezzaTitolo) throws DocumentException {
		PdfPTable tabellaContainer = initializeTable(new float[] {100});
		
		PdfPTable tabellaTitle = new PdfPTable(1);
		tabellaTitle.setTotalWidth(larghezzaTitolo);
		tabellaTitle.setLockedWidth(true);
		tabellaTitle.setHorizontalAlignment(Element.ALIGN_LEFT);
		tabellaTitle.setSpacingBefore(0);
		tabellaTitle.setSpacingAfter(0);
		
		Paragraph paragraphTitle = new Paragraph(titolo, FONT_HELVETICA_8_B_WHITE);
		
		PdfPCell cellTitle = new PdfPCell(paragraphTitle);
		cellTitle.setBackgroundColor(DARK_GREEN);
		cellTitle.setBorder(Rectangle.BOTTOM | Rectangle.RIGHT);
		cellTitle.setBorderWidth(2);
		cellTitle.setBorderColor(DARK_GREEN);
		cellTitle.setPadding(3);
		tabellaTitle.addCell(cellTitle);
		
		PdfPCell cellContainer = new PdfPCell(tabellaTitle);
		cellContainer.setBorder(Rectangle.TOP | Rectangle.LEFT);
		cellContainer.setBorderWidth(2);
		cellContainer.setBorderColor(DARK_GREEN);
		tabellaContainer.addCell(cellContainer);
		
		document.add(tabellaContainer);
	}
	
	private PdfPCell aggiungiCellaApe(PdfPCell cell, int colspan, int border) {
		cell.setBorder(border);
		cell.setColspan(colspan);
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cell.setBorderColor(DARK_GREEN);
		cell.setMinimumHeight(MIN_HEIGHT_CELL);
		return cell;
	}
	
	private PdfPCell aggiungiCellaApe(int colspan, int border) {
		return aggiungiCellaApe(new PdfPCell(), colspan, border);
	}
	
	private PdfPCell aggiungiCellaApe(Paragraph paragraph, int colspan, int border) {
		return aggiungiCellaApe(new PdfPCell(paragraph), colspan, border);
	}
	
	private PdfPCell aggiungiCellaApe(PdfPTable tabella, int colspan, int border) {
		return aggiungiCellaApe(new PdfPCell(tabella), colspan, border);
	}
	
	private PdfPTable inizializzaTabellaApe(float[] columnWidth) {
		PdfPTable tabella = new PdfPTable(columnWidth);
		tabella.setSpacingBefore(5);
		tabella.setWidthPercentage(100);
		tabella.getDefaultCell().setBorder(Rectangle.BOX);
		tabella.getDefaultCell().setBorderWidth(BORDER_APE_TABLE_WIDTH);
		tabella.getDefaultCell().setBorderColor(DARK_GREEN);
		tabella.getDefaultCell().setPadding(5);
		
		return tabella;
	}
	
	private PdfPCell aggiungiSezioneTabellaCellaTitolo(String titolo, int colspan) {
		
		Paragraph paragraphTitolo = new Paragraph(titolo, FONT_HELVETICA_8_B_GREEN);
		
		PdfPCell cell = aggiungiCellaApe(paragraphTitolo, colspan, Rectangle.NO_BORDER);
		cell.setMinimumHeight(0);
		
		return cell;
	}
	
	private PdfPTable inizializzaTabellaDefault(int columnsNumber) {
		PdfPTable tabella = initializeTable(columnsNumber);
		tabella.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		
		return tabella;
	}
	
	private PdfPTable inizializzaTabellaDefault(float[] columnsWidth) {
		PdfPTable tabella = initializeTable(columnsWidth);
		tabella.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		
		return tabella;
	}
	
	private Image getLogoServiziEnergetici(String nomeLogo) {
		Image image = getImmagine("attestato2015/" + nomeLogo);
		
		if (image != null) {			
			image.scaleAbsolute(15, 15);
		}
		
		return image;
	}
	
	private void aggiungiRigaTabellaDatiIdentificativi(PdfPTable tabella, String labelSinistra, String valoreSinistra, String labelDestra, String valoreDestra) {
		Paragraph paragraph = new Paragraph(labelSinistra, FONT_HELVETICA_8);
		paragraph.add(" " + valoreSinistra);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.RIGHT);
		cell.setPadding(5);
		tabella.addCell(cell);
		
		paragraph = new Paragraph(labelDestra, FONT_HELVETICA_8);
		paragraph.add(" " + valoreDestra);
		tabella.addCell(paragraph);
	}
	
	private PdfPTable aggiungiSchemaClasseEnergetica(String titolo, SiceeTDatiEner2015 datiEner, 
			PdfPTable tabellaInternaClasseEnergetica, String classeEnerg) {
		PdfPTable tabella = inizializzaTabellaDefault(new float[] {62, 38});
		tabella.getDefaultCell().setPaddingLeft(0);
		
		PdfPTable tabellaSchemaPrestazione = inizializzaTabellaDefault(1);
		tabellaSchemaPrestazione.getDefaultCell().setPadding(0);
		
		PdfPCell cell = aggiungiSezioneTabellaCellaTitolo(titolo, 1);
		cell.setPadding(0);
		cell.setMinimumHeight(15);
		
		tabellaSchemaPrestazione.addCell(cell);
		
		Paragraph paragraph = new Paragraph("", FONT_HELVETICA_8);
		
		aggiungiImmagineETesto(paragraph, getLogoServiziEnergetici("piu.png"), "Pi\u00FA efficiente", 0, 5, -5);
		
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaSchemaPrestazione.addCell(cell);
		
		addEmptyCell(tabellaSchemaPrestazione, 1, Rectangle.NO_BORDER);
		addEmptyCell(tabellaSchemaPrestazione, 1, Rectangle.NO_BORDER);
		
		cell = new PdfPCell(getImmagine("attestato2015/barre_classe.png"), true);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaSchemaPrestazione.addCell(cell);
		
		paragraph = new Paragraph("", FONT_HELVETICA_8);

		aggiungiImmagineETesto(paragraph, getLogoServiziEnergetici("meno.png"), "Meno efficiente", 0, 5, -5);
		
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.NO_BORDER);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		
		tabellaSchemaPrestazione.addCell(cell);
		
		tabella.addCell(tabellaSchemaPrestazione);
		
		PdfPTable tabellaClasseEnergetica = inizializzaTabellaDefault(new float[] {10, 90});
		
		addEmptyCell(tabellaClasseEnergetica, 1, Rectangle.NO_BORDER);
		
		PdfPTable tabellaEnergiaQuasiZero = new PdfPTable(new float[] {70, 30});
		tabellaEnergiaQuasiZero.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		tabellaEnergiaQuasiZero.getDefaultCell().setBackgroundColor(DARK_GREEN);
		tabellaEnergiaQuasiZero.getDefaultCell().setPadding(5);
		
		paragraph = new Paragraph("EDIFICIO A ENERGIA QUASI ZERO", FONT_HELVETICA_8_B_WHITE);
		tabellaEnergiaQuasiZero.addCell(paragraph);
		
		paragraph = new Paragraph();
		aggiungiCheck(paragraph, Converter.convertTo(datiEner.getFlgEdifE0()), 15, 15, 0, -20);
		cell = new PdfPCell(paragraph);
		tabellaEnergiaQuasiZero.addCell(paragraph);
		
		cell = new PdfPCell(tabellaEnergiaQuasiZero);
		cell.setColspan(2);
		tabellaClasseEnergetica.addCell(cell);
		
		addEmptyCell(tabellaClasseEnergetica, 2, Rectangle.NO_BORDER);

		String nomeImg = "classe" + classeEnerg + ".png";
		
		cell = new PdfPCell(tabellaInternaClasseEnergetica);
		BackgroundImageEventListener cellEvent = new BackgroundImageEventListener("attestato2015/" + nomeImg);
		cell.setCellEvent(cellEvent);
		cell.setColspan(2);
		cell.setBorder(Rectangle.NO_BORDER);
		tabellaClasseEnergetica.addCell(cell);
		
		tabella.addCell(tabellaClasseEnergetica);
		
		return tabella;
	}
	
	private PdfPTable aggiungiClasseEnergeticaServiziEnergetici(String classeEnergetica) {
		PdfPTable tabella = new PdfPTable(new float[] {5, 90, 5});
		
		tabella.getDefaultCell().setBorder(Rectangle.BOX);
		tabella.getDefaultCell().setBackgroundColor(LIGHT_GRAY);
		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		tabella.getDefaultCell().setMinimumHeight(MIN_HEIGHT_CELL);
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		Paragraph paragraph = new Paragraph();
		paragraph.add(new Chunk("CLASSE\n", FONT_HELVETICA_11_B));
		paragraph.add(new Chunk("ENERGETICA", FONT_HELVETICA_9_B));
		
		tabella.addCell(paragraph);
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
			
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		paragraph = new Paragraph(classeEnergetica, FONT_HELVETICA_11_B);
		
		tabella.addCell(paragraph);
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		return tabella;
	}
	
	private PdfPTable aggiungiClasseEnergetica(String classeEnergetica) {
		PdfPTable tabella = new PdfPTable(3);
		tabella.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		tabella.addCell("");
		Paragraph paragraph = new Paragraph(classeEnergetica, FONT_HELVETICA_10_B);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOX);
		cell.setBackgroundColor(Color.WHITE);
		cell.setMinimumHeight(MIN_HEIGHT_CELL);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);

		tabella.addCell(cell);
		tabella.addCell("");
		return tabella;
	}
	
	private PdfPCell aggiungiCellaBloccoRiferimento(PdfPTable tabellaBloccoRiferimento, String backgroundImgName) {
		PdfPCell cell = new PdfPCell(tabellaBloccoRiferimento);
		cell.setCellEvent(new BackgroundImageEventListener(backgroundImgName));
		cell.setBorder(Rectangle.NO_BORDER);
		cell.setFixedHeight(80);
		cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		
		return cell;
	}
	
	private PdfPTable aggiungiColonnaValoreCentrato(String label, String valore) {
		PdfPTable tabella = new PdfPTable(new float[] {5, 90, 5});
		tabella.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		
		addEmptyCell(tabella, 3, Rectangle.NO_BORDER);
		
		tabella.addCell("");
		Paragraph paragraph = new Paragraph(label, FONT_HELVETICA_8);
		PdfPCell cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOX);
		cell.setBackgroundColor(Color.WHITE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setMinimumHeight(MIN_HEIGHT_CELL);
		tabella.addCell(cell);
		tabella.addCell("");
		
		tabella.addCell("");
		paragraph = new Paragraph(valore, FONT_HELVETICA_8);
		cell = new PdfPCell(paragraph);
		cell.setBorder(Rectangle.BOX);
		cell.setBackgroundColor(Color.WHITE);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setMinimumHeight(MIN_HEIGHT_CELL);
		tabella.addCell(cell);
		tabella.addCell("");
		
		addEmptyCell(tabella, 3, Rectangle.NO_BORDER);
		
		return tabella;
	}
	
	private PdfPCell aggiungiCellaHeader(Paragraph paragrafoTitolo) {
		PdfPCell cell = new PdfPCell(paragrafoTitolo);	
		cell.setBackgroundColor(LIGHT_GRAY);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setBorder(Rectangle.BOX);
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cell.setBorderColor(DARK_GREEN);
		cell.setFixedHeight(25);
		return cell;
	}
	
	private PdfPCell aggiungiCellaHeader(String titoloHeader) {
		Paragraph paragraph = new Paragraph(titoloHeader, FONT_HELVETICA_9_B);
	
		return aggiungiCellaHeader(paragraph);
	}
	
	private PdfPCell aggiungiCellaHeaderLight(String titoloHeader) {
		PdfPCell cell = aggiungiSezioneTabellaCellaTitolo(titoloHeader, 1);
		cell.setBorder(Rectangle.BOX);
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		cell.setBorderColor(DARK_GREEN);
		cell.setFixedHeight(60);
		return cell;
	}
	
	private PdfPCell aggiungiCellaHeaderSfondoVerde(Paragraph paragrafoTitolo) {
		PdfPCell cell = aggiungiCellaHeader(paragrafoTitolo);
		cell.setFixedHeight(0);
		cell.setPadding(5);
		cell.setBackgroundColor(BACKGROUND_GREEN);
		return cell;
	}
	
	private PdfPCell aggiungiCellaHeaderSfondoVerde(String titoloHeader) {
		Paragraph paragraph = new Paragraph(titoloHeader, FONT_HELVETICA_9_B);
		
		return aggiungiCellaHeaderSfondoVerde(paragraph);
	}
	
	private PdfPTable aggiungiTabellaListatoImpianti(float[] larghezzaColonneListatoImpianto, SiceeRCertifServener2015 certifServener2015,
			List<SiceeTDetImp2015> detImp2015List, List<SiceeDCombustibile> elencoCombustibiliDettImpianti,
			List<SiceeDTipoImpianto2015> elencoTipiImpianto) {

		PdfPTable tabella = initializeTable(larghezzaColonneListatoImpianto);
		tabella.setExtendLastRow(true);
		tabella.getDefaultCell().setBorder(Rectangle.BOX);
		tabella.getDefaultCell().setMinimumHeight(MIN_HEIGHT_CELL);
		tabella.getDefaultCell().setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
				
		if (certifServener2015 == null) {
			for (int i = 0; i < 5; i++) {
				tabella.addCell("");
			}
			
			return tabella;
		}
		
		List<SiceeTDetImp2015> detImp2015Parz = MapDto.recuperaDettImp2015ByServEner(detImp2015List, certifServener2015.getIdServEner());

		if ((detImp2015Parz != null) && (!detImp2015Parz.isEmpty())) {
			Integer tipoImpianto = null;
			String descrizioneImpianto = null;
			Integer annoInstallazione = null;
			Integer codiceCatastoRegionaleImpiantiTermici = null;
			Integer vettoriEnergeticiUtilizzati = null;
			
			for (SiceeTDetImp2015 impianto : detImp2015Parz) {
				String codCatReg = "";
				
				tipoImpianto = impianto.getFkTipoImpianto();
				descrizioneImpianto = impianto.getTipoImpianto();
				annoInstallazione = impianto.getAnnoInstall();
				
				codiceCatastoRegionaleImpiantiTermici = impianto.getCodiceImpiantoCit();

				vettoriEnergeticiUtilizzati = impianto.getFkCombustibile(); 
				
				String descrizioneCompletaImpianto = MapDto.decodTipoImpiantoDesc(tipoImpianto, elencoTipiImpianto) + " " + StringUtils.trimToEmpty(descrizioneImpianto);
				
				tabella.addCell(new Phrase(descrizioneCompletaImpianto, FONT_HELVETICA_8));
				tabella.addCell(new Phrase(Converter.convertToStringOrEmpty(annoInstallazione), FONT_HELVETICA_8));
								
				if (!impianto.isCodiceImpiantoCitNull()) {					
					codCatReg = codiceCatastoRegionaleImpiantiTermici.toString();
				}
				
				tabella.addCell(new Phrase(codCatReg, FONT_HELVETICA_8));
				
				String vettoreEnergetico = MapDto.decodVettoreEnergeticoDettImpiantoDesc(vettoriEnergeticiUtilizzati, elencoCombustibiliDettImpianti);
				tabella.addCell(new Phrase(vettoreEnergetico, FONT_HELVETICA_8));

				tabella.addCell(new Phrase(Converter.convertToStringOrEmpty(impianto.getPotenzaNominKw()), FONT_HELVETICA_8));				
				
			}
		}
				
		return tabella;
	}

	private PdfPTable aggiungiTabellaEfficienzaImpianti(float[] larghezzaColonne, int idSezione, SiceeRCertifServener2015 certifServener2015) {
		
		PdfPTable tabella = initializeTable(larghezzaColonne);
		tabella.setExtendLastRow(true);
		tabella.getDefaultCell().setBorder(Rectangle.BOX);
		tabella.getDefaultCell().setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		
		if (certifServener2015 == null) {
			for (int i = 0; i < 3; i++) {
				int colspan = 1;
				PdfPCell cell = new PdfPCell();
				if (i == 0) {
					colspan = 2;
				}
				cell.setColspan(colspan);
				cell.setBorder(Rectangle.BOX);
				cell.setMinimumHeight(MIN_HEIGHT_CELL);
				tabella.addCell(cell);
			}
			
			return tabella;
		}
		
		String efficienza = Converter.convertToStringOrEmpty(certifServener2015.getEfficienza());
		String epRen = Converter.convertToStringOrEmpty(certifServener2015.getEpren());
		String epNren = Converter.convertToStringOrEmpty(certifServener2015.getEpnren());
		
		Paragraph unitaEfficienzaPhrase = new Paragraph("", FONT_HELVETICA_8);
		
		Image etaSymbol = getImmagine("attestato2015/greek_eta.png");
		
		etaSymbol.scaleAbsolute(7, 13);
		int etaSymbolPositionX = -8;
		int etaSymbolPositionY = -10;
		
		switch (idSezione) {
			case Constants.SEZIONE_CLIMAINVER:
				aggiungiImmagineETesto(unitaEfficienzaPhrase, etaSymbol, " h", 0, etaSymbolPositionX, etaSymbolPositionY);
				break;
			case Constants.SEZIONE_CLIMAEST:
				aggiungiImmagineETesto(unitaEfficienzaPhrase, etaSymbol, " c", 0, etaSymbolPositionX, etaSymbolPositionY);
				break;
			case Constants.SEZIONE_ACQUACALDA:
				aggiungiImmagineETesto(unitaEfficienzaPhrase, etaSymbol, " w", 0, etaSymbolPositionX, etaSymbolPositionY);
				break;
			default:
				unitaEfficienzaPhrase = null;
				break;
		}
		
		Phrase efficienzaPhrase = new Phrase(efficienza, FONT_HELVETICA_8);
		Phrase epRenPhrase = new Phrase(epRen, FONT_HELVETICA_8);
		Phrase epNrenPhrase = new Phrase(epNren, FONT_HELVETICA_8);
		
		PdfPCell cellEfficienza = new PdfPCell(efficienzaPhrase);
		cellEfficienza.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		cellEfficienza.setPaddingLeft(PADDING_LEFT);
		
		if (unitaEfficienzaPhrase != null) {
			cellEfficienza.setBorder(Rectangle.TOP | Rectangle.LEFT | Rectangle.BOTTOM);
			tabella.addCell(cellEfficienza);
			PdfPCell cellUnitaEfficienza = new PdfPCell(unitaEfficienzaPhrase);
			cellUnitaEfficienza.setBorder(Rectangle.TOP | Rectangle.RIGHT | Rectangle.BOTTOM);
			cellUnitaEfficienza.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
			tabella.addCell(cellUnitaEfficienza);
		} else {
			cellEfficienza.setColspan(2);
			tabella.addCell(cellEfficienza);					
		}
		
		tabella.addCell(epRenPhrase);
		tabella.addCell(epNrenPhrase);
		
		return tabella;
	}
	
	private PdfPTable aggiungiLegendaQualita(String nomeImmagine, String testo) {
		PdfPTable tabella = new PdfPTable(new float[] {20, 80});
		tabella.getDefaultCell().setBorder(Rectangle.NO_BORDER);
		tabella.getDefaultCell().setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		tabella.getDefaultCell().setVerticalAlignment(Rectangle.ALIGN_MIDDLE);

		Image image = getImmagine("attestato2015/" + nomeImmagine);
		
		if (image != null) {
			image.scaleAbsolute(20, 20);			
		}
		
		tabella.addCell(image);

		tabella.addCell(new Paragraph(testo, FONT_HELVETICA_8_B));
		
		return tabella;
	}

	private PdfPCell aggiungiCellaHeaderTabellaLegendaTipoIntervento(String nomeHeader) {
		
		Paragraph headerParagraph = new Paragraph(nomeHeader, FONT_HELVETICA_8_B);
		
		PdfPCell cell = new PdfPCell(headerParagraph);
		cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
		cell.setVerticalAlignment(Rectangle.ALIGN_MIDDLE);
		cell.setPadding(5);
		cell.setBorderColor(GREEN);
		cell.setBorderWidth(BORDER_APE_TABLE_WIDTH);
		
		return cell;
	}
	
	private void aggiungiRigaTabellaLegendaTipoIntervento(PdfPTable tabella, String codice, String tipoIntervento) {
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
		
		tabella.addCell(new Paragraph(codice, FONT_HELVETICA_8_B));
		tabella.addCell(new Paragraph(tipoIntervento, FONT_HELVETICA_8));
		
		addEmptyCell(tabella, 1, Rectangle.NO_BORDER);
	}
}
