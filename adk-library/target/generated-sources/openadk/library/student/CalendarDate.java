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
 *  This object defines information related to a school calendar day in a given school calendar year. If both CalendarDate and CalendarSummary objects are supported, there must be an instance of this object for each date between CalendarSummary StartDate and EndDate, inclusive.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class CalendarDate extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CalendarDate() {
		super( ADK.getSIFVersion(), StudentDTD.CALENDARDATE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param date A specific school day that occurs within the school year.
	 *  @param calendarSummaryRefId The ID (GUID) of the calendar summary in which this calendar date is.
	 *  @param schoolInfoRefId The ID (GUID) of the school for which this calendar information is being reported.
	 *  @param schoolYear School year for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g., "2007" for the 2006-07 school year).
	 *  @param calendarDateType 
	 */
	public CalendarDate( Calendar date, String calendarSummaryRefId, String schoolInfoRefId, Integer schoolYear, CalendarDateType calendarDateType ) {
		super( ADK.getSIFVersion(), StudentDTD.CALENDARDATE );
		this.setDate(date);
		this.setCalendarSummaryRefId(calendarSummaryRefId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setSchoolYear(schoolYear);
		this.setCalendarDateType(calendarDateType);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( StudentDTD.CALENDARDATE_DATE ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.CALENDARDATE_CALENDARSUMMARYREFID ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.CALENDARDATE_SCHOOLINFOREFID ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.CALENDARDATE_SCHOOLYEAR ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.CALENDARDATE_DATE, StudentDTD.CALENDARDATE_CALENDARSUMMARYREFID, StudentDTD.CALENDARDATE_SCHOOLINFOREFID, StudentDTD.CALENDARDATE_SCHOOLYEAR };
	}

	/**
	 *  Gets the value of the <code>Date</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"A specific school day that occurs within the school year."</i><p>
	 *
	 *  @return The <code>Date</code> attribute of this object.
	 *  @since 2.0
	 */
	public Calendar getDate() { 
		return (Calendar) getSIFSimpleFieldValue( StudentDTD.CALENDARDATE_DATE );
	}

	/**
	 *  Sets the value of the <code>Date</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"A specific school day that occurs within the school year."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setDate( Calendar value ) { 
		setFieldValue( StudentDTD.CALENDARDATE_DATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>CalendarSummaryRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the calendar summary in which this calendar date is."</i><p>
	 *
	 *  @return The <code>CalendarSummaryRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getCalendarSummaryRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.CALENDARDATE_CALENDARSUMMARYREFID );
	}

	/**
	 *  Sets the value of the <code>CalendarSummaryRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the calendar summary in which this calendar date is."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setCalendarSummaryRefId( String value ) { 
		setFieldValue( StudentDTD.CALENDARDATE_CALENDARSUMMARYREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the school for which this calendar information is being reported."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.CALENDARDATE_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the school for which this calendar information is being reported."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( StudentDTD.CALENDARDATE_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g., "2007" for the 2006-07 school year)."</i><p>
	 *
	 *  @return The <code>SchoolYear</code> attribute of this object.
	 *  @since 2.0
	 */
	public Integer getSchoolYear() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.CALENDARDATE_SCHOOLYEAR );
	}

	/**
	 *  Sets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g., "2007" for the 2006-07 school year)."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setSchoolYear( Integer value ) { 
		setFieldValue( StudentDTD.CALENDARDATE_SCHOOLYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;CalendarDateType&gt;</code> element.
	 *
	 *  @param value A <code>CalendarDateType</code> object
	 *  @since 2.0
	 */
	public void setCalendarDateType( CalendarDateType value ) { 
		removeChild( StudentDTD.CALENDARDATE_CALENDARDATETYPE );
		addChild( StudentDTD.CALENDARDATE_CALENDARDATETYPE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;CalendarDateType&gt;</code> child element.
	 *  This form of <code>setCalendarDateType</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setCalendarDateType</code>
	 *  that accepts a single <code>CalendarDateType</code> object.
	 *
	 *  @param refId Key
	 *  @since 2.0
	 */
	public void setCalendarDateType( String refId ) {
		removeChild( StudentDTD.CALENDARDATE_CALENDARDATETYPE);
		addChild( StudentDTD.CALENDARDATE_CALENDARDATETYPE, new CalendarDateType( refId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;CalendarDateType&gt;</code> element.
	 *
	 *  @return A <code>CalendarDateType</code> object
	 *  @since 2.0
	 */
	public CalendarDateType getCalendarDateType() { 
		return (CalendarDateType)getChild( StudentDTD.CALENDARDATE_CALENDARDATETYPE);
	}

	/**
	 *  Removes the <code>CalendarDateType</code> child element previously created by calling <code>setCalendarDateType</code>
	 *
	 *  @since 2.0
	 */
	public void removeCalendarDateType() { 
		removeChild( StudentDTD.CALENDARDATE_CALENDARDATETYPE );
	}

	/**
	 *  Gets the value of the <code>&lt;CalendarDateNumber&gt;</code> element.
	 *
	 *  @return The <code>CalendarDateNumber</code> element of this object.
	 *  @since 2.0
	 */
	public Integer getCalendarDateNumber() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.CALENDARDATE_CALENDARDATENUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;CalendarDateNumber&gt;</code> element.
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setCalendarDateNumber( Integer value ) { 
		setFieldValue( StudentDTD.CALENDARDATE_CALENDARDATENUMBER, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentAttendance&gt;</code> element.
	 *
	 *  @param value A <code>StudentAttendance</code> object
	 *  @since 2.0
	 */
	public void setStudentAttendance( StudentAttendance value ) { 
		removeChild( StudentDTD.CALENDARDATE_STUDENTATTENDANCE );
		addChild( StudentDTD.CALENDARDATE_STUDENTATTENDANCE, value);
	}

	/**
	 *  Gets the value of the <code>&lt;StudentAttendance&gt;</code> element.
	 *
	 *  @return A <code>StudentAttendance</code> object
	 *  @since 2.0
	 */
	public StudentAttendance getStudentAttendance() { 
		return (StudentAttendance)getChild( StudentDTD.CALENDARDATE_STUDENTATTENDANCE);
	}

	/**
	 *  Removes the <code>StudentAttendance</code> child element previously created by calling <code>setStudentAttendance</code>
	 *
	 *  @since 2.0
	 */
	public void removeStudentAttendance() { 
		removeChild( StudentDTD.CALENDARDATE_STUDENTATTENDANCE );
	}

	/**
	 *  Sets the value of the <code>&lt;TeacherAttendance&gt;</code> element.
	 *
	 *  @param value A <code>TeacherAttendance</code> object
	 *  @since 2.0
	 */
	public void setTeacherAttendance( TeacherAttendance value ) { 
		removeChild( StudentDTD.CALENDARDATE_TEACHERATTENDANCE );
		addChild( StudentDTD.CALENDARDATE_TEACHERATTENDANCE, value);
	}

	/**
	 *  Gets the value of the <code>&lt;TeacherAttendance&gt;</code> element.
	 *
	 *  @return A <code>TeacherAttendance</code> object
	 *  @since 2.0
	 */
	public TeacherAttendance getTeacherAttendance() { 
		return (TeacherAttendance)getChild( StudentDTD.CALENDARDATE_TEACHERATTENDANCE);
	}

	/**
	 *  Removes the <code>TeacherAttendance</code> child element previously created by calling <code>setTeacherAttendance</code>
	 *
	 *  @since 2.0
	 */
	public void removeTeacherAttendance() { 
		removeChild( StudentDTD.CALENDARDATE_TEACHERATTENDANCE );
	}

	/**
	 *  Sets the value of the <code>&lt;AdministratorAttendance&gt;</code> element.
	 *
	 *  @param value A <code>AdministratorAttendance</code> object
	 *  @since 2.0
	 */
	public void setAdministratorAttendance( AdministratorAttendance value ) { 
		removeChild( StudentDTD.CALENDARDATE_ADMINISTRATORATTENDANCE );
		addChild( StudentDTD.CALENDARDATE_ADMINISTRATORATTENDANCE, value);
	}

	/**
	 *  Gets the value of the <code>&lt;AdministratorAttendance&gt;</code> element.
	 *
	 *  @return An <code>AdministratorAttendance</code> object
	 *  @since 2.0
	 */
	public AdministratorAttendance getAdministratorAttendance() { 
		return (AdministratorAttendance)getChild( StudentDTD.CALENDARDATE_ADMINISTRATORATTENDANCE);
	}

	/**
	 *  Removes the <code>AdministratorAttendance</code> child element previously created by calling <code>setAdministratorAttendance</code>
	 *
	 *  @since 2.0
	 */
	public void removeAdministratorAttendance() { 
		removeChild( StudentDTD.CALENDARDATE_ADMINISTRATORATTENDANCE );
	}

	/**
	 *  Sets the value of the <code>&lt;BellScheduleDayList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A list of the bell schedules and the timetable day from that bell schedule to be used for the calendar date"</i><p>
	 *
	 *  @param value A <code>BellScheduleDayList</code> object
	 *  @since 2.4
	 */
	public void setBellScheduleDayList( BellScheduleDayList value ) { 
		removeChild( StudentDTD.CALENDARDATE_BELLSCHEDULEDAYLIST );
		addChild( StudentDTD.CALENDARDATE_BELLSCHEDULEDAYLIST, value);
	}

	/**
	 *  Sets the value of the <code>&lt;BellScheduleDayList&gt;</code> child element.
	 *  This form of <code>setBellScheduleDayList</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setBellScheduleDayList</code>
	 *  that accepts a single <code>BellScheduleDayList</code> object.
	 *
	 *  @param bellScheduleDay 
	 *  @since 2.4
	 */
	public void setBellScheduleDayList( BellScheduleDay bellScheduleDay ) {
		removeChild( StudentDTD.CALENDARDATE_BELLSCHEDULEDAYLIST);
		addChild( StudentDTD.CALENDARDATE_BELLSCHEDULEDAYLIST, new BellScheduleDayList( bellScheduleDay ) );
	}

	/**
	 *  Gets the value of the <code>&lt;BellScheduleDayList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A list of the bell schedules and the timetable day from that bell schedule to be used for the calendar date"</i><p>
	 *
	 *  @return A <code>BellScheduleDayList</code> object
	 *  @since 2.4
	 */
	public BellScheduleDayList getBellScheduleDayList() { 
		return (BellScheduleDayList)getChild( StudentDTD.CALENDARDATE_BELLSCHEDULEDAYLIST);
	}

	/**
	 *  Removes the <code>BellScheduleDayList</code> child element previously created by calling <code>setBellScheduleDayList</code>
	 *
	 *  @since 2.4
	 */
	public void removeBellScheduleDayList() { 
		removeChild( StudentDTD.CALENDARDATE_BELLSCHEDULEDAYLIST );
	}

}