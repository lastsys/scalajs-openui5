package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.commons.Toolbar
import org.scalajs.openui5.sap.ui.core.{CSSSize, Control, ControlSetters, ControlSettings}
import org.scalajs.openui5.sap.ui.model.Context
import org.scalajs.openui5.util.{Settings, SettingsMap, noSettings}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.|


@ScalaJSDefined
trait TableSettings extends ControlSettings
object TableSettings extends TableSettingsBuilder(noSettings)

class TableSettingsBuilder(val dict: SettingsMap)
  extends Settings[TableSettings, TableSettingsBuilder](new TableSettingsBuilder(_))
    with TableSetters[TableSettings, TableSettingsBuilder]

trait TableSetters[T <: js.Object, B <: Settings[T,_]] extends ControlSetters[T, B] {
  def width(v: CSSSize) = setting("width", v)
  def rowHeight(v: Int) = setting("rowHeight", v)
  def columnHeaderHeight(v: Int) = setting("columnHeaderHeight", v)
  def columnHeaderVisible(v: Boolean) = setting("columnHeaderVisible", v)
  def visibleRowCount(v: Int) = setting("visibleRowCount", v)
  def firstVisibleRow(v: Int) = setting("firstVisibleRow", v)
  def selectionMode(v: SelectionMode) = setting("selectionMode", v)
  def selectionBehavior(v: SelectionBehavior) = setting("selectionBehavior", v)
  def selectedIndex(v: Int) = setting("selectedIndex", v)
  def editable(v: Boolean) = setting("editable", v)
  def navigationMode(v: NavigationMode) = setting("navigationMode", v)
  def threshold(v: Int) = setting("threshold", v)
  def enableColumnReordering(v: Boolean) = setting("enableColumnReordering", v)
  def enableGrouping(v: Boolean) = setting("enableGrouping", v)
  def showColumnVisibilityMenu(v: Boolean) = setting("showColumnVisibilityMenu", v)
  def showNoData(v: Boolean) = setting("showNoData", v)
  def visibleRowCountMode(v: VisibleRowCountMode) = setting("visibleRowCountMode", v)
  def minAutoRowCount(v: Int) = setting("minAutoRowCount", v)
  def fixedColumnCount(v: Int) = setting("fixedColumnCount", v)
  def fixedRowCount(v: Int) = setting("fixedRowCount", v)
  def fixedBottomRowCount(v: Int) = setting("fixedBottomRowCount", v)
  def enableColumnFreeze(v: Boolean) = setting("enableColumnFreeze", v)
  def enableCellFilter(v: Boolean) = setting("enableCellFilter", v)
  def showOverlay(v: Boolean) = setting("showOverlay", v)
  def enableSelectAll(v: Boolean) = setting("enableSelectAll", v)
  def enableCustomFilter(v: Boolean) = setting("enableCustomFilter", v)
  def enableBusyIndicator(v: Boolean) = setting("enableBusyIndicator", v)
  def allowColumnReordering(v: Boolean) = setting("allowColumnReordering", v)
  def noDataText(v: String) = setting("noDataText", v)

  def title(v: Control) = setting("title", v)
  def footer(v: Control) = setting("footer", v)
  def toolbar(v: Toolbar) = setting("toolbar", v)
  def extension(v: js.Array[Control]) = setting("extension", v)
  def columns(v: js.Array[Column]) = setting("columns", v)
  def rows(v: js.Array[Row]) = setting("rows", v)
  def noData(v: Control) = setting("noData", v)

  def rowSelectionChange(v: js.Function) = setting("rowSelectionChange", v)
  def columnSelect(v: js.Function) = setting("columnSelect", v)
  def columnResize(v: js.Function) = setting("columnResize", v)
  def columnMove(v: js.Function) = setting("columnMove", v)
  def sort(v: js.Function) = setting("sort", v)
  def filter(v: js.Function) = setting("filter", v)
  def group(v: js.Function) = setting("group", v)
  def columnVisibility(v: js.Function) = setting("columnVisibility", v)
  def cellClick(v: js.Function) = setting("cellClick", v)
  def cellContextmenu(v: js.Function) = setting("cellContextmenu", v)
  def columnFreeze(v: js.Function) = setting("columnFreeze", v)
  def customFilterFunction(v: js.Function) = setting("customFilterFunction", v)
}

@JSName("sap.ui.table.Table")
@js.native
class Table(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[TableSettings] = js.native) extends Control {

  def this(id: String) = this(id, js.undefined)
  def this(settings: TableSettings) = this(js.undefined, settings)

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
                             listener: js.UndefOr[js.Dynamic] = js.undefined): this.type = js.native

  /** Sets a new value for property enableColumnFreeze.
    *
    * Flag whether to show or hide the column menu item to freeze or unfreeze a
    * column. When called with a value of null or undefined, the default value
    * of the property will be restored.
    *
    * Default value is false.
    *
    * @since 1.21.0
    * @param enableColumnFreeze New value for property enableColumnFreeze
    * @return Reference to this in order to allow method chaining
    */
  def setEnableColumnFreeze(enableColumnFreeze: Boolean): this.type = js.native

  /** Sets a new value for property enableBusyIndicator.
    *
    * Set this parameter to true to make the table handle the busy indicator by its own. The table will switch to busy as soon as it scrolls into an unpaged area. This feature can only be used when the navigation mode is set to scrolling.
    * When called with a value of null or undefined, the default value of the property will be restored.
    *
    * Default value is false.
    *
    * @since 1.27.0
    * @param enableBusyIndicator New value for property enableBusyIndicator
    * @return Reference to this in order to allow method chaining
    */
  def setEnableBusyIndicator(enableBusyIndicator: Boolean): this.type = js.native

  /** Adds some column into the aggregation named columns.
    *
    * @param column the column to add; to add; if empty, nothing is inserted
    * @return Reference to this in order to allow method chaining
    */
  def addColumn(column: Column): this.type = js.native

  /** Binds aggregation rows to model data.
    *
    * See ManagedObject.bindAggregation for a detailed description of the
    * possible properties of oBindingInfo.
    *
    * @param bindingInfo The binding information or a path as a string
    * @return Reference to this in order to allow method chaining
    */
  def bindRows(bindingInfo: String | js.Dynamic/*BindingInfo*/): this.type = js.native

  /** Binds aggregation columns to model data.
    *
    * See ManagedObject.bindAggregation for a detailed description of the
    * possible properties of oBindingInfo.
    *
    * @param bindingInfo The binding information.
    * @return Reference to this in order to allow method chaining
    */
  def bindColumns(bindingInfo: js.Dynamic/*BindingInfo*/): this.type = js.native

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
  def setFirstVisibleRow(firstVisibleRow: Int): this.type = js.native

  /** Zero-based indices of selected items, wrapped in an array. An empty array
    * means "no selection".
    *
    * @return Array of indices.
    */
  def getSelectedIndices(): js.Array[Int] = js.native

  /** Gets current value of property visibleRowCount.
    *
    * Number of visible rows of the table.
    *
    * Default value is 10.
    *
    * @return Value of property visibleRowCount
    */
  def getVisibleRowCount(): Int = js.native

  /** Removes complete selection.
    *
    * @return Reference to this in order to allow method chaining
    */
  def clearSelection(): this.type = js.native

  /** Destroys all the columns in the aggregation columns.
    *
    * @return Reference to this in order to allow method chaining
    */
  def destroyColumns(): this.type = js.native

  /** Destroys all the rows in the aggregation rows.
    *
    * @return Reference to this in order to allow method chaining
    */
  def destroyRows(): this.type = js.native

  def getContextByIndex(index: Int): Context = js.native

  def getRows(): js.Array[Row] = js.native

  def setSelectedIndex(selectedIndex: Int): this.type = js.native

  def setSelectionInterval(indexFrom: Int, indexTo: Int): this.type = js.native

  def removeSelectionInterval(indexFrom: Int, indexTo: Int): this.type = js.native

  def getSelectedIndex(): Int = js.native

  def isIndexSelected(index: Int): Boolean = js.native
}
