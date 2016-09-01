// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Enrollment-related information for the school that is responsible for reporting the student's membership/child accounting information.  This is most likely the primary enrollment site for the student.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class HomeEnrollment extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public HomeEnrollment() {
		super( StudentDTD.HOMEENROLLMENT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param status Enrollment status as of the SnapDate.
	 *  @param gradeLevel Grade or academic level of student.
	 */
	public HomeEnrollment( HomeEnrollmentStatus status, GradeLevel gradeLevel ) {
		super( StudentDTD.HOMEENROLLMENT );
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
		b.append( getFieldValue( StudentDTD.HOMEENROLLMENT_STATUS ) );
		b.append('.');
		b.append( getFieldValue( StudentDTD.HOMEENROLLMENT_GRADELEVEL ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.HOMEENROLLMENT_STATUS, StudentDTD.HOMEENROLLMENT_GRADELEVEL };
	}

	/**
	 *  Gets the value of the <code>&lt;StudentSchoolEnrollmentRefId&gt;</code> element.
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"EnrollmentId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"StudentSchoolEnrollmentRefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>StudentSchoolEnrollmentRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getStudentSchoolEnrollmentRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.HOMEENROLLMENT_STUDENTSCHOOLENROLLMENTREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentSchoolEnrollmentRefId&gt;</code> element.
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"EnrollmentId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"StudentSchoolEnrollmentRefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStudentSchoolEnrollmentRefId( String value ) { 
		setFieldValue( StudentDTD.HOMEENROLLMENT_STUDENTSCHOOLENROLLMENTREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the school."</i><p>
	 *
	 *  @return The <code>SchoolName</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSchoolName() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.HOMEENROLLMENT_SCHOOLNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the school."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolName( String value ) { 
		setFieldValue( StudentDTD.HOMEENROLLMENT_SCHOOLNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Provide both the HomeEnrollment/SchoolId and HomeEnrollment/LocalId elements if possible. If not, one or the other must be provided."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SchoolId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SchoolInfoRefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.HOMEENROLLMENT_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolInfoRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Provide both the HomeEnrollment/SchoolId and HomeEnrollment/LocalId elements if possible. If not, one or the other must be provided."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SchoolId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SchoolInfoRefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( StudentDTD.HOMEENROLLMENT_SCHOOLINFOREFID, new SIFString( value ), value );
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
	 *  @since 1.5r1
	 */
	public String getLocalId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.HOMEENROLLMENT_LOCALID );
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
	 *  @since 1.5r1
	 */
	public void setLocalId( String value ) { 
		setFieldValue( StudentDTD.HOMEENROLLMENT_LOCALID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The state or province defined identifier for this school."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"StatePrId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"StateProvinceId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>StateProvinceId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getStateProvinceId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.HOMEENROLLMENT_STATEPROVINCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The state or province defined identifier for this school."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"StatePrId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"StateProvinceId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStateProvinceId( String value ) { 
		setFieldValue( StudentDTD.HOMEENROLLMENT_STATEPROVINCEID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment status as of the SnapDate."</i><p>
	 *
	 *  @return The <code>Status</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getStatus() { 
		return getFieldValue( StudentDTD.HOMEENROLLMENT_STATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment status as of the SnapDate."</i><p>
	 *
	 *  @param value A constant defined by the <code>HomeEnrollmentStatus</code> class
	 *  @since 1.5r1
	 */
	public void setStatus( HomeEnrollmentStatus value ) { 
		setField( StudentDTD.HOMEENROLLMENT_STATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Status&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment status as of the SnapDate."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setStatus( String value ) { 
		setField( StudentDTD.HOMEENROLLMENT_STATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade or academic level of student."</i><p>
	 *
	 *  @param value A <code>GradeLevel</code> object
	 *  @since 1.5r1
	 */
	public void setGradeLevel( GradeLevel value ) { 
		removeChild( StudentDTD.HOMEENROLLMENT_GRADELEVEL );
		addChild( StudentDTD.HOMEENROLLMENT_GRADELEVEL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevel&gt;</code> child element.
	 *  This form of <code>setGradeLevel</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGradeLevel</code>
	 *  that accepts a single <code>GradeLevel</code> object.
	 *
	 *  @param code Code representing the grade level.
	 *  @since 1.5r1
	 */
	public void setGradeLevel( GradeLevelCode code ) {
		removeChild( StudentDTD.HOMEENROLLMENT_GRADELEVEL);
		addChild( StudentDTD.HOMEENROLLMENT_GRADELEVEL, new GradeLevel( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Grade or academic level of student."</i><p>
	 *
	 *  @return A <code>GradeLevel</code> object
	 *  @since 1.5r1
	 */
	public GradeLevel getGradeLevel() { 
		return (GradeLevel)getChild( StudentDTD.HOMEENROLLMENT_GRADELEVEL);
	}

	/**
	 *  Removes the <code>GradeLevel</code> child element previously created by calling <code>setGradeLevel</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeGradeLevel() { 
		removeChild( StudentDTD.HOMEENROLLMENT_GRADELEVEL );
	}

	/**
	 *  Sets the value of the <code>&lt;Homeroom&gt;</code> element.
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"HomeroomId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Homeroom"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>Homeroom</code> object
	 *  @since 1.5r1
	 */
	public void setHomeroom( Homeroom value ) { 
		removeChild( StudentDTD.HOMEENROLLMENT_HOMEROOM );
		addChild( StudentDTD.HOMEENROLLMENT_HOMEROOM, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Homeroom&gt;</code> child element.
	 *  This form of <code>setHomeroom</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setHomeroom</code>
	 *  that accepts a single <code>Homeroom</code> object.
	 *
	 *  @param sifRefObject The name of the object referenced.
	 *  @param value Gets or sets the content value of the &lt;Homeroom&gt; element
	 *  @since 1.5r1
	 */
	public void setHomeroom( String sifRefObject, String value ) {
		removeChild( StudentDTD.HOMEENROLLMENT_HOMEROOM);
		addChild( StudentDTD.HOMEENROLLMENT_HOMEROOM, new Homeroom( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Homeroom&gt;</code> element.
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"HomeroomId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Homeroom"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return An <code>Homeroom</code> object
	 *  @since 1.5r1
	 */
	public Homeroom getHomeroom() { 
		return (Homeroom)getChild( StudentDTD.HOMEENROLLMENT_HOMEROOM);
	}

	/**
	 *  Removes the <code>Homeroom</code> child element previously created by calling <code>setHomeroom</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeHomeroom() { 
		removeChild( StudentDTD.HOMEENROLLMENT_HOMEROOM );
	}

	/**
	 *  Gets the value of the <code>&lt;HomeroomNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier for this room."</i><p>
	 *
	 *  @return The <code>HomeroomNumber</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getHomeroomNumber() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.HOMEENROLLMENT_HOMEROOMNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;HomeroomNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier for this room."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setHomeroomNumber( String value ) { 
		setFieldValue( StudentDTD.HOMEENROLLMENT_HOMEROOMNUMBER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FullYearEnrollment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication as to whether or not the student was enrolled for the whole school year. If the SchoolYear is in progress as of the SnapDate, use the value "Unknown"."</i><p>
	 *
	 *  @return The <code>FullYearEnrollment</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getFullYearEnrollment() { 
		return getFieldValue( StudentDTD.HOMEENROLLMENT_FULLYEARENROLLMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;FullYearEnrollment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication as to whether or not the student was enrolled for the whole school year. If the SchoolYear is in progress as of the SnapDate, use the value "Unknown"."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 1.5r1
	 */
	public void setFullYearEnrollment( YesNoUnknown value ) { 
		setField( StudentDTD.HOMEENROLLMENT_FULLYEARENROLLMENT, value );
	}

	/**
	 *  Sets the value of the <code>&lt;FullYearEnrollment&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An indication as to whether or not the student was enrolled for the whole school year. If the SchoolYear is in progress as of the SnapDate, use the value "Unknown"."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setFullYearEnrollment( String value ) { 
		setField( StudentDTD.HOMEENROLLMENT_FULLYEARENROLLMENT, value );
	}

}