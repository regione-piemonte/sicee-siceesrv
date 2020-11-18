
package test.siceesrv;

import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UnrecoverableException;

import it.csi.sicee.siceesrv.dto.siceesrv.*;

import it.csi.sicee.siceesrv.interfacecsi.siceesrv.*;

import it.csi.sicee.siceesrv.exception.siceesrv.*;

import it.csi.csi.util.xml.*;
import it.csi.csi.porte.*;
import it.csi.csi.porte.proxy.*;
import javax.sql.DataSource;
import org.apache.log4j.*;
import junit.framework.TestCase;

/*PROTECTED REGION ID(R-729058931) ENABLED START*/
/// inserire qui eventuali import aggiuntive
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import junit.framework.TestCase;
import it.csi.sicee.siceesrv.util.GenericPrint;

import it.csi.csi.wrapper.CSIException;

/*PROTECTED REGION END*/

/**
 * @generated
 */
public class TestSiceesrv extends TestCase {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "siceesrv";

	/**
	 * @generated
	 */
	it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv pd = null;

	/**
	 * @generated
	 */
	public void setUp() throws Exception {
		InfoPortaDelegata info = PDConfigReader.read("test/java/test/siceesrv/defpd_siceesrv.xml");
		pd = (it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv) PDProxy.newInstance(info);
	}

	/*PROTECTED REGION ID(R-1313851537) ENABLED START*/
	// inserire qui la definizione di variabili locali, costanti da usare nel test.
	// non verranno sovrascritte da successive rigenerazioni
	/*PROTECTED REGION END*/

	/// Implementazione operazioni esposte dal servizio

	/**
	 * @generated
	 */
	public void testOperationFindElencoCertificatori() {
		/*PROTECTED REGION ID(R733136891) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni

		try {

			FiltroRicercaCertificatori filtro = new FiltroRicercaCertificatori();
			filtro.setRegione("01");
			filtro.setProvincia("001");

			Certificatore[] cert = pd.findElencoCertificatori(filtro);

			GenericPrint.stampa(cert, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAce() {
		/*PROTECTED REGION ID(R-2070340222) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			FiltroRicercaAce filtro = new FiltroRicercaAce();
			filtro.setAnno("2011");
			filtro.setCertificatore("100007");
			filtro.setNumero("0021");

			Ace ace = pd.findAce(filtro);

			GenericPrint.stampa(ace, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceFiltro() {
		/*PROTECTED REGION ID(R1558654250) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindCertificatore() {
		/*PROTECTED REGION ID(R-1614930477) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			Certificatore cert = pd.findCertificatore("101014");

			GenericPrint.stampa(cert, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}

		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationElencoTitoli() {
		/*PROTECTED REGION ID(R-399951407) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			Titolo[] titoli = pd.elencoTitoli();

			GenericPrint.stampa(titoli, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindNotaio() {
		/*PROTECTED REGION ID(R-1391378379) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			Notaio not = pd.findNotaio("crambzoo@gmail.com");
			if (not != null) {
				System.out.println(not.getEmail());
			}

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationUpdateInvioLog() {
		/*PROTECTED REGION ID(R-965177762) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			InvioLog upd = new InvioLog();
			upd.setAnno("2010");
			upd.setCertificatore("6");
			upd.setIdNotaio(1L);
			upd.setNumero("0011");

			pd.updateInvioLog(upd);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetParametro() {
		/*PROTECTED REGION ID(R-1159383029) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {

			System.out.println(pd.getParametro("FOTO_ABILITATA"));

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationIsProductEnabled() {
		/*PROTECTED REGION ID(R1481003172) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			System.out.println(pd.isProductEnabled());

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationIsUserEnabled() {
		/*PROTECTED REGION ID(R-768661276) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			System.out.println(pd.isUserEnabled("AAAAAA00A11C000K"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationIsServiceEnabled() {
		/*PROTECTED REGION ID(R-423695330) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			System.out.println("WEB " + pd.isServiceEnabled("SICEEWEB"));
			System.out.println("FREE " + pd.isServiceEnabled("SICEEFREE"));
			System.out.println("BO " + pd.isServiceEnabled("SICEEBO"));

		} catch (Exception e) {
			fail(e.getMessage());
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceSostitutivi() {
		/*PROTECTED REGION ID(R931428435) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sarà preservato per successive rigenerazioni
		try {
			FiltroRicercaAce filtro = new FiltroRicercaAce();
			filtro.setAnno("2011");
			filtro.setCertificatore("100007");
			filtro.setNumero("0001");

			Ace[] ace = pd.findAceSostitutivi(filtro);

			GenericPrint.stampa(ace, false, 0);

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaCertificato() {
		/*PROTECTED REGION ID(R-1504945515) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		try {
			System.out.println("ENTRO - testOperationGetStampaCertificato");

			// PRIMO METODO - FUNZIONANTE
			/*
			String path_iniziale = "D:\\temp\\stampe\\template";
			String path_finale = "D:\\temp\\stampe";
			
			String nome_file_iniziale = "template_ace.pdf";
			String nome_file_finale = "pdfCreato1.pdf";
			
			
			File badfile = new File(path_iniziale, nome_file_iniziale);
			File goodfile = new File(path_finale, nome_file_finale);
			
			
			FileOutputStream fos;
			FileInputStream fis;
			
			try {
				
				fos = new FileOutputStream(goodfile);
				fis = new FileInputStream(badfile);
				
				byte [] dati = new byte[fis.available()];
				fis.read(dati);
				fos.write(dati);
			
				fis.close();
				fos.close();
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 */

			// SECONDO METODO - funzionante
			/*
			try {
					InputStream inputStream= new FileInputStream("D:\\temp\\stampe\\template\\template_ace.pdf");
				
					File f=new File("D:\\temp\\stampe\\pdfCreato2.pdf");
				
					OutputStream out=new FileOutputStream(f);
					
					
					byte buf[]=new byte[1024];
					  int len;
					  while((len=inputStream.read(buf))>0)
					  out.write(buf,0,len);
					  out.close();
					  inputStream.close();
					  System.out.println("\nFile is created...................................");
					  
					
				
			} catch (IOException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 */
			/*
			// TERZO METODO - FUNZIONANTE
			try {
				InputStream inputStream = new FileInputStream(
						"D:\\temp\\stampe\\template\\template_ace.pdf");
			
				File f = new File("D:\\temp\\stampe\\pdfCreato3.pdf");
			
				OutputStream out = new FileOutputStream(f);
			
				byte[] dati = new byte[inputStream.available()];
				inputStream.read(dati);
			
				System.out.println("FUNZ - Stampo l'array dei byte");
				System.out.println("Stampo la lunghezza: " + dati.length);
				for (int i = 0; i < dati.length; i++) {
					System.out.println("[+" + i + "] - " + dati[i]);
				}
			
				out.write(dati);
				out.close();
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 */
			// QUARTO METODO - FUNZIONANTE
			try {
				byte[] datiOld = pd.getStampaCertificato("100105", "0031", "2011", "Bozza", null);

				File f = new File("D:\\temp\\stampe\\pdfCreato4.pdf");

				OutputStream out = new FileOutputStream(f);
				/*
				System.out.println("\n\n\nNON FUNZ - Stampo l'array dei byte");
				System.out.println("Stampo la lunghezza: " + datiOld.length);
				for (int i = 0; i < datiOld.length; i++) {
					System.out.println("[+" + i + "] - " + datiOld[i]);
				}
				 */
				out.write(datiOld);
				out.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("ESCO - testOperationGetStampaCertificato");
		} catch (SiceesrvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnrecoverableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CSIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindUidFotoAce() {
		/*PROTECTED REGION ID(R1914670224) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaRicevutaInvioAce() {
		/*PROTECTED REGION ID(R-262030179) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		try {
			System.out.println("ENTRO - testOperationGetStampaRicevutaInvioAce");

			try {
				byte[] datiOld = pd.getStampaRicevutaInvioAce("100007", "0010", "2012");

				File f = new File("D:\\temp\\stampe\\pdfCreatoRicevutaInvio.pdf");

				OutputStream out = new FileOutputStream(f);
				/*
				System.out.println("\n\n\nNON FUNZ - Stampo l'array dei byte");
				System.out.println("Stampo la lunghezza: " + datiOld.length);
				for (int i = 0; i < datiOld.length; i++) {
				System.out.println("[+" + i + "] - " + datiOld[i]);
				}
				 */
				out.write(datiOld);
				out.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("ESCO - testOperationGetStampaRicevutaInvioAce");
		} catch (SiceesrvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnrecoverableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CSIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceFiltroCount() {
		/*PROTECTED REGION ID(R-1323508219) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceFlgPregresso() {
		/*PROTECTED REGION ID(R-1095671143) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetDettaglioAce() {
		/*PROTECTED REGION ID(R-1770736154) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindAceMonitoraggio() {
		/*PROTECTED REGION ID(R-830270609) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationNotificaRenditionDisponibile() {
		/*PROTECTED REGION ID(R-1041404685) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindUidRifIndex() {
		/*PROTECTED REGION ID(R1494474610) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetXmlStampaCertificato2015() {
		/*PROTECTED REGION ID(R-251779012) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaCertificato2015() {
		/*PROTECTED REGION ID(R-1663402761) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindUidFotoPrincipaleApe() {
		/*PROTECTED REGION ID(R-466633620) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetXmlStampaTarghettaCertificato() {
		/*PROTECTED REGION ID(R-1837600250) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetStampaTarghettaCertificato() {
		/*PROTECTED REGION ID(R-2041914837) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationFindProtocollazione() {
		/*PROTECTED REGION ID(R-861854359) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetParametroMdp() {
		/*PROTECTED REGION ID(R947254702) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni

		try {
			String parametro = "APPLICATION_ID";
			String valore = pd.getParametroMdp(parametro);

			System.out.println("Stampo il valore MDP (" + parametro + "): " + valore);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationGetParametriPagamentoMdp() {
		/*PROTECTED REGION ID(R50802008) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationInsertLogAccesso() {
		/*PROTECTED REGION ID(R1741344968) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testTestResources() {
		try {
			pd.testResources();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @generated
	 */
	public void testSelfCheck() {
		try {
			pd.selfCheck(null);
		} catch (Exception e) {
			fail(e.getMessage());
		}
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
	/*PROTECTED REGION ID(R-957099384) ENABLED START*/
	// inserire qui la dichiarazione di eventuali metodi aggiuntivi utili
	// per l'implementazione.
	// non verrà sovrascritto da successive rigenerazioni.

	private void printArray(Object[] array) {
		if (array != null) {
			System.out.println(array.length);
			/*for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}*/
		} else {
			System.out.println("Array null");
		}
	}

	/*PROTECTED REGION END*/
}
