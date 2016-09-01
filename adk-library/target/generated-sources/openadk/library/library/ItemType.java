// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.library;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an ItemType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an ItemType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class ItemType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  LibraryMaterial ("LibraryMaterial")
	 */
	public static final ItemType LIBRARYMATERIAL = new ItemType("LibraryMaterial");

	/**
	 *  Textbook ("Textbook")
	 */
	public static final ItemType TEXTBOOK = new ItemType("Textbook");

	/**
	 *  Asset ("Asset")
	 */
	public static final ItemType ASSET = new ItemType("Asset");

	/**
	 *  Media ("Media")
	 */
	public static final ItemType MEDIA = new ItemType("Media");

	/**
	 *  Wrap an arbitrary string value in an ItemType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ItemType wrap( String value ) {
		return new ItemType( value );
	}

	private ItemType( String value ) {
		super(value);
	}
}
