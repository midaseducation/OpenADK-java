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
 *  This message is used to respond to a SIF_ServiceInput message.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.3
 */
public class SIF_ServiceOutput extends SIFMessagePayload
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_ServiceOutput() {
		super( InfraDTD.SIF_SERVICEOUTPUT );
	}

	/**
	 *  Constructor that accepts a SIFVersion
	 *  @param sifVersion The version of SIF to render this message in
	 */
	public SIF_ServiceOutput( SIFVersion sifVersion ) {
		super( sifVersion, InfraDTD.SIF_SERVICEOUTPUT );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Header&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Header information associated with this message. The SIF_DestinationId needs to be the SIF_SourceId of the original SIF_Request message being processed."</i><p>
	 *
	 *  @param value A <code>SIF_Header</code> object
	 *  @since 2.3
	 */
	public void setSIF_Header( SIF_Header value ) { 
		removeChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_HEADER );
		addChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_HEADER, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Header&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Header information associated with this message. The SIF_DestinationId needs to be the SIF_SourceId of the original SIF_Request message being processed."</i><p>
	 *
	 *  @return A <code>SIF_Header</code> object
	 *  @since 2.3
	 */
	public SIF_Header getSIF_Header() { 
		return (SIF_Header)getChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_HEADER);
	}

	/**
	 *  Removes the <code>SIF_Header</code> child element previously created by calling <code>setSIF_Header</code>
	 *
	 *  @since 2.3
	 */
	public void removeSIF_Header() { 
		removeChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_HEADER );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Service&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the SIf Zone Service that is being invoked."</i><p>
	 *
	 *  @return The <code>SIF_Service</code> element of this object.
	 *  @since 2.3
	 */
	public String getSIF_Service() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_SERVICE );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Service&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the SIf Zone Service that is being invoked."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setSIF_Service( String value ) { 
		setFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_SERVICE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Operation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the service operation that is being invoked."</i><p>
	 *
	 *  @return The <code>SIF_Operation</code> element of this object.
	 *  @since 2.3
	 */
	public String getSIF_Operation() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_OPERATION );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Operation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The name of the service operation that is being invoked."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setSIF_Operation( String value ) { 
		setFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_OPERATION, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_ServiceMsgId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the message ID of the SIF_ServiceInput message being processed. It provides a unique match between a SIF_erviceOutput and a previous SIF_ServiceInput."</i><p>
	 *
	 *  @return The <code>SIF_ServiceMsgId</code> element of this object.
	 *  @since 2.3
	 */
	public String getSIF_ServiceMsgId() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_SERVICEMSGID );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_ServiceMsgId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This is the message ID of the SIF_ServiceInput message being processed. It provides a unique match between a SIF_erviceOutput and a previous SIF_ServiceInput."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setSIF_ServiceMsgId( String value ) { 
		setFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_SERVICEMSGID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_PacketNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element represents the index of the SIF_ServiceOutput message in the sequence of packets that make up a complete response. Its value must be in the range of 1 through n, with n equal to the total number of packets that make up a response."</i><p>
	 *
	 *  @return The <code>SIF_PacketNumber</code> element of this object.
	 *  @since 2.3
	 */
	public Integer getSIF_PacketNumber() { 
		return (Integer) getSIFSimpleFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_PACKETNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_PacketNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element represents the index of the SIF_ServiceOutput message in the sequence of packets that make up a complete response. Its value must be in the range of 1 through n, with n equal to the total number of packets that make up a response."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.3
	 */
	public void setSIF_PacketNumber( Integer value ) { 
		setFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_PACKETNUMBER, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_MorePackets&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element provides an indication as to whether there are more packets besides this one to make up a complete response."</i><p>
	 *
	 *  @return The <code>SIF_MorePackets</code> element of this object.
	 *  @since 2.3
	 */
	public String getSIF_MorePackets() { 
		return getFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_MOREPACKETS );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_MorePackets&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element provides an indication as to whether there are more packets besides this one to make up a complete response."</i><p>
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.3
	 */
	public void setSIF_MorePackets( YesNo value ) { 
		setField( InfraDTD.SIF_SERVICEOUTPUT_SIF_MOREPACKETS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_MorePackets&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"This element provides an indication as to whether there are more packets besides this one to make up a complete response."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.3
	 */
	public void setSIF_MorePackets( String value ) { 
		setField( InfraDTD.SIF_SERVICEOUTPUT_SIF_MOREPACKETS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Error&gt;</code> element.
	 *
	 *  @param value A <code>SIF_Error</code> object
	 *  @since 2.3
	 */
	public void setSIF_Error( SIF_Error value ) { 
		removeChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_ERROR );
		addChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_ERROR, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Error&gt;</code> element.
	 *
	 *  @return A <code>SIF_Error</code> object
	 *  @since 2.3
	 */
	public SIF_Error getSIF_Error() { 
		return (SIF_Error)getChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_ERROR);
	}

	/**
	 *  Removes the <code>SIF_Error</code> child element previously created by calling <code>setSIF_Error</code>
	 *
	 *  @since 2.3
	 */
	public void removeSIF_Error() { 
		removeChild( InfraDTD.SIF_SERVICEOUTPUT_SIF_ERROR );
	}

	/**
	 *  Gets the value of the <code>&lt;SIF_Body&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains a single child element that has the same name as the value of the SIF_Operation element."</i><p>
	 *
	 *  @return The <code>SIF_Body</code> element of this object.
	 *  @since 2.3
	 */
	public String getSIF_Body() { 
		return (String) getSIFSimpleFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_BODY );
	}

	/**
	 *  Sets the value of the <code>&lt;SIF_Body&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains a single child element that has the same name as the value of the SIF_Operation element."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.3
	 */
	public void setSIF_Body( String value ) { 
		setFieldValue( InfraDTD.SIF_SERVICEOUTPUT_SIF_BODY, new SIFString( value ), value );
	}

}