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
 *  @since 2.0
 */
public class SIF_ExtendedQuery extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_ExtendedQuery() {
		super( InfraDTD.SIF_EXTENDEDQUERY );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param sifSelect 
	 *  @param sifFrom 
	 */
	public SIF_ExtendedQuery( SIF_Select sifSelect, SIF_From sifFrom ) {
		super( InfraDTD.SIF_EXTENDEDQUERY );
		this.setSIF_Select(sifSelect);
		this.setSIF_From(sifFrom);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT ) );
		b.append('.');
		b.append( getFieldValue( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT, InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM };
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_DestinationProvider&gt;</code> element.
	 *
	 *  @return The <code>SIF_DestinationProvider</code> element of this object.
	 *  @since 2.0
	 */
	public String getSIF_DestinationProvider() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_EXTENDEDQUERY_SIF_DESTINATIONPROVIDER );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_DestinationProvider&gt;</code> element.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setSIF_DestinationProvider( String value ) { 
		setFieldValue( InfraDTD.SIF_EXTENDEDQUERY_SIF_DESTINATIONPROVIDER, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Select&gt;</code> element.
	 *
	 *  @param value A <code>SIF_Select</code> object
	 *  @since 2.0
	 */
	public void setSIF_Select( SIF_Select value ) { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT );
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Select&gt;</code> child element.
	 *  This form of <code>setSIF_Select</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_Select</code>
	 *  that accepts a single <code>SIF_Select</code> object.
	 *
	 *  @param distinct Specifies whether query results should return all rows (false) or just distinct ones (true). Rows are distinct if at least one column differs between them.
	 *  @param rowCount The maximum number of rows to return. If All, return all rows, otherwise return the top rows up to the maximum row count indicated.
	 *  @param sifElement 
	 *  @since 2.0
	 */
	public void setSIF_Select( Boolean distinct, String rowCount, SIFSelectElement sifElement ) {
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT);
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT, new SIF_Select( distinct, rowCount, sifElement ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Select&gt;</code> element.
	 *
	 *  @return A <code>SIF_Select</code> object
	 *  @since 2.0
	 */
	public SIF_Select getSIF_Select() { 
		return (SIF_Select)getChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT);
	}

	/**
	 *  Removes the <code>SIF_Select</code> child element previously created by calling <code>setSIF_Select</code>
	 *
	 *  @since 2.0
	 */
	public void removeSIF_Select() { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_SELECT );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_From&gt;</code> element.
	 *
	 *  @param value A <code>SIF_From</code> object
	 *  @since 2.0
	 */
	public void setSIF_From( SIF_From value ) { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM );
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_From&gt;</code> child element.
	 *  This form of <code>setSIF_From</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_From</code>
	 *  that accepts a single <code>SIF_From</code> object.
	 *
	 *  @param objectName 
	 *  @param sifObject 
	 *  @since 2.0
	 */
	public void setSIF_From( String objectName, SIF_Object sifObject ) {
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM);
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM, new SIF_From( objectName, sifObject ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_From&gt;</code> element.
	 *
	 *  @return A <code>SIF_From</code> object
	 *  @since 2.0
	 */
	public SIF_From getSIF_From() { 
		return (SIF_From)getChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM);
	}

	/**
	 *  Removes the <code>SIF_From</code> child element previously created by calling <code>setSIF_From</code>
	 *
	 *  @since 2.0
	 */
	public void removeSIF_From() { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_FROM );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Where&gt;</code> element.
	 *
	 *  @param value A <code>SIF_Where</code> object
	 *  @since 2.0
	 */
	public void setSIF_Where( SIF_Where value ) { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_WHERE );
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_WHERE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Where&gt;</code> child element.
	 *  This form of <code>setSIF_Where</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_Where</code>
	 *  that accepts a single <code>SIF_Where</code> object.
	 *
	 *  @param sifConditionGroup 
	 *  @since 2.0
	 */
	public void setSIF_Where( SIF_ConditionGroup sifConditionGroup ) {
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_WHERE);
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_WHERE, new SIF_Where( sifConditionGroup ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Where&gt;</code> element.
	 *
	 *  @return A <code>SIF_Where</code> object
	 *  @since 2.0
	 */
	public SIF_Where getSIF_Where() { 
		return (SIF_Where)getChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_WHERE);
	}

	/**
	 *  Removes the <code>SIF_Where</code> child element previously created by calling <code>setSIF_Where</code>
	 *
	 *  @since 2.0
	 */
	public void removeSIF_Where() { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_WHERE );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_OrderBy&gt;</code> element.
	 *
	 *  @param value A <code>SIF_OrderBy</code> object
	 *  @since 2.0
	 */
	public void setSIF_OrderBy( SIF_OrderBy value ) { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_ORDERBY );
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_ORDERBY, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_OrderBy&gt;</code> child element.
	 *  This form of <code>setSIF_OrderBy</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSIF_OrderBy</code>
	 *  that accepts a single <code>SIF_OrderBy</code> object.
	 *
	 *  @param sifElement 
        Indicates the element/attribute by which to sort.
      
	 *  @since 2.0
	 */
	public void setSIF_OrderBy( SIFOrderByElement sifElement ) {
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_ORDERBY);
		addChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_ORDERBY, new SIF_OrderBy( sifElement ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_OrderBy&gt;</code> element.
	 *
	 *  @return A <code>SIF_OrderBy</code> object
	 *  @since 2.0
	 */
	public SIF_OrderBy getSIF_OrderBy() { 
		return (SIF_OrderBy)getChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_ORDERBY);
	}

	/**
	 *  Removes the <code>SIF_OrderBy</code> child element previously created by calling <code>setSIF_OrderBy</code>
	 *
	 *  @since 2.0
	 */
	public void removeSIF_OrderBy() { 
		removeChild( InfraDTD.SIF_EXTENDEDQUERY_SIF_ORDERBY );
	}

}
