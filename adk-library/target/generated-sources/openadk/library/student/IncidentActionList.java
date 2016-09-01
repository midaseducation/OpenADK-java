// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  List of actions taken on the incident, regardless of actions relating to individual offenders.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class IncidentActionList extends SIFList<IncidentAction>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public IncidentActionList() {
		super( StudentDTD.INCIDENTACTIONLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param incidentAction 
	 */
	public IncidentActionList( IncidentAction incidentAction ) {
		super( StudentDTD.INCIDENTACTIONLIST );
		this.safeAddChild( StudentDTD.INCIDENTACTIONLIST_INCIDENTACTION, incidentAction );
	}

	/**
	 *  Adds a new <code>&lt;IncidentAction&gt;</code> repeatable element.
	 *  This form of <code>setIncidentAction</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIncidentAction</code>
	 *  that accepts a single <code>IncidentAction</code> object.
	 *
	 *  @param startDate The date on which the action begins.
	 *  @param endDate The date through which the action is in effect, inclusive.
	 *  @param duration Identifies the length, in school days, of the action. Note: decimal places may be used for fractions of school days.
	 *  @param zeroTolerance Identifies whether or not this action was imposed as a consequence of state or local zero tolerance policies.
	 *  @param policeNotification Identifies whether there was notification of local law enforcement, regardless of whether official action was taken.
	 *  @param arrest Identifies whether there were any arrests.
	 *  @since 2.4
	 */
	public void addIncidentAction( Calendar startDate, Calendar endDate, BigDecimal duration, YesNo zeroTolerance, YesNo policeNotification, IncidentActionArrestType arrest ) {
		addChild( StudentDTD.INCIDENTACTIONLIST_INCIDENTACTION, new IncidentAction( startDate, endDate, duration, zeroTolerance, policeNotification, arrest ) );
	}

	/**
	 *  Removes an <code>IncidentAction</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param startDate Identifies the IncidentAction object to remove by its StartDate value
	 *  @param endDate Identifies the IncidentAction object to remove by its EndDate value
	 *  @param duration Identifies the IncidentAction object to remove by its Duration value
	 *  @param zeroTolerance Identifies the IncidentAction object to remove by its ZeroTolerance value
	 *  @param policeNotification Identifies the IncidentAction object to remove by its PoliceNotification value
	 *  @param arrest Identifies the IncidentAction object to remove by its Arrest value
	 *  @since 2.4
	 */
	public void removeIncidentAction( Calendar startDate, Calendar endDate, BigDecimal duration, YesNo zeroTolerance, YesNo policeNotification, IncidentActionArrestType arrest ) { 
		removeChild( StudentDTD.INCIDENTACTIONLIST_INCIDENTACTION, new String[] { startDate.toString(),endDate.toString(),duration.toString(),zeroTolerance.toString(),policeNotification.toString(),arrest.toString() } );
	}

	/**
	 *  Gets an <code>IncidentAction</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param startDate Identifies the IncidentAction object to return by its "StartDate" attribute value
	 *  @param endDate Identifies the IncidentAction object to return by its "EndDate" attribute value
	 *  @param duration Identifies the IncidentAction object to return by its "Duration" attribute value
	 *  @param zeroTolerance Identifies the IncidentAction object to return by its "ZeroTolerance" attribute value
	 *  @param policeNotification Identifies the IncidentAction object to return by its "PoliceNotification" attribute value
	 *  @param arrest Identifies the IncidentAction object to return by its "Arrest" attribute value
	 *  @return An <code>IncidentAction</code> object
	 *  @since 2.4
	 */
	public IncidentAction getIncidentAction( Calendar startDate, Calendar endDate, BigDecimal duration, YesNo zeroTolerance, YesNo policeNotification, IncidentActionArrestType arrest ) { 
		return (IncidentAction)getChild( StudentDTD.INCIDENTACTIONLIST_INCIDENTACTION, new String[] { startDate.toString(),endDate.toString(),duration.toString(),zeroTolerance.toString(),policeNotification.toString(),arrest.toString() } );
	}

	/**
	 *  Gets all <code>IncidentAction</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>IncidentAction</code> objects
	 *  @since 2.4
	 */
	public IncidentAction[] getIncidentActions() {
		List<SIFElement> v = getChildList( StudentDTD.INCIDENTACTIONLIST_INCIDENTACTION);
		IncidentAction[] cvt = new IncidentAction[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>IncidentAction</code> objects. All existing 
	 * <code>IncidentAction</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>IncidentActions</code>.
	 *
	 *  @since 2.4
	 */
	public void setIncidentActions( IncidentAction[] incidentactions ) {
		setChildren( StudentDTD.INCIDENTACTIONLIST_INCIDENTACTION, incidentactions );
	}

}
