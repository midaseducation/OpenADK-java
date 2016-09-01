// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.hrfin;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ExpenseAccounts extends SIFList<ExpenseAccount>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ExpenseAccounts() {
		super( HrfinDTD.EXPENSEACCOUNTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param expenseAccount 
	 */
	public ExpenseAccounts( ExpenseAccount expenseAccount ) {
		super( HrfinDTD.EXPENSEACCOUNTS );
		this.safeAddChild( HrfinDTD.EXPENSEACCOUNTS_EXPENSEACCOUNT, expenseAccount );
	}

	/**
	 *  Adds a new <code>&lt;ExpenseAccount&gt;</code> repeatable element.
	 *  This form of <code>setExpenseAccount</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setExpenseAccount</code>
	 *  that accepts a single <code>ExpenseAccount</code> object.
	 *
	 *  @param accountCode Account code charged to this item.
	 *  @param amount Amount charged to this account.
	 *  @since 2.0
	 */
	public void addExpenseAccount( String accountCode, MonetaryAmount amount ) {
		addChild( HrfinDTD.EXPENSEACCOUNTS_EXPENSEACCOUNT, new ExpenseAccount( accountCode, amount ) );
	}

	/**
	 *  Removes an <code>ExpenseAccount</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param accountCode Identifies the ExpenseAccount object to remove by its AccountCode value
	 *  @param amount Identifies the ExpenseAccount object to remove by its Amount value
	 *  @since 2.0
	 */
	public void removeExpenseAccount( String accountCode, MonetaryAmount amount ) { 
		removeChild( HrfinDTD.EXPENSEACCOUNTS_EXPENSEACCOUNT, new String[] { accountCode.toString(),amount.toString() } );
	}

	/**
	 *  Gets an <code>ExpenseAccount</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param accountCode Identifies the ExpenseAccount object to return by its "AccountCode" attribute value
	 *  @param amount Identifies the ExpenseAccount object to return by its "Amount" attribute value
	 *  @return An <code>ExpenseAccount</code> object
	 *  @since 2.0
	 */
	public ExpenseAccount getExpenseAccount( String accountCode, MonetaryAmount amount ) { 
		return (ExpenseAccount)getChild( HrfinDTD.EXPENSEACCOUNTS_EXPENSEACCOUNT, new String[] { accountCode.toString(),amount.toString() } );
	}

	/**
	 *  Gets all <code>ExpenseAccount</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>ExpenseAccount</code> objects
	 *  @since 2.0
	 */
	public ExpenseAccount[] getExpenseAccounts() {
		List<SIFElement> v = getChildList( HrfinDTD.EXPENSEACCOUNTS_EXPENSEACCOUNT);
		ExpenseAccount[] cvt = new ExpenseAccount[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>ExpenseAccount</code> objects. All existing 
	 * <code>ExpenseAccount</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>ExpenseAccounts</code>.
	 *
	 *  @since 2.0
	 */
	public void setExpenseAccounts( ExpenseAccount[] expenseaccounts ) {
		setChildren( HrfinDTD.EXPENSEACCOUNTS_EXPENSEACCOUNT, expenseaccounts );
	}

}