package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.sap.ui.core._

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}


@JSName("sap.ui.commons.Button")
@js.native
class Button(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[js.Any] = js.native)
  extends Control with ToolbarItem {

  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

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
  def setIcon(icon: String): this.type = js.native

  def attachPress(data: js.Any, function: js.Function,
                  listener: js.Any): this.type = js.native
  def attachPress(data: js.Any, function: js.Function): this.type = js.native
  def attachPress(function: js.Function,
                  listener: js.Any): this.type = js.native
  def attachPress(function: js.Function): this.type = js.native

  def setEnabled(enabled: Boolean): this.type = js.native
}
