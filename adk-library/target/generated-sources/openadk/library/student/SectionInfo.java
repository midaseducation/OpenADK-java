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
 *  This object provides information about the section - the specific time period a session of the course meets<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class SectionInfo extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SectionInfo() {
		super( ADK.getSIFVersion(), StudentDTD.SECTIONINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The ID (GUID) that uniquely identifies this section entity.
	 *  @param schoolCourseInfoRefId The ID (GUID) that identifies the course being taught in this section.
	 *  @param schoolYear School year for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g. 2007 for the 2006-07 school year).
	 *  @param scheduleInfoList The schedule-related information for a section
	 */
	public SectionInfo( String refId, String schoolCourseInfoRefId, Integer schoolYear, ScheduleInfoList scheduleInfoList ) {
		super( ADK.getSIFVersion(), StudentDTD.SECTIONINFO );
		this.setRefId(refId);
		this.setSchoolCourseInfoRefId(schoolCourseInfoRefId);
		this.setSchoolYear(schoolYear);
		this.setScheduleInfoList(scheduleInfoList);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( StudentDTD.SECTIONINFO_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.SECTIONINFO_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies this section entity."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies this section entity."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setRefId( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolCourseInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that identifies the course being taught in this section."</i><p>
	 *
	 *  @return The <code>SchoolCourseInfoRefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getSchoolCourseInfoRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolCourseInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that identifies the course being taught in this section."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSchoolCourseInfoRefId( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g. 2007 for the 2006-07 school year)."</i><p>
	 *
	 *  @return The <code>SchoolYear</code> attribute of this object.
	 *  @since 2.0
	 */
	public Integer getSchoolYear() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_SCHOOLYEAR );
	}

	/**
	 *  Sets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g. 2007 for the 2006-07 school year)."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setSchoolYear( Integer value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_SCHOOLYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ScheduleInfoList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The schedule-related information for a section"</i><p>
	 *
	 *  @param value A <code>ScheduleInfoList</code> object
	 *  @since 1.1
	 */
	public void setScheduleInfoList( ScheduleInfoList value ) { 
		removeChild( StudentDTD.SECTIONINFO_SCHEDULEINFOLIST );
		addChild( StudentDTD.SECTIONINFO_SCHEDULEINFOLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ScheduleInfoList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The schedule-related information for a section"</i><p>
	 *
	 *  @return A <code>ScheduleInfoList</code> object
	 *  @since 1.1
	 */
	public ScheduleInfoList getScheduleInfoList() { 
		return (ScheduleInfoList)getChild( StudentDTD.SECTIONINFO_SCHEDULEINFOLIST);
	}

	/**
	 *  Removes the <code>ScheduleInfoList</code> child element previously created by calling <code>setScheduleInfoList</code>
	 *
	 *  @since 1.1
	 */
	public void removeScheduleInfoList() { 
		removeChild( StudentDTD.SECTIONINFO_SCHEDULEINFOLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;MediumOfInstruction&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Medium through which the student receives instructional communication from the teacher"</i><p>
	 *
	 *  @param value A <code>MediumOfInstruction</code> object
	 *  @since 1.1
	 */
	public void setMediumOfInstruction( MediumOfInstruction value ) { 
		removeChild( StudentDTD.SECTIONINFO_MEDIUMOFINSTRUCTION );
		addChild( StudentDTD.SECTIONINFO_MEDIUMOFINSTRUCTION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;MediumOfInstruction&gt;</code> child element.
	 *  This form of <code>setMediumOfInstruction</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setMediumOfInstruction</code>
	 *  that accepts a single <code>MediumOfInstruction</code> object.
	 *
	 *  @param code Code representing the medium of instruction.
	 *  @since 1.1
	 */
	public void setMediumOfInstruction( MediumOfInstructionCode code ) {
		removeChild( StudentDTD.SECTIONINFO_MEDIUMOFINSTRUCTION);
		addChild( StudentDTD.SECTIONINFO_MEDIUMOFINSTRUCTION, new MediumOfInstruction( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;MediumOfInstruction&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Medium through which the student receives instructional communication from the teacher"</i><p>
	 *
	 *  @return A <code>MediumOfInstruction</code> object
	 *  @since 1.1
	 */
	public MediumOfInstruction getMediumOfInstruction() { 
		return (MediumOfInstruction)getChild( StudentDTD.SECTIONINFO_MEDIUMOFINSTRUCTION);
	}

	/**
	 *  Removes the <code>MediumOfInstruction</code> child element previously created by calling <code>setMediumOfInstruction</code>
	 *
	 *  @since 1.1
	 */
	public void removeMediumOfInstruction() { 
		removeChild( StudentDTD.SECTIONINFO_MEDIUMOFINSTRUCTION );
	}

	/**
	 *  Gets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-assigned identifier for this course section."</i><p>
	 *
	 *  @return The <code>LocalId</code> element of this object.
	 *  @since 2.0
	 */
	public String getLocalId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_LOCALID );
	}

	/**
	 *  Sets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-assigned identifier for this course section."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setLocalId( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_LOCALID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the course section."</i><p>
	 *
	 *  @return The <code>Description</code> element of this object.
	 *  @since 2.0
	 */
	public String getDescription() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_DESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the course section."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setDescription( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_DESCRIPTION, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;LanguageOfInstruction&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Language in which the section is taught"</i><p>
	 *
	 *  @param value A <code>LanguageOfInstruction</code> object
	 *  @since 1.1
	 */
	public void setLanguageOfInstruction( LanguageOfInstruction value ) { 
		removeChild( StudentDTD.SECTIONINFO_LANGUAGEOFINSTRUCTION );
		addChild( StudentDTD.SECTIONINFO_LANGUAGEOFINSTRUCTION, value);
	}

	/**
	 *  Gets the value of the <code>&lt;LanguageOfInstruction&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Language in which the section is taught"</i><p>
	 *
	 *  @return A <code>LanguageOfInstruction</code> object
	 *  @since 1.1
	 */
	public LanguageOfInstruction getLanguageOfInstruction() { 
		return (LanguageOfInstruction)getChild( StudentDTD.SECTIONINFO_LANGUAGEOFINSTRUCTION);
	}

	/**
	 *  Removes the <code>LanguageOfInstruction</code> child element previously created by calling <code>setLanguageOfInstruction</code>
	 *
	 *  @since 1.1
	 */
	public void removeLanguageOfInstruction() { 
		removeChild( StudentDTD.SECTIONINFO_LANGUAGEOFINSTRUCTION );
	}

	/**
	 *  Sets the value of the <code>&lt;LocationOfInstruction&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the location in which the section is taught"</i><p>
	 *
	 *  @param value A <code>LocationOfInstruction</code> object
	 *  @since 1.1
	 */
	public void setLocationOfInstruction( LocationOfInstruction value ) { 
		removeChild( StudentDTD.SECTIONINFO_LOCATIONOFINSTRUCTION );
		addChild( StudentDTD.SECTIONINFO_LOCATIONOFINSTRUCTION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;LocationOfInstruction&gt;</code> child element.
	 *  This form of <code>setLocationOfInstruction</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setLocationOfInstruction</code>
	 *  that accepts a single <code>LocationOfInstruction</code> object.
	 *
	 *  @param code Code representing the location of instruction.
	 *  @since 1.1
	 */
	public void setLocationOfInstruction( LocationOfInstructionCode code ) {
		removeChild( StudentDTD.SECTIONINFO_LOCATIONOFINSTRUCTION);
		addChild( StudentDTD.SECTIONINFO_LOCATIONOFINSTRUCTION, new LocationOfInstruction( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;LocationOfInstruction&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the location in which the section is taught"</i><p>
	 *
	 *  @return A <code>LocationOfInstruction</code> object
	 *  @since 1.1
	 */
	public LocationOfInstruction getLocationOfInstruction() { 
		return (LocationOfInstruction)getChild( StudentDTD.SECTIONINFO_LOCATIONOFINSTRUCTION);
	}

	/**
	 *  Removes the <code>LocationOfInstruction</code> child element previously created by calling <code>setLocationOfInstruction</code>
	 *
	 *  @since 1.1
	 */
	public void removeLocationOfInstruction() { 
		removeChild( StudentDTD.SECTIONINFO_LOCATIONOFINSTRUCTION );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolCourseInfoOverride&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Optional overrides of the course information for this section"</i><p>
	 *
	 *  @param value A <code>SchoolCourseInfoOverride</code> object
	 *  @since 1.1
	 */
	public void setSchoolCourseInfoOverride( SchoolCourseInfoOverride value ) { 
		removeChild( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOOVERRIDE );
		addChild( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOOVERRIDE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolCourseInfoOverride&gt;</code> child element.
	 *  This form of <code>setSchoolCourseInfoOverride</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSchoolCourseInfoOverride</code>
	 *  that accepts a single <code>SchoolCourseInfoOverride</code> object.
	 *
	 *  @param override Designates whether or not SchoolCourseInfo information has been overridden with different values for this section
	 *  @since 1.1
	 */
	public void setSchoolCourseInfoOverride( YesNo override ) {
		removeChild( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOOVERRIDE);
		addChild( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOOVERRIDE, new SchoolCourseInfoOverride( override ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolCourseInfoOverride&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Optional overrides of the course information for this section"</i><p>
	 *
	 *  @return A <code>SchoolCourseInfoOverride</code> object
	 *  @since 1.1
	 */
	public SchoolCourseInfoOverride getSchoolCourseInfoOverride() { 
		return (SchoolCourseInfoOverride)getChild( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOOVERRIDE);
	}

	/**
	 *  Removes the <code>SchoolCourseInfoOverride</code> child element previously created by calling <code>setSchoolCourseInfoOverride</code>
	 *
	 *  @since 1.1
	 */
	public void removeSchoolCourseInfoOverride() { 
		removeChild( StudentDTD.SECTIONINFO_SCHOOLCOURSEINFOOVERRIDE );
	}

	/**
	 *  Gets the value of the <code>&lt;SummerSchool&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Is this a summer school assignment?"</i><p>
	 *
	 *  @return The <code>SummerSchool</code> element of this object.
	 *  @since 2.0
	 */
	public String getSummerSchool() { 
		return getFieldValue( StudentDTD.SECTIONINFO_SUMMERSCHOOL );
	}

	/**
	 *  Sets the value of the <code>&lt;SummerSchool&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Is this a summer school assignment?"</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.0
	 */
	public void setSummerSchool( YesNo value ) { 
		setField( StudentDTD.SECTIONINFO_SUMMERSCHOOL, value );
	}

	/**
	 *  Sets the value of the <code>&lt;SummerSchool&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Is this a summer school assignment?"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setSummerSchool( String value ) { 
		setField( StudentDTD.SECTIONINFO_SUMMERSCHOOL, value );
	}

	/**
	 *  Gets the value of the <code>&lt;CourseSectionCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A section code that is linked to a course. This should be a unique identifier within the school year and course (i.e. the class instance number for a course). For example, Algebra I: Section 23 is different from English II: Section 23."</i><p>
	 *
	 *  @return The <code>CourseSectionCode</code> element of this object.
	 *  @since 2.4
	 */
	public String getCourseSectionCode() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_COURSESECTIONCODE );
	}

	/**
	 *  Sets the value of the <code>&lt;CourseSectionCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A section code that is linked to a course. This should be a unique identifier within the school year and course (i.e. the class instance number for a course). For example, Algebra I: Section 23 is different from English II: Section 23."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setCourseSectionCode( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_COURSESECTIONCODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SectionCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A unique identifier of the section for the school year and across courses (i.e. unique across all courses). For example, Algebra I sections range from 00122 to 00140 and English II courses range from 00141 to 00152."</i><p>
	 *
	 *  @return The <code>SectionCode</code> element of this object.
	 *  @since 2.4
	 */
	public String getSectionCode() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_SECTIONCODE );
	}

	/**
	 *  Sets the value of the <code>&lt;SectionCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A unique identifier of the section for the school year and across courses (i.e. unique across all courses). For example, Algebra I sections range from 00122 to 00140 and English II courses range from 00141 to 00152."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setSectionCode( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_SECTIONCODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;CountForAttendance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if attendance in this section is collected and used in attendance calculations."</i><p>
	 *
	 *  @return The <code>CountForAttendance</code> element of this object.
	 *  @since 2.4
	 */
	public String getCountForAttendance() { 
		return getFieldValue( StudentDTD.SECTIONINFO_COUNTFORATTENDANCE );
	}

	/**
	 *  Sets the value of the <code>&lt;CountForAttendance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if attendance in this section is collected and used in attendance calculations."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.4
	 */
	public void setCountForAttendance( YesNo value ) { 
		setField( StudentDTD.SECTIONINFO_COUNTFORATTENDANCE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;CountForAttendance&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates if attendance in this section is collected and used in attendance calculations."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.4
	 */
	public void setCountForAttendance( String value ) { 
		setField( StudentDTD.SECTIONINFO_COUNTFORATTENDANCE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;BellScheduleRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The GUID of the bell schedule used by this section."</i><p>
	 *
	 *  @return The <code>BellScheduleRefId</code> element of this object.
	 *  @since 2.4
	 */
	public String getBellScheduleRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.SECTIONINFO_BELLSCHEDULEREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;BellScheduleRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The GUID of the bell schedule used by this section."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setBellScheduleRefId( String value ) { 
		setFieldValue( StudentDTD.SECTIONINFO_BELLSCHEDULEREFID, new SIFString( value ), value );
	}

}