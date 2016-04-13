package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait SelectSettings extends ControlSettings
object SelectSettings extends SelectSettingsBuilder(noSettings)

class SelectSettingsBuilder(val dict: SettingsMap)
  extends Settings[SelectSettings, SelectSettingsBuilder](new SelectSettingsBuilder(_))
    with SelectSetters[SelectSettings, SelectSettingsBuilder]

trait SelectSetters[T <: js.Object, B <: Settings[T,_]]
  extends ControlSetters[T, B] {

  def name(v: String) = setting("name", v)
  def enabled(v: Boolean) = setting("enabled", v)
  def width(v: CSSSize) = setting("width", v)
  def maxWidth(v: CSSSize) = setting("maxWidth", v)
  def selectedKey(v: String) = setting("selectedKey", v)
  def selectedItemId(v: String) = setting("selectedItemId", v)
  def icon(v: URI) = setting("icon", v)
  def `type`(v: SelectType) = setting("type", v)
  def autoAdjustWidth(v: Boolean) = setting("autoAdjustWidth", v)
  def textAlign(v: TextAlign) = setting("textAlign", v)
  def textDirection(v: TextDirection) = setting("textDirection", v)
  def forceSelection(v: Boolean) = setting("forceSelection", v)

  def items(v: js.Array[Item]) = setting("items", v)

  def change(v: js.Function) = setting("change", v)
}

@JSName("sap.ui.commons.Select")
@js.native
class Select(id: js.UndefOr[String] = js.native,
                  settings: js.UndefOr[SelectSettings])
  extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: SelectSettings) = this(js.undefined, settings)

  def getSelectedKey(): String = js.native
}
