package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.util.SettingsBuilder
import org.scalajs.openui5.util.SettingsBuilder.builder2Settings

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scala.scalajs.js.|

@ScalaJSDefined
trait ControlSettings extends ElementSettings
object ControlSettings extends ControlSettingsBuilder[ControlSettings]
class ControlSettingsBuilder[T <: js.Object] extends
  ElementSettingsBuilder[T] {
  def busy(v: Boolean) = setting("busy", v)
  def busyIndicatorDelay(v: Int) = setting("busyIndicatorDelay", v)
  def visible(v: Boolean) = setting("visible", v)
  def fieldGroupIds(v: js.Array[String]) = setting("fieldGroupIds", v)

  def validateFieldGroup(v: (Event) ⇒ Unit) = setting("validateFieldGroup", v)
}

/** Base Class for Controls. */
@JSName("sap.ui.core.Control")
@js.native
class Control extends Element {
  def addStyleClass(styleClass: String): this.type = js.native
  def removeStyleClass(styleClass: String): this.type = js.native
  def setBusy(busy: Boolean): this.type = js.native
  def setVisible(visible: Boolean): this.type = js.native

  /** Puts this control into the specified container (oRef) at the given
    * position (oPosition).
    * First it is checked whether oRef is a container element / control (has a
    * multiple aggregation with type sap.ui.core.Control and name 'content') or
    * is an Id String of such an container. If this is not the case oRef can
    * either be a Dom Reference or Id String of the UIArea (if it does not yet
    * exist implicitly a new UIArea is created),
    *
    * The oPosition can be one of the following:
    *
    *  - "first": The control is added as the first element to the container.
    *  - "last": The control is added as the last element to the container
    *    (default).
    *  - "only": All existing children of the container are removed (not
    *    destroyed!) and the control is added as new child.
    *  - index: The control is added at the specified index to the container.
    *
    * @param ref container into which the control should be put
    * @param position Describes the position where the control should be put
    *                 into the container
    * @return returns this to allow method chaining
    */
  def placeAt(ref: String | Element | Control,
              position: js.UndefOr[String | Int] = js.native): this.type = js.native
}

@JSName("sap.ui.core.Control")
@js.native
object Control extends Element {
  def extend(className: String): js.Any = js.native
  def extend(className: String, classInfo: js.Any): js.Any = js.native
  def extend(className: String, metaImpl: js.Function): js.Any = js.native
  def extend(className: String, classInfo: js.Any,
             metaImpl: js.Function): js.Any = js.native
}
