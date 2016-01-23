package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.commons.Button")
@js.native
class Button extends Control with ToolbarItem {
  /** Sets a new value for property icon.
    *
    * Icon to be displayed as graphical element within the button. This can be
    * an URI to an image or an icon font URI.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is "".
    *
    * @param icon new value for property icon
    * @return reference to this in order to allow method chaining
    */
  def setIcon(icon: String): Button = js.native
}
