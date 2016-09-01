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
 *  This object associates learning standards with particular learning resources.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class LearningStandardAssociation extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public LearningStandardAssociation() {
		super( InstrDTD.LEARNINGSTANDARDASSOCIATION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The Id (GUID) that uniquely identifies this LearningStandardAssociation.
	 *  @param learningStandardRefId A RefId that identifies a Learning Standard.
	 *  @param targetObjects List of target objects for the learning standard linkage.
	 *  @param startDate Start date of the learning standard association.
	 *  @param authoritativeSource Body or organization creating this association.
	 *  @param creator Name of the Creator of the relationship.
	 */
	public LearningStandardAssociation( String refId, LearningStandardRefId learningStandardRefId, TargetObjects targetObjects, Calendar startDate, String authoritativeSource, CreatorLearning creator ) {
		super( InstrDTD.LEARNINGSTANDARDASSOCIATION );
		this.setRefId(refId);
		this.setLearningStandardRefId(learningStandardRefId);
		this.setTargetObjects(targetObjects);
		this.setStartDate(startDate);
		this.setAuthoritativeSource(authoritativeSource);
		this.setCreator(creator);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.LEARNINGSTANDARDASSOCIATION_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The Id (GUID) that uniquely identifies this LearningStandardAssociation."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.6
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The Id (GUID) that uniquely identifies this LearningStandardAssociation."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setRefId( String value ) { 
		setFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;RefURI&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A URI that establishes uniqueness."</i><p>
	 *
	 *  @return The <code>RefURI</code> element of this object.
	 *  @since 2.6
	 */
	public String getRefURI() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_REFURI );
	}

	/**
	 *  Sets the value of the <code>&lt;RefURI&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A URI that establishes uniqueness."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setRefURI( String value ) { 
		setFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_REFURI, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;LearningStandardRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A RefId that identifies a Learning Standard."</i><p>
	 *
	 *  @param value A <code>LearningStandardRefId</code> object
	 *  @since 2.6
	 */
	public void setLearningStandardRefId( LearningStandardRefId value ) { 
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_LEARNINGSTANDARDREFID );
		addChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_LEARNINGSTANDARDREFID, value);
	}

	/**
	 *  Sets the value of the <code>&lt;LearningStandardRefId&gt;</code> child element.
	 *  This form of <code>setLearningStandardRefId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setLearningStandardRefId</code>
	 *  that accepts a single <code>LearningStandardRefId</code> object.
	 *
	 *  @param objectType LearningStandardRefId
	 *  @param value Gets or sets the content value of the &lt;LearningStandardRefId&gt; element
	 *  @since 2.6
	 */
	public void setLearningStandardRefId( ObjectType objectType, String value ) {
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_LEARNINGSTANDARDREFID);
		addChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_LEARNINGSTANDARDREFID, new LearningStandardRefId( objectType, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;LearningStandardRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A RefId that identifies a Learning Standard."</i><p>
	 *
	 *  @return A <code>LearningStandardRefId</code> object
	 *  @since 2.6
	 */
	public LearningStandardRefId getLearningStandardRefId() { 
		return (LearningStandardRefId)getChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_LEARNINGSTANDARDREFID);
	}

	/**
	 *  Removes the <code>LearningStandardRefId</code> child element previously created by calling <code>setLearningStandardRefId</code>
	 *
	 *  @since 2.6
	 */
	public void removeLearningStandardRefId() { 
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_LEARNINGSTANDARDREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;TargetObjects&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"List of target objects for the learning standard linkage."</i><p>
	 *
	 *  @param value A <code>TargetObjects</code> object
	 *  @since 2.6
	 */
	public void setTargetObjects( TargetObjects value ) { 
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_TARGETOBJECTS );
		addChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_TARGETOBJECTS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;TargetObjects&gt;</code> child element.
	 *  This form of <code>setTargetObjects</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setTargetObjects</code>
	 *  that accepts a single <code>TargetObjects</code> object.
	 *
	 *  @param targetObject At least one target for the learning standard linkage.
	 *  @param sifRefId The RefId for the LearningResource or AssessmentItem
	 *  @since 2.6
	 */
	public void setTargetObjects( TargetObject targetObject, String sifRefId ) {
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_TARGETOBJECTS);
		addChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_TARGETOBJECTS, new TargetObjects( targetObject, sifRefId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;TargetObjects&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"List of target objects for the learning standard linkage."</i><p>
	 *
	 *  @return A <code>TargetObjects</code> object
	 *  @since 2.6
	 */
	public TargetObjects getTargetObjects() { 
		return (TargetObjects)getChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_TARGETOBJECTS);
	}

	/**
	 *  Removes the <code>TargetObjects</code> child element previously created by calling <code>setTargetObjects</code>
	 *
	 *  @since 2.6
	 */
	public void removeTargetObjects() { 
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_TARGETOBJECTS );
	}

	/**
	 *  Gets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Start date of the learning standard association."</i><p>
	 *
	 *  @return The <code>StartDate</code> element of this object.
	 *  @since 2.6
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Start date of the learning standard association."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.6
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"End date of the learning standard association."</i><p>
	 *
	 *  @return The <code>EndDate</code> element of this object.
	 *  @since 2.6
	 */
	public Calendar getEndDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_ENDDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"End date of the learning standard association."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.6
	 */
	public void setEndDate( Calendar value ) { 
		setFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_ENDDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AuthoritativeSource&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Body or organization creating this association."</i><p>
	 *
	 *  @return The <code>AuthoritativeSource</code> element of this object.
	 *  @since 2.6
	 */
	public String getAuthoritativeSource() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_AUTHORITATIVESOURCE );
	}

	/**
	 *  Sets the value of the <code>&lt;AuthoritativeSource&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Body or organization creating this association."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setAuthoritativeSource( String value ) { 
		setFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_AUTHORITATIVESOURCE, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Creator&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the Creator of the relationship."</i><p>
	 *
	 *  @param value A <code>CreatorLearning</code> object
	 *  @since 2.6
	 */
	public void setCreator( CreatorLearning value ) { 
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATOR );
		addChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATOR, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Creator&gt;</code> child element.
	 *  This form of <code>setCreator</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setCreator</code>
	 *  that accepts a single <code>CreatorLearning</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;CreatorLearning&gt; element
	 *  @since 2.6
	 */
	public void setCreator( String value ) {
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATOR);
		addChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATOR, new CreatorLearning( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Creator&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the Creator of the relationship."</i><p>
	 *
	 *  @return A <code>CreatorLearning</code> object
	 *  @since 2.6
	 */
	public CreatorLearning getCreator() { 
		return (CreatorLearning)getChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATOR);
	}

	/**
	 *  Removes the <code>Creator</code> child element previously created by calling <code>setCreator</code>
	 *
	 *  @since 2.6
	 */
	public void removeCreator() { 
		removeChild( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATOR );
	}

	/**
	 *  Gets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Creation date of the relationship."</i><p>
	 *
	 *  @return The <code>CreationDate</code> element of this object.
	 *  @since 2.6
	 */
	public Calendar getCreationDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Creation date of the relationship."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.6
	 */
	public void setCreationDate( Calendar value ) { 
		setFieldValue( InstrDTD.LEARNINGSTANDARDASSOCIATION_CREATIONDATE, new SIFDate( value ), value );
	}

}