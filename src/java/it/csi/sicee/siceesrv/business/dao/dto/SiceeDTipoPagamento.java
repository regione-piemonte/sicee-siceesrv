/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeDTipoPagamento implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1152757479219760291L;

	/** 
	 * This attribute maps to the column ID_TIPO_PAGAMENTO in the SICEE_D_TIPO_PAGAMENTO table.
	 */
	protected Integer idTipoPagamento;

	/** 
	 * This attribute maps to the column DESCR in the SICEE_D_TIPO_PAGAMENTO table.
	 */
	protected String descr;

	/** 
	 * This attribute maps to the column FLG_PAGAM_ATTIVO in the SICEE_D_TIPO_PAGAMENTO table.
	 */
	protected String flgPagamAttivo;

	/**
	 * Method 'SiceeDTipoPagamento'
	 * 
	 */
	public SiceeDTipoPagamento()
	{
	}

	/**
	 * Method 'getIdTipoPagamento'
	 * 
	 * @return Integer
	 */
	public Integer getIdTipoPagamento()
	{
		return idTipoPagamento;
	}

	/**
	 * Method 'setIdTipoPagamento'
	 * 
	 * @param idTipoPagamento
	 */
	public void setIdTipoPagamento(Integer idTipoPagamento)
	{
		this.idTipoPagamento = idTipoPagamento;
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
	 * Method 'getFlgPagamAttivo'
	 * 
	 * @return String
	 */
	public String getFlgPagamAttivo()
	{
		return flgPagamAttivo;
	}

	/**
	 * Method 'setFlgPagamAttivo'
	 * 
	 * @param flgPagamAttivo
	 */
	public void setFlgPagamAttivo(String flgPagamAttivo)
	{
		this.flgPagamAttivo = flgPagamAttivo;
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
		
		if (!(_other instanceof SiceeDTipoPagamento)) {
			return false;
		}
		
		final SiceeDTipoPagamento _cast = (SiceeDTipoPagamento) _other;
		if (idTipoPagamento == null ? _cast.idTipoPagamento != idTipoPagamento : !idTipoPagamento.equals( _cast.idTipoPagamento )) {
			return false;
		}
		
		if (descr == null ? _cast.descr != descr : !descr.equals( _cast.descr )) {
			return false;
		}
		
		if (flgPagamAttivo == null ? _cast.flgPagamAttivo != flgPagamAttivo : !flgPagamAttivo.equals( _cast.flgPagamAttivo )) {
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
		if (idTipoPagamento != null) {
			_hashCode = 29 * _hashCode + idTipoPagamento.hashCode();
		}
		
		if (descr != null) {
			_hashCode = 29 * _hashCode + descr.hashCode();
		}
		
		if (flgPagamAttivo != null) {
			_hashCode = 29 * _hashCode + flgPagamAttivo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeDTipoPagamentoPk
	 */
	public SiceeDTipoPagamentoPk createPk()
	{
		return new SiceeDTipoPagamentoPk(idTipoPagamento);
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
		ret.append( "it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoPagamento: " );
		ret.append( "idTipoPagamento=" + idTipoPagamento );
		ret.append( ", descr=" + descr );
		ret.append( ", flgPagamAttivo=" + flgPagamAttivo );
		return ret.toString();
	}

}
