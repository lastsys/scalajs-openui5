package org.scalajs.openui5.sap.ui.unified

import org.scalajs.openui5.sap.ui.core.{ElementSetters, ElementSettings, Element}
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}

@ScalaJSDefined
trait MenuItemBaseSettings extends ElementSettings
object MenuItemBaseSettings extends MenuItemBaseSettingsBuilder(noSettings)

class MenuItemBaseSettingsBuilder(val dict: SettingsMap)
  extends Settings[MenuItemBaseSettings, MenuItemBaseSettingsBuilder](new
      MenuItemBaseSettingsBuilder(_))
    with MenuItemBaseSetters[MenuItemBaseSettings, MenuItemBaseSettingsBuilder]

trait MenuItemBaseSetters[T <: js.Object, B <: Settings[T,_]]
  extends ElementSetters[T, B] {

  def enabled(v: Boolean) = setting("enabled", v)
  def visible(v: Boolean) = setting("visible", v)
  def startsSection(v: Boolean) = setting("startsSection", v)

  def submenu(v: Menu) = setting("submenu", v)

  def select(v: js.Function) = setting("select", v)
}

/** Abstract base class for menu item which provides common properties and
  * events for all concrete item implementations.
  *
  * @since 1.21.0
  */
@JSName("sap.ui.unified.MenuItemBase")
@js.native
class MenuItemBase(id: js.UndefOr[String] = js.native,
                   settings: js.UndefOr[MenuItemBaseSettings] = js.native)
  extends Element {

}
