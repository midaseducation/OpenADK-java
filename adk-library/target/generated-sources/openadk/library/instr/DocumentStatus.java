// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a DocumentStatus
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a DocumentStatus object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class DocumentStatus extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Draft ("Draft")
	 */
	public static final DocumentStatus DRAFT = new DocumentStatus("Draft");

	/**
	 *  Archived ("Archived")
	 */
	public static final DocumentStatus ARCHIVED = new DocumentStatus("Archived");

	/**
	 *  Unknown ("Unknown")
	 */
	public static final DocumentStatus UNKNOWN = new DocumentStatus("Unknown");

	/**
	 *  Adopted ("Adopted")
	 */
	public static final DocumentStatus ADOPTED = new DocumentStatus("Adopted");

	/**
	 *  Wrap an arbitrary string value in a DocumentStatus object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static DocumentStatus wrap( String value ) {
		return new DocumentStatus( value );
	}

	private DocumentStatus( String value ) {
		super(value);
	}
}
