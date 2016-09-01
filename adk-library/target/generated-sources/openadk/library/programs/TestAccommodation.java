// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

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
public class TestAccommodation extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public TestAccommodation() {
		super( ADK.getSIFVersion(), ProgramsDTD.TESTACCOMMODATION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId Unique ID for this set of test accommodations required for a particular student who is participating in a special program and for whom this set of test accommodation(s) is recommended / prescribed for this test administration (specific subject area and level) in a specific special programs plan.
	 */
	public TestAccommodation( String refId ) {
		super( ADK.getSIFVersion(), ProgramsDTD.TESTACCOMMODATION );
		this.setRefId(refId);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProgramsDTD.TESTACCOMMODATION_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProgramsDTD.TESTACCOMMODATION_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Unique ID for this set of test accommodations required for a particular student who is participating in a special program and for whom this set of test accommodation(s) is recommended / prescribed for this test administration (specific subject area and level) in a specific special programs plan."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Unique ID for this set of test accommodations required for a particular student who is participating in a special program and for whom this set of test accommodation(s) is recommended / prescribed for this test administration (specific subject area and level) in a specific special programs plan."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setRefId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentPersonalRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to StudentPersonal object.  Typically a vendor is allowed to receive a StatePrId or a StudentName, but not both together.  The student must be identified by StudentPersonalRefId, or StudentName and LocalId, or StateStudentId."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentPersonalRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to StudentPersonal object.  Typically a vendor is allowed to receive a StatePrId or a StudentName, but not both together.  The student must be identified by StudentPersonalRefId, or StudentName and LocalId, or StateStudentId."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The student's name as presented in StudentPersonal object, Name element with a Type of 02 (Current Legal Name).  If Type 02 is not available, Type of 04 (Name of Record)"</i><p>
	 *
	 *  @param value A <code>Name</code> object
	 *  @since 2.0
	 */
	public void setName( Name value ) { 
		removeChild( ProgramsDTD.TESTACCOMMODATION_NAME );
		addChild( ProgramsDTD.TESTACCOMMODATION_NAME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> child element.
	 *  This form of <code>setName</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setName</code>
	 *  that accepts a single <code>Name</code> object.
	 *
	 *  @param type Code that specifies what type of name this is.  If unsure, use 04.
	 *  @param lastName The last name.
	 *  @param firstName The first name.
	 *  @since 2.0
	 */
	public void setName( NameType type, String lastName, String firstName ) {
		removeChild( ProgramsDTD.TESTACCOMMODATION_NAME);
		addChild( ProgramsDTD.TESTACCOMMODATION_NAME, new Name( type, lastName, firstName ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The student's name as presented in StudentPersonal object, Name element with a Type of 02 (Current Legal Name).  If Type 02 is not available, Type of 04 (Name of Record)"</i><p>
	 *
	 *  @return A <code>Name</code> object
	 *  @since 2.0
	 */
	public Name getName() { 
		return (Name)getChild( ProgramsDTD.TESTACCOMMODATION_NAME);
	}

	/**
	 *  Removes the <code>Name</code> child element previously created by calling <code>setName</code>
	 *
	 *  @since 2.0
	 */
	public void removeName() { 
		removeChild( ProgramsDTD.TESTACCOMMODATION_NAME );
	}

	/**
	 *  Gets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally assigned identifier for this student."</i><p>
	 *
	 *  @return The <code>LocalId</code> element of this object.
	 *  @since 2.0
	 */
	public String getLocalId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_LOCALID );
	}

	/**
	 *  Sets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally assigned identifier for this student."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setLocalId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_LOCALID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to the state code identifying the student in the StudentPersonal object, as of the date of the response."</i><p>
	 *
	 *  @return The <code>StateProvinceId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStateProvinceId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_STATEPROVINCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to the state code identifying the student in the StudentPersonal object, as of the date of the response."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStateProvinceId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_STATEPROVINCEID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateDistrictId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to State code (StatePrId for LEAInfo) for the student's district of enrollment as of the date of the response (optional because school might be independent)."</i><p>
	 *
	 *  @return The <code>StateDistrictId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStateDistrictId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_STATEDISTRICTID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateDistrictId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to State code (StatePrId for LEAInfo) for the student's district of enrollment as of the date of the response (optional because school might be independent)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStateDistrictId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_STATEDISTRICTID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;LEAInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The RefId for the district to which the student's home school of enrollment belongs as of the date of the response (optional because school might be independent)."</i><p>
	 *
	 *  @return The <code>LEAInfoRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getLEAInfoRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_LEAINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;LEAInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The RefId for the district to which the student's home school of enrollment belongs as of the date of the response (optional because school might be independent)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setLEAInfoRefId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_LEAINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The RefId for the student's home school of enrollment as of the date of the response."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The RefId for the student's home school of enrollment as of the date of the response."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateSchoolId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to State code (StatePrId for SchoolInfo) for student's home school of enrollment as of the date of the response (optional because state may not require)."</i><p>
	 *
	 *  @return The <code>StateSchoolId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStateSchoolId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_STATESCHOOLID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateSchoolId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to State code (StatePrId for SchoolInfo) for student's home school of enrollment as of the date of the response (optional because state may not require)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStateSchoolId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_STATESCHOOLID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code for the current actual grade placement of the student as of the date of the response  from StudentSchoolEnrollment."</i><p>
	 *
	 *  @param value A <code>GradeLevel</code> object
	 *  @since 2.0
	 */
	public void setGradeLevel( GradeLevel value ) { 
		removeChild( ProgramsDTD.TESTACCOMMODATION_GRADELEVEL );
		addChild( ProgramsDTD.TESTACCOMMODATION_GRADELEVEL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> child element.
	 *  This form of <code>setGradeLevel</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGradeLevel</code>
	 *  that accepts a single <code>GradeLevel</code> object.
	 *
	 *  @param code Code representing the grade level.
	 *  @since 2.0
	 */
	public void setGradeLevel( GradeLevelCode code ) {
		removeChild( ProgramsDTD.TESTACCOMMODATION_GRADELEVEL);
		addChild( ProgramsDTD.TESTACCOMMODATION_GRADELEVEL, new GradeLevel( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code for the current actual grade placement of the student as of the date of the response  from StudentSchoolEnrollment."</i><p>
	 *
	 *  @return A <code>GradeLevel</code> object
	 *  @since 2.0
	 */
	public GradeLevel getGradeLevel() { 
		return (GradeLevel)getChild( ProgramsDTD.TESTACCOMMODATION_GRADELEVEL);
	}

	/**
	 *  Removes the <code>GradeLevel</code> child element previously created by calling <code>setGradeLevel</code>
	 *
	 *  @since 2.0
	 */
	public void removeGradeLevel() { 
		removeChild( ProgramsDTD.TESTACCOMMODATION_GRADELEVEL );
	}

	/**
	 *  Gets the value of the <code>&lt;AssessmentRegistrationRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"RefId for the student's registration / assignment to take a particular test (test name, subject area, level, grade level, type) at a particular time or within a particular timeframe.  An assessment may also be identified by omitting this element and specifying the whole set (TestAdministration, TestSubjectArea, TestGradeLevel, TestAdministrationDateRange or PlannedTestAdministrationDate, and TestType)."</i><p>
	 *
	 *  @return The <code>AssessmentRegistrationRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getAssessmentRegistrationRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_ASSESSMENTREGISTRATIONREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;AssessmentRegistrationRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"RefId for the student's registration / assignment to take a particular test (test name, subject area, level, grade level, type) at a particular time or within a particular timeframe.  An assessment may also be identified by omitting this element and specifying the whole set (TestAdministration, TestSubjectArea, TestGradeLevel, TestAdministrationDateRange or PlannedTestAdministrationDate, and TestType)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setAssessmentRegistrationRefId( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_ASSESSMENTREGISTRATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TestAdministration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Abbreviated name of the test for which this set of accommodations is to be provided."</i><p>
	 *
	 *  @return The <code>TestAdministration</code> element of this object.
	 *  @since 2.0
	 */
	public String getTestAdministration() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTADMINISTRATION );
	}

	/**
	 *  Sets the value of the <code>&lt;TestAdministration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Abbreviated name of the test for which this set of accommodations is to be provided."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setTestAdministration( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTADMINISTRATION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TestSubjectArea&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Subject area of the test.  Teachers may only supply this element, while a high-stakes test will supply the whole set (TestAdministration, TestSubjectArea, TestGradeLevel, TestAdministrationDateRange or PlannedTestAdministrationDate, and TestType)."</i><p>
	 *
	 *  @return The <code>TestSubjectArea</code> element of this object.
	 *  @since 2.0
	 */
	public String getTestSubjectArea() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTSUBJECTAREA );
	}

	/**
	 *  Sets the value of the <code>&lt;TestSubjectArea&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Subject area of the test.  Teachers may only supply this element, while a high-stakes test will supply the whole set (TestAdministration, TestSubjectArea, TestGradeLevel, TestAdministrationDateRange or PlannedTestAdministrationDate, and TestType)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setTestSubjectArea( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTSUBJECTAREA, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TestGradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade level of the test."</i><p>
	 *
	 *  @return The <code>TestGradeLevel</code> element of this object.
	 *  @since 2.0
	 */
	public String getTestGradeLevel() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTGRADELEVEL );
	}

	/**
	 *  Sets the value of the <code>&lt;TestGradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade level of the test."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setTestGradeLevel( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTGRADELEVEL, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TestAdministrationDateRange&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"General date range of the test (e.g. "Spring 2005").  Date is identified by either TestAdministrationDateRange or PlannedTestAdministrationDate"</i><p>
	 *
	 *  @return The <code>TestAdministrationDateRange</code> element of this object.
	 *  @since 2.0
	 */
	public String getTestAdministrationDateRange() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTADMINISTRATIONDATERANGE );
	}

	/**
	 *  Sets the value of the <code>&lt;TestAdministrationDateRange&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"General date range of the test (e.g. "Spring 2005").  Date is identified by either TestAdministrationDateRange or PlannedTestAdministrationDate"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setTestAdministrationDateRange( String value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTADMINISTRATIONDATERANGE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;PlannedTestAdministrationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date the test is planned to be administered.  Should contain the most current known date (Date is needed in order to identify accommodations to be sent -- accommodations are date-dependent)."</i><p>
	 *
	 *  @return The <code>PlannedTestAdministrationDate</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getPlannedTestAdministrationDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_PLANNEDTESTADMINISTRATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;PlannedTestAdministrationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date the test is planned to be administered.  Should contain the most current known date (Date is needed in order to identify accommodations to be sent -- accommodations are date-dependent)."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setPlannedTestAdministrationDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_PLANNEDTESTADMINISTRATIONDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TestType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies whether the test the student is to take is a standard or alternate."</i><p>
	 *
	 *  @return The <code>TestType</code> element of this object.
	 *  @since 2.0
	 */
	public String getTestType() { 
		return getFieldValue( ProgramsDTD.TESTACCOMMODATION_TESTTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;TestType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies whether the test the student is to take is a standard or alternate."</i><p>
	 *
	 *  @param value A constant defined by the <code>TestType</code> class
	 *  @since 2.0
	 */
	public void setTestType( TestType value ) { 
		setField( ProgramsDTD.TESTACCOMMODATION_TESTTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;TestType&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies whether the test the student is to take is a standard or alternate."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setTestType( String value ) { 
		setField( ProgramsDTD.TESTACCOMMODATION_TESTTYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;AuthorizedActual&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicator - Identifies whether accommodations in this object are authorized or were actually used."</i><p>
	 *
	 *  @return The <code>AuthorizedActual</code> element of this object.
	 *  @since 2.0
	 */
	public String getAuthorizedActual() { 
		return getFieldValue( ProgramsDTD.TESTACCOMMODATION_AUTHORIZEDACTUAL );
	}

	/**
	 *  Sets the value of the <code>&lt;AuthorizedActual&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicator - Identifies whether accommodations in this object are authorized or were actually used."</i><p>
	 *
	 *  @param value A constant defined by the <code>AuthorizedActual</code> class
	 *  @since 2.0
	 */
	public void setAuthorizedActual( AuthorizedActual value ) { 
		setField( ProgramsDTD.TESTACCOMMODATION_AUTHORIZEDACTUAL, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AuthorizedActual&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicator - Identifies whether accommodations in this object are authorized or were actually used."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setAuthorizedActual( String value ) { 
		setField( ProgramsDTD.TESTACCOMMODATION_AUTHORIZEDACTUAL, value );
	}

	/**
	 *  Gets the value of the <code>&lt;ActualTestAdministrationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date the test was actually administered."</i><p>
	 *
	 *  @return The <code>ActualTestAdministrationDate</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getActualTestAdministrationDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.TESTACCOMMODATION_ACTUALTESTADMINISTRATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;ActualTestAdministrationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date the test was actually administered."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setActualTestAdministrationDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.TESTACCOMMODATION_ACTUALTESTADMINISTRATIONDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentProgramAccommodations&gt;</code> element.
	 *
	 *  @param value A <code>StudentProgramAccommodations</code> object
	 *  @since 2.0
	 */
	public void setStudentProgramAccommodations( StudentProgramAccommodations value ) { 
		removeChild( ProgramsDTD.TESTACCOMMODATION_STUDENTPROGRAMACCOMMODATIONS );
		addChild( ProgramsDTD.TESTACCOMMODATION_STUDENTPROGRAMACCOMMODATIONS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;StudentProgramAccommodations&gt;</code> element.
	 *
	 *  @return A <code>StudentProgramAccommodations</code> object
	 *  @since 2.0
	 */
	public StudentProgramAccommodations getStudentProgramAccommodations() { 
		return (StudentProgramAccommodations)getChild( ProgramsDTD.TESTACCOMMODATION_STUDENTPROGRAMACCOMMODATIONS);
	}

	/**
	 *  Removes the <code>StudentProgramAccommodations</code> child element previously created by calling <code>setStudentProgramAccommodations</code>
	 *
	 *  @since 2.0
	 */
	public void removeStudentProgramAccommodations() { 
		removeChild( ProgramsDTD.TESTACCOMMODATION_STUDENTPROGRAMACCOMMODATIONS );
	}

}