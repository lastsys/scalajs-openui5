package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.commons.TextField")
@js.native
class TextField extends Control {
  /** Gets current value of property value.
    *
    * Text inside the TextField.
    *
    * Default value is "".
    *
    * @return Value of property value.
    */
  def getValue(): String = js.native

  /** Sets a new value for property value.
    *
    * Text inside the TextField
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is "".
    *
    * @param value new value for property value
    * @return reference to this in order to allow method chaining
    */
  def setValue(value: String): this.type = js.native
}
