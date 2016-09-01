// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

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
public class LearningStandards extends SIFKeyedList<LearningStandardItemRefId>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public LearningStandards() {
		super( InstrDTD.LEARNINGSTANDARDS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param learningStandardItemRefId GUID of an associated LearningStandardItem object
	 */
	public LearningStandards( LearningStandardItemRefId learningStandardItemRefId ) {
		super( InstrDTD.LEARNINGSTANDARDS );
		this.safeAddChild( InstrDTD.LEARNINGSTANDARDS_LEARNINGSTANDARDITEMREFID, learningStandardItemRefId );
	}

	/**
	 *  Adds a new <code>&lt;LearningStandardItemRefId&gt;</code> repeatable element.
	 *  This form of <code>setLearningStandardItemRefId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setLearningStandardItemRefId</code>
	 *  that accepts a single <code>LearningStandardItemRefId</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;LearningStandardItemRefId&gt; element
	 *  @since 2.0
	 */
	public void addLearningStandardItemRefId( String value ) {
		addChild( InstrDTD.LEARNINGSTANDARDS_LEARNINGSTANDARDITEMREFID, new LearningStandardItemRefId( value ) );
	}

	/**
	 *  Removes a <code>LearningStandardItemRefId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the LearningStandardItemRefId object to remove by its Value value
	 *  @since 2.0
	 */
	public void removeLearningStandardItemRefId( String value ) { 
		removeChild( InstrDTD.LEARNINGSTANDARDS_LEARNINGSTANDARDITEMREFID, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>LearningStandardItemRefId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the LearningStandardItemRefId object to return by its "Value" attribute value
	 *  @return A <code>LearningStandardItemRefId</code> object
	 *  @since 2.0
	 */
	public LearningStandardItemRefId getLearningStandardItemRefId( String value ) { 
		return (LearningStandardItemRefId)getChild( InstrDTD.LEARNINGSTANDARDS_LEARNINGSTANDARDITEMREFID, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>LearningStandardItemRefId</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>LearningStandardItemRefId</code> objects
	 *  @since 2.0
	 */
	public LearningStandardItemRefId[] getLearningStandardItemRefIds() {
		List<SIFElement> v = getChildList( InstrDTD.LEARNINGSTANDARDS_LEARNINGSTANDARDITEMREFID);
		LearningStandardItemRefId[] cvt = new LearningStandardItemRefId[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>LearningStandardItemRefId</code> objects. All existing 
	 * <code>LearningStandardItemRefId</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>LearningStandardItemRefIds</code>.
	 *
	 *  @since 2.0
	 */
	public void setLearningStandardItemRefIds( LearningStandardItemRefId[] learningstandarditemrefids ) {
		setChildren( InstrDTD.LEARNINGSTANDARDS_LEARNINGSTANDARDITEMREFID, learningstandarditemrefids );
	}

}
