package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.unified.Menu

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Common button control that opens a menu when clicked by the user. The
  * control provides an API for configuring the docking position of the menu.
  */
@JSName("sap.ui.commons.MenuButton")
@js.native
class MenuButton(id: js.UndefOr[String] = js.native,
                 settings: js.UndefOr[js.Any] = js.native) extends Button {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

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
