package org.scalajs.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.model.TreeBinding")
@js.native
class TreeBinding extends Binding {
  def filter(filters: js.Array[Filter],
             filterType: js.UndefOr[FilterType] = js.native): this.type = js.native
}
