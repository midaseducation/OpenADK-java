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
 *  Contains one of the SIF message types.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class SIF_Ack extends SIFMessagePayload
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_Ack() {
		super( InfraDTD.SIF_ACK );
	}

	/**
	 *  Constructor that accepts a SIFVersion
	 *  @param sifVersion The version of SIF to render this message in
	 */
	public SIF_Ack( SIFVersion sifVersion ) {
		super( sifVersion, InfraDTD.SIF_ACK );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Header&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Header information associated with this message."</i><p>
	 *
	 *  @param value A <code>SIF_Header</code> object
	 *  @since 1.1
	 */
	public void setSIF_Header( SIF_Header value ) { 
		removeChild( InfraDTD.SIF_ACK_SIF_HEADER );
		addChild( InfraDTD.SIF_ACK_SIF_HEADER, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Header&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Header information associated with this message."</i><p>
	 *
	 *  @return A <code>SIF_Header</code> object
	 *  @since 1.1
	 */
	public SIF_Header getSIF_Header() { 
		return (SIF_Header)getChild( InfraDTD.SIF_ACK_SIF_HEADER);
	}

	/**
	 *  Removes the <code>SIF_Header</code> child element previously created by calling <code>setSIF_Header</code>
	 *
	 *  @since 1.1
	 */
	public void removeSIF_Header() { 
		removeChild( InfraDTD.SIF_ACK_SIF_HEADER );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_OriginalSourceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The SIF_SourceId of the infrastructure message for which the SIF_Ack serves as a response."</i><p>
	 *
	 *  @return The <code>SIF_OriginalSourceId</code> element of this object.
	 *  @since 1.1
	 */
	public String getSIF_OriginalSourceId() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_ACK_SIF_ORIGINALSOURCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_OriginalSourceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The SIF_SourceId of the infrastructure message for which the SIF_Ack serves as a response."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSIF_OriginalSourceId( String value ) { 
		setFieldValue( InfraDTD.SIF_ACK_SIF_ORIGINALSOURCEID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_OriginalMsgId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The SIF_MsgId of the infrastructure message for which the SIF_Ack message serves as a response."</i><p>
	 *
	 *  @return The <code>SIF_OriginalMsgId</code> element of this object.
	 *  @since 1.1
	 */
	public String getSIF_OriginalMsgId() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_ACK_SIF_ORIGINALMSGID );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_OriginalMsgId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The SIF_MsgId of the infrastructure message for which the SIF_Ack message serves as a response."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSIF_OriginalMsgId( String value ) { 
		setFieldValue( InfraDTD.SIF_ACK_SIF_ORIGINALMSGID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element is used to signal a successful response."</i><p>
	 *
	 *  @param value A <code>SIF_Status</code> object
	 *  @since 1.1
	 */
	public void setSIF_Status( SIF_Status value ) { 
		removeChild( InfraDTD.SIF_ACK_SIF_STATUS );
		addChild( InfraDTD.SIF_ACK_SIF_STATUS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Status&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element is used to signal a successful response."</i><p>
	 *
	 *  @return A <code>SIF_Status</code> object
	 *  @since 1.1
	 */
	public SIF_Status getSIF_Status() { 
		return (SIF_Status)getChild( InfraDTD.SIF_ACK_SIF_STATUS);
	}

	/**
	 *  Removes the <code>SIF_Status</code> child element previously created by calling <code>setSIF_Status</code>
	 *
	 *  @since 1.1
	 */
	public void removeSIF_Status() { 
		removeChild( InfraDTD.SIF_ACK_SIF_STATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Error&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element is used to signal an unsuccessful response."</i><p>
	 *
	 *  @param value A <code>SIF_Error</code> object
	 *  @since 1.1
	 */
	public void setSIF_Error( SIF_Error value ) { 
		removeChild( InfraDTD.SIF_ACK_SIF_ERROR );
		addChild( InfraDTD.SIF_ACK_SIF_ERROR, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Error&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element is used to signal an unsuccessful response."</i><p>
	 *
	 *  @return A <code>SIF_Error</code> object
	 *  @since 1.1
	 */
	public SIF_Error getSIF_Error() { 
		return (SIF_Error)getChild( InfraDTD.SIF_ACK_SIF_ERROR);
	}

	/**
	 *  Removes the <code>SIF_Error</code> child element previously created by calling <code>setSIF_Error</code>
	 *
	 *  @since 1.1
	 */
	public void removeSIF_Error() { 
		removeChild( InfraDTD.SIF_ACK_SIF_ERROR );
	}


// BEGIN EXTRA METHODS (/Users/ajbrown/Projects/midas/OpenADK-java/adk-generator/../adk-generator/datadef/core/sif20/SIF_Ack.txt)

public openadk.library.SIFMessagePayload message;

	/**
	 *  Determines if this SIF_Ack has a specific status code.
	 *  @param code The status code to test for
	 *  @return true if the SIF_Ack has one or more SIF_Status children and one
	 *      of those contains the status code
	 */
	public boolean hasStatusCode( int code )
	{
		SIF_Status stat = getSIF_Status();
		if( stat != null && stat.getSIF_Code() == code ){
				return true;
		}
		return false;
	}

	/**
	 *  Determines if this SIF_Ack communicates an error
	 *  @return true if there is at least one SIF_Error child of SIF_Ack
	 */
	public boolean hasError()
	{
		return ( getSIF_Error() != null );
	}
	
	/**
	 *  Determines if this SIF_Ack contains the specified error code
	 *  @param category The error category
	 *  @param code The error code
	 *  @return true if the SIF_Ack contains this error
	 */
	public boolean hasError( int category, int code )
    {
		SIF_Error error = getSIF_Error();
		if( error != null && error.getSIF_Category() == category && error.getSIF_Code() == code ){
				return true;
		}
		return false;
	}    	 

	public void LogSend( org.apache.log4j.Category log )
	{
		if( ( ADK.debug & ADK.DBG_MESSAGING ) != 0 )
		{
			LogCommon("Send ",log);
		}
	}

	public void LogRecv( org.apache.log4j.Category log )
	{
		if( ( ADK.debug & ADK.DBG_MESSAGING ) != 0 )
		{
			LogCommon("Receive ",log);
		}
	}

	private void LogCommon( String direction, org.apache.log4j.Category log )
	{
		StringBuffer b = new StringBuffer(direction);
		b.append(fElementDef.tag( getSIFVersion() ));
		b.append(" (Status = ");

		SIF_Status stat = getSIF_Status();
		if( stat != null ) {
			b.append( stat.getSIF_Code() );
		}
		else
			b.append( "none" );

		SIF_Error error = getSIF_Error();
		if( error != null ) {
			b.append("; Errors = ");
			b.append( 1 );
		}

		b.append(")");
		log.debug(b.toString());

		if( error != null && ( ADK.debug & ADK.DBG_MESSAGING ) != 0 ) {
				log.debug( error.toString() );
		}

		if( ( ADK.debug & ADK.DBG_MESSAGING_DETAILED ) != 0 ) {
			String id = getMsgId();
	    	log.debug("  MsgId: " + ( id == null ? "<none>" : id ) );
		    id = getSIF_OriginalMsgId();
			log.debug("  OrgId: " + ( id == null ? "<none>" : id ) );
		}
	}	 

// END EXTRA METHODS

}