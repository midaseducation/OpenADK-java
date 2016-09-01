// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a Codeset
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a Codeset object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class Codeset extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("Other")
	 */
	public static final Codeset OTHER = new Codeset("Other");

	/**
	 *  Text ("Text")
	 */
	public static final Codeset TEXT = new Codeset("Text");

	/**
	 *  StatePr ("StateProvince")
	 */
	public static final Codeset STATEPR = new Codeset("StateProvince");

	/**
	 *  Local ("Local")
	 */
	public static final Codeset LOCAL = new Codeset("Local");

	/**
	 *  Wrap an arbitrary string value in a Codeset object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static Codeset wrap( String value ) {
		return new Codeset( value );
	}

	private Codeset( String value ) {
		super(value);
	}
}
