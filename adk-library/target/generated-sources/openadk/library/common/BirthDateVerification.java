// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a BirthDateVerification
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a BirthDateVerification object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class BirthDateVerification extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Life insurance policy ("2382")
	 */
	public static final BirthDateVerification LIFE_INSURANCE = new BirthDateVerification("2382");

	/**
	 *  Other official document ("3423")
	 */
	public static final BirthDateVerification OTHER_OFFICIAL_DOC = new BirthDateVerification("3423");

	/**
	 *  None ("98")
	 */
	public static final BirthDateVerification SIF1X_NONE = new BirthDateVerification("98");

	/**
	 *  Parent's affidavit ("1007")
	 */
	public static final BirthDateVerification PARENT_AFFIDAVIT = new BirthDateVerification("1007");

	/**
	 *  Physician's certificate ("1009")
	 */
	public static final BirthDateVerification PHYSICIAN_CERT = new BirthDateVerification("1009");

	/**
	 *  Birth Certificate - A written statement of form issued by an office of vital statistics verifying the name and birthdate of a child as reported by the physician attending at the birth ("02")
	 */
	public static final BirthDateVerification SIF1X_BIRTH_CERT = new BirthDateVerification("02");

	/**
	 *  An official document issued by a state government agency, usually the department of public safety or the department of motor vehicles, that formally allows the holder to operate a motor vehicle, with specifications as to the type of vehicle that he or she can operate ("10")
	 */
	public static final BirthDateVerification SIF1X_DRIVER_LICENSE = new BirthDateVerification("10");

	/**
	 *  Birth certificate ("1004")
	 */
	public static final BirthDateVerification BIRTH_CERT = new BirthDateVerification("1004");

	/**
	 *  Immigration document (e.g., immigration visa) ("1013")
	 */
	public static final BirthDateVerification IMMIGRATION_DOCUMENT = new BirthDateVerification("1013");

	/**
	 *  Passport - Any travel document issued by a recognized authority showing the bearer's origin, identity, birthdate, and nationality that is valid for the entry of the bearer into a foreign country ("06")
	 */
	public static final BirthDateVerification SIF1X_PASSPORT = new BirthDateVerification("06");

	/**
	 *  Physician's Certificate - A certificate issued by the physician attending at birth, verifying the name and birthdate of a child. A physician's certificate is considered to be a birth certificate when acceptable as such by the political subdivision where issued. ("07")
	 */
	public static final BirthDateVerification SIF1X_PHYSICIAN_CERT = new BirthDateVerification("07");

	/**
	 *  Baptismal or church certificate ("1003")
	 */
	public static final BirthDateVerification CHURCH = new BirthDateVerification("1003");

	/**
	 *  Passport ("1008")
	 */
	public static final BirthDateVerification PASSPORT = new BirthDateVerification("1008");

	/**
	 *  Hospital certificate ("1006")
	 */
	public static final BirthDateVerification HOSPITAL_CERT = new BirthDateVerification("1006");

	/**
	 *  Other ("99")
	 */
	public static final BirthDateVerification SIF1X_OTHER = new BirthDateVerification("99");

	/**
	 *  Entry in family Bible ("1005")
	 */
	public static final BirthDateVerification FAMILY_BIBLE = new BirthDateVerification("1005");

	/**
	 *  Parent Affidavit - A sworn, written statement made by an individual's parent to verify his or her age, birthdate, and place of birth ("05")
	 */
	public static final BirthDateVerification SIF1X_PARENT_AFFIDAVIT = new BirthDateVerification("05");

	/**
	 *  Previously verified school records ("1010")
	 */
	public static final BirthDateVerification PREVIOUSLY_VERIFIED = new BirthDateVerification("1010");

	/**
	 *  Driver's license ("1012")
	 */
	public static final BirthDateVerification DRIVER_LICENSE = new BirthDateVerification("1012");

	/**
	 *  Entry in a family Bible - An entry in a family Bible on a special page for recording births, marriages, and other vital information about a family ("03")
	 */
	public static final BirthDateVerification SIF1X_FAMILY_BIBLE = new BirthDateVerification("03");

	/**
	 *  Previously Verified School Records - A school record with the birthdate previously verified that is issued in lieu of more direct evidence to verify the birthdate ("08")
	 */
	public static final BirthDateVerification SIF1X_SCHOOL_RECORDS = new BirthDateVerification("08");

	/**
	 *  An official document issued by a national government that would formally identify the holder of the document ("11")
	 */
	public static final BirthDateVerification SIF1X_IMMIGRATION_DOCUMENT = new BirthDateVerification("11");

	/**
	 *  Other ("9999")
	 */
	public static final BirthDateVerification OTHER = new BirthDateVerification("9999");

	/**
	 *  An official document issued by a state government agency, usually the department of public safety or the department of motor vehicles, that formally identifies the holder of the document. It usually is not accompanied by an approval for the holder to operate a vehicle of any type. ("09")
	 */
	public static final BirthDateVerification SIF1X_STATE_ID = new BirthDateVerification("09");

	/**
	 *  Hospital Certificate - A certificate issued by a hospital verifying the name and birthdate of a child ("04")
	 */
	public static final BirthDateVerification SIF1X_HOSPITAL_CERT = new BirthDateVerification("04");

	/**
	 *  State-issued ID (e.g., from Department of Public Safety) ("1011")
	 */
	public static final BirthDateVerification STATE_ID = new BirthDateVerification("1011");

	/**
	 *  Other non-official document ("3424")
	 */
	public static final BirthDateVerification OTHER_NON_OFFICIAL_DOC = new BirthDateVerification("3424");

	/**
	 *  Baptismal or Church certification - A form, issued by a church, listing the birthdate and certifying the baptism of a child ("01")
	 */
	public static final BirthDateVerification SIF1X_CHURCH = new BirthDateVerification("01");

	/**
	 *  Wrap an arbitrary string value in a BirthDateVerification object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static BirthDateVerification wrap( String value ) {
		return new BirthDateVerification( value );
	}

	private BirthDateVerification( String value ) {
		super(value);
	}
}