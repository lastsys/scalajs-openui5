package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.core._
import org.scalajs.openui5.sap.ui.unified.Menu

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}


@ScalaJSDefined
class ColumnSettings extends ElementSettings {
  val width: js.UndefOr[CSSSize] = js.undefined
  val flexible: js.UndefOr[Boolean] = js.undefined
  val resizable: js.UndefOr[Boolean] = js.undefined
  val hAlign: js.UndefOr[HorizontalAlign] = js.undefined
  val sorted: js.UndefOr[Boolean] = js.undefined
  val sortOrder: js.UndefOr[SortOrder] = js.undefined
  val sortProperty: js.UndefOr[String] = js.undefined
  val filtered: js.UndefOr[Boolean] = js.undefined
  val filterProperty: js.UndefOr[String] = js.undefined
  val filterValue: js.UndefOr[String] = js.undefined
  val filterOperator: js.UndefOr[String] = js.undefined
  val grouped: js.UndefOr[Boolean] = js.undefined
  val visible: js.UndefOr[Boolean] = js.undefined
  val filterType: js.UndefOr[js.Any] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  val showFilterMenuEntry: js.UndefOr[Boolean] = js.undefined
  val showSortMenuEntry: js.UndefOr[Boolean] = js.undefined
  val headerSpan: js.UndefOr[Int] = js.undefined
  val autoResizable: js.UndefOr[Boolean] = js.undefined
  val defaultFilterOperator: js.UndefOr[String] = js.undefined

  val label: js.UndefOr[Control] = js.undefined
  val multiLabels: js.UndefOr[js.Array[Control]] = js.undefined
  val template: js.UndefOr[Control] = js.undefined
  val menu: js.UndefOr[Menu] = js.undefined
}


@JSName("sap.ui.table.Column")
@js.native
class Column(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[js.Dynamic/*ColumnSettings*/] = js.native)
  extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Dynamic/*ColumnSettings*/) = this(js.undefined, settings)

  def setHeaderSpan(headerSpan: Int = 1): Column = js.native
  def setHeaderSpan(headerSpan: js.Array[Int]): Column = js.native

  def setVisible(visible: Boolean): Column = js.native
  def getVisible(): Boolean = js.native
}

