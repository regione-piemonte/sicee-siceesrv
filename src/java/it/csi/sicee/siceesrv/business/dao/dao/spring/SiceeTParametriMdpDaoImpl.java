/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTParametriMdpDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametriMdp;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTParametriMdpPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTParametriMdpDaoException;
import it.csi.sicee.siceesrv.business.util.Constants;

import java.util.List;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SiceeTParametriMdpDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeTParametriMdp>, SiceeTParametriMdpDao
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
	 * @return SiceeTParametriMdpPk
	 */
	
	public SiceeTParametriMdpPk insert(SiceeTParametriMdp dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_PARAMETRI_MDP, CODICE, VALORE ) VALUES ( ?, ?, ? )",dto.getIdParametriMdp(),dto.getCodice(),dto.getValore());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_T_PARAMETRI_MDP table.
	 */
	
	public void update(SiceeTParametriMdpPk pk, SiceeTParametriMdp dto) throws SiceeTParametriMdpDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_PARAMETRI_MDP = ?, CODICE = ?, VALORE = ? WHERE ID_PARAMETRI_MDP = ?",dto.getIdParametriMdp(),dto.getCodice(),dto.getValore(),pk.getIdParametriMdp());
	}

	/** 
	 * Deletes a single row in the SICEE_T_PARAMETRI_MDP table.
	 */
	
	public void delete(SiceeTParametriMdpPk pk) throws SiceeTParametriMdpDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_PARAMETRI_MDP = ?",pk.getIdParametriMdp());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTParametriMdp
	 */
	public SiceeTParametriMdp mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeTParametriMdp dto = new SiceeTParametriMdp();
		dto.setIdParametriMdp( rs.getLong( 1 ) );
		dto.setCodice( rs.getString( 2 ) );
		dto.setValore( rs.getString( 3 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_T_PARAMETRI_MDP";
	}

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'ID_PARAMETRI_MDP = :idParametriMdp'.
	 */
	
	public SiceeTParametriMdp findByPrimaryKey(long idParametriMdp) throws SiceeTParametriMdpDaoException
	{
		try {
			List<SiceeTParametriMdp> list = jdbcTemplate.query("SELECT ID_PARAMETRI_MDP, CODICE, VALORE FROM " + getTableName() + " WHERE ID_PARAMETRI_MDP = ?", this,idParametriMdp);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTParametriMdpDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria ''.
	 */
	
	public List<SiceeTParametriMdp> findAll() throws SiceeTParametriMdpDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_PARAMETRI_MDP, CODICE, VALORE FROM " + getTableName() + " ORDER BY ID_PARAMETRI_MDP", this);
		}
		catch (Exception e) {
			throw new SiceeTParametriMdpDaoException("Query failed", e);
		}
		
	}

	
	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'ID_PARAMETRI_MDP = :idParametriMdp'.
	 */
	
	public List<SiceeTParametriMdp> findWhereIdParametriMdpEquals(long idParametriMdp) throws SiceeTParametriMdpDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_PARAMETRI_MDP, CODICE, VALORE FROM " + getTableName() + " WHERE ID_PARAMETRI_MDP = ? ORDER BY ID_PARAMETRI_MDP", this,idParametriMdp);
		}
		catch (Exception e) {
			throw new SiceeTParametriMdpDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'CODICE = :codice'.
	 */
	
	public SiceeTParametriMdp findWhereCodiceEquals(String codice) throws SiceeTParametriMdpDaoException
	{
		try {
			List<SiceeTParametriMdp> list = jdbcTemplate.query("SELECT ID_PARAMETRI_MDP, CODICE, VALORE FROM " + getTableName() + " WHERE CODICE = ? ORDER BY CODICE", this,codice);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTParametriMdpDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria for PAGAMENTO.
	 */
	
	public List<SiceeTParametriMdp> findCodiciPagamentoEquals() throws SiceeTParametriMdpDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_PARAMETRI_MDP, CODICE, VALORE FROM " + getTableName() + " WHERE CODICE IN ('"+Constants.COD_APPLICATION_ID+"','"+Constants.COD_ID_GATEWAY_NODO+"','"+Constants.COD_ID_PAYMENTMODE_NODO+"','"+Constants.COD_DATI_SPECIFICI_RISCOSSIONE+"','"+Constants.COD_VERSAMENTO+"') ORDER BY CODICE", this);
		}
		catch (Exception e) {
			throw new SiceeTParametriMdpDaoException("Query failed", e);
		}
		
	}
	
	/** 
	 * Returns all rows from the SICEE_T_PARAMETRI_MDP table that match the criteria 'VALORE = :valore'.
	 */
	
	public List<SiceeTParametriMdp> findWhereValoreEquals(String valore) throws SiceeTParametriMdpDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_PARAMETRI_MDP, CODICE, VALORE FROM " + getTableName() + " WHERE VALORE = ? ORDER BY VALORE", this,valore);
		}
		catch (Exception e) {
			throw new SiceeTParametriMdpDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SICEE_T_PARAMETRI_MDP table that matches the specified primary-key value.
	 */
	public SiceeTParametriMdp findByPrimaryKey(SiceeTParametriMdpPk pk) throws SiceeTParametriMdpDaoException
	{
		return findByPrimaryKey( pk.getIdParametriMdp() );
	}

}
