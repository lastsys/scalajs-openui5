package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TooltipBaseSettings extends ControlSettings
object TooltipBaseSettings extends TooltipBaseSettingsBuilder(noSettings)

class TooltipBaseSettingsBuilder(val dict: SettingsMap)
  extends Settings[TooltipBaseSettings, TooltipBaseSettingsBuilder](new TooltipBaseSettingsBuilder(_))
    with TooltipBaseSetters[TooltipBaseSettings, TooltipBaseSettingsBuilder]

trait TooltipBaseSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def text(v: String) = setting("text", v)
  def openDuration(v: Int) = setting("openDuration", v)
  def closeDuration(v: Int) = setting("closeDuration", v)
  def myPosition(v: Dock) = setting("myPosition", v)
  def atPosition(v: Dock) = setting("atPosition", v)
  def offset(v: String) = setting("offset", v)
  def collision(v: Collision) = setting("collision", v)
  def openDelay(v: Int) = setting("openDelay", v)
  def closeDelay(v: Int) = setting("closeDelay", v)
}

@JSName("sap.ui.core.TooltipBase")
@js.native
class TooltipBase(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[TooltipBaseSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TooltipBaseSettings) = this(js.undefined, settings)
}
