// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.food;

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
public class FSAmounts extends SIFKeyedList<FSAmount>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FSAmounts() {
		super( FoodDTD.FSAMOUNTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param amount 
	 */
	public FSAmounts( FSAmount amount ) {
		super( FoodDTD.FSAMOUNTS );
		this.safeAddChild( FoodDTD.FSAMOUNTS_AMOUNT, amount );
	}

	/**
	 *  Adds a new <code>&lt;Amount&gt;</code> repeatable element.
	 *  This form of <code>setAmount</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAmount</code>
	 *  that accepts a single <code>FSAmount</code> object.
	 *
	 *  @param type 
        Type of amount. The currency unit is implied; namely USD. Note that when this common element is used not all of the following values apply. There are notes to indicate values that are applicable.
      
	 *  @param credits 
        Number of credits. This attribute does not apply to Cash or Value
        and hence has a value 0. It only applies to types BreakfastCredit and LunchCredit.
      
	 *  @param value Gets or sets the content value of the &lt;FSAmount&gt; element
	 *  @since 1.5r1
	 */
	public void addAmount( FSAmountType type, BigDecimal credits, BigDecimal value ) {
		addChild( FoodDTD.FSAMOUNTS_AMOUNT, new FSAmount( type, credits, value ) );
	}

	/**
	 *  Removes a <code>FSAmount</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the FSAmount object to remove by its Value value
	 *  @since 1.5r1
	 */
	public void removeAmount( BigDecimal value ) { 
		removeChild( FoodDTD.FSAMOUNTS_AMOUNT, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>FSAmount</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the FSAmount object to return by its "Value" attribute value
	 *  @return A <code>FSAmount</code> object
	 *  @since 1.5r1
	 */
	public FSAmount getAmount( BigDecimal value ) { 
		return (FSAmount)getChild( FoodDTD.FSAMOUNTS_AMOUNT, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>FSAmount</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>FSAmount</code> objects
	 *  @since 1.5r1
	 */
	public FSAmount[] getAmounts() {
		List<SIFElement> v = getChildList( FoodDTD.FSAMOUNTS_AMOUNT);
		FSAmount[] cvt = new FSAmount[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>FSAmount</code> objects. All existing 
	 * <code>FSAmount</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>FSAmounts</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setAmounts( FSAmount[] amounts ) {
		setChildren( FoodDTD.FSAMOUNTS_AMOUNT, amounts );
	}

}
