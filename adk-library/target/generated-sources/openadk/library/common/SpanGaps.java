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
 *  @since 2.0
 */
public class SpanGaps extends SIFList<SpanGap>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SpanGaps() {
		super( CommonDTD.SPANGAPS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param spanGap 
	 */
	public SpanGaps( SpanGap spanGap ) {
		super( CommonDTD.SPANGAPS );
		this.safeAddChild( CommonDTD.SPANGAPS_SPANGAP, spanGap );
	}

	/**
	 *  Adds a new <code>&lt;SpanGap&gt;</code> repeatable element.
	 *  This form of <code>setSpanGap</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSpanGap</code>
	 *  that accepts a single <code>SpanGap</code> object.
	 *
	 *  @param type 
	 *  @param code This element provides a place for the application to send structured data (code values, unique identifier, timestamps). This code value can, depending upon the use case agreement between agents, be used to qualify the data in the Value element.
	 *  @param name Contains a human-readable description of the value in Value.
	 *  @param value Contains the human-readable value.
	 *  @since 2.0
	 */
	public void addSpanGap( TimeElementType type, String code, String name, String value ) {
		addChild( CommonDTD.SPANGAPS_SPANGAP, new SpanGap( type, code, name, value ) );
	}

	/**
	 *  Gets all <code>SpanGap</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SpanGap</code> objects
	 *  @since 2.0
	 */
	public SpanGap[] getSpanGaps() {
		List<SIFElement> v = getChildList( CommonDTD.SPANGAPS_SPANGAP);
		SpanGap[] cvt = new SpanGap[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SpanGap</code> objects. All existing 
	 * <code>SpanGap</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SpanGaps</code>.
	 *
	 *  @since 2.0
	 */
	public void setSpanGaps( SpanGap[] spangaps ) {
		setChildren( CommonDTD.SPANGAPS_SPANGAP, spangaps );
	}

}
