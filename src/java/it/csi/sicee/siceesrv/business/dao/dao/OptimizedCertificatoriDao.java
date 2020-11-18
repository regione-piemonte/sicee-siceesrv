/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao;

import it.csi.sicee.siceesrv.business.dao.dao.OptimizedCertificatoriDao;
import it.csi.sicee.siceesrv.business.dao.dto.OptimizedCertificatori;
import it.csi.sicee.siceesrv.business.dao.exceptions.OptimizedCertificatoriDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori;

import java.util.List;

public interface OptimizedCertificatoriDao
{
	/**
	 * Method 'execute'
	 * 
	 * @param sigla
	 * @param nome
	 * @param cognome
	 * @param ragioneSociale
	 * @param idProvincia
	 * @param idComune
	 * @throws OptimizedCertificatoriDaoException
	 * @return List<OptimizedCertificatori>
	 */
	public List<OptimizedCertificatori> findElencoCertificatori(FiltroRicercaCertificatori filtro, Long parametro) throws OptimizedCertificatoriDaoException;

}
