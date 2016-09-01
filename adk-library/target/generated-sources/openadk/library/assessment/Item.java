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
 *  @since 2.0
 */
public class Item extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Item() {
		super( AssessmentDTD.ITEM );
	}

	/**
	 *  Gets the value of the <code>&lt;Response&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Answer selected or student work in raw format."</i><p>
	 *
	 *  @return The <code>Response</code> element of this object.
	 *  @since 2.0
	 */
	public String getResponse() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_RESPONSE );
	}

	/**
	 *  Sets the value of the <code>&lt;Response&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Answer selected or student work in raw format."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setResponse( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_RESPONSE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ResponseLocation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An optional element that contains a URL pointing to the location of the response or additional
                response.
            "</i><p>
	 *
	 *  @return The <code>ResponseLocation</code> element of this object.
	 *  @since 2.0
	 */
	public String getResponseLocation() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_RESPONSELOCATION );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseLocation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An optional element that contains a URL pointing to the location of the response or additional
                response.
            "</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setResponseLocation( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_RESPONSELOCATION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ResponseStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Status of the response."</i><p>
	 *
	 *  @return The <code>ResponseStatus</code> element of this object.
	 *  @since 2.0
	 */
	public String getResponseStatus() { 
		return getFieldValue( AssessmentDTD.ITEM_RESPONSESTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Status of the response."</i><p>
	 *
	 *  @param value A constant defined by the <code>ResponseStatus</code> class
	 *  @since 2.0
	 */
	public void setResponseStatus( ResponseStatus value ) { 
		setField( AssessmentDTD.ITEM_RESPONSESTATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseStatus&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Status of the response."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setResponseStatus( String value ) { 
		setField( AssessmentDTD.ITEM_RESPONSESTATUS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;ResponseTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The length of time the student took to respond."</i><p>
	 *
	 *  @return The <code>ResponseTime</code> element of this object.
	 *  @since 2.0
	 */
	public javax.xml.datatype.Duration getResponseTime() { 
		return (javax.xml.datatype.Duration) getSIFSimpleFieldValue( AssessmentDTD.ITEM_RESPONSETIME );
	}

	/**
	 *  Sets the value of the <code>&lt;ResponseTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The length of time the student took to respond."</i><p>
	 *
	 *  @param value A <code>javax.xml.datatype.Duration</code> object
	 *  @since 2.0
	 */
	public void setResponseTime( javax.xml.datatype.Duration value ) { 
		setFieldValue( AssessmentDTD.ITEM_RESPONSETIME, new SIFDuration( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the item on the assessment by number."</i><p>
	 *
	 *  @return The <code>ItemNumber</code> element of this object.
	 *  @since 2.0
	 */
	public String getItemNumber() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_ITEMNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the item on the assessment by number."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setItemNumber( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_ITEMNUMBER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the item on the assessment by name."</i><p>
	 *
	 *  @return The <code>ItemName</code> element of this object.
	 *  @since 2.0
	 */
	public String getItemName() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_ITEMNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies the item on the assessment by name."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setItemName( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_ITEMNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;DiagnosticStatement&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Psychometric purpose or design-related comment about the question."</i><p>
	 *
	 *  @return The <code>DiagnosticStatement</code> element of this object.
	 *  @since 2.0
	 */
	public String getDiagnosticStatement() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_DIAGNOSTICSTATEMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;DiagnosticStatement&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Psychometric purpose or design-related comment about the question."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setDiagnosticStatement( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_DIAGNOSTICSTATEMENT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;NumberOfAttempts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The number of times a student changes their answer or attempts a response."</i><p>
	 *
	 *  @return The <code>NumberOfAttempts</code> element of this object.
	 *  @since 2.0
	 */
	public Integer getNumberOfAttempts() { 
		return (Integer) getSIFSimpleFieldValue( AssessmentDTD.ITEM_NUMBEROFATTEMPTS );
	}

	/**
	 *  Sets the value of the <code>&lt;NumberOfAttempts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The number of times a student changes their answer or attempts a response."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setNumberOfAttempts( Integer value ) { 
		setFieldValue( AssessmentDTD.ITEM_NUMBEROFATTEMPTS, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AssessmentItemRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A GUID that identifies the item object associated with this student result."</i><p>
	 *
	 *  @return The <code>AssessmentItemRefId</code> element of this object.
	 *  @since 2.2
	 */
	public String getAssessmentItemRefId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_ASSESSMENTITEMREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;AssessmentItemRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A GUID that identifies the item object associated with this student result."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.2
	 */
	public void setAssessmentItemRefId( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_ASSESSMENTITEMREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemScore&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the score the student received on the specific item."</i><p>
	 *
	 *  @return The <code>ItemScore</code> element of this object.
	 *  @since 2.4
	 */
	public String getItemScore() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_ITEMSCORE );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemScore&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the score the student received on the specific item."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setItemScore( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_ITEMSCORE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ItemAidSetUsed&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A tool or aid set used while viewing the item"</i><p>
	 *
	 *  @return The <code>ItemAidSetUsed</code> element of this object.
	 *  @since 2.4
	 */
	public String getItemAidSetUsed() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ITEM_ITEMAIDSETUSED );
	}

	/**
	 *  Sets the value of the <code>&lt;ItemAidSetUsed&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A tool or aid set used while viewing the item"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setItemAidSetUsed( String value ) { 
		setFieldValue( AssessmentDTD.ITEM_ITEMAIDSETUSED, new SIFString( value ), value );
	}

}