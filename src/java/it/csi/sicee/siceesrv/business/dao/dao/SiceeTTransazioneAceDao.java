/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTTransazioneAceDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTTransazioneAce;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTTransazioneAcePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTTransazioneAceDaoException;
import java.util.Date;
import java.util.List;

public interface SiceeTTransazioneAceDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTTransazioneAcePk
	 */
	public SiceeTTransazioneAcePk insert(SiceeTTransazioneAce dto);

	/** 
	 * Updates a single row in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	public void update(SiceeTTransazioneAcePk pk, SiceeTTransazioneAce dto) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	public void delete(SiceeTTransazioneAcePk pk) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ID_TRANSAZIONE_ACE = :idTransazioneAce'.
	 */
	public SiceeTTransazioneAce findByPrimaryKey(long idTransazioneAce) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria ''.
	 */
	public List<SiceeTTransazioneAce> findAll() throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_TIPO_PAGAMENTO = :fkTipoPagamento'.
	 */
	public List<SiceeTTransazioneAce> findBySiceeDTipoPagamento(Integer fkTipoPagamento) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_CERTIFICATORE = :fkCertificatore'.
	 */
	public List<SiceeTTransazioneAce> findBySiceeTCertificatore(String fkCertificatore) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ID_TRANSAZIONE_ACE = :idTransazioneAce'.
	 */
	public List<SiceeTTransazioneAce> findWhereIdTransazioneAceEquals(long idTransazioneAce) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_TIPO_PAGAMENTO = :fkTipoPagamento'.
	 */
	public List<SiceeTTransazioneAce> findWhereFkTipoPagamentoEquals(Integer fkTipoPagamento) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'NUM_TRANSAZIONE = :numTransazione'.
	 */
	public List<SiceeTTransazioneAce> findWhereNumTransazioneEquals(String numTransazione) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'DATA_TRANSAZIONE = :dataTransazione'.
	 */
	public List<SiceeTTransazioneAce> findWhereDataTransazioneEquals(Date dataTransazione) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FLG_VERIFICATO = :flgVerificato'.
	 */
	public List<SiceeTTransazioneAce> findWhereFlgVerificatoEquals(String flgVerificato) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ESEGUITO_NOME = :eseguitoNome'.
	 */
	public List<SiceeTTransazioneAce> findWhereEseguitoNomeEquals(String eseguitoNome) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ESEGUITO_COGNOME = :eseguitoCognome'.
	 */
	public List<SiceeTTransazioneAce> findWhereEseguitoCognomeEquals(String eseguitoCognome) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_CERTIFICATORE = :fkCertificatore'.
	 */
	public List<SiceeTTransazioneAce> findWhereFkCertificatoreEquals(String fkCertificatore) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTTransazioneAce> findWhereAnnoEquals(String anno) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'QUANTITA = :quantita'.
	 */
	public List<SiceeTTransazioneAce> findWhereQuantitaEquals(Integer quantita) throws SiceeTTransazioneAceDaoException;

	/** 
	 * Returns the rows from the SICEE_T_TRANSAZIONE_ACE table that matches the specified primary-key value.
	 */
	public SiceeTTransazioneAce findByPrimaryKey(SiceeTTransazioneAcePk pk) throws SiceeTTransazioneAceDaoException;

}
