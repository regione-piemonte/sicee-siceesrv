/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTitoloDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTitolo;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTitoloPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTitoloDaoException;
import java.util.List;

public interface SiceeDTitoloDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDTitoloPk
	 */
	public SiceeDTitoloPk insert(SiceeDTitolo dto);

	/** 
	 * Updates a single row in the SICEE_D_TITOLO table.
	 */
	public void update(SiceeDTitoloPk pk, SiceeDTitolo dto) throws SiceeDTitoloDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_TITOLO table.
	 */
	public void delete(SiceeDTitoloPk pk) throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria 'ID_TITOLO = :idTitolo'.
	 */
	public SiceeDTitolo findByPrimaryKey(String idTitolo) throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria ''.
	 */
	public List<SiceeDTitolo> findAll() throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria 'ID_TITOLO = :idTitolo'.
	 */
	public List<SiceeDTitolo> findWhereIdTitoloEquals(String idTitolo) throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria 'DESCR = :descr'.
	 */
	public List<SiceeDTitolo> findWhereDescrEquals(String descr) throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria 'FLG_EDIFICI = :flgEdifici'.
	 */
	public List<SiceeDTitolo> findWhereFlgEdificiEquals(String flgEdifici) throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria 'FLG_IMPIANTI = :flgImpianti'.
	 */
	public List<SiceeDTitolo> findWhereFlgImpiantiEquals(String flgImpianti) throws SiceeDTitoloDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TITOLO table that match the criteria 'SIGLA = :sigla'.
	 */
	public List<SiceeDTitolo> findWhereSiglaEquals(String sigla) throws SiceeDTitoloDaoException;

	/** 
	 * Returns the rows from the SICEE_D_TITOLO table that matches the specified primary-key value.
	 */
	public SiceeDTitolo findByPrimaryKey(SiceeDTitoloPk pk) throws SiceeDTitoloDaoException;

}
