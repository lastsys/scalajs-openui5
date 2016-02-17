package org.scalajs.openui5.sap.ui.commons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.commons.Tab")
@js.native
class Tab(id: js.UndefOr[String] = js.native,
          settings: js.UndefOr[js.Any] = js.native) extends Panel {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)
}
