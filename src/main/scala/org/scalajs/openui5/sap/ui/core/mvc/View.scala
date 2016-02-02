package org.scalajs.openui5.sap.ui.core.mvc

import org.scalajs.openui5.sap.ui.core.{Control, Element}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.core.mvc.View")
@js.native
trait View extends Control {
  def byId[T <: Element](id: String): T = js.native
  def getViewData[T <: js.Object]() : T = js.native
}
