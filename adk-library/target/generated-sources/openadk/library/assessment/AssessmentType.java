// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an AssessmentType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an AssessmentType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class AssessmentType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  alternate ("alternate")
	 */
	public static final AssessmentType ALTERNATE = new AssessmentType("alternate");

	/**
	 *  standard ("standard")
	 */
	public static final AssessmentType STANDARD = new AssessmentType("standard");

	/**
	 *  Wrap an arbitrary string value in an AssessmentType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static AssessmentType wrap( String value ) {
		return new AssessmentType( value );
	}

	private AssessmentType( String value ) {
		super(value);
	}
}