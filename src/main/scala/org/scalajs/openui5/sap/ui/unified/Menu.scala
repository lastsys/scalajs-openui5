package org.scalajs.openui5.sap.ui.unified

import org.scalajs.dom
import org.scalajs.openui5.sap.ui.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

/** A menu is an interactive element which provides a choice of different
  * actions to the user. These actions (items) can also be organized in
  * submenus. Like other dialog-like controls, the menu is not rendered within
  * the control hierarchy. Instead it can be opened at a specified position via
  * a function call.
  *
  * @since 1.21.0
  */
@JSName("sap.ui.unified.Menu")
@js.native
trait Menu extends Control {
  /** Opens the menu at the specified position.
    *
    * The position of the menu is defined relative to an element in the visible
    * DOM by specifying the docking location of the menu and of the related
    * element.
    *
    * See Popup#open for further details about popup positioning.
    *
    * @param withKeyboard Indicates whether or not the first item shall be
    *                     highlighted when the menu is opened (keyboard case)
    * @param openerRef The element which will get the focus back again after
    *                  the menu was closed
    * @param my The reference docking location of the menu for positioning
    *           the menu on the screen
    * @param at The 'of' element's reference docking location for positioning
    *           the menu on the screen
    * @param of The menu is positioned relatively to this element based on
    *           the given dock locations
    * @param offset The offset relative to the docking point, specified as a
    *               string with space-separated pixel values (e.g. "0 10" to
    *               move the popup 10 pixels to the right)
    * @param collision The collision defines how the position of the menu
    *                  should be adjusted in case it overflows the window in
    *                  some direction
    */
  def open(withKeyboard: Boolean,
           openerRef: Element | dom.Element,
           my: Dock,
           at: Dock,
           of: Element | dom.Element,
           offset: js.UndefOr[String] = js.undefined,
           collision: js.UndefOr[Collision] = js.undefined): Unit = js.native

  /** Destroys all the items in the aggregation named items.
    *
    * @return Reference to this in order to allow method chaining
    */
  def destroyItems(): this.type = js.native

  /** Adds some item into the aggregation named items.
    *
    * @param item the item to add; if empty, nothing is inserted
    * @return Reference to this in order to allow method chaining
    */
  def addItem(item: MenuItemBase): this.type = js.native
}
