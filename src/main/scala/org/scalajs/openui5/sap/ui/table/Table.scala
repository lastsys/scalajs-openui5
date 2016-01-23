package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

@ScalaJSDefined
class BindingInfo extends js.Object {

}

@JSName("sap.ui.table.Table")
@js.native
trait Table extends Control {
  def attachColumnVisibility(data: js.UndefOr[js.Dynamic] = js.undefined,
                             function: js.Function,
                             listener: js.UndefOr[js.Dynamic] = js.undefined): Table = js.native
  def setEnableColumnFreeze(enableColumnFreeze: Boolean): Table = js.native
  def setEnableBusyIndicator(enableBusyIndicator: Boolean): Table = js.native
  def addColumn(column: Column): Table = js.native
  def bindRows(path: String): Table = js.native
  def bindRows(bindingInfo: js.Dynamic/*BindingInfo*/): Table = js.native
  def getFirstVisibleRow(): Int = js.native
  def setFirstVisibleRow(row: Int): Table = js.native
}
