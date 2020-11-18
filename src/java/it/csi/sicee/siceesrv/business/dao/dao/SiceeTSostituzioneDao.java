/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTSostituzioneDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzione;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzionePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTSostituzioneDaoException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface SiceeTSostituzioneDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTSostituzionePk
	 */
	public SiceeTSostituzionePk insert(SiceeTSostituzione dto);

	/** 
	 * Updates a single row in the SICEE_T_SOSTITUZIONE table.
	 */
	public void update(SiceeTSostituzionePk pk, SiceeTSostituzione dto) throws SiceeTSostituzioneDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_SOSTITUZIONE table.
	 */
	public void delete(SiceeTSostituzionePk pk) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_SOSTITUZIONE = :idSostituzione AND PROGR_SOSTITUZIONE = :progrSostituzione'.
	 */
	public SiceeTSostituzione findByPrimaryKey(Long idSostituzione, Long progrSostituzione) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria ''.
	 */
	public List<SiceeTSostituzione> findAll() throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_NEW = :idCertificatoreNew'.
	 */
	public List<SiceeTSostituzione> findBySiceeTCertificato(String idCertificatoreNew) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_OLD = :idCertificatoreOld AND PROGR_CERTIFICATO_OLD = :progrCertificatoOld AND PROGR_CERTIFICATO_NEW = :progrCertificatoNew AND ANNO_OLD = :annoOld AND ANNO_NEW = :annoNew'.
	 */
	public List<SiceeTSostituzione> findBySiceeTCertificato2(String idCertificatoreOld, String progrCertificatoOld, String progrCertificatoNew, String annoOld, String annoNew) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_SOSTITUZIONE = :idSostituzione'.
	 */
	public List<SiceeTSostituzione> findWhereIdSostituzioneEquals(Long idSostituzione) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'PROGR_SOSTITUZIONE = :progrSostituzione'.
	 */
	public List<SiceeTSostituzione> findWhereProgrSostituzioneEquals(Long progrSostituzione) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_OLD = :idCertificatoreOld'.
	 */
	public List<SiceeTSostituzione> findWhereIdCertificatoreOldEquals(String idCertificatoreOld) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'PROGR_CERTIFICATO_OLD = :progrCertificatoOld'.
	 */
	public List<SiceeTSostituzione> findWhereProgrCertificatoOldEquals(String progrCertificatoOld) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ANNO_OLD = :annoOld'.
	 */
	public List<SiceeTSostituzione> findWhereAnnoOldEquals(String annoOld) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_NEW = :idCertificatoreNew'.
	 */
	public List<SiceeTSostituzione> findWhereIdCertificatoreNewEquals(String idCertificatoreNew) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'PROGR_CERTIFICATO_NEW = :progrCertificatoNew'.
	 */
	public List<SiceeTSostituzione> findWhereProgrCertificatoNewEquals(String progrCertificatoNew) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ANNO_NEW = :annoNew'.
	 */
	public List<SiceeTSostituzione> findWhereAnnoNewEquals(String annoNew) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_OLD = :idCertificatoreOld
AND PROGR_CERTIFICATO_OLD = :progrCertificatoOld
AND ANNO_OLD = :annoOld'.
	 */
	public List<SiceeTSostituzione> findWhereAceOldEquals(String idCertificatoreOld, String progrCertificatoOld, String annoOld) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_NEW = :idCertificatoreNew
AND PROGR_CERTIFICATO_NEW = :progrCertificatoNew
AND ANNO_NEW = :annoNew'.
	 */
	public List<SiceeTSostituzione> findWhereAceNewEquals(String idCertificatoreNew, String progrCertificatoNew, String annoNew) throws SiceeTSostituzioneDaoException;

	/** 
	 * Returns the rows from the SICEE_T_SOSTITUZIONE table that matches the specified primary-key value.
	 */
	public SiceeTSostituzione findByPrimaryKey(SiceeTSostituzionePk pk) throws SiceeTSostituzioneDaoException;

}
