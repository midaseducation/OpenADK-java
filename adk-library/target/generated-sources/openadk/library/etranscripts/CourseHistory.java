// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.etranscripts;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.gradebook.*;
import openadk.library.student.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class CourseHistory extends SIFList<Term>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CourseHistory() {
		super( EtranscriptsDTD.COURSEHISTORY );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param term 
	 */
	public CourseHistory( Term term ) {
		super( EtranscriptsDTD.COURSEHISTORY );
		this.safeAddChild( EtranscriptsDTD.COURSEHISTORY_TERM, term );
	}

	/**
	 *  Gets all <code>Term</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Term</code> objects
	 *  @since 2.0
	 */
	public Term[] getTerms() {
		List<SIFElement> v = getChildList( EtranscriptsDTD.COURSEHISTORY_TERM);
		Term[] cvt = new Term[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Term</code> objects. All existing 
	 * <code>Term</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Terms</code>.
	 *
	 *  @since 2.0
	 */
	public void setTerms( Term[] terms ) {
		setChildren( EtranscriptsDTD.COURSEHISTORY_TERM, terms );
	}

}