package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.ListItem
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ComboBoxSettings extends TextFieldSettings
object ComboBoxSettings extends ComboBoxSettingsBuilder(noSettings)

class ComboBoxSettingsBuilder(val dict: SettingsMap)
  extends Settings[ComboBoxSettings, ComboBoxSettingsBuilder](new ComboBoxSettingsBuilder(_))
    with ComboBoxSetters[ComboBoxSettings, ComboBoxSettingsBuilder]

trait ComboBoxSetters[T <: js.Object, B <: Settings[T, _]]
  extends TextFieldSetters[T, B] {

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
