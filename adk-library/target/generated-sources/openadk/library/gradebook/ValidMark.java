// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.gradebook;

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
public class ValidMark extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ValidMark() {
		super( GradebookDTD.VALIDMARK );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param code String representing the actual Mark that would appear on the report card (e.g., "A+", "I", "100").
	 */
	public ValidMark( String code ) {
		super( GradebookDTD.VALIDMARK );
		this.setCode(code);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( GradebookDTD.VALIDMARK_CODE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { GradebookDTD.VALIDMARK_CODE };
	}

	/**
	 *  Gets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"String representing the actual Mark that would appear on the report card (e.g., "A+", "I", "100")."</i><p>
	 *
	 *  @return The <code>Code</code> element of this object.
	 *  @since 2.0
	 */
	public String getCode() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.VALIDMARK_CODE );
	}

	/**
	 *  Sets the value of the <code>&lt;Code&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"String representing the actual Mark that would appear on the report card (e.g., "A+", "I", "100")."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setCode( String value ) { 
		setFieldValue( GradebookDTD.VALIDMARK_CODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;NumericEquivalent&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Numeric equivalent for the Mark (e.g., 100, 4.0)."</i><p>
	 *
	 *  @return The <code>NumericEquivalent</code> element of this object.
	 *  @since 2.0
	 */
	public BigDecimal getNumericEquivalent() { 
		return (BigDecimal) getSIFSimpleFieldValue( GradebookDTD.VALIDMARK_NUMERICEQUIVALENT );
	}

	/**
	 *  Sets the value of the <code>&lt;NumericEquivalent&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Numeric equivalent for the Mark (e.g., 100, 4.0)."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.0
	 */
	public void setNumericEquivalent( BigDecimal value ) { 
		setFieldValue( GradebookDTD.VALIDMARK_NUMERICEQUIVALENT, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The description for this code. (e.g. "Excellent", "Participates in Class", "Incomplete", etc...)."</i><p>
	 *
	 *  @return The <code>Description</code> element of this object.
	 *  @since 2.0
	 */
	public String getDescription() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.VALIDMARK_DESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The description for this code. (e.g. "Excellent", "Participates in Class", "Incomplete", etc...)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setDescription( String value ) { 
		setFieldValue( GradebookDTD.VALIDMARK_DESCRIPTION, new SIFString( value ), value );
	}

}
