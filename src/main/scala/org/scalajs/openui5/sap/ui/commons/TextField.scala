package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TextFieldSettings extends ControlSettings
object TextFieldSettings extends TextFieldSettingsBuilder(noSettings)

class TextFieldSettingsBuilder(val dict: SettingsMap)
  extends Settings[TextFieldSettings, TextFieldSettingsBuilder](new TextFieldSettingsBuilder(_))
    with TextFieldSetters[TextFieldSettings, TextFieldSettingsBuilder]

trait TextFieldSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def value(v: String) = setting("value", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def editable(v: Boolean) = setting("editable", v)
  def required(v: Boolean) = setting("required", v)
  def width(v: CSSSize) = setting("width", v)
  def maxLength(v: Int) = setting("maxLength", v)
  def valueState(v: ValueState) = setting("valueState", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def imeMode(v: ImeMode) = setting("imeMode", v)
  def design(v: Design) = setting("design", v)
  def helpId(v: String) = setting("helpId", v)
  def accessibleRole(v: AccessibleRole) = setting("accessibleRole", v)
  def name(v: String) = setting("name", v)
  def placeholder(v: String) = setting("placeholder", v)

  def change(v: js.Function) = setting("change", v)
  def liveChange(v: js.Function) = setting("liveChange", v)
}

@JSName("sap.ui.commons.TextField")
@js.native
class TextField(id: js.UndefOr[String] = js.native,
                settings: js.UndefOr[TextFieldSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: TextFieldSettings) = this(js.undefined, settings)

  /** Gets current value of property value.
    *
    * Text inside the TextField.
    *
    * Default value is "".
    *
    * @return Value of property value.
    */
  def getValue(): String = js.native

  /** Sets a new value for property value.
    *
    * Text inside the TextField
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is "".
    *
    * @param value new value for property value
    * @return reference to this in order to allow method chaining
    */
  def setValue(value: String = ""): this.type = js.native

  /** Sets a new value for property imeMode.
    * State of the Input Method Editor (IME).
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is ImeMode.Auto
    *
    * @param imeMode New value for property imeMode
    * @return reference to this in order to allow method chaining
    */
  def setImeMode(imeMode: ImeMode): this.type = js.native

  /** Sets a new value for property editable.
    * Switches edit state of the control. Read-only fields have different
    * colors, depending on theme setting.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is true.
    *
    * @param editable new value for property editable
    * @return reference to this in order to allow method chaining
    */
  def setEditable(editable: Boolean = true): this.type = js.native

  /** Sets a new value for property enabled.
    * Switches enabled state of the control. Disabled fields have different
    * colors, and can not be focused.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is true.
    *
    * @param enabled new value for property enabled
    * @return reference to this in order to allow method chaining
    */
  def setEnabled(enabled: Boolean = true): this.type = js.native
}
