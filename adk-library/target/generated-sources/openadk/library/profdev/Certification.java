// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.profdev;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Employee certification area information<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Certification extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Certification() {
		super( ProfdevDTD.CERTIFICATION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param description Certification description as defined by state
	 */
	public Certification( String description ) {
		super( ProfdevDTD.CERTIFICATION );
		this.setDescription(description);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProfdevDTD.CERTIFICATION_DESCRIPTION );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProfdevDTD.CERTIFICATION_DESCRIPTION };
	}

	/**
	 *  Gets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Certification description as defined by state"</i><p>
	 *
	 *  @return The <code>Description</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getDescription() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.CERTIFICATION_DESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Certification description as defined by state"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setDescription( String value ) { 
		setFieldValue( ProfdevDTD.CERTIFICATION_DESCRIPTION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AreaAuthorized&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Area in which employee has certification"</i><p>
	 *
	 *  @return The <code>AreaAuthorized</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getAreaAuthorized() { 
		return getFieldValue( ProfdevDTD.CERTIFICATION_AREAAUTHORIZED );
	}

	/**
	 *  Sets the value of the <code>&lt;AreaAuthorized&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Area in which employee has certification"</i><p>
	 *
	 *  @param value A constant defined by the <code>TeachingArea</code> class
	 *  @since 1.5r1
	 */
	public void setAreaAuthorized( TeachingArea value ) { 
		setField( ProfdevDTD.CERTIFICATION_AREAAUTHORIZED, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AreaAuthorized&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Area in which employee has certification"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setAreaAuthorized( String value ) { 
		setField( ProfdevDTD.CERTIFICATION_AREAAUTHORIZED, value );
	}

}
