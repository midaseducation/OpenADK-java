// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

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
public class StudentScoreSet extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentScoreSet() {
		super( ADK.getSIFVersion(), AssessmentDTD.STUDENTSCORESET );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The GUID that uniquely identifies an instance of the object.
	 *  @param scoreMetric The metric or scale used to report the score.
	 *  @param assessmentAdministrationRefId The administration associated with this score set.
	 *  @param studentPersonalRefId The student associated with the response set.
	 */
	public StudentScoreSet( String refId, AssessmentReportingMethod scoreMetric, String assessmentAdministrationRefId, String studentPersonalRefId ) {
		super( ADK.getSIFVersion(), AssessmentDTD.STUDENTSCORESET );
		this.setRefId(refId);
		this.setScoreMetric( scoreMetric );
		this.setAssessmentAdministrationRefId(assessmentAdministrationRefId);
		this.setStudentPersonalRefId(studentPersonalRefId);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.STUDENTSCORESET_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.STUDENTSCORESET_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID that uniquely identifies an instance of the object."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.STUDENTSCORESET_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID that uniquely identifies an instance of the object."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setRefId( String value ) { 
		setFieldValue( AssessmentDTD.STUDENTSCORESET_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the score."</i><p>
	 *
	 *  @return The <code>ScoreMetric</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getScoreMetric() { 
		return getFieldValue( AssessmentDTD.STUDENTSCORESET_SCOREMETRIC );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the score."</i><p>
	 *
	 *  @param value A constant defined by the <code>AssessmentReportingMethod</code> class
	 *  @since 2.0
	 */
	public void setScoreMetric( AssessmentReportingMethod value ) { 
		setField( AssessmentDTD.STUDENTSCORESET_SCOREMETRIC, value );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the score."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setScoreMetric( String value ) { 
		setField( AssessmentDTD.STUDENTSCORESET_SCOREMETRIC, value );
	}

	/**
	 *  Gets the value of the <code>AssessmentAdministrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The administration associated with this score set."</i><p>
	 *
	 *  @return The <code>AssessmentAdministrationRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getAssessmentAdministrationRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.STUDENTSCORESET_ASSESSMENTADMINISTRATIONREFID );
	}

	/**
	 *  Sets the value of the <code>AssessmentAdministrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The administration associated with this score set."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setAssessmentAdministrationRefId( String value ) { 
		setFieldValue( AssessmentDTD.STUDENTSCORESET_ASSESSMENTADMINISTRATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The student associated with the response set."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.STUDENTSCORESET_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The student associated with the response set."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( AssessmentDTD.STUDENTSCORESET_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>AssessmentRegistrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The registration associated with this score set."</i><p>
	 *
	 *  @return The <code>AssessmentRegistrationRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getAssessmentRegistrationRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.STUDENTSCORESET_ASSESSMENTREGISTRATIONREFID );
	}

	/**
	 *  Sets the value of the <code>AssessmentRegistrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The registration associated with this score set."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setAssessmentRegistrationRefId( String value ) { 
		setFieldValue( AssessmentDTD.STUDENTSCORESET_ASSESSMENTREGISTRATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Scores&gt;</code> element.
	 *
	 *  @param value A <code>Scores</code> object
	 *  @since 2.0
	 */
	public void setScores( Scores value ) { 
		removeChild( AssessmentDTD.STUDENTSCORESET_SCORES );
		addChild( AssessmentDTD.STUDENTSCORESET_SCORES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Scores&gt;</code> element.
	 *
	 *  @return A <code>Scores</code> object
	 *  @since 2.0
	 */
	public Scores getScores() { 
		return (Scores)getChild( AssessmentDTD.STUDENTSCORESET_SCORES);
	}

	/**
	 *  Removes the <code>Scores</code> child element previously created by calling <code>setScores</code>
	 *
	 *  @since 2.0
	 */
	public void removeScores() { 
		removeChild( AssessmentDTD.STUDENTSCORESET_SCORES );
	}

}
