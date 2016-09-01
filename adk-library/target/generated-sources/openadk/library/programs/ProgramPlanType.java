// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ProgramPlanType extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ProgramPlanType() {
		super( ProgramsDTD.PROGRAMPLANTYPE );
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The document that outlines the student program/plan as approved by parents, guardians, and staff."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getCode() { 
		return getFieldValue( ProgramsDTD.PROGRAMPLANTYPE_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The document that outlines the student program/plan as approved by parents, guardians, and staff."</i><p>
	 *
	 *  @param value A constant defined by the <code>ProgramPlanTypeCode</code> class
	 *  @since 1.5r1
	 */
	public void setCode( ProgramPlanTypeCode value ) { 
		setField( ProgramsDTD.PROGRAMPLANTYPE_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The document that outlines the student program/plan as approved by parents, guardians, and staff."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setCode( String value ) { 
		setField( ProgramsDTD.PROGRAMPLANTYPE_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 1.5r1
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( ProgramsDTD.PROGRAMPLANTYPE_OTHERCODELIST );
		addChild( ProgramsDTD.PROGRAMPLANTYPE_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 1.5r1
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( ProgramsDTD.PROGRAMPLANTYPE_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeOtherCodeList() { 
		removeChild( ProgramsDTD.PROGRAMPLANTYPE_OTHERCODELIST );
	}

}