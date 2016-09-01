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
public class SpecialConditions extends SIFActionList<SpecialCondition>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SpecialConditions() {
		super( AssessmentDTD.SPECIALCONDITIONS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param specialCondition A text description of the special condition.
	 */
	public SpecialConditions( SpecialCondition specialCondition ) {
		super( AssessmentDTD.SPECIALCONDITIONS );
		this.safeAddChild( AssessmentDTD.SPECIALCONDITIONS_SPECIALCONDITION, specialCondition );
	}

	/**
	 *  Adds a new <code>&lt;SpecialCondition&gt;</code> repeatable element.
	 *  This form of <code>setSpecialCondition</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSpecialCondition</code>
	 *  that accepts a single <code>SpecialCondition</code> object.
	 *
	 *  @param code This is the primary key for the list of special conditions.
	 *  @param value Gets or sets the content value of the &lt;SpecialCondition&gt; element
	 *  @since 2.0
	 */
	public void addSpecialCondition( String code, String value ) {
		addChild( AssessmentDTD.SPECIALCONDITIONS_SPECIALCONDITION, new SpecialCondition( code, value ) );
	}

	/**
	 *  Removes a <code>SpecialCondition</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the SpecialCondition object to remove by its Code value
	 *  @since 2.0
	 */
	public void removeSpecialCondition( String code ) { 
		removeChild( AssessmentDTD.SPECIALCONDITIONS_SPECIALCONDITION, new String[] { code.toString() } );
	}

	/**
	 *  Gets a <code>SpecialCondition</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the SpecialCondition object to return by its "Code" attribute value
	 *  @return A <code>SpecialCondition</code> object
	 *  @since 2.0
	 */
	public SpecialCondition getSpecialCondition( String code ) { 
		return (SpecialCondition)getChild( AssessmentDTD.SPECIALCONDITIONS_SPECIALCONDITION, new String[] { code.toString() } );
	}

	/**
	 *  Gets all <code>SpecialCondition</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SpecialCondition</code> objects
	 *  @since 2.0
	 */
	public SpecialCondition[] getSpecialConditions() {
		List<SIFElement> v = getChildList( AssessmentDTD.SPECIALCONDITIONS_SPECIALCONDITION);
		SpecialCondition[] cvt = new SpecialCondition[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SpecialCondition</code> objects. All existing 
	 * <code>SpecialCondition</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SpecialConditions</code>.
	 *
	 *  @since 2.0
	 */
	public void setSpecialConditions( SpecialCondition[] specialconditions ) {
		setChildren( AssessmentDTD.SPECIALCONDITIONS_SPECIALCONDITION, specialconditions );
	}

}