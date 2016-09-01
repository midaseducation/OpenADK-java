// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.library;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class HoldInfo extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public HoldInfo() {
		super( LibraryDTD.HOLDINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type The type of hold being referenced.
	 *  @param datePlaced The date that the patron placed the hold.
	 */
	public HoldInfo( HoldStatus type, Calendar datePlaced ) {
		super( LibraryDTD.HOLDINFO );
		this.setType( type );
		this.setDatePlaced(datePlaced);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( LibraryDTD.HOLDINFO_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { LibraryDTD.HOLDINFO_TYPE };
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of hold being referenced."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getType() { 
		return getFieldValue( LibraryDTD.HOLDINFO_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of hold being referenced."</i><p>
	 *
	 *  @param value A constant defined by the <code>HoldStatus</code> class
	 *  @since 1.1
	 */
	public void setType( HoldStatus value ) { 
		setField( LibraryDTD.HOLDINFO_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of hold being referenced."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setType( String value ) { 
		setField( LibraryDTD.HOLDINFO_TYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;DatePlaced&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that the patron placed the hold."</i><p>
	 *
	 *  @return The <code>DatePlaced</code> element of this object.
	 *  @since 1.1
	 */
	public Calendar getDatePlaced() { 
		return (Calendar) getSIFSimpleFieldValue( LibraryDTD.HOLDINFO_DATEPLACED );
	}

	/**
	 *  Sets the value of the <code>&lt;DatePlaced&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that the patron placed the hold."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.1
	 */
	public void setDatePlaced( Calendar value ) { 
		setFieldValue( LibraryDTD.HOLDINFO_DATEPLACED, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;DateNeeded&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that the patron needs this item by."</i><p>
	 *
	 *  @return The <code>DateNeeded</code> element of this object.
	 *  @since 1.1
	 */
	public Calendar getDateNeeded() { 
		return (Calendar) getSIFSimpleFieldValue( LibraryDTD.HOLDINFO_DATENEEDED );
	}

	/**
	 *  Sets the value of the <code>&lt;DateNeeded&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that the patron needs this item by."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.1
	 */
	public void setDateNeeded( Calendar value ) { 
		setFieldValue( LibraryDTD.HOLDINFO_DATENEEDED, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;MadeAvailable&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that this item became available for the patron to pick up."</i><p>
	 *
	 *  @return The <code>MadeAvailable</code> element of this object.
	 *  @since 1.1
	 */
	public Calendar getMadeAvailable() { 
		return (Calendar) getSIFSimpleFieldValue( LibraryDTD.HOLDINFO_MADEAVAILABLE );
	}

	/**
	 *  Sets the value of the <code>&lt;MadeAvailable&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that this item became available for the patron to pick up."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.1
	 */
	public void setMadeAvailable( Calendar value ) { 
		setFieldValue( LibraryDTD.HOLDINFO_MADEAVAILABLE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Expires&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date when this ready hold will expire freeing the item to be assigned to another patron."</i><p>
	 *
	 *  @return The <code>Expires</code> element of this object.
	 *  @since 1.1
	 */
	public Calendar getExpires() { 
		return (Calendar) getSIFSimpleFieldValue( LibraryDTD.HOLDINFO_EXPIRES );
	}

	/**
	 *  Sets the value of the <code>&lt;Expires&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date when this ready hold will expire freeing the item to be assigned to another patron."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.1
	 */
	public void setExpires( Calendar value ) { 
		setFieldValue( LibraryDTD.HOLDINFO_EXPIRES, new SIFDate( value ), value );
	}

}