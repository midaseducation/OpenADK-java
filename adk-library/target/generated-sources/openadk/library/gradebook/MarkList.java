// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.gradebook;

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
public class MarkList extends SIFKeyedList<Mark>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public MarkList() {
		super( GradebookDTD.MARKLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param mark 
	 */
	public MarkList( Mark mark ) {
		super( GradebookDTD.MARKLIST );
		this.safeAddChild( GradebookDTD.MARKLIST_MARK, mark );
	}

	/**
	 *  Adds a new <code>&lt;Mark&gt;</code> repeatable element.
	 *  This form of <code>setMark</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setMark</code>
	 *  that accepts a single <code>Mark</code> object.
	 *
	 *  @param markInfoRefId The ID (GUID) that identifies a mark that was given for this student.
	 *  @since 2.0
	 */
	public void addMark( String markInfoRefId ) {
		addChild( GradebookDTD.MARKLIST_MARK, new Mark( markInfoRefId ) );
	}

	/**
	 *  Removes a <code>Mark</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param markInfoRefId Identifies the Mark object to remove by its MarkInfoRefId value
	 *  @since 2.0
	 */
	public void removeMark( String markInfoRefId ) { 
		removeChild( GradebookDTD.MARKLIST_MARK, new String[] { markInfoRefId.toString() } );
	}

	/**
	 *  Gets a <code>Mark</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param markInfoRefId Identifies the Mark object to return by its "MarkInfoRefId" attribute value
	 *  @return A <code>Mark</code> object
	 *  @since 2.0
	 */
	public Mark getMark( String markInfoRefId ) { 
		return (Mark)getChild( GradebookDTD.MARKLIST_MARK, new String[] { markInfoRefId.toString() } );
	}

	/**
	 *  Gets all <code>Mark</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Mark</code> objects
	 *  @since 2.0
	 */
	public Mark[] getMarks() {
		List<SIFElement> v = getChildList( GradebookDTD.MARKLIST_MARK);
		Mark[] cvt = new Mark[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Mark</code> objects. All existing 
	 * <code>Mark</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Marks</code>.
	 *
	 *  @since 2.0
	 */
	public void setMarks( Mark[] marks ) {
		setChildren( GradebookDTD.MARKLIST_MARK, marks );
	}

}
