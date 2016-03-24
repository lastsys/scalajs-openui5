package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{URI, ValueState}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait StandardTileSettings extends TileSettings
object StandardTileSettings extends StandardTileSettingsBuilder(noSettings)

class StandardTileSettingsBuilder(val dict: SettingsMap)
  extends Settings[StandardTileSettings, StandardTileSettingsBuilder](new StandardTileSettingsBuilder(_))
    with StandardTileSetters[StandardTileSettings, StandardTileSettingsBuilder]

trait StandardTileSetters[T <: js.Object, B <: Settings[T, _]] extends TileSetters[T, B] {
  def title(v: String) = setting("title", v)
  def info(v: String) = setting("info", v)
  def icon(v: URI) = setting("icon", v)
  def activeIcon(v: URI) = setting("activeIcon", v)
  def number(v: String) = setting("number", v)
  def numberUnit(v: String) = setting("numberUnit", v)
  def infoState(v: ValueState) = setting("infoState", v)
  def `type`(v: StandardTileType) = setting("type", v)
  def iconDensityAware(v: Boolean) = setting("iconDensityAware", v)
}

@JSName("sap.m.StandardTile")
@js.native
class StandardTile(id: js.UndefOr[String] = js.native,
                   settings: js.UndefOr[StandardTileSettings] = js.native)
  extends Tile {

  def this(id: String) = this(id, js.undefined)
  def this(settings: StandardTileSettings) = this(js.undefined, settings)
}
