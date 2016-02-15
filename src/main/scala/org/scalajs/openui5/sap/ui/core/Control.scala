package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Base Class for Controls. */
@JSName("sap.ui.core.Control")
@js.native
class Control extends Element {
  def addStyleClass(styleClass: String): this.type = js.native
  def removeStyleClass(styleClass: String): this.type = js.native
  def setBusy(busy: Boolean): this.type = js.native
  def setVisible(visible: Boolean): this.type = js.native
}

@JSName("sap.ui.core.Control")
@js.native
object Control extends Element {
  def extend(className: String): js.Any = js.native
  def extend(className: String, classInfo: js.Any): js.Any = js.native
  def extend(className: String, metaImpl: js.Function): js.Any = js.native
  def extend(className: String, classInfo: js.Any,
             metaImpl: js.Function): js.Any = js.native
}
