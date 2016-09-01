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
 *  Information identifying the driver.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class BusDriver extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public BusDriver() {
		super( TransDTD.BUSDRIVER );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param status Boarding status of the driver.
	 */
	public BusDriver( StaffBoardingStatus status ) {
		super( TransDTD.BUSDRIVER );
		this.setStatus( status );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( TransDTD.BUSDRIVER_STATUS );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { TransDTD.BUSDRIVER_STATUS };
	}

	/**
	 *  Gets the value of the <code>Status</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Boarding status of the driver."</i><p>
	 *
	 *  @return The <code>Status</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getStatus() { 
		return getFieldValue( TransDTD.BUSDRIVER_STATUS );
	}

	/**
	 *  Sets the value of the <code>Status</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Boarding status of the driver."</i><p>
	 *
	 *  @param value A constant defined by the <code>StaffBoardingStatus</code> class
	 *  @since 1.5r1
	 */
	public void setStatus( StaffBoardingStatus value ) { 
		setField( TransDTD.BUSDRIVER_STATUS, value );
	}

	/**
	 *  Sets the value of the <code>Status</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Boarding status of the driver."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setStatus( String value ) { 
		setField( TransDTD.BUSDRIVER_STATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the driver. Condition is that at least one of this and BusDriver/EmpLink must be included."</i><p>
	 *
	 *  @param value A <code>Name</code> object
	 *  @since 1.5r1
	 */
	public void setName( Name value ) { 
		removeChild( TransDTD.BUSDRIVER_NAME );
		addChild( TransDTD.BUSDRIVER_NAME, value);
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
	 *  @since 1.5r1
	 */
	public void setName( NameType type, String lastName, String firstName ) {
		removeChild( TransDTD.BUSDRIVER_NAME);
		addChild( TransDTD.BUSDRIVER_NAME, new Name( type, lastName, firstName ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the driver. Condition is that at least one of this and BusDriver/EmpLink must be included."</i><p>
	 *
	 *  @return A <code>Name</code> object
	 *  @since 1.5r1
	 */
	public Name getName() { 
		return (Name)getChild( TransDTD.BUSDRIVER_NAME);
	}

	/**
	 *  Removes the <code>Name</code> child element previously created by calling <code>setName</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeName() { 
		removeChild( TransDTD.BUSDRIVER_NAME );
	}

	/**
	 *  Gets the value of the <code>&lt;EmployeePersonalRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The GUID of the driver's EmployeePersonal object. Condition is that at least one of this and BusDriver/Name must be included."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"EmpLink"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"EmployeePersonalRefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>EmployeePersonalRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getEmployeePersonalRefId() { 
		return (String) getSIFSimpleFieldValue( TransDTD.BUSDRIVER_EMPLOYEEPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;EmployeePersonalRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The GUID of the driver's EmployeePersonal object. Condition is that at least one of this and BusDriver/Name must be included."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"EmpLink"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"EmployeePersonalRefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setEmployeePersonalRefId( String value ) { 
		setFieldValue( TransDTD.BUSDRIVER_EMPLOYEEPERSONALREFID, new SIFString( value ), value );
	}

}
