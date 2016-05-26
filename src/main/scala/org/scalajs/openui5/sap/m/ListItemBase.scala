package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.base.Object
import org.scalajs.openui5.sap.ui.core.{Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ListItemBaseSettings extends ControlSettings
object ListItemBaseSettings extends ListItemBaseSettingsBuilder(noSettings)

class ListItemBaseSettingsBuilder(val dict: SettingsMap)
  extends Settings[ListItemBaseSettings, ListItemBaseSettingsBuilder](new ListItemBaseSettingsBuilder(_))
    with ListItemBaseSetters[ListItemBaseSettings, ListItemBaseSettingsBuilder]

trait ListItemBaseSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def `type`(v: ListType) = setting("type", v)
  def unread(v: Boolean) = setting("unread", v)
  def selected(v: Boolean) = setting("selected", v)
  def counter(v: Int) = setting("counter", v)

  def tap(v: js.Function) = setting("tap", v)
  def detailTap(v: js.Function) = setting("detailTap", v)
  def press(v: js.Function) = setting("press", v)
  def detailPress(v: js.Function) = setting("detailPress", v)
}

/** ListItemBase contains the base features of all specific list items. */
@JSName("sap.m.ListItemBase")
@js.native
class ListItemBase(id: js.UndefOr[String] = js.native,
                   settings: js.UndefOr[ListItemBaseSettings] = js.native)
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ListItemBaseSettings) = this(js.undefined, settings)
}

@JSName("sap.m.ListItemBase")
@js.native
object ListItemBase extends Object
