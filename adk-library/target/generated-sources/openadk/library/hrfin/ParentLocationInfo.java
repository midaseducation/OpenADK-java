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
 *  A LocationInfo instance could be related to another LocationInfo.  This element will help create that relation.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ParentLocationInfo extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ParentLocationInfo() {
		super( HrfinDTD.PARENTLOCATIONINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifRefObject The name of the object referenced.
	 *  @param value Gets or sets the content value of the &lt;ParentLocationInfo&gt; element
	 */
	public ParentLocationInfo( String sifRefObject, String value ) {
		super( HrfinDTD.PARENTLOCATIONINFO );
		this.setSIF_RefObject(sifRefObject);
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( HrfinDTD.PARENTLOCATIONINFO_SIF_REFOBJECT );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { HrfinDTD.PARENTLOCATIONINFO_SIF_REFOBJECT };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;ParentLocationInfo&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.PARENTLOCATIONINFO );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;ParentLocationInfo&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setValue( String value ) { 
		setFieldValue( HrfinDTD.PARENTLOCATIONINFO, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SIF_RefObject</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The name of the object referenced."</i><p>
	 *
	 *  @return The <code>SIF_RefObject</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getSIF_RefObject() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.PARENTLOCATIONINFO_SIF_REFOBJECT );
	}

	/**
	 *  Sets the value of the <code>SIF_RefObject</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The name of the object referenced."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSIF_RefObject( String value ) { 
		setFieldValue( HrfinDTD.PARENTLOCATIONINFO_SIF_REFOBJECT, new SIFString( value ), value );
	}

}