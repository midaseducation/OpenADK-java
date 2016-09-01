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
 *  Contains information about the item being summarized.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class AnnualItem extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AnnualItem() {
		super( HrfinDTD.ANNUALITEM );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param accountType Classification of budgetary account code summary
	 *  @param fundType Is the account a general or special account code designation?
	 *  @param function Function break in account code for summarization.
	 *  @param amount Summarized amount.
	 */
	public AnnualItem( AccountClass accountType, FundType fundType, String function, MonetaryAmount amount ) {
		super( HrfinDTD.ANNUALITEM );
		this.setAccountType( accountType );
		this.setFundType( fundType );
		this.setFunction(function);
		this.setAmount(amount);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( HrfinDTD.ANNUALITEM_ACCOUNTTYPE ) );
		b.append('.');
		b.append( getFieldValue( HrfinDTD.ANNUALITEM_FUNDTYPE ) );
		b.append('.');
		b.append( getFieldValue( HrfinDTD.ANNUALITEM_FUNCTION ) );
		b.append('.');
		b.append( getFieldValue( HrfinDTD.ANNUALITEM_AMOUNT ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { HrfinDTD.ANNUALITEM_ACCOUNTTYPE, HrfinDTD.ANNUALITEM_FUNDTYPE, HrfinDTD.ANNUALITEM_FUNCTION, HrfinDTD.ANNUALITEM_AMOUNT };
	}

	/**
	 *  Gets the value of the <code>&lt;AccountType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Classification of budgetary account code summary"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"AcctType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"AccountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>AccountType</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getAccountType() { 
		return getFieldValue( HrfinDTD.ANNUALITEM_ACCOUNTTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;AccountType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Classification of budgetary account code summary"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"AcctType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"AccountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A constant defined by the <code>AccountClass</code> class
	 *  @since 1.5r1
	 */
	public void setAccountType( AccountClass value ) { 
		setField( HrfinDTD.ANNUALITEM_ACCOUNTTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AccountType&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Classification of budgetary account code summary"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"AcctType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"AccountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setAccountType( String value ) { 
		setField( HrfinDTD.ANNUALITEM_ACCOUNTTYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;FundType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Is the account a general or special account code designation?"</i><p>
	 *
	 *  @return The <code>FundType</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getFundType() { 
		return getFieldValue( HrfinDTD.ANNUALITEM_FUNDTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;FundType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Is the account a general or special account code designation?"</i><p>
	 *
	 *  @param value A constant defined by the <code>FundType</code> class
	 *  @since 1.5r1
	 */
	public void setFundType( FundType value ) { 
		setField( HrfinDTD.ANNUALITEM_FUNDTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;FundType&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Is the account a general or special account code designation?"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setFundType( String value ) { 
		setField( HrfinDTD.ANNUALITEM_FUNDTYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;AccountTypeDetail&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Use AccountTypeDetail when AccountType is “Other”. For instance, when an AccountType=“Other”, and the AccountTypeDetail value is Long Term Asset."</i><p>
	 *
	 *  @return The <code>AccountTypeDetail</code> element of this object.
	 *  @since 2.6
	 */
	public String getAccountTypeDetail() { 
		return getFieldValue( HrfinDTD.ANNUALITEM_ACCOUNTTYPEDETAIL );
	}

	/**
	 *  Sets the value of the <code>&lt;AccountTypeDetail&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Use AccountTypeDetail when AccountType is “Other”. For instance, when an AccountType=“Other”, and the AccountTypeDetail value is Long Term Asset."</i><p>
	 *
	 *  @param value A constant defined by the <code>AccountTypeDetail</code> class
	 *  @since 2.6
	 */
	public void setAccountTypeDetail( AccountTypeDetail value ) { 
		setField( HrfinDTD.ANNUALITEM_ACCOUNTTYPEDETAIL, value );
	}

	/**
	 *  Sets the value of the <code>&lt;AccountTypeDetail&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Use AccountTypeDetail when AccountType is “Other”. For instance, when an AccountType=“Other”, and the AccountTypeDetail value is Long Term Asset."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setAccountTypeDetail( String value ) { 
		setField( HrfinDTD.ANNUALITEM_ACCOUNTTYPEDETAIL, value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"State-assigned ID for the relative area in which the expenditure/revenue was used."</i><p>
	 *
	 *  @return The <code>StateProvinceId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStateProvinceId() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_STATEPROVINCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"State-assigned ID for the relative area in which the expenditure/revenue was used."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStateProvinceId( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_STATEPROVINCEID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ExpenditureArea&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relative area in which the expenditure was used."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ExpArea"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"ExpenditureArea"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>ExpenditureArea</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getExpenditureArea() { 
		return getFieldValue( HrfinDTD.ANNUALITEM_EXPENDITUREAREA );
	}

	/**
	 *  Sets the value of the <code>&lt;ExpenditureArea&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relative area in which the expenditure was used."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ExpArea"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"ExpenditureArea"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A constant defined by the <code>ExpenditureAreaValue</code> class
	 *  @since 1.5r1
	 */
	public void setExpenditureArea( ExpenditureAreaValue value ) { 
		setField( HrfinDTD.ANNUALITEM_EXPENDITUREAREA, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ExpenditureArea&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relative area in which the expenditure was used."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ExpArea"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"ExpenditureArea"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setExpenditureArea( String value ) { 
		setField( HrfinDTD.ANNUALITEM_EXPENDITUREAREA, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Function&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Function break in account code for summarization."</i><p>
	 *
	 *  @return The <code>Function</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getFunction() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_FUNCTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Function&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Function break in account code for summarization."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setFunction( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_FUNCTION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FundClassificationCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A fund is a separate fiscal and accounting entity with a self-balancing set of accounts recording cash and other financial resources, together with all related liabilities and residual equities or balances, or changes therein, e.g. the code for Debt Service Funds, or Capital Projects Funds, or Pension Funds, to name a few examples."</i><p>
	 *
	 *  @return The <code>FundClassificationCode</code> element of this object.
	 *  @since 2.6
	 */
	public String getFundClassificationCode() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_FUNDCLASSIFICATIONCODE );
	}

	/**
	 *  Sets the value of the <code>&lt;FundClassificationCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A fund is a separate fiscal and accounting entity with a self-balancing set of accounts recording cash and other financial resources, together with all related liabilities and residual equities or balances, or changes therein, e.g. the code for Debt Service Funds, or Capital Projects Funds, or Pension Funds, to name a few examples."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setFundClassificationCode( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_FUNDCLASSIFICATIONCODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Object&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Object break in account code for summarization."</i><p>
	 *
	 *  @return The <code>Object</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getObject() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_OBJECT );
	}

	/**
	 *  Sets the value of the <code>&lt;Object&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Object break in account code for summarization."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setObject( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_OBJECT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;InstructionalProgram&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Instructional program break in account code for summarization"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"InstProgram"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"InstructionalProgram"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>InstructionalProgram</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getInstructionalProgram() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_INSTRUCTIONALPROGRAM );
	}

	/**
	 *  Sets the value of the <code>&lt;InstructionalProgram&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Instructional program break in account code for summarization"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"InstProgram"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"InstructionalProgram"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setInstructionalProgram( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_INSTRUCTIONALPROGRAM, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Amount&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Summarized amount."</i><p>
	 *
	 *  @param value A <code>MonetaryAmount</code> object
	 *  @since 1.5r1
	 */
	public void setAmount( MonetaryAmount value ) { 
		removeChild( HrfinDTD.ANNUALITEM_AMOUNT );
		addChild( HrfinDTD.ANNUALITEM_AMOUNT, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Amount&gt;</code> child element.
	 *  This form of <code>setAmount</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAmount</code>
	 *  that accepts a single <code>MonetaryAmount</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;MonetaryAmount&gt; element
	 *  @since 1.5r1
	 */
	public void setAmount( BigDecimal value ) {
		removeChild( HrfinDTD.ANNUALITEM_AMOUNT);
		addChild( HrfinDTD.ANNUALITEM_AMOUNT, new MonetaryAmount( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Amount&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Summarized amount."</i><p>
	 *
	 *  @return A <code>MonetaryAmount</code> object
	 *  @since 1.5r1
	 */
	public MonetaryAmount getAmount() { 
		return (MonetaryAmount)getChild( HrfinDTD.ANNUALITEM_AMOUNT);
	}

	/**
	 *  Removes the <code>Amount</code> child element previously created by calling <code>setAmount</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeAmount() { 
		removeChild( HrfinDTD.ANNUALITEM_AMOUNT );
	}

	/**
	 *  Gets the value of the <code>&lt;SpecialAmountType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"With regard to regional/local education service agencies report of "special" account code information, the account code summarization can be classified as:"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SpecAmtType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SpecialAmountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>SpecialAmountType</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSpecialAmountType() { 
		return getFieldValue( HrfinDTD.ANNUALITEM_SPECIALAMOUNTTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;SpecialAmountType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"With regard to regional/local education service agencies report of "special" account code information, the account code summarization can be classified as:"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SpecAmtType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SpecialAmountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A constant defined by the <code>SpecialAmountType</code> class
	 *  @since 1.5r1
	 */
	public void setSpecialAmountType( SpecialAmountType value ) { 
		setField( HrfinDTD.ANNUALITEM_SPECIALAMOUNTTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;SpecialAmountType&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"With regard to regional/local education service agencies report of "special" account code information, the account code summarization can be classified as:"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SpecAmtType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SpecialAmountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setSpecialAmountType( String value ) { 
		setField( HrfinDTD.ANNUALITEM_SPECIALAMOUNTTYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;GLAmountType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"With regard to an account code grouping classified as a General Ledger account:"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"GLAmtType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"GLAmountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>GLAmountType</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getGLAmountType() { 
		return getFieldValue( HrfinDTD.ANNUALITEM_GLAMOUNTTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;GLAmountType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"With regard to an account code grouping classified as a General Ledger account:"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"GLAmtType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"GLAmountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A constant defined by the <code>GLAmountType</code> class
	 *  @since 1.5r1
	 */
	public void setGLAmountType( GLAmountType value ) { 
		setField( HrfinDTD.ANNUALITEM_GLAMOUNTTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;GLAmountType&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"With regard to an account code grouping classified as a General Ledger account:"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"GLAmtType"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"GLAmountType"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setGLAmountType( String value ) { 
		setField( HrfinDTD.ANNUALITEM_GLAMOUNTTYPE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;InstructionalLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An identifier for the level of instruction provided by the facility or operational unit e.g. Middle, Elementary, Prekindergarten, Charter This has greater granularity than the SIF element ExpenditureArea."</i><p>
	 *
	 *  @return The <code>InstructionalLevel</code> element of this object.
	 *  @since 2.6
	 */
	public String getInstructionalLevel() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_INSTRUCTIONALLEVEL );
	}

	/**
	 *  Sets the value of the <code>&lt;InstructionalLevel&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"An identifier for the level of instruction provided by the facility or operational unit e.g. Middle, Elementary, Prekindergarten, Charter This has greater granularity than the SIF element ExpenditureArea."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setInstructionalLevel( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_INSTRUCTIONALLEVEL, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;OperationalUnit&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The code for a location, building, organization code, facility or site. For example, this code can identify a Charter School or Maintenance Facility."</i><p>
	 *
	 *  @return The <code>OperationalUnit</code> element of this object.
	 *  @since 2.6
	 */
	public String getOperationalUnit() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_OPERATIONALUNIT );
	}

	/**
	 *  Sets the value of the <code>&lt;OperationalUnit&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The code for a location, building, organization code, facility or site. For example, this code can identify a Charter School or Maintenance Facility."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setOperationalUnit( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_OPERATIONALUNIT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ProjectCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code used for project reporting. For instance, according to NCES, this code can be parsed to identify the particular funding source, authority, or expenditure purpose for which a special record or report is required, and to identify particular projects and the fiscal year of the appropriation within that funding source."</i><p>
	 *
	 *  @return The <code>ProjectCode</code> element of this object.
	 *  @since 2.6
	 */
	public String getProjectCode() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_PROJECTCODE );
	}

	/**
	 *  Sets the value of the <code>&lt;ProjectCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code used for project reporting. For instance, according to NCES, this code can be parsed to identify the particular funding source, authority, or expenditure purpose for which a special record or report is required, and to identify particular projects and the fiscal year of the appropriation within that funding source."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setProjectCode( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_PROJECTCODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Source&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Codes used for recording revenue and other receivables by source, e.g. codes for Taxes Levied/Assessed by the School District, Sales and Use Taxes, code for Textbook Sales and Rentals, etc."</i><p>
	 *
	 *  @return The <code>Source</code> element of this object.
	 *  @since 2.6
	 */
	public String getSource() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_SOURCE );
	}

	/**
	 *  Sets the value of the <code>&lt;Source&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Codes used for recording revenue and other receivables by source, e.g. codes for Taxes Levied/Assessed by the School District, Sales and Use Taxes, code for Textbook Sales and Rentals, etc."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSource( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_SOURCE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ChartOfAccountCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Balance Sheet account number used for an Asset, Liability, or Equity (equity also known as Net Asset or Fund Balance), e.g. a code for Cash in Bank, or Interfund Loans Payable, or Unreserved Fund Balance, etc."</i><p>
	 *
	 *  @return The <code>ChartOfAccountCode</code> element of this object.
	 *  @since 2.6
	 */
	public String getChartOfAccountCode() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_CHARTOFACCOUNTCODE );
	}

	/**
	 *  Sets the value of the <code>&lt;ChartOfAccountCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Balance Sheet account number used for an Asset, Liability, or Equity (equity also known as Net Asset or Fund Balance), e.g. a code for Cash in Bank, or Interfund Loans Payable, or Unreserved Fund Balance, etc."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setChartOfAccountCode( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_CHARTOFACCOUNTCODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SubjectMatter&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The actual code that identifies the organization of subject matter and related learning experiences provided for the instruction of students."</i><p>
	 *
	 *  @return The <code>SubjectMatter</code> element of this object.
	 *  @since 2.6
	 */
	public String getSubjectMatter() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_SUBJECTMATTER );
	}

	/**
	 *  Sets the value of the <code>&lt;SubjectMatter&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The actual code that identifies the organization of subject matter and related learning experiences provided for the instruction of students."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setSubjectMatter( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_SUBJECTMATTER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;JobClassification&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code that classifies an expense; a description of the specific group of duties and responsibilities, e.g. Staff Career Development Alternatives. (NCES, National Education Data Model, http://nces.ed.gov/forum/datamodel/eiebrowser/techview.aspx?instance=staffAssignment'amp';attrib=Professional-Educational_Job_Classification)."</i><p>
	 *
	 *  @return The <code>JobClassification</code> element of this object.
	 *  @since 2.6
	 */
	public String getJobClassification() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.ANNUALITEM_JOBCLASSIFICATION );
	}

	/**
	 *  Sets the value of the <code>&lt;JobClassification&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A code that classifies an expense; a description of the specific group of duties and responsibilities, e.g. Staff Career Development Alternatives. (NCES, National Education Data Model, http://nces.ed.gov/forum/datamodel/eiebrowser/techview.aspx?instance=staffAssignment'amp';attrib=Professional-Educational_Job_Classification)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setJobClassification( String value ) { 
		setFieldValue( HrfinDTD.ANNUALITEM_JOBCLASSIFICATION, new SIFString( value ), value );
	}

}