package org.scalajs.openui5.sap.m

import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TableSettings extends ListBaseSettings
object TableSettings extends TableSettingsBuilder(noSettings)

class TableSettingsBuilder(val dict: SettingsMap)
  extends Settings[TableSettings, TableSettingsBuilder](new TableSettingsBuilder(_))
    with TableSetters[TableSettings, TableSettingsBuilder]

trait TableSetters[T <: js.Object, B <: Settings[T, _]] extends ListBaseSetters[T, B] {
  def backgroundDesign(v: BackgroundDesign) = setting("backgroundDesign", v)
  def fixedLayout(v: Boolean) = setting("fixedLayout", v)
  def showOverlay(v: Boolean) = setting("showOverlay", v)

  def columns(v: js.Array[Column]) = setting("columns", v)
}

/** sap.m.Table control provides a set of sophisticated and convenience
  * functions for responsive table design. For mobile devices, the
  * recommended limit of table rows is 100 (based on 4 columns) to assure
  * proper performance. To improve initial rendering on large tables, use the
  * growing feature.
  *
  * @since 1.16
  */
@JSName("sap.m.Table")
@js.native
class Table(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[TableSettings] = js.native) extends ListBase {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TableSettings) = this(js.undefined, settings)
}
