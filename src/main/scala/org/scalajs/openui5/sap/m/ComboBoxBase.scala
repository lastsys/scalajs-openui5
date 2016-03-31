package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.m.ComboBoxBase")
@js.native
class ComboBoxBase extends ComboBoxTextField {

  def bindItems(bindingInfo: js.Any): this.type = js.native
  def destroyItems(): this.type = js.native
  def addItem(item: core.Item): this.type = js.native
  def clearSelection(): this.type = js.native
  def getItems[T <: core.Item](): js.Array[T] = js.native

}
