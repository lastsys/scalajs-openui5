package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.base.Event
import org.scalajs.openui5.sap.ui.core.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.commons.TreeNode")
@js.native
class TreeNode(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[js.Any] = js.native) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  def attachSelected(data: js.Any,
                     function: (Event) ⇒ Unit,
                     listener: js.Any): this.type = js.native
  def attachSelected(function: (Event) ⇒ Unit,
                     listener: js.Any): this.type = js.native
  def attachSelected(function: (Event) ⇒ Unit): this.type = js.native
  def attachSelected(data: js.Any,
                     function: (Event) ⇒ Unit): this.type = js.native
}
