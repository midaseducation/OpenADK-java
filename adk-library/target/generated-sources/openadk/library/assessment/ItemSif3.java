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
public class ItemSif3 extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ItemSif3() {
		super( AssessmentDTD.ITEMSIF3 );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param response Answer selected or student work in raw format.
	 */
	public ItemSif3( String response ) {
		super( AssessmentDTD.ITEMSIF3 );
		this.setResponse(response);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.ITEMSIF3_RESPONSE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.ITEMSIF3_RESPONSE };
	}

	/**
	 *  Gets the value of the <code>&lt;Response&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Answer selected or student work in raw format."</i><p>
	 *
	 *  @return The <code>Response</code> element of this object.
	 *  @since 2.6
	 */
	public String getResponse() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_RESPONSE );
	}

	/**
	 *  Sets the value of the <code>&lt;Response&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Answer selected or student work in raw format."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setResponse( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_RESPONSE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ResponseLocation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An optional element that contains a URL pointing to the location of the response or additional
                response.
            "</i><p>
	 *
	 *  @return The <code>ResponseLocation</code> element of this object.
	 *  @since 2.6
	 */
	public String getResponseLocation() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_RESPONSELOCATION );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseLocation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An optional element that contains a URL pointing to the location of the response or additional
                response.
            "</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setResponseLocation( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_RESPONSELOCATION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ResponseCorrectness&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"After the test has been scored, this value will indicate the correctness of the response. This element will be missing if the response has not yet been scored. For open ended items that are scored using a rubric, this value will also likely be missing. These items do not fall nicely into the right/wrong category."</i><p>
	 *
	 *  @return The <code>ResponseCorrectness</code> element of this object.
	 *  @since 2.6
	 */
	public String getResponseCorrectness() { 
		return getFieldValue( AssessmentDTD.ITEMSIF3_RESPONSECORRECTNESS );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseCorrectness&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"After the test has been scored, this value will indicate the correctness of the response. This element will be missing if the response has not yet been scored. For open ended items that are scored using a rubric, this value will also likely be missing. These items do not fall nicely into the right/wrong category."</i><p>
	 *
	 *  @param value A constant defined by the <code>ResponseCorrectness</code> class
	 *  @since 2.6
	 */
	public void setResponseCorrectness( ResponseCorrectness value ) { 
		setField( AssessmentDTD.ITEMSIF3_RESPONSECORRECTNESS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseCorrectness&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"After the test has been scored, this value will indicate the correctness of the response. This element will be missing if the response has not yet been scored. For open ended items that are scored using a rubric, this value will also likely be missing. These items do not fall nicely into the right/wrong category."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setResponseCorrectness( String value ) { 
		setField( AssessmentDTD.ITEMSIF3_RESPONSECORRECTNESS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;ViewStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element will indicate if the item has been viewed or not by the student. Note this value can only be determined for online delivered tests. Paper tests should not use this attribute."</i><p>
	 *
	 *  @return The <code>ViewStatus</code> element of this object.
	 *  @since 2.6
	 */
	public String getViewStatus() { 
		return getFieldValue( AssessmentDTD.ITEMSIF3_VIEWSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;ViewStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element will indicate if the item has been viewed or not by the student. Note this value can only be determined for online delivered tests. Paper tests should not use this attribute."</i><p>
	 *
	 *  @param value A constant defined by the <code>ViewStatus</code> class
	 *  @since 2.6
	 */
	public void setViewStatus( ViewStatus value ) { 
		setField( AssessmentDTD.ITEMSIF3_VIEWSTATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ViewStatus&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element will indicate if the item has been viewed or not by the student. Note this value can only be determined for online delivered tests. Paper tests should not use this attribute."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setViewStatus( String value ) { 
		setField( AssessmentDTD.ITEMSIF3_VIEWSTATUS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;AttemptStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element indicates if the student attempted the item. If a full or partial response is present then the item should be considered attempted. If the student never responded then the item was not attempted. If the item was answered and then later the answer was removed, then it is the rule of the assessment system that would determine if that was considered an attempt. For paper tests, an erasure would also be determined by the rules of the assessment system (assuming gray scanning scale capabilities)."</i><p>
	 *
	 *  @return The <code>AttemptStatus</code> element of this object.
	 *  @since 2.6
	 */
	public String getAttemptStatus() { 
		return getFieldValue( AssessmentDTD.ITEMSIF3_ATTEMPTSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;AttemptStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element indicates if the student attempted the item. If a full or partial response is present then the item should be considered attempted. If the student never responded then the item was not attempted. If the item was answered and then later the answer was removed, then it is the rule of the assessment system that would determine if that was considered an attempt. For paper tests, an erasure would also be determined by the rules of the assessment system (assuming gray scanning scale capabilities)."</i><p>
	 *
	 *  @param value A constant defined by the <code>AttemptStatus</code> class
	 *  @since 2.6
	 */
	public void setAttemptStatus( AttemptStatus value ) { 
		setField( AssessmentDTD.ITEMSIF3_ATTEMPTSTATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AttemptStatus&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element indicates if the student attempted the item. If a full or partial response is present then the item should be considered attempted. If the student never responded then the item was not attempted. If the item was answered and then later the answer was removed, then it is the rule of the assessment system that would determine if that was considered an attempt. For paper tests, an erasure would also be determined by the rules of the assessment system (assuming gray scanning scale capabilities)."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setAttemptStatus( String value ) { 
		setField( AssessmentDTD.ITEMSIF3_ATTEMPTSTATUS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;NumberOfAttempts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The number of times a student changes their answer or attempts a response. For online tests, this would represent each time an item was changed after the original (complete) response was provided and the student navigated away from the item. For paper-based tests, if erasure analysis is performed, this could represent either the number of erasures or be set to 2 if multiple responses are detected."</i><p>
	 *
	 *  @return The <code>NumberOfAttempts</code> element of this object.
	 *  @since 2.6
	 */
	public Integer getNumberOfAttempts() { 
		return (Integer) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_NUMBEROFATTEMPTS );
	}

	/**
	 *  Sets the value of the <code>&lt;NumberOfAttempts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The number of times a student changes their answer or attempts a response. For online tests, this would represent each time an item was changed after the original (complete) response was provided and the student navigated away from the item. For paper-based tests, if erasure analysis is performed, this could represent either the number of erasures or be set to 2 if multiple responses are detected."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.6
	 */
	public void setNumberOfAttempts( Integer value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_NUMBEROFATTEMPTS, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TimeOnItem&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The length of time the student spent viewing or answering this item. Only applies for online tests. If the student viewed the item multiple times, then this would be the accumulated total time spent on the item. As much as is possible, the delivery system should remove inter-item latency or item presentation time."</i><p>
	 *
	 *  @return The <code>TimeOnItem</code> element of this object.
	 *  @since 2.6
	 */
	public javax.xml.datatype.Duration getTimeOnItem() { 
		return (javax.xml.datatype.Duration) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_TIMEONITEM );
	}

	/**
	 *  Sets the value of the <code>&lt;TimeOnItem&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The length of time the student spent viewing or answering this item. Only applies for online tests. If the student viewed the item multiple times, then this would be the accumulated total time spent on the item. As much as is possible, the delivery system should remove inter-item latency or item presentation time."</i><p>
	 *
	 *  @param value A <code>javax.xml.datatype.Duration</code> object
	 *  @since 2.6
	 */
	public void setTimeOnItem( javax.xml.datatype.Duration value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_TIMEONITEM, new SIFDuration( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the sequence of the item as it was delivered to this student. For adaptive testing, this is the sequence in which the item was delivered. This should be the item sequence starting at 1 and continue to the end of the test (spanning all sections). This should include all items such as sample items."</i><p>
	 *
	 *  @return The <code>ItemNumber</code> element of this object.
	 *  @since 2.6
	 */
	public String getItemNumber() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_ITEMNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the sequence of the item as it was delivered to this student. For adaptive testing, this is the sequence in which the item was delivered. This should be the item sequence starting at 1 and continue to the end of the test (spanning all sections). This should include all items such as sample items."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setItemNumber( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_ITEMNUMBER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the item on the assessment by name."</i><p>
	 *
	 *  @return The <code>ItemName</code> element of this object.
	 *  @since 2.6
	 */
	public String getItemName() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_ITEMNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the item on the assessment by name."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setItemName( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_ITEMNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AssessmentRubricRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This identifies the rubric that was used to determine the score that is being recorded for this item response. This is only used for items that are scored using one or more rubrics."</i><p>
	 *
	 *  @return The <code>AssessmentRubricRefId</code> element of this object.
	 *  @since 2.6
	 */
	public String getAssessmentRubricRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_ASSESSMENTRUBRICREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;AssessmentRubricRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This identifies the rubric that was used to determine the score that is being recorded for this item response. This is only used for items that are scored using one or more rubrics."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setAssessmentRubricRefId( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_ASSESSMENTRUBRICREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemScore&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the score the student received on the specific item."</i><p>
	 *
	 *  @return The <code>ItemScore</code> element of this object.
	 *  @since 2.6
	 */
	public String getItemScore() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_ITEMSCORE );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemScore&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the score the student received on the specific item."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setItemScore( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_ITEMSCORE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemScoreCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the score code the student received for the specific item. Generally only applies to open ended items. Values are program specific, but example values might be 'BL = blank', 'OT = off topic', 'FL = foreign language'."</i><p>
	 *
	 *  @return The <code>ItemScoreCode</code> element of this object.
	 *  @since 2.6
	 */
	public String getItemScoreCode() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEMSIF3_ITEMSCORECODE );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemScoreCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the score code the student received for the specific item. Generally only applies to open ended items. Values are program specific, but example values might be 'BL = blank', 'OT = off topic', 'FL = foreign language'."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setItemScoreCode( String value ) { 
		setFieldValue( AssessmentDTD.ITEMSIF3_ITEMSCORECODE, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Comments&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the scoring process provides for comment codes, then this list will contain each comment code provided with the item score."</i><p>
	 *
	 *  @param value A <code>Comments</code> object
	 *  @since 2.6
	 */
	public void setComments( Comments value ) { 
		removeChild( AssessmentDTD.ITEMSIF3_COMMENTS );
		addChild( AssessmentDTD.ITEMSIF3_COMMENTS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Comments&gt;</code> child element.
	 *  This form of <code>setComments</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setComments</code>
	 *  that accepts a single <code>Comments</code> object.
	 *
	 *  @param comment 
	 *  @since 2.6
	 */
	public void setComments( Comment comment ) {
		removeChild( AssessmentDTD.ITEMSIF3_COMMENTS);
		addChild( AssessmentDTD.ITEMSIF3_COMMENTS, new Comments( comment ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Comments&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the scoring process provides for comment codes, then this list will contain each comment code provided with the item score."</i><p>
	 *
	 *  @return A <code>Comments</code> object
	 *  @since 2.6
	 */
	public Comments getComments() { 
		return (Comments)getChild( AssessmentDTD.ITEMSIF3_COMMENTS);
	}

	/**
	 *  Removes the <code>Comments</code> child element previously created by calling <code>setComments</code>
	 *
	 *  @since 2.6
	 */
	public void removeComments() { 
		removeChild( AssessmentDTD.ITEMSIF3_COMMENTS );
	}

	/**
	 *  Sets the value of the <code>&lt;TraitScores&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the item includes trait scores – typically open ended items – then this list will support one or more trait scores."</i><p>
	 *
	 *  @param value A <code>TraitScores</code> object
	 *  @since 2.6
	 */
	public void setTraitScores( TraitScores value ) { 
		removeChild( AssessmentDTD.ITEMSIF3_TRAITSCORES );
		addChild( AssessmentDTD.ITEMSIF3_TRAITSCORES, value);
	}

	/**
	 *  Sets the value of the <code>&lt;TraitScores&gt;</code> child element.
	 *  This form of <code>setTraitScores</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setTraitScores</code>
	 *  that accepts a single <code>TraitScores</code> object.
	 *
	 *  @param traitScore This is the container for the trait score elements.
	 *  @since 2.6
	 */
	public void setTraitScores( TraitScore traitScore ) {
		removeChild( AssessmentDTD.ITEMSIF3_TRAITSCORES);
		addChild( AssessmentDTD.ITEMSIF3_TRAITSCORES, new TraitScores( traitScore ) );
	}

	/**
	 *  Gets the value of the <code>&lt;TraitScores&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the item includes trait scores – typically open ended items – then this list will support one or more trait scores."</i><p>
	 *
	 *  @return A <code>TraitScores</code> object
	 *  @since 2.6
	 */
	public TraitScores getTraitScores() { 
		return (TraitScores)getChild( AssessmentDTD.ITEMSIF3_TRAITSCORES);
	}

	/**
	 *  Removes the <code>TraitScores</code> child element previously created by calling <code>setTraitScores</code>
	 *
	 *  @since 2.6
	 */
	public void removeTraitScores() { 
		removeChild( AssessmentDTD.ITEMSIF3_TRAITSCORES );
	}

	/**
	 *  Sets the value of the <code>&lt;FeedbackItems&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This list will support providing feedback to the student from multiple sources."</i><p>
	 *
	 *  @param value A <code>FeedbackItems</code> object
	 *  @since 2.6
	 */
	public void setFeedbackItems( FeedbackItems value ) { 
		removeChild( AssessmentDTD.ITEMSIF3_FEEDBACKITEMS );
		addChild( AssessmentDTD.ITEMSIF3_FEEDBACKITEMS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;FeedbackItems&gt;</code> child element.
	 *  This form of <code>setFeedbackItems</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setFeedbackItems</code>
	 *  that accepts a single <code>FeedbackItems</code> object.
	 *
	 *  @param feedbackItem 
	 *  @since 2.6
	 */
	public void setFeedbackItems( FeedbackItem feedbackItem ) {
		removeChild( AssessmentDTD.ITEMSIF3_FEEDBACKITEMS);
		addChild( AssessmentDTD.ITEMSIF3_FEEDBACKITEMS, new FeedbackItems( feedbackItem ) );
	}

	/**
	 *  Gets the value of the <code>&lt;FeedbackItems&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This list will support providing feedback to the student from multiple sources."</i><p>
	 *
	 *  @return A <code>FeedbackItems</code> object
	 *  @since 2.6
	 */
	public FeedbackItems getFeedbackItems() { 
		return (FeedbackItems)getChild( AssessmentDTD.ITEMSIF3_FEEDBACKITEMS);
	}

	/**
	 *  Removes the <code>FeedbackItems</code> child element previously created by calling <code>setFeedbackItems</code>
	 *
	 *  @since 2.6
	 */
	public void removeFeedbackItems() { 
		removeChild( AssessmentDTD.ITEMSIF3_FEEDBACKITEMS );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemAids&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is a list of the assessment item aids that were used (or accessed) by the student to answer the question."</i><p>
	 *
	 *  @param value A <code>ItemAids</code> object
	 *  @since 2.6
	 */
	public void setItemAids( ItemAids value ) { 
		removeChild( AssessmentDTD.ITEMSIF3_ITEMAIDS );
		addChild( AssessmentDTD.ITEMSIF3_ITEMAIDS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ItemAids&gt;</code> child element.
	 *  This form of <code>setItemAids</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setItemAids</code>
	 *  that accepts a single <code>ItemAids</code> object.
	 *
	 *  @param itemAid 
	 *  @since 2.6
	 */
	public void setItemAids( ItemAid itemAid ) {
		removeChild( AssessmentDTD.ITEMSIF3_ITEMAIDS);
		addChild( AssessmentDTD.ITEMSIF3_ITEMAIDS, new ItemAids( itemAid ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemAids&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is a list of the assessment item aids that were used (or accessed) by the student to answer the question."</i><p>
	 *
	 *  @return An <code>ItemAids</code> object
	 *  @since 2.6
	 */
	public ItemAids getItemAids() { 
		return (ItemAids)getChild( AssessmentDTD.ITEMSIF3_ITEMAIDS);
	}

	/**
	 *  Removes the <code>ItemAids</code> child element previously created by calling <code>setItemAids</code>
	 *
	 *  @since 2.6
	 */
	public void removeItemAids() { 
		removeChild( AssessmentDTD.ITEMSIF3_ITEMAIDS );
	}

}