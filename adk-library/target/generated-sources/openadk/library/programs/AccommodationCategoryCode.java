// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an AccommodationCategoryCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an AccommodationCategoryCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class AccommodationCategoryCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("S999")
	 */
	public static final AccommodationCategoryCode OTHER = new AccommodationCategoryCode("S999");

	/**
	 *  Response ("S003")
	 */
	public static final AccommodationCategoryCode RESPONSE = new AccommodationCategoryCode("S003");

	/**
	 *  Presentation ("S001")
	 */
	public static final AccommodationCategoryCode PRESENTATION = new AccommodationCategoryCode("S001");

	/**
	 *  Setting ("S005")
	 */
	public static final AccommodationCategoryCode SETTING = new AccommodationCategoryCode("S005");

	/**
	 *  Test Response ("S006")
	 */
	public static final AccommodationCategoryCode TEST_RESPONSE = new AccommodationCategoryCode("S006");

	/**
	 *  Presentation equipment / technology ("S002")
	 */
	public static final AccommodationCategoryCode PRESENTATION_EQUIPMENT = new AccommodationCategoryCode("S002");

	/**
	 *  Scheduling / timing ("S004")
	 */
	public static final AccommodationCategoryCode SCHEDULING_TIMING = new AccommodationCategoryCode("S004");

	/**
	 *  Wrap an arbitrary string value in an AccommodationCategoryCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static AccommodationCategoryCode wrap( String value ) {
		return new AccommodationCategoryCode( value );
	}

	private AccommodationCategoryCode( String value ) {
		super(value);
	}
}
