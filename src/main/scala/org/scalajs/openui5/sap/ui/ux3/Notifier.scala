package org.scalajs.openui5.sap.ui.ux3

import org.scalajs.openui5.sap.ui.core.{Message, Element}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.ux3.Notifier")
@js.native
class Notifier(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[js.Any] = js.native) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  /** Adds some message to the aggregation messages.
    *
    * @param message the message to add; if empty, nothing is inserted
    * @return reference to this in order to allow method chaining
    */
  def addMessage(message: Message): this.type = js.native

  def destroyMessages(): this.type = js.native
}
