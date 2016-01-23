package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Base Class for Controls. */
@JSName("sap.ui.core.Control")
@js.native
class Control extends Element {
  def setBusy(busy: Boolean): Control = js.native
  def setVisible(visible: Boolean): Control = js.native
}
