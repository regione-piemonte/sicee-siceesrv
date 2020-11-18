/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.facade;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeRNotaioAceDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTNotaioDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAce;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaio;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTNotaioDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.InvioLog;
import it.csi.sicee.siceesrv.dto.siceesrv.Notaio;
import it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;
import it.csi.sicee.siceesrv.util.GenericPrint;

import java.sql.Timestamp;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


// TODO: Auto-generated Javadoc
/**
 * The Class UserMgr.
 */
public class UserMgr extends BaseMgr {
	
	/** The sicee t notaio dao. */
	private SiceeTNotaioDao siceeTNotaioDao;
	
	/** The sicee r notaio ace dao. */
	private SiceeRNotaioAceDao siceeRNotaioAceDao;
	
	/**
	 * Gets the sicee r notaio ace dao.
	 *
	 * @return the sicee r notaio ace dao
	 */
	public SiceeRNotaioAceDao getSiceeRNotaioAceDao() {
		return this.siceeRNotaioAceDao;
	}

	/**
	 * Sets the sicee r notaio ace dao.
	 *
	 * @param siceeRNotaioAceDao the new sicee r notaio ace dao
	 */
	public void setSiceeRNotaioAceDao(SiceeRNotaioAceDao siceeRNotaioAceDao) {
		this.siceeRNotaioAceDao = siceeRNotaioAceDao;
	}

	/**
	 * Gets the sicee t notaio dao.
	 *
	 * @return the sicee t notaio dao
	 */
	public SiceeTNotaioDao getSiceeTNotaioDao() {
		return this.siceeTNotaioDao;
	}

	/**
	 * Sets the sicee t notaio dao.
	 *
	 * @param siceeTNotaioDao the new sicee t notaio dao
	 */
	public void setSiceeTNotaioDao(SiceeTNotaioDao siceeTNotaioDao) {
		this.siceeTNotaioDao = siceeTNotaioDao;
	}
	
	

	/**
	 * Gets the notaio.
	 *
	 * @param email the email
	 * @return the notaio
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Notaio getNotaio(String email) throws SiceesrvException {
		log.debug("[UserMgr::getNotaio] - START");
		Notaio ret = null;
		try {
			SiceeTNotaio obj = getSiceeTNotaioDao().findWhereEmailEquals(email.toLowerCase());
			if (obj != null) {
				ret = convertToNotaio(obj);
			}
		} catch (SiceeTNotaioDaoException e) {
				log.error(e);
				throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[UserMgr::getNotaio] - END");
		}
		return ret;
	}
	
	
	/**
	 * Update invio log.
	 *
	 * @param obj the obj
	 * @return the int
	 * @throws SiceesrvException the siceesrv exception
	 */
	@Transactional
	public int updateInvioLog(InvioLog obj) throws SiceesrvException {
		log.debug("[UserMgr::updateInvioLog] - START");
		
		try {
			SiceeRNotaioAce upd = new SiceeRNotaioAce();
			upd.setAnno(obj.getAnno());
			upd.setIdCertificatore(obj.getCertificatore());
			upd.setIdNotaio(obj.getIdNotaio());
			upd.setProgrCertificato(obj.getNumero());
			upd.setDtInvio(new Timestamp(System.currentTimeMillis()));
			
			//GenericPrint.stampa(upd, true,2);
			
			getSiceeRNotaioAceDao().insert(upd);
					
		} catch (Exception e) {
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[UserMgr::updateInvioLog] - END");
		}
		return 0;
	}
	
	/**
	 * Convert to notaio.
	 *
	 * @param obj the obj
	 * @return the notaio
	 */
	private Notaio convertToNotaio(SiceeTNotaio obj) {
		Notaio not = new Notaio();
		not.setCodiceFiscale(obj.getCodiceFiscale());
		not.setCognome(obj.getCognome());
		not.setEmail(obj.getEmail());
		not.setId(obj.getIdNotaio());
		not.setNome(obj.getNome());
		
		return not;
	}

}
