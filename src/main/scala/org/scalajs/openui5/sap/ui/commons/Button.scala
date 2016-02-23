package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}


import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}


import scala.scalajs.js.|

@ScalaJSDefined
trait ButtonSettings extends ControlSettings
object ButtonSettings extends ButtonSettingsBuilder(noSettings)

class ButtonSettingsBuilder(val dict: SettingsMap)
  extends Settings[ButtonSettings, ButtonSettingsBuilder](new ButtonSettingsBuilder(_))
    with ButtonSetters[ButtonSettings, ButtonSettingsBuilder]

trait ButtonSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def text(v: String) = setting("text", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def width(v: CSSSize) = setting("width", v)
  def helpId(v: String) = setting("helpId", v)
  def icon(v: URI) = setting("icon", v)
  def iconHovered(v: URI) = setting("iconHovered", v)
  def iconSelected(v: URI) = setting("iconSelected", v)
  def iconFirst(v: Boolean) = setting("iconFirst", v)
  def height(v: CSSSize) = setting("height", v)
  def styled(v: Boolean) = setting("styled", v)
  def lite(v: Boolean) = setting("lite", v)
  def style(v: ButtonStyle) = setting("style", v)

  def press(v: (Event) ⇒ Unit) = setting("press", v)
  def press(v: js.Function) = setting("press", v)
}

@JSName("sap.ui.commons.Button")
@js.native
class Button(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[ButtonSettings|js.Any] = js.native)
  extends Control with ToolbarItem {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ButtonSettings) = this(js.undefined, settings)
  def this(settings: js.Any) = this(js.undefined, settings)

  /** Sets a new value for property icon.
    *
    * Icon to be displayed as graphical element within the button. This can be
    * an URI to an image or an icon font URI.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is "".
    *
    * @param icon new value for property icon
    * @return reference to this in order to allow method chaining
    */
  def setIcon(icon: String): this.type = js.native

  def attachPress(data: js.Any, function: js.Function,
                  listener: js.Any): this.type = js.native
  def attachPress(data: js.Any, function: js.Function): this.type = js.native
  def attachPress(function: js.Function,
                  listener: js.Any): this.type = js.native
  def attachPress(function: js.Function): this.type = js.native

  def setEnabled(enabled: Boolean): this.type = js.native
}
