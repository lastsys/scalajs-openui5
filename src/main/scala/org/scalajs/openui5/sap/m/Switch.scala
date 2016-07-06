package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}


@ScalaJSDefined
trait SwitchSettings extends ControlSettings
object SwitchSettings extends SwitchSettingsBuilder(noSettings)

class SwitchSettingsBuilder(val dict: SettingsMap)
  extends Settings[SwitchSettings, SwitchSettingsBuilder](new SwitchSettingsBuilder(_))
    with SwitchSetters[SwitchSettings, SwitchSettingsBuilder]

trait SwitchSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def state(v: Boolean) = setting("state", v)
  def customTextOn(v: String) = setting("customTextOn", v)
  def customTextOff(v: String) = setting("customTextOff", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def name(v: String) = setting("name", v)
  def `type`(v: SwitchType) = setting("type", v)

  def change(v: js.Function) = setting("change", v)
}

@JSName("sap.m.Switch")
@js.native
class Switch(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[SwitchSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: SwitchSettings) = this(js.undefined, settings)
}
