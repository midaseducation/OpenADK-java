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
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class FoodserviceMilkSales extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FoodserviceMilkSales() {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEMILKSALES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies the daily milk sales object
	 *  @param schoolInfoRefId School for which the sales object applies
	 *  @param date Date on which the sales occurred.
	 *  @param program 
	 *  @param saleQuantities 
	 */
	public FoodserviceMilkSales( String refId, String schoolInfoRefId, Calendar date, Program program, SaleQuantities saleQuantities ) {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEMILKSALES );
		this.setRefId(refId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setDate(date);
		this.setProgram(program);
		this.setSaleQuantities(saleQuantities);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.FOODSERVICEMILKSALES_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.FOODSERVICEMILKSALES_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies the daily milk sales object"</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEMILKSALES_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies the daily milk sales object"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEMILKSALES_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"School for which the sales object applies"</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEMILKSALES_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"School for which the sales object applies"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEMILKSALES_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Date&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which the sales occurred."</i><p>
	 *
	 *  @return The <code>Date</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEMILKSALES_DATE );
	}

	/**
	 *  Sets the value of the <code>&lt;Date&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which the sales occurred."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setDate( Calendar value ) { 
		setFieldValue( FoodDTD.FOODSERVICEMILKSALES_DATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> element.
	 *
	 *  @param value A <code>Program</code> object
	 *  @since 2.0
	 */
	public void setProgram( Program value ) { 
		removeChild( FoodDTD.FOODSERVICEMILKSALES_PROGRAM );
		addChild( FoodDTD.FOODSERVICEMILKSALES_PROGRAM, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> child element.
	 *  This form of <code>setProgram</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setProgram</code>
	 *  that accepts a single <code>Program</code> object.
	 *
	 *  @param type The type of the program. Type identifies the list of values.
	 *  @param value Gets or sets the content value of the &lt;Program&gt; element
	 *  @since 2.0
	 */
	public void setProgram( FinancialProgram type, String value ) {
		removeChild( FoodDTD.FOODSERVICEMILKSALES_PROGRAM);
		addChild( FoodDTD.FOODSERVICEMILKSALES_PROGRAM, new Program( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Program&gt;</code> element.
	 *
	 *  @return A <code>Program</code> object
	 *  @since 2.0
	 */
	public Program getProgram() { 
		return (Program)getChild( FoodDTD.FOODSERVICEMILKSALES_PROGRAM);
	}

	/**
	 *  Removes the <code>Program</code> child element previously created by calling <code>setProgram</code>
	 *
	 *  @since 2.0
	 */
	public void removeProgram() { 
		removeChild( FoodDTD.FOODSERVICEMILKSALES_PROGRAM );
	}

	/**
	 *  Sets the value of the <code>&lt;SaleQuantities&gt;</code> element.
	 *
	 *  @param value A <code>SaleQuantities</code> object
	 *  @since 2.0
	 */
	public void setSaleQuantities( SaleQuantities value ) { 
		removeChild( FoodDTD.FOODSERVICEMILKSALES_SALEQUANTITIES );
		addChild( FoodDTD.FOODSERVICEMILKSALES_SALEQUANTITIES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SaleQuantities&gt;</code> element.
	 *
	 *  @return A <code>SaleQuantities</code> object
	 *  @since 2.0
	 */
	public SaleQuantities getSaleQuantities() { 
		return (SaleQuantities)getChild( FoodDTD.FOODSERVICEMILKSALES_SALEQUANTITIES);
	}

	/**
	 *  Removes the <code>SaleQuantities</code> child element previously created by calling <code>setSaleQuantities</code>
	 *
	 *  @since 2.0
	 */
	public void removeSaleQuantities() { 
		removeChild( FoodDTD.FOODSERVICEMILKSALES_SALEQUANTITIES );
	}

}
