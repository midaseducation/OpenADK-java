// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.assessment;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.6
 */
public class AssessmentStudentSnapshotSif3 extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public AssessmentStudentSnapshotSif3() {
		super( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3 );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param localId The locally-defined identifier for this student.
	 *  @param homeEnrollmentSif3 Enrollment-related information for the school that is responsible for reporting the student's membership/child accounting information. This is most likely the primary enrollment site for the student.
	 */
	public AssessmentStudentSnapshotSif3( String localId, HomeEnrollmentSif3 homeEnrollmentSif3 ) {
		super( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3 );
		this.setLocalId(localId);
		this.setHomeEnrollmentSif3(homeEnrollmentSif3);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		StringBuilder b = new StringBuilder();
		b.append( getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_LOCALID ) );
		b.append('.');
		b.append( getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3 ) );
		return b.toString();
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_LOCALID, AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3 };
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the student"</i><p>
	 *
	 *  @param value A <code>Name</code> object
	 *  @since 2.6
	 */
	public void setName( Name value ) { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_NAME );
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_NAME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Name&gt;</code> child element.
	 *  This form of <code>setName</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setName</code>
	 *  that accepts a single <code>Name</code> object.
	 *
	 *  @param type Code that specifies what type of name this is.  If unsure, use 04.
	 *  @param lastName The last name.
	 *  @param firstName The first name.
	 *  @since 2.6
	 */
	public void setName( NameType type, String lastName, String firstName ) {
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_NAME);
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_NAME, new Name( type, lastName, firstName ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Name&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Name of the student"</i><p>
	 *
	 *  @return A <code>Name</code> object
	 *  @since 2.6
	 */
	public Name getName() { 
		return (Name)getChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_NAME);
	}

	/**
	 *  Removes the <code>Name</code> child element previously created by calling <code>setName</code>
	 *
	 *  @since 2.6
	 */
	public void removeName() { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_NAME );
	}

	/**
	 *  Gets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier for this student."</i><p>
	 *
	 *  @return The <code>LocalId</code> element of this object.
	 *  @since 2.6
	 */
	public String getLocalId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_LOCALID );
	}

	/**
	 *  Sets the value of the <code>&lt;LocalId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier for this student."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setLocalId( String value ) { 
		setFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_LOCALID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The state-assigned identifier for this student."</i><p>
	 *
	 *  @return The <code>StateProvinceId</code> element of this object.
	 *  @since 2.6
	 */
	public String getStateProvinceId() { 
		return (String) getSIFSimpleFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_STATEPROVINCEID );
	}

	/**
	 *  Sets the value of the <code>&lt;StateProvinceId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The state-assigned identifier for this student."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.6
	 */
	public void setStateProvinceId( String value ) { 
		setFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_STATEPROVINCEID, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Address&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Address of the student"</i><p>
	 *
	 *  @param value A <code>Address</code> object
	 *  @since 2.6
	 */
	public void setAddress( Address value ) { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ADDRESS );
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ADDRESS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Address&gt;</code> child element.
	 *  This form of <code>setAddress</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAddress</code>
	 *  that accepts a single <code>Address</code> object.
	 *
	 *  @param type Code that defines the location of the address.  Note:  A subset of specific valid values for each instance in a data object may be listed in that object.
	 *  @param street The street part of the address
	 *  @param city The city part of the address.
	 *  @param stateProvince The state or province code.
	 *  @param country The country code.
	 *  @param postalCode The ZIP/postal code.
	 *  @since 2.6
	 */
	public void setAddress( AddressType type, Street street, String city, StatePrCode stateProvince, CountryCode country, String postalCode ) {
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ADDRESS);
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ADDRESS, new Address( type, street, city, stateProvince, country, postalCode ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Address&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Address of the student"</i><p>
	 *
	 *  @return An <code>Address</code> object
	 *  @since 2.6
	 */
	public Address getAddress() { 
		return (Address)getChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ADDRESS);
	}

	/**
	 *  Removes the <code>Address</code> child element previously created by calling <code>setAddress</code>
	 *
	 *  @since 2.6
	 */
	public void removeAddress() { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ADDRESS );
	}

	/**
	 *  Sets the value of the <code>&lt;RaceList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Person's race"</i><p>
	 *
	 *  @param value A <code>RaceList</code> object
	 *  @since 2.6
	 */
	public void setRaceList( RaceList value ) { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_RACELIST );
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_RACELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;RaceList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Person's race"</i><p>
	 *
	 *  @return A <code>RaceList</code> object
	 *  @since 2.6
	 */
	public RaceList getRaceList() { 
		return (RaceList)getChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_RACELIST);
	}

	/**
	 *  Removes the <code>RaceList</code> child element previously created by calling <code>setRaceList</code>
	 *
	 *  @since 2.6
	 */
	public void removeRaceList() { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_RACELIST );
	}

	/**
	 *  Gets the value of the <code>&lt;HispanicLatino&gt;</code> element.
	 *
	 *  @return The <code>HispanicLatino</code> element of this object.
	 *  @since 2.6
	 */
	public String getHispanicLatino() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HISPANICLATINO );
	}

	/**
	 *  Sets the value of the <code>&lt;HispanicLatino&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNo</code> class
	 *  @since 2.6
	 */
	public void setHispanicLatino( YesNo value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HISPANICLATINO, value );
	}

	/**
	 *  Sets the value of the <code>&lt;HispanicLatino&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setHispanicLatino( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HISPANICLATINO, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Gender&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Person's gender."</i><p>
	 *
	 *  @return The <code>Gender</code> element of this object.
	 *  @since 2.6
	 */
	public String getGender() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GENDER );
	}

	/**
	 *  Sets the value of the <code>&lt;Gender&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Person's gender."</i><p>
	 *
	 *  @param value A constant defined by the <code>Gender</code> class
	 *  @since 2.6
	 */
	public void setGender( Gender value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GENDER, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Gender&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Person's gender."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setGender( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GENDER, value );
	}

	/**
	 *  Gets the value of the <code>&lt;BirthDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's date of birth."</i><p>
	 *
	 *  @return The <code>BirthDate</code> element of this object.
	 *  @since 2.6
	 */
	public Calendar getBirthDate() { 
		return (Calendar) getSIFSimpleFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_BIRTHDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;BirthDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The person's date of birth."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.6
	 */
	public void setBirthDate( Calendar value ) { 
		setFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_BIRTHDATE, new SIFDate( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Age&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The age (in years) of the student on the date in SnapDate."</i><p>
	 *
	 *  @return The <code>Age</code> element of this object.
	 *  @since 2.6
	 */
	public Integer getAge() { 
		return (Integer) getSIFSimpleFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_AGE );
	}

	/**
	 *  Sets the value of the <code>&lt;Age&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The age (in years) of the student on the date in SnapDate."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.6
	 */
	public void setAge( Integer value ) { 
		setFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_AGE, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ProjectedGraduationYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Currently projected graduation year."</i><p>
	 *
	 *  @return The <code>ProjectedGraduationYear</code> element of this object.
	 *  @since 2.6
	 */
	public Integer getProjectedGraduationYear() { 
		return (Integer) getSIFSimpleFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_PROJECTEDGRADUATIONYEAR );
	}

	/**
	 *  Sets the value of the <code>&lt;ProjectedGraduationYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Currently projected graduation year."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.6
	 */
	public void setProjectedGraduationYear( Integer value ) { 
		setFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_PROJECTEDGRADUATIONYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;OnTimeGraduationYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"First projected graduation year, usually determined when student is accepted into ninth grade."</i><p>
	 *
	 *  @return The <code>OnTimeGraduationYear</code> element of this object.
	 *  @since 2.6
	 */
	public Integer getOnTimeGraduationYear() { 
		return (Integer) getSIFSimpleFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ONTIMEGRADUATIONYEAR );
	}

	/**
	 *  Sets the value of the <code>&lt;OnTimeGraduationYear&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"First projected graduation year, usually determined when student is accepted into ninth grade."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.6
	 */
	public void setOnTimeGraduationYear( Integer value ) { 
		setFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ONTIMEGRADUATIONYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;GraduationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date student officially graduated from secondary education."</i><p>
	 *
	 *  @param value A <code>PartialDateType</code> object
	 *  @since 2.6
	 */
	public void setGraduationDate( PartialDateType value ) { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GRADUATIONDATE );
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GRADUATIONDATE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;GraduationDate&gt;</code> child element.
	 *  This form of <code>setGraduationDate</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setGraduationDate</code>
	 *  that accepts a single <code>PartialDateType</code> object.
	 *
	 *  @param value Gets or sets the content value of the &lt;PartialDateType&gt; element
	 *  @since 2.6
	 */
	public void setGraduationDate( String value ) {
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GRADUATIONDATE);
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GRADUATIONDATE, new PartialDateType( value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;GraduationDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Date student officially graduated from secondary education."</i><p>
	 *
	 *  @return A <code>PartialDateType</code> object
	 *  @since 2.6
	 */
	public PartialDateType getGraduationDate() { 
		return (PartialDateType)getChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GRADUATIONDATE);
	}

	/**
	 *  Removes the <code>GraduationDate</code> child element previously created by calling <code>setGraduationDate</code>
	 *
	 *  @since 2.6
	 */
	public void removeGraduationDate() { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GRADUATIONDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;HomeEnrollmentSif3&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment-related information for the school that is responsible for reporting the student's membership/child accounting information. This is most likely the primary enrollment site for the student."</i><p>
	 *
	 *  @param value A <code>HomeEnrollmentSif3</code> object
	 *  @since 2.6
	 */
	public void setHomeEnrollmentSif3( HomeEnrollmentSif3 value ) { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3 );
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3, value);
	}

	/**
	 *  Sets the value of the <code>&lt;HomeEnrollmentSif3&gt;</code> child element.
	 *  This form of <code>setHomeEnrollmentSif3</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setHomeEnrollmentSif3</code>
	 *  that accepts a single <code>HomeEnrollmentSif3</code> object.
	 *
	 *  @param status Enrollment status as of the SnapDate.
	 *  @param gradeLevel Grade or academic level of student.
	 *  @since 2.6
	 */
	public void setHomeEnrollmentSif3( HomeEnrollmentStatusSif3 status, GradeLevel gradeLevel ) {
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3);
		addChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3, new HomeEnrollmentSif3( status, gradeLevel ) );
	}

	/**
	 *  Gets the value of the <code>&lt;HomeEnrollmentSif3&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Enrollment-related information for the school that is responsible for reporting the student's membership/child accounting information. This is most likely the primary enrollment site for the student."</i><p>
	 *
	 *  @return An <code>HomeEnrollmentSif3</code> object
	 *  @since 2.6
	 */
	public HomeEnrollmentSif3 getHomeEnrollmentSif3() { 
		return (HomeEnrollmentSif3)getChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3);
	}

	/**
	 *  Removes the <code>HomeEnrollmentSif3</code> child element previously created by calling <code>setHomeEnrollmentSif3</code>
	 *
	 *  @since 2.6
	 */
	public void removeHomeEnrollmentSif3() { 
		removeChild( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMEENROLLMENTSIF3 );
	}

	/**
	 *  Gets the value of the <code>&lt;IDEA&gt;</code> element.
	 *
	 *  @return The <code>IDEA</code> element of this object.
	 *  @since 2.6
	 */
	public String getIDEA() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_IDEA );
	}

	/**
	 *  Sets the value of the <code>&lt;IDEA&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setIDEA( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_IDEA, value );
	}

	/**
	 *  Sets the value of the <code>&lt;IDEA&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setIDEA( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_IDEA, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Migrant&gt;</code> element.
	 *
	 *  @return The <code>Migrant</code> element of this object.
	 *  @since 2.6
	 */
	public String getMigrant() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_MIGRANT );
	}

	/**
	 *  Sets the value of the <code>&lt;Migrant&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setMigrant( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_MIGRANT, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Migrant&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setMigrant( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_MIGRANT, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Title1&gt;</code> element.
	 *
	 *  @return The <code>Title1</code> element of this object.
	 *  @since 2.6
	 */
	public String getTitle1() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_TITLE1 );
	}

	/**
	 *  Sets the value of the <code>&lt;Title1&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setTitle1( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_TITLE1, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Title1&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setTitle1( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_TITLE1, value );
	}

	/**
	 *  Gets the value of the <code>&lt;GiftedTalented&gt;</code> element.
	 *
	 *  @return The <code>GiftedTalented</code> element of this object.
	 *  @since 2.6
	 */
	public String getGiftedTalented() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GIFTEDTALENTED );
	}

	/**
	 *  Sets the value of the <code>&lt;GiftedTalented&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setGiftedTalented( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GIFTEDTALENTED, value );
	}

	/**
	 *  Sets the value of the <code>&lt;GiftedTalented&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setGiftedTalented( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_GIFTEDTALENTED, value );
	}

	/**
	 *  Gets the value of the <code>&lt;EconomicDisadvantage&gt;</code> element.
	 *
	 *  @return The <code>EconomicDisadvantage</code> element of this object.
	 *  @since 2.6
	 */
	public String getEconomicDisadvantage() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ECONOMICDISADVANTAGE );
	}

	/**
	 *  Sets the value of the <code>&lt;EconomicDisadvantage&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setEconomicDisadvantage( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ECONOMICDISADVANTAGE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;EconomicDisadvantage&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setEconomicDisadvantage( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ECONOMICDISADVANTAGE, value );
	}

	/**
	 *  Gets the value of the <code>&lt;ELL&gt;</code> element.
	 *
	 *  @return The <code>ELL</code> element of this object.
	 *  @since 2.6
	 */
	public String getELL() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ELL );
	}

	/**
	 *  Sets the value of the <code>&lt;ELL&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setELL( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ELL, value );
	}

	/**
	 *  Sets the value of the <code>&lt;ELL&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setELL( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_ELL, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Homeless&gt;</code> element.
	 *
	 *  @return The <code>Homeless</code> element of this object.
	 *  @since 2.6
	 */
	public String getHomeless() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMELESS );
	}

	/**
	 *  Sets the value of the <code>&lt;Homeless&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setHomeless( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMELESS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Homeless&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setHomeless( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_HOMELESS, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Section504&gt;</code> element.
	 *
	 *  @return The <code>Section504</code> element of this object.
	 *  @since 2.6
	 */
	public String getSection504() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_SECTION504 );
	}

	/**
	 *  Sets the value of the <code>&lt;Section504&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setSection504( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_SECTION504, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Section504&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setSection504( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_SECTION504, value );
	}

	/**
	 *  Gets the value of the <code>&lt;VocationalConcentrator&gt;</code> element.
	 *
	 *  @return The <code>VocationalConcentrator</code> element of this object.
	 *  @since 2.6
	 */
	public String getVocationalConcentrator() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_VOCATIONALCONCENTRATOR );
	}

	/**
	 *  Sets the value of the <code>&lt;VocationalConcentrator&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setVocationalConcentrator( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_VOCATIONALCONCENTRATOR, value );
	}

	/**
	 *  Sets the value of the <code>&lt;VocationalConcentrator&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setVocationalConcentrator( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_VOCATIONALCONCENTRATOR, value );
	}

	/**
	 *  Gets the value of the <code>&lt;Immigrant&gt;</code> element.
	 *
	 *  @return The <code>Immigrant</code> element of this object.
	 *  @since 2.6
	 */
	public String getImmigrant() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_IMMIGRANT );
	}

	/**
	 *  Sets the value of the <code>&lt;Immigrant&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>YesNoUnknown</code> class
	 *  @since 2.6
	 */
	public void setImmigrant( YesNoUnknown value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_IMMIGRANT, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Immigrant&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setImmigrant( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_IMMIGRANT, value );
	}

	/**
	 *  Gets the value of the <code>&lt;FreeAndReducedStatus&gt;</code> element.
	 *
	 *  @return The <code>FreeAndReducedStatus</code> element of this object.
	 *  @since 2.6
	 */
	public String getFreeAndReducedStatus() { 
		return getFieldValue( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_FREEANDREDUCEDSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;FreeAndReducedStatus&gt;</code> element.
	 *
	 *  @param value A constant defined by the <code>FreeAndReducedStatus</code> class
	 *  @since 2.6
	 */
	public void setFreeAndReducedStatus( FreeAndReducedStatus value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_FREEANDREDUCEDSTATUS, value );
	}

	/**
	 *  Sets the value of the <code>&lt;FreeAndReducedStatus&gt;</code> element as a String.
	 *
	 *  @param value The value as a String
	 *  @since 2.6
	 */
	public void setFreeAndReducedStatus( String value ) { 
		setField( AssessmentDTD.ASSESSMENTSTUDENTSNAPSHOTSIF3_FREEANDREDUCEDSTATUS, value );
	}

}