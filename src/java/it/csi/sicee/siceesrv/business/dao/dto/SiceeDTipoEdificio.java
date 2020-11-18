/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDTipoEdificio implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6456047369525066124L;

	/** 
	 * This attribute maps to the column ID_TIPO_EDIFICIO in the SICEE_D_TIPO_EDIFICIO table.
	 */
	protected Integer idTipoEdificio;

	/** 
	 * This attribute maps to the column FK_TIPO_IMPIANTO in the SICEE_D_TIPO_EDIFICIO table.
	 */
	protected Integer fkTipoImpianto;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_TIPO_EDIFICIO table.
	 */
	protected String descr;

	/**
	 * Method 'SiceeDTipoEdificio'
	 * 
	 */
	public SiceeDTipoEdificio()
	{
	}

	/**
	 * Method 'getIdTipoEdificio'
	 * 
	 * @return Integer
	 */
	public Integer getIdTipoEdificio()
	{
		return idTipoEdificio;
	}

	/**
	 * Method 'setIdTipoEdificio'
	 * 
	 * @param idTipoEdificio
	 */
	public void setIdTipoEdificio(Integer idTipoEdificio)
	{
		this.idTipoEdificio = idTipoEdificio;
	}

	/**
	 * Method 'getFkTipoImpianto'
	 * 
	 * @return Integer
	 */
	public Integer getFkTipoImpianto()
	{
		return fkTipoImpianto;
	}

	/**
	 * Method 'setFkTipoImpianto'
	 * 
	 * @param fkTipoImpianto
	 */
	public void setFkTipoImpianto(Integer fkTipoImpianto)
	{
		this.fkTipoImpianto = fkTipoImpianto;
	}

	/**
	 * Method 'getDescr'
	 * 
	 * @return String
	 */
	public String getDescr()
	{
		return descr;
	}

	/**
	 * Method 'setDescr'
	 * 
	 * @param descr
	 */
	public void setDescr(String descr)
	{
		this.descr = descr;
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
		
		if (!(_other instanceof SiceeDTipoEdificio)) {
			return false;
		}
		
		final SiceeDTipoEdificio _cast = (SiceeDTipoEdificio) _other;
		if (idTipoEdificio == null ? _cast.idTipoEdificio != idTipoEdificio : !idTipoEdificio.equals( _cast.idTipoEdificio )) {
			return false;
		}
		
		if (fkTipoImpianto == null ? _cast.fkTipoImpianto != fkTipoImpianto : !fkTipoImpianto.equals( _cast.fkTipoImpianto )) {
			return false;
		}
		
		if (descr == null ? _cast.descr != descr : !descr.equals( _cast.descr )) {
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
		if (idTipoEdificio != null) {
			_hashCode = 29 * _hashCode + idTipoEdificio.hashCode();
		}
		
		if (fkTipoImpianto != null) {
			_hashCode = 29 * _hashCode + fkTipoImpianto.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDTipoEdificioPk
	 */
	public SiceeDTipoEdificioPk createPk()
	{
		return new SiceeDTipoEdificioPk(idTipoEdificio);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDTipoEdificio: " );
		ret.append( "idTipoEdificio=" + idTipoEdificio );
		ret.append( ", fkTipoImpianto=" + fkTipoImpianto );
		ret.append( ", descr=" + descr );
		return ret.toString();
	}

}
