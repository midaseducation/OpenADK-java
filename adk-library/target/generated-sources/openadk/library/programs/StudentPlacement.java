// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  This object contains information specific to support programs in which students have been placed.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class StudentPlacement extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentPlacement() {
		super( ADK.getSIFVersion(), ProgramsDTD.STUDENTPLACEMENT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId This is the unique identification code
	 *  @param studentParticipationRefId This is the reference code for student eligibility for participation
	 *  @param studentPersonalRefId The GUID of the student that this object is linked to.
	 *  @param service Specialized instruction or related service provided to this student.
	 */
	public StudentPlacement( String refId, String studentParticipationRefId, String studentPersonalRefId, Service service ) {
		super( ADK.getSIFVersion(), ProgramsDTD.STUDENTPLACEMENT );
		this.setRefId(refId);
		this.setStudentParticipationRefId(studentParticipationRefId);
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setService(service);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( ProgramsDTD.STUDENTPLACEMENT_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { ProgramsDTD.STUDENTPLACEMENT_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the unique identification code"</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the unique identification code"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentParticipationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the reference code for student eligibility for participation"</i><p>
	 *
	 *  @return The <code>StudentParticipationRefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getStudentParticipationRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_STUDENTPARTICIPATIONREFID );
	}

	/**
	 *  Sets the value of the <code>StudentParticipationRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the reference code for student eligibility for participation"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStudentParticipationRefId( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_STUDENTPARTICIPATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the student that this object is linked to."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The GUID of the student that this object is linked to."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Service&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Specialized instruction or related service provided to this student."</i><p>
	 *
	 *  @param value A <code>Service</code> object
	 *  @since 1.5r1
	 */
	public void setService( Service value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICE );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Service&gt;</code> child element.
	 *  This form of <code>setService</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setService</code>
	 *  that accepts a single <code>Service</code> object.
	 *
	 *  @param code Specialized instruction or related / transitional service provided to this student.
	 *  @param codeType (SIF 1.5r1 Only) Values: "NCES","StateDOE","Local","Text"
	 *  @param type InstructionalService, RelatedService, Other
	 *  @since 1.5r1
	 */
	public void setService( ServiceCode code, String codeType, String type ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICE);
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICE, new Service( code, codeType, type ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Service&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Specialized instruction or related service provided to this student."</i><p>
	 *
	 *  @return A <code>Service</code> object
	 *  @since 1.5r1
	 */
	public Service getService() { 
		return (Service)getChild( ProgramsDTD.STUDENTPLACEMENT_SERVICE);
	}

	/**
	 *  Removes the <code>Service</code> child element previously created by calling <code>setService</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeService() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICE );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentPlacementAsOfDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Effective date (NOT the entry date) of this StudentParticipation instance for the identified student and program.   
      It is intended that each time the contents of this instance of the object changes, it will be published with a new RefId."</i><p>
	 *
	 *  @return The <code>StudentPlacementAsOfDate</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getStudentPlacementAsOfDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_STUDENTPLACEMENTASOFDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentPlacementAsOfDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Effective date (NOT the entry date) of this StudentParticipation instance for the identified student and program.   
      It is intended that each time the contents of this instance of the object changes, it will be published with a new RefId."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setStudentPlacementAsOfDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_STUDENTPLACEMENTASOFDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ServiceProviderAgency&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Service provider title (such as Physical Therapist or Psychologist), agency (such as Clinic), or local code (ID number of clinic)."</i><p>
	 *
	 *  @return The <code>ServiceProviderAgency</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getServiceProviderAgency() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERAGENCY );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceProviderAgency&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Service provider title (such as Physical Therapist or Psychologist), agency (such as Clinic), or local code (ID number of clinic)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setServiceProviderAgency( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERAGENCY, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ServiceProviderName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the person who delivers the service."</i><p>
	 *
	 *  @return The <code>ServiceProviderName</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getServiceProviderName() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERNAME );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceProviderName&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the person who delivers the service."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setServiceProviderName( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ServiceCategory&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Category of service (for example, whether it is instruction or a related / transitional service or a supplemental service).  Typically designated by a state."</i><p>
	 *
	 *  @return The <code>ServiceCategory</code> element of this object.
	 *  @since 2.0
	 */
	public String getServiceCategory() { 
		return getFieldValue( ProgramsDTD.STUDENTPLACEMENT_SERVICECATEGORY );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceCategory&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Category of service (for example, whether it is instruction or a related / transitional service or a supplemental service).  Typically designated by a state."</i><p>
	 *
	 *  @param value A constant defined by the <code>ServiceCategory</code> class
	 *  @since 2.0
	 */
	public void setServiceCategory( ServiceCategory value ) { 
		setField( ProgramsDTD.STUDENTPLACEMENT_SERVICECATEGORY, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceCategory&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Category of service (for example, whether it is instruction or a related / transitional service or a supplemental service).  Typically designated by a state."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.0
	 */
	public void setServiceCategory( String value ) { 
		setField( ProgramsDTD.STUDENTPLACEMENT_SERVICECATEGORY, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceSetting&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Location where service is provided (Regular Class, Resource Room, Homebound, Detention Center, etc.)"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ServiceLocation"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"ServiceSetting"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>ServiceSetting</code> object
	 *  @since 1.5r1
	 */
	public void setServiceSetting( ServiceSetting value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICESETTING );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICESETTING, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceSetting&gt;</code> child element.
	 *  This form of <code>setServiceSetting</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setServiceSetting</code>
	 *  that accepts a single <code>ServiceSetting</code> object.
	 *
	 *  @param codeType If CodeType = "NCES" Then use Code set 0307 Service Setting [NCES Handbooks]
	 *  @param code Setting where service is provided (Regular Class, Resource Room, Homebound, Detention Center, etc.).
	 *  @since 1.5r1
	 */
	public void setServiceSetting( String codeType, ServiceSettingCode code ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICESETTING);
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICESETTING, new ServiceSetting( codeType, code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ServiceSetting&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Location where service is provided (Regular Class, Resource Room, Homebound, Detention Center, etc.)"</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ServiceLocation"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"ServiceSetting"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return A <code>ServiceSetting</code> object
	 *  @since 1.5r1
	 */
	public ServiceSetting getServiceSetting() { 
		return (ServiceSetting)getChild( ProgramsDTD.STUDENTPLACEMENT_SERVICESETTING);
	}

	/**
	 *  Removes the <code>ServiceSetting</code> child element previously created by calling <code>setServiceSetting</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeServiceSetting() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICESETTING );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceFundingSources&gt;</code> element.
	 *
	 *  @param value A <code>ServiceFundingSources</code> object
	 *  @since 2.0
	 */
	public void setServiceFundingSources( ServiceFundingSources value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEFUNDINGSOURCES );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEFUNDINGSOURCES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ServiceFundingSources&gt;</code> element.
	 *
	 *  @return A <code>ServiceFundingSources</code> object
	 *  @since 2.0
	 */
	public ServiceFundingSources getServiceFundingSources() { 
		return (ServiceFundingSources)getChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEFUNDINGSOURCES);
	}

	/**
	 *  Removes the <code>ServiceFundingSources</code> child element previously created by calling <code>setServiceFundingSources</code>
	 *
	 *  @since 2.0
	 */
	public void removeServiceFundingSources() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEFUNDINGSOURCES );
	}

	/**
	 *  Gets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Actual date this service began for this student."</i><p>
	 *
	 *  @return The <code>StartDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_STARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;StartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Actual date this service began for this student."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setStartDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_STARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ServicingPublicAgency&gt;</code> element.
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public void setServicingPublicAgency( SIF_RefId value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGPUBLICAGENCY );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGPUBLICAGENCY, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ServicingPublicAgency&gt;</code> child element.
	 *  This form of <code>setServicingPublicAgency</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setServicingPublicAgency</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 2.0
	 */
	public void setServicingPublicAgency( String sifRefObject, String value ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGPUBLICAGENCY);
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGPUBLICAGENCY, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ServicingPublicAgency&gt;</code> element.
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public SIF_RefId getServicingPublicAgency() { 
		return (SIF_RefId)getChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGPUBLICAGENCY);
	}

	/**
	 *  Removes the <code>ServicingPublicAgency</code> child element previously created by calling <code>setServicingPublicAgency</code>
	 *
	 *  @since 2.0
	 */
	public void removeServicingPublicAgency() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGPUBLICAGENCY );
	}

	/**
	 *  Gets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Actual date this service ended for this student."</i><p>
	 *
	 *  @return The <code>EndDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getEndDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_ENDDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;EndDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Actual date this service ended for this student."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setEndDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_ENDDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ServicingSchool&gt;</code> element.
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public void setServicingSchool( SIF_RefId value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGSCHOOL );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGSCHOOL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ServicingSchool&gt;</code> child element.
	 *  This form of <code>setServicingSchool</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setServicingSchool</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 2.0
	 */
	public void setServicingSchool( String sifRefObject, String value ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGSCHOOL);
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGSCHOOL, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ServicingSchool&gt;</code> element.
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public SIF_RefId getServicingSchool() { 
		return (SIF_RefId)getChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGSCHOOL);
	}

	/**
	 *  Removes the <code>ServicingSchool</code> child element previously created by calling <code>setServicingSchool</code>
	 *
	 *  @since 2.0
	 */
	public void removeServicingSchool() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICINGSCHOOL );
	}

	/**
	 *  Sets the value of the <code>&lt;FrequencyTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code or text descriptor of the frequency that the service is provided, such as "once a week", "MWF", or "05" (code representing "every Friday")"</i><p>
	 *
	 *  @param value A <code>FrequencyTime</code> object
	 *  @since 1.5r1
	 */
	public void setFrequencyTime( FrequencyTime value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_FREQUENCYTIME );
		addChild( ProgramsDTD.STUDENTPLACEMENT_FREQUENCYTIME, value);
	}

	/**
	 *  Gets the value of the <code>&lt;FrequencyTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Code or text descriptor of the frequency that the service is provided, such as "once a week", "MWF", or "05" (code representing "every Friday")"</i><p>
	 *
	 *  @return A <code>FrequencyTime</code> object
	 *  @since 1.5r1
	 */
	public FrequencyTime getFrequencyTime() { 
		return (FrequencyTime)getChild( ProgramsDTD.STUDENTPLACEMENT_FREQUENCYTIME);
	}

	/**
	 *  Removes the <code>FrequencyTime</code> child element previously created by calling <code>setFrequencyTime</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeFrequencyTime() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_FREQUENCYTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolWhereServiceDelivered&gt;</code> element.
	 *
	 *  @param value A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public void setSchoolWhereServiceDelivered( SIF_RefId value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SCHOOLWHERESERVICEDELIVERED );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SCHOOLWHERESERVICEDELIVERED, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolWhereServiceDelivered&gt;</code> child element.
	 *  This form of <code>setSchoolWhereServiceDelivered</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSchoolWhereServiceDelivered</code>
	 *  that accepts a single <code>SIF_RefId</code> object.
	 *
	 *  @param sifRefObject 
	 *  @param value Gets or sets the content value of the &lt;SIF_RefId&gt; element
	 *  @since 2.0
	 */
	public void setSchoolWhereServiceDelivered( String sifRefObject, String value ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SCHOOLWHERESERVICEDELIVERED);
		addChild( ProgramsDTD.STUDENTPLACEMENT_SCHOOLWHERESERVICEDELIVERED, new SIF_RefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolWhereServiceDelivered&gt;</code> element.
	 *
	 *  @return A <code>SIF_RefId</code> object
	 *  @since 2.0
	 */
	public SIF_RefId getSchoolWhereServiceDelivered() { 
		return (SIF_RefId)getChild( ProgramsDTD.STUDENTPLACEMENT_SCHOOLWHERESERVICEDELIVERED);
	}

	/**
	 *  Removes the <code>SchoolWhereServiceDelivered</code> child element previously created by calling <code>setSchoolWhereServiceDelivered</code>
	 *
	 *  @since 2.0
	 */
	public void removeSchoolWhereServiceDelivered() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SCHOOLWHERESERVICEDELIVERED );
	}

	/**
	 *  Sets the value of the <code>&lt;DirectTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Number of units of time per session spent directly providing the service to the student."</i><p>
	 *
	 *  @param value A <code>TimeUnit</code> object
	 *  @since 1.5r1
	 */
	public void setDirectTime( TimeUnit value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_DIRECTTIME );
		addChild( ProgramsDTD.STUDENTPLACEMENT_DIRECTTIME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;DirectTime&gt;</code> child element.
	 *  This form of <code>setDirectTime</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setDirectTime</code>
	 *  that accepts a single <code>TimeUnit</code> object.
	 *
	 *  @param unitOfMeasure Identifies unit of measure in which amount of time is expressed.
	 *  @param value Gets or sets the content value of the &lt;TimeUnit&gt; element
	 *  @since 1.5r1
	 */
	public void setDirectTime( DurationUnit unitOfMeasure, BigDecimal value ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_DIRECTTIME);
		addChild( ProgramsDTD.STUDENTPLACEMENT_DIRECTTIME, new TimeUnit( unitOfMeasure, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;DirectTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Number of units of time per session spent directly providing the service to the student."</i><p>
	 *
	 *  @return A <code>TimeUnit</code> object
	 *  @since 1.5r1
	 */
	public TimeUnit getDirectTime() { 
		return (TimeUnit)getChild( ProgramsDTD.STUDENTPLACEMENT_DIRECTTIME);
	}

	/**
	 *  Removes the <code>DirectTime</code> child element previously created by calling <code>setDirectTime</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeDirectTime() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_DIRECTTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;ServiceProviderType&gt;</code> element.
	 *
	 *  @param value A <code>ServiceProviderType</code> object
	 *  @since 2.0
	 */
	public void setServiceProviderType( ServiceProviderType value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERTYPE );
		addChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERTYPE, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ServiceProviderType&gt;</code> element.
	 *
	 *  @return A <code>ServiceProviderType</code> object
	 *  @since 2.0
	 */
	public ServiceProviderType getServiceProviderType() { 
		return (ServiceProviderType)getChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERTYPE);
	}

	/**
	 *  Removes the <code>ServiceProviderType</code> child element previously created by calling <code>setServiceProviderType</code>
	 *
	 *  @since 2.0
	 */
	public void removeServiceProviderType() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_SERVICEPROVIDERTYPE );
	}

	/**
	 *  Gets the value of the <code>&lt;AgencyType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies an agency or clinic that will provide the specified service."</i><p>
	 *
	 *  @return The <code>AgencyType</code> element of this object.
	 *  @since 2.0
	 */
	public String getAgencyType() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_AGENCYTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;AgencyType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identifies an agency or clinic that will provide the specified service."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setAgencyType( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_AGENCYTYPE, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;IndirectTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Number of units of time per session NOT spent directly providing the service to the student but rather spent providing consultation services to someone related to the student (e.g. parent, a general ed teacher, a new service provider, etc.)."</i><p>
	 *
	 *  @param value A <code>TimeUnit</code> object
	 *  @since 1.5r1
	 */
	public void setIndirectTime( TimeUnit value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_INDIRECTTIME );
		addChild( ProgramsDTD.STUDENTPLACEMENT_INDIRECTTIME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;IndirectTime&gt;</code> child element.
	 *  This form of <code>setIndirectTime</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIndirectTime</code>
	 *  that accepts a single <code>TimeUnit</code> object.
	 *
	 *  @param unitOfMeasure Identifies unit of measure in which amount of time is expressed.
	 *  @param value Gets or sets the content value of the &lt;TimeUnit&gt; element
	 *  @since 1.5r1
	 */
	public void setIndirectTime( DurationUnit unitOfMeasure, BigDecimal value ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_INDIRECTTIME);
		addChild( ProgramsDTD.STUDENTPLACEMENT_INDIRECTTIME, new TimeUnit( unitOfMeasure, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;IndirectTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Number of units of time per session NOT spent directly providing the service to the student but rather spent providing consultation services to someone related to the student (e.g. parent, a general ed teacher, a new service provider, etc.)."</i><p>
	 *
	 *  @return A <code>TimeUnit</code> object
	 *  @since 1.5r1
	 */
	public TimeUnit getIndirectTime() { 
		return (TimeUnit)getChild( ProgramsDTD.STUDENTPLACEMENT_INDIRECTTIME);
	}

	/**
	 *  Removes the <code>IndirectTime</code> child element previously created by calling <code>setIndirectTime</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeIndirectTime() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_INDIRECTTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;TotalServiceDuration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total of the direct and indirect time as it relates to the FrequencyTime; e.g., DirectTime 60 + IndirectTime 30 = 90."</i><p>
	 *
	 *  @param value A <code>TimeUnit</code> object
	 *  @since 1.5r1
	 */
	public void setTotalServiceDuration( TimeUnit value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_TOTALSERVICEDURATION );
		addChild( ProgramsDTD.STUDENTPLACEMENT_TOTALSERVICEDURATION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;TotalServiceDuration&gt;</code> child element.
	 *  This form of <code>setTotalServiceDuration</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setTotalServiceDuration</code>
	 *  that accepts a single <code>TimeUnit</code> object.
	 *
	 *  @param unitOfMeasure Identifies unit of measure in which amount of time is expressed.
	 *  @param value Gets or sets the content value of the &lt;TimeUnit&gt; element
	 *  @since 1.5r1
	 */
	public void setTotalServiceDuration( DurationUnit unitOfMeasure, BigDecimal value ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_TOTALSERVICEDURATION);
		addChild( ProgramsDTD.STUDENTPLACEMENT_TOTALSERVICEDURATION, new TimeUnit( unitOfMeasure, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;TotalServiceDuration&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Total of the direct and indirect time as it relates to the FrequencyTime; e.g., DirectTime 60 + IndirectTime 30 = 90."</i><p>
	 *
	 *  @return A <code>TimeUnit</code> object
	 *  @since 1.5r1
	 */
	public TimeUnit getTotalServiceDuration() { 
		return (TimeUnit)getChild( ProgramsDTD.STUDENTPLACEMENT_TOTALSERVICEDURATION);
	}

	/**
	 *  Removes the <code>TotalServiceDuration</code> child element previously created by calling <code>setTotalServiceDuration</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeTotalServiceDuration() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_TOTALSERVICEDURATION );
	}

	/**
	 *  Gets the value of the <code>&lt;SpecialNeedsTransportation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether the student requires transportation to the location of Placement/Service."</i><p>
	 *
	 *  @return The <code>SpecialNeedsTransportation</code> element of this object.
	 *  @since 1.5r1
	 */
	public Boolean getSpecialNeedsTransportation() { 
		return (Boolean) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_SPECIALNEEDSTRANSPORTATION );
	}

	/**
	 *  Sets the value of the <code>&lt;SpecialNeedsTransportation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether the student requires transportation to the location of Placement/Service."</i><p>
	 *
	 *  @param value A <code>Boolean</code> object
	 *  @since 1.5r1
	 */
	public void setSpecialNeedsTransportation( Boolean value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_SPECIALNEEDSTRANSPORTATION, new SIFBoolean( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;WhenServiceProvided&gt;</code> element.
	 *
	 *  @param value A <code>ProgramAvailability</code> object
	 *  @since 2.0
	 */
	public void setWhenServiceProvided( ProgramAvailability value ) { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_WHENSERVICEPROVIDED );
		addChild( ProgramsDTD.STUDENTPLACEMENT_WHENSERVICEPROVIDED, value);
	}

	/**
	 *  Sets the value of the <code>&lt;WhenServiceProvided&gt;</code> child element.
	 *  This form of <code>setWhenServiceProvided</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setWhenServiceProvided</code>
	 *  that accepts a single <code>ProgramAvailability</code> object.
	 *
	 *  @param code Describes the availability of the program.
	 *  @since 2.0
	 */
	public void setWhenServiceProvided( ProgramAvailabilityCode code ) {
		removeChild( ProgramsDTD.STUDENTPLACEMENT_WHENSERVICEPROVIDED);
		addChild( ProgramsDTD.STUDENTPLACEMENT_WHENSERVICEPROVIDED, new ProgramAvailability( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;WhenServiceProvided&gt;</code> element.
	 *
	 *  @return A <code>ProgramAvailability</code> object
	 *  @since 2.0
	 */
	public ProgramAvailability getWhenServiceProvided() { 
		return (ProgramAvailability)getChild( ProgramsDTD.STUDENTPLACEMENT_WHENSERVICEPROVIDED);
	}

	/**
	 *  Removes the <code>WhenServiceProvided</code> child element previously created by calling <code>setWhenServiceProvided</code>
	 *
	 *  @since 2.0
	 */
	public void removeWhenServiceProvided() { 
		removeChild( ProgramsDTD.STUDENTPLACEMENT_WHENSERVICEPROVIDED );
	}

	/**
	 *  Gets the value of the <code>&lt;AssistiveTechnology&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether the student requires assistive technology for this Placement/Service."</i><p>
	 *
	 *  @return The <code>AssistiveTechnology</code> element of this object.
	 *  @since 1.5r1
	 */
	public Boolean getAssistiveTechnology() { 
		return (Boolean) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_ASSISTIVETECHNOLOGY );
	}

	/**
	 *  Sets the value of the <code>&lt;AssistiveTechnology&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether the student requires assistive technology for this Placement/Service."</i><p>
	 *
	 *  @param value A <code>Boolean</code> object
	 *  @since 1.5r1
	 */
	public void setAssistiveTechnology( Boolean value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_ASSISTIVETECHNOLOGY, new SIFBoolean( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;LatestStartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date by which service is supposed to start for this student."</i><p>
	 *
	 *  @return The <code>LatestStartDate</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getLatestStartDate() { 
		return (Calendar) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_LATESTSTARTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;LatestStartDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date by which service is supposed to start for this student."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setLatestStartDate( Calendar value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_LATESTSTARTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;IncludedInSpecialEducationFTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether the direct time for this service is included in the calculation of a student's special education FTE."</i><p>
	 *
	 *  @return The <code>IncludedInSpecialEducationFTE</code> element of this object.
	 *  @since 2.0
	 */
	public Boolean getIncludedInSpecialEducationFTE() { 
		return (Boolean) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_INCLUDEDINSPECIALEDUCATIONFTE );
	}

	/**
	 *  Sets the value of the <code>&lt;IncludedInSpecialEducationFTE&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Indicates whether the direct time for this service is included in the calculation of a student's special education FTE."</i><p>
	 *
	 *  @param value A <code>Boolean</code> object
	 *  @since 2.0
	 */
	public void setIncludedInSpecialEducationFTE( Boolean value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_INCLUDEDINSPECIALEDUCATIONFTE, new SIFBoolean( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;EntryPerson&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identification / name of the person who created the transaction that led to the creation of this instance of the object."</i><p>
	 *
	 *  @return The <code>EntryPerson</code> element of this object.
	 *  @since 2.0
	 */
	public String getEntryPerson() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPLACEMENT_ENTRYPERSON );
	}

	/**
	 *  Sets the value of the <code>&lt;EntryPerson&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Identification / name of the person who created the transaction that led to the creation of this instance of the object."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setEntryPerson( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPLACEMENT_ENTRYPERSON, new SIFString( value ), value );
	}

}
