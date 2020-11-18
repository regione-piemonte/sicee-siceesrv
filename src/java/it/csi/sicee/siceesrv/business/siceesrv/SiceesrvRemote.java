
package it.csi.sicee.siceesrv.business.siceesrv;

import it.csi.sicee.siceesrv.dto.siceesrv.*;

import it.csi.sicee.siceesrv.exception.siceesrv.*;

/**
 * Interfaccia remota dell'EJB che implementa il servizio siceesrv.
 * @generated
 */
public interface SiceesrvRemote extends javax.ejb.EJBObject {

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Certificatore[] findElencoCertificatori( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaCertificatori filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace findAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace[] findAceFiltro( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Certificatore findCertificatore( //NOSONAR  Reason:EIAS

			java.lang.String matricola //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Titolo[] elencoTitoli( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Notaio findNotaio( //NOSONAR  Reason:EIAS

			java.lang.String email //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public int updateInvioLog( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.InvioLog log //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.String getParametro( //NOSONAR  Reason:EIAS

			java.lang.String param //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public boolean isProductEnabled( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public boolean isUserEnabled( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public boolean isServiceEnabled( //NOSONAR  Reason:EIAS

			java.lang.String nomeServizio //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace[] findAceSostitutivi( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public byte[] getStampaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.String scrittaSfondo, //NOSONAR  Reason:EIAS

			byte[] foto //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.String findUidFotoAce( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public byte[] getStampaRicevutaInvioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.Integer findAceFiltroCount( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgSostituzione //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace findAceFlgPregresso( //NOSONAR  Reason:EIAS

			it.csi.sicee.siceesrv.dto.siceesrv.FiltroRicercaAce filtro, //NOSONAR  Reason:EIAS

			java.lang.Boolean flgPregresso //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] getDettaglioAce( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Ace[] findAceMonitoraggio( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public void notificaRenditionDisponibile( //NOSONAR  Reason:EIAS

			java.lang.Double idRichiestaPrenotazione, //NOSONAR  Reason:EIAS

			java.lang.String documentRenditionId //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS
	;

	/**
	 * @generated
	 */
	public java.lang.String findUidRifIndex( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			java.lang.Integer idTipoDoc //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public byte[] getXmlStampaCertificato2015( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			byte[] fotoPrincipale, //NOSONAR  Reason:EIAS

			java.lang.Integer idStatoAttestato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public byte[] getStampaCertificato2015( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato, //NOSONAR  Reason:EIAS

			byte[] fotoPrincipale, //NOSONAR  Reason:EIAS

			java.lang.Integer idStatoAttestato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.String findUidFotoPrincipaleApe( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public byte[] getXmlStampaTarghettaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public byte[] getStampaTarghettaCertificato( //NOSONAR  Reason:EIAS

			java.lang.String idCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.Protocollazione findProtocollazione( //NOSONAR  Reason:EIAS

			java.lang.String numCertificatore, //NOSONAR  Reason:EIAS

			java.lang.String progrCertificato, //NOSONAR  Reason:EIAS

			java.lang.String annoCertificato //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public java.lang.String getParametroMdp( //NOSONAR  Reason:EIAS

			java.lang.String param //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public it.csi.sicee.siceesrv.dto.siceesrv.LabelValue[] getParametriPagamentoMdp( //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public void insertLogAccesso( //NOSONAR  Reason:EIAS

			java.lang.String codiceFiscale, //NOSONAR  Reason:EIAS

			java.lang.String nome, //NOSONAR  Reason:EIAS

			java.lang.String cognome, //NOSONAR  Reason:EIAS

			java.lang.String ruolo //NOSONAR  Reason:EIAS

	) //NOSONAR  Reason:EIAS
			throws //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.SystemException, //NOSONAR  Reason:EIAS
			it.csi.csi.wrapper.UnrecoverableException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException //NOSONAR  Reason:EIAS

			, it.csi.sicee.siceesrv.exception.siceesrv.SiceesrvException;

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException, //NOSONAR  Reason:EIAS
			java.rmi.RemoteException; //NOSONAR  Reason:EIAS

}
