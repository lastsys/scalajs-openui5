package org.scalajs.openui5.sap.ui.model

import org.scalajs.openui5.sap.ui.base.Object

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.model.Context")
@js.native
trait Context extends Object {
  def getModel[T <: js.Any](): T = js.native
  def getObject[T <: js.Any](path: js.UndefOr[String] = js.undefined): T = js.native
  def getPath(): String = js.native
  def getProperty(path: String): js.Any = js.native
}
