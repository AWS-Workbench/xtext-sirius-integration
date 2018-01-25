/**
 */
package com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IXtext
 * Edge Label Direct Edit Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription#getEdgeLabelMappings
 * <em>Edge Label Mappings</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage#getIXtextEdgeLabelDirectEditDescription()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IXtextEdgeLabelDirectEditDescription extends IXtextDirectEditDescription {
	/**
	 * Returns the value of the '<em><b>Edge Label Mappings</b></em>' reference
	 * list. The list contents are of type
	 * {@link org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Label Mappings</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Edge Label Mappings</em>' reference list.
	 * @see com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage#getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings()
	 * @model
	 * @generated
	 */
	EList<BasicLabelStyleDescription> getEdgeLabelMappings();

} // IXtextEdgeLabelDirectEditDescription
