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
public class LearningResources extends SIFKeyedList<LearningResourceRefId>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public LearningResources() {
		super( InstrDTD.LEARNINGRESOURCES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param learningResourceRefId Link to an aligned LearningResource object.
	 */
	public LearningResources( LearningResourceRefId learningResourceRefId ) {
		super( InstrDTD.LEARNINGRESOURCES );
		this.safeAddChild( InstrDTD.LEARNINGRESOURCES_LEARNINGRESOURCEREFID, learningResourceRefId );
	}

	/**
	 *  Adds a new <code>&lt;LearningResourceRefId&gt;</code> repeatable element.
	 *  This form of <code>setLearningResourceRefId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setLearningResourceRefId</code>
	 *  that accepts a single <code>LearningResourceRefId</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;LearningResourceRefId&gt; element
	 *  @since 2.0
	 */
	public void addLearningResourceRefId( String value ) {
		addChild( InstrDTD.LEARNINGRESOURCES_LEARNINGRESOURCEREFID, new LearningResourceRefId( value ) );
	}

	/**
	 *  Removes a <code>LearningResourceRefId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the LearningResourceRefId object to remove by its Value value
	 *  @since 2.0
	 */
	public void removeLearningResourceRefId( String value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCES_LEARNINGRESOURCEREFID, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>LearningResourceRefId</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the LearningResourceRefId object to return by its "Value" attribute value
	 *  @return A <code>LearningResourceRefId</code> object
	 *  @since 2.0
	 */
	public LearningResourceRefId getLearningResourceRefId( String value ) { 
		return (LearningResourceRefId)getChild( InstrDTD.LEARNINGRESOURCES_LEARNINGRESOURCEREFID, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>LearningResourceRefId</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>LearningResourceRefId</code> objects
	 *  @since 2.0
	 */
	public LearningResourceRefId[] getLearningResourceRefIds() {
		List<SIFElement> v = getChildList( InstrDTD.LEARNINGRESOURCES_LEARNINGRESOURCEREFID);
		LearningResourceRefId[] cvt = new LearningResourceRefId[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>LearningResourceRefId</code> objects. All existing 
	 * <code>LearningResourceRefId</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>LearningResourceRefIds</code>.
	 *
	 *  @since 2.0
	 */
	public void setLearningResourceRefIds( LearningResourceRefId[] learningresourcerefids ) {
		setChildren( InstrDTD.LEARNINGRESOURCES_LEARNINGRESOURCEREFID, learningresourcerefids );
	}

}
