// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

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
public class ProjectedExitReason extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ProjectedExitReason() {
		super( ProgramsDTD.PROJECTEDEXITREASON );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param codeset Identifies source of value provided.
	 *  @param value Gets or sets the content value of the &lt;ProjectedExitReason&gt; element
	 */
	public ProjectedExitReason( Codeset codeset, String value ) {
		super( ProgramsDTD.PROJECTEDEXITREASON );
		this.setCodeset( codeset );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProgramsDTD.PROJECTEDEXITREASON_CODESET );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProgramsDTD.PROJECTEDEXITREASON_CODESET };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;ProjectedExitReason&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.0
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.PROJECTEDEXITREASON );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;ProjectedExitReason&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setValue( String value ) { 
		setFieldValue( ProgramsDTD.PROJECTEDEXITREASON, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Codeset</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Identifies source of value provided."</i><p>
	 *
	 *  @return The <code>Codeset</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getCodeset() { 
		return getFieldValue( ProgramsDTD.PROJECTEDEXITREASON_CODESET );
	}

	/**
	 *  Sets the value of the <code>Codeset</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Identifies source of value provided."</i><p>
	 *
	 *  @param value A constant defined by the <code>Codeset</code> class
	 *  @since 2.0
	 */
	public void setCodeset( Codeset value ) { 
		setField( ProgramsDTD.PROJECTEDEXITREASON_CODESET, value );
	}

	/**
	 *  Sets the value of the <code>Codeset</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Identifies source of value provided."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setCodeset( String value ) { 
		setField( ProgramsDTD.PROJECTEDEXITREASON_CODESET, value );
	}

}
