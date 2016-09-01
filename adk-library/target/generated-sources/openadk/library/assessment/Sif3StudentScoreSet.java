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
 *  @since 2.6
 */
public class Sif3StudentScoreSet extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Sif3StudentScoreSet() {
		super( ADK.getSIFVersion(), AssessmentDTD.SIF3STUDENTSCORESET );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The GUID that uniquely identifies an instance of the object.
	 *  @param scoreMetric The metric or scale used to report the score.
	 *  @param assessmentAdministrationRefId The administration associated with this score set.
	 *  @param studentPersonalRefId The student associated with the response set.
	 *  @param scoresSif3 
	 */
	public Sif3StudentScoreSet( String refId, AssessmentReportingMethod scoreMetric, String assessmentAdministrationRefId, String studentPersonalRefId, ScoresSif3 scoresSif3 ) {
		super( ADK.getSIFVersion(), AssessmentDTD.SIF3STUDENTSCORESET );
		this.setRefId(refId);
		this.setScoreMetric( scoreMetric );
		this.setAssessmentAdministrationRefId(assessmentAdministrationRefId);
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setScoresSif3(scoresSif3);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.SIF3STUDENTSCORESET_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID that uniquely identifies an instance of the object."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID that uniquely identifies an instance of the object."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setRefId( String value ) { 
		setFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the score."</i><p>
	 *
	 *  @return The <code>ScoreMetric</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getScoreMetric() { 
		return getFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_SCOREMETRIC );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the score."</i><p>
	 *
	 *  @param value A constant defined by the <code>AssessmentReportingMethod</code> class
	 *  @since 2.6
	 */
	public void setScoreMetric( AssessmentReportingMethod value ) { 
		setField( AssessmentDTD.SIF3STUDENTSCORESET_SCOREMETRIC, value );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the score."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setScoreMetric( String value ) { 
		setField( AssessmentDTD.SIF3STUDENTSCORESET_SCOREMETRIC, value );
	}

	/**
	 *  Gets the value of the <code>AssessmentAdministrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The administration associated with this score set."</i><p>
	 *
	 *  @return The <code>AssessmentAdministrationRefId</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getAssessmentAdministrationRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_ASSESSMENTADMINISTRATIONREFID );
	}

	/**
	 *  Sets the value of the <code>AssessmentAdministrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The administration associated with this score set."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setAssessmentAdministrationRefId( String value ) { 
		setFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_ASSESSMENTADMINISTRATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The student associated with the response set."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The student associated with the response set."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>AssessmentRegistrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The registration associated with this score set."</i><p>
	 *
	 *  @return The <code>AssessmentRegistrationRefId</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getAssessmentRegistrationRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_ASSESSMENTREGISTRATIONREFID );
	}

	/**
	 *  Sets the value of the <code>AssessmentRegistrationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The registration associated with this score set."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setAssessmentRegistrationRefId( String value ) { 
		setFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_ASSESSMENTREGISTRATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ScoresSif3&gt;</code> element.
	 *
	 *  @param value A <code>ScoresSif3</code> object
	 *  @since 2.6
	 */
	public void setScoresSif3( ScoresSif3 value ) { 
		removeChild( AssessmentDTD.SIF3STUDENTSCORESET_SCORESSIF3 );
		addChild( AssessmentDTD.SIF3STUDENTSCORESET_SCORESSIF3, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ScoresSif3&gt;</code> element.
	 *
	 *  @return A <code>ScoresSif3</code> object
	 *  @since 2.6
	 */
	public ScoresSif3 getScoresSif3() { 
		return (ScoresSif3)getChild( AssessmentDTD.SIF3STUDENTSCORESET_SCORESSIF3);
	}

	/**
	 *  Removes the <code>ScoresSif3</code> child element previously created by calling <code>setScoresSif3</code>
	 *
	 *  @since 2.6
	 */
	public void removeScoresSif3() { 
		removeChild( AssessmentDTD.SIF3STUDENTSCORESET_SCORESSIF3 );
	}

	/**
	 *  Gets the value of the <code>&lt;PassFailIndicator&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the score value also determines a pass/fail level, then this indicator will specify the value."</i><p>
	 *
	 *  @return The <code>PassFailIndicator</code> element of this object.
	 *  @since 2.6
	 */
	public String getPassFailIndicator() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_PASSFAILINDICATOR );
	}

	/**
	 *  Sets the value of the <code>&lt;PassFailIndicator&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the score value also determines a pass/fail level, then this indicator will specify the value."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setPassFailIndicator( String value ) { 
		setFieldValue( AssessmentDTD.SIF3STUDENTSCORESET_PASSFAILINDICATOR, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;FeedbackItemsSif3StudentScoreSet&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This list will support providing feedback to the student from multiple sources."</i><p>
	 *
	 *  @param value A <code>FeedbackItemsSif3StudentScoreSet</code> object
	 *  @since 2.6
	 */
	public void setFeedbackItemsSif3StudentScoreSet( FeedbackItemsSif3StudentScoreSet value ) { 
		removeChild( AssessmentDTD.SIF3STUDENTSCORESET_FEEDBACKITEMSSIF3STUDENTSCORESET );
		addChild( AssessmentDTD.SIF3STUDENTSCORESET_FEEDBACKITEMSSIF3STUDENTSCORESET, value);
	}

	/**
	 *  Sets the value of the <code>&lt;FeedbackItemsSif3StudentScoreSet&gt;</code> child element.
	 *  This form of <code>setFeedbackItemsSif3StudentScoreSet</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setFeedbackItemsSif3StudentScoreSet</code>
	 *  that accepts a single <code>FeedbackItemsSif3StudentScoreSet</code> object.
	 *
	 *  @param feedbackItemSif3StudentScoreSet 
	 *  @since 2.6
	 */
	public void setFeedbackItemsSif3StudentScoreSet( FeedbackItemSif3StudentScoreSet feedbackItemSif3StudentScoreSet ) {
		removeChild( AssessmentDTD.SIF3STUDENTSCORESET_FEEDBACKITEMSSIF3STUDENTSCORESET);
		addChild( AssessmentDTD.SIF3STUDENTSCORESET_FEEDBACKITEMSSIF3STUDENTSCORESET, new FeedbackItemsSif3StudentScoreSet( feedbackItemSif3StudentScoreSet ) );
	}

	/**
	 *  Gets the value of the <code>&lt;FeedbackItemsSif3StudentScoreSet&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This list will support providing feedback to the student from multiple sources."</i><p>
	 *
	 *  @return A <code>FeedbackItemsSif3StudentScoreSet</code> object
	 *  @since 2.6
	 */
	public FeedbackItemsSif3StudentScoreSet getFeedbackItemsSif3StudentScoreSet() { 
		return (FeedbackItemsSif3StudentScoreSet)getChild( AssessmentDTD.SIF3STUDENTSCORESET_FEEDBACKITEMSSIF3STUDENTSCORESET);
	}

	/**
	 *  Removes the <code>FeedbackItemsSif3StudentScoreSet</code> child element previously created by calling <code>setFeedbackItemsSif3StudentScoreSet</code>
	 *
	 *  @since 2.6
	 */
	public void removeFeedbackItemsSif3StudentScoreSet() { 
		removeChild( AssessmentDTD.SIF3STUDENTSCORESET_FEEDBACKITEMSSIF3STUDENTSCORESET );
	}

}