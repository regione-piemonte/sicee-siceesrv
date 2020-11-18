/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoDocumentoDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoDocumento;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTipoDocumentoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTipoDocumentoDaoException;
import java.util.List;

public interface SiceeDTipoDocumentoDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeDTipoDocumentoPk
	 */
	public SiceeDTipoDocumentoPk insert(SiceeDTipoDocumento dto);

	/** 
	 * Updates a single row in the SICEE_D_TIPO_DOCUMENTO table.
	 */
	public void update(SiceeDTipoDocumentoPk pk, SiceeDTipoDocumento dto) throws SiceeDTipoDocumentoDaoException;

	/** 
	 * Deletes a single row in the SICEE_D_TIPO_DOCUMENTO table.
	 */
	public void delete(SiceeDTipoDocumentoPk pk) throws SiceeDTipoDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_DOCUMENTO table that match the criteria 'ID_TIPO_DOC = :idTipoDoc'.
	 */
	public SiceeDTipoDocumento findByPrimaryKey(Integer idTipoDoc) throws SiceeDTipoDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_DOCUMENTO table that match the criteria ''.
	 */
	public List<SiceeDTipoDocumento> findAll() throws SiceeDTipoDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_DOCUMENTO table that match the criteria 'ID_TIPO_DOC = :idTipoDoc'.
	 */
	public List<SiceeDTipoDocumento> findWhereIdTipoDocEquals(Integer idTipoDoc) throws SiceeDTipoDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_D_TIPO_DOCUMENTO table that match the criteria 'DS_TIPO_DOC = :dsTipoDoc'.
	 */
	public List<SiceeDTipoDocumento> findWhereDsTipoDocEquals(String dsTipoDoc) throws SiceeDTipoDocumentoDaoException;

	/** 
	 * Returns the rows from the SICEE_D_TIPO_DOCUMENTO table that matches the specified primary-key value.
	 */
	public SiceeDTipoDocumento findByPrimaryKey(SiceeDTipoDocumentoPk pk) throws SiceeDTipoDocumentoDaoException;

}
