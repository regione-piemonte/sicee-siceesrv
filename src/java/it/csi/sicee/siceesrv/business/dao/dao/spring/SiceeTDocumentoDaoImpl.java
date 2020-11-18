/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDocumentoDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumento;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDocumentoPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTDocumentoDaoException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

public class SiceeTDocumentoDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeTDocumento>, SiceeTDocumentoDao
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
	 * @return SiceeTDocumentoPk
	 */
	
	public SiceeTDocumentoPk insert(SiceeTDocumento dto)
	{
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD ) VALUES ( ?, ?, ?, ?, ? )",dto.getIdDocumento(),dto.getIdCertificatore(),dto.getIdTipoDoc(),dto.getIdentificDoc(),dto.getDtUpload());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_T_DOCUMENTO table.
	 */
	
	public void update(SiceeTDocumentoPk pk, SiceeTDocumento dto) throws SiceeTDocumentoDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_DOCUMENTO = ?, ID_CERTIFICATORE = ?, ID_TIPO_DOC = ?, IDENTIFIC_DOC = ?, DT_UPLOAD = ? WHERE ID_DOCUMENTO = ?",dto.getIdDocumento(),dto.getIdCertificatore(),dto.getIdTipoDoc(),dto.getIdentificDoc(),dto.getDtUpload(),pk.getIdDocumento());
	}

	/** 
	 * Deletes a single row in the SICEE_T_DOCUMENTO table.
	 */
	
	public void delete(SiceeTDocumentoPk pk) throws SiceeTDocumentoDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_DOCUMENTO = ?",pk.getIdDocumento());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTDocumento
	 */
	public SiceeTDocumento mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeTDocumento dto = new SiceeTDocumento();
		dto.setIdDocumento( new Integer( rs.getInt(1) ) );
		dto.setIdCertificatore( rs.getString( 2 ) );
		dto.setIdTipoDoc( new Integer( rs.getInt(3) ) );
		dto.setIdentificDoc( rs.getString( 4 ) );
		dto.setDtUpload( rs.getTimestamp(5 ) );
		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_T_DOCUMENTO";
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_DOCUMENTO = :idDocumento'.
	 */
	
	public SiceeTDocumento findByPrimaryKey(Integer idDocumento) throws SiceeTDocumentoDaoException
	{
		try {
			List<SiceeTDocumento> list = jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_DOCUMENTO = ?", this,idDocumento);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria ''.
	 */
	
	public List<SiceeTDocumento> findAll() throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " ORDER BY ID_DOCUMENTO", this);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_TIPO_DOC = :idTipoDoc'.
	 */
	
	public List<SiceeTDocumento> findBySiceeDTipoDocumento(Integer idTipoDoc) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_TIPO_DOC = ?", this,idTipoDoc);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	
	public List<SiceeTDocumento> findBySiceeTCertificatore(String idCertificatore) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ?", this,idCertificatore);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_DOCUMENTO = :idDocumento'.
	 */
	
	public List<SiceeTDocumento> findWhereIdDocumentoEquals(Integer idDocumento) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_DOCUMENTO = ? ORDER BY ID_DOCUMENTO", this,idDocumento);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	
	public List<SiceeTDocumento> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? ORDER BY ID_CERTIFICATORE", this,idCertificatore);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_TIPO_DOC = :idTipoDoc'.
	 */
	
	public List<SiceeTDocumento> findWhereIdTipoDocEquals(Integer idTipoDoc) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_TIPO_DOC = ? ORDER BY ID_TIPO_DOC", this,idTipoDoc);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'IDENTIFIC_DOC = :identificDoc'.
	 */
	
	public List<SiceeTDocumento> findWhereIdentificDocEquals(String identificDoc) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE IDENTIFIC_DOC = ? ORDER BY IDENTIFIC_DOC", this,identificDoc);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'DT_UPLOAD = :dtUpload'.
	 */
	
	public List<SiceeTDocumento> findWhereDtUploadEquals(Date dtUpload) throws SiceeTDocumentoDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE DT_UPLOAD = ? ORDER BY DT_UPLOAD", this,dtUpload);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DOCUMENTO table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND ID_TIPO_DOC = :idTipoDoc'.
	 */
	
	public SiceeTDocumento findWhereIdCertificatoreAndIdTipoDocumentoEquals(String idCertificatore, Integer idTipoDoc) throws SiceeTDocumentoDaoException
	{
		try {
			List<SiceeTDocumento> list = jdbcTemplate.query("SELECT ID_DOCUMENTO, ID_CERTIFICATORE, ID_TIPO_DOC, IDENTIFIC_DOC, DT_UPLOAD FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? AND ID_TIPO_DOC = ?", this,idCertificatore,idTipoDoc);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTDocumentoDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns the rows from the SICEE_T_DOCUMENTO table that matches the specified primary-key value.
	 */
	public SiceeTDocumento findByPrimaryKey(SiceeTDocumentoPk pk) throws SiceeTDocumentoDaoException
	{
		return findByPrimaryKey( pk.getIdDocumento() );
	}

}
