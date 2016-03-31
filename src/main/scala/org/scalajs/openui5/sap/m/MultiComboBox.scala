package org.scalajs.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.m.MultiComboBox")
@js.native
class MultiComboBox extends ComboBoxBase {
  def attachSelectionChange(function: js.Function): this.type = js.native
  def attachSelectionFinish(function: js.Function): this.type = js.native

  def getSelectedKeys(): js.Array[String] = js.native
}
