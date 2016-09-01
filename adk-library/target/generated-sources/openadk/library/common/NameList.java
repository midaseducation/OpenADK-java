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
 *  @version 1.5r1
 *  @since 1.5r1
 */
public class NameList extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public NameList() {
		super( CommonDTD.NAMELIST );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name(s) of the student.For a description of this element, see the common element 5.1.18 Name."</i><p>
	 *
	 *  @return The <code>Name</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getName() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.NAMELIST_NAME );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name(s) of the student.For a description of this element, see the common element 5.1.18 Name."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setName( String value ) { 
		setFieldValue( CommonDTD.NAMELIST_NAME, new SIFString( value ), value );
	}

}