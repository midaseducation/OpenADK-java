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
 *  @since 2.6
 */
public class TraitScore extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public TraitScore() {
		super( AssessmentDTD.TRAITSCORE );
	}

	/**
	 *  Gets the value of the <code>&lt;TraitScoreType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If trait scores are provided, then this identifies the specific trait score that is provided. This value will be program specific (i.e. no standardized list of values available)."</i><p>
	 *
	 *  @return The <code>TraitScoreType</code> element of this object.
	 *  @since 2.6
	 */
	public String getTraitScoreType() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.TRAITSCORE_TRAITSCORETYPE );
	}

	/**
	 *  Sets the value of the <code>&lt;TraitScoreType&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If trait scores are provided, then this identifies the specific trait score that is provided. This value will be program specific (i.e. no standardized list of values available)."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setTraitScoreType( String value ) { 
		setFieldValue( AssessmentDTD.TRAITSCORE_TRAITSCORETYPE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TraitScoreValue&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This will be the numeric trait score value."</i><p>
	 *
	 *  @return The <code>TraitScoreValue</code> element of this object.
	 *  @since 2.6
	 */
	public String getTraitScoreValue() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.TRAITSCORE_TRAITSCOREVALUE );
	}

	/**
	 *  Sets the value of the <code>&lt;TraitScoreValue&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This will be the numeric trait score value."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setTraitScoreValue( String value ) { 
		setFieldValue( AssessmentDTD.TRAITSCORE_TRAITSCOREVALUE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;TraitScoreCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If there is a code associated with the trait score, then this will allow for identifying the code."</i><p>
	 *
	 *  @return The <code>TraitScoreCode</code> element of this object.
	 *  @since 2.6
	 */
	public String getTraitScoreCode() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.TRAITSCORE_TRAITSCORECODE );
	}

	/**
	 *  Sets the value of the <code>&lt;TraitScoreCode&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If there is a code associated with the trait score, then this will allow for identifying the code."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setTraitScoreCode( String value ) { 
		setFieldValue( AssessmentDTD.TRAITSCORE_TRAITSCORECODE, new SIFString( value ), value );
	}

}
