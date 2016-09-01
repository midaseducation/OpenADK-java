// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a SIFOrderBy
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a SIFOrderBy object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class SIFOrderBy extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Descending ("Descending")
	 */
	public static final SIFOrderBy DESCENDING = new SIFOrderBy("Descending");

	/**
	 *  Ascending ("Ascending")
	 */
	public static final SIFOrderBy ASCENDING = new SIFOrderBy("Ascending");

	/**
	 *  Wrap an arbitrary string value in a SIFOrderBy object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static SIFOrderBy wrap( String value ) {
		return new SIFOrderBy( value );
	}

	private SIFOrderBy( String value ) {
		super(value);
	}
}