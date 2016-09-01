// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a SectionItemSequenceType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a SectionItemSequenceType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class SectionItemSequenceType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  other ("other")
	 */
	public static final SectionItemSequenceType OTHER = new SectionItemSequenceType("other");

	/**
	 *  random ("random")
	 */
	public static final SectionItemSequenceType RANDOM = new SectionItemSequenceType("random");

	/**
	 *  sequential ("sequential")
	 */
	public static final SectionItemSequenceType SEQUENTIAL = new SectionItemSequenceType("sequential");

	/**
	 *  adaptive ("adaptive")
	 */
	public static final SectionItemSequenceType ADAPTIVE = new SectionItemSequenceType("adaptive");

	/**
	 *  Wrap an arbitrary string value in a SectionItemSequenceType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static SectionItemSequenceType wrap( String value ) {
		return new SectionItemSequenceType( value );
	}

	private SectionItemSequenceType( String value ) {
		super(value);
	}
}