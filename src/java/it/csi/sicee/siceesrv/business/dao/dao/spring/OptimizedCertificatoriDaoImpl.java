/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;


import it.csi.sicee.siceesrv.business.dao.dao.OptimizedCertificatoriDao;
import it.csi.sicee.siceesrv.business.dao.dto.OptimizedCertificatori;
import it.csi.sicee.siceesrv.business.dao.exceptions.OptimizedCertificatoriDaoException;
import it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori;
import it.csi.sicee.siceesrv.util.Constants;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class OptimizedCertificatoriDaoImpl implements OptimizedCertificatoriDao
{
	protected static Logger log = Logger.getLogger(Constants.APPLICATION_CODE
			+ ".dao");
	
	private NamedParameterJdbcTemplate namedJdbcTemplateReg;

	public void setNamedJdbcTemplateReg(
			NamedParameterJdbcTemplate namedJdbcTemplateReg) {
		this.namedJdbcTemplateReg = namedJdbcTemplateReg;
	}


	
	private boolean isNullOrEmpty(String obj) {
		if (obj == null)
			return true;
		
		if ("".equals(obj.toString()))
			return true;
		
		return false;
	}
	
	private boolean isNullOrEmpty(Long obj) {
		if (obj == null)
			return true;
		
		if ("".equals(obj.toString()))
			return true;
		
		return false;
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return OptimizedCertificatori
	 */
	
	private static class OptimizedCertificatoriRowMapper implements ParameterizedRowMapper<OptimizedCertificatori>
	  {
	    
	public OptimizedCertificatori mapRow(ResultSet rs, int row) throws SQLException
	{
		
		
		OptimizedCertificatori dto = new OptimizedCertificatori();
		dto.setIdCertificatore(rs.getString("id_certificatore"));
		dto.setCognome( rs.getString( "cognome" ) );
		dto.setNome( rs.getString( "nome" ) );
		dto.setCell( rs.getString( "cell" ) );
		dto.setEmail( rs.getString( "email" ) );
		dto.setTelefono( rs.getString( "telefono" ) );
		dto.setFlgConsensoEmail( rs.getString( "flg_consenso_email" ) );
		dto.setFlgConsensoCell( rs.getString( "flg_consenso_cell" ) );
		dto.setFlgConsensoTell( rs.getString( "flg_consenso_tel" ) );
		dto.setDenominazione( rs.getString( "denominazione" ) );
		dto.setDescIndirizzo( rs.getString( "desc_indirizzo" ) );
		dto.setNumCivico( rs.getString( "num_civico" ) );
		dto.setDescComune( rs.getString( "desc_comune" ) );
		dto.setDescProv( rs.getString( "desc_prov" ) );
		dto.setDescRegione( rs.getString( "desc_regione" ) );
		dto.setSigla(rs.getString( "codice" ));
		dto.setTitolo(rs.getString( "desc_istr" ));
		dto.setFlgEsameSostenuto(rs.getString( "flg_esame_sostenuto" ));
		dto.setSitoWeb(rs.getString( "sito_web" ));
		dto.setMatricola(rs.getString( "num_certificatore" ));
		return dto;
	}
	  }

	public List<OptimizedCertificatori> findElencoCertificatori(
			FiltroRicercaCertificatori filtro, Long parametro)
			throws OptimizedCertificatoriDaoException {
		try {
			
/*SELECT   *
    FROM (SELECT c.id_certificatore, c.cognome, c.nome, c.cell, c.email,
                 c.telefono, c.flg_consenso_cell, c.flg_consenso_email,
                 c.flg_consenso_tel, a.denominazione, a.desc_indirizzo,
                 a.num_civico, c.sito_web, c.flg_esame_sostenuto,
                 a.desc_comune desc_comune, a.desc_prov desc_prov,
                 a.desc_regione desc_regione, t.sigla, t.descr,
                 c.num_certificatore, t.id_titolo, a.id_comune, a.id_prov,
                 a.id_regione
            FROM sicee_t_certificatore c, sicee_d_titolo t, sicee_t_azienda a
           WHERE c.fk_titolo = t.id_titolo
             AND c.fk_azienda = a.id_azienda
             AND c.num_certificatore IS NOT NULL
             AND c.dt_scadenza_elenco >= TO_DATE (SYSDATE, 'dd/MM/YY')
             AND a.p_iva IS NOT NULL
          UNION
          SELECT c.id_certificatore, c.cognome, c.nome, c.cell, c.email,
                 c.telefono, c.flg_consenso_cell, c.flg_consenso_email,
                 c.flg_consenso_tel, a.denominazione, a.desc_indirizzo,
                 a.num_civico, c.sito_web, c.flg_esame_sostenuto,
                 c.desc_comune_residenza desc_comune,
                 c.desc_prov_residenza desc_prov,
                 c.desc_regione_residenza desc_regione, t.sigla, t.descr,
                 c.num_certificatore, t.id_titolo,
                 c.id_comune_residenza id_comune, c.id_prov_residenza id_prov,
                 c.id_regione_residenza id_regione
            FROM sicee_t_certificatore c, sicee_d_titolo t, sicee_t_azienda a
           WHERE c.fk_titolo = t.id_titolo
             AND c.fk_azienda = a.id_azienda
             AND c.num_certificatore IS NOT NULL
             AND c.dt_scadenza_elenco >= TO_DATE (SYSDATE, 'dd/MM/YY')
             AND a.p_iva IS NULL)
   WHERE id_titolo = 1
ORDER BY num_certificatore ASC*/

			
			
			StringBuffer query = new StringBuffer("SELECT * " + 
		    "FROM (SELECT c.id_certificatore, c.cognome, c.nome, c.cell, c.email, " +
		                 "c.telefono, c.flg_consenso_cell, c.flg_consenso_email, " +		                 	
		                 "c.flg_consenso_tel, a.denominazione, a.desc_indirizzo, " +
		                 "a.num_civico, c.sito_web, c.flg_esame_sostenuto, " +
		                 "a.desc_comune desc_comune, a.desc_prov desc_prov, " +
		                 "a.desc_regione desc_regione, i.codice, i.denominazione desc_istr, " +
		                 "c.num_certificatore, i.id_istruzione, a.id_comune, a.id_prov, " +
		                 "a.id_regione " +
		            "FROM sicee_t_certificatore c, sicee_d_istruzione i, sicee_t_azienda a " +
		           "WHERE c.fk_istruzione = i.id_istruzione (+) " +
		             "AND c.fk_azienda = a.id_azienda " +
		             "AND c.num_certificatore IS NOT NULL " +
		             "AND c.dt_scadenza_elenco >= TO_DATE (SYSDATE, 'dd/MM/YY') " +
		             "AND a.p_iva IS NOT NULL " +
		          "UNION " +
		          "SELECT c.id_certificatore, c.cognome, c.nome, c.cell, c.email, " +
		                 "c.telefono, c.flg_consenso_cell, c.flg_consenso_email, " +
		                 "c.flg_consenso_tel, a.denominazione, a.desc_indirizzo, " +
		                 "a.num_civico, c.sito_web, c.flg_esame_sostenuto, " +
		                 "c.desc_comune_residenza desc_comune, " +
		                 "c.desc_prov_residenza desc_prov, " +
		                 "c.desc_regione_residenza desc_regione, i.codice, i.denominazione desc_istr, " +
		                 "c.num_certificatore, i.id_istruzione, " +
		                 "c.id_comune_residenza id_comune, c.id_prov_residenza id_prov, " +
		                 "c.id_regione_residenza id_regione " +
		            "FROM sicee_t_certificatore c, sicee_d_istruzione i, sicee_t_azienda a " +
		           "WHERE c.fk_istruzione = i.id_istruzione (+) " +
		             "AND c.fk_azienda = a.id_azienda " +
		             "AND c.num_certificatore IS NOT NULL " +
		             "AND c.dt_scadenza_elenco >= TO_DATE (SYSDATE, 'dd/MM/YY') " +
		             "AND a.p_iva IS NULL) " +
		   "WHERE num_certificatore IS NOT NULL ");
			
			
			 MapSqlParameterSource params = new MapSqlParameterSource();		    
			    

					if ( !isNullOrEmpty(filtro.getTitolo())) {
						query.append(" and id_istruzione=:idTitolo ");
						params.addValue("idTitolo", filtro.getTitolo(), Types.VARCHAR);						
					}
					if ( !isNullOrEmpty(filtro.getNome())) {
						query.append(" and nome like :nome ");
						params.addValue("nome", likeString(filtro.getNome()), Types.VARCHAR);						
					}
					if ( !isNullOrEmpty(filtro.getCognome())) {
						query.append(" and cognome like :cognome ");
						params.addValue("cognome",likeString(filtro.getCognome()), Types.VARCHAR);						
					}
					if ( !isNullOrEmpty(filtro.getRagioneSociale())) {
						query.append(" and denominazione like :ragioneSociale ");
						params.addValue("ragioneSociale",likeString(filtro.getRagioneSociale()), Types.VARCHAR);						
					}
					if ( !isNullOrEmpty(filtro.getComune())) {
						query.append(" and id_comune=:idComune ");
						params.addValue("idComune", filtro.getComune(), Types.VARCHAR);
					}
					if ( !isNullOrEmpty(filtro.getProvincia())) {
						query.append(" and id_prov=:idProvincia ");
						params.addValue("idProvincia", filtro.getProvincia(), Types.VARCHAR);
					}
					if ( !isNullOrEmpty(filtro.getRegione())) {
						query.append(" and id_regione=:idRegione ");
						params.addValue("idRegione", filtro.getRegione(), Types.VARCHAR);
					}					
					if ( !isNullOrEmpty(parametro)) {
						query.append(" and to_number(id_certificatore) > :parametro ");
						params.addValue("parametro", parametro, Types.NUMERIC);						
					}
					
					query.append(" order by num_certificatore asc");
					
					log.debug("sigla: " + filtro.getTitolo());
					log.debug("nome: " + filtro.getNome());
					log.debug("cognome: " + filtro.getCognome());
					log.debug("ragione sociale: " + filtro.getRagioneSociale());
					log.debug("comune: " + filtro.getComune());
					log.debug("provincia: " + filtro.getProvincia());
					log.debug("regione: " + filtro.getRegione());
					
					log.debug(query);
					
			
			return namedJdbcTemplateReg.query(query.toString(), params, new OptimizedCertificatoriRowMapper());
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new OptimizedCertificatoriDaoException("Query failed", e);
		}
	}
	
	private String likeString(String str) {
		return new String("%"+str+"%");
	}

}
