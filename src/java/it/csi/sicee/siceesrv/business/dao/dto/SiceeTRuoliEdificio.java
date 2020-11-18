/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTRuoliEdificio implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5787410399528610482L;

	/** 
	 * This attribute maps to the column FK_TIPO_RUOLO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected Integer fkTipoRuolo;

	/** 
	 * This attribute maps to the column NOME in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String nome;

	/** 
	 * This attribute maps to the column COGNOME in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String cognome;

	/** 
	 * This attribute maps to the column ID_INDIRIZZO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected Integer idIndirizzo;

	/** 
	 * This attribute maps to the column DESC_INDIRIZZO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String descIndirizzo;

	/** 
	 * This attribute maps to the column CAP in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String cap;

	/** 
	 * This attribute maps to the column ID_COMUNE in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String idComune;

	/** 
	 * This attribute maps to the column DESC_COMUNE in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String descComune;

	/** 
	 * This attribute maps to the column TELEFONO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String telefono;

	/** 
	 * This attribute maps to the column FAX in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String fax;

	/** 
	 * This attribute maps to the column CELL in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String cell;

	/** 
	 * This attribute maps to the column EMAIL in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String email;

	/** 
	 * This attribute maps to the column ID_REGIONE in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String idRegione;

	/** 
	 * This attribute maps to the column DESC_REGIONE in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String descRegione;

	/** 
	 * This attribute maps to the column ID_PROVINCIA in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String idProvincia;

	/** 
	 * This attribute maps to the column DESC_PROVINCIA in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String descProvincia;

	/** 
	 * This attribute maps to the column NUM_CIVICO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String numCivico;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	protected String anno;

	/**
	 * Method 'SiceeTRuoliEdificio'
	 * 
	 */
	public SiceeTRuoliEdificio()
	{
	}

	/**
	 * Method 'getFkTipoRuolo'
	 * 
	 * @return Integer
	 */
	public Integer getFkTipoRuolo()
	{
		return fkTipoRuolo;
	}

	/**
	 * Method 'setFkTipoRuolo'
	 * 
	 * @param fkTipoRuolo
	 */
	public void setFkTipoRuolo(Integer fkTipoRuolo)
	{
		this.fkTipoRuolo = fkTipoRuolo;
	}

	/**
	 * Method 'getNome'
	 * 
	 * @return String
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * Method 'setNome'
	 * 
	 * @param nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * Method 'getCognome'
	 * 
	 * @return String
	 */
	public String getCognome()
	{
		return cognome;
	}

	/**
	 * Method 'setCognome'
	 * 
	 * @param cognome
	 */
	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	/**
	 * Method 'getIdIndirizzo'
	 * 
	 * @return Integer
	 */
	public Integer getIdIndirizzo()
	{
		return idIndirizzo;
	}

	/**
	 * Method 'setIdIndirizzo'
	 * 
	 * @param idIndirizzo
	 */
	public void setIdIndirizzo(Integer idIndirizzo)
	{
		this.idIndirizzo = idIndirizzo;
	}

	/**
	 * Method 'getDescIndirizzo'
	 * 
	 * @return String
	 */
	public String getDescIndirizzo()
	{
		return descIndirizzo;
	}

	/**
	 * Method 'setDescIndirizzo'
	 * 
	 * @param descIndirizzo
	 */
	public void setDescIndirizzo(String descIndirizzo)
	{
		this.descIndirizzo = descIndirizzo;
	}

	/**
	 * Method 'getCap'
	 * 
	 * @return String
	 */
	public String getCap()
	{
		return cap;
	}

	/**
	 * Method 'setCap'
	 * 
	 * @param cap
	 */
	public void setCap(String cap)
	{
		this.cap = cap;
	}

	/**
	 * Method 'getIdComune'
	 * 
	 * @return String
	 */
	public String getIdComune()
	{
		return idComune;
	}

	/**
	 * Method 'setIdComune'
	 * 
	 * @param idComune
	 */
	public void setIdComune(String idComune)
	{
		this.idComune = idComune;
	}

	/**
	 * Method 'getDescComune'
	 * 
	 * @return String
	 */
	public String getDescComune()
	{
		return descComune;
	}

	/**
	 * Method 'setDescComune'
	 * 
	 * @param descComune
	 */
	public void setDescComune(String descComune)
	{
		this.descComune = descComune;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	/**
	 * Method 'getFax'
	 * 
	 * @return String
	 */
	public String getFax()
	{
		return fax;
	}

	/**
	 * Method 'setFax'
	 * 
	 * @param fax
	 */
	public void setFax(String fax)
	{
		this.fax = fax;
	}

	/**
	 * Method 'getCell'
	 * 
	 * @return String
	 */
	public String getCell()
	{
		return cell;
	}

	/**
	 * Method 'setCell'
	 * 
	 * @param cell
	 */
	public void setCell(String cell)
	{
		this.cell = cell;
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Method 'getIdRegione'
	 * 
	 * @return String
	 */
	public String getIdRegione()
	{
		return idRegione;
	}

	/**
	 * Method 'setIdRegione'
	 * 
	 * @param idRegione
	 */
	public void setIdRegione(String idRegione)
	{
		this.idRegione = idRegione;
	}

	/**
	 * Method 'getDescRegione'
	 * 
	 * @return String
	 */
	public String getDescRegione()
	{
		return descRegione;
	}

	/**
	 * Method 'setDescRegione'
	 * 
	 * @param descRegione
	 */
	public void setDescRegione(String descRegione)
	{
		this.descRegione = descRegione;
	}

	/**
	 * Method 'getIdProvincia'
	 * 
	 * @return String
	 */
	public String getIdProvincia()
	{
		return idProvincia;
	}

	/**
	 * Method 'setIdProvincia'
	 * 
	 * @param idProvincia
	 */
	public void setIdProvincia(String idProvincia)
	{
		this.idProvincia = idProvincia;
	}

	/**
	 * Method 'getDescProvincia'
	 * 
	 * @return String
	 */
	public String getDescProvincia()
	{
		return descProvincia;
	}

	/**
	 * Method 'setDescProvincia'
	 * 
	 * @param descProvincia
	 */
	public void setDescProvincia(String descProvincia)
	{
		this.descProvincia = descProvincia;
	}

	/**
	 * Method 'getNumCivico'
	 * 
	 * @return String
	 */
	public String getNumCivico()
	{
		return numCivico;
	}

	/**
	 * Method 'setNumCivico'
	 * 
	 * @param numCivico
	 */
	public void setNumCivico(String numCivico)
	{
		this.numCivico = numCivico;
	}

	/**
	 * Method 'getIdCertificatore'
	 * 
	 * @return String
	 */
	public String getIdCertificatore()
	{
		return idCertificatore;
	}

	/**
	 * Method 'setIdCertificatore'
	 * 
	 * @param idCertificatore
	 */
	public void setIdCertificatore(String idCertificatore)
	{
		this.idCertificatore = idCertificatore;
	}

	/**
	 * Method 'getProgrCertificato'
	 * 
	 * @return String
	 */
	public String getProgrCertificato()
	{
		return progrCertificato;
	}

	/**
	 * Method 'setProgrCertificato'
	 * 
	 * @param progrCertificato
	 */
	public void setProgrCertificato(String progrCertificato)
	{
		this.progrCertificato = progrCertificato;
	}

	/**
	 * Method 'getAnno'
	 * 
	 * @return String
	 */
	public String getAnno()
	{
		return anno;
	}

	/**
	 * Method 'setAnno'
	 * 
	 * @param anno
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	@Override
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SiceeTRuoliEdificio)) {
			return false;
		}
		
		final SiceeTRuoliEdificio _cast = (SiceeTRuoliEdificio) _other;
		if (fkTipoRuolo == null ? _cast.fkTipoRuolo != fkTipoRuolo : !fkTipoRuolo.equals( _cast.fkTipoRuolo )) {
			return false;
		}
		
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
			return false;
		}
		
		if (cognome == null ? _cast.cognome != cognome : !cognome.equals( _cast.cognome )) {
			return false;
		}
		
		if (idIndirizzo == null ? _cast.idIndirizzo != idIndirizzo : !idIndirizzo.equals( _cast.idIndirizzo )) {
			return false;
		}
		
		if (descIndirizzo == null ? _cast.descIndirizzo != descIndirizzo : !descIndirizzo.equals( _cast.descIndirizzo )) {
			return false;
		}
		
		if (cap == null ? _cast.cap != cap : !cap.equals( _cast.cap )) {
			return false;
		}
		
		if (idComune == null ? _cast.idComune != idComune : !idComune.equals( _cast.idComune )) {
			return false;
		}
		
		if (descComune == null ? _cast.descComune != descComune : !descComune.equals( _cast.descComune )) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (fax == null ? _cast.fax != fax : !fax.equals( _cast.fax )) {
			return false;
		}
		
		if (cell == null ? _cast.cell != cell : !cell.equals( _cast.cell )) {
			return false;
		}
		
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
			return false;
		}
		
		if (idRegione == null ? _cast.idRegione != idRegione : !idRegione.equals( _cast.idRegione )) {
			return false;
		}
		
		if (descRegione == null ? _cast.descRegione != descRegione : !descRegione.equals( _cast.descRegione )) {
			return false;
		}
		
		if (idProvincia == null ? _cast.idProvincia != idProvincia : !idProvincia.equals( _cast.idProvincia )) {
			return false;
		}
		
		if (descProvincia == null ? _cast.descProvincia != descProvincia : !descProvincia.equals( _cast.descProvincia )) {
			return false;
		}
		
		if (numCivico == null ? _cast.numCivico != numCivico : !numCivico.equals( _cast.numCivico )) {
			return false;
		}
		
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	@Override
	public int hashCode()
	{
		int _hashCode = 0;
		if (fkTipoRuolo != null) {
			_hashCode = 29 * _hashCode + fkTipoRuolo.hashCode();
		}
		
		if (nome != null) {
			_hashCode = 29 * _hashCode + nome.hashCode();
		}
		
		if (cognome != null) {
			_hashCode = 29 * _hashCode + cognome.hashCode();
		}
		
		if (idIndirizzo != null) {
			_hashCode = 29 * _hashCode + idIndirizzo.hashCode();
		}
		
		if (descIndirizzo != null) {
			_hashCode = 29 * _hashCode + descIndirizzo.hashCode();
		}
		
		if (cap != null) {
			_hashCode = 29 * _hashCode + cap.hashCode();
		}
		
		if (idComune != null) {
			_hashCode = 29 * _hashCode + idComune.hashCode();
		}
		
		if (descComune != null) {
			_hashCode = 29 * _hashCode + descComune.hashCode();
		}
		
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		if (fax != null) {
			_hashCode = 29 * _hashCode + fax.hashCode();
		}
		
		if (cell != null) {
			_hashCode = 29 * _hashCode + cell.hashCode();
		}
		
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
		}
		
		if (idRegione != null) {
			_hashCode = 29 * _hashCode + idRegione.hashCode();
		}
		
		if (descRegione != null) {
			_hashCode = 29 * _hashCode + descRegione.hashCode();
		}
		
		if (idProvincia != null) {
			_hashCode = 29 * _hashCode + idProvincia.hashCode();
		}
		
		if (descProvincia != null) {
			_hashCode = 29 * _hashCode + descProvincia.hashCode();
		}
		
		if (numCivico != null) {
			_hashCode = 29 * _hashCode + numCivico.hashCode();
		}
		
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (progrCertificato != null) {
			_hashCode = 29 * _hashCode + progrCertificato.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTRuoliEdificioPk
	 */
	public SiceeTRuoliEdificioPk createPk()
	{
		return new SiceeTRuoliEdificioPk(idCertificatore, progrCertificato, anno, fkTipoRuolo);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTRuoliEdificio: " );
		ret.append( "fkTipoRuolo=" + fkTipoRuolo );
		ret.append( ", nome=" + nome );
		ret.append( ", cognome=" + cognome );
		ret.append( ", idIndirizzo=" + idIndirizzo );
		ret.append( ", descIndirizzo=" + descIndirizzo );
		ret.append( ", cap=" + cap );
		ret.append( ", idComune=" + idComune );
		ret.append( ", descComune=" + descComune );
		ret.append( ", telefono=" + telefono );
		ret.append( ", fax=" + fax );
		ret.append( ", cell=" + cell );
		ret.append( ", email=" + email );
		ret.append( ", idRegione=" + idRegione );
		ret.append( ", descRegione=" + descRegione );
		ret.append( ", idProvincia=" + idProvincia );
		ret.append( ", descProvincia=" + descProvincia );
		ret.append( ", numCivico=" + numCivico );
		ret.append( ", idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		return ret.toString();
	}

}
