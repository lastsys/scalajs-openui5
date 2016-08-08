package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.CSSSize
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ComboBoxTextFieldSettings extends InputBaseSettings
object ComboBoxTextFieldSettings extends ComboBoxTextFieldSettingsBuilder(noSettings)

class ComboBoxTextFieldSettingsBuilder(val dict: SettingsMap)
  extends Settings[ComboBoxTextFieldSettings, ComboBoxTextFieldSettingsBuilder](new ComboBoxTextFieldSettingsBuilder(_))
    with ComboBoxTextFieldSetters[ComboBoxTextFieldSettings, ComboBoxTextFieldSettingsBuilder]

trait ComboBoxTextFieldSetters[T <: js.Object, B <: Settings[T,_]]
  extends InputBaseSetters[T, B] {

  def maxWidth(v: CSSSize) = setting("maxWidth", v)
  def showButton(v: Boolean) = setting("showButton", v)
}

@JSName("sap.m.ComboBoxTextField")
@js.native
class ComboBoxTextField(id: js.UndefOr[String] = js.native,
                        settings: js.UndefOr[ComboBoxTextFieldSettings] = js.native) extends InputBase {
  def this(id: String) = this(id, js.undefined)
  def this(settings: ComboBoxTextFieldSettings) = this(js.undefined, settings)
}
