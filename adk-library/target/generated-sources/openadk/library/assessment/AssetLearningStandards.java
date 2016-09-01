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
public class AssetLearningStandards extends SIFKeyedList<AssetLearningStandard>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssetLearningStandards() {
		super( AssessmentDTD.ASSETLEARNINGSTANDARDS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param assetLearningStandard The RefId of a specific learning standard for the asset. If the asset is linked to all children learning standards in a hierarchy, then the parent learning standard should also be linked.
	 */
	public AssetLearningStandards( AssetLearningStandard assetLearningStandard ) {
		super( AssessmentDTD.ASSETLEARNINGSTANDARDS );
		this.safeAddChild( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD, assetLearningStandard );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD };
	}

	/**
	 *  Adds a new <code>&lt;AssetLearningStandard&gt;</code> repeatable element.
	 *  This form of <code>setAssetLearningStandard</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAssetLearningStandard</code>
	 *  that accepts a single <code>AssetLearningStandard</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;AssetLearningStandard&gt; element
	 *  @since 2.6
	 */
	public void addAssetLearningStandard( String value ) {
		addChild( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD, new AssetLearningStandard( value ) );
	}

	/**
	 *  Removes an <code>AssetLearningStandard</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the AssetLearningStandard object to remove by its Value value
	 *  @since 2.6
	 */
	public void removeAssetLearningStandard( String value ) { 
		removeChild( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD, new String[] { value.toString() } );
	}

	/**
	 *  Gets an <code>AssetLearningStandard</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the AssetLearningStandard object to return by its "Value" attribute value
	 *  @return An <code>AssetLearningStandard</code> object
	 *  @since 2.6
	 */
	public AssetLearningStandard getAssetLearningStandard( String value ) { 
		return (AssetLearningStandard)getChild( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>AssetLearningStandard</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>AssetLearningStandard</code> objects
	 *  @since 2.6
	 */
	public AssetLearningStandard[] getAssetLearningStandards() {
		List<SIFElement> v = getChildList( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD);
		AssetLearningStandard[] cvt = new AssetLearningStandard[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>AssetLearningStandard</code> objects. All existing 
	 * <code>AssetLearningStandard</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>AssetLearningStandards</code>.
	 *
	 *  @since 2.6
	 */
	public void setAssetLearningStandards( AssetLearningStandard[] assetlearningstandards ) {
		setChildren( AssessmentDTD.ASSETLEARNINGSTANDARDS_ASSETLEARNINGSTANDARD, assetlearningstandards );
	}

}
