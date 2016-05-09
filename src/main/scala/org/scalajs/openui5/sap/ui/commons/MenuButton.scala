package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.{ControlSetters, ControlSettings}
import org.scalajs.openui5.sap.ui.unified.{Menu, MenuItemBase}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait MenuButtonSettings extends ButtonSettings
object MenuButtonSettings extends MenuButtonSettingsBuilder(noSettings)

class MenuButtonSettingsBuilder(val dict: SettingsMap)
  extends Settings[MenuButtonSettings, MenuButtonSettingsBuilder](new MenuButtonSettingsBuilder(_))
    with MenuButtonSetters[MenuButtonSettings, MenuButtonSettingsBuilder]

trait MenuButtonSetters[T <: js.Object, B <: Settings[T, _]] extends ButtonSetters[T, B] {
  def dockButton(v: String) = setting("dockButton", v)
  def dockMenu(v: String) = setting("dockMenu", v)

  def menu(v: Menu) = setting("menu", v)

  def itemSelected(v: js.Function) = setting("itemSelected", v)
}

/** Common button control that opens a menu when clicked by the user. The
  * control provides an API for configuring the docking position of the menu.
  */
@JSName("sap.ui.commons.MenuButton")
@js.native
class MenuButton(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[MenuButtonSettings] = js.native) extends Button {
  def this(id: String) = this(id, js.undefined)
  def this(settings: MenuButtonSettings) = this(js.undefined, settings)

  /** Gets content of aggregation menu.
    *
    * Menu that shall be opened when the button is clicked.
    *
    * @return Menu
    */
  def getMenu(): Menu = js.native

  /** Setter for the aggregated menu.
    *
    * @param menu Menu to set
    * @return this to allow method chaining
    */
  def setMenu(menu: Menu): this.type = js.native
}
