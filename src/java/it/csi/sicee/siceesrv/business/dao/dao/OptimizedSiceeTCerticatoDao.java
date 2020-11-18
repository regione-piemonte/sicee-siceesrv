/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dto.OptimizedSiceeTCerticato;
import it.csi.sicee.siceesrv.business.dao.exceptions.OptimizedSiceeTCerticatoDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce;
//import it.csi.sicee.siceesrv.dto.type.UDTPositiveInteger;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface OptimizedSiceeTCerticatoDao.
 */
public interface OptimizedSiceeTCerticatoDao
{
	
	/**
	 * Method 'execute'.
	 *
	 * @param idCertificatore the id certificatore
	 * @return List<OptimizedSiceeTCerticato>
	 * @throws OptimizedSiceeTCerticatoDaoException the optimized sicee t certicato dao exception
	 */
	//public List<OptimizedSiceeTCerticato> execute(java.lang.String idCertificatore) throws OptimizedSiceeTCerticatoDaoException;
	
	
	/**
	 * Method 'executeByParametriCount'.
	 *
	 * @param idCertificatore the id certificatore
	 * @param filtro the filtro
	 * @param minIdCert the min id cert
	 * @param dataPregresso the data pregresso
	 * @return Integer
	 * @throws OptimizedSiceeTCerticatoDaoException the optimized sicee t certicato dao exception
	 */
	public Integer executeByParametriCount(java.lang.String idCertificatore,FiltroRicercaAce filtro, Long minIdCert, String dataPregresso) throws OptimizedSiceeTCerticatoDaoException;

	/**
	 * Method 'executeByParametri'.
	 *
	 * @param idCertificatore the id certificatore
	 * @param filtro the filtro
	 * @param minIdCert the min id cert
	 * @param dataPregresso the data pregresso
	 * @return List<OptimizedSiceeTCerticato>
	 * @throws OptimizedSiceeTCerticatoDaoException the optimized sicee t certicato dao exception
	 */
	public List<OptimizedSiceeTCerticato> executeByParametri(java.lang.String idCertificatore,FiltroRicercaAce filtro, Long minIdCert, String dataPregresso, boolean flgSostituzione) throws OptimizedSiceeTCerticatoDaoException;

	/**
	 * Method 'executeByCodice'.
	 *
	 * @param annoCertificato the anno certificato
	 * @param idCertificatore the id certificatore
	 * @param progCertificato the prog certificato
	 * @param idStato the id stato
	 * @param minIdCert the min id cert
	 * @param dataPregresso the data pregresso
	 * @return List<OptimizedSiceeTCerticato>
	 * @throws OptimizedSiceeTCerticatoDaoException the optimized sicee t certicato dao exception
	 */
	public List<OptimizedSiceeTCerticato> executeByCodice(java.lang.String idCertificatore, FiltroRicercaAce filtro, Long minIdCert, String dataPregresso) throws OptimizedSiceeTCerticatoDaoException;

	/**
	 * Execute by parametri per sostituzione.
	 *
	 * @param idCertificatore the id certificatore
	 * @param filtro the filtro
	 * @param minIdCert the min id cert
	 * @param dataPregresso the data pregresso
	 * @return the list
	 * @throws OptimizedSiceeTCerticatoDaoException the optimized sicee t certicato dao exception
	 */
	/*
	public List<OptimizedSiceeTCerticato> executeByParametriPerSostituzione(
			String idCertificatore, FiltroRicercaAce filtro, Long minIdCert,
			String dataPregresso) throws OptimizedSiceeTCerticatoDaoException;
	*/
}
