// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  An entry for each unique timetable period<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class TimetablePeriod extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public TimetablePeriod() {
		super( StudentDTD.TIMETABLEPERIOD );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param identifier The unique identifier for the timetable period for this school calendar.
	 */
	public TimetablePeriod( String identifier ) {
		super( StudentDTD.TIMETABLEPERIOD );
		this.setIdentifier(identifier);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( StudentDTD.TIMETABLEPERIOD_IDENTIFIER );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.TIMETABLEPERIOD_IDENTIFIER };
	}

	/**
	 *  Gets the value of the <code>&lt;Identifier&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The unique identifier for the timetable period for this school calendar."</i><p>
	 *
	 *  @return The <code>Identifier</code> element of this object.
	 *  @since 2.4
	 */
	public String getIdentifier() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.TIMETABLEPERIOD_IDENTIFIER );
	}

	/**
	 *  Sets the value of the <code>&lt;Identifier&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The unique identifier for the timetable period for this school calendar."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setIdentifier( String value ) { 
		setFieldValue( StudentDTD.TIMETABLEPERIOD_IDENTIFIER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the timetable period."</i><p>
	 *
	 *  @return The <code>Name</code> element of this object.
	 *  @since 2.4
	 */
	public String getName() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.TIMETABLEPERIOD_NAME );
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the timetable period."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setName( String value ) { 
		setFieldValue( StudentDTD.TIMETABLEPERIOD_NAME, new SIFString( value ), value );
	}

}
