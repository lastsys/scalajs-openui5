package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait InputBaseSettings extends ControlSettings
object InputBaseSettings extends InputBaseSettingsBuilder(noSettings)

class InputBaseSettingsBuilder(val dict: SettingsMap)
  extends Settings[InputBaseSettings, InputBaseSettingsBuilder](new InputBaseSettingsBuilder(_))
    with InputBaseSetters[InputBaseSettings, InputBaseSettingsBuilder]

trait InputBaseSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def value(v: String) = setting("value", v)
  def width(v: CSSSize) = setting("width", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def valueState(v: ValueState) = setting("valueState", v)
  def name(v: String) = setting("name", v)
  def placeholder(v: String) = setting("placeholder", v)
  def editable(v: Boolean) = setting("editable", v)
  def valueStateText(v: String) = setting("valueStateText", v)
  def showValueStateMessage(v: Boolean) = setting("showValueStateMessage", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)

  def change(v: js.Function) = setting("change", v)
}

@JSName("sap.m.InputBase")
@js.native
class InputBase(id: js.UndefOr[String] = js.native,
                settings: js.UndefOr[InputBaseSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: InputBaseSettings) = this(js.undefined, settings)

  def setValue(value: String): this.type = js.native
  def getValue(): String = js.native
}
