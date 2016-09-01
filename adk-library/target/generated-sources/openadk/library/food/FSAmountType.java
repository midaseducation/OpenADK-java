// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.food;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a FSAmountType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a FSAmountType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FSAmountType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Value ("Value")
	 */
	public static final FSAmountType ACTUAL_VALUE = new FSAmountType("Value");

	/**
	 *  Check ("Check")
	 */
	public static final FSAmountType CHECK = new FSAmountType("Check");

	/**
	 *  Lunch Credit ("LunchCredit")
	 */
	public static final FSAmountType LUNCHCREDIT = new FSAmountType("LunchCredit");

	/**
	 *  Cash ("Cash")
	 */
	public static final FSAmountType CASH = new FSAmountType("Cash");

	/**
	 *  Breakfast Credit ("BreakfastCredit")
	 */
	public static final FSAmountType BREAKFASTCREDIT = new FSAmountType("BreakfastCredit");

	/**
	 *  ACH ("ACH")
	 */
	public static final FSAmountType ACH = new FSAmountType("ACH");

	/**
	 *  Credit Card ("CreditCard")
	 */
	public static final FSAmountType CREDITCARD = new FSAmountType("CreditCard");

	/**
	 *  Wrap an arbitrary string value in a FSAmountType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static FSAmountType wrap( String value ) {
		return new FSAmountType( value );
	}

	private FSAmountType( String value ) {
		super(value);
	}
}
