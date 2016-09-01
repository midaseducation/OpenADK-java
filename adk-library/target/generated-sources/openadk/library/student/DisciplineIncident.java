// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.student;

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
public class DisciplineIncident extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public DisciplineIncident() {
		super( ADK.getSIFVersion(), StudentDTD.DISCIPLINEINCIDENT );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId The unique identifier (GUID) of this discipline incident.
	 *  @param schoolYear School year in which the incident occurred, and for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g., "2007" for the 2006-07 school year).
	 *  @param agencyReporting 
	 *  @param incidentNumber The locally-defined unique identifier (within the school or school district) to identify this specific incident or occurrence.
	 *  @param incidentDate The date when the incident occurred.
	 *  @param incidentTime The time when the incident occurred.
	 *  @param incidentLocation The locally-defined identifier or description of the location where the incident occurred.
	 *  @param incidentCategory 
	 *  @param offenderList 
	 *  @param victimList 
	 */
	public DisciplineIncident( String refId, Integer schoolYear, AgencyReporting agencyReporting, String incidentNumber, Calendar incidentDate, IncidentTime incidentTime, IncidentLocation incidentLocation, IncidentCategory incidentCategory, OffenderList offenderList, VictimList victimList ) {
		super( ADK.getSIFVersion(), StudentDTD.DISCIPLINEINCIDENT );
		this.setRefId(refId);
		this.setSchoolYear(schoolYear);
		this.setAgencyReporting(agencyReporting);
		this.setIncidentNumber(incidentNumber);
		this.setIncidentDate(incidentDate);
		this.setIncidentTime(incidentTime);
		this.setIncidentLocation(incidentLocation);
		this.setIncidentCategory(incidentCategory);
		this.setOffenderList(offenderList);
		this.setVictimList(victimList);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( StudentDTD.DISCIPLINEINCIDENT_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { StudentDTD.DISCIPLINEINCIDENT_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The unique identifier (GUID) of this discipline incident."</i><p>
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 2.0
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.DISCIPLINEINCIDENT_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"The unique identifier (GUID) of this discipline incident."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setRefId( String value ) { 
		setFieldValue( StudentDTD.DISCIPLINEINCIDENT_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year in which the incident occurred, and for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g., "2007" for the 2006-07 school year)."</i><p>
	 *
	 *  @return The <code>SchoolYear</code> attribute of this object.
	 *  @since 2.0
	 */
	public Integer getSchoolYear() { 
		return (Integer) getSIFSimpleFieldValue( StudentDTD.DISCIPLINEINCIDENT_SCHOOLYEAR );
	}

	/**
	 *  Sets the value of the <code>SchoolYear</code> attribute.
	* <p> The SIF specification defines the meaning of this attribute as: 
	* <i>"School year in which the incident occurred, and for which the information is applicable, expressed as the four-digit year in which the school year ends (e.g., "2007" for the 2006-07 school year)."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 2.0
	 */
	public void setSchoolYear( Integer value ) { 
		setFieldValue( StudentDTD.DISCIPLINEINCIDENT_SCHOOLYEAR, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;AgencyReporting&gt;</code> element.
	 *
	 *  @param value A <code>AgencyReporting</code> object
	 *  @since 2.0
	 */
	public void setAgencyReporting( AgencyReporting value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_AGENCYREPORTING );
		addChild( StudentDTD.DISCIPLINEINCIDENT_AGENCYREPORTING, value);
	}

	/**
	 *  Sets the value of the <code>&lt;AgencyReporting&gt;</code> child element.
	 *  This form of <code>setAgencyReporting</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setAgencyReporting</code>
	 *  that accepts a single <code>AgencyReporting</code> object.
	 *
	 *  @param sifRefObject The name of the SIF object to which the GUID relates.
	 *  @param value Gets or sets the content value of the &lt;AgencyReporting&gt; element
	 *  @since 2.0
	 */
	public void setAgencyReporting( AgencyReportingObject sifRefObject, String value ) {
		removeChild( StudentDTD.DISCIPLINEINCIDENT_AGENCYREPORTING);
		addChild( StudentDTD.DISCIPLINEINCIDENT_AGENCYREPORTING, new AgencyReporting( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;AgencyReporting&gt;</code> element.
	 *
	 *  @return An <code>AgencyReporting</code> object
	 *  @since 2.0
	 */
	public AgencyReporting getAgencyReporting() { 
		return (AgencyReporting)getChild( StudentDTD.DISCIPLINEINCIDENT_AGENCYREPORTING);
	}

	/**
	 *  Removes the <code>AgencyReporting</code> child element previously created by calling <code>setAgencyReporting</code>
	 *
	 *  @since 2.0
	 */
	public void removeAgencyReporting() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_AGENCYREPORTING );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined unique identifier (within the school or school district) to identify this specific incident or occurrence."</i><p>
	 *
	 *  @return The <code>IncidentNumber</code> element of this object.
	 *  @since 2.0
	 */
	public String getIncidentNumber() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTNUMBER );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentNumber&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined unique identifier (within the school or school district) to identify this specific incident or occurrence."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setIncidentNumber( String value ) { 
		setFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTNUMBER, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date when the incident occurred."</i><p>
	 *
	 *  @return The <code>IncidentDate</code> element of this object.
	 *  @since 2.0
	 */
	public Calendar getIncidentDate() { 
		return (Calendar) getSIFSimpleFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTDATE );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentDate&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The date when the incident occurred."</i><p>
	 *
	 *  @param value A <code>Calendar</code> object
	 *  @since 2.0
	 */
	public void setIncidentDate( Calendar value ) { 
		setFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTDATE, new SIFDate( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The time when the incident occurred."</i><p>
	 *
	 *  @param value A <code>IncidentTime</code> object
	 *  @since 2.0
	 */
	public void setIncidentTime( IncidentTime value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTTIME );
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTTIME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentTime&gt;</code> child element.
	 *  This form of <code>setIncidentTime</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIncidentTime</code>
	 *  that accepts a single <code>IncidentTime</code> object.
	 *
	 *  @param type Identifies whether or not the incident occurred during school hours. 
	 *  @param value Gets or sets the content value of the &lt;IncidentTime&gt; element
	 *  @since 2.0
	 */
	public void setIncidentTime( SafetyTimeType type, String value ) {
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTTIME);
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTTIME, new IncidentTime( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The time when the incident occurred."</i><p>
	 *
	 *  @return An <code>IncidentTime</code> object
	 *  @since 2.0
	 */
	public IncidentTime getIncidentTime() { 
		return (IncidentTime)getChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTTIME);
	}

	/**
	 *  Removes the <code>IncidentTime</code> child element previously created by calling <code>setIncidentTime</code>
	 *
	 *  @since 2.0
	 */
	public void removeIncidentTime() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTTIME );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentLocation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier or description of the location where the incident occurred."</i><p>
	 *
	 *  @param value A <code>IncidentLocation</code> object
	 *  @since 2.0
	 */
	public void setIncidentLocation( IncidentLocation value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATION );
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentLocation&gt;</code> child element.
	 *  This form of <code>setIncidentLocation</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIncidentLocation</code>
	 *  that accepts a single <code>IncidentLocation</code> object.
	 *
	 *  @param type Identifies where the incident occurred.
	 *  @param value Gets or sets the content value of the &lt;IncidentLocation&gt; element
	 *  @since 2.0
	 */
	public void setIncidentLocation( IncidentLocationType type, String value ) {
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATION);
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATION, new IncidentLocation( type, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentLocation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The locally-defined identifier or description of the location where the incident occurred."</i><p>
	 *
	 *  @return An <code>IncidentLocation</code> object
	 *  @since 2.0
	 */
	public IncidentLocation getIncidentLocation() { 
		return (IncidentLocation)getChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATION);
	}

	/**
	 *  Removes the <code>IncidentLocation</code> child element previously created by calling <code>setIncidentLocation</code>
	 *
	 *  @since 2.0
	 */
	public void removeIncidentLocation() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATION );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentLocationRefId&gt;</code> element.
	 *
	 *  @param value A <code>IncidentLocationRefId</code> object
	 *  @since 2.0
	 */
	public void setIncidentLocationRefId( IncidentLocationRefId value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATIONREFID );
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATIONREFID, value);
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentLocationRefId&gt;</code> child element.
	 *  This form of <code>setIncidentLocationRefId</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIncidentLocationRefId</code>
	 *  that accepts a single <code>IncidentLocationRefId</code> object.
	 *
	 *  @param sifRefObject The name of the SIF object to which the GUID relates.
	 *  @param value Gets or sets the content value of the &lt;IncidentLocationRefId&gt; element
	 *  @since 2.0
	 */
	public void setIncidentLocationRefId( IncidentLocationObject sifRefObject, String value ) {
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATIONREFID);
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATIONREFID, new IncidentLocationRefId( sifRefObject, value ) );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentLocationRefId&gt;</code> element.
	 *
	 *  @return An <code>IncidentLocationRefId</code> object
	 *  @since 2.0
	 */
	public IncidentLocationRefId getIncidentLocationRefId() { 
		return (IncidentLocationRefId)getChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATIONREFID);
	}

	/**
	 *  Removes the <code>IncidentLocationRefId</code> child element previously created by calling <code>setIncidentLocationRefId</code>
	 *
	 *  @since 2.0
	 */
	public void removeIncidentLocationRefId() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTLOCATIONREFID );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentCost&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the incident resulted in a quantifiable monetary loss for any entity involved, identify and record the value of that loss.  Cost may be reported by specific dollar amount or range."</i><p>
	 *
	 *  @return The <code>IncidentCost</code> element of this object.
	 *  @since 2.0
	 */
	public String getIncidentCost() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTCOST );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentCost&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the incident resulted in a quantifiable monetary loss for any entity involved, identify and record the value of that loss.  Cost may be reported by specific dollar amount or range."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.0
	 */
	public void setIncidentCost( String value ) { 
		setFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTCOST, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentReporter&gt;</code> element.
	 *
	 *  @param value A <code>IncidentReporter</code> object
	 *  @since 2.0
	 */
	public void setIncidentReporter( IncidentReporter value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTREPORTER );
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTREPORTER, value);
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentReporter&gt;</code> child element.
	 *  This form of <code>setIncidentReporter</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setIncidentReporter</code>
	 *  that accepts a single <code>IncidentReporter</code> object.
	 *
	 *  @param type 
	 *  @since 2.0
	 */
	public void setIncidentReporter( ReporterDescriptionType type ) {
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTREPORTER);
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTREPORTER, new IncidentReporter( type ) );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentReporter&gt;</code> element.
	 *
	 *  @return An <code>IncidentReporter</code> object
	 *  @since 2.0
	 */
	public IncidentReporter getIncidentReporter() { 
		return (IncidentReporter)getChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTREPORTER);
	}

	/**
	 *  Removes the <code>IncidentReporter</code> child element previously created by calling <code>setIncidentReporter</code>
	 *
	 *  @since 2.0
	 */
	public void removeIncidentReporter() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTREPORTER );
	}

	/**
	 *  Sets the value of the <code>&lt;RelatedToList&gt;</code> element.
	 *
	 *  @param value A <code>RelatedToList</code> object
	 *  @since 2.0
	 */
	public void setRelatedToList( RelatedToList value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_RELATEDTOLIST );
		addChild( StudentDTD.DISCIPLINEINCIDENT_RELATEDTOLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;RelatedToList&gt;</code> element.
	 *
	 *  @return A <code>RelatedToList</code> object
	 *  @since 2.0
	 */
	public RelatedToList getRelatedToList() { 
		return (RelatedToList)getChild( StudentDTD.DISCIPLINEINCIDENT_RELATEDTOLIST);
	}

	/**
	 *  Removes the <code>RelatedToList</code> child element previously created by calling <code>setRelatedToList</code>
	 *
	 *  @since 2.0
	 */
	public void removeRelatedToList() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_RELATEDTOLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;WeaponTypeList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"List of weapons involved in the incident. If the incident involves weapons, the element must have a value.
    	Each weapon used in the incident is identified by a WeaponType entry. When multiple weapons of a single type are used, each weapon has a separate entry in this list.
    	Weapons used by individual offenders are also reported in WeaponTypeList entries associated to the offender."</i><p>
	 *
	 *  @param value A <code>WeaponTypeList</code> object
	 *  @since 2.0
	 */
	public void setWeaponTypeList( WeaponTypeList value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_WEAPONTYPELIST );
		addChild( StudentDTD.DISCIPLINEINCIDENT_WEAPONTYPELIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;WeaponTypeList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"List of weapons involved in the incident. If the incident involves weapons, the element must have a value.
    	Each weapon used in the incident is identified by a WeaponType entry. When multiple weapons of a single type are used, each weapon has a separate entry in this list.
    	Weapons used by individual offenders are also reported in WeaponTypeList entries associated to the offender."</i><p>
	 *
	 *  @return A <code>WeaponTypeList</code> object
	 *  @since 2.0
	 */
	public WeaponTypeList getWeaponTypeList() { 
		return (WeaponTypeList)getChild( StudentDTD.DISCIPLINEINCIDENT_WEAPONTYPELIST);
	}

	/**
	 *  Removes the <code>WeaponTypeList</code> child element previously created by calling <code>setWeaponTypeList</code>
	 *
	 *  @since 2.0
	 */
	public void removeWeaponTypeList() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_WEAPONTYPELIST );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentCategory&gt;</code> element.
	 *
	 *  @param value A <code>IncidentCategory</code> object
	 *  @since 2.0
	 */
	public void setIncidentCategory( IncidentCategory value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTCATEGORY );
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTCATEGORY, value);
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentCategory&gt;</code> element.
	 *
	 *  @return An <code>IncidentCategory</code> object
	 *  @since 2.0
	 */
	public IncidentCategory getIncidentCategory() { 
		return (IncidentCategory)getChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTCATEGORY);
	}

	/**
	 *  Removes the <code>IncidentCategory</code> child element previously created by calling <code>setIncidentCategory</code>
	 *
	 *  @since 2.0
	 */
	public void removeIncidentCategory() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTCATEGORY );
	}

	/**
	 *  Sets the value of the <code>&lt;OffenderList&gt;</code> element.
	 *
	 *  @param value A <code>OffenderList</code> object
	 *  @since 2.0
	 */
	public void setOffenderList( OffenderList value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_OFFENDERLIST );
		addChild( StudentDTD.DISCIPLINEINCIDENT_OFFENDERLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;OffenderList&gt;</code> element.
	 *
	 *  @return An <code>OffenderList</code> object
	 *  @since 2.0
	 */
	public OffenderList getOffenderList() { 
		return (OffenderList)getChild( StudentDTD.DISCIPLINEINCIDENT_OFFENDERLIST);
	}

	/**
	 *  Removes the <code>OffenderList</code> child element previously created by calling <code>setOffenderList</code>
	 *
	 *  @since 2.0
	 */
	public void removeOffenderList() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_OFFENDERLIST );
	}

	/**
	 *  Sets the value of the <code>&lt;VictimList&gt;</code> element.
	 *
	 *  @param value A <code>VictimList</code> object
	 *  @since 2.0
	 */
	public void setVictimList( VictimList value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_VICTIMLIST );
		addChild( StudentDTD.DISCIPLINEINCIDENT_VICTIMLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;VictimList&gt;</code> element.
	 *
	 *  @return A <code>VictimList</code> object
	 *  @since 2.0
	 */
	public VictimList getVictimList() { 
		return (VictimList)getChild( StudentDTD.DISCIPLINEINCIDENT_VICTIMLIST);
	}

	/**
	 *  Removes the <code>VictimList</code> child element previously created by calling <code>setVictimList</code>
	 *
	 *  @since 2.0
	 */
	public void removeVictimList() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_VICTIMLIST );
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentDescription&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the incident resulted in a quantifiable monetary loss for any entity involved, identify and record the value of that loss.  Cost may be reported by specific dollar amount or range."</i><p>
	 *
	 *  @return The <code>IncidentDescription</code> element of this object.
	 *  @since 2.4
	 */
	public String getIncidentDescription() { 
		return (String) getSIFSimpleFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTDESCRIPTION );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentDescription&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the incident resulted in a quantifiable monetary loss for any entity involved, identify and record the value of that loss.  Cost may be reported by specific dollar amount or range."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 2.4
	 */
	public void setIncidentDescription( String value ) { 
		setFieldValue( StudentDTD.DISCIPLINEINCIDENT_INCIDENTDESCRIPTION, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;IncidentActionList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the incident resulted in a quantifiable monetary loss for any entity involved, identify and record the value of that loss.  Cost may be reported by specific dollar amount or range."</i><p>
	 *
	 *  @param value A <code>IncidentActionList</code> object
	 *  @since 2.4
	 */
	public void setIncidentActionList( IncidentActionList value ) { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTACTIONLIST );
		addChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTACTIONLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;IncidentActionList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"If the incident resulted in a quantifiable monetary loss for any entity involved, identify and record the value of that loss.  Cost may be reported by specific dollar amount or range."</i><p>
	 *
	 *  @return An <code>IncidentActionList</code> object
	 *  @since 2.4
	 */
	public IncidentActionList getIncidentActionList() { 
		return (IncidentActionList)getChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTACTIONLIST);
	}

	/**
	 *  Removes the <code>IncidentActionList</code> child element previously created by calling <code>setIncidentActionList</code>
	 *
	 *  @since 2.4
	 */
	public void removeIncidentActionList() { 
		removeChild( StudentDTD.DISCIPLINEINCIDENT_INCIDENTACTIONLIST );
	}

}
