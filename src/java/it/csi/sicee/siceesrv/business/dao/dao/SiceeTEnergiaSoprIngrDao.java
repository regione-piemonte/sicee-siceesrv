/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTEnergiaSoprIngr;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTEnergiaSoprIngrPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTEnergiaSoprIngrDaoException;

import java.util.Date;
import java.util.List;

public interface SiceeTEnergiaSoprIngrDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTEnergiaSoprIngrPk
	 */
	public SiceeTEnergiaSoprIngrPk insert(SiceeTEnergiaSoprIngr dto);

	/** 
	 * Updates a single row in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	public void update(SiceeTEnergiaSoprIngrPk pk, SiceeTEnergiaSoprIngr dto) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_ENERGIA_SOPR_INGR table.
	 */
	public void delete(SiceeTEnergiaSoprIngrPk pk) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public SiceeTEnergiaSoprIngr findByPrimaryKey(String idCertificatore, String progrCertificato, String anno) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria ''.
	 */
	public List<SiceeTEnergiaSoprIngr> findAll() throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTEnergiaSoprIngr> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereAnnoEquals(String anno) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'FK_DATI = :fkDati'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereFkDatiEquals(Integer fkDati) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'TECNO_RINNO = :tecnoRinno'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereTecnoRinnoEquals(String tecnoRinno) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'ANNO_INSTALL = :annoInstall'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereAnnoInstallEquals(Integer annoInstall) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'EN_TERMICA_PROD = :enTermicaProd'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereEnTermicaProdEquals(Float enTermicaProd) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'EN_ELETT_PROD = :enElettProd'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereEnElettProdEquals(Float enElettProd) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'AUTOCONS_TERMICO = :autoconsTermico'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereAutoconsTermicoEquals(Float autoconsTermico) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'AUTOCONS_ELETT = :autoconsElett'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereAutoconsElettEquals(Float autoconsElett) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'DT_SOPRALLUOGO = :dtSopralluogo'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereDtSopralluogoEquals(Date dtSopralluogo) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'NOTE_SOPRALL = :noteSoprall'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWhereNoteSoprallEquals(String noteSoprall) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns all rows from the SICEE_T_ENERGIA_SOPR_INGR table that match the criteria 'PERC_FONTI_RINNOV = :percFontiRinnov'.
	 */
	public List<SiceeTEnergiaSoprIngr> findWherePercFontiRinnovEquals(Float percFontiRinnov) throws SiceeTEnergiaSoprIngrDaoException;

	/** 
	 * Returns the rows from the SICEE_T_ENERGIA_SOPR_INGR table that matches the specified primary-key value.
	 */
	public SiceeTEnergiaSoprIngr findByPrimaryKey(SiceeTEnergiaSoprIngrPk pk) throws SiceeTEnergiaSoprIngrDaoException;

}
