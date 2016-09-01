// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.reporting;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.infra.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Identifies the submitter of the report.This element is conditional depending on the context in which the SIF_ReportObject is used.  It must be present in the ReportInfo element when a SIF_ReportObject is sent to a report authority in a SIF_Event message.  However, its presence is optional in SIF_ReportObject packets delivered to report authorities in SIF_Response messages.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class ReportSubmitterInfo extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ReportSubmitterInfo() {
		super( ReportingDTD.REPORTSUBMITTERINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param submitterName Name of the report submitter.This is a descriptive string that names the entity submitting the SIF_ReportObject to the report authority.  It could be the name of an agency, a district, a school, the SIF_SourceId of the submitting agent, or any other string that a report authority could use to identify the submitter of a report.  This element may be present regardless of the presence of the SifRefIdType and SifRefId elements.  When those elements are used, it is recommended that collector agents reproduce the name of the LEA or school here.
	 */
	public ReportSubmitterInfo( String submitterName ) {
		super( ReportingDTD.REPORTSUBMITTERINFO );
		this.setSubmitterName(submitterName);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERNAME );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERNAME };
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_RefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the submitter is described by another SIF data object such as a SchoolInfo or LEAInfo instance, this element references that object by RefId."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SifEntity"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 1.5r1
	 */
	public void setSIF_RefId( SIF_RefId value ) { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_SIF_REFID );
		addChild( ReportingDTD.REPORTSUBMITTERINFO_SIF_REFID, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_RefId&gt;</code> child element.
	 *  This form of <code>setSIF_RefId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_RefId</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 1.5r1
	 */
	public void setSIF_RefId( String sifRefObject, String value ) {
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_SIF_REFID);
		addChild( ReportingDTD.REPORTSUBMITTERINFO_SIF_REFID, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_RefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the submitter is described by another SIF data object such as a SchoolInfo or LEAInfo instance, this element references that object by RefId."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SifEntity"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 1.5r1
	 */
	public SIF_RefId getSIF_RefId() { 
		return (SIF_RefId)getChild( ReportingDTD.REPORTSUBMITTERINFO_SIF_REFID);
	}

	/**
	 *  Removes the <code>SIF_RefId</code> child element previously created by calling <code>setSIF_RefId</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeSIF_RefId() { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_SIF_REFID );
	}

	/**
	 *  Gets the value of the <code>&lt;SubmitterName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the report submitter.This is a descriptive string that names the entity submitting the SIF_ReportObject to the report authority.  It could be the name of an agency, a district, a school, the SIF_SourceId of the submitting agent, or any other string that a report authority could use to identify the submitter of a report.  This element may be present regardless of the presence of the SifRefIdType and SifRefId elements.  When those elements are used, it is recommended that collector agents reproduce the name of the LEA or school here."</i><p>
	 *
	 *  @return The <code>SubmitterName</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSubmitterName() { 
		return (String) getSIFSimpleFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;SubmitterName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the report submitter.This is a descriptive string that names the entity submitting the SIF_ReportObject to the report authority.  It could be the name of an agency, a district, a school, the SIF_SourceId of the submitting agent, or any other string that a report authority could use to identify the submitter of a report.  This element may be present regardless of the presence of the SifRefIdType and SifRefId elements.  When those elements are used, it is recommended that collector agents reproduce the name of the LEA or school here."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSubmitterName( String value ) { 
		setFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SubmitterDepartment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Department, office, or subdivision of the agency submitting the report."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SubmitterDept"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SubmitterDepartment"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>SubmitterDepartment</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSubmitterDepartment() { 
		return (String) getSIFSimpleFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERDEPARTMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;SubmitterDepartment&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Department, office, or subdivision of the agency submitting the report."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"SubmitterDept"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SubmitterDepartment"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSubmitterDepartment( String value ) { 
		setFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERDEPARTMENT, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ContactInfo&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Information on the contact person in this agency submitting the report.  For a description of this element, see 5.1.3 ContactInfo."</i><p>
	 *
	 *  @param value A <code>ContactInfo</code> object
	 *  @since 1.5r1
	 */
	public void setContactInfo( ContactInfo value ) { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_CONTACTINFO );
		addChild( ReportingDTD.REPORTSUBMITTERINFO_CONTACTINFO, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ContactInfo&gt;</code> child element.
	 *  This form of <code>setContactInfo</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setContactInfo</code>
	 *  that accepts a single <code>ContactInfo</code> object.
	 *
	 *  @param name The name of the contact person.
	 *  @since 1.5r1
	 */
	public void setContactInfo( Name name ) {
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_CONTACTINFO);
		addChild( ReportingDTD.REPORTSUBMITTERINFO_CONTACTINFO, new ContactInfo( name ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ContactInfo&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Information on the contact person in this agency submitting the report.  For a description of this element, see 5.1.3 ContactInfo."</i><p>
	 *
	 *  @return A <code>ContactInfo</code> object
	 *  @since 1.5r1
	 */
	public ContactInfo getContactInfo() { 
		return (ContactInfo)getChild( ReportingDTD.REPORTSUBMITTERINFO_CONTACTINFO);
	}

	/**
	 *  Removes the <code>ContactInfo</code> child element previously created by calling <code>setContactInfo</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeContactInfo() { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_CONTACTINFO );
	}

	/**
	 *  Sets the value of the <code>&lt;Address&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.1 AddressAddress."</i><p>
	 *
	 *  @param value A <code>Address</code> object
	 *  @since 1.5r1
	 */
	public void setAddress( Address value ) { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_ADDRESS );
		addChild( ReportingDTD.REPORTSUBMITTERINFO_ADDRESS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Address&gt;</code> child element.
	 *  This form of <code>setAddress</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAddress</code>
	 *  that accepts a single <code>Address</code> object.
	 *
	 *  @param type Code that defines the location of the address.  Note:  A subset of specific valid values for each instance in a data object may be listed in that object.
	 *  @param street The street part of the address
	 *  @param city The city part of the address.
	 *  @param stateProvince The state or province code.
	 *  @param country The country code.
	 *  @param postalCode The ZIP/postal code.
	 *  @since 1.5r1
	 */
	public void setAddress( AddressType type, Street street, String city, StatePrCode stateProvince, CountryCode country, String postalCode ) {
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_ADDRESS);
		addChild( ReportingDTD.REPORTSUBMITTERINFO_ADDRESS, new Address( type, street, city, stateProvince, country, postalCode ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Address&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.1 AddressAddress."</i><p>
	 *
	 *  @return An <code>Address</code> object
	 *  @since 1.5r1
	 */
	public Address getAddress() { 
		return (Address)getChild( ReportingDTD.REPORTSUBMITTERINFO_ADDRESS);
	}

	/**
	 *  Removes the <code>Address</code> child element previously created by calling <code>setAddress</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeAddress() { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_ADDRESS );
	}

	/**
	 *  Sets the value of the <code>&lt;PhoneNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.22 PhoneNumber."</i><p>
	 *
	 *  @param value A <code>PhoneNumber</code> object
	 *  @since 1.5r1
	 */
	public void setPhoneNumber( PhoneNumber value ) { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_PHONENUMBER );
		addChild( ReportingDTD.REPORTSUBMITTERINFO_PHONENUMBER, value);
	}

	/**
	 *  Sets the value of the <code>&lt;PhoneNumber&gt;</code> child element.
	 *  This form of <code>setPhoneNumber</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setPhoneNumber</code>
	 *  that accepts a single <code>PhoneNumber</code> object.
	 *
	 *  @param type Code that specifies what type of phone number this is.  Note: A subset of valid values may be specified in data objects.
	 *  @param number Phone number.  Acceptable formats:
	 *  @since 1.5r1
	 */
	public void setPhoneNumber( PhoneNumberType type, String number ) {
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_PHONENUMBER);
		addChild( ReportingDTD.REPORTSUBMITTERINFO_PHONENUMBER, new PhoneNumber( type, number ) );
	}

	/**
	 *  Gets the value of the <code>&lt;PhoneNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.22 PhoneNumber."</i><p>
	 *
	 *  @return A <code>PhoneNumber</code> object
	 *  @since 1.5r1
	 */
	public PhoneNumber getPhoneNumber() { 
		return (PhoneNumber)getChild( ReportingDTD.REPORTSUBMITTERINFO_PHONENUMBER);
	}

	/**
	 *  Removes the <code>PhoneNumber</code> child element previously created by calling <code>setPhoneNumber</code>
	 *
	 *  @since 1.5r1
	 */
	public void removePhoneNumber() { 
		removeChild( ReportingDTD.REPORTSUBMITTERINFO_PHONENUMBER );
	}

	/**
	 *  Gets the value of the <code>&lt;SubmitterNotes&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Optional notes for the report authority, such as information about a district's reporting policies and procedures, instructions for contacting the district for technical support, etc."</i><p>
	 *
	 *  @return The <code>SubmitterNotes</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getSubmitterNotes() { 
		return (String) getSIFSimpleFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERNOTES );
	}

	/**
	 *  Sets the value of the <code>&lt;SubmitterNotes&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Optional notes for the report authority, such as information about a district's reporting policies and procedures, instructions for contacting the district for technical support, etc."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSubmitterNotes( String value ) { 
		setFieldValue( ReportingDTD.REPORTSUBMITTERINFO_SUBMITTERNOTES, new SIFString( value ), value );
	}

}