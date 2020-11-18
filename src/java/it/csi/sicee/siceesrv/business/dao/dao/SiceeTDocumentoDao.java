/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDocumentoDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumento;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumentoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTDocumentoDaoException;
import java.util.Date;
import java.util.List;

public interface SiceeTDocumentoDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTDocumentoPk
	 */
	public SiceeTDocumentoPk insert(SiceeTDocumento dto);

	/** 
	 * Updates a single row in the SICEE_T_DOCUMENTO table.
	 */
	public void update(SiceeTDocumentoPk pk, SiceeTDocumento dto) throws SiceeTDocumentoDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_DOCUMENTO table.
	 */
	public void delete(SiceeTDocumentoPk pk) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_DOCUMENTO = :idDocumento'.
	 */
	public SiceeTDocumento findByPrimaryKey(Integer idDocumento) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria ''.
	 */
	public List<SiceeTDocumento> findAll() throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_TIPO_DOC = :idTipoDoc'.
	 */
	public List<SiceeTDocumento> findBySiceeDTipoDocumento(Integer idTipoDoc) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTDocumento> findBySiceeTCertificatore(String idCertificatore) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_DOCUMENTO = :idDocumento'.
	 */
	public List<SiceeTDocumento> findWhereIdDocumentoEquals(Integer idDocumento) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTDocumento> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_TIPO_DOC = :idTipoDoc'.
	 */
	public List<SiceeTDocumento> findWhereIdTipoDocEquals(Integer idTipoDoc) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'IDENTIFIC_DOC = :identificDoc'.
	 */
	public List<SiceeTDocumento> findWhereIdentificDocEquals(String identificDoc) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'DT_UPLOAD = :dtUpload'.
	 */
	public List<SiceeTDocumento> findWhereDtUploadEquals(Date dtUpload) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND ID_TIPO_DOC = :idTipoDoc'.
	 */
	public SiceeTDocumento findWhereIdCertificatoreAndIdTipoDocumentoEquals(String idCertificatore, Integer idTipoDoc) throws SiceeTDocumentoDaoException;

	/** 
	 * Returns the rows from the SICEE_T_DOCUMENTO table that matches the specified primary-key value.
	 */
	public SiceeTDocumento findByPrimaryKey(SiceeTDocumentoPk pk) throws SiceeTDocumentoDaoException;

}
