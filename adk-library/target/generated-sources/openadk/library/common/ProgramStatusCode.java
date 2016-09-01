// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a ProgramStatusCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a ProgramStatusCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ProgramStatusCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("9999")
	 */
	public static final ProgramStatusCode OTHER = new ProgramStatusCode("9999");

	/**
	 *  Withdrew/refused ("S006")
	 */
	public static final ProgramStatusCode WITHDREW_OR_REFUSED = new ProgramStatusCode("S006");

	/**
	 *  Not Eligible ("S003")
	 */
	public static final ProgramStatusCode NOT_ELIGIBLE = new ProgramStatusCode("S003");

	/**
	 *  Active ("S004")
	 */
	public static final ProgramStatusCode ACTIVE = new ProgramStatusCode("S004");

	/**
	 *  Referred ("S001")
	 */
	public static final ProgramStatusCode REFERRED = new ProgramStatusCode("S001");

	/**
	 *  Exited ("S005")
	 */
	public static final ProgramStatusCode EXITED = new ProgramStatusCode("S005");

	/**
	 *  Eligible ("S002")
	 */
	public static final ProgramStatusCode ELIGIBLE = new ProgramStatusCode("S002");

	/**
	 *  Wrap an arbitrary string value in a ProgramStatusCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ProgramStatusCode wrap( String value ) {
		return new ProgramStatusCode( value );
	}

	private ProgramStatusCode( String value ) {
		super(value);
	}
}
