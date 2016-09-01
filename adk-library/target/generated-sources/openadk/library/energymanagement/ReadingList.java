// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.energymanagement;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class ReadingList extends SIFKeyedList<Reading>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ReadingList() {
		super( EnergymanagementDTD.READINGLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param reading Values for the energy readings for each interval.
	 */
	public ReadingList( Reading reading ) {
		super( EnergymanagementDTD.READINGLIST );
		this.safeAddChild( EnergymanagementDTD.READINGLIST_READING, reading );
	}

	/**
	 *  Adds a new <code>&lt;Reading&gt;</code> repeatable element.
	 *  This form of <code>setReading</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setReading</code>
	 *  that accepts a single <code>Reading</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;Reading&gt; element
	 *  @since 2.6
	 */
	public void addReading( BigDecimal value ) {
		addChild( EnergymanagementDTD.READINGLIST_READING, new Reading( value ) );
	}

	/**
	 *  Removes a <code>Reading</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the Reading object to remove by its Value value
	 *  @since 2.6
	 */
	public void removeReading( BigDecimal value ) { 
		removeChild( EnergymanagementDTD.READINGLIST_READING, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>Reading</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the Reading object to return by its "Value" attribute value
	 *  @return A <code>Reading</code> object
	 *  @since 2.6
	 */
	public Reading getReading( BigDecimal value ) { 
		return (Reading)getChild( EnergymanagementDTD.READINGLIST_READING, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>Reading</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Reading</code> objects
	 *  @since 2.6
	 */
	public Reading[] getReadings() {
		List<SIFElement> v = getChildList( EnergymanagementDTD.READINGLIST_READING);
		Reading[] cvt = new Reading[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Reading</code> objects. All existing 
	 * <code>Reading</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Readings</code>.
	 *
	 *  @since 2.6
	 */
	public void setReadings( Reading[] readings ) {
		setChildren( EnergymanagementDTD.READINGLIST_READING, readings );
	}

}
