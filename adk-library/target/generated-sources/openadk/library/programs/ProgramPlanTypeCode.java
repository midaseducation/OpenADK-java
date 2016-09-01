// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.programs;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever a ProgramPlanTypeCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  a ProgramPlanTypeCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 2.0
 */
public class ProgramPlanTypeCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Individualized transition plan ("S005")
	 */
	public static final ProgramPlanTypeCode INDIVIDUALIZED_TRANSITION = new ProgramPlanTypeCode("S005");

	/**
	 *  Student intervention / support plan ("S002")
	 */
	public static final ProgramPlanTypeCode STUDENT_INTERVENTION = new ProgramPlanTypeCode("S002");

	/**
	 *  Other ("9999")
	 */
	public static final ProgramPlanTypeCode OTHER = new ProgramPlanTypeCode("9999");

	/**
	 *  Services plan ("S006")
	 */
	public static final ProgramPlanTypeCode SERVICES_PLAN = new ProgramPlanTypeCode("S006");

	/**
	 *  Individualized education program (IEP) ("2196")
	 */
	public static final ProgramPlanTypeCode INDIVIDUALIZED_EDUCATION = new ProgramPlanTypeCode("2196");

	/**
	 *  Literacy plan ("S004")
	 */
	public static final ProgramPlanTypeCode LITERACY_PLAN = new ProgramPlanTypeCode("S004");

	/**
	 *  GIEP - Individualized education program for gifted student ("S003")
	 */
	public static final ProgramPlanTypeCode GIEP_INDIVIDUALIZED = new ProgramPlanTypeCode("S003");

	/**
	 *  Individualized family service plan (IFSP) ("2198")
	 */
	public static final ProgramPlanTypeCode INDIVIDUALIZED_FAMILY_SERVICE = new ProgramPlanTypeCode("2198");

	/**
	 *  Individualized learning program (ILP) ("2197")
	 */
	public static final ProgramPlanTypeCode INDIVIDUALIZED_LEARNING = new ProgramPlanTypeCode("2197");

	/**
	 *  504 plan ("S001")
	 */
	public static final ProgramPlanTypeCode _504_PLAN = new ProgramPlanTypeCode("S001");

	/**
	 *  Wrap an arbitrary string value in a ProgramPlanTypeCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ProgramPlanTypeCode wrap( String value ) {
		return new ProgramPlanTypeCode( value );
	}

	private ProgramPlanTypeCode( String value ) {
		super(value);
	}
}