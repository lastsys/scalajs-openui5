package org.scalajs.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import org.scalajs.openui5.sap.ui.core.Item

/** The MultiComboBox control provides a list box with items and a text field
  * allowing the user to either type a value directly into the control or
  * choose from the list of existing items.
  *
  * @since 1.22.0
  */
@JSName("sap.m.MultiComboBox")
@js.native
class MultiComboBox extends ComboBoxBase {
  def attachSelectionChange(function: js.Function): this.type = js.native
  def attachSelectionFinish(function: js.Function): this.type = js.native

  def getSelectedKeys(): js.Array[String] = js.native
  def getSelectedItems(): js.Array[Item] = js.native

  def setSelectedKeys(selectedKeys: js.Array[String]): this.type = js.native
}
