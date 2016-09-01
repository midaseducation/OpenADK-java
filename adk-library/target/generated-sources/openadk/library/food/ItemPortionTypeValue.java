// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.food;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an ItemPortionTypeValue
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an ItemPortionTypeValue object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ItemPortionTypeValue extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  AlaCarte ("AlaCarte")
	 */
	public static final ItemPortionTypeValue ALACARTE = new ItemPortionTypeValue("AlaCarte");

	/**
	 *  Combo ("Combo")
	 */
	public static final ItemPortionTypeValue COMBO = new ItemPortionTypeValue("Combo");

	/**
	 *  Entree ("Entree")
	 */
	public static final ItemPortionTypeValue ENTREE = new ItemPortionTypeValue("Entree");

	/**
	 *  NonFood ("NonFood")
	 */
	public static final ItemPortionTypeValue NONFOOD = new ItemPortionTypeValue("NonFood");

	/**
	 *  Bonus ("Bonus")
	 */
	public static final ItemPortionTypeValue BONUS = new ItemPortionTypeValue("Bonus");

	/**
	 *  Component ("Component")
	 */
	public static final ItemPortionTypeValue COMPONENT = new ItemPortionTypeValue("Component");

	/**
	 *  Wrap an arbitrary string value in an ItemPortionTypeValue object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ItemPortionTypeValue wrap( String value ) {
		return new ItemPortionTypeValue( value );
	}

	private ItemPortionTypeValue( String value ) {
		super(value);
	}
}
