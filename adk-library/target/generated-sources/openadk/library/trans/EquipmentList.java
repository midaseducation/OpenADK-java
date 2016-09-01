// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.trans;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class EquipmentList extends SIFKeyedList<Equipment>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EquipmentList() {
		super( TransDTD.EQUIPMENTLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param equipment 
	 */
	public EquipmentList( Equipment equipment ) {
		super( TransDTD.EQUIPMENTLIST );
		this.safeAddChild( TransDTD.EQUIPMENTLIST_EQUIPMENT, equipment );
	}

	/**
	 *  Adds a new <code>&lt;Equipment&gt;</code> repeatable element.
	 *  This form of <code>setEquipment</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setEquipment</code>
	 *  that accepts a single <code>Equipment</code> object.
	 *
	 *  @param busEquipmentRefId GUID that identifies the type of equipment
	 *  @param count The number of pieces of this type of equipment
	 *  @since 1.1
	 */
	public void addEquipment( String busEquipmentRefId, String count ) {
		addChild( TransDTD.EQUIPMENTLIST_EQUIPMENT, new Equipment( busEquipmentRefId, count ) );
	}

	/**
	 *  Removes an <code>Equipment</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param busEquipmentRefId Identifies the Equipment object to remove by its BusEquipmentRefId value
	 *  @since 1.1
	 */
	public void removeEquipment( String busEquipmentRefId ) { 
		removeChild( TransDTD.EQUIPMENTLIST_EQUIPMENT, new String[] { busEquipmentRefId.toString() } );
	}

	/**
	 *  Gets an <code>Equipment</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param busEquipmentRefId Identifies the Equipment object to return by its "BusEquipmentRefId" attribute value
	 *  @return An <code>Equipment</code> object
	 *  @since 1.1
	 */
	public Equipment getEquipment( String busEquipmentRefId ) { 
		return (Equipment)getChild( TransDTD.EQUIPMENTLIST_EQUIPMENT, new String[] { busEquipmentRefId.toString() } );
	}

	/**
	 *  Gets all <code>Equipment</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Equipment</code> objects
	 *  @since 1.1
	 */
	public Equipment[] getEquipments() {
		List<SIFElement> v = getChildList( TransDTD.EQUIPMENTLIST_EQUIPMENT);
		Equipment[] cvt = new Equipment[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Equipment</code> objects. All existing 
	 * <code>Equipment</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Equipments</code>.
	 *
	 *  @since 1.1
	 */
	public void setEquipments( Equipment[] equipments ) {
		setChildren( TransDTD.EQUIPMENTLIST_EQUIPMENT, equipments );
	}

}