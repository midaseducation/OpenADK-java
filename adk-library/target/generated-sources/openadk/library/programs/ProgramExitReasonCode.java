// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a ProgramExitReasonCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a ProgramExitReasonCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ProgramExitReasonCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Transferred to another district or school, known to be continuing in program / service ("2218")
	 */
	public static final ProgramExitReasonCode TRANSFERRED_CONTINUING = new ProgramExitReasonCode("2218");

	/**
	 *  Suspended from school ("2220")
	 */
	public static final ProgramExitReasonCode SUSPENDED_FROM_SCHOOL = new ProgramExitReasonCode("2220");

	/**
	 *  Received certificate of completion, modified diploma, or finished IEP requirements ("2213")
	 */
	public static final ProgramExitReasonCode RECEIVED_CERTIFICATE = new ProgramExitReasonCode("2213");

	/**
	 *  Unknown reason ("2233")
	 */
	public static final ProgramExitReasonCode UNKNOWN_REASON = new ProgramExitReasonCode("2233");

	/**
	 *  Discontinued schooling, not special education ("2222")
	 */
	public static final ProgramExitReasonCode DISCONTINUED_SCHOOLING = new ProgramExitReasonCode("2222");

	/**
	 *  Not eligible for Part B, exit with referrals to other programs ("2228")
	 */
	public static final ProgramExitReasonCode NOT_ELIGIBLE_FOR_PART_B = new ProgramExitReasonCode("2228");

	/**
	 *  Withdrawal by a parent (or guardian) ("2232")
	 */
	public static final ProgramExitReasonCode WITHDRAWAL_BY_GUARDIAN = new ProgramExitReasonCode("2232");

	/**
	 *  Discontinued schooling, special education only ("2221")
	 */
	public static final ProgramExitReasonCode DISCONTINUED_SPEC_ED = new ProgramExitReasonCode("2221");

	/**
	 *  No longer receving special education ("2216")
	 */
	public static final ProgramExitReasonCode NO_SPECIAL_ED = new ProgramExitReasonCode("2216");

	/**
	 *  Completion of IFSP prior to reaching maximum age for Part C ("2226")
	 */
	public static final ProgramExitReasonCode COMPLETION_OF_IFSP = new ProgramExitReasonCode("2226");

	/**
	 *  Program discontinued ("2225")
	 */
	public static final ProgramExitReasonCode PROGRAM_DISCONTINUED = new ProgramExitReasonCode("2225");

	/**
	 *  Died ("2223")
	 */
	public static final ProgramExitReasonCode DIED = new ProgramExitReasonCode("2223");

	/**
	 *  Student served in other ways ("S002")
	 */
	public static final ProgramExitReasonCode STUDENT_SERVED_OTHER = new ProgramExitReasonCode("S002");

	/**
	 *  Program completion ("2214")
	 */
	public static final ProgramExitReasonCode PROGRAM_COMPLETION = new ProgramExitReasonCode("2214");

	/**
	 *  Expulsion ("2224")
	 */
	public static final ProgramExitReasonCode EXPULSION = new ProgramExitReasonCode("2224");

	/**
	 *  Moved out of state ("2231")
	 */
	public static final ProgramExitReasonCode MOVED_OUT_OF_STATE = new ProgramExitReasonCode("2231");

	/**
	 *  Student choice ("S001")
	 */
	public static final ProgramExitReasonCode STUDENT_CHOICE = new ProgramExitReasonCode("S001");

	/**
	 *  Transferred to another district or school, not known to be continuing in program / service ("2219")
	 */
	public static final ProgramExitReasonCode TRANSFERRED_NOT_KNOWN = new ProgramExitReasonCode("2219");

	/**
	 *  Reached maximum age ("2215")
	 */
	public static final ProgramExitReasonCode REACHED_MAXIMUM_AGE = new ProgramExitReasonCode("2215");

	/**
	 *  Other ("9999")
	 */
	public static final ProgramExitReasonCode OTHER = new ProgramExitReasonCode("9999");

	/**
	 *  Refused services ("2217")
	 */
	public static final ProgramExitReasonCode REFUSED_SERVICES = new ProgramExitReasonCode("2217");

	/**
	 *  Eligible for IDEA Part B ("2227")
	 */
	public static final ProgramExitReasonCode ELIGIBLE_FOR_IDEA_B = new ProgramExitReasonCode("2227");

	/**
	 *  Part B eligibility not determined ("2230")
	 */
	public static final ProgramExitReasonCode PART_B_NOT_ELIGIBLE = new ProgramExitReasonCode("2230");

	/**
	 *  Transferred to another district or school, known not to be continuing in program / service ("2406")
	 */
	public static final ProgramExitReasonCode TRANSFERRED_NOT_CONTINUING = new ProgramExitReasonCode("2406");

	/**
	 *  Graduated with a high school diploma ("2212")
	 */
	public static final ProgramExitReasonCode GRADUATED_WITH_DIPLOMA = new ProgramExitReasonCode("2212");

	/**
	 *  Wrap an arbitrary string value in a ProgramExitReasonCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ProgramExitReasonCode wrap( String value ) {
		return new ProgramExitReasonCode( value );
	}

	private ProgramExitReasonCode( String value ) {
		super(value);
	}
}
