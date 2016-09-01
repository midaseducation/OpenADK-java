// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.library;

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
public class FineInfoList extends SIFKeyedList<FineInfo>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FineInfoList() {
		super( LibraryDTD.FINEINFOLIST );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param fineInfo 
	 */
	public FineInfoList( FineInfo fineInfo ) {
		super( LibraryDTD.FINEINFOLIST );
		this.safeAddChild( LibraryDTD.FINEINFOLIST_FINEINFO, fineInfo );
	}

	/**
	 *  Adds a new <code>&lt;FineInfo&gt;</code> repeatable element.
	 *  This form of <code>setFineInfo</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setFineInfo</code>
	 *  that accepts a single <code>FineInfo</code> object.
	 *
	 *  @param type Type of fine assessed to this patron and item.  A corresponding ItemInfo is required for all FineInfo types except "Other" and "Refund" where it is permissible to omit the ItemInfo element if there isn't an item associated with the fine.
	 *  @param assessed The date and time that this fine was assessed to the patron.
	 *  @param amount The current balance of the fine expressed as a positive number. 
	 *  @since 1.1
	 */
	public void addFineInfo( FineType type, Calendar assessed, MonetaryAmount amount ) {
		addChild( LibraryDTD.FINEINFOLIST_FINEINFO, new FineInfo( type, assessed, amount ) );
	}

	/**
	 *  Removes a <code>FineInfo</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the FineInfo object to remove by its Type value
	 *  @since 1.1
	 */
	public void removeFineInfo( FineType type ) { 
		removeChild( LibraryDTD.FINEINFOLIST_FINEINFO, new String[] { type.toString() } );
	}

	/**
	 *  Gets a <code>FineInfo</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param type Identifies the FineInfo object to return by its "Type" attribute value
	 *  @return A <code>FineInfo</code> object
	 *  @since 1.1
	 */
	public FineInfo getFineInfo( FineType type ) { 
		return (FineInfo)getChild( LibraryDTD.FINEINFOLIST_FINEINFO, new String[] { type.toString() } );
	}

	/**
	 *  Gets all <code>FineInfo</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>FineInfo</code> objects
	 *  @since 1.1
	 */
	public FineInfo[] getFineInfos() {
		List<SIFElement> v = getChildList( LibraryDTD.FINEINFOLIST_FINEINFO);
		FineInfo[] cvt = new FineInfo[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>FineInfo</code> objects. All existing 
	 * <code>FineInfo</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>FineInfos</code>.
	 *
	 *  @since 1.1
	 */
	public void setFineInfos( FineInfo[] fineinfos ) {
		setChildren( LibraryDTD.FINEINFOLIST_FINEINFO, fineinfos );
	}

}
