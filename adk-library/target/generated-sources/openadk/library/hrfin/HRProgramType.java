// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.hrfin;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  The specific group of duties or responsibilities of position.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class HRProgramType extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public HRProgramType() {
		super( HrfinDTD.HRPROGRAMTYPE );
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getCode() { 
		return getFieldValue( HrfinDTD.HRPROGRAMTYPE_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>ProgramTypeCode</code> class
	 *  @since 1.5r1
	 */
	public void setCode( ProgramTypeCode value ) { 
		setField( HrfinDTD.HRPROGRAMTYPE_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setCode( String value ) { 
		setField( HrfinDTD.HRPROGRAMTYPE_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( HrfinDTD.HRPROGRAMTYPE_OTHERCODELIST );
		addChild( HrfinDTD.HRPROGRAMTYPE_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( HrfinDTD.HRPROGRAMTYPE_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 2.0
	 */
	public void removeOtherCodeList() { 
		removeChild( HrfinDTD.HRPROGRAMTYPE_OTHERCODELIST );
	}

}