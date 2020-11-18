/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTSostituzione implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2921049688108288663L;

	/** 
	 * This attribute maps to the column ID_SOSTITUZIONE in the SICEE_T_SOSTITUZIONE table.
	 */
	protected Long idSostituzione;

	/** 
	 * This attribute maps to the column PROGR_SOSTITUZIONE in the SICEE_T_SOSTITUZIONE table.
	 */
	protected Long progrSostituzione;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE_OLD in the SICEE_T_SOSTITUZIONE table.
	 */
	protected String idCertificatoreOld;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO_OLD in the SICEE_T_SOSTITUZIONE table.
	 */
	protected String progrCertificatoOld;

	/** 
	 * This attribute maps to the column ANNO_OLD in the SICEE_T_SOSTITUZIONE table.
	 */
	protected String annoOld;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE_NEW in the SICEE_T_SOSTITUZIONE table.
	 */
	protected String idCertificatoreNew;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO_NEW in the SICEE_T_SOSTITUZIONE table.
	 */
	protected String progrCertificatoNew;

	/** 
	 * This attribute maps to the column ANNO_NEW in the SICEE_T_SOSTITUZIONE table.
	 */
	protected String annoNew;

	/**
	 * Method 'SiceeTSostituzione'
	 * 
	 */
	public SiceeTSostituzione()
	{
	}

	/**
	 * Method 'getIdSostituzione'
	 * 
	 * @return Long
	 */
	public Long getIdSostituzione()
	{
		return idSostituzione;
	}

	/**
	 * Method 'setIdSostituzione'
	 * 
	 * @param idSostituzione
	 */
	public void setIdSostituzione(Long idSostituzione)
	{
		this.idSostituzione = idSostituzione;
	}

	/**
	 * Method 'getProgrSostituzione'
	 * 
	 * @return Long
	 */
	public Long getProgrSostituzione()
	{
		return progrSostituzione;
	}

	/**
	 * Method 'setProgrSostituzione'
	 * 
	 * @param progrSostituzione
	 */
	public void setProgrSostituzione(Long progrSostituzione)
	{
		this.progrSostituzione = progrSostituzione;
	}

	/**
	 * Method 'getIdCertificatoreOld'
	 * 
	 * @return String
	 */
	public String getIdCertificatoreOld()
	{
		return idCertificatoreOld;
	}

	/**
	 * Method 'setIdCertificatoreOld'
	 * 
	 * @param idCertificatoreOld
	 */
	public void setIdCertificatoreOld(String idCertificatoreOld)
	{
		this.idCertificatoreOld = idCertificatoreOld;
	}

	/**
	 * Method 'getProgrCertificatoOld'
	 * 
	 * @return String
	 */
	public String getProgrCertificatoOld()
	{
		return progrCertificatoOld;
	}

	/**
	 * Method 'setProgrCertificatoOld'
	 * 
	 * @param progrCertificatoOld
	 */
	public void setProgrCertificatoOld(String progrCertificatoOld)
	{
		this.progrCertificatoOld = progrCertificatoOld;
	}

	/**
	 * Method 'getAnnoOld'
	 * 
	 * @return String
	 */
	public String getAnnoOld()
	{
		return annoOld;
	}

	/**
	 * Method 'setAnnoOld'
	 * 
	 * @param annoOld
	 */
	public void setAnnoOld(String annoOld)
	{
		this.annoOld = annoOld;
	}

	/**
	 * Method 'getIdCertificatoreNew'
	 * 
	 * @return String
	 */
	public String getIdCertificatoreNew()
	{
		return idCertificatoreNew;
	}

	/**
	 * Method 'setIdCertificatoreNew'
	 * 
	 * @param idCertificatoreNew
	 */
	public void setIdCertificatoreNew(String idCertificatoreNew)
	{
		this.idCertificatoreNew = idCertificatoreNew;
	}

	/**
	 * Method 'getProgrCertificatoNew'
	 * 
	 * @return String
	 */
	public String getProgrCertificatoNew()
	{
		return progrCertificatoNew;
	}

	/**
	 * Method 'setProgrCertificatoNew'
	 * 
	 * @param progrCertificatoNew
	 */
	public void setProgrCertificatoNew(String progrCertificatoNew)
	{
		this.progrCertificatoNew = progrCertificatoNew;
	}

	/**
	 * Method 'getAnnoNew'
	 * 
	 * @return String
	 */
	public String getAnnoNew()
	{
		return annoNew;
	}

	/**
	 * Method 'setAnnoNew'
	 * 
	 * @param annoNew
	 */
	public void setAnnoNew(String annoNew)
	{
		this.annoNew = annoNew;
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
		
		if (!(_other instanceof SiceeTSostituzione)) {
			return false;
		}
		
		final SiceeTSostituzione _cast = (SiceeTSostituzione) _other;
		if (idSostituzione == null ? _cast.idSostituzione != idSostituzione : !idSostituzione.equals( _cast.idSostituzione )) {
			return false;
		}
		
		if (progrSostituzione == null ? _cast.progrSostituzione != progrSostituzione : !progrSostituzione.equals( _cast.progrSostituzione )) {
			return false;
		}
		
		if (idCertificatoreOld == null ? _cast.idCertificatoreOld != idCertificatoreOld : !idCertificatoreOld.equals( _cast.idCertificatoreOld )) {
			return false;
		}
		
		if (progrCertificatoOld == null ? _cast.progrCertificatoOld != progrCertificatoOld : !progrCertificatoOld.equals( _cast.progrCertificatoOld )) {
			return false;
		}
		
		if (annoOld == null ? _cast.annoOld != annoOld : !annoOld.equals( _cast.annoOld )) {
			return false;
		}
		
		if (idCertificatoreNew == null ? _cast.idCertificatoreNew != idCertificatoreNew : !idCertificatoreNew.equals( _cast.idCertificatoreNew )) {
			return false;
		}
		
		if (progrCertificatoNew == null ? _cast.progrCertificatoNew != progrCertificatoNew : !progrCertificatoNew.equals( _cast.progrCertificatoNew )) {
			return false;
		}
		
		if (annoNew == null ? _cast.annoNew != annoNew : !annoNew.equals( _cast.annoNew )) {
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
		if (idSostituzione != null) {
			_hashCode = 29 * _hashCode + idSostituzione.hashCode();
		}
		
		if (progrSostituzione != null) {
			_hashCode = 29 * _hashCode + progrSostituzione.hashCode();
		}
		
		if (idCertificatoreOld != null) {
			_hashCode = 29 * _hashCode + idCertificatoreOld.hashCode();
		}
		
		if (progrCertificatoOld != null) {
			_hashCode = 29 * _hashCode + progrCertificatoOld.hashCode();
		}
		
		if (annoOld != null) {
			_hashCode = 29 * _hashCode + annoOld.hashCode();
		}
		
		if (idCertificatoreNew != null) {
			_hashCode = 29 * _hashCode + idCertificatoreNew.hashCode();
		}
		
		if (progrCertificatoNew != null) {
			_hashCode = 29 * _hashCode + progrCertificatoNew.hashCode();
		}
		
		if (annoNew != null) {
			_hashCode = 29 * _hashCode + annoNew.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTSostituzionePk
	 */
	public SiceeTSostituzionePk createPk()
	{
		return new SiceeTSostituzionePk(idSostituzione, progrSostituzione);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzione: " );
		ret.append( "idSostituzione=" + idSostituzione );
		ret.append( ", progrSostituzione=" + progrSostituzione );
		ret.append( ", idCertificatoreOld=" + idCertificatoreOld );
		ret.append( ", progrCertificatoOld=" + progrCertificatoOld );
		ret.append( ", annoOld=" + annoOld );
		ret.append( ", idCertificatoreNew=" + idCertificatoreNew );
		ret.append( ", progrCertificatoNew=" + progrCertificatoNew );
		ret.append( ", annoNew=" + annoNew );
		return ret.toString();
	}

}
