// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.library;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a FineType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a FineType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class FineType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("Other")
	 */
	public static final FineType OTHER = new FineType("Other");

	/**
	 *  Overdue ("Overdue")
	 */
	public static final FineType OVERDUE = new FineType("Overdue");

	/**
	 *  Refund ("Refund")
	 */
	public static final FineType REFUND = new FineType("Refund");

	/**
	 *  Damaged ("Damaged")
	 */
	public static final FineType DAMAGED = new FineType("Damaged");

	/**
	 *  Lost ("Lost")
	 */
	public static final FineType LOST = new FineType("Lost");

	/**
	 *  Wrap an arbitrary string value in a FineType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static FineType wrap( String value ) {
		return new FineType( value );
	}

	private FineType( String value ) {
		super(value);
	}
}