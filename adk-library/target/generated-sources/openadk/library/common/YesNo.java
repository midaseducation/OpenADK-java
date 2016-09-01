// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a YesNo
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a YesNo object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class YesNo extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Yes ("Yes")
	 */
	public static final YesNo YES = new YesNo("Yes");

	/**
	 *  No ("No")
	 */
	public static final YesNo NO = new YesNo("No");

	/**
	 *  Wrap an arbitrary string value in a YesNo object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static YesNo wrap( String value ) {
		return new YesNo( value );
	}

	private YesNo( String value ) {
		super(value);
	}
}
