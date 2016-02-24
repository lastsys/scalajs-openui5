package org.scalajs.openui5.sap.ui.layout

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait BlockLayoutCellSettings extends ControlSettings
object BlockLayoutCellSettings extends BlockLayoutCellSettingsBuilder(noSettings)

class BlockLayoutCellSettingsBuilder(val dict: SettingsMap)
  extends Settings[BlockLayoutCellSettings, BlockLayoutCellSettingsBuilder](new BlockLayoutCellSettingsBuilder(_))
    with BlockLayoutCellSetters[BlockLayoutCellSettings, BlockLayoutCellSettingsBuilder]

trait BlockLayoutCellSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def title(v: String) = setting("title", v)
  def titleAlignment(v: HorizontalAlign) = setting("titleAlignment", v)
  def titleLevel(v: TitleLevel) = setting("titleLevel", v)
  def width(v: Int) = setting("width", v)

  def content(v: js.Array[Control]) = setting("control", v)
}

/** The BlockLayoutCell is used as an aggregation of the BlockLayoutRow. It
  * contains Controls. The BlockLayoutCell should be used only as aggregation
  * of the BlockLayoutRow.
  *
  * @since 1.34
  */
@JSName("sap.ui.layout.BlockLayoutCell")
@js.native
class BlockLayoutCell(id: js.UndefOr[String] = js.native,
                      settings: js.UndefOr[BlockLayoutCellSettings])
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: BlockLayoutCellSettings) = this(js.undefined, settings)
}
