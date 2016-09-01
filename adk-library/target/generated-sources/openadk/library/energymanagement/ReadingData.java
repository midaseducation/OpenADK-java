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
public class ReadingData extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ReadingData() {
		super( EnergymanagementDTD.READINGDATA );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param measurement Measurement type
	 *  @param energyUnits One of enumerated list of unit types for energy readings (temperature, electrical energy usage, gas usage and the price for both).
	 */
	public ReadingData( Measurement measurement, EnergyUnits energyUnits ) {
		super( EnergymanagementDTD.READINGDATA );
		this.setMeasurement( measurement );
		this.setEnergyUnits( energyUnits );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( EnergymanagementDTD.READINGDATA_MEASUREMENT ) );
		b.append('.');
		b.append( getFieldValue( EnergymanagementDTD.READINGDATA_ENERGYUNITS ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { EnergymanagementDTD.READINGDATA_MEASUREMENT, EnergymanagementDTD.READINGDATA_ENERGYUNITS };
	}

	/**
	 *  Gets the value of the <code>&lt;Measurement&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Measurement type"</i><p>
	 *
	 *  @return The <code>Measurement</code> element of this object.
	 *  @since 2.6
	 */
	public String getMeasurement() { 
		return getFieldValue( EnergymanagementDTD.READINGDATA_MEASUREMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;Measurement&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Measurement type"</i><p>
	 *
	 *  @param value A constant defined by the <code>Measurement</code> class
	 *  @since 2.6
	 */
	public void setMeasurement( Measurement value ) { 
		setField( EnergymanagementDTD.READINGDATA_MEASUREMENT, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Measurement&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Measurement type"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setMeasurement( String value ) { 
		setField( EnergymanagementDTD.READINGDATA_MEASUREMENT, value );
	}

	/**
	 *  Gets the value of the <code>&lt;SensorId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identification of internal meter or data source."</i><p>
	 *
	 *  @return The <code>SensorId</code> element of this object.
	 *  @since 2.6
	 */
	public String getSensorId() { 
		return (String) getSIFSimpleFieldValue( EnergymanagementDTD.READINGDATA_SENSORID );
	}

	/**
	 *  Sets the value of the <code>&lt;SensorId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identification of internal meter or data source."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSensorId( String value ) { 
		setFieldValue( EnergymanagementDTD.READINGDATA_SENSORID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Interval&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time in seconds between Measurements."</i><p>
	 *
	 *  @return The <code>Interval</code> element of this object.
	 *  @since 2.6
	 */
	public Integer getInterval() { 
		return (Integer) getSIFSimpleFieldValue( EnergymanagementDTD.READINGDATA_INTERVAL );
	}

	/**
	 *  Sets the value of the <code>&lt;Interval&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time in seconds between Measurements."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.6
	 */
	public void setInterval( Integer value ) { 
		setFieldValue( EnergymanagementDTD.READINGDATA_INTERVAL, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;EnergyUnits&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"One of enumerated list of unit types for energy readings (temperature, electrical energy usage, gas usage and the price for both)."</i><p>
	 *
	 *  @return The <code>EnergyUnits</code> element of this object.
	 *  @since 2.6
	 */
	public String getEnergyUnits() { 
		return getFieldValue( EnergymanagementDTD.READINGDATA_ENERGYUNITS );
	}

	/**
	 *  Sets the value of the <code>&lt;EnergyUnits&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"One of enumerated list of unit types for energy readings (temperature, electrical energy usage, gas usage and the price for both)."</i><p>
	 *
	 *  @param value A constant defined by the <code>EnergyUnits</code> class
	 *  @since 2.6
	 */
	public void setEnergyUnits( EnergyUnits value ) { 
		setField( EnergymanagementDTD.READINGDATA_ENERGYUNITS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;EnergyUnits&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"One of enumerated list of unit types for energy readings (temperature, electrical energy usage, gas usage and the price for both)."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setEnergyUnits( String value ) { 
		setField( EnergymanagementDTD.READINGDATA_ENERGYUNITS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;ReadingName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of collection of readings"</i><p>
	 *
	 *  @return The <code>ReadingName</code> element of this object.
	 *  @since 2.6
	 */
	public String getReadingName() { 
		return (String) getSIFSimpleFieldValue( EnergymanagementDTD.READINGDATA_READINGNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;ReadingName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of collection of readings"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setReadingName( String value ) { 
		setFieldValue( EnergymanagementDTD.READINGDATA_READINGNAME, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ReadingList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Collection of reported data readings, in time order."</i><p>
	 *
	 *  @param value A <code>ReadingList</code> object
	 *  @since 2.6
	 */
	public void setReadingList( ReadingList value ) { 
		removeChild( EnergymanagementDTD.READINGDATA_READINGLIST );
		addChild( EnergymanagementDTD.READINGDATA_READINGLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ReadingList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Collection of reported data readings, in time order."</i><p>
	 *
	 *  @return A <code>ReadingList</code> object
	 *  @since 2.6
	 */
	public ReadingList getReadingList() { 
		return (ReadingList)getChild( EnergymanagementDTD.READINGDATA_READINGLIST);
	}

	/**
	 *  Removes the <code>ReadingList</code> child element previously created by calling <code>setReadingList</code>
	 *
	 *  @since 2.6
	 */
	public void removeReadingList() { 
		removeChild( EnergymanagementDTD.READINGDATA_READINGLIST );
	}

}