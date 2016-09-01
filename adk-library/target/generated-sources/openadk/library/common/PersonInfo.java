// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  A wrapper element for information that describes a generic person. This element may be used as a basic building block for person-type objects.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class PersonInfo extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public PersonInfo() {
		super( CommonDTD.PERSONINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param name The name of the person. Note: Type attribute value of 04 must be used here.
	 */
	public PersonInfo( Name name ) {
		super( CommonDTD.PERSONINFO );
		this.setName(name);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( CommonDTD.PERSONINFO_NAME );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { CommonDTD.PERSONINFO_NAME };
	}

	/**
	 *  Gets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-assigned identifier for this person. Note: LocalId may be used as a unique person identifier rather than a unique contact identifier. In this case there may be more than one object instance with the same LocalId."</i><p>
	 *
	 *  @return The <code>LocalId</code> element of this object.
	 *  @since 2.4
	 */
	public String getLocalId() { 
		return (String) getSIFSimpleFieldValue( CommonDTD.PERSONINFO_LOCALID );
	}

	/**
	 *  Sets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-assigned identifier for this person. Note: LocalId may be used as a unique person identifier rather than a unique contact identifier. In this case there may be more than one object instance with the same LocalId."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setLocalId( String value ) { 
		setFieldValue( CommonDTD.PERSONINFO_LOCALID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherIdList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Lists all "other" identifiers associated with the person."</i><p>
	 *
	 *  @param value A <code>OtherIdList</code> object
	 *  @since 2.4
	 */
	public void setOtherIdList( OtherIdList value ) { 
		removeChild( CommonDTD.PERSONINFO_OTHERIDLIST );
		addChild( CommonDTD.PERSONINFO_OTHERIDLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherIdList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Lists all "other" identifiers associated with the person."</i><p>
	 *
	 *  @return An <code>OtherIdList</code> object
	 *  @since 2.4
	 */
	public OtherIdList getOtherIdList() { 
		return (OtherIdList)getChild( CommonDTD.PERSONINFO_OTHERIDLIST);
	}

	/**
	 *  Removes the <code>OtherIdList</code> child element previously created by calling <code>setOtherIdList</code>
	 *
	 *  @since 2.4
	 */
	public void removeOtherIdList() { 
		removeChild( CommonDTD.PERSONINFO_OTHERIDLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the person. Note: Type attribute value of 04 must be used here."</i><p>
	 *
	 *  @param value A <code>Name</code> object
	 *  @since 2.4
	 */
	public void setName( Name value ) { 
		removeChild( CommonDTD.PERSONINFO_NAME );
		addChild( CommonDTD.PERSONINFO_NAME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> child element.
	 *  This form of <code>setName</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setName</code>
	 *  that accepts a single <code>Name</code> object.
	 *
	 *  @param type Code that specifies what type of name this is.  If unsure, use 04.
	 *  @param lastName The last name.
	 *  @param firstName The first name.
	 *  @since 2.4
	 */
	public void setName( NameType type, String lastName, String firstName ) {
		removeChild( CommonDTD.PERSONINFO_NAME);
		addChild( CommonDTD.PERSONINFO_NAME, new Name( type, lastName, firstName ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the person. Note: Type attribute value of 04 must be used here."</i><p>
	 *
	 *  @return A <code>Name</code> object
	 *  @since 2.4
	 */
	public Name getName() { 
		return (Name)getChild( CommonDTD.PERSONINFO_NAME);
	}

	/**
	 *  Removes the <code>Name</code> child element previously created by calling <code>setName</code>
	 *
	 *  @since 2.4
	 */
	public void removeName() { 
		removeChild( CommonDTD.PERSONINFO_NAME );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherNames&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Previous, alternate or other names or aliases associated with the person."</i><p>
	 *
	 *  @param value A <code>OtherNames</code> object
	 *  @since 2.4
	 */
	public void setOtherNames( OtherNames value ) { 
		removeChild( CommonDTD.PERSONINFO_OTHERNAMES );
		addChild( CommonDTD.PERSONINFO_OTHERNAMES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherNames&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Previous, alternate or other names or aliases associated with the person."</i><p>
	 *
	 *  @return An <code>OtherNames</code> object
	 *  @since 2.4
	 */
	public OtherNames getOtherNames() { 
		return (OtherNames)getChild( CommonDTD.PERSONINFO_OTHERNAMES);
	}

	/**
	 *  Removes the <code>OtherNames</code> child element previously created by calling <code>setOtherNames</code>
	 *
	 *  @since 2.4
	 */
	public void removeOtherNames() { 
		removeChild( CommonDTD.PERSONINFO_OTHERNAMES );
	}

	/**
	 *  Sets the value of the <code>&lt;Demographics&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element contains information related to person's demographics."</i><p>
	 *
	 *  @param value A <code>Demographics</code> object
	 *  @since 2.4
	 */
	public void setDemographics( Demographics value ) { 
		removeChild( CommonDTD.PERSONINFO_DEMOGRAPHICS );
		addChild( CommonDTD.PERSONINFO_DEMOGRAPHICS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Demographics&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element contains information related to person's demographics."</i><p>
	 *
	 *  @return A <code>Demographics</code> object
	 *  @since 2.4
	 */
	public Demographics getDemographics() { 
		return (Demographics)getChild( CommonDTD.PERSONINFO_DEMOGRAPHICS);
	}

	/**
	 *  Removes the <code>Demographics</code> child element previously created by calling <code>setDemographics</code>
	 *
	 *  @since 2.4
	 */
	public void removeDemographics() { 
		removeChild( CommonDTD.PERSONINFO_DEMOGRAPHICS );
	}

	/**
	 *  Sets the value of the <code>&lt;AddressList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's address(es)."</i><p>
	 *
	 *  @param value A <code>AddressList</code> object
	 *  @since 2.4
	 */
	public void setAddressList( AddressList value ) { 
		removeChild( CommonDTD.PERSONINFO_ADDRESSLIST );
		addChild( CommonDTD.PERSONINFO_ADDRESSLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;AddressList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's address(es)."</i><p>
	 *
	 *  @return An <code>AddressList</code> object
	 *  @since 2.4
	 */
	public AddressList getAddressList() { 
		return (AddressList)getChild( CommonDTD.PERSONINFO_ADDRESSLIST);
	}

	/**
	 *  Removes the <code>AddressList</code> child element previously created by calling <code>setAddressList</code>
	 *
	 *  @since 2.4
	 */
	public void removeAddressList() { 
		removeChild( CommonDTD.PERSONINFO_ADDRESSLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;PhoneNumberList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's phone number(s)."</i><p>
	 *
	 *  @param value A <code>PhoneNumberList</code> object
	 *  @since 2.4
	 */
	public void setPhoneNumberList( PhoneNumberList value ) { 
		removeChild( CommonDTD.PERSONINFO_PHONENUMBERLIST );
		addChild( CommonDTD.PERSONINFO_PHONENUMBERLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;PhoneNumberList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's phone number(s)."</i><p>
	 *
	 *  @return A <code>PhoneNumberList</code> object
	 *  @since 2.4
	 */
	public PhoneNumberList getPhoneNumberList() { 
		return (PhoneNumberList)getChild( CommonDTD.PERSONINFO_PHONENUMBERLIST);
	}

	/**
	 *  Removes the <code>PhoneNumberList</code> child element previously created by calling <code>setPhoneNumberList</code>
	 *
	 *  @since 2.4
	 */
	public void removePhoneNumberList() { 
		removeChild( CommonDTD.PERSONINFO_PHONENUMBERLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;EmailList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's e-mail address(es)."</i><p>
	 *
	 *  @param value A <code>EmailList</code> object
	 *  @since 2.4
	 */
	public void setEmailList( EmailList value ) { 
		removeChild( CommonDTD.PERSONINFO_EMAILLIST );
		addChild( CommonDTD.PERSONINFO_EMAILLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;EmailList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's e-mail address(es)."</i><p>
	 *
	 *  @return An <code>EmailList</code> object
	 *  @since 2.4
	 */
	public EmailList getEmailList() { 
		return (EmailList)getChild( CommonDTD.PERSONINFO_EMAILLIST);
	}

	/**
	 *  Removes the <code>EmailList</code> child element previously created by calling <code>setEmailList</code>
	 *
	 *  @since 2.4
	 */
	public void removeEmailList() { 
		removeChild( CommonDTD.PERSONINFO_EMAILLIST );
	}

}
