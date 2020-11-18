/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print;

import java.awt.Color;

import org.apache.commons.lang.StringUtils;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.ExceptionConverter;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificato;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificatore;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.sicee.siceesrv.business.util.Converter;
 
 
public class PDFApeEventListener extends PdfPageEventHelper
{
	private PdfTemplate total;
	private int idStatoAttestato;
	private SiceeTCertificatore certificatore;
	private SiceeTCertificato certificato;
	private Integer altroServiziEnergetici;
	
	public PDFApeEventListener(SiceeTCertificatore certificatore, SiceeTCertificato certificato) {
		this(certificatore, certificato, Constants.CONSOLIDATO, null);
	}
	
	public PDFApeEventListener(SiceeTCertificatore certificatore, SiceeTCertificato certificato, int idStatoAttestato, Integer altroServiziEnergetici) {
		this.idStatoAttestato = idStatoAttestato;
		this.certificatore = certificatore;
		this.certificato = certificato;
		this.altroServiziEnergetici = altroServiziEnergetici;
	}

	public int getIdStatoAttestato() {
		return idStatoAttestato;
	}

	public void setIdStatoAttestato(int idStatoAttestato) {
		this.idStatoAttestato = idStatoAttestato;
	}

    public SiceeTCertificatore getCertificatore() {
		return certificatore;
	}

	public void setCertificatore(SiceeTCertificatore certificatore) {
		this.certificatore = certificatore;
	}

	public SiceeTCertificato getCertificato() {
		return certificato;
	}

	public void setCertificato(SiceeTCertificato certificato) {
		this.certificato = certificato;
	}

	public Integer getAltroServiziEnergetici() {
		return altroServiziEnergetici;
	}

	public void setAltroServiziEnergetici(Integer altroServiziEnergetici) {
		this.altroServiziEnergetici = altroServiziEnergetici;
	}

	public void onOpenDocument(PdfWriter writer, Document document) {

        total = writer.getDirectContent().createTemplate(30, 16);
    }

    public void onEndPage(PdfWriter writer, Document document)
    {
    	addHeader(writer);
    	addFooter(writer);
    }

    private void addHeader(PdfWriter writer) {
		PdfPTable table = new PdfPTable(new float[] {11,74,13});
		try {			
			// set defaults
			table.setTotalWidth(567);
			table.setLockedWidth(true);
			table.getDefaultCell().setBorder(Rectangle.NO_BORDER);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			
			Paragraph paragraph = new Paragraph("Appendice B - Format di Attestato di Prestazione Energetica (APE)", PrintBase.FONT_HELVETICA_9_B);
			
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(0);
			cell.setColspan(3);
			
			table.addCell(cell);
			
			cell = new PdfPCell();
			cell.setBorder(0);
			cell.setColspan(3);
			
			table.addCell(cell);
			
			
			Image logo = null;
			
			try {
				logo = Image.getInstance(PrintBase.getImmagine("attestato2015/logoRegione.png"));
			} catch (Exception e){
				System.out.println("Immagine logo mancante");
			}
						
			table.addCell(logo);
			
			PdfPTable middleTable = new PdfPTable(new float[] {50,50});
			middleTable.setWidthPercentage(100);
			
			paragraph = new Paragraph("ATTESTATO DI PRESTAZIONE", PrintBase.FONT_HELVETICA_10_B_WHITE);
			
			cell = inizializzaCellaHeader(paragraph);
			cell.setBorder(Rectangle.TOP | Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(2);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			
			middleTable.addCell(cell);
			
			paragraph = new Paragraph("ENERGETICA DEGLI EDIFICI", PrintBase.FONT_HELVETICA_10_B_WHITE);
			cell = inizializzaCellaHeader(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.RIGHT);
			cell.setColspan(2);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			
			middleTable.addCell(cell);
			
			String codiceIdentificativo = StringUtils.trimToEmpty(certificato.getAnno()) + " " +
					StringUtils.trimToEmpty(certificatore.getNumCertificatore()) + " " +
					StringUtils.trimToEmpty(certificato.getProgrCertificato());
			
			Phrase phrase = new Phrase("CODICE IDENTIFICATIVO :  ", PrintBase.FONT_HELVETICA_8_B_WHITE);
			phrase.add(new Chunk(codiceIdentificativo, PrintBase.FONT_HELVETICA_8_WHITE));
			paragraph = new Paragraph(phrase);
			cell = inizializzaCellaHeader(paragraph);
			cell.setBorder(Rectangle.LEFT | Rectangle.BOTTOM);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setPadding(10);
			middleTable.addCell(cell);
			
			phrase = new Phrase("VALIDO FINO AL :  ", PrintBase.FONT_HELVETICA_8_B_WHITE);
			phrase.add(new Chunk(Converter.convertToStringWebOrEmpty(this.certificato.getDtScadenza()), PrintBase.FONT_HELVETICA_8_WHITE));
			paragraph = new Paragraph(phrase);
			cell = inizializzaCellaHeader(paragraph);
			cell.setBorder(Rectangle.RIGHT | Rectangle.BOTTOM);
			cell.setHorizontalAlignment(Element.ALIGN_LEFT);
			cell.setPadding(10);
			middleTable.addCell(cell);
			
			PdfPCell middleCell = new PdfPCell(middleTable);
			middleCell.setBorder(Rectangle.NO_BORDER);
			middleCell.setCellEvent(new GradientBackgroundEventListener(writer));
			
			table.addCell(middleCell);
			
			Image apeLogo = null;
			
			try {
				apeLogo = Image.getInstance(PrintBase.getImmagine("attestato2015/logoAPE2015.png"));
			} catch (Exception e){
				System.out.println("Immagine logo mancante");
			}
						
			table.addCell(apeLogo);
			
			table.writeSelectedRows(0, -1, 17, 833, writer.getDirectContent());
    	}
    	catch (Exception e) {
    		throw new ExceptionConverter(e);
    	}
    }
    
    private void addFooter(PdfWriter writer) {
    	
    	if (altroServiziEnergetici != null && altroServiziEnergetici != Constants.MOTIVO_RILASCIO_ALTRA_MOTIVAZIONE) {
    		
    		String alertAltroServiziEnergetici = "Attestato non utilizzabile ai fini della vendita o locazione di edifici (D.lgs 192/2005 art. 6)";
    		
    		PdfContentByte canvas = writer.getDirectContentUnder();
    		Phrase watermark = new Phrase(alertAltroServiziEnergetici, PrintBase.FONT_HELVETICA_10_B);
    		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, watermark, 590, 400, 90);
    	}
    	
    	if (idStatoAttestato != Constants.CONSOLIDATO)
    	{
    		String backgroundString = "";
    		int fontSizeBackgroundString = 190;
    		
    		switch(idStatoAttestato) {
    		
    			case Constants.BOZZA : 
    				backgroundString = "BOZZA";
    				break;
    			case Constants.ANNULLATO : 
    				backgroundString = "ANNULLATO";
    				fontSizeBackgroundString = 125;
    				break;
    		}
    		
    		PdfContentByte canvas = writer.getDirectContentUnder();
    		Phrase watermark = new Phrase(backgroundString, new Font(Font.HELVETICA, fontSizeBackgroundString, Font.NORMAL, Color.LIGHT_GRAY));
    		ColumnText.showTextAligned(canvas, Element.ALIGN_CENTER, watermark, 337, 400, 45);
    	}
    	
    	PdfPTable table = new PdfPTable(new float[] {90,10});
		try {
			table.setTotalWidth(575);
			table.setLockedWidth(true);
			table.getDefaultCell().setBorder(Rectangle.TOP);
			table.getDefaultCell().setBorderWidth(4);
			table.getDefaultCell().setBorderColor(PrintBase.DARK_GREEN);
			
			table.addCell("");
			
			Paragraph paragraph = new Paragraph("Pag. " + writer.getPageNumber(), PrintBase.FONT_HELVETICA_8_WHITE);
			PdfPCell cell = new PdfPCell(paragraph);
			cell.setBorder(Rectangle.BOX);
			cell.setBorderWidth(4);
			cell.setBorderColor(PrintBase.DARK_GREEN);
			cell.setBackgroundColor(PrintBase.DARK_GREEN);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setPaddingTop(5);
			cell.setPaddingBottom(5);
			table.addCell(cell);

	        table.writeSelectedRows(0, -1, 10, 30, writer.getDirectContent());
	    } catch(Exception e) {
			throw new ExceptionConverter(e);
		} 
    }
    
    private PdfPCell inizializzaCellaHeader(Paragraph paragraph) {
    	PdfPCell cell = new PdfPCell(paragraph);
    	
    	cell.setBorderWidth(2);
    	cell.setBorderColor(PrintBase.DARK_GREEN);
		
		return cell;
    }
}
