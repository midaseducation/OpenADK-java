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
 *  This object describes the federal, state, local and other reimbursement rates for a school.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FoodserviceReimbursementRates extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FoodserviceReimbursementRates() {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEREIMBURSEMENTRATES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies this object.
	 *  @param schoolInfoRefId GUID that identifies the school.
	 *  @param startDate Effective start date for the reimbursement rates
	 *  @param endDate Effective end date for the reimbursement rates
	 *  @param program Refer to 5.1.23 Program.
	 *  @param agencies Reimbursing agency
	 */
	public FoodserviceReimbursementRates( String refId, String schoolInfoRefId, Calendar startDate, Calendar endDate, Program program, Agencies agencies ) {
		super( ADK.getSIFVersion(), FoodDTD.FOODSERVICEREIMBURSEMENTRATES );
		this.setRefId(refId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setProgram(program);
		this.setAgencies(agencies);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.FOODSERVICEREIMBURSEMENTRATES_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this object."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this object."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID that identifies the school."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID that identifies the school."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Effective start date for the reimbursement rates"</i><p>
	 *
	 *  @return The <code>StartDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Effective start date for the reimbursement rates"</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Effective end date for the reimbursement rates"</i><p>
	 *
	 *  @return The <code>EndDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getEndDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_ENDDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Effective end date for the reimbursement rates"</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setEndDate( Calendar value ) { 
		setFieldValue( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_ENDDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Refer to 5.1.23 Program."</i><p>
	 *
	 *  @param value A <code>Program</code> object
	 *  @since 1.5r1
	 */
	public void setProgram( Program value ) { 
		removeChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_PROGRAM );
		addChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_PROGRAM, value);
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
		removeChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_PROGRAM);
		addChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_PROGRAM, new Program( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Program&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Refer to 5.1.23 Program."</i><p>
	 *
	 *  @return A <code>Program</code> object
	 *  @since 1.5r1
	 */
	public Program getProgram() { 
		return (Program)getChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_PROGRAM);
	}

	/**
	 *  Removes the <code>Program</code> child element previously created by calling <code>setProgram</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeProgram() { 
		removeChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_PROGRAM );
	}

	/**
	 *  Sets the value of the <code>&lt;Agencies&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reimbursing agency"</i><p>
	 *
	 *  @param value A <code>Agencies</code> object
	 *  @since 1.5r1
	 */
	public void setAgencies( Agencies value ) { 
		removeChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_AGENCIES );
		addChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_AGENCIES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Agencies&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reimbursing agency"</i><p>
	 *
	 *  @return An <code>Agencies</code> object
	 *  @since 1.5r1
	 */
	public Agencies getAgencies() { 
		return (Agencies)getChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_AGENCIES);
	}

	/**
	 *  Removes the <code>Agencies</code> child element previously created by calling <code>setAgencies</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeAgencies() { 
		removeChild( FoodDTD.FOODSERVICEREIMBURSEMENTRATES_AGENCIES );
	}

}