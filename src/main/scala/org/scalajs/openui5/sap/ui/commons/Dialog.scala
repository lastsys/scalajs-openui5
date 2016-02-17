package org.scalajs.openui5.sap.ui.commons

import org.scalajs.openui5.sap.ui.core.{PopupInterface, Control}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** An interactive window appearing on request displaying information to the
  * user. The API supports features such as popups with fixed sizes, popups
  * with unlimited width, scrolling bars for large windows, and control
  * nesting (for example, a drop-down list can be included in the window).
  */
@JSName("sap.ui.commons.Dialog")
@js.native
class Dialog(id: js.UndefOr[String] = js.native,
             settings: js.UndefOr[js.Any] = js.native)
  extends Control with PopupInterface  {

  def this(id: String) = this(id, js.undefined)
  def this(settings: js.Any) = this(js.undefined, settings)

  /** Adds some content to the aggregation content.
    *
    * @param content the content to add; if emtpy, nothing is inserted
    * @return reference to this in order to allow method chaining
    */
  def addContent(content: Control): this.type = js.native

  /** Closes the dialog control instance. */
  def close(): Unit = js.native

  /** Opens the dialog control instance. */
  def open(): Unit = js.native
}
