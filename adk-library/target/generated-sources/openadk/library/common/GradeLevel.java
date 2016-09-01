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
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class GradeLevel extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public GradeLevel() {
		super( CommonDTD.GRADELEVEL );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param code Code representing the grade level.
	 */
	public GradeLevel( GradeLevelCode code ) {
		super( CommonDTD.GRADELEVEL );
		this.setCode( code );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( CommonDTD.GRADELEVEL_CODE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { CommonDTD.GRADELEVEL_CODE };
	}

	/**
	 *  Gets the value of the <code>Code</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code representing the grade level."</i><p>
	 *
	 *  @return The <code>Code</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getCode() { 
		return getFieldValue( CommonDTD.GRADELEVEL_CODE );
	}

	/**
	 *  Sets the value of the <code>Code</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code representing the grade level."</i><p>
	 *
	 *  @param value A constant defined by the <code>GradeLevelCode</code> class
	 *  @since 1.1
	 */
	public void setCode( GradeLevelCode value ) { 
		setField( CommonDTD.GRADELEVEL_CODE, value );
	}

	/**
	 *  Sets the value of the <code>Code</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code representing the grade level."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setCode( String value ) { 
		setField( CommonDTD.GRADELEVEL_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( CommonDTD.GRADELEVEL_OTHERCODELIST );
		addChild( CommonDTD.GRADELEVEL_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( CommonDTD.GRADELEVEL_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 2.0
	 */
	public void removeOtherCodeList() { 
		removeChild( CommonDTD.GRADELEVEL_OTHERCODELIST );
	}

	/**
	 *  Returns the value of the <i>Code</i> attribute
	 */
	public String toString() {
		return this.getCode();
	}

}
