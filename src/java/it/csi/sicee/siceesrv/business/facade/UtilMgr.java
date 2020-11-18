/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.facade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeDClasseEnergeticaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDCombustibileDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDDestUsoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDMotivoRilascioDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDMotivoSostDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDQualitaInvolucroDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTipoImpiantoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeLAccessoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeRDestClasseDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriMdpDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDClasseEnergetica;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDMotivoSost;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeLAccesso;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRDestClasse;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametri;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametriMdp;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDClasseEnergeticaDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDCombustibileDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDDestUsoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDMotivoRilascioDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDMotivoSostDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDQualitaInvolucroDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTipoImpiantoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeLAccessoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeRDestClasseDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriMdpDaoException;
import it.csi.sicee.siceesrv.business.print.dto.MotivoAnnullamento;
import it.csi.sicee.siceesrv.business.util.GenericUtil;
import it.csi.sicee.siceesrv.dto.siceesrv.LabelValue;
import it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;
import it.csi.sicee.siceesrv.util.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class UtilMgr.
 */
public class UtilMgr extends BaseMgr {
	
	/** The sicee t parametri dao. */
	private SiceeTParametriDao siceeTParametriDao;

	/** The sicee t parametri mdp dao. */
	private SiceeTParametriMdpDao siceeTParametriMdpDao;

	/** The sicee d dest uso dao. */
	private SiceeDDestUsoDao siceeDDestUsoDao;
	
	/** The sicee d motivo rilascio dao. */
	private SiceeDMotivoRilascioDao siceeDMotivoRilascioDao;
	
	/** The sicee d qualita involucro dao. */
	private SiceeDQualitaInvolucroDao siceeDQualitaInvolucroDao;
	
	/** The sicee d tipo impianto dao. */
	private SiceeDTipoImpiantoDao siceeDTipoImpiantoDao;
	
	/** The sicee d classe energetica dao. */
	private SiceeDClasseEnergeticaDao siceeDClasseEnergeticaDao;
	
	/** The sicee r dest classe dao. */
	private SiceeRDestClasseDao siceeRDestClasseDao;
	
	/** The sicee d combustibile dao. */
	private SiceeDCombustibileDao siceeDCombustibileDao;
	
	/** The sicee d motivo sost dao. */
	private SiceeDMotivoSostDao siceeDMotivoSostDao;
	
	private SiceeLAccessoDao siceeLAccessoDao;
	
	/**
	 * Gets the sicee d dest uso dao.
	 *
	 * @return the sicee d dest uso dao
	 */
	public SiceeDDestUsoDao getSiceeDDestUsoDao() {
		return this.siceeDDestUsoDao;
	}

	/**
	 * Sets the sicee d dest uso dao.
	 *
	 * @param siceeDDestUsoDao the new sicee d dest uso dao
	 */
	public void setSiceeDDestUsoDao(SiceeDDestUsoDao siceeDDestUsoDao) {
		this.siceeDDestUsoDao = siceeDDestUsoDao;
	}

	/**
	 * Gets the sicee d motivo rilascio dao.
	 *
	 * @return the sicee d motivo rilascio dao
	 */
	public SiceeDMotivoRilascioDao getSiceeDMotivoRilascioDao() {
		return this.siceeDMotivoRilascioDao;
	}

	/**
	 * Sets the sicee d motivo rilascio dao.
	 *
	 * @param siceeDMotivoRilascioDao the new sicee d motivo rilascio dao
	 */
	public void setSiceeDMotivoRilascioDao(
			SiceeDMotivoRilascioDao siceeDMotivoRilascioDao) {
		this.siceeDMotivoRilascioDao = siceeDMotivoRilascioDao;
	}

	/**
	 * Gets the sicee d qualita involucro dao.
	 *
	 * @return the sicee d qualita involucro dao
	 */
	public SiceeDQualitaInvolucroDao getSiceeDQualitaInvolucroDao() {
		return this.siceeDQualitaInvolucroDao;
	}

	/**
	 * Sets the sicee d qualita involucro dao.
	 *
	 * @param siceeDQualitaInvolucroDao the new sicee d qualita involucro dao
	 */
	public void setSiceeDQualitaInvolucroDao(
			SiceeDQualitaInvolucroDao siceeDQualitaInvolucroDao) {
		this.siceeDQualitaInvolucroDao = siceeDQualitaInvolucroDao;
	}

	/**
	 * Gets the sicee d tipo impianto dao.
	 *
	 * @return the sicee d tipo impianto dao
	 */
	public SiceeDTipoImpiantoDao getSiceeDTipoImpiantoDao() {
		return this.siceeDTipoImpiantoDao;
	}

	/**
	 * Sets the sicee d tipo impianto dao.
	 *
	 * @param siceeDTipoImpiantoDao the new sicee d tipo impianto dao
	 */
	public void setSiceeDTipoImpiantoDao(SiceeDTipoImpiantoDao siceeDTipoImpiantoDao) {
		this.siceeDTipoImpiantoDao = siceeDTipoImpiantoDao;
	}

	/**
	 * Gets the sicee d classe energetica dao.
	 *
	 * @return the sicee d classe energetica dao
	 */
	public SiceeDClasseEnergeticaDao getSiceeDClasseEnergeticaDao() {
		return this.siceeDClasseEnergeticaDao;
	}

	/**
	 * Sets the sicee d classe energetica dao.
	 *
	 * @param siceeDClasseEnergeticaDao the new sicee d classe energetica dao
	 */
	public void setSiceeDClasseEnergeticaDao(
			SiceeDClasseEnergeticaDao siceeDClasseEnergeticaDao) {
		this.siceeDClasseEnergeticaDao = siceeDClasseEnergeticaDao;
	}

	/**
	 * Gets the sicee r dest classe dao.
	 *
	 * @return the sicee r dest classe dao
	 */
	public SiceeRDestClasseDao getSiceeRDestClasseDao() {
		return this.siceeRDestClasseDao;
	}

	/**
	 * Sets the sicee r dest classe dao.
	 *
	 * @param siceeRDestClasseDao the new sicee r dest classe dao
	 */
	public void setSiceeRDestClasseDao(SiceeRDestClasseDao siceeRDestClasseDao) {
		this.siceeRDestClasseDao = siceeRDestClasseDao;
	}

	/**
	 * Gets the sicee t parametri dao.
	 *
	 * @return the sicee t parametri dao
	 */
	public SiceeTParametriDao getSiceeTParametriDao() {
		return this.siceeTParametriDao;
	}

	/**
	 * Sets the sicee t parametri dao.
	 *
	 * @param siceeTParametriDao the new sicee t parametri dao
	 */
	public void setSiceeTParametriDao(SiceeTParametriDao siceeTParametriDao) {
		this.siceeTParametriDao = siceeTParametriDao;
	}
	
	/**
	 * Gets the sicee t parametri mdp dao.
	 *
	 * @return the sicee t parametri mdp dao
	 */
	public SiceeTParametriMdpDao getSiceeTParametriMdpDao() {
		return this.siceeTParametriMdpDao;
	}

	/**
	 * Sets the sicee t parametri mdp dao.
	 *
	 * @param siceeTParametriMdpDao the new sicee t parametri dao
	 */
	public void setSiceeTParametriMdpDao(SiceeTParametriMdpDao siceeTParametriMdpDao) {
		this.siceeTParametriMdpDao = siceeTParametriMdpDao;
	}
	
	/**
	 * Gets the sicee d combustibile dao.
	 *
	 * @return the sicee d combustibile dao
	 */
	public SiceeDCombustibileDao getSiceeDCombustibileDao() {
		return this.siceeDCombustibileDao;
	}

	/**
	 * Sets the sicee d combustibile dao.
	 *
	 * @param siceeDCombustibileDao the new sicee d combustibile dao
	 */
	public void setSiceeDCombustibileDao(SiceeDCombustibileDao siceeDCombustibileDao) {
		this.siceeDCombustibileDao = siceeDCombustibileDao;
	}

	
	/**
	 * Gets the sicee d motivo sost dao.
	 *
	 * @return the sicee d motivo sost dao
	 */
	public SiceeDMotivoSostDao getSiceeDMotivoSostDao() {
		return this.siceeDMotivoSostDao;
	}

	/**
	 * Sets the sicee d motivo sost dao.
	 *
	 * @param siceeDMotivoSostDao the new sicee d motivo sost dao
	 */
	public void setSiceeDMotivoSostDao(SiceeDMotivoSostDao siceeDMotivoSostDao) {
		this.siceeDMotivoSostDao = siceeDMotivoSostDao;
	}

	public SiceeLAccessoDao getSiceeLAccessoDao() {
		return this.siceeLAccessoDao;
	}

	public void setSiceeLAccessoDao(SiceeLAccessoDao siceeLAccessoDao) {
		this.siceeLAccessoDao = siceeLAccessoDao;
	}

	/**
	 * Gets the parametro.
	 *
	 * @param param the param
	 * @return the parametro
	 * @throws SiceesrvException the siceesrv exception
	 */
	public String getParametro(String param) throws SiceesrvException {
		log.debug("[UtilMgr::getParametro] - START");
		String ret = null;
		
		try {
			SiceeTParametri p = getSiceeTParametriDao().findWhereCodiceEquals(param);
			if (p != null) {
				ret = p.getValore();
			}
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
		log.debug("[UtilMgr::getParametro] - END");
		}
		
		return ret;
	}

	/**
	 * Gets the parametroMdp.
	 *
	 * @param param the param
	 * @return the parametroMdp
	 * @throws SiceesrvException the siceesrv exception
	 */
	public String getParametroMdp(String param) throws SiceesrvException {
		log.debug("[UtilMgr::getParametroMdp] - START");
		String ret = null;
		
		try {
			SiceeTParametriMdp p = getSiceeTParametriMdpDao().findWhereCodiceEquals(param);
			if (p != null) {
				ret = p.getValore();
			}
		} catch (SiceeTParametriMdpDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
		log.debug("[UtilMgr::getParametroMdp] - END");
		}
		
		return ret;
	}
	
	/**
	 * Gets the parametroMdp.
	 *
	 * @param param the param
	 * @return the parametroMdp
	 * @throws SiceesrvException the siceesrv exception
	 */
	public ArrayList<LabelValue> getParametriPagamentoMdp() throws SiceesrvException {
		log.debug("[UtilMgr::getParametriPagamentoMdp] - START");
		ArrayList<LabelValue> labelValueList = new ArrayList<LabelValue>();
		
		try {
			List<SiceeTParametriMdp> p = getSiceeTParametriMdpDao().findCodiciPagamentoEquals();
			if (p != null && p.size() > 0) {
				
				LabelValue labelValue = null;
				for (SiceeTParametriMdp siceeTParametriMdp : p) {
					labelValue = new LabelValue();
					labelValue.setLabel(siceeTParametriMdp.getCodice());
					labelValue.setValue(siceeTParametriMdp.getValore());
					
					labelValueList.add(labelValue);
				}
			}
		} catch (SiceeTParametriMdpDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
		log.debug("[UtilMgr::getParametriPagamentoMdp] - END");
		}
		
		return labelValueList;
	}
	/**
	 * Checks if is product enabled.
	 *
	 * @return true, if is product enabled
	 * @throws SiceesrvException the siceesrv exception
	 */
	public boolean isProductEnabled() throws SiceesrvException {
		log.debug("[UtilMgr::isProductEnabled] - START");
		boolean ret = true;
		
		try {
			SiceeTParametri p = getSiceeTParametriDao().findWhereCodiceEquals(Constants.SICEE_PRODUCT_ENABLED);
			if (p != null) {
				if (!p.getValore().equalsIgnoreCase("S")) {
					ret = false;
				}
			}
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
		log.debug("[UtilMgr::isProductEnabled] - END");
		}
		
		return ret;
	}

	/**
	 * Checks if is user enabled.
	 *
	 * @param codiceFiscale the codice fiscale
	 * @return true, if is user enabled
	 * @throws SiceesrvException the siceesrv exception
	 */
	public boolean isUserEnabled(String codiceFiscale) throws SiceesrvException {
		log.debug("[UtilMgr::isUserEnabled] - START");
		boolean ret = false;
		
		try {
			if (!isProductEnabled()) {
				SiceeTParametri p = getSiceeTParametriDao().findWhereCodiceEquals(Constants.SICEE_USER_ENABLED);				
				if (p != null) {
					String[] cf = p.getValore().split(",");
					for (int i = 0; i < cf.length; i++) {
						if (cf[i].equalsIgnoreCase(codiceFiscale)) {
							ret = true;
							break;
						}
					}
				}
			} else {
				ret = true;
			}
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
		log.debug("[UtilMgr::isUserEnabled] - END");
		}
		
		return ret;
	}

	/**
	 * Checks if is service enabled.
	 *
	 * @param nomeServizio the nome servizio
	 * @return true, if is service enabled
	 * @throws SiceesrvException the siceesrv exception
	 */
	public boolean isServiceEnabled(String nomeServizio) throws SiceesrvException {
		log.debug("[UtilMgr::isUserEnabled] - START");
		boolean ret = true;
		
		try {
			if (!isProductEnabled()) {
				SiceeTParametri p = getSiceeTParametriDao().findWhereCodiceEquals(Constants.SICEE_SERVICE_ENABLED + nomeServizio.toUpperCase());				
				if (p != null) {
					if (!p.getValore().equalsIgnoreCase("S")) {
						ret = false;
					}
				}
			}
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
		log.debug("[UtilMgr::isUserEnabled] - END");
		}
		
		return ret;
	}


	/**
	 * Gets the descrizione motivo rilascio.
	 *
	 * @param id the id
	 * @return the descrizione motivo rilascio
	 */
	public String getDescrizioneMotivoRilascio(String id) {
		try {
			return getSiceeDMotivoRilascioDao().findByPrimaryKey(
					convertToInteger(id)).getDescr();
		} catch (SiceeDMotivoRilascioDaoException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Checks if is edificio.
	 *
	 * @param id the id
	 * @return true, if is edificio
	 */
	public boolean isEdificio(String id) {
		try {
			String flg = getSiceeDDestUsoDao().findByPrimaryKey(
					convertToInteger(id)).getFlgEdificio();

			return (flg != null && flg
					.equalsIgnoreCase(it.csi.sicee.siceesrv.business.util.Constants.EDIFICIO_RESIDENZIALE));
		} catch (SiceeDDestUsoDaoException e) {
			log.error(e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Gets the sigla destinazione duso.
	 *
	 * @param id the id
	 * @return the sigla destinazione duso
	 */
	public String getSiglaDestinazioneDuso(String id) {
		try {
			return getSiceeDDestUsoDao().findByPrimaryKey(convertToInteger(id))
					.getSigla();
		} catch (SiceeDDestUsoDaoException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Gets the descrizione tipo impianto.
	 *
	 * @param id the id
	 * @return the descrizione tipo impianto
	 */
	public String getDescrizioneTipoImpianto(String id) {
		try {
			return getSiceeDTipoImpiantoDao().findByPrimaryKey(
					convertToInteger(id)).getDescr();
		} catch (SiceeDTipoImpiantoDaoException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Gets the motivo annullamento by id.
	 *
	 * @param idMotivo the id motivo
	 * @return the motivo annullamento by id
	 */
	public MotivoAnnullamento getMotivoAnnullamentoById(Integer idMotivo){
		MotivoAnnullamento ret = null;
		try {
			SiceeDMotivoSost motivazione = getSiceeDMotivoSostDao()
			.findByPrimaryKey(idMotivo);
			
			if (motivazione != null)
			{
				ret = new MotivoAnnullamento();
				ret.setCod(convertToString(motivazione.getIdMotivoSost()));
				ret.setDescr(motivazione.getDescr());
			}
		}
		catch (SiceeDMotivoSostDaoException e) {
			log.error(e.getMessage(), e);
		}
		return ret;
	}

	/**
	 * Gets the descrizione comustibile fossile.
	 *
	 * @param id the id
	 * @return the descrizione comustibile fossile
	 */
	public String getDescrizioneComustibileFossile(String id) {
		try {
			return getSiceeDCombustibileDao().findByPrimaryKey(
					convertToInteger(id)).getDescr();
		} catch (SiceeDCombustibileDaoException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
	
	/**
	 * Gets the descrizione classe energetica.
	 *
	 * @param id the id
	 * @return the descrizione classe energetica
	 */
	public String getDescrizioneClasseEnergetica(String id) {
		try {
			return getSiceeDClasseEnergeticaDao().findByPrimaryKey(
					convertToInteger(id)).getDescr();
		} catch (SiceeDClasseEnergeticaDaoException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
	
	/**
	 * Gets the descrizione qualita involucro.
	 *
	 * @param id the id
	 * @return the descrizione qualita involucro
	 */
	public String getDescrizioneQualitaInvolucro(String id) {
		try {
			return getSiceeDQualitaInvolucroDao().findByPrimaryKey(
					convertToInteger(id)).getDescr();
		} catch (SiceeDQualitaInvolucroDaoException e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
	

	/**
	 * Gets the classe energetica per valore.
	 *
	 * @param indPrestEnergGlobLim the ind prest energ glob lim
	 * @param destUso the dest uso
	 * @return the classe energetica per valore
	 */
	public String getClasseEnergeticaPerValore(
			Double indPrestEnergGlobLim, Integer destUso) {
		List<SiceeRDestClasse> list;
		String codClasseEnergetica = null;
		try {
			list = getSiceeRDestClasseDao().findWhereIdDestUsoEquals(destUso);

			Iterator<SiceeRDestClasse> iter = list.iterator();

			while (iter.hasNext()) {
				SiceeRDestClasse r = iter.next();
				if (indPrestEnergGlobLim >= r.getMin()
						&& indPrestEnergGlobLim < r.getMax()) {
					SiceeDClasseEnergetica c = getSiceeDClasseEnergeticaDao()
							.findByPrimaryKey(r.getIdClasse());

					codClasseEnergetica = c.getDescr();
				}
			}
		} catch (SiceeRDestClasseDaoException e) {
			log.error(e);
		} catch (SiceeDClasseEnergeticaDaoException e) {
			log.error(e);
		}
		return codClasseEnergetica;
	}
	
	public void insertLogAccesso(String codiceFiscale, String nome, String cognome, String ruolo) throws SiceesrvException {
		log.debug("[UtilMgr::insertLogAccesso] - START");
		try {
			SiceeLAccesso logAccesso = new SiceeLAccesso();
			logAccesso.setDtAccesso(GenericUtil.getSqlDataCorrente());
			logAccesso.setCodiceFiscale(codiceFiscale);
			logAccesso.setNome(nome);
			logAccesso.setCognome(cognome);
			logAccesso.setRuolo(ruolo);
			
			getSiceeLAccessoDao().insert(logAccesso);
			
		} catch (SiceeLAccessoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} finally {
			log.debug("[UtilMgr::insertLogAccesso] - END");
		}
	}

}
