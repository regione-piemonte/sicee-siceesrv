/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeRNotaioAceDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAce;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAcePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeRNotaioAceDaoException;
import java.util.Date;
import java.util.List;

public interface SiceeRNotaioAceDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeRNotaioAcePk
	 */
	public SiceeRNotaioAcePk insert(SiceeRNotaioAce dto);

	/** 
	 * Updates a single row in the SICEE_R_NOTAIO_ACE table.
	 */
	public void update(SiceeRNotaioAcePk pk, SiceeRNotaioAce dto) throws SiceeRNotaioAceDaoException;

	/** 
	 * Deletes a single row in the SICEE_R_NOTAIO_ACE table.
	 */
	public void delete(SiceeRNotaioAcePk pk) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO_ACE = :idNotaioAce'.
	 */
	public SiceeRNotaioAce findByPrimaryKey(Long idNotaioAce) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria ''.
	 */
	public List<SiceeRNotaioAce> findAll() throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeRNotaioAce> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO = :idNotaio'.
	 */
	public List<SiceeRNotaioAce> findBySiceeTNotaio(Integer idNotaio) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO_ACE = :idNotaioAce'.
	 */
	public List<SiceeRNotaioAce> findWhereIdNotaioAceEquals(Long idNotaioAce) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO = :idNotaio'.
	 */
	public List<SiceeRNotaioAce> findWhereIdNotaioEquals(Integer idNotaio) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeRNotaioAce> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeRNotaioAce> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeRNotaioAce> findWhereAnnoEquals(String anno) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'DT_INVIO = :dtInvio'.
	 */
	public List<SiceeRNotaioAce> findWhereDtInvioEquals(Date dtInvio) throws SiceeRNotaioAceDaoException;

	/** 
	 * Returns the rows from the SICEE_R_NOTAIO_ACE table that matches the specified primary-key value.
	 */
	public SiceeRNotaioAce findByPrimaryKey(SiceeRNotaioAcePk pk) throws SiceeRNotaioAceDaoException;

}
