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
 *  @since 2.0
 */
public class StudentGradeLevel extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentGradeLevel() {
		super( AssessmentDTD.STUDENTGRADELEVEL );
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code representing the grade level."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 2.0
	 */
	public String getCode() { 
		return getFieldValue( AssessmentDTD.STUDENTGRADELEVEL_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code representing the grade level."</i><p>
	 *
	 *  @param value A constant defined by the <code>GradeLevelCode</code> class
	 *  @since 2.0
	 */
	public void setCode( GradeLevelCode value ) { 
		setField( AssessmentDTD.STUDENTGRADELEVEL_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code representing the grade level."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setCode( String value ) { 
		setField( AssessmentDTD.STUDENTGRADELEVEL_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( AssessmentDTD.STUDENTGRADELEVEL_OTHERCODELIST );
		addChild( AssessmentDTD.STUDENTGRADELEVEL_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( AssessmentDTD.STUDENTGRADELEVEL_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 2.0
	 */
	public void removeOtherCodeList() { 
		removeChild( AssessmentDTD.STUDENTGRADELEVEL_OTHERCODELIST );
	}

}