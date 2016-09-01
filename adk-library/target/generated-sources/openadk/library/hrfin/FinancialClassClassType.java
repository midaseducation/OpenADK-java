// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.hrfin;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a FinancialClassClassType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a FinancialClassClassType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FinancialClassClassType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *   ("Expense")
	 */
	public static final FinancialClassClassType EXPENSE = new FinancialClassClassType("Expense");

	/**
	 *   ("Liability")
	 */
	public static final FinancialClassClassType LIABILITY = new FinancialClassClassType("Liability");

	/**
	 *   ("Asset")
	 */
	public static final FinancialClassClassType ASSET = new FinancialClassClassType("Asset");

	/**
	 *   ("Revenue")
	 */
	public static final FinancialClassClassType REVENUE = new FinancialClassClassType("Revenue");

	/**
	 *  Wrap an arbitrary string value in a FinancialClassClassType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static FinancialClassClassType wrap( String value ) {
		return new FinancialClassClassType( value );
	}

	private FinancialClassClassType( String value ) {
		super(value);
	}
}
