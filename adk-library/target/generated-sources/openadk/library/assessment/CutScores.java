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
public class CutScores extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CutScores() {
		super( AssessmentDTD.CUTSCORES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param scoreMetric The metric or scale used to report the scores.
	 */
	public CutScores( AssessmentReportingMethod scoreMetric ) {
		super( AssessmentDTD.CUTSCORES );
		this.setScoreMetric( scoreMetric );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.CUTSCORES_SCOREMETRIC );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.CUTSCORES_SCOREMETRIC };
	}

	/**
	 *  Gets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the scores."</i><p>
	 *
	 *  @return The <code>ScoreMetric</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getScoreMetric() { 
		return getFieldValue( AssessmentDTD.CUTSCORES_SCOREMETRIC );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the scores."</i><p>
	 *
	 *  @param value A constant defined by the <code>AssessmentReportingMethod</code> class
	 *  @since 2.0
	 */
	public void setScoreMetric( AssessmentReportingMethod value ) { 
		setField( AssessmentDTD.CUTSCORES_SCOREMETRIC, value );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the scores."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setScoreMetric( String value ) { 
		setField( AssessmentDTD.CUTSCORES_SCOREMETRIC, value );
	}

	/**
	 *  Gets the value of the <code>&lt;LowerCut&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Lower bound for the performance level."</i><p>
	 *
	 *  @return The <code>LowerCut</code> element of this object.
	 *  @since 2.0
	 */
	public String getLowerCut() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.CUTSCORES_LOWERCUT );
	}

	/**
	 *  Sets the value of the <code>&lt;LowerCut&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Lower bound for the performance level."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setLowerCut( String value ) { 
		setFieldValue( AssessmentDTD.CUTSCORES_LOWERCUT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;UpperCut&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Upper bound for the performance level."</i><p>
	 *
	 *  @return The <code>UpperCut</code> element of this object.
	 *  @since 2.0
	 */
	public String getUpperCut() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.CUTSCORES_UPPERCUT );
	}

	/**
	 *  Sets the value of the <code>&lt;UpperCut&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Upper bound for the performance level."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setUpperCut( String value ) { 
		setFieldValue( AssessmentDTD.CUTSCORES_UPPERCUT, new SIFString( value ), value );
	}

}
