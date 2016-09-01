// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a Severity
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a Severity object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class Severity extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  High ("High")
	 */
	public static final Severity HIGH = new Severity("High");

	/**
	 *  Moderate ("Moderate")
	 */
	public static final Severity MODERATE = new Severity("Moderate");

	/**
	 *  Severe ("Severe")
	 */
	public static final Severity SEVERE = new Severity("Severe");

	/**
	 *  Unknown ("Unknown")
	 */
	public static final Severity UNKNOWN = new Severity("Unknown");

	/**
	 *  Low ("Low")
	 */
	public static final Severity LOW = new Severity("Low");

	/**
	 *  Wrap an arbitrary string value in a Severity object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static Severity wrap( String value ) {
		return new Severity( value );
	}

	private Severity( String value ) {
		super(value);
	}
}