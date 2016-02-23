package org.scalajs.openui5.sap.ui.core

import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ListItemSettings extends ItemSettings
object ListItemSettings extends ListItemSettingsBuilder(noSettings)

class ListItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[ListItemSettings, ListItemSettingsBuilder](new ListItemSettingsBuilder(_))
    with ListItemSetters[ListItemSettings, ListItemSettingsBuilder]

trait ListItemSetters[T <: js.Object, B <: Settings[T,_]]
  extends ItemSetters[T, B] {

  def icon(v: String) = setting("icon", v)
  def additionalText(v: String) = setting("additionalText", v)
}

@JSName("sap.ui.core.ListItem")
@js.native
class ListItem(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[ListItemSettings] = js.native)
  extends Item {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ListItemSettings) = this(js.undefined, settings)
}
