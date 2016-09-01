// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  The GUID of the RoomInfo referenced by this enrollment.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class HomeroomSif3 extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public HomeroomSif3() {
		super( AssessmentDTD.HOMEROOMSIF3 );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifRefObject The name of the object referenced.
	 *  @param value Gets or sets the content value of the &lt;HomeroomSif3&gt; element
	 */
	public HomeroomSif3( String sifRefObject, String value ) {
		super( AssessmentDTD.HOMEROOMSIF3 );
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
		return getFieldValue( AssessmentDTD.HOMEROOMSIF3 );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.HOMEROOMSIF3 };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;HomeroomSif3&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.6
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEROOMSIF3 );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;HomeroomSif3&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setValue( String value ) { 
		setFieldValue( AssessmentDTD.HOMEROOMSIF3, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SIF_RefObject</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The name of the object referenced."</i><p>
	 *
	 *  @return The <code>SIF_RefObject</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getSIF_RefObject() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.HOMEROOMSIF3_SIF_REFOBJECT );
	}

	/**
	 *  Sets the value of the <code>SIF_RefObject</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The name of the object referenced."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSIF_RefObject( String value ) { 
		setFieldValue( AssessmentDTD.HOMEROOMSIF3_SIF_REFOBJECT, new SIFString( value ), value );
	}

}
