// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.profdev;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class EmployeeAssignments extends SIFKeyedList<EmplAssignment>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EmployeeAssignments() {
		super( ProfdevDTD.EMPLOYEEASSIGNMENTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param assignment 
	 */
	public EmployeeAssignments( EmplAssignment assignment ) {
		super( ProfdevDTD.EMPLOYEEASSIGNMENTS );
		this.safeAddChild( ProfdevDTD.EMPLOYEEASSIGNMENTS_ASSIGNMENT, assignment );
	}

	/**
	 *  Adds a new <code>&lt;Assignment&gt;</code> repeatable element.
	 *  This form of <code>setAssignment</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAssignment</code>
	 *  that accepts a single <code>EmplAssignment</code> object.
	 *
	 *  @param schoolInfoRefId References SchoolInfo object to determine school in which this assignment pertains.
	 *  @param gradeLevels 
	 *  @param jobFunction 
	 *  @since 1.5r1
	 */
	public void addAssignment( String schoolInfoRefId, GradeLevels gradeLevels, JobFunction jobFunction ) {
		addChild( ProfdevDTD.EMPLOYEEASSIGNMENTS_ASSIGNMENT, new EmplAssignment( schoolInfoRefId, gradeLevels, jobFunction ) );
	}

	/**
	 *  Removes an <code>EmplAssignment</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param schoolInfoRefId Identifies the EmplAssignment object to remove by its SchoolInfoRefId value
	 *  @since 1.5r1
	 */
	public void removeAssignment( String schoolInfoRefId ) { 
		removeChild( ProfdevDTD.EMPLOYEEASSIGNMENTS_ASSIGNMENT, new String[] { schoolInfoRefId.toString() } );
	}

	/**
	 *  Gets an <code>EmplAssignment</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param schoolInfoRefId Identifies the EmplAssignment object to return by its "SchoolInfoRefId" attribute value
	 *  @return An <code>EmplAssignment</code> object
	 *  @since 1.5r1
	 */
	public EmplAssignment getAssignment( String schoolInfoRefId ) { 
		return (EmplAssignment)getChild( ProfdevDTD.EMPLOYEEASSIGNMENTS_ASSIGNMENT, new String[] { schoolInfoRefId.toString() } );
	}

	/**
	 *  Gets all <code>EmplAssignment</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>EmplAssignment</code> objects
	 *  @since 1.5r1
	 */
	public EmplAssignment[] getAssignments() {
		List<SIFElement> v = getChildList( ProfdevDTD.EMPLOYEEASSIGNMENTS_ASSIGNMENT);
		EmplAssignment[] cvt = new EmplAssignment[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>EmplAssignment</code> objects. All existing 
	 * <code>EmplAssignment</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>EmplAssignments</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setAssignments( EmplAssignment[] assignments ) {
		setChildren( ProfdevDTD.EMPLOYEEASSIGNMENTS_ASSIGNMENT, assignments );
	}

}
