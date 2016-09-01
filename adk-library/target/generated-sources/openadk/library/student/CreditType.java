// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a CreditType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a CreditType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class CreditType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Converted occupational experience credit ("0601")
	 */
	public static final CreditType _0108_0601 = new CreditType("0601");

	/**
	 *  Correspondence credit ("0600")
	 */
	public static final CreditType _0108_0600 = new CreditType("0600");

	/**
	 *  Credit by examination ("0599")
	 */
	public static final CreditType _0108_0599 = new CreditType("0599");

	/**
	 *  Adult education credit ("0598")
	 */
	public static final CreditType _0108_0598 = new CreditType("0598");

	/**
	 *  Vocational credit ("0597")
	 */
	public static final CreditType _0108_0597 = new CreditType("0597");

	/**
	 *  Twelve month hour credit ("0596")
	 */
	public static final CreditType _0108_0596 = new CreditType("0596");

	/**
	 *  Long session hour credit ("0595")
	 */
	public static final CreditType _0108_0595 = new CreditType("0595");

	/**
	 *  Intersession hour credit ("0592")
	 */
	public static final CreditType _0108_0592 = new CreditType("0592");

	/**
	 *  Summer term hour credit ("0591")
	 */
	public static final CreditType _0108_0591 = new CreditType("0591");

	/**
	 *  Quinmester hour credit ("0589")
	 */
	public static final CreditType _0108_0589 = new CreditType("0589");

	/**
	 *  Quarter hour credit ("0588")
	 */
	public static final CreditType _0108_0588 = new CreditType("0588");

	/**
	 *  Mini-term hour credit ("0590")
	 */
	public static final CreditType _0108_0590 = new CreditType("0590");

	/**
	 *  Trimester hour credit ("0587")
	 */
	public static final CreditType _0108_0587 = new CreditType("0587");

	/**
	 *  Semester hour credit ("0586")
	 */
	public static final CreditType _0108_0586 = new CreditType("0586");

	/**
	 *  Other ("9999")
	 */
	public static final CreditType _0108_9999 = new CreditType("9999");

	/**
	 *  Carnegie unit ("0585")
	 */
	public static final CreditType _0108_0585 = new CreditType("0585");

	/**
	 *  None ("9998")
	 */
	public static final CreditType _0108_9998 = new CreditType("9998");

	/**
	 *  Wrap an arbitrary string value in a CreditType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static CreditType wrap( String value ) {
		return new CreditType( value );
	}

	private CreditType( String value ) {
		super(value);
	}
}