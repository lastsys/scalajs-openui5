package org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Collision behavior: horizontal/vertical.
  * Defines how the position of an element should be adjusted in case it
  * overflows the window in some direction. For both directions this can be
  * "flip", "fit" or "none". If only one behavior is provided it is applied to
  * both directions. Examples: "flip", "fit none".
  *
  */
@JSName("sap.ui.core.Collision")
@js.native
object Collision extends js.Object {
  val flip: String = js.native
  val fit: String = js.native
  val none: String = js.native
}
