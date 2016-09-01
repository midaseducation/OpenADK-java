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
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class StudentProgramAccommodation extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentProgramAccommodation() {
		super( ProgramsDTD.STUDENTPROGRAMACCOMMODATION );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentParticipationRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to the instance of the StudentParticipation object in which the required test accommodation(s) are specified for the date of the test."</i><p>
	 *
	 *  @return The <code>StudentParticipationRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStudentParticipationRefId() { 
		return (String) getSIFSimpleFieldValue( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_STUDENTPARTICIPATIONREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentParticipationRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Reference to the instance of the StudentParticipation object in which the required test accommodation(s) are specified for the date of the test."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentParticipationRefId( String value ) { 
		setFieldValue( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_STUDENTPARTICIPATIONREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentProgramType&gt;</code> element.
	 *
	 *  @param value A <code>StudentProgramType</code> object
	 *  @since 2.0
	 */
	public void setStudentProgramType( StudentProgramType value ) { 
		removeChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_STUDENTPROGRAMTYPE );
		addChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_STUDENTPROGRAMTYPE, value);
	}

	/**
	 *  Gets the value of the <code>&lt;StudentProgramType&gt;</code> element.
	 *
	 *  @return A <code>StudentProgramType</code> object
	 *  @since 2.0
	 */
	public StudentProgramType getStudentProgramType() { 
		return (StudentProgramType)getChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_STUDENTPROGRAMTYPE);
	}

	/**
	 *  Removes the <code>StudentProgramType</code> child element previously created by calling <code>setStudentProgramType</code>
	 *
	 *  @since 2.0
	 */
	public void removeStudentProgramType() { 
		removeChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_STUDENTPROGRAMTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;Accommodations&gt;</code> element.
	 *
	 *  @param value A <code>Accommodations</code> object
	 *  @since 2.0
	 */
	public void setAccommodations( Accommodations value ) { 
		removeChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_ACCOMMODATIONS );
		addChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_ACCOMMODATIONS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Accommodations&gt;</code> element.
	 *
	 *  @return An <code>Accommodations</code> object
	 *  @since 2.0
	 */
	public Accommodations getAccommodations() { 
		return (Accommodations)getChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_ACCOMMODATIONS);
	}

	/**
	 *  Removes the <code>Accommodations</code> child element previously created by calling <code>setAccommodations</code>
	 *
	 *  @since 2.0
	 */
	public void removeAccommodations() { 
		removeChild( ProgramsDTD.STUDENTPROGRAMACCOMMODATION_ACCOMMODATIONS );
	}

}