// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.trans;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Current odometer reading.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Odometer extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Odometer() {
		super( TransDTD.ODOMETER );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param unit Units used in the odometer reading.
	 *  @param value Gets or sets the content value of the &lt;Odometer&gt; element
	 */
	public Odometer( DistanceUnit unit, BigDecimal value ) {
		super( TransDTD.ODOMETER );
		this.setUnit( unit );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( TransDTD.ODOMETER_UNIT );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { TransDTD.ODOMETER_UNIT };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;Odometer&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.5r1
	 */
	public BigDecimal getValue() { 
		return (BigDecimal) getSIFSimpleFieldValue( TransDTD.ODOMETER );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;Odometer&gt; element"</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 1.5r1
	 */
	public void setValue( BigDecimal value ) { 
		setFieldValue( TransDTD.ODOMETER, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>Unit</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Units used in the odometer reading."</i><p>
	 *
	 *  @return The <code>Unit</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getUnit() { 
		return getFieldValue( TransDTD.ODOMETER_UNIT );
	}

	/**
	 *  Sets the value of the <code>Unit</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Units used in the odometer reading."</i><p>
	 *
	 *  @param value A constant defined by the <code>DistanceUnit</code> class
	 *  @since 1.5r1
	 */
	public void setUnit( DistanceUnit value ) { 
		setField( TransDTD.ODOMETER_UNIT, value );
	}

	/**
	 *  Sets the value of the <code>Unit</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Units used in the odometer reading."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setUnit( String value ) { 
		setField( TransDTD.ODOMETER_UNIT, value );
	}

}
