// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class StudentParticipationList extends SIFKeyedList<StudentParticipationDataElement>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentParticipationList() {
		super( CommonDTD.STUDENTPARTICIPATIONLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param studentParticipationData Collects elements of interest for each StudentParticipation.
	 */
	public StudentParticipationList( StudentParticipationDataElement studentParticipationData ) {
		super( CommonDTD.STUDENTPARTICIPATIONLIST );
		this.safeAddChild( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA, studentParticipationData );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA };
	}

	/**
	 *  Adds a new <code>&lt;StudentParticipationData&gt;</code> repeatable element.
	 *  This form of <code>setStudentParticipationData</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentParticipationData</code>
	 *  that accepts a single <code>StudentParticipationDataElement</code> object.
	 *
	 *  @param programType 
	 *  @since 2.4
	 */
	public void addStudentParticipationData( ProgramType programType ) {
		addChild( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA, new StudentParticipationDataElement( programType ) );
	}

	/**
	 *  Removes a <code>StudentParticipationDataElement</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param programType Identifies the StudentParticipationDataElement object to remove by its ProgramType value
	 *  @since 2.4
	 */
	public void removeStudentParticipationData( ProgramType programType ) { 
		removeChild( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA, new String[] { programType.toString() } );
	}

	/**
	 *  Gets a <code>StudentParticipationDataElement</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param programType Identifies the StudentParticipationDataElement object to return by its "ProgramType" attribute value
	 *  @return A <code>StudentParticipationDataElement</code> object
	 *  @since 2.4
	 */
	public StudentParticipationDataElement getStudentParticipationData( ProgramType programType ) { 
		return (StudentParticipationDataElement)getChild( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA, new String[] { programType.toString() } );
	}

	/**
	 *  Gets all <code>StudentParticipationDataElement</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>StudentParticipationDataElement</code> objects
	 *  @since 2.4
	 */
	public StudentParticipationDataElement[] getStudentParticipationDatas() {
		List<SIFElement> v = getChildList( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA);
		StudentParticipationDataElement[] cvt = new StudentParticipationDataElement[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>StudentParticipationDataElement</code> objects. All existing 
	 * <code>StudentParticipationDataElement</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>StudentParticipationDataElements</code>.
	 *
	 *  @since 2.4
	 */
	public void setStudentParticipationDatas( StudentParticipationDataElement[] studentparticipationdatas ) {
		setChildren( CommonDTD.STUDENTPARTICIPATIONLIST_STUDENTPARTICIPATIONDATA, studentparticipationdatas );
	}

}
