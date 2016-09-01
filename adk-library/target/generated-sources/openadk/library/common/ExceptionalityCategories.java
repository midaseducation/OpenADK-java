// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ExceptionalityCategories extends SIFKeyedList<ExceptionalityCategory>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ExceptionalityCategories() {
		super( CommonDTD.EXCEPTIONALITYCATEGORIES );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param exceptionalityCategory 
	 */
	public ExceptionalityCategories( ExceptionalityCategory exceptionalityCategory ) {
		super( CommonDTD.EXCEPTIONALITYCATEGORIES );
		this.safeAddChild( CommonDTD.EXCEPTIONALITYCATEGORIES_EXCEPTIONALITYCATEGORY, exceptionalityCategory );
	}

	/**
	 *  Adds a new <code>&lt;ExceptionalityCategory&gt;</code> repeatable element.
	 *  This form of <code>setExceptionalityCategory</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setExceptionalityCategory</code>
	 *  that accepts a single <code>ExceptionalityCategory</code> object.
	 *
	 *  @param codeType If CodeType = "NCES" then use code set 0768 Primary Disability Type [NCES Handbooks]
	 *  @param exceptionalityPriority Identifies priority of the exceptionality.  "Primary" is the first and is required even if only one exceptionality is specified. "Secondary", etc. are of lower priority. Primary, Secondary, and Tertiary must be specified before "Additional" is used.
	 *  @param code Exceptionality description/code which identifies the exceptionality or areas of need of the student.  Not all programs require identification of an exceptionality.  If required for this program type, must have at least one element with ExceptionalityPriority attribute = "Primary".
	 *  @since 2.0
	 */
	public void addExceptionalityCategory( String codeType, ExceptionalityPriority exceptionalityPriority, ExceptionalityCategoryCode code ) {
		addChild( CommonDTD.EXCEPTIONALITYCATEGORIES_EXCEPTIONALITYCATEGORY, new ExceptionalityCategory( codeType, exceptionalityPriority, code ) );
	}

	/**
	 *  Removes an <code>ExceptionalityCategory</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param exceptionalityPriority Identifies the ExceptionalityCategory object to remove by its ExceptionalityPriority value
	 *  @since 2.0
	 */
	public void removeExceptionalityCategory( ExceptionalityPriority exceptionalityPriority ) { 
		removeChild( CommonDTD.EXCEPTIONALITYCATEGORIES_EXCEPTIONALITYCATEGORY, new String[] { exceptionalityPriority.toString() } );
	}

	/**
	 *  Gets an <code>ExceptionalityCategory</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param exceptionalityPriority Identifies the ExceptionalityCategory object to return by its "ExceptionalityPriority" attribute value
	 *  @return An <code>ExceptionalityCategory</code> object
	 *  @since 2.0
	 */
	public ExceptionalityCategory getExceptionalityCategory( ExceptionalityPriority exceptionalityPriority ) { 
		return (ExceptionalityCategory)getChild( CommonDTD.EXCEPTIONALITYCATEGORIES_EXCEPTIONALITYCATEGORY, new String[] { exceptionalityPriority.toString() } );
	}

	/**
	 *  Gets all <code>ExceptionalityCategory</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>ExceptionalityCategory</code> objects
	 *  @since 2.0
	 */
	public ExceptionalityCategory[] getExceptionalityCategorys() {
		List<SIFElement> v = getChildList( CommonDTD.EXCEPTIONALITYCATEGORIES_EXCEPTIONALITYCATEGORY);
		ExceptionalityCategory[] cvt = new ExceptionalityCategory[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>ExceptionalityCategory</code> objects. All existing 
	 * <code>ExceptionalityCategory</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>ExceptionalityCategorys</code>.
	 *
	 *  @since 2.0
	 */
	public void setExceptionalityCategorys( ExceptionalityCategory[] exceptionalitycategorys ) {
		setChildren( CommonDTD.EXCEPTIONALITYCATEGORIES_EXCEPTIONALITYCATEGORY, exceptionalitycategorys );
	}

}