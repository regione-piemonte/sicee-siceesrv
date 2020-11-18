/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoPagamentoDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoPagamento;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoPagamentoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTipoPagamentoDaoException;
import java.util.List;

public interface SiceeDTipoPagamentoDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDTipoPagamentoPk
	 */
	public SiceeDTipoPagamentoPk insert(SiceeDTipoPagamento dto);

	/** 
	 * Updates a single row in the SICEE_D_TIPO_PAGAMENTO table.
	 */
	public void update(SiceeDTipoPagamentoPk pk, SiceeDTipoPagamento dto) throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_TIPO_PAGAMENTO table.
	 */
	public void delete(SiceeDTipoPagamentoPk pk) throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_PAGAMENTO table that match the criteria 'ID_TIPO_PAGAMENTO = :idTipoPagamento'.
	 */
	public SiceeDTipoPagamento findByPrimaryKey(Integer idTipoPagamento) throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_PAGAMENTO table that match the criteria ''.
	 */
	public List<SiceeDTipoPagamento> findAll() throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_PAGAMENTO table that match the criteria 'ID_TIPO_PAGAMENTO = :idTipoPagamento'.
	 */
	public List<SiceeDTipoPagamento> findWhereIdTipoPagamentoEquals(Integer idTipoPagamento) throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_PAGAMENTO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDTipoPagamento> findWhereDescrEquals(String descr) throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_PAGAMENTO table that match the criteria 'FLG_PAGAM_ATTIVO = :flgPagamAttivo'.
	 */
	public List<SiceeDTipoPagamento> findWhereFlgPagamAttivoEquals(String flgPagamAttivo) throws SiceeDTipoPagamentoDaoException;

	/** 
	 * Returns the rows from the SICEE_D_TIPO_PAGAMENTO table that matches the specified primary-key value.
	 */
	public SiceeDTipoPagamento findByPrimaryKey(SiceeDTipoPagamentoPk pk) throws SiceeDTipoPagamentoDaoException;

}
