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
 *  @since 2.2
 */
public class AcademicSubject extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AcademicSubject() {
		super( EtranscriptsDTD.ACADEMICSUBJECT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param code A code to depict an academic or vocational discipline studied by an individual in an educational program (based on NCES CIP 2000).
	 */
	public AcademicSubject( PostsecondarySubjectMatterAreaType code ) {
		super( EtranscriptsDTD.ACADEMICSUBJECT );
		this.setCode( code );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( EtranscriptsDTD.ACADEMICSUBJECT_CODE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { EtranscriptsDTD.ACADEMICSUBJECT_CODE };
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code to depict an academic or vocational discipline studied by an individual in an educational program (based on NCES CIP 2000)."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 2.2
	 */
	public String getCode() { 
		return getFieldValue( EtranscriptsDTD.ACADEMICSUBJECT_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code to depict an academic or vocational discipline studied by an individual in an educational program (based on NCES CIP 2000)."</i><p>
	 *
	 *  @param value A constant defined by the <code>PostsecondarySubjectMatterAreaType</code> class
	 *  @since 2.2
	 */
	public void setCode( PostsecondarySubjectMatterAreaType value ) { 
		setField( EtranscriptsDTD.ACADEMICSUBJECT_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code to depict an academic or vocational discipline studied by an individual in an educational program (based on NCES CIP 2000)."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.2
	 */
	public void setCode( String value ) { 
		setField( EtranscriptsDTD.ACADEMICSUBJECT_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Alternate codes for an academic or vocational discipline studied by an individual in an educational program."</i><p>
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 2.2
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( EtranscriptsDTD.ACADEMICSUBJECT_OTHERCODELIST );
		addChild( EtranscriptsDTD.ACADEMICSUBJECT_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Alternate codes for an academic or vocational discipline studied by an individual in an educational program."</i><p>
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 2.2
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( EtranscriptsDTD.ACADEMICSUBJECT_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 2.2
	 */
	public void removeOtherCodeList() { 
		removeChild( EtranscriptsDTD.ACADEMICSUBJECT_OTHERCODELIST );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_ExtendedElements&gt;</code> element.
	 *
	 *  @param value A <code>SIF_ExtendedElements</code> object
	 *  @since 2.4
	 */
	public void setSIF_ExtendedElements( SIF_ExtendedElements value ) { 
		removeChild( EtranscriptsDTD.ACADEMICSUBJECT_SIF_EXTENDEDELEMENTS );
		addChild( EtranscriptsDTD.ACADEMICSUBJECT_SIF_EXTENDEDELEMENTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_ExtendedElements&gt;</code> element.
	 *
	 *  @return A <code>SIF_ExtendedElements</code> object
	 *  @since 2.4
	 */
	public SIF_ExtendedElements getSIF_ExtendedElements() { 
		return (SIF_ExtendedElements)getChild( EtranscriptsDTD.ACADEMICSUBJECT_SIF_EXTENDEDELEMENTS);
	}

	/**
	 *  Removes the <code>SIF_ExtendedElements</code> child element previously created by calling <code>setSIF_ExtendedElements</code>
	 *
	 *  @since 2.4
	 */
	public void removeSIF_ExtendedElements() { 
		removeChild( EtranscriptsDTD.ACADEMICSUBJECT_SIF_EXTENDEDELEMENTS );
	}

}