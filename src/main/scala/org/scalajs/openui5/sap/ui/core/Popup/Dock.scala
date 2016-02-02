package org.scalajs.openui5.sap.ui.core.Popup

import org.scalajs.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/** Enumeration providing options for docking of some element to another.
  *
  * Enumeration providing options for docking of some element to another.
  * "Right" and "Left" will stay the same in RTL mode, but "Begin" and
  * "End" will flip to the other side ("Begin" is "Right" in RTL).
  */
@JSName("sap.ui.core.Popup.Dock")
@js.native
object Dock extends js.Object {
  val BeginBottom: core.Dock = js.native
  val BeginCenter: core.Dock = js.native
  val BeginTop: core.Dock = js.native
  val CenterBottom: core.Dock = js.native
  val CenterCenter: core.Dock = js.native
  val CenterTop: core.Dock = js.native
  val EndBottom: core.Dock = js.native
  val EndTop: core.Dock = js.native
  val LeftBottom: core.Dock = js.native
  val LeftCenter: core.Dock = js.native
  val LeftTop: core.Dock = js.native
  val RightBottom: core.Dock = js.native
  val RightCenter: core.Dock = js.native
  val RightTop: core.Dock = js.native
}
