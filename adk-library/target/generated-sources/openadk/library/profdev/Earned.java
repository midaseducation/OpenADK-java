// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.profdev;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  The number of units earned<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Earned extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Earned() {
		super( ProfdevDTD.EARNED );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type The unit description
	 *  @param value Gets or sets the content value of the &lt;Earned&gt; element
	 */
	public Earned( EarnedType type, String value ) {
		super( ProfdevDTD.EARNED );
		this.setType( type );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProfdevDTD.EARNED_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProfdevDTD.EARNED_TYPE };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;Earned&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.EARNED );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;Earned&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setValue( String value ) { 
		setFieldValue( ProfdevDTD.EARNED, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The unit description"</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getType() { 
		return getFieldValue( ProfdevDTD.EARNED_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The unit description"</i><p>
	 *
	 *  @param value A constant defined by the <code>EarnedType</code> class
	 *  @since 1.5r1
	 */
	public void setType( EarnedType value ) { 
		setField( ProfdevDTD.EARNED_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The unit description"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setType( String value ) { 
		setField( ProfdevDTD.EARNED_TYPE, value );
	}

}
