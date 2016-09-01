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
 *  The work assigned to students, an educational event planned by a teacher to deliver a particular educational concept or skill.  SIF_Events are reported.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.5r1
 */
public class Activity extends SIFDataObject
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public Activity() {
		super( ADK.getSIFVersion(), InstrDTD.ACTIVITY );
	}

	/**
	 *  Constructor that accepts values for all mandatory fields
	 *  @param refId 
	 *  @param language 
	 *  @param activityTime Time structures for the activity.
	 */
	public Activity( String refId, LanguageCode language, ActivityTime activityTime ) {
		super( ADK.getSIFVersion(), InstrDTD.ACTIVITY );
		this.setRefId(refId);
		this.setLanguage( language );
		this.setActivityTime(activityTime);
	}

	/**
	 *  Gets the key of this object
	 *  @return The value of the object's Mandatory or Required attribute. If
	 *      an object has more than one such attribute, the key is a period-
	 *      delimited concatenation of the attribute values in sequential order
	 */
	public String getKey() {
		return getFieldValue( InstrDTD.ACTIVITY_REFID );
	}

	/**
	 *  Gets the metadata fields that make up the key of this object
	 *  @return an array of metadata fields that make up the object's key
	 */
	public ElementDef[] getKeyFields() {
		return new ElementDef[] { InstrDTD.ACTIVITY_REFID };
	}

	/**
	 *  Gets the value of the <code>RefId</code> attribute.
	 *
	 *  @return The <code>RefId</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getRefId() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_REFID );
	}

	/**
	 *  Sets the value of the <code>RefId</code> attribute.
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setRefId( String value ) { 
		setFieldValue( InstrDTD.ACTIVITY_REFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>Language</code> attribute.
	 *
	 *  @return The <code>Language</code> attribute of this object.
	 *  @since 1.5r1
	 */
	public String getLanguage() { 
		return getFieldValue( InstrDTD.ACTIVITY_LANGUAGE );
	}

	/**
	 *  Sets the value of the <code>Language</code> attribute.
	 *
	 *  @param value A constant defined by the <code>LanguageCode</code> class
	 *  @since 1.5r1
	 */
	public void setLanguage( LanguageCode value ) { 
		setField( InstrDTD.ACTIVITY_LANGUAGE, value );
	}

	/**
	 *  Sets the value of the <code>Language</code> attribute as a String.
	 *
	 *  @param value The value as a String
	 *  @since 1.5r1
	 */
	public void setLanguage( String value ) { 
		setField( InstrDTD.ACTIVITY_LANGUAGE, value );
	}

	/**
	 *  Sets the value of the <code>&lt;TechnicalRequirements&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Applications, OS, and network requirements for activity if applicable."</i><p>
	 *
	 *  @param value A <code>TechnicalRequirements</code> object
	 *  @since 1.5r1
	 */
	public void setTechnicalRequirements( TechnicalRequirements value ) { 
		removeChild( InstrDTD.ACTIVITY_TECHNICALREQUIREMENTS );
		addChild( InstrDTD.ACTIVITY_TECHNICALREQUIREMENTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;TechnicalRequirements&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Applications, OS, and network requirements for activity if applicable."</i><p>
	 *
	 *  @return A <code>TechnicalRequirements</code> object
	 *  @since 1.5r1
	 */
	public TechnicalRequirements getTechnicalRequirements() { 
		return (TechnicalRequirements)getChild( InstrDTD.ACTIVITY_TECHNICALREQUIREMENTS);
	}

	/**
	 *  Removes the <code>TechnicalRequirements</code> child element previously created by calling <code>setTechnicalRequirements</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeTechnicalRequirements() { 
		removeChild( InstrDTD.ACTIVITY_TECHNICALREQUIREMENTS );
	}

	/**
	 *  Sets the value of the <code>&lt;EssentialMaterials&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Essential materials required to engage in this activity."</i><p>
	 *
	 *  @param value A <code>EssentialMaterials</code> object
	 *  @since 1.5r1
	 */
	public void setEssentialMaterials( EssentialMaterials value ) { 
		removeChild( InstrDTD.ACTIVITY_ESSENTIALMATERIALS );
		addChild( InstrDTD.ACTIVITY_ESSENTIALMATERIALS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;EssentialMaterials&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Essential materials required to engage in this activity."</i><p>
	 *
	 *  @return An <code>EssentialMaterials</code> object
	 *  @since 1.5r1
	 */
	public EssentialMaterials getEssentialMaterials() { 
		return (EssentialMaterials)getChild( InstrDTD.ACTIVITY_ESSENTIALMATERIALS);
	}

	/**
	 *  Removes the <code>EssentialMaterials</code> child element previously created by calling <code>setEssentialMaterials</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeEssentialMaterials() { 
		removeChild( InstrDTD.ACTIVITY_ESSENTIALMATERIALS );
	}

	/**
	 *  Gets the value of the <code>&lt;Title&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Descriptive name of the activity."</i><p>
	 *
	 *  @return The <code>Title</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getTitle() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_TITLE );
	}

	/**
	 *  Sets the value of the <code>&lt;Title&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Descriptive name of the activity."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setTitle( String value ) { 
		setFieldValue( InstrDTD.ACTIVITY_TITLE, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;Preamble&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description and context for the activity."</i><p>
	 *
	 *  @return The <code>Preamble</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getPreamble() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_PREAMBLE );
	}

	/**
	 *  Sets the value of the <code>&lt;Preamble&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description and context for the activity."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setPreamble( String value ) { 
		setFieldValue( InstrDTD.ACTIVITY_PREAMBLE, new SIFString( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;LearningObjectives&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the educational objective of the activity."</i><p>
	 *
	 *  @param value A <code>LearningObjectives</code> object
	 *  @since 1.5r1
	 */
	public void setLearningObjectives( LearningObjectives value ) { 
		removeChild( InstrDTD.ACTIVITY_LEARNINGOBJECTIVES );
		addChild( InstrDTD.ACTIVITY_LEARNINGOBJECTIVES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;LearningObjectives&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Description of the educational objective of the activity."</i><p>
	 *
	 *  @return A <code>LearningObjectives</code> object
	 *  @since 1.5r1
	 */
	public LearningObjectives getLearningObjectives() { 
		return (LearningObjectives)getChild( InstrDTD.ACTIVITY_LEARNINGOBJECTIVES);
	}

	/**
	 *  Removes the <code>LearningObjectives</code> child element previously created by calling <code>setLearningObjectives</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeLearningObjectives() { 
		removeChild( InstrDTD.ACTIVITY_LEARNINGOBJECTIVES );
	}

	/**
	 *  Sets the value of the <code>&lt;LearningStandards&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Link from activity to associated LearningStandardItem objects."</i><p>
	 *
	 *  @param value A <code>LearningStandards</code> object
	 *  @since 1.5r1
	 */
	public void setLearningStandards( LearningStandards value ) { 
		removeChild( InstrDTD.ACTIVITY_LEARNINGSTANDARDS );
		addChild( InstrDTD.ACTIVITY_LEARNINGSTANDARDS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;LearningStandards&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Link from activity to associated LearningStandardItem objects."</i><p>
	 *
	 *  @return A <code>LearningStandards</code> object
	 *  @since 1.5r1
	 */
	public LearningStandards getLearningStandards() { 
		return (LearningStandards)getChild( InstrDTD.ACTIVITY_LEARNINGSTANDARDS);
	}

	/**
	 *  Removes the <code>LearningStandards</code> child element previously created by calling <code>setLearningStandards</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeLearningStandards() { 
		removeChild( InstrDTD.ACTIVITY_LEARNINGSTANDARDS );
	}

	/**
	 *  Sets the value of the <code>&lt;SubjectArea&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Refer to section 5.1.30 SubjectArea."</i><p>
	 *
	 *  @param value A <code>SubjectArea</code> object
	 *  @since 1.5r1
	 */
	public void setSubjectArea( SubjectArea value ) { 
		removeChild( InstrDTD.ACTIVITY_SUBJECTAREA );
		addChild( InstrDTD.ACTIVITY_SUBJECTAREA, value);
	}

	/**
	 *  Sets the value of the <code>&lt;SubjectArea&gt;</code> child element.
	 *  This form of <code>setSubjectArea</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setSubjectArea</code>
	 *  that accepts a single <code>SubjectArea</code> object.
	 *
	 *  @param code The subject area code (i.e. the first two digits of the course classification code)
	 *  @since 1.5r1
	 */
	public void setSubjectArea( String code ) {
		removeChild( InstrDTD.ACTIVITY_SUBJECTAREA);
		addChild( InstrDTD.ACTIVITY_SUBJECTAREA, new SubjectArea( code ) );
	}

	/**
	 *  Gets the value of the <code>&lt;SubjectArea&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Refer to section 5.1.30 SubjectArea."</i><p>
	 *
	 *  @return A <code>SubjectArea</code> object
	 *  @since 1.5r1
	 */
	public SubjectArea getSubjectArea() { 
		return (SubjectArea)getChild( InstrDTD.ACTIVITY_SUBJECTAREA);
	}

	/**
	 *  Removes the <code>SubjectArea</code> child element previously created by calling <code>setSubjectArea</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeSubjectArea() { 
		removeChild( InstrDTD.ACTIVITY_SUBJECTAREA );
	}

	/**
	 *  Sets the value of the <code>&lt;Prerequisites&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Skills or competencies the student must have to engage in activity."</i><p>
	 *
	 *  @param value A <code>Prerequisites</code> object
	 *  @since 1.5r1
	 */
	public void setPrerequisites( Prerequisites value ) { 
		removeChild( InstrDTD.ACTIVITY_PREREQUISITES );
		addChild( InstrDTD.ACTIVITY_PREREQUISITES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;Prerequisites&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Skills or competencies the student must have to engage in activity."</i><p>
	 *
	 *  @return A <code>Prerequisites</code> object
	 *  @since 1.5r1
	 */
	public Prerequisites getPrerequisites() { 
		return (Prerequisites)getChild( InstrDTD.ACTIVITY_PREREQUISITES);
	}

	/**
	 *  Removes the <code>Prerequisites</code> child element previously created by calling <code>setPrerequisites</code>
	 *
	 *  @since 1.5r1
	 */
	public void removePrerequisites() { 
		removeChild( InstrDTD.ACTIVITY_PREREQUISITES );
	}

	/**
	 *  Sets the value of the <code>&lt;Students&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Link to any student or group or category of students that this activity is for."</i><p>
	 *
	 *  @param value A <code>Students</code> object
	 *  @since 1.5r1
	 */
	public void setStudents( Students value ) { 
		removeChild( InstrDTD.ACTIVITY_STUDENTS );
		addChild( InstrDTD.ACTIVITY_STUDENTS, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Students&gt;</code> child element.
	 *  This form of <code>setStudents</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setStudents</code>
	 *  that accepts a single <code>Students</code> object.
	 *
	 *  @param studentPersonalRefId GUID that identifies the student that this element refers to.
	 *  @since 1.5r1
	 */
	public void setStudents( StudentPersonalRefId studentPersonalRefId ) {
		removeChild( InstrDTD.ACTIVITY_STUDENTS);
		addChild( InstrDTD.ACTIVITY_STUDENTS, new Students( studentPersonalRefId ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Students&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Link to any student or group or category of students that this activity is for."</i><p>
	 *
	 *  @return A <code>Students</code> object
	 *  @since 1.5r1
	 */
	public Students getStudents() { 
		return (Students)getChild( InstrDTD.ACTIVITY_STUDENTS);
	}

	/**
	 *  Removes the <code>Students</code> child element previously created by calling <code>setStudents</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeStudents() { 
		removeChild( InstrDTD.ACTIVITY_STUDENTS );
	}

	/**
	 *  Sets the value of the <code>&lt;SourceObjects&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID assigned to the source object.  The source object is the "thing" being assigned to a student."</i><p>
	 *
	 *  @param value A <code>SourceObjects</code> object
	 *  @since 1.5r1
	 */
	public void setSourceObjects( SourceObjects value ) { 
		removeChild( InstrDTD.ACTIVITY_SOURCEOBJECTS );
		addChild( InstrDTD.ACTIVITY_SOURCEOBJECTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SourceObjects&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"GUID assigned to the source object.  The source object is the "thing" being assigned to a student."</i><p>
	 *
	 *  @return A <code>SourceObjects</code> object
	 *  @since 1.5r1
	 */
	public SourceObjects getSourceObjects() { 
		return (SourceObjects)getChild( InstrDTD.ACTIVITY_SOURCEOBJECTS);
	}

	/**
	 *  Removes the <code>SourceObjects</code> child element previously created by calling <code>setSourceObjects</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeSourceObjects() { 
		removeChild( InstrDTD.ACTIVITY_SOURCEOBJECTS );
	}

	/**
	 *  Gets the value of the <code>&lt;Points&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Number of possible points for an activity."</i><p>
	 *
	 *  @return The <code>Points</code> element of this object.
	 *  @since 1.5r1
	 */
	public Integer getPoints() { 
		return (Integer) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_POINTS );
	}

	/**
	 *  Sets the value of the <code>&lt;Points&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Number of possible points for an activity."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 1.5r1
	 */
	public void setPoints( Integer value ) { 
		setFieldValue( InstrDTD.ACTIVITY_POINTS, new SIFInt( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;ActivityTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time structures for the activity."</i><p>
	 *
	 *  @param value A <code>ActivityTime</code> object
	 *  @since 1.5r1
	 */
	public void setActivityTime( ActivityTime value ) { 
		removeChild( InstrDTD.ACTIVITY_ACTIVITYTIME );
		addChild( InstrDTD.ACTIVITY_ACTIVITYTIME, value);
	}

	/**
	 *  Sets the value of the <code>&lt;ActivityTime&gt;</code> child element.
	 *  This form of <code>setActivityTime</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setActivityTime</code>
	 *  that accepts a single <code>ActivityTime</code> object.
	 *
	 *  @param creationDate Creation date of the activity.
	 *  @since 1.5r1
	 */
	public void setActivityTime( Calendar creationDate ) {
		removeChild( InstrDTD.ACTIVITY_ACTIVITYTIME);
		addChild( InstrDTD.ACTIVITY_ACTIVITYTIME, new ActivityTime( creationDate ) );
	}

	/**
	 *  Gets the value of the <code>&lt;ActivityTime&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Time structures for the activity."</i><p>
	 *
	 *  @return An <code>ActivityTime</code> object
	 *  @since 1.5r1
	 */
	public ActivityTime getActivityTime() { 
		return (ActivityTime)getChild( InstrDTD.ACTIVITY_ACTIVITYTIME);
	}

	/**
	 *  Removes the <code>ActivityTime</code> child element previously created by calling <code>setActivityTime</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeActivityTime() { 
		removeChild( InstrDTD.ACTIVITY_ACTIVITYTIME );
	}

	/**
	 *  Gets the value of the <code>&lt;AssessmentRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Link to the SIF Assessment object containing the evaluation information for this activity."</i><p>
	 *
	 *  @return The <code>AssessmentRefId</code> element of this object.
	 *  @since 1.5r1
	 */
	public String getAssessmentRefId() { 
		return (String) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_ASSESSMENTREFID );
	}

	/**
	 *  Sets the value of the <code>&lt;AssessmentRefId&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Link to the SIF Assessment object containing the evaluation information for this activity."</i><p>
	 *
	 *  @param value A <code>String</code> object
	 *  @since 1.5r1
	 */
	public void setAssessmentRefId( String value ) { 
		setFieldValue( InstrDTD.ACTIVITY_ASSESSMENTREFID, new SIFString( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;MaxAttemptsAllowed&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"How many tries allowed."</i><p>
	 *
	 *  @return The <code>MaxAttemptsAllowed</code> element of this object.
	 *  @since 1.5r1
	 */
	public Integer getMaxAttemptsAllowed() { 
		return (Integer) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_MAXATTEMPTSALLOWED );
	}

	/**
	 *  Sets the value of the <code>&lt;MaxAttemptsAllowed&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"How many tries allowed."</i><p>
	 *
	 *  @param value A <code>Integer</code> object
	 *  @since 1.5r1
	 */
	public void setMaxAttemptsAllowed( Integer value ) { 
		setFieldValue( InstrDTD.ACTIVITY_MAXATTEMPTSALLOWED, new SIFInt( value ), value );
	}

	/**
	 *  Gets the value of the <code>&lt;ActivityWeight&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The percentage weight of the activity during the particular course or term."</i><p>
	 *
	 *  @return The <code>ActivityWeight</code> element of this object.
	 *  @since 1.5r1
	 */
	public BigDecimal getActivityWeight() { 
		return (BigDecimal) getSIFSimpleFieldValue( InstrDTD.ACTIVITY_ACTIVITYWEIGHT );
	}

	/**
	 *  Sets the value of the <code>&lt;ActivityWeight&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"The percentage weight of the activity during the particular course or term."</i><p>
	 *
	 *  @param value A <code>BigDecimal</code> object
	 *  @since 1.5r1
	 */
	public void setActivityWeight( BigDecimal value ) { 
		setFieldValue( InstrDTD.ACTIVITY_ACTIVITYWEIGHT, new SIFDecimal( value ), value );
	}

	/**
	 *  Sets the value of the <code>&lt;Evaluation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Field for non-numeric types of grading and evaluation such as "narrative.""</i><p>
	 *
	 *  @param value A <code>Evaluation</code> object
	 *  @since 1.5r1
	 */
	public void setEvaluation( Evaluation value ) { 
		removeChild( InstrDTD.ACTIVITY_EVALUATION );
		addChild( InstrDTD.ACTIVITY_EVALUATION, value);
	}

	/**
	 *  Sets the value of the <code>&lt;Evaluation&gt;</code> child element.
	 *  This form of <code>setEvaluation</code> is provided as a convenience method
	 *  that is functionally equivalent to the version of <code>setEvaluation</code>
	 *  that accepts a single <code>Evaluation</code> object.
	 *
	 *  @param evaluationType A qualifer for what type of evaluation this is.  Valid values are "Inline" and "RefId".  Inline values are contained in the optional Description element, RefIds are contained in the AssessmentRefId element.
	 *  @since 1.5r1
	 */
	public void setEvaluation( EvaluationType evaluationType ) {
		removeChild( InstrDTD.ACTIVITY_EVALUATION);
		addChild( InstrDTD.ACTIVITY_EVALUATION, new Evaluation( evaluationType ) );
	}

	/**
	 *  Gets the value of the <code>&lt;Evaluation&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Field for non-numeric types of grading and evaluation such as "narrative.""</i><p>
	 *
	 *  @return An <code>Evaluation</code> object
	 *  @since 1.5r1
	 */
	public Evaluation getEvaluation() { 
		return (Evaluation)getChild( InstrDTD.ACTIVITY_EVALUATION);
	}

	/**
	 *  Removes the <code>Evaluation</code> child element previously created by calling <code>setEvaluation</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeEvaluation() { 
		removeChild( InstrDTD.ACTIVITY_EVALUATION );
	}

	/**
	 *  Sets the value of the <code>&lt;LearningResources&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A GUID reference to a SIF LearningResource object that support this activity"</i><p>
	 *
	 *  @param value A <code>LearningResources</code> object
	 *  @since 1.5r1
	 */
	public void setLearningResources( LearningResources value ) { 
		removeChild( InstrDTD.ACTIVITY_LEARNINGRESOURCES );
		addChild( InstrDTD.ACTIVITY_LEARNINGRESOURCES, value);
	}

	/**
	 *  Gets the value of the <code>&lt;LearningResources&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"A GUID reference to a SIF LearningResource object that support this activity"</i><p>
	 *
	 *  @return A <code>LearningResources</code> object
	 *  @since 1.5r1
	 */
	public LearningResources getLearningResources() { 
		return (LearningResources)getChild( InstrDTD.ACTIVITY_LEARNINGRESOURCES);
	}

	/**
	 *  Removes the <code>LearningResources</code> child element previously created by calling <code>setLearningResources</code>
	 *
	 *  @since 1.5r1
	 */
	public void removeLearningResources() { 
		removeChild( InstrDTD.ACTIVITY_LEARNINGRESOURCES );
	}

	/**
	 *  Sets the value of the <code>&lt;SoftwareRequirementList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains information about required software."</i><p>
	 *
	 *  @param value A <code>SoftwareRequirementList</code> object
	 *  @since 2.4
	 */
	public void setSoftwareRequirementList( SoftwareRequirementList value ) { 
		removeChild( InstrDTD.ACTIVITY_SOFTWAREREQUIREMENTLIST );
		addChild( InstrDTD.ACTIVITY_SOFTWAREREQUIREMENTLIST, value);
	}

	/**
	 *  Gets the value of the <code>&lt;SoftwareRequirementList&gt;</code> element.
	* <p> The SIF specification defines the meaning of this element as: 
	* <i>"Contains information about required software."</i><p>
	 *
	 *  @return A <code>SoftwareRequirementList</code> object
	 *  @since 2.4
	 */
	public SoftwareRequirementList getSoftwareRequirementList() { 
		return (SoftwareRequirementList)getChild( InstrDTD.ACTIVITY_SOFTWAREREQUIREMENTLIST);
	}

	/**
	 *  Removes the <code>SoftwareRequirementList</code> child element previously created by calling <code>setSoftwareRequirementList</code>
	 *
	 *  @since 2.4
	 */
	public void removeSoftwareRequirementList() { 
		removeChild( InstrDTD.ACTIVITY_SOFTWAREREQUIREMENTLIST );
	}

}
