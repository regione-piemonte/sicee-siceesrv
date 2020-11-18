/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRuoliEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTRuoliEdificioPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTRuoliEdificioDaoException;

import java.util.List;

public interface SiceeTRuoliEdificioDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTRuoliEdificioPk
	 */
	public SiceeTRuoliEdificioPk insert(SiceeTRuoliEdificio dto);

	/** 
	 * Updates a single row in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	public void update(SiceeTRuoliEdificioPk pk, SiceeTRuoliEdificio dto) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_RUOLI_EDIFICIO table.
	 */
	public void delete(SiceeTRuoliEdificioPk pk) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno AND FK_TIPO_RUOLO = :fkTipoRuolo'.
	 */
	public SiceeTRuoliEdificio findByPrimaryKey(String idCertificatore, String progrCertificato, String anno, Integer fkTipoRuolo) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_RUOLO_EDIFICIO = :idRuoloEdificio'.
	 */
	public List<SiceeTRuoliEdificio> findWhereIdRuoloEdificioEquals(Integer idRuoloEdificio) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria ''.
	 */
	public List<SiceeTRuoliEdificio> findAll() throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTRuoliEdificio> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'FK_TIPO_RUOLO = :fkTipoRuolo'.
	 */
	public List<SiceeTRuoliEdificio> findWhereFkTipoRuoloEquals(Integer fkTipoRuolo) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'NOME = :nome'.
	 */
	public List<SiceeTRuoliEdificio> findWhereNomeEquals(String nome) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'COGNOME = :cognome'.
	 */
	public List<SiceeTRuoliEdificio> findWhereCognomeEquals(String cognome) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_INDIRIZZO = :idIndirizzo'.
	 */
	public List<SiceeTRuoliEdificio> findWhereIdIndirizzoEquals(Integer idIndirizzo) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'DESC_INDIRIZZO = :descIndirizzo'.
	 */
	public List<SiceeTRuoliEdificio> findWhereDescIndirizzoEquals(String descIndirizzo) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'CAP = :cap'.
	 */
	public List<SiceeTRuoliEdificio> findWhereCapEquals(String cap) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_COMUNE = :idComune'.
	 */
	public List<SiceeTRuoliEdificio> findWhereIdComuneEquals(String idComune) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'DESC_COMUNE = :descComune'.
	 */
	public List<SiceeTRuoliEdificio> findWhereDescComuneEquals(String descComune) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'TELEFONO = :telefono'.
	 */
	public List<SiceeTRuoliEdificio> findWhereTelefonoEquals(String telefono) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'FAX = :fax'.
	 */
	public List<SiceeTRuoliEdificio> findWhereFaxEquals(String fax) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'CELL = :cell'.
	 */
	public List<SiceeTRuoliEdificio> findWhereCellEquals(String cell) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'EMAIL = :email'.
	 */
	public List<SiceeTRuoliEdificio> findWhereEmailEquals(String email) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_REGIONE = :idRegione'.
	 */
	public List<SiceeTRuoliEdificio> findWhereIdRegioneEquals(String idRegione) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'DESC_REGIONE = :descRegione'.
	 */
	public List<SiceeTRuoliEdificio> findWhereDescRegioneEquals(String descRegione) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_PROVINCIA = :idProvincia'.
	 */
	public List<SiceeTRuoliEdificio> findWhereIdProvinciaEquals(String idProvincia) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'DESC_PROVINCIA = :descProvincia'.
	 */
	public List<SiceeTRuoliEdificio> findWhereDescProvinciaEquals(String descProvincia) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'NUM_CIVICO = :numCivico'.
	 */
	public List<SiceeTRuoliEdificio> findWhereNumCivicoEquals(String numCivico) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTRuoliEdificio> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTRuoliEdificio> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_RUOLI_EDIFICIO table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTRuoliEdificio> findWhereAnnoEquals(String anno) throws SiceeTRuoliEdificioDaoException;

	/** 
	 * Returns the rows from the SICEE_T_RUOLI_EDIFICIO table that matches the specified primary-key value.
	 */
	public SiceeTRuoliEdificio findByPrimaryKey(SiceeTRuoliEdificioPk pk) throws SiceeTRuoliEdificioDaoException;

}
