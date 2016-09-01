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
 *  @since 2.0
 */
public class PartCTransitionMeetingOutcomes extends SIFList<PartCTransitionMeetingOutcome>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public PartCTransitionMeetingOutcomes() {
		super( ProgramsDTD.PARTCTRANSITIONMEETINGOUTCOMES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param partcTransitionMeetingOutcome 
	 */
	public PartCTransitionMeetingOutcomes( PartCTransitionMeetingOutcome partcTransitionMeetingOutcome ) {
		super( ProgramsDTD.PARTCTRANSITIONMEETINGOUTCOMES );
		this.safeAddChild( ProgramsDTD.PARTCTRANSITIONMEETINGOUTCOMES_PARTCTRANSITIONMEETINGOUTCOME, partcTransitionMeetingOutcome );
	}

	/**
	 *  Gets all <code>PartCTransitionMeetingOutcome</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>PartCTransitionMeetingOutcome</code> objects
	 *  @since 2.0
	 */
	public PartCTransitionMeetingOutcome[] getPartCTransitionMeetingOutcomes() {
		List<SIFElement> v = getChildList( ProgramsDTD.PARTCTRANSITIONMEETINGOUTCOMES_PARTCTRANSITIONMEETINGOUTCOME);
		PartCTransitionMeetingOutcome[] cvt = new PartCTransitionMeetingOutcome[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>PartCTransitionMeetingOutcome</code> objects. All existing 
	 * <code>PartCTransitionMeetingOutcome</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>PartCTransitionMeetingOutcomes</code>.
	 *
	 *  @since 2.0
	 */
	public void setPartCTransitionMeetingOutcomes( PartCTransitionMeetingOutcome[] partctransitionmeetingoutcomes ) {
		setChildren( ProgramsDTD.PARTCTRANSITIONMEETINGOUTCOMES_PARTCTRANSITIONMEETINGOUTCOME, partctransitionmeetingoutcomes );
	}

}
