// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.profdev;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an EmploymentStatus
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an EmploymentStatus object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class EmploymentStatus extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Non-contractual ("1385")
	 */
	public static final EmploymentStatus NON_CONTRACTUAL = new EmploymentStatus("1385");

	/**
	 *  Probationary ("1378")
	 */
	public static final EmploymentStatus PROBATIONARY = new EmploymentStatus("1378");

	/**
	 *  Contigent upon funding ("1384")
	 */
	public static final EmploymentStatus CONTIGENT_UPON_FUNDING = new EmploymentStatus("1384");

	/**
	 *  Employed or affiliated with outside organization ("1383")
	 */
	public static final EmploymentStatus OUTSIDE = new EmploymentStatus("1383");

	/**
	 *  Volunteer/no contract ("1382")
	 */
	public static final EmploymentStatus VOLUNTEER_NO_CONTRACT = new EmploymentStatus("1382");

	/**
	 *  Other employment status ("1386")
	 */
	public static final EmploymentStatus OTHER_STATUS = new EmploymentStatus("1386");

	/**
	 *  Tenured or permanent ("1381")
	 */
	public static final EmploymentStatus TENURED_OR_PERMANENT = new EmploymentStatus("1381");

	/**
	 *  Substitute/temporary ("1380")
	 */
	public static final EmploymentStatus SUBSTITUTE_TEMPORARY = new EmploymentStatus("1380");

	/**
	 *  Contractual ("1379")
	 */
	public static final EmploymentStatus CONTRACTUAL = new EmploymentStatus("1379");

	/**
	 *  Wrap an arbitrary string value in an EmploymentStatus object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static EmploymentStatus wrap( String value ) {
		return new EmploymentStatus( value );
	}

	private EmploymentStatus( String value ) {
		super(value);
	}
}
