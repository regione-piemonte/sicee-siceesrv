
package it.csi.sicee.siceesrv.business.siceesrv;

import it.csi.csi.wrapper.CSIException;
import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UnrecoverableException;

import it.csi.sicee.siceesrv.dto.siceesrv.*;

import it.csi.sicee.siceesrv.interfacecsi.siceesrv.*;

import it.csi.sicee.siceesrv.exception.siceesrv.*;

import it.csi.sicee.siceesrv.business.siceesrv.spring.SpringBeanLocator;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.apache.log4j.*;

/**
 * @generated
 */
public class SiceesrvBean implements SessionBean {

	// business delegate contenente le implementazioni del servizio
	/**
	 * @generated
	 */
	protected SiceesrvImpl delegate = null;

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceesrv";
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);

	/// Operazioni esposte dal servizio

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Certificatore[] findElencoCertificatori( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findElencoCertificatori()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Certificatore[] valueObjRet = delegate.findElencoCertificatori(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findElencoCertificatori()",
					"invocazione servizio [siceesrv]::[findElencoCertificatori]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findElencoCertificatori()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace findAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Ace valueObjRet = delegate.findAce(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findAce()", "invocazione servizio [siceesrv]::[findAce]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::findAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace[] findAceFiltro( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findAceFiltro()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Ace[] valueObjRet = delegate.findAceFiltro(

					filtro,

					idCertificatore,

					flgPregresso,

					flgSostituzione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findAceFiltro()", "invocazione servizio [siceesrv]::[findAceFiltro]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::findAceFiltro()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Certificatore findCertificatore( //NOSONAR  Reason:EIAS

			java.lang.String matricola //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findCertificatore()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Certificatore valueObjRet = delegate.findCertificatore(

					matricola

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findCertificatore()",
					"invocazione servizio [siceesrv]::[findCertificatore]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findCertificatore()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Titolo[] elencoTitoli( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::elencoTitoli()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Titolo[] valueObjRet = delegate.elencoTitoli(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "elencoTitoli()", "invocazione servizio [siceesrv]::[elencoTitoli]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::elencoTitoli()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Notaio findNotaio( //NOSONAR  Reason:EIAS

			java.lang.String email //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findNotaio()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Notaio valueObjRet = delegate.findNotaio(

					email

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findNotaio()", "invocazione servizio [siceesrv]::[findNotaio]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::findNotaio()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public int updateInvioLog( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.InvioLog log //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::updateInvioLog()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			int valueObjRet = delegate.updateInvioLog(

					log

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "updateInvioLog()", "invocazione servizio [siceesrv]::[updateInvioLog]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::updateInvioLog()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getParametro( //NOSONAR  Reason:EIAS

			java.lang.String param //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getParametro()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getParametro(

					param

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getParametro()", "invocazione servizio [siceesrv]::[getParametro]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::getParametro()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public boolean isProductEnabled( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::isProductEnabled()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			boolean valueObjRet = delegate.isProductEnabled(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "isProductEnabled()",
					"invocazione servizio [siceesrv]::[isProductEnabled]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::isProductEnabled()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public boolean isUserEnabled( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::isUserEnabled()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			boolean valueObjRet = delegate.isUserEnabled(

					codiceFiscale

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "isUserEnabled()", "invocazione servizio [siceesrv]::[isUserEnabled]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::isUserEnabled()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public boolean isServiceEnabled( //NOSONAR  Reason:EIAS

			java.lang.String nomeServizio //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::isServiceEnabled()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			boolean valueObjRet = delegate.isServiceEnabled(

					nomeServizio

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "isServiceEnabled()",
					"invocazione servizio [siceesrv]::[isServiceEnabled]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::isServiceEnabled()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace[] findAceSostitutivi( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findAceSostitutivi()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Ace[] valueObjRet = delegate.findAceSostitutivi(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findAceSostitutivi()",
					"invocazione servizio [siceesrv]::[findAceSostitutivi]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findAceSostitutivi()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.String scrittaSfondo, //NOSONAR  Reason:EIAS

			byte[] foto //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getStampaCertificato()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaCertificato(

					numCertificatore,

					progrCertificato,

					annoCertificato,

					scrittaSfondo,

					foto

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getStampaCertificato()",
					"invocazione servizio [siceesrv]::[getStampaCertificato]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getStampaCertificato()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String findUidFotoAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findUidFotoAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.findUidFotoAce(

					filtro

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findUidFotoAce()", "invocazione servizio [siceesrv]::[findUidFotoAce]",
					"(valore input omesso)");
			logger.debug("[SiceesrvBean::findUidFotoAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaRicevutaInvioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getStampaRicevutaInvioAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaRicevutaInvioAce(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getStampaRicevutaInvioAce()",
					"invocazione servizio [siceesrv]::[getStampaRicevutaInvioAce]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getStampaRicevutaInvioAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.Integer findAceFiltroCount( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findAceFiltroCount()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			java.lang.Integer valueObjRet = delegate.findAceFiltroCount(

					filtro,

					idCertificatore,

					flgPregresso,

					flgSostituzione

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findAceFiltroCount()",
					"invocazione servizio [siceesrv]::[findAceFiltroCount]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findAceFiltroCount()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace findAceFlgPregresso( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findAceFlgPregresso()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Ace valueObjRet = delegate.findAceFlgPregresso(

					filtro,

					flgPregresso

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findAceFlgPregresso()",
					"invocazione servizio [siceesrv]::[findAceFlgPregresso]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findAceFlgPregresso()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] getDettaglioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getDettaglioAce()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] valueObjRet = delegate.getDettaglioAce(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getDettaglioAce()",
					"invocazione servizio [siceesrv]::[getDettaglioAce]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getDettaglioAce()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace[] findAceMonitoraggio( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findAceMonitoraggio()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Ace[] valueObjRet = delegate.findAceMonitoraggio(

					idCertificatore

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findAceMonitoraggio()",
					"invocazione servizio [siceesrv]::[findAceMonitoraggio]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findAceMonitoraggio()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public void notificaRenditionDisponibile( //NOSONAR  Reason:EIAS

			java.lang.Double idRichiestaPrenotazione, //NOSONAR  Reason:EIAS

			java.lang.String documentRenditionId //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::notificaRenditionDisponibile()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			delegate.notificaRenditionDisponibile(

					idRichiestaPrenotazione,

					documentRenditionId

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "notificaRenditionDisponibile()",
					"invocazione servizio [siceesrv]::[notificaRenditionDisponibile]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::notificaRenditionDisponibile()] - END");

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String findUidRifIndex( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.Integer idTipoDoc //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findUidRifIndex()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.findUidRifIndex(

					numCertificatore,

					progrCertificato,

					annoCertificato,

					idTipoDoc

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findUidRifIndex()",
					"invocazione servizio [siceesrv]::[findUidRifIndex]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findUidRifIndex()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getXmlStampaCertificato2015( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			byte[] fotoPrincipale, //NOSONAR  Reason:EIAS

			java.lang.Integer idStatoAttestato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getXmlStampaCertificato2015()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getXmlStampaCertificato2015(

					idCertificatore,

					progrCertificato,

					annoCertificato,

					fotoPrincipale,

					idStatoAttestato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getXmlStampaCertificato2015()",
					"invocazione servizio [siceesrv]::[getXmlStampaCertificato2015]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getXmlStampaCertificato2015()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaCertificato2015( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			byte[] fotoPrincipale, //NOSONAR  Reason:EIAS

			java.lang.Integer idStatoAttestato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getStampaCertificato2015()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaCertificato2015(

					idCertificatore,

					progrCertificato,

					annoCertificato,

					fotoPrincipale,

					idStatoAttestato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getStampaCertificato2015()",
					"invocazione servizio [siceesrv]::[getStampaCertificato2015]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getStampaCertificato2015()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String findUidFotoPrincipaleApe( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findUidFotoPrincipaleApe()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.findUidFotoPrincipaleApe(

					idCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findUidFotoPrincipaleApe()",
					"invocazione servizio [siceesrv]::[findUidFotoPrincipaleApe]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findUidFotoPrincipaleApe()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getXmlStampaTarghettaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getXmlStampaTarghettaCertificato()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getXmlStampaTarghettaCertificato(

					idCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getXmlStampaTarghettaCertificato()",
					"invocazione servizio [siceesrv]::[getXmlStampaTarghettaCertificato]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getXmlStampaTarghettaCertificato()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public byte[] getStampaTarghettaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getStampaTarghettaCertificato()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			byte[] valueObjRet = delegate.getStampaTarghettaCertificato(

					idCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getStampaTarghettaCertificato()",
					"invocazione servizio [siceesrv]::[getStampaTarghettaCertificato]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getStampaTarghettaCertificato()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione findProtocollazione( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::findProtocollazione()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione valueObjRet = delegate.findProtocollazione(

					numCertificatore,

					progrCertificato,

					annoCertificato

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "findProtocollazione()",
					"invocazione servizio [siceesrv]::[findProtocollazione]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::findProtocollazione()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public java.lang.String getParametroMdp( //NOSONAR  Reason:EIAS

			java.lang.String param //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getParametroMdp()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			java.lang.String valueObjRet = delegate.getParametroMdp(

					param

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getParametroMdp()",
					"invocazione servizio [siceesrv]::[getParametroMdp]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getParametroMdp()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] getParametriPagamentoMdp( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::getParametriPagamentoMdp()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] valueObjRet = delegate.getParametriPagamentoMdp(

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "getParametriPagamentoMdp()",
					"invocazione servizio [siceesrv]::[getParametriPagamentoMdp]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::getParametriPagamentoMdp()] - END");

			return valueObjRet;

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public void insertLogAccesso( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale, //NOSONAR  Reason:EIAS

			java.lang.String nome, //NOSONAR  Reason:EIAS

			java.lang.String cognome, //NOSONAR  Reason:EIAS

			java.lang.String ruolo //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS 
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException

	{ //NOSONAR  Reason:EIAS
		try {

			logger.debug("[SiceesrvBean::insertLogAccesso()] - START");
			it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
			// inizio misurazione
			watcher.start();

			delegate.insertLogAccesso(

					codiceFiscale,

					nome,

					cognome,

					ruolo

			);

			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvBean", "insertLogAccesso()",
					"invocazione servizio [siceesrv]::[insertLogAccesso]", "(valore input omesso)");
			logger.debug("[SiceesrvBean::insertLogAccesso()] - END");

		} catch (CSIException e) {

			throw e;
		} catch (Exception e) {

			throw new UnrecoverableException("Errore non recuperabile durante l'esecuzione del metodo:" + e, e);
		}
	}

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS 
		return delegate.testResources();
	}

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		return delegate.selfCheck(alreadyChecked);
	}

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		return delegate.hasSelfCheck();
	}

	/// lifecycle dell EJB

	/**
	 * @generated
	 */
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub

	}

	/**
	 * @generated
	 */
	public void ejbCreate() {
	}

	/**
	 * @generated
	 */
	SessionContext ctx = null;

	/**
	 * @generated
	 */
	public void createImpl(Object initOptions) throws EJBException {
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvBean::createImpl] - START");
		try {
			delegate = (SiceesrvImpl) SpringBeanLocator.getBean("siceesrvImpl");
			delegate.init(initOptions);

		}

		catch (Exception ie) {
			logger.debug("[SiceesrvBean::createImpl] - ERROR", ie);
			throw new EJBException(
					"Errore nella inizializzazione dell'implementazione del servizio siceesrv:" + ie.getMessage(), ie);
		} finally {
			logger.debug("[SiceesrvBean::createImpl] - END");
		}
	}

	/**
	 * @generated
	 */
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {

		/// META-TODO: forse sarebbe opportuno accodare il nome del servizio al logger...
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvBean::setSessionContext] - START");
		this.ctx = ctx;
		// contiene eventuali oggetti inizializzati nella sezione seguente e che
		// devono essere passati all'oggetto delegate
		Object implInitOptions = null;

		/// Inizializzazione risorse
		/*PROTECTED REGION ID(R1264488095) ENABLED START*/
		// inserire qui il codice di inziializzazione risorse:
		// non verrà cancellato dalle successive rignerazioni
		// esempio di cose da fare:
		// -- leggere environment entry o context jndi 
		// -- inizializzare datasource, altre risorse
		// -- inserire le options in 'implInitOptions': saranno poi 
		//    passate al metodo initImpl()
		// NOTA: il contenuto specifico dell'oggetto implInitOptions è
		// specifico di ogni applicazione		
		/*PROTECTED REGION END*/
		/// creazione dell'implementazione
		createImpl(implInitOptions);
		logger.debug("[SiceesrvBean::setSessionContext] - END");
	}

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}
}
