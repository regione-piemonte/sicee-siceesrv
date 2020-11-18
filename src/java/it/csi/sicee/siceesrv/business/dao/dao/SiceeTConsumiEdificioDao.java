/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTConsumiEdificio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTConsumiEdificioPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTConsumiEdificioDaoException;

import java.util.List;

public interface SiceeTConsumiEdificioDao
{
	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTConsumiEdificioPk
	 */
	public SiceeTConsumiEdificioPk insert(SiceeTConsumiEdificio dto);

	/** 
	 * Updates a single row in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	public void update(SiceeTConsumiEdificioPk pk, SiceeTConsumiEdificio dto) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Deletes a single row in the SICEE_T_CONSUMI_EDIFICIO table.
	 */
	public void delete(SiceeTConsumiEdificioPk pk) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public SiceeTConsumiEdificio findByPrimaryKey(String idCertificatore, String progrCertificato, String anno) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria ''.
	 */
	public List<SiceeTConsumiEdificio> findAll() throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTConsumiEdificio> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTConsumiEdificio> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTConsumiEdificio> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTConsumiEdificio> findWhereAnnoEquals(String anno) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'DESC_TIPO_EROG = :descTipoErog'.
	 */
	public List<SiceeTConsumiEdificio> findWhereDescTipoErogEquals(String descTipoErog) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'FK_TIPO_IMPIANTO = :fkTipoImpianto'.
	 */
	public List<SiceeTConsumiEdificio> findWhereFkTipoImpiantoEquals(Integer fkTipoImpianto) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'DESC_TIPO_DISTRIB = :descTipoDistrib'.
	 */
	public List<SiceeTConsumiEdificio> findWhereDescTipoDistribEquals(String descTipoDistrib) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'DESC_TIPO_REG = :descTipoReg'.
	 */
	public List<SiceeTConsumiEdificio> findWhereDescTipoRegEquals(String descTipoReg) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ANN_TERMI_FOSSILE = :annTermiFossile'.
	 */
	public List<SiceeTConsumiEdificio> findWhereAnnTermiFossileEquals(Float annTermiFossile) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ANN_ELETT_FOSSILE = :annElettFossile'.
	 */
	public List<SiceeTConsumiEdificio> findWhereAnnElettFossileEquals(Float annElettFossile) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ANN_TERMI_RINNO = :annTermiRinno'.
	 */
	public List<SiceeTConsumiEdificio> findWhereAnnTermiRinnoEquals(Float annTermiRinno) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'ANN_ELETT_RINNO = :annElettRinno'.
	 */
	public List<SiceeTConsumiEdificio> findWhereAnnElettRinnoEquals(Float annElettRinno) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'COMPLESS_TERMICO = :complessTermico'.
	 */
	public List<SiceeTConsumiEdificio> findWhereComplessTermicoEquals(Float complessTermico) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'COMPLESS_ELETTRICO = :complessElettrico'.
	 */
	public List<SiceeTConsumiEdificio> findWhereComplessElettricoEquals(Float complessElettrico) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'UI_SERVITE = :uiServite'.
	 */
	public List<SiceeTConsumiEdificio> findWhereUiServiteEquals(String uiServite) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns all rows from the SICEE_T_CONSUMI_EDIFICIO table that match the criteria 'FLG_CONT_RIP = :flgContRip'.
	 */
	public List<SiceeTConsumiEdificio> findWhereFlgContRipEquals(String flgContRip) throws SiceeTConsumiEdificioDaoException;

	/** 
	 * Returns the rows from the SICEE_T_CONSUMI_EDIFICIO table that matches the specified primary-key value.
	 */
	public SiceeTConsumiEdificio findByPrimaryKey(SiceeTConsumiEdificioPk pk) throws SiceeTConsumiEdificioDaoException;

}
