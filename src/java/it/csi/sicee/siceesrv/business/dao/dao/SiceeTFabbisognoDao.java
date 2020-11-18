/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTFabbisogno;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTFabbisognoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTFabbisognoDaoException;

import java.util.List;

public interface SiceeTFabbisognoDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTFabbisognoPk
	 */
	public SiceeTFabbisognoPk insert(SiceeTFabbisogno dto);

	/** 
	 * Updates a single row in the SICEE_T_FABBISOGNO table.
	 */
	public void update(SiceeTFabbisognoPk pk, SiceeTFabbisogno dto) throws SiceeTFabbisognoDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_FABBISOGNO table.
	 */
	public void delete(SiceeTFabbisognoPk pk) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public SiceeTFabbisogno findByPrimaryKey(String idCertificatore, String progrCertificato, String anno) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria ''.
	 */
	public List<SiceeTFabbisogno> findAll() throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTFabbisogno> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTFabbisogno> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTFabbisogno> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTFabbisogno> findWhereAnnoEquals(String anno) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'DOM_RISC_QH = :domRiscQh'.
	 */
	public List<SiceeTFabbisogno> findWhereDomRiscQhEquals(Float domRiscQh) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'LIMITE_REG_QH_LIM = :limiteRegQhLim'.
	 */
	public List<SiceeTFabbisogno> findWhereLimiteRegQhLimEquals(Float limiteRegQhLim) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'FABB_CONDIZ = :fabbCondiz'.
	 */
	public List<SiceeTFabbisogno> findWhereFabbCondizEquals(Float fabbCondiz) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'DOM_ACS_QHW = :domAcsQhw'.
	 */
	public List<SiceeTFabbisogno> findWhereDomAcsQhwEquals(Float domAcsQhw) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'EN_ACS_RINNO = :enAcsRinno'.
	 */
	public List<SiceeTFabbisogno> findWhereEnAcsRinnoEquals(Float enAcsRinno) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'REND_ACS_ETAGACS = :rendAcsEtagacs'.
	 */
	public List<SiceeTFabbisogno> findWhereRendAcsEtagacsEquals(Float rendAcsEtagacs) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'FABB_ACS = :fabbAcs'.
	 */
	public List<SiceeTFabbisogno> findWhereFabbAcsEquals(Float fabbAcs) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns all rows from the SICEE_T_FABBISOGNO table that match the criteria 'FABB_ILLUM = :fabbIllum'.
	 */
	public List<SiceeTFabbisogno> findWhereFabbIllumEquals(Float fabbIllum) throws SiceeTFabbisognoDaoException;

	/** 
	 * Returns the rows from the SICEE_T_FABBISOGNO table that matches the specified primary-key value.
	 */
	public SiceeTFabbisogno findByPrimaryKey(SiceeTFabbisognoPk pk) throws SiceeTFabbisognoDaoException;

}
