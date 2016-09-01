// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.food;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  This object gives the sales details for the items sold for a specified date.   SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FoodserviceItemSales extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FoodserviceItemSales() {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEITEMSALES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies this object
	 *  @param schoolInfoRefId GUID that identifies the school for this object
	 *  @param date Date of sales
	 *  @param program Refer to section 5.1.23 Program.
	 */
	public FoodserviceItemSales( String refId, String schoolInfoRefId, Calendar date, Program program ) {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEITEMSALES );
		this.setRefId(refId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setDate(date);
		this.setProgram(program);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.FOODSERVICEITEMSALES_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.FOODSERVICEITEMSALES_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this object"</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEITEMSALES_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this object"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEITEMSALES_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID that identifies the school for this object"</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEITEMSALES_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID that identifies the school for this object"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEITEMSALES_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Date&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date of sales"</i><p>
	 *
	 *  @return The <code>Date</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEITEMSALES_DATE );
	}

	/**
	 *  Sets the value of the <code>&lt;Date&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date of sales"</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setDate( Calendar value ) { 
		setFieldValue( FoodDTD.FOODSERVICEITEMSALES_DATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Refer to section 5.1.23 Program."</i><p>
	 *
	 *  @param value A <code>Program</code> object
	 *  @since 1.5r1
	 */
	public void setProgram( Program value ) { 
		removeChild( FoodDTD.FOODSERVICEITEMSALES_PROGRAM );
		addChild( FoodDTD.FOODSERVICEITEMSALES_PROGRAM, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> child element.
	 *  This form of <code>setProgram</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setProgram</code>
	 *  that accepts a single <code>Program</code> object.
	 *
	 *  @param type The type of the program. Type identifies the list of values.
	 *  @param value Gets or sets the content value of the &lt;Program&gt; element
	 *  @since 1.5r1
	 */
	public void setProgram( FinancialProgram type, String value ) {
		removeChild( FoodDTD.FOODSERVICEITEMSALES_PROGRAM);
		addChild( FoodDTD.FOODSERVICEITEMSALES_PROGRAM, new Program( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Program&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Refer to section 5.1.23 Program."</i><p>
	 *
	 *  @return A <code>Program</code> object
	 *  @since 1.5r1
	 */
	public Program getProgram() { 
		return (Program)getChild( FoodDTD.FOODSERVICEITEMSALES_PROGRAM);
	}

	/**
	 *  Removes the <code>Program</code> child element previously created by calling <code>setProgram</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeProgram() { 
		removeChild( FoodDTD.FOODSERVICEITEMSALES_PROGRAM );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemQuantities&gt;</code> element.
	 *
	 *  @param value A <code>ItemQuantities</code> object
	 *  @since 1.5r1
	 */
	public void setItemQuantities( ItemQuantities value ) { 
		removeChild( FoodDTD.FOODSERVICEITEMSALES_ITEMQUANTITIES );
		addChild( FoodDTD.FOODSERVICEITEMSALES_ITEMQUANTITIES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ItemQuantities&gt;</code> element.
	 *
	 *  @return An <code>ItemQuantities</code> object
	 *  @since 1.5r1
	 */
	public ItemQuantities getItemQuantities() { 
		return (ItemQuantities)getChild( FoodDTD.FOODSERVICEITEMSALES_ITEMQUANTITIES);
	}

	/**
	 *  Removes the <code>ItemQuantities</code> child element previously created by calling <code>setItemQuantities</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeItemQuantities() { 
		removeChild( FoodDTD.FOODSERVICEITEMSALES_ITEMQUANTITIES );
	}

}
