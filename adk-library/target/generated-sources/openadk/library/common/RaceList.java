// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class RaceList extends SIFKeyedList<Race>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public RaceList() {
		super( CommonDTD.RACELIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param race 
	 */
	public RaceList( Race race ) {
		super( CommonDTD.RACELIST );
		this.safeAddChild( CommonDTD.RACELIST_RACE, race );
	}

	/**
	 *  Adds a new <code>&lt;Race&gt;</code> repeatable element.
	 *  This form of <code>setRace</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setRace</code>
	 *  that accepts a single <code>Race</code> object.
	 *
	 *  @param type A code that specifies the coding structure used. The default is "NA".
	 *  @param code The general racial category which reflects the individual's recognition of his or her community or with which the individual most identifies.
	 *  @since 1.1
	 */
	public void addRace( String type, RaceType code ) {
		addChild( CommonDTD.RACELIST_RACE, new Race( type, code ) );
	}

	/**
	 *  Removes a <code>Race</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the Race object to remove by its Code value
	 *  @since 1.1
	 */
	public void removeRace( RaceType code ) { 
		removeChild( CommonDTD.RACELIST_RACE, new String[] { code.toString() } );
	}

	/**
	 *  Gets a <code>Race</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the Race object to return by its "Code" attribute value
	 *  @return A <code>Race</code> object
	 *  @since 1.1
	 */
	public Race getRace( RaceType code ) { 
		return (Race)getChild( CommonDTD.RACELIST_RACE, new String[] { code.toString() } );
	}

	/**
	 *  Gets all <code>Race</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Race</code> objects
	 *  @since 1.1
	 */
	public Race[] getRaces() {
		List<SIFElement> v = getChildList( CommonDTD.RACELIST_RACE);
		Race[] cvt = new Race[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Race</code> objects. All existing 
	 * <code>Race</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Races</code>.
	 *
	 *  @since 1.1
	 */
	public void setRaces( Race[] races ) {
		setChildren( CommonDTD.RACELIST_RACE, races );
	}

}