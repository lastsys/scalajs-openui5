package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, VerticalAlign}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ColumnListItemSettings extends ListItemBaseSettings
object ColumnListItemSettings extends ColumnListItemSettingsBuilder(noSettings)

class ColumnListItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[ColumnListItemSettings, ColumnListItemSettingsBuilder](new ColumnListItemSettingsBuilder(_))
    with ColumnListItemSetters[ColumnListItemSettings, ColumnListItemSettingsBuilder]

trait ColumnListItemSetters[T <: js.Object, B <: Settings[T,_]]
  extends ListItemBaseSetters[T, B] {

  def vAlign(v: VerticalAlign) = setting("vAlign", v)

  def cells(v: js.Array[_ <: Control]) = setting("cells", v)
}

@JSName("sap.m.ColumnListItem")
@js.native
class ColumnListItem(id: js.UndefOr[String] = js.native,
                     settings: js.UndefOr[ColumnListItemSettings] = js.native)
  extends ListItemBase {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ColumnListItemSettings) = this(js.undefined, settings)
}
