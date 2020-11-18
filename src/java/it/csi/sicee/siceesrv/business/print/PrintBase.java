/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print;

import java.awt.Color;
import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

import it.csi.sicee.siceesrv.business.facade.CertificatoMgr;
import it.csi.sicee.siceesrv.business.facade.CertificatoreMgr;
import it.csi.sicee.siceesrv.business.facade.UtilMgr;
import it.csi.sicee.siceesrv.business.siceesrv.SiceesrvImpl;
import it.csi.sicee.siceesrv.business.siceesrv.spring.SpringBeanLocator;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.sicee.siceesrv.business.util.Converter;

public class PrintBase {
	
	public static final Logger log = Logger.getLogger(Constants.APPLICATION_CODE + ".business.pdf");
	
	private static final String IMG_PATH = "/it/csi/sicee/siceesrv/business/facade/template/";
	private static String FONT_PATH = "/it/csi/sicee/siceesrv/business/facade/template/font/";

	public static float PADDING_LEFT=10f; //Margine Sx
	 
	public static Color LIGHT_GRAY = new Color(204, 204, 204);
	public static Color DARK_GREEN = new Color(51, 105, 0);
	public static Color GREEN = new Color(173, 194, 153);
	public static Color BACKGROUND_GREEN = new Color(173, 194, 153);
	public static Color HEADER_START_COLOR = new Color(22, 183, 92);
	public static Color HEADER_END_COLOR = new Color(211, 42, 0);
	
	public static Font FONT_HELVETICA_15_B = new Font(Font.HELVETICA, 15, Font.BOLD);
	public static Font FONT_HELVETICA_13_B = new Font(Font.HELVETICA, 13, Font.BOLD);
	public static Font FONT_HELVETICA_12_B = new Font(Font.HELVETICA, 12, Font.BOLD);
	public static Font FONT_HELVETICA_11_B = new Font(Font.HELVETICA, 11, Font.BOLD);
	public static Font FONT_HELVETICA_10_B = new Font(Font.HELVETICA, 10, Font.BOLD);
	public static Font FONT_HELVETICA_9_B = new Font(Font.HELVETICA, 9, Font.BOLD);
	public static Font FONT_HELVETICA_9_I = new Font(Font.HELVETICA, 9, Font.ITALIC);
	public static Font FONT_HELVETICA_9_B_I = new Font(Font.HELVETICA, 9, Font.BOLD | Font.ITALIC);
	public static Font FONT_HELVETICA_9_B_S = new Font(Font.HELVETICA, 9, Font.BOLD | Font.UNDERLINE);
	public static Font FONT_HELVETICA_9_GREEN = new Font(Font.HELVETICA, 9, Font.NORMAL, DARK_GREEN);
	public static Font FONT_HELVETICA_8 = new Font(Font.HELVETICA, 8);
	public static Font FONT_HELVETICA_8_B = new Font(Font.HELVETICA, 8, Font.BOLD);
	public static Font FONT_HELVETICA_8_I = new Font(Font.HELVETICA, 8, Font.ITALIC);
	public static Font FONT_HELVETICA_8_B_I = new Font(Font.HELVETICA, 8, Font.BOLD | Font.ITALIC);
	public static Font FONT_HELVETICA_8_B_GREEN = new Font(Font.HELVETICA, 8, Font.BOLD, DARK_GREEN);
	public static Font FONT_HELVETICA_7 = new Font(Font.HELVETICA, 7);
	public static Font FONT_HELVETICA_7_B = new Font(Font.HELVETICA, 7, Font.BOLD);
	public static Font FONT_HELVETICA_6 = new Font(Font.HELVETICA, 6);
	public static Font FONT_HELVETICA_6_B = new Font(Font.HELVETICA, 6, Font.BOLD);
	public static Font FONT_HELVETICA_6_I = new Font(Font.HELVETICA, 6, Font.ITALIC);
	public static Font FONT_HELVETICA_6_GRAY = new Font(Font.HELVETICA, 6, Font.NORMAL, Color.LIGHT_GRAY);
	public static Font FONT_HELVETICA_190_GRAY = new Font(Font.HELVETICA, 190, Font.NORMAL, Color.LIGHT_GRAY);
	public static Font FONT_HELVETICA_7_B_WHITE = new Font(Font.HELVETICA, 7, Font.BOLD, Color.white);
	public static Font FONT_HELVETICA_8_B_WHITE = new Font(Font.HELVETICA, 8, Font.BOLD, Color.white);
	public static Font FONT_HELVETICA_8_WHITE = new Font(Font.HELVETICA, 8, Font.NORMAL, Color.white);
	public static Font FONT_HELVETICA_10_B_WHITE = new Font(Font.HELVETICA, 10, Font.BOLD, Color.white);
	
	public static String CODE_ETA = "\u03B7";
	 
	public static String IMG_LOGO_NAME = "logo.jpg";
	public static String IMG_CHECK_NAME_SI = "check_si.png";
	public static String IMG_CHECK_NAME_NO = "check_no.png";
	 
	public static Image IMG_CHECK_SI = null;
	public static Image IMG_CHECK_NO = null;
	public static Image IMG_LOGO = null;
	 
	public static int MIN_SPAZIO_NON_PRESENTE = 0;
	 
	public static String VAR = "XXXXXXX";
	public static String DATO_NON_PRESENTE = " ";
		
	public static String getDataCompleta() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
		return sdf.format(new Date());
	}
		
	public static Document creaDocumentoApe() {
		 Document document = new Document(PageSize.A4, 17, 17, 100, 30);
		 
		 caricaImmaginiCheck();
		 
		 return document;
	 }
	
	public static Document creaDocumentoTarghettaApe() {
		 Document document = new Document(PageSize.A4, 10, 10, 10, 10);
		 
		 caricaImmaginiCheck();
		 
		 return document;
	 }

	public static void caricaImmaginiCheck() {
		 IMG_CHECK_SI = getImmagineCheck(IMG_CHECK_NAME_SI);
		 IMG_CHECK_NO = getImmagineCheck(IMG_CHECK_NAME_NO);
	}
	
	public static Chunk getFontSymbol(String symbol, int fontSize) {
		Chunk chunk = null;
		try{ 
			URL font = SiceesrvImpl.class.getResource(FONT_PATH + "FreeSans.ttf");
			Font f = FontFactory.getFont(font.toString(), BaseFont.IDENTITY_H, true);
			f.setSize(fontSize);
			chunk = new Chunk(symbol, f);
		}catch(Exception e){  
			System.out.println("Font mancante");
		}	
		return chunk;	 
	}
	
	public static Image getImmagine(String imgName) {
		 Image image = null;
		 try{ 
			 
			 log.debug("Cerco l'immagine: "+imgName);
			
		     URL imgURL = SiceesrvImpl.class.getResource(IMG_PATH + imgName);
							
			 image = Image.getInstance(imgURL);

			 log.debug("Stampo image: "+image);
		 } catch(Exception e){  
			 System.out.println("Immagine " + imgName + " mancante");
		 }	
		 return image;	 
	 }
	
	public static Image getImmagineCheck(String imgName) {
		return getImmagineCheck(imgName, 6f, 6f);
	}
	
	public static Image getImmagineCheck(String imgName, float checkWidth, float checkHeight) {
		Image image = null;
		try{ 
			log.debug("Cerco l'immagine check");
			
			image = getImmagine(imgName);
			
			log.debug("Cerco l'immagine check - TROVATA");
			
			image.scaleAbsolute(checkWidth, checkHeight); 
		}catch(Exception e){  
			System.out.println("Immagine " + imgName + " mancante");
		}	
		return image;	 
	}
	
	public static void aggiungiCheck(Paragraph paragraph, boolean isSelezionato, float checkWidth, float checkHeight, float positionx, float positiony) {
		if (isSelezionato)
		 {
			
			 paragraph.add(new Chunk(getImmagineCheck(IMG_CHECK_NAME_SI, checkHeight, checkHeight), positionx, positiony, true));
		 }
		 else
		 {
			 paragraph.add(new Chunk(getImmagineCheck(IMG_CHECK_NAME_NO, checkHeight, checkHeight), positionx, positiony, true));
		 }
	}
	
	public static void aggiungiCheck(Paragraph paragraph, boolean isSelezionato) {
		 if (isSelezionato)
		 {
			 paragraph.add(new Chunk(IMG_CHECK_SI, 0, 0,true));
		 }
		 else
		 {
			 paragraph.add(new Chunk(IMG_CHECK_NO, 0, 0,true));
		 }
	}
	
	 public static void aggiungiCheckSi(Paragraph paragraph, boolean isSelezionato) {
		 aggiungiCheck(paragraph, isSelezionato);
		 paragraph.add(" Si  ");
	}

	 public static void aggiungiCheckNo(Paragraph paragraph, boolean isSelezionato) {
		 aggiungiCheck(paragraph, isSelezionato);
		 paragraph.add(" No  ");
	}

	 public static void aggiungiCheckPrimaOld(Paragraph paragraph, String nomeCheck, boolean isSelezionato) {
		 aggiungiCheck(paragraph, isSelezionato);
		 paragraph.add(" "+nomeCheck+"  ");
	}


	 public static void aggiungiCheckPrima(Paragraph paragraph, String nomeCheck, boolean isSelezionato) {
		 aggiungiCheckPrima(paragraph, nomeCheck, isSelezionato, MIN_SPAZIO_NON_PRESENTE);

	 }
	 
	 public static void aggiungiCheckPrima(Paragraph paragraph, String nomeCheck, boolean isSelezionato, int minSpazio) {
		 aggiungiCheck(paragraph, isSelezionato);

		 paragraph.add(" "+nomeCheck);
		 
		 aggiungiSpaziVuoti(paragraph, nomeCheck, minSpazio);
	}
	 
	 public static void aggiungiCheckDopoOld(Paragraph paragraph, String nomeCheck, boolean isSelezionato) {
		 aggiungiCheck(paragraph, isSelezionato);
		 paragraph.add(" "+nomeCheck+"  ");
	}
	 
	 public static void aggiungiCheckDopo(Paragraph paragraph, String nomeCheck, boolean isSelezionato) {
		 
		 aggiungiCheckDopo(paragraph, nomeCheck, isSelezionato, MIN_SPAZIO_NON_PRESENTE);
			 
	 }
	 
	 public static void aggiungiCheckDopo(Paragraph paragraph, String nomeCheck, boolean isSelezionato, int minSpazio) {
		 
		 paragraph.add(nomeCheck+" ");
		 
		 aggiungiCheck(paragraph, isSelezionato);
		 
		 aggiungiSpaziVuoti(paragraph, nomeCheck, minSpazio);
	 }
	 
	 public static void aggiungiImmagineETesto(Paragraph paragraph, Image image, String testo, int minSpazio, float imgPositionX, float imgPositionY) {
		 try {
			 Chunk chunk = new Chunk(image, imgPositionX, imgPositionY);
			 paragraph.add(chunk);	 
			 aggiungiSpaziVuoti(paragraph, 5);
		 } catch(Exception e) {
			 System.out.println("Immagine non presente");
		 }
		 
		 paragraph.add(testo);
		 
		 aggiungiSpaziVuoti(paragraph, testo, minSpazio);
	 }
	 public static void aggiungiImmagineETesto(Paragraph paragraph, Image image, String testo, int minSpazio) {
		 aggiungiImmagineETesto(paragraph, image, testo, minSpazio, 5, -2);
	 }
	 
	 public static void aggiungiImmagineETesto(Paragraph paragraph, Image image, String testo) {
		 aggiungiImmagineETesto(paragraph, image, testo, 0, 5, -2);
	 }
	 
	 public static void aggiungiCheckboxPrimaConImmagine(Paragraph paragraph, String nomeCheck, Image image, boolean isSelezionato, int minSpazio) {
		 aggiungiCheck(paragraph, isSelezionato);
		 
		 aggiungiImmagineETesto(paragraph, image, nomeCheck, minSpazio);
	 }
	 
	 public static void aggiungiCheckboxPrimaConImmagine(Paragraph paragraph, String nomeCheck, Image image, boolean isSelezionato) {
		 aggiungiCheckboxPrimaConImmagine(paragraph,nomeCheck, image, isSelezionato, 0);
	 }

	 public static void aggiungiMinMedMaxFormat(Paragraph paragraph, BigDecimal min, BigDecimal med, BigDecimal max) {

		 System.out.println("aggiungiMinMedMaxFormat - min: "+min);
		 System.out.println("aggiungiMinMedMaxFormat - med: "+med);
		 System.out.println("aggiungiMinMedMaxFormat - max: "+max);
		 
		 aggiungiTesto(paragraph, Converter.convertToStringOrEmpty(min), 1);
		 paragraph.add(File.pathSeparator);

		 aggiungiTesto(paragraph, Converter.convertToStringOrEmpty(med), 1);
		 paragraph.add(File.pathSeparator);

		 aggiungiTesto(paragraph, Converter.convertToStringOrEmpty(max), 1);
	 }
		 
	 public static void aggiungiTesto(Phrase phrase, String testo, int minSpazio, Font font) {

		 gestDebug(true, "Stampo il testo: "+testo);
		 
		 phrase.add(new Chunk(testo, font));

		 aggiungiSpaziVuoti(phrase, testo, minSpazio);
	 }
	 
	 public static void aggiungiSpazioETesto(Phrase phrase, String testo, int minSpazio, Font font) {
		 gestDebug(true, "Stampo il testo: "+testo);
		 
		 aggiungiSpaziVuoti(phrase, testo, minSpazio);
		 
		 phrase.add(new Chunk(testo, font));
	 }
	 
	 public static void aggiungiTesto(Paragraph paragraph, String testo, int minSpazio) {

		 paragraph.add(testo);

		 aggiungiSpaziVuoti(paragraph, testo, minSpazio);
	 }
	 
	 public static void aggiungiSpazioETesto(Paragraph paragraph, String testo, int minSpazio) {
		 
		 gestDebug(true, "Stampo il testo: "+testo);
		 
		 aggiungiSpaziVuoti(paragraph, testo, minSpazio);
		 
		 paragraph.add(testo);
	 }

	 public static void aggiungiSpaziVuoti(Phrase phrase, String testo, int minSpazio) {

		 testo = StringUtils.trimToEmpty(testo);
		 
		 if (minSpazio != MIN_SPAZIO_NON_PRESENTE && testo.length() < minSpazio)
		 {
			 StringBuffer sb = new StringBuffer();

			 for (int i = testo.length(); i < minSpazio; i++) {
				 
				 sb.append(" ");
			 }

			 gestDebug(true, "Stampo il testo: *"+sb+"*");
			 
			 phrase.add(sb.toString());

		 }
		 

	 }
	 
	 public static void aggiungiSpaziVuoti(Paragraph paragraph, String testo, int minSpazio) {

		 testo = StringUtils.trimToEmpty(testo);
		 
		 if (minSpazio != MIN_SPAZIO_NON_PRESENTE && testo.length() < minSpazio)
		 {
			 StringBuffer sb = new StringBuffer();

			 for (int i = testo.length(); i < minSpazio; i++) {
				 
				 sb.append(" ");
			 }

			 paragraph.add(sb.toString());

		 }
		 

	 }
	 
	 public static void aggiungiSpaziVuoti(Paragraph paragraph, int minSpazio) {

		 if (minSpazio != MIN_SPAZIO_NON_PRESENTE)
		 {
			 StringBuffer sb = new StringBuffer();

			 for (int i = 0; i < minSpazio; i++) {
				 
				 sb.append(" ");
			 }

			 paragraph.add(sb.toString());

		 }
		 

	 }
	 
	 public static void aggiungiSpaziVuoti(Phrase phrase, int minSpazio) {

		 if (minSpazio != MIN_SPAZIO_NON_PRESENTE)
		 {
			 StringBuffer sb = new StringBuffer();

			 for (int i = 0; i < minSpazio; i++) {
				 
				 sb.append(" ");
			 }

			 phrase.add(sb.toString());

		 }
		 

	 }

	 public static void aggiungiPuntini(Paragraph paragraph, int minSpazio) {

		 if (minSpazio != MIN_SPAZIO_NON_PRESENTE)
		 {
			 StringBuffer sb = new StringBuffer();

			 for (int i = 0; i < minSpazio; i++) {
				 
				 sb.append(".");
			 }

			 paragraph.add(sb.toString());

		 }
		 

	 }

	 
	 public static void aggiungiLineaVuota(Paragraph paragraph, int number) {
		 for (int i = 0; i < number; i++) {
			 paragraph.add(new Paragraph(" "));
		 }
	 }

	 public static String getSiNoLabel(String flag) {
		String label = Constants.LABEL_NO.toUpperCase();
		
		if (flag != null && flag.equals(Constants.SI)) {
			label = Constants.LABEL_SI.toUpperCase();
		}
		
		return label;
	 }
	 
	 public static void gestDebug(boolean isSimulazione, String message)
	 {
		 if (!isSimulazione)
		 {
			 log.debug(message);
		 }
		 else
		 {
			 System.out.println(message);
			 
		 }
	 }
	 
	 public static void gestError(boolean isSimulazione, String message, Throwable e)
	 {
		 if (!isSimulazione)
		 {
			 log.error(message, e);
		 }
		 else
		 {
			 System.err.println("Exception: " + e);
			 e.printStackTrace();

		 }
	 }
	 
	 public PdfPTable initializeTable(float[] columWidths) {
		 
		PdfPTable tabella = new PdfPTable(columWidths);
			//Definisco la tabella con il 100%, il bordo,e il margine sinis
		tabella.setSpacingBefore(8);      

		tabella.setWidthPercentage(100); 
		tabella.getDefaultCell().setBorder(1);

		tabella.getDefaultCell().setPaddingLeft(PADDING_LEFT);
		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			
		return tabella;
			
	 }
	 
	 public PdfPTable initializeTable(int columnsNumber) {
		 
		PdfPTable tabella = new PdfPTable(columnsNumber);
			//Definisco la tabella con il 100%, il bordo,e il margine sinis
		tabella.setSpacingBefore(8);      
	
		tabella.setWidthPercentage(100); 
		tabella.getDefaultCell().setBorder(1);
	
		tabella.getDefaultCell().setPaddingLeft(PADDING_LEFT);
		tabella.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			
		return tabella;
			
	 }
	 
	 public PdfPTable addEmptyCell(PdfPTable tabella, int colNumber, int border, Color backgroundColor) {
		PdfPCell cell = new PdfPCell(new Paragraph());
		cell.setBorder(border);
		cell.setColspan(colNumber);
		if (backgroundColor != null) {
			cell.setBackgroundColor(backgroundColor);
		}
		tabella.addCell(cell);
		return tabella;
	 }
	 
	 public PdfPTable addEmptyCell(PdfPTable tabella, int colNumber, int border) {
		return addEmptyCell(tabella, colNumber, border, null);
	 }
 
	 public CertificatoMgr getCertificatoMgr() {
		return (CertificatoMgr) SpringBeanLocator.getBean("certificatoMgr");
	 }
 
	 public CertificatoreMgr getCertificatoreMgr() {
		return (CertificatoreMgr) SpringBeanLocator.getBean("certificatoreMgr");
	 }
	 
	 public UtilMgr getUtilMgr() {
		 return (UtilMgr) SpringBeanLocator.getBean("utilMgr");
	 }
}
