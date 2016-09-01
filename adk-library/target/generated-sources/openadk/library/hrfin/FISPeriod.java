// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.hrfin;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Period of the income statement.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FISPeriod extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FISPeriod() {
		super( HrfinDTD.FISPERIOD );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param startDate Start date.
	 *  @param endDate End date.
	 *  @param value Gets or sets the content value of the &lt;FISPeriod&gt; element
	 */
	public FISPeriod( Calendar startDate, Calendar endDate, String value ) {
		super( HrfinDTD.FISPERIOD );
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( HrfinDTD.FISPERIOD_STARTDATE ) );
		b.append('.');
		b.append( getFieldValue( HrfinDTD.FISPERIOD_ENDDATE ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { HrfinDTD.FISPERIOD_STARTDATE, HrfinDTD.FISPERIOD_ENDDATE };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;FISPeriod&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FISPERIOD );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;FISPeriod&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setValue( String value ) { 
		setFieldValue( HrfinDTD.FISPERIOD, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StartDate</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Start date."</i><p>
	 *
	 *  @return The <code>StartDate</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FISPERIOD_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>StartDate</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Start date."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( HrfinDTD.FISPERIOD_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>EndDate</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"End date."</i><p>
	 *
	 *  @return The <code>EndDate</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public Calendar getEndDate() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FISPERIOD_ENDDATE );
	}

	/**
	 *  Sets the value of the <code>EndDate</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"End date."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setEndDate( Calendar value ) { 
		setFieldValue( HrfinDTD.FISPERIOD_ENDDATE, new SIFDate( value ), value );
	}

}