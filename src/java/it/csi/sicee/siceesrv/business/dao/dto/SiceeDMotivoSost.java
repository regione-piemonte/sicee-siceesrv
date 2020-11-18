/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;


public class SiceeDMotivoSost implements Serializable
{
	/** 
	 * This attribute maps to the column ID_MOTIVO_SOST in the SICEE_D_MOTIVO_SOST table.
	 */
	protected Integer idMotivoSost;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_MOTIVO_SOST table.
	 */
	protected String descr;

	/** 
	 * This attribute maps to the column MIN in the SICEE_D_MOTIVO_SOST table.
	 */
	protected Integer min;

	/** 
	 * This attribute maps to the column MAX in the SICEE_D_MOTIVO_SOST table.
	 */
	protected Integer max;

	/** 
	 * This attribute maps to the column FLG_VISIBILE_COMBO in the SICEE_D_MOTIVO_SOST table.
	 */
	protected String flgCombo;

	/**
	 * Method 'SiceeDMotivoSost'
	 * 
	 */
	public SiceeDMotivoSost()
	{
	}

	/**
	 * Method 'getIdMotivoSost'
	 * 
	 * @return Integer
	 */
	public Integer getIdMotivoSost()
	{
		return idMotivoSost;
	}

	/**
	 * Method 'setIdMotivoSost'
	 * 
	 * @param idMotivoSost
	 */
	public void setIdMotivoSost(Integer idMotivoSost)
	{
		this.idMotivoSost = idMotivoSost;
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
	 * Method 'getMin'
	 * 
	 * @return Integer
	 */
	public Integer getMin()
	{
		return min;
	}

	/**
	 * Method 'setMin'
	 * 
	 * @param min
	 */
	public void setMin(Integer min)
	{
		this.min = min;
	}

	/**
	 * Method 'getMax'
	 * 
	 * @return Integer
	 */
	public Integer getMax()
	{
		return max;
	}

	/**
	 * Method 'setMax'
	 * 
	 * @param max
	 */
	public void setMax(Integer max)
	{
		this.max = max;
	}

	/**
	 * Method 'getFlgCombo'
	 * 
	 * @return String
	 */
	public String getFlgCombo()
	{
		return flgCombo;
	}

	/**
	 * Method 'setFlgCombo'
	 * 
	 * @param flgCombo
	 */
	public void setFlgCombo(String flgCombo)
	{
		this.flgCombo = flgCombo;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SiceeDMotivoSost)) {
			return false;
		}
		
		final SiceeDMotivoSost _cast = (SiceeDMotivoSost) _other;
		if (idMotivoSost == null ? _cast.idMotivoSost != idMotivoSost : !idMotivoSost.equals( _cast.idMotivoSost )) {
			return false;
		}
		
		if (descr == null ? _cast.descr != descr : !descr.equals( _cast.descr )) {
			return false;
		}
		
		if (min == null ? _cast.min != min : !min.equals( _cast.min )) {
			return false;
		}
		
		if (max == null ? _cast.max != max : !max.equals( _cast.max )) {
			return false;
		}
		
		if (flgCombo == null ? _cast.flgCombo != flgCombo : !flgCombo.equals( _cast.flgCombo )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idMotivoSost != null) {
			_hashCode = 29 * _hashCode + idMotivoSost.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		if (min != null) {
			_hashCode = 29 * _hashCode + min.hashCode();
		}
		
		if (max != null) {
			_hashCode = 29 * _hashCode + max.hashCode();
		}
		
		if (flgCombo != null) {
			_hashCode = 29 * _hashCode + flgCombo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDMotivoSostPk
	 */
	public SiceeDMotivoSostPk createPk()
	{
		return new SiceeDMotivoSostPk(idMotivoSost);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeDMotivoSost: " );
		ret.append( "idMotivoSost=" + idMotivoSost );
		ret.append( ", descr=" + descr );
		ret.append( ", min=" + min );
		ret.append( ", max=" + max );
		ret.append( ", flgCombo=" + flgCombo );
		return ret.toString();
	}

}
