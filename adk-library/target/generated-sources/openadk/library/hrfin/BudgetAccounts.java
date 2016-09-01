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
 *  @since 1.5r1
 */
public class BudgetAccounts extends SIFList<BudgetAccount>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public BudgetAccounts() {
		super( HrfinDTD.BUDGETACCOUNTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param budgetAccount 
	 */
	public BudgetAccounts( BudgetAccount budgetAccount ) {
		super( HrfinDTD.BUDGETACCOUNTS );
		this.safeAddChild( HrfinDTD.BUDGETACCOUNTS_BUDGETACCOUNT, budgetAccount );
	}

	/**
	 *  Adds a new <code>&lt;BudgetAccount&gt;</code> repeatable element.
	 *  This form of <code>setBudgetAccount</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setBudgetAccount</code>
	 *  that accepts a single <code>BudgetAccount</code> object.
	 *
	 *  @param accountClass Classification of budgetary account code summary
	 *  @param functionBreakdown Function breakdown of account code for summarization.
	 *  @param budgetAmount Summarized, positive amount without cents for breakdowns
	 *  @since 1.5r1
	 */
	public void addBudgetAccount( AccountClass accountClass, String functionBreakdown, MonetaryAmount budgetAmount ) {
		addChild( HrfinDTD.BUDGETACCOUNTS_BUDGETACCOUNT, new BudgetAccount( accountClass, functionBreakdown, budgetAmount ) );
	}

	/**
	 *  Gets all <code>BudgetAccount</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>BudgetAccount</code> objects
	 *  @since 1.5r1
	 */
	public BudgetAccount[] getBudgetAccounts() {
		List<SIFElement> v = getChildList( HrfinDTD.BUDGETACCOUNTS_BUDGETACCOUNT);
		BudgetAccount[] cvt = new BudgetAccount[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>BudgetAccount</code> objects. All existing 
	 * <code>BudgetAccount</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>BudgetAccounts</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setBudgetAccounts( BudgetAccount[] budgetaccounts ) {
		setChildren( HrfinDTD.BUDGETACCOUNTS_BUDGETACCOUNT, budgetaccounts );
	}

}
