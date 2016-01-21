package com.lastsys.openui5.sap.ui.core.mvc

import com.lastsys.openui5.sap.ui.core.{Element, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


@JSName("sap.ui.core.mvc.View")
@js.native
trait View extends Control {
  def byId(id: String): Element = js.native
}
