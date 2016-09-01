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
public class SIF_Rows extends SIFList<R>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_Rows() {
		super( InfraDTD.SIF_ROWS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param r 
	 */
	public SIF_Rows( C r ) {
		super( InfraDTD.SIF_ROWS );
		this.safeAddChild( InfraDTD.SIF_ROWS_R,  new R( r ) );
	}

	/**
	 *  Adds a new <code>&lt;R&gt;</code> repeatable element.
	 *  This form of <code>setR</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setR</code>
	 *  that accepts a single <code>R</code> object.
	 *
	 *  @param c 
	 *  @since 2.0
	 */
	public void addR( C c ) {
		addChild( InfraDTD.SIF_ROWS_R, new R( c ) );
	}

	/**
	 *  Gets all <code>R</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>R</code> objects
	 *  @since 2.0
	 */
	public R[] getRs() {
		List<SIFElement> v = getChildList( InfraDTD.SIF_ROWS_R);
		R[] cvt = new R[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>R</code> objects. All existing 
	 * <code>R</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Rs</code>.
	 *
	 *  @since 2.0
	 */
	public void setRs( R[] rs ) {
		setChildren( InfraDTD.SIF_ROWS_R, rs );
	}

}
