/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.util;


// TODO: Auto-generated Javadoc
/**
 * The Interface Constants.
 */
public interface Constants {
	
	/** The application code. */
	String APPLICATION_CODE = "siceesrv";

	/** The formatter data web. */
	public static java.text.SimpleDateFormat FORMATTER_DATA_WEB = new java.text.SimpleDateFormat(
	"dd/MM/yyyy");

	/** The Constant PROGETTISTA. */
	public static final Integer PROGETTISTA = 1;
	
	/** The Constant DIRETTORE_LAVORI. */
	public static final Integer DIRETTORE_LAVORI = 2;
	
	/** The Constant COSTRUTTORE. */
	public static final Integer COSTRUTTORE = 3;

	/** The Constant SERVIZI_ENERGETICI_INCLUSI. */
	public static final String SERVIZI_ENERGETICI_INCLUSI = "Riscaldamento e acqua calda sanitaria";

	/** The Constant EDIFICIO_RESIDENZIALE. */
	public static final String EDIFICIO_RESIDENZIALE = "R";
	
	/** The Constant EDIFICIO_NON_RESIDENZIALE. */
	public static final String EDIFICIO_NON_RESIDENZIALE = "N";

	/** The Constant IMAGE_HOME_WIDTH. */
	public static final float IMAGE_HOME_WIDTH = 215f;
	
	/** The Constant IMAGE_HOME_HEIGHT. */
	public static final float IMAGE_HOME_HEIGHT = 84f;

	/** The Constant IMAGE_HOME_Y. */
	public static final float IMAGE_HOME_Y = 540f;
	
	/** The Constant IMAGE_HOME_X. */
	public static final float IMAGE_HOME_X = 69f;

	/** The Constant IMAGE_HOME_CENTER_X. */
	public static final float IMAGE_HOME_CENTER_X = Constants.IMAGE_HOME_X
			+ (((int) IMAGE_HOME_WIDTH) >> 1);

	/** The Constant CARRIAGE_RETURN. */
	public static final String CARRIAGE_RETURN = "@cr@";
	
	/** The Constant NUOVO. */
	public static final int NUOVO = 0;

	/** The Constant BOZZA. */
	public static final int BOZZA = 1;

	/** The Constant CONSOLIDATO. */
	public static final int CONSOLIDATO = 2;

	/** The Constant INVIATO. */
	public static final int INVIATO = 3;

	/** The Constant ANNULLATO. */
	public static final int ANNULLATO = 4;

	/** The Constant DA_INVIARE. */
	public static final int DA_INVIARE = 5;

	/** The Constant ANNULLATO. */
	public static final int ANNULLATO_BO = 8;
	
	// E' un codice convenzionale non inserito sul DB, mi serve per creare la query
	/** The Constant INVIATO_ANNULLATO. */
	public static final int INVIATO_ANNULLATO = 99;
	
	/** The si. */
	public static String SI = "S";

	/** The no. */
	public static String NO = "N";

	/** The label si. */
	public static String LABEL_SI = "Si";

	/** The label no. */
	public static String LABEL_NO = "No";
	
	public static final String COD_NCEU = "NCEU";
	public static final String COD_NCT  = "NCT";
	
	public static String ID_TIPO_DOC_APE_CONSOLIDATO = "1";
	public static String ID_TIPO_DOC_APE_FIRMATO = "2";
	public static String ID_TIPO_DOC_APE_INDICATORE = "3";
	
	public static final int ID_MOTIVO_ALTRO = 105;
	public static final int ID_MOTIVO_ANTE_OPERAM = 200;
	public static final int ID_MOTIVO_POST_OPERAM = 201;

	public static final int ID_COMBUSTIBILE_GASOLIO = 204;
	public static final int ID_COMBUSTIBILE_GASOL = 214;
	public static final int ID_COMBUSTIBILE_OLIO_COMBUSTIBILE = 215;
	
	public static final int ID_COMBUSTIBILE_BIOMASSESOLIDE = 205;
	public static final int ID_COMBUSTIBILE_BIOMASSELIQUIDE = 206;
	public static final int ID_COMBUSTIBILE_BIOMASSEGASSOSE = 207;
	public static final int ID_COMBUSTIBILE_SOLAREFOTOVOLTAICO = 208;
	public static final int ID_COMBUSTIBILE_SOLARETERMICO = 209;
	public static final int ID_COMBUSTIBILE_EOLICO = 210;
	public static final int ID_COMBUSTIBILE_TELERISCALDAMENTO = 211;
	public static final int ID_COMBUSTIBILE_TELERAFFRESCAMENTO = 212;
	public static final int ID_COMBUSTIBILE_ALTRO = 213;
	
	public static final int SEZIONE_CLIMAINVER = 1;
	public static final int SEZIONE_CLIMAEST = 2;
	public static final int SEZIONE_ACQUACALDA = 3;
	public static final int SEZIONE_IMPIANTICOMBINATI = 4;
	public static final int SEZIONE_PRODFONTIRINN = 5;
	public static final int SEZIONE_VENTMECC = 6;
	public static final int SEZIONE_ILLUMINAZIONE = 7;
	public static final int SEZIONE_TRASPORTO = 8;

	
	public static final int ID_SMILE_FELICE = 0;
	public static final int ID_SMILE_SERIO = 1;
	public static final int ID_SMILE_TRISTE = 2;
	
	public static final int RUOLO_CERTIFICATORE_ENTE_PUBBLICO = 0;
	public static final int RUOLO_CERTIFICATORE_TECNICO_ABILITATO = 1;
	public static final int RUOLO_CERTIFICATORE_ORGANISMO_SOCIETA = 2;
	
	public static final int OGGETTO_APE_INTERO_EDIFICIO = 0;
	public static final int OGGETTO_APE_UNITA_IMMOBILIARE = 1;
	public static final int OGGETTO_APE_GRUPPO_UNITA_IMMOBILIARI = 2;
	
	public static final int MOTIVO_RILASCIO_NUOVA_COSTRUZIONE = 100;
	public static final int MOTIVO_RILASCIO_PASSAGGIO_PROPRIETA = 101;
	public static final int MOTIVO_RILASCIO_LOCAZIONE = 102;
	public static final int MOTIVO_RILASCIO_RISTRUTTURAZIONE_IMPORTANTE = 103;
	public static final int MOTIVO_RILACIO_RIQUALIFICAZIONE_ENEGETICA = 104;
	public static final int MOTIVO_RILASCIO_ALTRO = 105;
	
	public static final int MOTIVO_RILASCIO_CONTRATTO_SERVIZIO_ENERGIA_ANTE_OPERAM = 200;
	public static final int MOTIVO_RILASCIO_CONTRATTO_SERVIZIO_ENERGIA_POST_OPERAM = 201;
	public static final int MOTIVO_RILASCIO_ALTRA_MOTIVAZIONE = 202;
	public static final int MOTIVO_RILASCIO_SITUAZIONE_ANTE_OPERAM_RICHIESTA_FINANZIAMENTO = 203;
	public static final int MOTIVO_RILASCIO_SITUAZIONE_POST_OPERAM_RICHIESTA_FINANZIAMENTO = 204;
	public static final int MOTIVO_RILASCIO_DETRAZIONE_FISCALE_ANTE_OPERAM = 205;
	public static final int MOTIVO_RILASCIO_DETRAZIONE_FISCALE_POST_OPERAM = 206;

	public static final String MODOL_ENCODING = "UTF-8";
	
	
	public static final String COD_APPLICATION_ID = "APPLICATION_ID";
	public static final String COD_ID_GATEWAY_NODO = "ID_GATEWAY_NODO";
	public static final String COD_ID_PAYMENTMODE_NODO = "ID_PAYMENTMODE_NODO";
	public static final String COD_DATI_SPECIFICI_RISCOSSIONE = "DATI_SPECIFICI_RISCOSSIONE";
	public static final String COD_VERSAMENTO = "CODICE_VERSAMENTO";

}
