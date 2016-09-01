// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a ProgramAvailabilityCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a ProgramAvailabilityCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ProgramAvailabilityCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("9999")
	 */
	public static final ProgramAvailabilityCode OTHER = new ProgramAvailabilityCode("9999");

	/**
	 *  Summer ("0237")
	 */
	public static final ProgramAvailabilityCode SUMMER = new ProgramAvailabilityCode("0237");

	/**
	 *  Evenings ("0239")
	 */
	public static final ProgramAvailabilityCode EVENINGS = new ProgramAvailabilityCode("0239");

	/**
	 *  Weekend ("0234")
	 */
	public static final ProgramAvailabilityCode WEEKEND = new ProgramAvailabilityCode("0234");

	/**
	 *  After school ("0236")
	 */
	public static final ProgramAvailabilityCode AFTER_SCHOOL = new ProgramAvailabilityCode("0236");

	/**
	 *  Before School ("0235")
	 */
	public static final ProgramAvailabilityCode BEFORE_SCHOOL = new ProgramAvailabilityCode("0235");

	/**
	 *  In-school service day ("0238")
	 */
	public static final ProgramAvailabilityCode IN_SCHOOL_SERVICE_DAY = new ProgramAvailabilityCode("0238");

	/**
	 *  During school ("0231")
	 */
	public static final ProgramAvailabilityCode DURING_SCHOOL = new ProgramAvailabilityCode("0231");

	/**
	 *  Wrap an arbitrary string value in a ProgramAvailabilityCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ProgramAvailabilityCode wrap( String value ) {
		return new ProgramAvailabilityCode( value );
	}

	private ProgramAvailabilityCode( String value ) {
		super(value);
	}
}