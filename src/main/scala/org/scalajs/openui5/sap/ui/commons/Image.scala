package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("sap.ui.commons.Image")
@js.native
class Image(id: js.UndefOr[String] = js.native,
            settings: js.UndefOr[js.Any] = js.native) extends Control
  with FormattedTextViewControl with ToolbarItem {

  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)
}
