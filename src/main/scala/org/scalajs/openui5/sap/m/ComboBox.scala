package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{CSSSize, TextDirection, URI}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ComboBoxSettings extends ComboBoxBaseSettings
object ComboBoxSettings extends ComboBoxSettingsBuilder(noSettings)

class ComboBoxSettingsBuilder(val dict: SettingsMap)
  extends Settings[ComboBoxSettings, ComboBoxSettingsBuilder](new ComboBoxSettingsBuilder(_))
    with ComboBoxSetters[ComboBoxSettings, ComboBoxSettingsBuilder]

trait ComboBoxSetters[T <: js.Object, B <: Settings[T,_]]
  extends ComboBoxBaseSetters[T, B] {

  def selectedKey(v: String) = setting("selectedKey", v)
  def selectedItemId(v: String) = setting("selectedItemId", v)
  def showSecondaryValues(v: Boolean) = setting("showSecondaryValues", v)

  def selectionChange(v: js.Function) = setting("selectionChange", v)
}

@JSName("sap.m.ComboBox")
@js.native
class ComboBox(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[ComboBoxSettings] = js.native) extends ComboBoxBase {

  def this(id: String) = this(id, js.undefined)
  def this(settings: ComboBoxSettings) = this(js.undefined, settings)

  def getSelectedKey(): String = js.native
}
