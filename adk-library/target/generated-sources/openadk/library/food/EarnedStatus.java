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
 *  This gives information about a staff member's meal status.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class EarnedStatus extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EarnedStatus() {
		super( FoodDTD.EARNEDSTATUS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type Earned status type.
	 */
	public EarnedStatus( YesNoNA type ) {
		super( FoodDTD.EARNEDSTATUS );
		this.setType( type );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.EARNEDSTATUS_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.EARNEDSTATUS_TYPE };
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Earned status type."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getType() { 
		return getFieldValue( FoodDTD.EARNEDSTATUS_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Earned status type."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNoNA</code> class
	 *  @since 1.5r1
	 */
	public void setType( YesNoNA value ) { 
		setField( FoodDTD.EARNEDSTATUS_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Earned status type."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setType( String value ) { 
		setField( FoodDTD.EARNEDSTATUS_TYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which earned status became effective (inclusive)."</i><p>
	 *
	 *  @return The <code>StartDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.EARNEDSTATUS_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which earned status became effective (inclusive)."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( FoodDTD.EARNEDSTATUS_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which earned status was last in effect. This attribute is conditional upon the StartDate element. It exists only if the StartDate element exists."</i><p>
	 *
	 *  @return The <code>EndDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getEndDate() { 
		return (Calendar) getSIFSimpleFieldValue( FoodDTD.EARNEDSTATUS_ENDDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which earned status was last in effect. This attribute is conditional upon the StartDate element. It exists only if the StartDate element exists."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setEndDate( Calendar value ) { 
		setFieldValue( FoodDTD.EARNEDSTATUS_ENDDATE, new SIFDate( value ), value );
	}

}