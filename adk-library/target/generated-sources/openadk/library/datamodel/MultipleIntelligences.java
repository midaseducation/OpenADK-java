// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.datamodel;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.2
 */
public class MultipleIntelligences extends SIFKeyedList<MultipleIntelligence>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public MultipleIntelligences() {
		super( DatamodelDTD.MULTIPLEINTELLIGENCES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param multipleIntelligence 
	 */
	public MultipleIntelligences( MultipleIntelligence multipleIntelligence ) {
		super( DatamodelDTD.MULTIPLEINTELLIGENCES );
		this.safeAddChild( DatamodelDTD.MULTIPLEINTELLIGENCES_MULTIPLEINTELLIGENCE, multipleIntelligence );
	}

	/**
	 *  Adds a new <code>&lt;MultipleIntelligence&gt;</code> repeatable element.
	 *  This form of <code>setMultipleIntelligence</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setMultipleIntelligence</code>
	 *  that accepts a single <code>MultipleIntelligence</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;MultipleIntelligence&gt; element
	 *  @since 2.2
	 */
	public void addMultipleIntelligence( MultipleIntelligenceType value ) {
		addChild( DatamodelDTD.MULTIPLEINTELLIGENCES_MULTIPLEINTELLIGENCE, new MultipleIntelligence( value ) );
	}

	/**
	 *  Removes a <code>MultipleIntelligence</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the MultipleIntelligence object to remove by its Value value
	 *  @since 2.2
	 */
	public void removeMultipleIntelligence( MultipleIntelligenceType value ) { 
		removeChild( DatamodelDTD.MULTIPLEINTELLIGENCES_MULTIPLEINTELLIGENCE, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>MultipleIntelligence</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the MultipleIntelligence object to return by its "Value" attribute value
	 *  @return A <code>MultipleIntelligence</code> object
	 *  @since 2.2
	 */
	public MultipleIntelligence getMultipleIntelligence( MultipleIntelligenceType value ) { 
		return (MultipleIntelligence)getChild( DatamodelDTD.MULTIPLEINTELLIGENCES_MULTIPLEINTELLIGENCE, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>MultipleIntelligence</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>MultipleIntelligence</code> objects
	 *  @since 2.2
	 */
	public MultipleIntelligence[] getMultipleIntelligences() {
		List<SIFElement> v = getChildList( DatamodelDTD.MULTIPLEINTELLIGENCES_MULTIPLEINTELLIGENCE);
		MultipleIntelligence[] cvt = new MultipleIntelligence[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>MultipleIntelligence</code> objects. All existing 
	 * <code>MultipleIntelligence</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>MultipleIntelligences</code>.
	 *
	 *  @since 2.2
	 */
	public void setMultipleIntelligences( MultipleIntelligence[] multipleintelligences ) {
		setChildren( DatamodelDTD.MULTIPLEINTELLIGENCES_MULTIPLEINTELLIGENCE, multipleintelligences );
	}

}
