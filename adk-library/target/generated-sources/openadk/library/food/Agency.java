// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.food;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  Reimbursing agency<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Agency extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Agency() {
		super( FoodDTD.AGENCY );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type Type of the reimbursing agency. Values: Federal, State, Local, Other
	 *  @param name The name of the reimbursing agency. This element is to be used when the Type is set as Other.
	 *  @param rates 
	 */
	public Agency( AgencyTypeCode type, String name, Rates rates ) {
		super( FoodDTD.AGENCY );
		this.setType( type );
		this.setName(name);
		this.setRates(rates);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.AGENCY_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.AGENCY_TYPE };
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Type of the reimbursing agency. Values: Federal, State, Local, Other"</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getType() { 
		return getFieldValue( FoodDTD.AGENCY_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Type of the reimbursing agency. Values: Federal, State, Local, Other"</i><p>
	 *
	 *  @param value A constant defined by the <code>AgencyTypeCode</code> class
	 *  @since 1.5r1
	 */
	public void setType( AgencyTypeCode value ) { 
		setField( FoodDTD.AGENCY_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"Type of the reimbursing agency. Values: Federal, State, Local, Other"</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setType( String value ) { 
		setField( FoodDTD.AGENCY_TYPE, value );
	}

	/**
	 *  Gets the value of the <code>Name</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The name of the reimbursing agency. This element is to be used when the Type is set as Other."</i><p>
	 *
	 *  @return The <code>Name</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getName() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.AGENCY_NAME );
	}

	/**
	 *  Sets the value of the <code>Name</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The name of the reimbursing agency. This element is to be used when the Type is set as Other."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setName( String value ) { 
		setFieldValue( FoodDTD.AGENCY_NAME, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Rates&gt;</code> element.
	 *
	 *  @param value A <code>Rates</code> object
	 *  @since 1.5r1
	 */
	public void setRates( Rates value ) { 
		removeChild( FoodDTD.AGENCY_RATES );
		addChild( FoodDTD.AGENCY_RATES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Rates&gt;</code> element.
	 *
	 *  @return A <code>Rates</code> object
	 *  @since 1.5r1
	 */
	public Rates getRates() { 
		return (Rates)getChild( FoodDTD.AGENCY_RATES);
	}

	/**
	 *  Removes the <code>Rates</code> child element previously created by calling <code>setRates</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeRates() { 
		removeChild( FoodDTD.AGENCY_RATES );
	}

}
