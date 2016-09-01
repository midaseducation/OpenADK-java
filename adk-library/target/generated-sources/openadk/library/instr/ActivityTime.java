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
 *  Time structures for the activity.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ActivityTime extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ActivityTime() {
		super( InstrDTD.ACTIVITYTIME );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param creationDate Creation date of the activity.
	 */
	public ActivityTime( Calendar creationDate ) {
		super( InstrDTD.ACTIVITYTIME );
		this.setCreationDate(creationDate);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.ACTIVITYTIME_CREATIONDATE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.ACTIVITYTIME_CREATIONDATE };
	}

	/**
	 *  Gets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Creation date of the activity."</i><p>
	 *
	 *  @return The <code>CreationDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getCreationDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ACTIVITYTIME_CREATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Creation date of the activity."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setCreationDate( Calendar value ) { 
		setFieldValue( InstrDTD.ACTIVITYTIME_CREATIONDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Duration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time required to complete the activity."</i><p>
	 *
	 *  @param value A <code>Duration</code> object
	 *  @since 1.5r1
	 */
	public void setDuration( Duration value ) { 
		removeChild( InstrDTD.ACTIVITYTIME_DURATION );
		addChild( InstrDTD.ACTIVITYTIME_DURATION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Duration&gt;</code> child element.
	 *  This form of <code>setDuration</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setDuration</code>
	 *  that accepts a single <code>Duration</code> object.
	 *
	 *  @param units Unit of time of the Duration value.
	 *  @param value Gets or sets the content value of the &lt;Duration&gt; element
	 *  @since 1.5r1
	 */
	public void setDuration( DurationUnits units, String value ) {
		removeChild( InstrDTD.ACTIVITYTIME_DURATION);
		addChild( InstrDTD.ACTIVITYTIME_DURATION, new Duration( units, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Duration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time required to complete the activity."</i><p>
	 *
	 *  @return A <code>Duration</code> object
	 *  @since 1.5r1
	 */
	public Duration getDuration() { 
		return (Duration)getChild( InstrDTD.ACTIVITYTIME_DURATION);
	}

	/**
	 *  Removes the <code>Duration</code> child element previously created by calling <code>setDuration</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeDuration() { 
		removeChild( InstrDTD.ACTIVITYTIME_DURATION );
	}

	/**
	 *  Gets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date activity is started."</i><p>
	 *
	 *  @return The <code>StartDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ACTIVITYTIME_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date activity is started."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( InstrDTD.ACTIVITYTIME_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FinishDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date activity is finished."</i><p>
	 *
	 *  @return The <code>FinishDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getFinishDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ACTIVITYTIME_FINISHDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;FinishDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date activity is finished."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setFinishDate( Calendar value ) { 
		setFieldValue( InstrDTD.ACTIVITYTIME_FINISHDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;DueDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date activity is due."</i><p>
	 *
	 *  @return The <code>DueDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getDueDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ACTIVITYTIME_DUEDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;DueDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date activity is due."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setDueDate( Calendar value ) { 
		setFieldValue( InstrDTD.ACTIVITYTIME_DUEDATE, new SIFDate( value ), value );
	}

}
