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
 *  The name of a person<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class Name extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Name() {
		super( CommonDTD.NAME );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type Code that specifies what type of name this is.  If unsure, use 04.
	 *  @param lastName The last name.
	 *  @param firstName The first name.
	 */
	public Name( NameType type, String lastName, String firstName ) {
		super( CommonDTD.NAME );
		this.setType( type );
		this.setLastName(lastName);
		this.setFirstName(firstName);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( CommonDTD.NAME_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { CommonDTD.NAME_TYPE };
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code that specifies what type of name this is.  If unsure, use 04."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getType() { 
		return getFieldValue( CommonDTD.NAME_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code that specifies what type of name this is.  If unsure, use 04."</i><p>
	 *
	 *  @param value A constant defined by the <code>NameType</code> class
	 *  @since 1.1
	 */
	public void setType( NameType value ) { 
		setField( CommonDTD.NAME_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Code that specifies what type of name this is.  If unsure, use 04."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setType( String value ) { 
		setField( CommonDTD.NAME_TYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Prefix&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A prefix associated with the name like Mr., Ms., etc."</i><p>
	 *
	 *  @return The <code>Prefix</code> element of this object.
	 *  @since 1.1
	 */
	public String getPrefix() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_PREFIX );
	}

	/**
	 *  Sets the value of the <code>&lt;Prefix&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A prefix associated with the name like Mr., Ms., etc."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setPrefix( String value ) { 
		setFieldValue( CommonDTD.NAME_PREFIX, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SIF_Action</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"In a Change event, this flag can be used to indicate an element has been deleted from the parent list container. At a minimum the key for the list must also be present."</i><p>
	 *
	 *  @return The <code>SIF_Action</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSIF_Action() { 
		return getFieldValue( CommonDTD.NAME_SIF_ACTION );
	}

	/**
	 *  Sets the value of the <code>SIF_Action</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"In a Change event, this flag can be used to indicate an element has been deleted from the parent list container. At a minimum the key for the list must also be present."</i><p>
	 *
	 *  @param value A constant defined by the <code>SIFActionType</code> class
	 *  @since 2.0
	 */
	public void setSIF_Action( SIFActionType value ) { 
		setField( CommonDTD.NAME_SIF_ACTION, value );
	}

	/**
	 *  Sets the value of the <code>SIF_Action</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"In a Change event, this flag can be used to indicate an element has been deleted from the parent list container. At a minimum the key for the list must also be present."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setSIF_Action( String value ) { 
		setField( CommonDTD.NAME_SIF_ACTION, value );
	}

	/**
	 *  Gets the value of the <code>&lt;LastName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The last name."</i><p>
	 *
	 *  @return The <code>LastName</code> element of this object.
	 *  @since 1.1
	 */
	public String getLastName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_LASTNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;LastName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The last name."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setLastName( String value ) { 
		setFieldValue( CommonDTD.NAME_LASTNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FirstName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The first name."</i><p>
	 *
	 *  @return The <code>FirstName</code> element of this object.
	 *  @since 1.1
	 */
	public String getFirstName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_FIRSTNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;FirstName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The first name."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setFirstName( String value ) { 
		setFieldValue( CommonDTD.NAME_FIRSTNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;MiddleName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The middle name or initial."</i><p>
	 *
	 *  @return The <code>MiddleName</code> element of this object.
	 *  @since 1.1
	 */
	public String getMiddleName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_MIDDLENAME );
	}

	/**
	 *  Sets the value of the <code>&lt;MiddleName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The middle name or initial."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setMiddleName( String value ) { 
		setFieldValue( CommonDTD.NAME_MIDDLENAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Suffix&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Generation of suffix like II, Jr., etc."</i><p>
	 *
	 *  @return The <code>Suffix</code> element of this object.
	 *  @since 1.1
	 */
	public String getSuffix() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_SUFFIX );
	}

	/**
	 *  Sets the value of the <code>&lt;Suffix&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Generation of suffix like II, Jr., etc."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSuffix( String value ) { 
		setFieldValue( CommonDTD.NAME_SUFFIX, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;PreferredName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is a name that the person prefers to be called by."</i><p>
	 *
	 *  @return The <code>PreferredName</code> element of this object.
	 *  @since 1.1
	 */
	public String getPreferredName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_PREFERREDNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;PreferredName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is a name that the person prefers to be called by."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setPreferredName( String value ) { 
		setFieldValue( CommonDTD.NAME_PREFERREDNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SortName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the name to be used for sorting purposes."</i><p>
	 *
	 *  @return The <code>SortName</code> element of this object.
	 *  @since 1.1
	 */
	public String getSortName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_SORTNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;SortName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the name to be used for sorting purposes."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSortName( String value ) { 
		setFieldValue( CommonDTD.NAME_SORTNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FullName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A free text field for the complete name."</i><p>
	 *
	 *  @return The <code>FullName</code> element of this object.
	 *  @since 1.1
	 */
	public String getFullName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAME_FULLNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;FullName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A free text field for the complete name."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setFullName( String value ) { 
		setFieldValue( CommonDTD.NAME_FULLNAME, new SIFString( value ), value );
	}

}
