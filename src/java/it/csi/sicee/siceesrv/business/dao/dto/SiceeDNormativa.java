/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class SiceeDNormativa implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8394871063879193037L;

	/** 
	 * This attribute maps to the column ID_NORMA in the SICEE_D_NORMATIVA table.
	 */
	protected Integer idNorma;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_NORMATIVA table.
	 */
	protected String descr;

	/** 
	 * This attribute maps to the column DT_INIZIO in the SICEE_D_NORMATIVA table.
	 */
	protected Date dtInizio;

	/** 
	 * This attribute maps to the column DT_FINE in the SICEE_D_NORMATIVA table.
	 */
	protected Date dtFine;

	/**
	 * Method 'SiceeDNormativa'
	 * 
	 */
	public SiceeDNormativa()
	{
	}

	/**
	 * Method 'getIdNorma'
	 * 
	 * @return Integer
	 */
	public Integer getIdNorma()
	{
		return idNorma;
	}

	/**
	 * Method 'setIdNorma'
	 * 
	 * @param idNorma
	 */
	public void setIdNorma(Integer idNorma)
	{
		this.idNorma = idNorma;
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
	 * Method 'getDtInizio'
	 * 
	 * @return Date
	 */
	public Date getDtInizio()
	{
		return dtInizio;
	}

	/**
	 * Method 'setDtInizio'
	 * 
	 * @param dtInizio
	 */
	public void setDtInizio(Date dtInizio)
	{
		this.dtInizio = dtInizio;
	}

	/**
	 * Method 'getDtFine'
	 * 
	 * @return Date
	 */
	public Date getDtFine()
	{
		return dtFine;
	}

	/**
	 * Method 'setDtFine'
	 * 
	 * @param dtFine
	 */
	public void setDtFine(Date dtFine)
	{
		this.dtFine = dtFine;
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
		
		if (!(_other instanceof SiceeDNormativa)) {
			return false;
		}
		
		final SiceeDNormativa _cast = (SiceeDNormativa) _other;
		if (idNorma == null ? _cast.idNorma != idNorma : !idNorma.equals( _cast.idNorma )) {
			return false;
		}
		
		if (descr == null ? _cast.descr != descr : !descr.equals( _cast.descr )) {
			return false;
		}
		
		if (dtInizio == null ? _cast.dtInizio != dtInizio : !dtInizio.equals( _cast.dtInizio )) {
			return false;
		}
		
		if (dtFine == null ? _cast.dtFine != dtFine : !dtFine.equals( _cast.dtFine )) {
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
		if (idNorma != null) {
			_hashCode = 29 * _hashCode + idNorma.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		if (dtInizio != null) {
			_hashCode = 29 * _hashCode + dtInizio.hashCode();
		}
		
		if (dtFine != null) {
			_hashCode = 29 * _hashCode + dtFine.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDNormativaPk
	 */
	public SiceeDNormativaPk createPk()
	{
		return new SiceeDNormativaPk(idNorma);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeDNormativa: " );
		ret.append( "idNorma=" + idNorma );
		ret.append( ", descr=" + descr );
		ret.append( ", dtInizio=" + dtInizio );
		ret.append( ", dtFine=" + dtFine );
		return ret.toString();
	}

}
