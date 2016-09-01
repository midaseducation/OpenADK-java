// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.hrfin;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an AccountTypeDetail
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an AccountTypeDetail object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class AccountTypeDetail extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Long Term Liability ("LongTermLiability")
	 */
	public static final AccountTypeDetail LONG_TERM_LIABILITY = new AccountTypeDetail("LongTermLiability");

	/**
	 *  Other Asset ("OtherAsset")
	 */
	public static final AccountTypeDetail OTHER_ASSET = new AccountTypeDetail("OtherAsset");

	/**
	 *  Current Asset ("CurrentAsset")
	 */
	public static final AccountTypeDetail CURRENT_ASSET = new AccountTypeDetail("CurrentAsset");

	/**
	 *  Fund Balance ("FundBalance")
	 */
	public static final AccountTypeDetail FUND_BALANCE = new AccountTypeDetail("FundBalance");

	/**
	 *  Other Liability ("OtherLiability")
	 */
	public static final AccountTypeDetail OTHER_LIABILITY = new AccountTypeDetail("OtherLiability");

	/**
	 *  Long Term Asset ("LongTermAsset")
	 */
	public static final AccountTypeDetail LONG_TERM_ASSET = new AccountTypeDetail("LongTermAsset");

	/**
	 *  Current Liability ("CurrentLiability")
	 */
	public static final AccountTypeDetail CURRENT_LIABILITY = new AccountTypeDetail("CurrentLiability");

	/**
	 *  Wrap an arbitrary string value in an AccountTypeDetail object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static AccountTypeDetail wrap( String value ) {
		return new AccountTypeDetail( value );
	}

	private AccountTypeDetail( String value ) {
		super(value);
	}
}