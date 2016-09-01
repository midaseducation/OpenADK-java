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
 *  Information about the school and assignment of employee<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class EmplAssignment extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EmplAssignment() {
		super( ProfdevDTD.EMPLASSIGNMENT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param schoolInfoRefId References SchoolInfo object to determine school in which this assignment pertains.
	 *  @param gradeLevels 
	 *  @param jobFunction 
	 */
	public EmplAssignment( String schoolInfoRefId, GradeLevels gradeLevels, JobFunction jobFunction ) {
		super( ProfdevDTD.EMPLASSIGNMENT );
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setGradeLevels(gradeLevels);
		this.setJobFunction(jobFunction);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProfdevDTD.EMPLASSIGNMENT_SCHOOLINFOREFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProfdevDTD.EMPLASSIGNMENT_SCHOOLINFOREFID };
	}

	/**
	 *  Gets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"References SchoolInfo object to determine school in which this assignment pertains."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.EMPLASSIGNMENT_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"References SchoolInfo object to determine school in which this assignment pertains."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( ProfdevDTD.EMPLASSIGNMENT_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevels&gt;</code> element.
	 *
	 *  @param value A <code>GradeLevels</code> object
	 *  @since 1.5r1
	 */
	public void setGradeLevels( GradeLevels value ) { 
		removeChild( ProfdevDTD.EMPLASSIGNMENT_GRADELEVELS );
		addChild( ProfdevDTD.EMPLASSIGNMENT_GRADELEVELS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevels&gt;</code> element.
	 *
	 *  @return A <code>GradeLevels</code> object
	 *  @since 1.5r1
	 */
	public GradeLevels getGradeLevels() { 
		return (GradeLevels)getChild( ProfdevDTD.EMPLASSIGNMENT_GRADELEVELS);
	}

	/**
	 *  Removes the <code>GradeLevels</code> child element previously created by calling <code>setGradeLevels</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeGradeLevels() { 
		removeChild( ProfdevDTD.EMPLASSIGNMENT_GRADELEVELS );
	}

	/**
	 *  Sets the value of the <code>&lt;JobFunction&gt;</code> element.
	 *
	 *  @param value A <code>JobFunction</code> object
	 *  @since 1.5r1
	 */
	public void setJobFunction( JobFunction value ) { 
		removeChild( ProfdevDTD.EMPLASSIGNMENT_JOBFUNCTION );
		addChild( ProfdevDTD.EMPLASSIGNMENT_JOBFUNCTION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;JobFunction&gt;</code> child element.
	 *  This form of <code>setJobFunction</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setJobFunction</code>
	 *  that accepts a single <code>JobFunction</code> object.
	 *
	 *  @param code Code representing the type of job function.
	 *  @since 1.5r1
	 */
	public void setJobFunction( JobFunctionCode code ) {
		removeChild( ProfdevDTD.EMPLASSIGNMENT_JOBFUNCTION);
		addChild( ProfdevDTD.EMPLASSIGNMENT_JOBFUNCTION, new JobFunction( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;JobFunction&gt;</code> element.
	 *
	 *  @return A <code>JobFunction</code> object
	 *  @since 1.5r1
	 */
	public JobFunction getJobFunction() { 
		return (JobFunction)getChild( ProfdevDTD.EMPLASSIGNMENT_JOBFUNCTION);
	}

	/**
	 *  Removes the <code>JobFunction</code> child element previously created by calling <code>setJobFunction</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeJobFunction() { 
		removeChild( ProfdevDTD.EMPLASSIGNMENT_JOBFUNCTION );
	}

	/**
	 *  Gets the value of the <code>&lt;FTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Full-time equivalent for this school"</i><p>
	 *
	 *  @return The <code>FTE</code> element of this object.
	 *  @since 1.5r1
	 */
	public BigDecimal getFTE() { 
		return (BigDecimal) getSIFSimpleFieldValue( ProfdevDTD.EMPLASSIGNMENT_FTE );
	}

	/**
	 *  Sets the value of the <code>&lt;FTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Full-time equivalent for this school"</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 1.5r1
	 */
	public void setFTE( BigDecimal value ) { 
		setFieldValue( ProfdevDTD.EMPLASSIGNMENT_FTE, new SIFDecimal( value ), value );
	}

}
