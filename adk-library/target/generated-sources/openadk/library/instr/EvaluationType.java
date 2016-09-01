// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an EvaluationType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an EvaluationType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class EvaluationType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  RefId ("RefId")
	 */
	public static final EvaluationType REFID = new EvaluationType("RefId");

	/**
	 *  Inline ("Inline")
	 */
	public static final EvaluationType INLINE = new EvaluationType("Inline");

	/**
	 *  Wrap an arbitrary string value in an EvaluationType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static EvaluationType wrap( String value ) {
		return new EvaluationType( value );
	}

	private EvaluationType( String value ) {
		super(value);
	}
}
