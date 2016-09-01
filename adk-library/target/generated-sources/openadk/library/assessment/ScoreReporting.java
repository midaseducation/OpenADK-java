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
public class ScoreReporting extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ScoreReporting() {
		super( AssessmentDTD.SCOREREPORTING );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param scoreMetric The metric or scale used to report the scores.
	 */
	public ScoreReporting( AssessmentReportingMethod scoreMetric ) {
		super( AssessmentDTD.SCOREREPORTING );
		this.setScoreMetric( scoreMetric );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.SCOREREPORTING_SCOREMETRIC );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.SCOREREPORTING_SCOREMETRIC };
	}

	/**
	 *  Gets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the scores."</i><p>
	 *
	 *  @return The <code>ScoreMetric</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getScoreMetric() { 
		return getFieldValue( AssessmentDTD.SCOREREPORTING_SCOREMETRIC );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the scores."</i><p>
	 *
	 *  @param value A constant defined by the <code>AssessmentReportingMethod</code> class
	 *  @since 2.6
	 */
	public void setScoreMetric( AssessmentReportingMethod value ) { 
		setField( AssessmentDTD.SCOREREPORTING_SCOREMETRIC, value );
	}

	/**
	 *  Sets the value of the <code>ScoreMetric</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The metric or scale used to report the scores."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setScoreMetric( String value ) { 
		setField( AssessmentDTD.SCOREREPORTING_SCOREMETRIC, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Minimum&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Lowest possible score value."</i><p>
	 *
	 *  @return The <code>Minimum</code> element of this object.
	 *  @since 2.6
	 */
	public String getMinimum() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SCOREREPORTING_MINIMUM );
	}

	/**
	 *  Sets the value of the <code>&lt;Minimum&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Lowest possible score value."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setMinimum( String value ) { 
		setFieldValue( AssessmentDTD.SCOREREPORTING_MINIMUM, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Maximum&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Highest possible score value"</i><p>
	 *
	 *  @return The <code>Maximum</code> element of this object.
	 *  @since 2.6
	 */
	public String getMaximum() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SCOREREPORTING_MAXIMUM );
	}

	/**
	 *  Sets the value of the <code>&lt;Maximum&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Highest possible score value"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setMaximum( String value ) { 
		setFieldValue( AssessmentDTD.SCOREREPORTING_MAXIMUM, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ScoreTableRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This identifies the specific score table used by this subtest to generate the score if applicable. Note that the score metric in this object should match the �to score metric� in the score table."</i><p>
	 *
	 *  @return The <code>ScoreTableRefId</code> element of this object.
	 *  @since 2.6
	 */
	public String getScoreTableRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SCOREREPORTING_SCORETABLEREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreTableRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This identifies the specific score table used by this subtest to generate the score if applicable. Note that the score metric in this object should match the �to score metric� in the score table."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setScoreTableRefId( String value ) { 
		setFieldValue( AssessmentDTD.SCOREREPORTING_SCORETABLEREFID, new SIFString( value ), value );
	}

}
