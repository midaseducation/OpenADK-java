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
public class MeetingTimeList extends SIFList<MeetingTime>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public MeetingTimeList() {
		super( CommonDTD.MEETINGTIMELIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param meetingTime Time(s) this section meets.
	 */
	public MeetingTimeList( MeetingTime meetingTime ) {
		super( CommonDTD.MEETINGTIMELIST );
		this.safeAddChild( CommonDTD.MEETINGTIMELIST_MEETINGTIME, meetingTime );
	}

	/**
	 *  Gets all <code>MeetingTime</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>MeetingTime</code> objects
	 *  @since 1.1
	 */
	public MeetingTime[] getMeetingTimes() {
		List<SIFElement> v = getChildList( CommonDTD.MEETINGTIMELIST_MEETINGTIME);
		MeetingTime[] cvt = new MeetingTime[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>MeetingTime</code> objects. All existing 
	 * <code>MeetingTime</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>MeetingTimes</code>.
	 *
	 *  @since 1.1
	 */
	public void setMeetingTimes( MeetingTime[] meetingtimes ) {
		setChildren( CommonDTD.MEETINGTIMELIST_MEETINGTIME, meetingtimes );
	}

}