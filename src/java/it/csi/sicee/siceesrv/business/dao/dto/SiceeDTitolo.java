/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDTitolo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4526795288157898096L;

	/** 
	 * This attribute maps to the column ID_TITOLO in the SICEE_D_TITOLO table.
	 */
	protected String idTitolo;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_TITOLO table.
	 */
	protected String descr;

	/** 
	 * This attribute maps to the column FLG_EDIFICI in the SICEE_D_TITOLO table.
	 */
	protected String flgEdifici;

	/** 
	 * This attribute maps to the column FLG_IMPIANTI in the SICEE_D_TITOLO table.
	 */
	protected String flgImpianti;

	/** 
	 * This attribute maps to the column SIGLA in the SICEE_D_TITOLO table.
	 */
	protected String sigla;

	/**
	 * Method 'SiceeDTitolo'
	 * 
	 */
	public SiceeDTitolo()
	{
	}

	/**
	 * Method 'getIdTitolo'
	 * 
	 * @return String
	 */
	public String getIdTitolo()
	{
		return idTitolo;
	}

	/**
	 * Method 'setIdTitolo'
	 * 
	 * @param idTitolo
	 */
	public void setIdTitolo(String idTitolo)
	{
		this.idTitolo = idTitolo;
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
	 * Method 'getFlgEdifici'
	 * 
	 * @return String
	 */
	public String getFlgEdifici()
	{
		return flgEdifici;
	}

	/**
	 * Method 'setFlgEdifici'
	 * 
	 * @param flgEdifici
	 */
	public void setFlgEdifici(String flgEdifici)
	{
		this.flgEdifici = flgEdifici;
	}

	/**
	 * Method 'getFlgImpianti'
	 * 
	 * @return String
	 */
	public String getFlgImpianti()
	{
		return flgImpianti;
	}

	/**
	 * Method 'setFlgImpianti'
	 * 
	 * @param flgImpianti
	 */
	public void setFlgImpianti(String flgImpianti)
	{
		this.flgImpianti = flgImpianti;
	}

	/**
	 * Method 'getSigla'
	 * 
	 * @return String
	 */
	public String getSigla()
	{
		return sigla;
	}

	/**
	 * Method 'setSigla'
	 * 
	 * @param sigla
	 */
	public void setSigla(String sigla)
	{
		this.sigla = sigla;
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
		
		if (!(_other instanceof SiceeDTitolo)) {
			return false;
		}
		
		final SiceeDTitolo _cast = (SiceeDTitolo) _other;
		if (idTitolo == null ? _cast.idTitolo != idTitolo : !idTitolo.equals( _cast.idTitolo )) {
			return false;
		}
		
		if (descr == null ? _cast.descr != descr : !descr.equals( _cast.descr )) {
			return false;
		}
		
		if (flgEdifici == null ? _cast.flgEdifici != flgEdifici : !flgEdifici.equals( _cast.flgEdifici )) {
			return false;
		}
		
		if (flgImpianti == null ? _cast.flgImpianti != flgImpianti : !flgImpianti.equals( _cast.flgImpianti )) {
			return false;
		}
		
		if (sigla == null ? _cast.sigla != sigla : !sigla.equals( _cast.sigla )) {
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
		if (idTitolo != null) {
			_hashCode = 29 * _hashCode + idTitolo.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		if (flgEdifici != null) {
			_hashCode = 29 * _hashCode + flgEdifici.hashCode();
		}
		
		if (flgImpianti != null) {
			_hashCode = 29 * _hashCode + flgImpianti.hashCode();
		}
		
		if (sigla != null) {
			_hashCode = 29 * _hashCode + sigla.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDTitoloPk
	 */
	public SiceeDTitoloPk createPk()
	{
		return new SiceeDTitoloPk(idTitolo);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeDTitolo: " );
		ret.append( "idTitolo=" + idTitolo );
		ret.append( ", descr=" + descr );
		ret.append( ", flgEdifici=" + flgEdifici );
		ret.append( ", flgImpianti=" + flgImpianti );
		ret.append( ", sigla=" + sigla );
		return ret.toString();
	}

}
