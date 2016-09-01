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
 *  @since 2.2
 */
public class AssessmentDescriptors extends SIFKeyedList<AssessmentDescriptor>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssessmentDescriptors() {
		super( AssessmentDTD.ASSESSMENTDESCRIPTORS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param assessmentDescriptor 
	 */
	public AssessmentDescriptors( AssessmentDescriptor assessmentDescriptor ) {
		super( AssessmentDTD.ASSESSMENTDESCRIPTORS );
		this.safeAddChild( AssessmentDTD.ASSESSMENTDESCRIPTORS_ASSESSMENTDESCRIPTOR, assessmentDescriptor );
	}

	/**
	 *  Adds a new <code>&lt;AssessmentDescriptor&gt;</code> repeatable element.
	 *  This form of <code>setAssessmentDescriptor</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAssessmentDescriptor</code>
	 *  that accepts a single <code>AssessmentDescriptor</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;AssessmentDescriptor&gt; element
	 *  @since 2.2
	 */
	public void addAssessmentDescriptor( AssessmentDescriptorType value ) {
		addChild( AssessmentDTD.ASSESSMENTDESCRIPTORS_ASSESSMENTDESCRIPTOR, new AssessmentDescriptor( value ) );
	}

	/**
	 *  Removes an <code>AssessmentDescriptor</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the AssessmentDescriptor object to remove by its Value value
	 *  @since 2.2
	 */
	public void removeAssessmentDescriptor( AssessmentDescriptorType value ) { 
		removeChild( AssessmentDTD.ASSESSMENTDESCRIPTORS_ASSESSMENTDESCRIPTOR, new String[] { value.toString() } );
	}

	/**
	 *  Gets an <code>AssessmentDescriptor</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the AssessmentDescriptor object to return by its "Value" attribute value
	 *  @return An <code>AssessmentDescriptor</code> object
	 *  @since 2.2
	 */
	public AssessmentDescriptor getAssessmentDescriptor( AssessmentDescriptorType value ) { 
		return (AssessmentDescriptor)getChild( AssessmentDTD.ASSESSMENTDESCRIPTORS_ASSESSMENTDESCRIPTOR, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>AssessmentDescriptor</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>AssessmentDescriptor</code> objects
	 *  @since 2.2
	 */
	public AssessmentDescriptor[] getAssessmentDescriptors() {
		List<SIFElement> v = getChildList( AssessmentDTD.ASSESSMENTDESCRIPTORS_ASSESSMENTDESCRIPTOR);
		AssessmentDescriptor[] cvt = new AssessmentDescriptor[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>AssessmentDescriptor</code> objects. All existing 
	 * <code>AssessmentDescriptor</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>AssessmentDescriptors</code>.
	 *
	 *  @since 2.2
	 */
	public void setAssessmentDescriptors( AssessmentDescriptor[] assessmentdescriptors ) {
		setChildren( AssessmentDTD.ASSESSMENTDESCRIPTORS_ASSESSMENTDESCRIPTOR, assessmentdescriptors );
	}

}