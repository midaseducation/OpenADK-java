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
 *  Describes an alternate ID for a person<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class OtherId extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public OtherId() {
		super( CommonDTD.OTHERID );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type Code that defines the type of this other ID.  Note: A subset of valid values may be specified in data objects.
	 *  @param value Gets or sets the content value of the &lt;OtherId&gt; element
	 */
	public OtherId( OtherIdType type, String value ) {
		super( CommonDTD.OTHERID );
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
		return getFieldValue( CommonDTD.OTHERID_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { CommonDTD.OTHERID_TYPE };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;OtherId&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.1
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.OTHERID );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;OtherId&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setValue( String value ) { 
		setFieldValue( CommonDTD.OTHERID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code that defines the type of this other ID.  Note: A subset of valid values may be specified in data objects."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getType() { 
		return getFieldValue( CommonDTD.OTHERID_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code that defines the type of this other ID.  Note: A subset of valid values may be specified in data objects."</i><p>
	 *
	 *  @param value A constant defined by the <code>OtherIdType</code> class
	 *  @since 1.1
	 */
	public void setType( OtherIdType value ) { 
		setField( CommonDTD.OTHERID_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code that defines the type of this other ID.  Note: A subset of valid values may be specified in data objects."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setType( String value ) { 
		setField( CommonDTD.OTHERID_TYPE, value );
	}

}