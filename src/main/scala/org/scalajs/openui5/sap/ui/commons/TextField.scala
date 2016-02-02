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
}
