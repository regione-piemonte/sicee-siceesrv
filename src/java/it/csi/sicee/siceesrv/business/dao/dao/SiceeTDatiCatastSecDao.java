/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDatiCatastSecDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSec;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSecPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTDatiCatastSecDaoException;
import java.util.List;

public interface SiceeTDatiCatastSecDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTDatiCatastSecPk
	 */
	public SiceeTDatiCatastSecPk insert(SiceeTDatiCatastSec dto);

	/** 
	 * Updates a single row in the SICEE_T_DatiCatast_SEC table.
	 */
	public void update(SiceeTDatiCatastSecPk pk, SiceeTDatiCatastSec dto) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_DatiCatast_SEC table.
	 */
	public void delete(SiceeTDatiCatastSecPk pk) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'ID_DatiCatast_SEC = :idDatiCatastSec'.
	 */
	public SiceeTDatiCatastSec findByPrimaryKey(Integer idDatiCatastSec) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria ''.
	 */
	public List<SiceeTDatiCatastSec> findAll() throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'ID_DatiCatast_SEC = :idDatiCatastSec'.
	 */
	public List<SiceeTDatiCatastSec> findWhereIdDatiCatastSecEquals(Integer idDatiCatastSec) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTDatiCatastSec> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTDatiCatastSec> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTDatiCatastSec> findWhereAnnoEquals(String anno) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'SEZIONE = :sezione'.
	 */
	public List<SiceeTDatiCatastSec> findWhereSezioneEquals(String sezione) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'FOGLIO = :foglio'.
	 */
	public List<SiceeTDatiCatastSec> findWhereFoglioEquals(String foglio) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'PARTICELLA = :particella'.
	 */
	public List<SiceeTDatiCatastSec> findWhereParticellaEquals(String particella) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'SUBALTERNO = :subalterno'.
	 */
	public List<SiceeTDatiCatastSec> findWhereSubalternoEquals(String subalterno) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'FLG_SIGMATER = :flgSigmater'.
	 */
	public List<SiceeTDatiCatastSec> findWhereFlgSigmaterEquals(String flgSigmater) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns the rows from the SICEE_T_DatiCatast_SEC table that matches the specified primary-key value.
	 */
	public SiceeTDatiCatastSec findByPrimaryKey(SiceeTDatiCatastSecPk pk) throws SiceeTDatiCatastSecDaoException;

	/** 
	 * Returns all rows from the SICEE_T_DatiCatast_SEC table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTDatiCatastSec> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTDatiCatastSecDaoException;

}
