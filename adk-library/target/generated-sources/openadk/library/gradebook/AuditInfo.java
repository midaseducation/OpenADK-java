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
public class AuditInfo extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AuditInfo() {
		super( GradebookDTD.AUDITINFO );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationUser&gt;</code> element.
	 *
	 *  @param value A <code>CreationUser</code> object
	 *  @since 2.0
	 */
	public void setCreationUser( CreationUser value ) { 
		removeChild( GradebookDTD.AUDITINFO_CREATIONUSER );
		addChild( GradebookDTD.AUDITINFO_CREATIONUSER, value);
	}

	/**
	 *  Sets the value of the <code>&lt;CreationUser&gt;</code> child element.
	 *  This form of <code>setCreationUser</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setCreationUser</code>
	 *  that accepts a single <code>CreationUser</code> object.
	 *
	 *  @param type The role of the staff member for that created this attendance record.
	 *  @param userId Unique identifier of the user that created the attendance record.  This will depend on the user and the source.  The preferred identifier would be a RefId for a StaffPersonal, StudentContact, or StudentPersonal Object.  However, the user may not be associated with any of these SIF objects.  In that case a unique ID given by the source should be used.
	 *  @since 2.0
	 */
	public void setCreationUser( AuditInfoType type, String userId ) {
		removeChild( GradebookDTD.AUDITINFO_CREATIONUSER);
		addChild( GradebookDTD.AUDITINFO_CREATIONUSER, new CreationUser( type, userId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;CreationUser&gt;</code> element.
	 *
	 *  @return A <code>CreationUser</code> object
	 *  @since 2.0
	 */
	public CreationUser getCreationUser() { 
		return (CreationUser)getChild( GradebookDTD.AUDITINFO_CREATIONUSER);
	}

	/**
	 *  Removes the <code>CreationUser</code> child element previously created by calling <code>setCreationUser</code>
	 *
	 *  @since 2.0
	 */
	public void removeCreationUser() { 
		removeChild( GradebookDTD.AUDITINFO_CREATIONUSER );
	}

	/**
	 *  Gets the value of the <code>&lt;CreationDateTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date and time of this attendance record was created."</i><p>
	 *
	 *  @return The <code>CreationDateTime</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getCreationDateTime() { 
		return (Calendar) getSIFSimpleFieldValue( GradebookDTD.AUDITINFO_CREATIONDATETIME );
	}

	/**
	 *  Sets the value of the <code>&lt;CreationDateTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date and time of this attendance record was created."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setCreationDateTime( Calendar value ) { 
		setFieldValue( GradebookDTD.AUDITINFO_CREATIONDATETIME, new SIFDateTime( value ), value );
	}

}
