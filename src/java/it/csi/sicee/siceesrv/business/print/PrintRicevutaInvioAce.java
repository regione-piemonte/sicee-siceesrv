/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.print;

import it.csi.sicee.siceesrv.business.facade.BaseMgr;
import it.csi.sicee.siceesrv.business.print.dto.DatiCatastaliDto;
import it.csi.sicee.siceesrv.business.print.dto.GenericDto;
import it.csi.sicee.siceesrv.business.print.dto.RicevutaInvioAceDto;
import it.csi.sicee.siceesrv.business.siceesrv.SiceesrvImpl;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.sicee.siceesrv.business.util.GenericUtil;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PdfWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class PrintRicevutaInvioAce.
 */
public class PrintRicevutaInvioAce {

	
	/** The Constant log. */
	protected static final Logger log = Logger
	.getLogger(Constants.APPLICATION_CODE + ".business");
	
	
	/** The section font. */
	protected Font sectionFont = new Font(Font.HELVETICA, 12, Font.NORMAL);

	protected Font sectionFontBold = new Font(Font.HELVETICA, 12, Font.BOLD);

	/** The chapter font. */
	protected Font chapterFont = new Font(Font.HELVETICA, 14, Font.BOLD);
	
	/** The chapter min font. */
	protected Font chapterMinFont = new Font(Font.HELVETICA, 11, Font.BOLD);
	
	/** The footer font. */
	protected Font footerFont = new Font(Font.HELVETICA, 10, Font.ITALIC);
	
	/** The header table font. */
	protected Font headerTableFont = new Font(Font.HELVETICA, 10, Font.BOLD);
	
	/** The row table font. */
	protected Font rowTableFont = new Font(Font.HELVETICA, 10, Font.NORMAL);
	
	/** The content font. */
	protected Font contentFont = new Font(Font.HELVETICA, 10, Font.NORMAL);
	
	/** The base font. */
	protected BaseFont baseFont = null;

	/** The baos. */
	protected ByteArrayOutputStream baos;
	
	/** The baos stamper. */
	protected ByteArrayOutputStream baosStamper;


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
	 * @return the byte array input stream
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws DocumentException the document exception
	 */
	public ByteArrayInputStream stampaModulo(GenericDto dati) throws IOException, DocumentException {

		createPdf(dati);
		addLogoAndPageNumber(dati);

		return new ByteArrayInputStream(baosStamper.toByteArray());

	}

	/**
	 * Gets the ace sostituiti.
	 *
	 * @param array the array
	 * @return the ace sostituiti
	 */
	private Paragraph getAceSostituiti(String[] array) {

		Paragraph ret = new Paragraph();
		for (int i = 0; i < array.length; i++) {
			ret.add(new Paragraph(array[i], this.contentFont));
		}
		 
		return ret;
	}

	/**
	 * Gets the table dati catastali.
	 *
	 * @param array the array
	 * @return the table dati catastali
	 */
	private PdfPTable getTableDatiCatastali(DatiCatastaliDto[] array) {
		//PdfPTable table = new PdfPTable(14);
		PdfPTable table = new PdfPTable(11);

		table.setTotalWidth(400f);
		table.setLockedWidth(true);
		table.getDefaultCell().setFixedHeight(15f);		

		Color col = Color.YELLOW;

		//table.addCell(getTableCell("Provincia", headerTableFont, col, 5));
		//table.addCell(getTableCell("Comune", headerTableFont, col, 5));
		table.addCell(getTableCell("Codice Catastale", headerTableFont, col, 3));
		table.addCell(getTableCell("Sezione", headerTableFont, col, 2));
		table.addCell(getTableCell("Foglio", headerTableFont, col, 2));
		table.addCell(getTableCell("Particella", headerTableFont, col, 2));
		table.addCell(getTableCell("Subalterno", headerTableFont, col, 2));

		for (int i = 0; i < array.length; i++) {
			if ((i % 2) == 1)
				col = Color.LIGHT_GRAY;
			else
				col = Color.WHITE;
			
			//table.addCell(getTableCell(array[i].getProvincia(), rowTableFont,col, 5 ));
			//table.addCell(getTableCell(array[i].getComune(), rowTableFont, col, 5));
			table.addCell(getTableCell(array[i].getCodiceComuneCatastale(), rowTableFont, col, 3));
			table.addCell(getTableCell(array[i].getSezione(), rowTableFont, col, 2));
			table.addCell(getTableCell(array[i].getFoglio(), rowTableFont, col, 2));
			table.addCell(getTableCell(array[i].getParticella(), rowTableFont, col, 2));
			table.addCell(getTableCell(array[i].getSubalterno(), rowTableFont, col, 2));
		}

		return table;
	}
	
	
	/**
	 * Adds the content page.
	 *
	 * @param document the document
	 * @param dati the dati
	 * @throws DocumentException the document exception
	 */
	// Alex 26/08/2015: vedi modifiche in SICEE-CDU-19-V05 stampa_ricevuta_invio_ACE.doc
	protected void addContentPage(Document document, GenericDto dati)
			throws DocumentException {
		// aggiunge un'intestazione (intesa come titolo)
		Paragraph p = new Paragraph();
		Paragraph par = null;
		p.setAlignment(Element.ALIGN_JUSTIFIED);

		addEmptyLine(p, 2);

		RicevutaInvioAceDto dto = (RicevutaInvioAceDto) dati;

		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("Si attesta che il SIPEE (Sistema Informativo Prestazione Energetica Edifici) ha ricevuto il seguente attestato A.P.E.: \n");

		par = new Paragraph(strBuffer.toString(), this.sectionFontBold);
		p.add(par);
		//addEmptyLine(p, 1);

		strBuffer = new StringBuffer();
		
		strBuffer.append("Codice identificativo A.P.E.: " + dto.getNumeroCertificato() + "       Data invio: " +dto.getDataInvio()+  "\n");
		
		
		if (!BaseMgr.isNullOrEmpty(dto.getNumeroProtocollo()))
		{
			strBuffer.append("Numero protocollo: " + dto.getNumeroProtocollo() + "\n");
		}

		
		strBuffer.append("Certificatore: " + dto.getNomeCertificatore() + "\n");
		
		if (!BaseMgr.isNullOrEmpty(dto.getNomeCocertificatore()))
		{
			strBuffer.append("Co-certificatore: " + dto.getNomeCocertificatore() + "\n");
		}
		
		//strBuffer.append("Codice APE: " + dto.getNumeroCertificato());
		
		par = new Paragraph(strBuffer.toString(), this.sectionFont);
		p.add(par);
		//addEmptyLine(p, 1);
		
		strBuffer = new StringBuffer();
		
//		strBuffer.append("Si attesta che il SIPEE ha ricevuto correttamente l'attestato firmato digitalmente dal certificatore indicato.\n");
//		strBuffer.append("\nL'APE fa riferimento alla seguente: ");

		/*
			Destinazione d’uso:
			
			Tipologia edificio:
			Provincia:
			Comune:
			Indirizzo:
			Dati catastali: sez: Foglio: Particella: Subalterno:
		*/

		//
		if (!BaseMgr.isNullOrEmpty(dto.getDataSopralluogo())) {			
			strBuffer.append("\nSopralluogo avvenuto in data: " + dto.getDataSopralluogo());
		}
		
		strBuffer.append("\nDestinazione d'uso: " + dto.getDescrDestUso());
		
		strBuffer.append("\nMotivazione rilascio: " + dto.getDescrMotivoRilascio());
		
		
		if (!BaseMgr.isNullOrEmpty(dto.getTipologiaEdificio())) {
			strBuffer.append("\nTipologia edificio: " + dto.getTipologiaEdificio());
		}
		strBuffer.append("\nProvincia: ");
		strBuffer.append(dto.getDatiCatastali().getProvincia());
		strBuffer.append("\nComune: ");
		strBuffer.append(dto.getDatiCatastali().getComune());
		strBuffer.append("\nCodice Catastale: ");
		strBuffer.append(BaseMgr.convertToStringForReport(dto.getDatiCatastali().getCodiceComuneCatastale()));
		strBuffer.append("\nIndirizzo: ");
		strBuffer.append(dto.getDatiCatastali().getIndirizzo());
		strBuffer.append(", ");
		strBuffer.append(dto.getDatiCatastali().getCivico());
		strBuffer.append("\nDati catastali principali: ");
		strBuffer.append("sez. ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getSezione())) ? "-" : dto.getDatiCatastali().getSezione()));
		strBuffer.append(" foglio ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getFoglio())) ? "-" : dto.getDatiCatastali().getFoglio()));
		strBuffer.append(" particella ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getParticella())) ? "-" : dto.getDatiCatastali()
				.getParticella()));
		strBuffer.append(" subalterno ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getSubalterno())) ? "-" : dto.getDatiCatastali()
				.getSubalterno())
				+ ".");


		par = new Paragraph(strBuffer.toString(), this.sectionFont);
		p.add(par);		
		document.add(p);

		if (dto.getDatiCatastaliAltri() != null) {
			
			String str = "Ulteriori dati catastali compresi nell'edificio oggetto di certificazione sono i seguenti:";
			p = new Paragraph();
			par = new Paragraph(str, this.sectionFont);
			addEmptyLine(p, 1);
			p.add(par);
			addEmptyLine(p, 1);
			document.add(p);
			document.add(getTableDatiCatastali(dto.getDatiCatastaliAltri()));
		}
		
		if (dto.getAceSostituiti() != null) {
			String str = "L'APE sostituisce il/i seguente/i attestato/i per " + dto.getMotivoSostituzione() + ":";
			p = new Paragraph();
			par = new Paragraph(str, this.sectionFont);
			addEmptyLine(p, 1);
			p.add(par);
			addEmptyLine(p, 1);
			document.add(p);
			document.add(getAceSostituiti(dto.getAceSostituiti()));
		}

		String str = "Per verificare la validita' della firma digitale dell'APE, e' necessario utilizzare un qualunque strumento di verifica di firma digitale (esempio DIKE) a disposizione.";
		p = new Paragraph();
		par = new Paragraph(str, this.chapterMinFont);
		addEmptyLine(p, 1);
		p.add(par);
		addEmptyLine(p, 1);
		document.add(p);

		
		if (dto.getNota() != null) {
			str = dto.getNota();
			p = new Paragraph();
			par = new Paragraph(str, this.chapterMinFont);
			addEmptyLine(p, 1);
			p.add(par);
			addEmptyLine(p, 1);
			document.add(p);
		}

		if (document.isOpen()) {
			document.newPage();
		} else {
			log.warn("È impossibile aggiungere la title page: lo stream di Document non è aperto!");
		}

	}

	// Alex 26/08/2015: metodo addContentPage originale pre-modifiche
/*
	protected void addContentPage(Document document, GenericDto dati)
			throws DocumentException {
		// aggiunge un'intestazione (intesa come titolo)
		Paragraph p = new Paragraph();
		Paragraph par = null;
		p.setAlignment(Element.ALIGN_JUSTIFIED);

		addEmptyLine(p, 1);

		RicevutaInvioAceDto dto = (RicevutaInvioAceDto) dati;

		StringBuffer strBuffer = new StringBuffer();

		strBuffer.append("Data invio: " + dto.getDataInvio() + "\n");
		strBuffer.append("Certificatore: " + dto.getNomeCertificatore() + "\n");
		strBuffer.append("Co-certificatore: " + dto.getNomeCocertificatore() + "\n");
		strBuffer.append("Codice Attestato: " + dto.getNumeroCertificato());
		
		par = new Paragraph(strBuffer.toString(), this.contentFont);
		p.add(par);
		addEmptyLine(p, 1);
		
		strBuffer = new StringBuffer();
		
		strBuffer.append("Si attesta che il SICEE ha ricevuto correttamente l'attestato firmato digitalmente dal certificatore indicato.\n");

		strBuffer.append("\nL'Attestato fa riferimento alla seguente: ");

		//
		
		strBuffer.append("\nDestinazione d'uso: " + dto.getDescrDestUso());
		
		if (dto.getTipologiaEdificio() != null)
		{
			strBuffer.append("\nTipologia edificio: " + dto.getTipologiaEdificio());
		}
		
		strBuffer.append("\nProvincia: ");
		strBuffer.append(dto.getDatiCatastali().getProvincia());
		strBuffer.append("\nComune: ");
		strBuffer.append(dto.getDatiCatastali().getComune());
		strBuffer.append("\nIndirizzo: ");
		strBuffer.append(dto.getDatiCatastali().getIndirizzo());
		strBuffer.append(", ");
		strBuffer.append(dto.getDatiCatastali().getCivico());
		strBuffer.append("\nDati catastali: ");
		strBuffer.append("sez. ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getSezione())) ? "-" : dto.getDatiCatastali().getSezione()));
		strBuffer.append(" foglio ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getFoglio())) ? "-" : dto.getDatiCatastali().getFoglio()));
		strBuffer.append(" particella ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getParticella())) ? "-" : dto.getDatiCatastali()
				.getParticella()));
		strBuffer.append(" subalterno ");
		strBuffer.append(((BaseMgr.isNullOrEmpty(dto.getDatiCatastali()
				.getSubalterno())) ? "-" : dto.getDatiCatastali()
				.getSubalterno())
				+ ".");

		par = new Paragraph(strBuffer.toString(), this.contentFont);
		p.add(par);		
		document.add(p);

		if (dto.getDatiCatastaliAltri() != null) {
			String str = "Ulteriori dati catastali compresi nell'edificio oggetto di certificazione sono i seguenti:";
			p = new Paragraph();
			par = new Paragraph(str, this.contentFont);
			addEmptyLine(p, 1);
			p.add(par);
			addEmptyLine(p, 1);
			document.add(p);
			document.add(getTableDatiCatastali(dto.getDatiCatastaliAltri()));
		}
		
		if (dto.getAceSostituiti() != null) {
			String str = "L'Attestato sostituisce il/i seguente/i attestato/i per " + dto.getMotivoSostituzione() + ":";
			p = new Paragraph();
			par = new Paragraph(str, this.contentFont);
			addEmptyLine(p, 1);
			p.add(par);
			addEmptyLine(p, 1);
			document.add(p);
			document.add(getAceSostituiti(dto.getAceSostituiti()));
		}

		if (document.isOpen()) {
			document.newPage();
		} else {
			log.warn("È impossibile aggiungere la title page: lo stream di Document non è aperto!");
		}

	}

 */
	/**
	 * Adds the footer page.
	 *
	 * @param doc the doc
	 */
	protected void addFooterPage(Document doc) {
		// TODO Auto-generated method stub

	}

	/**
	 * Adds the title page.
	 *
	 * @param document the document
	 * @throws DocumentException the document exception
	 */
	protected void addTitlePage(Document document) throws DocumentException {
		// aggiunge un'intestazione (intesa come titolo)
		Paragraph p = new Paragraph();
		p.setAlignment(Element.ALIGN_CENTER);

		//Paragraph par = new Paragraph("RICEVUTA TRASMISSIONE ATTESTATO", this.chapterFont);
		Paragraph par = new Paragraph("RICEVUTA A.P.E.", this.chapterFont);

		p.add(par);

		if (document.isOpen()) {
			document.add(p);
		} else {
			log.warn("È impossibile aggiungere la title page: lo stream di Document non è aperto!");
		}

	}

	

	/**
	 * Adds the logo and page number.
	 *
	 * @param dati the dati
	 * @return the pdf stamper
	 * @throws DocumentException the document exception
	 */
	protected PdfStamper addLogoAndPageNumber(GenericDto dati) throws DocumentException {
		PdfStamper stamp = null;
		try {
			RicevutaInvioAceDto dto = (RicevutaInvioAceDto) dati;
			String ace = "Attestato N. " + dto.getNumeroCertificato();
			// crea un'istanza di PdfReader: consente la lettura del PDF			
			PdfReader reader = new PdfReader(baos.toByteArray());

			int n = reader.getNumberOfPages();
			// crea un'istanza del PdfStamper: consente la copia della
			// pagina in un nuovo stream
			baosStamper = new ByteArrayOutputStream();
			stamp = getStamper(reader, baosStamper);
			int i = 1;

			// carica l'immagine usata come Logo
			Image img = PrintBase.getImmagine("logo.jpg");
			
			if (!BaseMgr.isNullOrEmpty(img)) {
				img.setAbsolutePosition(40f, 750f);
				img.scaleAbsolute(90f, 90f);
				img.setAlignment(0);
			}
			baseFont = BaseFont.createFont(BaseFont.TIMES_ITALIC, BaseFont.WINANSI,
					BaseFont.EMBEDDED);

			PdfContentByte under = null;

			while (i <= n) {
				// recupera il contenuto in byte del nuovo PDF...
				under = stamp.getUnderContent(i);
				if (!BaseMgr.isNullOrEmpty(img)) {
					under.addImage(img);
				}

				getUnderText(under, "Pagina " + i + " di " + n, 250f, 40f);
				getUnderText(under, ace, 450f, 800f, 10);

				if (i == n) {

					getUnderText(under, "Torino, " + dto.getDataOdierna(),

							50f, 130f, 10);
					getUnderText(under, dto.getFirma(), 400f, 130f, 10);
					int j = 0;
					for (String id:dto.getSede()) {
						getUnderText(under, id, 400f, 120f - (10 * j++), 10);
					}
				}

				i++;
			}

			stamp.close();
		} catch (Exception e) {
			log.error("", e);
		}

		return stamp;
	}

	

	/**
	 * Adds the meta data.
	 *
	 * @param document the document
	 * @throws DocumentException the document exception
	 */
	protected void addMetaData(Document document) throws DocumentException {
		/*
		 * document.addTitle(this.title); document.addSubject(this.subject);
		 * document.addKeywords(this.keyword); document.addAuthor(this.author);
		 * document.addCreator(this.creator);
		 */
	}
	
	/**
	 * Creates the pdf.
	 *
	 * @param dati the dati
	 * @return the document
	 * @throws DocumentException the document exception
	 */
	protected Document createPdf(GenericDto dati) throws DocumentException {
		Document doc = new Document(PageSize.A4, 50f, 50f, 100f, 120f);

		try {
			writeToPdf(doc);

			addMetaData(doc);

			addTitlePage(doc);
			addContentPage(doc, dati);

			addFooterPage(doc);

			doc.close();
		} catch (Exception e) {
			log.error("", e);
		}

		return doc;
	}

	/**
	 * Write to pdf.
	 *
	 * @param doc the doc
	 * @throws DocumentException the document exception
	 */
	protected void writeToPdf(Document doc) throws DocumentException {
		baos = new ByteArrayOutputStream();
		PdfWriter.getInstance(doc, baos);
		doc.open();
	}
	
	/**
	 * Gets the table cell.
	 *
	 * @param txt the txt
	 * @param font the font
	 * @param col the col
	 * @param colSpan the col span
	 * @return the table cell
	 */
	protected PdfPCell getTableCell(String txt, Font font, Color col, int colSpan) {
		PdfPCell cell = getTableCell(txt, font, col, colSpan, Rectangle.BOX);
		return cell;
	}
	
	/**
	 * Gets the table cell.
	 *
	 * @param txt the txt
	 * @param font the font
	 * @param col the col
	 * @param colSpan the col span
	 * @param border the border
	 * @return the table cell
	 */
	protected PdfPCell getTableCell(String txt, Font font, Color col, int colSpan, int border) {
		PdfPCell cell = getTableCell(txt, font, col, colSpan, border, Element.ALIGN_CENTER);
		return cell;
	}


	/**
	 * Gets the table cell.
	 *
	 * @param txt the txt
	 * @param font the font
	 * @param col the col
	 * @param colSpan the col span
	 * @param border the border
	 * @param alignment the alignment
	 * @return the table cell
	 */
	protected PdfPCell getTableCell(String txt, Font font, Color col, int colSpan, int border, int alignment) {
		PdfPCell cell = null;
		if (colSpan > 0) {
			cell = new PdfPCell(new Paragraph(txt, font));
			cell.setColspan(colSpan);
		} else {
			cell = new PdfPCell(new Phrase(txt, font));
		}

		cell.setBackgroundColor(col);		
		cell.setBorder(border);
		cell.setHorizontalAlignment(alignment);
		
		//cell.getDefaultCell().setBorderColor(Color.WHITE);

		return cell;
	}
	
	/**
	 * Adds the empty line.
	 *
	 * @param obj the obj
	 * @param i the i
	 * @throws DocumentException the document exception
	 */
	protected void addEmptyLine(Paragraph obj, int i) throws DocumentException {
		for (int j = 0; j < i; j++) {
			obj.add(Chunk.NEWLINE);
		}

	}
	
	/**
	 * Gets the under text.
	 *
	 * @param under the under
	 * @param txt the txt
	 * @param posx the posx
	 * @param posy the posy
	 * @return the under text
	 */
	protected void getUnderText(PdfContentByte under, String txt, float posx,
			float posy) {
		getUnderText(under, txt, posx, posy, 8);
	}
	
	/**
	 * Gets the under text.
	 *
	 * @param under the under
	 * @param txt the txt
	 * @param posx the posx
	 * @param posy the posy
	 * @param dimFont the dim font
	 * @return the under text
	 */
	protected void getUnderText(PdfContentByte under, String txt, float posx,
			float posy, int dimFont) {
		under.beginText();
		under.setTextMatrix(posx, posy);
		under.setFontAndSize(baseFont, dimFont);
		under.showText(txt);
		under.endText();
	}
	
	/**
	 * Gets the stamper.
	 *
	 * @param reader the reader
	 * @param os the os
	 * @return the stamper
	 * @throws DocumentException the document exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected PdfStamper getStamper(PdfReader reader, OutputStream os)
	throws DocumentException, IOException {
		PdfStamper stamp;
		stamp = new PdfStamper(reader, os);
		stamp.setEncryption(PdfWriter.STRENGTH128BITS, null, null,
		        PdfWriter.AllowPrinting | PdfWriter.AllowScreenReaders);
		//ByteArrayOutputStream oss = new ByteArrayOutputStream();
		//stamp = PdfStamper.createSignature(reader, os, '\0', new File(""), true);
		return stamp;
	}
}
