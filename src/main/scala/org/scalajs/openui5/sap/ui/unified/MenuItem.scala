package org.scalajs.openui5.sap.ui.unified

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Standard item to be used inside a menu. A menu item represents an action
  * which can be selected by the user in the menu or it can provide a submenu
  * to organize the actions hierarchically.
  *
  * @since 1.21.0
  */
@JSName("sap.ui.unified.MenuItem")
@js.native
class MenuItem(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[js.Any] = js.native) extends MenuItemBase {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)
}
