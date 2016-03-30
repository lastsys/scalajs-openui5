package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control
import org.scalajs.openui5.sap.ui.model.Context

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.commons.Tree")
@js.native
class Tree(id: js.UndefOr[String] = js.native,
           settings: js.UndefOr[js.Any] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  def bindNodes(bindingInfo: js.Dynamic): this.type = js.native
  def getNodeByContext(context: Context): TreeNode = js.native

  // new stuff? undocumented so far
  def getSelection(): TreeNode = js.native
  def setSelection(selection: TreeNode): this.type = js.native

  // deprecated? not in documentation anymore
  def getSelectedIndices(): js.Array[Int] = js.native
  def getContextByIndex(index: Int): Context = js.native
  def clearSelection(): this.type = js.native
}
