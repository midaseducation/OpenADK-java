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
public class EnergyZone extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EnergyZone() {
		super( EnergymanagementDTD.ENERGYZONE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type Complex type of the facility or location supported by the Energy Zone.
	 */
	public EnergyZone( Type type ) {
		super( EnergymanagementDTD.ENERGYZONE );
		this.setType(type);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( EnergymanagementDTD.ENERGYZONE_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { EnergymanagementDTD.ENERGYZONE_TYPE };
	}

	/**
	 *  Sets the value of the <code>&lt;Type&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Complex type of the facility or location supported by the Energy Zone."</i><p>
	 *
	 *  @param value A <code>Type</code> object
	 *  @since 2.6
	 */
	public void setType( Type value ) { 
		removeChild( EnergymanagementDTD.ENERGYZONE_TYPE );
		addChild( EnergymanagementDTD.ENERGYZONE_TYPE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Type&gt;</code> child element.
	 *  This form of <code>setType</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setType</code>
	 *  that accepts a single <code>Type</code> object.
	 *
	 *  @param energyZoneName Text description of Energy Zone Area to which readings will apply.
	 *  @since 2.6
	 */
	public void setType( String energyZoneName ) {
		removeChild( EnergymanagementDTD.ENERGYZONE_TYPE);
		addChild( EnergymanagementDTD.ENERGYZONE_TYPE, new Type( energyZoneName ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Type&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Complex type of the facility or location supported by the Energy Zone."</i><p>
	 *
	 *  @return A <code>Type</code> object
	 *  @since 2.6
	 */
	public Type getType() { 
		return (Type)getChild( EnergymanagementDTD.ENERGYZONE_TYPE);
	}

	/**
	 *  Removes the <code>Type</code> child element previously created by calling <code>setType</code>
	 *
	 *  @since 2.6
	 */
	public void removeType() { 
		removeChild( EnergymanagementDTD.ENERGYZONE_TYPE );
	}

}