/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTNotaioDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaio;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTNotaioPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTNotaioDaoException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class SiceeTNotaioDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeTNotaio>, SiceeTNotaioDao
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
	 * @return SiceeTNotaioPk
	 */
	
	public SiceeTNotaioPk insert(SiceeTNotaio dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL ) VALUES ( ?, ?, ?, ?, ? )",dto.getIdNotaio(),dto.getNome(),dto.getCognome(),dto.getCodiceFiscale(),dto.getEmail());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_T_NOTAIO table.
	 */
	
	public void update(SiceeTNotaioPk pk, SiceeTNotaio dto) throws SiceeTNotaioDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_NOTAIO = ?, NOME = ?, COGNOME = ?, CODICE_FISCALE = ?, EMAIL = ? WHERE ID_NOTAIO = ?",dto.getIdNotaio(),dto.getNome(),dto.getCognome(),dto.getCodiceFiscale(),dto.getEmail(),pk.getIdNotaio());
	}

	/** 
	 * Deletes a single row in the SICEE_T_NOTAIO table.
	 */
	
	public void delete(SiceeTNotaioPk pk) throws SiceeTNotaioDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_NOTAIO = ?",pk.getIdNotaio());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTNotaio
	 */
	public SiceeTNotaio mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeTNotaio dto = new SiceeTNotaio();
		dto.setIdNotaio( new Long( rs.getLong(1) ) );
		dto.setNome( rs.getString( 2 ) );
		dto.setCognome( rs.getString( 3 ) );
		dto.setCodiceFiscale( rs.getString( 4 ) );
		dto.setEmail( rs.getString( 5 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_T_NOTAIO";
	}

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'ID_NOTAIO = :idNotaio'.
	 */
	
	public SiceeTNotaio findByPrimaryKey(Long idNotaio) throws SiceeTNotaioDaoException
	{
		try {
			List<SiceeTNotaio> list = jdbcTemplate.query("SELECT ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL FROM " + getTableName() + " WHERE ID_NOTAIO = ?", this,idNotaio);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTNotaioDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria ''.
	 */
	
	public List<SiceeTNotaio> findAll() throws SiceeTNotaioDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL FROM " + getTableName() + " ORDER BY ID_NOTAIO", this);
		}
		catch (Exception e) {
			throw new SiceeTNotaioDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'NOME = :nome'.
	 */
	
	public List<SiceeTNotaio> findWhereNomeEquals(String nome) throws SiceeTNotaioDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL FROM " + getTableName() + " WHERE NOME = ? ORDER BY NOME", this,nome);
		}
		catch (Exception e) {
			throw new SiceeTNotaioDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'COGNOME = :cognome'.
	 */
	
	public List<SiceeTNotaio> findWhereCognomeEquals(String cognome) throws SiceeTNotaioDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL FROM " + getTableName() + " WHERE COGNOME = ? ORDER BY COGNOME", this,cognome);
		}
		catch (Exception e) {
			throw new SiceeTNotaioDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'CODICE_FISCALE = :codiceFiscale'.
	 */
	
	public List<SiceeTNotaio> findWhereCodiceFiscaleEquals(String codiceFiscale) throws SiceeTNotaioDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL FROM " + getTableName() + " WHERE CODICE_FISCALE = ? ORDER BY CODICE_FISCALE", this,codiceFiscale);
		}
		catch (Exception e) {
			throw new SiceeTNotaioDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_NOTAIO table that match the criteria 'EMAIL = :email'.
	 */
	
	public SiceeTNotaio findWhereEmailEquals(String email) throws SiceeTNotaioDaoException
	{
		try {
			List<SiceeTNotaio> list = jdbcTemplate.query("SELECT ID_NOTAIO, NOME, COGNOME, CODICE_FISCALE, EMAIL FROM " + getTableName() + " WHERE EMAIL = ?", this,email);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTNotaioDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SICEE_T_NOTAIO table that matches the specified primary-key value.
	 */
	public SiceeTNotaio findByPrimaryKey(SiceeTNotaioPk pk) throws SiceeTNotaioDaoException
	{
		return findByPrimaryKey( pk.getIdNotaio() );
	}

}
