// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an ArrestStatus
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an ArrestStatus object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ArrestStatus extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Pending ("Pending")
	 */
	public static final ArrestStatus PENDING = new ArrestStatus("Pending");

	/**
	 *  Yes ("Yes")
	 */
	public static final ArrestStatus YES = new ArrestStatus("Yes");

	/**
	 *  No ("No")
	 */
	public static final ArrestStatus NO = new ArrestStatus("No");

	/**
	 *  Wrap an arbitrary string value in an ArrestStatus object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ArrestStatus wrap( String value ) {
		return new ArrestStatus( value );
	}

	private ArrestStatus( String value ) {
		super(value);
	}
}
