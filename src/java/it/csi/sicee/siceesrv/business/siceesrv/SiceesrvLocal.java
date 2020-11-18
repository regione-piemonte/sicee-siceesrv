
package it.csi.sicee.siceesrv.business.siceesrv;

import it.csi.sicee.siceesrv.dto.siceesrv.*;

import it.csi.sicee.siceesrv.exception.siceesrv.*;

/**
 * Interfaccia locale dell'EJB che implementa il servizio siceesrv.
 * @generated
 */
public interface SiceesrvLocal
		extends
			javax.ejb.EJBLocalObject,
			it.csi.sicee.siceesrv.interfacecsi.siceesrv.SiceesrvSrv {

	/**
	 * @generated
	 */
	public boolean testResources() //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public it.csi.coopdiag.api.InvocationNode selfCheck( //NOSONAR  Reason:EIAS 
			it.csi.coopdiag.api.CalledResource[] alreadyChecked) //NOSONAR  Reason:EIAS 
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

	/**
	 * @generated
	 */
	public boolean hasSelfCheck() //NOSONAR  Reason:EIAS
			throws it.csi.csi.wrapper.CSIException; //NOSONAR  Reason:EIAS

}
