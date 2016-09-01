// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.datamodel;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.3
 */
public class SEAContact extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SEAContact() {
		super( DatamodelDTD.SEACONTACT );
	}

	/**
	 *  Gets the value of the <code>&lt;PublishInDirectory&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether or not this SEA contact's information should be published in a directory of SEA information."</i><p>
	 *
	 *  @return The <code>PublishInDirectory</code> element of this object.
	 *  @since 2.3
	 */
	public String getPublishInDirectory() { 
		return getFieldValue( DatamodelDTD.SEACONTACT_PUBLISHINDIRECTORY );
	}

	/**
	 *  Sets the value of the <code>&lt;PublishInDirectory&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether or not this SEA contact's information should be published in a directory of SEA information."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.3
	 */
	public void setPublishInDirectory( YesNo value ) { 
		setField( DatamodelDTD.SEACONTACT_PUBLISHINDIRECTORY, value );
	}

	/**
	 *  Sets the value of the <code>&lt;PublishInDirectory&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether or not this SEA contact's information should be published in a directory of SEA information."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.3
	 */
	public void setPublishInDirectory( String value ) { 
		setField( DatamodelDTD.SEACONTACT_PUBLISHINDIRECTORY, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ContactInfo&gt;</code> element.
	 *
	 *  @param value A <code>ContactInfo</code> object
	 *  @since 2.3
	 */
	public void setContactInfo( ContactInfo value ) { 
		removeChild( DatamodelDTD.SEACONTACT_CONTACTINFO );
		addChild( DatamodelDTD.SEACONTACT_CONTACTINFO, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ContactInfo&gt;</code> child element.
	 *  This form of <code>setContactInfo</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setContactInfo</code>
	 *  that accepts a single <code>ContactInfo</code> object.
	 *
	 *  @param name The name of the contact person.
	 *  @since 2.3
	 */
	public void setContactInfo( Name name ) {
		removeChild( DatamodelDTD.SEACONTACT_CONTACTINFO);
		addChild( DatamodelDTD.SEACONTACT_CONTACTINFO, new ContactInfo( name ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ContactInfo&gt;</code> element.
	 *
	 *  @return A <code>ContactInfo</code> object
	 *  @since 2.3
	 */
	public ContactInfo getContactInfo() { 
		return (ContactInfo)getChild( DatamodelDTD.SEACONTACT_CONTACTINFO);
	}

	/**
	 *  Removes the <code>ContactInfo</code> child element previously created by calling <code>setContactInfo</code>
	 *
	 *  @since 2.3
	 */
	public void removeContactInfo() { 
		removeChild( DatamodelDTD.SEACONTACT_CONTACTINFO );
	}

}