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
 *  This object represents the score conversion tables to be used by the scoring system to derive alternate values. As an example, it is often typical for a scoring system to convert a raw score to a scale score. It is also common for a scoring system to derive a student performance level on an assessment from a total scaled score.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class Sif3AssessmentScoreTable extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Sif3AssessmentScoreTable() {
		super( ADK.getSIFVersion(), AssessmentDTD.SIF3ASSESSMENTSCORETABLE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The GUID that uniquely identifies an instance of the object.
	 *  @param scoreTableName The user defined name of the score table.
	 */
	public Sif3AssessmentScoreTable( String refId, String scoreTableName ) {
		super( ADK.getSIFVersion(), AssessmentDTD.SIF3ASSESSMENTSCORETABLE );
		this.setRefId(refId);
		this.setScoreTableName(scoreTableName);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.SIF3ASSESSMENTSCORETABLE_REFID };
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
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_REFID );
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
		setFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ScoreTableVersion&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The version of the score table that this object represents. Note that new versions of score tables must generate new RefIds and therefore a new score table object. The format of the numbering system is determined by the assessment provider."</i><p>
	 *
	 *  @return The <code>ScoreTableVersion</code> element of this object.
	 *  @since 2.6
	 */
	public String getScoreTableVersion() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEVERSION );
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreTableVersion&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The version of the score table that this object represents. Note that new versions of score tables must generate new RefIds and therefore a new score table object. The format of the numbering system is determined by the assessment provider."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setScoreTableVersion( String value ) { 
		setFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEVERSION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TablePublishDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that this version of the score table was published (published means made available for use). If a ScoreTableVersion is provided, then this element should also be provided."</i><p>
	 *
	 *  @return The <code>TablePublishDate</code> element of this object.
	 *  @since 2.6
	 */
	public Calendar getTablePublishDate() { 
		return (Calendar) getSIFSimpleFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_TABLEPUBLISHDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;TablePublishDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date that this version of the score table was published (published means made available for use). If a ScoreTableVersion is provided, then this element should also be provided."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.6
	 */
	public void setTablePublishDate( Calendar value ) { 
		setFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_TABLEPUBLISHDATE, new SIFDateTime( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreTableIdentifiers&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the authoring system provides for a unique coding system for subtests then this element is used to store that information."</i><p>
	 *
	 *  @param value A <code>ScoreTableIdentifiers</code> object
	 *  @since 2.6
	 */
	public void setScoreTableIdentifiers( ScoreTableIdentifiers value ) { 
		removeChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEIDENTIFIERS );
		addChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEIDENTIFIERS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreTableIdentifiers&gt;</code> child element.
	 *  This form of <code>setScoreTableIdentifiers</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setScoreTableIdentifiers</code>
	 *  that accepts a single <code>ScoreTableIdentifiers</code> object.
	 *
	 *  @param scoreTableIdentifier An internal or natural identifier for the ScoreTable used by the assessment system
	 *  @since 2.6
	 */
	public void setScoreTableIdentifiers( ScoreTableIdentifier scoreTableIdentifier ) {
		removeChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEIDENTIFIERS);
		addChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEIDENTIFIERS, new ScoreTableIdentifiers( scoreTableIdentifier ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ScoreTableIdentifiers&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the authoring system provides for a unique coding system for subtests then this element is used to store that information."</i><p>
	 *
	 *  @return A <code>ScoreTableIdentifiers</code> object
	 *  @since 2.6
	 */
	public ScoreTableIdentifiers getScoreTableIdentifiers() { 
		return (ScoreTableIdentifiers)getChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEIDENTIFIERS);
	}

	/**
	 *  Removes the <code>ScoreTableIdentifiers</code> child element previously created by calling <code>setScoreTableIdentifiers</code>
	 *
	 *  @since 2.6
	 */
	public void removeScoreTableIdentifiers() { 
		removeChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLEIDENTIFIERS );
	}

	/**
	 *  Gets the value of the <code>&lt;ScoreTableName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The user defined name of the score table."</i><p>
	 *
	 *  @return The <code>ScoreTableName</code> element of this object.
	 *  @since 2.6
	 */
	public String getScoreTableName() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLENAME );
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreTableName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The user defined name of the score table."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setScoreTableName( String value ) { 
		setFieldValue( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCORETABLENAME, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreValues&gt;</code> element.
	 *
	 *  @param value A <code>ScoreValues</code> object
	 *  @since 2.6
	 */
	public void setScoreValues( ScoreValues value ) { 
		removeChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCOREVALUES );
		addChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCOREVALUES, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ScoreValues&gt;</code> child element.
	 *  This form of <code>setScoreValues</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setScoreValues</code>
	 *  that accepts a single <code>ScoreValues</code> object.
	 *
	 *  @param scoreValue 
	 *  @since 2.6
	 */
	public void setScoreValues( ScoreValue scoreValue ) {
		removeChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCOREVALUES);
		addChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCOREVALUES, new ScoreValues( scoreValue ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ScoreValues&gt;</code> element.
	 *
	 *  @return A <code>ScoreValues</code> object
	 *  @since 2.6
	 */
	public ScoreValues getScoreValues() { 
		return (ScoreValues)getChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCOREVALUES);
	}

	/**
	 *  Removes the <code>ScoreValues</code> child element previously created by calling <code>setScoreValues</code>
	 *
	 *  @since 2.6
	 */
	public void removeScoreValues() { 
		removeChild( AssessmentDTD.SIF3ASSESSMENTSCORETABLE_SCOREVALUES );
	}

}