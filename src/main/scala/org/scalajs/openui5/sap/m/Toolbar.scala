package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.sap.ui.unified.Menu
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ToolbarSettings extends ControlSettings
object ToolbarSettings extends ToolbarSettingsBuilder(noSettings)

class ToolbarSettingsBuilder(val dict: SettingsMap)
  extends Settings[ToolbarSettings, ToolbarSettingsBuilder](new ToolbarSettingsBuilder(_))
    with ToolbarSetters[ToolbarSettings, ToolbarSettingsBuilder]

trait ToolbarSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def width(v: CSSSize) = setting("width", v)
  def active(v: Boolean) = setting("active", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def height(v: CSSSize) = setting("height", v)
  def design(v: ToolbarDesign) = setting("design", v)

  def content(v: js.Array[Control]) = setting("content", v)

  def press(v: js.Function) = setting("press", v)
}

/** Common Control control that opens a menu when clicked by the user. The
  * control provides an API for configuring the docking position of the menu.
  */
@JSName("sap.m.Toolbar")
@js.native
class Toolbar(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[ToolbarSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: ToolbarSettings) = this(js.undefined, settings)
}
