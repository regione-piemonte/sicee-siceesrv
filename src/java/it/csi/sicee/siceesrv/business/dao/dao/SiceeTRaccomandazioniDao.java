/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRaccomandazioni;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRaccomandazioniPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTRaccomandazioniDaoException;

import java.util.List;

public interface SiceeTRaccomandazioniDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTRaccomandazioniPk
	 */
	public SiceeTRaccomandazioniPk insert(SiceeTRaccomandazioni dto);

	/** 
	 * Updates a single row in the SICEE_T_RACCOMANDAZIONI table.
	 */
	public void update(SiceeTRaccomandazioniPk pk, SiceeTRaccomandazioni dto) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_RACCOMANDAZIONI table.
	 */
	public void delete(SiceeTRaccomandazioniPk pk) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno AND PRIORITA = :priorita AND SISTEMA = :sistema AND INTERVENTO = :intervento'.
	 */
	public SiceeTRaccomandazioni findByPrimaryKey(String idCertificatore, String progrCertificato, String anno, String priorita, String sistema, String intervento) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria ''.
	 */
	public List<SiceeTRaccomandazioni> findAll() throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTRaccomandazioni> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTRaccomandazioni> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTRaccomandazioni> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTRaccomandazioni> findWhereAnnoEquals(String anno) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'PRIORITA = :priorita'.
	 */
	public List<SiceeTRaccomandazioni> findWherePrioritaEquals(String priorita) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'SISTEMA = :sistema'.
	 */
	public List<SiceeTRaccomandazioni> findWhereSistemaEquals(String sistema) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'INTERVENTO = :intervento'.
	 */
	public List<SiceeTRaccomandazioni> findWhereInterventoEquals(String intervento) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RACCOMANDAZIONI table that match the criteria 'TEMPO_RITORNO = :tempoRitorno'.
	 */
	public List<SiceeTRaccomandazioni> findWhereTempoRitornoEquals(String tempoRitorno) throws SiceeTRaccomandazioniDaoException;

	/** 
	 * Returns the rows from the SICEE_T_RACCOMANDAZIONI table that matches the specified primary-key value.
	 */
	public SiceeTRaccomandazioni findByPrimaryKey(SiceeTRaccomandazioniPk pk) throws SiceeTRaccomandazioniDaoException;

}
