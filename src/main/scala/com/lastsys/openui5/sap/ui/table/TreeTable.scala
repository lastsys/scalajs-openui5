package com.lastsys.openui5.sap.ui.table

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.table.TreeTable")
@js.native
trait TreeTable extends Table {
  def expandToLevel(level: Int): TreeTable = js.native
}
