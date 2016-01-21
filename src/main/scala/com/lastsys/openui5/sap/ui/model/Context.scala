package com.lastsys.openui5.sap.ui.model

import com.lastsys.openui5.sap.ui.base.Object

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.model.Context")
@js.native
trait Context extends Object {
  def getModel(): Model = js.native
  def getObject(path: js.UndefOr[String] = js.undefined): js.Dynamic = js.native
  def getPath(): String = js.native
  def getProperty(path: String): js.Any = js.native
}
