package org.scalajs.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.m.List")
@js.native
class List extends ListBase {
  def setSelectedItem(listItem: ListItemBase,
                      select: Boolean = true): this.type = js.native
  def setSelectedItemById(id: String,
                          select: Boolean = true): this.type = js.native
  def getItems(): js.Array[_ <: ListItemBase] = js.native
}
