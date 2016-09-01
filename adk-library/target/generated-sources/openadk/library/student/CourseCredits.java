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
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class CourseCredits extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CourseCredits() {
		super( StudentDTD.COURSECREDITS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type The type of credit offered
	 *  @param value Gets or sets the content value of the &lt;CourseCredits&gt; element
	 */
	public CourseCredits( CreditType type, BigDecimal value ) {
		super( StudentDTD.COURSECREDITS );
		this.setType( type );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( StudentDTD.COURSECREDITS_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.COURSECREDITS_TYPE };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;CourseCredits&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.1
	 */
	public BigDecimal getValue() { 
		return (BigDecimal) getSIFSimpleFieldValue( StudentDTD.COURSECREDITS );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;CourseCredits&gt; element"</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 1.1
	 */
	public void setValue( BigDecimal value ) { 
		setFieldValue( StudentDTD.COURSECREDITS, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of credit offered"</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.1 (and greater)</font></td><td>"Code"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Type"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getType() { 
		return getFieldValue( StudentDTD.COURSECREDITS_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of credit offered"</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.1 (and greater)</font></td><td>"Code"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Type"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A constant defined by the <code>CreditType</code> class
	 *  @since 1.1
	 */
	public void setType( CreditType value ) { 
		setField( StudentDTD.COURSECREDITS_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The type of credit offered"</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.1 (and greater)</font></td><td>"Code"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Type"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setType( String value ) { 
		setField( StudentDTD.COURSECREDITS_TYPE, value );
	}

}
