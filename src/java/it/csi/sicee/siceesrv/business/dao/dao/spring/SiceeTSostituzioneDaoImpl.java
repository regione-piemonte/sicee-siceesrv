/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTSostituzioneDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzione;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTSostituzionePk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTSostituzioneDaoException;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class SiceeTSostituzioneDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeTSostituzione>, SiceeTSostituzioneDao
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
	 * @return SiceeTSostituzionePk
	 */
	public SiceeTSostituzionePk insert(SiceeTSostituzione dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )",dto.getIdSostituzione(),dto.getProgrSostituzione(),dto.getIdCertificatoreOld(),dto.getProgrCertificatoOld(),dto.getAnnoOld(),dto.getIdCertificatoreNew(),dto.getProgrCertificatoNew(),dto.getAnnoNew());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_T_SOSTITUZIONE table.
	 */

	public void update(SiceeTSostituzionePk pk, SiceeTSostituzione dto) throws SiceeTSostituzioneDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_SOSTITUZIONE = ?, PROGR_SOSTITUZIONE = ?, ID_CERTIFICATORE_OLD = ?, PROGR_CERTIFICATO_OLD = ?, ANNO_OLD = ?, ID_CERTIFICATORE_NEW = ?, PROGR_CERTIFICATO_NEW = ?, ANNO_NEW = ? WHERE ID_SOSTITUZIONE = ? AND PROGR_SOSTITUZIONE = ?",dto.getIdSostituzione(),dto.getProgrSostituzione(),dto.getIdCertificatoreOld(),dto.getProgrCertificatoOld(),dto.getAnnoOld(),dto.getIdCertificatoreNew(),dto.getProgrCertificatoNew(),dto.getAnnoNew(),pk.getIdSostituzione(),pk.getProgrSostituzione());
	}

	/** 
	 * Deletes a single row in the SICEE_T_SOSTITUZIONE table.
	 */

	public void delete(SiceeTSostituzionePk pk) throws SiceeTSostituzioneDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_SOSTITUZIONE = ? AND PROGR_SOSTITUZIONE = ?",pk.getIdSostituzione(),pk.getProgrSostituzione());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTSostituzione
	 */
	public SiceeTSostituzione mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeTSostituzione dto = new SiceeTSostituzione();
		dto.setIdSostituzione( new Long( rs.getLong(1) ) );
		dto.setProgrSostituzione( new Long( rs.getLong(2) ) );
		dto.setIdCertificatoreOld( rs.getString( 3 ) );
		dto.setProgrCertificatoOld( rs.getString( 4 ) );
		dto.setAnnoOld( rs.getString( 5 ) );
		dto.setIdCertificatoreNew( rs.getString( 6 ) );
		dto.setProgrCertificatoNew( rs.getString( 7 ) );
		dto.setAnnoNew( rs.getString( 8 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_T_SOSTITUZIONE";
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_SOSTITUZIONE = :idSostituzione AND PROGR_SOSTITUZIONE = :progrSostituzione'.
	 */

	public SiceeTSostituzione findByPrimaryKey(Long idSostituzione, Long progrSostituzione) throws SiceeTSostituzioneDaoException
	{
		try {
			List<SiceeTSostituzione> list = jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_SOSTITUZIONE = ? AND PROGR_SOSTITUZIONE = ?", this,idSostituzione,progrSostituzione);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria ''.
	 */

	public List<SiceeTSostituzione> findAll() throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " ORDER BY ID_SOSTITUZIONE, PROGR_SOSTITUZIONE", this);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_NEW = :idCertificatoreNew'.
	 */

	public List<SiceeTSostituzione> findBySiceeTCertificato(String idCertificatoreNew) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_CERTIFICATORE_NEW = ?", this,idCertificatoreNew);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_OLD = :idCertificatoreOld AND PROGR_CERTIFICATO_OLD = :progrCertificatoOld AND PROGR_CERTIFICATO_NEW = :progrCertificatoNew AND ANNO_OLD = :annoOld AND ANNO_NEW = :annoNew'.
	 */

	public List<SiceeTSostituzione> findBySiceeTCertificato2(String idCertificatoreOld, String progrCertificatoOld, String progrCertificatoNew, String annoOld, String annoNew) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_CERTIFICATORE_OLD = ? AND PROGR_CERTIFICATO_OLD = ? AND PROGR_CERTIFICATO_NEW = ? AND ANNO_OLD = ? AND ANNO_NEW = ?", this,idCertificatoreOld,progrCertificatoOld,progrCertificatoNew,annoOld,annoNew);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_SOSTITUZIONE = :idSostituzione'.
	 */

	public List<SiceeTSostituzione> findWhereIdSostituzioneEquals(Long idSostituzione) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_SOSTITUZIONE = ? ORDER BY ID_SOSTITUZIONE", this,idSostituzione);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'PROGR_SOSTITUZIONE = :progrSostituzione'.
	 */

	public List<SiceeTSostituzione> findWhereProgrSostituzioneEquals(Long progrSostituzione) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE PROGR_SOSTITUZIONE = ? ORDER BY PROGR_SOSTITUZIONE", this,progrSostituzione);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_OLD = :idCertificatoreOld'.
	 */

	public List<SiceeTSostituzione> findWhereIdCertificatoreOldEquals(String idCertificatoreOld) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_CERTIFICATORE_OLD = ? ORDER BY ID_CERTIFICATORE_OLD", this,idCertificatoreOld);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'PROGR_CERTIFICATO_OLD = :progrCertificatoOld'.
	 */

	public List<SiceeTSostituzione> findWhereProgrCertificatoOldEquals(String progrCertificatoOld) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE PROGR_CERTIFICATO_OLD = ? ORDER BY PROGR_CERTIFICATO_OLD", this,progrCertificatoOld);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ANNO_OLD = :annoOld'.
	 */

	public List<SiceeTSostituzione> findWhereAnnoOldEquals(String annoOld) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ANNO_OLD = ? ORDER BY ANNO_OLD", this,annoOld);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_NEW = :idCertificatoreNew'.
	 */

	public List<SiceeTSostituzione> findWhereIdCertificatoreNewEquals(String idCertificatoreNew) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_CERTIFICATORE_NEW = ? ORDER BY ID_CERTIFICATORE_NEW", this,idCertificatoreNew);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'PROGR_CERTIFICATO_NEW = :progrCertificatoNew'.
	 */

	public List<SiceeTSostituzione> findWhereProgrCertificatoNewEquals(String progrCertificatoNew) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE PROGR_CERTIFICATO_NEW = ? ORDER BY PROGR_CERTIFICATO_NEW", this,progrCertificatoNew);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ANNO_NEW = :annoNew'.
	 */

	public List<SiceeTSostituzione> findWhereAnnoNewEquals(String annoNew) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ANNO_NEW = ? ORDER BY ANNO_NEW", this,annoNew);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_OLD = :idCertificatoreOld
AND PROGR_CERTIFICATO_OLD = :progrCertificatoOld
AND ANNO_OLD = :annoOld'.
	 */

	public List<SiceeTSostituzione> findWhereAceOldEquals(String idCertificatoreOld, String progrCertificatoOld, String annoOld) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_CERTIFICATORE_OLD = ? AND PROGR_CERTIFICATO_OLD = ? AND ANNO_OLD = ? ORDER BY ANNO_NEW, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW", this,idCertificatoreOld,progrCertificatoOld,annoOld);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_SOSTITUZIONE table that match the criteria 'ID_CERTIFICATORE_NEW = :idCertificatoreNew
AND PROGR_CERTIFICATO_NEW = :progrCertificatoNew
AND ANNO_NEW = :annoNew'.
	 */

	public List<SiceeTSostituzione> findWhereAceNewEquals(String idCertificatoreNew, String progrCertificatoNew, String annoNew) throws SiceeTSostituzioneDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_SOSTITUZIONE, PROGR_SOSTITUZIONE, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD, ANNO_OLD, ID_CERTIFICATORE_NEW, PROGR_CERTIFICATO_NEW, ANNO_NEW FROM " + getTableName() + " WHERE ID_CERTIFICATORE_NEW = ? AND PROGR_CERTIFICATO_NEW = ? AND ANNO_NEW = ? ORDER BY ANNO_OLD, ID_CERTIFICATORE_OLD, PROGR_CERTIFICATO_OLD", this,idCertificatoreNew,progrCertificatoNew,annoNew);
		}
		catch (Exception e) {
			throw new SiceeTSostituzioneDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SICEE_T_SOSTITUZIONE table that matches the specified primary-key value.
	 */
	public SiceeTSostituzione findByPrimaryKey(SiceeTSostituzionePk pk) throws SiceeTSostituzioneDaoException
	{
		return findByPrimaryKey( pk.getIdSostituzione(), pk.getProgrSostituzione() );
	}

}
