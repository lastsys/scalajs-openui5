package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.core.Message")
@js.native
class Message(id: js.UndefOr[String] = js.native,
              settings: js.UndefOr[js.Any] = js.native) extends Element {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)
}
