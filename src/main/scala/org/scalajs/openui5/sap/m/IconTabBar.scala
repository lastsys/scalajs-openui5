package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.Control

import scala.scalajs.js

@js.native
class IconTabBar extends Control with ObjectHeaderContainer {
  def getItems[T <: IconTab](): js.Array[T] = js.native
}
