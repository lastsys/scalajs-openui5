package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import org.scalajs.openui5.sap.ui.base.Object

@JSName("sap.ui.core.Core")
@js.native
final class Core extends Object {
  def attachInit(function: js.Function): Unit = js.native
  def byId[T <: Element](id: String): T = js.native
}
