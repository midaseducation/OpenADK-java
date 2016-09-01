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
public class StudentSpecialConditions extends SIFKeyedList<StudentSpecialCondition>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentSpecialConditions() {
		super( AssessmentDTD.STUDENTSPECIALCONDITIONS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param studentSpecialCondition A description of the special condition. Student special conditions are different
                from special conditions of the test.
            
	 */
	public StudentSpecialConditions( StudentSpecialCondition studentSpecialCondition ) {
		super( AssessmentDTD.STUDENTSPECIALCONDITIONS );
		this.safeAddChild( AssessmentDTD.STUDENTSPECIALCONDITIONS_STUDENTSPECIALCONDITION, studentSpecialCondition );
	}

	/**
	 *  Adds a new <code>&lt;StudentSpecialCondition&gt;</code> repeatable element.
	 *  This form of <code>setStudentSpecialCondition</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentSpecialCondition</code>
	 *  that accepts a single <code>StudentSpecialCondition</code> object.
	 *
	 *  @param code A code indicating the type of special condition.
	 *  @param value Gets or sets the content value of the &lt;StudentSpecialCondition&gt; element
	 *  @since 2.0
	 */
	public void addStudentSpecialCondition( String code, String value ) {
		addChild( AssessmentDTD.STUDENTSPECIALCONDITIONS_STUDENTSPECIALCONDITION, new StudentSpecialCondition( code, value ) );
	}

	/**
	 *  Removes a <code>StudentSpecialCondition</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the StudentSpecialCondition object to remove by its Code value
	 *  @since 2.0
	 */
	public void removeStudentSpecialCondition( String code ) { 
		removeChild( AssessmentDTD.STUDENTSPECIALCONDITIONS_STUDENTSPECIALCONDITION, new String[] { code.toString() } );
	}

	/**
	 *  Gets a <code>StudentSpecialCondition</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the StudentSpecialCondition object to return by its "Code" attribute value
	 *  @return A <code>StudentSpecialCondition</code> object
	 *  @since 2.0
	 */
	public StudentSpecialCondition getStudentSpecialCondition( String code ) { 
		return (StudentSpecialCondition)getChild( AssessmentDTD.STUDENTSPECIALCONDITIONS_STUDENTSPECIALCONDITION, new String[] { code.toString() } );
	}

	/**
	 *  Gets all <code>StudentSpecialCondition</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>StudentSpecialCondition</code> objects
	 *  @since 2.0
	 */
	public StudentSpecialCondition[] getStudentSpecialConditions() {
		List<SIFElement> v = getChildList( AssessmentDTD.STUDENTSPECIALCONDITIONS_STUDENTSPECIALCONDITION);
		StudentSpecialCondition[] cvt = new StudentSpecialCondition[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>StudentSpecialCondition</code> objects. All existing 
	 * <code>StudentSpecialCondition</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>StudentSpecialConditions</code>.
	 *
	 *  @since 2.0
	 */
	public void setStudentSpecialConditions( StudentSpecialCondition[] studentspecialconditions ) {
		setChildren( AssessmentDTD.STUDENTSPECIALCONDITIONS_STUDENTSPECIALCONDITION, studentspecialconditions );
	}

}