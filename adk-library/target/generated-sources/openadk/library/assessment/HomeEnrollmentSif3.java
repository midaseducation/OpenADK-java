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
public class HomeEnrollmentSif3 extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public HomeEnrollmentSif3() {
		super( AssessmentDTD.HOMEENROLLMENTSIF3 );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param status Enrollment status as of the SnapDate.
	 *  @param gradeLevel Grade or academic level of student.
	 */
	public HomeEnrollmentSif3( HomeEnrollmentStatusSif3 status, GradeLevel gradeLevel ) {
		super( AssessmentDTD.HOMEENROLLMENTSIF3 );
		this.setStatus( status );
		this.setGradeLevel(gradeLevel);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_STATUS ) );
		b.append('.');
		b.append( getFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.HOMEENROLLMENTSIF3_STATUS, AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL };
	}

	/**
	 *  Gets the value of the <code>&lt;StudentSchoolEnrollmentRefId&gt;</code> element.
	 *
	 *  @return The <code>StudentSchoolEnrollmentRefId</code> element of this object.
	 *  @since 2.6
	 */
	public String getStudentSchoolEnrollmentRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_STUDENTSCHOOLENROLLMENTREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentSchoolEnrollmentRefId&gt;</code> element.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setStudentSchoolEnrollmentRefId( String value ) { 
		setFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_STUDENTSCHOOLENROLLMENTREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the school."</i><p>
	 *
	 *  @return The <code>SchoolName</code> element of this object.
	 *  @since 2.6
	 */
	public String getSchoolName() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_SCHOOLNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the school."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSchoolName( String value ) { 
		setFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_SCHOOLNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Provide both the HomeEnrollment/SchoolId and HomeEnrollment/LocalId elements if possible. If not, one or the other must be provided."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 2.6
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Provide both the HomeEnrollment/SchoolId and HomeEnrollment/LocalId elements if possible. If not, one or the other must be provided."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
          The locally-defined identifier for this school.
          Provide both the HomeEnrollment/LocalId and HomeEnrollment/SchoolId elements if possible.
          If not, one or the other must be provided.
        "</i><p>
	 *
	 *  @return The <code>LocalId</code> element of this object.
	 *  @since 2.6
	 */
	public String getLocalId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_LOCALID );
	}

	/**
	 *  Sets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"
          The locally-defined identifier for this school.
          Provide both the HomeEnrollment/LocalId and HomeEnrollment/SchoolId elements if possible.
          If not, one or the other must be provided.
        "</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setLocalId( String value ) { 
		setFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_LOCALID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The state or province defined identifier for this school."</i><p>
	 *
	 *  @return The <code>StateProvinceId</code> element of this object.
	 *  @since 2.6
	 */
	public String getStateProvinceId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_STATEPROVINCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The state or province defined identifier for this school."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setStateProvinceId( String value ) { 
		setFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_STATEPROVINCEID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment status as of the SnapDate."</i><p>
	 *
	 *  @return The <code>Status</code> element of this object.
	 *  @since 2.6
	 */
	public String getStatus() { 
		return getFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_STATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment status as of the SnapDate."</i><p>
	 *
	 *  @param value A constant defined by the <code>HomeEnrollmentStatusSif3</code> class
	 *  @since 2.6
	 */
	public void setStatus( HomeEnrollmentStatusSif3 value ) { 
		setField( AssessmentDTD.HOMEENROLLMENTSIF3_STATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Status&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment status as of the SnapDate."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setStatus( String value ) { 
		setField( AssessmentDTD.HOMEENROLLMENTSIF3_STATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade or academic level of student."</i><p>
	 *
	 *  @param value A <code>GradeLevel</code> object
	 *  @since 2.6
	 */
	public void setGradeLevel( GradeLevel value ) { 
		removeChild( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL );
		addChild( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> child element.
	 *  This form of <code>setGradeLevel</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGradeLevel</code>
	 *  that accepts a single <code>GradeLevel</code> object.
	 *
	 *  @param code Code representing the grade level.
	 *  @since 2.6
	 */
	public void setGradeLevel( GradeLevelCode code ) {
		removeChild( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL);
		addChild( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL, new GradeLevel( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade or academic level of student."</i><p>
	 *
	 *  @return A <code>GradeLevel</code> object
	 *  @since 2.6
	 */
	public GradeLevel getGradeLevel() { 
		return (GradeLevel)getChild( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL);
	}

	/**
	 *  Removes the <code>GradeLevel</code> child element previously created by calling <code>setGradeLevel</code>
	 *
	 *  @since 2.6
	 */
	public void removeGradeLevel() { 
		removeChild( AssessmentDTD.HOMEENROLLMENTSIF3_GRADELEVEL );
	}

	/**
	 *  Sets the value of the <code>&lt;HomeroomSif3&gt;</code> element.
	 *
	 *  @param value A <code>HomeroomSif3</code> object
	 *  @since 2.6
	 */
	public void setHomeroomSif3( HomeroomSif3 value ) { 
		removeChild( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMSIF3 );
		addChild( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMSIF3, value);
	}

	/**
	 *  Sets the value of the <code>&lt;HomeroomSif3&gt;</code> child element.
	 *  This form of <code>setHomeroomSif3</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setHomeroomSif3</code>
	 *  that accepts a single <code>HomeroomSif3</code> object.
	 *
	 *  @param sifRefObject The name of the object referenced.
	 *  @param value Gets or sets the content value of the &lt;HomeroomSif3&gt; element
	 *  @since 2.6
	 */
	public void setHomeroomSif3( String sifRefObject, String value ) {
		removeChild( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMSIF3);
		addChild( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMSIF3, new HomeroomSif3( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;HomeroomSif3&gt;</code> element.
	 *
	 *  @return An <code>HomeroomSif3</code> object
	 *  @since 2.6
	 */
	public HomeroomSif3 getHomeroomSif3() { 
		return (HomeroomSif3)getChild( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMSIF3);
	}

	/**
	 *  Removes the <code>HomeroomSif3</code> child element previously created by calling <code>setHomeroomSif3</code>
	 *
	 *  @since 2.6
	 */
	public void removeHomeroomSif3() { 
		removeChild( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMSIF3 );
	}

	/**
	 *  Gets the value of the <code>&lt;HomeroomNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier for this room."</i><p>
	 *
	 *  @return The <code>HomeroomNumber</code> element of this object.
	 *  @since 2.6
	 */
	public String getHomeroomNumber() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;HomeroomNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier for this room."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setHomeroomNumber( String value ) { 
		setFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_HOMEROOMNUMBER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FullYearEnrollment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication as to whether or not the student was enrolled for the whole school year. If the SchoolYear is in progress as of the SnapDate, use the value "Unknown"."</i><p>
	 *
	 *  @return The <code>FullYearEnrollment</code> element of this object.
	 *  @since 2.6
	 */
	public String getFullYearEnrollment() { 
		return getFieldValue( AssessmentDTD.HOMEENROLLMENTSIF3_FULLYEARENROLLMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;FullYearEnrollment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication as to whether or not the student was enrolled for the whole school year. If the SchoolYear is in progress as of the SnapDate, use the value "Unknown"."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setFullYearEnrollment( YesNoUnknown value ) { 
		setField( AssessmentDTD.HOMEENROLLMENTSIF3_FULLYEARENROLLMENT, value );
	}

	/**
	 *  Sets the value of the <code>&lt;FullYearEnrollment&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication as to whether or not the student was enrolled for the whole school year. If the SchoolYear is in progress as of the SnapDate, use the value "Unknown"."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setFullYearEnrollment( String value ) { 
		setField( AssessmentDTD.HOMEENROLLMENTSIF3_FULLYEARENROLLMENT, value );
	}

}
