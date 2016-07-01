package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, PopupInterface}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.m.Dialog")
@js.native
class Dialog(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[js.Any] = js.native) extends Control with PopupInterface {

  def close(): Unit = js.native
  def open(): Unit = js.native
}
