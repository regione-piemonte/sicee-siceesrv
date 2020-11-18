/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDTipoDocumento implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8571047028278200371L;

	/** 
	 * This attribute maps to the column ID_TIPO_DOC in the SICEE_D_TIPO_DOCUMENTO table.
	 */
	protected Integer idTipoDoc;

	/** 
	 * This attribute maps to the column DS_TIPO_DOC in the SICEE_D_TIPO_DOCUMENTO table.
	 */
	protected String dsTipoDoc;

	/**
	 * Method 'SiceeDTipoDocumento'
	 * 
	 */
	public SiceeDTipoDocumento()
	{
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
	 * Method 'getDsTipoDoc'
	 * 
	 * @return String
	 */
	public String getDsTipoDoc()
	{
		return dsTipoDoc;
	}

	/**
	 * Method 'setDsTipoDoc'
	 * 
	 * @param dsTipoDoc
	 */
	public void setDsTipoDoc(String dsTipoDoc)
	{
		this.dsTipoDoc = dsTipoDoc;
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
		
		if (!(_other instanceof SiceeDTipoDocumento)) {
			return false;
		}
		
		final SiceeDTipoDocumento _cast = (SiceeDTipoDocumento) _other;
		if (idTipoDoc == null ? _cast.idTipoDoc != idTipoDoc : !idTipoDoc.equals( _cast.idTipoDoc )) {
			return false;
		}
		
		if (dsTipoDoc == null ? _cast.dsTipoDoc != dsTipoDoc : !dsTipoDoc.equals( _cast.dsTipoDoc )) {
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
		if (idTipoDoc != null) {
			_hashCode = 29 * _hashCode + idTipoDoc.hashCode();
		}
		
		if (dsTipoDoc != null) {
			_hashCode = 29 * _hashCode + dsTipoDoc.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDTipoDocumentoPk
	 */
	public SiceeDTipoDocumentoPk createPk()
	{
		return new SiceeDTipoDocumentoPk(idTipoDoc);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoDocumento: " );
		ret.append( "idTipoDoc=" + idTipoDoc );
		ret.append( ", dsTipoDoc=" + dsTipoDoc );
		return ret.toString();
	}

}
