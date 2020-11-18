/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.facade;




import it.csi.sicee.siceesrv.business.dao.dao.OptimizedCertificatoriDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeDTitoloDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTAziendaDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTCertificatoreDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDocumentoDao;
import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriDao;
import it.csi.sicee.siceesrv.business.dao.dto.OptimizedCertificatori;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeDTitolo;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTAzienda;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTCertificatore;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumento;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametri;
import it.csi.sicee.siceesrv.business.dao.exceptions.OptimizedCertificatoriDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeDTitoloDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTAziendaDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTCertificatoreDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTDocumentoDaoException;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.Certificatore;
import it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori;
import it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

import java.util.Iterator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Facade di gestione dell'entita' Certificatore.
 *
 * @author 869
 */
public class CertificatoreMgr extends BaseMgr {
	
	/** The sicee t documento dao. */
	private SiceeTDocumentoDao siceeTDocumentoDao;
	
	/**
	 * Gets the sicee t documento dao.
	 *
	 * @return the sicee t documento dao
	 */
	public SiceeTDocumentoDao getSiceeTDocumentoDao() {
		return this.siceeTDocumentoDao;
	}
	
	/**
	 * Sets the sicee t documento dao.
	 *
	 * @param siceeTDocumentoDao the new sicee t documento dao
	 */
	public void setSiceeTDocumentoDao(SiceeTDocumentoDao siceeTDocumentoDao) {
		this.siceeTDocumentoDao = siceeTDocumentoDao;
	}

	/** The sicee t certificatore dao. */
	private SiceeTCertificatoreDao siceeTCertificatoreDao;
	
	/**
	 * Gets the sicee t certificatore dao.
	 *
	 * @return the sicee t certificatore dao
	 */
	public SiceeTCertificatoreDao getSiceeTCertificatoreDao() {
		return this.siceeTCertificatoreDao;
	}
	
	/**
	 * Sets the sicee t certificatore dao.
	 *
	 * @param siceeTCertificatoreDao the new sicee t certificatore dao
	 */
	public void setSiceeTCertificatoreDao(
			SiceeTCertificatoreDao siceeTCertificatoreDao) {
		this.siceeTCertificatoreDao = siceeTCertificatoreDao;
	}

	/** The sicee t azienda dao. */
	private SiceeTAziendaDao siceeTAziendaDao;
	
	/**
	 * Gets the sicee t azienda dao.
	 *
	 * @return the sicee t azienda dao
	 */
	public SiceeTAziendaDao getSiceeTAziendaDao() {
		return this.siceeTAziendaDao;
	}
	
	/**
	 * Sets the sicee t azienda dao.
	 *
	 * @param siceeTAziendaDao the new sicee t azienda dao
	 */
	public void setSiceeTAziendaDao(
			SiceeTAziendaDao siceeTAziendaDao) {
		this.siceeTAziendaDao = siceeTAziendaDao;
	}
	
	/** The optimized certificatori dao. */
	private OptimizedCertificatoriDao optimizedCertificatoriDao;

	/**
	 * Gets the optimized certificatori dao.
	 *
	 * @return the optimized certificatori dao
	 */
	public OptimizedCertificatoriDao getOptimizedCertificatoriDao() {
		return this.optimizedCertificatoriDao;
	}
	
	/**
	 * Sets the optimized certificatori dao.
	 *
	 * @param optimizedCertificatoriDao the new optimized certificatori dao
	 */
	public void setOptimizedCertificatoriDao(
			OptimizedCertificatoriDao optimizedCertificatoriDao) {
		this.optimizedCertificatoriDao = optimizedCertificatoriDao;
	}

	/** The sicee d titolo dao. */
	private SiceeDTitoloDao siceeDTitoloDao;
	
	/**
	 * Gets the sicee d titolo dao.
	 *
	 * @return the sicee d titolo dao
	 */
	public SiceeDTitoloDao getSiceeDTitoloDao() {
		return this.siceeDTitoloDao;
	}
	
	/**
	 * Sets the sicee d titolo dao.
	 *
	 * @param siceeDTitoloDao the new sicee d titolo dao
	 */
	public void setSiceeDTitoloDao(
			SiceeDTitoloDao siceeDTitoloDao) {
		this.siceeDTitoloDao = siceeDTitoloDao;
	}
	
	/** The sicee t parametri dao. */
	private SiceeTParametriDao siceeTParametriDao;

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
	 * Find elenco certificatori.
	 *
	 * @param filtro the filtro
	 * @return the certificatore[]
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Certificatore[] findElencoCertificatori(FiltroRicercaCertificatori filtro) throws SiceesrvException {
		log.debug("[CertificatoreMgr::findElencoCertificatori] - START");
		Certificatore[] cert = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				List<OptimizedCertificatori> list = getOptimizedCertificatoriDao().findElencoCertificatori(filtro, new Long(param.getValore()));			
				cert = convertToCertificatoreArray(list);
			}
		} catch (OptimizedCertificatoriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[CertificatoreMgr::findElencoCertificatori] - END");
		}
		return cert;		
	}
	
	/**
	 * Find certificatore.
	 *
	 * @param matricola the matricola
	 * @return the certificatore
	 * @throws SiceesrvException the siceesrv exception
	 */
	public Certificatore findCertificatore(String matricola) throws SiceesrvException {
		log.debug("[CertificatoreMgr::findCertificatore] - START");
		Certificatore certificatore = null;
		try {
			SiceeTParametri param = getSiceeTParametriDao().findWhereCodiceEquals(NUMERO_MINIMO_ID_CERTIFICATORE);
			if (verifyParam(param)) {
				if (new Long(matricola.substring(1)) > new Long(param.getValore())) {
					SiceeTCertificatore cert = getSiceeTCertificatoreDao().findWhereNumCertificatoreEquals(matricola);
					if (cert != null) {				
						SiceeTAzienda azienda = getSiceeTAziendaDao().findByPrimaryKey(cert.getFkAzienda());
						SiceeDTitolo titolo = getSiceeDTitoloDao().findByPrimaryKey(cert.getFkTitolo());
						SiceeTDocumento doc = getSiceeTDocumentoDao().findWhereIdCertificatoreAndIdTipoDocumentoEquals(cert.getIdCertificatore(), TIPO_DOC_CURRICULUM_VITAE);
						certificatore = convertToCertificatore(cert, azienda, titolo, doc );
					}
				}
			}
		} catch (SiceeTCertificatoreDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTAziendaDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeDTitoloDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTParametriDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		} catch (SiceeTDocumentoDaoException e) {
			log.error(e);
			throw new SiceesrvException(e.getMessage(), e);
		}
		finally {
			log.debug("[CertificatoreMgr::findCertificatore] - END");
		}
		
		return certificatore;
		
	}
	
	/**
	 * Convert to certificatore.
	 *
	 * @param cert the cert
	 * @param azienda the azienda
	 * @param titolo the titolo
	 * @param doc the doc
	 * @return the certificatore
	 */
	private Certificatore convertToCertificatore(
			SiceeTCertificatore cert, SiceeTAzienda azienda, SiceeDTitolo titolo, SiceeTDocumento doc) {
		if (cert == null)
			return null;
		
		Certificatore c = new Certificatore();
		c.setCognome(cert.getCognome());
		c.setNome(cert.getNome());
		
		c.setMatricola(cert.getNumCertificatore());
		
		if (titolo != null)
		{
			c.setTitolo(titolo.getDescr());
		}
		
		if (convertToBoolean(cert.getFlgConsensoEmail())) {
			c.setEmail(cert.getEmail());
		}
		if (convertToBoolean(cert.getFlgConsensoCell())) {
			c.setCellulare(cert.getCell());
		}
		if (convertToBoolean(cert.getFlgConsensoTel())) {
			c.setTelefono(cert.getTelefono());
		}
		
		c.setIndirizzo(createAddress(azienda.getDescIndirizzo(), azienda.getNumCivico()));
		c.setCivico(azienda.getNumCivico());
		c.setSitoWeb(cert.getSitoWeb());
		c.setEsameSostenuto(cert.getFlgEsameSostenuto());
		
		if (!isNullOrEmpty(azienda.getPIva())) {					
			c.setComune(azienda.getDescComune());
			c.setProvincia(azienda.getDescProv());
			c.setRegione(azienda.getDescRegione());
		} else {
			c.setComune(cert.getDescComuneResidenza());
			c.setProvincia(cert.getDescProvResidenza());
			c.setRegione(cert.getDescRegioneResidenza());
		}
		
		
		c.setRagioneSociale(azienda.getDenominazione());
		
		if (doc != null) {
			c.setUidCurriculum(doc.getIdentificDoc());
		}
		
		return c;
		
	}
	
	/**
	 * Creates the address.
	 *
	 * @param descIndirizzo the desc indirizzo
	 * @param numCivico the num civico
	 * @return the string
	 */
	private String createAddress(String descIndirizzo, String numCivico) {
		if (!isNullOrEmpty(numCivico)) {
			return descIndirizzo + ", " + numCivico;
		}
		
		return descIndirizzo;
	}
	
	/**
	 * Convert to certificatore.
	 *
	 * @param cert the cert
	 * @return the certificatore
	 */
	private Certificatore convertToCertificatore(OptimizedCertificatori cert) {
		if (cert == null)
			return null;
		
		Certificatore c = new Certificatore();
		
		c.setCognome(cert.getCognome());
		c.setNome(cert.getNome());
		
		c.setMatricola(cert.getMatricola());
		
		c.setTitolo(cert.getTitolo());
		
		if (convertToBoolean(cert.getFlgConsensoEmail())) {
			c.setEmail(cert.getEmail());
		}
		if (convertToBoolean(cert.getFlgConsensoCell())) {
			c.setCellulare(cert.getCell());
		}
		if (convertToBoolean(cert.getFlgConsensoTell())) {
			c.setTelefono(cert.getTelefono());
		}
		
		
		c.setIndirizzo(createAddress(cert.getDescIndirizzo(), cert.getNumCivico()));
		c.setCivico(cert.getNumCivico());
		c.setRegione(cert.getDescIndirizzo());
		c.setComune(cert.getDescComune());		
		c.setProvincia(cert.getDescProv());
		c.setRagioneSociale(cert.getDenominazione());
		c.setEsameSostenuto(cert.getFlgEsameSostenuto());
		c.setSitoWeb(cert.getSitoWeb());
		
		
		
		return c;
		
	}
	
	/**
	 * Convert to certificatore array.
	 *
	 * @param array the array
	 * @return the certificatore[]
	 */
	private Certificatore[] convertToCertificatoreArray(
			List<OptimizedCertificatori> array) {
		
		if (array == null)
			return null;
		
		Certificatore[] ret = new Certificatore[array.size()]; 
		
		Iterator<OptimizedCertificatori> iter = array.iterator();
		
		int i = 0;		
		while (iter.hasNext()) {
			ret[i++] = convertToCertificatore(iter.next());
		}
		
		
		
		return ret;
		
	}
	
	/**
	 * Calcola numero matricola.
	 *
	 * @param cert the cert
	 * @param titolo the titolo
	 * @return the string
	 */
	public String calcolaNumeroMatricola(SiceeTCertificatore cert, SiceeDTitolo titolo) {
		String prog = "00000".substring(0,(5-cert.getIdCertificatore().length()))+cert.getIdCertificatore();
		String sigla = titolo.getSigla();
		return sigla+prog;
	}
	
	/**
	 * Calcola numero matricola.
	 *
	 * @param cert the cert
	 * @return the string
	 */
	public String calcolaNumeroMatricola(OptimizedCertificatori cert) {
		String prog = "00000".substring(0,(5-cert.getIdCertificatore().length()))+cert.getIdCertificatore();
		String sigla = cert.getSigla();
		return sigla+prog;
	}
	
	
		
}
