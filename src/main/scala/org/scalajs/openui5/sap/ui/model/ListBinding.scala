package org.scalajs.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.model.ListBinding")
@js.native
class ListBinding extends Binding {
  def filter(filters: js.Array[Filter],
             filterType: js.UndefOr[String] = js.undefined): ListBinding = js.native
}
