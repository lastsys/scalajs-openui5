package org.scalajs.openui5.sap.ui.core.mvc

import org.scalajs.openui5.sap.ui.core.{Control, Element}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.core.mvc.View")
@js.native
class View(id: js.UndefOr[String] = js.native,
           settings: js.UndefOr[js.Any] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  def byId[T <: Element](id: String): T = js.native
  def getViewData[T <: js.Any]() : T = js.native
  def getViewName(): String = js.native
}
