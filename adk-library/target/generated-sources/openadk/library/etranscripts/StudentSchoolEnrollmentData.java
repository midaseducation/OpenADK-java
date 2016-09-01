// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.etranscripts;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.gradebook.*;
import openadk.library.student.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class StudentSchoolEnrollmentData extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentSchoolEnrollmentData() {
		super( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param schoolAttendedRefId References the school of record for the student (see SchoolAttended).
	 */
	public StudentSchoolEnrollmentData( String schoolAttendedRefId ) {
		super( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA );
		this.setSchoolAttendedRefId(schoolAttendedRefId);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SCHOOLATTENDEDREFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SCHOOLATTENDEDREFID };
	}

	/**
	 *  Gets the value of the <code>SchoolAttendedRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"References the school of record for the student (see SchoolAttended)."</i><p>
	 *
	 *  @return The <code>SchoolAttendedRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSchoolAttendedRefId() { 
		return (String) getSIFSimpleFieldValue( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SCHOOLATTENDEDREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolAttendedRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"References the school of record for the student (see SchoolAttended)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSchoolAttendedRefId( String value ) { 
		setFieldValue( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SCHOOLATTENDEDREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> element.
	 *
	 *  @param value A <code>GradeLevel</code> object
	 *  @since 2.0
	 */
	public void setGradeLevel( GradeLevel value ) { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_GRADELEVEL );
		addChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_GRADELEVEL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> child element.
	 *  This form of <code>setGradeLevel</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGradeLevel</code>
	 *  that accepts a single <code>GradeLevel</code> object.
	 *
	 *  @param code Code representing the grade level.
	 *  @since 2.0
	 */
	public void setGradeLevel( GradeLevelCode code ) {
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_GRADELEVEL);
		addChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_GRADELEVEL, new GradeLevel( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevel&gt;</code> element.
	 *
	 *  @return A <code>GradeLevel</code> object
	 *  @since 2.0
	 */
	public GradeLevel getGradeLevel() { 
		return (GradeLevel)getChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_GRADELEVEL);
	}

	/**
	 *  Removes the <code>GradeLevel</code> child element previously created by calling <code>setGradeLevel</code>
	 *
	 *  @since 2.0
	 */
	public void removeGradeLevel() { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_GRADELEVEL );
	}

	/**
	 *  Sets the value of the <code>&lt;Advisor&gt;</code> element.
	 *
	 *  @param value A <code>Advisor</code> object
	 *  @since 2.0
	 */
	public void setAdvisor( Advisor value ) { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_ADVISOR );
		addChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_ADVISOR, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Advisor&gt;</code> element.
	 *
	 *  @return An <code>Advisor</code> object
	 *  @since 2.0
	 */
	public Advisor getAdvisor() { 
		return (Advisor)getChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_ADVISOR);
	}

	/**
	 *  Removes the <code>Advisor</code> child element previously created by calling <code>setAdvisor</code>
	 *
	 *  @since 2.0
	 */
	public void removeAdvisor() { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_ADVISOR );
	}

	/**
	 *  Sets the value of the <code>&lt;Counselor&gt;</code> element.
	 *
	 *  @param value A <code>Counselor</code> object
	 *  @since 2.0
	 */
	public void setCounselor( Counselor value ) { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_COUNSELOR );
		addChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_COUNSELOR, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Counselor&gt;</code> element.
	 *
	 *  @return A <code>Counselor</code> object
	 *  @since 2.0
	 */
	public Counselor getCounselor() { 
		return (Counselor)getChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_COUNSELOR);
	}

	/**
	 *  Removes the <code>Counselor</code> child element previously created by calling <code>setCounselor</code>
	 *
	 *  @since 2.0
	 */
	public void removeCounselor() { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_COUNSELOR );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_ExtendedElements&gt;</code> element.
	 *
	 *  @param value A <code>SIF_ExtendedElements</code> object
	 *  @since 2.4
	 */
	public void setSIF_ExtendedElements( SIF_ExtendedElements value ) { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SIF_EXTENDEDELEMENTS );
		addChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SIF_EXTENDEDELEMENTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_ExtendedElements&gt;</code> element.
	 *
	 *  @return A <code>SIF_ExtendedElements</code> object
	 *  @since 2.4
	 */
	public SIF_ExtendedElements getSIF_ExtendedElements() { 
		return (SIF_ExtendedElements)getChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SIF_EXTENDEDELEMENTS);
	}

	/**
	 *  Removes the <code>SIF_ExtendedElements</code> child element previously created by calling <code>setSIF_ExtendedElements</code>
	 *
	 *  @since 2.4
	 */
	public void removeSIF_ExtendedElements() { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLENROLLMENTDATA_SIF_EXTENDEDELEMENTS );
	}

}