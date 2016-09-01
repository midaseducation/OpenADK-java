// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;
import openadk.library.etranscripts.*;
import openadk.library.gradebook.Letter;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.4
 */
public class StudentRecordExchangeData extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentRecordExchangeData() {
		super( CommonDTD.STUDENTRECORDEXCHANGEDATA );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentRecordExchange&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentRecordExchange object set for the student and sending agency that was requested by the GetStudentRecordExchange method. The object set is contained in a composite StudentRecordExchangeData object. To allow for packetizing of StudentRecordExchange object sets, there should be one instance of the StudentRecordExchangeData object for each object it contains."</i><p>
	 *
	 *  @param value A <code>StudentRecordExchange</code> object
	 *  @since 2.4
	 */
	public void setStudentRecordExchange( StudentRecordExchange value ) { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDEXCHANGE );
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDEXCHANGE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentRecordExchange&gt;</code> child element.
	 *  This form of <code>setStudentRecordExchange</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentRecordExchange</code>
	 *  that accepts a single <code>StudentRecordExchange</code> object.
	 *
	 *  @param refId The GUID that uniquely identifies an instance of this object.
	 *  @since 2.4
	 */
	public void setStudentRecordExchange( String refId ) {
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDEXCHANGE);
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDEXCHANGE, new StudentRecordExchange( refId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentRecordExchange&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentRecordExchange object set for the student and sending agency that was requested by the GetStudentRecordExchange method. The object set is contained in a composite StudentRecordExchangeData object. To allow for packetizing of StudentRecordExchange object sets, there should be one instance of the StudentRecordExchangeData object for each object it contains."</i><p>
	 *
	 *  @return A <code>StudentRecordExchange</code> object
	 *  @since 2.4
	 */
	public StudentRecordExchange getStudentRecordExchange() { 
		return (StudentRecordExchange)getChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDEXCHANGE);
	}

	/**
	 *  Removes the <code>StudentRecordExchange</code> child element previously created by calling <code>setStudentRecordExchange</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentRecordExchange() { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDEXCHANGE );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentDemographicRecord&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentDemographicRecord object referenced by the StudentRecordExchange/Records/StudentDemographicRecordRefId element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @param value A <code>StudentDemographicRecord</code> object
	 *  @since 2.4
	 */
	public void setStudentDemographicRecord( StudentDemographicRecord value ) { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTDEMOGRAPHICRECORD );
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTDEMOGRAPHICRECORD, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentDemographicRecord&gt;</code> child element.
	 *  This form of <code>setStudentDemographicRecord</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentDemographicRecord</code>
	 *  that accepts a single <code>StudentDemographicRecord</code> object.
	 *
	 *  @param refId The ID (GUID) of this record.
	 *  @param sifRefId The GUID of an associated object, either StudentRecordExchange or StudentPersonal.
	 *  @param sifRefObject The associated object type.
	 *  @since 2.4
	 */
	public void setStudentDemographicRecord( String refId, String sifRefId, TranscriptRecordRefObject sifRefObject ) {
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTDEMOGRAPHICRECORD);
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTDEMOGRAPHICRECORD, new StudentDemographicRecord( refId, sifRefId, sifRefObject ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentDemographicRecord&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentDemographicRecord object referenced by the StudentRecordExchange/Records/StudentDemographicRecordRefId element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @return A <code>StudentDemographicRecord</code> object
	 *  @since 2.4
	 */
	public StudentDemographicRecord getStudentDemographicRecord() { 
		return (StudentDemographicRecord)getChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTDEMOGRAPHICRECORD);
	}

	/**
	 *  Removes the <code>StudentDemographicRecord</code> child element previously created by calling <code>setStudentDemographicRecord</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentDemographicRecord() { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTDEMOGRAPHICRECORD );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentAcademicRecord&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentAcademicRecord object referenced by the StudentRecordExchange/Records/StudentAcademicRecordRefId element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @param value A <code>StudentAcademicRecord</code> object
	 *  @since 2.4
	 */
	public void setStudentAcademicRecord( StudentAcademicRecord value ) { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTACADEMICRECORD );
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTACADEMICRECORD, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentAcademicRecord&gt;</code> child element.
	 *  This form of <code>setStudentAcademicRecord</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentAcademicRecord</code>
	 *  that accepts a single <code>StudentAcademicRecord</code> object.
	 *
	 *  @param refId The ID (GUID) of this record.
	 *  @param sifRefId The GUID of an associated object, either StudentRecordExchange or StudentPersonal.
	 *  @param sifRefObject The associated object type.
	 *  @since 2.4
	 */
	public void setStudentAcademicRecord( String refId, String sifRefId, TranscriptRecordRefObject sifRefObject ) {
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTACADEMICRECORD);
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTACADEMICRECORD, new StudentAcademicRecord( refId, sifRefId, sifRefObject ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentAcademicRecord&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentAcademicRecord object referenced by the StudentRecordExchange/Records/StudentAcademicRecordRefId element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @return A <code>StudentAcademicRecord</code> object
	 *  @since 2.4
	 */
	public StudentAcademicRecord getStudentAcademicRecord() { 
		return (StudentAcademicRecord)getChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTACADEMICRECORD);
	}

	/**
	 *  Removes the <code>StudentAcademicRecord</code> child element previously created by calling <code>setStudentAcademicRecord</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentAcademicRecord() { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTACADEMICRECORD );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentSpecialEducationRecord&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentSpecialEducationRecord object referenced by the StudentRecordExchange/Records/StudentSpecialEducationRecordRefId element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @param value A <code>StudentSpecialEducationRecord</code> object
	 *  @since 2.4
	 */
	public void setStudentSpecialEducationRecord( StudentSpecialEducationRecord value ) { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTSPECIALEDUCATIONRECORD );
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTSPECIALEDUCATIONRECORD, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentSpecialEducationRecord&gt;</code> child element.
	 *  This form of <code>setStudentSpecialEducationRecord</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentSpecialEducationRecord</code>
	 *  that accepts a single <code>StudentSpecialEducationRecord</code> object.
	 *
	 *  @param refId The ID (GUID) of this record.
	 *  @param sifRefId The GUID of an associated object, either StudentRecordExchange or StudentPersonal.
	 *  @param sifRefObject The associated object type.
	 *  @since 2.4
	 */
	public void setStudentSpecialEducationRecord( String refId, String sifRefId, TranscriptRecordRefObject sifRefObject ) {
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTSPECIALEDUCATIONRECORD);
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTSPECIALEDUCATIONRECORD, new StudentSpecialEducationRecord( refId, sifRefId, sifRefObject ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentSpecialEducationRecord&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The StudentSpecialEducationRecord object referenced by the StudentRecordExchange/Records/StudentSpecialEducationRecordRefId element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @return A <code>StudentSpecialEducationRecord</code> object
	 *  @since 2.4
	 */
	public StudentSpecialEducationRecord getStudentSpecialEducationRecord() { 
		return (StudentSpecialEducationRecord)getChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTSPECIALEDUCATIONRECORD);
	}

	/**
	 *  Removes the <code>StudentSpecialEducationRecord</code> child element previously created by calling <code>setStudentSpecialEducationRecord</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentSpecialEducationRecord() { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTSPECIALEDUCATIONRECORD );
	}

	/**
	 *  Sets the value of the <code>&lt;StudentRecordPackage&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A StudentRecordPackage object referenced by the StudentRecordExchange/Records/OtherRecords element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @param value A <code>StudentRecordPackage</code> object
	 *  @since 2.4
	 */
	public void setStudentRecordPackage( StudentRecordPackage value ) { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDPACKAGE );
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDPACKAGE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StudentRecordPackage&gt;</code> child element.
	 *  This form of <code>setStudentRecordPackage</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudentRecordPackage</code>
	 *  that accepts a single <code>StudentRecordPackage</code> object.
	 *
	 *  @param sifRefId The GUID of the customer doing the transaction. 
	 *  @param sifRefObject SIF customer type.
	 *  @since 2.4
	 */
	public void setStudentRecordPackage( String sifRefId, String sifRefObject ) {
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDPACKAGE);
		addChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDPACKAGE, new StudentRecordPackage( sifRefId, sifRefObject ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StudentRecordPackage&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A StudentRecordPackage object referenced by the StudentRecordExchange/Records/OtherRecords element. At most one of this or one of the other Conditional elements must be provided in a StudentRecordExchangeData instance."</i><p>
	 *
	 *  @return A <code>StudentRecordPackage</code> object
	 *  @since 2.4
	 */
	public StudentRecordPackage getStudentRecordPackage() { 
		return (StudentRecordPackage)getChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDPACKAGE);
	}

	/**
	 *  Removes the <code>StudentRecordPackage</code> child element previously created by calling <code>setStudentRecordPackage</code>
	 *
	 *  @since 2.4
	 */
	public void removeStudentRecordPackage() { 
		removeChild( CommonDTD.STUDENTRECORDEXCHANGEDATA_STUDENTRECORDPACKAGE );
	}

}