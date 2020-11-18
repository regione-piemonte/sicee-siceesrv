/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeLAccessoDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeLAccesso;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeLAccessoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeLAccessoDaoException;

public class SiceeLAccessoDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeLAccesso>, SiceeLAccessoDao
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
	
	public SiceeLAccessoPk insert(SiceeLAccesso dto) throws SiceeLAccessoDaoException
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( DT_ACCESSO, CODICE_FISCALE, NOME, COGNOME, RUOLO ) VALUES ( ?, ?, ?, ?, ? )",dto.getDtAccesso(),dto.getCodiceFiscale(),dto.getNome(),dto.getCognome(),dto.getRuolo());
		return dto.createPk();
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTTransazioneAce
	 */
	public SiceeLAccesso mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeLAccesso dto = new SiceeLAccesso();
		dto.setDtAccesso( rs.getTimestamp( 1 ) );
		dto.setCodiceFiscale( rs.getString( 2 ) );
		dto.setNome( rs.getString( 3 ) );
		dto.setCognome( rs.getString(4 ) );
		dto.setRuolo( rs.getString( 5 ) );
		
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_L_ACCESSO";
	}
}
