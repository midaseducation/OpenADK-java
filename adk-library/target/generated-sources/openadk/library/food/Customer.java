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
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Customer extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Customer() {
		super( FoodDTD.CUSTOMER );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifRefId GUID of the SIF customer type.
	 *  @param sifRefObject SIF customer type. If the type is StaffPersonalRefId then EarnedStatus is included. If the type is StudentPersonalRefId, then MealStatus in included.
	 */
	public Customer( String sifRefId, CustomerObjectName sifRefObject ) {
		super( FoodDTD.CUSTOMER );
		this.setSIF_RefId(sifRefId);
		this.setSIF_RefObject( sifRefObject );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( FoodDTD.CUSTOMER_SIF_REFID ) );
		b.append('.');
		b.append( getFieldValue( FoodDTD.CUSTOMER_SIF_REFOBJECT ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { FoodDTD.CUSTOMER_SIF_REFID, FoodDTD.CUSTOMER_SIF_REFOBJECT };
	}

	/**
	 *  Gets the value of the <code>SIF_RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID of the SIF customer type."</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"Value"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>SIF_RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getSIF_RefId() { 
		return (String) getSIFSimpleFieldValue( FoodDTD.CUSTOMER_SIF_REFID );
	}

	/**
	 *  Sets the value of the <code>SIF_RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID of the SIF customer type."</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"Value"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefId"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setSIF_RefId( String value ) { 
		setFieldValue( FoodDTD.CUSTOMER_SIF_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SIF_RefObject</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"SIF customer type. If the type is StaffPersonalRefId then EarnedStatus is included. If the type is StudentPersonalRefId, then MealStatus in included."</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"Type"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefObject"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @return The <code>SIF_RefObject</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getSIF_RefObject() { 
		return getFieldValue( FoodDTD.CUSTOMER_SIF_REFOBJECT );
	}

	/**
	 *  Sets the value of the <code>SIF_RefObject</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"SIF customer type. If the type is StaffPersonalRefId then EarnedStatus is included. If the type is StudentPersonalRefId, then MealStatus in included."</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"Type"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefObject"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value A constant defined by the <code>CustomerObjectName</code> class
	 *  @since 1.5r1
	 */
	public void setSIF_RefObject( CustomerObjectName value ) { 
		setField( FoodDTD.CUSTOMER_SIF_REFOBJECT, value );
	}

	/**
	 *  Sets the value of the <code>SIF_RefObject</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"SIF customer type. If the type is StaffPersonalRefId then EarnedStatus is included. If the type is StudentPersonalRefId, then MealStatus in included."</i><p>
	 *  This attribute is known by more than one tag name depending on the version of SIF in use. The ADK will use the tag names shown below when parsing and rendering attributes of this kind.<p>
	 *  <table width='50%' border='1'><tr><td align='center'><font face='verdana,helvetica' size='-1'>Version</font></td><td align='center'><font face='verdana,helvetica' size='-1'>Tag</font></td></tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF1.5r1 (and greater)</font></td><td>"Type"</td>	 *  </tr>
	 *  <tr>	 *  <td><font face='verdana,helvetica' size='-1'>SIF2.0 (and greater)</font></td><td>"SIF_RefObject"</td>	 *  </tr>
	 *  </table><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setSIF_RefObject( String value ) { 
		setField( FoodDTD.CUSTOMER_SIF_REFOBJECT, value );
	}

	/**
	 *  Sets the value of the <code>&lt;MealStatus&gt;</code> element.
	 *
	 *  @param value A <code>MealStatus</code> object
	 *  @since 1.5r1
	 */
	public void setMealStatus( MealStatus value ) { 
		removeChild( FoodDTD.CUSTOMER_MEALSTATUS );
		addChild( FoodDTD.CUSTOMER_MEALSTATUS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;MealStatus&gt;</code> child element.
	 *  This form of <code>setMealStatus</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setMealStatus</code>
	 *  that accepts a single <code>MealStatus</code> object.
	 *
	 *  @param type Meal status type.
	 *  @since 1.5r1
	 */
	public void setMealStatus( FreeReducedStatus type ) {
		removeChild( FoodDTD.CUSTOMER_MEALSTATUS);
		addChild( FoodDTD.CUSTOMER_MEALSTATUS, new MealStatus( type ) );
	}

	/**
	 *  Gets the value of the <code>&lt;MealStatus&gt;</code> element.
	 *
	 *  @return A <code>MealStatus</code> object
	 *  @since 1.5r1
	 */
	public MealStatus getMealStatus() { 
		return (MealStatus)getChild( FoodDTD.CUSTOMER_MEALSTATUS);
	}

	/**
	 *  Removes the <code>MealStatus</code> child element previously created by calling <code>setMealStatus</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeMealStatus() { 
		removeChild( FoodDTD.CUSTOMER_MEALSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;EarnedStatus&gt;</code> element.
	 *
	 *  @param value A <code>EarnedStatus</code> object
	 *  @since 1.5r1
	 */
	public void setEarnedStatus( EarnedStatus value ) { 
		removeChild( FoodDTD.CUSTOMER_EARNEDSTATUS );
		addChild( FoodDTD.CUSTOMER_EARNEDSTATUS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;EarnedStatus&gt;</code> child element.
	 *  This form of <code>setEarnedStatus</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setEarnedStatus</code>
	 *  that accepts a single <code>EarnedStatus</code> object.
	 *
	 *  @param type Earned status type.
	 *  @since 1.5r1
	 */
	public void setEarnedStatus( YesNoNA type ) {
		removeChild( FoodDTD.CUSTOMER_EARNEDSTATUS);
		addChild( FoodDTD.CUSTOMER_EARNEDSTATUS, new EarnedStatus( type ) );
	}

	/**
	 *  Gets the value of the <code>&lt;EarnedStatus&gt;</code> element.
	 *
	 *  @return An <code>EarnedStatus</code> object
	 *  @since 1.5r1
	 */
	public EarnedStatus getEarnedStatus() { 
		return (EarnedStatus)getChild( FoodDTD.CUSTOMER_EARNEDSTATUS);
	}

	/**
	 *  Removes the <code>EarnedStatus</code> child element previously created by calling <code>setEarnedStatus</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeEarnedStatus() { 
		removeChild( FoodDTD.CUSTOMER_EARNEDSTATUS );
	}

}
