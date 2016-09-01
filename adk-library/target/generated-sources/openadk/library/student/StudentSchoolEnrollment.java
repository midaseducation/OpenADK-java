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
 *  
      This object defines information related to a student's enrollment. SIF_Events are reported. StudentSchoolEnrollment
      instances must not span multiple school years.
    <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class StudentSchoolEnrollment extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentSchoolEnrollment() {
		super( ADK.getSIFVersion(), StudentDTD.STUDENTSCHOOLENROLLMENT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The ID (GUID) that uniquely identifies a particular enrollment.
	 *  @param studentPersonalRefId The ID (GUID) of the student to whom this information is linked.
	 *  @param schoolInfoRefId The ID (GUID) of the school to which this enrollment applies.
	 *  @param membershipType The type of this enrollment as it relates to the school identified in SchoolInfoRefId.
	 *  @param timeFrame The timeframe of the enrollment based on the SIF_Date in the SIF_Header of the message. For events, it is determined as of the date the event is generated. For requests and responses, it is calculated based on the date of the request.
	 */
	public StudentSchoolEnrollment( String refId, String studentPersonalRefId, String schoolInfoRefId, MembershipType membershipType, TimeFrame timeFrame ) {
		super( ADK.getSIFVersion(), StudentDTD.STUDENTSCHOOLENROLLMENT );
		this.setRefId(refId);
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setMembershipType( membershipType );
		this.setTimeFrame( timeFrame );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.STUDENTSCHOOLENROLLMENT_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies a particular enrollment."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies a particular enrollment."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setRefId( String value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the student to whom this information is linked."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the student to whom this information is linked."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the school to which this enrollment applies."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) of the school to which this enrollment applies."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>MembershipType</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of this enrollment as it relates to the school identified in SchoolInfoRefId."</i><p>
	 *
	 *  @return The <code>MembershipType</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getMembershipType() { 
		return getFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_MEMBERSHIPTYPE );
	}

	/**
	 *  Sets the value of the <code>MembershipType</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of this enrollment as it relates to the school identified in SchoolInfoRefId."</i><p>
	 *
	 *  @param value A constant defined by the <code>MembershipType</code> class
	 *  @since 1.1
	 */
	public void setMembershipType( MembershipType value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_MEMBERSHIPTYPE, value );
	}

	/**
	 *  Sets the value of the <code>MembershipType</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of this enrollment as it relates to the school identified in SchoolInfoRefId."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setMembershipType( String value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_MEMBERSHIPTYPE, value );
	}

	/**
	 *  Gets the value of the <code>TimeFrame</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The timeframe of the enrollment based on the SIF_Date in the SIF_Header of the message. For events, it is determined as of the date the event is generated. For requests and responses, it is calculated based on the date of the request."</i><p>
	 *
	 *  @return The <code>TimeFrame</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getTimeFrame() { 
		return getFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_TIMEFRAME );
	}

	/**
	 *  Sets the value of the <code>TimeFrame</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The timeframe of the enrollment based on the SIF_Date in the SIF_Header of the message. For events, it is determined as of the date the event is generated. For requests and responses, it is calculated based on the date of the request."</i><p>
	 *
	 *  @param value A constant defined by the <code>TimeFrame</code> class
	 *  @since 1.1
	 */
	public void setTimeFrame( TimeFrame value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_TIMEFRAME, value );
	}

	/**
	 *  Sets the value of the <code>TimeFrame</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The timeframe of the enrollment based on the SIF_Date in the SIF_Header of the message. For events, it is determined as of the date the event is generated. For requests and responses, it is calculated based on the date of the request."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setTimeFrame( String value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_TIMEFRAME, value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
        School year for which this enrollment is applicable, expressed as the four-digit year in which the school year ends (e.g. 2007 for the 2006-07 school year). StudentSchoolEnrollment instances must not span multiple school years.
      "</i><p>
	 *
	 *  @return The <code>SchoolYear</code> element of this object.
	 *  @since 1.5r1
	 */
	public Integer getSchoolYear() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_SCHOOLYEAR );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
        School year for which this enrollment is applicable, expressed as the four-digit year in which the school year ends (e.g. 2007 for the 2006-07 school year). StudentSchoolEnrollment instances must not span multiple school years.
      "</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolYear( Integer value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_SCHOOLYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;EnrollStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The status of this enrollment (deprecated)"</i><p>
	 *
	 *  @param value A <code>EnrollStatus</code> object
	 *  @since 1.1
	 */
	public void setEnrollStatus( EnrollStatus value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENROLLSTATUS );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENROLLSTATUS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;EnrollStatus&gt;</code> child element.
	 *  This form of <code>setEnrollStatus</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setEnrollStatus</code>
	 *  that accepts a single <code>EnrollStatus</code> object.
	 *
	 *  @param code 
	 *  @since 1.1
	 */
	public void setEnrollStatus( String code ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENROLLSTATUS);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENROLLSTATUS, new EnrollStatus( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;EnrollStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The status of this enrollment (deprecated)"</i><p>
	 *
	 *  @return An <code>EnrollStatus</code> object
	 *  @since 1.1
	 */
	public EnrollStatus getEnrollStatus() { 
		return (EnrollStatus)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENROLLSTATUS);
	}

	/**
	 *  Removes the <code>EnrollStatus</code> child element previously created by calling <code>setEnrollStatus</code>
	 *
	 *  @since 1.1
	 */
	public void removeEnrollStatus() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENROLLSTATUS );
	}

	/**
	 *  Gets the value of the <code>&lt;EntryDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date from when this enrollment is valid."</i><p>
	 *
	 *  @return The <code>EntryDate</code> element of this object.
	 *  @since 1.1
	 */
	public Calendar getEntryDate() { 
		return (Calendar) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;EntryDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date from when this enrollment is valid."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.1
	 */
	public void setEntryDate( Calendar value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;EntryType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the type of entry for this enrollment (deprecated)"</i><p>
	 *
	 *  @param value A <code>EntryType</code> object
	 *  @since 1.1
	 */
	public void setEntryType( EntryType value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYTYPE );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYTYPE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;EntryType&gt;</code> child element.
	 *  This form of <code>setEntryType</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setEntryType</code>
	 *  that accepts a single <code>EntryType</code> object.
	 *
	 *  @param code Code indicating the type of entry for this enrollment
	 *  @since 1.1
	 */
	public void setEntryType( EntryTypeCode code ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYTYPE);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYTYPE, new EntryType( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;EntryType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the type of entry for this enrollment (deprecated)"</i><p>
	 *
	 *  @return An <code>EntryType</code> object
	 *  @since 1.1
	 */
	public EntryType getEntryType() { 
		return (EntryType)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYTYPE);
	}

	/**
	 *  Removes the <code>EntryType</code> child element previously created by calling <code>setEntryType</code>
	 *
	 *  @since 1.1
	 */
	public void removeEntryType() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ENTRYTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade or academic level of student for this enrollment."</i><p>
	 *
	 *  @param value A <code>GradeLevel</code> object
	 *  @since 1.1
	 */
	public void setGradeLevel( GradeLevel value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_GRADELEVEL );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_GRADELEVEL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> child element.
	 *  This form of <code>setGradeLevel</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGradeLevel</code>
	 *  that accepts a single <code>GradeLevel</code> object.
	 *
	 *  @param code Code representing the grade level.
	 *  @since 1.1
	 */
	public void setGradeLevel( GradeLevelCode code ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_GRADELEVEL);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_GRADELEVEL, new GradeLevel( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade or academic level of student for this enrollment."</i><p>
	 *
	 *  @return A <code>GradeLevel</code> object
	 *  @since 1.1
	 */
	public GradeLevel getGradeLevel() { 
		return (GradeLevel)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_GRADELEVEL);
	}

	/**
	 *  Removes the <code>GradeLevel</code> child element previously created by calling <code>setGradeLevel</code>
	 *
	 *  @since 1.1
	 */
	public void removeGradeLevel() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_GRADELEVEL );
	}

	/**
	 *  Sets the value of the <code>&lt;Homeroom&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Homeroom for this enrollment"</i><p>
	 *
	 *  @param value A <code>Homeroom</code> object
	 *  @since 1.1
	 */
	public void setHomeroom( Homeroom value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_HOMEROOM );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_HOMEROOM, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Homeroom&gt;</code> child element.
	 *  This form of <code>setHomeroom</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setHomeroom</code>
	 *  that accepts a single <code>Homeroom</code> object.
	 *
	 *  @param sifRefObject The name of the object referenced.
	 *  @param value Gets or sets the content value of the &lt;Homeroom&gt; element
	 *  @since 1.1
	 */
	public void setHomeroom( String sifRefObject, String value ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_HOMEROOM);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_HOMEROOM, new Homeroom( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Homeroom&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Homeroom for this enrollment"</i><p>
	 *
	 *  @return An <code>Homeroom</code> object
	 *  @since 1.1
	 */
	public Homeroom getHomeroom() { 
		return (Homeroom)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_HOMEROOM);
	}

	/**
	 *  Removes the <code>Homeroom</code> child element previously created by calling <code>setHomeroom</code>
	 *
	 *  @since 1.1
	 */
	public void removeHomeroom() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_HOMEROOM );
	}

	/**
	 *  Sets the value of the <code>&lt;Advisor&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Staff member assigned as an advisor for this enrollment."</i><p>
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public void setAdvisor( SIF_RefId value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ADVISOR );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ADVISOR, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Advisor&gt;</code> child element.
	 *  This form of <code>setAdvisor</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAdvisor</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 2.0
	 */
	public void setAdvisor( String sifRefObject, String value ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ADVISOR);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ADVISOR, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Advisor&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Staff member assigned as an advisor for this enrollment."</i><p>
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public SIF_RefId getAdvisor() { 
		return (SIF_RefId)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ADVISOR);
	}

	/**
	 *  Removes the <code>Advisor</code> child element previously created by calling <code>setAdvisor</code>
	 *
	 *  @since 2.0
	 */
	public void removeAdvisor() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_ADVISOR );
	}

	/**
	 *  Adds a new <code>&lt;StaffAssigned&gt;</code> child element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Staff assigned to the student for this enrollment"</i><p>
	 *
	 *  @param value A <code>StaffAssigned</code> object
	 *  @since 1.1
	 */
	public void addStaffAssigned( StaffAssigned value ) { 
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_STAFFASSIGNED, value);
	}

	/**
	 *  Adds a new <code>&lt;StaffAssigned&gt;</code> repeatable element.
	 *  This form of <code>setStaffAssigned</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStaffAssigned</code>
	 *  that accepts a single <code>StaffAssigned</code> object.
	 *
	 *  @param type The type of assignment: Advisor or Counselor
	 *  @param staffPersonalRefId Reference to the StaffPersonal object associated with this enrollment
	 *  @since 1.1
	 */
	public void addStaffAssigned( String type, String staffPersonalRefId ) {
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_STAFFASSIGNED, new StaffAssigned( type, staffPersonalRefId ) );
	}

	/**
	 *  Removes a <code>StaffAssigned</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the StaffAssigned object to remove by its Type value
	 *  @param staffPersonalRefId Identifies the StaffAssigned object to remove by its StaffPersonalRefId value
	 *  @since 1.1
	 */
	public void removeStaffAssigned( String type, String staffPersonalRefId ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_STAFFASSIGNED, new String[] { type.toString(),staffPersonalRefId.toString() } );
	}

	/**
	 *  Gets a <code>StaffAssigned</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the StaffAssigned object to return by its "Type" attribute value
	 *  @param staffPersonalRefId Identifies the StaffAssigned object to return by its "StaffPersonalRefId" attribute value
	 *  @return A <code>StaffAssigned</code> object
	 *  @since 1.1
	 */
	public StaffAssigned getStaffAssigned( String type, String staffPersonalRefId ) { 
		return (StaffAssigned)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_STAFFASSIGNED, new String[] { type.toString(),staffPersonalRefId.toString() } );
	}

	/**
	 *  Gets all <code>StaffAssigned</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>StaffAssigned</code> objects
	 *  @since 1.1
	 */
	public StaffAssigned[] getStaffAssigneds() {
		List<SIFElement> v = getChildList( StudentDTD.STUDENTSCHOOLENROLLMENT_STAFFASSIGNED);
		StaffAssigned[] cvt = new StaffAssigned[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>StaffAssigned</code> objects. All existing 
	 * <code>StaffAssigned</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>StaffAssigneds</code>.
	 *
	 *  @since 1.1
	 */
	public void setStaffAssigneds( StaffAssigned[] staffassigneds ) {
		setChildren( StudentDTD.STUDENTSCHOOLENROLLMENT_STAFFASSIGNED, staffassigneds );
	}

	/**
	 *  Sets the value of the <code>&lt;Counselor&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Staff member assigned as a counselor for this enrollment."</i><p>
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public void setCounselor( SIF_RefId value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_COUNSELOR );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_COUNSELOR, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Counselor&gt;</code> child element.
	 *  This form of <code>setCounselor</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setCounselor</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 2.0
	 */
	public void setCounselor( String sifRefObject, String value ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_COUNSELOR);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_COUNSELOR, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Counselor&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Staff member assigned as a counselor for this enrollment."</i><p>
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public SIF_RefId getCounselor() { 
		return (SIF_RefId)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_COUNSELOR);
	}

	/**
	 *  Removes the <code>Counselor</code> child element previously created by calling <code>setCounselor</code>
	 *
	 *  @since 2.0
	 */
	public void removeCounselor() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_COUNSELOR );
	}

	/**
	 *  Gets the value of the <code>&lt;ExitDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The last School calendar day (membership day) the student was enrolled in the school (inclusive). If the student has existed the school, ExitDate must have a value."</i><p>
	 *
	 *  @return The <code>ExitDate</code> element of this object.
	 *  @since 1.1
	 */
	public Calendar getExitDate() { 
		return (Calendar) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;ExitDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The last School calendar day (membership day) the student was enrolled in the school (inclusive). If the student has existed the school, ExitDate must have a value."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.1
	 */
	public void setExitDate( Calendar value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ExitStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether this exit from the school is considered to be temporary or permanent"</i><p>
	 *
	 *  @param value A <code>ExitStatus</code> object
	 *  @since 1.1
	 */
	public void setExitStatus( ExitStatus value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITSTATUS );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITSTATUS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ExitStatus&gt;</code> child element.
	 *  This form of <code>setExitStatus</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setExitStatus</code>
	 *  that accepts a single <code>ExitStatus</code> object.
	 *
	 *  @param code Code indicating the exit status for this affiliation.
	 *  @since 1.1
	 */
	public void setExitStatus( ExitStatusCode code ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITSTATUS);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITSTATUS, new ExitStatus( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ExitStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether this exit from the school is considered to be temporary or permanent"</i><p>
	 *
	 *  @return An <code>ExitStatus</code> object
	 *  @since 1.1
	 */
	public ExitStatus getExitStatus() { 
		return (ExitStatus)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITSTATUS);
	}

	/**
	 *  Removes the <code>ExitStatus</code> child element previously created by calling <code>setExitStatus</code>
	 *
	 *  @since 1.1
	 */
	public void removeExitStatus() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;Calendar&gt;</code> element.
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 2.3
	 */
	public void setCalendar( SIF_RefId value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_CALENDAR );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_CALENDAR, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Calendar&gt;</code> child element.
	 *  This form of <code>setCalendar</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setCalendar</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 2.3
	 */
	public void setCalendar( String sifRefObject, String value ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_CALENDAR);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_CALENDAR, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Calendar&gt;</code> element.
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 2.3
	 */
	public SIF_RefId getCalendar() { 
		return (SIF_RefId)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_CALENDAR);
	}

	/**
	 *  Removes the <code>Calendar</code> child element previously created by calling <code>setCalendar</code>
	 *
	 *  @since 2.3
	 */
	public void removeCalendar() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_CALENDAR );
	}

	/**
	 *  Sets the value of the <code>&lt;ExitType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the type of exit for this enrollment (deprecated)"</i><p>
	 *
	 *  @param value A <code>ExitType</code> object
	 *  @since 1.1
	 */
	public void setExitType( ExitType value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITTYPE );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITTYPE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ExitType&gt;</code> child element.
	 *  This form of <code>setExitType</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setExitType</code>
	 *  that accepts a single <code>ExitType</code> object.
	 *
	 *  @param code Code indicating the type of exit for this enrollment.
	 *  @since 1.1
	 */
	public void setExitType( ExitTypeCode code ) {
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITTYPE);
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITTYPE, new ExitType( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ExitType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the type of exit for this enrollment (deprecated)"</i><p>
	 *
	 *  @return An <code>ExitType</code> object
	 *  @since 1.1
	 */
	public ExitType getExitType() { 
		return (ExitType)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITTYPE);
	}

	/**
	 *  Removes the <code>ExitType</code> child element previously created by calling <code>setExitType</code>
	 *
	 *  @since 1.1
	 */
	public void removeExitType() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_EXITTYPE );
	}

	/**
	 *  Gets the value of the <code>&lt;FTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Full-time equivalent numeric value of the student's course load during this enrollment, expressed in decimal form, where 1.00 represents a full-time enrollment."</i><p>
	 *
	 *  @return The <code>FTE</code> element of this object.
	 *  @since 1.1
	 */
	public BigDecimal getFTE() { 
		return (BigDecimal) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_FTE );
	}

	/**
	 *  Sets the value of the <code>&lt;FTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Full-time equivalent numeric value of the student's course load during this enrollment, expressed in decimal form, where 1.00 represents a full-time enrollment."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 1.1
	 */
	public void setFTE( BigDecimal value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_FTE, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FTPTStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication of whether the student is enrolled full time or part time."</i><p>
	 *
	 *  @return The <code>FTPTStatus</code> element of this object.
	 *  @since 1.1
	 */
	public String getFTPTStatus() { 
		return getFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_FTPTSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;FTPTStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication of whether the student is enrolled full time or part time."</i><p>
	 *
	 *  @param value A constant defined by the <code>FTPTStatus</code> class
	 *  @since 1.1
	 */
	public void setFTPTStatus( FTPTStatus value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_FTPTSTATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;FTPTStatus&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication of whether the student is enrolled full time or part time."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setFTPTStatus( String value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_FTPTSTATUS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;RecordClosureReason&gt;</code> element.
	 *
	 *  @return The <code>RecordClosureReason</code> element of this object.
	 *  @since 2.3
	 */
	public String getRecordClosureReason() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_RECORDCLOSUREREASON );
	}

	/**
	 *  Sets the value of the <code>&lt;RecordClosureReason&gt;</code> element.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setRecordClosureReason( String value ) { 
		setFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_RECORDCLOSUREREASON, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ResidencyStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Location of an individual's legal residence relative to (within or outside) the boundaries of the school for this enrollment. Source: 0598 (Public School Residence Status) [NCESHandbooks]"</i><p>
	 *
	 *  @param value A <code>ResidencyStatus</code> object
	 *  @since 1.5r1
	 */
	public void setResidencyStatus( ResidencyStatus value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_RESIDENCYSTATUS );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_RESIDENCYSTATUS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ResidencyStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Location of an individual's legal residence relative to (within or outside) the boundaries of the school for this enrollment. Source: 0598 (Public School Residence Status) [NCESHandbooks]"</i><p>
	 *
	 *  @return A <code>ResidencyStatus</code> object
	 *  @since 1.5r1
	 */
	public ResidencyStatus getResidencyStatus() { 
		return (ResidencyStatus)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_RESIDENCYSTATUS);
	}

	/**
	 *  Removes the <code>ResidencyStatus</code> child element previously created by calling <code>setResidencyStatus</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeResidencyStatus() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_RESIDENCYSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;PromotionInfo&gt;</code> element.
	 *
	 *  @param value A <code>PromotionInfo</code> object
	 *  @since 2.3
	 */
	public void setPromotionInfo( PromotionInfo value ) { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_PROMOTIONINFO );
		addChild( StudentDTD.STUDENTSCHOOLENROLLMENT_PROMOTIONINFO, value);
	}

	/**
	 *  Gets the value of the <code>&lt;PromotionInfo&gt;</code> element.
	 *
	 *  @return A <code>PromotionInfo</code> object
	 *  @since 2.3
	 */
	public PromotionInfo getPromotionInfo() { 
		return (PromotionInfo)getChild( StudentDTD.STUDENTSCHOOLENROLLMENT_PROMOTIONINFO);
	}

	/**
	 *  Removes the <code>PromotionInfo</code> child element previously created by calling <code>setPromotionInfo</code>
	 *
	 *  @since 2.3
	 */
	public void removePromotionInfo() { 
		removeChild( StudentDTD.STUDENTSCHOOLENROLLMENT_PROMOTIONINFO );
	}

	/**
	 *  Gets the value of the <code>&lt;NonResidentAttendReason&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
        If the school represented by this enrollment is outside of the student's usual attendance area
        (as indicated in the ResidencyStatus element), this element indicates the reason that the student attends this school.
      "</i><p>
	 *
	 *  @return The <code>NonResidentAttendReason</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getNonResidentAttendReason() { 
		return getFieldValue( StudentDTD.STUDENTSCHOOLENROLLMENT_NONRESIDENTATTENDREASON );
	}

	/**
	 *  Sets the value of the <code>&lt;NonResidentAttendReason&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
        If the school represented by this enrollment is outside of the student's usual attendance area
        (as indicated in the ResidencyStatus element), this element indicates the reason that the student attends this school.
      "</i><p>
	 *
	 *  @param value A constant defined by the <code>NonResidentAttendRationale</code> class
	 *  @since 1.5r1
	 */
	public void setNonResidentAttendReason( NonResidentAttendRationale value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_NONRESIDENTATTENDREASON, value );
	}

	/**
	 *  Sets the value of the <code>&lt;NonResidentAttendReason&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
        If the school represented by this enrollment is outside of the student's usual attendance area
        (as indicated in the ResidencyStatus element), this element indicates the reason that the student attends this school.
      "</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setNonResidentAttendReason( String value ) { 
		setField( StudentDTD.STUDENTSCHOOLENROLLMENT_NONRESIDENTATTENDREASON, value );
	}


// BEGIN EXTRA METHODS (/Users/ajbrown/Projects/midas/OpenADK-java/adk-generator/../adk-generator/datadef/us/sif20/StudentSchoolEnrollment.txt)

	/**
	 * Computes the "TimeFrame" element based on the given dates using the guidelines 
	 * published in the SIF Specification. In order for this calculation to be accurate,
	 * the EntryDate and ExitDate, if applicable need to be set on this object before calling
	 * this method.
	 * 
	 * For clarity on exactly how this value is derived, here is the source 
	 * of this method:
	 * <blockquote>
	 * <pre>
	 * public TimeFrame computeTimeFrame( Calendar compareDate )
	 * {
	 * 	Calendar exitDate = getExitDate();
	 * 	Calendar entryDate = getEntryDate();
	 *
	 * 	TimeFrame tf = null;
	 * 	if( exitDate != null ) {
	 * 		if( compareDate.after(exitDate) ) {
	 * 			tf = TimeFrame.HISTORICAL;
	 * 		}
	 * 	}
	 * 	if( (tf == null) && entryDate != null) {
	 * 		if ((compareDate.before(entryDate) )) {
	 * 	    	 tf = TimeFrame.FUTURE;
	 * 	    } else {
	 * 	    	 tf = TimeFrame.CURRENT;
	 * 	    }
	 * 	}
	 *
	 * 	setTimeFrame( tf );
	 * 	return tf;
	 * }
	 * 
	 *</pre>
	 *</blockquote>
	 * @param compareDate The timestamp to base the calculation on. 
	 * For SIF_Requests, this must be the date of the SIF_Request, 
	 * and should be the value returned from {@link SIFMessageInfo#getTimestamp()}.
	 * For SIF_Events, this must be the timestamp of when the event is 
	 * going to be published, and can be the current time.
	 * @return The TimeFrame value that was computed and set as the TimeFrame
	 * of this StudentSchoolEnrollment object. If the TimeFrame cannot be computed
	 * because there is no EntryDate set, null will be returned.
	 */
	public TimeFrame computeTimeFrame( Calendar compareDate )
	{
		Calendar exitDate = getExitDate();
		Calendar entryDate = getEntryDate();
		
		TimeFrame tf = null;
		if( exitDate != null ) {
			if( compareDate.after(exitDate) ) {
				tf = TimeFrame.HISTORICAL;
			}
		}
		if( (tf == null) && entryDate != null) {
			if ((compareDate.before(entryDate) )) {
		    	 tf = TimeFrame.FUTURE;
		    } else {
		    	 tf = TimeFrame.CURRENT;
		    }
		}
		
		setTimeFrame( tf );
		return tf;
		
	}

// END EXTRA METHODS

}
