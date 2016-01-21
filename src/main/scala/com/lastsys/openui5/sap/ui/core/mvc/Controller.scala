package com.lastsys.openui5.sap.ui.core.mvc

import com.lastsys.openui5.sap.ui.core.{Component, Element}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.core.mvc.Controller")
@js.native
trait Controller extends js.Object {
  def byId(id: String): Element = js.native
  def createId(id: String): String = js.native
  def getOwnerComponent(): Component = js.native
  def getView(): js.UndefOr[View] = js.native
}
