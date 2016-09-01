// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.gradebook;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class SectionMarkInfo extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SectionMarkInfo() {
		super( ADK.getSIFVersion(), GradebookDTD.SECTIONMARKINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId Key
	 *  @param sectionInfoRefId The ID (GUID) that uniquely identifies the SectionInfo object that this item refers to.
	 *  @param schoolInfoRefId The ID (GUID) that uniquely identifies the School that these Mark Values apply to.
	 *  @param termMarkLists 
	 */
	public SectionMarkInfo( String refId, String sectionInfoRefId, String schoolInfoRefId, MarkInfoList termMarkLists ) {
		super( ADK.getSIFVersion(), GradebookDTD.SECTIONMARKINFO );
		this.setRefId(refId);
		this.setSectionInfoRefId(sectionInfoRefId);
		this.setSchoolInfoRefId(schoolInfoRefId);
		this.setTermMarkLists( new TermMarkLists( termMarkLists ));
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( GradebookDTD.SECTIONMARKINFO_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { GradebookDTD.SECTIONMARKINFO_REFID };
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
		return (String) getSIFSimpleFieldValue( GradebookDTD.SECTIONMARKINFO_REFID );
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
		setFieldValue( GradebookDTD.SECTIONMARKINFO_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SectionInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies the SectionInfo object that this item refers to."</i><p>
	 *
	 *  @return The <code>SectionInfoRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSectionInfoRefId() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.SECTIONMARKINFO_SECTIONINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SectionInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies the SectionInfo object that this item refers to."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSectionInfoRefId( String value ) { 
		setFieldValue( GradebookDTD.SECTIONMARKINFO_SECTIONINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies the School that these Mark Values apply to."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( GradebookDTD.SECTIONMARKINFO_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The ID (GUID) that uniquely identifies the School that these Mark Values apply to."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( GradebookDTD.SECTIONMARKINFO_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;TermMarkLists&gt;</code> element.
	 *
	 *  @param value A <code>TermMarkLists</code> object
	 *  @since 2.0
	 */
	public void setTermMarkLists( TermMarkLists value ) { 
		removeChild( GradebookDTD.SECTIONMARKINFO_TERMMARKLISTS );
		addChild( GradebookDTD.SECTIONMARKINFO_TERMMARKLISTS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;TermMarkLists&gt;</code> child element.
	 *  This form of <code>setTermMarkLists</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setTermMarkLists</code>
	 *  that accepts a single <code>TermMarkLists</code> object.
	 *
	 *  @param markInfoList 
	 *  @since 2.0
	 */
	public void setTermMarkLists( MarkInfoList markInfoList ) {
		removeChild( GradebookDTD.SECTIONMARKINFO_TERMMARKLISTS);
		addChild( GradebookDTD.SECTIONMARKINFO_TERMMARKLISTS, new TermMarkLists( markInfoList ) );
	}

	/**
	 *  Gets the value of the <code>&lt;TermMarkLists&gt;</code> element.
	 *
	 *  @return A <code>TermMarkLists</code> object
	 *  @since 2.0
	 */
	public TermMarkLists getTermMarkLists() { 
		return (TermMarkLists)getChild( GradebookDTD.SECTIONMARKINFO_TERMMARKLISTS);
	}

	/**
	 *  Removes the <code>TermMarkLists</code> child element previously created by calling <code>setTermMarkLists</code>
	 *
	 *  @since 2.0
	 */
	public void removeTermMarkLists() { 
		removeChild( GradebookDTD.SECTIONMARKINFO_TERMMARKLISTS );
	}

}
