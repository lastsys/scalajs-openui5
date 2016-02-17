package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.commons.TabStrip")
@js.native
class TabStrip(id: js.UndefOr[String] = js.native,
               settings: js.UndefOr[js.Any] = js.native) extends Control {
  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  def getSelectedIndex(): Int = js.native
  def getTabs(): js.Array[Tab] = js.native
  def setSelectedIndex(selectedIndex: Int): this.type = js.native
}
