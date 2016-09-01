// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.common;

import openadk.library.*;

/**
 *  Defines the set of values that can be specified whenever an ExitTypeCode
 *  is used as a parameter to a method or constructor. Alternatively, the static
 *  <code>wrap</code> method can be called to encapsulate any string value in
 *  an ExitTypeCode object.<p>
 *
 *  @author Generated by adkgen
 *  @version 2.7
 *  @since 1.1
 */
public class ExitTypeCode extends SIFEnum
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Not enrolled, eligible to return ("3502")
	 */
	public static final ExitTypeCode _3502_NOT_ENROLLED_ELIGIBLE_TO = new ExitTypeCode("3502");

	/**
	 *  Transferred to a private, non-religiously-affiliated school in a different state ("1912")
	 */
	public static final ExitTypeCode _1912_TRANSFERRED_PRIVATE_IN_COUNTRY = new ExitTypeCode("1912");

	/**
	 *  Transferred to home schooling ("1918")
	 */
	public static final ExitTypeCode _1918_TRANSFERRED_TO_HOME_SCHOOLING = new ExitTypeCode("1918");

	/**
	 *  Transferred to a private, non-religiously-affiliated school in the same local education agency ("1910")
	 */
	public static final ExitTypeCode _1910_TRANSFERRED_PRIVATE_IN_LEA = new ExitTypeCode("1910");

	/**
	 *  Not enrolled, unknown status ("1931")
	 */
	public static final ExitTypeCode _1931_NOT_ENROLLED_UNKNOWN = new ExitTypeCode("1931");

	/**
	 *  Student was expected to attend a school but did not enter as expected for unknown reasons (Removed in SIF 2.0) ("D09")
	 */
	public static final ExitTypeCode EXIT_D09 = new ExitTypeCode("D09");

	/**
	 *  Enrolled in a postsecondary early admission program, eligible to return ("1930")
	 */
	public static final ExitTypeCode _1930_ENROLLED_IN_A_POSTSECONDARY = new ExitTypeCode("1930");

	/**
	 *  Graduated (Removed in SIF 2.0) ("EB4")
	 */
	public static final ExitTypeCode EXIT_EB4 = new ExitTypeCode("EB4");

	/**
	 *  Promoted (Removed in SIF 2.0) ("D34")
	 */
	public static final ExitTypeCode EXIT_D34 = new ExitTypeCode("D34");

	/**
	 *  Withdrawn (use when reason for withdrawal is not among the other codes, or when reason cannot be determined) (Removed in SIF 2.0) ("EB3")
	 */
	public static final ExitTypeCode EXIT_EB3 = new ExitTypeCode("EB3");

	/**
	 *  Deceased (Removed in SIF 2.0) ("EB1")
	 */
	public static final ExitTypeCode EXIT_EB1 = new ExitTypeCode("EB1");

	/**
	 *  Transferred to an institution ("1917")
	 */
	public static final ExitTypeCode _1917_TRANSFERRED_TO_AN_INSTITUTION = new ExitTypeCode("1917");

	/**
	 *  Transferred to a private, religiously-affiliated school in a different state ("1915")
	 */
	public static final ExitTypeCode _1915_TRANSFERRED_RELIGEOUS_IN_COUNTRY = new ExitTypeCode("1915");

	/**
	 *  Transferred to a public school in a different state ("1909")
	 */
	public static final ExitTypeCode _1909_TRANSFERRED_DIFFERENT_STATE = new ExitTypeCode("1909");

	/**
	 *  Completed with a state-recognized equivalency certificate ("3509")
	 */
	public static final ExitTypeCode _3509_COMPLETED_WITH_A_STATE = new ExitTypeCode("3509");

	/**
	 *  Graduated with regular, advanced, International Baccalaureate, or other type of diploma ("1921")
	 */
	public static final ExitTypeCode _1921_GRADUATED_WITH_DEGREE = new ExitTypeCode("1921");

	/**
	 *  Enrolled in an adult education or training program ("3500")
	 */
	public static final ExitTypeCode _3500_ENROLLED_IN_AN_ADULT = new ExitTypeCode("3500");

	/**
	 *  Transferred to a private, non-religiously-affiliated school in a different local education agency in the same state ("1911")
	 */
	public static final ExitTypeCode _1911_TRANSFERRED_PRIVATE_IN_STATE = new ExitTypeCode("1911");

	/**
	 *  Student is in a charter school managed by the same local education agency ("3508")
	 */
	public static final ExitTypeCode _3508_STUDENT_IS_IN_A_CHARTER = new ExitTypeCode("3508");

	/**
	 *  Expelled or involuntarily withdrawn ("1925")
	 */
	public static final ExitTypeCode _1925_EXPELLED_OR_INVOLUNTARY = new ExitTypeCode("1925");

	/**
	 *  Status pending completion of summer school (K-12) (Removed in SIF 2.0) ("D29")
	 */
	public static final ExitTypeCode EXIT_D29 = new ExitTypeCode("D29");

	/**
	 *  Placed in a transitional program (K-12) (Removed in SIF 2.0) ("D28")
	 */
	public static final ExitTypeCode EXIT_D28 = new ExitTypeCode("D28");

	/**
	 *  Discontinued schooling ("1927")
	 */
	public static final ExitTypeCode _1927_DISCONTINUED_SCHOOLING = new ExitTypeCode("1927");

	/**
	 *  Retained in current grade (Removed in SIF 2.0) ("D26")
	 */
	public static final ExitTypeCode EXIT_D26 = new ExitTypeCode("D26");

	/**
	 *  Transferred to a public school in a different local education agency in the same state ("1908")
	 */
	public static final ExitTypeCode _1908_TRANSFERRED_IN_STATE = new ExitTypeCode("1908");

	/**
	 *  Student is in the same local education agency and receiving education services, but is not assigned to a particular school ("3499")
	 */
	public static final ExitTypeCode _3499_STUDENT_IS_IN_THE_SAME_LOCAL = new ExitTypeCode("3499");

	/**
	 *  Completed a state-recognized vocational education program ("3501")
	 */
	public static final ExitTypeCode _3501_COMPLETED_A_STATE_RECOGNIZED = new ExitTypeCode("3501");

	/**
	 *  Student withdrew from school due to hardship (Removed in SIF 2.0) ("D21")
	 */
	public static final ExitTypeCode EXIT_D21 = new ExitTypeCode("D21");

	/**
	 *  Died or is permanently incapacitated ("1923")
	 */
	public static final ExitTypeCode _1923_DIED_OR_INCAPACITATED = new ExitTypeCode("1923");

	/**
	 *  Student withdrew to attend a non-Public School or Home Education Program in or out of state (Removed in SIF 2.0) ("D20")
	 */
	public static final ExitTypeCode EXIT_D20 = new ExitTypeCode("D20");

	/**
	 *  Transferred to a charter school ("1919")
	 */
	public static final ExitTypeCode _1919_TRANSFERRED_TO_A_CHARTER = new ExitTypeCode("1919");

	/**
	 *  Exited ("3505")
	 */
	public static final ExitTypeCode _3505_EXITED = new ExitTypeCode("3505");

	/**
	 *  Student is in a different public school in the same local education agency ("1907")
	 */
	public static final ExitTypeCode _1907_TRANSFERRED_IN_LEA = new ExitTypeCode("1907");

	/**
	 *  Transferred to a private, religiously-affiliated school in a different local education agency in the same state ("1914")
	 */
	public static final ExitTypeCode _1914_TRANSFERRED_RELIGEOUS_IN_STATE = new ExitTypeCode("1914");

	/**
	 *  Student is Expelled (Pre-K through Grade 12) (Removed in SIF 2.0) ("B29")
	 */
	public static final ExitTypeCode EXIT_B29 = new ExitTypeCode("B29");

	/**
	 *  Student is on Suspension or Dismissal (Removed in SIF 2.0) ("B28")
	 */
	public static final ExitTypeCode EXIT_B28 = new ExitTypeCode("B28");

	/**
	 *  Completed school with other credentials ("1922")
	 */
	public static final ExitTypeCode _1922_COMPLETED_SCHOOL_WITH_OTHER = new ExitTypeCode("1922");

	/**
	 *  Transferred to a private, religiously-affiliated school in the same local education agency ("1913")
	 */
	public static final ExitTypeCode _1913_TRANSFERRED_RELIGEOUS_IN_LEA = new ExitTypeCode("1913");

	/**
	 *  Completed grade 12, but did not meet all graduation requirements ("1928")
	 */
	public static final ExitTypeCode _1928_COMPLETED_GRADE_12_NOT_GRADUATED = new ExitTypeCode("1928");

	/**
	 *  According to established regulations or statutes, the student is considered to be a 'dropout' (Removed in SIF 2.0) ("B52")
	 */
	public static final ExitTypeCode EXIT_B52 = new ExitTypeCode("B52");

	/**
	 *  Student who left school with a State General Education Development (GED) High School Diploma (Removed in SIF 2.0) ("D19")
	 */
	public static final ExitTypeCode EXIT_D19 = new ExitTypeCode("D19");

	/**
	 *  Student who left school with a special certificate of completion (Removed in SIF 2.0) ("D18")
	 */
	public static final ExitTypeCode EXIT_D18 = new ExitTypeCode("D18");

	/**
	 *  Withdrawn due to illness ("1924")
	 */
	public static final ExitTypeCode _1924_WITHDRAWN_ILLNESS = new ExitTypeCode("1924");

	/**
	 *  Student who left school with a certificate of completion (Removed in SIF 2.0) ("D17")
	 */
	public static final ExitTypeCode EXIT_D17 = new ExitTypeCode("D17");

	/**
	 *  Student who graduated from school with a special diploma (Removed in SIF 2.0) ("D16")
	 */
	public static final ExitTypeCode EXIT_D16 = new ExitTypeCode("D16");

	/**
	 *  Other  ("9999 ")
	 */
	public static final ExitTypeCode _9999_OTHER = new ExitTypeCode("9999 ");

	/**
	 *  Student who graduated from school with a standard diploma (Removed in SIF 2.0) ("D15")
	 */
	public static final ExitTypeCode EXIT_D15 = new ExitTypeCode("D15");

	/**
	 *  Student over compulsory attendance age who leaves school voluntarily with no intention of returning (Removed in SIF 2.0) ("D14")
	 */
	public static final ExitTypeCode EXIT_D14 = new ExitTypeCode("D14");

	/**
	 *  Student withdrew to attend another Public School in or out of state (Removed in SIF 2.0) ("D13")
	 */
	public static final ExitTypeCode EXIT_D13 = new ExitTypeCode("D13");

	/**
	 *  Reached maximum age for services ("1926")
	 */
	public static final ExitTypeCode _1926_REACHED_MAXIMUM_AGE = new ExitTypeCode("1926");

	/**
	 *  Student withdrew to attend another Public School in the same District (Removed in SIF 2.0) ("D12")
	 */
	public static final ExitTypeCode EXIT_D12 = new ExitTypeCode("D12");

	/**
	 *  Student was promoted, retained, or transferred to another School in the same District (Removed in SIF 2.0) ("D11")
	 */
	public static final ExitTypeCode EXIT_D11 = new ExitTypeCode("D11");

	/**
	 *  Student was promoted, retained, or transferred to another Attendance Reporting unit in the same School (Removed in SIF 2.0) ("D10")
	 */
	public static final ExitTypeCode EXIT_D10 = new ExitTypeCode("D10");

	/**
	 *  Transferred to a school outside of the country ("1916")
	 */
	public static final ExitTypeCode _1916_TRANSFERRED_OUT_OF_COUNTRY = new ExitTypeCode("1916");

	/**
	 *  Withdrawn from school, under the age for compulsory attendance; eligible to return ("3504")
	 */
	public static final ExitTypeCode _3504_WITHDRAWN_FROM_SCHOOL_UNDER = new ExitTypeCode("3504");

	/**
	 *  Enrolled in a foreign exchange program, eligible to return ("3503")
	 */
	public static final ExitTypeCode _3503_ENROLLED_IN_A_FOREIGN = new ExitTypeCode("3503");

	/**
	 *  Wrap an arbitrary string value in an ExitTypeCode object.
	 *  @param value The element/attribute value. This method does not verify
	 *      that the value is valid according to the SIF Specification.
	 */
	public static ExitTypeCode wrap( String value ) {
		return new ExitTypeCode( value );
	}

	private ExitTypeCode( String value ) {
		super(value);
	}
}
