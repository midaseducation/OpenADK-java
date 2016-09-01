// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a StudentParticipationType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a StudentParticipationType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class StudentParticipationType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  IDEA-C ("IDEA-C")
	 */
	public static final StudentParticipationType IDEA_C = new StudentParticipationType("IDEA-C");

	/**
	 *  IDEA-B ("IDEA-B")
	 */
	public static final StudentParticipationType IDEA_B = new StudentParticipationType("IDEA-B");

	/**
	 *  Section504 ("Section504")
	 */
	public static final StudentParticipationType SECTION504 = new StudentParticipationType("Section504");

	/**
	 *  Other ("Other")
	 */
	public static final StudentParticipationType OTHER = new StudentParticipationType("Other");

	/**
	 *  LIT ("LIT")
	 */
	public static final StudentParticipationType LIT = new StudentParticipationType("LIT");

	/**
	 *  EvenStart ("EvenStart")
	 */
	public static final StudentParticipationType EVENSTART = new StudentParticipationType("EvenStart");

	/**
	 *  Correctional ("Correctional")
	 */
	public static final StudentParticipationType CORRECTIONAL = new StudentParticipationType("Correctional");

	/**
	 *  Vocational ("Vocational")
	 */
	public static final StudentParticipationType VOCATIONAL = new StudentParticipationType("Vocational");

	/**
	 *  HeadStart ("HeadStart")
	 */
	public static final StudentParticipationType HEADSTART = new StudentParticipationType("HeadStart");

	/**
	 *  BehaviorDisorder ("BehaviorDisorder")
	 */
	public static final StudentParticipationType BEHAVIOR_DISORDER = new StudentParticipationType("BehaviorDisorder");

	/**
	 *  GiftedTalented ("GiftedTalented")
	 */
	public static final StudentParticipationType GIFTED_TALENTED = new StudentParticipationType("GiftedTalented");

	/**
	 *  Migrant ("Migrant")
	 */
	public static final StudentParticipationType MIGRANT = new StudentParticipationType("Migrant");

	/**
	 *  ESL ("ESL")
	 */
	public static final StudentParticipationType ESL = new StudentParticipationType("ESL");

	/**
	 *  Title1 ("Title1")
	 */
	public static final StudentParticipationType TITLE1 = new StudentParticipationType("Title1");

	/**
	 *  Wrap an arbitrary string value in a StudentParticipationType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static StudentParticipationType wrap( String value ) {
		return new StudentParticipationType( value );
	}

	private StudentParticipationType( String value ) {
		super(value);
	}
}