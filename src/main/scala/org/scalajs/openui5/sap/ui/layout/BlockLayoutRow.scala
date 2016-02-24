package org.scalajs.openui5.sap.ui.layout

import org.scalajs.openui5.sap.ui.core.{ControlSetters, ControlSettings, Control}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait BlockLayoutRowSettings extends ControlSettings
object BlockLayoutRowSettings extends BlockLayoutRowSettingsBuilder(noSettings)

class BlockLayoutRowSettingsBuilder(val dict: SettingsMap)
  extends Settings[BlockLayoutRowSettings, BlockLayoutRowSettingsBuilder](new BlockLayoutRowSettingsBuilder(_))
    with BlockLayoutRowSetters[BlockLayoutRowSettings, BlockLayoutRowSettingsBuilder]

trait BlockLayoutRowSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def scrollable(v: Boolean) = setting("scrollable", v)

  def content(v: js.Array[BlockLayoutCell]) = setting("content", v)
}

/** The BlockLayoutRow is used as an aggregation to the BlockLayout. It
  * aggregates Block Layout cells. The BlockLayoutRow has 2 rendering modes -
  * scrollable and non scrollable.
  *
  * @since 1.34
  */
@JSName("sap.ui.layout.BlockLayoutRow")
@js.native
class BlockLayoutRow(id: js.UndefOr[String] = js.native,
                     settings: js.UndefOr[BlockLayoutRowSettings])
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: BlockLayoutRowSettings) = this(js.undefined, settings)
}
