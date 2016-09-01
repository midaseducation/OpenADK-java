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
 *  This object communicates information about a financial account.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FinancialAccount extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FinancialAccount() {
		super( ADK.getSIFVersion(), HrfinDTD.FINANCIALACCOUNT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies this financial account.
	 *  @param accountNumber Account number used for ledger.
	 *  @param name Name of the account.
	 *  @param financialClassRefId Financial class of the account.
	 *  @param creationDate Account creation date.
	 *  @param creationTime Account creation time.
	 */
	public FinancialAccount( String refId, String accountNumber, String name, String financialClassRefId, Calendar creationDate, Calendar creationTime ) {
		super( ADK.getSIFVersion(), HrfinDTD.FINANCIALACCOUNT );
		this.setRefId(refId);
		this.setAccountNumber(accountNumber);
		this.setName(name);
		this.setFinancialClassRefId(financialClassRefId);
		this.setCreationDate(creationDate);
		this.setCreationTime(creationTime);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( HrfinDTD.FINANCIALACCOUNT_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { HrfinDTD.FINANCIALACCOUNT_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this financial account."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this financial account."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AccountNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Account number used for ledger."</i><p>
	 *
	 *  @return The <code>AccountNumber</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getAccountNumber() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_ACCOUNTNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;AccountNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Account number used for ledger."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setAccountNumber( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_ACCOUNTNUMBER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the account."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"FinancialAccountName"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Name"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>Name</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getName() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_NAME );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the account."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"FinancialAccountName"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Name"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setName( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_NAME, new SIFString( value ), value );
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
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_DESCRIPTION );
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
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_DESCRIPTION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FinancialClassRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Financial class of the account."</i><p>
	 *
	 *  @return The <code>FinancialClassRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getFinancialClassRefId() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_FINANCIALCLASSREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;FinancialClassRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Financial class of the account."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setFinancialClassRefId( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_FINANCIALCLASSREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Account creation date."</i><p>
	 *
	 *  @return The <code>CreationDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getCreationDate() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_CREATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Account creation date."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setCreationDate( Calendar value ) { 
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_CREATIONDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;CreationTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Account creation time."</i><p>
	 *
	 *  @return The <code>CreationTime</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getCreationTime() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FINANCIALACCOUNT_CREATIONTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Account creation time."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setCreationTime( Calendar value ) { 
		setFieldValue( HrfinDTD.FINANCIALACCOUNT_CREATIONTIME, new SIFTime( value ), value );
	}

}