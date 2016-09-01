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
 *  @since 2.0
 */
public class CodesetValue extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CodesetValue() {
		super( CommonDTD.CODESETVALUE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param code The subject area code (i.e., the first two digits of the course classification code).
	 */
	public CodesetValue( String code ) {
		super( CommonDTD.CODESETVALUE );
		this.setCode(code);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( CommonDTD.CODESETVALUE_CODE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { CommonDTD.CODESETVALUE_CODE };
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The subject area code (i.e., the first two digits of the course classification code)."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 2.0
	 */
	public String getCode() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.CODESETVALUE_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The subject area code (i.e., the first two digits of the course classification code)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setCode( String value ) { 
		setFieldValue( CommonDTD.CODESETVALUE_CODE, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @param value A <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public void setOtherCodeList( OtherCodeList value ) { 
		removeChild( CommonDTD.CODESETVALUE_OTHERCODELIST );
		addChild( CommonDTD.CODESETVALUE_OTHERCODELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherCodeList&gt;</code> element.
	 *
	 *  @return An <code>OtherCodeList</code> object
	 *  @since 2.0
	 */
	public OtherCodeList getOtherCodeList() { 
		return (OtherCodeList)getChild( CommonDTD.CODESETVALUE_OTHERCODELIST);
	}

	/**
	 *  Removes the <code>OtherCodeList</code> child element previously created by calling <code>setOtherCodeList</code>
	 *
	 *  @since 2.0
	 */
	public void removeOtherCodeList() { 
		removeChild( CommonDTD.CODESETVALUE_OTHERCODELIST );
	}

	/**
	 *  Returns the value of the <i>Code</i> attribute
	 */
	public String toString() {
		return this.getCode();
	}

}
