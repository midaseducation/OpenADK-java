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
 *  @since 1.1
 */
public class OtherIdList extends SIFKeyedList<OtherId>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public OtherIdList() {
		super( CommonDTD.OTHERIDLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param otherId Codes that define valid types for OtherId elements
	 */
	public OtherIdList( OtherId otherId ) {
		super( CommonDTD.OTHERIDLIST );
		this.safeAddChild( CommonDTD.OTHERIDLIST_OTHERID, otherId );
	}

	/**
	 *  Adds a new <code>&lt;OtherId&gt;</code> repeatable element.
	 *  This form of <code>setOtherId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setOtherId</code>
	 *  that accepts a single <code>OtherId</code> object.
	 *
	 *  @param type Code that defines the type of this other ID.  Note: A subset of valid values may be specified in data objects.
	 *  @param value Gets or sets the content value of the &lt;OtherId&gt; element
	 *  @since 1.1
	 */
	public void addOtherId( OtherIdType type, String value ) {
		addChild( CommonDTD.OTHERIDLIST_OTHERID, new OtherId( type, value ) );
	}

	/**
	 *  Removes an <code>OtherId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the OtherId object to remove by its Type value
	 *  @since 1.1
	 */
	public void removeOtherId( OtherIdType type ) { 
		removeChild( CommonDTD.OTHERIDLIST_OTHERID, new String[] { type.toString() } );
	}

	/**
	 *  Gets an <code>OtherId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the OtherId object to return by its "Type" attribute value
	 *  @return An <code>OtherId</code> object
	 *  @since 1.1
	 */
	public OtherId getOtherId( OtherIdType type ) { 
		return (OtherId)getChild( CommonDTD.OTHERIDLIST_OTHERID, new String[] { type.toString() } );
	}

	/**
	 *  Gets all <code>OtherId</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>OtherId</code> objects
	 *  @since 1.1
	 */
	public OtherId[] getOtherIds() {
		List<SIFElement> v = getChildList( CommonDTD.OTHERIDLIST_OTHERID);
		OtherId[] cvt = new OtherId[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>OtherId</code> objects. All existing 
	 * <code>OtherId</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>OtherIds</code>.
	 *
	 *  @since 1.1
	 */
	public void setOtherIds( OtherId[] otherids ) {
		setChildren( CommonDTD.OTHERIDLIST_OTHERID, otherids );
	}

}