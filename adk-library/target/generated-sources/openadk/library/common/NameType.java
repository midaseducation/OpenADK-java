// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a NameType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a NameType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class NameType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Married name ("07")
	 */
	public static final NameType MARRIED = new NameType("07");

	/**
	 *  Previous Name (sometimes called Maiden Name of Female Persons) ("05")
	 */
	public static final NameType PREVIOUS = new NameType("05");

	/**
	 *  Name of record ("04")
	 */
	public static final NameType NAME_OF_RECORD = new NameType("04");

	/**
	 *  Alias ("03")
	 */
	public static final NameType ALIAS = new NameType("03");

	/**
	 *  Professional name ("08")
	 */
	public static final NameType PROFESSIONAL = new NameType("08");

	/**
	 *  Current legal ("02")
	 */
	public static final NameType LEGAL = new NameType("02");

	/**
	 *  Given Name (Name at Birth) ("01")
	 */
	public static final NameType BIRTH = new NameType("01");

	/**
	 *  Wrap an arbitrary string value in a NameType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static NameType wrap( String value ) {
		return new NameType( value );
	}

	private NameType( String value ) {
		super(value);
	}
}
