// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

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
public class SIF_Condition extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_Condition() {
		super( InfraDTD.SIF_CONDITION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifElement This is the element/attribute being queried.  See below for syntax.
	 *  @param sifOperator The comparison operator for the condition.
	 *  @param sifValue SIF_Value is the data that is used to compare with the value of the element or attribute.
	 */
	public SIF_Condition( String sifElement, Operators sifOperator, String sifValue ) {
		super( InfraDTD.SIF_CONDITION );
		this.setSIF_Element(sifElement);
		this.setSIF_Operator( sifOperator );
		this.setSIF_Value(sifValue);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( InfraDTD.SIF_CONDITION_SIF_ELEMENT ) );
		b.append('.');
		b.append( getFieldValue( InfraDTD.SIF_CONDITION_SIF_OPERATOR ) );
		b.append('.');
		b.append( getFieldValue( InfraDTD.SIF_CONDITION_SIF_VALUE ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIF_CONDITION_SIF_ELEMENT, InfraDTD.SIF_CONDITION_SIF_OPERATOR, InfraDTD.SIF_CONDITION_SIF_VALUE };
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Element&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the element/attribute being queried.  See below for syntax."</i><p>
	 *
	 *  @return The <code>SIF_Element</code> element of this object.
	 *  @since 1.1
	 */
	public String getSIF_Element() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_CONDITION_SIF_ELEMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Element&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the element/attribute being queried.  See below for syntax."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSIF_Element( String value ) { 
		setFieldValue( InfraDTD.SIF_CONDITION_SIF_ELEMENT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Operator&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The comparison operator for the condition."</i><p>
	 *
	 *  @return The <code>SIF_Operator</code> element of this object.
	 *  @since 1.1
	 */
	public String getSIF_Operator() { 
		return getFieldValue( InfraDTD.SIF_CONDITION_SIF_OPERATOR );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Operator&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The comparison operator for the condition."</i><p>
	 *
	 *  @param value A constant defined by the <code>Operators</code> class
	 *  @since 1.1
	 */
	public void setSIF_Operator( Operators value ) { 
		setField( InfraDTD.SIF_CONDITION_SIF_OPERATOR, value );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Operator&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The comparison operator for the condition."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setSIF_Operator( String value ) { 
		setField( InfraDTD.SIF_CONDITION_SIF_OPERATOR, value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"SIF_Value is the data that is used to compare with the value of the element or attribute."</i><p>
	 *
	 *  @return The <code>SIF_Value</code> element of this object.
	 *  @since 1.1
	 */
	public String getSIF_Value() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_CONDITION_SIF_VALUE );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"SIF_Value is the data that is used to compare with the value of the element or attribute."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSIF_Value( String value ) { 
		setFieldValue( InfraDTD.SIF_CONDITION_SIF_VALUE, new SIFString( value ), value );
	}

}