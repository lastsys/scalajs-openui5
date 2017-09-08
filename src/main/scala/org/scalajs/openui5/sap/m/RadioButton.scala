package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.|

@ScalaJSDefined
trait RadioButtonSettings extends ControlSettings
object RadioButtonSettings extends RadioButtonSettingsBuilder(noSettings)

class RadioButtonSettingsBuilder(val dict: SettingsMap)
  extends Settings[RadioButtonSettings, RadioButtonSettingsBuilder](new RadioButtonSettingsBuilder(_))
    with RadioButtonSetters[RadioButtonSettings, RadioButtonSettingsBuilder]

trait RadioButtonSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def enabled(v: Boolean): B = setting("enabled", v)
  def selected(v: Boolean): B = setting("selected", v)
  def groupName(v: String): B = setting("groupName", v)
  def text(v: String): B = setting("text", v)
  def textDirection(v: TextDirection): B = setting("textDirection", v)
  def width(v: CSSSize): B = setting("width", v)
  def useEntireWidth(v: Boolean): B = setting("useEntireWidth", v)
  def activeHandling(v: Boolean): B = setting("activeHandling", v)
  def editable(v: Boolean): B = setting("editable", v)
  def valueState(v: ValueState): B = setting("valueState", v)
  def textAlign(v: TextAlign): B = setting("textAlign", v)

  def select(v: js.Function): B = setting("select", v)
}

@JSName("sap.m.RadioButton")
@js.native
class RadioButton(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[RadioButtonSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: RadioButtonSettings) = this(js.undefined, settings)

  def getSelected(): Boolean = js.native
  def setSelected(selected: Boolean): this.type = js.native
}
