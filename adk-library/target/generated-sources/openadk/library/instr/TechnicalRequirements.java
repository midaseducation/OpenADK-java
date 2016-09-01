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
 *  @since 1.5r1
 */
public class TechnicalRequirements extends SIFKeyedList<TechnicalRequirement>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public TechnicalRequirements() {
		super( InstrDTD.TECHNICALREQUIREMENTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param technicalRequirement Applications, OS, or network requirement for activity.
	 */
	public TechnicalRequirements( TechnicalRequirement technicalRequirement ) {
		super( InstrDTD.TECHNICALREQUIREMENTS );
		this.safeAddChild( InstrDTD.TECHNICALREQUIREMENTS_TECHNICALREQUIREMENT, technicalRequirement );
	}

	/**
	 *  Adds a new <code>&lt;TechnicalRequirement&gt;</code> repeatable element.
	 *  This form of <code>setTechnicalRequirement</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setTechnicalRequirement</code>
	 *  that accepts a single <code>TechnicalRequirement</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;TechnicalRequirement&gt; element
	 *  @since 1.5r1
	 */
	public void addTechnicalRequirement( String value ) {
		addChild( InstrDTD.TECHNICALREQUIREMENTS_TECHNICALREQUIREMENT, new TechnicalRequirement( value ) );
	}

	/**
	 *  Removes a <code>TechnicalRequirement</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the TechnicalRequirement object to remove by its Value value
	 *  @since 1.5r1
	 */
	public void removeTechnicalRequirement( String value ) { 
		removeChild( InstrDTD.TECHNICALREQUIREMENTS_TECHNICALREQUIREMENT, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>TechnicalRequirement</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the TechnicalRequirement object to return by its "Value" attribute value
	 *  @return A <code>TechnicalRequirement</code> object
	 *  @since 1.5r1
	 */
	public TechnicalRequirement getTechnicalRequirement( String value ) { 
		return (TechnicalRequirement)getChild( InstrDTD.TECHNICALREQUIREMENTS_TECHNICALREQUIREMENT, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>TechnicalRequirement</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>TechnicalRequirement</code> objects
	 *  @since 1.5r1
	 */
	public TechnicalRequirement[] getTechnicalRequirements() {
		List<SIFElement> v = getChildList( InstrDTD.TECHNICALREQUIREMENTS_TECHNICALREQUIREMENT);
		TechnicalRequirement[] cvt = new TechnicalRequirement[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>TechnicalRequirement</code> objects. All existing 
	 * <code>TechnicalRequirement</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>TechnicalRequirements</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setTechnicalRequirements( TechnicalRequirement[] technicalrequirements ) {
		setChildren( InstrDTD.TECHNICALREQUIREMENTS_TECHNICALREQUIREMENT, technicalrequirements );
	}

}