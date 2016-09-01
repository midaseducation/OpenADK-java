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
 *  Contains an arbitary XML element, encoded in UTF-8<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class XMLData extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public XMLData() {
		super( CommonDTD.XMLDATA );
	}

	/**
	 *  Gets the value of the <code>Description</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Contains an optional description of the content or a processing hint with regard to its structure (e.g. named standard, file layout or XSD). Contents may be mandated in instances of this type, or types that follow the AbstractContentPackageType pattern."</i><p>
	 *
	 *  @return The <code>Description</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getDescription() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.XMLDATA_DESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>Description</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Contains an optional description of the content or a processing hint with regard to its structure (e.g. named standard, file layout or XSD). Contents may be mandated in instances of this type, or types that follow the AbstractContentPackageType pattern."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setDescription( String value ) { 
		setFieldValue( CommonDTD.XMLDATA_DESCRIPTION, new SIFString( value ), value );
	}


// BEGIN EXTRA METHODS (/Users/ajbrown/Projects/midas/OpenADK-java/adk-generator/../adk-generator/datadef/core/sif20/XMLData.txt)

	/**
	 * The XML DOM Document that is a child of this element
	 */
	private org.w3c.dom.Document fXmlData;
	
	/**
	 * Returns the XML DOM Document that is a chld of this element
	 * @return The DOM Document contained as a child of the <code>&lt;XMLData&gt;</code> or null
	 */
	public org.w3c.dom.Document getXML()
	{
		return fXmlData;
	}
	
	/**
	 * Sets an XML DOM Document as the child of this element
	 * @param doc
	 */
	public void setXML( org.w3c.dom.Document doc )
	{
		fXmlData = doc;
	}

// END EXTRA METHODS

}