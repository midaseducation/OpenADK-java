// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

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
public class Interventions extends SIFKeyedList<Intervention>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Interventions() {
		super( InstrDTD.INTERVENTIONS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param intervention Details of an intervention.
	 */
	public Interventions( Intervention intervention ) {
		super( InstrDTD.INTERVENTIONS );
		this.safeAddChild( InstrDTD.INTERVENTIONS_INTERVENTION, intervention );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.INTERVENTIONS_INTERVENTION );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.INTERVENTIONS_INTERVENTION };
	}

	/**
	 *  Adds a new <code>&lt;Intervention&gt;</code> repeatable element.
	 *  This form of <code>setIntervention</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIntervention</code>
	 *  that accepts a single <code>Intervention</code> object.
	 *
	 *  @param interventionName Naming of the intervention.
	 *  @since 2.6
	 */
	public void addIntervention( String interventionName ) {
		addChild( InstrDTD.INTERVENTIONS_INTERVENTION, new Intervention( interventionName ) );
	}

	/**
	 *  Removes an <code>Intervention</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param interventionName Identifies the Intervention object to remove by its InterventionName value
	 *  @since 2.6
	 */
	public void removeIntervention( String interventionName ) { 
		removeChild( InstrDTD.INTERVENTIONS_INTERVENTION, new String[] { interventionName.toString() } );
	}

	/**
	 *  Gets an <code>Intervention</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param interventionName Identifies the Intervention object to return by its "InterventionName" attribute value
	 *  @return An <code>Intervention</code> object
	 *  @since 2.6
	 */
	public Intervention getIntervention( String interventionName ) { 
		return (Intervention)getChild( InstrDTD.INTERVENTIONS_INTERVENTION, new String[] { interventionName.toString() } );
	}

	/**
	 *  Gets all <code>Intervention</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Intervention</code> objects
	 *  @since 2.6
	 */
	public Intervention[] getInterventions() {
		List<SIFElement> v = getChildList( InstrDTD.INTERVENTIONS_INTERVENTION);
		Intervention[] cvt = new Intervention[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Intervention</code> objects. All existing 
	 * <code>Intervention</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Interventions</code>.
	 *
	 *  @since 2.6
	 */
	public void setInterventions( Intervention[] interventions ) {
		setChildren( InstrDTD.INTERVENTIONS_INTERVENTION, interventions );
	}

}