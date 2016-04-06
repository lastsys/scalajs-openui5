package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.TextDirection
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait GroupHeaderListItemSettings extends ListItemBaseSettings
object GroupHeaderListItemSettings extends GroupHeaderListItemSettingsBuilder(noSettings)

class GroupHeaderListItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[GroupHeaderListItemSettings, GroupHeaderListItemSettingsBuilder](new GroupHeaderListItemSettingsBuilder(_))
    with GroupHeaderListItemSetters[GroupHeaderListItemSettings, GroupHeaderListItemSettingsBuilder]

trait GroupHeaderListItemSetters[T <: js.Object, B <: Settings[T,_]]
  extends ListItemBaseSetters[T, B] {

  def title(v: String) = setting("title", v)
  def count(v: String) = setting("count", v)
  def upperCase(v: Boolean) = setting("upperCase", v)
  def titleTextDirection(v: TextDirection) = setting("titleTextDirection", v)
}

@JSName("sap.m.GroupHeaderListItem")
@js.native
class GroupHeaderListItem(id: js.UndefOr[String] = js.native,
                          settings: js.UndefOr[GroupHeaderListItemSettings])
  extends ListItemBase {

  def this(id: String) = this(id, js.undefined)
  def this(settings: GroupHeaderListItemSettings) = this(js.undefined, settings)
}
