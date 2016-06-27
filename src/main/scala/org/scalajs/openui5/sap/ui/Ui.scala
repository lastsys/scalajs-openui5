package org.scalajs.openui5.sap.ui

import org.scalajs.openui5.sap.ui.core.{Control, Core}
import org.scalajs.openui5.sap.ui.core.mvc.{Controller, View}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("sap.ui")
@js.native
object Ui extends js.Object {
  def controller(name: String,
                 controllerImpl: js.Any): Controller = js.native
  def controller(name: String): Controller = js.native

  def view(id: String): View = js.native
  def view(view: String | js.Any): View = js.native
  def view(id: String, view: String | js.Any): View = js.native

  def getCore(): Core = js.native

  def xmlfragment[T <: Control](fragment: String): T = js.native
  def xmlfragment[T <: Control](fragment: String, controller: Controller): T =
    js.native
}
