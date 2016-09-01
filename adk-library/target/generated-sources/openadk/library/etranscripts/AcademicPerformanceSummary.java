// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.etranscripts;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.gradebook.*;
import openadk.library.student.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class AcademicPerformanceSummary extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AcademicPerformanceSummary() {
		super( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY );
	}

	/**
	 *  Gets the value of the <code>&lt;TotalCreditsAttempted&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total credits attempted during academic career."</i><p>
	 *
	 *  @return The <code>TotalCreditsAttempted</code> element of this object.
	 *  @since 2.0
	 */
	public BigDecimal getTotalCreditsAttempted() { 
		return (BigDecimal) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_TOTALCREDITSATTEMPTED );
	}

	/**
	 *  Sets the value of the <code>&lt;TotalCreditsAttempted&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total credits attempted during academic career."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.0
	 */
	public void setTotalCreditsAttempted( BigDecimal value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_TOTALCREDITSATTEMPTED, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TotalCreditsEarned&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total credits earned during academic career."</i><p>
	 *
	 *  @return The <code>TotalCreditsEarned</code> element of this object.
	 *  @since 2.0
	 */
	public BigDecimal getTotalCreditsEarned() { 
		return (BigDecimal) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_TOTALCREDITSEARNED );
	}

	/**
	 *  Sets the value of the <code>&lt;TotalCreditsEarned&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total credits earned during academic career."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.0
	 */
	public void setTotalCreditsEarned( BigDecimal value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_TOTALCREDITSEARNED, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;CumulativeGPACreditsEarned&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Cumulative number of GPA credits earned during academic career."</i><p>
	 *
	 *  @return The <code>CumulativeGPACreditsEarned</code> element of this object.
	 *  @since 2.0
	 */
	public BigDecimal getCumulativeGPACreditsEarned() { 
		return (BigDecimal) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CUMULATIVEGPACREDITSEARNED );
	}

	/**
	 *  Sets the value of the <code>&lt;CumulativeGPACreditsEarned&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Cumulative number of GPA credits earned during academic career."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.0
	 */
	public void setCumulativeGPACreditsEarned( BigDecimal value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CUMULATIVEGPACREDITSEARNED, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;CumulativeGradePoints&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Cumulative number of grade points earned during academic career."</i><p>
	 *
	 *  @return The <code>CumulativeGradePoints</code> element of this object.
	 *  @since 2.0
	 */
	public BigDecimal getCumulativeGradePoints() { 
		return (BigDecimal) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CUMULATIVEGRADEPOINTS );
	}

	/**
	 *  Sets the value of the <code>&lt;CumulativeGradePoints&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Cumulative number of grade points earned during academic career."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.0
	 */
	public void setCumulativeGradePoints( BigDecimal value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CUMULATIVEGRADEPOINTS, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;CumulativeGPA&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Cumulative grade point average for academic career."</i><p>
	 *
	 *  @return The <code>CumulativeGPA</code> element of this object.
	 *  @since 2.0
	 */
	public BigDecimal getCumulativeGPA() { 
		return (BigDecimal) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CUMULATIVEGPA );
	}

	/**
	 *  Sets the value of the <code>&lt;CumulativeGPA&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Cumulative grade point average for academic career."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.0
	 */
	public void setCumulativeGPA( BigDecimal value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CUMULATIVEGPA, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;GPAType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Brief name/description of type of GPA."</i><p>
	 *
	 *  @return The <code>GPAType</code> element of this object.
	 *  @since 2.0
	 */
	public String getGPAType() { 
		return (String) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GPATYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;GPAType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Brief name/description of type of GPA."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setGPAType( String value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GPATYPE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ClassRank&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Student's rank in graduating class."</i><p>
	 *
	 *  @return The <code>ClassRank</code> element of this object.
	 *  @since 2.0
	 */
	public Integer getClassRank() { 
		return (Integer) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANK );
	}

	/**
	 *  Sets the value of the <code>&lt;ClassRank&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Student's rank in graduating class."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setClassRank( Integer value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANK, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ClassTotalNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total number of students in student's graduating class."</i><p>
	 *
	 *  @return The <code>ClassTotalNumber</code> element of this object.
	 *  @since 2.0
	 */
	public Integer getClassTotalNumber() { 
		return (Integer) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSTOTALNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;ClassTotalNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total number of students in student's graduating class."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setClassTotalNumber( Integer value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSTOTALNUMBER, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ClassRankingDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date class ranking was determined."</i><p>
	 *
	 *  @param value A <code>PartialDateType</code> object
	 *  @since 2.0
	 */
	public void setClassRankingDate( PartialDateType value ) { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANKINGDATE );
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANKINGDATE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ClassRankingDate&gt;</code> child element.
	 *  This form of <code>setClassRankingDate</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setClassRankingDate</code>
	 *  that accepts a single <code>PartialDateType</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;PartialDateType&gt; element
	 *  @since 2.0
	 */
	public void setClassRankingDate( String value ) {
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANKINGDATE);
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANKINGDATE, new PartialDateType( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ClassRankingDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date class ranking was determined."</i><p>
	 *
	 *  @return A <code>PartialDateType</code> object
	 *  @since 2.0
	 */
	public PartialDateType getClassRankingDate() { 
		return (PartialDateType)getChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANKINGDATE);
	}

	/**
	 *  Removes the <code>ClassRankingDate</code> child element previously created by calling <code>setClassRankingDate</code>
	 *
	 *  @since 2.0
	 */
	public void removeClassRankingDate() { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_CLASSRANKINGDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;ProjectedGraduationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Projected graduation date."</i><p>
	 *
	 *  @param value A <code>PartialDateType</code> object
	 *  @since 2.0
	 */
	public void setProjectedGraduationDate( PartialDateType value ) { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_PROJECTEDGRADUATIONDATE );
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_PROJECTEDGRADUATIONDATE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ProjectedGraduationDate&gt;</code> child element.
	 *  This form of <code>setProjectedGraduationDate</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setProjectedGraduationDate</code>
	 *  that accepts a single <code>PartialDateType</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;PartialDateType&gt; element
	 *  @since 2.0
	 */
	public void setProjectedGraduationDate( String value ) {
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_PROJECTEDGRADUATIONDATE);
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_PROJECTEDGRADUATIONDATE, new PartialDateType( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ProjectedGraduationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Projected graduation date."</i><p>
	 *
	 *  @return A <code>PartialDateType</code> object
	 *  @since 2.0
	 */
	public PartialDateType getProjectedGraduationDate() { 
		return (PartialDateType)getChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_PROJECTEDGRADUATIONDATE);
	}

	/**
	 *  Removes the <code>ProjectedGraduationDate</code> child element previously created by calling <code>setProjectedGraduationDate</code>
	 *
	 *  @since 2.0
	 */
	public void removeProjectedGraduationDate() { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_PROJECTEDGRADUATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;GraduationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Note: Mandatory if graduated.  Graduation date."</i><p>
	 *
	 *  @param value A <code>PartialDateType</code> object
	 *  @since 2.0
	 */
	public void setGraduationDate( PartialDateType value ) { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDATE );
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDATE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GraduationDate&gt;</code> child element.
	 *  This form of <code>setGraduationDate</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGraduationDate</code>
	 *  that accepts a single <code>PartialDateType</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;PartialDateType&gt; element
	 *  @since 2.0
	 */
	public void setGraduationDate( String value ) {
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDATE);
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDATE, new PartialDateType( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GraduationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Note: Mandatory if graduated.  Graduation date."</i><p>
	 *
	 *  @return A <code>PartialDateType</code> object
	 *  @since 2.0
	 */
	public PartialDateType getGraduationDate() { 
		return (PartialDateType)getChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDATE);
	}

	/**
	 *  Removes the <code>GraduationDate</code> child element previously created by calling <code>setGraduationDate</code>
	 *
	 *  @since 2.0
	 */
	public void removeGraduationDate() { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDATE );
	}

	/**
	 *  Gets the value of the <code>&lt;GraduationDiplomaType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Note: Mandatory if graduated.  Type of diploma earned."</i><p>
	 *
	 *  @return The <code>GraduationDiplomaType</code> element of this object.
	 *  @since 2.0
	 */
	public String getGraduationDiplomaType() { 
		return (String) getSIFSimpleFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDIPLOMATYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;GraduationDiplomaType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Note: Mandatory if graduated.  Type of diploma earned."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setGraduationDiplomaType( String value ) { 
		setFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_GRADUATIONDIPLOMATYPE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AcademicTrack&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication of the general nature and difficulty of instruction provided throughout a course."</i><p>
	 *
	 *  @return The <code>AcademicTrack</code> element of this object.
	 *  @since 2.0
	 */
	public String getAcademicTrack() { 
		return getFieldValue( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICTRACK );
	}

	/**
	 *  Sets the value of the <code>&lt;AcademicTrack&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication of the general nature and difficulty of instruction provided throughout a course."</i><p>
	 *
	 *  @param value A constant defined by the <code>InstructionalLevelCode</code> class
	 *  @since 2.0
	 */
	public void setAcademicTrack( InstructionalLevelCode value ) { 
		setField( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICTRACK, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AcademicTrack&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication of the general nature and difficulty of instruction provided throughout a course."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setAcademicTrack( String value ) { 
		setField( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICTRACK, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AcademicFoci&gt;</code> element.
	 *
	 *  @param value A <code>AcademicFoci</code> object
	 *  @since 2.2
	 */
	public void setAcademicFoci( AcademicFoci value ) { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICFOCI );
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICFOCI, value);
	}

	/**
	 *  Gets the value of the <code>&lt;AcademicFoci&gt;</code> element.
	 *
	 *  @return An <code>AcademicFoci</code> object
	 *  @since 2.2
	 */
	public AcademicFoci getAcademicFoci() { 
		return (AcademicFoci)getChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICFOCI);
	}

	/**
	 *  Removes the <code>AcademicFoci</code> child element previously created by calling <code>setAcademicFoci</code>
	 *
	 *  @since 2.2
	 */
	public void removeAcademicFoci() { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICFOCI );
	}

	/**
	 *  Sets the value of the <code>&lt;AcademicSubjects&gt;</code> element.
	 *
	 *  @param value A <code>AcademicSubjects</code> object
	 *  @since 2.2
	 */
	public void setAcademicSubjects( AcademicSubjects value ) { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICSUBJECTS );
		addChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICSUBJECTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;AcademicSubjects&gt;</code> element.
	 *
	 *  @return An <code>AcademicSubjects</code> object
	 *  @since 2.2
	 */
	public AcademicSubjects getAcademicSubjects() { 
		return (AcademicSubjects)getChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICSUBJECTS);
	}

	/**
	 *  Removes the <code>AcademicSubjects</code> child element previously created by calling <code>setAcademicSubjects</code>
	 *
	 *  @since 2.2
	 */
	public void removeAcademicSubjects() { 
		removeChild( EtranscriptsDTD.ACADEMICPERFORMANCESUMMARY_ACADEMICSUBJECTS );
	}

}
