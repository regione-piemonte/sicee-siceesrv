/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTClasseEnergeticaPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTClasseEnergeticaDaoException;

import java.util.List;

public interface SiceeTClasseEnergeticaDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTClasseEnergeticaPk
	 */
	public SiceeTClasseEnergeticaPk insert(SiceeTClasseEnergetica dto);

	/** 
	 * Updates a single row in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	public void update(SiceeTClasseEnergeticaPk pk, SiceeTClasseEnergetica dto) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_CLASSE_ENERGETICA table.
	 */
	public void delete(SiceeTClasseEnergeticaPk pk) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public SiceeTClasseEnergetica findByPrimaryKey(String idCertificatore, String progrCertificato, String anno) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria ''.
	 */
	public List<SiceeTClasseEnergetica> findAll() throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTClasseEnergetica> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_RISC_EPI = :indRiscEpi'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndRiscEpiEquals(Float indRiscEpi) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_COND_EST = :indCondEst'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndCondEstEquals(Float indCondEst) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTClasseEnergetica> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_ILLUM = :indIllum'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndIllumEquals(Float indIllum) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTClasseEnergetica> findWhereAnnoEquals(String anno) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_GLOB_EPLORDO = :indGlobEplordo'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndGlobEplordoEquals(Float indGlobEplordo) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'FK_CLASSE = :fkClasse'.
	 */
	public List<SiceeTClasseEnergetica> findWhereFkClasseEquals(Integer fkClasse) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'REND_GENER = :rendGener'.
	 */
	public List<SiceeTClasseEnergetica> findWhereRendGenerEquals(Float rendGener) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'REND_REGOL = :rendRegol'.
	 */
	public List<SiceeTClasseEnergetica> findWhereRendRegolEquals(Float rendRegol) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'SERVIZI_ENERGETICI = :serviziEnergetici'.
	 */
	public List<SiceeTClasseEnergetica> findWhereServiziEnergeticiEquals(String serviziEnergetici) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'REND_EMISS = :rendEmiss'.
	 */
	public List<SiceeTClasseEnergetica> findWhereRendEmissEquals(Float rendEmiss) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'REND_DISTRIB = :rendDistrib'.
	 */
	public List<SiceeTClasseEnergetica> findWhereRendDistribEquals(Float rendDistrib) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'REND_IMP_ETAG = :rendImpEtag'.
	 */
	public List<SiceeTClasseEnergetica> findWhereRendImpEtagEquals(Float rendImpEtag) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'DOM_RISC_QHTO = :domRiscQhto'.
	 */
	public List<SiceeTClasseEnergetica> findWhereDomRiscQhtoEquals(Float domRiscQhto) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'LIMITE_REG_QHTO = :limiteRegQhto'.
	 */
	public List<SiceeTClasseEnergetica> findWhereLimiteRegQhtoEquals(Float limiteRegQhto) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_RISC_EPITO = :indRiscEpito'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndRiscEpitoEquals(Float indRiscEpito) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'DOM_ACS_QHWTO = :domAcsQhwto'.
	 */
	public List<SiceeTClasseEnergetica> findWhereDomAcsQhwtoEquals(Float domAcsQhwto) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'EN_ACS_RINNO_TO = :enAcsRinnoTo'.
	 */
	public List<SiceeTClasseEnergetica> findWhereEnAcsRinnoToEquals(Float enAcsRinnoTo) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'REND_ACS_ETAG_ACSTO = :rendAcsEtagAcsto'.
	 */
	public List<SiceeTClasseEnergetica> findWhereRendAcsEtagAcstoEquals(Float rendAcsEtagAcsto) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'FABB_ACS_TO = :fabbAcsTo'.
	 */
	public List<SiceeTClasseEnergetica> findWhereFabbAcsToEquals(Float fabbAcsTo) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_GLOB_EPLORDO_TO = :indGlobEplordoTo'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndGlobEplordoToEquals(Float indGlobEplordoTo) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'ETAG_CONV = :etagConv'.
	 */
	public List<SiceeTClasseEnergetica> findWhereEtagConvEquals(Float etagConv) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CLASSE_ENERGETICA table that match the criteria 'IND_GLOB_LIMITE_TO = :indGlobLimiteTo'.
	 */
	public List<SiceeTClasseEnergetica> findWhereIndGlobLimiteToEquals(Float indGlobLimiteTo) throws SiceeTClasseEnergeticaDaoException;

	/** 
	 * Returns the rows from the SICEE_T_CLASSE_ENERGETICA table that matches the specified primary-key value.
	 */
	public SiceeTClasseEnergetica findByPrimaryKey(SiceeTClasseEnergeticaPk pk) throws SiceeTClasseEnergeticaDaoException;

}
