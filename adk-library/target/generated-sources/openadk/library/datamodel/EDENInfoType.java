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
public class EDENInfoType extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EDENInfoType() {
		super( DatamodelDTD.EDENINFOTYPE );
	}

	/**
	 *  Gets the value of the <code>&lt;FIPSStateCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The two-digit Federal Information Processing Standard (FIPS) Code for the State, District of Columbia, and the possessions and freely associated areas of the United States (e.g. Puerto Rico)."</i><p>
	 *
	 *  @return The <code>FIPSStateCode</code> element of this object.
	 *  @since 2.3
	 */
	public String getFIPSStateCode() { 
		return (String) getSIFSimpleFieldValue( DatamodelDTD.EDENINFOTYPE_FIPSSTATECODE );
	}

	/**
	 *  Sets the value of the <code>&lt;FIPSStateCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The two-digit Federal Information Processing Standard (FIPS) Code for the State, District of Columbia, and the possessions and freely associated areas of the United States (e.g. Puerto Rico)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setFIPSStateCode( String value ) { 
		setFieldValue( DatamodelDTD.EDENINFOTYPE_FIPSSTATECODE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AgencyIdNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A number used in EDEN to uniquely uniquely identify state agencies."</i><p>
	 *
	 *  @return The <code>AgencyIdNumber</code> element of this object.
	 *  @since 2.3
	 */
	public String getAgencyIdNumber() { 
		return (String) getSIFSimpleFieldValue( DatamodelDTD.EDENINFOTYPE_AGENCYIDNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;AgencyIdNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A number used in EDEN to uniquely uniquely identify state agencies."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setAgencyIdNumber( String value ) { 
		setFieldValue( DatamodelDTD.EDENINFOTYPE_AGENCYIDNUMBER, new SIFString( value ), value );
	}

}
