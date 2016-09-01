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
 *  Transaction method<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class TransactionPayMethod extends SIFKeyedElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public TransactionPayMethod() {
		super( FoodDTD.TRANSACTIONPAYMETHOD );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param type This refers to the way the payment was made.
	 *  @param amounts AmountThis amount is the form of the incoming funds for this transaction. For example; the payment can be made by a credit card.
	 */
	public TransactionPayMethod( TransactionPayMethodType type, FSAmounts amounts ) {
		super( FoodDTD.TRANSACTIONPAYMETHOD );
		this.setType( type );
		this.addAmounts( amounts );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( FoodDTD.TRANSACTIONPAYMETHOD_TYPE );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.TRANSACTIONPAYMETHOD_TYPE };
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This refers to the way the payment was made."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getType() { 
		return getFieldValue( FoodDTD.TRANSACTIONPAYMETHOD_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This refers to the way the payment was made."</i><p>
	 *
	 *  @param value A constant defined by the <code>TransactionPayMethodType</code> class
	 *  @since 1.5r1
	 */
	public void setType( TransactionPayMethodType value ) { 
		setField( FoodDTD.TRANSACTIONPAYMETHOD_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This refers to the way the payment was made."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setType( String value ) { 
		setField( FoodDTD.TRANSACTIONPAYMETHOD_TYPE, value );
	}

	/**
	 *  Adds a new <code>&lt;Amounts&gt;</code> child element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"AmountThis amount is the form of the incoming funds for this transaction. For example; the payment can be made by a credit card."</i><p>
	 *
	 *  @param value A <code>FSAmounts</code> object
	 *  @since 1.5r1
	 */
	public void addAmounts( FSAmounts value ) { 
		addChild( FoodDTD.TRANSACTIONPAYMETHOD_AMOUNTS, value);
	}

	/**
	 *  Gets all <code>FSAmounts</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>FSAmounts</code> objects
	 *  @since 1.5r1
	 */
	public FSAmounts[] getAmountses() {
		List<SIFElement> v = getChildList( FoodDTD.TRANSACTIONPAYMETHOD_AMOUNTS);
		FSAmounts[] cvt = new FSAmounts[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>FSAmounts</code> objects. All existing 
	 * <code>FSAmounts</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>FSAmountses</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setAmountses( FSAmounts[] amountses ) {
		setChildren( FoodDTD.TRANSACTIONPAYMETHOD_AMOUNTS, amountses );
	}

}
