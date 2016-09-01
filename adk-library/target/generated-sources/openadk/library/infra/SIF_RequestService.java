// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class SIF_RequestService extends SIFList<SIF_ServiceRequestSubscribe>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_RequestService() {
		super( InfraDTD.SIF_REQUESTSERVICE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifService 
	 */
	public SIF_RequestService( SIF_ServiceRequestSubscribe sifService ) {
		super( InfraDTD.SIF_REQUESTSERVICE );
		this.safeAddChild( InfraDTD.SIF_REQUESTSERVICE_SIF_SERVICE, sifService );
	}

	/**
	 *  Gets all <code>SIF_ServiceRequestSubscribe</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SIF_ServiceRequestSubscribe</code> objects
	 *  @since 2.4
	 */
	public SIF_ServiceRequestSubscribe[] getSIF_Services() {
		List<SIFElement> v = getChildList( InfraDTD.SIF_REQUESTSERVICE_SIF_SERVICE);
		SIF_ServiceRequestSubscribe[] cvt = new SIF_ServiceRequestSubscribe[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SIF_ServiceRequestSubscribe</code> objects. All existing 
	 * <code>SIF_ServiceRequestSubscribe</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SIF_ServiceRequestSubscribes</code>.
	 *
	 *  @since 2.4
	 */
	public void setSIF_Services( SIF_ServiceRequestSubscribe[] sif_services ) {
		setChildren( InfraDTD.SIF_REQUESTSERVICE_SIF_SERVICE, sif_services );
	}

}
