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
 *  @since 2.0
 */
public class HistoricalMealStatus extends SIFKeyedList<MealStatus>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public HistoricalMealStatus() {
		super( FoodDTD.HISTORICALMEALSTATUS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param mealStatus 
        The student's meal status.  Note that as this status is historical, StartDate and EndDate together,
        and/or SchoolYear MUST be included.  If SchoolYear is included,
        StartDate and EndDate should not cross school year boundaries, i.e. in addition to multiple
        statuses being a possibility in a given school year, the same status may be repeated so StartDate and EndDate don't
        disagree with SchoolYear, if included.
      
	 */
	public HistoricalMealStatus( MealStatus mealStatus ) {
		super( FoodDTD.HISTORICALMEALSTATUS );
		this.safeAddChild( FoodDTD.HISTORICALMEALSTATUS_MEALSTATUS, mealStatus );
	}

	/**
	 *  Adds a new <code>&lt;MealStatus&gt;</code> repeatable element.
	 *  This form of <code>setMealStatus</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setMealStatus</code>
	 *  that accepts a single <code>MealStatus</code> object.
	 *
	 *  @param type Meal status type.
	 *  @since 2.0
	 */
	public void addMealStatus( FreeReducedStatus type ) {
		addChild( FoodDTD.HISTORICALMEALSTATUS_MEALSTATUS, new MealStatus( type ) );
	}

	/**
	 *  Removes a <code>MealStatus</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the MealStatus object to remove by its Type value
	 *  @since 2.0
	 */
	public void removeMealStatus( FreeReducedStatus type ) { 
		removeChild( FoodDTD.HISTORICALMEALSTATUS_MEALSTATUS, new String[] { type.toString() } );
	}

	/**
	 *  Gets a <code>MealStatus</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the MealStatus object to return by its "Type" attribute value
	 *  @return A <code>MealStatus</code> object
	 *  @since 2.0
	 */
	public MealStatus getMealStatus( FreeReducedStatus type ) { 
		return (MealStatus)getChild( FoodDTD.HISTORICALMEALSTATUS_MEALSTATUS, new String[] { type.toString() } );
	}

	/**
	 *  Gets all <code>MealStatus</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>MealStatus</code> objects
	 *  @since 2.0
	 */
	public MealStatus[] getMealStatuses() {
		List<SIFElement> v = getChildList( FoodDTD.HISTORICALMEALSTATUS_MEALSTATUS);
		MealStatus[] cvt = new MealStatus[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>MealStatus</code> objects. All existing 
	 * <code>MealStatus</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>MealStatuses</code>.
	 *
	 *  @since 2.0
	 */
	public void setMealStatuses( MealStatus[] mealstatuses ) {
		setChildren( FoodDTD.HISTORICALMEALSTATUS_MEALSTATUS, mealstatuses );
	}

}
