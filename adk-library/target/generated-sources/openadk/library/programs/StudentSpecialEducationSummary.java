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
 *  This object provides a summary of a student's participation and placement in special education programs for a given school for a given school year, reflecting the known or calculated values at the time (SummaryDate) the summary was provided. As such, there may be multiple instances of this object for a student in a school over the course of a school year. SIF_Events are not supported by this object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class StudentSpecialEducationSummary extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentSpecialEducationSummary() {
		super( ADK.getSIFVersion(), ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param studentPersonalRefId The Id (GUID) of the student for whom this special education information is being reported.
	 *  @param refId Key
	 *  @param summaryDate The date the data summary was taken. Some elements are provided/calculated as of the SummaryDate, and some are provided as of the date the object is requested (i.e., some can be historical and some will represent the last information available/last known value).
	 *  @param schoolYear School year for which the information is applicable.
	 */
	public StudentSpecialEducationSummary( String studentPersonalRefId, String refId, Calendar summaryDate, Integer schoolYear ) {
		super( ADK.getSIFVersion(), ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY );
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setRefId(refId);
		this.setSummaryDate(summaryDate);
		this.setSchoolYear(schoolYear);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_REFID };
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The Id (GUID) of the student for whom this special education information is being reported."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 2.4
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The Id (GUID) of the student for whom this special education information is being reported."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPERSONALREFID, new SIFString( value ), value );
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
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_REFID );
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
		setFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SummaryDate</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The date the data summary was taken. Some elements are provided/calculated as of the SummaryDate, and some are provided as of the date the object is requested (i.e., some can be historical and some will represent the last information available/last known value)."</i><p>
	 *
	 *  @return The <code>SummaryDate</code> attribute of this object.
	 *  @since 2.4
	 */
	public Calendar getSummaryDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_SUMMARYDATE );
	}

	/**
	 *  Sets the value of the <code>SummaryDate</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The date the data summary was taken. Some elements are provided/calculated as of the SummaryDate, and some are provided as of the date the object is requested (i.e., some can be historical and some will represent the last information available/last known value)."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.4
	 */
	public void setSummaryDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_SUMMARYDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year for which the information is applicable."</i><p>
	 *
	 *  @return The <code>SchoolYear</code> attribute of this object.
	 *  @since 2.4
	 */
	public Integer getSchoolYear() { 
		return (Integer) getSIFSimpleFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_SCHOOLYEAR );
	}

	/**
	 *  Sets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year for which the information is applicable."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.4
	 */
	public void setSchoolYear( Integer value ) { 
		setFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_SCHOOLYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentSpecialEducationFTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Calculated ratio of time the student is in a special ed setting. Values range from 0.00 to 1.00. If the student is in a special ed setting 25% of the time, the value is .25; if 100% of the time, the value is 1.00."</i><p>
	 *
	 *  @return The <code>StudentSpecialEducationFTE</code> element of this object.
	 *  @since 2.4
	 */
	public BigDecimal getStudentSpecialEducationFTE() { 
		return (BigDecimal) getSIFSimpleFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTSPECIALEDUCATIONFTE );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentSpecialEducationFTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Calculated ratio of time the student is in a special ed setting. Values range from 0.00 to 1.00. If the student is in a special ed setting 25% of the time, the value is .25; if 100% of the time, the value is 1.00."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.4
	 */
	public void setStudentSpecialEducationFTE( BigDecimal value ) { 
		setFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTSPECIALEDUCATIONFTE, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;PrimaryDisabilityCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code that identifies the primary disability type for a student who is eligible for services under the Individuals with Disabilities Education Act (IDEA) and who has an Individualized Education Program (IEP). Since primary disability is time-dependent a student’s primary disability can change through a school year or reporting period"</i><p>
	 *
	 *  @return The <code>PrimaryDisabilityCode</code> element of this object.
	 *  @since 2.4
	 */
	public String getPrimaryDisabilityCode() { 
		return getFieldValue( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_PRIMARYDISABILITYCODE );
	}

	/**
	 *  Sets the value of the <code>&lt;PrimaryDisabilityCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code that identifies the primary disability type for a student who is eligible for services under the Individuals with Disabilities Education Act (IDEA) and who has an Individualized Education Program (IEP). Since primary disability is time-dependent a student’s primary disability can change through a school year or reporting period"</i><p>
	 *
	 *  @param value A constant defined by the <code>NCES0768PrimaryDisabilityType</code> class
	 *  @since 2.4
	 */
	public void setPrimaryDisabilityCode( NCES0768PrimaryDisabilityType value ) { 
		setField( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_PRIMARYDISABILITYCODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;PrimaryDisabilityCode&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code that identifies the primary disability type for a student who is eligible for services under the Individuals with Disabilities Education Act (IDEA) and who has an Individualized Education Program (IEP). Since primary disability is time-dependent a student’s primary disability can change through a school year or reporting period"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.4
	 */
	public void setPrimaryDisabilityCode( String value ) { 
		setField( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_PRIMARYDISABILITYCODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;NeglectedOrDelinquentParticipationList&gt;</code> element.
	 *
	 *  @param value A <code>NeglectedOrDelinquentParticipationList</code> object
	 *  @since 2.4
	 */
	public void setNeglectedOrDelinquentParticipationList( NeglectedOrDelinquentParticipationList value ) { 
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_NEGLECTEDORDELINQUENTPARTICIPATIONLIST );
		addChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_NEGLECTEDORDELINQUENTPARTICIPATIONLIST, value);
	}

	/**
	 *  Sets the value of the <code>&lt;NeglectedOrDelinquentParticipationList&gt;</code> child element.
	 *  This form of <code>setNeglectedOrDelinquentParticipationList</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setNeglectedOrDelinquentParticipationList</code>
	 *  that accepts a single <code>NeglectedOrDelinquentParticipationList</code> object.
	 *
	 *  @param neglectedOrDelinquentParticipation The type and number of days a student participated in a Neglected or Delinquent program during the reporting period.
	 *  @since 2.4
	 */
	public void setNeglectedOrDelinquentParticipationList( NeglectedOrDelinquentParticipation neglectedOrDelinquentParticipation ) {
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_NEGLECTEDORDELINQUENTPARTICIPATIONLIST);
		addChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_NEGLECTEDORDELINQUENTPARTICIPATIONLIST, new NeglectedOrDelinquentParticipationList( neglectedOrDelinquentParticipation ) );
	}

	/**
	 *  Gets the value of the <code>&lt;NeglectedOrDelinquentParticipationList&gt;</code> element.
	 *
	 *  @return A <code>NeglectedOrDelinquentParticipationList</code> object
	 *  @since 2.4
	 */
	public NeglectedOrDelinquentParticipationList getNeglectedOrDelinquentParticipationList() { 
		return (NeglectedOrDelinquentParticipationList)getChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_NEGLECTEDORDELINQUENTPARTICIPATIONLIST);
	}

	/**
	 *  Removes the <code>NeglectedOrDelinquentParticipationList</code> child element previously created by calling <code>setNeglectedOrDelinquentParticipationList</code>
	 *
	 *  @since 2.4
	 */
	public void removeNeglectedOrDelinquentParticipationList() { 
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_NEGLECTEDORDELINQUENTPARTICIPATIONLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentParticipationList&gt;</code> element.
	 *
	 *  @param value A <code>StudentParticipationList</code> object
	 *  @since 2.4
	 */
	public void setStudentParticipationList( StudentParticipationList value ) { 
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPARTICIPATIONLIST );
		addChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPARTICIPATIONLIST, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentParticipationList&gt;</code> child element.
	 *  This form of <code>setStudentParticipationList</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentParticipationList</code>
	 *  that accepts a single <code>StudentParticipationList</code> object.
	 *
	 *  @param studentParticipationData Collects elements of interest for each StudentParticipation.
	 *  @since 2.4
	 */
	public void setStudentParticipationList( StudentParticipationDataElement studentParticipationData ) {
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPARTICIPATIONLIST);
		addChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPARTICIPATIONLIST, new StudentParticipationList( studentParticipationData ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentParticipationList&gt;</code> element.
	 *
	 *  @return A <code>StudentParticipationList</code> object
	 *  @since 2.4
	 */
	public StudentParticipationList getStudentParticipationList() { 
		return (StudentParticipationList)getChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPARTICIPATIONLIST);
	}

	/**
	 *  Removes the <code>StudentParticipationList</code> child element previously created by calling <code>setStudentParticipationList</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentParticipationList() { 
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPARTICIPATIONLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentPlacementList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This list contains information that describes each specific instructional, related or transitional service that has been prescribed or recommended in the program plan developed for a student who has been placed in an individualized special program."</i><p>
	 *
	 *  @param value A <code>StudentPlacementList</code> object
	 *  @since 2.4
	 */
	public void setStudentPlacementList( StudentPlacementList value ) { 
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPLACEMENTLIST );
		addChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPLACEMENTLIST, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentPlacementList&gt;</code> child element.
	 *  This form of <code>setStudentPlacementList</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentPlacementList</code>
	 *  that accepts a single <code>StudentPlacementList</code> object.
	 *
	 *  @param studentPlacementData Collects elements of interest for each StudentPlacement.
	 *  @since 2.4
	 */
	public void setStudentPlacementList( StudentPlacementData studentPlacementData ) {
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPLACEMENTLIST);
		addChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPLACEMENTLIST, new StudentPlacementList( studentPlacementData ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentPlacementList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This list contains information that describes each specific instructional, related or transitional service that has been prescribed or recommended in the program plan developed for a student who has been placed in an individualized special program."</i><p>
	 *
	 *  @return A <code>StudentPlacementList</code> object
	 *  @since 2.4
	 */
	public StudentPlacementList getStudentPlacementList() { 
		return (StudentPlacementList)getChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPLACEMENTLIST);
	}

	/**
	 *  Removes the <code>StudentPlacementList</code> child element previously created by calling <code>setStudentPlacementList</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentPlacementList() { 
		removeChild( ProgramsDTD.STUDENTSPECIALEDUCATIONSUMMARY_STUDENTPLACEMENTLIST );
	}

}
