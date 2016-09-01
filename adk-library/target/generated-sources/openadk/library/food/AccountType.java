// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.food;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an AccountType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an AccountType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class AccountType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  PrepaidCash ("PrepaidCash")
	 */
	public static final AccountType PREPAIDCASH = new AccountType("PrepaidCash");

	/**
	 *  NA ("NA")
	 */
	public static final AccountType NA = new AccountType("NA");

	/**
	 *  LunchCredit ("LunchCredit")
	 */
	public static final AccountType LUNCHCREDIT = new AccountType("LunchCredit");

	/**
	 *  BreakfastCredit ("BreakfastCredit")
	 */
	public static final AccountType BREAKFASTCREDIT = new AccountType("BreakfastCredit");

	/**
	 *  Wrap an arbitrary string value in an AccountType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static AccountType wrap( String value ) {
		return new AccountType( value );
	}

	private AccountType( String value ) {
		super(value);
	}
}