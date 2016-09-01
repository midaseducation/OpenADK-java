// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.instr;

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
public class Statements extends SIFKeyedList<Statement>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Statements() {
		super( InstrDTD.STATEMENTS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param statement The text of the "standard," or "benchmark."
	 */
	public Statements( Statement statement ) {
		super( InstrDTD.STATEMENTS );
		this.safeAddChild( InstrDTD.STATEMENTS_STATEMENT, statement );
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.STATEMENTS_STATEMENT );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.STATEMENTS_STATEMENT };
	}

	/**
	 *  Adds a new <code>&lt;Statement&gt;</code> repeatable element.
	 *  This form of <code>setStatement</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStatement</code>
	 *  that accepts a single <code>Statement</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;Statement&gt; element
	 *  @since 1.5r1
	 */
	public void addStatement( String value ) {
		addChild( InstrDTD.STATEMENTS_STATEMENT, new Statement( value ) );
	}

	/**
	 *  Removes a <code>Statement</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the Statement object to remove by its Value value
	 *  @since 1.5r1
	 */
	public void removeStatement( String value ) { 
		removeChild( InstrDTD.STATEMENTS_STATEMENT, new String[] { value.toString() } );
	}

	/**
	 *  Gets a <code>Statement</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the Statement object to return by its "Value" attribute value
	 *  @return A <code>Statement</code> object
	 *  @since 1.5r1
	 */
	public Statement getStatement( String value ) { 
		return (Statement)getChild( InstrDTD.STATEMENTS_STATEMENT, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>Statement</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Statement</code> objects
	 *  @since 1.5r1
	 */
	public Statement[] getStatements() {
		List<SIFElement> v = getChildList( InstrDTD.STATEMENTS_STATEMENT);
		Statement[] cvt = new Statement[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Statement</code> objects. All existing 
	 * <code>Statement</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Statements</code>.
	 *
	 *  @since 1.5r1
	 */
	public void setStatements( Statement[] statements ) {
		setChildren( InstrDTD.STATEMENTS_STATEMENT, statements );
	}

}