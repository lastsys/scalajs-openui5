package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TileContainerSettings extends ControlSettings
object TileContainerSettings extends TileContainerSettingsBuilder(noSettings)

class TileContainerSettingsBuilder(val dict: SettingsMap)
  extends Settings[TileContainerSettings, TileContainerSettingsBuilder](new TileContainerSettingsBuilder(_))
    with TileContainerSetters[TileContainerSettings, TileContainerSettingsBuilder]

trait TileContainerSetters[T <: js.Object, B <: Settings[T, _]]
  extends ControlSetters[T, B] {
  def width(v: CSSSize) = setting("width", v)
  def height(v: CSSSize) = setting("height", v)
  def editable(v: Boolean) = setting("editable", v)
  def allowAdd(v: Boolean) = setting("allowAdd", v)

  def tiles(v: js.Array[_ <: Tile]) = setting("tiles", v)

  def tileMove(v: js.Function) = setting("tileMove", v)
  def tileDelete(v: js.Function) = setting("tileDelete", v)
  def tileAdd(v: js.Function) = setting("tileAdd", v)
}

/** A container that arranges same-size tiles nicely on carousel pages.
  *
  * @since 1.12
  */
@JSName("sap.m.TileContainer")
@js.native
class TileContainer(id: js.UndefOr[String] = js.native,
                    settings: js.UndefOr[TileContainerSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TileContainerSettings) = this(js.undefined, settings)

}
