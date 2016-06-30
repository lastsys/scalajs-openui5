package org.scalajs.openui5.sap.ui.table

import org.scalajs.openui5.sap.ui.model.Context

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.table.TreeTable")
@js.native
trait TreeTable extends Table {
  def expandToLevel(level: Int): this.type = js.native
}
