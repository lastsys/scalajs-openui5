package org.scalajs.openui5.sap.ui.commons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.scalajs.openui5.sap.ui.core.ListItem

@JSName("sap.ui.commons.ComboBox")
@js.native
class ComboBox(id: String = js.native,
               settings: js.Dynamic = js.native)
  extends TextField with ToolbarItem {
  def bindItems(bindingInfo: js.Dynamic): this.type = js.native
  def getSelectedKey(): String = js.native
  def setSelectedKey(selectedKey: String): this.type = js.native
  def getItems(): js.Array[ListItem] = js.native
}
