// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.etranscripts;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.gradebook.*;
import openadk.library.student.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class StudentSchoolRelationship extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentSchoolRelationship() {
		super( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP );
	}

	/**
	 *  Gets the value of the <code>&lt;MembershipType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @return The <code>MembershipType</code> element of this object.
	 *  @since 2.4
	 */
	public String getMembershipType() { 
		return getFieldValue( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_MEMBERSHIPTYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;MembershipType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @param value A constant defined by the <code>MembershipType</code> class
	 *  @since 2.4
	 */
	public void setMembershipType( MembershipType value ) { 
		setField( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_MEMBERSHIPTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;MembershipType&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.4
	 */
	public void setMembershipType( String value ) { 
		setField( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_MEMBERSHIPTYPE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ResidencyStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @param value A <code>ResidencyStatus</code> object
	 *  @since 2.4
	 */
	public void setResidencyStatus( ResidencyStatus value ) { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_RESIDENCYSTATUS );
		addChild( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_RESIDENCYSTATUS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;ResidencyStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @return A <code>ResidencyStatus</code> object
	 *  @since 2.4
	 */
	public ResidencyStatus getResidencyStatus() { 
		return (ResidencyStatus)getChild( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_RESIDENCYSTATUS);
	}

	/**
	 *  Removes the <code>ResidencyStatus</code> child element previously created by calling <code>setResidencyStatus</code>
	 *
	 *  @since 2.4
	 */
	public void removeResidencyStatus() { 
		removeChild( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_RESIDENCYSTATUS );
	}

	/**
	 *  Gets the value of the <code>&lt;NonResidentAttendReason&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @return The <code>NonResidentAttendReason</code> element of this object.
	 *  @since 2.4
	 */
	public String getNonResidentAttendReason() { 
		return getFieldValue( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_NONRESIDENTATTENDREASON );
	}

	/**
	 *  Sets the value of the <code>&lt;NonResidentAttendReason&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @param value A constant defined by the <code>NonResidentAttendRationale</code> class
	 *  @since 2.4
	 */
	public void setNonResidentAttendReason( NonResidentAttendRationale value ) { 
		setField( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_NONRESIDENTATTENDREASON, value );
	}

	/**
	 *  Sets the value of the <code>&lt;NonResidentAttendReason&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The type of this affiliation as it relates to the school identified."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.4
	 */
	public void setNonResidentAttendReason( String value ) { 
		setField( EtranscriptsDTD.STUDENTSCHOOLRELATIONSHIP_NONRESIDENTATTENDREASON, value );
	}

}