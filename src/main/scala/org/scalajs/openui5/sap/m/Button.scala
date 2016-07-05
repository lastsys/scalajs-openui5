package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}


@ScalaJSDefined
trait ButtonSettings extends ControlSettings
object ButtonSettings extends ButtonSettingsBuilder(noSettings)

class ButtonSettingsBuilder(val dict: SettingsMap)
  extends Settings[ButtonSettings, ButtonSettingsBuilder](new ButtonSettingsBuilder(_))
    with ButtonSetters[ButtonSettings, ButtonSettingsBuilder]

trait ButtonSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def text(v: String) = setting("text", v)
  def `type`(v: ButtonType) = setting("type", v)
  def width(v: CSSSize) = setting("width", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def icon(v: URI) = setting("icon", v)
  def iconFirst(v: Boolean) = setting("iconFirst", v)
  def activeIcon(v: Boolean) = setting("activeIcon", v)
  def iconDensityAware(v: Boolean) = setting("iconDensityAware", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)

  def tap(v: js.Function) = setting("tap", v)
  def press(v: js.Function) = setting("press", v)
}

@JSName("sap.m.Button")
@js.native
class Button(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[ButtonSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ButtonSettings) = this(js.undefined, settings)

  def setText(text: String): this.type = js.native
  def setEnabled(enabled: Boolean): this.type = js.native

  def attachPress(function: js.Function): this.type = js.native
}
