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
 *  This object contains information about account code annual financial totals, summarized by major and/or minor account code breaks.  SIF_Events are not reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class FinancialAnnual extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public FinancialAnnual() {
		super( ADK.getSIFVersion(), HrfinDTD.FINANCIALANNUAL );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId Key
	 *  @param reportDate Date on which snapshot was generated.
	 *  @param stateProvinceId State assigned reporting ID for district or agency
	 *  @param fiscalYear Fiscal year of summary account
	 *  @param annualItems Contains information about the item being summarized.
	 */
	public FinancialAnnual( String refId, Calendar reportDate, String stateProvinceId, Integer fiscalYear, AnnualItems annualItems ) {
		super( ADK.getSIFVersion(), HrfinDTD.FINANCIALANNUAL );
		this.setRefId(refId);
		this.setReportDate(reportDate);
		this.setStateProvinceId(stateProvinceId);
		this.setFiscalYear(fiscalYear);
		this.setAnnualItems(annualItems);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( HrfinDTD.FINANCIALANNUAL_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { HrfinDTD.FINANCIALANNUAL_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Key"</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.7
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALANNUAL_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Key"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.7
	 */
	public void setRefId( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALANNUAL_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ReportDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which snapshot was generated."</i><p>
	 *
	 *  @return The <code>ReportDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getReportDate() { 
		return (Calendar) getSIFSimpleFieldValue( HrfinDTD.FINANCIALANNUAL_REPORTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;ReportDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date on which snapshot was generated."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setReportDate( Calendar value ) { 
		setFieldValue( HrfinDTD.FINANCIALANNUAL_REPORTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"State assigned reporting ID for district or agency"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"StatePrId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"StateProvinceId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>StateProvinceId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getStateProvinceId() { 
		return (String) getSIFSimpleFieldValue( HrfinDTD.FINANCIALANNUAL_STATEPROVINCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"State assigned reporting ID for district or agency"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"StatePrId"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"StateProvinceId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStateProvinceId( String value ) { 
		setFieldValue( HrfinDTD.FINANCIALANNUAL_STATEPROVINCEID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;FiscalYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Fiscal year of summary account"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"FiscalYr"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"FiscalYear"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>FiscalYear</code> element of this object.
	 *  @since 1.5r1
	 */
	public Integer getFiscalYear() { 
		return (Integer) getSIFSimpleFieldValue( HrfinDTD.FINANCIALANNUAL_FISCALYEAR );
	}

	/**
	 *  Sets the value of the <code>&lt;FiscalYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Fiscal year of summary account"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"FiscalYr"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"FiscalYear"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 1.5r1
	 */
	public void setFiscalYear( Integer value ) { 
		setFieldValue( HrfinDTD.FINANCIALANNUAL_FISCALYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;AnnualItems&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains information about the item being summarized."</i><p>
	 *
	 *  @param value A <code>AnnualItems</code> object
	 *  @since 1.5r1
	 */
	public void setAnnualItems( AnnualItems value ) { 
		removeChild( HrfinDTD.FINANCIALANNUAL_ANNUALITEMS );
		addChild( HrfinDTD.FINANCIALANNUAL_ANNUALITEMS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;AnnualItems&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains information about the item being summarized."</i><p>
	 *
	 *  @return An <code>AnnualItems</code> object
	 *  @since 1.5r1
	 */
	public AnnualItems getAnnualItems() { 
		return (AnnualItems)getChild( HrfinDTD.FINANCIALANNUAL_ANNUALITEMS);
	}

	/**
	 *  Removes the <code>AnnualItems</code> child element previously created by calling <code>setAnnualItems</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeAnnualItems() { 
		removeChild( HrfinDTD.FINANCIALANNUAL_ANNUALITEMS );
	}

}