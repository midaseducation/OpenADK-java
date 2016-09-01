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
 *  @since 2.0
 */
public class Authors extends SIFKeyedList<Author>
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Authors() {
		super( InstrDTD.AUTHORS );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param author Name of the organization that authored the standards document, i.e. "Mid-Continent Research for Education &amp; Learning (McREL)." May be the same as "Organization" above.
	 */
	public Authors( Author author ) {
		super( InstrDTD.AUTHORS );
		this.safeAddChild( InstrDTD.AUTHORS_AUTHOR, author );
	}

	/**
	 *  Adds a new <code>&lt;Author&gt;</code> repeatable element.
	 *  This form of <code>setAuthor</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAuthor</code>
	 *  that accepts a single <code>Author</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;Author&gt; element
	 *  @since 2.0
	 */
	public void addAuthor( String value ) {
		addChild( InstrDTD.AUTHORS_AUTHOR, new Author( value ) );
	}

	/**
	 *  Removes an <code>Author</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the Author object to remove by its Value value
	 *  @since 2.0
	 */
	public void removeAuthor( String value ) { 
		removeChild( InstrDTD.AUTHORS_AUTHOR, new String[] { value.toString() } );
	}

	/**
	 *  Gets an <code>Author</code> object instance. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @param value Identifies the Author object to return by its "Value" attribute value
	 *  @return An <code>Author</code> object
	 *  @since 2.0
	 */
	public Author getAuthor( String value ) { 
		return (Author)getChild( InstrDTD.AUTHORS_AUTHOR, new String[] { value.toString() } );
	}

	/**
	 *  Gets all <code>Author</code> object instances. More than one instance can be defined for this object because it is a repeatable field element.
	 *
	 *  @return An array of <code>Author</code> objects
	 *  @since 2.0
	 */
	public Author[] getAuthors() {
		List<SIFElement> v = getChildList( InstrDTD.AUTHORS_AUTHOR);
		Author[] cvt = new Author[v.size()];
		v.toArray(cvt);
		return cvt;
	}

	/**
	 * Sets an array of <code>Author</code> objects. All existing 
	 * <code>Author</code> instances 
	 * are removed and replaced with this list. Calling this method with the 
	 * parameter value set to null removes all <code>Authors</code>.
	 *
	 *  @since 2.0
	 */
	public void setAuthors( Author[] authors ) {
		setChildren( InstrDTD.AUTHORS_AUTHOR, authors );
	}

}