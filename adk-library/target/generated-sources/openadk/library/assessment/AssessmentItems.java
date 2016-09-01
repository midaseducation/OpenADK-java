// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class AssessmentItems extends SIFList<AssessmentItemSif3>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssessmentItems() {
		super( AssessmentDTD.ASSESSMENTITEMS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param assessmentItemSif3 
	 */
	public AssessmentItems( AssessmentItemSif3 assessmentItemSif3 ) {
		super( AssessmentDTD.ASSESSMENTITEMS );
		this.safeAddChild( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3, assessmentItemSif3 );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3 );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3 };
	}

	/**
	 *  Adds a new <code>&lt;AssessmentItemSif3&gt;</code> repeatable element.
	 *  This form of <code>setAssessmentItemSif3</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAssessmentItemSif3</code>
	 *  that accepts a single <code>AssessmentItemSif3</code> object.
	 *
	 *  @param assessmentItemRefId This identifies the specific item that contributes to a sub-test score.
	 *  @param itemWeightCorrect This provides a weighting factor for how the item score is used to compute a sub-test score when the item is correct or partially correct. Item weight of 1 indicates the full item score is used. A weight of .5 would indicate the item only contributes one half of the item score to the subtest. A weight of 0 indicates the item does not affect the sub test score.
	 *  @param itemWeightIncorrect This provides a weighting factor for how the item score is used to compute a sub-test score when the item is attempted and incorrect. Item weight should be a negative value if the item subtracts from the score if missed.
	 *  @param itemWeightNotAttempted This provides a weighting factor for how the item score is used to compute a sub-test score when the item has not been attempted by the student. Item weight should be a negative value if the item subtracts from the score if not attempted.
	 *  @since 2.6
	 */
	public void addAssessmentItemSif3( String assessmentItemRefId, BigDecimal itemWeightCorrect, BigDecimal itemWeightIncorrect, BigDecimal itemWeightNotAttempted ) {
		addChild( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3, new AssessmentItemSif3( assessmentItemRefId, itemWeightCorrect, itemWeightIncorrect, itemWeightNotAttempted ) );
	}

	/**
	 *  Removes an <code>AssessmentItemSif3</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param assessmentItemRefId Identifies the AssessmentItemSif3 object to remove by its AssessmentItemRefId value
	 *  @param itemWeightCorrect Identifies the AssessmentItemSif3 object to remove by its ItemWeightCorrect value
	 *  @param itemWeightIncorrect Identifies the AssessmentItemSif3 object to remove by its ItemWeightIncorrect value
	 *  @param itemWeightNotAttempted Identifies the AssessmentItemSif3 object to remove by its ItemWeightNotAttempted value
	 *  @since 2.6
	 */
	public void removeAssessmentItemSif3( String assessmentItemRefId, BigDecimal itemWeightCorrect, BigDecimal itemWeightIncorrect, BigDecimal itemWeightNotAttempted ) { 
		removeChild( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3, new String[] { assessmentItemRefId.toString(),itemWeightCorrect.toString(),itemWeightIncorrect.toString(),itemWeightNotAttempted.toString() } );
	}

	/**
	 *  Gets an <code>AssessmentItemSif3</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param assessmentItemRefId Identifies the AssessmentItemSif3 object to return by its "AssessmentItemRefId" attribute value
	 *  @param itemWeightCorrect Identifies the AssessmentItemSif3 object to return by its "ItemWeightCorrect" attribute value
	 *  @param itemWeightIncorrect Identifies the AssessmentItemSif3 object to return by its "ItemWeightIncorrect" attribute value
	 *  @param itemWeightNotAttempted Identifies the AssessmentItemSif3 object to return by its "ItemWeightNotAttempted" attribute value
	 *  @return An <code>AssessmentItemSif3</code> object
	 *  @since 2.6
	 */
	public AssessmentItemSif3 getAssessmentItemSif3( String assessmentItemRefId, BigDecimal itemWeightCorrect, BigDecimal itemWeightIncorrect, BigDecimal itemWeightNotAttempted ) { 
		return (AssessmentItemSif3)getChild( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3, new String[] { assessmentItemRefId.toString(),itemWeightCorrect.toString(),itemWeightIncorrect.toString(),itemWeightNotAttempted.toString() } );
	}

	/**
	 *  Gets all <code>AssessmentItemSif3</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>AssessmentItemSif3</code> objects
	 *  @since 2.6
	 */
	public AssessmentItemSif3[] getAssessmentItemSif3s() {
		List<SIFElement> v = getChildList( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3);
		AssessmentItemSif3[] cvt = new AssessmentItemSif3[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>AssessmentItemSif3</code> objects. All existing 
	 * <code>AssessmentItemSif3</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>AssessmentItemSif3s</code>.
	 *
	 *  @since 2.6
	 */
	public void setAssessmentItemSif3s( AssessmentItemSif3[] assessmentitemsif3s ) {
		setChildren( AssessmentDTD.ASSESSMENTITEMS_ASSESSMENTITEMSIF3, assessmentitemsif3s );
	}

}