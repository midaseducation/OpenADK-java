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
 *  @since 2.0
 */
public class SIF_SubscribeAccess extends SIFKeyedList<SIF_Object>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_SubscribeAccess() {
		super( InfraDTD.SIF_SUBSCRIBEACCESS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifObject 
	 */
	public SIF_SubscribeAccess( SIF_Object sifObject ) {
		super( InfraDTD.SIF_SUBSCRIBEACCESS );
		this.safeAddChild( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT, sifObject );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT };
	}

	/**
	 *  Adds a new <code>&lt;SIF_Object&gt;</code> repeatable element.
	 *  This form of <code>setSIF_Object</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_Object</code>
	 *  that accepts a single <code>SIF_Object</code> object.
	 *
	 *  @param objectName The name of a SIF data object
	 *  @since 2.0
	 */
	public void addSIF_Object( String objectName ) {
		addChild( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT, new SIF_Object( objectName ) );
	}

	/**
	 *  Removes a <code>SIF_Object</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param objectName Identifies the SIF_Object object to remove by its ObjectName value
	 *  @since 2.0
	 */
	public void removeSIF_Object( String objectName ) { 
		removeChild( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT, new String[] { objectName.toString() } );
	}

	/**
	 *  Gets a <code>SIF_Object</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param objectName Identifies the SIF_Object object to return by its "ObjectName" attribute value
	 *  @return A <code>SIF_Object</code> object
	 *  @since 2.0
	 */
	public SIF_Object getSIF_Object( String objectName ) { 
		return (SIF_Object)getChild( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT, new String[] { objectName.toString() } );
	}

	/**
	 *  Gets all <code>SIF_Object</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SIF_Object</code> objects
	 *  @since 2.0
	 */
	public SIF_Object[] getSIF_Objects() {
		List<SIFElement> v = getChildList( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT);
		SIF_Object[] cvt = new SIF_Object[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SIF_Object</code> objects. All existing 
	 * <code>SIF_Object</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SIF_Objects</code>.
	 *
	 *  @since 2.0
	 */
	public void setSIF_Objects( SIF_Object[] sif_objects ) {
		setChildren( InfraDTD.SIF_SUBSCRIBEACCESS_SIF_OBJECT, sif_objects );
	}

}
