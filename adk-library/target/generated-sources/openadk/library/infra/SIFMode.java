// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a SIFMode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a SIFMode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class SIFMode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Pull ("Pull")
	 */
	public static final SIFMode PULL = new SIFMode("Pull");

	/**
	 *  Push ("Push")
	 */
	public static final SIFMode PUSH = new SIFMode("Push");

	/**
	 *  Wrap an arbitrary string value in a SIFMode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static SIFMode wrap( String value ) {
		return new SIFMode( value );
	}

	private SIFMode( String value ) {
		super(value);
	}
}
