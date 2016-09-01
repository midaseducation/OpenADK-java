// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.datamodel;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.3
 */
public class SEAContactList extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SEAContactList() {
		super( DatamodelDTD.SEACONTACTLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;SEAContact&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The two-digit Federal Information Processing Standard (FIPS) Code for the State, District of Columbia, and the possessions and freely associated areas of the United States (e.g. Puerto Rico)."</i><p>
	 *
	 *  @param value A <code>SEAContact</code> object
	 *  @since 2.3
	 */
	public void setSEAContact( SEAContact value ) { 
		removeChild( DatamodelDTD.SEACONTACTLIST_SEACONTACT );
		addChild( DatamodelDTD.SEACONTACTLIST_SEACONTACT, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SEAContact&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The two-digit Federal Information Processing Standard (FIPS) Code for the State, District of Columbia, and the possessions and freely associated areas of the United States (e.g. Puerto Rico)."</i><p>
	 *
	 *  @return A <code>SEAContact</code> object
	 *  @since 2.3
	 */
	public SEAContact getSEAContact() { 
		return (SEAContact)getChild( DatamodelDTD.SEACONTACTLIST_SEACONTACT);
	}

	/**
	 *  Removes the <code>SEAContact</code> child element previously created by calling <code>setSEAContact</code>
	 *
	 *  @since 2.3
	 */
	public void removeSEAContact() { 
		removeChild( DatamodelDTD.SEACONTACTLIST_SEACONTACT );
	}

}
