package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core
import org.scalajs.openui5.sap.ui.core.Item
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ComboBoxBaseSettings extends ComboBoxTextFieldSettings
object ComboBoxBaseSettings extends ComboBoxBaseSettingsBuilder(noSettings)

class ComboBoxBaseSettingsBuilder(val dict: SettingsMap)
  extends Settings[ComboBoxBaseSettings, ComboBoxBaseSettingsBuilder](new ComboBoxBaseSettingsBuilder(_))
    with ComboBoxBaseSetters[ComboBoxBaseSettings, ComboBoxBaseSettingsBuilder]

trait ComboBoxBaseSetters[T <: js.Object, B <: Settings[T,_]]
  extends ComboBoxTextFieldSetters[T, B] {

  def items(v: js.Array[Item]) = setting("items", v)

  def loadItems(v: js.Function) = setting("loadItems", v)
}

@JSName("sap.m.ComboBoxBase")
@js.native
class ComboBoxBase(id: js.UndefOr[String] = js.native,
                   settings: js.UndefOr[ComboBoxSettings] = js.native) extends ComboBoxTextField {

  def bindItems(bindingInfo: js.Any): this.type = js.native
  def destroyItems(): this.type = js.native
  def addItem(item: core.Item): this.type = js.native
  def clearSelection(): this.type = js.native
  def getItems[T <: core.Item](): js.Array[T] = js.native

}
