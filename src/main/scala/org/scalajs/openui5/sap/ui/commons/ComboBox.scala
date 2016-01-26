package org.scalajs.openui5.sap.ui.commons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.commons.ComboBox")
@js.native
class ComboBox(id: String = js.native,
               settings: js.Dynamic = js.native)
  extends TextField with ToolbarItem {
  def bindItems(bindingInfo: js.Dynamic): ComboBox = js.native
}
