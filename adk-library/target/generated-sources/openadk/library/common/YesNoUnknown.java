// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a YesNoUnknown
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a YesNoUnknown object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class YesNoUnknown extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Unknown ("Unknown")
	 */
	public static final YesNoUnknown UNKNOWN = new YesNoUnknown("Unknown");

	/**
	 *  Yes ("Yes")
	 */
	public static final YesNoUnknown YES = new YesNoUnknown("Yes");

	/**
	 *  No ("No")
	 */
	public static final YesNoUnknown NO = new YesNoUnknown("No");

	/**
	 *  Wrap an arbitrary string value in a YesNoUnknown object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static YesNoUnknown wrap( String value ) {
		return new YesNoUnknown( value );
	}

	private YesNoUnknown( String value ) {
		super(value);
	}
}