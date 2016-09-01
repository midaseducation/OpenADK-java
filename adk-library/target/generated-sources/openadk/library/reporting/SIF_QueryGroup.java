// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.reporting;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.infra.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class SIF_QueryGroup extends SIFKeyedList<SIF_Query>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_QueryGroup() {
		super( ReportingDTD.SIF_QUERYGROUP );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifQuery 
	 */
	public SIF_QueryGroup( SIF_Query sifQuery ) {
		super( ReportingDTD.SIF_QUERYGROUP );
		this.safeAddChild( ReportingDTD.SIF_QUERYGROUP_SIF_QUERY, sifQuery );
	}

	/**
	 *  Adds a new <code>&lt;SIF_Query&gt;</code> repeatable element.
	 *  This form of <code>setSIF_Query</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_Query</code>
	 *  that accepts a single <code>SIF_Query</code> object.
	 *
	 *  @param sifQueryObject 
	 *  @since 1.5r1
	 */
	public void addSIF_Query( SIF_QueryObject sifQueryObject ) {
		addChild( ReportingDTD.SIF_QUERYGROUP_SIF_QUERY, new SIF_Query( sifQueryObject ) );
	}

	/**
	 *  Removes a <code>SIF_Query</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param sifQueryObject Identifies the SIF_Query object to remove by its SIF_QueryObject value
	 *  @since 1.5r1
	 */
	public void removeSIF_Query( SIF_QueryObject sifQueryObject ) { 
		removeChild( ReportingDTD.SIF_QUERYGROUP_SIF_QUERY, new String[] { sifQueryObject.toString() } );
	}

	/**
	 *  Gets a <code>SIF_Query</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param sifQueryObject Identifies the SIF_Query object to return by its "SIF_QueryObject" attribute value
	 *  @return A <code>SIF_Query</code> object
	 *  @since 1.5r1
	 */
	public SIF_Query getSIF_Query( SIF_QueryObject sifQueryObject ) { 
		return (SIF_Query)getChild( ReportingDTD.SIF_QUERYGROUP_SIF_QUERY, new String[] { sifQueryObject.toString() } );
	}

	/**
	 *  Gets all <code>SIF_Query</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SIF_Query</code> objects
	 *  @since 1.5r1
	 */
	public SIF_Query[] getSIF_Querys() {
		List<SIFElement> v = getChildList( ReportingDTD.SIF_QUERYGROUP_SIF_QUERY);
		SIF_Query[] cvt = new SIF_Query[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SIF_Query</code> objects. All existing 
	 * <code>SIF_Query</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SIF_Querys</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setSIF_Querys( SIF_Query[] sif_querys ) {
		setChildren( ReportingDTD.SIF_QUERYGROUP_SIF_QUERY, sif_querys );
	}

}
