package org.scalajs.openui5.sap.ui.commons

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import org.scalajs.openui5.sap.ui.core.ListItem

@ScalaJSDefined
trait ComboBoxSettings extends TextFieldSettings
object ComboBoxSettings extends ComboBoxSettingsBuilder[ComboBoxSettings]
class ComboBoxSettingsBuilder[T <: js.Object] extends
  TextFieldSettingsBuilder[T] {
  def maxPopupItems(v: Int) = setting("maxPopupItems", v)
  def displaySecondaryValues(v: Boolean) = setting("displaySecondaryValues", v)
  def selectedKey(v: String) = setting("selectedKey", v)
  def selectedItemId(v: String) = setting("selectedItemId", v)

  def items(v: js.Array[ListItem]) = setting("items", v)
}

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
