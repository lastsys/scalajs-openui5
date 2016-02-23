package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.sap.ui.unified.Menu
import org.scalajs.openui5.util.{SettingsMap, Settings, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.|


@ScalaJSDefined
trait ColumnSettings extends ElementSettings
object ColumnSettings extends ColumnSettingsBuilder(noSettings)

class ColumnSettingsBuilder(val dict: SettingsMap)
  extends Settings[ColumnSettings, ColumnSettingsBuilder](new ColumnSettingsBuilder(_))
    with ColumnSetters[ColumnSettings, ColumnSettingsBuilder]

trait ColumnSetters[T <: js.Object, B <: Settings[T,_]]
  extends ElementSetters[T, B] {

  def width(v: CSSSize) = setting("width", v)
  def flexible(v: Boolean) = setting("flexible", v)
  def resizable(v: Boolean) = setting("resizable", v)
  def hAlign(v: HorizontalAlign) = setting("hAlign", v)
  def sorted(v: Boolean) = setting("sorted", v)
  def sortOrder(v: SortOrder) = setting("sortOrder", v)
  def sortProperty(v: String) = setting("sortProperty", v)
  def filtered(v: Boolean) = setting("filtered", v)
  def filterProperty(v: String) = setting("filterProperty", v)
  def filterValue(v: String) = setting("filterValue", v)
  def filterOperator(v: String) = setting("filterOperator", v)
  def grouped(v: Boolean) = setting("grouped", v)
  def visible(v: Boolean) = setting("visible", v)
  def filterType(v: js.Any) = setting("filterType", v)
  def name(v: String) = setting("name", v)
  def showFilterMenuEntry(v: Boolean) = setting("showFilterMenuEntry", v)
  def showSortMenuEntry(v: Boolean) = setting("showSortMenuEntry", v)
  def headerSpan(v: Int) = setting("headerSpan", v)
  def autoResizable(v: Boolean) = setting("autoResizable", v)
  def defaultFilterOperator(v: String) = setting("defaultFilterOperator", v)

  def label(v: String|Control) = setting("label", v)
  def multiLabels(v: js.Array[Control]) = setting("multiLabels", v)
  def template(v: Control) = setting("template", v)
  def menu(v: Menu) = setting("menu", v)
}


@JSName("sap.ui.table.Column")
@js.native
class Column(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[ColumnSettings] = js.native)
  extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: ColumnSettings) = this(js.undefined, settings)

  def setHeaderSpan(headerSpan: Int = 1): this.type = js.native
  def setHeaderSpan(headerSpan: js.Array[Int]): this.type = js.native

  def setVisible(visible: Boolean): this.type = js.native
  def getVisible(): Boolean = js.native
}

