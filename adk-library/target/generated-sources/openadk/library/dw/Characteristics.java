// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.dw;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Characteristics extends SIFKeyedList<AggregateCharacteristicInfoRefId>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Characteristics() {
		super( DwDTD.CHARACTERISTICS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param aggregateCharacteristicInfoRefId Reference to an AggregateCharacteristicInfo object.
	 */
	public Characteristics( AggregateCharacteristicInfoRefId aggregateCharacteristicInfoRefId ) {
		super( DwDTD.CHARACTERISTICS );
		this.safeAddChild( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID, aggregateCharacteristicInfoRefId );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID };
	}

	/**
	 *  Adds a new <code>&lt;AggregateCharacteristicInfoRefId&gt;</code> repeatable element.
	 *  This form of <code>setAggregateCharacteristicInfoRefId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAggregateCharacteristicInfoRefId</code>
	 *  that accepts a single <code>AggregateCharacteristicInfoRefId</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;AggregateCharacteristicInfoRefId&gt; element
	 *  @since 1.5r1
	 */
	public void addAggregateCharacteristicInfoRefId( String value ) {
		addChild( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID, new AggregateCharacteristicInfoRefId( value ) );
	}

	/**
	 *  Removes an <code>AggregateCharacteristicInfoRefId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the AggregateCharacteristicInfoRefId object to remove by its Value value
	 *  @since 1.5r1
	 */
	public void removeAggregateCharacteristicInfoRefId( String value ) { 
		removeChild( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID, new String[] { value.toString() } );
	}

	/**
	 *  Gets an <code>AggregateCharacteristicInfoRefId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the AggregateCharacteristicInfoRefId object to return by its "Value" attribute value
	 *  @return An <code>AggregateCharacteristicInfoRefId</code> object
	 *  @since 1.5r1
	 */
	public AggregateCharacteristicInfoRefId getAggregateCharacteristicInfoRefId( String value ) { 
		return (AggregateCharacteristicInfoRefId)getChild( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>AggregateCharacteristicInfoRefId</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>AggregateCharacteristicInfoRefId</code> objects
	 *  @since 1.5r1
	 */
	public AggregateCharacteristicInfoRefId[] getAggregateCharacteristicInfoRefIds() {
		List<SIFElement> v = getChildList( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID);
		AggregateCharacteristicInfoRefId[] cvt = new AggregateCharacteristicInfoRefId[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>AggregateCharacteristicInfoRefId</code> objects. All existing 
	 * <code>AggregateCharacteristicInfoRefId</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>AggregateCharacteristicInfoRefIds</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setAggregateCharacteristicInfoRefIds( AggregateCharacteristicInfoRefId[] aggregatecharacteristicinforefids ) {
		setChildren( DwDTD.CHARACTERISTICS_AGGREGATECHARACTERISTICINFOREFID, aggregatecharacteristicinforefids );
	}

}