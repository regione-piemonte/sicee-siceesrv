/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.print.dto;

import java.util.List;

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

public class ApeReadOnlyData {

	private SiceeTCertificato certificato;

	private SiceeTDatiGenerali datiGenerali;

	private SiceeDDestUso2015 destinazioneUso2015;

	private SiceeTAltreInfo altreInfo;
	
	private String dMotivo;
	
	private String flagNonValidoDlgs1922005;
	
	private String flagServizioEnergia;
	
	private SiceeTCertificatore certificatore;
	
	private SiceeTAzienda azienda;
	
	private SiceeTDatiEner2015 datiEner2015;

	private String dTitolo;
	
	private String descDichIndipendenza;
	
	private List<SiceeTDatiCatastSec> datiCatastSec;
	
	private List<SiceeTQtaConsumi2015> quantitaConsumi2015;
	
	private List<SiceeDUnitaMisura2015> unitaMisura2015;
	
	private List<SiceeDCombustibile> elencoConsumiCombustibile;

	private List<SiceeTRaccomand2015> raccomand2015;
	
	private List<SiceeDClasseEnergetica> elencoClasseEnergetica;

	private SiceeRCombDener2015 combDener2015;

	private List<SiceeRCertifServener2015> certifServener2015List;
	
	private List<SiceeTDetImp2015> detImp2015List;

	private List<SiceeDCombustibile> elencoCombustibiliDettImpianti;

	private List<SiceeDTipoImpianto2015> elencoTipiImpianto;

	private List<SiceeDClasseEnergetica> classiEnergetiche;

	public SiceeTCertificato getCertificato() {
		return certificato;
	}

	public void setCertificato(SiceeTCertificato certificato) {
		this.certificato = certificato;
	}

	public SiceeTDatiGenerali getDatiGenerali() {
		return datiGenerali;
	}

	public void setDatiGenerali(SiceeTDatiGenerali datiGenerali) {
		this.datiGenerali = datiGenerali;
	}

	public SiceeDDestUso2015 getDestinazioneUso2015() {
		return destinazioneUso2015;
	}

	public void setDestinazioneUso2015(SiceeDDestUso2015 destinazioneUso2015) {
		this.destinazioneUso2015 = destinazioneUso2015;
	}

	public SiceeTAltreInfo getAltreInfo() {
		return altreInfo;
	}

	public void setAltreInfo(SiceeTAltreInfo altreInfo) {
		this.altreInfo = altreInfo;
	}

	public String getDMotivo() {
		return dMotivo;
	}

	public void setDMotivo(String dMotivo) {
		this.dMotivo = dMotivo;
	}

	public String getFlagNonValidoDlgs1922005() {
		return flagNonValidoDlgs1922005;
	}

	public void setFlagNonValidoDlgs1922005(String flagNonValidoDlgs1922005) {
		this.flagNonValidoDlgs1922005 = flagNonValidoDlgs1922005;
	}

	public String getFlagServizioEnergia() {
		return flagServizioEnergia;
	}

	public void setFlagServizioEnergia(String flagServizioEnergia) {
		this.flagServizioEnergia = flagServizioEnergia;
	}

	public SiceeTCertificatore getCertificatore() {
		return certificatore;
	}

	public void setCertificatore(SiceeTCertificatore certificatore) {
		this.certificatore = certificatore;
	}

	public SiceeTAzienda getAzienda() {
		return azienda;
	}

	public void setAzienda(SiceeTAzienda azienda) {
		this.azienda = azienda;
	}

	public SiceeTDatiEner2015 getDatiEner2015() {
		return datiEner2015;
	}

	public void setDatiEner2015(SiceeTDatiEner2015 datiEner2015) {
		this.datiEner2015 = datiEner2015;
	}

	public String getDTitolo() {
		return dTitolo;
	}

	public void setDTitolo(String dTitolo) {
		this.dTitolo = dTitolo;
	}

	public String getDescDichIndipendenza() {
		return descDichIndipendenza;
	}

	public void setDescDichIndipendenza(String descDichIndipendenza) {
		this.descDichIndipendenza = descDichIndipendenza;
	}

	public List<SiceeTDatiCatastSec> getDatiCatastSec() {
		return datiCatastSec;
	}

	public void setDatiCatastSec(List<SiceeTDatiCatastSec> datiCatastSec) {
		this.datiCatastSec = datiCatastSec;
	}

	public List<SiceeTQtaConsumi2015> getQuantitaConsumi2015() {
		return quantitaConsumi2015;
	}

	public void setQuantitaConsumi2015(List<SiceeTQtaConsumi2015> quantitaConsumi2015) {
		this.quantitaConsumi2015 = quantitaConsumi2015;
	}

	public List<SiceeDUnitaMisura2015> getUnitaMisura2015() {
		return unitaMisura2015;
	}

	public void setUnitaMisura2015(List<SiceeDUnitaMisura2015> unitaMisura2015) {
		this.unitaMisura2015 = unitaMisura2015;
	}

	public List<SiceeDCombustibile> getElencoConsumiCombustibile() {
		return elencoConsumiCombustibile;
	}

	public void setElencoConsumiCombustibile(List<SiceeDCombustibile> elencoConsumiCombustibile) {
		this.elencoConsumiCombustibile = elencoConsumiCombustibile;
	}

	public List<SiceeTRaccomand2015> getRaccomand2015() {
		return raccomand2015;
	}

	public void setRaccomand2015(List<SiceeTRaccomand2015> raccomand2015) {
		this.raccomand2015 = raccomand2015;
	}

	public List<SiceeDClasseEnergetica> getElencoClasseEnergetica() {
		return elencoClasseEnergetica;
	}

	public void setElencoClasseEnergetica(List<SiceeDClasseEnergetica> elencoClasseEnergetica) {
		this.elencoClasseEnergetica = elencoClasseEnergetica;
	}

	public SiceeRCombDener2015 getCombDener2015() {
		return combDener2015;
	}

	public void setCombDener2015(SiceeRCombDener2015 combDener2015) {
		this.combDener2015 = combDener2015;
	}

	public List<SiceeRCertifServener2015> getCertifServener2015List() {
		return certifServener2015List;
	}

	public void setCertifServener2015List(List<SiceeRCertifServener2015> certifServener2015List) {
		this.certifServener2015List = certifServener2015List;
	}

	public List<SiceeTDetImp2015> getDetImp2015List() {
		return detImp2015List;
	}

	public void setDetImp2015List(List<SiceeTDetImp2015> detImp2015List) {
		this.detImp2015List = detImp2015List;
	}

	public List<SiceeDCombustibile> getElencoCombustibiliDettImpianti() {
		return elencoCombustibiliDettImpianti;
	}

	public void setElencoCombustibiliDettImpianti(List<SiceeDCombustibile> elencoCombustibiliDettImpianti) {
		this.elencoCombustibiliDettImpianti = elencoCombustibiliDettImpianti;
	}

	public List<SiceeDTipoImpianto2015> getElencoTipiImpianto() {
		return elencoTipiImpianto;
	}

	public void setElencoTipiImpianto(List<SiceeDTipoImpianto2015> elencoTipiImpianto) {
		this.elencoTipiImpianto = elencoTipiImpianto;
	}

	public List<SiceeDClasseEnergetica> getClassiEnergetiche() {
		return classiEnergetiche;
	}

	public void setClassiEnergetiche(List<SiceeDClasseEnergetica> classiEnergetiche) {
		this.classiEnergetiche = classiEnergetiche;
	}
	
}
