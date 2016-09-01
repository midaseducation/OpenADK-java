// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.profdev;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a RegistrationStatus
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a RegistrationStatus object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.2
 */
public class RegistrationStatus extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Represents that a user has completed the activity and has received credit and show have a record in the employee credit object to represent this. ("Complete")
	 */
	public static final RegistrationStatus Complete = new RegistrationStatus("Complete");

	/**
	 *  Represents that the user has withdrawn from the activity without completing. ("Withdrawn")
	 */
	public static final RegistrationStatus Withdrawn = new RegistrationStatus("Withdrawn");

	/**
	 *  Represents the user has registered for the activity. ("Registered")
	 */
	public static final RegistrationStatus Registered = new RegistrationStatus("Registered");

	/**
	 *  Represents that the user has not yet finished the ProfessionalDevelopmentActivity or ProfessionalDevelopmentProgram but hasn't withdrawn. ("In Progress")
	 */
	public static final RegistrationStatus In_Progress = new RegistrationStatus("In Progress");

	/**
	 *  Represents that the user did not receive credit for this activity for whatever reason. ("Incomplete")
	 */
	public static final RegistrationStatus Incomplete = new RegistrationStatus("Incomplete");

	/**
	 *  Wrap an arbitrary string value in a RegistrationStatus object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static RegistrationStatus wrap( String value ) {
		return new RegistrationStatus( value );
	}

	private RegistrationStatus( String value ) {
		super(value);
	}
}
