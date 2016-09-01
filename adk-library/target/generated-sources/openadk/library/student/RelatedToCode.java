// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a RelatedToCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a RelatedToCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class RelatedToCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Hate-related ("3069")
	 */
	public static final RelatedToCode _1048_3069_HATE_RELATED = new RelatedToCode("3069");

	/**
	 *  Fighting ("04645")
	 */
	public static final RelatedToCode _1048_04645_FIGHTING = new RelatedToCode("04645");

	/**
	 *  Gang-related ("3068")
	 */
	public static final RelatedToCode _1048_3068_GANG_RELATED = new RelatedToCode("3068");

	/**
	 *  Alcohol-related ("3066")
	 */
	public static final RelatedToCode _1048_3066_ALCOHOL_RELATED = new RelatedToCode("3066");

	/**
	 *  Weapon-related ("3070")
	 */
	public static final RelatedToCode _1048_3070_WEAPON_RELATED = new RelatedToCode("3070");

	/**
	 *  Drug-related ("3067")
	 */
	public static final RelatedToCode _1048_3067_DRUG_RELATED = new RelatedToCode("3067");

	/**
	 *  Wrap an arbitrary string value in a RelatedToCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static RelatedToCode wrap( String value ) {
		return new RelatedToCode( value );
	}

	private RelatedToCode( String value ) {
		super(value);
	}
}