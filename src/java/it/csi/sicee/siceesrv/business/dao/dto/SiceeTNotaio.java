/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTNotaio implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4119883255727967023L;

	/** 
	 * This attribute maps to the column ID_NOTAIO in the SICEE_T_NOTAIO table.
	 */
	protected Long idNotaio;

	/** 
	 * This attribute maps to the column NOME in the SICEE_T_NOTAIO table.
	 */
	protected String nome;

	/** 
	 * This attribute maps to the column COGNOME in the SICEE_T_NOTAIO table.
	 */
	protected String cognome;

	/** 
	 * This attribute maps to the column CODICE_FISCALE in the SICEE_T_NOTAIO table.
	 */
	protected String codiceFiscale;

	/** 
	 * This attribute maps to the column EMAIL in the SICEE_T_NOTAIO table.
	 */
	protected String email;

	/**
	 * Method 'SiceeTNotaio'
	 * 
	 */
	public SiceeTNotaio()
	{
	}

	/**
	 * Method 'getIdNotaio'
	 * 
	 * @return Long
	 */
	public Long getIdNotaio()
	{
		return idNotaio;
	}

	/**
	 * Method 'setIdNotaio'
	 * 
	 * @param idNotaio
	 */
	public void setIdNotaio(Long idNotaio)
	{
		this.idNotaio = idNotaio;
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
	 * Method 'getCodiceFiscale'
	 * 
	 * @return String
	 */
	public String getCodiceFiscale()
	{
		return codiceFiscale;
	}

	/**
	 * Method 'setCodiceFiscale'
	 * 
	 * @param codiceFiscale
	 */
	public void setCodiceFiscale(String codiceFiscale)
	{
		this.codiceFiscale = codiceFiscale;
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
		
		if (!(_other instanceof SiceeTNotaio)) {
			return false;
		}
		
		final SiceeTNotaio _cast = (SiceeTNotaio) _other;
		if (idNotaio == null ? _cast.idNotaio != idNotaio : !idNotaio.equals( _cast.idNotaio )) {
			return false;
		}
		
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
			return false;
		}
		
		if (cognome == null ? _cast.cognome != cognome : !cognome.equals( _cast.cognome )) {
			return false;
		}
		
		if (codiceFiscale == null ? _cast.codiceFiscale != codiceFiscale : !codiceFiscale.equals( _cast.codiceFiscale )) {
			return false;
		}
		
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
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
		if (idNotaio != null) {
			_hashCode = 29 * _hashCode + idNotaio.hashCode();
		}
		
		if (nome != null) {
			_hashCode = 29 * _hashCode + nome.hashCode();
		}
		
		if (cognome != null) {
			_hashCode = 29 * _hashCode + cognome.hashCode();
		}
		
		if (codiceFiscale != null) {
			_hashCode = 29 * _hashCode + codiceFiscale.hashCode();
		}
		
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTNotaioPk
	 */
	public SiceeTNotaioPk createPk()
	{
		return new SiceeTNotaioPk(idNotaio);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaio: " );
		ret.append( "idNotaio=" + idNotaio );
		ret.append( ", nome=" + nome );
		ret.append( ", cognome=" + cognome );
		ret.append( ", codiceFiscale=" + codiceFiscale );
		ret.append( ", email=" + email );
		return ret.toString();
	}

}
