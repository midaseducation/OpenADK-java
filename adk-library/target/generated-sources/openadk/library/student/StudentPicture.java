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
 *  A student picture.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class StudentPicture extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentPicture() {
		super( ADK.getSIFVersion(), StudentDTD.STUDENTPICTURE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId Key
	 *  @param studentPersonalRefId This is the GUID of the student whose picture this is.
	 *  @param pictureSource This element defines the picture. If the Type attribute is URL, this is the location of the picture in [JPEG] format; if Type is JPEG, this is the [JPEG] image data encoded using the Base64 Content-Transfer-Encoding defined in Section 6.8 of [RFC 2045].
	 *  @param schoolYear 
        School year for which this enrollment is applicable, expressed as the four-digit year in which the school year
        ends (e.g. 2007 for the 2006-07 school year).
      
	 */
	public StudentPicture( String refId, String studentPersonalRefId, PictureSource pictureSource, Integer schoolYear ) {
		super( ADK.getSIFVersion(), StudentDTD.STUDENTPICTURE );
		this.setRefId(refId);
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setPictureSource(pictureSource);
		this.setSchoolYear(schoolYear);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( StudentDTD.STUDENTPICTURE_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.STUDENTPICTURE_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Key"</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.7
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.STUDENTPICTURE_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Key"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.7
	 */
	public void setRefId( String value ) { 
		setFieldValue( StudentDTD.STUDENTPICTURE_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the GUID of the student whose picture this is."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.STUDENTPICTURE_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the GUID of the student whose picture this is."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( StudentDTD.STUDENTPICTURE_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;PictureSource&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element defines the picture. If the Type attribute is URL, this is the location of the picture in [JPEG] format; if Type is JPEG, this is the [JPEG] image data encoded using the Base64 Content-Transfer-Encoding defined in Section 6.8 of [RFC 2045]."</i><p>
	 *
	 *  @param value A <code>PictureSource</code> object
	 *  @since 1.1
	 */
	public void setPictureSource( PictureSource value ) { 
		removeChild( StudentDTD.STUDENTPICTURE_PICTURESOURCE );
		addChild( StudentDTD.STUDENTPICTURE_PICTURESOURCE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;PictureSource&gt;</code> child element.
	 *  This form of <code>setPictureSource</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setPictureSource</code>
	 *  that accepts a single <code>PictureSource</code> object.
	 *
	 *  @param type The way the picture is specified.
	 *  @param value Gets or sets the content value of the &lt;PictureSource&gt; element
	 *  @since 1.1
	 */
	public void setPictureSource( PictureType type, String value ) {
		removeChild( StudentDTD.STUDENTPICTURE_PICTURESOURCE);
		addChild( StudentDTD.STUDENTPICTURE_PICTURESOURCE, new PictureSource( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;PictureSource&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element defines the picture. If the Type attribute is URL, this is the location of the picture in [JPEG] format; if Type is JPEG, this is the [JPEG] image data encoded using the Base64 Content-Transfer-Encoding defined in Section 6.8 of [RFC 2045]."</i><p>
	 *
	 *  @return A <code>PictureSource</code> object
	 *  @since 1.1
	 */
	public PictureSource getPictureSource() { 
		return (PictureSource)getChild( StudentDTD.STUDENTPICTURE_PICTURESOURCE);
	}

	/**
	 *  Removes the <code>PictureSource</code> child element previously created by calling <code>setPictureSource</code>
	 *
	 *  @since 1.1
	 */
	public void removePictureSource() { 
		removeChild( StudentDTD.STUDENTPICTURE_PICTURESOURCE );
	}

	/**
	 *  Gets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"
        School year for which this enrollment is applicable, expressed as the four-digit year in which the school year
        ends (e.g. 2007 for the 2006-07 school year).
      "</i><p>
	 *
	 *  @return The <code>SchoolYear</code> attribute of this object.
	 *  @since 2.0
	 */
	public Integer getSchoolYear() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.STUDENTPICTURE_SCHOOLYEAR );
	}

	/**
	 *  Sets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"
        School year for which this enrollment is applicable, expressed as the four-digit year in which the school year
        ends (e.g. 2007 for the 2006-07 school year).
      "</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setSchoolYear( Integer value ) { 
		setFieldValue( StudentDTD.STUDENTPICTURE_SCHOOLYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;OKToPublish&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Can the picture be published?"</i><p>
	 *
	 *  @return The <code>OKToPublish</code> element of this object.
	 *  @since 2.0
	 */
	public String getOKToPublish() { 
		return getFieldValue( StudentDTD.STUDENTPICTURE_OKTOPUBLISH );
	}

	/**
	 *  Sets the value of the <code>&lt;OKToPublish&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Can the picture be published?"</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.0
	 */
	public void setOKToPublish( YesNo value ) { 
		setField( StudentDTD.STUDENTPICTURE_OKTOPUBLISH, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OKToPublish&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Can the picture be published?"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setOKToPublish( String value ) { 
		setField( StudentDTD.STUDENTPICTURE_OKTOPUBLISH, value );
	}

}