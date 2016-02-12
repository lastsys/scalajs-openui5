package org.scalajs.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("sap.ui.base.Event")
@js.native
class Event extends Object with Poolable {
  def cancelBubble(): Unit = js.native
  def getParameter[T](name: String): T = js.native
  def getParameters(): js.Object with js.Dynamic = js.native
  def getSource[T <: EventProvider](): T = js.native
  def preventDefault(): Unit = js.native
}
