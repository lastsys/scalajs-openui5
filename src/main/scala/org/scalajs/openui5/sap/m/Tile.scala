package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TileSettings extends ControlSettings
object TileSettings extends TileSettingsBuilder(noSettings)

class TileSettingsBuilder(val dict: SettingsMap)
  extends Settings[TileSettings, TileSettingsBuilder](new TileSettingsBuilder(_))
    with TileSetters[TileSettings, TileSettingsBuilder]

trait TileSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def removable(v: Boolean) = setting("removable", v)

  def press(v: js.Function) = setting("press", v)
}

@JSName("sap.m.Tile")
@js.native
class Tile(id: js.UndefOr[String] = js.native,
           settings: js.UndefOr[TileSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TileSettings) = this(js.undefined, settings)
}
