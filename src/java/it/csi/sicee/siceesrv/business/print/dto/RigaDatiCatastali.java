/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print.dto;

import java.util.List;

public class RigaDatiCatastali {
	
	private String codiceComuneCatastale;
	private String sezione;
	private String foglio;
	private String particella;
	private String da1;
	private String a1;
	private List<List<String>> subalterniSingoli;
	
	public String getCodiceComuneCatastale() {
		return codiceComuneCatastale;
	}
	public void setCodiceComuneCatastale(String codiceComuneCatastale) {
		this.codiceComuneCatastale = codiceComuneCatastale;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	public String getFoglio() {
		return foglio;
	}
	public void setFoglio(String foglio) {
		this.foglio = foglio;
	}
	public String getParticella() {
		return particella;
	}
	public void setParticella(String particella) {
		this.particella = particella;
	}
	public String getDa1() {
		return da1;
	}
	public void setDa1(String da1) {
		this.da1 = da1;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public List<List<String>> getSubalterniSingoli() {
		return subalterniSingoli;
	}
	public void setSubalterniSingoli(List<List<String>> subalterniSingoli) {
		this.subalterniSingoli = subalterniSingoli;
	}
}
