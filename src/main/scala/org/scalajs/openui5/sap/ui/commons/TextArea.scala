package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.{Wrapping, CSSSize}
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait TextAreaSettings extends TextFieldSettings
object TextAreaSettings extends TextAreaSettingsBuilder(noSettings)

class TextAreaSettingsBuilder(val dict: SettingsMap)
  extends Settings[TextAreaSettings, TextAreaSettingsBuilder](new TextAreaSettingsBuilder(_))
    with TextAreaSetters[TextAreaSettings, TextAreaSettingsBuilder]

trait TextAreaSetters[T <: js.Object, B <: Settings[T,_]]
  extends TextFieldSetters[T, B] {

  def height(v: CSSSize) = setting("height", v)
  def cols(v: Int) = setting("cols", v)
  def rows(v: Int) = setting("rows", v)
  def wrapping(v: Wrapping) = setting("wrapping", v)
  def cursorPos(v: Int) = setting("cursorPos", v)
  def explanation(v: String) = setting("explanation", v)
  def labeledBy(v: String) = setting("labeledBy", v)
}

@JSName("sap.ui.commons.TextArea")
@js.native
class TextArea(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[TextAreaSettings]) extends TextField {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TextAreaSettings) = this(js.undefined, settings)
}
