package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.|

@ScalaJSDefined
class BindingInfo extends js.Object {

}

@JSName("sap.ui.table.Table")
@js.native
trait Table extends Control {
  /** Attaches event handler fnFunction to the 'columnVisibility' event of this
    * sap.ui.table.Table.
    *
    * When called, the context of the event handler (its this) will be bound to
    * oListener if specified otherwise it will be bound to this
    * sap.ui.table.Table itself.
    *
    * fired when the visibility of a table column is changed.
    *
    * @param data An application-specific payload object that will be passed to
    *             the event handler along with the event object when firing the
    *             event.
    * @param function The function to be called when the event occurs.
    * @param listener Context object to call the event handler with. Defaults to
    *                 this sap.ui.table.Table itself.
    * @return Reference to this in order to allow method chaining
    */
  def attachColumnVisibility(data: js.UndefOr[js.Dynamic] = js.undefined,
                             function: js.Function,
                             listener: js.UndefOr[js.Dynamic] = js.undefined): Table = js.native

  /** Sets a new value for property enableColumnFreeze.
    *
    * Flag whether to show or hide the column menu item to freeze or unfreeze a
    * column. When called with a value of null or undefined, the default value
    * of the property will be restored.
    *
    * Default value is false.
    *
    * @since 1.21.0
    *
    * @param enableColumnFreeze New value for property enableColumnFreeze
    * @return Reference to this in order to allow method chaining
    */
  def setEnableColumnFreeze(enableColumnFreeze: Boolean): Table = js.native

  /** Sets a new value for property enableBusyIndicator.
    *
    * Set this parameter to true to make the table handle the busy indicator by its own. The table will switch to busy as soon as it scrolls into an unpaged area. This feature can only be used when the navigation mode is set to scrolling.
    * When called with a value of null or undefined, the default value of the property will be restored.
    *
    * Default value is false.
    *
    * @since 1.27.0
    *
    * @param enableBusyIndicator New value for property enableBusyIndicator
    * @return Reference to this in order to allow method chaining
    */
  def setEnableBusyIndicator(enableBusyIndicator: Boolean): Table = js.native

  /** Adds some column into the aggregation named columns.
    *
    * @param column the column to add; to add; if empty, nothing is inserted
    * @return Reference to this in order to allow method chaining
    */
  def addColumn(column: Column): Table = js.native

  /** Binds aggregation rows to model data.
    *
    * See ManagedObject.bindAggregation for a detailed description of the
    * possible properties of oBindingInfo.
    *
    * @param bindingInfo The binding information or a path as a string
    * @return Reference to this in order to allow method chaining
    */
  def bindRows(bindingInfo: String | js.Dynamic/*BindingInfo*/): Table = js.native

  /** Gets current value of property firstVisibleRow.
    *
    * First visible row.
    *
    * Default value is 0.
    *
    * @return Value of property firstVisibleRow
    */
  def getFirstVisibleRow(): Int = js.native

  /** Sets a new value for property firstVisibleRow.
    *
    * First visible row.
    *
    * When called with a value of null or undefined, the default value of the
    * property will be restored.
    *
    * Default value is 0.
    *
    * @param firstVisibleRow New value for property firstVisibleRow
    * @return Reference to this in order to allow method chaining
    */
  def setFirstVisibleRow(firstVisibleRow: Int): Table = js.native

  /** Zero-based indices of selected items, wrapped in an array. An empty array
    * means "no selection".
    *
    * @return Array of indices.
    */
  def getSelectedIndices(): js.Array[Int] = js.native
}
