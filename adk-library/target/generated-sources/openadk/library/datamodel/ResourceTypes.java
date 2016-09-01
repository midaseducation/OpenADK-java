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
 *  @since 2.4
 */
public class ResourceTypes extends SIFKeyedList<ResourceTypeType>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ResourceTypes() {
		super( DatamodelDTD.RESOURCETYPES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param resourceType 
	 */
	public ResourceTypes( ResourceTypeType resourceType ) {
		super( DatamodelDTD.RESOURCETYPES );
		this.safeAddChild( DatamodelDTD.RESOURCETYPES_RESOURCETYPE, resourceType );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( DatamodelDTD.RESOURCETYPES_RESOURCETYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { DatamodelDTD.RESOURCETYPES_RESOURCETYPE };
	}

	/**
	 *  Adds a new <code>&lt;ResourceType&gt;</code> repeatable element.
	 *  This form of <code>setResourceType</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setResourceType</code>
	 *  that accepts a single <code>ResourceTypeType</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;ResourceTypeType&gt; element
	 *  @since 2.4
	 */
	public void addResourceType( String value ) {
		addChild( DatamodelDTD.RESOURCETYPES_RESOURCETYPE, new ResourceTypeType( value ) );
	}

	/**
	 *  Removes a <code>ResourceTypeType</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the ResourceTypeType object to remove by its Value value
	 *  @since 2.4
	 */
	public void removeResourceType( String value ) { 
		removeChild( DatamodelDTD.RESOURCETYPES_RESOURCETYPE, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>ResourceTypeType</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the ResourceTypeType object to return by its "Value" attribute value
	 *  @return A <code>ResourceTypeType</code> object
	 *  @since 2.4
	 */
	public ResourceTypeType getResourceType( String value ) { 
		return (ResourceTypeType)getChild( DatamodelDTD.RESOURCETYPES_RESOURCETYPE, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>ResourceTypeType</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>ResourceTypeType</code> objects
	 *  @since 2.4
	 */
	public ResourceTypeType[] getResourceTypes() {
		List<SIFElement> v = getChildList( DatamodelDTD.RESOURCETYPES_RESOURCETYPE);
		ResourceTypeType[] cvt = new ResourceTypeType[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>ResourceTypeType</code> objects. All existing 
	 * <code>ResourceTypeType</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>ResourceTypeTypes</code>.
	 *
	 *  @since 2.4
	 */
	public void setResourceTypes( ResourceTypeType[] resourcetypes ) {
		setChildren( DatamodelDTD.RESOURCETYPES_RESOURCETYPE, resourcetypes );
	}

}
