/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.util;


import it.csi.sicee.siceesrv.business.print.dto.Raccomandazione;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class RaccomandazioneComparator.
 */
public class RaccomandazioneComparator implements Comparator<Raccomandazione> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Raccomandazione o1, Raccomandazione o2) {		
		return o1.getPriorita().compareTo(o2.getPriorita());
	}

}
