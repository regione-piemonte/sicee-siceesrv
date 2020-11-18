/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print.dto;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeDClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiEner2015;

public class ApeTarghettaReadOnlyData {
	
	private SiceeTDatiEner2015 datiEner;
	private SiceeDClasseEnergetica classeEner;
	
	public SiceeTDatiEner2015 getDatiEner() {
		return datiEner;
	}
	public void setDatiEner(SiceeTDatiEner2015 datiEner) {
		this.datiEner = datiEner;
	}
	public SiceeDClasseEnergetica getClasseEner() {
		return classeEner;
	}
	public void setClasseEner(SiceeDClasseEnergetica classeEner) {
		this.classeEner = classeEner;
	}
}
