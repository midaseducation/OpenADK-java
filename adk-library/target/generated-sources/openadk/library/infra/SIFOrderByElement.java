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
public class SIFOrderByElement extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIFOrderByElement() {
		super( InfraDTD.SIFORDERBYELEMENT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param objectName 
	 *  @param ordering 
	 *  @param value Gets or sets the content value of the &lt;SIFOrderByElement&gt; element
	 */
	public SIFOrderByElement( String objectName, SIFOrderBy ordering, String value ) {
		super( InfraDTD.SIFORDERBYELEMENT );
		this.setObjectName(objectName);
		this.setOrdering( ordering );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( InfraDTD.SIFORDERBYELEMENT_OBJECTNAME ) );
		b.append('.');
		b.append( getFieldValue( InfraDTD.SIFORDERBYELEMENT_ORDERING ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIFORDERBYELEMENT_OBJECTNAME, InfraDTD.SIFORDERBYELEMENT_ORDERING };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SIFOrderByElement&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.0
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIFORDERBYELEMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SIFOrderByElement&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setValue( String value ) { 
		setFieldValue( InfraDTD.SIFORDERBYELEMENT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>ObjectName</code> attribute.
	 *
	 *  @return The <code>ObjectName</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getObjectName() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIFORDERBYELEMENT_OBJECTNAME );
	}

	/**
	 *  Sets the value of the <code>ObjectName</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setObjectName( String value ) { 
		setFieldValue( InfraDTD.SIFORDERBYELEMENT_OBJECTNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Ordering</code> attribute.
	 *
	 *  @return The <code>Ordering</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getOrdering() { 
		return getFieldValue( InfraDTD.SIFORDERBYELEMENT_ORDERING );
	}

	/**
	 *  Sets the value of the <code>Ordering</code> attribute.
	 *
	 *  @param value A constant defined by the <code>SIFOrderBy</code> class
	 *  @since 2.0
	 */
	public void setOrdering( SIFOrderBy value ) { 
		setField( InfraDTD.SIFORDERBYELEMENT_ORDERING, value );
	}

	/**
	 *  Sets the value of the <code>Ordering</code> attribute as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setOrdering( String value ) { 
		setField( InfraDTD.SIFORDERBYELEMENT_ORDERING, value );
	}

}