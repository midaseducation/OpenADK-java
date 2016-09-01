// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  An entry for each unique bell period for the bell schedule<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class BellPeriod extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public BellPeriod() {
		super( StudentDTD.BELLPERIOD );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param timetableDayIdentifier The unique identifier for the timetable day used for the bell period (from a TimetableDayList).
	 *  @param timetablePeriodIdentifier The unique identifier for the timetable period used for the bell period (from a TimetablePeriodList).
	 *  @param startTime The starting time for the bell period.
	 *  @param endTime The ending time for the bell period.
	 *  @param regularSchoolPeriod Indicates if the bell period is part of the regular school day (i.e. is not a before or after school or break period).
	 *  @param instructionalMinutes The number of minutes to be counted for instruction for the bell period.
	 *  @param useInAttendanceCalculations Indicates if the bell period should be included in attendance calculations.
	 */
	public BellPeriod( String timetableDayIdentifier, String timetablePeriodIdentifier, Calendar startTime, Calendar endTime, YesNo regularSchoolPeriod, Integer instructionalMinutes, YesNo useInAttendanceCalculations ) {
		super( StudentDTD.BELLPERIOD );
		this.setTimetableDayIdentifier(timetableDayIdentifier);
		this.setTimetablePeriodIdentifier(timetablePeriodIdentifier);
		this.setStartTime(startTime);
		this.setEndTime(endTime);
		this.setRegularSchoolPeriod( regularSchoolPeriod );
		this.setInstructionalMinutes(instructionalMinutes);
		this.setUseInAttendanceCalculations( useInAttendanceCalculations );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( StudentDTD.BELLPERIOD_TIMETABLEDAYIDENTIFIER ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.BELLPERIOD_TIMETABLEPERIODIDENTIFIER ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.BELLPERIOD_STARTTIME ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.BELLPERIOD_ENDTIME ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.BELLPERIOD_REGULARSCHOOLPERIOD ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.BELLPERIOD_INSTRUCTIONALMINUTES ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.BELLPERIOD_USEINATTENDANCECALCULATIONS ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.BELLPERIOD_TIMETABLEDAYIDENTIFIER, StudentDTD.BELLPERIOD_TIMETABLEPERIODIDENTIFIER, StudentDTD.BELLPERIOD_STARTTIME, StudentDTD.BELLPERIOD_ENDTIME, StudentDTD.BELLPERIOD_REGULARSCHOOLPERIOD, StudentDTD.BELLPERIOD_INSTRUCTIONALMINUTES, StudentDTD.BELLPERIOD_USEINATTENDANCECALCULATIONS };
	}

	/**
	 *  Gets the value of the <code>&lt;TimetableDayIdentifier&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The unique identifier for the timetable day used for the bell period (from a TimetableDayList)."</i><p>
	 *
	 *  @return The <code>TimetableDayIdentifier</code> element of this object.
	 *  @since 2.4
	 */
	public String getTimetableDayIdentifier() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.BELLPERIOD_TIMETABLEDAYIDENTIFIER );
	}

	/**
	 *  Sets the value of the <code>&lt;TimetableDayIdentifier&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The unique identifier for the timetable day used for the bell period (from a TimetableDayList)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setTimetableDayIdentifier( String value ) { 
		setFieldValue( StudentDTD.BELLPERIOD_TIMETABLEDAYIDENTIFIER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TimetablePeriodIdentifier&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The unique identifier for the timetable period used for the bell period (from a TimetablePeriodList)."</i><p>
	 *
	 *  @return The <code>TimetablePeriodIdentifier</code> element of this object.
	 *  @since 2.4
	 */
	public String getTimetablePeriodIdentifier() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.BELLPERIOD_TIMETABLEPERIODIDENTIFIER );
	}

	/**
	 *  Sets the value of the <code>&lt;TimetablePeriodIdentifier&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The unique identifier for the timetable period used for the bell period (from a TimetablePeriodList)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setTimetablePeriodIdentifier( String value ) { 
		setFieldValue( StudentDTD.BELLPERIOD_TIMETABLEPERIODIDENTIFIER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StartTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The starting time for the bell period."</i><p>
	 *
	 *  @return The <code>StartTime</code> element of this object.
	 *  @since 2.4
	 */
	public Calendar getStartTime() { 
		return (Calendar) getSIFSimpleFieldValue( StudentDTD.BELLPERIOD_STARTTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;StartTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The starting time for the bell period."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.4
	 */
	public void setStartTime( Calendar value ) { 
		setFieldValue( StudentDTD.BELLPERIOD_STARTTIME, new SIFTime( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;EndTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The ending time for the bell period."</i><p>
	 *
	 *  @return The <code>EndTime</code> element of this object.
	 *  @since 2.4
	 */
	public Calendar getEndTime() { 
		return (Calendar) getSIFSimpleFieldValue( StudentDTD.BELLPERIOD_ENDTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;EndTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The ending time for the bell period."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.4
	 */
	public void setEndTime( Calendar value ) { 
		setFieldValue( StudentDTD.BELLPERIOD_ENDTIME, new SIFTime( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;RegularSchoolPeriod&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if the bell period is part of the regular school day (i.e. is not a before or after school or break period)."</i><p>
	 *
	 *  @return The <code>RegularSchoolPeriod</code> element of this object.
	 *  @since 2.4
	 */
	public String getRegularSchoolPeriod() { 
		return getFieldValue( StudentDTD.BELLPERIOD_REGULARSCHOOLPERIOD );
	}

	/**
	 *  Sets the value of the <code>&lt;RegularSchoolPeriod&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if the bell period is part of the regular school day (i.e. is not a before or after school or break period)."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.4
	 */
	public void setRegularSchoolPeriod( YesNo value ) { 
		setField( StudentDTD.BELLPERIOD_REGULARSCHOOLPERIOD, value );
	}

	/**
	 *  Sets the value of the <code>&lt;RegularSchoolPeriod&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if the bell period is part of the regular school day (i.e. is not a before or after school or break period)."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.4
	 */
	public void setRegularSchoolPeriod( String value ) { 
		setField( StudentDTD.BELLPERIOD_REGULARSCHOOLPERIOD, value );
	}

	/**
	 *  Gets the value of the <code>&lt;InstructionalMinutes&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The number of minutes to be counted for instruction for the bell period."</i><p>
	 *
	 *  @return The <code>InstructionalMinutes</code> element of this object.
	 *  @since 2.4
	 */
	public Integer getInstructionalMinutes() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.BELLPERIOD_INSTRUCTIONALMINUTES );
	}

	/**
	 *  Sets the value of the <code>&lt;InstructionalMinutes&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The number of minutes to be counted for instruction for the bell period."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.4
	 */
	public void setInstructionalMinutes( Integer value ) { 
		setFieldValue( StudentDTD.BELLPERIOD_INSTRUCTIONALMINUTES, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;UseInAttendanceCalculations&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if the bell period should be included in attendance calculations."</i><p>
	 *
	 *  @return The <code>UseInAttendanceCalculations</code> element of this object.
	 *  @since 2.4
	 */
	public String getUseInAttendanceCalculations() { 
		return getFieldValue( StudentDTD.BELLPERIOD_USEINATTENDANCECALCULATIONS );
	}

	/**
	 *  Sets the value of the <code>&lt;UseInAttendanceCalculations&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if the bell period should be included in attendance calculations."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.4
	 */
	public void setUseInAttendanceCalculations( YesNo value ) { 
		setField( StudentDTD.BELLPERIOD_USEINATTENDANCECALCULATIONS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;UseInAttendanceCalculations&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if the bell period should be included in attendance calculations."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.4
	 */
	public void setUseInAttendanceCalculations( String value ) { 
		setField( StudentDTD.BELLPERIOD_USEINATTENDANCECALCULATIONS, value );
	}

}