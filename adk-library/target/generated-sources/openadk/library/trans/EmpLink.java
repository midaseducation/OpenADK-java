// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.trans;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Attribute carries the GUID of the driver’s EmployeePersonal object.  Condition is that at least one of this and BusDriver/Name must be included.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class EmpLink extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public EmpLink() {
		super( TransDTD.EMPLINK );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param employeePersonalRefId GUID
	 */
	public EmpLink( String employeePersonalRefId ) {
		super( TransDTD.EMPLINK );
		this.setEmployeePersonalRefId(employeePersonalRefId);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( TransDTD.EMPLINK_EMPLOYEEPERSONALREFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { TransDTD.EMPLINK_EMPLOYEEPERSONALREFID };
	}

	/**
	 *  Gets the value of the <code>EmployeePersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID"</i><p>
	 *
	 *  @return The <code>EmployeePersonalRefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getEmployeePersonalRefId() { 
		return (String) getSIFSimpleFieldValue( TransDTD.EMPLINK_EMPLOYEEPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>EmployeePersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setEmployeePersonalRefId( String value ) { 
		setFieldValue( TransDTD.EMPLINK_EMPLOYEEPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Returns the value of the <i>EmployeePersonalRefId</i> attribute
	 */
	public String toString() {
		return this.getEmployeePersonalRefId();
	}

}
