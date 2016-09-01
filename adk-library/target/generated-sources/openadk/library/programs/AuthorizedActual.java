// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an AuthorizedActual
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an AuthorizedActual object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class AuthorizedActual extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("S999")
	 */
	public static final AuthorizedActual OTHER = new AuthorizedActual("S999");

	/**
	 *  Authorized ("S001")
	 */
	public static final AuthorizedActual AUTHORIZED = new AuthorizedActual("S001");

	/**
	 *  Actual (actually used during test administration) ("S002")
	 */
	public static final AuthorizedActual ACTUAL = new AuthorizedActual("S002");

	/**
	 *  Wrap an arbitrary string value in an AuthorizedActual object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static AuthorizedActual wrap( String value ) {
		return new AuthorizedActual( value );
	}

	private AuthorizedActual( String value ) {
		super(value);
	}
}
