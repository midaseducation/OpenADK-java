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
 *  This object is a site's meal prices for each grade program, meal status, meal type and grade level.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FoodserviceMealPrices extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FoodserviceMealPrices() {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEMEALPRICES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies this meal price.
	 *  @param schoolInfoRefId GUID that identifies the school this meal price belongs to
	 *  @param program Refer to section 5.1.23 Program.
	 *  @param prices Price of the meal
	 */
	public FoodserviceMealPrices( String refId, String schoolInfoRefId, Program program, Prices prices ) {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEMEALPRICES );
		this.setRefId(refId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setProgram(program);
		this.setPrices(prices);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.FOODSERVICEMEALPRICES_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.FOODSERVICEMEALPRICES_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this meal price."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEMEALPRICES_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this meal price."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEMEALPRICES_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID that identifies the school this meal price belongs to"</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEMEALPRICES_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID that identifies the school this meal price belongs to"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEMEALPRICES_SCHOOLINFOREFID, new SIFString( value ), value );
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
		removeChild( FoodDTD.FOODSERVICEMEALPRICES_PROGRAM );
		addChild( FoodDTD.FOODSERVICEMEALPRICES_PROGRAM, value);
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
		removeChild( FoodDTD.FOODSERVICEMEALPRICES_PROGRAM);
		addChild( FoodDTD.FOODSERVICEMEALPRICES_PROGRAM, new Program( type, value ) );
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
		return (Program)getChild( FoodDTD.FOODSERVICEMEALPRICES_PROGRAM);
	}

	/**
	 *  Removes the <code>Program</code> child element previously created by calling <code>setProgram</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeProgram() { 
		removeChild( FoodDTD.FOODSERVICEMEALPRICES_PROGRAM );
	}

	/**
	 *  Sets the value of the <code>&lt;Prices&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Price of the meal"</i><p>
	 *
	 *  @param value A <code>Prices</code> object
	 *  @since 1.5r1
	 */
	public void setPrices( Prices value ) { 
		removeChild( FoodDTD.FOODSERVICEMEALPRICES_PRICES );
		addChild( FoodDTD.FOODSERVICEMEALPRICES_PRICES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Prices&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Price of the meal"</i><p>
	 *
	 *  @return A <code>Prices</code> object
	 *  @since 1.5r1
	 */
	public Prices getPrices() { 
		return (Prices)getChild( FoodDTD.FOODSERVICEMEALPRICES_PRICES);
	}

	/**
	 *  Removes the <code>Prices</code> child element previously created by calling <code>setPrices</code>
	 *
	 *  @since 1.5r1
	 */
	public void removePrices() { 
		removeChild( FoodDTD.FOODSERVICEMEALPRICES_PRICES );
	}

}
