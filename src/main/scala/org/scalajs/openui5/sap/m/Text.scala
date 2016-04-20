package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TextSettings extends ControlSettings
object TextSettings extends TextSettingsBuilder(noSettings)

class TextSettingsBuilder(val dict: SettingsMap)
  extends Settings[TextSettings, TextSettingsBuilder](new TextSettingsBuilder(_))
    with TextSetters[TextSettings, TextSettingsBuilder]

trait TextSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def text(v: String) = setting("text", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def wrapping(v: Boolean) = setting("wrapping", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def width(v: CSSSize) = setting("width", v)
  def maxLines(v: Int) = setting("maxLines", v)
}

@JSName("sap.m.Text")
@js.native
class Text(id: js.UndefOr[String] = js.native,
           settings: js.UndefOr[TextSettings])
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TextSettings) = this(js.undefined, settings)

  def setEnabled(enabled: Boolean): this.type = js.native
}

