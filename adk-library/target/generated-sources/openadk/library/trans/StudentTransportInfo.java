// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.trans;

import openadk.library.*;
import openadk.library.common.*;
import java.math.BigDecimal;
import java.util.*;

/**
 *  
      This object contains transportation information about a student. Students should
      have at least two StudentTransportInfo objects associated with them: one for
      inbound information (getting to school) and one for outbound information (leaving
      school). If their transportation changes based on the day of the week, then a
      student will have more than two StudentTransportInfo objects.
    <p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class StudentTransportInfo extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public StudentTransportInfo() {
		super( ADK.getSIFVersion(), TransDTD.STUDENTTRANSPORTINFO );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId GUID that identifies this object.
	 *  @param studentPersonalRefId GUID that identifies the student that this object refers to.
	 *  @param type The direction of transportation that this object refers to.
	 *  @param dayOfWeek This attribute indicates the day(s) of the week to which this object refers.
	 *  @param schoolInfoRefId GUID referring to the school that the student attends on these day(s) of the week.
	 */
	public StudentTransportInfo( String refId, String studentPersonalRefId, StudentTransportInfoType type, String dayOfWeek, String schoolInfoRefId ) {
		super( ADK.getSIFVersion(), TransDTD.STUDENTTRANSPORTINFO );
		this.setRefId(refId);
		this.setStudentPersonalRefId(studentPersonalRefId);
		this.setType( type );
		this.setDayOfWeek(dayOfWeek);
		this.setSchoolInfoRefId(schoolInfoRefId);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( TransDTD.STUDENTTRANSPORTINFO_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { TransDTD.STUDENTTRANSPORTINFO_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this object."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies this object."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setRefId( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies the student that this object refers to."</i><p>
	 *
	 *  @return The <code>StudentPersonalRefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getStudentPersonalRefId() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_STUDENTPERSONALREFID );
	}

	/**
	 *  Sets the value of the <code>StudentPersonalRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID that identifies the student that this object refers to."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setStudentPersonalRefId( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_STUDENTPERSONALREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The direction of transportation that this object refers to."</i><p>
	 *
	 *  @return The <code>Type</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getType() { 
		return getFieldValue( TransDTD.STUDENTTRANSPORTINFO_TYPE );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The direction of transportation that this object refers to."</i><p>
	 *
	 *  @param value A constant defined by the <code>StudentTransportInfoType</code> class
	 *  @since 1.1
	 */
	public void setType( StudentTransportInfoType value ) { 
		setField( TransDTD.STUDENTTRANSPORTINFO_TYPE, value );
	}

	/**
	 *  Sets the value of the <code>Type</code> attribute as a String.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The direction of transportation that this object refers to."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setType( String value ) { 
		setField( TransDTD.STUDENTTRANSPORTINFO_TYPE, value );
	}

	/**
	 *  Gets the value of the <code>DayOfWeek</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This attribute indicates the day(s) of the week to which this object refers."</i><p>
	 *
	 *  @return The <code>DayOfWeek</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getDayOfWeek() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_DAYOFWEEK );
	}

	/**
	 *  Sets the value of the <code>DayOfWeek</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"This attribute indicates the day(s) of the week to which this object refers."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setDayOfWeek( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_DAYOFWEEK, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID referring to the school that the student attends on these day(s) of the week."</i><p>
	 *
	 *  @return The <code>SchoolInfoRefId</code> attribute of this object.
	 *  @since 1.1
	 */
	public String getSchoolInfoRefId() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_SCHOOLINFOREFID );
	}

	/**
	 *  Sets the value of the <code>SchoolInfoRefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"GUID referring to the school that the student attends on these day(s) of the week."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.1
	 */
	public void setSchoolInfoRefId( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_SCHOOLINFOREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Eligibility&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Eligibility status of student for district transportation for this trip."</i><p>
	 *
	 *  @return The <code>Eligibility</code> element of this object.
	 *  @since 1.1
	 */
	public String getEligibility() { 
		return getFieldValue( TransDTD.STUDENTTRANSPORTINFO_ELIGIBILITY );
	}

	/**
	 *  Sets the value of the <code>&lt;Eligibility&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Eligibility status of student for district transportation for this trip."</i><p>
	 *
	 *  @param value A constant defined by the <code>Eligibility</code> class
	 *  @since 1.1
	 */
	public void setEligibility( Eligibility value ) { 
		setField( TransDTD.STUDENTTRANSPORTINFO_ELIGIBILITY, value );
	}

	/**
	 *  Sets the value of the <code>&lt;Eligibility&gt;</code> element as a String.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Eligibility status of student for district transportation for this trip."</i><p>
	 *
	 *  @param value The value as a String
	 *  @since 1.1
	 */
	public void setEligibility( String value ) { 
		setField( TransDTD.STUDENTTRANSPORTINFO_ELIGIBILITY, value );
	}

	/**
	 *  Sets the value of the <code>&lt;HomeBusRouteDetail&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the HomeBusRouteDetail element does not exist then the student does not ride a bus to/from school."</i><p>
	 *
	 *  @param value A <code>HomeBusRouteDetail</code> object
	 *  @since 1.1
	 */
	public void setHomeBusRouteDetail( HomeBusRouteDetail value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_HOMEBUSROUTEDETAIL );
		addChild( TransDTD.STUDENTTRANSPORTINFO_HOMEBUSROUTEDETAIL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;HomeBusRouteDetail&gt;</code> child element.
	 *  This form of <code>setHomeBusRouteDetail</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setHomeBusRouteDetail</code>
	 *  that accepts a single <code>HomeBusRouteDetail</code> object.
	 *
	 *  @param sifRefObject Must be set to BusRouteDetail
	 *  @param value Gets or sets the content value of the &lt;HomeBusRouteDetail&gt; element
	 *  @since 1.1
	 */
	public void setHomeBusRouteDetail( String sifRefObject, String value ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_HOMEBUSROUTEDETAIL);
		addChild( TransDTD.STUDENTTRANSPORTINFO_HOMEBUSROUTEDETAIL, new HomeBusRouteDetail( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;HomeBusRouteDetail&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the HomeBusRouteDetail element does not exist then the student does not ride a bus to/from school."</i><p>
	 *
	 *  @return An <code>HomeBusRouteDetail</code> object
	 *  @since 1.1
	 */
	public HomeBusRouteDetail getHomeBusRouteDetail() { 
		return (HomeBusRouteDetail)getChild( TransDTD.STUDENTTRANSPORTINFO_HOMEBUSROUTEDETAIL);
	}

	/**
	 *  Removes the <code>HomeBusRouteDetail</code> child element previously created by calling <code>setHomeBusRouteDetail</code>
	 *
	 *  @since 1.1
	 */
	public void removeHomeBusRouteDetail() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_HOMEBUSROUTEDETAIL );
	}

	/**
	 *  Sets the value of the <code>&lt;HomeToSchoolDistance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Distance between the student's home address and the school."</i><p>
	 *
	 *  @param value A <code>Distance</code> object
	 *  @since 2.2
	 */
	public void setHomeToSchoolDistance( Distance value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_HOMETOSCHOOLDISTANCE );
		addChild( TransDTD.STUDENTTRANSPORTINFO_HOMETOSCHOOLDISTANCE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;HomeToSchoolDistance&gt;</code> child element.
	 *  This form of <code>setHomeToSchoolDistance</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setHomeToSchoolDistance</code>
	 *  that accepts a single <code>Distance</code> object.
	 *
	 *  @param unit Units used in the odometer reading.
	 *  @param value Gets or sets the content value of the &lt;Distance&gt; element
	 *  @since 2.2
	 */
	public void setHomeToSchoolDistance( DistanceUnit unit, BigDecimal value ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_HOMETOSCHOOLDISTANCE);
		addChild( TransDTD.STUDENTTRANSPORTINFO_HOMETOSCHOOLDISTANCE, new Distance( unit, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;HomeToSchoolDistance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Distance between the student's home address and the school."</i><p>
	 *
	 *  @return A <code>Distance</code> object
	 *  @since 2.2
	 */
	public Distance getHomeToSchoolDistance() { 
		return (Distance)getChild( TransDTD.STUDENTTRANSPORTINFO_HOMETOSCHOOLDISTANCE);
	}

	/**
	 *  Removes the <code>HomeToSchoolDistance</code> child element previously created by calling <code>setHomeToSchoolDistance</code>
	 *
	 *  @since 2.2
	 */
	public void removeHomeToSchoolDistance() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_HOMETOSCHOOLDISTANCE );
	}

	/**
	 *  Sets the value of the <code>&lt;TransferPoints&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"There should be one TransferPoint for each intermediate point on a trip. The "embark" and "disembark" bus stops for a single transfer point must be at the same location. To order multiple TransferPoint elements, use the Time element of the BusStopInfo objects referenced by the attributes."</i><p>
	 *
	 *  @param value A <code>TransferPoints</code> object
	 *  @since 1.1
	 */
	public void setTransferPoints( TransferPoints value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_TRANSFERPOINTS );
		addChild( TransDTD.STUDENTTRANSPORTINFO_TRANSFERPOINTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;TransferPoints&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"There should be one TransferPoint for each intermediate point on a trip. The "embark" and "disembark" bus stops for a single transfer point must be at the same location. To order multiple TransferPoint elements, use the Time element of the BusStopInfo objects referenced by the attributes."</i><p>
	 *
	 *  @return A <code>TransferPoints</code> object
	 *  @since 1.1
	 */
	public TransferPoints getTransferPoints() { 
		return (TransferPoints)getChild( TransDTD.STUDENTTRANSPORTINFO_TRANSFERPOINTS);
	}

	/**
	 *  Removes the <code>TransferPoints</code> child element previously created by calling <code>setTransferPoints</code>
	 *
	 *  @since 1.1
	 */
	public void removeTransferPoints() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_TRANSFERPOINTS );
	}

	/**
	 *  Sets the value of the <code>&lt;WalkToStopDistance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Distance between the student's address and the bus stop where they are picked up or dropped off."</i><p>
	 *
	 *  @param value A <code>Distance</code> object
	 *  @since 2.2
	 */
	public void setWalkToStopDistance( Distance value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_WALKTOSTOPDISTANCE );
		addChild( TransDTD.STUDENTTRANSPORTINFO_WALKTOSTOPDISTANCE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;WalkToStopDistance&gt;</code> child element.
	 *  This form of <code>setWalkToStopDistance</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setWalkToStopDistance</code>
	 *  that accepts a single <code>Distance</code> object.
	 *
	 *  @param unit Units used in the odometer reading.
	 *  @param value Gets or sets the content value of the &lt;Distance&gt; element
	 *  @since 2.2
	 */
	public void setWalkToStopDistance( DistanceUnit unit, BigDecimal value ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_WALKTOSTOPDISTANCE);
		addChild( TransDTD.STUDENTTRANSPORTINFO_WALKTOSTOPDISTANCE, new Distance( unit, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;WalkToStopDistance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Distance between the student's address and the bus stop where they are picked up or dropped off."</i><p>
	 *
	 *  @return A <code>Distance</code> object
	 *  @since 2.2
	 */
	public Distance getWalkToStopDistance() { 
		return (Distance)getChild( TransDTD.STUDENTTRANSPORTINFO_WALKTOSTOPDISTANCE);
	}

	/**
	 *  Removes the <code>WalkToStopDistance</code> child element previously created by calling <code>setWalkToStopDistance</code>
	 *
	 *  @since 2.2
	 */
	public void removeWalkToStopDistance() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_WALKTOSTOPDISTANCE );
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolBusRouteDetail&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the SchoolBusRouteDetail element does not exist then the student does not ride a bus to/from school."</i><p>
	 *
	 *  @param value A <code>SchoolBusRouteDetail</code> object
	 *  @since 1.1
	 */
	public void setSchoolBusRouteDetail( SchoolBusRouteDetail value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_SCHOOLBUSROUTEDETAIL );
		addChild( TransDTD.STUDENTTRANSPORTINFO_SCHOOLBUSROUTEDETAIL, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SchoolBusRouteDetail&gt;</code> child element.
	 *  This form of <code>setSchoolBusRouteDetail</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSchoolBusRouteDetail</code>
	 *  that accepts a single <code>SchoolBusRouteDetail</code> object.
	 *
	 *  @param sifRefObject GUID referring to a BusRouteDetail object that identifies the origin bus stop for an inbound route or the destination bus stop for an outbound route.
	 *  @param value Gets or sets the content value of the &lt;SchoolBusRouteDetail&gt; element
	 *  @since 1.1
	 */
	public void setSchoolBusRouteDetail( String sifRefObject, String value ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_SCHOOLBUSROUTEDETAIL);
		addChild( TransDTD.STUDENTTRANSPORTINFO_SCHOOLBUSROUTEDETAIL, new SchoolBusRouteDetail( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SchoolBusRouteDetail&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the SchoolBusRouteDetail element does not exist then the student does not ride a bus to/from school."</i><p>
	 *
	 *  @return A <code>SchoolBusRouteDetail</code> object
	 *  @since 1.1
	 */
	public SchoolBusRouteDetail getSchoolBusRouteDetail() { 
		return (SchoolBusRouteDetail)getChild( TransDTD.STUDENTTRANSPORTINFO_SCHOOLBUSROUTEDETAIL);
	}

	/**
	 *  Removes the <code>SchoolBusRouteDetail</code> child element previously created by calling <code>setSchoolBusRouteDetail</code>
	 *
	 *  @since 1.1
	 */
	public void removeSchoolBusRouteDetail() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_SCHOOLBUSROUTEDETAIL );
	}

	/**
	 *  Sets the value of the <code>&lt;StopToSchoolDistance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Distance between the bus stop where a student is picked up or dropped off and the school."</i><p>
	 *
	 *  @param value A <code>Distance</code> object
	 *  @since 2.2
	 */
	public void setStopToSchoolDistance( Distance value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_STOPTOSCHOOLDISTANCE );
		addChild( TransDTD.STUDENTTRANSPORTINFO_STOPTOSCHOOLDISTANCE, value);
	}

	/**
	 *  Sets the value of the <code>&lt;StopToSchoolDistance&gt;</code> child element.
	 *  This form of <code>setStopToSchoolDistance</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStopToSchoolDistance</code>
	 *  that accepts a single <code>Distance</code> object.
	 *
	 *  @param unit Units used in the odometer reading.
	 *  @param value Gets or sets the content value of the &lt;Distance&gt; element
	 *  @since 2.2
	 */
	public void setStopToSchoolDistance( DistanceUnit unit, BigDecimal value ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_STOPTOSCHOOLDISTANCE);
		addChild( TransDTD.STUDENTTRANSPORTINFO_STOPTOSCHOOLDISTANCE, new Distance( unit, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;StopToSchoolDistance&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Distance between the bus stop where a student is picked up or dropped off and the school."</i><p>
	 *
	 *  @return A <code>Distance</code> object
	 *  @since 2.2
	 */
	public Distance getStopToSchoolDistance() { 
		return (Distance)getChild( TransDTD.STUDENTTRANSPORTINFO_STOPTOSCHOOLDISTANCE);
	}

	/**
	 *  Removes the <code>StopToSchoolDistance</code> child element previously created by calling <code>setStopToSchoolDistance</code>
	 *
	 *  @since 2.2
	 */
	public void removeStopToSchoolDistance() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_STOPTOSCHOOLDISTANCE );
	}

	/**
	 *  Gets the value of the <code>&lt;StateAidQualification&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The qualification status of a student entitling local education agency to receive state transportation aid."</i><p>
	 *
	 *  @return The <code>StateAidQualification</code> element of this object.
	 *  @since 2.1
	 */
	public String getStateAidQualification() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_STATEAIDQUALIFICATION );
	}

	/**
	 *  Sets the value of the <code>&lt;StateAidQualification&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The qualification status of a student entitling local education agency to receive state transportation aid."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.1
	 */
	public void setStateAidQualification( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_STATEAIDQUALIFICATION, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;OriginPoint&gt;</code> element.
	 *
	 *  @param value A <code>OriginPoint</code> object
	 *  @since 2.2
	 */
	public void setOriginPoint( OriginPoint value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_ORIGINPOINT );
		addChild( TransDTD.STUDENTTRANSPORTINFO_ORIGINPOINT, value);
	}

	/**
	 *  Sets the value of the <code>&lt;OriginPoint&gt;</code> child element.
	 *  This form of <code>setOriginPoint</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setOriginPoint</code>
	 *  that accepts a single <code>OriginPoint</code> object.
	 *
	 *  @param busRouteDetailRefId GUID that identifies the bus stop/route where the student gets on the bus.
	 *  @since 2.2
	 */
	public void setOriginPoint( String busRouteDetailRefId ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_ORIGINPOINT);
		addChild( TransDTD.STUDENTTRANSPORTINFO_ORIGINPOINT, new OriginPoint( busRouteDetailRefId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;OriginPoint&gt;</code> element.
	 *
	 *  @return An <code>OriginPoint</code> object
	 *  @since 2.2
	 */
	public OriginPoint getOriginPoint() { 
		return (OriginPoint)getChild( TransDTD.STUDENTTRANSPORTINFO_ORIGINPOINT);
	}

	/**
	 *  Removes the <code>OriginPoint</code> child element previously created by calling <code>setOriginPoint</code>
	 *
	 *  @since 2.2
	 */
	public void removeOriginPoint() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_ORIGINPOINT );
	}

	/**
	 *  Gets the value of the <code>&lt;TransportationStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Information about whether or not a student is transported to and/or from school or receives services, aid, or payment in lieu of transportation."</i><p>
	 *
	 *  @return The <code>TransportationStatus</code> element of this object.
	 *  @since 2.1
	 */
	public String getTransportationStatus() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_TRANSPORTATIONSTATUS );
	}

	/**
	 *  Sets the value of the <code>&lt;TransportationStatus&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Information about whether or not a student is transported to and/or from school or receives services, aid, or payment in lieu of transportation."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.1
	 */
	public void setTransportationStatus( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_TRANSPORTATIONSTATUS, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;PublicExpense&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The eligibility of a student for transportation between home and school at local public expense because of distance, disability, or other reasons."</i><p>
	 *
	 *  @return The <code>PublicExpense</code> element of this object.
	 *  @since 2.1
	 */
	public String getPublicExpense() { 
		return (String) getSIFSimpleFieldValue( TransDTD.STUDENTTRANSPORTINFO_PUBLICEXPENSE );
	}

	/**
	 *  Sets the value of the <code>&lt;PublicExpense&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The eligibility of a student for transportation between home and school at local public expense because of distance, disability, or other reasons."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.1
	 */
	public void setPublicExpense( String value ) { 
		setFieldValue( TransDTD.STUDENTTRANSPORTINFO_PUBLICEXPENSE, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;DestinationPoint&gt;</code> element.
	 *
	 *  @param value A <code>DestinationPoint</code> object
	 *  @since 2.2
	 */
	public void setDestinationPoint( DestinationPoint value ) { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_DESTINATIONPOINT );
		addChild( TransDTD.STUDENTTRANSPORTINFO_DESTINATIONPOINT, value);
	}

	/**
	 *  Sets the value of the <code>&lt;DestinationPoint&gt;</code> child element.
	 *  This form of <code>setDestinationPoint</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setDestinationPoint</code>
	 *  that accepts a single <code>DestinationPoint</code> object.
	 *
	 *  @param busRouteDetailRefId GUID that identifies the bus stop/route where the student gets off the bus.
	 *  @since 2.2
	 */
	public void setDestinationPoint( String busRouteDetailRefId ) {
		removeChild( TransDTD.STUDENTTRANSPORTINFO_DESTINATIONPOINT);
		addChild( TransDTD.STUDENTTRANSPORTINFO_DESTINATIONPOINT, new DestinationPoint( busRouteDetailRefId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;DestinationPoint&gt;</code> element.
	 *
	 *  @return A <code>DestinationPoint</code> object
	 *  @since 2.2
	 */
	public DestinationPoint getDestinationPoint() { 
		return (DestinationPoint)getChild( TransDTD.STUDENTTRANSPORTINFO_DESTINATIONPOINT);
	}

	/**
	 *  Removes the <code>DestinationPoint</code> child element previously created by calling <code>setDestinationPoint</code>
	 *
	 *  @since 2.2
	 */
	public void removeDestinationPoint() { 
		removeChild( TransDTD.STUDENTTRANSPORTINFO_DESTINATIONPOINT );
	}

}