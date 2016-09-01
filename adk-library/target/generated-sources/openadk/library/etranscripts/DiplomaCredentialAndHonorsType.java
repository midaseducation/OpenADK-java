// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.etranscripts;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a DiplomaCredentialAndHonorsType
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a DiplomaCredentialAndHonorsType object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class DiplomaCredentialAndHonorsType extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Class salutatorian ("2004")
	 */
	public static final DiplomaCredentialAndHonorsType SALUTATORIAN = new DiplomaCredentialAndHonorsType("2004");

	/**
	 *  Scholar award with distinction ("1999")
	 */
	public static final DiplomaCredentialAndHonorsType SCHOLAR_AWARD_DIST = new DiplomaCredentialAndHonorsType("1999");

	/**
	 *  State scholar award ("2001")
	 */
	public static final DiplomaCredentialAndHonorsType STATE_SCHOLAR_AWARD = new DiplomaCredentialAndHonorsType("2001");

	/**
	 *  Class valedictorian ("2003")
	 */
	public static final DiplomaCredentialAndHonorsType VALEDICTORIAN = new DiplomaCredentialAndHonorsType("2003");

	/**
	 *  Prize awards (not limited to subject matter awards) ("2005")
	 */
	public static final DiplomaCredentialAndHonorsType PRIZE_AWARDS = new DiplomaCredentialAndHonorsType("2005");

	/**
	 *  Other ("9999")
	 */
	public static final DiplomaCredentialAndHonorsType OTHER = new DiplomaCredentialAndHonorsType("9999");

	/**
	 *  Rank ("2357")
	 */
	public static final DiplomaCredentialAndHonorsType RANK = new DiplomaCredentialAndHonorsType("2357");

	/**
	 *  National scholar award ("2002")
	 */
	public static final DiplomaCredentialAndHonorsType NATIONAL_SCHOLAR_AWARD = new DiplomaCredentialAndHonorsType("2002");

	/**
	 *  Other monetary award ("2009")
	 */
	public static final DiplomaCredentialAndHonorsType OTHER_MONETARY = new DiplomaCredentialAndHonorsType("2009");

	/**
	 *  State-sponsored scholarships ("2007")
	 */
	public static final DiplomaCredentialAndHonorsType STATE_SPONS_SCHOLARSHIP = new DiplomaCredentialAndHonorsType("2007");

	/**
	 *  Local scholar award ("2000")
	 */
	public static final DiplomaCredentialAndHonorsType LOCAL_SCHOLAR_AWARD = new DiplomaCredentialAndHonorsType("2000");

	/**
	 *  Nationally-sponsored scholarships ("2008")
	 */
	public static final DiplomaCredentialAndHonorsType NATIONALLY_SPONS_SCHOLARSHIP = new DiplomaCredentialAndHonorsType("2008");

	/**
	 *  Scholar award with honor ("1998")
	 */
	public static final DiplomaCredentialAndHonorsType SCHOLAR_AWARD_HONOR = new DiplomaCredentialAndHonorsType("1998");

	/**
	 *  Magna cum laude ("1996")
	 */
	public static final DiplomaCredentialAndHonorsType MAGNA_CUM_LAUDE = new DiplomaCredentialAndHonorsType("1996");

	/**
	 *  Cum laude ("1995")
	 */
	public static final DiplomaCredentialAndHonorsType CUM_LAUDE = new DiplomaCredentialAndHonorsType("1995");

	/**
	 *  Locally-sponsored scholarships ("2006")
	 */
	public static final DiplomaCredentialAndHonorsType LOCALLY_SPONS_SCHOLARSHIP = new DiplomaCredentialAndHonorsType("2006");

	/**
	 *  Summa cum laude ("1997")
	 */
	public static final DiplomaCredentialAndHonorsType SUMMA_CUM_LAUDE = new DiplomaCredentialAndHonorsType("1997");

	/**
	 *  Wrap an arbitrary string value in a DiplomaCredentialAndHonorsType object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static DiplomaCredentialAndHonorsType wrap( String value ) {
		return new DiplomaCredentialAndHonorsType( value );
	}

	private DiplomaCredentialAndHonorsType( String value ) {
		super(value);
	}
}
