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
public class StudentSpecialEvents extends SIFKeyedList<StudentSpecialEvent>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentSpecialEvents() {
		super( AssessmentDTD.STUDENTSPECIALEVENTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param studentSpecialEvent A description of the special event. Student special event are different from special events of the test session. An example of a student special event may be 'student became ill' or 'student was detected attempting to cheat'.
	 */
	public StudentSpecialEvents( StudentSpecialEvent studentSpecialEvent ) {
		super( AssessmentDTD.STUDENTSPECIALEVENTS );
		this.safeAddChild( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT, studentSpecialEvent );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT };
	}

	/**
	 *  Adds a new <code>&lt;StudentSpecialEvent&gt;</code> repeatable element.
	 *  This form of <code>setStudentSpecialEvent</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentSpecialEvent</code>
	 *  that accepts a single <code>StudentSpecialEvent</code> object.
	 *
	 *  @param code A code indicating the type of special event. Code values are determined by the assessment program..
	 *  @param value Gets or sets the content value of the &lt;StudentSpecialEvent&gt; element
	 *  @since 2.6
	 */
	public void addStudentSpecialEvent( String code, String value ) {
		addChild( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT, new StudentSpecialEvent( code, value ) );
	}

	/**
	 *  Removes a <code>StudentSpecialEvent</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the StudentSpecialEvent object to remove by its Code value
	 *  @since 2.6
	 */
	public void removeStudentSpecialEvent( String code ) { 
		removeChild( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT, new String[] { code.toString() } );
	}

	/**
	 *  Gets a <code>StudentSpecialEvent</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the StudentSpecialEvent object to return by its "Code" attribute value
	 *  @return A <code>StudentSpecialEvent</code> object
	 *  @since 2.6
	 */
	public StudentSpecialEvent getStudentSpecialEvent( String code ) { 
		return (StudentSpecialEvent)getChild( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT, new String[] { code.toString() } );
	}

	/**
	 *  Gets all <code>StudentSpecialEvent</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>StudentSpecialEvent</code> objects
	 *  @since 2.6
	 */
	public StudentSpecialEvent[] getStudentSpecialEvents() {
		List<SIFElement> v = getChildList( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT);
		StudentSpecialEvent[] cvt = new StudentSpecialEvent[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>StudentSpecialEvent</code> objects. All existing 
	 * <code>StudentSpecialEvent</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>StudentSpecialEvents</code>.
	 *
	 *  @since 2.6
	 */
	public void setStudentSpecialEvents( StudentSpecialEvent[] studentspecialevents ) {
		setChildren( AssessmentDTD.STUDENTSPECIALEVENTS_STUDENTSPECIALEVENT, studentspecialevents );
	}

}
