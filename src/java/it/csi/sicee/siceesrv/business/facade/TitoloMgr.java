/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.facade;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDIstruzioneDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTitoloDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDIstruzione;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTitolo;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDIstruzioneDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTitoloDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.Titolo;
import it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class TitoloMgr.
 */
public class TitoloMgr extends BaseMgr {
	
	/** The sicee d istruzione dao. */
	private SiceeDIstruzioneDao siceeDIstruzioneDao;

	/**
	 * Gets the sicee d istruzione dao.
	 *
	 * @return the sicee d istruzione dao
	 */
	public SiceeDIstruzioneDao getSiceeDIstruzioneDao() {
		return this.siceeDIstruzioneDao;
	}

	/**
	 * Sets the sicee d istruzione dao.
	 *
	 * @param siceeDIstruzioneDao the new sicee d istruzione dao
	 */
	public void setSiceeDIstruzioneDao(SiceeDIstruzioneDao siceeDIstruzioneDao) {
		this.siceeDIstruzioneDao = siceeDIstruzioneDao;
	}
	
	/**
	 * Elenco titoli.
	 *
	 * @return the titolo[]
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Titolo[] elencoTitoli() throws SiceesrvException {
		log.debug("[TitoloMgr::elencoTitoli] - START");
		Titolo[] list = null;
		try {
			List<SiceeDIstruzione> l = getSiceeDIstruzioneDao().findAll();
			if (l != null) {
				log.debug("Titoli trovati: " + l.size());
				list = convertToTitolo(l);
			}
		} catch (SiceeDIstruzioneDaoException e) {
				log.error(e);
				throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[TitoloMgr::elencoTitoli] - END");
		}
		return list;
	}

	/**
	 * Convert to titolo.
	 *
	 * @param list the list
	 * @return the titolo[]
	 */
	private Titolo[] convertToTitolo(List<SiceeDIstruzione> list) {
		Titolo[] ret = new Titolo[list.size()];
		
		Iterator<SiceeDIstruzione> iter = list.iterator();
		int i = 0;
		while(iter.hasNext()) {
			ret[i++] = convertToTitolo(iter.next());
		}
		
		return ret;
	}

	/**
	 * Convert to titolo.
	 *
	 * @param next the next
	 * @return the titolo
	 */
	private Titolo convertToTitolo(SiceeDIstruzione next) {
		Titolo tit = new Titolo();
		tit.setIdTitolo(convertToString(next.getIdIstruzione()));
		tit.setDescrizione(next.getDenominazione());
		return tit;
	}
	
}
