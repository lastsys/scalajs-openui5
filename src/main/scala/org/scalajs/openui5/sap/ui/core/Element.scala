package org.scalajs.openui5.sap.ui.core

import org.scalajs.dom
import org.scalajs.openui5.sap.ui.base.{ManagedObjectSettingsBuilder, ManagedObject, ManagedObjectSettings}
import org.scalajs.openui5.util.SettingsBuilder

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scala.scalajs.js.|

@ScalaJSDefined
trait ElementSettings extends ManagedObjectSettings
object ElementSettings extends ElementSettingsBuilder[ElementSettings]
class ElementSettingsBuilder[T <: js.Object] extends
  ManagedObjectSettingsBuilder[T] {
  def tooltip(v: String|TooltipBase) = setting("tooltip", v)
  def customData(v: js.Array[CustomData]) = setting("customData", v)
  def layoutData(v: LayoutData) = setting("layoutData", v)
  def dependents(v: js.Array[Control]) = setting("dependents", v)
}

/** Base Class for Elements. */
@JSName("sap.ui.core.Element")
@js.native
class Element(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[ElementSettings] = js.native)
  extends ManagedObject {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ElementSettings) = this(js.undefined, settings)

  /** Sets a new tooltip for this object.
    *
    * The tooltip can either be a simple string (which in most cases will be
    * rendered as the title attribute of this Element) or an instance of
    * [[TooltipBase]].
    *
    * If a new tooltip is set, any previously set tooltip is deactivated.
    *
    * @param tooltip tooltip to set
    */
  def setTooltip(tooltip: String | TooltipBase): this.type = js.native

  /** Returns the tooltip for this element if any or an undefined value. The
    * tooltip can either be a simple string or a subclass of
    * sap.ui.core.TooltipBase.
    *
    * Callers that are only interested in tooltips of type string (e.g. to
    * render them as a title attribute), should call the convenience method
    * #getTooltip_AsString instead. If they want to get a tooltip text no
    * matter where it comes from (be it a string tooltip or the text from a
    * TooltipBase instance) then they could call #getTooltip_Text instead.
    *
    * @return tooltip for this [[Element]].
    */
  def getTooltip(): String /*| TooltipBase*/ = js.native

  /** Returns the best suitable DOM Element that represents this UI5 Element.
    * By default the DOM Element with the same ID as this Element is
    * returned. Subclasses should override this method if the lookup via id
    * is not sufficient.
    *
    * Note that such a DOM Element does not necessarily exist in all cases.
    * Some elements or controls might not have a DOM representation at all
    * (e.g. a naive FlowLayout) while others might not have one due to their
    * current state (e.g. an initial, not yet rendered control).
    *
    * If an ID suffix is given, the ID of this Element is concatenated with the
    * suffix (separated by a single dash) and the DOM node with that compound
    * ID will be returned. This matches the UI5 naming convention for named
    * inner DOM nodes of a control.
    *
    * @param suffix ID suffix to get the DOMRef for
    * @return The Element's DOM Element, sub DOM element, or null
    */
  def getDomRef(suffix: js.UndefOr[String] = js.undefined): js.UndefOr[dom.Element] = js.native

  /** Returns the DOM Element that should get the focus.
    *
    * To be overwritten by the specific control method.
    *
    * @return	Returns the DOM Element that should get the focus
    */
  def getFocusDomRef(): dom.Element = js.native
}
