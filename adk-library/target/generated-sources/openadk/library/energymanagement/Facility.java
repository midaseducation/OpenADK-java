// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.energymanagement;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a Facility
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a Facility object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class Facility extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Auditorium ("Auditorium")
	 */
	public static final Facility AUDITORIUM = new Facility("Auditorium");

	/**
	 *  Swimming Pool ("SwimmingPool")
	 */
	public static final Facility SWIMMING_POOL = new Facility("SwimmingPool");

	/**
	 *  Home Economics ("HomeEconomics")
	 */
	public static final Facility HOME_ECONOMICS = new Facility("HomeEconomics");

	/**
	 *  Locker Room ("LockerRoom")
	 */
	public static final Facility LOCKER_ROOM = new Facility("LockerRoom");

	/**
	 *  Gymnasium ("Gymnasium")
	 */
	public static final Facility GYMNASIUM = new Facility("Gymnasium");

	/**
	 *  Library ("Library")
	 */
	public static final Facility LIBRARY = new Facility("Library");

	/**
	 *  Floor ("Floor")
	 */
	public static final Facility FLOOR = new Facility("Floor");

	/**
	 *  Wing ("Wing")
	 */
	public static final Facility WING = new Facility("Wing");

	/**
	 *  Shop ("Shop")
	 */
	public static final Facility SHOP = new Facility("Shop");

	/**
	 *  Storage ("Storage")
	 */
	public static final Facility STORAGE = new Facility("Storage");

	/**
	 *  Campus ("Campus")
	 */
	public static final Facility CAMPUS = new Facility("Campus");

	/**
	 *  Building ("Builing")
	 */
	public static final Facility BUILDING = new Facility("Builing");

	/**
	 *  Study Hall ("StudyHall")
	 */
	public static final Facility STUDY_HALL = new Facility("StudyHall");

	/**
	 *  Other ("Other")
	 */
	public static final Facility OTHER = new Facility("Other");

	/**
	 *  Cafeteria ("Cafeteria")
	 */
	public static final Facility CAFETERIA = new Facility("Cafeteria");

	/**
	 *  office ("Office")
	 */
	public static final Facility OFFICE = new Facility("Office");

	/**
	 *  Kitchen ("Kitchen")
	 */
	public static final Facility KITCHEN = new Facility("Kitchen");

	/**
	 *  Classroom ("Classroom")
	 */
	public static final Facility CLASSROOM = new Facility("Classroom");

	/**
	 *  Hall ("Hall")
	 */
	public static final Facility HALL = new Facility("Hall");

	/**
	 *  Laboratory ("Laboratory")
	 */
	public static final Facility LABORATORY = new Facility("Laboratory");

	/**
	 *  Wrap an arbitrary string value in a Facility object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static Facility wrap( String value ) {
		return new Facility( value );
	}

	private Facility( String value ) {
		super(value);
	}
}
