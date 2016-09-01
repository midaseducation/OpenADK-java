// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.infra;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class SIF_EventObject extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_EventObject() {
		super( InfraDTD.SIF_EVENTOBJECT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param objectName This is the name of the object being added, changed or deleted.
	 *  @param action This is the action associated with the object that is being conveyed by this SIF_Event.
	 *  @param value Gets or sets the content value of the &lt;SIF_EventObject&gt; element
	 */
	public SIF_EventObject( String objectName, Action action, String value ) {
		super( InfraDTD.SIF_EVENTOBJECT );
		this.setObjectName(objectName);
		this.setAction( action );
		this.setValue(value);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( InfraDTD.SIF_EVENTOBJECT_OBJECTNAME ) );
		b.append('.');
		b.append( getFieldValue( InfraDTD.SIF_EVENTOBJECT_ACTION ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIF_EVENTOBJECT_OBJECTNAME, InfraDTD.SIF_EVENTOBJECT_ACTION };
	}

	/**
	 *  Gets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SIF_EventObject&gt; element"</i><p>
	 *
	 *  @return The <code>Value</code> element of this object.
	 *  @since 1.1
	 */
	public String getValue() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_EVENTOBJECT );
	}

	/**
	 *  Sets the value of the <code>&lt;Value&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Gets or sets the content value of the &lt;SIF_EventObject&gt; element"</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setValue( String value ) { 
		setFieldValue( InfraDTD.SIF_EVENTOBJECT, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>ObjectName</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the name of the object being added, changed or deleted."</i><p>
	 *
	 *  @return The <code>ObjectName</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getObjectName() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_EVENTOBJECT_OBJECTNAME );
	}

	/**
	 *  Sets the value of the <code>ObjectName</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the name of the object being added, changed or deleted."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setObjectName( String value ) { 
		setFieldValue( InfraDTD.SIF_EVENTOBJECT_OBJECTNAME, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Action</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the action associated with the object that is being conveyed by this SIF_Event."</i><p>
	 *
	 *  @return The <code>Action</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getAction() { 
		return getFieldValue( InfraDTD.SIF_EVENTOBJECT_ACTION );
	}

	/**
	 *  Sets the value of the <code>Action</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the action associated with the object that is being conveyed by this SIF_Event."</i><p>
	 *
	 *  @param value A constant defined by the <code>Action</code> class
	 *  @since 1.1
	 */
	public void setAction( Action value ) { 
		setField( InfraDTD.SIF_EVENTOBJECT_ACTION, value );
	}

	/**
	 *  Sets the value of the <code>Action</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This is the action associated with the object that is being conveyed by this SIF_Event."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setAction( String value ) { 
		setField( InfraDTD.SIF_EVENTOBJECT_ACTION, value );
	}


// BEGIN EXTRA METHODS (/Users/ajbrown/Projects/midas/OpenADK-java/adk-generator/../adk-generator/datadef/core/sif20/SIF_EventObject.txt)

	/**
	 *  Attach a SIFMessagePayload to this EventObject.<p>
	 */
	public void attach( SIFDataObject payload )
	{
		List<SIFElement> children = _childList();
		children.add( payload );
	}
	
	/**
	 *  Detach a SIFMessagePayload from this EventObject.<p>
	 */
  public void detach( SIFDataObject payload )
  {
    if( fChildren != null )
      fChildren.remove( payload );
  }
  

// END EXTRA METHODS

}