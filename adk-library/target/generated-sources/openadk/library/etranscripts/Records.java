// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.etranscripts;

import openadk.library.*;
import openadk.library.common.*;
import openadk.library.gradebook.*;
import openadk.library.student.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class Records extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Records() {
		super( EtranscriptsDTD.RECORDS );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentDemographicRecordRefId&gt;</code> element.
	 *
	 *  @return The <code>StudentDemographicRecordRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStudentDemographicRecordRefId() { 
		return (String) getSIFSimpleFieldValue( EtranscriptsDTD.RECORDS_STUDENTDEMOGRAPHICRECORDREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentDemographicRecordRefId&gt;</code> element.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentDemographicRecordRefId( String value ) { 
		setFieldValue( EtranscriptsDTD.RECORDS_STUDENTDEMOGRAPHICRECORDREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentAcademicRecordRefId&gt;</code> element.
	 *
	 *  @return The <code>StudentAcademicRecordRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStudentAcademicRecordRefId() { 
		return (String) getSIFSimpleFieldValue( EtranscriptsDTD.RECORDS_STUDENTACADEMICRECORDREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentAcademicRecordRefId&gt;</code> element.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentAcademicRecordRefId( String value ) { 
		setFieldValue( EtranscriptsDTD.RECORDS_STUDENTACADEMICRECORDREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentSpecialEducationRecordRefId&gt;</code> element.
	 *
	 *  @return The <code>StudentSpecialEducationRecordRefId</code> element of this object.
	 *  @since 2.0
	 */
	public String getStudentSpecialEducationRecordRefId() { 
		return (String) getSIFSimpleFieldValue( EtranscriptsDTD.RECORDS_STUDENTSPECIALEDUCATIONRECORDREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentSpecialEducationRecordRefId&gt;</code> element.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setStudentSpecialEducationRecordRefId( String value ) { 
		setFieldValue( EtranscriptsDTD.RECORDS_STUDENTSPECIALEDUCATIONRECORDREFID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;OtherRecords&gt;</code> element.
	 *
	 *  @param value A <code>OtherRecords</code> object
	 *  @since 2.0
	 */
	public void setOtherRecords( OtherRecords value ) { 
		removeChild( EtranscriptsDTD.RECORDS_OTHERRECORDS );
		addChild( EtranscriptsDTD.RECORDS_OTHERRECORDS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OtherRecords&gt;</code> element.
	 *
	 *  @return An <code>OtherRecords</code> object
	 *  @since 2.0
	 */
	public OtherRecords getOtherRecords() { 
		return (OtherRecords)getChild( EtranscriptsDTD.RECORDS_OTHERRECORDS);
	}

	/**
	 *  Removes the <code>OtherRecords</code> child element previously created by calling <code>setOtherRecords</code>
	 *
	 *  @since 2.0
	 */
	public void removeOtherRecords() { 
		removeChild( EtranscriptsDTD.RECORDS_OTHERRECORDS );
	}

}