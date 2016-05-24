package org.scalajs.openui5.sap.ui.model

import org.scalajs.openui5.sap.ui.core.message.MessageProcessor

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.model.Model")
@js.native
class Model extends MessageProcessor {
  def setSizeLimit(sizeLimit: Int): this.type = js.native
  def refresh(forceUpdate: Boolean = false): this.type = js.native
  def getObject[T <: js.Any](path: String,
                             context: js.UndefOr[js.Any] = js.undefined): T = js.native
  def setDefaultBindingMode(mode: BindingMode): this.type = js.native
  def createBindingContext(path: String): this.type = js.native
}
