package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control
import org.scalajs.openui5.sap.ui.model.Context

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.commons.Tree")
@js.native
class Tree extends Control {
  def bindNodes(bindingInfo: js.Dynamic): this.type = js.native
  def getSelectedIndices(): js.Array[Int] = js.native
  def getContextByIndex(index: Int): Context = js.native
  def clearSelection(): this.type = js.native
}
