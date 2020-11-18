/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print;

import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPCellEvent;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfShading;
import com.lowagie.text.pdf.PdfShadingPattern;
import com.lowagie.text.pdf.PdfWriter;

public class GradientBackgroundEventListener implements PdfPCellEvent {
	
	private PdfWriter writer;
	
	public GradientBackgroundEventListener(PdfWriter writer) {
		this.writer = writer;
	}
	
	public void cellLayout(PdfPCell cell, Rectangle rectangle, PdfContentByte[] pdfContentByte) {
        PdfContentByte canvas = pdfContentByte[PdfPTable.BACKGROUNDCANVAS];
       
        float left = rectangle.left();
        float top = rectangle.top();
        float right = rectangle.right();
        float bottom = rectangle.bottom();

        PdfShading axial = PdfShading.simpleAxial(writer, left, top,
        		right, bottom, PrintBase.HEADER_START_COLOR, PrintBase.HEADER_END_COLOR);
        PdfShadingPattern shading = new PdfShadingPattern(axial);
        canvas.setShadingFill(shading);
        canvas.moveTo(left,top);
        canvas.lineTo(right, top);
        canvas.lineTo(right, bottom);
        canvas.lineTo(left, bottom);
        canvas.closePathFillStroke();
    }
}
