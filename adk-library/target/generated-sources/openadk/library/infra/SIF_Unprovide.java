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
 *  Contains one of the SIF message types.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class SIF_Unprovide extends SIFMessagePayload
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_Unprovide() {
		super( InfraDTD.SIF_UNPROVIDE );
	}

	/**
	 *  Constructor that accepts a SIFVersion
	 *  @param sifVersion The version of SIF to render this message in
	 */
	public SIF_Unprovide( SIFVersion sifVersion ) {
		super( sifVersion, InfraDTD.SIF_UNPROVIDE );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Header&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Header information associated with this message."</i><p>
	 *
	 *  @param value A <code>SIF_Header</code> object
	 *  @since 1.1
	 */
	public void setSIF_Header( SIF_Header value ) { 
		removeChild( InfraDTD.SIF_UNPROVIDE_SIF_HEADER );
		addChild( InfraDTD.SIF_UNPROVIDE_SIF_HEADER, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Header&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Header information associated with this message."</i><p>
	 *
	 *  @return A <code>SIF_Header</code> object
	 *  @since 1.1
	 */
	public SIF_Header getSIF_Header() { 
		return (SIF_Header)getChild( InfraDTD.SIF_UNPROVIDE_SIF_HEADER);
	}

	/**
	 *  Removes the <code>SIF_Header</code> child element previously created by calling <code>setSIF_Header</code>
	 *
	 *  @since 1.1
	 */
	public void removeSIF_Header() { 
		removeChild( InfraDTD.SIF_UNPROVIDE_SIF_HEADER );
	}

	/**
	 *  Adds a new <code>&lt;SIF_Object&gt;</code> child element.
	 *
	 *  @param value A <code>SIF_Object</code> object
	 *  @since 1.1
	 */
	public void addSIF_Object( SIF_Object value ) { 
		addChild( InfraDTD.SIF_UNPROVIDE_SIF_OBJECT, value);
	}

	/**
	 *  Removes a <code>SIF_Object</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param objectName Identifies the SIF_Object object to remove by its ObjectName value
	 *  @since 1.1
	 */
	public void removeSIF_Object( String objectName ) { 
		removeChild( InfraDTD.SIF_UNPROVIDE_SIF_OBJECT, new String[] { objectName.toString() } );
	}

	/**
	 *  Gets a <code>SIF_Object</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param objectName Identifies the SIF_Object object to return by its "ObjectName" attribute value
	 *  @return A <code>SIF_Object</code> object
	 *  @since 1.1
	 */
	public SIF_Object getSIF_Object( String objectName ) { 
		return (SIF_Object)getChild( InfraDTD.SIF_UNPROVIDE_SIF_OBJECT, new String[] { objectName.toString() } );
	}

	/**
	 *  Gets all <code>SIF_Object</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>SIF_Object</code> objects
	 *  @since 1.1
	 */
	public SIF_Object[] getSIF_Objects() {
		List<SIFElement> v = getChildList( InfraDTD.SIF_UNPROVIDE_SIF_OBJECT);
		SIF_Object[] cvt = new SIF_Object[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>SIF_Object</code> objects. All existing 
	 * <code>SIF_Object</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>SIF_Objects</code>.
	 *
	 *  @since 1.1
	 */
	public void setSIF_Objects( SIF_Object[] sif_objects ) {
		setChildren( InfraDTD.SIF_UNPROVIDE_SIF_OBJECT, sif_objects );
	}

}