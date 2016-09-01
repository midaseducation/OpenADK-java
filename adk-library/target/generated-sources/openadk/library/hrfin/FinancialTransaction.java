// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.hrfin;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  This object communicates a financial transaction. A transaction can be for the daily food sales revenue account.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FinancialTransaction extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FinancialTransaction() {
		super( ADK.getSIFVersion(), HrfinDTD.FINANCIALTRANSACTION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies this financial transaction.
	 *  @param transactionDate Transaction date.
	 *  @param transactionTime Transaction time.
	 *  @param amounts Dollar amount of the transaction.
	 */
	public FinancialTransaction( String refId, Calendar transactionDate, Calendar transactionTime, FTAmounts amounts ) {
		super( ADK.getSIFVersion(), HrfinDTD.FINANCIALTRANSACTION );
		this.setRefId(refId);
		this.setTransactionDate(transactionDate);
		this.setTransactionTime(transactionTime);
		this.setAmounts(amounts);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( HrfinDTD.FINANCIALTRANSACTION_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { HrfinDTD.FINANCIALTRANSACTION_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this financial transaction."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALTRANSACTION_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this financial transaction."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALTRANSACTION_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TransactionDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Transaction date."</i><p>
	 *
	 *  @return The <code>TransactionDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getTransactionDate() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FINANCIALTRANSACTION_TRANSACTIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;TransactionDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Transaction date."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setTransactionDate( Calendar value ) { 
		setFieldValue( HrfinDTD.FINANCIALTRANSACTION_TRANSACTIONDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TransactionTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Transaction time."</i><p>
	 *
	 *  @return The <code>TransactionTime</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getTransactionTime() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FINANCIALTRANSACTION_TRANSACTIONTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;TransactionTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Transaction time."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setTransactionTime( Calendar value ) { 
		setFieldValue( HrfinDTD.FINANCIALTRANSACTION_TRANSACTIONTIME, new SIFTime( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Amounts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Dollar amount of the transaction."</i><p>
	 *
	 *  @param value A <code>FTAmounts</code> object
	 *  @since 1.5r1
	 */
	public void setAmounts( FTAmounts value ) { 
		removeChild( HrfinDTD.FINANCIALTRANSACTION_AMOUNTS );
		addChild( HrfinDTD.FINANCIALTRANSACTION_AMOUNTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Amounts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Dollar amount of the transaction."</i><p>
	 *
	 *  @return A <code>FTAmounts</code> object
	 *  @since 1.5r1
	 */
	public FTAmounts getAmounts() { 
		return (FTAmounts)getChild( HrfinDTD.FINANCIALTRANSACTION_AMOUNTS);
	}

	/**
	 *  Removes the <code>Amounts</code> child element previously created by calling <code>setAmounts</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeAmounts() { 
		removeChild( HrfinDTD.FINANCIALTRANSACTION_AMOUNTS );
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"See 5.1.23 Program."</i><p>
	 *
	 *  @param value A <code>Program</code> object
	 *  @since 1.5r1
	 */
	public void setProgram( Program value ) { 
		removeChild( HrfinDTD.FINANCIALTRANSACTION_PROGRAM );
		addChild( HrfinDTD.FINANCIALTRANSACTION_PROGRAM, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Program&gt;</code> child element.
	 *  This form of <code>setProgram</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setProgram</code>
	 *  that accepts a single <code>Program</code> object.
	 *
	 *  @param type The type of the program. Type identifies the list of values.
	 *  @param value Gets or sets the content value of the &lt;Program&gt; element
	 *  @since 1.5r1
	 */
	public void setProgram( FinancialProgram type, String value ) {
		removeChild( HrfinDTD.FINANCIALTRANSACTION_PROGRAM);
		addChild( HrfinDTD.FINANCIALTRANSACTION_PROGRAM, new Program( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Program&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"See 5.1.23 Program."</i><p>
	 *
	 *  @return A <code>Program</code> object
	 *  @since 1.5r1
	 */
	public Program getProgram() { 
		return (Program)getChild( HrfinDTD.FINANCIALTRANSACTION_PROGRAM);
	}

	/**
	 *  Removes the <code>Program</code> child element previously created by calling <code>setProgram</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeProgram() { 
		removeChild( HrfinDTD.FINANCIALTRANSACTION_PROGRAM );
	}

	/**
	 *  Gets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description."</i><p>
	 *
	 *  @return The <code>Description</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getDescription() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALTRANSACTION_DESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setDescription( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALTRANSACTION_DESCRIPTION, new SIFString( value ), value );
	}

}
