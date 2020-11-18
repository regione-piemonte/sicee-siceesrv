
package it.csi.sicee.siceesrv.business.siceesrv;

import it.csi.csi.wrapper.*;

import it.csi.sicee.siceesrv.dto.siceesrv.*;

import it.csi.sicee.siceesrv.interfacecsi.siceesrv.*;

import it.csi.sicee.siceesrv.exception.siceesrv.*;

import it.csi.coopdiag.api.*;
import it.csi.coopdiag.engine.utils.*;

import javax.ejb.SessionContext;
import javax.sql.DataSource;
import org.apache.log4j.*;

/*PROTECTED REGION ID(R982526847) ENABLED START*/
// aggiungere qui eventuali import aggiuntive.
// verranno preservate in rigenerazioni successive del progetto
import it.csi.sicee.siceesrv.business.facade.CertificatoMgr;
import it.csi.sicee.siceesrv.business.facade.CertificatoreMgr;
import it.csi.sicee.siceesrv.business.facade.TitoloMgr;
import it.csi.sicee.siceesrv.business.facade.UserMgr;
import it.csi.sicee.siceesrv.business.facade.UtilMgr;
import it.csi.sicee.siceesrv.business.print.PrintAce;
import it.csi.sicee.siceesrv.business.print.PrintApe;
import it.csi.sicee.siceesrv.business.print.PrintRicevutaInvioAce;
import it.csi.sicee.siceesrv.business.print.dto.ApeReadOnlyData;
import it.csi.sicee.siceesrv.business.print.dto.ApeTarghettaReadOnlyData;
import it.csi.sicee.siceesrv.business.siceesrv.spring.SpringBeanLocator;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.util.beanlocatorfactory.ServiceBeanLocator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

/*PROTECTED REGION END*/

/**
 * @generated
 */
public class SiceesrvImpl {
	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceesrv";

	/*PROTECTED REGION ID(R-694278239) ENABLED START*/
	// inserire qui la definizione di varibili locale o costanti dell'implementazione.
	// non verranno sovrascritte da successive rigenerazioni

	/*PROTECTED REGION END*/

	/// Implementazione operazioni esposte dal servizio

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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findElencoCertificatori] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R459855299) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-808698269) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findElencoCertificatori'.
			// non verrà sovrascritto nelle successive rigenerazioni			
			return getCertificatoreMgr().findElencoCertificatori(filtro);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findElencoCertificatori] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findElencoCertificatori] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findElencoCertificatori()",
					"invocazione servizio [siceesrv]::[findElencoCertificatori]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findElencoCertificatori] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findAce] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R913554250) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R385639402) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findAce'.
			// non verrà sovrascritto nelle successive rigenerazioni
			getLogger(null).debug("Filtro: ");
			getLogger(null).debug("anno: " + filtro.getAnno());
			getLogger(null).debug("certificatore: " + filtro.getCertificatore());
			getLogger(null).debug("numero: " + filtro.getNumero());
			getLogger(null).debug("stato: " + filtro.getStato());

			return getCertificatoMgr().findAceFlgPregresso(filtro, false);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::findAce] - Errore CSI occorso durante l'esecuzione del metodo:" + ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findAce] - Errore imprevisto occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findAce()", "invocazione servizio [siceesrv]::[findAce]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::findAce] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findAceFiltro] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1232491762) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-892992110) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findAceFiltro'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");
			getLogger(null).debug("codProv: " + filtro.getCodProv());
			getLogger(null).debug("codComune: " + filtro.getCodComune());
			getLogger(null).debug("descComune: " + filtro.getDescComune());
			getLogger(null).debug("descIndirizzo: " + filtro.getDescIndirizzo());

			getLogger(null).debug("numCivico: " + filtro.getNumCivico());
			getLogger(null).debug("sezione: " + filtro.getSezione());
			getLogger(null).debug("foglio: " + filtro.getFoglio());
			getLogger(null).debug("particella: " + filtro.getParticella());
			getLogger(null).debug("subalterno: " + filtro.getSubalterno());
			getLogger(null).debug("stato: " + filtro.getStato());
			getLogger(null).debug("idCertificatore: " + idCertificatore);

			getLogger(null).debug("flgPregresso: " + flgPregresso);
			getLogger(null).debug("flgSostituzione: " + flgSostituzione);

			return getCertificatoMgr().findAceFiltro(filtro, idCertificatore, flgPregresso, flgSostituzione, false);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::findAceFiltro] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findAceFiltro] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findAceFiltro()", "invocazione servizio [siceesrv]::[findAceFiltro]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::findAceFiltro] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findCertificatore] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-580640357) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-668302789) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findCertificatore'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getCertificatoreMgr().findCertificatore(matricola);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findCertificatore] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findCertificatore] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findCertificatore()",
					"invocazione servizio [siceesrv]::[findCertificatore]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findCertificatore] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::elencoTitoli] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1934493431) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni

		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-2141604759) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'elencoTitoli'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getTitoloMgr().elencoTitoli();

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::elencoTitoli] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error("[SiceesrvImpl::elencoTitoli] - Errore imprevisto occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "elencoTitoli()", "invocazione servizio [siceesrv]::[elencoTitoli]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::elencoTitoli] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findNotaio] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1129288339) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-70287155) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findNotaio'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUserMgr().getNotaio(email);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::findNotaio] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findNotaio] - Errore imprevisto occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findNotaio()", "invocazione servizio [siceesrv]::[findNotaio]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::findNotaio] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::updateInvioLog] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1808686998) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R343196406) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'updateInvioLog'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUserMgr().updateInvioLog(log);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::updateInvioLog] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::updateInvioLog] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "updateInvioLog()", "invocazione servizio [siceesrv]::[updateInvioLog]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::updateInvioLog] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getParametro] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1601042243) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1393930915) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getParametro'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUtilMgr().getParametro(param);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::getParametro] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error("[SiceesrvImpl::getParametro] - Errore imprevisto occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getParametro()", "invocazione servizio [siceesrv]::[getParametro]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::getParametro] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::isProductEnabled] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-9653284) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R403160892) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'isProductEnabled'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUtilMgr().isProductEnabled();

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::isProductEnabled] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::isProductEnabled] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "isProductEnabled()",
					"invocazione servizio [siceesrv]::[isProductEnabled]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::isProductEnabled] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::isUserEnabled] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1094823764) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1074659660) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'isUserEnabled'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUtilMgr().isUserEnabled(codiceFiscale);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::isUserEnabled] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::isUserEnabled] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "isUserEnabled()", "invocazione servizio [siceesrv]::[isUserEnabled]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::isUserEnabled] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::isServiceEnabled] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1914351786) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1501537610) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'isServiceEnabled'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUtilMgr().isServiceEnabled(nomeServizio);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::isServiceEnabled] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::isServiceEnabled] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "isServiceEnabled()",
					"invocazione servizio [siceesrv]::[isServiceEnabled]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::isServiceEnabled] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findAceSostitutivi] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1365316213) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R212115691) ENABLED START*/
			getLogger(null).debug("Filtro: ");
			getLogger(null).debug("anno: " + filtro.getAnno());
			getLogger(null).debug("certificatore: " + filtro.getCertificatore());
			getLogger(null).debug("numero: " + filtro.getNumero());

			return getCertificatoMgr().findAceSostitutivi(filtro);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findAceSostitutivi] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findAceSostitutivi] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findAceSostitutivi()",
					"invocazione servizio [siceesrv]::[findAceSostitutivi]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findAceSostitutivi] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getStampaCertificato] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1063362099) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1274757843) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getStampaCertificato'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("STAMPA PARAMETRI INPUT: ");
			getLogger(null).debug("numCertificatore: " + numCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);
			getLogger(null).debug("scrittaSfondo: " + scrittaSfondo);
			getLogger(null).debug("foto: " + foto);

			PrintAce printAce = new PrintAce();

			ByteArrayInputStream isPDF = printAce.stampaModulo(getCertificatoMgr().compilaCertificatoPerStampa(
					numCertificatore, progrCertificato, annoCertificato), scrittaSfondo, foto);

			/*
			java.io.InputStream isPDF = SiceesrvImpl.class
					.getResourceAsStream("/it/csi/sicee/siceesrv/business/facade/template/template_ace.pdf");
			 */

			ByteArrayOutputStream buffer = new ByteArrayOutputStream();

			int nRead;

			byte[] data = new byte[isPDF.available()];

			while ((nRead = isPDF.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}

			buffer.flush();

			return buffer.toByteArray();

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getStampaCertificato] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getStampaCertificato] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getStampaCertificato()",
					"invocazione servizio [siceesrv]::[getStampaCertificato]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getStampaCertificato] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findUidFotoAce] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R393567688) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1071922904) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findUidFotoAce'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");
			getLogger(null).debug("anno: " + filtro.getAnno());
			getLogger(null).debug("certificatore: " + filtro.getCertificatore());
			getLogger(null).debug("numero: " + filtro.getNumero());

			return getCertificatoMgr().findUidFotoAce(filtro);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findUidFotoAce] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findUidFotoAce] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findUidFotoAce()", "invocazione servizio [siceesrv]::[findUidFotoAce]",
					"(valore input omesso)");
			logger.debug("[SiceesrvImpl::findUidFotoAce] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getStampaRicevutaInvioAce] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-892635035) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-201901819) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getStampaRicevutaInvioAce'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("STAMPA PARAMETRI INPUT: ");
			getLogger(null).debug("numCertificatore: " + numCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);

			PrintRicevutaInvioAce printRicevutaAce = new PrintRicevutaInvioAce();

			ByteArrayInputStream isPDF = printRicevutaAce.stampaModulo(getCertificatoMgr()
					.compilaRicevutaCertificatoPerStampa(numCertificatore, progrCertificato, annoCertificato));

			ByteArrayOutputStream buffer = new ByteArrayOutputStream();

			int nRead;

			byte[] data = new byte[isPDF.available()];

			while ((nRead = isPDF.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}

			buffer.flush();

			return buffer.toByteArray();

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getStampaRicevutaInvioAce] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getStampaRicevutaInvioAce] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getStampaRicevutaInvioAce()",
					"invocazione servizio [siceesrv]::[getStampaRicevutaInvioAce]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getStampaRicevutaInvioAce] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findAceFiltroCount] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R674714429) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-2042820963) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findAceFiltroCount'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");
			getLogger(null).debug("codProv: " + filtro.getCodProv());
			getLogger(null).debug("codComune: " + filtro.getCodComune());
			getLogger(null).debug("descComune: " + filtro.getDescComune());
			getLogger(null).debug("descIndirizzo: " + filtro.getDescIndirizzo());

			getLogger(null).debug("numCivico: " + filtro.getNumCivico());
			getLogger(null).debug("sezione: " + filtro.getSezione());
			getLogger(null).debug("foglio: " + filtro.getFoglio());
			getLogger(null).debug("particella: " + filtro.getParticella());
			getLogger(null).debug("subalterno: " + filtro.getSubalterno());
			getLogger(null).debug("stato: " + filtro.getStato());
			getLogger(null).debug("idCertificatore: " + idCertificatore);

			getLogger(null).debug("flgPregresso: " + flgPregresso);
			getLogger(null).debug("flgSostituzione: " + flgSostituzione);

			/*
			return getCertificatoMgr().findAceFiltro(filtro, idCertificatore,
					dataPregresso, flgSostituzione);
			 */

			return getCertificatoMgr().findAceFiltroCount(filtro, idCertificatore, flgPregresso, flgSostituzione);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findAceFiltroCount] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findAceFiltroCount] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findAceFiltroCount()",
					"invocazione servizio [siceesrv]::[findAceFiltroCount]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findAceFiltroCount] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findAceFlgPregresso] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R719688801) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1919529727) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findAceFlgPregresso'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");
			getLogger(null).debug("anno: " + filtro.getAnno());
			getLogger(null).debug("certificatore: " + filtro.getCertificatore());
			getLogger(null).debug("numero: " + filtro.getNumero());
			getLogger(null).debug("stato: " + filtro.getStato());
			getLogger(null).debug("flgPregresso: " + flgPregresso);

			return getCertificatoMgr().findAceFlgPregresso(filtro, flgPregresso);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::findAceFlgPregresso] - Errore CSI occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findAceFlgPregresso] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findAceFlgPregresso()",
					"invocazione servizio [siceesrv]::[findAceFlgPregresso]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findAceFlgPregresso] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getDettaglioAce] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1680274514) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R134157390) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getDettaglioAce'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("STAMPA PARAMETRI INPUT: ");
			getLogger(null).debug("numCertificatore: " + numCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);

			ArrayList<LabelValue> labelValueList = getCertificatoMgr().creaDettaglioAce(numCertificatore,
					progrCertificato, annoCertificato);

			getLogger(null).debug("labelValueList: " + labelValueList);

			getLogger(null).debug("labelValueList.size(): " + labelValueList.size());

			//List<T> list = new ArrayList<T>();

			LabelValue[] LabelValueA = labelValueList.toArray(new LabelValue[labelValueList.size()]);

			getLogger(null).debug("LabelValueA: " + LabelValueA);

			getLogger(null).debug("LabelValueA.size(): " + LabelValueA.length);

			return LabelValueA;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getDettaglioAce] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getDettaglioAce] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getDettaglioAce()",
					"invocazione servizio [siceesrv]::[getDettaglioAce]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getDettaglioAce] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findAceMonitoraggio] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R985089335) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1654129193) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findAceMonitoraggio'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");

			getLogger(null).debug("idCertificatore: " + idCertificatore);

			FiltroRicercaAce filtro = new FiltroRicercaAce();
			filtro.setStato(Constants.BOZZA);

			return getCertificatoMgr().findAceFiltro(filtro, idCertificatore, false, false, true);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::findAceMonitoraggio] - Errore CSI occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findAceMonitoraggio] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findAceMonitoraggio()",
					"invocazione servizio [siceesrv]::[findAceMonitoraggio]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findAceMonitoraggio] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::notificaRenditionDisponibile] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1203717077) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-758794357) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'notificaRenditionDisponibile'.
			// non verrà sovrascritto nelle successive rigenerazioni

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::notificaRenditionDisponibile] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::notificaRenditionDisponibile] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "notificaRenditionDisponibile()",
					"invocazione servizio [siceesrv]::[notificaRenditionDisponibile]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::notificaRenditionDisponibile] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findUidRifIndex] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1584936250) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-895599142) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findUidRifIndex'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getCertificatoMgr().findUidRifIndex(numCertificatore, progrCertificato, annoCertificato, idTipoDoc);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findUidRifIndex] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findUidRifIndex] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findUidRifIndex()",
					"invocazione servizio [siceesrv]::[findUidRifIndex]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findUidRifIndex] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getXmlStampaCertificato2015] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-672656892) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R1697000100) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getXmlStampaCertificato2015'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");

			getLogger(null).debug("idCertificatore: " + idCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);
			getLogger(null).debug("idStatoAttestato: " + idStatoAttestato);

			return getCertificatoMgr().getXmlApeReadOnly(idCertificatore, progrCertificato, annoCertificato,
					fotoPrincipale, idStatoAttestato);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getXmlStampaCertificato2015] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getXmlStampaCertificato2015] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getXmlStampaCertificato2015()",
					"invocazione servizio [siceesrv]::[getXmlStampaCertificato2015]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getXmlStampaCertificato2015] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getStampaCertificato2015] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-1545197521) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R2079314831) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getStampaCertificato2015'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");

			getLogger(null).debug("idCertificatore: " + idCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);
			getLogger(null).debug("idStatoAttestato: " + idStatoAttestato);

			ApeReadOnlyData apeReadOnlyData = getCertificatoMgr().getApeReadOnlyData(idCertificatore, progrCertificato,
					annoCertificato, idStatoAttestato);

			PrintApe printApe = new PrintApe();

			return printApe.stampaPdfApe(apeReadOnlyData, fotoPrincipale, idStatoAttestato);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getStampaCertificato2015] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getStampaCertificato2015] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getStampaCertificato2015()",
					"invocazione servizio [siceesrv]::[getStampaCertificato2015]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getStampaCertificato2015] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findUidFotoPrincipaleApe] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-348428380) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1018883324) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findUidFotoPrincipaleApe'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getCertificatoMgr().getUidFotoPrincipale(idCertificatore, progrCertificato, annoCertificato);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::findUidFotoPrincipaleApe] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findUidFotoPrincipaleApe] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findUidFotoPrincipaleApe()",
					"invocazione servizio [siceesrv]::[findUidFotoPrincipaleApe]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findUidFotoPrincipaleApe] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getXmlStampaTarghettaCertificato] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R-2086574786) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1837518690) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getXmlStampaTarghettaCertificato'.
			// non verrà sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");

			getLogger(null).debug("idCertificatore: " + idCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);

			return getCertificatoMgr().getXmlTarghettaApeReadOnly(idCertificatore, progrCertificato, annoCertificato);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getXmlStampaTarghettaCertificato] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getXmlStampaTarghettaCertificato] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getXmlStampaTarghettaCertificato()",
					"invocazione servizio [siceesrv]::[getXmlStampaTarghettaCertificato]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getXmlStampaTarghettaCertificato] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getStampaTarghettaCertificato] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1516335603) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1870929261) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getStampaTarghettaCertificato'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			getLogger(null).debug("Filtro: ");

			getLogger(null).debug("idCertificatore: " + idCertificatore);
			getLogger(null).debug("progrCertificato: " + progrCertificato);
			getLogger(null).debug("annoCertificato: " + annoCertificato);

			ApeTarghettaReadOnlyData apeTarghettaReadOnlyData = getCertificatoMgr()
					.getTarghettaApeReadOnlyData(idCertificatore, progrCertificato, annoCertificato);

			PrintApe printApe = new PrintApe();

			return printApe.stampaPdfTarghettaApe(apeTarghettaReadOnlyData);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getStampaTarghettaCertificato] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getStampaTarghettaCertificato] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getStampaTarghettaCertificato()",
					"invocazione servizio [siceesrv]::[getStampaTarghettaCertificato]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getStampaTarghettaCertificato] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::findProtocollazione] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R953505585) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1685712943) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'findProtocollazione'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getCertificatoMgr().findProtocollazione(numCertificatore, progrCertificato, annoCertificato);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error("[SiceesrvImpl::findProtocollazione] - Errore CSI occorso durante l'esecuzione del metodo:"
						+ ex, ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::findProtocollazione] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "findProtocollazione()",
					"invocazione servizio [siceesrv]::[findProtocollazione]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::findProtocollazione] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getParametroMdp] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R1037716342) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-1442819050) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getParametroMdp'.
			// non verrà sovrascritto nelle successive rigenerazioni

			return getUtilMgr().getParametroMdp(param);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getParametroMdp] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getParametroMdp] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getParametroMdp()",
					"invocazione servizio [siceesrv]::[getParametroMdp]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getParametroMdp] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::getParametriPagamentoMdp] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R169007248) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verrà sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R-501447696) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'getParametriPagamentoMdp'.
			// non verrà sovrascritto nelle successive rigenerazioni

			ArrayList<LabelValue> labelValueList = getUtilMgr().getParametriPagamentoMdp();

			LabelValue[] LabelValueA = labelValueList.toArray(new LabelValue[labelValueList.size()]);

			return LabelValueA;

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::getParametriPagamentoMdp] - Errore CSI occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::getParametriPagamentoMdp] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "getParametriPagamentoMdp()",
					"invocazione servizio [siceesrv]::[getParametriPagamentoMdp]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::getParametriPagamentoMdp] - END");
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
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::insertLogAccesso] - START");

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch("siceesrv");
		// inizio misurazione
		watcher.start();

		/*PROTECTED REGION ID(R250688512) ENABLED START*/
		// inserire qui la dichiarazione di variabili locali al metodo
		// non verr&agrave; sovrascritto nelle successive rigenerazioni
		/*PROTECTED REGION END*/
		try {
			/*PROTECTED REGION ID(R663502688) ENABLED START*/
			// inserire qui il codice di implementazione del metodo 'insertLogAccesso'.
			// non verr&agrave; sovrascritto nelle successive rigenerazioni

			getUtilMgr().insertLogAccesso(codiceFiscale, nome, cognome, ruolo);

			/*PROTECTED REGION END*/
		} catch (Exception ex) {
			if (CSIException.class.isAssignableFrom(ex.getClass())) {
				logger.error(
						"[SiceesrvImpl::insertLogAccesso] - Errore CSI occorso durante l'esecuzione del metodo:" + ex,
						ex);
				throw (CSIException) ex;
			} else {
				logger.error(
						"[SiceesrvImpl::insertLogAccesso] - Errore imprevisto occorso durante l'esecuzione del metodo:"
								+ ex,
						ex);
				throw new UnrecoverableException("Errore imprevisto occorso durante l'esecuzione del metodo:" + ex, ex);
			}
		} finally {
			// fine misurazione
			watcher.stop();
			watcher.dumpElapsed("SiceesrvImpl", "insertLogAccesso()",
					"invocazione servizio [siceesrv]::[insertLogAccesso]", "(valore input omesso)");
			logger.debug("[SiceesrvImpl::insertLogAccesso] - END");
		}
	}

	/// dichiarazione del self checker (utilizzato in monitoraggio e diagnostica)
	/**
	 * @generated
	 */
	String _codS = "sicee"; // e' corretto che sia il codice prodotto?
	/**
	 * @generated
	 */
	String _codR = "siceesrv";
	/**
	 * @generated
	 */
	String[] _suppS = new String[]{
			/*PROTECTED REGION ID(R1617950213) ENABLED START*/
			// inserire qui i codici sistema dei supplier diretti (se ci sono)
			// es: "Sistema1","Sistema2"
			/*PROTECTED REGION END*/
	};
	/**
	 * @generated
	 */
	String[] _suppR = new String[]{
			/*PROTECTED REGION ID(R264640516) ENABLED START*/
			// inserire qui i codici risorsa dei supplier diretti (se ci sono)
			// es: "risorsa1","risorsa2"
			// (corrispondono ai codici servizio dei corrispondenti servizi -
			// vedere documentazione coop-diag)
			/*PROTECTED REGION END*/
	};

	/**
	 * @generated
	 */
	DefaultSelfChecker schk = new DefaultSelfChecker(_codS, _codR, getLogger(null).getName(), _suppS, _suppR,
			"/checked_resources_siceesrv.xml");

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::testResources()] BEGIN");
		InvocationNode in = new InvocationNode();
		try {
			logger.debug("[SiceesrvImpl::testResources()] END");
			return schk.testResources();
		} catch (CSIException ex) {
			logger.error("[SiceesrvImpl::testResources()] : si e' verificato un errore  " + ex);
			throw ex;
		}
	}

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		Logger logger = getLogger(null);
		logger.debug("[SiceesrvImpl::selfCheck] - BEGIN");
		InvocationNode in = new InvocationNode();
		try {
			return schk.selfCheck(alreadyChecked);
		} catch (CSIException ex) {
			logger.error("[SiceesrvImpl::selfCheck()] si e' verificato un errore  " + ex);
		}
		logger.debug("[SiceesrvImpl::selfCheck] - END");
		// restituisco l’invocation node
		return in;
	}

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException { //NOSONAR  Reason:EIAS
		return true;
	}

	/// inizializzazione
	/**
	 * @generated
	 */
	public void init(Object initOptions) {
		/*PROTECTED REGION ID(R-406909958) ENABLED START*/
		// inserire qui il codice di inizializzazione della implementazione
		// non verrà sovrascritto da successive rigenerazioni
		/*PROTECTED REGION END*/
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

	/// eventuali metodi aggiuntivi
	/*PROTECTED REGION ID(R-451731604) ENABLED START*/
	// inserire qui la dichiarazione di eventuali metodi aggiuntivi utili
	// per l'implementazione.
	// non verrà sovrascritto da successive rigenerazioni.

	public TitoloMgr getTitoloMgr() {
		return (TitoloMgr) SpringBeanLocator.getBean("titoloMgr");
	}

	public CertificatoMgr getCertificatoMgr() {
		return (CertificatoMgr) SpringBeanLocator.getBean("certificatoMgr");
	}

	public CertificatoreMgr getCertificatoreMgr() {
		return (CertificatoreMgr) SpringBeanLocator.getBean("certificatoreMgr");
	}

	public UserMgr getUserMgr() {
		return (UserMgr) SpringBeanLocator.getBean("userMgr");
	}

	public UtilMgr getUtilMgr() {
		return (UtilMgr) SpringBeanLocator.getBean("utilMgr");
	}
	/*PROTECTED REGION END*/
}
