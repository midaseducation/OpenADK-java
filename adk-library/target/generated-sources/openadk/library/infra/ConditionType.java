// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a ConditionType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a ConditionType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class ConditionType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  And ("And")
	 */
	public static final ConditionType AND = new ConditionType("And");

	/**
	 *  None ("None")
	 */
	public static final ConditionType NONE = new ConditionType("None");

	/**
	 *  Or ("Or")
	 */
	public static final ConditionType OR = new ConditionType("Or");

	/**
	 *  Wrap an arbitrary string value in a ConditionType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ConditionType wrap( String value ) {
		return new ConditionType( value );
	}

	private ConditionType( String value ) {
		super(value);
	}
}
