// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class AdditionalProgramAvailabilityList extends SIFKeyedList<ProgramAvailability>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AdditionalProgramAvailabilityList() {
		super( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param programAvailability 
	 */
	public AdditionalProgramAvailabilityList( ProgramAvailability programAvailability ) {
		super( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST );
		this.safeAddChild( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST_PROGRAMAVAILABILITY, programAvailability );
	}

	/**
	 *  Adds a new <code>&lt;ProgramAvailability&gt;</code> repeatable element.
	 *  This form of <code>setProgramAvailability</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setProgramAvailability</code>
	 *  that accepts a single <code>ProgramAvailability</code> object.
	 *
	 *  @param code Describes the availability of the program.
	 *  @since 2.4
	 */
	public void addProgramAvailability( ProgramAvailabilityCode code ) {
		addChild( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST_PROGRAMAVAILABILITY, new ProgramAvailability( code ) );
	}

	/**
	 *  Removes a <code>ProgramAvailability</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the ProgramAvailability object to remove by its Code value
	 *  @since 2.4
	 */
	public void removeProgramAvailability( ProgramAvailabilityCode code ) { 
		removeChild( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST_PROGRAMAVAILABILITY, new String[] { code.toString() } );
	}

	/**
	 *  Gets a <code>ProgramAvailability</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param code Identifies the ProgramAvailability object to return by its "Code" attribute value
	 *  @return A <code>ProgramAvailability</code> object
	 *  @since 2.4
	 */
	public ProgramAvailability getProgramAvailability( ProgramAvailabilityCode code ) { 
		return (ProgramAvailability)getChild( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST_PROGRAMAVAILABILITY, new String[] { code.toString() } );
	}

	/**
	 *  Gets all <code>ProgramAvailability</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>ProgramAvailability</code> objects
	 *  @since 2.4
	 */
	public ProgramAvailability[] getProgramAvailabilitys() {
		List<SIFElement> v = getChildList( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST_PROGRAMAVAILABILITY);
		ProgramAvailability[] cvt = new ProgramAvailability[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>ProgramAvailability</code> objects. All existing 
	 * <code>ProgramAvailability</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>ProgramAvailabilitys</code>.
	 *
	 *  @since 2.4
	 */
	public void setProgramAvailabilitys( ProgramAvailability[] programavailabilitys ) {
		setChildren( ProgramsDTD.ADDITIONALPROGRAMAVAILABILITYLIST_PROGRAMAVAILABILITY, programavailabilitys );
	}

}