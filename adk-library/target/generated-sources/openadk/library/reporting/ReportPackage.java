// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.reporting;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.infra.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ReportPackage extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ReportPackage() {
		super( ADK.getSIFVersion(), ReportingDTD.REPORTPACKAGE );
	}

	/**
	 *  Sets the value of the <code>&lt;XMLData&gt;</code> element.
	 *
	 *  @param value A <code>XMLData</code> object
	 *  @since 2.0
	 */
	public void setXMLData( XMLData value ) { 
		removeChild( ReportingDTD.REPORTPACKAGE_XMLDATA );
		addChild( ReportingDTD.REPORTPACKAGE_XMLDATA, value);
	}

	/**
	 *  Gets the value of the <code>&lt;XMLData&gt;</code> element.
	 *
	 *  @return A <code>XMLData</code> object
	 *  @since 2.0
	 */
	public XMLData getXMLData() { 
		return (XMLData)getChild( ReportingDTD.REPORTPACKAGE_XMLDATA);
	}

	/**
	 *  Removes the <code>XMLData</code> child element previously created by calling <code>setXMLData</code>
	 *
	 *  @since 2.0
	 */
	public void removeXMLData() { 
		removeChild( ReportingDTD.REPORTPACKAGE_XMLDATA );
	}

	/**
	 *  Sets the value of the <code>&lt;TextData&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains arbitrary text, encoded in UTF-8."</i><p>
	 *
	 *  @param value A <code>TextData</code> object
	 *  @since 2.0
	 */
	public void setTextData( TextData value ) { 
		removeChild( ReportingDTD.REPORTPACKAGE_TEXTDATA );
		addChild( ReportingDTD.REPORTPACKAGE_TEXTDATA, value);
	}

	/**
	 *  Sets the value of the <code>&lt;TextData&gt;</code> child element.
	 *  This form of <code>setTextData</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setTextData</code>
	 *  that accepts a single <code>TextData</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;TextData&gt; element
	 *  @since 2.0
	 */
	public void setTextData( String value ) {
		removeChild( ReportingDTD.REPORTPACKAGE_TEXTDATA);
		addChild( ReportingDTD.REPORTPACKAGE_TEXTDATA, new TextData( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;TextData&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains arbitrary text, encoded in UTF-8."</i><p>
	 *
	 *  @return A <code>TextData</code> object
	 *  @since 2.0
	 */
	public TextData getTextData() { 
		return (TextData)getChild( ReportingDTD.REPORTPACKAGE_TEXTDATA);
	}

	/**
	 *  Removes the <code>TextData</code> child element previously created by calling <code>setTextData</code>
	 *
	 *  @since 2.0
	 */
	public void removeTextData() { 
		removeChild( ReportingDTD.REPORTPACKAGE_TEXTDATA );
	}

	/**
	 *  Sets the value of the <code>&lt;BinaryData&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains the base64Binary encoding of binary or text data not encoded in UTF-8."</i><p>
	 *
	 *  @param value A <code>BinaryData</code> object
	 *  @since 2.0
	 */
	public void setBinaryData( BinaryData value ) { 
		removeChild( ReportingDTD.REPORTPACKAGE_BINARYDATA );
		addChild( ReportingDTD.REPORTPACKAGE_BINARYDATA, value);
	}

	/**
	 *  Sets the value of the <code>&lt;BinaryData&gt;</code> child element.
	 *  This form of <code>setBinaryData</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setBinaryData</code>
	 *  that accepts a single <code>BinaryData</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;BinaryData&gt; element
	 *  @since 2.0
	 */
	public void setBinaryData( String value ) {
		removeChild( ReportingDTD.REPORTPACKAGE_BINARYDATA);
		addChild( ReportingDTD.REPORTPACKAGE_BINARYDATA, new BinaryData( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;BinaryData&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains the base64Binary encoding of binary or text data not encoded in UTF-8."</i><p>
	 *
	 *  @return A <code>BinaryData</code> object
	 *  @since 2.0
	 */
	public BinaryData getBinaryData() { 
		return (BinaryData)getChild( ReportingDTD.REPORTPACKAGE_BINARYDATA);
	}

	/**
	 *  Removes the <code>BinaryData</code> child element previously created by calling <code>setBinaryData</code>
	 *
	 *  @since 2.0
	 */
	public void removeBinaryData() { 
		removeChild( ReportingDTD.REPORTPACKAGE_BINARYDATA );
	}

	/**
	 *  Sets the value of the <code>&lt;Reference&gt;</code> element.
	 *
	 *  @param value A <code>Reference</code> object
	 *  @since 2.0
	 */
	public void setReference( Reference value ) { 
		removeChild( ReportingDTD.REPORTPACKAGE_REFERENCE );
		addChild( ReportingDTD.REPORTPACKAGE_REFERENCE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Reference&gt;</code> child element.
	 *  This form of <code>setReference</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setReference</code>
	 *  that accepts a single <code>Reference</code> object.
	 *
	 *  @param url Location of external content.
	 *  @param value Gets or sets the content value of the &lt;Reference&gt; element
	 *  @since 2.0
	 */
	public void setReference( String url, String value ) {
		removeChild( ReportingDTD.REPORTPACKAGE_REFERENCE);
		addChild( ReportingDTD.REPORTPACKAGE_REFERENCE, new Reference( url, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Reference&gt;</code> element.
	 *
	 *  @return A <code>Reference</code> object
	 *  @since 2.0
	 */
	public Reference getReference() { 
		return (Reference)getChild( ReportingDTD.REPORTPACKAGE_REFERENCE);
	}

	/**
	 *  Removes the <code>Reference</code> child element previously created by calling <code>setReference</code>
	 *
	 *  @since 2.0
	 */
	public void removeReference() { 
		removeChild( ReportingDTD.REPORTPACKAGE_REFERENCE );
	}

}
