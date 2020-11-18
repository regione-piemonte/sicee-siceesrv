/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.facade;

import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametri;
import it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;
import it.csi.sicee.siceesrv.util.Constants;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseMgr.
 */
public class BaseMgr {
	
	/** The log. */
	protected static Logger log = Logger.getLogger(Constants.APPLICATION_CODE
			+ ".business");

	/** The numero minimo id certificatore. */
	protected static String NUMERO_MINIMO_ID_CERTIFICATORE = "NUMERO_MINIMO_ID_CERTIFICATORE";

	/** The data inizio sostituzione. */
	public static String DATA_INIZIO_SOSTITUZIONE = "DATA_INIZIO_SOSTITUZIONE";

	/** The Constant FIRMA_PDF. */
	public static final String FIRMA_PDF = "FIRMA_PDF";
	
	public static final String SEDE_REGIONE_PIEMONTE = "SEDE_REGIONE_PIEMONTE";
	
	/** The Constant ONE_YEAR_MILLIS. */
	public static final long ONE_YEAR_MILLIS = 1000*60*60*24*365;

	/** The Constant TIPO_DOC_CURRICULUM_VITAE. */
	protected static final Integer TIPO_DOC_CURRICULUM_VITAE = Integer.valueOf(1); 
		

	/**
	 * Adds the one year.
	 *
	 * @param base the base
	 * @return the string
	 * @throws SiceesrvException the siceesrv exception
	 */
	protected static String addOneYear(String base) throws SiceesrvException{
		java.util.Date dt_base = convertToDate(base);
		Calendar cal_base = Calendar.getInstance();
		cal_base.setTime(dt_base);
		cal_base.add(Calendar.YEAR, 1);
		java.util.Date dt_after = cal_base.getTime();
		return convertToString(dt_after);
	}
	
	/**
	 * Adds the ten year.
	 *
	 * @param base the base
	 * @return the string
	 * @throws SiceesrvException the siceesrv exception
	 */
	protected String addTenYear(String base) throws SiceesrvException{
		if (base != null && !base.equals("")) {
			java.util.Date dt_base = convertToDate(base);
			Calendar cal_base = Calendar.getInstance();
			cal_base.setTime(dt_base);
			cal_base.add(Calendar.YEAR, 10);
			java.util.Date dt_after = cal_base.getTime();
			return convertToString(dt_after);
		} else {
			return null;
		}
	}
	
	/**
	 * Convert to string.
	 *
	 * @param dt the dt
	 * @return the string
	 */
	public static String convertToString(java.util.Date dt) {
		if(dt != null){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(dt);
		}
		else
			return null;
	}

	/**
	 * Convert to date.
	 *
	 * @param s the s
	 * @return the java.util. date
	 * @throws SiceesrvException the siceesrv exception
	 */
	public static java.util.Date convertToDate(String s) throws SiceesrvException {
		if(s != null && s.length()>0){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				return sdf.parse(s);
			} catch (ParseException e) {
				throw new SiceesrvException("Errore nella parsificazioen della data "+s, e);
			}
		}
		else
			return null;
	}
	
	/**
	 * Convert to string.
	 *
	 * @param i the i
	 * @return the string
	 */
	protected String convertToString(Boolean i) {
		if (i==null)
			return null;
		else {
			if (i)
				return "S";
			else
				return "N";
		}
			
	}

	/**
	 * Convert to string.
	 *
	 * @param i the i
	 * @return the string
	 */
	protected String convertToString(Integer i) {
		if (i==null)
			return null;
		else
			return Integer.toString(i); 
	}

	/**
	 * Convert to string.
	 *
	 * @param i the i
	 * @return the string
	 */
	protected String convertToString(Long i) {
		if (i==null)
			return null;
		else
			return Long.toString(i); 
	}
	
	/**
	 * Convert to string.
	 *
	 * @param i the i
	 * @return the string
	 */
	protected String convertToString(Double i) {
		if (i==null)
			return null;
		else
			return parseNumberFive(i); 
	}

	/**
	 * Convert to integer.
	 *
	 * @param s the s
	 * @return the integer
	 */
	public static Integer convertToInteger(String s) {
		if (s==null || s.length()==0)
			return null;
		else {
			try {
				return Integer.valueOf(s); 
			} catch (Exception e) {
				return null;
			} 
		}
	}
	
	/**
	 * Convert to double.
	 *
	 * @param s the s
	 * @return the double
	 */
	public Double convertToDouble(String s) {
		if (s==null || s.length()==0)
			return null;
		else {
			try {				
				return Double.valueOf(s.replaceAll(",", ".")); 
			} catch (Exception e) {
				log.debug("Stringa da convertire in Double: " + s);
				return null;
			} 
		}
	}

	/**
	 * Convert to long.
	 *
	 * @param s the s
	 * @return the long
	 */
	public Long convertToLong(String s) {
		if (s==null || s.length()==0)
			return null;
		else
			try {
				return Long.valueOf(s); 
			} catch (Exception e) {
				return null;
			} 
	}
	
	/**
	 * Convert to boolean.
	 *
	 * @param s the s
	 * @return the boolean
	 */
	public static Boolean convertToBoolean(String s) {
		if (s==null || s.length()==0)
			return false;
		
		try {
			if (s.equalsIgnoreCase("s"))
				return true;
		} catch (Exception e) {
			return false;
		}
		
		return false;
	}

	/**
	 * Instantiates a new base mgr.
	 */
	public BaseMgr() {
		super();
	}

	
	public static String  trimToEmpty(String s) {
		
		String ret = "";
		
		if (s != null)
		{
			ret = s.trim();
		}
		
		return ret;
	}
	
	/**
	 * Checks if is null or empty.
	 *
	 * @param s the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.length() == 0;
	}

	/**
	 * Checks if is null or empty.
	 *
	 * @param s the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Double s) {
		return s == null;
	}
	
	/**
	 * Checks if is null or empty.
	 *
	 * @param s the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Object s) {
		return s == null;
	}
	
	/**
	 * Check valide number.
	 *
	 * @param num the num
	 * @return true, if successful
	 */
	public static boolean checkValideNumber(String num) {
		if (!isNullOrEmpty(num)) {
			if (num.matches("^[+]?\\d*$"))
				return true;
			else return false;
		}
		
		return false;
	}
	
	/**
	 * Check valide email.
	 *
	 * @param email the email
	 * @return true, if successful
	 */
	public static boolean checkValideEmail(String email) {
		if (!isNullOrEmpty(email)) {
			if (email.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*([,;]\\s*\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)*"))
				return true;
			else return false;
		}
		
		return false;
	}
	
	/**
	 * Check valide date.
	 *
	 * @param date the date
	 * @return true, if successful
	 */
	public static boolean checkValideDate(String date) {
		if (!isNullOrEmpty(date)) {
			if (date.matches("^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((1[6-9]|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((1[6-9]|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((1[6-9]|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$"))
				return true;
			else return false;
		}
		
		return false;
	}
	
	/**
	 * Check valide double with five decimal numbers.
	 *
	 * @param num the num
	 * @return true, if successful
	 */
	public static boolean checkValideDoubleWithFiveDecimalNumbers(String num) {
		log.debug("Numero da validare: " + num);
		if (!isNullOrEmpty(num)) {
			if (num.matches("^(?=.*[0-9].*$)\\d{0,10}(?:\\,\\d{0,5})?$")) {
				log.debug("validato: " + num);
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	/*
	protected String parseNumberForPrint(Double d) {
		String str = "";
		DecimalFormat df = new DecimalFormat("############.##");
		if (d != null) {
			str = df.format(d);
		}
		
		return str;
	}
*/	
	/**
	 * Parses the number for print.
	 *
	 * @param d the d
	 * @return the string
	 */
	protected String parseNumberForPrint(Double d) {
		String str = "";
		DecimalFormat df = new DecimalFormat("############.#####");
		if (d != null) {
			str = df.format(d);
		}

		return str;
	}

	
	/**
	 * Parses the number five for print.
	 *
	 * @param d the d
	 * @return the string
	 */
	protected String parseNumberFiveForPrint(String d) {
		String str = "";
		Double num = convertToDouble(d);
		DecimalFormat df = new DecimalFormat("############.######");
		if (d != null) {
			str = df.format(num);
		}
		
		return str;
	}
	
	/**
	 * Parses the number five.
	 *
	 * @param d the d
	 * @return the string
	 */
	protected String parseNumberFive(Double d) {
		String str = "";		
		DecimalFormat df = new DecimalFormat("############.######");
		if (d != null) {
			str = df.format(d);
		}
		
		return str;
	}

	/**
	 * Verify param.
	 *
	 * @param param the param
	 * @return true, if successful
	 */
	protected boolean verifyParam(SiceeTParametri param) {
		 if (param == null) {
				log.debug("PARAMETRO " + NUMERO_MINIMO_ID_CERTIFICATORE + " INESISTENTE");
				return false;
		}
		 
		return true;
	}
	
	/**
	 * Verify param.
	 * 
	 * @param param
	 *            the param
	 * @param paramMancante
	 *            the param mancante
	 * @return true, if successful
	 */
	public static boolean verifyParam(SiceeTParametri param,
			String paramMancante) {
		if (param == null) {
			log.debug("PARAMETRO " + paramMancante + " INESISTENTE");
			return false;
		}

		return true;
	}

	/**
	 * Convert to string for report.
	 *
	 * @param obj the obj
	 * @return the string
	 */
	public static String convertToStringForReport(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return "";
		}
	}
	
	/**
	 * Gets the string not null.
	 * 
	 * @param value
	 *            the value
	 * @return the string not null
	 */
	public String getStringNotNull(String value) {
		return (value != null) ? value : "";
	}


}