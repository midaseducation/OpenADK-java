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
 *  @since 2.3
 */
public class Descriptive extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Descriptive() {
		super( AssessmentDTD.DESCRIPTIVE );
	}

	/**
	 *  Gets the value of the <code>&lt;PValue&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The percent of respondents who answered correctly. This number represents the probability of the
                correct response to a question.
            "</i><p>
	 *
	 *  @return The <code>PValue</code> element of this object.
	 *  @since 2.3
	 */
	public Float getPValue() { 
		return (Float) getSIFSimpleFieldValue( AssessmentDTD.DESCRIPTIVE_PVALUE );
	}

	/**
	 *  Sets the value of the <code>&lt;PValue&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The percent of respondents who answered correctly. This number represents the probability of the
                correct response to a question.
            "</i><p>
	 *
	 *  @param value A <code>Float</code> object
	 *  @since 2.3
	 */
	public void setPValue( Float value ) { 
		setFieldValue( AssessmentDTD.DESCRIPTIVE_PVALUE, new SIFFloat( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SampleSize&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The size of the student group that saw the item."</i><p>
	 *
	 *  @return The <code>SampleSize</code> element of this object.
	 *  @since 2.3
	 */
	public Integer getSampleSize() { 
		return (Integer) getSIFSimpleFieldValue( AssessmentDTD.DESCRIPTIVE_SAMPLESIZE );
	}

	/**
	 *  Sets the value of the <code>&lt;SampleSize&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The size of the student group that saw the item."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.3
	 */
	public void setSampleSize( Integer value ) { 
		setFieldValue( AssessmentDTD.DESCRIPTIVE_SAMPLESIZE, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;PointBiserial&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The correlation between correct answers (dichotomous variable) on this item and total correct answers
                on the test.
            "</i><p>
	 *
	 *  @return The <code>PointBiserial</code> element of this object.
	 *  @since 2.3
	 */
	public BigDecimal getPointBiserial() { 
		return (BigDecimal) getSIFSimpleFieldValue( AssessmentDTD.DESCRIPTIVE_POINTBISERIAL );
	}

	/**
	 *  Sets the value of the <code>&lt;PointBiserial&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The correlation between correct answers (dichotomous variable) on this item and total correct answers
                on the test.
            "</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.3
	 */
	public void setPointBiserial( BigDecimal value ) { 
		setFieldValue( AssessmentDTD.DESCRIPTIVE_POINTBISERIAL, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Biserial&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Similar to the Point Biserial Correlation except that answers to the item are assumed to come from an
                underlying continuous variable.
            "</i><p>
	 *
	 *  @return The <code>Biserial</code> element of this object.
	 *  @since 2.3
	 */
	public BigDecimal getBiserial() { 
		return (BigDecimal) getSIFSimpleFieldValue( AssessmentDTD.DESCRIPTIVE_BISERIAL );
	}

	/**
	 *  Sets the value of the <code>&lt;Biserial&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Similar to the Point Biserial Correlation except that answers to the item are assumed to come from an
                underlying continuous variable.
            "</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.3
	 */
	public void setBiserial( BigDecimal value ) { 
		setFieldValue( AssessmentDTD.DESCRIPTIVE_BISERIAL, new SIFDecimal( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;DiscriminationIndex&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The Index of Discrimination is the difference between the proportion of an upper group who got an item
                right and the proportion of a lower group who got the item right.
            "</i><p>
	 *
	 *  @return The <code>DiscriminationIndex</code> element of this object.
	 *  @since 2.3
	 */
	public BigDecimal getDiscriminationIndex() { 
		return (BigDecimal) getSIFSimpleFieldValue( AssessmentDTD.DESCRIPTIVE_DISCRIMINATIONINDEX );
	}

	/**
	 *  Sets the value of the <code>&lt;DiscriminationIndex&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The Index of Discrimination is the difference between the proportion of an upper group who got an item
                right and the proportion of a lower group who got the item right.
            "</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 2.3
	 */
	public void setDiscriminationIndex( BigDecimal value ) { 
		setFieldValue( AssessmentDTD.DESCRIPTIVE_DISCRIMINATIONINDEX, new SIFDecimal( value ), value );
	}

}
