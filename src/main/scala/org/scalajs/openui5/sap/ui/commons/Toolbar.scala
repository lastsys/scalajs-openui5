package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap
import org.scalajs.openui5.sap.ui.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait ToolbarSettings extends ControlSettings
object ToolbarSettings extends ToolbarSettingsBuilder[ToolbarSettings]
class ToolbarSettingsBuilder[T <: js.Object] extends ControlSettingsBuilder[T] {
  def width(v: CSSSize) = setting("width", v)
  def design(v: ToolbarDesign) = setting("design", v)
  def standalone(v: Boolean) = setting("standalone", v)

  def items(v: js.Array[ToolbarItem]) = setting("items", v)
  def rightItems(v: js.Array[ToolbarItem]) = setting("rightItems", v)
}


@JSName("sap.ui.commons.Toolbar")
@js.native
class Toolbar(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[ToolbarSettings])
  extends Control with sap.ui.core.Toolbar {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ToolbarSettings) = this(js.undefined, settings)
}
