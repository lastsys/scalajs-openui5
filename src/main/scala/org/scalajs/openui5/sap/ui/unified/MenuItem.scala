package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.URI
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait MenuItemSettings extends MenuItemBaseSettings
object MenuItemSettings extends MenuItemSettingsBuilder(noSettings)

class MenuItemSettingsBuilder(val dict: SettingsMap)
  extends Settings[MenuItemSettings, MenuItemSettingsBuilder](new MenuItemSettingsBuilder(_))
    with MenuItemSetters[MenuItemSettings, MenuItemSettingsBuilder]

trait MenuItemSetters[T <: js.Object, B <: Settings[T,_]]
  extends MenuItemBaseSetters[T, B] {

  def text(v: String) = setting("text", v)
  def icon(v: URI) = setting("icon", v)
}

/** Standard item to be used inside a menu. A menu item represents an action
  * which can be selected by the user in the menu or it can provide a submenu
  * to organize the actions hierarchically.
  *
  * @since 1.21.0
  */
@JSName("sap.ui.unified.MenuItem")
@js.native
class MenuItem(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[MenuItemSettings] = js.native) extends MenuItemBase {
  def this(id: String) = this(id, js.undefined)
  def this(settings: MenuItemSettings) = this(js.undefined, settings)
}
