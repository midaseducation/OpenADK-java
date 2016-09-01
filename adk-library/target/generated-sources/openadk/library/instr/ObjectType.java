// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an ObjectType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an ObjectType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class ObjectType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Learning Standard Item ("LearningStandardItem")
	 */
	public static final ObjectType LEARNING_STANDARD_ITEM = new ObjectType("LearningStandardItem");

	/**
	 *  Learning Standard Document ("LearningStandardDocument")
	 */
	public static final ObjectType LEARNING_STANDARD_DOCUMENT = new ObjectType("LearningStandardDocument");

	/**
	 *  Wrap an arbitrary string value in an ObjectType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ObjectType wrap( String value ) {
		return new ObjectType( value );
	}

	private ObjectType( String value ) {
		super(value);
	}
}