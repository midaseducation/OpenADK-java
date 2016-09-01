// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Name of this type of curriculum object (e.g., "American Revolutionary War")<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Title extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Title() {
		super( InstrDTD.TITLE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param value Gets or sets the content value of the &lt;Title&gt; element
	 */
	public Title( String value ) {
		super( InstrDTD.TITLE );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.TITLE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.TITLE };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;Title&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.TITLE );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;Title&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setValue( String value ) { 
		setFieldValue( InstrDTD.TITLE, new SIFString( value ), value );
	}

}