// THIS FILE WAS AUTO-GENERATED BY ADKGEN -- DO NOT MODIFY!

//
// Copyright (c)1998-2011 Pearson Education, Inc. or its affiliate(s).
// All rights reserved.
//

package openadk.library.datamodel;

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
public class SIF_Metadata extends SIFElement
{
	private static final long serialVersionUID = Element.CURRENT_SERIALIZE_VERSION;
	/**
	 *  Constructor
	 */
	public SIF_Metadata() {
		super( DatamodelDTD.SIF_METADATA );
	}

	/**
	 *  Sets the value of the <code>&lt;TimeElements&gt;</code> element.
	 *
	 *  @param value A <code>TimeElements</code> object
	 *  @since 2.0
	 */
	public void setTimeElements( TimeElements value ) { 
		removeChild( DatamodelDTD.SIF_METADATA_TIMEELEMENTS );
		addChild( DatamodelDTD.SIF_METADATA_TIMEELEMENTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;TimeElements&gt;</code> element.
	 *
	 *  @return A <code>TimeElements</code> object
	 *  @since 2.0
	 */
	public TimeElements getTimeElements() { 
		return (TimeElements)getChild( DatamodelDTD.SIF_METADATA_TIMEELEMENTS);
	}

	/**
	 *  Removes the <code>TimeElements</code> child element previously created by calling <code>setTimeElements</code>
	 *
	 *  @since 2.0
	 */
	public void removeTimeElements() { 
		removeChild( DatamodelDTD.SIF_METADATA_TIMEELEMENTS );
	}

	/**
	 *  Sets the value of the <code>&lt;LifeCycle&gt;</code> element.
	 *
	 *  @param value A <code>LifeCycle</code> object
	 *  @since 2.0
	 */
	public void setLifeCycle( LifeCycle value ) { 
		removeChild( DatamodelDTD.SIF_METADATA_LIFECYCLE );
		addChild( DatamodelDTD.SIF_METADATA_LIFECYCLE, value);
	}

	/**
	 *  Gets the value of the <code>&lt;LifeCycle&gt;</code> element.
	 *
	 *  @return A <code>LifeCycle</code> object
	 *  @since 2.0
	 */
	public LifeCycle getLifeCycle() { 
		return (LifeCycle)getChild( DatamodelDTD.SIF_METADATA_LIFECYCLE);
	}

	/**
	 *  Removes the <code>LifeCycle</code> child element previously created by calling <code>setLifeCycle</code>
	 *
	 *  @since 2.0
	 */
	public void removeLifeCycle() { 
		removeChild( DatamodelDTD.SIF_METADATA_LIFECYCLE );
	}

	/**
	 *  Sets the value of the <code>&lt;RightsElements&gt;</code> element.
	 *
	 *  @param value A <code>RightsElements</code> object
	 *  @since 2.0
	 */
	public void setRightsElements( RightsElements value ) { 
		removeChild( DatamodelDTD.SIF_METADATA_RIGHTSELEMENTS );
		addChild( DatamodelDTD.SIF_METADATA_RIGHTSELEMENTS, value);
	}

	/**
	 *  Gets the value of the <code>&lt;RightsElements&gt;</code> element.
	 *
	 *  @return A <code>RightsElements</code> object
	 *  @since 2.0
	 */
	public RightsElements getRightsElements() { 
		return (RightsElements)getChild( DatamodelDTD.SIF_METADATA_RIGHTSELEMENTS);
	}

	/**
	 *  Removes the <code>RightsElements</code> child element previously created by calling <code>setRightsElements</code>
	 *
	 *  @since 2.0
	 */
	public void removeRightsElements() { 
		removeChild( DatamodelDTD.SIF_METADATA_RIGHTSELEMENTS );
	}

	/**
	 *  Sets the value of the <code>&lt;EducationFilter&gt;</code> element.
	 *
	 *  @param value A <code>EducationFilter</code> object
	 *  @since 2.1
	 */
	public void setEducationFilter( EducationFilter value ) { 
		removeChild( DatamodelDTD.SIF_METADATA_EDUCATIONFILTER );
		addChild( DatamodelDTD.SIF_METADATA_EDUCATIONFILTER, value);
	}

	/**
	 *  Gets the value of the <code>&lt;EducationFilter&gt;</code> element.
	 *
	 *  @return An <code>EducationFilter</code> object
	 *  @since 2.1
	 */
	public EducationFilter getEducationFilter() { 
		return (EducationFilter)getChild( DatamodelDTD.SIF_METADATA_EDUCATIONFILTER);
	}

	/**
	 *  Removes the <code>EducationFilter</code> child element previously created by calling <code>setEducationFilter</code>
	 *
	 *  @since 2.1
	 */
	public void removeEducationFilter() { 
		removeChild( DatamodelDTD.SIF_METADATA_EDUCATIONFILTER );
	}

}