package org.scalajs.openui5.sap.m

import org.scalajs.openui5.sap.ui.core.{Control, Item}

import scala.scalajs.js

@js.native
class IconTabFilter extends Item with IconTab {
  def getContent[T <: Control](): js.Array[T] = js.native
}
