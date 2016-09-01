// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class SubTestIdentifier extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SubTestIdentifier() {
		super( AssessmentDTD.SUBTESTIDENTIFIER );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param value Gets or sets the content value of the &lt;SubTestIdentifier&gt; element
	 */
	public SubTestIdentifier( String value ) {
		super( AssessmentDTD.SUBTESTIDENTIFIER );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.SUBTESTIDENTIFIER );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.SUBTESTIDENTIFIER };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SubTestIdentifier&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.6
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SUBTESTIDENTIFIER );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SubTestIdentifier&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setValue( String value ) { 
		setFieldValue( AssessmentDTD.SUBTESTIDENTIFIER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SubTestIdentifierType</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"SubTestIdentifierType"</i><p>
	 *
	 *  @return The <code>SubTestIdentifierType</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getSubTestIdentifierType() { 
		return getFieldValue( AssessmentDTD.SUBTESTIDENTIFIER_SUBTESTIDENTIFIERTYPE );
	}

	/**
	 *  Sets the value of the <code>SubTestIdentifierType</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"SubTestIdentifierType"</i><p>
	 *
	 *  @param value A constant defined by the <code>SubTestIdentifierType</code> class
	 *  @since 2.6
	 */
	public void setSubTestIdentifierType( SubTestIdentifierType value ) { 
		setField( AssessmentDTD.SUBTESTIDENTIFIER_SUBTESTIDENTIFIERTYPE, value );
	}

	/**
	 *  Sets the value of the <code>SubTestIdentifierType</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"SubTestIdentifierType"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setSubTestIdentifierType( String value ) { 
		setField( AssessmentDTD.SUBTESTIDENTIFIER_SUBTESTIDENTIFIERTYPE, value );
	}

}
