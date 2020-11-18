/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTImpRiscaldamentoAcs;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTImpRiscaldamentoAcsPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTImpRiscaldamentoAcsDaoException;

import java.util.List;

public interface SiceeTImpRiscaldamentoAcsDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTImpRiscaldamentoAcsPk
	 */
	public SiceeTImpRiscaldamentoAcsPk insert(SiceeTImpRiscaldamentoAcs dto);

	/** 
	 * Updates a single row in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	public void update(SiceeTImpRiscaldamentoAcsPk pk, SiceeTImpRiscaldamentoAcs dto) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	public void delete(SiceeTImpRiscaldamentoAcsPk pk) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public SiceeTImpRiscaldamentoAcs findByPrimaryKey(String idCertificatore, String progrCertificato, String anno) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria ''.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findAll() throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereAnnoEquals(String anno) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'FLG_BOLLINO = :flgBollino'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereFlgBollinoEquals(String flgBollino) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'FK_CLASSE_EFF_RISC = :fkClasseEffRisc'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereFkClasseEffRiscEquals(Integer fkClasseEffRisc) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'CODICE_IMPIANTO = :codiceImpianto'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereCodiceImpiantoEquals(String codiceImpianto) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'FK_CLASSE_EFF_ACS = :fkClasseEffAcs'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereFkClasseEffAcsEquals(Integer fkClasseEffAcs) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'FK_COMBUSTIBILE_RISC = :fkCombustibileRisc'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereFkCombustibileRiscEquals(Integer fkCombustibileRisc) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'NUMERO_BOLLINO = :numeroBollino'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereNumeroBollinoEquals(String numeroBollino) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'GEN_ANNO_RISC = :genAnnoRisc'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereGenAnnoRiscEquals(Integer genAnnoRisc) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'FK_COMBUSTIBILE_ACS = :fkCombustibileAcs'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereFkCombustibileAcsEquals(Integer fkCombustibileAcs) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'POT_RISCALDAMENTO = :potRiscaldamento'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWherePotRiscaldamentoEquals(Float potRiscaldamento) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'GEN_ANNO_ACS = :genAnnoAcs'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWhereGenAnnoAcsEquals(Integer genAnnoAcs) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns all rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that match the criteria 'POT_ACS = :potAcs'.
	 */
	public List<SiceeTImpRiscaldamentoAcs> findWherePotAcsEquals(Float potAcs) throws SiceeTImpRiscaldamentoAcsDaoException;

	/** 
	 * Returns the rows from the SICEE_T_IMP_RISCALDAMENTO_ACS table that matches the specified primary-key value.
	 */
	public SiceeTImpRiscaldamentoAcs findByPrimaryKey(SiceeTImpRiscaldamentoAcsPk pk) throws SiceeTImpRiscaldamentoAcsDaoException;

}
