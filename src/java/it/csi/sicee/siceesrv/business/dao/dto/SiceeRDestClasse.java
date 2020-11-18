/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeRDestClasse implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4721787304548353593L;

	/** 
	 * This attribute maps to the column ID_CLASSE in the SICEE_R_DEST_CLASSE table.
	 */
	protected Integer idClasse;

	/** 
	 * This attribute maps to the column ID_DEST_USO in the SICEE_R_DEST_CLASSE table.
	 */
	protected Integer idDestUso;

	/** 
	 * This attribute maps to the column MIN in the SICEE_R_DEST_CLASSE table.
	 */
	protected Integer min;

	/** 
	 * This attribute maps to the column MAX in the SICEE_R_DEST_CLASSE table.
	 */
	protected Integer max;

	/**
	 * Method 'SiceeRDestClasse'
	 * 
	 */
	public SiceeRDestClasse()
	{
	}

	/**
	 * Method 'getIdClasse'
	 * 
	 * @return Integer
	 */
	public Integer getIdClasse()
	{
		return idClasse;
	}

	/**
	 * Method 'setIdClasse'
	 * 
	 * @param idClasse
	 */
	public void setIdClasse(Integer idClasse)
	{
		this.idClasse = idClasse;
	}

	/**
	 * Method 'getIdDestUso'
	 * 
	 * @return Integer
	 */
	public Integer getIdDestUso()
	{
		return idDestUso;
	}

	/**
	 * Method 'setIdDestUso'
	 * 
	 * @param idDestUso
	 */
	public void setIdDestUso(Integer idDestUso)
	{
		this.idDestUso = idDestUso;
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
		
		if (!(_other instanceof SiceeRDestClasse)) {
			return false;
		}
		
		final SiceeRDestClasse _cast = (SiceeRDestClasse) _other;
		if (idClasse == null ? _cast.idClasse != idClasse : !idClasse.equals( _cast.idClasse )) {
			return false;
		}
		
		if (idDestUso == null ? _cast.idDestUso != idDestUso : !idDestUso.equals( _cast.idDestUso )) {
			return false;
		}
		
		if (min == null ? _cast.min != min : !min.equals( _cast.min )) {
			return false;
		}
		
		if (max == null ? _cast.max != max : !max.equals( _cast.max )) {
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
		if (idClasse != null) {
			_hashCode = 29 * _hashCode + idClasse.hashCode();
		}
		
		if (idDestUso != null) {
			_hashCode = 29 * _hashCode + idDestUso.hashCode();
		}
		
		if (min != null) {
			_hashCode = 29 * _hashCode + min.hashCode();
		}
		
		if (max != null) {
			_hashCode = 29 * _hashCode + max.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeRDestClassePk
	 */
	public SiceeRDestClassePk createPk()
	{
		return new SiceeRDestClassePk(idClasse, idDestUso);
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
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeRDestClasse: " );
		ret.append( "idClasse=" + idClasse );
		ret.append( ", idDestUso=" + idDestUso );
		ret.append( ", min=" + min );
		ret.append( ", max=" + max );
		return ret.toString();
	}

}
