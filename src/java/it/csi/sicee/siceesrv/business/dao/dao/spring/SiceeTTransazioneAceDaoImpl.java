/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTTransazioneAceDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTTransazioneAce;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTTransazioneAcePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTTransazioneAceDaoException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class SiceeTTransazioneAceDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeTTransazioneAce>, SiceeTTransazioneAceDao
{
	protected SimpleJdbcTemplate jdbcTemplate;

	protected DataSource dataSource;

	/**
	 * Method 'setDataSource'
	 * 
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
		jdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	/**
	 * Method 'insert'
	 * 
	 * @param dto
	 * @return SiceeTTransazioneAcePk
	 */
	
	public SiceeTTransazioneAcePk insert(SiceeTTransazioneAce dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )",dto.getIdTransazioneAce(),dto.getFkTipoPagamento(),dto.getNumTransazione(),dto.getDataTransazione(),dto.getFlgVerificato(),dto.getEseguitoNome(),dto.getEseguitoCognome(),dto.getFkCertificatore(),dto.getAnno(),dto.getQuantita());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	
	public void update(SiceeTTransazioneAcePk pk, SiceeTTransazioneAce dto) throws SiceeTTransazioneAceDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_TRANSAZIONE_ACE = ?, FK_TIPO_PAGAMENTO = ?, NUM_TRANSAZIONE = ?, DATA_TRANSAZIONE = ?, FLG_VERIFICATO = ?, ESEGUITO_NOME = ?, ESEGUITO_COGNOME = ?, FK_CERTIFICATORE = ?, ANNO = ?, QUANTITA = ? WHERE ID_TRANSAZIONE_ACE = ?",dto.getIdTransazioneAce(),dto.getFkTipoPagamento(),dto.getNumTransazione(),dto.getDataTransazione(),dto.getFlgVerificato(),dto.getEseguitoNome(),dto.getEseguitoCognome(),dto.getFkCertificatore(),dto.getAnno(),dto.getQuantita(),pk.getIdTransazioneAce());
	}

	/** 
	 * Deletes a single row in the SICEE_T_TRANSAZIONE_ACE table.
	 */
	
	public void delete(SiceeTTransazioneAcePk pk) throws SiceeTTransazioneAceDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_TRANSAZIONE_ACE = ?",pk.getIdTransazioneAce());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTTransazioneAce
	 */
	public SiceeTTransazioneAce mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeTTransazioneAce dto = new SiceeTTransazioneAce();
		dto.setIdTransazioneAce( rs.getLong( 1 ) );
		dto.setFkTipoPagamento( new Integer( rs.getInt(2) ) );
		dto.setNumTransazione( rs.getString( 3 ) );
		dto.setDataTransazione( rs.getTimestamp(4 ) );
		dto.setFlgVerificato( rs.getString( 5 ) );
		dto.setEseguitoNome( rs.getString( 6 ) );
		dto.setEseguitoCognome( rs.getString( 7 ) );
		dto.setFkCertificatore( rs.getString( 8 ) );
		dto.setAnno( rs.getString( 9 ) );
		dto.setQuantita( new Integer( rs.getInt(10) ) );
		if (rs.wasNull()) {
			dto.setQuantita( null );
		}
		
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_T_TRANSAZIONE_ACE";
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ID_TRANSAZIONE_ACE = :idTransazioneAce'.
	 */
	
	public SiceeTTransazioneAce findByPrimaryKey(long idTransazioneAce) throws SiceeTTransazioneAceDaoException
	{
		try {
			List<SiceeTTransazioneAce> list = jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE ID_TRANSAZIONE_ACE = ?", this,idTransazioneAce);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria ''.
	 */
	
	public List<SiceeTTransazioneAce> findAll() throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " ORDER BY ID_TRANSAZIONE_ACE", this);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_TIPO_PAGAMENTO = :fkTipoPagamento'.
	 */
	
	public List<SiceeTTransazioneAce> findBySiceeDTipoPagamento(Integer fkTipoPagamento) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE FK_TIPO_PAGAMENTO = ?", this,fkTipoPagamento);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_CERTIFICATORE = :fkCertificatore'.
	 */
	
	public List<SiceeTTransazioneAce> findBySiceeTCertificatore(String fkCertificatore) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE FK_CERTIFICATORE = ?", this,fkCertificatore);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ID_TRANSAZIONE_ACE = :idTransazioneAce'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereIdTransazioneAceEquals(long idTransazioneAce) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE ID_TRANSAZIONE_ACE = ? ORDER BY ID_TRANSAZIONE_ACE", this,idTransazioneAce);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_TIPO_PAGAMENTO = :fkTipoPagamento'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereFkTipoPagamentoEquals(Integer fkTipoPagamento) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE FK_TIPO_PAGAMENTO = ? ORDER BY FK_TIPO_PAGAMENTO", this,fkTipoPagamento);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'NUM_TRANSAZIONE = :numTransazione'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereNumTransazioneEquals(String numTransazione) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE NUM_TRANSAZIONE = ? ORDER BY NUM_TRANSAZIONE", this,numTransazione);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'DATA_TRANSAZIONE = :dataTransazione'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereDataTransazioneEquals(Date dataTransazione) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE DATA_TRANSAZIONE = ? ORDER BY DATA_TRANSAZIONE", this,dataTransazione);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FLG_VERIFICATO = :flgVerificato'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereFlgVerificatoEquals(String flgVerificato) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE FLG_VERIFICATO = ? ORDER BY FLG_VERIFICATO", this,flgVerificato);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ESEGUITO_NOME = :eseguitoNome'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereEseguitoNomeEquals(String eseguitoNome) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE ESEGUITO_NOME = ? ORDER BY ESEGUITO_NOME", this,eseguitoNome);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ESEGUITO_COGNOME = :eseguitoCognome'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereEseguitoCognomeEquals(String eseguitoCognome) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE ESEGUITO_COGNOME = ? ORDER BY ESEGUITO_COGNOME", this,eseguitoCognome);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'FK_CERTIFICATORE = :fkCertificatore'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereFkCertificatoreEquals(String fkCertificatore) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE FK_CERTIFICATORE = ? ORDER BY FK_CERTIFICATORE", this,fkCertificatore);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'ANNO = :anno'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereAnnoEquals(String anno) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE ANNO = ? ORDER BY ANNO", this,anno);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_TRANSAZIONE_ACE table that match the criteria 'QUANTITA = :quantita'.
	 */
	
	public List<SiceeTTransazioneAce> findWhereQuantitaEquals(Integer quantita) throws SiceeTTransazioneAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_TRANSAZIONE_ACE, FK_TIPO_PAGAMENTO, NUM_TRANSAZIONE, DATA_TRANSAZIONE, FLG_VERIFICATO, ESEGUITO_NOME, ESEGUITO_COGNOME, FK_CERTIFICATORE, ANNO, QUANTITA FROM " + getTableName() + " WHERE QUANTITA = ? ORDER BY QUANTITA", this,quantita);
		}
		catch (Exception e) {
			throw new SiceeTTransazioneAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SICEE_T_TRANSAZIONE_ACE table that matches the specified primary-key value.
	 */
	public SiceeTTransazioneAce findByPrimaryKey(SiceeTTransazioneAcePk pk) throws SiceeTTransazioneAceDaoException
	{
		return findByPrimaryKey( pk.getIdTransazioneAce() );
	}

}
