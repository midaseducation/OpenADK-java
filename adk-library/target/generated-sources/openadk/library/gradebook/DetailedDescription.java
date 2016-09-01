// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.gradebook;

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
public class DetailedDescription extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public DetailedDescription() {
		super( GradebookDTD.DETAILEDDESCRIPTION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type The type of information that is contained in the DetailedDescription element.
	 *  @param value Gets or sets the content value of the &lt;DetailedDescription&gt; element
	 */
	public DetailedDescription( DetailedDescriptionType type, String value ) {
		super( GradebookDTD.DETAILEDDESCRIPTION );
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
		return getFieldValue( GradebookDTD.DETAILEDDESCRIPTION_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { GradebookDTD.DETAILEDDESCRIPTION_TYPE };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;DetailedDescription&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.0
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.DETAILEDDESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;DetailedDescription&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setValue( String value ) { 
		setFieldValue( GradebookDTD.DETAILEDDESCRIPTION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of information that is contained in the DetailedDescription element."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getType() { 
		return getFieldValue( GradebookDTD.DETAILEDDESCRIPTION_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of information that is contained in the DetailedDescription element."</i><p>
	 *
	 *  @param value A constant defined by the <code>DetailedDescriptionType</code> class
	 *  @since 2.0
	 */
	public void setType( DetailedDescriptionType value ) { 
		setField( GradebookDTD.DETAILEDDESCRIPTION_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of information that is contained in the DetailedDescription element."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setType( String value ) { 
		setField( GradebookDTD.DETAILEDDESCRIPTION_TYPE, value );
	}

}
