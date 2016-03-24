package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName


/** The NavContainer control handles hierarchic navigation between Pages or other fullscreen controls.
  *
  * All children of this control will receive navigation events like beforeShow,
  * they are documented in the pseudo interface [[NavContainerChild]].
  */
@JSName("sap.m.NavContainer")
@js.native
class NavContainer extends Control {
  def to(pageId: String): this.type = js.native
}
