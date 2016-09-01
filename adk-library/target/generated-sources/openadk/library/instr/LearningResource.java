// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  This object contains information related to learning resources that may be used in educational settings. These include textbooks, Internet content, educational software, videos and DVDs, supplemental print material, etc.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class LearningResource extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public LearningResource() {
		super( ADK.getSIFVersion(), InstrDTD.LEARNINGRESOURCE );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID assigned to this LearningResource.
	 *  @param language 
	 *  @param name Name of learning resource.
	 *  @param components A lesson or activity-sized portion of a resource.
	 */
	public LearningResource( String refId, LanguageCode language, String name, Components components ) {
		super( ADK.getSIFVersion(), InstrDTD.LEARNINGRESOURCE );
		this.setRefId(refId);
		this.setLanguage( language );
		this.setName(name);
		this.setComponents(components);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.LEARNINGRESOURCE_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.LEARNINGRESOURCE_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID assigned to this LearningResource."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID assigned to this LearningResource."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Language</code> attribute.
	 *
	 *  @return The <code>Language</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getLanguage() { 
		return getFieldValue( InstrDTD.LEARNINGRESOURCE_LANGUAGE );
	}

	/**
	 *  Sets the value of the <code>Language</code> attribute.
	 *
	 *  @param value A constant defined by the <code>LanguageCode</code> class
	 *  @since 1.5r1
	 */
	public void setLanguage( LanguageCode value ) { 
		setField( InstrDTD.LEARNINGRESOURCE_LANGUAGE, value );
	}

	/**
	 *  Sets the value of the <code>Language</code> attribute as a String.
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setLanguage( String value ) { 
		setField( InstrDTD.LEARNINGRESOURCE_LANGUAGE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of learning resource."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceName"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Name"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>Name</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getName() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_NAME );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of learning resource."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceName"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Name"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setName( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_NAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Author&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of organization or company that created the resource."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceAuthor"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Author"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>Author</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getAuthor() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_AUTHOR );
	}

	/**
	 *  Sets the value of the <code>&lt;Author&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of organization or company that created the resource."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceAuthor"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Author"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setAuthor( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_AUTHOR, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Contacts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains contact information about resource authors."</i><p>
	 *
	 *  @param value A <code>Contacts</code> object
	 *  @since 1.5r1
	 */
	public void setContacts( Contacts value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_CONTACTS );
		addChild( InstrDTD.LEARNINGRESOURCE_CONTACTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Contacts&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains contact information about resource authors."</i><p>
	 *
	 *  @return A <code>Contacts</code> object
	 *  @since 1.5r1
	 */
	public Contacts getContacts() { 
		return (Contacts)getChild( InstrDTD.LEARNINGRESOURCE_CONTACTS);
	}

	/**
	 *  Removes the <code>Contacts</code> child element previously created by calling <code>setContacts</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeContacts() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_CONTACTS );
	}

	/**
	 *  Sets the value of the <code>&lt;Location&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of location of resource, i.e. location in library or URL, community resource, outside resource supplier."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceLocation"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Location"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>ResourceLocation</code> object
	 *  @since 1.5r1
	 */
	public void setLocation( ResourceLocation value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_LOCATION );
		addChild( InstrDTD.LEARNINGRESOURCE_LOCATION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Location&gt;</code> child element.
	 *  This form of <code>setLocation</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setLocation</code>
	 *  that accepts a single <code>ResourceLocation</code> object.
	 *
	 *  @param referenceType A qualifying attribute for the ResourceLocation payload. If ReferenceType is "URI", the payload contains a web address where the resource can be found.
	 *  @param value Gets or sets the content value of the &lt;ResourceLocation&gt; element
	 *  @since 1.5r1
	 */
	public void setLocation( ReferenceType referenceType, String value ) {
		removeChild( InstrDTD.LEARNINGRESOURCE_LOCATION);
		addChild( InstrDTD.LEARNINGRESOURCE_LOCATION, new ResourceLocation( referenceType, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Location&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of location of resource, i.e. location in library or URL, community resource, outside resource supplier."</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceLocation"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Location"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return A <code>ResourceLocation</code> object
	 *  @since 1.5r1
	 */
	public ResourceLocation getLocation() { 
		return (ResourceLocation)getChild( InstrDTD.LEARNINGRESOURCE_LOCATION);
	}

	/**
	 *  Removes the <code>Location</code> child element previously created by calling <code>setLocation</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeLocation() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_LOCATION );
	}

	/**
	 *  Gets the value of the <code>&lt;Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Describes availability status of resource, e.g. "checked out.""</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceStatus"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Status"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>Status</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getStatus() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_STATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Describes availability status of resource, e.g. "checked out.""</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceStatus"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Status"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setStatus( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_STATUS, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the resource, e.g., "This textbook is intended for grade 4 social studies students and addresses...""</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceDescription"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Description"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>Description</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getDescription() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_DESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;Description&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the resource, e.g., "This textbook is intended for grade 4 social studies students and addresses...""</i><p>
	 *  This element is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering elements of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"ResourceDescription"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"Description"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setDescription( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_DESCRIPTION, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;GradeLevels&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.12 GradeLevels."</i><p>
	 *
	 *  @param value A <code>GradeLevels</code> object
	 *  @since 1.5r1
	 */
	public void setGradeLevels( GradeLevels value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_GRADELEVELS );
		addChild( InstrDTD.LEARNINGRESOURCE_GRADELEVELS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;GradeLevels&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.12 GradeLevels."</i><p>
	 *
	 *  @return A <code>GradeLevels</code> object
	 *  @since 1.5r1
	 */
	public GradeLevels getGradeLevels() { 
		return (GradeLevels)getChild( InstrDTD.LEARNINGRESOURCE_GRADELEVELS);
	}

	/**
	 *  Removes the <code>GradeLevels</code> child element previously created by calling <code>setGradeLevels</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeGradeLevels() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_GRADELEVELS );
	}

	/**
	 *  Sets the value of the <code>&lt;SubjectAreas&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.30 SubjectArea."</i><p>
	 *
	 *  @param value A <code>SubjectAreas</code> object
	 *  @since 1.5r1
	 */
	public void setSubjectAreas( SubjectAreas value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_SUBJECTAREAS );
		addChild( InstrDTD.LEARNINGRESOURCE_SUBJECTAREAS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SubjectAreas&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"For a description of this element, see 5.1.30 SubjectArea."</i><p>
	 *
	 *  @return A <code>SubjectAreas</code> object
	 *  @since 1.5r1
	 */
	public SubjectAreas getSubjectAreas() { 
		return (SubjectAreas)getChild( InstrDTD.LEARNINGRESOURCE_SUBJECTAREAS);
	}

	/**
	 *  Removes the <code>SubjectAreas</code> child element previously created by calling <code>setSubjectAreas</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeSubjectAreas() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_SUBJECTAREAS );
	}

	/**
	 *  Sets the value of the <code>&lt;MediaTypes&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"MIME types [MIME] based on IANA registration (see RFC2048) or 'non-digital'."</i><p>
	 *
	 *  @param value A <code>MediaTypes</code> object
	 *  @since 1.5r1
	 */
	public void setMediaTypes( MediaTypes value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_MEDIATYPES );
		addChild( InstrDTD.LEARNINGRESOURCE_MEDIATYPES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;MediaTypes&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"MIME types [MIME] based on IANA registration (see RFC2048) or 'non-digital'."</i><p>
	 *
	 *  @return A <code>MediaTypes</code> object
	 *  @since 1.5r1
	 */
	public MediaTypes getMediaTypes() { 
		return (MediaTypes)getChild( InstrDTD.LEARNINGRESOURCE_MEDIATYPES);
	}

	/**
	 *  Removes the <code>MediaTypes</code> child element previously created by calling <code>setMediaTypes</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeMediaTypes() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_MEDIATYPES );
	}

	/**
	 *  Gets the value of the <code>&lt;UseAgreement&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Describes terms of use for resource."</i><p>
	 *
	 *  @return The <code>UseAgreement</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getUseAgreement() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_USEAGREEMENT );
	}

	/**
	 *  Sets the value of the <code>&lt;UseAgreement&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Describes terms of use for resource."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setUseAgreement( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_USEAGREEMENT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;AgreementDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A date that defines the date of agreement."</i><p>
	 *
	 *  @return The <code>AgreementDate</code> element of this object.
	 *  @since 1.5r1
	 */
	public Calendar getAgreementDate() { 
		return (Calendar) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_AGREEMENTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;AgreementDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A date that defines the date of agreement."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 1.5r1
	 */
	public void setAgreementDate( Calendar value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_AGREEMENTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Approvals&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A sub-element containing authorizations to use this resource.  For example, this resource may be included as part of the district's standard curriculum model."</i><p>
	 *
	 *  @param value A <code>Approvals</code> object
	 *  @since 1.5r1
	 */
	public void setApprovals( Approvals value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_APPROVALS );
		addChild( InstrDTD.LEARNINGRESOURCE_APPROVALS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Approvals&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A sub-element containing authorizations to use this resource.  For example, this resource may be included as part of the district's standard curriculum model."</i><p>
	 *
	 *  @return An <code>Approvals</code> object
	 *  @since 1.5r1
	 */
	public Approvals getApprovals() { 
		return (Approvals)getChild( InstrDTD.LEARNINGRESOURCE_APPROVALS);
	}

	/**
	 *  Removes the <code>Approvals</code> child element previously created by calling <code>setApprovals</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeApprovals() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_APPROVALS );
	}

	/**
	 *  Sets the value of the <code>&lt;Evaluations&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Evaluations/reviews of resource."</i><p>
	 *
	 *  @param value A <code>ResourceEvaluations</code> object
	 *  @since 1.5r1
	 */
	public void setEvaluations( ResourceEvaluations value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_EVALUATIONS );
		addChild( InstrDTD.LEARNINGRESOURCE_EVALUATIONS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Evaluations&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Evaluations/reviews of resource."</i><p>
	 *
	 *  @return A <code>ResourceEvaluations</code> object
	 *  @since 1.5r1
	 */
	public ResourceEvaluations getEvaluations() { 
		return (ResourceEvaluations)getChild( InstrDTD.LEARNINGRESOURCE_EVALUATIONS);
	}

	/**
	 *  Removes the <code>Evaluations</code> child element previously created by calling <code>setEvaluations</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeEvaluations() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_EVALUATIONS );
	}

	/**
	 *  Sets the value of the <code>&lt;Components&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A lesson or activity-sized portion of a resource."</i><p>
	 *
	 *  @param value A <code>Components</code> object
	 *  @since 1.5r1
	 */
	public void setComponents( Components value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_COMPONENTS );
		addChild( InstrDTD.LEARNINGRESOURCE_COMPONENTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Components&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A lesson or activity-sized portion of a resource."</i><p>
	 *
	 *  @return A <code>Components</code> object
	 *  @since 1.5r1
	 */
	public Components getComponents() { 
		return (Components)getChild( InstrDTD.LEARNINGRESOURCE_COMPONENTS);
	}

	/**
	 *  Removes the <code>Components</code> child element previously created by calling <code>setComponents</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeComponents() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_COMPONENTS );
	}

	/**
	 *  Sets the value of the <code>&lt;LearningStandards&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to a LearningStandardItem."</i><p>
	 *
	 *  @param value A <code>LearningStandards</code> object
	 *  @since 1.5r1
	 */
	public void setLearningStandards( LearningStandards value ) { 
		removeChild( InstrDTD.LEARNINGRESOURCE_LEARNINGSTANDARDS );
		addChild( InstrDTD.LEARNINGRESOURCE_LEARNINGSTANDARDS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;LearningStandards&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to a LearningStandardItem."</i><p>
	 *
	 *  @return A <code>LearningStandards</code> object
	 *  @since 1.5r1
	 */
	public LearningStandards getLearningStandards() { 
		return (LearningStandards)getChild( InstrDTD.LEARNINGRESOURCE_LEARNINGSTANDARDS);
	}

	/**
	 *  Removes the <code>LearningStandards</code> child element previously created by calling <code>setLearningStandards</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeLearningStandards() { 
		removeChild( InstrDTD.LEARNINGRESOURCE_LEARNINGSTANDARDS );
	}

	/**
	 *  Gets the value of the <code>&lt;LearningResourcePackageRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to a LearningResourcePackage, a transport envelope for teaching and learning object files."</i><p>
	 *
	 *  @return The <code>LearningResourcePackageRefId</code> element of this object.
	 *  @since 2.1
	 */
	public String getLearningResourcePackageRefId() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.LEARNINGRESOURCE_LEARNINGRESOURCEPACKAGEREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;LearningResourcePackageRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to a LearningResourcePackage, a transport envelope for teaching and learning object files."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.1
	 */
	public void setLearningResourcePackageRefId( String value ) { 
		setFieldValue( InstrDTD.LEARNINGRESOURCE_LEARNINGRESOURCEPACKAGEREFID, new SIFString( value ), value );
	}

}
