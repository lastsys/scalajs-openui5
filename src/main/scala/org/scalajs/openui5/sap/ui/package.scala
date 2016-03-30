package org.scalajs.openui5.sap

import org.scalajs.openui5.sap.ui.core.{Control, Core}
import org.scalajs.openui5.sap.ui.core.mvc.{Controller, View}

import scala.scalajs.js
import scala.scalajs.js.|

package object ui {
  def controller(name: String,
                 controllerImpl: js.Any): Unit = Ui.controller(name, controllerImpl)
  def controller(name: String): Controller = Ui.controller(name)

  def view(id: String): View = Ui.view(id)
  def view(view: String | js.Any): View = Ui.view(view)
  def view(id: String, view: String | js.Any): View = Ui.view(id, view)

  def getCore(): Core = Ui.getCore()

  def xmlfragment[T <: Control](fragment: String): T =
    Ui.xmlfragment(fragment)
  def xmlfragment[T <: Control](fragment: String, controller: Controller): T =
    Ui.xmlfragment(fragment)
}
