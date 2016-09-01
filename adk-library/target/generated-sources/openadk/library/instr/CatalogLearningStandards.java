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
 *  @since 2.4
 */
public class CatalogLearningStandards extends SIFList<CatalogLearningStandardsDocument>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public CatalogLearningStandards() {
		super( InstrDTD.CATALOGLEARNINGSTANDARDS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param document A curriculum standards document or the like published by a national, state, district, school site, professional association or other interested party.
	 */
	public CatalogLearningStandards( CatalogLearningStandardsDocument document ) {
		super( InstrDTD.CATALOGLEARNINGSTANDARDS );
		this.safeAddChild( InstrDTD.CATALOGLEARNINGSTANDARDS_DOCUMENT, document );
	}

	/**
	 *  Gets all <code>CatalogLearningStandardsDocument</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>CatalogLearningStandardsDocument</code> objects
	 *  @since 2.4
	 */
	public CatalogLearningStandardsDocument[] getDocuments() {
		List<SIFElement> v = getChildList( InstrDTD.CATALOGLEARNINGSTANDARDS_DOCUMENT);
		CatalogLearningStandardsDocument[] cvt = new CatalogLearningStandardsDocument[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>CatalogLearningStandardsDocument</code> objects. All existing 
	 * <code>CatalogLearningStandardsDocument</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>CatalogLearningStandardsDocuments</code>.
	 *
	 *  @since 2.4
	 */
	public void setDocuments( CatalogLearningStandardsDocument[] documents ) {
		setChildren( InstrDTD.CATALOGLEARNINGSTANDARDS_DOCUMENT, documents );
	}

}
