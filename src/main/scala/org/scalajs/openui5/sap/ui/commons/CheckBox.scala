package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait CheckBoxSettings extends ControlSettings
object CheckBoxSettings extends CheckBoxSettingsBuilder(noSettings)

class CheckBoxSettingsBuilder(val dict: SettingsMap)
  extends Settings[CheckBoxSettings, CheckBoxSettingsBuilder](new
      CheckBoxSettingsBuilder(_))
    with CheckBoxSetters[CheckBoxSettings, CheckBoxSettingsBuilder]

trait CheckBoxSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def checked(v: Boolean) = setting("checked", v)
  def text(v: String) = setting("text", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def editable(v: Boolean) = setting("editable", v)
  def valueState(v: ValueState) = setting("valueState", v)
  def width(v: CSSSize) = setting("width", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def name(v: String) = setting("name", v)

  def change(v: js.Function) = setting("change", v)
}

@JSName("sap.ui.commons.CheckBox")
@js.native
class CheckBox(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[CheckBoxSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: CheckBoxSettings) = this(js.undefined, settings)

  def getChecked(): Boolean = js.native
}
