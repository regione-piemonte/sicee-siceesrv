/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print;

import com.lowagie.text.Image;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPCellEvent;
import com.lowagie.text.pdf.PdfPTable;

public class BackgroundImageEventListener implements PdfPCellEvent {

	private String imgName;
	
	public BackgroundImageEventListener(String imgName) {
		this.imgName = imgName;
	}
	
	public void cellLayout(PdfPCell arg0, Rectangle arg1, PdfContentByte[] arg2) {
        try {
            PdfContentByte pdfContentByte = arg2[PdfPTable.BACKGROUNDCANVAS];
            Image bgImage = PrintBase.getImmagine(imgName);
            pdfContentByte.addImage(bgImage, arg1.width(), 0, 0, arg1
                    .height(), arg1.left(), arg1.bottom());
        } catch (Exception e) {
            System.out.println("Immagine "+ this.imgName + "non trovata");
        }
    }
}
