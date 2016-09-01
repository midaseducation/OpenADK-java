// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a LogLevel
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a LogLevel object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class LogLevel extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Warning ("Warning")
	 */
	public static final LogLevel WARNING = new LogLevel("Warning");

	/**
	 *  Info ("Info")
	 */
	public static final LogLevel INFO = new LogLevel("Info");

	/**
	 *  Error ("Error")
	 */
	public static final LogLevel ERROR = new LogLevel("Error");

	/**
	 *  Wrap an arbitrary string value in a LogLevel object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static LogLevel wrap( String value ) {
		return new LogLevel( value );
	}

	private LogLevel( String value ) {
		super(value);
	}
}