// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

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
public class AssessmentDescriptor extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssessmentDescriptor() {
		super( AssessmentDTD.ASSESSMENTDESCRIPTOR );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param value Gets or sets the content value of the &lt;AssessmentDescriptor&gt; element
	 */
	public AssessmentDescriptor( AssessmentDescriptorType value ) {
		super( AssessmentDTD.ASSESSMENTDESCRIPTOR );
		this.setValue( value );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( AssessmentDTD.ASSESSMENTDESCRIPTOR );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.ASSESSMENTDESCRIPTOR };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;AssessmentDescriptor&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 2.2
	 */
	public String getValue() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTDESCRIPTOR );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;AssessmentDescriptor&gt; element"</i><p>
	 *
	 *  @param value A constant defined by the <code>AssessmentDescriptorType</code> class
	 *  @since 2.2
	 */
	public void setValue( AssessmentDescriptorType value ) { 
		setField( AssessmentDTD.ASSESSMENTDESCRIPTOR, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;AssessmentDescriptor&gt; element"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.2
	 */
	public void setValue( String value ) { 
		setField( AssessmentDTD.ASSESSMENTDESCRIPTOR, value );
	}

}
