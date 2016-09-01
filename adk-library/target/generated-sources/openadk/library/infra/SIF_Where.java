// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class SIF_Where extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_Where() {
		super( InfraDTD.SIF_WHERE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifConditionGroup 
	 */
	public SIF_Where( SIF_ConditionGroup sifConditionGroup ) {
		super( InfraDTD.SIF_WHERE );
		this.setSIF_ConditionGroup(sifConditionGroup);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP };
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_ConditionGroup&gt;</code> element.
	 *
	 *  @param value A <code>SIF_ConditionGroup</code> object
	 *  @since 2.0
	 */
	public void setSIF_ConditionGroup( SIF_ConditionGroup value ) { 
		removeChild( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP );
		addChild( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_ConditionGroup&gt;</code> child element.
	 *  This form of <code>setSIF_ConditionGroup</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_ConditionGroup</code>
	 *  that accepts a single <code>SIF_ConditionGroup</code> object.
	 *
	 *  @param type 
        The Boolean operator for joining conditions (SIF_Conditions elements) within this element.  Note that None should be used if there is only one
        SIF_Conditions element.
      
	 *  @param sifConditions 
	 *  @since 2.0
	 */
	public void setSIF_ConditionGroup( ConditionType type, SIF_Conditions sifConditions ) {
		removeChild( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP);
		addChild( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP, new SIF_ConditionGroup( type, sifConditions ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_ConditionGroup&gt;</code> element.
	 *
	 *  @return A <code>SIF_ConditionGroup</code> object
	 *  @since 2.0
	 */
	public SIF_ConditionGroup getSIF_ConditionGroup() { 
		return (SIF_ConditionGroup)getChild( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP);
	}

	/**
	 *  Removes the <code>SIF_ConditionGroup</code> child element previously created by calling <code>setSIF_ConditionGroup</code>
	 *
	 *  @since 2.0
	 */
	public void removeSIF_ConditionGroup() { 
		removeChild( InfraDTD.SIF_WHERE_SIF_CONDITIONGROUP );
	}

}
