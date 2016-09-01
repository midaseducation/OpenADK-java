// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Contacts extends SIFList<LRContact>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Contacts() {
		super( CommonDTD.CONTACTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param contact 
	 */
	public Contacts( LRContact contact ) {
		super( CommonDTD.CONTACTS );
		this.safeAddChild( CommonDTD.CONTACTS_CONTACT, contact );
	}

	/**
	 *  Gets all <code>LRContact</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>LRContact</code> objects
	 *  @since 1.5r1
	 */
	public LRContact[] getContacts() {
		List<SIFElement> v = getChildList( CommonDTD.CONTACTS_CONTACT);
		LRContact[] cvt = new LRContact[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>LRContact</code> objects. All existing 
	 * <code>LRContact</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>LRContacts</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setContacts( LRContact[] contacts ) {
		setChildren( CommonDTD.CONTACTS_CONTACT, contacts );
	}

}