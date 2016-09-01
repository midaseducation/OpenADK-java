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
 *  @since 1.1
 */
public class SIF_SIFNodes extends SIFKeyedList<SIF_SIFNode>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_SIFNodes() {
		super( InfraDTD.SIF_SIFNODES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifsifNode 
	 */
	public SIF_SIFNodes( SIF_SIFNode sifsifNode ) {
		super( InfraDTD.SIF_SIFNODES );
		this.safeAddChild( InfraDTD.SIF_SIFNODES_SIF_SIFNODE, sifsifNode );
	}

	/**
	 *  Adds a new <code>&lt;SIF_SIFNode&gt;</code> repeatable element.
	 *  This form of <code>setSIF_SIFNode</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_SIFNode</code>
	 *  that accepts a single <code>SIF_SIFNode</code> object.
	 *
	 *  @param type The type of node ("Agent" or "ZIS")
	 *  @param sifName The descriptive name of the SIF node (i.e. Ramsey Food Services).
	 *  @param sifSourceId The agent or ZIS identifier. This is the same value that the SIF node would place in any SIF_Header that it would create.
	 *  @param sifMode Specifies the communication mode (Pull or Push) as chosen by the message sender.
	 *  @param sifMaxBufferSize Specifies that the ZIS should never send packets larger than this value. Query responses from other providers are controlled by the SIF_MaxBufferSize attribute in the SIF_Request message.
	 *  @param sifSleeping This element shows whether the SIF node is ready to process messages.
	 *  @since 1.1
	 */
	public void addSIF_SIFNode( SIF_SIFNodeType type, String sifName, String sifSourceId, SIFMode sifMode, Integer sifMaxBufferSize, YesNo sifSleeping ) {
		addChild( InfraDTD.SIF_SIFNODES_SIF_SIFNODE, new SIF_SIFNode( type, sifName, sifSourceId, sifMode, sifMaxBufferSize, sifSleeping ) );
	}

	/**
	 *  Removes a <code>SIF_SIFNode</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the SIF_SIFNode object to remove by its Type value
	 *  @since 1.1
	 */
	public void removeSIF_SIFNode( SIF_SIFNodeType type ) { 
		removeChild( InfraDTD.SIF_SIFNODES_SIF_SIFNODE, new String[] { type.toString() } );
	}

	/**
	 *  Gets a <code>SIF_SIFNode</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the SIF_SIFNode object to return by its "Type" attribute value
	 *  @return A <code>SIF_SIFNode</code> object
	 *  @since 1.1
	 */
	public SIF_SIFNode getSIF_SIFNode( SIF_SIFNodeType type ) { 
		return (SIF_SIFNode)getChild( InfraDTD.SIF_SIFNODES_SIF_SIFNODE, new String[] { type.toString() } );
	}

	/**
	 *  Gets all <code>SIF_SIFNode</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SIF_SIFNode</code> objects
	 *  @since 1.1
	 */
	public SIF_SIFNode[] getSIF_SIFNodes() {
		List<SIFElement> v = getChildList( InfraDTD.SIF_SIFNODES_SIF_SIFNODE);
		SIF_SIFNode[] cvt = new SIF_SIFNode[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SIF_SIFNode</code> objects. All existing 
	 * <code>SIF_SIFNode</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SIF_SIFNodes</code>.
	 *
	 *  @since 1.1
	 */
	public void setSIF_SIFNodes( SIF_SIFNode[] sif_sifnodes ) {
		setChildren( InfraDTD.SIF_SIFNODES_SIF_SIFNODE, sif_sifnodes );
	}

}
