/**
 * generated by Xtext 2.9.1
 */
package nl.altran.example.xtext.html.htmlLang.util;

import nl.altran.example.xtext.html.htmlLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.altran.example.xtext.html.htmlLang.HtmlLangPackage
 * @generated
 */
public class HtmlLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HtmlLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HtmlLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HtmlLangSwitch<Adapter> modelSwitch =
    new HtmlLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseHtml(Html object)
      {
        return createHtmlAdapter();
      }
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter caseTitle(Title object)
      {
        return createTitleAdapter();
      }
      @Override
      public Adapter caseStyle(Style object)
      {
        return createStyleAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseBodyContents(BodyContents object)
      {
        return createBodyContentsAdapter();
      }
      @Override
      public Adapter caseParagraph(Paragraph object)
      {
        return createParagraphAdapter();
      }
      @Override
      public Adapter caseUnorderedList(UnorderedList object)
      {
        return createUnorderedListAdapter();
      }
      @Override
      public Adapter caseListItem(ListItem object)
      {
        return createListItemAdapter();
      }
      @Override
      public Adapter caseTextElement(TextElement object)
      {
        return createTextElementAdapter();
      }
      @Override
      public Adapter caseFreeformText(FreeformText object)
      {
        return createFreeformTextAdapter();
      }
      @Override
      public Adapter caseBold(Bold object)
      {
        return createBoldAdapter();
      }
      @Override
      public Adapter caseItalics(Italics object)
      {
        return createItalicsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Html <em>Html</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Html
   * @generated
   */
  public Adapter createHtmlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Title
   * @generated
   */
  public Adapter createTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Style
   * @generated
   */
  public Adapter createStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.BodyContents <em>Body Contents</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.BodyContents
   * @generated
   */
  public Adapter createBodyContentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Paragraph <em>Paragraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Paragraph
   * @generated
   */
  public Adapter createParagraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.UnorderedList <em>Unordered List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.UnorderedList
   * @generated
   */
  public Adapter createUnorderedListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.ListItem
   * @generated
   */
  public Adapter createListItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.TextElement <em>Text Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.TextElement
   * @generated
   */
  public Adapter createTextElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.FreeformText <em>Freeform Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.FreeformText
   * @generated
   */
  public Adapter createFreeformTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Bold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Bold
   * @generated
   */
  public Adapter createBoldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.altran.example.xtext.html.htmlLang.Italics <em>Italics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.altran.example.xtext.html.htmlLang.Italics
   * @generated
   */
  public Adapter createItalicsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HtmlLangAdapterFactory
