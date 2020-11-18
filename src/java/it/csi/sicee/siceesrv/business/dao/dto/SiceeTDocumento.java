/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class SiceeTDocumento implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2674911102344792052L;

	/** 
	 * This attribute maps to the column ID_DOCUMENTO in the SICEE_T_DOCUMENTO table.
	 */
	protected Integer idDocumento;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_DOCUMENTO table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column ID_TIPO_DOC in the SICEE_T_DOCUMENTO table.
	 */
	protected Integer idTipoDoc;

	/** 
	 * This attribute maps to the column IDENTIFIC_DOC in the SICEE_T_DOCUMENTO table.
	 */
	protected String identificDoc;

	/** 
	 * This attribute maps to the column DT_UPLOAD in the SICEE_T_DOCUMENTO table.
	 */
	protected Date dtUpload;

	/**
	 * Method 'SiceeTDocumento'
	 * 
	 */
	public SiceeTDocumento()
	{
	}

	/**
	 * Method 'getIdDocumento'
	 * 
	 * @return Integer
	 */
	public Integer getIdDocumento()
	{
		return idDocumento;
	}

	/**
	 * Method 'setIdDocumento'
	 * 
	 * @param idDocumento
	 */
	public void setIdDocumento(Integer idDocumento)
	{
		this.idDocumento = idDocumento;
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
	 * Method 'getIdTipoDoc'
	 * 
	 * @return Integer
	 */
	public Integer getIdTipoDoc()
	{
		return idTipoDoc;
	}

	/**
	 * Method 'setIdTipoDoc'
	 * 
	 * @param idTipoDoc
	 */
	public void setIdTipoDoc(Integer idTipoDoc)
	{
		this.idTipoDoc = idTipoDoc;
	}

	/**
	 * Method 'getIdentificDoc'
	 * 
	 * @return String
	 */
	public String getIdentificDoc()
	{
		return identificDoc;
	}

	/**
	 * Method 'setIdentificDoc'
	 * 
	 * @param identificDoc
	 */
	public void setIdentificDoc(String identificDoc)
	{
		this.identificDoc = identificDoc;
	}

	/**
	 * Method 'getDtUpload'
	 * 
	 * @return Date
	 */
	public Date getDtUpload()
	{
		return dtUpload;
	}

	/**
	 * Method 'setDtUpload'
	 * 
	 * @param dtUpload
	 */
	public void setDtUpload(Date dtUpload)
	{
		this.dtUpload = dtUpload;
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
		
		if (!(_other instanceof SiceeTDocumento)) {
			return false;
		}
		
		final SiceeTDocumento _cast = (SiceeTDocumento) _other;
		if (idDocumento == null ? _cast.idDocumento != idDocumento : !idDocumento.equals( _cast.idDocumento )) {
			return false;
		}
		
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (idTipoDoc == null ? _cast.idTipoDoc != idTipoDoc : !idTipoDoc.equals( _cast.idTipoDoc )) {
			return false;
		}
		
		if (identificDoc == null ? _cast.identificDoc != identificDoc : !identificDoc.equals( _cast.identificDoc )) {
			return false;
		}
		
		if (dtUpload == null ? _cast.dtUpload != dtUpload : !dtUpload.equals( _cast.dtUpload )) {
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
		if (idDocumento != null) {
			_hashCode = 29 * _hashCode + idDocumento.hashCode();
		}
		
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (idTipoDoc != null) {
			_hashCode = 29 * _hashCode + idTipoDoc.hashCode();
		}
		
		if (identificDoc != null) {
			_hashCode = 29 * _hashCode + identificDoc.hashCode();
		}
		
		if (dtUpload != null) {
			_hashCode = 29 * _hashCode + dtUpload.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTDocumentoPk
	 */
	public SiceeTDocumentoPk createPk()
	{
		return new SiceeTDocumentoPk(idDocumento);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumento: " );
		ret.append( "idDocumento=" + idDocumento );
		ret.append( ", idCertificatore=" + idCertificatore );
		ret.append( ", idTipoDoc=" + idTipoDoc );
		ret.append( ", identificDoc=" + identificDoc );
		ret.append( ", dtUpload=" + dtUpload );
		return ret.toString();
	}

}
