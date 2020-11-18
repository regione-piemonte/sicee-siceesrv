/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dao.spring;

import it.csi.sicee.siceesrv.business.dao.dao.SiceeTDatiCatastSecDao;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSec;
import it.csi.sicee.siceesrv.business.dao.dto.SiceeTDatiCatastSecPk;
import it.csi.sicee.siceesrv.business.dao.exceptions.SiceeTDatiCatastSecDaoException;
import java.util.List;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Transactional;

public class SiceeTDatiCatastSecDaoImpl extends AbstractDAO implements ParameterizedRowMapper<SiceeTDatiCatastSec>, SiceeTDatiCatastSecDao
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
	 * @return SiceeTDatiCatastSecPk
	 */
	public SiceeTDatiCatastSecPk insert(SiceeTDatiCatastSec dto)
	{
		dto.setIdDaticatastSec(incrementer.nextIntValue());
		jdbcTemplate.update("INSERT INTO " + getTableName() + " ( ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )",dto.getIdDaticatastSec(),dto.getIdCertificatore(),dto.getProgrCertificato(),dto.getAnno(),dto.getSezione(),dto.getFoglio(),dto.getParticella(),dto.getSubalterno(),dto.getFlgSigmater(),dto.getIdProv(),dto.getDescProv(),dto.getIdComune(),dto.getDescComune(),dto.getCodiceComuneCatastale());
		return dto.createPk();
	}

	/** 
	 * Updates a single row in the SICEE_T_DATICATAST_SEC table.
	 */
	public void update(SiceeTDatiCatastSecPk pk, SiceeTDatiCatastSec dto) throws SiceeTDatiCatastSecDaoException
	{
		jdbcTemplate.update("UPDATE " + getTableName() + " SET ID_DATICATAST_SEC = ?, ID_CERTIFICATORE = ?, PROGR_CERTIFICATO = ?, ANNO = ?, SEZIONE = ?, FOGLIO = ?, PARTICELLA = ?, SUBALTERNO = ?, FLG_SIGMATER = ?, ID_PROV = ?, DESC_PROV = ?, ID_COMUNE = ?, DESC_COMUNE = ?, CODICE_COMUNE_CATASTALE = ? WHERE ID_DATICATAST_SEC = ?",dto.getIdDaticatastSec(),dto.getIdCertificatore(),dto.getProgrCertificato(),dto.getAnno(),dto.getSezione(),dto.getFoglio(),dto.getParticella(),dto.getSubalterno(),dto.getFlgSigmater(),dto.getIdProv(),dto.getDescProv(),dto.getIdComune(),dto.getDescComune(),dto.getCodiceComuneCatastale(),pk.getIdDatiCatastSec());
	}

	/**
	 * Deletes rows in the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'..
	 *
	 * @param idCertificatore the id certificatore
	 * @param progrCertificato the progr certificato
	 * @param anno the anno
	 * @throws SiceeTDatiCatastSecDaoException the sicee t daticatast sec dao exception
	 */
	public void delete(String idCertificatore, String progrCertificato, String anno) throws SiceeTDatiCatastSecDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? AND PROGR_CERTIFICATO = ? AND ANNO = ?",idCertificatore, progrCertificato, anno);
	}

	/** 
	 * Deletes a single row in the SICEE_T_DATICATAST_SEC table.
	 */
	public void delete(SiceeTDatiCatastSecPk pk) throws SiceeTDatiCatastSecDaoException
	{
		jdbcTemplate.update("DELETE FROM " + getTableName() + " WHERE ID_DATICATAST_SEC = ?",pk.getIdDatiCatastSec());
	}

	/**
	 * Method 'mapRow'
	 * 
	 * @param rs
	 * @param row
	 * @throws SQLException
	 * @return SiceeTDatiCatastSec
	 */
	public SiceeTDatiCatastSec mapRow(ResultSet rs, int row) throws SQLException
	{
		SiceeTDatiCatastSec dto = new SiceeTDatiCatastSec();
		dto.setIdDaticatastSec( new Integer( rs.getInt(1) ) );
		dto.setIdCertificatore( rs.getString( 2 ) );
		dto.setProgrCertificato( rs.getString( 3 ) );
		dto.setAnno( rs.getString( 4 ) );
		dto.setSezione( rs.getString( 5 ) );
		dto.setFoglio( rs.getString( 6 ) );
		dto.setParticella( rs.getString( 7 ) );
		dto.setSubalterno( rs.getString( 8 ) );
		dto.setFlgSigmater( rs.getString( 9 ) );
		dto.setIdProv( rs.getString( 10 ) );
		dto.setDescProv( rs.getString( 11 ) );
		dto.setIdComune( rs.getString( 12 ) );
		dto.setDescComune( rs.getString( 13 ) );
		dto.setCodiceComuneCatastale( rs.getString( 14 ) );

		return dto;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "SICEE_T_DATICATAST_SEC";
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_DATICATAST_SEC = :idDatiCatastSec'.
	 */
	public SiceeTDatiCatastSec findByPrimaryKey(Integer idDatiCatastSec) throws SiceeTDatiCatastSecDaoException
	{
		try {
			List<SiceeTDatiCatastSec> list = jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ID_DATICATAST_SEC = ?", this,idDatiCatastSec);
			return list.size() == 0 ? null : list.get(0);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_CERTIFICATORE = :idCertificatore AND PROGR_CERTIFICATO = :progrCertificato AND ANNO = :anno'.
	 */
	public List<SiceeTDatiCatastSec> findBySiceeTCertificato(String idCertificatore, String progrCertificato, String anno) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? AND PROGR_CERTIFICATO = ? AND ANNO = ?", this,idCertificatore,progrCertificato,anno);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria ''.
	 */
	public List<SiceeTDatiCatastSec> findAll() throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " ORDER BY ID_DATICATAST_SEC", this);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_DATICATAST_SEC = :idDatiCatastSec'.
	 */
	public List<SiceeTDatiCatastSec> findWhereIdDatiCatastSecEquals(Integer idDatiCatastSec) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ID_DATICATAST_SEC = ? ORDER BY ID_DATICATAST_SEC", this,idDatiCatastSec);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_CERTIFICATORE = :idCertificatore'.
	 */
	public List<SiceeTDatiCatastSec> findWhereIdCertificatoreEquals(String idCertificatore) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ID_CERTIFICATORE = ? ORDER BY ID_CERTIFICATORE", this,idCertificatore);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'PROGR_CERTIFICATO = :progrCertificato'.
	 */
	public List<SiceeTDatiCatastSec> findWhereProgrCertificatoEquals(String progrCertificato) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE PROGR_CERTIFICATO = ? ORDER BY PROGR_CERTIFICATO", this,progrCertificato);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ANNO = :anno'.
	 */
	public List<SiceeTDatiCatastSec> findWhereAnnoEquals(String anno) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ANNO = ? ORDER BY ANNO", this,anno);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'SEZIONE = :sezione'.
	 */
	public List<SiceeTDatiCatastSec> findWhereSezioneEquals(String sezione) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE SEZIONE = ? ORDER BY SEZIONE", this,sezione);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'FOGLIO = :foglio'.
	 */
	public List<SiceeTDatiCatastSec> findWhereFoglioEquals(String foglio) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE FOGLIO = ? ORDER BY FOGLIO", this,foglio);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'PARTICELLA = :particella'.
	 */
	public List<SiceeTDatiCatastSec> findWhereParticellaEquals(String particella) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE PARTICELLA = ? ORDER BY PARTICELLA", this,particella);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'SUBALTERNO = :subalterno'.
	 */
	public List<SiceeTDatiCatastSec> findWhereSubalternoEquals(String subalterno) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE SUBALTERNO = ? ORDER BY SUBALTERNO", this,subalterno);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'FLG_SIGMATER = :flgSigmater'.
	 */
	public List<SiceeTDatiCatastSec> findWhereFlgSigmaterEquals(String flgSigmater) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE FLG_SIGMATER = ? ORDER BY FLG_SIGMATER", this,flgSigmater);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_PROV = :idProv'.
	 */
	public List<SiceeTDatiCatastSec> findWhereIdProvEquals(String idProv) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ID_PROV = ? ORDER BY ID_PROV", this,idProv);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'DESC_PROV = :descProv'.
	 */
	public List<SiceeTDatiCatastSec> findWhereDescProvEquals(String descProv) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE DESC_PROV = ? ORDER BY DESC_PROV", this,descProv);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'ID_COMUNE = :idComune'.
	 */
	public List<SiceeTDatiCatastSec> findWhereIdComuneEquals(String idComune) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE ID_COMUNE = ? ORDER BY ID_COMUNE", this,idComune);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'DESC_COMUNE = :descComune'.
	 */
	public List<SiceeTDatiCatastSec> findWhereDescComuneEquals(String descComune) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE DESC_COMUNE = ? ORDER BY DESC_COMUNE", this,descComune);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}

	/** 
	 * Returns all rows from the SICEE_T_DATICATAST_SEC table that match the criteria 'CODICE_COMUNE_CATASTALE = :codiceComuneCatastale'.
	 */
	public List<SiceeTDatiCatastSec> findWhereCodiceComuneCatastaleEquals(String codiceComuneCatastale) throws SiceeTDatiCatastSecDaoException
	{
		try {
			return jdbcTemplate.query("SELECT ID_DATICATAST_SEC, ID_CERTIFICATORE, PROGR_CERTIFICATO, ANNO, SEZIONE, FOGLIO, PARTICELLA, SUBALTERNO, FLG_SIGMATER, ID_PROV, DESC_PROV, ID_COMUNE, DESC_COMUNE, CODICE_COMUNE_CATASTALE FROM " + getTableName() + " WHERE CODICE_COMUNE_CATASTALE = ? ORDER BY CODICE_COMUNE_CATASTALE", this,codiceComuneCatastale);
		}
		catch (Exception e) {
			throw new SiceeTDatiCatastSecDaoException("Query failed", e);
		}
		
	}
	
	/** 
	 * Returns the rows from the SICEE_T_DATICATAST_SEC table that matches the specified primary-key value.
	 */
	public SiceeTDatiCatastSec findByPrimaryKey(SiceeTDatiCatastSecPk pk) throws SiceeTDatiCatastSecDaoException
	{
		return findByPrimaryKey( pk.getIdDatiCatastSec() );
	}

}
