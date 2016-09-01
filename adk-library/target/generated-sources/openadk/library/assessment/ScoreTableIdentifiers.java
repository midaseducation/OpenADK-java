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
public class ScoreTableIdentifiers extends SIFKeyedList<ScoreTableIdentifier>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ScoreTableIdentifiers() {
		super( AssessmentDTD.SCORETABLEIDENTIFIERS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param scoreTableIdentifier An internal or natural identifier for the ScoreTable used by the assessment system
	 */
	public ScoreTableIdentifiers( ScoreTableIdentifier scoreTableIdentifier ) {
		super( AssessmentDTD.SCORETABLEIDENTIFIERS );
		this.safeAddChild( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER, scoreTableIdentifier );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER };
	}

	/**
	 *  Adds a new <code>&lt;ScoreTableIdentifier&gt;</code> repeatable element.
	 *  This form of <code>setScoreTableIdentifier</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setScoreTableIdentifier</code>
	 *  that accepts a single <code>ScoreTableIdentifier</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;ScoreTableIdentifier&gt; element
	 *  @since 2.6
	 */
	public void addScoreTableIdentifier( String value ) {
		addChild( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER, new ScoreTableIdentifier( value ) );
	}

	/**
	 *  Removes a <code>ScoreTableIdentifier</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the ScoreTableIdentifier object to remove by its Value value
	 *  @since 2.6
	 */
	public void removeScoreTableIdentifier( String value ) { 
		removeChild( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>ScoreTableIdentifier</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the ScoreTableIdentifier object to return by its "Value" attribute value
	 *  @return A <code>ScoreTableIdentifier</code> object
	 *  @since 2.6
	 */
	public ScoreTableIdentifier getScoreTableIdentifier( String value ) { 
		return (ScoreTableIdentifier)getChild( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>ScoreTableIdentifier</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>ScoreTableIdentifier</code> objects
	 *  @since 2.6
	 */
	public ScoreTableIdentifier[] getScoreTableIdentifiers() {
		List<SIFElement> v = getChildList( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER);
		ScoreTableIdentifier[] cvt = new ScoreTableIdentifier[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>ScoreTableIdentifier</code> objects. All existing 
	 * <code>ScoreTableIdentifier</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>ScoreTableIdentifiers</code>.
	 *
	 *  @since 2.6
	 */
	public void setScoreTableIdentifiers( ScoreTableIdentifier[] scoretableidentifiers ) {
		setChildren( AssessmentDTD.SCORETABLEIDENTIFIERS_SCORETABLEIDENTIFIER, scoretableidentifiers );
	}

}