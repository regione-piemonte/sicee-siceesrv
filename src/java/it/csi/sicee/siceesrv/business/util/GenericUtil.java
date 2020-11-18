/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.util;

import java.sql.Timestamp;
import java.util.Date;

// TODO: Auto-generated Javadoc
//import org.apache.log4j.*;

/**
 * The Class GenericUtil.
 */
public class GenericUtil {

	
	/**
	 * Convert to string.
	 *
	 * @param dt the dt
	 * @return the string
	 */
	public static String convertToString(java.util.Date dt) {
		if (dt != null) {
			//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return Constants.FORMATTER_DATA_WEB.format(dt);
		} else
			return null;
	}


	/**
	 * Gets the data odierna.
	 *
	 * @return the data odierna
	 */
	public static String getDataOdierna() {
		return Constants.FORMATTER_DATA_WEB.format(new Date(System.currentTimeMillis()));
	}
	
	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}

	/**
	 * Checks if is null or empty.
	 * 
	 * @param s
	 *            the s
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(Integer s) {
		return s == null;
	}

	/**
	 * Checks if is null or empty.
	 * 
	 * @param b
	 *            the b
	 * @return true, if is null or empty
	 */
	public static boolean isNullOrEmpty(byte[] b) {
		return b == null || b.length == 0;
	}

	public static Timestamp getSqlDataCorrente(){
		return new Timestamp(System.currentTimeMillis());
	}
	
}