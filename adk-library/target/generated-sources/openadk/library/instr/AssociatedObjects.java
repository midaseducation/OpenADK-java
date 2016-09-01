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
public class AssociatedObjects extends SIFKeyedList<AssociatedObject>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssociatedObjects() {
		super( InstrDTD.ASSOCIATEDOBJECTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param associatedObject 
	 */
	public AssociatedObjects( AssociatedObject associatedObject ) {
		super( InstrDTD.ASSOCIATEDOBJECTS );
		this.safeAddChild( InstrDTD.ASSOCIATEDOBJECTS_ASSOCIATEDOBJECT, associatedObject );
	}

	/**
	 *  Adds a new <code>&lt;AssociatedObject&gt;</code> repeatable element.
	 *  This form of <code>setAssociatedObject</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAssociatedObject</code>
	 *  that accepts a single <code>AssociatedObject</code> object.
	 *
	 *  @param sifRefObject Attribute that identifies the type of SIF object being referenced.
	 *  @param value Gets or sets the content value of the &lt;AssociatedObject&gt; element
	 *  @since 1.5r1
	 */
	public void addAssociatedObject( String sifRefObject, String value ) {
		addChild( InstrDTD.ASSOCIATEDOBJECTS_ASSOCIATEDOBJECT, new AssociatedObject( sifRefObject, value ) );
	}

	/**
	 *  Removes an <code>AssociatedObject</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param sifRefObject Identifies the AssociatedObject object to remove by its SIF_RefObject value
	 *  @since 1.5r1
	 */
	public void removeAssociatedObject( String sifRefObject ) { 
		removeChild( InstrDTD.ASSOCIATEDOBJECTS_ASSOCIATEDOBJECT, new String[] { sifRefObject.toString() } );
	}

	/**
	 *  Gets an <code>AssociatedObject</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param sifRefObject Identifies the AssociatedObject object to return by its "SIF_RefObject" attribute value
	 *  @return An <code>AssociatedObject</code> object
	 *  @since 1.5r1
	 */
	public AssociatedObject getAssociatedObject( String sifRefObject ) { 
		return (AssociatedObject)getChild( InstrDTD.ASSOCIATEDOBJECTS_ASSOCIATEDOBJECT, new String[] { sifRefObject.toString() } );
	}

	/**
	 *  Gets all <code>AssociatedObject</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>AssociatedObject</code> objects
	 *  @since 1.5r1
	 */
	public AssociatedObject[] getAssociatedObjects() {
		List<SIFElement> v = getChildList( InstrDTD.ASSOCIATEDOBJECTS_ASSOCIATEDOBJECT);
		AssociatedObject[] cvt = new AssociatedObject[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>AssociatedObject</code> objects. All existing 
	 * <code>AssociatedObject</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>AssociatedObjects</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setAssociatedObjects( AssociatedObject[] associatedobjects ) {
		setChildren( InstrDTD.ASSOCIATEDOBJECTS_ASSOCIATEDOBJECT, associatedobjects );
	}

}