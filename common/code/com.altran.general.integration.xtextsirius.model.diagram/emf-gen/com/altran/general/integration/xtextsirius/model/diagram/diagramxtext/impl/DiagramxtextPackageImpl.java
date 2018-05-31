/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.impl;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.diagram.DiagramPackage;

import org.eclipse.sirius.diagram.description.concern.ConcernPackage;

import org.eclipse.sirius.diagram.description.filter.FilterPackage;

import org.eclipse.sirius.diagram.description.tool.ToolPackage;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

import org.eclipse.sirius.viewpoint.description.DescriptionPackage;

import org.eclipse.sirius.viewpoint.description.style.StylePackage;

import org.eclipse.sirius.viewpoint.description.validation.ValidationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DiagramxtextPackageImpl extends EPackageImpl implements DiagramxtextPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aXtextDirectEditLabelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextDirectEditModelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtextDirectEditValueDescriptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramxtextPackageImpl() {
		super(eNS_URI, DiagramxtextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link DiagramxtextPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramxtextPackage init() {
		if (isInited)
			return (DiagramxtextPackage) EPackage.Registry.INSTANCE.getEPackage(DiagramxtextPackage.eNS_URI);

		// Obtain or create and register package
		DiagramxtextPackageImpl theDiagramxtextPackage = (DiagramxtextPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DiagramxtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new DiagramxtextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ToolPackage.eINSTANCE.eClass();
		DescriptionPackage.eINSTANCE.eClass();
		org.eclipse.sirius.viewpoint.description.tool.ToolPackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.DescriptionPackage.eINSTANCE.eClass();
		XtextsiriusPackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		StylePackage.eINSTANCE.eClass();
		FilterPackage.eINSTANCE.eClass();
		ConcernPackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();
		org.eclipse.sirius.diagram.description.style.StylePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDiagramxtextPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramxtextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagramxtextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramxtextPackage.eNS_URI, theDiagramxtextPackage);
		return theDiagramxtextPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAXtextDirectEditLabel() {
		return aXtextDirectEditLabelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextDirectEditModelDescription() {
		return xtextDirectEditModelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXtextDirectEditValueDescription() {
		return xtextDirectEditValueDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramxtextFactory getDiagramxtextFactory() {
		return (DiagramxtextFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		aXtextDirectEditLabelEClass = createEClass(AXTEXT_DIRECT_EDIT_LABEL);

		xtextDirectEditModelDescriptionEClass = createEClass(XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION);

		xtextDirectEditValueDescriptionEClass = createEClass(XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ToolPackage theToolPackage = (ToolPackage) EPackage.Registry.INSTANCE.getEPackage(ToolPackage.eNS_URI);
		org.eclipse.sirius.diagram.description.DescriptionPackage theDescriptionPackage_1 = (org.eclipse.sirius.diagram.description.DescriptionPackage) EPackage.Registry.INSTANCE
				.getEPackage(org.eclipse.sirius.diagram.description.DescriptionPackage.eNS_URI);
		XtextsiriusPackage theXtextsiriusPackage = (XtextsiriusPackage) EPackage.Registry.INSTANCE
				.getEPackage(XtextsiriusPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aXtextDirectEditLabelEClass.getESuperTypes().add(theToolPackage.getDirectEditLabel());
		xtextDirectEditModelDescriptionEClass.getESuperTypes().add(this.getAXtextDirectEditLabel());
		xtextDirectEditModelDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditModelDescription());
		xtextDirectEditValueDescriptionEClass.getESuperTypes().add(this.getAXtextDirectEditLabel());
		xtextDirectEditValueDescriptionEClass.getESuperTypes()
				.add(theXtextsiriusPackage.getIXtextDirectEditValueDescription());

		// Initialize classes and features; add operations and parameters
		initEClass(aXtextDirectEditLabelEClass, AXtextDirectEditLabel.class, "AXtextDirectEditLabel", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(aXtextDirectEditLabelEClass, theDescriptionPackage_1.getDiagramElementMapping(), "getMapping", 0,
				-1, !IS_UNIQUE, IS_ORDERED);

		initEClass(xtextDirectEditModelDescriptionEClass, XtextDirectEditModelDescription.class,
				"XtextDirectEditModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xtextDirectEditValueDescriptionEClass, XtextDirectEditValueDescription.class,
				"XtextDirectEditValueDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(aXtextDirectEditLabelEClass.getEOperations().get(0), source, new String[] { "body",
				"final <%org.eclipse.emf.ecore.resource.Resource%> r = this.eResource();\nif ((r == null))\n{\n\tthrow new <%java.lang.UnsupportedOperationException%>();\n}\nfinal <%org.eclipse.emf.ecore.util.ECrossReferenceAdapter%> crossReferencer = <%org.eclipse.emf.ecore.util.ECrossReferenceAdapter%>.getCrossReferenceAdapter(r);\nif ((crossReferencer == null))\n{\n\tthrow new <%java.lang.UnsupportedOperationException%>();\n}\nfinal <%java.util.ArrayList%><<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>> diagramElementMappings = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>>newArrayList();\nfinal <%java.util.Collection%><<%org.eclipse.emf.ecore.EStructuralFeature.Setting%>> settings = crossReferencer.getInverseReferences(this, true);\nfor (final <%org.eclipse.emf.ecore.EStructuralFeature.Setting%> setting : settings)\n{\n\t{\n\t\tfinal <%org.eclipse.emf.ecore.EObject%> eReferencer = setting.getEObject();\n\t\tfinal <%org.eclipse.emf.ecore.EStructuralFeature%> eFeature = setting.getEStructuralFeature();\n\t\tif (((eReferencer instanceof <%org.eclipse.sirius.diagram.description.DiagramElementMapping%>) && <%com.google.common.base.Objects%>.equal(eFeature, <%org.eclipse.sirius.diagram.description.DescriptionPackage%>.eINSTANCE.getDiagramElementMapping_LabelDirectEdit())))\n\t\t{\n\t\t\tdiagramElementMappings.add(((<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>) eReferencer));\n\t\t}\n\t}\n}\nreturn new <%org.eclipse.emf.common.util.BasicEList%><<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>>(diagramElementMappings);" });
		addAnnotation(xtextDirectEditModelDescriptionEClass, source, new String[] { "image", "true" });
		addAnnotation(xtextDirectEditValueDescriptionEClass, source, new String[] { "image", "true" });
	}

} // DiagramxtextPackageImpl
