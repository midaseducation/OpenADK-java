// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.energymanagement;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an EnergyUnits
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an EnergyUnits object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class EnergyUnits extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Other ("Other")
	 */
	public static final EnergyUnits OTHER = new EnergyUnits("Other");

	/**
	 *  $/Kilowatt-Hour ("$Kilowatt-Hour")
	 */
	public static final EnergyUnits DOLLAR_KILOWATT_HOUR = new EnergyUnits("$Kilowatt-Hour");

	/**
	 *  Thousand Cubic Feet ("ThousandCubicFeet")
	 */
	public static final EnergyUnits THOUSAND_CUBIC_FEET = new EnergyUnits("ThousandCubicFeet");

	/**
	 *  $/Thousand Cubic Feet ("$ThousandCubicFeet")
	 */
	public static final EnergyUnits DOLLAR_THOUSAND_CUBIC_FEET = new EnergyUnits("$ThousandCubicFeet");

	/**
	 *  Kilowatt-Hour ("Kilowatt-Hour")
	 */
	public static final EnergyUnits KILOWATT_HOUR = new EnergyUnits("Kilowatt-Hour");

	/**
	 *  Degree Centigrade ("DegreeCentigrade")
	 */
	public static final EnergyUnits DEGREECENTIGRADE = new EnergyUnits("DegreeCentigrade");

	/**
	 *  Wrap an arbitrary string value in an EnergyUnits object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static EnergyUnits wrap( String value ) {
		return new EnergyUnits( value );
	}

	private EnergyUnits( String value ) {
		super(value);
	}
}