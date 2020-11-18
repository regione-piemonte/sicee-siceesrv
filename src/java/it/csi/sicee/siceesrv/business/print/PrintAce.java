/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.print;

import it.csi.sicee.siceesrv.business.facade.BaseMgr;
import it.csi.sicee.siceesrv.business.print.dto.AceDto;
import it.csi.sicee.siceesrv.business.print.dto.GenericDto;
import it.csi.sicee.siceesrv.business.siceesrv.SiceesrvImpl;
import it.csi.sicee.siceesrv.business.util.Constants;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.lowagie.text.BadElementException;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

// TODO: Auto-generated Javadoc
/**
 * The Class PrintAce.
 */
public class PrintAce {

	/**
	 * Stampa modulo.
	 *
	 * @param dati the dati
	 * @param sfondo the sfondo
	 * @param foto the foto
	 * @return the byte array input stream
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws DocumentException the document exception
	 */
	public final ByteArrayInputStream stampaModulo(GenericDto dati,
			String sfondo, byte[] foto) throws IOException, DocumentException {
		if (!(dati instanceof AceDto)) {
			throw new IllegalArgumentException("Parametro DTO errato!");
		}
		
		PdfReader reader = new PdfReader(getFilePath());
		return stampaModulo(dati, reader, sfondo, foto);
	}

	/**
	 * Gets the file path.
	 *
	 * @return the file path
	 */
	protected final InputStream getFilePath() {
		
		java.io.InputStream myPath = SiceesrvImpl.class
		.getResourceAsStream("/it/csi/sicee/siceesrv/business/facade/template/template_ace.pdf");

		return myPath;
	}
	
	/**
	 * Gets the file path.
	 *
	 * @param fileName the file name
	 * @return the file path
	 */
	protected final InputStream getFilePath(String fileName) {

		java.io.InputStream myPath = SiceesrvImpl.class
		.getResourceAsStream("/it/csi/sicee/siceesrv/business/facade/template/"+ fileName);

		return myPath;
	}

	/**
	 * Stampa modulo.
	 *
	 * @param dati the dati
	 * @param reader the reader
	 * @param sfondo the sfondo
	 * @param foto the foto
	 * @return the byte array input stream
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws DocumentException the document exception
	 */
	public ByteArrayInputStream stampaModulo(GenericDto dati,
			PdfReader reader, String sfondo, byte[] foto)
			throws IOException, DocumentException {
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PdfStamper pdfDoc = new PdfStamper(reader, baos);
		AcroFields form = pdfDoc.getAcroFields();

		AceDto dto = (AceDto) dati;

		form.setField(AceDto.COMUNE, dto.getComune());
		String indirizzo = dto.getIndirizzo();
	
		if (!BaseMgr.isNullOrEmpty(indirizzo)) {
			if (indirizzo.length() > 90) {
				indirizzo = indirizzo.substring(0, 90);
			}
		}
		
		String indirizzo1 = "";
		String indirizzo2 = "";
		String indirizzo3 = "";
		
		indirizzo1 = getLine(indirizzo, 40, ' ');
		if (indirizzo.length() > indirizzo1.length()) {
			indirizzo2 = getLine(indirizzo.substring(indirizzo1.length()), 56, ' ');
		}
		if (indirizzo.length() > indirizzo1.length() + indirizzo2.length()) {
			indirizzo3 = getLine(indirizzo.substring(indirizzo1.length() + indirizzo2.length() + 1), 56, ' ');
		}

		form.setField(AceDto.INDIRIZZO1, indirizzo1);
		form.setField(AceDto.INDIRIZZO2, indirizzo2);
		form.setField(AceDto.INDIRIZZO3, indirizzo3);
		
		form.setField(AceDto.DATI_CAT_SEZ, dto.getDatiCatSez());
		form.setField(AceDto.DATI_CAT_F, dto.getDatiCatF());
		form.setField(AceDto.DATI_CAT_N, dto.getDatiCatN());
		form.setField(AceDto.DATI_CAT_SUB, dto.getDatiCatSub());
		form.setField(AceDto.PIANO_N, dto.getPianoN());
		form.setField(AceDto.PIANO_DI, dto.getPianoDi());
		form.setField(AceDto.PROGETTISTA, dto.getProgettista());
		form.setField(AceDto.DIRETTORE_LAVORI, dto.getDirettoreLavori());
		form.setField(AceDto.COSTRUTTORE, dto.getCostruttore());
		form.setField(AceDto.DESTINAZIONE_USO, dto.getDestinazioneUso());
		form.setField(AceDto.ANNO_COSTRUZIONE, dto.getAnnoCostruzione());
		form.setField(AceDto.TIPOLOGIA_EDIFICIO, dto.getDescrizioneEdificio());
		form.setField(AceDto.VOLUME_LORDO_RISCALDATO,
				dto.getVolumeLordoRiscaldato());
		form.setField(AceDto.SUPERF_DISP_TOTALE, dto.getSuperfDispTotale());
		form.setField(AceDto.FATTORE_FORMA, dto.getFattoreForma());
		form.setField(AceDto.TRASM_MED_SUP_OP, dto.getTrasmMedSupOp());
		form.setField(AceDto.TRASM_MED_SUP_TRASP, dto.getTrasmMedSupTrasp());
		form.setField(AceDto.TIPOL_IMP_RISC, dto.getTipolImpRisc());
		form.setField(AceDto.COMBUSTIBILE_RISC, dto.getCombustibileRisc());
		form.setField(AceDto.COMBUSTIBILE_ACQUA_CALDA_SAN,
				dto.getCombustibileAcquaCaldaSan());
		form.setField(AceDto.SUP_UTILE_SU_M_CUBI, dto.getSupUtileSumCubi());
		form.setField(AceDto.ZONA_CLIM_GRADI_GIORNO,
				dto.getZonaClimGradiGiorno());
		form.setField(AceDto.QH, dto.getQh());

		form.setField(AceDto.QH_W, dto.getQhW());

		
		form.setField(AceDto.INDICE_PREST_EN_REALE, dto.getIndicePrestazioneEnergeticaGlobale());

		// BEPPE 17/01/12
		//form.setField(AceDto.INDICE_PREST_EN_GLOB, dto.getIndicePrestEnGlob());

		
		
		
		
		form.setField(AceDto.QUOTA_EN_COP_F_RIN, dto.getQuotaEnCopFRin());

		form.setField(AceDto.ETTARI_BOSCO, dto.getEttariBosco());
		form.setField(AceDto.EMISSIONI_GAS_SERRA, dto.getEmissioniGasSerra());
		form.setField(AceDto.EDIFICIO_INTERVENTO_1,
				dto.getEdificioIntervento1());
		form.setField(AceDto.EDIFICIO_INTERVENTO_2,
				dto.getEdificioIntervento2());
		form.setField(AceDto.EDIFICIO_INTERVENTO_3,
				dto.getEdificioIntervento3());
		form.setField(AceDto.EDIFICIO_INTERVENTO_4,
				dto.getEdificioIntervento4());
		form.setField(AceDto.EDIFICIO_PRIORITA_1, dto.getEdificioPriorita1());
		form.setField(AceDto.EDIFICIO_PRIORITA_2, dto.getEdificioPriorita2());
		form.setField(AceDto.EDIFICIO_PRIORITA_3, dto.getEdificioPriorita3());
		form.setField(AceDto.EDIFICIO_PRIORITA_4, dto.getEdificioPriorita4());
		form.setField(AceDto.EDIFICIO_TEMPO_RIT_1, dto.getEdificioTempoRit1());
		form.setField(AceDto.EDIFICIO_TEMPO_RIT_2, dto.getEdificioTempoRit2());
		form.setField(AceDto.EDIFICIO_TEMPO_RIT_3, dto.getEdificioTempoRit3());
		form.setField(AceDto.EDIFICIO_TEMPO_RIT_4, dto.getEdificioTempoRit4());
		form.setField(AceDto.IMPIANTO_INTERVENTO_1,
				dto.getImpiantoIntervento1());
		form.setField(AceDto.IMPIANTO_INTERVENTO_2,
				dto.getImpiantoIntervento2());
		form.setField(AceDto.IMPIANTO_INTERVENTO_3,
				dto.getImpiantoIntervento3());
		form.setField(AceDto.IMPIANTO_INTERVENTO_4,
				dto.getImpiantoIntervento4());
		form.setField(AceDto.IMPIANTO_PRIORITA_1, dto.getImpiantoPriorita1());
		form.setField(AceDto.IMPIANTO_PRIORITA_2, dto.getImpiantoPriorita2());
		form.setField(AceDto.IMPIANTO_PRIORITA_3, dto.getImpiantoPriorita3());
		form.setField(AceDto.IMPIANTO_PRIORITA_4, dto.getImpiantoPriorita4());
		form.setField(AceDto.IMPIANTO_TEMPO_RIT_1, dto.getImpiantoTempoRit1());
		form.setField(AceDto.IMPIANTO_TEMPO_RIT_2, dto.getImpiantoTempoRit2());
		form.setField(AceDto.IMPIANTO_TEMPO_RIT_3, dto.getImpiantoTempoRit3());
		form.setField(AceDto.IMPIANTO_TEMPO_RIT_4, dto.getImpiantoTempoRit4());
		form.setField(AceDto.N_CERTIFICATO, dto.getNCertificato());
		form.setField(AceDto.DATA_SCADENZA, dto.getDataScadenza());
		form.setField(AceDto.N_CERTIFICATO_A, dto.getNCertificatoA());
		form.setField(AceDto.CLASSE_EN_GLOB_NAZ_EDIF,
				dto.getClasseEnGlobNazEdif());
		form.setField(AceDto.PREST_ENER_RAGG, dto.getPrestEnerRagg());

		form.setField(AceDto.PREST_RISC, dto.getPrestRisc());
		form.setField(AceDto.LIMITE_NORM_NAZ_RISC, dto.getLimiteNormNazRisc());
		form.setField(AceDto.QUALITA_INV_RAFFRESC, dto.getQualitaInvRaffresc());
		form.setField(AceDto.RENDIMENTO_MED_GLOB_STAG_IMP,
				dto.getRendimentoMedGlobStagImp());
		form.setField(AceDto.LIMITE_NORM_REND_MED_GLOB,
				dto.getLimiteNormRendMedGlob());
		form.setField(AceDto.VALORE_PREST_EN_POM_CAL,
				dto.getValorePrestEnPomCal());
		form.setField(AceDto.LIMITE_NORM_PREST_EN_POM_CAL,
				dto.getLimiteNormPrestEnPomCal());
		form.setField(AceDto.MOTIVO_RIL_ATTEST, dto.getMotivoRilAttest());
		form.setField(AceDto.DATA_TIT_ABIT_COSTR, dto.getDataTitAbitCostr());
		form.setField(AceDto.N_DECRETO_LGS, dto.getNDecretoLgs());
		if (!BaseMgr.isNullOrEmpty(dto.getComboDecretoLgs())) {
			form.setField(AceDto.DECRETO_LGS_S_N, dto.getComboDecretoLgs());
		}
		form.setField(AceDto.NOME_CERTIFICATORE, dto.getNomeCertificatore());
		form.setField(AceDto.LUOGO_NASCITA_CERTIFICATORE,
				dto.getLuogoNascitaCertificatore());
		form.setField(AceDto.DATA_NASCITA_CERTIFICATORE,
				dto.getDataNascitaCertificatore());
		form.setField(AceDto.LUOGO_RESIDENZA_CERTIFICATORE,
				dto.getLuogoResidenzaCertificatore());
		form.setField(AceDto.CF_CERTIFICATORE, dto.getCfCertificatore());
		form.setField(AceDto.LUOGO_COMPILAZIONE, dto.getLuogoCompilazione());
		form.setField(AceDto.DATA_COMPILAZIONE, dto.getDataCompilazione());
		form.setField(AceDto.FIRMA_CERTIFICATORE, dto.getFirmaCertificatore());
		if (!BaseMgr.isNullOrEmpty(dto.getRadioCertificazione())) {
			form.setField(AceDto.RADIO_CERTIFICAZIONE, dto.getRadioCertificazione());
		}	

		form.setField(AceDto.LIMITE_DI_LEGGE, dto.getLimiteDiLegge());
		form.setField(AceDto.EDIFICIO_PERFORMANTE, dto.getEdificioPerformante());

		/*
		 * form.setField(AceDto.LIMITE_LEGGE, dto.getLimiteLegge());
		 * form.setField(AceDto.CLASSE_ENERGETICA, dto.getClasseEnergetica());
		 */
		int n = reader.getNumberOfPages();
		int i = 0;
		PdfContentByte over = null;
		if (!BaseMgr.isNullOrEmpty(sfondo)) {
			BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA,
					BaseFont.WINANSI, BaseFont.EMBEDDED);
			while (i < n) {
				i++;
				// text over the existing page
				over = pdfDoc.getOverContent(i);
				over.beginText();
				over.setFontAndSize(bf, 32);
				over.showTextAligned(Element.ALIGN_LEFT, sfondo, 230, 430,
						45);
				over.endText();
			}
		}

		pdfDoc.setFormFlattening(true);

		// ***inserisco eventuale foto dell'edificio
		// ***la dimensione deve essere width=216, height=85

		if (foto != null && foto.length > 0) {
			inserisciImmagineHome(foto, pdfDoc, false);
		}

		// ***immagine della classe energetica

		// ***immagine della classe energetica linea
		
		if (dto.getClasseEnergeticaLinea() != null) {
			InputStream immClasseEnLinea = returnImgEnLinea(
					dto.getClasseEnergeticaLinea());
			float x = returnXenLinea(dto.getClasseEnergeticaLinea());
			float y = returnYenLinea(dto.getClasseEnergeticaLinea());
			inserisciImmagine(immClasseEnLinea, pdfDoc, x, y, false);
		}

		if (dto.getClasseEnergetica() != null) {
			InputStream immClasseEn = returnImgEn(dto.getClasseEnergetica());
			float x = returnXen(dto.getClasseEnergetica());
			float y = returnYen(dto.getClasseEnergetica());
			inserisciImmagine(immClasseEn, pdfDoc, x, y, false);
		}
		

		// ***immagine del Qh
		if (dto.getQuozienteQh() != null) {
			InputStream imgQh = getFilePath("tratto.gif");
			float x = returnXqh(dto.getQuozienteQh());
			float y = new Float(446.5);
			inserisciImmagine(imgQh, pdfDoc, x, y, true);
		}

		// ***immagine del Qhw
		if (dto.getQuozienteQhw() != null) {
			InputStream imgQh = getFilePath("tratto.gif");
			float x = returnXqhw(dto.getQuozienteQhw());
			float y = new Float(371.8);
			inserisciImmagine(imgQh, pdfDoc, x, y, true);
		}

		// ***immagine del limite di legge
		if (dto.getLimiteLegge() != null) {
			InputStream imgQh = getFilePath("limite_legge.gif");
			float x = returnXlimiteLegge(dto.getLimiteLegge());
			float y = new Float(425);
			inserisciImmagine(imgQh, pdfDoc, x, y, false);
		}

		// ***immagine del quoziente emissione gas serra
		if (dto.getQuozienteEmissioneGasSerra() != null) {
			InputStream imgQh = getFilePath("tratto_grande.gif");
			float x = returnXGasSerra(dto.getQuozienteEmissioneGasSerra());
			float y = new Float(293.2);
			inserisciImmagine(imgQh, pdfDoc, x, y, false);
		}

		pdfDoc.close();

		// png.setAbsolutePosition(171, 250);

		return new ByteArrayInputStream(baos.toByteArray());
	}
	
	/**
	 * Gets the line.
	 *
	 * @param stringToSplit the string to split
	 * @param length the length
	 * @param separator the separator
	 * @return the line
	 */
	private String getLine(String stringToSplit, int length, char separator) {
		
		if (stringToSplit.length() <= length)
			return stringToSplit;
		
			int index = length - 1;
	
			while (stringToSplit.charAt(index) != separator) {
				index--;
			}
			return stringToSplit.substring(0, index).trim();
	} 

	/**
	 * Return xqh.
	 *
	 * @param qh the qh
	 * @return the float
	 */
	private float returnXqh(Float qh) {
		float xStart = 75;
		float xEnd = 277;

		float coef = (xEnd - xStart) / 100;

		return xStart + (qh * coef);
	}

	/**
	 * Return xqhw.
	 *
	 * @param qh the qh
	 * @return the float
	 */
	private float returnXqhw(Float qh) {
		float xStart = 74;
		float xEnd = 276;

		float coef = (xEnd - xStart) / 100;

		return xStart + (qh * coef);
	}

	/**
	 * Return xlimite legge.
	 *
	 * @param qh the qh
	 * @return the float
	 */
	private float returnXlimiteLegge(Float qh) {
		float xStart = 16;
		float xEnd = 223;

		float coef = (xEnd - xStart) / 100;

		return xStart + (qh * coef);
	}

	/**
	 * Return x gas serra.
	 *
	 * @param qh the qh
	 * @return the float
	 */
	private float returnXGasSerra(Float qh) {
		float xStart = 84;
		float xEnd = 497;

		float coef = (xEnd - xStart) / 100;

		return xStart + (qh * coef);
	}

	/**
	 * Return yen.
	 *
	 * @param classeEnergetica the classe energetica
	 * @return the float
	 */
	private float returnYen(String classeEnergetica) {
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A_PIU)) {
			return 550;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A)) {
			return 538;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_B)) {
			return 520;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_C)) {
			return 505;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_D)) {
			return 486;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_E)) {
			return 469;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_F)) {
			return 452;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_G)) {
			return 436;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_NC)) {
			return 419;
		}
		return 0;
	}

	/**
	 * Return yen linea.
	 *
	 * @param classeEnergetica the classe energetica
	 * @return the float
	 */
	private float returnYenLinea(String classeEnergetica) {
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A_PIU)) {
			return 565;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A)) {
			return 548;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_B)) {
			return 530;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_C)) {
			return 515;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_D)) {
			return 496;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_E)) {
			return 479;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_F)) {
			return 462;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_G)) {
			return 446;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_NC)) {
			return 429;
		}
		return 0;
	}

	/**
	 * Return xen.
	 *
	 * @param classeEnergetica the classe energetica
	 * @return the float
	 */
	private float returnXen(String classeEnergetica) {
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A_PIU)) {
			return 365;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A)) {
			return 370;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_B)) {
			return 375;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_C)) {
			return 383;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_D)) {
			return 395;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_E)) {
			return 411;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_F)) {
			return 422;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_G)) {
			return 430;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_NC)) {
			return 434;
		}
		return 0;
	}

	/**
	 * Return xen linea.
	 *
	 * @param classeEnergetica the classe energetica
	 * @return the float
	 */
	private float returnXenLinea(String classeEnergetica) {
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A_PIU)) {
			return 365;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A)) {
			return 370;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_B)) {
			return 365;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_C)) {
			return 379;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_D)) {
			return 390;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_E)) {
			return 406;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_F)) {
			return 422;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_G)) {
			return 425;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_NC)) {
			return 434;
		}
		return 0;
	}

	/**
	 * Return img en.
	 *
	 * @param classeEnergetica the classe energetica
	 * @return the input stream
	 */
	private InputStream returnImgEn(String classeEnergetica) {
		InputStream is = null;
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A_PIU)) {
			is = getFilePath("classe_energ_a_piu.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A)) {
			is = getFilePath("classe_energ_a.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_B)) {
			is = getFilePath("classe_energ_b.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_C)) {
			is = getFilePath("classe_energ_c.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_D)) {
			is = getFilePath("classe_energ_d.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_E)) {
			is = getFilePath("classe_energ_e.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_F)) {
			is = getFilePath("classe_energ_f.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_G)) {
			is = getFilePath("classe_energ_g.png");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_NC)) {
			is = getFilePath("classe_energ_nc.png");
			return is;
		}

		return null;
	}

	/**
	 * Return img en linea.
	 *
	 * @param classeEnergetica the classe energetica
	 * @return the input stream
	 */
	private InputStream returnImgEnLinea(String classeEnergetica) {
		InputStream is = null;
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A_PIU)) {
			is = getFilePath("classe_energ_a_piu_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_A)) {
			is = getFilePath("classe_energ_a_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_B)) {
			is = getFilePath("classe_energ_b_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_C)) {
			is = getFilePath("classe_energ_c_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_D)) {
			is = getFilePath("classe_energ_d_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_E)) {
			is = getFilePath("classe_energ_e_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_F)) {
			is = getFilePath("classe_energ_f_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_G)) {
			is = getFilePath("classe_energ_g_linea.gif");
			return is;
		}
		if (classeEnergetica.equalsIgnoreCase(AceDto.CLASSE_ENERGETICA_NC)) {
			is = getFilePath("classe_energ_nc_linea.gif");
			return is;
		}

		return null;
	}

	/**
	 * Inserisci immagine.
	 *
	 * @param is the is
	 * @param pdfDoc the pdf doc
	 * @param x the x
	 * @param y the y
	 * @param trasparenza the trasparenza
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws BadElementException the bad element exception
	 * @throws MalformedURLException the malformed url exception
	 * @throws DocumentException the document exception
	 */
	private void inserisciImmagine(InputStream is, PdfStamper pdfDoc, float x,
			float y, boolean trasparenza) throws IOException,
			BadElementException, MalformedURLException, DocumentException {
		if (is == null) {
			return;
		}

		int c;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		while ((c = is.read()) != -1) {
			bout.write(c);
		}

		Image img = Image.getInstance(bout.toByteArray());

		img.setAbsolutePosition(x, y);

		if (trasparenza) {
			byte gradient[] = new byte[256];
			for (int k = 0; k < 256; ++k) {
				gradient[k] = (byte) 150;
			}
			Image smask = Image.getInstance(256, 1, 1, 8, gradient);
			smask.makeMask();
			img.setImageMask(smask);
		}

		PdfContentByte over = pdfDoc.getOverContent(1);
		over.addImage(img);
	}

	/**
	 * Inserisci immagine home.
	 *
	 * @param foto the foto
	 * @param pdfDoc the pdf doc
	 * @param trasparenza the trasparenza
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws BadElementException the bad element exception
	 * @throws MalformedURLException the malformed url exception
	 * @throws DocumentException the document exception
	 */
	private void inserisciImmagineHome(byte[] foto, PdfStamper pdfDoc,
			boolean trasparenza) throws IOException, BadElementException,
			MalformedURLException, DocumentException {
		if (foto == null || foto.length == 0) {
			return;
		}

		// Questa parte non dovrebbe essere pi� usata
		//byte[] bytes = IOUtils.toByteArray(is);
		Image img = Image.getInstance(foto); 

		/*
		ByteArrayInputStream prova = new ByteArrayInputStream(foto);

		BufferedImage ioBf = ImageIO.read(prova);

		if (ioBf == null)
			return;

		Image img = Image.getInstance(ioBf, null, false);
		 */

				img.scaleToFit(Constants.IMAGE_HOME_WIDTH, Constants.IMAGE_HOME_HEIGHT);

		float w = img.scaledWidth();

		float x = Constants.IMAGE_HOME_CENTER_X - (((int) w ) >> 1);		

		img.setAbsolutePosition(x, Constants.IMAGE_HOME_Y);

		if (trasparenza) {
			byte gradient[] = new byte[256];
			for (int k = 0; k < 256; ++k) {
				gradient[k] = (byte) 150;
			}
			Image smask = Image.getInstance(256, 1, 1, 8, gradient);
			smask.makeMask();
			img.setImageMask(smask);
		}

		PdfContentByte over = pdfDoc.getOverContent(1);

		over.addImage(img);
	}


	/*
	@Override
	public String getTemplateFilename() {
		return "template_ace.pdf";
	}

	@Override
	public boolean checkGenericDto(GenericDto dati) {
		return dati instanceof AceDto;
	}
*/
}
