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
public class InstructionalLevel extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public InstructionalLevel() {
		super( CommonDTD.INSTRUCTIONALLEVEL );
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code representing the general nature and difficulty of instruction provided."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getCode() { 
		return getFieldValue( CommonDTD.INSTRUCTIONALLEVEL_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code representing the general nature and difficulty of instruction provided."</i><p>
	 *
	 *  @param value A constant defined by the <code>InstructionalLevelCode</code> class
	 *  @since 1.5r1
	 */
	public void setCode( InstructionalLevelCode value ) { 
		setField( CommonDTD.INSTRUCTIONALLEVEL_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code representing the general nature and difficulty of instruction provided."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setCode( String value ) { 
		setField( CommonDTD.INSTRUCTIONALLEVEL_CODE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( CommonDTD.INSTRUCTIONALLEVEL_OTHERCODELIST );
		addChild( CommonDTD.INSTRUCTIONALLEVEL_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( CommonDTD.INSTRUCTIONALLEVEL_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 2.0
	 */
	public void removeOtherCodeList() { 
		removeChild( CommonDTD.INSTRUCTIONALLEVEL_OTHERCODELIST );
	}

}