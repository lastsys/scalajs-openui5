package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.sap.ui.commons.enums.BorderDesign
import org.scalajs.openui5.sap.ui.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait DialogSettings extends ControlSettings
object DialogSettings extends DialogSettingsBuilder[DialogSettings]
class DialogSettingsBuilder[T <: js.Object] extends ControlSettingsBuilder[T] {
  def width(v: CSSSize) = setting("width", v)
  def height(v: CSSSize) = setting("height", v)
  def scrollLeft(v: Int) = setting("scrollLeft", v)
  def scrollTop(v: Int) = setting("scrollTop", v)
  def title(v: String) = setting("title", v)
  def applyContentPadding(v: Boolean) = setting("applyContentPadding", v)
  def showCloseButton(v: Boolean) = setting("showCloseButton", v)
  def resizable(v: Boolean) = setting("resizable", v)
  def minWidth(v: CSSSize) = setting("minWidth", v)
  def minHeight(v: CSSSize) = setting("minHeight", v)
  def maxWidth(v: CSSSize) = setting("maxWidth", v)
  def maxHeight(v: CSSSize) = setting("maxHeight", v)
  def contentBorderDesign(v: BorderDesign) = setting("contentBorderDesign", v)
  def modal(v: Boolean) = setting("modal", v)
  def accessibleRole(v: AccessibleRole) = setting("accessibleRole", v)
  def keepInWindow(v: Boolean) = setting("keepInWindow", v)
  def autoClose(v: Boolean) = setting("autoClose", v)

  def buttons(v: js.Array[Control]) = setting("buttons", v)
  def content(v: js.Array[Control]) = setting("content", v)

  def closed(v: (Event) ⇒ Unit) = setting("closed", v)
}

/** An interactive window appearing on request displaying information to the
  * user. The API supports features such as popups with fixed sizes, popups
  * with unlimited width, scrolling bars for large windows, and control
  * nesting (for example, a drop-down list can be included in the window).
  */
@JSName("sap.ui.commons.Dialog")
@js.native
class Dialog(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[DialogSettings] = js.native)
  extends Control with PopupInterface  {

  def this(id: String) = this(id, js.undefined)
  def this(settings: DialogSettings) = this(js.undefined, settings)

  /** Adds some content to the aggregation content.
    *
    * @param content the content to add; if emtpy, nothing is inserted
    * @return reference to this in order to allow method chaining
    */
  def addContent(content: Control): this.type = js.native

  /** Closes the dialog control instance. */
  def close(): Unit = js.native

  /** Opens the dialog control instance. */
  def open(): Unit = js.native
}
