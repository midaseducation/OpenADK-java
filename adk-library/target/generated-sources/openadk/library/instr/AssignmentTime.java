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
 *  Time structures for the assignment.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class AssignmentTime extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssignmentTime() {
		super( InstrDTD.ASSIGNMENTTIME );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param startDate Date assignment is started.
	 *  @param dueDate Date assignment is due.
	 */
	public AssignmentTime( Calendar startDate, Calendar dueDate ) {
		super( InstrDTD.ASSIGNMENTTIME );
		this.setStartDate(startDate);
		this.setDueDate(dueDate);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( InstrDTD.ASSIGNMENTTIME_STARTDATE ) );
		b.append('.');
		b.append( getFieldValue( InstrDTD.ASSIGNMENTTIME_DUEDATE ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.ASSIGNMENTTIME_STARTDATE, InstrDTD.ASSIGNMENTTIME_DUEDATE };
	}

	/**
	 *  Gets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Creation date of the assignment"</i><p>
	 *
	 *  @return The <code>CreationDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getCreationDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ASSIGNMENTTIME_CREATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Creation date of the assignment"</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setCreationDate( Calendar value ) { 
		setFieldValue( InstrDTD.ASSIGNMENTTIME_CREATIONDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Duration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time required to complete the assignment."</i><p>
	 *
	 *  @param value A <code>TimeDuration</code> object
	 *  @since 1.5r1
	 */
	public void setDuration( TimeDuration value ) { 
		removeChild( InstrDTD.ASSIGNMENTTIME_DURATION );
		addChild( InstrDTD.ASSIGNMENTTIME_DURATION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Duration&gt;</code> child element.
	 *  This form of <code>setDuration</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setDuration</code>
	 *  that accepts a single <code>TimeDuration</code> object.
	 *
	 *  @param units 
	 *  @param value Gets or sets the content value of the &lt;TimeDuration&gt; element
	 *  @since 1.5r1
	 */
	public void setDuration( TimeUnits units, BigDecimal value ) {
		removeChild( InstrDTD.ASSIGNMENTTIME_DURATION);
		addChild( InstrDTD.ASSIGNMENTTIME_DURATION, new TimeDuration( units, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Duration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time required to complete the assignment."</i><p>
	 *
	 *  @return A <code>TimeDuration</code> object
	 *  @since 1.5r1
	 */
	public TimeDuration getDuration() { 
		return (TimeDuration)getChild( InstrDTD.ASSIGNMENTTIME_DURATION);
	}

	/**
	 *  Removes the <code>Duration</code> child element previously created by calling <code>setDuration</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeDuration() { 
		removeChild( InstrDTD.ASSIGNMENTTIME_DURATION );
	}

	/**
	 *  Gets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date assignment is started."</i><p>
	 *
	 *  @return The <code>StartDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ASSIGNMENTTIME_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date assignment is started."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( InstrDTD.ASSIGNMENTTIME_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StartTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time assignment is started."</i><p>
	 *
	 *  @return The <code>StartTime</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartTime() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ASSIGNMENTTIME_STARTTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;StartTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time assignment is started."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartTime( Calendar value ) { 
		setFieldValue( InstrDTD.ASSIGNMENTTIME_STARTTIME, new SIFTime( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;DueDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date assignment is due."</i><p>
	 *
	 *  @return The <code>DueDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getDueDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ASSIGNMENTTIME_DUEDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;DueDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date assignment is due."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setDueDate( Calendar value ) { 
		setFieldValue( InstrDTD.ASSIGNMENTTIME_DUEDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;DueTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time assignment is due."</i><p>
	 *
	 *  @return The <code>DueTime</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getDueTime() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ASSIGNMENTTIME_DUETIME );
	}

	/**
	 *  Sets the value of the <code>&lt;DueTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time assignment is due."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setDueTime( Calendar value ) { 
		setFieldValue( InstrDTD.ASSIGNMENTTIME_DUETIME, new SIFTime( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AdministrationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date that the assignment was administered to student if an assessment."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"AdminDate"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"AdministrationDate"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>AdministrationDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getAdministrationDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.ASSIGNMENTTIME_ADMINISTRATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;AdministrationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date that the assignment was administered to student if an assessment."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"AdminDate"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"AdministrationDate"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setAdministrationDate( Calendar value ) { 
		setFieldValue( InstrDTD.ASSIGNMENTTIME_ADMINISTRATIONDATE, new SIFDate( value ), value );
	}

}