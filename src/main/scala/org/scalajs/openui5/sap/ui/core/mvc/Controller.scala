package org.scalajs.openui5.sap.ui.core.mvc

import org.scalajs.openui5.sap.ui.base.EventProvider
import org.scalajs.openui5.sap.ui.core.{Element, Component}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.core.mvc.Controller")
@js.native
class Controller(name: String) extends EventProvider {
  def byId[T <: Element](id: String): T = js.native
  def createId(id: String): String = js.native
  def getOwnerComponent(): Component = js.native
  def getView(): js.UndefOr[View] = js.native
}
