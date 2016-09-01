// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.energymanagement;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class ReadingDataList extends SIFList<ReadingData>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ReadingDataList() {
		super( EnergymanagementDTD.READINGDATALIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param readingData Complex element defining a set of parameters that apply to all the actual readings that follow.
	 */
	public ReadingDataList( ReadingData readingData ) {
		super( EnergymanagementDTD.READINGDATALIST );
		this.safeAddChild( EnergymanagementDTD.READINGDATALIST_READINGDATA, readingData );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( EnergymanagementDTD.READINGDATALIST_READINGDATA );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { EnergymanagementDTD.READINGDATALIST_READINGDATA };
	}

	/**
	 *  Adds a new <code>&lt;ReadingData&gt;</code> repeatable element.
	 *  This form of <code>setReadingData</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setReadingData</code>
	 *  that accepts a single <code>ReadingData</code> object.
	 *
	 *  @param measurement Measurement type
	 *  @param energyUnits One of enumerated list of unit types for energy readings (temperature, electrical energy usage, gas usage and the price for both).
	 *  @since 2.6
	 */
	public void addReadingData( Measurement measurement, EnergyUnits energyUnits ) {
		addChild( EnergymanagementDTD.READINGDATALIST_READINGDATA, new ReadingData( measurement, energyUnits ) );
	}

	/**
	 *  Removes a <code>ReadingData</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param measurement Identifies the ReadingData object to remove by its Measurement value
	 *  @param energyUnits Identifies the ReadingData object to remove by its EnergyUnits value
	 *  @since 2.6
	 */
	public void removeReadingData( Measurement measurement, EnergyUnits energyUnits ) { 
		removeChild( EnergymanagementDTD.READINGDATALIST_READINGDATA, new String[] { measurement.toString(),energyUnits.toString() } );
	}

	/**
	 *  Gets a <code>ReadingData</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param measurement Identifies the ReadingData object to return by its "Measurement" attribute value
	 *  @param energyUnits Identifies the ReadingData object to return by its "EnergyUnits" attribute value
	 *  @return A <code>ReadingData</code> object
	 *  @since 2.6
	 */
	public ReadingData getReadingData( Measurement measurement, EnergyUnits energyUnits ) { 
		return (ReadingData)getChild( EnergymanagementDTD.READINGDATALIST_READINGDATA, new String[] { measurement.toString(),energyUnits.toString() } );
	}

	/**
	 *  Gets all <code>ReadingData</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>ReadingData</code> objects
	 *  @since 2.6
	 */
	public ReadingData[] getReadingDatas() {
		List<SIFElement> v = getChildList( EnergymanagementDTD.READINGDATALIST_READINGDATA);
		ReadingData[] cvt = new ReadingData[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>ReadingData</code> objects. All existing 
	 * <code>ReadingData</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>ReadingDatas</code>.
	 *
	 *  @since 2.6
	 */
	public void setReadingDatas( ReadingData[] readingdatas ) {
		setChildren( EnergymanagementDTD.READINGDATALIST_READINGDATA, readingdatas );
	}

}
