// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.reporting;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a RequestingAgencyIdType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a RequestingAgencyIdType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class RequestingAgencyIdType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Educational Services Agency ("ESA")
	 */
	public static final RequestingAgencyIdType ESA = new RequestingAgencyIdType("ESA");

	/**
	 *  School ("School")
	 */
	public static final RequestingAgencyIdType SCHOOL = new RequestingAgencyIdType("School");

	/**
	 *  Local Educational Agency (District) ("LEA")
	 */
	public static final RequestingAgencyIdType LEA = new RequestingAgencyIdType("LEA");

	/**
	 *  Wrap an arbitrary string value in a RequestingAgencyIdType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static RequestingAgencyIdType wrap( String value ) {
		return new RequestingAgencyIdType( value );
	}

	private RequestingAgencyIdType( String value ) {
		super(value);
	}
}
