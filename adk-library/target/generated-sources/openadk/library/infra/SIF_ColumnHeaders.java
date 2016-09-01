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
 *  @version 2.3
 *  @since 2.0
 */
public class SIF_ColumnHeaders extends SIFKeyedList<SIFColumnHeader>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_ColumnHeaders() {
		super( InfraDTD.SIF_COLUMNHEADERS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifElement 
	 */
	public SIF_ColumnHeaders( SIFColumnHeader sifElement ) {
		super( InfraDTD.SIF_COLUMNHEADERS );
		this.safeAddChild( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT, sifElement );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT };
	}

	/**
	 *  Adds a new <code>&lt;SIF_Element&gt;</code> repeatable element.
	 *  This form of <code>setSIF_Element</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_Element</code>
	 *  that accepts a single <code>SIFColumnHeader</code> object.
	 *
	 *  @param objectName 
	 *  @param value Gets or sets the content value of the &lt;SIFColumnHeader&gt; element
	 *  @since 2.0
	 */
	public void addSIF_Element( String objectName, String value ) {
		addChild( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT, new SIFColumnHeader( objectName, value ) );
	}

	/**
	 *  Removes a <code>SIFColumnHeader</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param objectName Identifies the SIFColumnHeader object to remove by its ObjectName value
	 *  @since 2.0
	 */
	public void removeSIF_Element( String objectName ) { 
		removeChild( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT, new String[] { objectName.toString() } );
	}

	/**
	 *  Gets a <code>SIFColumnHeader</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param objectName Identifies the SIFColumnHeader object to return by its "ObjectName" attribute value
	 *  @return A <code>SIFColumnHeader</code> object
	 *  @since 2.0
	 */
	public SIFColumnHeader getSIF_Element( String objectName ) { 
		return (SIFColumnHeader)getChild( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT, new String[] { objectName.toString() } );
	}

	/**
	 *  Gets all <code>SIFColumnHeader</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SIFColumnHeader</code> objects
	 *  @since 2.0
	 */
	public SIFColumnHeader[] getSIF_Elements() {
		List<SIFElement> v = getChildList( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT);
		SIFColumnHeader[] cvt = new SIFColumnHeader[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SIFColumnHeader</code> objects. All existing 
	 * <code>SIFColumnHeader</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SIFColumnHeaders</code>.
	 *
	 *  @since 2.0
	 */
	public void setSIF_Elements( SIFColumnHeader[] sif_elements ) {
		setChildren( InfraDTD.SIF_COLUMNHEADERS_SIF_ELEMENT, sif_elements );
	}

}
