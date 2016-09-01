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
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class CreatorLearning extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CreatorLearning() {
		super( InstrDTD.CREATORLEARNING );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param value Gets or sets the content value of the &lt;CreatorLearning&gt; element
	 */
	public CreatorLearning( String value ) {
		super( InstrDTD.CREATORLEARNING );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.CREATORLEARNING );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.CREATORLEARNING };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;CreatorLearning&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.6
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.CREATORLEARNING );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;CreatorLearning&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setValue( String value ) { 
		setFieldValue( InstrDTD.CREATORLEARNING, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The object type of the object representing the Creator."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getType() { 
		return getFieldValue( InstrDTD.CREATORLEARNING_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The object type of the object representing the Creator."</i><p>
	 *
	 *  @param value A constant defined by the <code>TypeCreator</code> class
	 *  @since 2.6
	 */
	public void setType( TypeCreator value ) { 
		setField( InstrDTD.CREATORLEARNING_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The object type of the object representing the Creator."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setType( String value ) { 
		setField( InstrDTD.CREATORLEARNING_TYPE, value );
	}

	/**
	 *  Gets the value of the <code>SIF_RefId</code> attribute.
	 *
	 *  @return The <code>SIF_RefId</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getSIF_RefId() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.CREATORLEARNING_SIF_REFID );
	}

	/**
	 *  Sets the value of the <code>SIF_RefId</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSIF_RefId( String value ) { 
		setFieldValue( InstrDTD.CREATORLEARNING_SIF_REFID, new SIFString( value ), value );
	}

}
