/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRispettoNormative;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRispettoNormativePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTRispettoNormativeDaoException;

import java.util.Date;
import java.util.List;

public interface SiceeTRispettoNormativeDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTRispettoNormativePk
	 */
	public SiceeTRispettoNormativePk insert(SiceeTRispettoNormative dto);

	/** 
	 * Updates a single row in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	public void update(SiceeTRispettoNormativePk pk, SiceeTRispettoNormative dto) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_RISPETTO_NORMATIVE table.
	 */
	public void delete(SiceeTRispettoNormativePk pk) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public SiceeTRispettoNormative findByPrimaryKey(String idCertificatore, String progrCertificato, String anno) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria ''.
	 */
	public List<SiceeTRispettoNormative> findAll() throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTRispettoNormative> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'DT_TITOLO = :dtTitolo'.
	 */
	public List<SiceeTRispettoNormative> findWhereDtTitoloEquals(Date dtTitolo) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTRispettoNormative> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTRispettoNormative> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTRispettoNormative> findWhereAnnoEquals(String anno) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'FK_NORMA = :fkNorma'.
	 */
	public List<SiceeTRispettoNormative> findWhereFkNormaEquals(Integer fkNorma) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'FLG_NORMA = :flgNorma'.
	 */
	public List<SiceeTRispettoNormative> findWhereFlgNormaEquals(String flgNorma) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'MOTIVO_NON_CONFORMITA = :motivoNonConformita'.
	 */
	public List<SiceeTRispettoNormative> findWhereMotivoNonConformitaEquals(String motivoNonConformita) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RISPETTO_NORMATIVE table that match the criteria 'NOTE = :note'.
	 */
	public List<SiceeTRispettoNormative> findWhereNoteEquals(String note) throws SiceeTRispettoNormativeDaoException;

	/** 
	 * Returns the rows from the SICEE_T_RISPETTO_NORMATIVE table that matches the specified primary-key value.
	 */
	public SiceeTRispettoNormative findByPrimaryKey(SiceeTRispettoNormativePk pk) throws SiceeTRispettoNormativeDaoException;

}
