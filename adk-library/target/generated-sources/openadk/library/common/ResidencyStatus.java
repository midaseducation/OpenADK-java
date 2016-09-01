// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ResidencyStatus extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ResidencyStatus() {
		super( CommonDTD.RESIDENCYSTATUS );
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the residency status for this enrollment."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getCode() { 
		return getFieldValue( CommonDTD.RESIDENCYSTATUS_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the residency status for this enrollment."</i><p>
	 *
	 *  @param value A constant defined by the <code>PublicSchoolResidenceStatus</code> class
	 *  @since 1.5r1
	 */
	public void setCode( PublicSchoolResidenceStatus value ) { 
		setField( CommonDTD.RESIDENCYSTATUS_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code indicating the residency status for this enrollment."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setCode( String value ) { 
		setField( CommonDTD.RESIDENCYSTATUS_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 1.5r1
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( CommonDTD.RESIDENCYSTATUS_OTHERCODELIST );
		addChild( CommonDTD.RESIDENCYSTATUS_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 1.5r1
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( CommonDTD.RESIDENCYSTATUS_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeOtherCodeList() { 
		removeChild( CommonDTD.RESIDENCYSTATUS_OTHERCODELIST );
	}

}