package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
trait ColumnSettings extends ControlSettings
object ColumnSettings extends ColumnSettingsBuilder(noSettings)

class ColumnSettingsBuilder(val dict: SettingsMap)
  extends Settings[ColumnSettings, ColumnSettingsBuilder](new ColumnSettingsBuilder(_))
    with ColumnSetters[ColumnSettings, ColumnSettingsBuilder]

trait ColumnSetters[T <: js.Object, B <: Settings[T, _]] extends ControlSetters[T, B] {
  def width(v: CSSSize) = setting("width", v)
  def hAlign(v: TextAlign) = setting("hAlign", v)
  def vAlign(v: VerticalAlign) = setting("vAlign", v)
  def styleClass(v: String) = setting("styleClass", v)
  def minScreenWidth(v: String) = setting("minScreenWidth", v)
  def demandPopin(v: Boolean) = setting("demandPopin", v)
  def popinHAlgin(v: TextAlign) = setting("popinHAlign", v)
  def popinDisplay(v: PopinDisplay) = setting("popinDisplay", v)
  def mergeDuplicates(v: Boolean) = setting("mergeDuplicates", v)
  def mergeFunctionName(v: String) = setting("mergeFunctionName", v)

  def header(v: Control) = setting("header", v)
  def footer(v: Control) = setting("footer", v)
}


@JSName("sap.m.Column")
@js.native
class Column(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[ColumnSettings] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: ColumnSettings) = this(js.undefined, settings)
}
