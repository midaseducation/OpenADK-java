// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.profdev;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.2
 */
public class ProfessionalDevelopmentRegistration extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public ProfessionalDevelopmentRegistration() {
		super( ADK.getSIFVersion(), ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId 
	 *  @param employeePersonalRefId Who this record affects.
	 *  @param registrationStatus Tracks the status of the user in the professional development activity.
	 */
	public ProfessionalDevelopmentRegistration( String refId, String employeePersonalRefId, RegistrationStatus registrationStatus ) {
		super( ADK.getSIFVersion(), ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION );
		this.setRefId(refId);
		this.setEmployeePersonalRefId(employeePersonalRefId);
		this.setRegistrationStatus( registrationStatus );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.2
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.2
	 */
	public void setRefId( String value ) { 
		setFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>EmployeePersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Who this record affects."</i><p>
	 *
	 *  @return The <code>EmployeePersonalRefId</code> attribute of this object.
	 *  @since 2.2
	 */
	public String getEmployeePersonalRefId() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_EMPLOYEEPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>EmployeePersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Who this record affects."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.2
	 */
	public void setEmployeePersonalRefId( String value ) { 
		setFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_EMPLOYEEPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;RegistrationStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Tracks the status of the user in the professional development activity."</i><p>
	 *
	 *  @return The <code>RegistrationStatus</code> element of this object.
	 *  @since 2.2
	 */
	public String getRegistrationStatus() { 
		return getFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REGISTRATIONSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;RegistrationStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Tracks the status of the user in the professional development activity."</i><p>
	 *
	 *  @param value A constant defined by the <code>RegistrationStatus</code> class
	 *  @since 2.2
	 */
	public void setRegistrationStatus( RegistrationStatus value ) { 
		setField( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REGISTRATIONSTATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;RegistrationStatus&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Tracks the status of the user in the professional development activity."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.2
	 */
	public void setRegistrationStatus( String value ) { 
		setField( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_REGISTRATIONSTATUS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;ProfessionalDevelopmentActivityRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relationship ID for professional development activity."</i><p>
	 *
	 *  @return The <code>ProfessionalDevelopmentActivityRefId</code> element of this object.
	 *  @since 2.2
	 */
	public String getProfessionalDevelopmentActivityRefId() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PROFESSIONALDEVELOPMENTACTIVITYREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;ProfessionalDevelopmentActivityRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relationship ID for professional development activity."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.2
	 */
	public void setProfessionalDevelopmentActivityRefId( String value ) { 
		setFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PROFESSIONALDEVELOPMENTACTIVITYREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ProfessionalDevelopmentProgramRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relationship ID for professional development program."</i><p>
	 *
	 *  @return The <code>ProfessionalDevelopmentProgramRefId</code> element of this object.
	 *  @since 2.2
	 */
	public String getProfessionalDevelopmentProgramRefId() { 
		return (String) getSIFSimpleFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PROFESSIONALDEVELOPMENTPROGRAMREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;ProfessionalDevelopmentProgramRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Relationship ID for professional development program."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.2
	 */
	public void setProfessionalDevelopmentProgramRefId( String value ) { 
		setFieldValue( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PROFESSIONALDEVELOPMENTPROGRAMREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;PaidAmount&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This optional field is used if there is a fee for the professional development activity and for tracking the amount the user paid to participate in the professional development activity."</i><p>
	 *
	 *  @param value A <code>MonetaryAmount</code> object
	 *  @since 2.2
	 */
	public void setPaidAmount( MonetaryAmount value ) { 
		removeChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PAIDAMOUNT );
		addChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PAIDAMOUNT, value);
	}

	/**
	 *  Sets the value of the <code>&lt;PaidAmount&gt;</code> child element.
	 *  This form of <code>setPaidAmount</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setPaidAmount</code>
	 *  that accepts a single <code>MonetaryAmount</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;MonetaryAmount&gt; element
	 *  @since 2.2
	 */
	public void setPaidAmount( BigDecimal value ) {
		removeChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PAIDAMOUNT);
		addChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PAIDAMOUNT, new MonetaryAmount( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;PaidAmount&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This optional field is used if there is a fee for the professional development activity and for tracking the amount the user paid to participate in the professional development activity."</i><p>
	 *
	 *  @return A <code>MonetaryAmount</code> object
	 *  @since 2.2
	 */
	public MonetaryAmount getPaidAmount() { 
		return (MonetaryAmount)getChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PAIDAMOUNT);
	}

	/**
	 *  Removes the <code>PaidAmount</code> child element previously created by calling <code>setPaidAmount</code>
	 *
	 *  @since 2.2
	 */
	public void removePaidAmount() { 
		removeChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_PAIDAMOUNT );
	}

	/**
	 *  Sets the value of the <code>&lt;Stipend&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Optional field for tracking the amount the user is paid to participate in the professional development activity."</i><p>
	 *
	 *  @param value A <code>MonetaryAmount</code> object
	 *  @since 2.2
	 */
	public void setStipend( MonetaryAmount value ) { 
		removeChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_STIPEND );
		addChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_STIPEND, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Stipend&gt;</code> child element.
	 *  This form of <code>setStipend</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStipend</code>
	 *  that accepts a single <code>MonetaryAmount</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;MonetaryAmount&gt; element
	 *  @since 2.2
	 */
	public void setStipend( BigDecimal value ) {
		removeChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_STIPEND);
		addChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_STIPEND, new MonetaryAmount( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Stipend&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Optional field for tracking the amount the user is paid to participate in the professional development activity."</i><p>
	 *
	 *  @return A <code>MonetaryAmount</code> object
	 *  @since 2.2
	 */
	public MonetaryAmount getStipend() { 
		return (MonetaryAmount)getChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_STIPEND);
	}

	/**
	 *  Removes the <code>Stipend</code> child element previously created by calling <code>setStipend</code>
	 *
	 *  @since 2.2
	 */
	public void removeStipend() { 
		removeChild( ProfdevDTD.PROFESSIONALDEVELOPMENTREGISTRATION_STIPEND );
	}

}