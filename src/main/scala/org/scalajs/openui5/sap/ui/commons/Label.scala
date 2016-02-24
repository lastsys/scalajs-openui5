package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}
import org.scalajs.openui5.sap.ui.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait LabelSettings extends ControlSettings
object LabelSettings extends LabelSettingsBuilder(noSettings)

class LabelSettingsBuilder(val dict: SettingsMap)
  extends Settings[LabelSettings, LabelSettingsBuilder](new LabelSettingsBuilder(_))
    with LabelSetters[LabelSettings, LabelSettingsBuilder]

trait LabelSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def design(v: LabelDesign) = setting("design", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def wrapping(v: Boolean) = setting("wrapping", v)
  def width(v: CSSSize) = setting("width", v)
  def text(v: String) = setting("text", v)
  def icon(v: URI) = setting("icon", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def required(v: Boolean) = setting("required", v)
  def requiredAtBegin(v: Boolean) = setting("requiredAtBegin", v)
}

@JSName("sap.ui.commons.Label")
@js.native
class Label(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[LabelSettings] = js.native) extends Control
  with sap.ui.core.Label with ToolbarItem {

  def this(id: String) = this(id, js.undefined)
  def this(settings: LabelSettings) = this(js.undefined, settings)
}
