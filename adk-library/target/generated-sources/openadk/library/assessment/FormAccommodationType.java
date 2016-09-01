// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a FormAccommodationType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a FormAccommodationType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class FormAccommodationType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  braille ("braille")
	 */
	public static final FormAccommodationType BRAILLE = new FormAccommodationType("braille");

	/**
	 *  signLanguage ("signLanguage")
	 */
	public static final FormAccommodationType SIGN_LANGUAGE = new FormAccommodationType("signLanguage");

	/**
	 *  alternageLanguage ("alternateLanguage")
	 */
	public static final FormAccommodationType ALTERNATE_LANGUAGE = new FormAccommodationType("alternateLanguage");

	/**
	 *  text to speech ("text-to-speech")
	 */
	public static final FormAccommodationType TEXT_TO_SPEECH = new FormAccommodationType("text-to-speech");

	/**
	 *  simplifiedLanguage ("simplifiedLanguage")
	 */
	public static final FormAccommodationType SIMPLIFIED_LANGUAGE = new FormAccommodationType("simplifiedLanguage");

	/**
	 *  audio ("audio")
	 */
	public static final FormAccommodationType AUDIO = new FormAccommodationType("audio");

	/**
	 *  Wrap an arbitrary string value in a FormAccommodationType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static FormAccommodationType wrap( String value ) {
		return new FormAccommodationType( value );
	}

	private FormAccommodationType( String value ) {
		super(value);
	}
}