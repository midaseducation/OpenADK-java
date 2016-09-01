// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a SIF_Action
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a SIF_Action object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class SIF_Action extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  delete ("delete")
	 */
	public static final SIF_Action DELETE = new SIF_Action("delete");

	/**
	 *  Wrap an arbitrary string value in a SIF_Action object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static SIF_Action wrap( String value ) {
		return new SIF_Action( value );
	}

	private SIF_Action( String value ) {
		super(value);
	}
}