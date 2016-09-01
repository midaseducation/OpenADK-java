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
 *  This object communicates the current meal status and account status of a given staff member. This object indicates whether the staff member is entitled to earn meals. This object will respond to a change event and propagate the new information to subscribing agents.  SIF_Events, typically Change events, can be reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class StaffMeal extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StaffMeal() {
		super( ADK.getSIFVersion(), FoodDTD.STAFFMEAL );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId Key
	 *  @param staffPersonalRefId The GUID of the staff to whom this object is linked.
	 *  @param earnedStatus This gives information about a staff member's meal status.
	 *  @param lastBreakfastDate Last breakfast served date
	 *  @param lastLunchDate Last lunch served date
	 */
	public StaffMeal( String refId, String staffPersonalRefId, EarnedStatus earnedStatus, Calendar lastBreakfastDate, Calendar lastLunchDate ) {
		super( ADK.getSIFVersion(), FoodDTD.STAFFMEAL );
		this.setRefId(refId);
		this.setStaffPersonalRefId(staffPersonalRefId);
		this.setEarnedStatus(earnedStatus);
		this.setLastBreakfastDate(lastBreakfastDate);
		this.setLastLunchDate(lastLunchDate);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.STAFFMEAL_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.STAFFMEAL_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Key"</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.7
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.STAFFMEAL_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Key"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.7
	 */
	public void setRefId( String value ) { 
		setFieldValue( FoodDTD.STAFFMEAL_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StaffPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the staff to whom this object is linked."</i><p>
	 *
	 *  @return The <code>StaffPersonalRefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getStaffPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.STAFFMEAL_STAFFPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StaffPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the staff to whom this object is linked."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStaffPersonalRefId( String value ) { 
		setFieldValue( FoodDTD.STAFFMEAL_STAFFPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;EarnedStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This gives information about a staff member's meal status."</i><p>
	 *
	 *  @param value A <code>EarnedStatus</code> object
	 *  @since 1.5r1
	 */
	public void setEarnedStatus( EarnedStatus value ) { 
		removeChild( FoodDTD.STAFFMEAL_EARNEDSTATUS );
		addChild( FoodDTD.STAFFMEAL_EARNEDSTATUS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;EarnedStatus&gt;</code> child element.
	 *  This form of <code>setEarnedStatus</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setEarnedStatus</code>
	 *  that accepts a single <code>EarnedStatus</code> object.
	 *
	 *  @param type Earned status type.
	 *  @since 1.5r1
	 */
	public void setEarnedStatus( YesNoNA type ) {
		removeChild( FoodDTD.STAFFMEAL_EARNEDSTATUS);
		addChild( FoodDTD.STAFFMEAL_EARNEDSTATUS, new EarnedStatus( type ) );
	}

	/**
	 *  Gets the value of the <code>&lt;EarnedStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This gives information about a staff member's meal status."</i><p>
	 *
	 *  @return An <code>EarnedStatus</code> object
	 *  @since 1.5r1
	 */
	public EarnedStatus getEarnedStatus() { 
		return (EarnedStatus)getChild( FoodDTD.STAFFMEAL_EARNEDSTATUS);
	}

	/**
	 *  Removes the <code>EarnedStatus</code> child element previously created by calling <code>setEarnedStatus</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeEarnedStatus() { 
		removeChild( FoodDTD.STAFFMEAL_EARNEDSTATUS );
	}

	/**
	 *  Gets the value of the <code>&lt;LastBreakfastDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Last breakfast served date"</i><p>
	 *
	 *  @return The <code>LastBreakfastDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getLastBreakfastDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.STAFFMEAL_LASTBREAKFASTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;LastBreakfastDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Last breakfast served date"</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setLastBreakfastDate( Calendar value ) { 
		setFieldValue( FoodDTD.STAFFMEAL_LASTBREAKFASTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;LastLunchDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Last lunch served date"</i><p>
	 *
	 *  @return The <code>LastLunchDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getLastLunchDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.STAFFMEAL_LASTLUNCHDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;LastLunchDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Last lunch served date"</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setLastLunchDate( Calendar value ) { 
		setFieldValue( FoodDTD.STAFFMEAL_LASTLUNCHDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Amounts&gt;</code> element.
	 *
	 *  @param value A <code>FSAmounts</code> object
	 *  @since 1.5r1
	 */
	public void setAmounts( FSAmounts value ) { 
		removeChild( FoodDTD.STAFFMEAL_AMOUNTS );
		addChild( FoodDTD.STAFFMEAL_AMOUNTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Amounts&gt;</code> element.
	 *
	 *  @return A <code>FSAmounts</code> object
	 *  @since 1.5r1
	 */
	public FSAmounts getAmounts() { 
		return (FSAmounts)getChild( FoodDTD.STAFFMEAL_AMOUNTS);
	}

	/**
	 *  Removes the <code>Amounts</code> child element previously created by calling <code>setAmounts</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeAmounts() { 
		removeChild( FoodDTD.STAFFMEAL_AMOUNTS );
	}

}