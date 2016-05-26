package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait LabelSettings extends ControlSettings
object LabelSettings extends LabelSettingsBuilder(noSettings)

class LabelSettingsBuilder(val dict: SettingsMap)
  extends Settings[LabelSettings, LabelSettingsBuilder](new LabelSettingsBuilder(_))
    with LabelSetters[LabelSettings, LabelSettingsBuilder]

trait LabelSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def design(v: LabelDesign) = setting("design", v)
  def text(v: String) = setting("text", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def width(v: CSSSize) = setting("width", v)
  def required(v: Boolean) = setting("required", v)
}

@JSName("sap.m.Label")
@js.native
class Label(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[LabelSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: LabelSettings) = this(js.undefined, settings)
}
