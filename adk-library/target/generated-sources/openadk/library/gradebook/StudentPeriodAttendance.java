// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.gradebook;

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
public class StudentPeriodAttendance extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentPeriodAttendance() {
		super( ADK.getSIFVersion(), GradebookDTD.STUDENTPERIODATTENDANCE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId 
	 *  @param studentPersonalRefId The GUID of the student that this attendance applies to.
	 *  @param sectionInfoRefId The GUID of the section that this attendance applies to.
	 *  @param schoolInfoRefId The school where the attendance was recorded.  Somewhat redundant, needed for requests.
	 *  @param date The date of the attendance event.
	 */
	public StudentPeriodAttendance( String refId, String studentPersonalRefId, String sectionInfoRefId, String schoolInfoRefId, Calendar date ) {
		super( ADK.getSIFVersion(), GradebookDTD.STUDENTPERIODATTENDANCE );
		this.setRefId(refId);
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setSectionInfoRefId(sectionInfoRefId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setDate(date);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { GradebookDTD.STUDENTPERIODATTENDANCE_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setRefId( String value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the student that this attendance applies to."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the student that this attendance applies to."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SectionInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the section that this attendance applies to."</i><p>
	 *
	 *  @return The <code>SectionInfoRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSectionInfoRefId() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_SECTIONINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SectionInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the section that this attendance applies to."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSectionInfoRefId( String value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_SECTIONINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The school where the attendance was recorded.  Somewhat redundant, needed for requests."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The school where the attendance was recorded.  Somewhat redundant, needed for requests."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Date</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The date of the attendance event."</i><p>
	 *
	 *  @return The <code>Date</code> attribute of this object.
	 *  @since 2.0
	 */
	public Calendar getDate() { 
		return (Calendar) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_DATE );
	}

	/**
	 *  Sets the value of the <code>Date</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The date of the attendance event."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setDate( Calendar value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_DATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TimetablePeriod&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The period within which attendance is being reported, e.g. "4D".  Conditional on the SectionInfo object having MeetingTime elements.  If one or more are defined for the Section, this element is required."</i><p>
	 *
	 *  @return The <code>TimetablePeriod</code> element of this object.
	 *  @since 2.0
	 */
	public String getTimetablePeriod() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_TIMETABLEPERIOD );
	}

	/**
	 *  Sets the value of the <code>&lt;TimetablePeriod&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The period within which attendance is being reported, e.g. "4D".  Conditional on the SectionInfo object having MeetingTime elements.  If one or more are defined for the Section, this element is required."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setTimetablePeriod( String value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_TIMETABLEPERIOD, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TimeIn&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The time the student entered or returned to this class."</i><p>
	 *
	 *  @return The <code>TimeIn</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getTimeIn() { 
		return (Calendar) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_TIMEIN );
	}

	/**
	 *  Sets the value of the <code>&lt;TimeIn&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The time the student entered or returned to this class."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setTimeIn( Calendar value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_TIMEIN, new SIFTime( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TimeOut&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The time the student left this class."</i><p>
	 *
	 *  @return The <code>TimeOut</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getTimeOut() { 
		return (Calendar) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_TIMEOUT );
	}

	/**
	 *  Sets the value of the <code>&lt;TimeOut&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The time the student left this class."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setTimeOut( Calendar value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_TIMEOUT, new SIFTime( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;AttendanceCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The local attendance code."</i><p>
	 *
	 *  @param value A <code>AttendanceCode</code> object
	 *  @since 2.0
	 */
	public void setAttendanceCode( AttendanceCode value ) { 
		removeChild( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECODE );
		addChild( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECODE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;AttendanceCode&gt;</code> child element.
	 *  This form of <code>setAttendanceCode</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAttendanceCode</code>
	 *  that accepts a single <code>AttendanceCode</code> object.
	 *
	 *  @param attendanceCodeInfoRefId The ID (GUID) of the attendance code
	 *  @param value Gets or sets the content value of the &lt;AttendanceCode&gt; element
	 *  @since 2.0
	 */
	public void setAttendanceCode( String attendanceCodeInfoRefId, String value ) {
		removeChild( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECODE);
		addChild( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECODE, new AttendanceCode( attendanceCodeInfoRefId, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;AttendanceCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The local attendance code."</i><p>
	 *
	 *  @return An <code>AttendanceCode</code> object
	 *  @since 2.0
	 */
	public AttendanceCode getAttendanceCode() { 
		return (AttendanceCode)getChild( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECODE);
	}

	/**
	 *  Removes the <code>AttendanceCode</code> child element previously created by calling <code>setAttendanceCode</code>
	 *
	 *  @since 2.0
	 */
	public void removeAttendanceCode() { 
		removeChild( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECODE );
	}

	/**
	 *  Sets the value of the <code>&lt;AuditInfo&gt;</code> element.
	 *
	 *  @param value A <code>AuditInfo</code> object
	 *  @since 2.0
	 */
	public void setAuditInfo( AuditInfo value ) { 
		removeChild( GradebookDTD.STUDENTPERIODATTENDANCE_AUDITINFO );
		addChild( GradebookDTD.STUDENTPERIODATTENDANCE_AUDITINFO, value);
	}

	/**
	 *  Gets the value of the <code>&lt;AuditInfo&gt;</code> element.
	 *
	 *  @return An <code>AuditInfo</code> object
	 *  @since 2.0
	 */
	public AuditInfo getAuditInfo() { 
		return (AuditInfo)getChild( GradebookDTD.STUDENTPERIODATTENDANCE_AUDITINFO);
	}

	/**
	 *  Removes the <code>AuditInfo</code> child element previously created by calling <code>setAuditInfo</code>
	 *
	 *  @since 2.0
	 */
	public void removeAuditInfo() { 
		removeChild( GradebookDTD.STUDENTPERIODATTENDANCE_AUDITINFO );
	}

	/**
	 *  Gets the value of the <code>&lt;AttendanceComment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element contains the comments that are relevant to this attendance record."</i><p>
	 *
	 *  @return The <code>AttendanceComment</code> element of this object.
	 *  @since 2.0
	 */
	public String getAttendanceComment() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECOMMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;AttendanceComment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element contains the comments that are relevant to this attendance record."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setAttendanceComment( String value ) { 
		setFieldValue( GradebookDTD.STUDENTPERIODATTENDANCE_ATTENDANCECOMMENT, new SIFString( value ), value );
	}

}