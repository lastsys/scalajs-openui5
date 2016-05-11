package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Wrapping}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TextAreaSettings extends InputBaseSettings
object TextAreaSettings extends TextAreaSettingsBuilder(noSettings)

class TextAreaSettingsBuilder(val dict: SettingsMap)
  extends Settings[TextAreaSettings, TextAreaSettingsBuilder](new TextAreaSettingsBuilder(_))
    with TextAreaSetters[TextAreaSettings, TextAreaSettingsBuilder]

trait TextAreaSetters[T <: js.Object, B <: Settings[T, _]] extends InputBaseSetters[T, B] {
  def rows(v: Int) = setting("rows", v)
  def cols(v: Int) = setting("cols", v)
  def height(v: CSSSize) = setting("height", v)
  def maxLength(v: Int) = setting("maxLength", v)
  def wrapping(v: Wrapping) = setting("wrapping", v)
  def valueLiveUpdate(v: Boolean) = setting("valueLiveMapping", v)

  def liveChange(v: js.Function) = setting("liveChange", v)
}

@JSName("sap.m.TextArea")
@js.native
class TextArea(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[TextAreaSettings] = js.native) extends InputBase {
  def this(id: String) = this(id, js.undefined)
  def this(settings: TextAreaSettings) = this(js.undefined, settings)
}
