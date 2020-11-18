/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.OptimizedSiceeTCerticatoDao;
import it.csi.sicee.siceesrv.business.dao.dto.OptimizedSiceeTCerticato;
import it.csi.sicee.siceesrv.business.dao.exceptions.OptimizedSiceeTCerticatoDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce;
import it.csi.sicee.siceesrv.business.util.Constants;
import it.csi.sicee.siceesrv.business.util.GenericUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class OptimizedSiceeTCerticatoDaoImpl extends AbstractDAO implements
		ParameterizedRowMapper<OptimizedSiceeTCerticato>,
		OptimizedSiceeTCerticatoDao {

	protected static final Logger log = Logger
			.getLogger(Constants.APPLICATION_CODE + ".business");

	protected SimpleJdbcTemplate jdbcTemplate;
	protected DataSource dataSource;

	/**
	 * Method 'setDataSource'
	 * 
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	/**
	 * Method 'execute'
	 * 
	 * @param idCertificatore
	 * @throws OptimizedSiceeTCerticatoDaoException
	 * @return List<OptimizedSiceeTCerticato>
	 */
	/*
	public List<OptimizedSiceeTCerticato> execute(
			java.lang.String idCertificatore)
			throws OptimizedSiceeTCerticatoDaoException {
		try {
			StringBuffer query = getInitQueryCertificati();
			query.append(" AND A.ID_CERTIFICATORE = ? AND A.FK_STATO = B.ID_STATO AND A.FK_STATO in ("
					+ Constants.NUOVO
					+ ","
					+ Constants.BOZZA
					+ ","
					+ Constants.CONSOLIDATO
					+ ","
					+ Constants.DA_INVIARE
					+ ") ORDER BY A.ANNO, A.PROGR_CERTIFICATO ASC");

			log.debug(query);
			return jdbcTemplate.query(query.toString(), this, idCertificatore);
		} catch (Exception e) {
			throw new OptimizedSiceeTCerticatoDaoException("Query failed", e);
		}

	}
*/

	private StringBuffer getInitQueryCertificati() {
		StringBuffer query = new StringBuffer("");
		query.append("SELECT A.ID_CERTIFICATORE, A.PROGR_CERTIFICATO, A.ANNO, A.DT_SCADENZA, A.FK_TRANSAZIONE_ACE, ");
		query.append("A.DT_ACQUISTO, A.FK_STATO, A.FK_DICHIARAZIONE, A.FLG_DICHIARAZIONE, ");
		query.append("A.ID_INDIRIZZO, A.DESC_INDIRIZZO, A.DT_INIZIO, A.CAP, A.ID_COMUNE, A.DESC_COMUNE, A.SEZIONE, A.ID_PROV, A.FOGLIO,  ");
		query.append("A.DESC_PROV, A.ID_REGIONE, A.PARTICELLA, A.SUBALTERNO, A.DESC_REGIONE, A.PIANO, A.NUM_PIANI_COMPLESSIVI, A.NUM_APPARTAMENTI,  ");
		query.append("A.SCALA, A.INTERNO, A.NOTE, A.FLG_STAMPA_DEF, A.NOME_ACE_FIRMATO, A.NOME_COCERTIFICATORE, A.COGNOME_COCERTIFICATORE, ");
		query.append("A.NUM_COCERTIFICATORE, A.NUM_CIVICO, A.IDENTIFIC_PDF, A.IDENTIFIC_FOTO, A.LUOGO_DICHIARAZIONE, A.NOME_FOTO, A.NOME_PDF, A.DT_UPLOAD, ");
		query.append("B.DESCR DESC_STATO, C.NUM_CERTIFICATORE, A.FLG_OLD  ");
		query.append("FROM SICEE_T_CERTIFICATO A, SICEE_D_STATO_CERT B, SICEE_T_CERTIFICATORE C ");
		query.append("WHERE A.FK_STATO = B.ID_STATO (+) ");
		query.append("AND a.ID_CERTIFICATORE = c.ID_CERTIFICATORE ");

		return query;
	}

	/*
	public List<OptimizedSiceeTCerticato> executeByCodice(
			String annoCertificato, String idCertificatore,
			String progCertificato, Integer idStato, Long minIdCert,
			String dataPregresso) throws OptimizedSiceeTCerticatoDaoException {

		StringBuffer query = getInitQueryCertificati();

		if (!GenericUtil.isNullOrEmpty(annoCertificato))
			query.append(" AND A.ANNO = '" + annoCertificato + "' ");

		if (!GenericUtil.isNullOrEmpty(idCertificatore))
			query.append(" AND A.ID_CERTIFICATORE = '" + idCertificatore + "' ");

		if (!GenericUtil.isNullOrEmpty(progCertificato))
			query.append(" AND A.PROGR_CERTIFICATO = '" + progCertificato
					+ "' ");

		if (!GenericUtil.isNullOrEmpty(idStato))
			query.append(" AND A.FK_STATO = " + idStato);

		query.append(" AND TO_NUMBER(A.ID_CERTIFICATORE) > " + minIdCert + " ");

		if (dataPregresso != null) {
			query.append(" AND TRUNC(A.DT_UPLOAD) < TO_DATE('" + dataPregresso
					+ "','DD/MM/YYYY') ");
		}

		query.append(" ORDER BY A.ID_CERTIFICATORE, A.ANNO, A.PROGR_CERTIFICATO ASC");

		log.debug(query);

		return jdbcTemplate.query(query.toString(), this);
	}
	*/
	
	public List<OptimizedSiceeTCerticato> executeByCodice(
			java.lang.String idCertificatore, FiltroRicercaAce filtro,
			Long minIdCert, String dataPregresso) throws OptimizedSiceeTCerticatoDaoException {

		StringBuffer query = getInitQueryCertificati();

		if (!GenericUtil.isNullOrEmpty(filtro.getAnno()))
			query.append(" AND A.ANNO = '" + filtro.getAnno() + "' ");

		if (!GenericUtil.isNullOrEmpty(idCertificatore))
			query.append(" AND A.ID_CERTIFICATORE = '" + idCertificatore + "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getNumero()))
			query.append(" AND A.PROGR_CERTIFICATO = '" + filtro.getNumero()
					+ "' ");

//		if (!GenericUtil.isNullOrEmpty(filtro.getStato()))
//			query.append(" AND A.FK_STATO = " + filtro.getStato());

		
		if (!GenericUtil.isNullOrEmpty(filtro.getStato())) {
			if (filtro.getStato() == Constants.INVIATO_ANNULLATO) {
				query.append(" AND A.FK_STATO in (" + Constants.INVIATO + ","
						+ Constants.ANNULLATO + "," + Constants.ANNULLATO_BO + ") ");
			} 
			else if (filtro.getStato() == Constants.ANNULLATO) {
				query.append(" AND A.FK_STATO in (" + Constants.ANNULLATO + ","
						+ Constants.ANNULLATO_BO + ") ");
			}
			else {
				query.append(" AND A.FK_STATO = " + filtro.getStato());

			}
		}
		
		query.append(" AND TO_NUMBER(A.ID_CERTIFICATORE) > " + minIdCert + " ");

		if (dataPregresso != null) {
			query.append(" AND TRUNC(A.DT_UPLOAD) < TO_DATE('" + dataPregresso
					+ "','DD/MM/YYYY') ");
		}

		query.append(" ORDER BY A.ID_CERTIFICATORE, A.ANNO, A.PROGR_CERTIFICATO ASC");

		log.debug(query);

		return jdbcTemplate.query(query.toString(), this);
	}
	
	
	public Integer executeByParametriCount(java.lang.String idCertificatore,
			FiltroRicercaAce filtro, Long minIdCert, String dataPregresso)
			throws OptimizedSiceeTCerticatoDaoException {
		try {

			StringBuffer query = new StringBuffer("SELECT count(*) ");
			query.append("FROM SICEE_T_CERTIFICATO A ");
			query.append("WHERE 1=1 ");

			query = completaQueryWhere(query, idCertificatore, filtro,
					minIdCert, dataPregresso);

			log.debug(query);

			Integer count = jdbcTemplate.queryForInt(query.toString());

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OptimizedSiceeTCerticatoDaoException("Query failed", e);
		}
	}
	

	private StringBuffer completaQueryWhere(StringBuffer query,
			java.lang.String idCertificatore, FiltroRicercaAce filtro,
			Long minIdCert, String dataPregresso) {
		
		if (!GenericUtil.isNullOrEmpty(idCertificatore))
			query.append(" AND A.ID_CERTIFICATORE = '" + idCertificatore + "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getCodProv()))
			query.append(" AND A.ID_PROV = '" + raddoppiaApici(filtro.getCodProv()) + "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getCodComune()))
		{
			query.append(" AND A.ID_COMUNE = '" + raddoppiaApici(filtro.getCodComune()) + "' ");
		}
		else if (!GenericUtil.isNullOrEmpty(filtro.getDescComune()))
		{
			query.append(" AND UPPER(A.DESC_COMUNE) = '" + raddoppiaApici(filtro.getDescComune()).toUpperCase() + "' ");
		}
		
		if (!GenericUtil.isNullOrEmpty(filtro.getDescIndirizzo()))
			query.append(" AND UPPER(A.DESC_INDIRIZZO) LIKE '%"
					+ raddoppiaApici(filtro.getDescIndirizzo().toUpperCase()) + "%' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getNumCivico()))
			query.append(" AND A.NUM_CIVICO = '" + raddoppiaApici(filtro.getNumCivico()) + "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getSezione()))
			query.append(" AND A.SEZIONE = '" + raddoppiaApici(filtro.getSezione()) + "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getFoglio()))
			query.append(" AND A.FOGLIO = '" + raddoppiaApici(filtro.getFoglio()) + "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getParticella()))
			query.append(" AND A.PARTICELLA = '" + raddoppiaApici(filtro.getParticella())
					+ "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getSubalterno()))
			query.append(" AND A.SUBALTERNO = '" + raddoppiaApici(filtro.getSubalterno())
					+ "' ");

		if (!GenericUtil.isNullOrEmpty(filtro.getStato())) {
			if (filtro.getStato() == Constants.INVIATO_ANNULLATO) {
				query.append(" AND A.FK_STATO in (" + Constants.INVIATO + ","
						+ Constants.ANNULLATO + "," + Constants.ANNULLATO_BO + ") ");
			} 
			else if (filtro.getStato() == Constants.ANNULLATO) {
				query.append(" AND A.FK_STATO in (" + Constants.ANNULLATO + ","
						+ Constants.ANNULLATO_BO + ") ");
			} else {
				query.append(" AND A.FK_STATO = " + filtro.getStato());

			}
		}

		// minIdCert è nullo solo nel caso del monitoraggio
		if (minIdCert != null)
		{
			query.append(" AND TO_NUMBER(A.ID_CERTIFICATORE) > " + minIdCert + " ");
		}

		if (dataPregresso != null) {
			query.append(" AND TRUNC(A.DT_UPLOAD) < TO_DATE('" + dataPregresso
					+ "','DD/MM/YYYY') ");
		}

		return query;
	}
	
	private String raddoppiaApici(String value)
	{
		String ret = null;
		
		if (value != null)
		{
			ret = value.replace("'", "''");
		}
		
		return ret;
	}

	/*
	public List<OptimizedSiceeTCerticato> executeByParametriPerSostituzione(
			String idCertificatore, FiltroRicercaAce filtro, Long minIdCert,
			String dataPregresso) throws OptimizedSiceeTCerticatoDaoException {
		
		StringBuffer query = getInitQueryCertificati();

		query = completaQueryWherePerSostituzione(query, idCertificatore,
				filtro, minIdCert, dataPregresso);

		query.append(" ORDER BY A.ID_CERTIFICATORE, A.ANNO, A.PROGR_CERTIFICATO ASC");

		log.debug(query);

		return jdbcTemplate.query(query.toString(), this);

	}
	
	private StringBuffer completaQueryWherePerSostituzione(StringBuffer q,
			java.lang.String idCertificatore, FiltroRicercaAce filtro,
			Long minIdCert, String dataPregresso) {
		
		StringBuffer query = completaQueryWhere(q, idCertificatore, filtro,
				minIdCert, dataPregresso);
		
		if (filtro.getStato() == Constants.INVIATO) {
			query.append(" AND (A.ID_CERTIFICATORE, A.PROGR_CERTIFICATO, A.ANNO) not in ");
			query.append(" (select ID_CERTIFICATORE_NEW,PROGR_CERTIFICATO_NEW,ANNO_NEW ");
			query.append(" from sicee_t_sostituzione) ");
		}

		return query;
	}
	*/
	
	public List<OptimizedSiceeTCerticato> executeByParametri(
			java.lang.String idCertificatore, FiltroRicercaAce filtro,
			Long minIdCert, String dataPregresso, boolean flgSostituzione)
			throws OptimizedSiceeTCerticatoDaoException {

		StringBuffer query = getInitQueryCertificati();

		query = completaQueryWhere(query, idCertificatore, filtro, minIdCert,
				dataPregresso);

		// JIRA SICEE-371
		/*
		if (flgSostituzione && filtro.getStato() == Constants.INVIATO) {
			query.append(" AND (A.ID_CERTIFICATORE, A.PROGR_CERTIFICATO, A.ANNO) not in ");
			query.append(" (select ID_CERTIFICATORE_NEW,PROGR_CERTIFICATO_NEW,ANNO_NEW ");
			query.append(" from sicee_t_sostituzione) ");
		}
		*/
		
		query.append(" ORDER BY A.ID_CERTIFICATORE, A.ANNO, A.PROGR_CERTIFICATO ASC");

		log.debug(query);

		return jdbcTemplate.query(query.toString(), this);
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return OptimizedSiceeTCerticato
	 */
	public OptimizedSiceeTCerticato mapRow(ResultSet rs, int row)
			throws SQLException {
		OptimizedSiceeTCerticato dto = new OptimizedSiceeTCerticato();
		dto.setIdCertificatore(rs.getString(1));
		dto.setProgrCertificato(rs.getString(2));
		dto.setAnno(rs.getString(3));
		dto.setDtScadenza(rs.getDate(4));
		dto.setFkTransazioneAce(rs.getLong(5));
		dto.setDtAcquisto(rs.getDate(6));
		dto.setFkStato(new Integer(rs.getInt(7)));
		dto.setFkDichiarazione(new Integer(rs.getInt(8)));
		dto.setFlgDichiarazione(rs.getString(9));
		dto.setIdIndirizzo(new Integer(rs.getInt(10)));
		dto.setDescIndirizzo(rs.getString(11));
		dto.setDtInizio(rs.getDate(12));
		dto.setCap(rs.getString(13));
		dto.setIdComune(rs.getString(14));
		dto.setDescComune(rs.getString(15));
		dto.setSezione(rs.getString(16));
		dto.setIdProv(rs.getString(17));
		dto.setFoglio(rs.getString(18));
		dto.setDescProv(rs.getString(19));
		dto.setIdRegione(rs.getString(20));
		dto.setParticella(rs.getString(21));
		dto.setSubalterno(rs.getString(22));
		dto.setDescRegione(rs.getString(23));
		dto.setPiano(new Integer(rs.getInt(24)));
		dto.setNumPianiComplessivi(new Integer(rs.getInt(25)));
		dto.setNumAppartamenti(new Integer(rs.getInt(26)));
		dto.setScala(rs.getString(27));
		dto.setInterno(rs.getString(28));
		dto.setNote(rs.getString(29));
		dto.setFlgStampaDef(rs.getString(30));
		dto.setNomeAceFirmato(rs.getString(31));
		dto.setNomeCocertificatore(rs.getString(32));
		dto.setCognomeCocertificatore(rs.getString(33));
		dto.setNumCocertificatore(rs.getString(34));
		dto.setNumCivico(rs.getString(35));
		dto.setIdentificPdf(rs.getString(36));
		dto.setIdentificFoto(rs.getString(37));
		dto.setLuogoDichiarazione(rs.getString(38));
		dto.setNomeFoto(rs.getString(39));
		dto.setNomePdf(rs.getString(40));
		dto.setDtUpload(rs.getDate(41));
		dto.setDescStato(rs.getString(42));
		dto.setNumCertificatore(rs.getString(43));
		dto.setFlgOld( rs.getString( 44 ) );

		return dto;
	}

	
	
	

}
