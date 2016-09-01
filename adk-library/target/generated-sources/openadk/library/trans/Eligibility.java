// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.trans;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an Eligibility
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an Eligibility object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class Eligibility extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Bus Out of Attendance ("BusOutOfAttendance")
	 */
	public static final Eligibility BUS_OUT_OF_ATTENDANCE = new Eligibility("BusOutOfAttendance");

	/**
	 *  Parent Pay ("ParentPay")
	 */
	public static final Eligibility PARENT_PAY = new Eligibility("ParentPay");

	/**
	 *  Unknown ("Unknown")
	 */
	public static final Eligibility UNKNOWN = new Eligibility("Unknown");

	/**
	 *  Walk ("Walk")
	 */
	public static final Eligibility WALK = new Eligibility("Walk");

	/**
	 *  Bus Hazard ("BusHazard")
	 */
	public static final Eligibility BUS_HAZARD = new Eligibility("BusHazard");

	/**
	 *  Bus ("Bus")
	 */
	public static final Eligibility BUS = new Eligibility("Bus");

	/**
	 *  Wrap an arbitrary string value in an Eligibility object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static Eligibility wrap( String value ) {
		return new Eligibility( value );
	}

	private Eligibility( String value ) {
		super(value);
	}
}
