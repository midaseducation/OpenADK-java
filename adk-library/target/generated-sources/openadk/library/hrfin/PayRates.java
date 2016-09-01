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
public class PayRates extends SIFKeyedList<PayRate>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public PayRates() {
		super( HrfinDTD.PAYRATES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param payRate 
	 */
	public PayRates( PayRate payRate ) {
		super( HrfinDTD.PAYRATES );
		this.safeAddChild( HrfinDTD.PAYRATES_PAYRATE, payRate );
	}

	/**
	 *  Adds a new <code>&lt;PayRate&gt;</code> repeatable element.
	 *  This form of <code>setPayRate</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setPayRate</code>
	 *  that accepts a single <code>PayRate</code> object.
	 *
	 *  @param type Type of pay
	 *  @param amount Pay amount.
	 *  @param percentage Percentage of pay this represents.
	 *  @since 1.5r1
	 */
	public void addPayRate( PayRateType type, MonetaryAmount amount, BigDecimal percentage ) {
		addChild( HrfinDTD.PAYRATES_PAYRATE, new PayRate( type, amount, percentage ) );
	}

	/**
	 *  Removes a <code>PayRate</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the PayRate object to remove by its Type value
	 *  @since 1.5r1
	 */
	public void removePayRate( PayRateType type ) { 
		removeChild( HrfinDTD.PAYRATES_PAYRATE, new String[] { type.toString() } );
	}

	/**
	 *  Gets a <code>PayRate</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the PayRate object to return by its "Type" attribute value
	 *  @return A <code>PayRate</code> object
	 *  @since 1.5r1
	 */
	public PayRate getPayRate( PayRateType type ) { 
		return (PayRate)getChild( HrfinDTD.PAYRATES_PAYRATE, new String[] { type.toString() } );
	}

	/**
	 *  Gets all <code>PayRate</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>PayRate</code> objects
	 *  @since 1.5r1
	 */
	public PayRate[] getPayRates() {
		List<SIFElement> v = getChildList( HrfinDTD.PAYRATES_PAYRATE);
		PayRate[] cvt = new PayRate[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>PayRate</code> objects. All existing 
	 * <code>PayRate</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>PayRates</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setPayRates( PayRate[] payrates ) {
		setChildren( HrfinDTD.PAYRATES_PAYRATE, payrates );
	}

}
