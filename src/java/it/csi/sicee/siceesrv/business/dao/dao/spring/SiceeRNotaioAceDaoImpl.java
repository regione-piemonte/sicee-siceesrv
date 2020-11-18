/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeRNotaioAceDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAce;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeRNotaioAcePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeRNotaioAceDaoException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class SiceeRNotaioAceDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeRNotaioAce>, SiceeRNotaioAceDao
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
	 * @return SiceeRNotaioAcePk
	 */
	
	public SiceeRNotaioAcePk insert(SiceeRNotaioAce dto)
	{
		dto.setIdNotaioAce(incrementer.nextLongValue());
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO ) VALUES ( ?, ?, ?, ?, ?, ? )",dto.getIdNotaioAce(),dto.getIdNotaio(),dto.getIdCertificatore(),dto.getProgrCertificato(),dto.getAnno(),dto.getDtInvio());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_R_NOTAIO_ACE table.
	 */
	
	public void update(SiceeRNotaioAcePk pk, SiceeRNotaioAce dto) throws SiceeRNotaioAceDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_NOTAIO_ACE = ?, ID_NOTAIO = ?, ID_CERTIFICATORE = ?, PROGR_CERTIFICATO = ?, ANNO = ?, DT_INVIO = ? WHERE ID_NOTAIO_ACE = ?",dto.getIdNotaioAce(),dto.getIdNotaio(),dto.getIdCertificatore(),dto.getProgrCertificato(),dto.getAnno(),dto.getDtInvio(),pk.getIdNotaioAce());
	}

	/** 
	 * Deletes a single row in the SICEE_R_NOTAIO_ACE table.
	 */
	
	public void delete(SiceeRNotaioAcePk pk) throws SiceeRNotaioAceDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_NOTAIO_ACE = ?",pk.getIdNotaioAce());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeRNotaioAce
	 */
	public SiceeRNotaioAce mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeRNotaioAce dto = new SiceeRNotaioAce();
		dto.setIdNotaioAce( new Long( rs.getLong(1) ) );
		dto.setIdNotaio( new Long( rs.getLong(2) ) );
		dto.setIdCertificatore( rs.getString( 3 ) );
		dto.setProgrCertificato( rs.getString( 4 ) );
		dto.setAnno( rs.getString( 5 ) );
		dto.setDtInvio( rs.getTimestamp(6 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_R_NOTAIO_ACE";
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO_ACE = :idNotaioAce'.
	 */
	
	public SiceeRNotaioAce findByPrimaryKey(Long idNotaioAce) throws SiceeRNotaioAceDaoException
	{
		try {
			List<SiceeRNotaioAce> list = jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ID_NOTAIO_ACE = ?", this,idNotaioAce);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria ''.
	 */
	
	public List<SiceeRNotaioAce> findAll() throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " ORDER BY ID_NOTAIO_ACE", this);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	
	public List<SiceeRNotaioAce> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? AND PROGR_CERTIFICATO = ? AND ANNO = ?", this,idCertificatore,progrCertificato,anno);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO = :idNotaio'.
	 */
	
	public List<SiceeRNotaioAce> findBySiceeTNotaio(Integer idNotaio) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ID_NOTAIO = ?", this,idNotaio);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO_ACE = :idNotaioAce'.
	 */
	
	public List<SiceeRNotaioAce> findWhereIdNotaioAceEquals(Long idNotaioAce) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ID_NOTAIO_ACE = ? ORDER BY ID_NOTAIO_ACE", this,idNotaioAce);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_NOTAIO = :idNotaio'.
	 */
	
	public List<SiceeRNotaioAce> findWhereIdNotaioEquals(Integer idNotaio) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ID_NOTAIO = ? ORDER BY ID_NOTAIO", this,idNotaio);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	
	public List<SiceeRNotaioAce> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? ORDER BY ID_CERTIFICATORE", this,idCertificatore);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	
	public List<SiceeRNotaioAce> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE PROGR_CERTIFICATO = ? ORDER BY PROGR_CERTIFICATO", this,progrCertificato);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'ANNO = :anno'.
	 */
	
	public List<SiceeRNotaioAce> findWhereAnnoEquals(String anno) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE ANNO = ? ORDER BY ANNO", this,anno);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_R_NOTAIO_ACE table that match the criteria 'DT_INVIO = :dtInvio'.
	 */
	
	public List<SiceeRNotaioAce> findWhereDtInvioEquals(Date dtInvio) throws SiceeRNotaioAceDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_NOTAIO_ACE, ID_NOTAIO, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, DT_INVIO FROM " + getTableName() + " WHERE DT_INVIO = ? ORDER BY DT_INVIO", this,dtInvio);
		}
		catch (Exception e) {
			throw new SiceeRNotaioAceDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SICEE_R_NOTAIO_ACE table that matches the specified primary-key value.
	 */
	public SiceeRNotaioAce findByPrimaryKey(SiceeRNotaioAcePk pk) throws SiceeRNotaioAceDaoException
	{
		return findByPrimaryKey( pk.getIdNotaioAce() );
	}

}
