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
 *  @since 2.0
 */
public class SIFColumnHeader extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIFColumnHeader() {
		super( InfraDTD.SIFCOLUMNHEADER );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param objectName 
	 *  @param value Gets or sets the content value of the &lt;SIFColumnHeader&gt; element
	 */
	public SIFColumnHeader( String objectName, String value ) {
		super( InfraDTD.SIFCOLUMNHEADER );
		this.setObjectName(objectName);
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InfraDTD.SIFCOLUMNHEADER_OBJECTNAME );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIFCOLUMNHEADER_OBJECTNAME };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SIFColumnHeader&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.0
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIFCOLUMNHEADER );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SIFColumnHeader&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setValue( String value ) { 
		setFieldValue( InfraDTD.SIFCOLUMNHEADER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>ObjectName</code> attribute.
	 *
	 *  @return The <code>ObjectName</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getObjectName() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIFCOLUMNHEADER_OBJECTNAME );
	}

	/**
	 *  Sets the value of the <code>ObjectName</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setObjectName( String value ) { 
		setFieldValue( InfraDTD.SIFCOLUMNHEADER_OBJECTNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Alias</code> attribute.
	 *
	 *  @return The <code>Alias</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getAlias() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIFCOLUMNHEADER_ALIAS );
	}

	/**
	 *  Sets the value of the <code>Alias</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setAlias( String value ) { 
		setFieldValue( InfraDTD.SIFCOLUMNHEADER_ALIAS, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>XsiType</code> attribute.
	 *
	 *  @return The <code>XsiType</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getXsiType() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIFCOLUMNHEADER_XSITYPE );
	}

	/**
	 *  Sets the value of the <code>XsiType</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setXsiType( String value ) { 
		setFieldValue( InfraDTD.SIFCOLUMNHEADER_XSITYPE, new SIFString( value ), value );
	}

}
