/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
/*
 * 
 */
package it.csi.sicee.siceesrv.business.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import java.math.BigInteger;
import java.math.BigDecimal;

import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class Converter.
 */
public class Converter {

	/** The Constant LOGGER_PREFIX. */
	public static final String LOGGER_PREFIX = "siceeweb";
	
	/** The Constant logger. */
	public static final Logger logger = Logger.getLogger(LOGGER_PREFIX);

	private static Hashtable<Integer, String> dicimalFormats = new Hashtable<Integer, String>();

	
	
	public static String convertToString(boolean b) {
		if (b)
			return Constants.SI;
		else
			return Constants.NO;
	}
	
	/**
	 * Convert to string.
	 *
	 * @param dt the dt
	 * @return the string
	 */
	public static String convertToString(java.util.Date dt) {
		if (dt != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss");
			return sdf.format(dt);
		} else
			return null;
	}
	
	/**
	 * Convert to string.
	 *
	 * @param dt the dt
	 * @return the string
	 */
	public static String convertToStringWeb(java.util.Date dt) {
		if (dt != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(dt);
		} else
			return null;
	}
	
	/**
	 * Convert to string.
	 *
	 * @param i the Integer
	 * @return the string
	 */
	public static String convertToString(Integer i) {
		String converted = null;

		if(i != null) {
			try {
				converted = i.toString();
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in String: " + i, e);
			}
		}
		return converted;
	}
	
	public static String convertToString(Short i) {
		String converted = null;

		if(i != null) {
			try {
				converted = i.toString();
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in String: " + i, e);
			}
		}
		return converted;
	}
	
	public static boolean convertTo(String num) {

		return (num != null) ? num.equalsIgnoreCase(Constants.SI) : false;
	}

	
	/**
	 * Convert to date.
	 *
	 * @param s the s
	 * @return the java.util. date
	 */
	public static java.util.Date convertToDate(String s) {
		if (s != null && s.length() > 0) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			try {
				return sdf.parse(s);
			} catch (ParseException e) {
				logger.error("Errore", e);
			}
		}
		
		return null;
	}
	
	public static Integer convertToInteger(String s) {
		Integer converted = null;

		if(!GenericUtil.isNullOrEmpty(s)) {
			try {
				converted = new Integer(s);
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + s + "' in Integer: " + s, e);
			}
		}
		return converted;
	}
	
	public static BigInteger convertToBigInteger(String s) {
		BigInteger converted = null;

		if(!GenericUtil.isNullOrEmpty(s)) {
			try {
				converted = new BigInteger(s);
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + s + "' in BigInteger: " + s, e);
			}
		}
		return converted;
	}

	public static BigInteger convertToBigInteger(Integer i) {
		BigInteger converted = null;

		if(i != null) {
			try {
				converted = new BigInteger(i.toString());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in BigInteger: " + i, e);
			}
		}
		return converted;
	}

	public static BigInteger convertToBigInteger(Short i) {
		BigInteger converted = null;

		if(i != null) {
			try {
				converted = new BigInteger(i.toString());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in BigInteger: " + i, e);
			}
		}
		return converted;
	}

	
	public static BigDecimal convertToBigDecimal(String s) {
		BigDecimal converted = null;

		if(!GenericUtil.isNullOrEmpty(s)) {
			try {
				converted = new BigDecimal(s);
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + s + "' in BigDecimal: " + s, e);
			}
		}
		return converted;
	}

	public static BigInteger convertToBigInteger(Long l) {
		BigInteger converted = null;

		if(l != null) {
			try {
				String s = l.toString();
				converted = new BigInteger(s);
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + l + "' in BigInteger: " + l, e);
			}
		}
		return converted;
	}

	
	public static Integer convertToInteger(Long l) {
		Integer converted = null;

		if(l != null) {
			try {
				String s = l.toString();
				converted = new Integer(s);
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + l + "' in Integer: " + l, e);
			}
		}
		return converted;
	}

	public static Integer convertToInteger(BigInteger bi) {
		Integer converted = null;

		if(bi != null) {
			try {
				converted = new Integer(bi.intValue());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + bi + "' in Integer: " + bi, e);
			}
		}
		return converted;
	}
	
	public static Integer convertToInteger(Short i) {
		Integer converted = null;

		if(i != null) {
			try {
				converted = new Integer(i.toString());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in Integer: " + i, e);
			}
		}
		return converted;
	}

	public static Long convertToLong(BigInteger bi) {
		Long converted = null;

		if(bi != null) {
			try {
				converted = new Long(bi.longValue());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + bi + "' in Long: " + bi, e);
			}
		}
		return converted;
	}

	public static Float convertToFloat(BigDecimal bd) {
		Float converted = null;

		if(bd != null) {
			try {
				converted = new Float(bd.floatValue());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + bd + "' in Float: " + bd, e);
			}
		}
		return converted;
	}

	public static Float convertToFloatNew(BigDecimal bd) {
		Float converted = null;

		if(bd != null) {
			try {
				converted = bd.floatValue();
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + bd + "' in Float: " + bd, e);
			}
		}
		return converted;
	}
	
	public static Double convertToDouble(BigDecimal bd) {
		Double converted = null;

		if(bd != null) {
			try {
				converted = new Double(bd.doubleValue());
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + bd + "' in Double: " + bd, e);
			}
		}
		return converted;
	}

	public static BigDecimal convertToBigDecimal(Double bd) {
		BigDecimal converted = null;

		if(bd != null) {
			try {
				String s = bd.toString();
				converted = new BigDecimal(s);
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + bd + "' in BigDecimal: " + bd, e);
			}
		}
		return converted;
	}
	
	/**
	 * Converte un {@link BigDecimal} in stringa
	 * 
	 * @param number Numero da convertire
	 * @param decimali Decimali da visualizzare
	 * @return Numero convertito
	 */
	public static String convertToString(Double number, int decimali) {
		DecimalFormat formatter = null;
		String format = null;
		String stringValue = null;

		if(number != null) {
			format = getNumberFormat(decimali);
			formatter = new DecimalFormat(format);
			stringValue = formatter.format(number.doubleValue());
		}
		return stringValue;
	}
	
	/**
	 * Converte un {@link BigDecimal} in stringa
	 * 
	 * @param number Numero da convertire
	 * @param decimali Decimali da visualizzare
	 * @return Numero convertito
	 */
	public static String convertToString(Double number) {
		
		return convertToString(number, 2);
	}
	
	/**
	 * Restituisce il formato numerico richiesto
	 * 
	 * @param decimali Decimali da visualizzare
	 * @return Formato numerico
	 */
	private static String getNumberFormat(int decimali) {
		String format = null;
		String decimal = null;
		int decimaliCount;

		format = dicimalFormats.get(decimali);
		if(format == null) {
			format = "#,##0";
			decimal = "";
			for(decimaliCount = 0; decimaliCount < decimali; decimaliCount++) {
				decimal += "0";
			}
			if(decimal.length() > 0) {
				format += ("." + decimal);
			}
			dicimalFormats.put(decimali, format);
		}
		return format;
	}
	public static String toHexString( byte[] bytes )
	  {
	      StringBuffer sb = new StringBuffer( bytes.length*2 );
	      for( int i = 0; i < bytes.length; i++ )
	      {
	    	  if (i%1000 == 0)
	    		  logger.error("byte: " + i + "-esimo");
	          sb.append( toHex(bytes[i] >> 4) );
	          sb.append( toHex(bytes[i]) );
	      }

	      return sb.toString();
	  }
	  private static char toHex(int nibble)
	  {
	      final char[] hexDigit =
	      {
	          '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
	      };
	      return hexDigit[nibble & 0xF];
	  }

	
	/**
	 * Gets the boxed to primitive.
	 *
	 * @param boxed the boxed
	 * @return the boxed to primitive
	 */
	private static Class<?> getBoxedToPrimitive(Class<?> boxed)
	{
	  if (boxed.equals(java.lang.Boolean.class))
	  {
	   return boolean.class;
	  }
	  else
	  {
	    if (boxed.equals(java.lang.Byte.class))
	    {
	      return byte.class;
	    }
	    else
	    {
	      if (boxed.equals(java.lang.Character.class))
	      {
	        return char.class;
	      }
	      else
	      {
	        if (boxed.equals(java.lang.Double.class))
	        {
	         return double.class;
	        }
	        else
	        {
	          if (boxed.equals(java.lang.Float.class))
	          {
	            return float.class;
	          }
	          else
	          {
	            if (boxed.equals(java.lang.Integer.class))
	            {
	              return int.class;
	            }
	            else
	            {
	              if (boxed.equals(java.lang.Long.class))
	              {
	            	  return long.class;
	              }
	              else
	              {
	                if (boxed.equals(java.lang.Short.class))
	                {
	                	 return short.class;
	                } else
		              {
		                if (boxed.equals(java.sql.Timestamp.class))
		                {
		                	 return java.lang.String.class;
		                } else
			              {
			                if (boxed.equals(java.sql.Date.class))
			                {
			                	 return java.lang.String.class;
			                } else
			              {
				                if (boxed.equals(java.util.Date.class))
				                {
				                	 return java.lang.String.class;
				                }
				              }
			              }
		              }
	              }
	            }
	          }
	        }
	      }
	    }
	  }
	  return null;
	}

	public static String convertToStringOrEmpty(BigDecimal i) {
		String converted = "";

		if(i != null) {
			try {
				converted = i.toPlainString();
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in String: " + i, e);
			}
		}
		return converted;
	}
	
	public static String convertToStringOrEmpty(Integer i) {
		String converted = "";

		if(i != null) {
			try {
				converted = i.toString();
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in String: " + i, e);
			}
		}
		return converted;
	}
	
	public static String convertToStringOrEmpty(Double i) {
		String converted = "";

		if(i != null) {
			try {
				converted = i.toString();
			}
			catch(Exception e) {
				logger.error("Errore durante la conversione di '" + i + "' in String: " + i, e);
			}
		}
		return converted;
	}
	
	public static String convertToStringWebOrEmpty(java.util.Date dt) {
		if (dt != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(dt);
		} else
			return "";
	}

//	private static Object getToSet(Class<?> co, Class<?> cRet, Object o,
//			Object ret) {
//		try {
//			Method[] array = co.getDeclaredMethods();
//			for (Method m : array) {
//				String methodName = m.getName().replaceFirst("get", "set");
//				if (m.getName().startsWith("get")) {
//					Object r;
//					r = m.invoke(o);
//					if (r != null) {
//						Method set = null;
//						try {
//							logger.debug("Metodo: " + methodName);
//							logger.debug("Classe: " + r.getClass());
//							set = cRet.getDeclaredMethod(methodName,
//									r.getClass());
//						} catch (java.lang.NoSuchMethodException e) {							
//							Class<?> cl = getBoxedToPrimitive(r.getClass());
//							logger.debug("Classe Boxed: " + cl.getClass());
//							set = cRet.getDeclaredMethod(methodName,cl);
//						} finally {
//							if (set != null) {
//								set.invoke(ret, r);
//							}
//						}
//					}
//
//				}
//			}
//		} catch (Exception e) {
//			logger.error("Errore", e);
//		}
//
//		return ret;
//
//	}
//
//	private static Class<?> getBoxedToPrimitive(Class<?> boxed) {
//		if (boxed.equals(java.lang.Boolean.class)) {
//			return boolean.class;
//		} else {
//			if (boxed.equals(java.lang.Byte.class)) {
//				return byte.class;
//			} else {
//				if (boxed.equals(java.lang.Character.class)) {
//					return char.class;
//				} else {
//					if (boxed.equals(java.lang.Double.class)) {
//						return double.class;
//					} else {
//						if (boxed.equals(java.lang.Float.class)) {
//							return float.class;
//						} else {
//							if (boxed.equals(java.lang.Integer.class)) {
//								return int.class;
//							} else {
//								if (boxed.equals(java.lang.Long.class)) {
//									return long.class;
//								} else {
//									if (boxed.equals(java.lang.Short.class)) {
//										return short.class;
//									} else {
//										if (boxed
//												.equals(java.sql.Timestamp.class)) {
//											return java.util.Date.class;
//										} else {
//											if (boxed
//													.equals(java.sql.Date.class)) {
//												return java.util.Date.class;
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return null;
//	}

}
