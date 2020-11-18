/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTNotaioDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaioPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTNotaioDaoException;
import java.util.List;

public interface SiceeTNotaioDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTNotaioPk
	 */
	public SiceeTNotaioPk insert(SiceeTNotaio dto);

	/** 
	 * Updates a single row in the SICEE_T_NOTAIO table.
	 */
	public void update(SiceeTNotaioPk pk, SiceeTNotaio dto) throws SiceeTNotaioDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_NOTAIO table.
	 */
	public void delete(SiceeTNotaioPk pk) throws SiceeTNotaioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'ID_NOTAIO = :idNotaio'.
	 */
	public SiceeTNotaio findByPrimaryKey(Long idNotaio) throws SiceeTNotaioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria ''.
	 */
	public List<SiceeTNotaio> findAll() throws SiceeTNotaioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'NOME = :nome'.
	 */
	public List<SiceeTNotaio> findWhereNomeEquals(String nome) throws SiceeTNotaioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'COGNOME = :cognome'.
	 */
	public List<SiceeTNotaio> findWhereCognomeEquals(String cognome) throws SiceeTNotaioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'CODICE_FISCALE = :codiceFiscale'.
	 */
	public List<SiceeTNotaio> findWhereCodiceFiscaleEquals(String codiceFiscale) throws SiceeTNotaioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'EMAIL = :email'.
	 */
	public SiceeTNotaio findWhereEmailEquals(String email) throws SiceeTNotaioDaoException;

	/** 
	 * Returns the rows from the SICEE_T_NOTAIO table that matches the specified primary-key value.
	 */
	public SiceeTNotaio findByPrimaryKey(SiceeTNotaioPk pk) throws SiceeTNotaioDaoException;

}
