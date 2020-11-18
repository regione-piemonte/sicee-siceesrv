/*******************************************************************************
 * SPDX-License-Identifier: EUPL-1.2
 * Copyright Regione Piemonte - 2020
 *******************************************************************************/
package it.csi.sicee.siceesrv.business.dao.dto;

import java.io.Serializable;

public class SiceeTImpRiscaldamentoAcs implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 343602995548528795L;

	/** 
	 * This attribute maps to the column ID_CERTIFICATORE in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected String idCertificatore;

	/** 
	 * This attribute maps to the column PROGR_CERTIFICATO in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected String progrCertificato;

	/** 
	 * This attribute maps to the column ANNO in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected String anno;

	/** 
	 * This attribute maps to the column FLG_BOLLINO in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected String flgBollino;

	/** 
	 * This attribute maps to the column FK_CLASSE_EFF_RISC in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Integer fkClasseEffRisc;

	/** 
	 * This attribute maps to the column CODICE_IMPIANTO in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected String codiceImpianto;

	/** 
	 * This attribute maps to the column FK_CLASSE_EFF_ACS in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Integer fkClasseEffAcs;

	/** 
	 * This attribute maps to the column FK_COMBUSTIBILE_RISC in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Integer fkCombustibileRisc;

	/** 
	 * This attribute maps to the column NUMERO_BOLLINO in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected String numeroBollino;

	/** 
	 * This attribute maps to the column GEN_ANNO_RISC in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Integer genAnnoRisc;

	/** 
	 * This attribute maps to the column FK_COMBUSTIBILE_ACS in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Integer fkCombustibileAcs;

	/** 
	 * This attribute maps to the column POT_RISCALDAMENTO in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Double potRiscaldamento;

	/** 
	 * This attribute maps to the column GEN_ANNO_ACS in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Integer genAnnoAcs;

	/** 
	 * This attribute maps to the column POT_ACS in the SICEE_T_IMP_RISCALDAMENTO_ACS table.
	 */
	protected Double potAcs;

	/**
	 * Method 'SiceeTImpRiscaldamentoAcs'
	 * 
	 */
	public SiceeTImpRiscaldamentoAcs()
	{
	}

	/**
	 * Method 'getIdCertificatore'
	 * 
	 * @return String
	 */
	public String getIdCertificatore()
	{
		return idCertificatore;
	}

	/**
	 * Method 'setIdCertificatore'
	 * 
	 * @param idCertificatore
	 */
	public void setIdCertificatore(String idCertificatore)
	{
		this.idCertificatore = idCertificatore;
	}

	/**
	 * Method 'getProgrCertificato'
	 * 
	 * @return String
	 */
	public String getProgrCertificato()
	{
		return progrCertificato;
	}

	/**
	 * Method 'setProgrCertificato'
	 * 
	 * @param progrCertificato
	 */
	public void setProgrCertificato(String progrCertificato)
	{
		this.progrCertificato = progrCertificato;
	}

	/**
	 * Method 'getAnno'
	 * 
	 * @return String
	 */
	public String getAnno()
	{
		return anno;
	}

	/**
	 * Method 'setAnno'
	 * 
	 * @param anno
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
	}

	/**
	 * Method 'getFlgBollino'
	 * 
	 * @return String
	 */
	public String getFlgBollino()
	{
		return flgBollino;
	}

	/**
	 * Method 'setFlgBollino'
	 * 
	 * @param flgBollino
	 */
	public void setFlgBollino(String flgBollino)
	{
		this.flgBollino = flgBollino;
	}

	/**
	 * Method 'getFkClasseEffRisc'
	 * 
	 * @return Integer
	 */
	public Integer getFkClasseEffRisc()
	{
		return fkClasseEffRisc;
	}

	/**
	 * Method 'setFkClasseEffRisc'
	 * 
	 * @param fkClasseEffRisc
	 */
	public void setFkClasseEffRisc(Integer fkClasseEffRisc)
	{
		this.fkClasseEffRisc = fkClasseEffRisc;
	}

	/**
	 * Method 'getCodiceImpianto'
	 * 
	 * @return String
	 */
	public String getCodiceImpianto()
	{
		return codiceImpianto;
	}

	/**
	 * Method 'setCodiceImpianto'
	 * 
	 * @param codiceImpianto
	 */
	public void setCodiceImpianto(String codiceImpianto)
	{
		this.codiceImpianto = codiceImpianto;
	}

	/**
	 * Method 'getFkClasseEffAcs'
	 * 
	 * @return Integer
	 */
	public Integer getFkClasseEffAcs()
	{
		return fkClasseEffAcs;
	}

	/**
	 * Method 'setFkClasseEffAcs'
	 * 
	 * @param fkClasseEffAcs
	 */
	public void setFkClasseEffAcs(Integer fkClasseEffAcs)
	{
		this.fkClasseEffAcs = fkClasseEffAcs;
	}

	/**
	 * Method 'getFkCombustibileRisc'
	 * 
	 * @return Integer
	 */
	public Integer getFkCombustibileRisc()
	{
		return fkCombustibileRisc;
	}

	/**
	 * Method 'setFkCombustibileRisc'
	 * 
	 * @param fkCombustibileRisc
	 */
	public void setFkCombustibileRisc(Integer fkCombustibileRisc)
	{
		this.fkCombustibileRisc = fkCombustibileRisc;
	}

	/**
	 * Method 'getNumeroBollino'
	 * 
	 * @return String
	 */
	public String getNumeroBollino()
	{
		return numeroBollino;
	}

	/**
	 * Method 'setNumeroBollino'
	 * 
	 * @param numeroBollino
	 */
	public void setNumeroBollino(String numeroBollino)
	{
		this.numeroBollino = numeroBollino;
	}

	/**
	 * Method 'getGenAnnoRisc'
	 * 
	 * @return Integer
	 */
	public Integer getGenAnnoRisc()
	{
		return genAnnoRisc;
	}

	/**
	 * Method 'setGenAnnoRisc'
	 * 
	 * @param genAnnoRisc
	 */
	public void setGenAnnoRisc(Integer genAnnoRisc)
	{
		this.genAnnoRisc = genAnnoRisc;
	}

	/**
	 * Method 'getFkCombustibileAcs'
	 * 
	 * @return Integer
	 */
	public Integer getFkCombustibileAcs()
	{
		return fkCombustibileAcs;
	}

	/**
	 * Method 'setFkCombustibileAcs'
	 * 
	 * @param fkCombustibileAcs
	 */
	public void setFkCombustibileAcs(Integer fkCombustibileAcs)
	{
		this.fkCombustibileAcs = fkCombustibileAcs;
	}

	/**
	 * Method 'getPotRiscaldamento'
	 * 
	 * @return Double
	 */
	public Double getPotRiscaldamento()
	{
		return potRiscaldamento;
	}

	/**
	 * Method 'setPotRiscaldamento'
	 * 
	 * @param potRiscaldamento
	 */
	public void setPotRiscaldamento(Double potRiscaldamento)
	{
		this.potRiscaldamento = potRiscaldamento;
	}

	/**
	 * Method 'getGenAnnoAcs'
	 * 
	 * @return Integer
	 */
	public Integer getGenAnnoAcs()
	{
		return genAnnoAcs;
	}

	/**
	 * Method 'setGenAnnoAcs'
	 * 
	 * @param genAnnoAcs
	 */
	public void setGenAnnoAcs(Integer genAnnoAcs)
	{
		this.genAnnoAcs = genAnnoAcs;
	}

	/**
	 * Method 'getPotAcs'
	 * 
	 * @return Double
	 */
	public Double getPotAcs()
	{
		return potAcs;
	}

	/**
	 * Method 'setPotAcs'
	 * 
	 * @param potAcs
	 */
	public void setPotAcs(Double potAcs)
	{
		this.potAcs = potAcs;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	@Override
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof SiceeTImpRiscaldamentoAcs)) {
			return false;
		}
		
		final SiceeTImpRiscaldamentoAcs _cast = (SiceeTImpRiscaldamentoAcs) _other;
		if (idCertificatore == null ? _cast.idCertificatore != idCertificatore : !idCertificatore.equals( _cast.idCertificatore )) {
			return false;
		}
		
		if (progrCertificato == null ? _cast.progrCertificato != progrCertificato : !progrCertificato.equals( _cast.progrCertificato )) {
			return false;
		}
		
		if (anno == null ? _cast.anno != anno : !anno.equals( _cast.anno )) {
			return false;
		}
		
		if (flgBollino == null ? _cast.flgBollino != flgBollino : !flgBollino.equals( _cast.flgBollino )) {
			return false;
		}
		
		if (fkClasseEffRisc == null ? _cast.fkClasseEffRisc != fkClasseEffRisc : !fkClasseEffRisc.equals( _cast.fkClasseEffRisc )) {
			return false;
		}
		
		if (codiceImpianto == null ? _cast.codiceImpianto != codiceImpianto : !codiceImpianto.equals( _cast.codiceImpianto )) {
			return false;
		}
		
		if (fkClasseEffAcs == null ? _cast.fkClasseEffAcs != fkClasseEffAcs : !fkClasseEffAcs.equals( _cast.fkClasseEffAcs )) {
			return false;
		}
		
		if (fkCombustibileRisc == null ? _cast.fkCombustibileRisc != fkCombustibileRisc : !fkCombustibileRisc.equals( _cast.fkCombustibileRisc )) {
			return false;
		}
		
		if (numeroBollino == null ? _cast.numeroBollino != numeroBollino : !numeroBollino.equals( _cast.numeroBollino )) {
			return false;
		}
		
		if (genAnnoRisc == null ? _cast.genAnnoRisc != genAnnoRisc : !genAnnoRisc.equals( _cast.genAnnoRisc )) {
			return false;
		}
		
		if (fkCombustibileAcs == null ? _cast.fkCombustibileAcs != fkCombustibileAcs : !fkCombustibileAcs.equals( _cast.fkCombustibileAcs )) {
			return false;
		}
		
		if (potRiscaldamento == null ? _cast.potRiscaldamento != potRiscaldamento : !potRiscaldamento.equals( _cast.potRiscaldamento )) {
			return false;
		}
		
		if (genAnnoAcs == null ? _cast.genAnnoAcs != genAnnoAcs : !genAnnoAcs.equals( _cast.genAnnoAcs )) {
			return false;
		}
		
		if (potAcs == null ? _cast.potAcs != potAcs : !potAcs.equals( _cast.potAcs )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	@Override
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCertificatore != null) {
			_hashCode = 29 * _hashCode + idCertificatore.hashCode();
		}
		
		if (progrCertificato != null) {
			_hashCode = 29 * _hashCode + progrCertificato.hashCode();
		}
		
		if (anno != null) {
			_hashCode = 29 * _hashCode + anno.hashCode();
		}
		
		if (flgBollino != null) {
			_hashCode = 29 * _hashCode + flgBollino.hashCode();
		}
		
		if (fkClasseEffRisc != null) {
			_hashCode = 29 * _hashCode + fkClasseEffRisc.hashCode();
		}
		
		if (codiceImpianto != null) {
			_hashCode = 29 * _hashCode + codiceImpianto.hashCode();
		}
		
		if (fkClasseEffAcs != null) {
			_hashCode = 29 * _hashCode + fkClasseEffAcs.hashCode();
		}
		
		if (fkCombustibileRisc != null) {
			_hashCode = 29 * _hashCode + fkCombustibileRisc.hashCode();
		}
		
		if (numeroBollino != null) {
			_hashCode = 29 * _hashCode + numeroBollino.hashCode();
		}
		
		if (genAnnoRisc != null) {
			_hashCode = 29 * _hashCode + genAnnoRisc.hashCode();
		}
		
		if (fkCombustibileAcs != null) {
			_hashCode = 29 * _hashCode + fkCombustibileAcs.hashCode();
		}
		
		if (potRiscaldamento != null) {
			_hashCode = 29 * _hashCode + potRiscaldamento.hashCode();
		}
		
		if (genAnnoAcs != null) {
			_hashCode = 29 * _hashCode + genAnnoAcs.hashCode();
		}
		
		if (potAcs != null) {
			_hashCode = 29 * _hashCode + potAcs.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SiceeTImpRiscaldamentoAcsPk
	 */
	public SiceeTImpRiscaldamentoAcsPk createPk()
	{
		return new SiceeTImpRiscaldamentoAcsPk(idCertificatore, progrCertificato, anno);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "it.csi.sicee.siceeweb.business.dao.dto.SiceeTImpRiscaldamentoAcs: " );
		ret.append( "idCertificatore=" + idCertificatore );
		ret.append( ", progrCertificato=" + progrCertificato );
		ret.append( ", anno=" + anno );
		ret.append( ", flgBollino=" + flgBollino );
		ret.append( ", fkClasseEffRisc=" + fkClasseEffRisc );
		ret.append( ", codiceImpianto=" + codiceImpianto );
		ret.append( ", fkClasseEffAcs=" + fkClasseEffAcs );
		ret.append( ", fkCombustibileRisc=" + fkCombustibileRisc );
		ret.append( ", numeroBollino=" + numeroBollino );
		ret.append( ", genAnnoRisc=" + genAnnoRisc );
		ret.append( ", fkCombustibileAcs=" + fkCombustibileAcs );
		ret.append( ", potRiscaldamento=" + potRiscaldamento );
		ret.append( ", genAnnoAcs=" + genAnnoAcs );
		ret.append( ", potAcs=" + potAcs );
		return ret.toString();
	}

}
